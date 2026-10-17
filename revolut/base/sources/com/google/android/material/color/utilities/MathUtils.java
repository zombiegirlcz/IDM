package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes16.dex */
public class MathUtils {
    private MathUtils() {
    }

    public static double clampDouble(double d, double d5, double d6) {
        return d6 < d ? d : d6 > d5 ? d5 : d6;
    }

    public static int clampInt(int i, int i2, int i3) {
        return i3 < i ? i : i3 > i2 ? i2 : i3;
    }

    public static double differenceDegrees(double d, double d5) {
        return 180.0d - Math.abs(Math.abs(d - d5) - 180.0d);
    }

    public static double lerp(double d, double d5, double d6) {
        return (d6 * d5) + ((1.0d - d6) * d);
    }

    public static double[] matrixMultiply(double[] dArr, double[][] dArr2) {
        double d = dArr[0];
        double[] dArr3 = dArr2[0];
        double d5 = dArr3[0] * d;
        double d6 = dArr[1];
        double d10 = (dArr3[1] * d6) + d5;
        double d15 = dArr[2];
        double d41 = (dArr3[2] * d15) + d10;
        double[] dArr4 = dArr2[1];
        double d51 = (dArr4[2] * d15) + (dArr4[1] * d6) + (dArr4[0] * d);
        double[] dArr5 = dArr2[2];
        return new double[]{d41, d51, (d15 * dArr5[2]) + (d6 * dArr5[1]) + (d * dArr5[0])};
    }

    public static double rotationDirection(double d, double d5) {
        return sanitizeDegreesDouble(d5 - d) <= 180.0d ? 1.0d : -1.0d;
    }

    public static double sanitizeDegreesDouble(double d) {
        double d5 = d % 360.0d;
        return d5 < 0.0d ? d5 + 360.0d : d5;
    }

    public static int sanitizeDegreesInt(int i) {
        int i2 = i % 360;
        return i2 < 0 ? i2 + 360 : i2;
    }

    public static int signum(double d) {
        if (d < 0.0d) {
            return -1;
        }
        return d == 0.0d ? 0 : 1;
    }
}
