package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes16.dex */
public final class Cam16 {
    private final double astar;
    private final double bstar;
    private final double chroma;

    /* JADX INFO: renamed from: hue, reason: collision with root package name */
    private final double f49059hue;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final double f49060j;
    private final double jstar;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final double f49061m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final double f49062q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final double f49063s;
    private final double[] tempArray = {0.0d, 0.0d, 0.0d};
    static final double[][] XYZ_TO_CAM16RGB = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};
    static final double[][] CAM16RGB_TO_XYZ = {new double[]{1.8620678d, -1.0112547d, 0.14918678d}, new double[]{0.38752654d, 0.62144744d, -0.00897398d}, new double[]{-0.0158415d, -0.03412294d, 1.0499644d}};

    private Cam16(double d, double d5, double d6, double d10, double d15, double d41, double d51, double d68, double d81) {
        this.f49059hue = d;
        this.chroma = d5;
        this.f49060j = d6;
        this.f49062q = d10;
        this.f49061m = d15;
        this.f49063s = d41;
        this.jstar = d51;
        this.astar = d68;
        this.bstar = d81;
    }

    public static Cam16 fromInt(int i) {
        return fromIntInViewingConditions(i, ViewingConditions.DEFAULT);
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public static Cam16 fromIntInViewingConditions(int i, ViewingConditions viewingConditions) {
        double dLinearized = ColorUtils.linearized((16711680 & i) >> 16);
        double dLinearized2 = ColorUtils.linearized((65280 & i) >> 8);
        double dLinearized3 = ColorUtils.linearized(i & 255);
        return fromXyzInViewingConditions((0.18051042d * dLinearized3) + (0.35762064d * dLinearized2) + (0.41233895d * dLinearized), (0.0722d * dLinearized3) + (0.7152d * dLinearized2) + (0.2126d * dLinearized), (dLinearized3 * 0.95034478d) + (dLinearized2 * 0.11916382d) + (dLinearized * 0.01932141d), viewingConditions);
    }

    public static Cam16 fromJch(double d, double d5, double d6) {
        return fromJchInViewingConditions(d, d5, d6, ViewingConditions.DEFAULT);
    }

    private static Cam16 fromJchInViewingConditions(double d, double d5, double d6, ViewingConditions viewingConditions) {
        double d10 = d / 100.0d;
        double flRoot = viewingConditions.getFlRoot() * (viewingConditions.getAw() + 4.0d) * Math.sqrt(d10) * (4.0d / viewingConditions.getC());
        double flRoot2 = viewingConditions.getFlRoot() * d5;
        double dSqrt = Math.sqrt((viewingConditions.getC() * (d5 / Math.sqrt(d10))) / (viewingConditions.getAw() + 4.0d)) * 50.0d;
        double radians = Math.toRadians(d6);
        double d15 = (1.7000000000000002d * d) / ((0.007d * d) + 1.0d);
        double dLog1p = Math.log1p(0.0228d * flRoot2) * 43.859649122807014d;
        return new Cam16(d6, d5, d, flRoot, flRoot2, dSqrt, d15, Math.cos(radians) * dLog1p, Math.sin(radians) * dLog1p);
    }

    public static Cam16 fromUcs(double d, double d5, double d6) {
        return fromUcsInViewingConditions(d, d5, d6, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromUcsInViewingConditions(double d, double d5, double d6, ViewingConditions viewingConditions) {
        double dExpm1 = (Math.expm1(Math.hypot(d5, d6) * 0.0228d) / 0.0228d) / viewingConditions.getFlRoot();
        double dAtan2 = Math.atan2(d6, d5) * 57.29577951308232d;
        if (dAtan2 < 0.0d) {
            dAtan2 += 360.0d;
        }
        return fromJchInViewingConditions(d / (1.0d - ((d - 100.0d) * 0.007d)), dExpm1, dAtan2, viewingConditions);
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public static Cam16 fromXyzInViewingConditions(double d, double d5, double d6, ViewingConditions viewingConditions) {
        double[][] dArr = XYZ_TO_CAM16RGB;
        double[] dArr2 = dArr[0];
        double d10 = (dArr2[2] * d6) + (dArr2[1] * d5) + (dArr2[0] * d);
        double[] dArr3 = dArr[1];
        double d15 = (dArr3[2] * d6) + (dArr3[1] * d5) + (dArr3[0] * d);
        double[] dArr4 = dArr[2];
        double d41 = (dArr4[2] * d6) + (dArr4[1] * d5) + (dArr4[0] * d);
        double d51 = viewingConditions.getRgbD()[0] * d10;
        double d68 = viewingConditions.getRgbD()[1] * d15;
        double d81 = viewingConditions.getRgbD()[2] * d41;
        double dPow = Math.pow((Math.abs(d51) * viewingConditions.getFl()) / 100.0d, 0.42d);
        double dPow2 = Math.pow((Math.abs(d68) * viewingConditions.getFl()) / 100.0d, 0.42d);
        double dPow3 = Math.pow((Math.abs(d81) * viewingConditions.getFl()) / 100.0d, 0.42d);
        double dSignum = ((Math.signum(d51) * 400.0d) * dPow) / (dPow + 27.13d);
        double dSignum2 = ((Math.signum(d68) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double dSignum3 = ((Math.signum(d81) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d82 = ((((-12.0d) * dSignum2) + (dSignum * 11.0d)) + dSignum3) / 11.0d;
        double d95 = ((dSignum + dSignum2) - (dSignum3 * 2.0d)) / 9.0d;
        double d100 = dSignum2 * 20.0d;
        double d101 = ((21.0d * dSignum3) + ((dSignum * 20.0d) + d100)) / 20.0d;
        double d102 = (((dSignum * 40.0d) + d100) + dSignum3) / 20.0d;
        double degrees = Math.toDegrees(Math.atan2(d95, d82));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d103 = degrees;
        double radians = Math.toRadians(d103);
        double dPow4 = Math.pow((viewingConditions.getNbb() * d102) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ()) * 100.0d;
        double d104 = dPow4 / 100.0d;
        double flRoot = viewingConditions.getFlRoot() * (viewingConditions.getAw() + 4.0d) * Math.sqrt(d104) * (4.0d / viewingConditions.getC());
        double dPow5 = Math.pow((Math.hypot(d82, d95) * (viewingConditions.getNcb() * (viewingConditions.getNc() * (((Math.cos(Math.toRadians(d103 < 20.14d ? d103 + 360.0d : d103) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d)))) / (d101 + 0.305d), 0.9d) * Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d);
        double dSqrt = Math.sqrt(d104) * dPow5;
        double flRoot2 = viewingConditions.getFlRoot() * dSqrt;
        double dSqrt2 = Math.sqrt((viewingConditions.getC() * dPow5) / (viewingConditions.getAw() + 4.0d)) * 50.0d;
        double d105 = (1.7000000000000002d * dPow4) / ((0.007d * dPow4) + 1.0d);
        double dLog1p = Math.log1p(0.0228d * flRoot2) * 43.859649122807014d;
        return new Cam16(d103, dSqrt, dPow4, flRoot, flRoot2, dSqrt2, d105, Math.cos(radians) * dLog1p, Math.sin(radians) * dLog1p);
    }

    public double distance(Cam16 cam16) {
        double jstar = getJstar() - cam16.getJstar();
        double astar = getAstar() - cam16.getAstar();
        double bstar = getBstar() - cam16.getBstar();
        return Math.pow(Math.sqrt((bstar * bstar) + (astar * astar) + (jstar * jstar)), 0.63d) * 1.41d;
    }

    public double getAstar() {
        return this.astar;
    }

    public double getBstar() {
        return this.bstar;
    }

    public double getChroma() {
        return this.chroma;
    }

    public double getHue() {
        return this.f49059hue;
    }

    public double getJ() {
        return this.f49060j;
    }

    public double getJstar() {
        return this.jstar;
    }

    public double getM() {
        return this.f49061m;
    }

    public double getQ() {
        return this.f49062q;
    }

    public double getS() {
        return this.f49063s;
    }

    public int toInt() {
        return viewed(ViewingConditions.DEFAULT);
    }

    public int viewed(ViewingConditions viewingConditions) {
        double[] dArrXyzInViewingConditions = xyzInViewingConditions(viewingConditions, this.tempArray);
        return ColorUtils.argbFromXyz(dArrXyzInViewingConditions[0], dArrXyzInViewingConditions[1], dArrXyzInViewingConditions[2]);
    }

    public double[] xyzInViewingConditions(ViewingConditions viewingConditions, double[] dArr) {
        double dPow = Math.pow(((getChroma() == 0.0d || getJ() == 0.0d) ? 0.0d : getChroma() / Math.sqrt(getJ() / 100.0d)) / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double radians = Math.toRadians(getHue());
        double dCos = (Math.cos(2.0d + radians) + 3.8d) * 0.25d;
        double dPow2 = Math.pow(getJ() / 100.0d, (1.0d / viewingConditions.getC()) / viewingConditions.getZ()) * viewingConditions.getAw();
        double ncb2 = viewingConditions.getNcb() * viewingConditions.getNc() * dCos * 3846.153846153846d;
        double nbb2 = dPow2 / viewingConditions.getNbb();
        double dSin = Math.sin(radians);
        double dCos2 = Math.cos(radians);
        double d = (((0.305d + nbb2) * 23.0d) * dPow) / (((dPow * 108.0d) * dSin) + (((11.0d * dPow) * dCos2) + (ncb2 * 23.0d)));
        double d5 = dCos2 * d;
        double d6 = d * dSin;
        double d10 = nbb2 * 460.0d;
        double d15 = ((288.0d * d6) + ((451.0d * d5) + d10)) / 1403.0d;
        double d41 = ((d10 - (891.0d * d5)) - (261.0d * d6)) / 1403.0d;
        double d51 = ((d10 - (d5 * 220.0d)) - (d6 * 6300.0d)) / 1403.0d;
        double dPow3 = Math.pow(Math.max(0.0d, (Math.abs(d15) * 27.13d) / (400.0d - Math.abs(d15))), 2.380952380952381d) * (100.0d / viewingConditions.getFl()) * Math.signum(d15);
        double dPow4 = Math.pow(Math.max(0.0d, (Math.abs(d41) * 27.13d) / (400.0d - Math.abs(d41))), 2.380952380952381d) * (100.0d / viewingConditions.getFl()) * Math.signum(d41);
        double dPow5 = Math.pow(Math.max(0.0d, (Math.abs(d51) * 27.13d) / (400.0d - Math.abs(d51))), 2.380952380952381d) * (100.0d / viewingConditions.getFl()) * Math.signum(d51);
        double d68 = dPow3 / viewingConditions.getRgbD()[0];
        double d81 = dPow4 / viewingConditions.getRgbD()[1];
        double d82 = dPow5 / viewingConditions.getRgbD()[2];
        double[][] dArr2 = CAM16RGB_TO_XYZ;
        double[] dArr3 = dArr2[0];
        double d95 = (dArr3[2] * d82) + (dArr3[1] * d81) + (dArr3[0] * d68);
        double[] dArr4 = dArr2[1];
        double d100 = (dArr4[2] * d82) + (dArr4[1] * d81) + (dArr4[0] * d68);
        double[] dArr5 = dArr2[2];
        double d101 = (d82 * dArr5[2]) + (d81 * dArr5[1]) + (d68 * dArr5[0]);
        if (dArr == null) {
            return new double[]{d95, d100, d101};
        }
        dArr[0] = d95;
        dArr[1] = d100;
        dArr[2] = d101;
        return dArr;
    }
}
