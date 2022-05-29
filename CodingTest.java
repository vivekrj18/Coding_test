///////////*
////////// * To change this license header, choose License Headers in Project Properties.
////////// * To change this template file, choose Tools | Templates
////////// * and open the template in the editor.
////////// */
//////////package coding.test;
//////////import java.util.Scanner;
///////////**
////////// *
////////// * @author Admin
////////// */
//////////public class CodingTest {
//////////
//////////    /**
//////////     * @param args the command line arguments
//////////     3.	Write a program to accept a number from the user and count the number of digits in the number.
//////////     */
//////////    public static void main(String[] args) {
//////////        // TODO code application logic here
//////////        Scanner s=new Scanner(System.in);
//////////        System.out.println("enter a number");
//////////        int num=s.nextInt();
//////////        int count=0;
//////////        while(num>0)
//////////        {
//////////            num=num/10;
//////////            count++;
//////////        }
//////////        System.out.println(count);
//////////    }
//////////    
//////////}
////////
////////
/////////*
//////// * To change this license header, choose License Headers in Project Properties.
//////// * To change this template file, choose Tools | Templates
//////// * and open the template in the editor.
//////// */
////////package coding.test;
////////import java.util.Scanner;
/////////**
//////// *
//////// * @author Admin
//////// */
////////public class CodingTest {
////////
////////    /**
////////     * @param args the command line arguments
////////     * 4.	Write a program to generate following patterns
////////                1
////////                1 2 1
////////                1 2 3 2 1
////////                1 2 3 4 3 2 1
////////                1 2 3 4 5 4 3 2 1
////////
////////     */
////////    public static void main(String[] args) {
////////        // TODO code application logic here
////////        Scanner s=new Scanner(System.in);
////////        System.out.println("enter a number");
////////        int num=s.nextInt();
////////        for(int i=1;i<=num;i++)
////////        {
////////            for(int j=1;j<=i;j++)
////////            {
////////                System.out.print(j+" ");
////////            }
////////            for(int j=i-1;j>0;j--)
////////            {
////////                System.out.println(j+" ");
////////            }
////////            System.out.println();
////////        }
////////    }
////////    
////////}
//////
//////
///////*
////// * To change this license header, choose License Headers in Project Properties.
////// * To change this template file, choose Tools | Templates
////// * and open the template in the editor.
////// */
//////package coding.test;
//////import java.util.Scanner;
///////**
////// *
////// * @author Admin
////// */
//////public class CodingTest {
//////
//////    /**
//////     * @param args the command line arguments
//////
//////     */
//////    
//////    public static boolean isPrime(int num)
//////    {
//////        boolean flag=true;
//////        for(int i=2;i<num/2;i++)
//////        {
//////            if(num%i==0)
//////            {
//////                flag=false;
//////                break;
//////            }
//////        }
//////         return flag;
//////    }
//////    
//////    public static void main(String[] args) {
//////        // TODO code application logic here
//////        Scanner s=new Scanner(System.in);
//////        System.out.println("enter lower bound value");
//////        int a=s.nextInt();
//////        System.out.println("enter upper bound value");
//////        int b=s.nextInt();
//////        for(int i=a;i<=b;i++)
//////        {
//////            if(isPrime(i))
//////                System.out.println(i);
//////        } 
//////    }
//////    
//////}
////
/////*
//// * To change this license header, choose License Headers in Project Properties.
//// * To change this template file, choose Tools | Templates
//// * and open the template in the editor.
//// */
////package coding.test;
////import java.util.Scanner;
/////**
//// *
//// * @author Admin
//// */
////public class CodingTest {
////
////    /**
////     * @param args the command line arguments
////
////15.	Program to Sort first half in ascending order and second half in descending order in an array 
////
////     */
////    
////    
////    public static void main(String[] args) {
////        // TODO code application logic here
////        Scanner s=new Scanner(System.in);
////        System.out.println("enter size of array");
////        int num=s.nextInt();
////        int[] array=new int[num];
////        for(int i=0;i<num;i++)
////            array[i]=s.nextInt();
////        int mid=num/2;
////        for(int i=0;i<mid-1;i++)
////        {
////            for(int j=i+1;j<mid;j++)
////            {
////                if(array[i]>array[j])
////                {
////                    int temp=array[i];
////                    array[i]=array[j];
////                    array[j]=temp;
////                }
////            }
////        }
////        for(int i=mid;i<num-1;i++)
////        {
////            for(int j=i+1;j<num;j++)
////            {
////                if(array[i]<array[j])
////                {
////                    int temp=array[i];
////                    array[i]=array[j];
////                    array[j]=temp;
////                }
////            }
////        }
////        for(int i=0;i<num;i++)
////        {
////            System.out.print(array[i]+" ");
////        }
////         
////    }
////    
////}
//
//
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package coding.test;
//import java.util.Scanner;
///**
// *
// * @author Admin
// */
//public class CodingTest {
//
//    /**
//     * @param args the command line arguments
//14.	Write a program in the language of your choice to find out how many minutes M will it take for a phone to reach from charge A to charge B (A and B are inputs, M should be the output). The rate at which it gets charged at different levels was given. 
//For example:
//0<= C <= 10 : 8 mins
//11<= C <= 50 : 6 mins
//And so on
//Sample: If A= 0 and B=5 then M is 8 because in 8 minutes it reaches 10 charge which is greater than 5.
//
//
//     */
//    
//    
//    public static void main(String[] args) {
//        // TODO code application logic here
//        Scanner s=new Scanner(System.in);
//        int a=s.nextInt();
//        int b=s.nextInt();
//        int diff=b-a;
//        if(diff<=10)
//            System.out.println(8+" mins");
//        else
//        {
//           
//            System.out.println(14+" mins");
//        }
//        
//       
//         
//    }
//    
//}

