package org.bouncycastle.math.raw;

import ch.qos.logback.core.util.a;
import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public abstract class Nat192 {
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
        long j22 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (j16 >>> 32);
        iArr3[4] = (int) j22;
        long j42 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (j22 >>> 32);
        iArr3[5] = (int) j42;
        return (int) (j42 >>> 32);
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
        long j22 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L) + (j16 >>> 32);
        iArr3[4] = (int) j22;
        long j42 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L) + (j22 >>> 32);
        iArr3[5] = (int) j42;
        return (int) (j42 >>> 32);
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
        long j16 = (((long) iArr[i + 3]) & 4294967295L) + (((long) iArr2[i21]) & 4294967295L) + (j5 >>> 32);
        iArr2[i21] = (int) j16;
        int i22 = i2 + 4;
        long j22 = (((long) iArr[i + 4]) & 4294967295L) + (((long) iArr2[i22]) & 4294967295L) + (j16 >>> 32);
        iArr2[i22] = (int) j22;
        int i32 = i2 + 5;
        long j42 = (((long) iArr[i + 5]) & 4294967295L) + (4294967295L & ((long) iArr2[i32])) + (j22 >>> 32);
        iArr2[i32] = (int) j42;
        return (int) (j42 >>> 32);
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
        long j16 = (((long) iArr[i43]) & 4294967295L) + (((long) iArr2[i59]) & 4294967295L) + (j5 >>> 32);
        int i66 = (int) j16;
        iArr[i43] = i66;
        iArr2[i59] = i66;
        int i74 = i + 4;
        int i92 = i2 + 4;
        long j22 = (((long) iArr[i74]) & 4294967295L) + (((long) iArr2[i92]) & 4294967295L) + (j16 >>> 32);
        int i96 = (int) j22;
        iArr[i74] = i96;
        iArr2[i92] = i96;
        int i99 = i + 5;
        int i100 = i2 + 5;
        long j42 = (((long) iArr[i99]) & 4294967295L) + (4294967295L & ((long) iArr2[i100])) + (j22 >>> 32);
        int i101 = (int) j42;
        iArr[i99] = i101;
        iArr2[i100] = i101;
        return (int) (j42 >>> 32);
    }

    public static void copy(int[] iArr, int i, int[] iArr2, int i2) {
        iArr2[i2] = iArr[i];
        iArr2[i2 + 1] = iArr[i + 1];
        iArr2[i2 + 2] = iArr[i + 2];
        iArr2[i2 + 3] = iArr[i + 3];
        iArr2[i2 + 4] = iArr[i + 4];
        iArr2[i2 + 5] = iArr[i + 5];
    }

    public static void copy64(long[] jArr, int i, long[] jArr2, int i2) {
        jArr2[i2] = jArr[i];
        jArr2[i2 + 1] = jArr[i + 1];
        jArr2[i2 + 2] = jArr[i + 2];
    }

    public static int[] create() {
        return new int[6];
    }

    public static long[] create64() {
        return new long[3];
    }

    public static int[] createExt() {
        return new int[12];
    }

    public static long[] createExt64() {
        return new long[6];
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
        for (int i = 5; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i = 2; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] iArrCreate = create();
        for (int i = 0; i < 6; i++) {
            iArrCreate[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArrCreate;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        long[] jArrCreate64 = create64();
        for (int i = 0; i < 3; i++) {
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
            if (i3 < 0 || i3 >= 6) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean gte(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 5; i3 >= 0; i3--) {
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
        for (int i = 1; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i = 0; i < 3; i++) {
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
        long j22 = ((long) iArr2[i2 + 4]) & 4294967295L;
        long j42 = ((long) iArr2[i2 + 5]) & 4294967295L;
        long j46 = ((long) iArr[i]) & 4294967295L;
        long j47 = j46 * j2;
        iArr3[i3] = (int) j47;
        long j57 = (j46 * j3) + (j47 >>> 32);
        iArr3[i3 + 1] = (int) j57;
        long j58 = (j46 * j5) + (j57 >>> 32);
        iArr3[i3 + 2] = (int) j58;
        long j65 = (j46 * j16) + (j58 >>> 32);
        iArr3[i3 + 3] = (int) j65;
        long j69 = (j46 * j22) + (j65 >>> 32);
        iArr3[i3 + 4] = (int) j69;
        long j76 = (j46 * j42) + (j69 >>> 32);
        iArr3[i3 + 5] = (int) j76;
        iArr3[i3 + 6] = (int) (j76 >>> 32);
        int i5 = 1;
        int i6 = i3;
        while (i5 < 6) {
            int i21 = i6 + 1;
            long j85 = ((long) iArr[i + i5]) & 4294967295L;
            int i22 = i6;
            long j100 = (j85 * j2) + (((long) iArr3[i21]) & 4294967295L);
            iArr3[i21] = (int) j100;
            int i32 = i22 + 2;
            long j101 = (j85 * j3) + (((long) iArr3[i32]) & 4294967295L) + (j100 >>> 32);
            iArr3[i32] = (int) j101;
            int i33 = i22 + 3;
            long j102 = (j85 * j5) + (((long) iArr3[i33]) & 4294967295L) + (j101 >>> 32);
            iArr3[i33] = (int) j102;
            int i43 = i22 + 4;
            long j103 = (j85 * j16) + (((long) iArr3[i43]) & 4294967295L) + (j102 >>> 32);
            iArr3[i43] = (int) j103;
            int i59 = i22 + 5;
            long j104 = (j85 * j22) + (((long) iArr3[i59]) & 4294967295L) + (j103 >>> 32);
            iArr3[i59] = (int) j104;
            long j105 = j104 >>> 32;
            int i66 = i22 + 6;
            long j106 = (j85 * j42) + (((long) iArr3[i66]) & 4294967295L) + j105;
            iArr3[i66] = (int) j106;
            iArr3[i22 + 7] = (int) (j106 >>> 32);
            i5++;
            i6 = i21;
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
        long j57 = (j2 * j47) + j42 + (((long) iArr2[i3 + 3]) & 4294967295L) + (j46 >>> 32);
        iArr3[i5 + 3] = (int) j57;
        long j58 = ((long) iArr[i2 + 4]) & 4294967295L;
        long j65 = (j2 * j58) + j47 + (((long) iArr2[i3 + 4]) & 4294967295L) + (j57 >>> 32);
        iArr3[i5 + 4] = (int) j65;
        long j69 = ((long) iArr[i2 + 5]) & 4294967295L;
        long j76 = (j2 * j69) + j58 + (4294967295L & ((long) iArr2[i3 + 5])) + (j65 >>> 32);
        iArr3[i5 + 5] = (int) j76;
        return (j76 >>> 32) + j69;
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
        if ((j57 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i2, 4);
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
        return Nat.incAt(6, iArr, i3, 3);
    }

    public static int mulAddTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j2 = ((long) iArr2[i2]) & 4294967295L;
        long j3 = ((long) iArr2[i2 + 1]) & 4294967295L;
        long j5 = ((long) iArr2[i2 + 2]) & 4294967295L;
        long j16 = ((long) iArr2[i2 + 3]) & 4294967295L;
        long j22 = ((long) iArr2[i2 + 4]) & 4294967295L;
        long j42 = ((long) iArr2[i2 + 5]) & 4294967295L;
        long j46 = 0;
        int i5 = 0;
        int i6 = i3;
        while (i5 < 6) {
            long j47 = ((long) iArr[i + i5]) & 4294967295L;
            long j57 = (j47 * j2) + (((long) iArr3[i6]) & 4294967295L);
            long j58 = j3;
            iArr3[i6] = (int) j57;
            int i21 = i6 + 1;
            long j65 = (j47 * j58) + (((long) iArr3[i21]) & 4294967295L) + (j57 >>> 32);
            iArr3[i21] = (int) j65;
            int i22 = i6 + 2;
            long j69 = (j47 * j5) + (((long) iArr3[i22]) & 4294967295L) + (j65 >>> 32);
            iArr3[i22] = (int) j69;
            int i32 = i6 + 3;
            long j76 = (j47 * j16) + (((long) iArr3[i32]) & 4294967295L) + (j69 >>> 32);
            iArr3[i32] = (int) j76;
            int i33 = i6 + 4;
            long j85 = (j47 * j22) + (((long) iArr3[i33]) & 4294967295L) + (j76 >>> 32);
            iArr3[i33] = (int) j85;
            int i43 = i6 + 5;
            long j100 = (j47 * j42) + (((long) iArr3[i43]) & 4294967295L) + (j85 >>> 32);
            iArr3[i43] = (int) j100;
            int i59 = i6 + 6;
            long j101 = (j100 >>> 32) + (((long) iArr3[i59]) & 4294967295L) + j46;
            iArr3[i59] = (int) j101;
            j46 = j101 >>> 32;
            i5++;
            i6 = i21;
            j3 = j58;
        }
        return (int) j46;
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
        } while (i3 < 6);
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
        long j22 = ((((long) iArr[i2 + 3]) & 4294967295L) * j2) + (((long) iArr2[i21]) & 4294967295L) + (j16 >>> 32);
        iArr2[i21] = (int) j22;
        int i22 = i3 + 4;
        long j42 = ((((long) iArr[i2 + 4]) & 4294967295L) * j2) + (((long) iArr2[i22]) & 4294967295L) + (j22 >>> 32);
        iArr2[i22] = (int) j42;
        int i32 = i3 + 5;
        long j46 = (j2 * (((long) iArr[i2 + 5]) & 4294967295L)) + (((long) iArr2[i32]) & 4294967295L) + (j42 >>> 32);
        iArr2[i32] = (int) j46;
        return (int) (j46 >>> 32);
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
        return Nat.incAt(6, iArr, i2, 3);
    }

    public static void square(int[] iArr, int i, int[] iArr2, int i2) {
        long j2 = ((long) iArr[i]) & 4294967295L;
        int i3 = 0;
        int i5 = 12;
        int i6 = 5;
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
                long j104 = j101 & 4294967295L;
                long j105 = (j100 * j2) + (jD & 4294967295L);
                int i96 = (int) j105;
                iArr2[i43] = (i66 >>> 31) | (i96 << 1);
                long jD2 = a.d(j100, j42, j105 >>> 32, j102);
                long jD3 = a.d(j100, j58, jD2 >>> 32, j104);
                long j106 = j103 + (jD3 >>> 32);
                long j107 = ((long) iArr[i + 4]) & 4294967295L;
                int i99 = i2 + 7;
                long j108 = (((long) iArr2[i99]) & 4294967295L) + (j106 >>> 32);
                long j109 = j106 & 4294967295L;
                int i100 = i2 + 8;
                long j110 = (((long) iArr2[i100]) & 4294967295L) + (j108 >>> 32);
                long j111 = (j107 * j2) + (jD2 & 4294967295L);
                int i101 = (int) j111;
                iArr2[i59] = (i96 >>> 31) | (i101 << 1);
                int i102 = i101 >>> 31;
                long jD4 = a.d(j107, j42, j111 >>> 32, jD3 & 4294967295L);
                long jD5 = a.d(j107, j58, jD4 >>> 32, j109);
                long jD6 = a.d(j107, j100, jD5 >>> 32, j108 & 4294967295L);
                long j112 = jD5 & 4294967295L;
                long j113 = j110 + (jD6 >>> 32);
                long j114 = ((long) iArr[i + 5]) & 4294967295L;
                int i103 = i2 + 9;
                long j115 = (((long) iArr2[i103]) & 4294967295L) + (j113 >>> 32);
                long j116 = j113 & 4294967295L;
                int i104 = i2 + 10;
                long j117 = (((long) iArr2[i104]) & 4294967295L) + (j115 >>> 32);
                long j118 = j115 & 4294967295L;
                long j119 = (j114 * j2) + (jD4 & 4294967295L);
                int i105 = (int) j119;
                iArr2[i74] = i102 | (i105 << 1);
                int i106 = i105 >>> 31;
                long jD7 = a.d(j114, j42, j119 >>> 32, j112);
                long jD8 = a.d(j114, j58, jD7 >>> 32, jD6 & 4294967295L);
                long jD9 = a.d(j114, j100, jD8 >>> 32, j116);
                long jD10 = a.d(j114, j107, jD9 >>> 32, j118);
                long j120 = j117 + (jD10 >>> 32);
                int i107 = (int) jD7;
                iArr2[i92] = i106 | (i107 << 1);
                int i108 = (int) jD8;
                iArr2[i99] = (i107 >>> 31) | (i108 << 1);
                int i109 = i108 >>> 31;
                int i110 = (int) jD9;
                iArr2[i100] = i109 | (i110 << 1);
                int i111 = i110 >>> 31;
                int i112 = (int) jD10;
                iArr2[i103] = i111 | (i112 << 1);
                int i113 = i112 >>> 31;
                int i114 = (int) j120;
                iArr2[i104] = i113 | (i114 << 1);
                int i115 = i114 >>> 31;
                int i116 = i2 + 11;
                iArr2[i116] = ((iArr2[i116] + ((int) (j120 >>> 32))) << 1) | i115;
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
        long j22 = ((((long) iArr[i + 4]) & 4294967295L) - (((long) iArr2[i2 + 4]) & 4294967295L)) + (j16 >> 32);
        iArr3[i3 + 4] = (int) j22;
        long j42 = ((((long) iArr[i + 5]) & 4294967295L) - (((long) iArr2[i2 + 5]) & 4294967295L)) + (j22 >> 32);
        iArr3[i3 + 5] = (int) j42;
        return (int) (j42 >> 32);
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
        long j22 = (((((long) iArr3[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) - (((long) iArr2[4]) & 4294967295L)) + (j16 >> 32);
        iArr3[4] = (int) j22;
        long j42 = (((((long) iArr3[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L)) - (((long) iArr2[5]) & 4294967295L)) + (j22 >> 32);
        iArr3[5] = (int) j42;
        return (int) (j42 >> 32);
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
        int i21 = i2 + 4;
        long j22 = ((((long) iArr2[i21]) & 4294967295L) - (((long) iArr[i + 4]) & 4294967295L)) + (j16 >> 32);
        iArr2[i21] = (int) j22;
        int i22 = i2 + 5;
        long j42 = ((((long) iArr2[i22]) & 4294967295L) - (((long) iArr[i + 5]) & 4294967295L)) + (j22 >> 32);
        iArr2[i22] = (int) j42;
        return (int) (j42 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 6; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                Pack.intToBigEndian(i2, bArr, (5 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 3; i++) {
            long j2 = jArr[i];
            if (j2 != 0) {
                Pack.longToBigEndian(j2, bArr, (2 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j2 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr2[0] = (int) j2;
        long j3 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j2 >>> 32);
        iArr2[1] = (int) j3;
        long j5 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j3 >>> 32);
        iArr2[2] = (int) j5;
        long j16 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j5 >>> 32);
        iArr2[3] = (int) j16;
        long j22 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (j16 >>> 32);
        iArr2[4] = (int) j22;
        long j42 = (((long) iArr[5]) & 4294967295L) + (4294967295L & ((long) iArr2[5])) + (j22 >>> 32);
        iArr2[5] = (int) j42;
        return (int) (j42 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
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
        long j2 = ((long) iArr2[0]) & 4294967295L;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j5 = ((long) iArr2[2]) & 4294967295L;
        long j16 = ((long) iArr2[3]) & 4294967295L;
        long j22 = ((long) iArr2[4]) & 4294967295L;
        long j42 = ((long) iArr2[5]) & 4294967295L;
        int i = 1;
        long j46 = ((long) iArr[0]) & 4294967295L;
        long j47 = j46 * j2;
        iArr3[0] = (int) j47;
        long j57 = (j46 * j3) + (j47 >>> 32);
        iArr3[1] = (int) j57;
        long j58 = (j46 * j5) + (j57 >>> 32);
        iArr3[2] = (int) j58;
        long j65 = (j46 * j16) + (j58 >>> 32);
        iArr3[3] = (int) j65;
        long j69 = (j46 * j22) + (j65 >>> 32);
        iArr3[4] = (int) j69;
        long j76 = (j46 * j42) + (j69 >>> 32);
        iArr3[5] = (int) j76;
        int i2 = 6;
        iArr3[6] = (int) (j76 >>> 32);
        while (true) {
            int i3 = i;
            if (i3 >= i2) {
                return;
            }
            long j85 = ((long) iArr[i3]) & 4294967295L;
            long j100 = (j85 * j2) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i3] = (int) j100;
            i = i3 + 1;
            long j101 = j22;
            long j102 = (j85 * j3) + (((long) iArr3[i]) & 4294967295L) + (j100 >>> 32);
            iArr3[i] = (int) j102;
            int i5 = i3 + 2;
            long j103 = (j85 * j5) + (((long) iArr3[i5]) & 4294967295L) + (j102 >>> 32);
            iArr3[i5] = (int) j103;
            int i6 = i3 + 3;
            long j104 = (j85 * j16) + (((long) iArr3[i6]) & 4294967295L) + (j103 >>> 32);
            iArr3[i6] = (int) j104;
            int i21 = i3 + 4;
            long j105 = (j85 * j101) + (((long) iArr3[i21]) & 4294967295L) + (j104 >>> 32);
            iArr3[i21] = (int) j105;
            int i22 = i3 + 5;
            long j106 = (j85 * j42) + (((long) iArr3[i22]) & 4294967295L) + (j105 >>> 32);
            iArr3[i22] = (int) j106;
            iArr3[i3 + 6] = (int) (j106 >>> 32);
            j22 = j101;
            i2 = 6;
        }
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j2 = ((long) iArr2[0]) & 4294967295L;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j5 = ((long) iArr2[2]) & 4294967295L;
        long j16 = ((long) iArr2[3]) & 4294967295L;
        long j22 = ((long) iArr2[4]) & 4294967295L;
        long j42 = ((long) iArr2[5]) & 4294967295L;
        long j46 = 0;
        while (i < 6) {
            long j47 = j2;
            int i2 = i;
            long j57 = ((long) iArr[i]) & 4294967295L;
            long j58 = (((long) iArr3[i2]) & 4294967295L) + (j57 * j47);
            iArr3[i2] = (int) j58;
            int i3 = i2 + 1;
            long j65 = (j57 * j3) + (((long) iArr3[i3]) & 4294967295L) + (j58 >>> 32);
            iArr3[i3] = (int) j65;
            int i5 = i2 + 2;
            long j69 = (j57 * j5) + (((long) iArr3[i5]) & 4294967295L) + (j65 >>> 32);
            iArr3[i5] = (int) j69;
            int i6 = i2 + 3;
            long j76 = (j57 * j16) + (((long) iArr3[i6]) & 4294967295L) + (j69 >>> 32);
            iArr3[i6] = (int) j76;
            int i21 = i2 + 4;
            long j85 = (j57 * j22) + (((long) iArr3[i21]) & 4294967295L) + (j76 >>> 32);
            iArr3[i21] = (int) j85;
            int i22 = i2 + 5;
            long j100 = (j57 * j42) + (((long) iArr3[i22]) & 4294967295L) + (j85 >>> 32);
            iArr3[i22] = (int) j100;
            int i32 = i2 + 6;
            long j101 = (j100 >>> 32) + (((long) iArr3[i32]) & 4294967295L) + j46;
            iArr3[i32] = (int) j101;
            j46 = j101 >>> 32;
            i = i3;
            j2 = j47;
        }
        return (int) j46;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j2 = ((long) iArr[0]) & 4294967295L;
        int i = 12;
        int i2 = 0;
        int i3 = 5;
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
                long j57 = ((long) iArr[2]) & 4294967295L;
                long j58 = ((long) iArr2[3]) & 4294967295L;
                long j65 = ((long) iArr2[4]) & 4294967295L;
                long j69 = (j57 * j2) + j46 + (j47 >>> 32);
                int i22 = (int) j69;
                iArr2[2] = (i22 << 1) | (i21 >>> 31);
                long jD = a.d(j57, j42, j69 >>> 32, j58);
                long j76 = j65 + (jD >>> 32);
                long j85 = ((long) iArr[3]) & 4294967295L;
                long j100 = (((long) iArr2[5]) & 4294967295L) + (j76 >>> 32);
                long j101 = j76 & 4294967295L;
                long j102 = (((long) iArr2[6]) & 4294967295L) + (j100 >>> 32);
                long j103 = j100 & 4294967295L;
                long j104 = (j85 * j2) + (jD & 4294967295L);
                int i32 = (int) j104;
                iArr2[3] = (i22 >>> 31) | (i32 << 1);
                int i33 = i32 >>> 31;
                long jD2 = a.d(j85, j42, j104 >>> 32, j101);
                long jD3 = a.d(j85, j57, jD2 >>> 32, j103);
                long j105 = j102 + (jD3 >>> 32);
                long j106 = ((long) iArr[4]) & 4294967295L;
                long j107 = (((long) iArr2[7]) & 4294967295L) + (j105 >>> 32);
                long j108 = j105 & 4294967295L;
                long j109 = (((long) iArr2[8]) & 4294967295L) + (j107 >>> 32);
                long j110 = j107 & 4294967295L;
                long j111 = (j106 * j2) + (jD2 & 4294967295L);
                int i43 = (int) j111;
                iArr2[4] = i33 | (i43 << 1);
                int i59 = i43 >>> 31;
                long jD4 = a.d(j106, j42, j111 >>> 32, jD3 & 4294967295L);
                long jD5 = a.d(j106, j57, jD4 >>> 32, j108);
                long jD6 = a.d(j106, j85, jD5 >>> 32, j110);
                long j112 = j109 + (jD6 >>> 32);
                long j113 = ((long) iArr[5]) & 4294967295L;
                long j114 = (((long) iArr2[9]) & 4294967295L) + (j112 >>> 32);
                long j115 = j112 & 4294967295L;
                long j116 = (((long) iArr2[10]) & 4294967295L) + (j114 >>> 32);
                long j117 = j114 & 4294967295L;
                long j118 = (j113 * j2) + (jD4 & 4294967295L);
                int i66 = (int) j118;
                iArr2[5] = i59 | (i66 << 1);
                int i74 = i66 >>> 31;
                long jD7 = a.d(j113, j42, j118 >>> 32, jD5 & 4294967295L);
                long jD8 = a.d(j113, j57, jD7 >>> 32, jD6 & 4294967295L);
                long jD9 = a.d(j113, j85, jD8 >>> 32, j115);
                long jD10 = a.d(j113, j106, jD9 >>> 32, j117);
                long j119 = j116 + (jD10 >>> 32);
                int i92 = (int) jD7;
                iArr2[6] = (i92 << 1) | i74;
                int i96 = (int) jD8;
                iArr2[7] = (i92 >>> 31) | (i96 << 1);
                int i99 = i96 >>> 31;
                int i100 = (int) jD9;
                iArr2[8] = i99 | (i100 << 1);
                int i101 = i100 >>> 31;
                int i102 = (int) jD10;
                iArr2[9] = i101 | (i102 << 1);
                int i103 = i102 >>> 31;
                int i104 = (int) j119;
                iArr2[10] = i103 | (i104 << 1);
                iArr2[11] = ((iArr2[11] + ((int) (j119 >>> 32))) << 1) | (i104 >>> 31);
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
        long j22 = ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L)) + (j16 >> 32);
        iArr3[4] = (int) j22;
        long j42 = ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L)) + (j22 >> 32);
        iArr3[5] = (int) j42;
        return (int) (j42 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j2 = (((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j2;
        long j3 = ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j2 >> 32);
        iArr2[1] = (int) j3;
        long j5 = ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j3 >> 32);
        iArr2[2] = (int) j5;
        long j16 = ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) + (j5 >> 32);
        iArr2[3] = (int) j16;
        long j22 = ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) + (j16 >> 32);
        iArr2[4] = (int) j22;
        long j42 = ((((long) iArr2[5]) & 4294967295L) - (4294967295L & ((long) iArr[5]))) + (j22 >> 32);
        iArr2[5] = (int) j42;
        return (int) (j42 >> 32);
    }
}
