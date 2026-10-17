package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes15.dex */
public class MonotonicCurveFit extends CurveFit {
    private boolean mExtrapolate = true;
    double[] mSlopeTemp;
    private double[] mT;
    private double[][] mTangent;
    private double[][] mY;

    public MonotonicCurveFit(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.mSlopeTemp = new double[length2];
        int i = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
        for (int i2 = 0; i2 < length2; i2++) {
            int i3 = 0;
            while (i3 < i) {
                int i5 = i3 + 1;
                double d = dArr[i5] - dArr[i3];
                double[] dArr5 = dArr3[i3];
                double d5 = (dArr2[i5][i2] - dArr2[i3][i2]) / d;
                dArr5[i2] = d5;
                if (i3 == 0) {
                    dArr4[i3][i2] = d5;
                } else {
                    dArr4[i3][i2] = (dArr3[i3 - 1][i2] + d5) * 0.5d;
                }
                i3 = i5;
            }
            dArr4[i][i2] = dArr3[length - 2][i2];
        }
        for (int i6 = 0; i6 < i; i6++) {
            for (int i21 = 0; i21 < length2; i21++) {
                double d6 = dArr3[i6][i21];
                if (d6 == 0.0d) {
                    dArr4[i6][i21] = 0.0d;
                    dArr4[i6 + 1][i21] = 0.0d;
                } else {
                    double d10 = dArr4[i6][i21] / d6;
                    int i22 = i6 + 1;
                    double d15 = dArr4[i22][i21] / d6;
                    double dHypot = Math.hypot(d10, d15);
                    if (dHypot > 9.0d) {
                        double d41 = 3.0d / dHypot;
                        double[] dArr6 = dArr4[i6];
                        double[] dArr7 = dArr3[i6];
                        dArr6[i21] = d10 * d41 * dArr7[i21];
                        dArr4[i22][i21] = d41 * d15 * dArr7[i21];
                    }
                }
            }
        }
        this.mT = dArr;
        this.mY = dArr2;
        this.mTangent = dArr4;
    }

