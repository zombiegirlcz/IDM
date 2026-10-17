package org.bouncycastle.pqc.crypto.snova;

import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.util.GF16;

/* JADX INFO: loaded from: classes14.dex */
class GF16Utils {
    private static final int GF16_MASK = 585;

    public static int ctGF16IsNotZero(byte b4) {
        int i = b4 & UnsignedBytes.MAX_VALUE;
        return ((i >>> 3) | (i >>> 1) | i | (i >>> 2)) & 1;
    }

    public static void decodeMergeInHalf(byte[] bArr, byte[] bArr2, int i) {
        int i2 = (i + 1) >>> 1;
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = (byte) (bArr[i3] & 15);
            bArr2[i3 + i2] = (byte) ((bArr[i3] >>> 4) & 15);
        }
    }

    public static void encodeMergeInHalf(byte[] bArr, int i, byte[] bArr2) {
        int i2 = (i + 1) >>> 1;
        int i3 = 0;
        while (i3 < i / 2) {
            bArr2[i3] = (byte) (bArr[i3] | (bArr[i2] << 4));
            i3++;
            i2++;
        }
        if ((i & 1) == 1) {
            bArr2[i3] = bArr[i3];
        }
    }

    public static int gf16FromNibble(int i) {
        int i2 = i | (i << 4);
        return ((i2 << 2) & 520) | (i2 & 65);
    }

    private static int gf16Reduce(int i) {
        int i2 = 1227133513 & i;
        int i3 = i >>> 12;
        int i5 = (i3 ^ (i3 << 3)) ^ i2;
        int i6 = i5 >>> 12;
        int i21 = i5 ^ (i6 ^ (i6 << 3));
        int i22 = i21 >>> 12;
        return (i21 ^ (i22 ^ (i22 << 3))) & GF16_MASK;
    }

    public static byte gf16ToNibble(int i) {
        int iGf16Reduce = gf16Reduce(i);
        int i2 = iGf16Reduce | (iGf16Reduce >>> 4);
        return (byte) (((i2 >>> 2) & 10) | (i2 & 5));
    }

    public static void gf16mMul(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        while (i2 < i) {
            int i6 = 0;
            while (i6 < i) {
                bArr3[i5] = GF16.innerProduct(bArr, i3, bArr2, i6, i);
                i6++;
                i5++;
            }
            i2++;
            i3 += i;
        }
    }

    public static void gf16mMulMul(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i) {
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        while (i2 < i) {
            for (int i6 = 0; i6 < i; i6++) {
                bArr4[i6] = GF16.innerProduct(bArr, i3, bArr2, i6, i);
            }
            int i21 = 0;
            while (i21 < i) {
                bArr5[i5] = GF16.innerProduct(bArr4, 0, bArr3, i21, i);
                i21++;
                i5++;
            }
            i2++;
            i3 += i;
        }
    }

    public static void gf16mMulMulTo(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i) {
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        while (i2 < i) {
            for (int i6 = 0; i6 < i; i6++) {
                bArr4[i6] = GF16.innerProduct(bArr, i3, bArr2, i6, i);
            }
            int i21 = 0;
            while (i21 < i) {
                bArr5[i5] = (byte) (bArr5[i5] ^ GF16.innerProduct(bArr4, 0, bArr3, i21, i));
                i21++;
                i5++;
            }
            i2++;
            i3 += i;
        }
    }

    public static void gf16mMulTo(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2, int i3) {
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            int i21 = 0;
            while (i21 < i3) {
                bArr3[i2] = (byte) (bArr3[i2] ^ GF16.innerProduct(bArr, i6, bArr2, i + i21, i3));
                i21++;
                i2++;
            }
            i5++;
            i6 += i3;
        }
    }

    public static void gf16mMulToTo(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i) {
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        while (i2 < i) {
            int i6 = 0;
            while (i6 < i) {
                bArr4[i5] = (byte) (bArr4[i5] ^ GF16.innerProduct(bArr, i3, bArr2, i6, i));
                bArr5[i5] = (byte) (bArr5[i5] ^ GF16.innerProduct(bArr2, i3, bArr3, i6, i));
                i6++;
                i5++;
            }
            i2++;
            i3 += i;
        }
    }

    public static void gf16mTranMulMul(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, int i2) {
        int i3 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 < i2) {
            for (int i21 = 0; i21 < i2; i21++) {
                int i22 = i + i21;
                int i32 = 0;
                byte bMul = 0;
                int i33 = i3;
                while (i32 < i2) {
                    bMul = (byte) (bMul ^ GF16.mul(bArr[i22], bArr4[i33]));
                    i32++;
                    i22 += i2;
                    i33 += i2;
                }
                bArr6[i21] = bMul;
            }
            int i43 = 0;
            int i59 = 0;
            while (i43 < i2) {
                byte bMul2 = 0;
                for (int i66 = 0; i66 < i2; i66++) {
                    bMul2 = (byte) (bMul2 ^ GF16.mul(bArr2[i59 + i66], bArr6[i66]));
                }
                bArr7[i3 + i59] = bMul2;
                i43++;
                i59 += i2;
            }
            for (int i74 = 0; i74 < i2; i74++) {
                bArr6[i74] = GF16.innerProduct(bArr5, i5, bArr, i + i74, i2);
            }
            int i92 = 0;
            while (i92 < i2) {
                bArr8[i6] = GF16.innerProduct(bArr6, 0, bArr3, i92, i2);
                i92++;
                i6++;
            }
            i3++;
            i5 += i2;
        }
    }

    public static void gf16mMulTo(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        while (i2 < i) {
            int i6 = 0;
            while (i6 < i) {
                bArr3[i5] = (byte) (bArr3[i5] ^ GF16.innerProduct(bArr, i3, bArr2, i6, i));
                i6++;
                i5++;
            }
            i2++;
            i3 += i;
        }
    }

    public static void gf16mMulTo(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2) {
        int i3 = 0;
        int i5 = 0;
        while (i3 < i2) {
            int i6 = 0;
            while (i6 < i2) {
                bArr3[i] = (byte) (bArr3[i] ^ GF16.innerProduct(bArr, i5, bArr2, i6, i2));
                i6++;
                i++;
            }
            i3++;
            i5 += i2;
        }
    }

    public static void gf16mMulTo(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i, int i2) {
        int i3 = 0;
        int i5 = 0;
        while (i3 < i2) {
            int i6 = 0;
            while (i6 < i2) {
                bArr5[i] = (byte) (bArr5[i] ^ (GF16.innerProduct(bArr, i5, bArr2, i6, i2) ^ GF16.innerProduct(bArr3, i5, bArr4, i6, i2)));
                i6++;
                i++;
            }
            i3++;
            i5 += i2;
        }
    }
}
