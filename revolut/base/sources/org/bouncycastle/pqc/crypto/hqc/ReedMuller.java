package org.bouncycastle.pqc.crypto.hqc;

/* JADX INFO: loaded from: classes14.dex */
class ReedMuller {

    public static class Codeword {
        int[] type32 = new int[4];
        int[] type8 = new int[16];
    }

    private static int Bit0Mask(int i) {
        return -(i & 1);
    }

    private static void copyCodeword(long[] jArr, Codeword[] codewordArr) {
        int[] iArr = new int[codewordArr.length * 4];
        int i = 0;
        for (Codeword codeword : codewordArr) {
            System.arraycopy(codeword.type32, 0, iArr, i, 4);
            i += 4;
        }
        Utils.fromByte32ArrayToLongArray(jArr, iArr);
    }

    public static void decode(byte[] bArr, long[] jArr, int i, int i2) {
        int length = jArr.length / 2;
        Codeword[] codewordArr = new Codeword[length];
        int[] iArr = new int[jArr.length * 2];
        Utils.fromLongArrayToByte32Array(iArr, jArr);
        for (int i3 = 0; i3 < length; i3++) {
            Codeword codeword = new Codeword();
            codewordArr[i3] = codeword;
            System.arraycopy(iArr, i3 * 4, codeword.type32, 0, 4);
        }
        int[] iArr2 = new int[128];
        int[] iArr3 = new int[128];
        for (int i5 = 0; i5 < i; i5++) {
            expandThenSum(iArr2, codewordArr, i5 * i2, i2);
            hadamardTransform(iArr2, iArr3);
            iArr3[0] = iArr3[0] - (i2 * 64);
            bArr[i5] = (byte) findPeaks(iArr3);
        }
        copyCodeword(jArr, codewordArr);
    }

    public static void encode(long[] jArr, byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        Codeword[] codewordArr = new Codeword[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            codewordArr[i5] = new Codeword();
        }
        for (int i6 = 0; i6 < i; i6++) {
            int i21 = i6 * i2;
            encodeSub(codewordArr[i21], bArr[i6]);
            for (int i22 = 1; i22 < i2; i22++) {
                codewordArr[i21 + i22] = codewordArr[i21];
            }
        }
        copyCodeword(jArr, codewordArr);
    }

    public static void encodeSub(Codeword codeword, int i) {
        int iBit0Mask = ((((Bit0Mask(i >> 7) ^ (Bit0Mask(i) & (-1431655766))) ^ (Bit0Mask(i >> 1) & (-858993460))) ^ (Bit0Mask(i >> 2) & (-252645136))) ^ (Bit0Mask(i >> 3) & (-16711936))) ^ (Bit0Mask(i >> 4) & (-65536));
        codeword.type32[0] = iBit0Mask;
        int i2 = i >> 5;
        int iBit0Mask2 = iBit0Mask ^ Bit0Mask(i2);
        codeword.type32[1] = iBit0Mask2;
        int iBit0Mask3 = Bit0Mask(i >> 6) ^ iBit0Mask2;
        codeword.type32[3] = iBit0Mask3;
        codeword.type32[2] = iBit0Mask3 ^ Bit0Mask(i2);
    }

    private static void expandThenSum(int[] iArr, Codeword[] codewordArr, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            for (int i5 = 0; i5 < 32; i5++) {
                iArr[(i3 * 32) + i5] = (codewordArr[i].type32[i3] >> i5) & 1;
            }
        }
        for (int i6 = 1; i6 < i2; i6++) {
            int[] iArr2 = codewordArr[i + i6].type32;
            for (int i21 = 0; i21 < 4; i21++) {
                for (int i22 = 0; i22 < 32; i22++) {
                    int i32 = (i21 * 32) + i22;
                    iArr[i32] = iArr[i32] + ((iArr2[i21] >> i22) & 1);
                }
            }
        }
    }

    private static int findPeaks(int[] iArr) {
        int i = 0;
        int i2 = 0;
        int iMax = 0;
        for (int i3 = 0; i3 < 128; i3++) {
            int i5 = iArr[i3];
            int i6 = i5 > 0 ? -1 : 0;
            int i21 = ((~i6) & (-i5)) | (i6 & i5);
            if (i21 > iMax) {
                i = i5;
            }
            if (i21 > iMax) {
                i2 = i3;
            }
            iMax = Math.max(i21, iMax);
        }
        return i2 | ((i > 0 ? 1 : 0) * 128);
    }

    private static void hadamardTransform(int[] iArr, int[] iArr2) {
        int i = 0;
        while (i < 7) {
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = i2 * 2;
                int i5 = iArr[i3];
                int i6 = iArr[i3 + 1];
                iArr2[i2] = i5 + i6;
                iArr2[i2 + 64] = i5 - i6;
            }
            i++;
            int[] iArr3 = iArr2;
            iArr2 = iArr;
            iArr = iArr3;
        }
    }
}