    public static MonotonicCurveFit buildWave(String str) {
        double[] dArr = new double[str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i = 0;
        while (iIndexOf2 != -1) {
            dArr[i] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        return buildWave(Arrays.copyOf(dArr, i + 1));
    }

    private static double diff(double d, double d5, double d6, double d10, double d15, double d41) {
        double d51 = d5 * d5;
        double d68 = d5 * 6.0d;
        double d81 = 6.0d * d51 * d6;
        double d82 = (d81 + ((d68 * d10) + (((-6.0d) * d51) * d10))) - (d68 * d6);
        double d95 = 3.0d * d;
        return (d * d15) + (((((d95 * d15) * d51) + (((d95 * d41) * d51) + d82)) - (((2.0d * d) * d41) * d5)) - (((4.0d * d) * d15) * d5));
    }

    private static double interpolate(double d, double d5, double d6, double d10, double d15, double d41) {
        double d51 = d5 * d5;
        double d68 = d51 * d5;
        double d81 = 3.0d * d51;
        double d82 = d68 * 2.0d * d6;
        double d95 = ((d82 + ((d81 * d10) + (((-2.0d) * d68) * d10))) - (d81 * d6)) + d6;
        double d100 = d * d41;
        double d101 = (d100 * d68) + d95;
        double d102 = d * d15;
        return (d102 * d5) + ((((d68 * d102) + d101) - (d100 * d51)) - (((d * 2.0d) * d15) * d51));
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d, double[] dArr) {
        double[] dArr2 = this.mT;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.mY[0].length;
        if (this.mExtrapolate) {
            double d5 = dArr2[0];
            if (d <= d5) {
                getSlope(d5, this.mSlopeTemp);
                for (int i2 = 0; i2 < length2; i2++) {
                    dArr[i2] = ((d - this.mT[0]) * this.mSlopeTemp[i2]) + this.mY[0][i2];
                }
                return;
            }
            int i3 = length - 1;
            double d6 = dArr2[i3];
            if (d >= d6) {
                getSlope(d6, this.mSlopeTemp);
                while (i < length2) {
                    dArr[i] = ((d - this.mT[i3]) * this.mSlopeTemp[i]) + this.mY[i3][i];
                    i++;
                }
                return;
            }
        } else {
            if (d <= dArr2[0]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    dArr[i5] = this.mY[0][i5];
                }
                return;
            }
            int i6 = length - 1;
            if (d >= dArr2[i6]) {
                while (i < length2) {
                    dArr[i] = this.mY[i6][i];
                    i++;
                }
                return;
            }
        }
        int i21 = 0;
        while (i21 < length - 1) {
            if (d == this.mT[i21]) {
                for (int i22 = 0; i22 < length2; i22++) {
                    dArr[i22] = this.mY[i21][i22];
                }
            }
            double[] dArr3 = this.mT;
            int i32 = i21 + 1;
            double d10 = dArr3[i32];
            if (d < d10) {
                double d15 = dArr3[i21];
                double d41 = d10 - d15;
                double d51 = (d - d15) / d41;
                while (i < length2) {
                    double[][] dArr4 = this.mY;
                    double d68 = dArr4[i21][i];
                    double d81 = dArr4[i32][i];
                    double[][] dArr5 = this.mTangent;
                    dArr[i] = interpolate(d41, d51, d68, d81, dArr5[i21][i], dArr5[i32][i]);
                    i++;
                }
                return;
            }
            i21 = i32;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d, double[] dArr) {
        double[] dArr2 = this.mT;
        int length = dArr2.length;
        int length2 = this.mY[0].length;
        double d5 = dArr2[0];
        if (d > d5) {
            d5 = dArr2[length - 1];
            if (d < d5) {
                d5 = d;
            }
        }
        int i = 0;
        while (i < length - 1) {
            double[] dArr3 = this.mT;
            int i2 = i + 1;
            double d6 = dArr3[i2];
            if (d5 <= d6) {
                double d10 = dArr3[i];
                double d15 = d6 - d10;
                double d41 = (d5 - d10) / d15;
                for (int i3 = 0; i3 < length2; i3++) {
                    double[][] dArr4 = this.mY;
                    double d51 = dArr4[i][i3];
                    double d68 = dArr4[i2][i3];
                    double[][] dArr5 = this.mTangent;
                    dArr[i3] = diff(d15, d41, d51, d68, dArr5[i][i3], dArr5[i2][i3]) / d15;
                }
                return;
            }
            i = i2;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.mT;
    }

    private static MonotonicCurveFit buildWave(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d = 1.0d / ((double) length2);
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i = 0; i < dArr.length; i++) {
            double d5 = dArr[i];
            int i2 = i + length2;
            dArr2[i2][0] = d5;
            double d6 = ((double) i) * d;
            dArr3[i2] = d6;
            if (i > 0) {
                int i3 = (length2 * 2) + i;
                dArr2[i3][0] = d5 + 1.0d;
                dArr3[i3] = d6 + 1.0d;
                int i5 = i - 1;
                dArr2[i5][0] = (d5 - 1.0d) - d;
                dArr3[i5] = (d6 - 1.0d) - d;
            }
        }
        return new MonotonicCurveFit(dArr3, dArr2);
    }

    public double getSlope(double d, int i) {
        double[] dArr = this.mT;
        int length = dArr.length;
        int i2 = 0;
        double d5 = dArr[0];
        if (d >= d5) {
            d5 = dArr[length - 1];
            if (d < d5) {
                d5 = d;
            }
        }
        while (i2 < length - 1) {
            double[] dArr2 = this.mT;
            int i3 = i2 + 1;
            double d6 = dArr2[i3];
            if (d5 <= d6) {
                double d10 = dArr2[i2];
                double d15 = d6 - d10;
                double d41 = (d5 - d10) / d15;
                double[][] dArr3 = this.mY;
                double d51 = dArr3[i2][i];
                double d68 = dArr3[i3][i];
                double[][] dArr4 = this.mTangent;
                return diff(d15, d41, d51, d68, dArr4[i2][i], dArr4[i3][i]) / d15;
            }
            i2 = i3;
        }
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d, float[] fArr) {
        double[] dArr = this.mT;
        int length = dArr.length;
        int i = 0;
        int length2 = this.mY[0].length;
        if (this.mExtrapolate) {
            double d5 = dArr[0];
            if (d <= d5) {
                getSlope(d5, this.mSlopeTemp);
                for (int i2 = 0; i2 < length2; i2++) {
                    fArr[i2] = (float) (((d - this.mT[0]) * this.mSlopeTemp[i2]) + this.mY[0][i2]);
                }
                return;
            }
            int i3 = length - 1;
            double d6 = dArr[i3];
            if (d >= d6) {
                getSlope(d6, this.mSlopeTemp);
                while (i < length2) {
                    fArr[i] = (float) (((d - this.mT[i3]) * this.mSlopeTemp[i]) + this.mY[i3][i]);
                    i++;
                }
                return;
            }
        } else {
            if (d <= dArr[0]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    fArr[i5] = (float) this.mY[0][i5];
                }
                return;
            }
            int i6 = length - 1;
            if (d >= dArr[i6]) {
                while (i < length2) {
                    fArr[i] = (float) this.mY[i6][i];
                    i++;
                }
                return;
            }
        }
        int i21 = 0;
        while (i21 < length - 1) {
            if (d == this.mT[i21]) {
                for (int i22 = 0; i22 < length2; i22++) {
                    fArr[i22] = (float) this.mY[i21][i22];
                }
            }
            double[] dArr2 = this.mT;
            int i32 = i21 + 1;
            double d10 = dArr2[i32];
            if (d < d10) {
                double d15 = dArr2[i21];
                double d41 = d10 - d15;
                double d51 = (d - d15) / d41;
                while (i < length2) {
                    double[][] dArr3 = this.mY;
                    double d68 = dArr3[i21][i];
                    double d81 = dArr3[i32][i];
                    double[][] dArr4 = this.mTangent;
                    fArr[i] = (float) interpolate(d41, d51, d68, d81, dArr4[i21][i], dArr4[i32][i]);
                    i++;
                }
                return;
            }
            i21 = i32;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d, int i) {
        double d5;
        double d6;
        double slope;
        double[] dArr = this.mT;
        int length = dArr.length;
        int i2 = 0;
        if (this.mExtrapolate) {
            double d10 = dArr[0];
            if (d <= d10) {
                d5 = this.mY[0][i];
                d6 = d - d10;
                slope = getSlope(d10, i);
            } else {
                int i3 = length - 1;
                double d15 = dArr[i3];
                if (d >= d15) {
                    d5 = this.mY[i3][i];
                    d6 = d - d15;
                    slope = getSlope(d15, i);
                }
            }
            return (slope * d6) + d5;
        }
        if (d <= dArr[0]) {
            return this.mY[0][i];
        }
        int i5 = length - 1;
        if (d >= dArr[i5]) {
            return this.mY[i5][i];
        }
        while (i2 < length - 1) {
            double[] dArr2 = this.mT;
            double d41 = dArr2[i2];
            if (d == d41) {
                return this.mY[i2][i];
            }
            int i6 = i2 + 1;
            double d51 = dArr2[i6];
            if (d < d51) {
                double d68 = d51 - d41;
                double d81 = (d - d41) / d68;
                double[][] dArr3 = this.mY;
                double d82 = dArr3[i2][i];
                double d95 = dArr3[i6][i];
                double[][] dArr4 = this.mTangent;
                return interpolate(d68, d81, d82, d95, dArr4[i2][i], dArr4[i6][i]);
            }
            i2 = i6;
        }
        return 0.0d;
    }
}
