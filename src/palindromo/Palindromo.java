/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;


import java.util.Scanner;


/**
    * 
    * 
 */
public class Palindromo {

    public void ingresarPlabra() { 
        Scanner teclado = new Scanner(System.in); 
        String palabra ; 
        System.out.println("Ingrese una palabra"); 
        palabra = teclado.nextLine(); 
      int inicio = 0;
int fin = palabra.length()-1;
boolean error = false;
  while ((inicio<fin) && (!error)){
	if (palabra.charAt(inicio)==palabra.charAt(fin)){				
		inicio++;
		fin--;
	} else {
		error = true;
	}
}
  if (!error)
	System.out.println(palabra + " es un palindromo");
else
	           System.out.println(palabra+" no es un palindromo");
  
  }
  
 public static void main(String[] args) {
           Palindromo obj=new Palindromo();
           obj.ingresarPlabra();
}
}
