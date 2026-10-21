package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        // Setup
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        // Prompt the user for information
        System.out.println("Enter your full name (first, last): ");
        String fullName = scanner.nextLine();
        System.out.println("Enter the date (MM/DD/YYYY): ");
        String date = scanner.nextLine();
        System.out.println("Enter number of tickets: ");
        int tickets = scanner.nextInt();

        // Split the name into (first, last)
        String[] nameSplit = fullName.split(",");
        String firstName = nameSplit[0].trim();
        String lastName = nameSplit[1].trim();

        // Make the user inputted date into a LocalDate
        LocalDate localDate = LocalDate.parse(date,parser);

        // Display the confirmation message
        System.out.printf("%d Ticket reserved for %tY-%<tm-%<td under %s, %s%n",
                tickets, localDate, firstName, lastName);

        // Close the scanner
        scanner.close();
    }
}