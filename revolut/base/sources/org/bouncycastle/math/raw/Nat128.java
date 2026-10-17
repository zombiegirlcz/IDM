package org.bouncycastle.math.raw;

import ch.qos.logback.core.util.a;
import java.math.BigInteger;
import org.bouncycastle.util.Pack;
import zsc.p;

/* JADX INFO: loaded from: classes14.dex */
public abstract class Nat128 {
    private static final long M = 4294967295L;

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j2;
        long j3 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j2 >>> 32);
        iArr3[1] = (int) j3;
        long j5 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j3 >>> 32);
        iArr3[2] = (int) j5;
        long j16 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j5 >>> 32);
        iArr3[3] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L);
        iArr3[0] = (int) j2;
        long j3 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L) + (j2 >>> 32);
        iArr3[1] = (int) j3;
        long j5 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L) + (j3 >>> 32);
        iArr3[2] = (int) j5;
        long j16 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L) + (j5 >>> 32);
        iArr3[3] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int addTo(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        long j2 = (((long) iArr[i]) & 4294967295L) + (((long) iArr2[i2]) & 4294967295L) + (((long) i3) & 4294967295L);
        iArr2[i2] = (int) j2;
        int i5 = i2 + 1;
        long j3 = (((long) iArr[i + 1]) & 4294967295L) + (((long) iArr2[i5]) & 4294967295L) + (j2 >>> 32);
        iArr2[i5] = (int) j3;
        int i6 = i2 + 2;
        long j5 = (((long) iArr[i + 2]) & 4294967295L) + (((long) iArr2[i6]) & 4294967295L) + (j3 >>> 32);
        iArr2[i6] = (int) j5;
        int i21 = i2 + 3;
        long j16 = (((long) iArr[i + 3]) & 4294967295L) + (4294967295L & ((long) iArr2[i21])) + (j5 >>> 32);
        iArr2[i21] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i, int[] iArr2, int i2) {
        long j2 = (((long) iArr[i]) & 4294967295L) + (((long) iArr2[i2]) & 4294967295L);
        int i3 = (int) j2;
        iArr[i] = i3;
        iArr2[i2] = i3;
        int i5 = i + 1;
        int i6 = i2 + 1;
        long j3 = (((long) iArr[i5]) & 4294967295L) + (((long) iArr2[i6]) & 4294967295L) + (j2 >>> 32);
        int i21 = (int) j3;
        iArr[i5] = i21;
        iArr2[i6] = i21;
        int i22 = i + 2;
        int i32 = i2 + 2;
        long j5 = (((long) iArr[i22]) & 4294967295L) + (((long) iArr2[i32]) & 4294967295L) + (j3 >>> 32);
        int i33 = (int) j5;
        iArr[i22] = i33;
        iArr2[i32] = i33;
        int i43 = i + 3;
        int i59 = i2 + 3;
        long j16 = (((long) iArr[i43]) & 4294967295L) + (4294967295L & ((long) iArr2[i59])) + (j5 >>> 32);
        int i66 = (int) j16;
        iArr[i43] = i66;
        iArr2[i59] = i66;
        return (int) (j16 >>> 32);
    }

    public static void copy(int[] iArr, int i, int[] iArr2, int i2) {
        iArr2[i2] = iArr[i];
        iArr2[i2 + 1] = iArr[i + 1];
        iArr2[i2 + 2] = iArr[i + 2];
        iArr2[i2 + 3] = iArr[i + 3];
    }

    public static void copy64(long[] jArr, int i, long[] jArr2, int i2) {
        jArr2[i2] = jArr[i];
        jArr2[i2 + 1] = jArr[i + 1];
    }

    public static int[] create() {
        return new int[4];
    }

    public static long[] create64() {
        return new long[2];
    }

    public static int[] createExt() {
        return new int[8];
    }

    public static long[] createExt64() {
        return new long[4];
    }

    public static boolean diff(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        boolean zGte = gte(iArr, i, iArr2, i2);
        if (zGte) {
            sub(iArr, i, iArr2, i2, iArr3, i3);
            return zGte;
        }
        sub(iArr2, i2, iArr, i, iArr3, i3);
        return zGte;
    }

    public static boolean eq(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i = 1; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        int[] iArrCreate = create();
        for (int i = 0; i < 4; i++) {
            iArrCreate[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArrCreate;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        long[] jArrCreate64 = create64();
        for (int i = 0; i < 2; i++) {
            jArrCreate64[i] = bigInteger.longValue();
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
            if (i3 < 0 || i3 >= 4) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean gte(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 3; i3 >= 0; i3--) {
            int i5 = iArr[i + i3] - Integer.MIN_VALUE;
            int i6 = iArr2[i2 + i3] - Integer.MIN_VALUE;
            if (i5 < i6) {
                return false;
            }
            if (i5 > i6) {
                return true;
            }
        }
        return true;
    }

    public static boolean isOne(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] jArr) {
        return jArr[0] == 1 && jArr[1] == 0;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i = 0; i < 2; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j2 = ((long) iArr2[i2]) & 4294967295L;
        long j3 = ((long) iArr2[i2 + 1]) & 4294967295L;
        long j5 = ((long) iArr2[i2 + 2]) & 4294967295L;
        long j16 = ((long) iArr2[i2 + 3]) & 4294967295L;
        long j22 = ((long) iArr[i]) & 4294967295L;
        long j42 = j22 * j2;
        iArr3[i3] = (int) j42;
        char c2 = p.SPACE_CHAR;
        long j46 = (j42 >>> 32) + (j22 * j3);
        iArr3[i3 + 1] = (int) j46;
        long j47 = (j22 * j5) + (j46 >>> 32);
        iArr3[i3 + 2] = (int) j47;
        long j57 = (j22 * j16) + (j47 >>> 32);
        iArr3[i3 + 3] = (int) j57;
        iArr3[i3 + 4] = (int) (j57 >>> 32);
        int i5 = 1;
        int i6 = i3;
        while (i5 < 4) {
            int i21 = i6 + 1;
            long j58 = ((long) iArr[i + i5]) & 4294967295L;
            char c3 = c2;
            long j65 = (j58 * j2) + (((long) iArr3[i21]) & 4294967295L);
            iArr3[i21] = (int) j65;
            int i22 = i6 + 2;
            long j69 = j2;
            long j76 = (j58 * j3) + (((long) iArr3[i22]) & 4294967295L) + (j65 >>> c3);
            iArr3[i22] = (int) j76;
            int i32 = i6 + 3;
            long j85 = (j58 * j5) + (((long) iArr3[i32]) & 4294967295L) + (j76 >>> c3);
            iArr3[i32] = (int) j85;
            long j100 = j85 >>> c3;
            int i33 = i6 + 4;
            long j101 = (j58 * j16) + (((long) iArr3[i33]) & 4294967295L) + j100;
            iArr3[i33] = (int) j101;
            iArr3[i6 + 5] = (int) (j101 >>> c3);
            i5++;
            c2 = c3;
            i6 = i21;
            j2 = j69;
        }
    }

    public static long mul33Add(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i5) {
        long j2 = ((long) i) & 4294967295L;
        long j3 = ((long) iArr[i2]) & 4294967295L;
        long j5 = (j2 * j3) + (((long) iArr2[i3]) & 4294967295L);
        iArr3[i5] = (int) j5;
        long j16 = ((long) iArr[i2 + 1]) & 4294967295L;
        long j22 = (j2 * j16) + j3 + (((long) iArr2[i3 + 1]) & 4294967295L) + (j5 >>> 32);
        iArr3[i5 + 1] = (int) j22;
        long j42 = ((long) iArr[i2 + 2]) & 4294967295L;
        long j46 = (j2 * j42) + j16 + (((long) iArr2[i3 + 2]) & 4294967295L) + (j22 >>> 32);
        iArr3[i5 + 2] = (int) j46;
        long j47 = ((long) iArr[i2 + 3]) & 4294967295L;
        long j57 = (j2 * j47) + j42 + (4294967295L & ((long) iArr2[i3 + 3])) + (j46 >>> 32);
        iArr3[i5 + 3] = (int) j57;
        return (j57 >>> 32) + j47;
    }

    public static int mul33DWordAdd(int i, long j2, int[] iArr, int i2) {
        long j3 = ((long) i) & 4294967295L;
        long j5 = j2 & 4294967295L;
        long j16 = (j3 * j5) + (((long) iArr[i2]) & 4294967295L);
        iArr[i2] = (int) j16;
        long j22 = j2 >>> 32;
        long j42 = (j3 * j22) + j5;
        int i3 = i2 + 1;
        long j46 = j42 + (((long) iArr[i3]) & 4294967295L) + (j16 >>> 32);
        iArr[i3] = (int) j46;
        int i5 = i2 + 2;
        long j47 = j22 + (((long) iArr[i5]) & 4294967295L) + (j46 >>> 32);
        iArr[i5] = (int) j47;
        int i6 = i2 + 3;
        long j57 = (j47 >>> 32) + (((long) iArr[i6]) & 4294967295L);
        iArr[i6] = (int) j57;
        return (int) (j57 >>> 32);
    }

    public static int mul33WordAdd(int i, int i2, int[] iArr, int i3) {
        long j2 = ((long) i) & 4294967295L;
        long j3 = ((long) i2) & 4294967295L;
        long j5 = (j2 * j3) + (((long) iArr[i3]) & 4294967295L);
        iArr[i3] = (int) j5;
        int i5 = i3 + 1;
        long j16 = j3 + (((long) iArr[i5]) & 4294967295L) + (j5 >>> 32);
        iArr[i5] = (int) j16;
        int i6 = i3 + 2;
        long j22 = (j16 >>> 32) + (((long) iArr[i6]) & 4294967295L);
        iArr[i6] = (int) j22;
        if ((j22 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(4, iArr, i3, 3);
    }

    public static int mulAddTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j2 = 4294967295L;
        long j3 = ((long) iArr2[i2]) & 4294967295L;
        long j5 = ((long) iArr2[i2 + 1]) & 4294967295L;
        long j16 = ((long) iArr2[i2 + 2]) & 4294967295L;
        long j22 = ((long) iArr2[i2 + 3]) & 4294967295L;
        int i5 = 0;
        long j42 = 0;
        while (true) {
            int i6 = i3;
            if (i5 >= 4) {
                return (int) j42;
            }
            long j46 = j2;
            long j47 = ((long) iArr[i + i5]) & j46;
            long j57 = (j47 * j3) + (((long) iArr3[i6]) & j46);
            long j58 = j3;
            iArr3[i6] = (int) j57;
            int i21 = i6 + 1;
            i3 = i21;
            long j65 = (j47 * j5) + (((long) iArr3[i21]) & j46) + (j57 >>> 32);
            iArr3[i3] = (int) j65;
            int i22 = i6 + 2;
            long j69 = (j47 * j16) + (((long) iArr3[i22]) & j46) + (j65 >>> 32);
            iArr3[i22] = (int) j69;
            long j76 = j69 >>> 32;
            int i32 = i6 + 3;
            long j85 = (j47 * j22) + (((long) iArr3[i32]) & j46) + j76;
            iArr3[i32] = (int) j85;
            int i33 = i6 + 4;
            long j100 = (j85 >>> 32) + (((long) iArr3[i33]) & j46) + j42;
            iArr3[i33] = (int) j100;
            j42 = j100 >>> 32;
            i5++;
            j2 = j46;
            j3 = j58;
        }
    }

    public static int mulWord(int i, int[] iArr, int[] iArr2, int i2) {
        long j2 = ((long) i) & 4294967295L;
        long j3 = 0;
        int i3 = 0;
        do {
            long j5 = ((((long) iArr[i3]) & 4294967295L) * j2) + j3;
            iArr2[i2 + i3] = (int) j5;
            j3 = j5 >>> 32;
            i3++;
        } while (i3 < 4);
        return (int) j3;
    }

    public static int mulWordAddExt(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j2 = ((long) i) & 4294967295L;
        long j3 = ((((long) iArr[i2]) & 4294967295L) * j2) + (((long) iArr2[i3]) & 4294967295L);
        iArr2[i3] = (int) j3;
        int i5 = i3 + 1;
        long j5 = ((((long) iArr[i2 + 1]) & 4294967295L) * j2) + (((long) iArr2[i5]) & 4294967295L) + (j3 >>> 32);
        iArr2[i5] = (int) j5;
        int i6 = i3 + 2;
        long j16 = ((((long) iArr[i2 + 2]) & 4294967295L) * j2) + (((long) iArr2[i6]) & 4294967295L) + (j5 >>> 32);
        iArr2[i6] = (int) j16;
        int i21 = i3 + 3;
        long j22 = (j2 * (((long) iArr[i2 + 3]) & 4294967295L)) + (((long) iArr2[i21]) & 4294967295L) + (j16 >>> 32);
        iArr2[i21] = (int) j22;
        return (int) (j22 >>> 32);
    }

    public static int mulWordDwordAdd(int i, long j2, int[] iArr, int i2) {
        long j3 = ((long) i) & 4294967295L;
        long j5 = ((j2 & 4294967295L) * j3) + (((long) iArr[i2]) & 4294967295L);
        iArr[i2] = (int) j5;
        long j16 = j3 * (j2 >>> 32);
        int i3 = i2 + 1;
        long j22 = j16 + (((long) iArr[i3]) & 4294967295L) + (j5 >>> 32);
        iArr[i3] = (int) j22;
        long j42 = j22 >>> 32;
        int i5 = i2 + 2;
        long j46 = j42 + (((long) iArr[i5]) & 4294967295L);
        iArr[i5] = (int) j46;
        if ((j46 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(4, iArr, i2, 3);
    }

    public static int mulWordsAdd(int i, int i2, int[] iArr, int i3) {
        long j2 = ((((long) i2) & 4294967295L) * (((long) i) & 4294967295L)) + (((long) iArr[i3]) & 4294967295L);
        iArr[i3] = (int) j2;
        int i5 = i3 + 1;
        long j3 = (j2 >>> 32) + (4294967295L & ((long) iArr[i5]));
        iArr[i5] = (int) j3;
        if ((j3 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(4, iArr, i3, 2);
    }

    public static void square(int[] iArr, int i, int[] iArr2, int i2) {
        long j2 = ((long) iArr[i]) & 4294967295L;
        int i3 = 0;
        int i5 = 8;
        int i6 = 3;
        while (true) {
            int i21 = i6 - 1;
            long j3 = ((long) iArr[i + i6]) & 4294967295L;
            long j5 = j3 * j3;
            iArr2[(i5 - 1) + i2] = (i3 << 31) | ((int) (j5 >>> 33));
            i5 -= 2;
            iArr2[i2 + i5] = (int) (j5 >>> 1);
            i3 = (int) j5;
            if (i21 <= 0) {
                long j16 = j2 * j2;
                long j22 = (j16 >>> 33) | (((long) (i3 << 31)) & 4294967295L);
                iArr2[i2] = (int) j16;
                int i22 = ((int) (j16 >>> 32)) & 1;
                long j42 = ((long) iArr[i + 1]) & 4294967295L;
                int i32 = i2 + 2;
                long j46 = ((long) iArr2[i32]) & 4294967295L;
                long j47 = (j42 * j2) + j22;
                int i33 = (int) j47;
                iArr2[i2 + 1] = (i33 << 1) | i22;
                long j57 = j46 + (j47 >>> 32);
                long j58 = ((long) iArr[i + 2]) & 4294967295L;
                int i43 = i2 + 3;
                long j65 = ((long) iArr2[i43]) & 4294967295L;
                int i59 = i2 + 4;
                long j69 = ((long) iArr2[i59]) & 4294967295L;
                long j76 = (j58 * j2) + j57;
                int i66 = (int) j76;
                iArr2[i32] = (i66 << 1) | (i33 >>> 31);
                long jD = a.d(j58, j42, j76 >>> 32, j65);
                long j85 = j69 + (jD >>> 32);
                long j100 = ((long) iArr[i + 3]) & 4294967295L;
                int i74 = i2 + 5;
                long j101 = (((long) iArr2[i74]) & 4294967295L) + (j85 >>> 32);
                long j102 = j85 & 4294967295L;
                int i92 = i2 + 6;
                long j103 = (((long) iArr2[i92]) & 4294967295L) + (j101 >>> 32);
                long j104 = (j2 * j100) + (jD & 4294967295L);
                int i96 = (int) j104;
                iArr2[i43] = (i66 >>> 31) | (i96 << 1);
                long jD2 = a.d(j100, j42, j104 >>> 32, j102);
                long jD3 = a.d(j100, j58, jD2 >>> 32, j101 & 4294967295L);
                long j105 = j103 + (jD3 >>> 32);
                int i99 = (int) jD2;
                iArr2[i59] = (i96 >>> 31) | (i99 << 1);
                int i100 = i99 >>> 31;
                int i101 = (int) jD3;
                iArr2[i74] = i100 | (i101 << 1);
                int i102 = i101 >>> 31;
                int i103 = (int) j105;
                iArr2[i92] = i102 | (i103 << 1);
                int i104 = i2 + 7;
                iArr2[i104] = ((iArr2[i104] + ((int) (j105 >>> 32))) << 1) | (i103 >>> 31);
                return;
            }
            i6 = i21;
        }
    }

    public static int sub(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j2 = (((long) iArr[i]) & 4294967295L) - (((long) iArr2[i2]) & 4294967295L);
        iArr3[i3] = (int) j2;
        long j3 = ((((long) iArr[i + 1]) & 4294967295L) - (((long) iArr2[i2 + 1]) & 4294967295L)) + (j2 >> 32);
        iArr3[i3 + 1] = (int) j3;
        long j5 = ((((long) iArr[i + 2]) & 4294967295L) - (((long) iArr2[i2 + 2]) & 4294967295L)) + (j3 >> 32);
        iArr3[i3 + 2] = (int) j5;
        long j16 = ((((long) iArr[i + 3]) & 4294967295L) - (((long) iArr2[i2 + 3]) & 4294967295L)) + (j5 >> 32);
        iArr3[i3 + 3] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((((long) iArr3[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L)) - (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j2;
        long j3 = (((((long) iArr3[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) - (((long) iArr2[1]) & 4294967295L)) + (j2 >> 32);
        iArr3[1] = (int) j3;
        long j5 = (((((long) iArr3[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) - (((long) iArr2[2]) & 4294967295L)) + (j3 >> 32);
        iArr3[2] = (int) j5;
        long j16 = (((((long) iArr3[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) - (((long) iArr2[3]) & 4294967295L)) + (j5 >> 32);
        iArr3[3] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static int subFrom(int[] iArr, int i, int[] iArr2, int i2) {
        long j2 = (((long) iArr2[i2]) & 4294967295L) - (((long) iArr[i]) & 4294967295L);
        iArr2[i2] = (int) j2;
        int i3 = i2 + 1;
        long j3 = ((((long) iArr2[i3]) & 4294967295L) - (((long) iArr[i + 1]) & 4294967295L)) + (j2 >> 32);
        iArr2[i3] = (int) j3;
        int i5 = i2 + 2;
        long j5 = ((((long) iArr2[i5]) & 4294967295L) - (((long) iArr[i + 2]) & 4294967295L)) + (j3 >> 32);
        iArr2[i5] = (int) j5;
        int i6 = i2 + 3;
        long j16 = ((((long) iArr2[i6]) & 4294967295L) - (((long) iArr[i + 3]) & 4294967295L)) + (j5 >> 32);
        iArr2[i6] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                Pack.intToBigEndian(i2, bArr, (3 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 2; i++) {
            long j2 = jArr[i];
            if (j2 != 0) {
                Pack.longToBigEndian(j2, bArr, (1 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j2 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr2[0] = (int) j2;
        long j3 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j2 >>> 32);
        iArr2[1] = (int) j3;
        long j5 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j3 >>> 32);
        iArr2[2] = (int) j5;
        long j16 = (((long) iArr[3]) & 4294967295L) + (4294967295L & ((long) iArr2[3])) + (j5 >>> 32);
        iArr2[3] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
            int i2 = iArr[i] - Integer.MIN_VALUE;
            int i3 = iArr2[i] - Integer.MIN_VALUE;
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = 4294967295L;
        long j3 = ((long) iArr2[0]) & 4294967295L;
        int i = 1;
        long j5 = ((long) iArr2[1]) & 4294967295L;
        long j16 = ((long) iArr2[2]) & 4294967295L;
        long j22 = ((long) iArr2[3]) & 4294967295L;
        long j42 = ((long) iArr[0]) & 4294967295L;
        long j46 = j42 * j3;
        iArr3[0] = (int) j46;
        long j47 = (j42 * j5) + (j46 >>> 32);
        iArr3[1] = (int) j47;
        long j57 = (j42 * j16) + (j47 >>> 32);
        iArr3[2] = (int) j57;
        long j58 = (j42 * j22) + (j57 >>> 32);
        iArr3[3] = (int) j58;
        iArr3[4] = (int) (j58 >>> 32);
        for (int i2 = 4; i < i2; i2 = 4) {
            long j65 = ((long) iArr[i]) & j2;
            long j69 = (j65 * j3) + (((long) iArr3[i]) & j2);
            iArr3[i] = (int) j69;
            int i3 = i + 1;
            long j76 = j2;
            long j85 = (j65 * j5) + (((long) iArr3[i3]) & j76) + (j69 >>> 32);
            iArr3[i3] = (int) j85;
            int i5 = i + 2;
            long j100 = (j65 * j16) + (((long) iArr3[i5]) & j76) + (j85 >>> 32);
            iArr3[i5] = (int) j100;
            long j101 = j100 >>> 32;
            int i6 = i + 3;
            long j102 = (j65 * j22) + (((long) iArr3[i6]) & j76) + j101;
            iArr3[i6] = (int) j102;
            iArr3[i + 4] = (int) (j102 >>> 32);
            i = i3;
            j2 = j76;
        }
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j2 = 4294967295L;
        long j3 = ((long) iArr2[0]) & 4294967295L;
        long j5 = ((long) iArr2[1]) & 4294967295L;
        long j16 = ((long) iArr2[2]) & 4294967295L;
        long j22 = ((long) iArr2[3]) & 4294967295L;
        long j42 = 0;
        while (i < 4) {
            long j46 = ((long) iArr[i]) & j2;
            long j47 = j2;
            long j57 = (((long) iArr3[i]) & j47) + (j46 * j3);
            iArr3[i] = (int) j57;
            int i2 = i + 1;
            int i3 = i;
            long j58 = (j46 * j5) + (((long) iArr3[i2]) & j47) + (j57 >>> 32);
            iArr3[i2] = (int) j58;
            int i5 = i3 + 2;
            long j65 = (j46 * j16) + (((long) iArr3[i5]) & j47) + (j58 >>> 32);
            iArr3[i5] = (int) j65;
            long j69 = j65 >>> 32;
            int i6 = i3 + 3;
            long j76 = (j46 * j22) + (((long) iArr3[i6]) & j47) + j69;
            iArr3[i6] = (int) j76;
            int i21 = i3 + 4;
            long j85 = (j76 >>> 32) + (((long) iArr3[i21]) & j47) + j42;
            iArr3[i21] = (int) j85;
            j42 = j85 >>> 32;
            i = i2;
            j2 = j47;
            j3 = j3;
        }
        return (int) j42;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j2 = ((long) iArr[0]) & 4294967295L;
        int i = 8;
        int i2 = 0;
        int i3 = 3;
        while (true) {
            int i5 = i3 - 1;
            long j3 = ((long) iArr[i3]) & 4294967295L;
            long j5 = j3 * j3;
            iArr2[i - 1] = (i2 << 31) | ((int) (j5 >>> 33));
            i -= 2;
            iArr2[i] = (int) (j5 >>> 1);
            i2 = (int) j5;
            if (i5 <= 0) {
                long j16 = j2 * j2;
                long j22 = (j16 >>> 33) | (((long) (i2 << 31)) & 4294967295L);
                iArr2[0] = (int) j16;
                int i6 = ((int) (j16 >>> 32)) & 1;
                long j42 = ((long) iArr[1]) & 4294967295L;
                long j46 = ((long) iArr2[2]) & 4294967295L;
                long j47 = (j42 * j2) + j22;
                int i21 = (int) j47;
                iArr2[1] = i6 | (i21 << 1);
                int i22 = i21 >>> 31;
                long j57 = ((long) iArr[2]) & 4294967295L;
                long j58 = ((long) iArr2[3]) & 4294967295L;
                long j65 = ((long) iArr2[4]) & 4294967295L;
                long j69 = (j57 * j2) + j46 + (j47 >>> 32);
                int i32 = (int) j69;
                iArr2[2] = i22 | (i32 << 1);
                long jD = a.d(j57, j42, j69 >>> 32, j58);
                long j76 = j65 + (jD >>> 32);
                long j85 = ((long) iArr[3]) & 4294967295L;
                long j100 = (((long) iArr2[5]) & 4294967295L) + (j76 >>> 32);
                long j101 = (((long) iArr2[6]) & 4294967295L) + (j100 >>> 32);
                long j102 = (j2 * j85) + (jD & 4294967295L);
                int i33 = (int) j102;
                iArr2[3] = (i32 >>> 31) | (i33 << 1);
                long jD2 = a.d(j85, j42, j102 >>> 32, j76 & 4294967295L);
                long jD3 = a.d(j85, j57, jD2 >>> 32, j100 & 4294967295L);
                long j103 = j101 + (jD3 >>> 32);
                int i43 = (int) jD2;
                iArr2[4] = (i33 >>> 31) | (i43 << 1);
                int i59 = i43 >>> 31;
                int i66 = (int) (jD3 & 4294967295L);
                iArr2[5] = i59 | (i66 << 1);
                int i74 = i66 >>> 31;
                int i92 = (int) j103;
                iArr2[6] = i74 | (i92 << 1);
                iArr2[7] = (i92 >>> 31) | ((iArr2[7] + ((int) (j103 >>> 32))) << 1);
                return;
            }
            i3 = i5;
        }
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j2;
        long j3 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j2 >> 32);
        iArr3[1] = (int) j3;
        long j5 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j3 >> 32);
        iArr3[2] = (int) j5;
        long j16 = ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j5 >> 32);
        iArr3[3] = (int) j16;
        return (int) (j16 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j2 = (((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j2;
        long j3 = ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j2 >> 32);
        iArr2[1] = (int) j3;
        long j5 = ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j3 >> 32);
        iArr2[2] = (int) j5;
        long j16 = ((((long) iArr2[3]) & 4294967295L) - (4294967295L & ((long) iArr[3]))) + (j5 >> 32);
        iArr2[3] = (int) j16;
        return (int) (j16 >> 32);
    }
}
