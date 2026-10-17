package org.bouncycastle.crypto.modes.gcm;

import com.google.common.primitives.Longs;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public abstract class GCMUtil {
    private static final int E1 = -520093696;
    private static final long E1L = -2233785415175766016L;
    public static final int SIZE_BYTES = 16;
    public static final int SIZE_INTS = 4;
    public static final int SIZE_LONGS = 2;

    public static byte areEqual(byte[] bArr, byte[] bArr2) {
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return (byte) Nat.czero(i);
    }

    public static void asBytes(int[] iArr, byte[] bArr) {
        Pack.intToBigEndian(iArr, 0, 4, bArr, 0);
    }

    public static void asInts(byte[] bArr, int[] iArr) {
        Pack.bigEndianToInt(bArr, 0, iArr, 0, 4);
    }

    public static void asLongs(byte[] bArr, long[] jArr) {
        Pack.bigEndianToLong(bArr, 0, jArr, 0, 2);
    }

    public static void copy(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < 16; i++) {
            bArr2[i] = bArr[i];
        }
    }

    public static void divideP(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j5 = j2 >> 63;
        jArr2[0] = ((j2 ^ (E1L & j5)) << 1) | (j3 >>> 63);
        jArr2[1] = (j3 << 1) | (-j5);
    }

    private static long implMul64(long j2, long j3) {
        long j5 = j2 & 1229782938247303441L;
        long j16 = j2 & 2459565876494606882L;
        long j22 = j2 & 4919131752989213764L;
        long j42 = j2 & (-8608480567731124088L);
        long j46 = j3 & 1229782938247303441L;
        long j47 = j3 & 2459565876494606882L;
        long j57 = j3 & 4919131752989213764L;
        long j58 = j3 & (-8608480567731124088L);
        long j65 = (((j5 * j46) ^ (j16 * j58)) ^ (j22 * j57)) ^ (j42 * j47);
        long j69 = (((j5 * j47) ^ (j16 * j46)) ^ (j22 * j58)) ^ (j42 * j57);
        long j76 = (((j5 * j57) ^ (j16 * j47)) ^ (j22 * j46)) ^ (j42 * j58);
        return (j65 & 1229782938247303441L) | (j69 & 2459565876494606882L) | (j76 & 4919131752989213764L) | (((((j5 * j58) ^ (j16 * j57)) ^ (j22 * j47)) ^ (j42 * j46)) & (-8608480567731124088L));
    }

    public static void multiply(byte[] bArr, byte[] bArr2) {
        long[] jArrAsLongs = asLongs(bArr);
        multiply(jArrAsLongs, asLongs(bArr2));
        asBytes(jArrAsLongs, bArr);
    }

    public static void multiplyP(int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i5 = iArr[3];
        iArr[0] = (((i5 << 31) >> 31) & E1) ^ (i >>> 1);
        iArr[1] = (i2 >>> 1) | (i << 31);
        iArr[2] = (i3 >>> 1) | (i2 << 31);
        iArr[3] = (i5 >>> 1) | (i3 << 31);
    }

    public static void multiplyP16(long[] jArr) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j5 = j3 << 48;
        jArr[0] = (j5 >>> 7) ^ ((((j2 >>> 16) ^ j5) ^ (j5 >>> 1)) ^ (j5 >>> 2));
        jArr[1] = (j2 << 48) | (j3 >>> 16);
    }

    public static void multiplyP3(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j5 = j3 << 61;
        jArr2[0] = (j5 >>> 7) ^ ((((j2 >>> 3) ^ j5) ^ (j5 >>> 1)) ^ (j5 >>> 2));
        jArr2[1] = (j2 << 61) | (j3 >>> 3);
    }

    public static void multiplyP4(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j5 = j3 << 60;
        jArr2[0] = (j5 >>> 7) ^ ((((j2 >>> 4) ^ j5) ^ (j5 >>> 1)) ^ (j5 >>> 2));
        jArr2[1] = (j2 << 60) | (j3 >>> 4);
    }

    public static void multiplyP7(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j5 = j3 << 57;
        jArr2[0] = (j5 >>> 7) ^ ((((j2 >>> 7) ^ j5) ^ (j5 >>> 1)) ^ (j5 >>> 2));
        jArr2[1] = (j2 << 57) | (j3 >>> 7);
    }

    public static void multiplyP8(int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i5 = iArr[3];
        int i6 = i5 << 24;
        iArr[0] = (i6 >>> 7) ^ ((((i >>> 8) ^ i6) ^ (i6 >>> 1)) ^ (i6 >>> 2));
        iArr[1] = (i2 >>> 8) | (i << 24);
        iArr[2] = (i3 >>> 8) | (i2 << 24);
        iArr[3] = (i5 >>> 8) | (i3 << 24);
    }

    public static byte[] oneAsBytes() {
        byte[] bArr = new byte[16];
        bArr[0] = -128;
        return bArr;
    }

    public static int[] oneAsInts() {
        int[] iArr = new int[4];
        iArr[0] = Integer.MIN_VALUE;
        return iArr;
    }

    public static long[] oneAsLongs() {
        return new long[]{Long.MIN_VALUE, 0};
    }

    public static long[] pAsLongs() {
        return new long[]{Longs.MAX_POWER_OF_TWO, 0};
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        Interleave.expand64To128Rev(jArr[0], jArr3, 0);
        Interleave.expand64To128Rev(jArr[1], jArr3, 2);
        long j2 = jArr3[0];
        long j3 = jArr3[1];
        long j5 = jArr3[2];
        long j16 = jArr3[3];
        long j22 = j5 ^ ((j16 << 57) ^ ((j16 << 63) ^ (j16 << 62)));
        jArr2[0] = j2 ^ ((((j22 >>> 1) ^ j22) ^ (j22 >>> 2)) ^ (j22 >>> 7));
        jArr2[1] = (j3 ^ ((((j16 >>> 1) ^ j16) ^ (j16 >>> 2)) ^ (j16 >>> 7))) ^ ((j22 << 57) ^ ((j22 << 63) ^ (j22 << 62)));
    }

    public static void xor(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        while (true) {
            i3--;
            if (i3 < 0) {
                return;
            }
            int i5 = i + i3;
            bArr[i5] = (byte) (bArr[i5] ^ bArr2[i2 + i3]);
        }
    }

    public static int areEqual(int[] iArr, int[] iArr2) {
        return Nat.czero((iArr[3] ^ iArr2[3]) | (iArr2[0] ^ iArr[0]) | (iArr2[1] ^ iArr[1]) | (iArr2[2] ^ iArr[2]));
    }

    public static void asBytes(long[] jArr, byte[] bArr) {
        Pack.longToBigEndian(jArr, 0, 2, bArr, 0);
    }

    public static int[] asInts(byte[] bArr) {
        int[] iArr = new int[4];
        Pack.bigEndianToInt(bArr, 0, iArr, 0, 4);
        return iArr;
    }

    public static long[] asLongs(byte[] bArr) {
        long[] jArr = new long[2];
        Pack.bigEndianToLong(bArr, 0, jArr, 0, 2);
        return jArr;
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
    }

    public static void multiply(byte[] bArr, long[] jArr) {
        long jBigEndianToLong = Pack.bigEndianToLong(bArr, 0);
        long jBigEndianToLong2 = Pack.bigEndianToLong(bArr, 8);
        long j2 = jArr[0];
        long j3 = jArr[1];
        long jReverse = org.bouncycastle.util.Longs.reverse(jBigEndianToLong);
        long jReverse2 = org.bouncycastle.util.Longs.reverse(jBigEndianToLong2);
        long jReverse3 = org.bouncycastle.util.Longs.reverse(j2);
        long jReverse4 = org.bouncycastle.util.Longs.reverse(j3);
        long jReverse5 = org.bouncycastle.util.Longs.reverse(implMul64(jReverse, jReverse3));
        long jImplMul64 = implMul64(jBigEndianToLong, j2) << 1;
        long jReverse6 = org.bouncycastle.util.Longs.reverse(implMul64(jReverse2, jReverse4));
        long jImplMul642 = implMul64(jBigEndianToLong2, j3);
        long j5 = jImplMul642 << 1;
        long jReverse7 = org.bouncycastle.util.Longs.reverse(implMul64(jReverse ^ jReverse2, jReverse3 ^ jReverse4));
        long jImplMul643 = ((implMul64(jBigEndianToLong ^ jBigEndianToLong2, j2 ^ j3) << 1) ^ ((jReverse6 ^ jImplMul64) ^ j5)) ^ ((jImplMul642 << 63) ^ (jImplMul642 << 58));
        Pack.longToBigEndian(jReverse5 ^ (((jImplMul643 >>> 2) ^ ((jImplMul643 >>> 1) ^ jImplMul643)) ^ (jImplMul643 >>> 7)), bArr, 0);
        Pack.longToBigEndian(((jImplMul643 << 57) ^ ((jImplMul643 << 63) ^ (jImplMul643 << 62))) ^ ((jReverse7 ^ ((jImplMul64 ^ jReverse5) ^ jReverse6)) ^ (((j5 ^ (j5 >>> 1)) ^ (j5 >>> 2)) ^ (j5 >>> 7))), bArr, 8);
    }

    public static void multiplyP(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i5 = iArr[3];
        iArr2[0] = (((i5 << 31) >> 31) & E1) ^ (i >>> 1);
        iArr2[1] = (i2 >>> 1) | (i << 31);
        iArr2[2] = (i3 >>> 1) | (i2 << 31);
        iArr2[3] = (i5 >>> 1) | (i3 << 31);
    }

    public static void multiplyP8(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i5 = iArr[3];
        int i6 = i5 << 24;
        iArr2[0] = (i6 >>> 7) ^ ((((i >>> 8) ^ i6) ^ (i6 >>> 1)) ^ (i6 >>> 2));
        iArr2[1] = (i2 >>> 8) | (i << 24);
        iArr2[2] = (i3 >>> 8) | (i2 << 24);
        iArr2[3] = (i5 >>> 8) | (i3 << 24);
    }

    public static void xor(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        int i5 = 0;
        do {
            bArr3[i3 + i5] = (byte) (bArr[i + i5] ^ bArr2[i2 + i5]);
            int i6 = i5 + 1;
            bArr3[i3 + i6] = (byte) (bArr2[i6 + i2] ^ bArr[i + i6]);
            int i21 = i5 + 2;
            bArr3[i3 + i21] = (byte) (bArr2[i21 + i2] ^ bArr[i + i21]);
            int i22 = i5 + 3;
            bArr3[i3 + i22] = (byte) (bArr2[i22 + i2] ^ bArr[i + i22]);
            i5 += 4;
        } while (i5 < 16);
    }

    public static long areEqual(long[] jArr, long[] jArr2) {
        return Nat.czero64((jArr2[1] ^ jArr[1]) | (jArr[0] ^ jArr2[0]));
    }

    public static byte[] asBytes(int[] iArr) {
        byte[] bArr = new byte[16];
        Pack.intToBigEndian(iArr, 0, 4, bArr, 0);
        return bArr;
    }

    public static void copy(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static void multiply(int[] iArr, int[] iArr2) {
        int i = iArr2[0];
        int i2 = iArr2[1];
        int i3 = iArr2[2];
        int i5 = iArr2[3];
        int i6 = 0;
        int i21 = 0;
        int i22 = 0;
        int i32 = 0;
        for (int i33 = 0; i33 < 4; i33++) {
            int i43 = iArr[i33];
            for (int i59 = 0; i59 < 32; i59++) {
                int i66 = i43 >> 31;
                i43 <<= 1;
                i6 ^= i & i66;
                i21 ^= i2 & i66;
                i22 ^= i3 & i66;
                i32 ^= i66 & i5;
                int i74 = (i5 << 31) >> 8;
                i5 = (i5 >>> 1) | (i3 << 31);
                i3 = (i3 >>> 1) | (i2 << 31);
                i2 = (i2 >>> 1) | (i << 31);
                i = (i >>> 1) ^ (i74 & E1);
            }
        }
        iArr[0] = i6;
        iArr[1] = i21;
        iArr[2] = i22;
        iArr[3] = i32;
    }

    public static void multiplyP(long[] jArr) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        jArr[0] = (((j3 << 63) >> 63) & E1L) ^ (j2 >>> 1);
        jArr[1] = (j2 << 63) | (j3 >>> 1);
    }

    public static void multiplyP8(long[] jArr) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j5 = j3 << 56;
        jArr[0] = (j5 >>> 7) ^ ((((j2 >>> 8) ^ j5) ^ (j5 >>> 1)) ^ (j5 >>> 2));
        jArr[1] = (j2 << 56) | (j3 >>> 8);
    }

    public static void xor(byte[] bArr, byte[] bArr2) {
        int i = 0;
        do {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            int i2 = i + 1;
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
            int i3 = i + 2;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
            int i5 = i + 3;
            bArr[i5] = (byte) (bArr[i5] ^ bArr2[i5]);
            i += 4;
        } while (i < 16);
    }

    public static byte[] asBytes(long[] jArr) {
        byte[] bArr = new byte[16];
        Pack.longToBigEndian(jArr, 0, 2, bArr, 0);
        return bArr;
    }

    public static void multiply(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j5 = jArr2[0];
        long j16 = jArr2[1];
        long jReverse = org.bouncycastle.util.Longs.reverse(j2);
        long jReverse2 = org.bouncycastle.util.Longs.reverse(j3);
        long jReverse3 = org.bouncycastle.util.Longs.reverse(j5);
        long jReverse4 = org.bouncycastle.util.Longs.reverse(j16);
        long jReverse5 = org.bouncycastle.util.Longs.reverse(implMul64(jReverse, jReverse3));
        long jImplMul64 = implMul64(j2, j5) << 1;
        long jReverse6 = org.bouncycastle.util.Longs.reverse(implMul64(jReverse2, jReverse4));
        long jImplMul642 = implMul64(j3, j16);
        long j22 = jImplMul642 << 1;
        long jReverse7 = org.bouncycastle.util.Longs.reverse(implMul64(jReverse ^ jReverse2, jReverse3 ^ jReverse4));
        long jImplMul643 = ((implMul64(j2 ^ j3, j5 ^ j16) << 1) ^ ((jReverse6 ^ jImplMul64) ^ j22)) ^ ((jImplMul642 << 63) ^ (jImplMul642 << 58));
        jArr[0] = jReverse5 ^ ((jImplMul643 >>> 7) ^ (((jImplMul643 >>> 1) ^ jImplMul643) ^ (jImplMul643 >>> 2)));
        jArr[1] = ((jImplMul643 << 57) ^ ((jImplMul643 << 63) ^ (jImplMul643 << 62))) ^ ((jReverse7 ^ ((jImplMul64 ^ jReverse5) ^ jReverse6)) ^ (((j22 ^ (j22 >>> 1)) ^ (j22 >>> 2)) ^ (j22 >>> 7)));
    }

    public static void multiplyP(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        jArr2[0] = (((j3 << 63) >> 63) & E1L) ^ (j2 >>> 1);
        jArr2[1] = (j2 << 63) | (j3 >>> 1);
    }

    public static void multiplyP8(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j5 = j3 << 56;
        jArr2[0] = (j5 >>> 7) ^ ((((j2 >>> 8) ^ j5) ^ (j5 >>> 1)) ^ (j5 >>> 2));
        jArr2[1] = (j2 << 56) | (j3 >>> 8);
    }

    public static void xor(byte[] bArr, byte[] bArr2, int i) {
        int i2 = 0;
        do {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
            int i3 = i2 + 1;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i + i3]);
            int i5 = i2 + 2;
            bArr[i5] = (byte) (bArr[i5] ^ bArr2[i + i5]);
            int i6 = i2 + 3;
            bArr[i6] = (byte) (bArr[i6] ^ bArr2[i + i6]);
            i2 += 4;
        } while (i2 < 16);
    }

    public static void xor(byte[] bArr, byte[] bArr2, int i, int i2) {
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            } else {
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
            }
        }
    }

    public static void xor(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i = 0;
        do {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
            int i2 = i + 1;
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
            int i3 = i + 2;
            bArr3[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
            int i5 = i + 3;
            bArr3[i5] = (byte) (bArr[i5] ^ bArr2[i5]);
            i += 4;
        } while (i < 16);
    }

    public static void xor(int[] iArr, int[] iArr2) {
        iArr[0] = iArr[0] ^ iArr2[0];
        iArr[1] = iArr[1] ^ iArr2[1];
        iArr[2] = iArr[2] ^ iArr2[2];
        iArr[3] = iArr2[3] ^ iArr[3];
    }

    public static void xor(int[] iArr, int[] iArr2, int[] iArr3) {
        iArr3[0] = iArr[0] ^ iArr2[0];
        iArr3[1] = iArr[1] ^ iArr2[1];
        iArr3[2] = iArr[2] ^ iArr2[2];
        iArr3[3] = iArr[3] ^ iArr2[3];
    }

    public static void xor(long[] jArr, long[] jArr2) {
        jArr[0] = jArr[0] ^ jArr2[0];
        jArr[1] = jArr[1] ^ jArr2[1];
    }

    public static void xor(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }
}
