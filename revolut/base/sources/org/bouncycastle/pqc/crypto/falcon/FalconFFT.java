package org.bouncycastle.pqc.crypto.falcon;

/* JADX INFO: loaded from: classes14.dex */
class FalconFFT {
    public static void FFT(double[] dArr, int i, int i2) {
        int i3 = (1 << i2) >> 1;
        int i5 = 2;
        int i6 = 1;
        int i21 = i3;
        while (i6 < i2) {
            int i22 = i21 >> 1;
            int i32 = i5 >> 1;
            int i33 = 0;
            int i43 = 0;
            while (i33 < i32) {
                int i59 = i43 + i22 + i;
                int i66 = (i5 + i33) << 1;
                double[] dArr2 = FPREngine.fpr_gm_tab;
                double d = dArr2[i66];
                double d5 = dArr2[i66 + 1];
                int i74 = i + i43;
                int i92 = i74 + i3;
                int i96 = i74 + i22;
                int i99 = i96 + i3;
                while (i74 < i59) {
                    double d6 = dArr[i74];
                    double d10 = dArr[i92];
                    double d15 = dArr[i96];
                    double d41 = dArr[i99];
                    double d51 = (d15 * d) - (d41 * d5);
                    double d68 = (d41 * d) + (d15 * d5);
                    dArr[i74] = d6 + d51;
                    dArr[i92] = d10 + d68;
                    dArr[i96] = d6 - d51;
                    dArr[i99] = d10 - d68;
                    i74++;
                    i92++;
                    i96++;
                    i99++;
                }
                i33++;
                i43 += i21;
            }
            i6++;
            i5 <<= 1;
            i21 = i22;
        }
    }

    public static void iFFT(double[] dArr, int i, int i2) {
        int i3;
        int i5 = 1 << i2;
        int i6 = i5 >> 1;
        int i21 = i2;
        int i22 = 1;
        int i32 = i5;
        while (true) {
            i3 = 0;
            if (i21 <= 1) {
                break;
            }
            i32 >>= 1;
            int i33 = i22 << 1;
            int i43 = 0;
            while (i3 < i6) {
                int i59 = i3 + i22 + i;
                int i66 = (i32 + i43) << 1;
                double[] dArr2 = FPREngine.fpr_gm_tab;
                double d = dArr2[i66];
                double d5 = -dArr2[i66 + 1];
                int i74 = i + i3;
                int i92 = i74 + i6;
                int i96 = i74 + i22;
                int i99 = i96 + i6;
                while (i74 < i59) {
                    double d6 = dArr[i74];
                    double d10 = dArr[i92];
                    double d15 = dArr[i96];
                    double d41 = dArr[i99];
                    dArr[i74] = d6 + d15;
                    dArr[i92] = d10 + d41;
                    double d51 = d6 - d15;
                    double d68 = d10 - d41;
                    dArr[i96] = (d51 * d) - (d68 * d5);
                    dArr[i99] = (d68 * d) + (d51 * d5);
                    i74++;
                    i92++;
                    i96++;
                    i99++;
                }
                i43++;
                i3 += i33;
            }
            i21--;
            i22 = i33;
        }
        if (i2 > 0) {
            double d81 = FPREngine.fpr_p2_tab[i2];
            while (i3 < i5) {
                int i100 = i + i3;
                dArr[i100] = dArr[i100] * d81;
                i3++;
            }
        }
    }

    public static void poly_LDL_fft(double[] dArr, int i, double[] dArr2, int i2, double[] dArr3, int i3, int i5) {
        int i6 = (1 << i5) >> 1;
        int i21 = i6;
        int i22 = 0;
        int i32 = i2 + i6;
        int i33 = i2;
        while (i22 < i6) {
            double d = dArr[i + i22];
            double d5 = dArr[i + i21];
            double d6 = dArr2[i33];
            double d10 = dArr2[i32];
            double d15 = 1.0d / ((d5 * d5) + (d * d));
            double d41 = d * d15;
            double d51 = d15 * (-d5);
            double d68 = (d6 * d41) - (d10 * d51);
            double d81 = (d41 * d10) + (d51 * d6);
            double d82 = (d81 * d10) + (d68 * d6);
            double d95 = (d6 * d81) + ((-d10) * d68);
            int i43 = i3 + i22;
            dArr3[i43] = dArr3[i43] - d82;
            int i59 = i3 + i21;
            dArr3[i59] = dArr3[i59] - d95;
            dArr2[i33] = d68;
            dArr2[i32] = -d81;
            i22++;
            i21++;
            i33++;
            i32++;
        }
    }