//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package coding.test;
//import java.util.Scanner;
///**
// *
// * @author Admin
// */
//public class CodingTest {
//
//    /**
//     * @param args the command line arguments
//10.	Write a C program that checks if a given password is strong, weak or moderate as 
//per the rules given below. 
//i) If it contains a combination of digits, alphabets and special characters, then the password is strong. 
//ii) If it contains a combination of only digits and alphabets, then the password is moderate. 
//iii) If it contains only alphabets, then the password is weak. 
//
//
//     */
//    
//    public static boolean isDigit(String pass)
//    {
//        boolean flag=false;
//        for(int i=0;i<pass.length();i++)
//        {
//            int temp=(int)pass.charAt(i);
//            if(temp>=48 && temp<=57)
//            {
//                flag=true;
//                return flag;
//            }
//        }
//        return flag;
//    }
//    
//    public static boolean isAlphabet(String pass)
//    {
//        boolean flag=false;
//        for(int i=0;i<pass.length();i++)
//        {
//            int temp=(int)pass.charAt(i);
//            if((temp>=97 && temp<=122) || (temp<=90 && temp>=65))
//            {
//                flag=true;
//                return flag;
//            }
//        }
//        return flag;
//    }
//    
//    public static boolean isSpecial(String pass)
//    {
//        boolean flag=false;
//        for(int i=0;i<pass.length();i++)
//        {
//            int temp=(int)pass.charAt(i);
//            if((temp>=32 && temp<=47) || (temp>=58 && temp<=64) || (temp>=91 && temp<=96) || (temp>=123 && temp<=126) )
//            {
//                flag=true;
//                return flag;
//            }
//        }
//        return flag;
//    }
//    public static void main(String[] args) {
//        // TODO code application logic here
//        Scanner s=new Scanner(System.in);
//        String pass=s.nextLine();
//        if(isDigit(pass) && isAlphabet(pass) && isSpecial(pass))
//        {
//            System.out.println("password is strong");
//        }
//        else if(isDigit(pass) && isAlphabet(pass))
//        {
//            System.out.println("password is moderate");
//        }
//        else if(isAlphabet(pass))
//        {
//            System.out.println("password is weak");
//        }
//    }
//    
//}

//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package coding.test;
//import java.util.Scanner;
///**
// *
// * @author Admin
// */
//public class CodingTest {
//
//    /**
//     * @param args the command line arguments
//
//9.	Write a program using functions and pointers to implement substrptr 
//(char s1[], char s2[]) with two arguments of character array type containing 
//source string (s1)and substring(s2). Function should return an address of a 
//substring in a string if present else a NULL pointer
//
//     */
//    
//    public static void address(String s1,String s2)
//    {
//        System.out.println(s1.indexOf(s2));
//    }
//    public static void main(String[] args) {
//        // TODO code application logic here
//        Scanner s=new Scanner(System.in);
//        String s1=s.nextLine();
//        String s2=s.nextLine();
//        if(s1.contains(s2))
//        {
//            address(s1,s2);
//        }
//        else
//        {
//            System.out.println("doesnt contain");
//        }
//        
//    }
//    
//}


