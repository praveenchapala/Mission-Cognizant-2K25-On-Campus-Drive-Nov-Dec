// java program to check the working of conditional loops


// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter your age:");
//         int age=sc.nextInt();
//         if(age>=18){
//         System.out.println("You can vote and drive");
//         }
//         else{
//             System.out.println("You cannot vote and drive");
//         }

//     }
// }


//Largest of two numbers


// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter two numbers");
//         int a =sc.nextInt();
//         int b =sc.nextInt();
//         if(a>=b){
//             System.out.println("A is greater tha B");
//         }else{
//                 System.out.println("B is greater than A");
//             }
//         }


//     }


// Printing the number is even or odd?

// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number to ceck even or odd:");
//         int number=sc.nextInt();
//         if(number%2==0){
//             System.out.println("The number is Even");
//         }
//         else{
//             System.out.println("The number is odd");
//         }
//         }
//     } 


//Income tax caluclation


// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int income=sc.nextInt();
//         int tax=0;
//         if(income<50000){
//             tax=0;
//         }
//         else if(income>=50000 && income<100000){
//             tax=(int)(income*0.2);

//         }
//         else{
//             tax=(int)(income*0.3);
//         }
//     }

// }


//Printing the largest of three numbers


// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the three numbers:");
//         int number1=sc.nextInt();
//         int number2=sc.nextInt();
//         int number3=sc.nextInt();
//         if(number1>=number2 && number1>=number3){
//             System.out.println("The largest number is :"+number1);
//         }
//         else if(number2>=number1){
//             System.out.println("The largest number is "+number2);
//         }
//         else{
//             System.out.println("The largest number is "+number3);
//         }
//     }

// }


//ternary operator

// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int a =sc.nextInt();
//         int b=sc.nextInt();
//         int max=(a>b)?a:b;
//         System.out.println("The largest number is "+max);
//     }
// }



//Switch Statement Execution

// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         char operator=sc.next().charAt(0);
//         switch(operator){
//             case'+':System.out.println(a+b);
//             break;
//             case'-':System.out.println(a-b);
//             break;
//             default:
//             System.out.println("Wrong operator");
//         }

//     }
// }



//Using While loop
// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         int counter=0;
//         while(counter<10){
//             System.out.println("Hello Praveen");
//             counter++;
//         }
//     }
// }



//Printing numbers from 1 to 10



// public class JavaBasics{
//     public static void main(String args[]){
//         int i=0;
//         while(i<=10){
//             System.out.println(i);
//             i++;
//         }
//     }
// }


//Printing the range taking input from the user



// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int range=sc.nextInt();
//         int counter=0;
//         while(counter<=range){
//             System.out.println(counter);
//             counter++;
//         }

//     }
// }



//Sum of N numbers


// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int sum=0;
//         int i=1;
//         while(i<=n){
            
//             sum+=i;
//             i++;
//         }
//         System.out.println("The sum of n numbers is:"+sum);
//     }
// }




//For loop Implementation


// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         for(int i=0;i<10;i++){
//         System.out.println("Hello Svcet");
//         }

//         }
//     }


//Printing Reverse of a number

// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int reverse =0;
//         while(n!=0){
//             int digit=n%10;
//             reverse=reverse*10+digit;
//             n/=10;
//         }
//         System.out.println("The reverse of the numeber is :"+reverse);
//         }
//     }



// Do-while Loop Implemnetation


// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         int counter=1;
//         do{
//             System.out.println("Hello Kadiri");
//             counter++;
//         }
//         while(counter<=10);
//         }
//     }



//Break Statement Implementation


// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             if(i==5){
//                 break;;

//             }
//             System.out.println(i);
//         }
//         System.out.println("Iam out of the Loop now ");
//     }
// }



//Do While Loop

// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         do{
//             System.out.println("Enter your number:");
//             int n=sc.nextInt();
            
//             if(n%15==0){
//                 break;

//             }
//             System.out.println(n);
//         }
//         while(true);
//     }
// }


//  Star Pattern Understanding 


// public class JavaBasics{
//     public static void main(String args[]){
//         for(int row=1;row<=4;row++){
//             for(int star=1;star<=row;star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//Inverted Star pattern

// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         int n=4;
//         for(int row=1; row<=n;row++){
//             for(int star=1;star<=n-row+1;star++){
//                 System.out.print("*");

//             }
//             System.out.println();
//         }

//     }
// }



// Printing Half-Pyramid Pattern


// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         for(int line=1;line<=4;line++){
//             for(int number=1;number<=line;number++){
//                 System.out.print(number);
//             }
//             System.out.println();
//         }
//     }
// }



//  Printing  Character pattern

// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         int n=4;
//         char ch='A';
//         for(int line=1;line<=4;line++){
//             for(int chars=1;chars<=line;chars++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }


