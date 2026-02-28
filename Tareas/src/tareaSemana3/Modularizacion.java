package tareaSemana3;

import java.util.Random;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Modularizacion {
	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();
	public static void cls() {
		for(int i = 0; i<100; i++) {
			System.out.println();
		}
	}
	
	public static void MenuPrincipal() {
		try {
			int opcion = 0;
			do {
				System.out.println("\tMENU PRINCIPAL. ");
				System.out.println("Elija el programa que desea ejecutar: ");
				System.out.println("1. Calculadora Basica. ");
				System.out.println("2. Validacion de Contraseñas. ");
				System.out.println("3. Numeros Primos. ");
				System.out.println("4. Suma de Numeros Pares. ");
				System.out.println("5. Conversion de Temperatura. ");
				System.out.println("6. Contador de Vocales. ");
				System.out.println("7. Calculo de factorial. ");
				System.out.println("8. Juego de Adivinanza. ");
				System.out.println("9. Paso por Referencia. ");
				System.out.println("10. Tabla de Multiplicar. ");
				System.out.println("11. Salir del Programa. ");
				System.out.print("\nOpcion: ");
				
				opcion = sc.nextInt();
				sc.nextLine();
				
				switch(opcion){
				case 1:
					cls();
					calculadoraBasica();
					break;
				
				case 2:
					ValidacionDeContraseñas();
					break;
				case 3:
					NumerosPrimos();
					break;
				case 4:
					SumaDeNumerosPares();
					break;
				case 5:
					ConversionDeTemperatura();
				case 6:
					ContadorDeVocales();
					break;
				case 7:
					CalculoDeFactorial();
					break;
				case 8:
					JuegoDeAdivinanzas();
					break;
				case 9:
					PasosPorReferencia();
					break;
				case 10:
					cls();
					TablaDeMultiplicar();
					break;
				case 11:
					System.out.println("SALIENDO DEL PROGRAMA. ");
					System.exit(opcion);
					break;
				default:
					cls();
					System.out.println("El valor ingresado no es valido. ");
					MenuPrincipal();
					break;
				}
		
			}while(opcion != 11);
	 }catch(InputMismatchException e) {
			System.out.print("Valor invalido ingresado. \n");
		}
	}
	
	public static void SUMAR() {
		try {
		System.out.println("Ha seleccionado: SUMA. ");
		System.out.print("Ingrese el primer Numero: ");
		double numero1 = sc.nextDouble();
		System.out.print("Ingrese el segundo Numero: ");
		double numero2 = sc.nextDouble();
		
		double resultado = numero1+numero2;
		cls();
		System.out.print("LA SUMA ES: "+ resultado);
		calculadoraBasica();
		}catch(InputMismatchException e) {
			cls();
			System.out.println("Valor ingresado Invalido. ");
			SUMAR();
		}
	}
	
	public static void RESTAR() {
		try {
		System.out.println("Ha seleccionado: RESTA. ");
		System.out.print("Ingrese el primer Numero: ");
		double numero1 = sc.nextDouble();
		System.out.print("Ingrese el segundo Numero: ");
		double numero2 = sc.nextDouble();
		
		double resultado = numero1 - numero2;
		cls();
		System.out.print("EL RESULTADO ES: "+resultado);
		calculadoraBasica();
		}catch(InputMismatchException e) {
			cls();
			System.out.println("Valor Ingresado Invalido. ");
			RESTAR();
		}
	}
	
	public static void MULTIPLICAR() {
		try {
		System.out.println("Ha seleccionado: MULTIPLICACION. ");
		System.out.print("Ingrese el primer Numero: ");
		double numero1 = sc.nextDouble();
		System.out.print("Ingrese el segundo Numero: ");
		double numero2 = sc.nextDouble();
		
		double resultado = numero1 * numero2;
		cls();
		System.out.print("EL RESULTADO ES: "+resultado);
		calculadoraBasica();
		}catch(InputMismatchException e) {
			cls();
			System.out.println("Valor Ingresado Invalido. ");
			MULTIPLICAR();
		}

	}
	
	public static void DIVISION() {

		try {
		System.out.println("Ha seleccionado: DIVISION. ");
		System.out.print("Ingrese el primer Numero: ");
		double numero1 = sc.nextDouble();
		System.out.print("Ingrese el segundo Numero: ");
		double numero2 = sc.nextDouble();
		
		double resultado = numero1 / numero2;
		cls();
		System.out.print("EL RESULTADO ES: "+resultado);
		calculadoraBasica();
		}catch(InputMismatchException e) {
			cls();
			System.out.println("Valor Ingresado Invalido. \n");
			DIVISION();
		}

	}

	public static void calculadoraBasica() {
		try {
			int opcion = 0;
			do {
				System.out.println("\n\n\tCALCULADORA BASICA. ");
				System.out.println("Elija la operacion a realizar: ");
				System.out.println("1. SUMA. ");
				System.out.println("2. Resta. ");
				System.out.println("3. Multiplicacion. ");
				System.out.println("4. Division. ");
				System.out.println("5. Regresar. ");
				System.out.print("\nOpcion: ");
				
				opcion = sc.nextInt();
				sc.nextLine();
				
				switch(opcion){
				case 1:
					SUMAR();
					break;
				
				case 2:
					RESTAR();
					break;
				case 3:
					MULTIPLICAR();
					break;
				case 4:
					DIVISION();
					break;
				case 5:
					cls();
					MenuPrincipal();
				default:
					cls();
					System.out.println("El valor ingresado no es valido. ");
					calculadoraBasica();
				}
		
			}while(opcion == 5);
	 }catch(InputMismatchException e) {
		 cls();
			System.out.print("Valor invalido. ");
			calculadoraBasica();
		}

	}
	
	public static void ValidacionDeContraseñas() {
		try {
			
			int Contraseña = 1234;
			int contraseña;
			do {
				System.out.println("Ingrese la Contraseña. ");
				contraseña = sc.nextInt();
				
				if(Contraseña == contraseña) {
					cls();
					System.out.println("       ACCESO CONCEDIDO! ");
					MenuPrincipal();
				}else {
					System.out.println("\nContraseña incorrecta, intente de nuevo. ");
				}
			}while(contraseña != Contraseña);
			
			
		}catch(InputMismatchException e) {
			cls();
			System.out.print("VALOR INVALIDO. \n");
			sc.nextLine();
		}
	}
	
	public static boolean esPrimo(long numero) {
		
		if (numero <= 1) {
			return false;
		}
		if(numero == 2 || numero == 3) {
			return true;
		}
		if(numero % 2 == 0) {
			return false;
		}
		
		long CalcularHasta = (long) Math.sqrt(numero);
		for(long i = 3; i<= CalcularHasta; i += 2) {
			if (numero % i == 0) {
				return false;
			}
		}
	
		return true;
		
		
	}
	
	public static void NumerosPrimos() {
		try {
			System.out.println("Ingerese un numero. ");
			long numero = sc.nextLong();
			
			if(esPrimo(numero)) {
				cls();
				System.out.println("El numero: "+ numero +" es primo. ");
				MenuPrincipal();
			}else {
				cls();
				System.out.println("El numero: "+ numero +" no es primo. ");
				MenuPrincipal();
			}
			
		}catch(InputMismatchException e) {
			System.out.println("Valor invalido");
		}
	}
	
	public static void SumaDeNumerosPares() {
		try {
			long SumarPares = 0;
			long numeros;
			
			System.out.println("Ingrese numeros (0 para terminar). ");
			
			while (true) {
				System.out.print("-> ");
				 numeros = sc.nextLong();
				 
				if(numeros == 0) {
					break;
				}
				
				if (numeros % 2 == 0) {
				 SumarPares = SumarPares + numeros;
				}
			}
			
			cls();
			System.out.println("La suma de los numeros pares es: "+SumarPares);
			MenuPrincipal();
			
		}catch(InputMismatchException e) {
			System.out.println("Valor invalido. ");
		}
	}
	
	public static void ConversionDeTemperatura() {
		int eleccion = 0;
		do {
			try {
				System.out.println("Cual conversion desea realizar. ");
				System.out.println("1. Celsius a Fahrenheit ");
				System.out.println("2. Fahrenheit a Celcius ");
				System.out.println("3. Regresar. ");
				eleccion = sc.nextInt();
				sc.nextLine();
				
				switch(eleccion) {
				case 1:
					System.out.println("Celsius a Fahrenheit. ");
					System.out.println("ingrese los grados en Celsius. ");
					double Celsius = sc.nextFloat();
					sc.nextLine();
					
					double aFahrenheit = (Celsius * 9/5)+32;
					
					cls();
					System.out.println(Celsius + ": Grados Celsius, son: "+ aFahrenheit + " Grados Fahrenheit. ");
					MenuPrincipal();
					break;
					
				case 2:
					cls();
					System.out.println("Fahrenheit a Celsius. ");
					System.out.println("ingrese los grados en Fahrenheit. ");
					double Fahrenheit = sc.nextFloat();
					sc.nextLine();
					
					double aCelsius = (Fahrenheit - 32)*5/9;
					
					cls();
					System.out.println(Fahrenheit + ": Grados Fahrenheit, son: "+ aCelsius + " Grados Celsius. ");
					MenuPrincipal();
					break;
					
				case 3:
					cls();
					MenuPrincipal();
					break;
				default:
					cls();
					System.out.println("Ingrese un valor que sea valido");
					break;
					
				}
				
				}catch(InputMismatchException e) {
					cls();
					System.out.println("Ingrese un valor que sea Valido. ");
					sc.nextLine();
				}
			}while(eleccion != 3);
	}
	
	public static void ContadorDeVocales() {
		try {
			System.out.println("Ingrese una palabra");
			String palabra = sc.nextLine();
			
			int contador = 0;
			
			for (int i  = 0; i < palabra.length(); i++) {
				char letra = palabra.charAt(i);
				
				if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
					
					contador++;
				}
			}
			System.out.println("La palabra tiene: "+ contador+" vocales");
		}catch(InputMismatchException e) {
			System.out.println("Ingreso un Valor invalido. ");
		}
		
	}
	
	public static int factorial(int numero) {
		if (numero < 0) {
			System.out.println("El factorial no esta definido para numeros negativos. ");
			return -1;
		}
		
		if(numero == 0 || numero ==1 ) {
			return 1;
		}
		
		int resultado = 1;
		
		for (int i = 2; i<= numero; i++) {
			resultado = resultado * i;
		}
		return resultado;
	}
	
	public static void CalculoDeFactorial() {
		cls();
		System.out.println("Ingrese un numero para calcular su factorial. ");
		int numero = sc.nextInt();
		
		int resultado = factorial(numero);
		
		System.out.println("El factorial de: "+numero+" Es: "+ resultado+"\n");
		
	}
	
	public static void JuegoDeAdivinanzas() {
		int numeroSecreto = rand.nextInt(100)+1;
		
		int numeroIngresado = 0;
		int Intentos = 0;
		
		System.out.print("Estoy pensando en un numero del 1 al 100, adivina cual es ");
		while(numeroIngresado != numeroSecreto) {
			System.out.print("->");
			numeroIngresado = sc.nextInt();
			Intentos ++;
			
			if (numeroIngresado > numeroSecreto) {
				System.out.println("El numero fue muy grande, intenta con otro numero. ");
			}else if(numeroIngresado < numeroSecreto) {
				System.out.println("El numero fue muy pequeño, intenta de nuevo. ");
			}else {
				cls();
				System.out.println("Felicidades, has adivinado el numero en: "+Intentos+" intentos");
			}
			
		}
	}
	
	public static void intercambiar(double numero1, double numero2) {
			double temporal = numero1;
			numero1 = numero2;
			numero2 = temporal;
			System.out.println("El primer valor ahora es: "+ numero1 + " y el segundo valor ahora es: " + numero2+"\n");	
	}
	
	public static void PasosPorReferencia() {
		try {
			double numero1;
			double numero2;
			
			System.out.print("Ingrese el primer valor: ");
			numero1 = sc.nextDouble();
			System.out.print("Ingrese el segundo numero: ");
			numero2 = sc.nextDouble();
			
			System.out.println("El primer valor fue: "+numero1+" y el segudno valor fue: "+ numero2);
			
			intercambiar(numero1,numero2);
			
		}catch(InputMismatchException e) {
			System.out.println("Valor Invalido, por favor Intente nuevamente. ");
			sc.nextLine();		}
	}
	
	public static void TablaDeMultiplicar() {
		try {
			
		System.out.print("Ingrese un numero: ");
		int numero = sc.nextInt();
		
		System.out.println("LA TABLA DE: "+ numero +" ES: \n");
		for (int i = 1; i <= 10; i++) {
			
			int resultado = numero * i;
			System.out.println(numero + " * "+ i +" = "+ resultado );
		}
		System.out.println("\n");
		}catch(InputMismatchException e) {
			System.out.println("Valor invalido. ");
		}
		
		
	}
	
	public static void main(String[] args) {
		MenuPrincipal();

	}

}
