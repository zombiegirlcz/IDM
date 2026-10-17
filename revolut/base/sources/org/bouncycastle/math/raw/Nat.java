package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public abstract class Nat {
    private static final long M = 4294967295L;

    public static int add(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j3 = (((long) iArr[i2]) & 4294967295L) + (4294967295L & ((long) iArr2[i2])) + j2;
            iArr3[i2] = (int) j3;
            j2 = j3 >>> 32;
        }
        return (int) j2;
    }

    public static int add33At(int i, int i2, int[] iArr, int i3) {
        long j2 = (((long) iArr[i3]) & 4294967295L) + (((long) i2) & 4294967295L);
        iArr[i3] = (int) j2;
        int i5 = i3 + 1;
        long j3 = (4294967295L & ((long) iArr[i5])) + 1 + (j2 >>> 32);
        iArr[i5] = (int) j3;
        if ((j3 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, i3 + 2);
    }

    public static int add33To(int i, int i2, int[] iArr) {
        long j2 = (((long) iArr[0]) & 4294967295L) + (((long) i2) & 4294967295L);
        iArr[0] = (int) j2;
        long j3 = (4294967295L & ((long) iArr[1])) + 1 + (j2 >>> 32);
        iArr[1] = (int) j3;
        if ((j3 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, 2);
    }

    public static int addBothTo(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i5) {
        long j2 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            int i21 = i5 + i6;
            long j3 = (((long) iArr[i2 + i6]) & 4294967295L) + (((long) iArr2[i3 + i6]) & 4294967295L) + (4294967295L & ((long) iArr3[i21])) + j2;
            iArr3[i21] = (int) j3;
            j2 = j3 >>> 32;
        }
        return (int) j2;
    }

    public static int addDWordAt(int i, long j2, int[] iArr, int i2) {
        long j3 = (((long) iArr[i2]) & 4294967295L) + (j2 & 4294967295L);
        iArr[i2] = (int) j3;
        int i3 = i2 + 1;
        long j5 = (4294967295L & ((long) iArr[i3])) + (j2 >>> 32) + (j3 >>> 32);
        iArr[i3] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, i2 + 2);
    }

    public static int addDWordTo(int i, long j2, int[] iArr) {
        long j3 = (((long) iArr[0]) & 4294967295L) + (j2 & 4294967295L);
        iArr[0] = (int) j3;
        long j5 = (4294967295L & ((long) iArr[1])) + (j2 >>> 32) + (j3 >>> 32);
        iArr[1] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, 2);
    }

    public static int addTo(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j2 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = i3 + i5;
            long j3 = (((long) iArr[i2 + i5]) & 4294967295L) + (4294967295L & ((long) iArr2[i6])) + j2;
            iArr2[i6] = (int) j3;
            j2 = j3 >>> 32;
        }
        return (int) j2;
    }

    public static int addToEachOther(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j2 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = i2 + i5;
            int i21 = i3 + i5;
            long j3 = (((long) iArr[i6]) & 4294967295L) + (4294967295L & ((long) iArr2[i21])) + j2;
            int i22 = (int) j3;
            iArr[i6] = i22;
            iArr2[i21] = i22;
            j2 = j3 >>> 32;
        }
        return (int) j2;
    }

    public static int addWordAt(int i, int i2, int[] iArr, int i3) {
        long j2 = (((long) i2) & 4294967295L) + (4294967295L & ((long) iArr[i3]));
        iArr[i3] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, i3 + 1);
    }

    public static int addWordTo(int i, int i2, int[] iArr) {
        long j2 = (((long) i2) & 4294967295L) + (4294967295L & ((long) iArr[0]));
        iArr[0] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, 1);
    }

    public static int cadd(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((long) (-(i2 & 1))) & 4294967295L;
        long j3 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long j5 = (((long) iArr[i3]) & 4294967295L) + (((long) iArr2[i3]) & j2) + j3;
            iArr3[i3] = (int) j5;
            j3 = j5 >>> 32;
        }
        return (int) j3;
    }

    public static int caddTo(int i, int i2, int[] iArr, int[] iArr2) {
        long j2 = ((long) (-(i2 & 1))) & 4294967295L;
        long j3 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long j5 = (((long) iArr2[i3]) & 4294967295L) + (((long) iArr[i3]) & j2) + j3;
            iArr2[i3] = (int) j5;
            j3 = j5 >>> 32;
        }
        return (int) j3;
    }

    public static void cmov(int i, int i2, int[] iArr, int i3, int[] iArr2, int i5) {
        int i6 = -(i2 & 1);
        for (int i21 = 0; i21 < i; i21++) {
            int i22 = i5 + i21;
            int i32 = iArr2[i22];
            iArr2[i22] = i32 ^ ((iArr[i3 + i21] ^ i32) & i6);
        }
    }

    public static int compare(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        for (int i5 = i - 1; i5 >= 0; i5--) {
            int i6 = iArr[i2 + i5] - Integer.MIN_VALUE;
            int i21 = iArr2[i3 + i5] - Integer.MIN_VALUE;
            if (i6 < i21) {
                return -1;
            }
            if (i6 > i21) {
                return 1;
            }
        }
        return 0;
    }

    public static void copy(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        System.arraycopy(iArr, i2, iArr2, i3, i);
    }

    public static void copy64(int i, long[] jArr, int i2, long[] jArr2, int i3) {
        System.arraycopy(jArr, i2, jArr2, i3, i);
    }

    public static int[] create(int i) {
        return new int[i];
    }

    public static long[] create64(int i) {
        return new long[i];
    }

    public static int csub(int i, int i2, int[] iArr, int i3, int[] iArr2, int i5, int[] iArr3, int i6) {
        long j2 = ((long) (-(i2 & 1))) & 4294967295L;
        long j3 = 0;
        for (int i21 = 0; i21 < i; i21++) {
            long j5 = ((((long) iArr[i3 + i21]) & 4294967295L) - (((long) iArr2[i5 + i21]) & j2)) + j3;
            iArr3[i6 + i21] = (int) j5;
            j3 = j5 >> 32;
        }
        return (int) j3;
    }

    public static int czero(int i) {
        return ((~i) & (i - 1)) >> 31;
    }

    public static long czero64(long j2) {
        return ((~j2) & (j2 - 1)) >> 63;
    }

    public static int dec(int i, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2] - 1;
            iArr[i2] = i3;
            if (i3 != -1) {
                return 0;
            }
        }
        return -1;
    }

    public static int decAt(int i, int[] iArr, int i2) {
        while (i2 < i) {
            int i3 = iArr[i2] - 1;
            iArr[i2] = i3;
            if (i3 != -1) {
                return 0;
            }
            i2++;
        }
        return -1;
    }

    public static boolean diff(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i5) {
        boolean zGte = gte(i, iArr, i2, iArr2, i3);
        if (zGte) {
            sub(i, iArr, i2, iArr2, i3, iArr3, i5);
            return zGte;
        }
        sub(i, iArr2, i3, iArr, i2, iArr3, i5);
        return zGte;
    }

    public static boolean eq(int i, int[] iArr, int[] iArr2) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static int equalTo(int i, int[] iArr, int i2) {
        int i3 = i2 ^ iArr[0];
        for (int i5 = 1; i5 < i; i5++) {
            i3 |= iArr[i5];
        }
        return czero(i3);
    }

    public static long equalTo64(int i, long[] jArr, int i2, long j2) {
        long j3 = j2 ^ jArr[i2];
        for (int i3 = 1; i3 < i; i3++) {
            j3 |= jArr[i2 + i3];
        }
        return czero64(j3);
    }

    public static int equalToZero(int i, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 |= iArr[i3];
        }
        return czero(i2);
    }

    public static long equalToZero64(int i, long[] jArr) {
        long j2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j2 |= jArr[i2];
        }
        return czero64(j2);
    }

    public static int[] fromBigInteger(int i, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
            throw new IllegalArgumentException();
        }
        int i2 = (i + 31) >> 5;
        int[] iArrCreate = create(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            iArrCreate[i3] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArrCreate;
    }

    public static long[] fromBigInteger64(int i, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
            throw new IllegalArgumentException();
        }
        int i2 = (i + 63) >> 6;
        long[] jArrCreate64 = create64(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            jArrCreate64[i3] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return jArrCreate64;
    }

    public static int getBit(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= iArr.length) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static int getBitLength(int i, int[] iArr) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                return Integers.bitLength(i3) + (i2 * 32);
            }
        }
        return 0;
    }

    public static boolean gte(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        for (int i5 = i - 1; i5 >= 0; i5--) {
            int i6 = iArr[i2 + i5] - Integer.MIN_VALUE;
            int i21 = iArr2[i3 + i5] - Integer.MIN_VALUE;
            if (i6 < i21) {
                return false;
            }
            if (i6 > i21) {
                return true;
            }
        }
        return true;
    }

    public static int inc(int i, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2] + 1;
            iArr[i2] = i3;
            if (i3 != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int incAt(int i, int[] iArr, int i2) {
        while (i2 < i) {
            int i3 = iArr[i2] + 1;
            iArr[i2] = i3;
            if (i3 != 0) {
                return 0;
            }
            i2++;
        }
        return 1;
    }

    public static boolean isOne(int i, int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i2 = 1; i2 < i; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int i, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int lessThan(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j2 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            j2 = (((((long) iArr[i2 + i5]) & 4294967295L) - (4294967295L & ((long) iArr2[i3 + i5]))) + j2) >> 32;
        }
        return (int) j2;
    }

    public static void mul(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i5) {
        iArr3[i5 + i] = mulWord(i, iArr[i2], iArr2, i3, iArr3, i5);
        for (int i6 = 1; i6 < i; i6++) {
            int i21 = i5 + i6;
            iArr3[i21 + i] = mulWordAddTo(i, iArr[i2 + i6], iArr2, i3, iArr3, i21);
        }
    }

    public static int mul31BothAdd(int i, int i2, int[] iArr, int i3, int[] iArr2, int[] iArr3, int i5) {
        long j2 = ((long) i2) & 4294967295L;
        long j3 = ((long) i3) & 4294967295L;
        long j5 = 0;
        int i6 = 0;
        do {
            long j16 = ((((long) iArr2[i6]) & 4294967295L) * j3) + ((((long) iArr[i6]) & 4294967295L) * j2);
            int i21 = i5 + i6;
            long j22 = j16 + (((long) iArr3[i21]) & 4294967295L) + j5;
            iArr3[i21] = (int) j22;
            j5 = j22 >>> 32;
            i6++;
        } while (i6 < i);
        return (int) j5;
    }

    public static int mulAddTo(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i5) {
        long j2 = 0;
        int i6 = 0;
        int i21 = i5;
        while (i6 < i) {
            int i22 = i;
            int[] iArr4 = iArr2;
            int i32 = i3;
            int[] iArr5 = iArr3;
            int i33 = i21 + i22;
            long jMulWordAddTo = j2 + (((long) mulWordAddTo(i22, iArr[i2 + i6], iArr4, i32, iArr5, i21)) & 4294967295L) + (((long) iArr5[i33]) & 4294967295L);
            iArr5[i33] = (int) jMulWordAddTo;
            j2 = jMulWordAddTo >>> 32;
            i21++;
            i6++;
            i = i22;
            iArr2 = iArr4;
            i3 = i32;
            iArr3 = iArr5;
        }
        return (int) j2;
    }

    public static int mulWord(int i, int i2, int[] iArr, int i3, int[] iArr2, int i5) {
        long j2 = ((long) i2) & 4294967295L;
        long j3 = 0;
        int i6 = 0;
        do {
            long j5 = ((((long) iArr[i3 + i6]) & 4294967295L) * j2) + j3;
            iArr2[i5 + i6] = (int) j5;
            j3 = j5 >>> 32;
            i6++;
        } while (i6 < i);
        return (int) j3;
    }

    public static int mulWordAddTo(int i, int i2, int[] iArr, int i3, int[] iArr2, int i5) {
        long j2 = ((long) i2) & 4294967295L;
        long j3 = 0;
        int i6 = 0;
        do {
            int i21 = i5 + i6;
            long j5 = ((((long) iArr[i3 + i6]) & 4294967295L) * j2) + (((long) iArr2[i21]) & 4294967295L) + j3;
            iArr2[i21] = (int) j5;
            j3 = j5 >>> 32;
            i6++;
        } while (i6 < i);
        return (int) j3;
    }

    public static int mulWordDwordAddAt(int i, int i2, long j2, int[] iArr, int i3) {
        long j3 = ((long) i2) & 4294967295L;
        long j5 = ((j2 & 4294967295L) * j3) + (((long) iArr[i3]) & 4294967295L);
        iArr[i3] = (int) j5;
        long j16 = j3 * (j2 >>> 32);
        int i5 = i3 + 1;
        long j22 = j16 + (((long) iArr[i5]) & 4294967295L) + (j5 >>> 32);
        iArr[i5] = (int) j22;
        long j42 = j22 >>> 32;
        int i6 = i3 + 2;
        long j46 = j42 + (((long) iArr[i6]) & 4294967295L);
        iArr[i6] = (int) j46;
        if ((j46 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, i3 + 3);
    }

    public static int shiftDownBit(int i, int[] iArr, int i2) {
        while (true) {
            i--;
            if (i < 0) {
                return i2 << 31;
            }
            int i3 = iArr[i];
            iArr[i] = (i2 << 31) | (i3 >>> 1);
            i2 = i3;
        }
    }

    public static int shiftDownBits(int i, int[] iArr, int i2, int i3) {
        while (true) {
            i--;
            if (i < 0) {
                return i3 << (-i2);
            }
            int i5 = iArr[i];
            iArr[i] = (i3 << (-i2)) | (i5 >>> i2);
            i3 = i5;
        }
    }

    public static int shiftDownWord(int i, int[] iArr, int i2) {
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            int i3 = iArr[i];
            iArr[i] = i2;
            i2 = i3;
        }
    }

    public static int shiftUpBit(int i, int[] iArr, int i2) {
        int i3 = 0;
        while (i3 < i) {
            int i5 = iArr[i3];
            iArr[i3] = (i2 >>> 31) | (i5 << 1);
            i3++;
            i2 = i5;
        }
        return i2 >>> 31;
    }

    public static long shiftUpBit64(int i, long[] jArr, int i2, long j2, long[] jArr2, int i3) {
        int i5 = 0;
        while (i5 < i) {
            long j3 = jArr[i2 + i5];
            jArr2[i3 + i5] = (j2 >>> 63) | (j3 << 1);
            i5++;
            j2 = j3;
        }
        return j2 >>> 63;
    }

    public static int shiftUpBits(int i, int[] iArr, int i2, int i3) {
        int i5 = 0;
        while (i5 < i) {
            int i6 = iArr[i5];
            iArr[i5] = (i3 >>> (-i2)) | (i6 << i2);
            i5++;
            i3 = i6;
        }
        return i3 >>> (-i2);
    }

    public static long shiftUpBits64(int i, long[] jArr, int i2, int i3, long j2) {
        int i5 = 0;
        while (i5 < i) {
            int i6 = i2 + i5;
            long j3 = jArr[i6];
            jArr[i6] = (j2 >>> (-i3)) | (j3 << i3);
            i5++;
            j2 = j3;
        }
        return j2 >>> (-i3);
    }

    public static void square(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        int i5;
        int i6 = i << 1;
        int i21 = 0;
        int i22 = i;
        int i32 = i6;
        do {
            i22--;
            long j2 = ((long) iArr[i2 + i22]) & 4294967295L;
            long j3 = j2 * j2;
            iArr2[(i32 - 1) + i3] = (i21 << 31) | ((int) (j3 >>> 33));
            i32 -= 2;
            iArr2[i3 + i32] = (int) (j3 >>> 1);
            i21 = (int) j3;
        } while (i22 > 0);
        int i33 = i3 + 2;
        long j5 = 0;
        for (i5 = 1; i5 < i; i5++) {
            long jSquareWordAddTo = j5 + (((long) squareWordAddTo(iArr, i2, i5, iArr2, i3)) & 4294967295L) + (((long) iArr2[i33]) & 4294967295L);
            int i43 = i33 + 1;
            iArr2[i33] = (int) jSquareWordAddTo;
            long j16 = (jSquareWordAddTo >>> 32) + (((long) iArr2[i43]) & 4294967295L);
            i33 += 2;
            iArr2[i43] = (int) j16;
            j5 = j16 >>> 32;
        }
        shiftUpBit(i6, iArr2, i3, iArr[i2] << 31);
    }

    public static int squareWordAddTo(int[] iArr, int i, int i2, int[] iArr2, int i3) {
        long j2 = ((long) iArr[i + i2]) & 4294967295L;
        int i5 = 0;
        long j3 = 0;
        int i6 = i3;
        do {
            int i21 = i2 + i6;
            long j5 = ((((long) iArr[i + i5]) & 4294967295L) * j2) + (((long) iArr2[i21]) & 4294967295L) + j3;
            iArr2[i21] = (int) j5;
            j3 = j5 >>> 32;
            i6++;
            i5++;
        } while (i5 < i2);
        return (int) j3;
    }

    public static int sub(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i5) {
        long j2 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            long j3 = ((((long) iArr[i2 + i6]) & 4294967295L) - (4294967295L & ((long) iArr2[i3 + i6]))) + j2;
            iArr3[i5 + i6] = (int) j3;
            j2 = j3 >> 32;
        }
        return (int) j2;
    }

    public static int sub33At(int i, int i2, int[] iArr, int i3) {
        long j2 = (((long) iArr[i3]) & 4294967295L) - (((long) i2) & 4294967295L);
        iArr[i3] = (int) j2;
        int i5 = i3 + 1;
        long j3 = ((4294967295L & ((long) iArr[i5])) - 1) + (j2 >> 32);
        iArr[i5] = (int) j3;
        if ((j3 >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, i3 + 2);
    }

    public static int sub33From(int i, int i2, int[] iArr) {
        long j2 = (((long) iArr[0]) & 4294967295L) - (((long) i2) & 4294967295L);
        iArr[0] = (int) j2;
        long j3 = ((4294967295L & ((long) iArr[1])) - 1) + (j2 >> 32);
        iArr[1] = (int) j3;
        if ((j3 >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, 2);
    }

    public static int subBothFrom(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i5) {
        long j2 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            int i21 = i5 + i6;
            long j3 = (((((long) iArr3[i21]) & 4294967295L) - (((long) iArr[i2 + i6]) & 4294967295L)) - (4294967295L & ((long) iArr2[i3 + i6]))) + j2;
            iArr3[i21] = (int) j3;
            j2 = j3 >> 32;
        }
        return (int) j2;
    }

    public static int subDWordAt(int i, long j2, int[] iArr, int i2) {
        long j3 = (((long) iArr[i2]) & 4294967295L) - (j2 & 4294967295L);
        iArr[i2] = (int) j3;
        int i3 = i2 + 1;
        long j5 = ((4294967295L & ((long) iArr[i3])) - (j2 >>> 32)) + (j3 >> 32);
        iArr[i3] = (int) j5;
        if ((j5 >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, i2 + 2);
    }

    public static int subDWordFrom(int i, long j2, int[] iArr) {
        long j3 = (((long) iArr[0]) & 4294967295L) - (j2 & 4294967295L);
        iArr[0] = (int) j3;
        long j5 = ((4294967295L & ((long) iArr[1])) - (j2 >>> 32)) + (j3 >> 32);
        iArr[1] = (int) j5;
        if ((j5 >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, 2);
    }

    public static int subFrom(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j2 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = i3 + i5;
            long j3 = ((((long) iArr2[i6]) & 4294967295L) - (4294967295L & ((long) iArr[i2 + i5]))) + j2;
            iArr2[i6] = (int) j3;
            j2 = j3 >> 32;
        }
        return (int) j2;
    }

    public static int subWordAt(int i, int i2, int[] iArr, int i3) {
        long j2 = (((long) iArr[i3]) & 4294967295L) - (4294967295L & ((long) i2));
        iArr[i3] = (int) j2;
        if ((j2 >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, i3 + 1);
    }

    public static int subWordFrom(int i, int i2, int[] iArr) {
        long j2 = (((long) iArr[0]) & 4294967295L) - (4294967295L & ((long) i2));
        iArr[0] = (int) j2;
        if ((j2 >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, 1);
    }

    public static BigInteger toBigInteger(int i, int[] iArr) {
        byte[] bArr = new byte[i << 2];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                Pack.intToBigEndian(i3, bArr, ((i - 1) - i2) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void xor(int i, int[] iArr, int i2, int i3, int[] iArr2, int i5) {
        for (int i6 = 0; i6 < i; i6++) {
            iArr2[i5 + i6] = iArr[i2 + i6] ^ i3;
        }
    }

    public static void xor64(int i, long[] jArr, int i2, long j2, long[] jArr2, int i3) {
        for (int i5 = 0; i5 < i; i5++) {
            jArr2[i3 + i5] = jArr[i2 + i5] ^ j2;
        }
    }

    public static void xorBothTo(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i5) {
        for (int i6 = 0; i6 < i; i6++) {
            int i21 = i5 + i6;
            iArr3[i21] = iArr3[i21] ^ (iArr[i2 + i6] ^ iArr2[i3 + i6]);
        }
    }

    public static void xorBothTo64(int i, long[] jArr, int i2, long[] jArr2, int i3, long[] jArr3, int i5) {
        for (int i6 = 0; i6 < i; i6++) {
            int i21 = i5 + i6;
            jArr3[i21] = jArr3[i21] ^ (jArr[i2 + i6] ^ jArr2[i3 + i6]);
        }
    }

    public static void xorTo(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = i3 + i5;
            iArr2[i6] = iArr2[i6] ^ iArr[i2 + i5];
        }
    }

    public static void xorTo64(int i, long[] jArr, int i2, long[] jArr2, int i3) {
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = i3 + i5;
            jArr2[i6] = jArr2[i6] ^ jArr[i2 + i5];
        }
    }

    public static void xorToEachOther(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = i2 + i5;
            int i21 = i3 + i5;
            int i22 = iArr[i6] ^ iArr2[i21];
            iArr[i6] = i22;
            iArr2[i21] = i22;
        }
    }

    public static void xorToEachOther64(int i, long[] jArr, int i2, long[] jArr2, int i3) {
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = i2 + i5;
            int i21 = i3 + i5;
            long j2 = jArr[i6] ^ jArr2[i21];
            jArr[i6] = j2;
            jArr2[i21] = j2;
        }
    }

    public static void zero(int i, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = 0;
        }
    }

    public static void zero64(int i, long[] jArr) {
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = 0;
        }
    }

    public static int add33At(int i, int i2, int[] iArr, int i3, int i5) {
        int i6 = i3 + i5;
        long j2 = (((long) iArr[i6]) & 4294967295L) + (((long) i2) & 4294967295L);
        iArr[i6] = (int) j2;
        int i21 = i6 + 1;
        long j3 = (4294967295L & ((long) iArr[i21])) + 1 + (j2 >>> 32);
        iArr[i21] = (int) j3;
        if ((j3 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, i3, i5 + 2);
    }

    public static int add33To(int i, int i2, int[] iArr, int i3) {
        long j2 = (((long) iArr[i3]) & 4294967295L) + (((long) i2) & 4294967295L);
        iArr[i3] = (int) j2;
        int i5 = i3 + 1;
        long j3 = (4294967295L & ((long) iArr[i5])) + 1 + (j2 >>> 32);
        iArr[i5] = (int) j3;
        if ((j3 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, i3, 2);
    }

    public static int addBothTo(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j3 = (((long) iArr[i2]) & 4294967295L) + (((long) iArr2[i2]) & 4294967295L) + (4294967295L & ((long) iArr3[i2])) + j2;
            iArr3[i2] = (int) j3;
            j2 = j3 >>> 32;
        }
        return (int) j2;
    }

    public static int addDWordAt(int i, long j2, int[] iArr, int i2, int i3) {
        int i5 = i2 + i3;
        long j3 = (((long) iArr[i5]) & 4294967295L) + (j2 & 4294967295L);
        iArr[i5] = (int) j3;
        int i6 = i5 + 1;
        long j5 = (4294967295L & ((long) iArr[i6])) + (j2 >>> 32) + (j3 >>> 32);
        iArr[i6] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, i2, i3 + 2);
    }

    public static int addDWordTo(int i, long j2, int[] iArr, int i2) {
        long j3 = (((long) iArr[i2]) & 4294967295L) + (j2 & 4294967295L);
        iArr[i2] = (int) j3;
        int i3 = i2 + 1;
        long j5 = (4294967295L & ((long) iArr[i3])) + (j2 >>> 32) + (j3 >>> 32);
        iArr[i3] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, i2, 2);
    }

    public static int addTo(int i, int[] iArr, int i2, int[] iArr2, int i3, int i5) {
        long j2 = ((long) i5) & 4294967295L;
        for (int i6 = 0; i6 < i; i6++) {
            int i21 = i3 + i6;
            long j3 = (((long) iArr[i2 + i6]) & 4294967295L) + (((long) iArr2[i21]) & 4294967295L) + j2;
            iArr2[i21] = (int) j3;
            j2 = j3 >>> 32;
        }
        return (int) j2;
    }

    public static int addToEachOther(int i, int[] iArr, int[] iArr2) {
        long j2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j3 = (((long) iArr[i2]) & 4294967295L) + (4294967295L & ((long) iArr2[i2])) + j2;
            int i3 = (int) j3;
            iArr[i2] = i3;
            iArr2[i2] = i3;
            j2 = j3 >>> 32;
        }
        return (int) j2;
    }

    public static int addWordAt(int i, int i2, int[] iArr, int i3, int i5) {
        long j2 = ((long) i2) & 4294967295L;
        int i6 = i3 + i5;
        long j3 = j2 + (4294967295L & ((long) iArr[i6]));
        iArr[i6] = (int) j3;
        if ((j3 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, i3, i5 + 1);
    }

    public static int addWordTo(int i, int i2, int[] iArr, int i3) {
        long j2 = (((long) i2) & 4294967295L) + (4294967295L & ((long) iArr[i3]));
        iArr[i3] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return 0;
        }
        return incAt(i, iArr, i3, 1);
    }

    public static int compare(int i, int[] iArr, int[] iArr2) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            int i3 = iArr[i2] - Integer.MIN_VALUE;
            int i5 = iArr2[i2] - Integer.MIN_VALUE;
            if (i3 < i5) {
                return -1;
            }
            if (i3 > i5) {
                return 1;
            }
        }
        return 0;
    }

    public static void copy(int i, int[] iArr, int[] iArr2) {
        System.arraycopy(iArr, 0, iArr2, 0, i);
    }

    public static void copy64(int i, long[] jArr, long[] jArr2) {
        System.arraycopy(jArr, 0, jArr2, 0, i);
    }

    public static int csub(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((long) (-(i2 & 1))) & 4294967295L;
        long j3 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long j5 = ((((long) iArr[i3]) & 4294967295L) - (((long) iArr2[i3]) & j2)) + j3;
            iArr3[i3] = (int) j5;
            j3 = j5 >> 32;
        }
        return (int) j3;
    }

    public static int dec(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = iArr[i2] - 1;
            iArr2[i2] = i3;
            i2++;
            if (i3 != -1) {
                while (i2 < i) {
                    iArr2[i2] = iArr[i2];
                    i2++;
                }
                return 0;
            }
        }
        return -1;
    }

    public static int decAt(int i, int[] iArr, int i2, int i3) {
        while (i3 < i) {
            int i5 = i2 + i3;
            int i6 = iArr[i5] - 1;
            iArr[i5] = i6;
            if (i6 != -1) {
                return 0;
            }
            i3++;
        }
        return -1;
    }

    public static int equalTo(int i, int[] iArr, int i2, int i3) {
        int i5 = i3 ^ iArr[i2];
        for (int i6 = 1; i6 < i; i6++) {
            i5 |= iArr[i2 + i6];
        }
        return czero(i5);
    }

    public static long equalTo64(int i, long[] jArr, int i2, long[] jArr2, int i3) {
        long j2 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            j2 |= jArr[i2 + i5] ^ jArr2[i3 + i5];
        }
        return czero64(j2);
    }

    public static int equalToZero(int i, int[] iArr, int i2) {
        int i3 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3 |= iArr[i2 + i5];
        }
        return czero(i3);
    }

    public static long equalToZero64(int i, long[] jArr, int i2) {
        long j2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            j2 |= jArr[i2 + i3];
        }
        return czero64(j2);
    }

    public static int getBitLength(int i, int[] iArr, int i2) {
        for (int i3 = i - 1; i3 >= 0; i3--) {
            int i5 = iArr[i2 + i3];
            if (i5 != 0) {
                return Integers.bitLength(i5) + (i3 * 32);
            }
        }
        return 0;
    }

    public static boolean gte(int i, int[] iArr, int[] iArr2) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            int i3 = iArr[i2] - Integer.MIN_VALUE;
            int i5 = iArr2[i2] - Integer.MIN_VALUE;
            if (i3 < i5) {
                return false;
            }
            if (i3 > i5) {
                return true;
            }
        }
        return true;
    }

    public static int inc(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = iArr[i2] + 1;
            iArr2[i2] = i3;
            i2++;
            if (i3 != 0) {
                while (i2 < i) {
                    iArr2[i2] = iArr[i2];
                    i2++;
                }
                return 0;
            }
        }
        return 1;
    }

    public static int incAt(int i, int[] iArr, int i2, int i3) {
        while (i3 < i) {
            int i5 = i2 + i3;
            int i6 = iArr[i5] + 1;
            iArr[i5] = i6;
            if (i6 != 0) {
                return 0;
            }
            i3++;
        }
        return 1;
    }

    public static int lessThan(int i, int[] iArr, int[] iArr2) {
        long j2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j2 = (((((long) iArr[i2]) & 4294967295L) - (4294967295L & ((long) iArr2[i2]))) + j2) >> 32;
        }
        return (int) j2;
    }

    public static void mul(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        iArr3[i] = mulWord(i, iArr[0], iArr2, iArr3);
        int i2 = 1;
        while (i2 < i) {
            int i3 = i;
            iArr3[i2 + i] = mulWordAddTo(i3, iArr[i2], iArr2, 0, iArr3, i2);
            i2++;
            i = i3;
        }
    }

    public static int mulAddTo(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = 0;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i;
            int[] iArr4 = iArr2;
            int[] iArr5 = iArr3;
            int i5 = i2 + i3;
            long jMulWordAddTo = j2 + (((long) mulWordAddTo(i3, iArr[i2], iArr4, 0, iArr5, i2)) & 4294967295L) + (((long) iArr5[i5]) & 4294967295L);
            iArr5[i5] = (int) jMulWordAddTo;
            j2 = jMulWordAddTo >>> 32;
            i2++;
            i = i3;
            iArr2 = iArr4;
            iArr3 = iArr5;
        }
        return (int) j2;
    }

    public static int mulWord(int i, int i2, int[] iArr, int[] iArr2) {
        long j2 = ((long) i2) & 4294967295L;
        long j3 = 0;
        int i3 = 0;
        do {
            long j5 = ((((long) iArr[i3]) & 4294967295L) * j2) + j3;
            iArr2[i3] = (int) j5;
            j3 = j5 >>> 32;
            i3++;
        } while (i3 < i);
        return (int) j3;
    }

    public static int shiftDownBit(int i, int[] iArr, int i2, int i3) {
        while (true) {
            i--;
            if (i < 0) {
                return i3 << 31;
            }
            int i5 = i2 + i;
            int i6 = iArr[i5];
            iArr[i5] = (i3 << 31) | (i6 >>> 1);
            i3 = i6;
        }
    }

    public static int shiftDownBits(int i, int[] iArr, int i2, int i3, int i5) {
        while (true) {
            i--;
            if (i < 0) {
                return i5 << (-i3);
            }
            int i6 = i2 + i;
            int i21 = iArr[i6];
            iArr[i6] = (i5 << (-i3)) | (i21 >>> i3);
            i5 = i21;
        }
    }

    public static int shiftUpBit(int i, int[] iArr, int i2, int i3) {
        int i5 = 0;
        while (i5 < i) {
            int i6 = i2 + i5;
            int i21 = iArr[i6];
            iArr[i6] = (i3 >>> 31) | (i21 << 1);
            i5++;
            i3 = i21;
        }
        return i3 >>> 31;
    }

    public static int shiftUpBits(int i, int[] iArr, int i2, int i3, int i5) {
        int i6 = 0;
        while (i6 < i) {
            int i21 = i2 + i6;
            int i22 = iArr[i21];
            iArr[i21] = (i5 >>> (-i3)) | (i22 << i3);
            i6++;
            i5 = i22;
        }
        return i5 >>> (-i3);
    }

    public static long shiftUpBits64(int i, long[] jArr, int i2, int i3, long j2, long[] jArr2, int i5) {
        int i6 = 0;
        while (i6 < i) {
            long j3 = jArr[i2 + i6];
            jArr2[i5 + i6] = (j2 >>> (-i3)) | (j3 << i3);
            i6++;
            j2 = j3;
        }
        return j2 >>> (-i3);
    }

    public static void square(int i, int[] iArr, int[] iArr2) {
        int i2;
        int i3 = i << 1;
        int i5 = i;
        int i6 = i3;
        int i21 = 0;
        while (true) {
            i5--;
            long j2 = ((long) iArr[i5]) & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i6 - 1] = (i21 << 31) | ((int) (j3 >>> 33));
            i6 -= 2;
            iArr2[i6] = (int) (j3 >>> 1);
            int i22 = (int) j3;
            if (i5 <= 0) {
                break;
            } else {
                i21 = i22;
            }
        }
        long j5 = 0;
        int i32 = 2;
        for (i2 = 1; i2 < i; i2++) {
            long jSquareWordAddTo = j5 + (((long) squareWordAddTo(iArr, i2, iArr2)) & 4294967295L) + (((long) iArr2[i32]) & 4294967295L);
            int i33 = i32 + 1;
            iArr2[i32] = (int) jSquareWordAddTo;
            long j16 = (jSquareWordAddTo >>> 32) + (((long) iArr2[i33]) & 4294967295L);
            i32 += 2;
            iArr2[i33] = (int) j16;
            j5 = j16 >>> 32;
        }
        shiftUpBit(i3, iArr2, iArr[0] << 31);
    }

    public static int squareWordAddTo(int[] iArr, int i, int[] iArr2) {
        long j2 = ((long) iArr[i]) & 4294967295L;
        long j3 = 0;
        int i2 = 0;
        do {
            int i3 = i + i2;
            long j5 = ((((long) iArr[i2]) & 4294967295L) * j2) + (((long) iArr2[i3]) & 4294967295L) + j3;
            iArr2[i3] = (int) j5;
            j3 = j5 >>> 32;
            i2++;
        } while (i2 < i);
        return (int) j3;
    }

    public static int sub(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j3 = ((((long) iArr[i2]) & 4294967295L) - (4294967295L & ((long) iArr2[i2]))) + j2;
            iArr3[i2] = (int) j3;
            j2 = j3 >> 32;
        }
        return (int) j2;
    }

    public static int sub33At(int i, int i2, int[] iArr, int i3, int i5) {
        int i6 = i3 + i5;
        long j2 = (((long) iArr[i6]) & 4294967295L) - (((long) i2) & 4294967295L);
        iArr[i6] = (int) j2;
        int i21 = i6 + 1;
        long j3 = ((4294967295L & ((long) iArr[i21])) - 1) + (j2 >> 32);
        iArr[i21] = (int) j3;
        if ((j3 >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, i3, i5 + 2);
    }

    public static int sub33From(int i, int i2, int[] iArr, int i3) {
        long j2 = (((long) iArr[i3]) & 4294967295L) - (((long) i2) & 4294967295L);
        iArr[i3] = (int) j2;
        int i5 = i3 + 1;
        long j3 = ((4294967295L & ((long) iArr[i5])) - 1) + (j2 >> 32);
        iArr[i5] = (int) j3;
        if ((j3 >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, i3, 2);
    }

    public static int subBothFrom(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j3 = (((((long) iArr3[i2]) & 4294967295L) - (((long) iArr[i2]) & 4294967295L)) - (4294967295L & ((long) iArr2[i2]))) + j2;
            iArr3[i2] = (int) j3;
            j2 = j3 >> 32;
        }
        return (int) j2;
    }

    public static int subDWordAt(int i, long j2, int[] iArr, int i2, int i3) {
        int i5 = i2 + i3;
        long j3 = (((long) iArr[i5]) & 4294967295L) - (j2 & 4294967295L);
        iArr[i5] = (int) j3;
        int i6 = i5 + 1;
        long j5 = ((4294967295L & ((long) iArr[i6])) - (j2 >>> 32)) + (j3 >> 32);
        iArr[i6] = (int) j5;
        if ((j5 >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, i2, i3 + 2);
    }

    public static int subDWordFrom(int i, long j2, int[] iArr, int i2) {
        long j3 = (((long) iArr[i2]) & 4294967295L) - (j2 & 4294967295L);
        iArr[i2] = (int) j3;
        int i3 = i2 + 1;
        long j5 = ((4294967295L & ((long) iArr[i3])) - (j2 >>> 32)) + (j3 >> 32);
        iArr[i3] = (int) j5;
        if ((j5 >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, i2, 2);
    }

    public static int subFrom(int i, int[] iArr, int[] iArr2) {
        long j2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j3 = ((((long) iArr2[i2]) & 4294967295L) - (4294967295L & ((long) iArr[i2]))) + j2;
            iArr2[i2] = (int) j3;
            j2 = j3 >> 32;
        }
        return (int) j2;
    }

    public static int subWordAt(int i, int i2, int[] iArr, int i3, int i5) {
        int i6 = i3 + i5;
        long j2 = (((long) iArr[i6]) & 4294967295L) - (4294967295L & ((long) i2));
        iArr[i6] = (int) j2;
        if ((j2 >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, i3, i5 + 1);
    }

    public static int subWordFrom(int i, int i2, int[] iArr, int i3) {
        long j2 = (((long) iArr[i3]) & 4294967295L) - (4294967295L & ((long) i2));
        iArr[i3] = (int) j2;
        if ((j2 >> 32) == 0) {
            return 0;
        }
        return decAt(i, iArr, i3, 1);
    }

    public static void xor(int i, int[] iArr, int i2, int[] iArr2) {
        for (int i3 = 0; i3 < i; i3++) {
            iArr2[i3] = iArr[i3] ^ i2;
        }
    }

    public static void xor64(int i, long[] jArr, int i2, long[] jArr2, int i3, long[] jArr3, int i5) {
        for (int i6 = 0; i6 < i; i6++) {
            jArr3[i5 + i6] = jArr[i2 + i6] ^ jArr2[i3 + i6];
        }
    }

    public static void xorBothTo(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i2 = 0; i2 < i; i2++) {
            iArr3[i2] = iArr3[i2] ^ (iArr[i2] ^ iArr2[i2]);
        }
    }

    public static void xorBothTo64(int i, long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < i; i2++) {
            jArr3[i2] = jArr3[i2] ^ (jArr[i2] ^ jArr2[i2]);
        }
    }

    public static void xorTo(int i, int[] iArr, int[] iArr2) {
        for (int i2 = 0; i2 < i; i2++) {
            iArr2[i2] = iArr2[i2] ^ iArr[i2];
        }
    }

    public static void xorTo64(int i, long[] jArr, long[] jArr2) {
        for (int i2 = 0; i2 < i; i2++) {
            jArr2[i2] = jArr2[i2] ^ jArr[i2];
        }
    }

    public static void xorToEachOther(int i, int[] iArr, int[] iArr2) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2] ^ iArr2[i2];
            iArr[i2] = i3;
            iArr2[i2] = i3;
        }
    }

    public static void xorToEachOther64(int i, long[] jArr, long[] jArr2) {
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = jArr[i2] ^ jArr2[i2];
            jArr[i2] = j2;
            jArr2[i2] = j2;
        }
    }

    public static void zero(int i, int[] iArr, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            iArr[i2 + i3] = 0;
        }
    }

    public static void zero64(int i, long[] jArr, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            jArr[i2 + i3] = 0;
        }
    }

    public static int addTo(int i, int[] iArr, int[] iArr2) {
        long j2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j3 = (((long) iArr[i2]) & 4294967295L) + (4294967295L & ((long) iArr2[i2])) + j2;
            iArr2[i2] = (int) j3;
            j2 = j3 >>> 32;
        }
        return (int) j2;
    }

    public static int[] copy(int i, int[] iArr) {
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    public static long[] copy64(int i, long[] jArr) {
        long[] jArr2 = new long[i];
        System.arraycopy(jArr, 0, jArr2, 0, i);
        return jArr2;
    }

    public static int equalTo(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            i5 |= iArr[i2 + i6] ^ iArr2[i3 + i6];
        }
        return czero(i5);
    }

    public static long equalTo64(int i, long[] jArr, long j2) {
        long j3 = j2 ^ jArr[0];
        for (int i2 = 1; i2 < i; i2++) {
            j3 |= jArr[i2];
        }
        return czero64(j3);
    }

    public static void mul(int[] iArr, int i, int i2, int[] iArr2, int i3, int i5, int[] iArr3, int i6) {
        iArr3[i6 + i5] = mulWord(i5, iArr[i], iArr2, i3, iArr3, i6);
        for (int i21 = 1; i21 < i2; i21++) {
            int i22 = i6 + i21;
            iArr3[i22 + i5] = mulWordAddTo(i5, iArr[i + i21], iArr2, i3, iArr3, i22);
        }
    }

    public static int shiftDownBit(int i, int[] iArr, int i2, int i3, int[] iArr2, int i5) {
        while (true) {
            i--;
            if (i < 0) {
                return i3 << 31;
            }
            int i6 = iArr[i2 + i];
            iArr2[i5 + i] = (i3 << 31) | (i6 >>> 1);
            i3 = i6;
        }
    }

    public static int shiftDownBits(int i, int[] iArr, int i2, int i3, int i5, int[] iArr2, int i6) {
        while (true) {
            i--;
            if (i < 0) {
                return i5 << (-i3);
            }
            int i21 = iArr[i2 + i];
            iArr2[i6 + i] = (i5 << (-i3)) | (i21 >>> i3);
            i5 = i21;
        }
    }

    public static int shiftUpBit(int i, int[] iArr, int i2, int i3, int[] iArr2, int i5) {
        int i6 = 0;
        while (i6 < i) {
            int i21 = iArr[i2 + i6];
            iArr2[i5 + i6] = (i3 >>> 31) | (i21 << 1);
            i6++;
            i3 = i21;
        }
        return i3 >>> 31;
    }

    public static int shiftUpBits(int i, int[] iArr, int i2, int i3, int i5, int[] iArr2, int i6) {
        int i21 = 0;
        while (i21 < i) {
            int i22 = iArr[i2 + i21];
            iArr2[i6 + i21] = (i5 >>> (-i3)) | (i22 << i3);
            i21++;
            i5 = i22;
        }
        return i5 >>> (-i3);
    }

    public static void xor(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i5) {
        for (int i6 = 0; i6 < i; i6++) {
            iArr3[i5 + i6] = iArr[i2 + i6] ^ iArr2[i3 + i6];
        }
    }

    public static void xor64(int i, long[] jArr, long j2, long[] jArr2) {
        for (int i2 = 0; i2 < i; i2++) {
            jArr2[i2] = jArr[i2] ^ j2;
        }
    }

    public static int addTo(int i, int[] iArr, int[] iArr2, int i2) {
        long j2 = ((long) i2) & 4294967295L;
        for (int i3 = 0; i3 < i; i3++) {
            long j3 = (((long) iArr[i3]) & 4294967295L) + (((long) iArr2[i3]) & 4294967295L) + j2;
            iArr2[i3] = (int) j3;
            j2 = j3 >>> 32;
        }
        return (int) j2;
    }

    public static int equalTo(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 |= iArr[i3] ^ iArr2[i3];
        }
        return czero(i2);
    }

    public static long equalTo64(int i, long[] jArr, long[] jArr2) {
        long j2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j2 |= jArr[i2] ^ jArr2[i2];
        }
        return czero64(j2);
    }

    public static int shiftDownBit(int i, int[] iArr, int i2, int[] iArr2) {
        while (true) {
            i--;
            if (i < 0) {
                return i2 << 31;
            }
            int i3 = iArr[i];
            iArr2[i] = (i2 << 31) | (i3 >>> 1);
            i2 = i3;
        }
    }

    public static int shiftDownBits(int i, int[] iArr, int i2, int i3, int[] iArr2) {
        while (true) {
            i--;
            if (i < 0) {
                return i3 << (-i2);
            }
            int i5 = iArr[i];
            iArr2[i] = (i3 << (-i2)) | (i5 >>> i2);
            i3 = i5;
        }
    }

    public static int shiftUpBit(int i, int[] iArr, int i2, int[] iArr2) {
        int i3 = 0;
        while (i3 < i) {
            int i5 = iArr[i3];
            iArr2[i3] = (i2 >>> 31) | (i5 << 1);
            i3++;
            i2 = i5;
        }
        return i2 >>> 31;
    }

    public static int shiftUpBits(int i, int[] iArr, int i2, int i3, int[] iArr2) {
        int i5 = 0;
        while (i5 < i) {
            int i6 = iArr[i5];
            iArr2[i5] = (i3 >>> (-i2)) | (i6 << i2);
            i5++;
            i3 = i6;
        }
        return i3 >>> (-i2);
    }

    public static void xor(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i2 = 0; i2 < i; i2++) {
            iArr3[i2] = iArr[i2] ^ iArr2[i2];
        }
    }

    public static void xor64(int i, long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < i; i2++) {
            jArr3[i2] = jArr[i2] ^ jArr2[i2];
        }
    }
}
