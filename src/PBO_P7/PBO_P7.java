package PBO_P7;

import java.util.Scanner;

public class PBO_P7 {
    public static void main ( String [] args){
        Scanner sc = new Scanner(System.in);
        koperasi anggota = new koperasi ("ID-099","Michael RIzqi Fatihah","RK-899");
        koperasi ambil = new koperasi (300000,100000,0.10);
        anggota.tampil();
        ambil.ambilSaldo();
    }
}