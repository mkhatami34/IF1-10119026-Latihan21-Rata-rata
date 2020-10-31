/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan21.rata.rata;

import java.util.Scanner;

/**
 *
 * @author Asus
 * NAMA     : Muhammad Khatami
 * KELAS    : PBO
 * NIM      : 10119026
 * Deskripsi Program : Program ini berisi program untuk menampilkan program
 *                      rata rata
 */
public class RataRata {
    static Scanner scan = new Scanner (System.in);
    int jumlah;
    int nilai[];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RataRata data = new RataRata();
        double ratarata = 0;
        double hasil = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        data.jumlah = scan.nextInt();
        data.nilai = new int[data.jumlah];
        
        for(int i = 0; i < data.jumlah; i++){
            System.out.print("Nilai mahasiswa ke-"+(i + 1)+":");
            data.nilai[i] = scan.nextInt();
        }
        
        for(int i = 0; i < data.jumlah; i++){
            hasil += data.nilai[i];
            
        }
        ratarata = hasil / data.jumlah;
        System.out.println("Maka, Rata-rata Nilainya adalah " +ratarata);
        System.out.println("Developed by : Muhammad Khatami");
        
        
    }
    
}