///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package coding.test;
//import java.util.Scanner;
///**
// *
// * @author Admin
// */
//public class CodingTest {
//
//    /**
//     * @param args the command line arguments
//     * 8.	Write a C program to remove 3 or more consecutive characters from a string, repeat 
//until there are no more 
//Ex: MNHHHHNNM => MNNNM => MM
//
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        Scanner s=new Scanner(System.in);
//        String s1=s.nextLine();
//        for(int i=0;i<s1.length()-3;i++)
//        {
//            char c=s1.charAt(i);
//            if(s1.charAt(i)==c && s1.charAt(i+1)==c && s1.charAt(i+2)==c)
//            {   
//                while(s1.charAt(i+3)==c)
//                {
//                    i++;
//                }
//                s1=s1.substring(0,i)+s1.substring(i+3);
//                i=0;
//            }
//            
//        }
//        System.out.println(s1);
//    } 
//}
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package coding.test;
//import java.util.Scanner;
///**
// *
// * @author Admin
// */
//public class CodingTest {
//
//    /**
//     * @param args the command line arguments
//     * 2.	Write a program to accept a four digit number from the user and display its denomination.
//
//Example: 5698
//Output: 5*1000 =5000
//6*100 =600
//9*10 =90
//8*1 =8
//
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        Scanner s=new Scanner(System.in);
//        int[] array=new int[10];
//        int top=-1;
//        int num=s.nextInt();
//        while(num>0)
//        {
//            int temp=num%10;
//            array[++top]=temp;
//            num=num/10;
//        }
//        int a=1000;
//        while(top!=-1)
//        {
//            int temp=array[top--];
//            System.out.println(temp+" * "+a+" = "+(temp*a));
//            a=a/10;
//        }
//    } 
//}

//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package coding.test;
//import java.util.Scanner;
///**
// *
// * @author Admin
// */
//public class CodingTest {
//
//    /**
//     * @param args the command line arguments
//     * 6.	Given the list of N names, print it based on the alphabetical order of the first letter. If the first
//letter of the two names is the same, print it in the order in the array.
//Eg,
//If the Names are Alice, Noah, Bob. Print it as Alice, Bob, Noah.
//If the Names are Alice, Bob, Noah, Adam. Print it as Alice, Adam, Bob, Noah
//If the Names are Bob, Alice, Adam, Ava. Print it as Alice, Adam, Ava, Bob.
//
//Input Format
//First-line will be N. Then N lines will have names.
//Output Format
//Names in sorted order
//
//Sample Input 1:
//4
//Alice
//Bob
//Noah
//Adam
//
//Sample Output 1:
//Alice
//Adam
//Bob
//Noah
//
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        String[] array=new String[n+1];
//        String temp=s.nextLine();
//        for(int i=0;i<n;i++)
//        {
//            array[i]=s.nextLine();
//        }
//        for(int i=0;i<n-1;i++)
//        {
//            for(int j=i+1;j<n;j++)
//            {
//                if(array[i].charAt(0)>array[j].charAt(0))
//                {
//                    temp=array[i];
//                    array[i]=array[j];
//                    array[j]=temp;
//                }
//            }
//        }
//        for(int i=0;i<n;i++)
//        {
//            System.out.println(array[i]);
//        }
//    } 
//}


