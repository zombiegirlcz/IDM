package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes16.dex */
public final class ViewingConditions {
    public static final ViewingConditions DEFAULT = defaultWithBackgroundLstar(50.0d);

    /* JADX INFO: renamed from: aw, reason: collision with root package name */
    private final double f49076aw;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f49077c;

    /* JADX INFO: renamed from: fl, reason: collision with root package name */
    private final double f49078fl;
    private final double flRoot;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final double f49079n;

    /* JADX INFO: renamed from: nbb, reason: collision with root package name */
    private final double f49080nbb;

    /* JADX INFO: renamed from: nc, reason: collision with root package name */
    private final double f49081nc;

    /* JADX INFO: renamed from: ncb, reason: collision with root package name */
    private final double f49082ncb;
    private final double[] rgbD;
    private final double z;

    private ViewingConditions(double d, double d5, double d6, double d10, double d15, double d41, double[] dArr, double d51, double d68, double d81) {
        this.f49079n = d;
        this.f49076aw = d5;
        this.f49080nbb = d6;
        this.f49082ncb = d10;
        this.f49077c = d15;
        this.f49081nc = d41;
        this.rgbD = dArr;
        this.f49078fl = d51;
        this.flRoot = d68;
        this.z = d81;
    }

    public static ViewingConditions defaultWithBackgroundLstar(double d) {
        return make(ColorUtils.whitePointD65(), (ColorUtils.yFromLstar(50.0d) * 63.66197723675813d) / 100.0d, d, 2.0d, false);
    }

    public static ViewingConditions make(double[] dArr, double d, double d5, double d6, boolean z) {
        double dMax = Math.max(0.1d, d5);
        double[][] dArr2 = Cam16.XYZ_TO_CAM16RGB;
        double d10 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d15 = dArr3[0] * d10;
        double d41 = dArr[1];
        double d51 = (dArr3[1] * d41) + d15;
        double d68 = dArr[2];
        double d81 = (dArr3[2] * d68) + d51;
        double[] dArr4 = dArr2[1];
        double d82 = (dArr4[2] * d68) + (dArr4[1] * d41) + (dArr4[0] * d10);
        double[] dArr5 = dArr2[2];
        double d95 = (d68 * dArr5[2]) + (d41 * dArr5[1]) + (d10 * dArr5[0]);
        double d100 = (d6 / 10.0d) + 0.8d;
        double dLerp = d100 >= 0.9d ? MathUtils.lerp(0.59d, 0.69d, (d100 - 0.9d) * 10.0d) : MathUtils.lerp(0.525d, 0.59d, (d100 - 0.8d) * 10.0d);
        double dClampDouble = MathUtils.clampDouble(0.0d, 1.0d, z ? 1.0d : (1.0d - (Math.exp(((-d) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d100);
        double[] dArr6 = {(((100.0d / d81) * dClampDouble) + 1.0d) - dClampDouble, (((100.0d / d82) * dClampDouble) + 1.0d) - dClampDouble, (((100.0d / d95) * dClampDouble) + 1.0d) - dClampDouble};
        double d101 = 5.0d * d;
        double d102 = 1.0d / (d101 + 1.0d);
        double d103 = d102 * d102 * d102 * d102;
        double d104 = 1.0d - d103;
        double dCbrt = (Math.cbrt(d101) * 0.1d * d104 * d104) + (d103 * d);
        double dYFromLstar = ColorUtils.yFromLstar(dMax) / dArr[1];
        double dSqrt = Math.sqrt(dYFromLstar) + 1.48d;
        double dPow = 0.725d / Math.pow(dYFromLstar, 0.2d);
        double[] dArr7 = {Math.pow(((dArr6[0] * dCbrt) * d81) / 100.0d, 0.42d), Math.pow(((dArr6[1] * dCbrt) * d82) / 100.0d, 0.42d), Math.pow(((dArr6[2] * dCbrt) * d95) / 100.0d, 0.42d)};
        double d105 = dArr7[0];
        double d106 = (d105 * 400.0d) / (d105 + 27.13d);
        double d107 = dArr7[1];
        double d108 = (d107 * 400.0d) / (d107 + 27.13d);
        double d109 = dArr7[2];
        double[] dArr8 = {d106, d108, (400.0d * d109) / (d109 + 27.13d)};
        return new ViewingConditions(dYFromLstar, ((dArr8[2] * 0.05d) + (dArr8[0] * 2.0d) + dArr8[1]) * dPow, dPow, dPow, dLerp, d100, dArr6, dCbrt, Math.pow(dCbrt, 0.25d), dSqrt);
    }

    public double getAw() {
        return this.f49076aw;
    }

    public double getC() {
        return this.f49077c;
    }

    public double getFl() {
        return this.f49078fl;
    }

    public double getFlRoot() {
        return this.flRoot;
    }

    public double getN() {
        return this.f49079n;
    }

    public double getNbb() {
        return this.f49080nbb;
    }

    public double getNc() {
        return this.f49081nc;
    }

    public double getNcb() {
        return this.f49082ncb;
    }

    public double[] getRgbD() {
        return this.rgbD;
    }

    public double getZ() {
        return this.z;
    }
}
