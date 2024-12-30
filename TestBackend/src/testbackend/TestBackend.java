package testbackend;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestBackend {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DecimalFormat formatUang = new DecimalFormat("###,###,###.00");

        int jamKerja;
        double tarifPerJam, totalGaji;

        System.out.print("Masukkan jumlah jam kerja: ");
        jamKerja = input.nextInt();

//      Misal tarif perjam = Rp. 10.000
        System.out.print("Masukkan tarif per jam: ");
        tarifPerJam = input.nextDouble();

        if (jamKerja <= 40)
        {
            totalGaji = jamKerja * tarifPerJam;
        } else
        {
            double jamNormal = 40;
            double jamLembur = jamKerja - 40;
            double tarifLembur = tarifPerJam * 1.5;

            totalGaji = (jamNormal * tarifPerJam) + (jamLembur * tarifLembur);
        }

        System.out.println("\nRincian Gaji:");
        System.out.println("Jam Kerja: " + jamKerja + " jam");
        System.out.println("Tarif per Jam: Rp. " + formatUang.format(tarifPerJam));
        System.out.println("Total Gaji: Rp. " + formatUang.format(totalGaji));

        input.close();
    }

}