///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package coding.test;
//import java.util.Scanner;
///**
// *
// * @author Admin
// */
//public class CodingTest {
//
//    /**
//     * @param args the command line arguments
//     * 1.	Write a program to accept a five digit number from the user, increment each digit by one and display the number (digit 9 gets incremented to 0).
//
//Example:
//Input: 14385
//Output: 25496
//
//
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        Scanner s=new Scanner(System.in);
//        System.out.println("enter a 5 digit number");
//        int num=s.nextInt();
//        num=num+11111;
//        System.out.println(num);
//    } 
//}
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package coding.test;
//import java.util.Scanner;
///**
// *
// * @author Admin
// */
//public class CodingTest {
//
//    /**
//     * @param args the command line arguments
//     * 7.	Implement a browser that shows the current page it is in.
//You have 3 commands
//1)”forward”: It goes to the forward page if there is any else it returns the link of the current
//page. If the browser is on the home page it prints “HOME”.
//2)”backward”: It goes to the back page and prints the link to that page. If the browser is on the
//home page then it prints “HOME”
//3)”goto”: It goes to the link mentioned and prints the link of the current page.
//The first or default page in the browser is the “HOME” page
//
//Eg:
//goto
//Leetcode.com
//prints-Leetcode.com
//backward
//prints-HOME
//backward
//prints-HOME
//forward
//prints-Leetcode.com
//forward
//prints-Leetcode.com
//
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        Scanner s=new Scanner(System.in);
//        String[] array=new String[10];
//        array[0]="HOME";
//        int index=0;
//        int choice=0;
//        while(choice!=4)
//        {
//            System.out.println("enter 1 for forward\n2 to backward\n3 to goto\n");
//            choice=s.nextInt();
//            switch(choice)
//            {
//                case 1:
//                    String temp=array[++index];
//                    if(temp!="")
//                    System.out.println(temp);
//                    else
//                        System.out.println(array[--index]);
//                    break;
//                case 2:
//                    if(index==0)
//                        System.out.println(array[0]);
//                    else
//                    {
//                        System.out.println(array[--index]);
//                    }
//                    break;
//                case 3:
//                    System.out.println("enter page name");
//                    temp=s.nextLine();
//                    temp=s.nextLine();
//                    array[++index]=temp;
//                    System.out.println(array[index]);
//                    break;
//                case 4:
//                    System.exit(0);
//            }
//        }
//    } 
//}

//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package coding.test;
//import java.util.Scanner;
///**
// *
// * @author Admin
// */
//public class CodingTest {
//
//    /**
//     * @param args the command line arguments
//     * There is a string, , of lowercase English letters that is repeated infinitely many times. 
//     * Given an integer, , find and print the number of letter a's in the first letters of the infinite string.
//
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        Scanner s=new Scanner(System.in);
//        String temp=s.nextLine();
//        int num=s.nextInt();
//        int count=0;
//        if(temp.length()==1)
//        {
//            if(temp.equals("a"))
//                System.out.println(num);
//            else
//                System.out.println(0);
//        }
//        else
//        {
//            for(int i=0;i<temp.length();i++)
//            {
//                if(temp.charAt(i)=='a')
//                    count++;
//            }
//            int temp1=num%temp.length();
//            int temp2=num/temp.length();
//            count=count*temp2;
//            for(int i=0;i<temp1;i++)
//            {
//                if(temp.charAt(i)=='a')
//                    count++;
//            }
//            System.out.println(count);
//        }
//            
//       
//    } 
//}
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package coding.test;
//import java.util.Scanner;
///**
// *
// * @author Admin
// */
//public class CodingTest {
//
//    /**
//     * @param args the command line arguments
//     * A child is playing a cloud hopping game. In this game, there are sequentially numbered clouds that can be thunderheads or cumulus clouds. The character must jump from cloud to cloud until it reaches the start again.
//
//There is an array of clouds,
//and an energy level . The character starts from and uses unit of energy to make a jump of size to cloud . If it lands on a thundercloud, , its energy () decreases by additional units. The game ends when the character lands back on cloud
//
//.
//
//Given the values of
//, , and the configuration of the clouds as an array , determine the final value of after the game ends.
//
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        Scanner s=new Scanner(System.in);
//        int size=s.nextInt();
//        int hop=s.nextInt();
//        int[] array=new int[size];
//        for(int i=0;i<size;i++)
//            array[i]=s.nextInt();
//        int e=100;
//        int pos=0;
//        do{
//            pos=(pos+hop)%size;
//            if(array[pos]==0)
//                e=e-1;
//            else
//                e=e-3;
//        }
//        while(pos!=0);
//        System.out.println(e);
//        
//    } 
//}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding.test;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class CodingTest {

    /**
     * @param args the command line arguments
     * An arcade game player wants to climb to the top of the leaderboard and track their ranking. The game uses Dense Ranking, so its leaderboard works like this:

    The player with the highest score is ranked number 

on the leaderboard.
Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following ranking number.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp1=n;
        int[] array1=new int[n];
        array1[0]=s.nextInt();
        for(int i=1;i<n;i++)
        {    
            int temp=s.nextInt();
            if(temp!=array1[i-1])
                array1[i]=temp;
            else
                n--;
        }
        int m=s.nextInt();
        int array2[]=new int[m];
        for(int i=0;i<m;i++)
            array2[i]=s.nextInt();
        
        int score=0;
        for(int i=0;i<array2.length;i++)
        {
            score=array2[i];
            for(i=array1.length;i>=0;i--)
                if(score>array1[i]) System.out.println(i+1);
        }
        
        
    } 
}