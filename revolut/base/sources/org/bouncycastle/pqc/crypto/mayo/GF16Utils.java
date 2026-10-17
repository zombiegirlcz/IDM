package org.bouncycastle.pqc.crypto.mayo;

import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.util.GF16;

/* JADX INFO: loaded from: classes14.dex */
class GF16Utils {
    static final long MASK_LSB = 1229782938247303441L;
    static final long MASK_MSB = -8608480567731124088L;
    static final long NIBBLE_MASK_LSB = -1229782938247303442L;
    static final long NIBBLE_MASK_MSB = 8608480567731124087L;

    public static void mVecMulAdd(int i, long[] jArr, int i2, int i3, long[] jArr2, int i5) {
        long j2 = i3;
        long j3 = BodyPartID.bodyIdMax & j2;
        long j5 = j2 & 1;
        char c2 = 1;
        long j16 = (j3 >>> 1) & 1;
        long j22 = (j3 >>> 2) & 1;
        char c3 = 3;
        long j42 = (j3 >>> 3) & 1;
        int i6 = i5;
        int i21 = 0;
        int i22 = i2;
        while (i21 < i) {
            long j46 = jArr[i22];
            char c5 = c3;
            long j47 = (-j5) & j46;
            long j57 = (j46 & MASK_MSB) >>> c5;
            long j58 = ((j46 & NIBBLE_MASK_MSB) << c2) ^ (j57 + (j57 << c2));
            long j65 = j5;
            long j69 = ((-j16) & j58) ^ j47;
            long j76 = (j58 & MASK_MSB) >>> c5;
            long j85 = (j76 + (j76 << c2)) ^ ((j58 & NIBBLE_MASK_MSB) << c2);
            char c6 = c2;
            long j100 = (j85 & MASK_MSB) >>> c5;
            jArr2[i6] = ((j69 ^ ((-j22) & j85)) ^ ((-j42) & ((j100 + (j100 << c6)) ^ ((j85 & NIBBLE_MASK_MSB) << c6)))) ^ jArr2[i6];
            i21++;
            c3 = c5;
            i6++;
            i22++;
            c2 = c6;
            j5 = j65;
            j16 = j16;
        }
    }

    public static void matMul(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2, int i3) {
        int i5 = 0;
        int i6 = 0;
        int i21 = 0;
        while (i5 < i3) {
            int i22 = 0;
            byte bMul = 0;
            while (i22 < i2) {
                bMul = (byte) (GF16.mul(bArr[i6], bArr2[i + i22]) ^ bMul);
                i22++;
                i6++;
            }
            bArr3[i21] = bMul;
            i5++;
            i21++;
        }
    }

    public static void mulAddMUpperTriangularMatXMat(int i, long[] jArr, byte[] bArr, long[] jArr2, int i2, int i3, int i5) {
        int i6 = i5 * i;
        int i21 = 0;
        int i22 = 0;
        int i32 = 0;
        int i33 = 0;
        while (i21 < i3) {
            int i43 = i22;
            int i59 = i33;
            int i66 = i21;
            while (i66 < i3) {
                int i74 = 0;
                int i92 = 0;
                while (i74 < i5) {
                    mVecMulAdd(i, jArr, i59, bArr[i43 + i74], jArr2, i2 + i32 + i92);
                    i74++;
                    i92 += i;
                }
                i59 += i;
                i66++;
                i43 += i5;
            }
            i21++;
            i22 += i5;
            i32 += i6;
            i33 = i59;
        }
    }

    public static void mulAddMUpperTriangularMatXMatTrans(int i, long[] jArr, byte[] bArr, long[] jArr2, int i2, int i3) {
        int i5 = i * i3;
        int i6 = 0;
        int i21 = 0;
        int i22 = 0;
        while (i6 < i2) {
            int i32 = i22;
            for (int i33 = i6; i33 < i2; i33++) {
                int i43 = 0;
                int i59 = 0;
                int i66 = 0;
                while (i43 < i3) {
                    mVecMulAdd(i, jArr, i32, bArr[i59 + i33], jArr2, i21 + i66);
                    i43++;
                    i59 += i2;
                    i66 += i;
                }
                i32 += i;
            }
            i6++;
            i21 += i5;
            i22 = i32;
        }
    }

    public static void mulAddMatTransXMMat(int i, byte[] bArr, long[] jArr, int i2, long[] jArr2, int i3, int i5) {
        int i6 = i5 * i;
        int i21 = 0;
        int i22 = 0;
        while (i21 < i5) {
            int i32 = 0;
            int i33 = 0;
            int i43 = 0;
            while (i32 < i3) {
                byte b4 = bArr[i33 + i21];
                int i59 = 0;
                int i66 = 0;
                while (i59 < i5) {
                    mVecMulAdd(i, jArr, i2 + i43 + i66, b4, jArr2, i22 + i66);
                    i59++;
                    i66 += i;
                }
                i32++;
                i33 += i5;
                i43 += i6;
            }
            i21++;
            i22 += i6;
        }
    }

    public static void mulAddMatXMMat(int i, byte[] bArr, long[] jArr, int i2, long[] jArr2, int i3, int i5, int i6) {
        int i21 = i * i6;
        int i22 = 0;
        int i32 = 0;
        int i33 = 0;
        while (i22 < i3) {
            int i43 = 0;
            int i59 = 0;
            while (i43 < i5) {
                byte b4 = bArr[i33 + i43];
                int i66 = 0;
                int i74 = 0;
                while (i66 < i6) {
                    mVecMulAdd(i, jArr, i59 + i74 + i2, b4, jArr2, i32 + i74);
                    i66++;
                    i74 += i;
                }
                i43++;
                i59 += i21;
            }
            i22++;
            i32 += i21;
            i33 += i5;
        }
    }

    public static long mulFx8(byte b4, long j2) {
        int i = b4 & UnsignedBytes.MAX_VALUE;
        long j3 = ((j2 << 3) & ((long) (-((i >> 3) & 1)))) ^ (((((long) (-(b4 & 1))) & j2) ^ (((long) (-((i >> 1) & 1))) & (j2 << 1))) ^ (((long) (-((i >> 2) & 1))) & (j2 << 2)));
        long j5 = (-1085102592571150096L) & j3;
        return ((j3 ^ (j5 >>> 4)) ^ (j5 >>> 3)) & 1085102592571150095L;
    }

    public static void mulAddMatXMMat(int i, byte[] bArr, long[] jArr, long[] jArr2, int i2, int i3) {
        int i5 = i * i2;
        int i6 = 0;
        int i21 = 0;
        int i22 = 0;
        while (i6 < i2) {
            int i32 = 0;
            int i33 = 0;
            while (i32 < i3) {
                byte b4 = bArr[i21 + i32];
                int i43 = 0;
                int i59 = 0;
                while (i43 < i2) {
                    mVecMulAdd(i, jArr, i33 + i59, b4, jArr2, i22 + i59);
                    i43++;
                    i59 += i;
                }
                i32++;
                i33 += i5;
            }
            i6++;
            i21 += i3;
            i22 += i5;
        }
    }
}
