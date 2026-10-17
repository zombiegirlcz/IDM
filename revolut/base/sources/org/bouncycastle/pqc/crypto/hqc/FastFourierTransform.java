package org.bouncycastle.pqc.crypto.hqc;

/* JADX INFO: loaded from: classes14.dex */
class FastFourierTransform {
    public static void computeFFTBetas(int[] iArr, int i) {
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            if (i2 >= i3) {
                return;
            }
            iArr[i2] = 1 << (i3 - i2);
            i2++;
        }
    }

    public static void computeFFTRec(int[] iArr, int[] iArr2, int i, int i2, int i3, int[] iArr3, int i5, int i6) {
        int i21;
        int i22;
        int[] iArr4;
        int i32 = 1;
        int i33 = 1 << (i5 - 2);
        int i43 = i6 - 2;
        int i59 = 1 << i43;
        int[] iArr5 = new int[i33];
        int[] iArr6 = new int[i33];
        int[] iArr7 = new int[i43];
        int[] iArr8 = new int[i43];
        int[] iArr9 = new int[i59];
        int[] iArr10 = new int[i59];
        int[] iArr11 = new int[i59];
        int[] iArr12 = new int[(i6 - i5) + 1];
        if (i3 == 1) {
            for (int i66 = 0; i66 < i2; i66++) {
                iArr12[i66] = GF.mul(iArr3[i66], iArr2[1]);
            }
            iArr[0] = iArr2[0];
            for (int i74 = 0; i74 < i2; i74++) {
                for (int i92 = 0; i92 < i32; i92++) {
                    iArr[i32 + i92] = iArr[i92] ^ iArr12[i74];
                }
                i32 <<= 1;
            }
            return;
        }
        int i96 = i2 - 1;
        if (iArr3[i96] != 1) {
            int i99 = 1 << i3;
            i21 = 1;
            i22 = 0;
            int iMul = 1;
            while (true) {
                iArr4 = iArr8;
                if (i32 >= i99) {
                    break;
                }
                iMul = GF.mul(iMul, iArr3[i96]);
                iArr2[i32] = GF.mul(iMul, iArr2[i32]);
                i32++;
                iArr8 = iArr4;
            }
        } else {
            i21 = 1;
            i22 = 0;
            iArr4 = iArr8;
        }
        computeRadix(iArr5, iArr6, iArr2, i3, i5);
        for (int i100 = i22; i100 < i96; i100++) {
            int iDiv = GF.div(iArr3[i100], iArr3[i96]);
            iArr7[i100] = iDiv;
            iArr4[i100] = iDiv ^ GF.sqr(iDiv);
        }
        computeSubsetSum(iArr9, iArr7, i96);
        int i101 = i3 - 1;
        int[] iArr13 = iArr4;
        computeFFTRec(iArr10, iArr5, (i + 1) / 2, i96, i101, iArr13, i5, i6);
        int i102 = i21 << (i96 & 15);
        if (i <= 3) {
            iArr[i22] = iArr10[i22];
            iArr[i102] = iArr10[i22] ^ iArr6[i22];
            for (int i103 = i21; i103 < i102; i103++) {
                int iMul2 = iArr10[i103] ^ GF.mul(iArr9[i103], iArr6[i22]);
                iArr[i103] = iMul2;
                iArr[i102 + i103] = iMul2 ^ iArr6[i22];
            }
            return;
        }
        computeFFTRec(iArr11, iArr6, i / 2, i96, i101, iArr13, i5, i6);
        int i104 = i22;
        System.arraycopy(iArr11, i104, iArr, i102, i102);
        iArr[i104] = iArr10[i104];
        iArr[i102] = iArr10[i104] ^ iArr[i102];
        for (int i105 = i21; i105 < i102; i105++) {
            int iMul3 = iArr10[i105] ^ GF.mul(iArr9[i105], iArr11[i105]);
            iArr[i105] = iMul3;
            int i106 = i102 + i105;
            iArr[i106] = iMul3 ^ iArr[i106];
        }
    }

    public static void computeRadix(int[] iArr, int[] iArr2, int[] iArr3, int i, int i2) {
        if (i == 1) {
            iArr[0] = iArr3[0];
            iArr2[0] = iArr3[1];
            return;
        }
        if (i == 2) {
            iArr[0] = iArr3[0];
            int i3 = iArr3[2];
            int i5 = iArr3[3];
            int i6 = i3 ^ i5;
            iArr[1] = i6;
            iArr2[0] = i6 ^ iArr3[1];
            iArr2[1] = i5;
            return;
        }
        if (i == 3) {
            iArr[0] = iArr3[0];
            int i21 = iArr3[4];
            int i22 = iArr3[6];
            iArr[2] = i21 ^ i22;
            int i32 = iArr3[7];
            iArr[3] = i22 ^ i32;
            int i33 = iArr3[3];
            int i43 = iArr3[5];
            int i59 = (i33 ^ i43) ^ i32;
            iArr2[1] = i59;
            iArr2[2] = i43 ^ i22;
            iArr2[3] = i32;
            int i66 = (iArr3[2] ^ iArr[2]) ^ i59;
            iArr[1] = i66;
            iArr2[0] = i66 ^ iArr3[1];
            return;
        }
        if (i != 4) {
            computeRadixBig(iArr, iArr2, iArr3, i, i2);
            return;
        }
        int i74 = iArr3[8];
        int i92 = iArr3[12];
        iArr[4] = i74 ^ i92;
        int i96 = iArr3[14];
        iArr[6] = i92 ^ i96;
        int i99 = iArr3[15];
        iArr[7] = i96 ^ i99;
        int i100 = iArr3[11];
        int i101 = iArr3[13];
        int i102 = i100 ^ i101;
        iArr2[5] = i102;
        iArr2[6] = i101 ^ i96;
        iArr2[7] = i99;
        int i103 = iArr3[10];
        int i104 = (i92 ^ i103) ^ i102;
        iArr[5] = i104;
        int i105 = iArr3[9];
        iArr2[4] = i104 ^ (i105 ^ i101);
        iArr[0] = iArr3[0];
        int i106 = (iArr3[7] ^ i100) ^ i99;
        iArr2[3] = i106;
        int i107 = (i96 ^ (iArr3[6] ^ i103)) ^ i106;
        iArr[3] = i107;
        int i108 = (iArr3[4] ^ iArr[4]) ^ i107;
        int i109 = iArr2[3];
        iArr[2] = i108 ^ i109;
        int i110 = iArr3[3];
        int i111 = (((iArr3[5] ^ i110) ^ i105) ^ i101) ^ i109;
        iArr2[1] = i111;
        iArr2[2] = i107 ^ (i110 ^ i111);
        int i112 = (iArr3[2] ^ iArr[2]) ^ i111;
        iArr[1] = i112;
        iArr2[0] = i112 ^ iArr3[1];
    }

    public static void computeRadixBig(int[] iArr, int[] iArr2, int[] iArr3, int i, int i2) {
        int i3 = 1 << (i - 2);
        int i5 = 1 << (i2 - 2);
        int i6 = (i5 * 2) + 1;
        int[] iArr4 = new int[i6];
        int[] iArr5 = new int[i6];
        int[] iArr6 = new int[i5];
        int[] iArr7 = new int[i5];
        int[] iArr8 = new int[i5];
        int[] iArr9 = new int[i5];
        int i21 = i3 * 3;
        System.arraycopy(iArr3, i21, iArr4, 0, i3);
        System.arraycopy(iArr3, i21, iArr4, i3, i3);
        int i22 = i3 * 2;
        System.arraycopy(iArr3, 0, iArr5, 0, i22);
        for (int i32 = 0; i32 < i3; i32++) {
            int i33 = iArr4[i32] ^ iArr3[i22 + i32];
            iArr4[i32] = i33;
            int i43 = i3 + i32;
            iArr5[i43] = iArr5[i43] ^ i33;
        }
        int i59 = i - 1;
        computeRadix(iArr6, iArr7, iArr4, i59, i2);
        computeRadix(iArr8, iArr9, iArr5, i59, i2);
        System.arraycopy(iArr8, 0, iArr, 0, i3);
        System.arraycopy(iArr6, 0, iArr, i3, i3);
        System.arraycopy(iArr9, 0, iArr2, 0, i3);
        System.arraycopy(iArr7, 0, iArr2, i3, i3);
    }

    public static void computeSubsetSum(int[] iArr, int[] iArr2, int i) {
        iArr[0] = 0;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0;
            while (true) {
                int i5 = 1 << i2;
                if (i3 < i5) {
                    iArr[i5 + i3] = iArr2[i2] ^ iArr[i3];
                    i3++;
                }
            }
        }
    }

    public static void fastFourierTransform(int[] iArr, int[] iArr2, int i, int i2) {
        int i3 = 1 << i2;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[7];
        int[] iArr6 = new int[128];
        int[] iArr7 = new int[128];
        int[] iArr8 = new int[7];
        int[] iArr9 = new int[128];
        computeFFTBetas(iArr8, 8);
        computeSubsetSum(iArr9, iArr8, 7);
        computeRadix(iArr3, iArr4, iArr2, i2, i2);
        for (int i5 = 0; i5 < 7; i5++) {
            int i6 = iArr8[i5];
            iArr5[i5] = GF.sqr(i6) ^ i6;
        }
        int i21 = i2 - 1;
        computeFFTRec(iArr6, iArr3, (i + 1) / 2, 7, i21, iArr5, i2, 8);
        computeFFTRec(iArr7, iArr4, i / 2, 7, i21, iArr5, i2, 8);
        System.arraycopy(iArr7, 0, iArr, 128, 128);
        iArr[0] = iArr6[0];
        iArr[128] = iArr[128] ^ iArr6[0];
        for (int i22 = 1; i22 < 128; i22++) {
            int iMul = iArr6[i22] ^ GF.mul(iArr9[i22], iArr7[i22]);
            iArr[i22] = iMul;
            int i32 = 128 + i22;
            iArr[i32] = iMul ^ iArr[i32];
        }
    }

    public static void fastFourierTransformGetError(byte[] bArr, int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[7];
        int[] iArr4 = new int[i];
        computeFFTBetas(iArr3, 8);
        computeSubsetSum(iArr4, iArr3, 7);
        byte unsigned16Bits = (byte) (bArr[0] ^ (Utils.toUnsigned16Bits((-iArr[0]) >> 15) ^ 1));
        bArr[0] = unsigned16Bits;
        bArr[0] = (byte) (unsigned16Bits ^ (Utils.toUnsigned16Bits((-iArr[i]) >> 15) ^ 1));
        for (int i2 = 1; i2 < i; i2++) {
            int i3 = 255 - iArr2[iArr4[i2]];
            bArr[i3] = (byte) (bArr[i3] ^ (Math.abs((-iArr[i2]) >> 15) ^ 1));
            int i5 = 255 - iArr2[iArr4[i2] ^ 1];
            bArr[i5] = (byte) (bArr[i5] ^ (Math.abs((-iArr[i + i2]) >> 15) ^ 1));
        }
    }
}
