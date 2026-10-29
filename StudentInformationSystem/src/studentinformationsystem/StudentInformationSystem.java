/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/********************************************************************
 * Author: MUHAMMAD YASIR BIN AHMAD TAUFAN
 * Program Name: StudentProfile.java
 * Description: To do a Java Program
 * Date: 28 October 2026
 * Modified Date: None
 * Version: 1.0
 ********************************************************************/

public class StudentInformationSystem {
    public static void main(String[] args) {
        // i. Define and display student name and student ID
        String studentName = "Yasir Taufan";
        String studentID = "S86774";

        // ii. Store two marks using variables
        double mark1 = 50.0;
        double mark2 = 40.0;

        // iii. Calculate the total mark
        double totalMark = mark1 + mark2;

        // Determine performance message based on total mark
        String performanceMessage;
        if (totalMark >= 90) {
            performanceMessage = "Excellent";
        } else if (totalMark >= 70) {
            performanceMessage = "Good";
        } else {
            performanceMessage = "Needs Improvement";
        }

        // iv. & v. Display student details, total mark, and performance message
        System.out.println("========================================");
        System.out.println("      STUDENT INFORMATION SYSTEM        ");
        System.out.println("========================================");
        System.out.println("Student Name : " + studentName);
        System.out.println("Student ID   : " + studentID);
        System.out.println("----------------------------------------");
        System.out.println("Mark 1       : " + mark1);
        System.out.println("Mark 2       : " + mark2);
        System.out.println("Total Mark   : " + totalMark);
        System.out.println("Status       : " + performanceMessage);
        System.out.println("========================================");
    }
}
