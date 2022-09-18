package com.bridgelabz;

public class CabInvoiceGeneratorTwo {
    private static final double COST_PER_KM = 10;
    private static final double COST_PER_MIN = 1;
    public static double calculateFare(double distance, double time) {
        double totalFare = COST_PER_KM*distance + COST_PER_MIN*time;
        return totalFare<=5 ? 5 : totalFare;
    }

}
