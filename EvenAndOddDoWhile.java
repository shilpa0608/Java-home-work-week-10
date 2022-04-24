package com.learning.java;

public class EvenAndOddDoWhile {
    public static void main(String[] args) {
        int i = 2;
        do {
            System.out.println(i + ""); // even number//
            i += 2;
        }
        while (i <= 10);
        int j = 1;
        do {
            System.out.println(j + ""); // odd number//
            j += 2;
        }
        while (j <= 10);
    }
}
