package org.bouncycastle.util;

/* JADX INFO: loaded from: classes14.dex */
public class GF16 {
    private static final byte[] F_STAR = {1, 2, 4, 8, 3, 6, 12, 11, 5, 10, 7, 14, 15, 13, 9};
    private static final byte[] MT4B = new byte[256];
    private static final byte[] INV4B = new byte[16];

    static {
        for (int i = 0; i < 15; i++) {
            for (int i2 = 0; i2 < 15; i2++) {
                byte[] bArr = MT4B;
                byte[] bArr2 = F_STAR;
                bArr[(bArr2[i] << 4) ^ bArr2[i2]] = bArr2[(i + i2) % 15];
            }
        }
        byte[] bArr3 = F_STAR;
        byte bMt = 1;
        byte b4 = bArr3[1];
        byte b5 = bArr3[14];
        INV4B[1] = 1;
        byte bMt2 = 1;
        for (int i3 = 0; i3 < 14; i3++) {
            bMt = mt(bMt, b4);
            bMt2 = mt(bMt2, b5);
            INV4B[bMt] = bMt2;
        }
    }

    public static void decode(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i5 = i3 >> 1;
        int i6 = 0;
        while (i6 < i5) {
            int i21 = i2 + 1;
            bArr2[i2] = (byte) (bArr[i] & 15);
            i2 += 2;
            bArr2[i21] = (byte) ((bArr[i] >>> 4) & 15);
            i6++;
            i++;
        }
        if ((i3 & 1) == 1) {
            bArr2[i2] = (byte) (bArr[i] & 15);
        }
    }

    public static void encode(byte[] bArr, byte[] bArr2, int i) {
        int i2 = i >> 1;
        int i3 = 0;
        int i5 = 0;
        while (i3 < i2) {
            int i6 = i5 + 1;
            int i21 = bArr[i5] & 15;
            i5 += 2;
            bArr2[i3] = (byte) (((bArr[i6] & 15) << 4) | i21);
            i3++;
        }
        if ((i & 1) == 1) {
            bArr2[i3] = (byte) (bArr[i5] & 15);
        }
    }

    public static byte innerProduct(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i5 = 0;
        byte bMul = 0;
        while (i5 < i3) {
            bMul = (byte) (mul(bArr[i], bArr2[i2]) ^ bMul);
            i5++;
            i2 += i3;
            i++;
        }
        return bMul;
    }

    public static byte inv(byte b4) {
        return INV4B[b4 & 15];
    }

    public static byte mt(int i, int i2) {
        return MT4B[(i << 4) ^ i2];
    }

    public static byte mul(byte b4, byte b5) {
        return MT4B[(b4 << 4) | b5];
    }

    public static void decode(byte[] bArr, byte[] bArr2, int i) {
        int i2 = i >> 1;
        int i3 = 0;
        int i5 = 0;
        while (i3 < i2) {
            int i6 = i5 + 1;
            bArr2[i5] = (byte) (bArr[i3] & 15);
            i5 += 2;
            bArr2[i6] = (byte) ((bArr[i3] >>> 4) & 15);
            i3++;
        }
        if ((i & 1) == 1) {
            bArr2[i5] = (byte) (bArr[i3] & 15);
        }
    }

    public static void encode(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = i2 >> 1;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            int i21 = i6 + 1;
            int i22 = bArr[i6] & 15;
            i6 += 2;
            bArr2[i] = (byte) (((bArr[i21] & 15) << 4) | i22);
            i5++;
            i++;
        }
        if ((i2 & 1) == 1) {
            bArr2[i] = (byte) (bArr[i6] & 15);
        }
    }

    public static int mul(int i, int i2) {
        return MT4B[(i << 4) | i2];
    }
}
