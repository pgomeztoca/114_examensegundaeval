/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import java.util.Scanner;

/**
 *
 * @author daw114
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, resultado;
        System.out.println("Introduce primer número: ");                                            
        numero1 = sc.nextInt();
        System.out.println("Introduce segundo número: ");
        numero2 = sc.nextInt();
        resultado = sumar(numero1, numero2);
        System.out.println("Suma: " + resultado);
    }

    //método sumar
    public static int sumar(int a, int b){
           return examensegundaeval(a, b);
    }

    private static int examensegundaeval(int a, int b) {
        int c;
        c = a + b;
        return c;
    }
    
    

}