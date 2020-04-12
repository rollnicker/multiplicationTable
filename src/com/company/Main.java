package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 1 до 10: ");
        int num = in.nextInt();

        int a = num * 1;
        int b = num * 2;
        int c = num * 3;
        int d = num * 4;
        int e = num * 5;
        int f = num * 6;
        int g = num * 7;
        int h = num * 8;
        int i = num * 9;
        int j = num * 10;

        System.out.println("1 умножить на " + num + " = " + a);
        System.out.println("2 умножить на " + num + " = " + b);
        System.out.println("3 умножить на " + num + " = " + c);
        System.out.println("4 умножить на " + num + " = " + d);
        System.out.println("5 умножить на " + num + " = " + e);
        System.out.println("6 умножить на " + num + " = " + f);
        System.out.println("7 умножить на " + num + " = " + g);
        System.out.println("8 умножить на " + num + " = " + h);
        System.out.println("9 умножить на " + num + " = " + i);
        System.out.println("10 умножить на " + num + " = " + j);



    }
}