    public static void poly_add(double[] dArr, int i, double[] dArr2, int i2, int i3) {
        int i5 = 1 << i3;
        for (int i6 = 0; i6 < i5; i6++) {
            int i21 = i + i6;
            dArr[i21] = dArr[i21] + dArr2[i2 + i6];
        }
    }

    public static void poly_add_muladj_fft(double[] dArr, double[] dArr2, double[] dArr3, double[] dArr4, double[] dArr5, int i) {
        int i2 = (1 << i) >> 1;
        for (int i3 = 0; i3 < i2; i3++) {
            int i5 = i3 + i2;
            double d = dArr2[i3];
            double d5 = dArr2[i5];
            double d6 = dArr3[i3];
            double d10 = dArr3[i5];
            double d15 = dArr4[i3];
            double d41 = dArr4[i5];
            double d51 = dArr5[i3];
            double d68 = dArr5[i5];
            double d81 = (d5 * d41) + (d * d15);
            double d82 = (d5 * d15) - (d * d41);
            dArr[i3] = d81 + (d10 * d68) + (d6 * d51);
            dArr[i5] = d82 + ((d10 * d51) - (d6 * d68));
        }
    }

    public static void poly_adj_fft(double[] dArr, int i, int i2) {
        int i3 = 1 << i2;
        for (int i5 = i3 >> 1; i5 < i3; i5++) {
            int i6 = i + i5;
            dArr[i6] = -dArr[i6];
        }
    }

    public static void poly_div_autoadj_fft(double[] dArr, int i, double[] dArr2, int i2, int i3) {
        int i5 = (1 << i3) >> 1;
        for (int i6 = 0; i6 < i5; i6++) {
            double d = 1.0d / dArr2[i2 + i6];
            int i21 = i + i6;
            dArr[i21] = dArr[i21] * d;
            int i22 = i21 + i5;
            dArr[i22] = dArr[i22] * d;
        }
    }

    public static void poly_invnorm2_fft(double[] dArr, int i, double[] dArr2, int i2, double[] dArr3, int i3, int i5) {
        int i6 = (1 << i5) >> 1;
        for (int i21 = 0; i21 < i6; i21++) {
            int i22 = i2 + i21;
            double d = dArr2[i22];
            double d5 = dArr2[i22 + i6];
            int i32 = i3 + i21;
            double d6 = dArr3[i32];
            double d10 = dArr3[i32 + i6];
            double d15 = d6 * d6;
            double d41 = d10 * d10;
            dArr[i + i21] = 1.0d / (d41 + (d15 + ((d5 * d5) + (d * d))));
        }
    }

    public static void poly_merge_fft(double[] dArr, int i, double[] dArr2, int i2, double[] dArr3, int i3, int i5) {
        int i6 = 1 << i5;
        int i21 = i6 >> 1;
        int i22 = i6 >> 2;
        dArr[i] = dArr2[i2];
        dArr[i + i21] = dArr3[i3];
        for (int i32 = 0; i32 < i22; i32++) {
            int i33 = i3 + i32;
            double d = dArr3[i33];
            double d5 = dArr3[i33 + i22];
            int i43 = (i32 + i21) << 1;
            double[] dArr4 = FPREngine.fpr_gm_tab;
            double d6 = dArr4[i43];
            double d10 = dArr4[i43 + 1];
            double d15 = (d * d6) - (d5 * d10);
            double d41 = (d5 * d6) + (d * d10);
            int i59 = i2 + i32;
            double d51 = dArr2[i59];
            double d68 = dArr2[i59 + i22];
            int i66 = i + (i32 << 1);
            dArr[i66] = d51 + d15;
            int i74 = i66 + 1;
            dArr[i66 + i21] = d68 + d41;
            dArr[i74] = d51 - d15;
            dArr[i74 + i21] = d68 - d41;
        }
    }

