package org.bouncycastle.util;

import org.bouncycastle.math.raw.Nat;

/* JADX INFO: loaded from: classes14.dex */
public class Bytes {
    public static final int BYTES = 1;
    public static final int SIZE = 8;

    public static void cmov(int i, int i2, byte[] bArr, int i3, byte[] bArr2, int i5) {
        int iCzero = Nat.czero(i2);
        int i6 = ~iCzero;
        for (int i21 = 0; i21 < i; i21++) {
            int i22 = i5 + i21;
            bArr2[i22] = (byte) ((bArr[i3 + i21] & i6) | (bArr2[i22] & iCzero));
        }
    }

    public static void xor(int i, byte[] bArr, int i2, byte[] bArr2, int i3, byte[] bArr3, int i5) {
        for (int i6 = 0; i6 < i; i6++) {
            bArr3[i5 + i6] = (byte) (bArr[i2 + i6] ^ bArr2[i3 + i6]);
        }
    }

    public static void xorTo(int i, byte[] bArr, int i2, byte[] bArr2) {
        int i3 = 0;
        while (i3 < i) {
            bArr2[i3] = (byte) (bArr[i2] ^ bArr2[i3]);
            i3++;
            i2++;
        }
    }

    public static void cmov(int i, int i2, byte[] bArr, byte[] bArr2) {
        int iCzero = Nat.czero(i2);
        int i3 = ~iCzero;
        for (int i5 = 0; i5 < i; i5++) {
            bArr2[i5] = (byte) ((bArr[i5] & i3) | (bArr2[i5] & iCzero));
        }
    }

    public static void xor(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3, int i3) {
        int i5 = 0;
        while (i5 < i) {
            bArr3[i3] = (byte) (bArr[i2] ^ bArr2[i5]);
            i5++;
            i3++;
            i2++;
        }
    }

    public static void xorTo(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = i3 + i5;
            bArr2[i6] = (byte) (bArr2[i6] ^ bArr[i2 + i5]);
        }
    }

    public static void xor(int i, byte[] bArr, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        int i5 = 0;
        while (i5 < i) {
            bArr3[i3] = (byte) (bArr2[i2] ^ bArr[i5]);
            i5++;
            i3++;
            i2++;
        }
    }

    public static void xorTo(int i, byte[] bArr, byte[] bArr2) {
        for (int i2 = 0; i2 < i; i2++) {
            bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i2]);
        }
    }

    public static void xor(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i2 = 0; i2 < i; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
        }
    }

    public static void xor(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2) {
        int i3 = 0;
        while (i3 < i) {
            bArr3[i2] = (byte) (bArr[i3] ^ bArr2[i3]);
            i3++;
            i2++;
        }
    }
}