//   Printing Hollow rectangle Pattern # need to fix some problems inside

// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
       
//         for(int line =1;line<=4;line++){

//             System.out.print("*");
//         }
//         System.out.println();
        
//     }
// }


    // Functions/methods --  it is block of code that is intended to perform some particular task
// Functions are reusable code we can perform it multiple times by simply calling the function name 
// methods are nothing but writing the functions inside the class.


// import java.util.*;
// public class JavaBasics{
//     public static int  Praveen(){
//         int a =20;
//         int b=30;
//         int c=a+b;
//         System.out.println("Welcome to SVCET"+c);
//         return c;
//     }
//     public static void main(String args[]){
//         Praveen();
//     }
// }


 //Product of two numbers

//  import java.util.*;
//  public class JavaBasics{
//     public static int multiply(int a,int b){
//         int product=a*b;
//         return product;
//     }
//     public static void main(String args[]){
//         int prod=multiply(4,5);
//         System.out.println("the product of two numbers is:"+prod);
//     } 
//  }




//  Factorial of a number

// import java.util.*;
// public class JavaBasics{
//     public static int factorial(int n){
//         int fact=1;
//         for(int i=1;i<=n;i++){
//             fact=fact*i;

//         }
//         return fact;
//     }
//     public static void main(String args[]){
//         System.out.println("The factorial of a number is :"+factorial(5));
//      }
//


// Caluclating binomail coefficient of a numbers

// import java.util.*;
// public class JavaBasics{
//     public static int bincoeff(int n,int r){
        
//         int fact_n=factorial(n);
//         int fact_r=factorial(r);
//         int fact_nmr=factorial(n-r);
//         int bincoeff=fact_n/(fact_r*fact_nmr);
//         return bincoeff;
//     }
//     public static void main(String args[]){
//         System.out.println("The binomial coefficient of the numbers is :"+bincoeff(5,2));
//     }
// }




// function overloading example program- function overloading means that multiple functions within the same name
//but different params

// import java.util.*;
// public class JavaBasics{
//     public static int sum(int a , int b, int c ){
//         return a+b+c;
//     }
//     public static void main(String args[]){
//         System.out.println(sum(5,4,5));
//         System.out.println(sum(9,8,9));
//     }



//     }



//Function overloading with datatypes

// import java.util.*;
// public class JavaBasics{
//     public static int sum(int a , int b){
//         return a+b;
//     }
//     public static float sum(float a,float b){
//         return a+b;
//     }
//     public static void main(String args[]){
//         System.out.println("The sum of the a and b is :"+sum(8,9));
//         System.out.println("The sume of the a and b is:"+sum(3.2f,7.8f));
//     }
// }


// Printing true if the number given by the user is prime or else false


// import java.util.*;
// public class JavaBasics{
//     public static boolean isPrime(int n){
//         if(n==2){
//             return true;
//         }
//         for(int i=2;i<= Math.sqrt(n);i++){
//             if(n%i==0){
//                 return false;
//             }
//         }
//             return true;


//         }
//         public static void main(String args[]){
//             System.out.println(isPrime(9));
//         }
//     }



//Hollow rectangle pattern

// import java.util.*;
// public class JavaBasics{
//     public static void hollow_rectangle(int totrows,int totcols){
//         for(int i=1;i<=totrows;i++){
//             for(int j=1;j<=totcols;j++){
//                 if(int i=1||i==totrows ||j=-1||j==totcols){
//                     System.out.println("*");
//                 }else{
//                     System.out.println(" ");
//                 }
//                 }
//                 System.out.println();
//             }
//         }
//         public static void main(String args[]){
//             hollow_rectangle(4,5);
//         }

//     }


// Printing the diamond pattern

// import java.util.*;
// public class JavaBasics{
//     public static void diamond(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.println(" ");
//             }
//             for(int j=1;j<=2*(i-1);j++){
//                 System.out.println("*");
//             }
//             System.out.println();

//         }
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=(n-i);j++){
//                 System.out.println(" ");
//             }
//             for(int j=1;j<=(2*i-1);j++){
//                 System.out.println("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         diamond(4);
//     }
// }



//Arrays Implementation and operations on it

// import java.util.Scanner;

// public class JavaBasics{
//     public static void main(String args[]){
//         int marks[]=new int[100];
//         Scanner sc=new Scanner(System.in);
//         marks[0]=sc.nextInt();
//         marks[1]=sc.nextInt();
//         marks[2]=sc.nextInt();
//         System.out.println("PHY:"+marks[0]);
//         System.out.println("CHEM:"+marks[1]);
//         System.out.println("MATH:"+marks[2]);
//         marks[2]=100;
//         System.out.println("MATH:"+marks[2]);



//     }
// }






  