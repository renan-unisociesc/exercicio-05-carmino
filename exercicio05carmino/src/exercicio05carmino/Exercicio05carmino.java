/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio05carmino;

import java.util.Scanner;
/**
 *
 * @author Renan
 */
public class Exercicio05carmino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double altura = 1;
        double somaAlturaM = 0;
        double somaAlturaF = 0;
        int sexo = 0;
        double mediaM = 0;
        double mediaF = 0;
        int percentM = 0;
        int percentF = 0;
        double qtdM = 0;
        double qtdF = 0;
        double maiorAltura = 0;
        double menorAltura = 1000;
        
        while (altura > 0) {
            System.out.println("Qual a sua altura? ");
            altura = entrada.nextDouble();
            if (altura > 0) {
                System.out.println("Qual seu sexo? Digite 1 para masculino e 2 para feminino.");
                sexo = entrada.nextInt();
                if (altura > maiorAltura) {
                    maiorAltura = altura;
                }
                if (menorAltura > altura) {
                menorAltura = altura;
                }
                if (sexo == 2) {
                qtdF = qtdF +1;
                somaAlturaF = somaAlturaF +altura;
                }
                if (sexo == 1){
                qtdM = qtdM+1;
                somaAlturaM = somaAlturaM + altura;
                }
            }
        }
        System.out.println("A maior altura e: " + maiorAltura);
        System.out.println("A menor altura e: " + menorAltura);
        System.out.println("A media de altura das mulheres e de: " + (somaAlturaF / qtdF));
        System.out.println("A media de altura dos homens e de: " + (somaAlturaM / qtdM));
        System.out.printf("O percentual de homens e de: %.2f%% ", ((qtdM  / (qtdF+qtdM))*100));
        System.out.println("O percentual de mulheres e de: " + ((qtdF  / (qtdF+qtdM))*100) + "%.");
    }
    
}