    public static void poly_mul_autoadj_fft(double[] dArr, int i, double[] dArr2, int i2, int i3) {
        int i5 = (1 << i3) >> 1;
        for (int i6 = 0; i6 < i5; i6++) {
            int i21 = i + i6;
            int i22 = i2 + i6;
            dArr[i21] = dArr[i21] * dArr2[i22];
            int i32 = i21 + i5;
            dArr[i32] = dArr[i32] * dArr2[i22];
        }
    }

    public static void poly_mul_fft(double[] dArr, int i, double[] dArr2, int i2, int i3) {
        int i5 = (1 << i3) >> 1;
        int i6 = i + i5;
        int i21 = 0;
        int i22 = i;
        int i32 = i2;
        while (i21 < i5) {
            double d = dArr[i22];
            double d5 = dArr[i6];
            double d6 = dArr2[i32];
            double d10 = dArr2[i32 + i5];
            dArr[i22] = (d * d6) - (d5 * d10);
            dArr[i6] = (d5 * d6) + (d * d10);
            i21++;
            i22++;
            i32++;
            i6++;
        }
    }

    public static void poly_muladj_fft(double[] dArr, int i, double[] dArr2, int i2, int i3) {
        int i5 = (1 << i3) >> 1;
        int i6 = 0;
        int i21 = i;
        while (i6 < i5) {
            double d = dArr[i21];
            int i22 = i21 + i5;
            double d5 = dArr[i22];
            int i32 = i2 + i6;
            double d6 = dArr2[i32];
            double d10 = dArr2[i32 + i5];
            dArr[i21] = (d5 * d10) + (d * d6);
            dArr[i22] = (d5 * d6) - (d * d10);
            i6++;
            i21++;
        }
    }

    public static void poly_mulconst(double[] dArr, int i, double d, int i2) {
        int i3 = 1 << i2;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i + i5;
            dArr[i6] = dArr[i6] * d;
        }
    }

    public static void poly_mulselfadj_fft(double[] dArr, int i, int i2) {
        int i3 = (1 << i2) >> 1;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i + i5;
            double d = dArr[i6];
            int i21 = i6 + i3;
            double d5 = dArr[i21];
            dArr[i6] = (d5 * d5) + (d * d);
            dArr[i21] = 0.0d;
        }
    }

    public static void poly_neg(double[] dArr, int i, int i2) {
        int i3 = 1 << i2;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i + i5;
            dArr[i6] = -dArr[i6];
        }
    }

    public static void poly_split_fft(double[] dArr, int i, double[] dArr2, int i2, double[] dArr3, int i3, int i5) {
        int i6 = 1 << i5;
        int i21 = i6 >> 1;
        int i22 = i6 >> 2;
        dArr[i] = dArr3[i3];
        dArr2[i2] = dArr3[i3 + i21];
        for (int i32 = 0; i32 < i22; i32++) {
            int i33 = i3 + (i32 << 1);
            double d = dArr3[i33];
            int i43 = i33 + 1;
            double d5 = dArr3[i33 + i21];
            double d6 = dArr3[i43];
            double d10 = dArr3[i43 + i21];
            int i59 = i + i32;
            dArr[i59] = (d + d6) * 0.5d;
            dArr[i59 + i22] = (d5 + d10) * 0.5d;
            double d15 = d - d6;
            double d41 = d5 - d10;
            int i66 = (i32 + i21) << 1;
            double[] dArr4 = FPREngine.fpr_gm_tab;
            double d51 = dArr4[i66];
            double d68 = -dArr4[i66 + 1];
            int i74 = i2 + i32;
            dArr2[i74] = ((d15 * d51) - (d41 * d68)) * 0.5d;
            dArr2[i74 + i22] = ((d41 * d51) + (d15 * d68)) * 0.5d;
        }
    }

    public static void poly_sub(double[] dArr, int i, double[] dArr2, int i2, int i3) {
        int i5 = 1 << i3;
        for (int i6 = 0; i6 < i5; i6++) {
            int i21 = i + i6;
            dArr[i21] = dArr[i21] - dArr2[i2 + i6];
        }
    }
}
