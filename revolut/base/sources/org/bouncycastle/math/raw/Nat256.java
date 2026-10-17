package org.bouncycastle.math.raw;

import ch.qos.logback.core.util.a;
import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public abstract class Nat256 {
    private static final long M = 4294967295L;

    public static int add(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j2 = (((long) iArr[i]) & 4294967295L) + (((long) iArr2[i2]) & 4294967295L);
        iArr3[i3] = (int) j2;
        long j3 = (((long) iArr[i + 1]) & 4294967295L) + (((long) iArr2[i2 + 1]) & 4294967295L) + (j2 >>> 32);
        iArr3[i3 + 1] = (int) j3;
        long j5 = (((long) iArr[i + 2]) & 4294967295L) + (((long) iArr2[i2 + 2]) & 4294967295L) + (j3 >>> 32);
        iArr3[i3 + 2] = (int) j5;
        long j16 = (((long) iArr[i + 3]) & 4294967295L) + (((long) iArr2[i2 + 3]) & 4294967295L) + (j5 >>> 32);
        iArr3[i3 + 3] = (int) j16;
        long j22 = (((long) iArr[i + 4]) & 4294967295L) + (((long) iArr2[i2 + 4]) & 4294967295L) + (j16 >>> 32);
        iArr3[i3 + 4] = (int) j22;
        long j42 = (((long) iArr[i + 5]) & 4294967295L) + (((long) iArr2[i2 + 5]) & 4294967295L) + (j22 >>> 32);
        iArr3[i3 + 5] = (int) j42;
        long j46 = (((long) iArr[i + 6]) & 4294967295L) + (((long) iArr2[i2 + 6]) & 4294967295L) + (j42 >>> 32);
        iArr3[i3 + 6] = (int) j46;
        long j47 = (((long) iArr[i + 7]) & 4294967295L) + (((long) iArr2[i2 + 7]) & 4294967295L) + (j46 >>> 32);
        iArr3[i3 + 7] = (int) j47;
        return (int) (j47 >>> 32);
    }

    public static int addBothTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j2 = (((long) iArr[i]) & 4294967295L) + (((long) iArr2[i2]) & 4294967295L) + (((long) iArr3[i3]) & 4294967295L);
        iArr3[i3] = (int) j2;
        int i5 = i3 + 1;
        long j3 = (((long) iArr[i + 1]) & 4294967295L) + (((long) iArr2[i2 + 1]) & 4294967295L) + (((long) iArr3[i5]) & 4294967295L) + (j2 >>> 32);
        iArr3[i5] = (int) j3;
        int i6 = i3 + 2;
        long j5 = (((long) iArr[i + 2]) & 4294967295L) + (((long) iArr2[i2 + 2]) & 4294967295L) + (((long) iArr3[i6]) & 4294967295L) + (j3 >>> 32);
        iArr3[i6] = (int) j5;
        int i21 = i3 + 3;
        long j16 = (((long) iArr[i + 3]) & 4294967295L) + (((long) iArr2[i2 + 3]) & 4294967295L) + (((long) iArr3[i21]) & 4294967295L) + (j5 >>> 32);
        iArr3[i21] = (int) j16;
        int i22 = i3 + 4;
        long j22 = (((long) iArr[i + 4]) & 4294967295L) + (((long) iArr2[i2 + 4]) & 4294967295L) + (((long) iArr3[i22]) & 4294967295L) + (j16 >>> 32);
        iArr3[i22] = (int) j22;
        int i32 = i3 + 5;
        long j42 = (((long) iArr[i + 5]) & 4294967295L) + (((long) iArr2[i2 + 5]) & 4294967295L) + (((long) iArr3[i32]) & 4294967295L) + (j22 >>> 32);
        iArr3[i32] = (int) j42;
        int i33 = i3 + 6;
        long j46 = (((long) iArr[i + 6]) & 4294967295L) + (((long) iArr2[i2 + 6]) & 4294967295L) + (((long) iArr3[i33]) & 4294967295L) + (j42 >>> 32);
        iArr3[i33] = (int) j46;
        int i43 = i3 + 7;
        long j47 = (((long) iArr[i + 7]) & 4294967295L) + (((long) iArr2[i2 + 7]) & 4294967295L) + (((long) iArr3[i43]) & 4294967295L) + (j46 >>> 32);
        iArr3[i43] = (int) j47;
        return (int) (j47 >>> 32);
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
        long j42 = (((long) iArr[i + 5]) & 4294967295L) + (((long) iArr2[i32]) & 4294967295L) + (j22 >>> 32);
        iArr2[i32] = (int) j42;
        int i33 = i2 + 6;
        long j46 = (((long) iArr[i + 6]) & 4294967295L) + (((long) iArr2[i33]) & 4294967295L) + (j42 >>> 32);
        iArr2[i33] = (int) j46;
        int i43 = i2 + 7;
        long j47 = (((long) iArr[i + 7]) & 4294967295L) + (4294967295L & ((long) iArr2[i43])) + (j46 >>> 32);
        iArr2[i43] = (int) j47;
        return (int) (j47 >>> 32);
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
        long j42 = (((long) iArr[i99]) & 4294967295L) + (((long) iArr2[i100]) & 4294967295L) + (j22 >>> 32);
        int i101 = (int) j42;
        iArr[i99] = i101;
        iArr2[i100] = i101;
        int i102 = i + 6;
        int i103 = i2 + 6;
        long j46 = (((long) iArr[i102]) & 4294967295L) + (((long) iArr2[i103]) & 4294967295L) + (j42 >>> 32);
        int i104 = (int) j46;
        iArr[i102] = i104;
        iArr2[i103] = i104;
        int i105 = i + 7;
        int i106 = i2 + 7;
        long j47 = (((long) iArr[i105]) & 4294967295L) + (4294967295L & ((long) iArr2[i106])) + (j46 >>> 32);
        int i107 = (int) j47;
        iArr[i105] = i107;
        iArr2[i106] = i107;
        return (int) (j47 >>> 32);
    }

    public static void copy(int[] iArr, int i, int[] iArr2, int i2) {
        iArr2[i2] = iArr[i];
        iArr2[i2 + 1] = iArr[i + 1];
        iArr2[i2 + 2] = iArr[i + 2];
        iArr2[i2 + 3] = iArr[i + 3];
        iArr2[i2 + 4] = iArr[i + 4];
        iArr2[i2 + 5] = iArr[i + 5];
        iArr2[i2 + 6] = iArr[i + 6];
        iArr2[i2 + 7] = iArr[i + 7];
    }

    public static void copy64(long[] jArr, int i, long[] jArr2, int i2) {
        jArr2[i2] = jArr[i];
        jArr2[i2 + 1] = jArr[i + 1];
        jArr2[i2 + 2] = jArr[i + 2];
        jArr2[i2 + 3] = jArr[i + 3];
    }

    public static int[] create() {
        return new int[8];
    }

    public static long[] create64() {
        return new long[4];
    }

    public static int[] createExt() {
        return new int[16];
    }

    public static long[] createExt64() {
        return new long[8];
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
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i = 3; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] iArrCreate = create();
        for (int i = 0; i < 8; i++) {
            iArrCreate[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArrCreate;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        long[] jArrCreate64 = create64();
        for (int i = 0; i < 4; i++) {
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
            if ((i & 255) != i) {
                return 0;
            }
            i2 = iArr[i >>> 5] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean gte(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 7; i3 >= 0; i3--) {
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
        for (int i = 1; i < 8; i++) {
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
        for (int i = 1; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i = 0; i < 4; i++) {
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
        long j46 = ((long) iArr2[i2 + 6]) & 4294967295L;
        long j47 = ((long) iArr2[i2 + 7]) & 4294967295L;
        long j57 = ((long) iArr[i]) & 4294967295L;
        long j58 = j57 * j2;
        iArr3[i3] = (int) j58;
        long j65 = (j57 * j3) + (j58 >>> 32);
        iArr3[i3 + 1] = (int) j65;
        long j69 = (j57 * j5) + (j65 >>> 32);
        iArr3[i3 + 2] = (int) j69;
        long j76 = (j57 * j16) + (j69 >>> 32);
        iArr3[i3 + 3] = (int) j76;
        long j85 = (j57 * j22) + (j76 >>> 32);
        iArr3[i3 + 4] = (int) j85;
        long j100 = (j57 * j42) + (j85 >>> 32);
        iArr3[i3 + 5] = (int) j100;
        long j101 = (j57 * j46) + (j100 >>> 32);
        iArr3[i3 + 6] = (int) j101;
        long j102 = (j57 * j47) + (j101 >>> 32);
        iArr3[i3 + 7] = (int) j102;
        iArr3[i3 + 8] = (int) (j102 >>> 32);
        int i5 = 1;
        int i6 = i3;
        while (i5 < 8) {
            int i21 = i6 + 1;
            int i22 = i6;
            long j103 = ((long) iArr[i + i5]) & 4294967295L;
            long j104 = (j103 * j2) + (((long) iArr3[i21]) & 4294967295L);
            iArr3[i21] = (int) j104;
            int i32 = i22 + 2;
            long j105 = (j103 * j3) + (((long) iArr3[i32]) & 4294967295L) + (j104 >>> 32);
            iArr3[i32] = (int) j105;
            int i33 = i22 + 3;
            long j106 = (j103 * j5) + (((long) iArr3[i33]) & 4294967295L) + (j105 >>> 32);
            iArr3[i33] = (int) j106;
            int i43 = i22 + 4;
            long j107 = (j103 * j16) + (((long) iArr3[i43]) & 4294967295L) + (j106 >>> 32);
            iArr3[i43] = (int) j107;
            int i59 = i22 + 5;
            long j108 = (j103 * j22) + (((long) iArr3[i59]) & 4294967295L) + (j107 >>> 32);
            iArr3[i59] = (int) j108;
            int i66 = i22 + 6;
            long j109 = (j103 * j42) + (((long) iArr3[i66]) & 4294967295L) + (j108 >>> 32);
            iArr3[i66] = (int) j109;
            int i74 = i22 + 7;
            long j110 = (j103 * j46) + (((long) iArr3[i74]) & 4294967295L) + (j109 >>> 32);
            iArr3[i74] = (int) j110;
            int i92 = i22 + 8;
            long j111 = (j103 * j47) + (((long) iArr3[i92]) & 4294967295L) + (j110 >>> 32);
            iArr3[i92] = (int) j111;
            iArr3[i22 + 9] = (int) (j111 >>> 32);
            i5++;
            i6 = i21;
        }
    }

    public static void mul128(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((long) iArr[0]) & 4294967295L;
        long j3 = ((long) iArr[1]) & 4294967295L;
        long j5 = ((long) iArr[2]) & 4294967295L;
        long j16 = ((long) iArr[3]) & 4294967295L;
        long j22 = ((long) iArr[4]) & 4294967295L;
        long j42 = ((long) iArr[5]) & 4294967295L;
        long j46 = ((long) iArr[6]) & 4294967295L;
        long j47 = ((long) iArr[7]) & 4294967295L;
        long j57 = ((long) iArr2[0]) & 4294967295L;
        long j58 = j57 * j2;
        iArr3[0] = (int) j58;
        long j65 = (j57 * j3) + (j58 >>> 32);
        iArr3[1] = (int) j65;
        long j69 = (j57 * j5) + (j65 >>> 32);
        iArr3[2] = (int) j69;
        long j76 = (j57 * j16) + (j69 >>> 32);
        iArr3[3] = (int) j76;
        long j85 = (j57 * j22) + (j76 >>> 32);
        iArr3[4] = (int) j85;
        long j100 = (j57 * j42) + (j85 >>> 32);
        iArr3[5] = (int) j100;
        long j101 = (j57 * j46) + (j100 >>> 32);
        iArr3[6] = (int) j101;
        long j102 = (j57 * j47) + (j101 >>> 32);
        iArr3[7] = (int) j102;
        iArr3[8] = (int) (j102 >>> 32);
        int i = 1;
        for (int i2 = 4; i < i2; i2 = 4) {
            long j103 = ((long) iArr2[i]) & 4294967295L;
            long j104 = j22;
            long j105 = (j103 * j2) + (((long) iArr3[i]) & 4294967295L);
            iArr3[i] = (int) j105;
            int i3 = i + 1;
            long j106 = (j103 * j3) + (((long) iArr3[i3]) & 4294967295L) + (j105 >>> 32);
            iArr3[i3] = (int) j106;
            int i5 = i + 2;
            long j107 = (j103 * j5) + (((long) iArr3[i5]) & 4294967295L) + (j106 >>> 32);
            iArr3[i5] = (int) j107;
            int i6 = i + 3;
            long j108 = (j103 * j16) + (((long) iArr3[i6]) & 4294967295L) + (j107 >>> 32);
            iArr3[i6] = (int) j108;
            int i21 = i + 4;
            long j109 = (j103 * j104) + (((long) iArr3[i21]) & 4294967295L) + (j108 >>> 32);
            iArr3[i21] = (int) j109;
            int i22 = i + 5;
            long j110 = (j103 * j42) + (((long) iArr3[i22]) & 4294967295L) + (j109 >>> 32);
            iArr3[i22] = (int) j110;
            int i32 = i + 6;
            long j111 = (j103 * j46) + (((long) iArr3[i32]) & 4294967295L) + (j110 >>> 32);
            iArr3[i32] = (int) j111;
            long j112 = j111 >>> 32;
            int i33 = i + 7;
            long j113 = (j103 * j47) + (((long) iArr3[i33]) & 4294967295L) + j112;
            iArr3[i33] = (int) j113;
            iArr3[i + 8] = (int) (j113 >>> 32);
            i = i3;
            j22 = j104;
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
        long j76 = (j2 * j69) + j58 + (((long) iArr2[i3 + 5]) & 4294967295L) + (j65 >>> 32);
        iArr3[i5 + 5] = (int) j76;
        long j85 = ((long) iArr[i2 + 6]) & 4294967295L;
        long j100 = (j2 * j85) + j69 + (((long) iArr2[i3 + 6]) & 4294967295L) + (j76 >>> 32);
        iArr3[i5 + 6] = (int) j100;
        long j101 = ((long) iArr[i2 + 7]) & 4294967295L;
        long j102 = (j2 * j101) + j85 + (4294967295L & ((long) iArr2[i3 + 7])) + (j100 >>> 32);
        iArr3[i5 + 7] = (int) j102;
        return (j102 >>> 32) + j101;
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
        return Nat.incAt(8, iArr, i2, 4);
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
        return Nat.incAt(8, iArr, i3, 3);
    }

    public static int mulAddTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j2 = ((long) iArr2[i2]) & 4294967295L;
        long j3 = ((long) iArr2[i2 + 1]) & 4294967295L;
        long j5 = ((long) iArr2[i2 + 2]) & 4294967295L;
        long j16 = ((long) iArr2[i2 + 3]) & 4294967295L;
        long j22 = ((long) iArr2[i2 + 4]) & 4294967295L;
        long j42 = ((long) iArr2[i2 + 5]) & 4294967295L;
        long j46 = ((long) iArr2[i2 + 6]) & 4294967295L;
        long j47 = ((long) iArr2[i2 + 7]) & 4294967295L;
        int i5 = i3;
        int i6 = 0;
        long j57 = 0;
        while (i6 < 8) {
            long j58 = j3;
            long j65 = ((long) iArr[i + i6]) & 4294967295L;
            long j69 = (j65 * j2) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j69;
            int i21 = i5 + 1;
            long j76 = (j65 * j58) + (((long) iArr3[i21]) & 4294967295L) + (j69 >>> 32);
            iArr3[i21] = (int) j76;
            int i22 = i5 + 2;
            int i32 = i6;
            long j85 = (j65 * j5) + (((long) iArr3[i22]) & 4294967295L) + (j76 >>> 32);
            iArr3[i22] = (int) j85;
            int i33 = i5 + 3;
            long j100 = (j65 * j16) + (((long) iArr3[i33]) & 4294967295L) + (j85 >>> 32);
            iArr3[i33] = (int) j100;
            int i43 = i5 + 4;
            long j101 = (j65 * j22) + (((long) iArr3[i43]) & 4294967295L) + (j100 >>> 32);
            iArr3[i43] = (int) j101;
            int i59 = i5 + 5;
            long j102 = (j65 * j42) + (((long) iArr3[i59]) & 4294967295L) + (j101 >>> 32);
            iArr3[i59] = (int) j102;
            int i66 = i5 + 6;
            long j103 = (j65 * j46) + (((long) iArr3[i66]) & 4294967295L) + (j102 >>> 32);
            iArr3[i66] = (int) j103;
            int i74 = i5 + 7;
            long j104 = (j65 * j47) + (((long) iArr3[i74]) & 4294967295L) + (j103 >>> 32);
            iArr3[i74] = (int) j104;
            int i92 = i5 + 8;
            long j105 = (j104 >>> 32) + (((long) iArr3[i92]) & 4294967295L) + j57;
            iArr3[i92] = (int) j105;
            j57 = j105 >>> 32;
            i6 = i32 + 1;
            j3 = j58;
            i5 = i21;
        }
        return (int) j57;
    }

    public static int mulByWord(int i, int[] iArr) {
        long j2 = ((long) i) & 4294967295L;
        long j3 = (((long) iArr[0]) & 4294967295L) * j2;
        iArr[0] = (int) j3;
        long j5 = ((((long) iArr[1]) & 4294967295L) * j2) + (j3 >>> 32);
        iArr[1] = (int) j5;
        long j16 = ((((long) iArr[2]) & 4294967295L) * j2) + (j5 >>> 32);
        iArr[2] = (int) j16;
        long j22 = ((((long) iArr[3]) & 4294967295L) * j2) + (j16 >>> 32);
        iArr[3] = (int) j22;
        long j42 = ((((long) iArr[4]) & 4294967295L) * j2) + (j22 >>> 32);
        iArr[4] = (int) j42;
        long j46 = ((((long) iArr[5]) & 4294967295L) * j2) + (j42 >>> 32);
        iArr[5] = (int) j46;
        long j47 = ((((long) iArr[6]) & 4294967295L) * j2) + (j46 >>> 32);
        iArr[6] = (int) j47;
        long j57 = (j2 * (4294967295L & ((long) iArr[7]))) + (j47 >>> 32);
        iArr[7] = (int) j57;
        return (int) (j57 >>> 32);
    }

    public static int mulByWordAddTo(int i, int[] iArr, int[] iArr2) {
        long j2 = ((long) i) & 4294967295L;
        long j3 = ((((long) iArr2[0]) & 4294967295L) * j2) + (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j3;
        long j5 = ((((long) iArr2[1]) & 4294967295L) * j2) + (((long) iArr[1]) & 4294967295L) + (j3 >>> 32);
        iArr2[1] = (int) j5;
        long j16 = ((((long) iArr2[2]) & 4294967295L) * j2) + (((long) iArr[2]) & 4294967295L) + (j5 >>> 32);
        iArr2[2] = (int) j16;
        long j22 = ((((long) iArr2[3]) & 4294967295L) * j2) + (((long) iArr[3]) & 4294967295L) + (j16 >>> 32);
        iArr2[3] = (int) j22;
        long j42 = ((((long) iArr2[4]) & 4294967295L) * j2) + (((long) iArr[4]) & 4294967295L) + (j22 >>> 32);
        iArr2[4] = (int) j42;
        long j46 = ((((long) iArr2[5]) & 4294967295L) * j2) + (((long) iArr[5]) & 4294967295L) + (j42 >>> 32);
        iArr2[5] = (int) j46;
        long j47 = ((((long) iArr2[6]) & 4294967295L) * j2) + (((long) iArr[6]) & 4294967295L) + (j46 >>> 32);
        iArr2[6] = (int) j47;
        long j57 = (j2 * (((long) iArr2[7]) & 4294967295L)) + (4294967295L & ((long) iArr[7])) + (j47 >>> 32);
        iArr2[7] = (int) j57;
        return (int) (j57 >>> 32);
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
        } while (i3 < 8);
        return (int) j3;
    }

    public static int mulWordAddTo(int i, int[] iArr, int i2, int[] iArr2, int i3) {
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
        long j46 = ((((long) iArr[i2 + 5]) & 4294967295L) * j2) + (((long) iArr2[i32]) & 4294967295L) + (j42 >>> 32);
        iArr2[i32] = (int) j46;
        int i33 = i3 + 6;
        long j47 = ((((long) iArr[i2 + 6]) & 4294967295L) * j2) + (((long) iArr2[i33]) & 4294967295L) + (j46 >>> 32);
        iArr2[i33] = (int) j47;
        int i43 = i3 + 7;
        long j57 = (j2 * (((long) iArr[i2 + 7]) & 4294967295L)) + (((long) iArr2[i43]) & 4294967295L) + (j47 >>> 32);
        iArr2[i43] = (int) j57;
        return (int) (j57 >>> 32);
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
        return Nat.incAt(8, iArr, i2, 3);
    }

    public static void square(int[] iArr, int i, int[] iArr2, int i2) {
        long j2 = ((long) iArr[i]) & 4294967295L;
        int i3 = 0;
        int i5 = 16;
        int i6 = 7;
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
                long j107 = jD3 & 4294967295L;
                long j108 = ((long) iArr[i + 4]) & 4294967295L;
                int i99 = i2 + 7;
                long j109 = (((long) iArr2[i99]) & 4294967295L) + (j106 >>> 32);
                long j110 = j106 & 4294967295L;
                int i100 = i2 + 8;
                long j111 = (((long) iArr2[i100]) & 4294967295L) + (j109 >>> 32);
                long j112 = j109 & 4294967295L;
                long j113 = (j108 * j2) + (jD2 & 4294967295L);
                int i101 = (int) j113;
                iArr2[i59] = (i96 >>> 31) | (i101 << 1);
                int i102 = i101 >>> 31;
                long jD4 = a.d(j108, j42, j113 >>> 32, j107);
                long jD5 = a.d(j108, j58, jD4 >>> 32, j110);
                long jD6 = a.d(j108, j100, jD5 >>> 32, j112);
                long j114 = jD5 & 4294967295L;
                long j115 = j111 + (jD6 >>> 32);
                long j116 = ((long) iArr[i + 5]) & 4294967295L;
                int i103 = i2 + 9;
                long j117 = (((long) iArr2[i103]) & 4294967295L) + (j115 >>> 32);
                long j118 = j115 & 4294967295L;
                int i104 = i2 + 10;
                long j119 = (((long) iArr2[i104]) & 4294967295L) + (j117 >>> 32);
                long j120 = j117 & 4294967295L;
                long j121 = (j116 * j2) + (jD4 & 4294967295L);
                int i105 = (int) j121;
                iArr2[i74] = i102 | (i105 << 1);
                int i106 = i105 >>> 31;
                long jD7 = a.d(j116, j42, j121 >>> 32, j114);
                long jD8 = a.d(j116, j58, jD7 >>> 32, jD6 & 4294967295L);
                long jD9 = a.d(j116, j100, jD8 >>> 32, j118);
                long j122 = jD8 & 4294967295L;
                long jD10 = a.d(j116, j108, jD9 >>> 32, j120);
                long j123 = j119 + (jD10 >>> 32);
                long j124 = jD10 & 4294967295L;
                long j125 = ((long) iArr[i + 6]) & 4294967295L;
                int i107 = i2 + 11;
                long j126 = (((long) iArr2[i107]) & 4294967295L) + (j123 >>> 32);
                long j127 = j123 & 4294967295L;
                int i108 = i2 + 12;
                long j128 = (((long) iArr2[i108]) & 4294967295L) + (j126 >>> 32);
                long j129 = j126 & 4294967295L;
                long j130 = (j125 * j2) + (jD7 & 4294967295L);
                int i109 = (int) j130;
                iArr2[i92] = (i109 << 1) | i106;
                int i110 = i109 >>> 31;
                long jD11 = a.d(j125, j42, j130 >>> 32, j122);
                long jD12 = a.d(j125, j58, jD11 >>> 32, jD9 & 4294967295L);
                long jD13 = a.d(j125, j100, jD12 >>> 32, j124);
                long j131 = jD12 & 4294967295L;
                long jD14 = a.d(j125, j108, jD13 >>> 32, j127);
                long j132 = jD13 & 4294967295L;
                long jD15 = a.d(j125, j116, jD14 >>> 32, j129);
                long j133 = jD14 & 4294967295L;
                long j134 = j128 + (jD15 >>> 32);
                long j135 = jD15 & 4294967295L;
                long j136 = ((long) iArr[i + 7]) & 4294967295L;
                int i111 = i2 + 13;
                long j137 = (((long) iArr2[i111]) & 4294967295L) + (j134 >>> 32);
                long j138 = j134 & 4294967295L;
                int i112 = i2 + 14;
                long j139 = (((long) iArr2[i112]) & 4294967295L) + (j137 >>> 32);
                long j140 = j137 & 4294967295L;
                long j141 = (j136 * j2) + (jD11 & 4294967295L);
                int i113 = (int) j141;
                iArr2[i99] = (i113 << 1) | i110;
                int i114 = i113 >>> 31;
                long jD16 = a.d(j136, j42, j141 >>> 32, j131);
                long jD17 = a.d(j136, j58, jD16 >>> 32, j132);
                long jD18 = a.d(j136, j100, jD17 >>> 32, j133);
                long jD19 = a.d(j136, j108, jD18 >>> 32, j135);
                long jD20 = a.d(j136, j116, jD19 >>> 32, j138);
                long jD21 = a.d(j136, j125, jD20 >>> 32, j140);
                long j142 = j139 + (jD21 >>> 32);
                int i115 = (int) jD16;
                iArr2[i100] = (i115 << 1) | i114;
                int i116 = (int) jD17;
                iArr2[i103] = (i115 >>> 31) | (i116 << 1);
                int i117 = i116 >>> 31;
                int i118 = (int) jD18;
                iArr2[i104] = i117 | (i118 << 1);
                int i119 = i118 >>> 31;
                int i120 = (int) jD19;
                iArr2[i107] = i119 | (i120 << 1);
                int i121 = i120 >>> 31;
                int i122 = (int) jD20;
                iArr2[i108] = i121 | (i122 << 1);
                int i123 = i122 >>> 31;
                int i124 = (int) jD21;
                iArr2[i111] = i123 | (i124 << 1);
                int i125 = i124 >>> 31;
                int i126 = (int) j142;
                iArr2[i112] = i125 | (i126 << 1);
                int i127 = i126 >>> 31;
                int i128 = i2 + 15;
                iArr2[i128] = i127 | ((iArr2[i128] + ((int) (j142 >>> 32))) << 1);
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
        long j46 = ((((long) iArr[i + 6]) & 4294967295L) - (((long) iArr2[i2 + 6]) & 4294967295L)) + (j42 >> 32);
        iArr3[i3 + 6] = (int) j46;
        long j47 = ((((long) iArr[i + 7]) & 4294967295L) - (((long) iArr2[i2 + 7]) & 4294967295L)) + (j46 >> 32);
        iArr3[i3 + 7] = (int) j47;
        return (int) (j47 >> 32);
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
        long j46 = (((((long) iArr3[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L)) - (((long) iArr2[6]) & 4294967295L)) + (j42 >> 32);
        iArr3[6] = (int) j46;
        long j47 = (((((long) iArr3[7]) & 4294967295L) - (((long) iArr[7]) & 4294967295L)) - (((long) iArr2[7]) & 4294967295L)) + (j46 >> 32);
        iArr3[7] = (int) j47;
        return (int) (j47 >> 32);
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
        int i32 = i2 + 6;
        long j46 = ((((long) iArr2[i32]) & 4294967295L) - (((long) iArr[i + 6]) & 4294967295L)) + (j42 >> 32);
        iArr2[i32] = (int) j46;
        int i33 = i2 + 7;
        long j47 = ((((long) iArr2[i33]) & 4294967295L) - (((long) iArr[i + 7]) & 4294967295L)) + (j46 >> 32);
        iArr2[i33] = (int) j47;
        return (int) (j47 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                Pack.intToBigEndian(i2, bArr, (7 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 4; i++) {
            long j2 = jArr[i];
            if (j2 != 0) {
                Pack.longToBigEndian(j2, bArr, (3 - i) << 3);
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
        iArr[6] = 0;
        iArr[7] = 0;
    }

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
        long j46 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (j42 >>> 32);
        iArr3[6] = (int) j46;
        long j47 = (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (j46 >>> 32);
        iArr3[7] = (int) j47;
        return (int) (j47 >>> 32);
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
        long j46 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (((long) iArr3[6]) & 4294967295L) + (j42 >>> 32);
        iArr3[6] = (int) j46;
        long j47 = (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (((long) iArr3[7]) & 4294967295L) + (j46 >>> 32);
        iArr3[7] = (int) j47;
        return (int) (j47 >>> 32);
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
        long j42 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (j22 >>> 32);
        iArr2[5] = (int) j42;
        long j46 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (j42 >>> 32);
        iArr2[6] = (int) j46;
        long j47 = (((long) iArr[7]) & 4294967295L) + (4294967295L & ((long) iArr2[7])) + (j46 >>> 32);
        iArr2[7] = (int) j47;
        return (int) (j47 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
        iArr2[7] = iArr[7];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
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
        long j46 = ((long) iArr2[6]) & 4294967295L;
        long j47 = ((long) iArr2[7]) & 4294967295L;
        long j57 = ((long) iArr[0]) & 4294967295L;
        long j58 = j57 * j2;
        iArr3[0] = (int) j58;
        long j65 = (j57 * j3) + (j58 >>> 32);
        iArr3[1] = (int) j65;
        long j69 = (j57 * j5) + (j65 >>> 32);
        iArr3[2] = (int) j69;
        long j76 = (j57 * j16) + (j69 >>> 32);
        iArr3[3] = (int) j76;
        long j85 = (j57 * j22) + (j76 >>> 32);
        iArr3[4] = (int) j85;
        long j100 = (j57 * j42) + (j85 >>> 32);
        iArr3[5] = (int) j100;
        long j101 = (j57 * j46) + (j100 >>> 32);
        iArr3[6] = (int) j101;
        long j102 = (j57 * j47) + (j101 >>> 32);
        iArr3[7] = (int) j102;
        int i = (int) (j102 >>> 32);
        iArr3[8] = i;
        int i2 = 1;
        for (int i3 = 8; i2 < i3; i3 = 8) {
            long j103 = ((long) iArr[i2]) & 4294967295L;
            long j104 = j22;
            long j105 = (j103 * j2) + (((long) iArr3[i2]) & 4294967295L);
            iArr3[i2] = (int) j105;
            int i5 = i2 + 1;
            long j106 = (j103 * j3) + (((long) iArr3[i5]) & 4294967295L) + (j105 >>> 32);
            iArr3[i5] = (int) j106;
            int i6 = i2 + 2;
            long j107 = (j103 * j5) + (((long) iArr3[i6]) & 4294967295L) + (j106 >>> 32);
            iArr3[i6] = (int) j107;
            int i21 = i2 + 3;
            long j108 = (j103 * j16) + (((long) iArr3[i21]) & 4294967295L) + (j107 >>> 32);
            iArr3[i21] = (int) j108;
            int i22 = i2 + 4;
            long j109 = (j103 * j104) + (((long) iArr3[i22]) & 4294967295L) + (j108 >>> 32);
            iArr3[i22] = (int) j109;
            int i32 = i2 + 5;
            long j110 = (j103 * j42) + (((long) iArr3[i32]) & 4294967295L) + (j109 >>> 32);
            iArr3[i32] = (int) j110;
            int i33 = i2 + 6;
            long j111 = (j103 * j46) + (((long) iArr3[i33]) & 4294967295L) + (j110 >>> 32);
            iArr3[i33] = (int) j111;
            long j112 = j111 >>> 32;
            int i43 = i2 + 7;
            long j113 = (j103 * j47) + (((long) iArr3[i43]) & 4294967295L) + j112;
            iArr3[i43] = (int) j113;
            iArr3[i2 + 8] = (int) (j113 >>> 32);
            i2 = i5;
            j22 = j104;
        }
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((long) iArr2[0]) & 4294967295L;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j5 = ((long) iArr2[2]) & 4294967295L;
        long j16 = ((long) iArr2[3]) & 4294967295L;
        long j22 = ((long) iArr2[4]) & 4294967295L;
        long j42 = ((long) iArr2[5]) & 4294967295L;
        long j46 = ((long) iArr2[6]) & 4294967295L;
        long j47 = ((long) iArr2[7]) & 4294967295L;
        long j57 = 0;
        int i = 0;
        while (i < 8) {
            long j58 = ((long) iArr[i]) & 4294967295L;
            long j65 = (j58 * j2) + (((long) iArr3[i]) & 4294967295L);
            int i2 = i;
            iArr3[i2] = (int) j65;
            int i3 = i2 + 1;
            long j69 = (j58 * j3) + (((long) iArr3[i3]) & 4294967295L) + (j65 >>> 32);
            iArr3[i3] = (int) j69;
            int i5 = i2 + 2;
            long j76 = (j58 * j5) + (((long) iArr3[i5]) & 4294967295L) + (j69 >>> 32);
            iArr3[i5] = (int) j76;
            int i6 = i2 + 3;
            long j85 = (j58 * j16) + (((long) iArr3[i6]) & 4294967295L) + (j76 >>> 32);
            iArr3[i6] = (int) j85;
            int i21 = i2 + 4;
            long j100 = (j58 * j22) + (((long) iArr3[i21]) & 4294967295L) + (j85 >>> 32);
            iArr3[i21] = (int) j100;
            int i22 = i2 + 5;
            long j101 = (j58 * j42) + (((long) iArr3[i22]) & 4294967295L) + (j100 >>> 32);
            iArr3[i22] = (int) j101;
            int i32 = i2 + 6;
            long j102 = (j58 * j46) + (((long) iArr3[i32]) & 4294967295L) + (j101 >>> 32);
            iArr3[i32] = (int) j102;
            int i33 = i2 + 7;
            long j103 = (j58 * j47) + (((long) iArr3[i33]) & 4294967295L) + (j102 >>> 32);
            iArr3[i33] = (int) j103;
            int i43 = i2 + 8;
            long j104 = (j103 >>> 32) + (((long) iArr3[i43]) & 4294967295L) + j57;
            iArr3[i43] = (int) j104;
            j57 = j104 >>> 32;
            i = i3;
        }
        return (int) j57;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j2 = ((long) iArr[0]) & 4294967295L;
        int i = 16;
        int i2 = 0;
        int i3 = 7;
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
                long j106 = jD3 & 4294967295L;
                long j107 = ((long) iArr[4]) & 4294967295L;
                long j108 = (((long) iArr2[7]) & 4294967295L) + (j105 >>> 32);
                long j109 = (((long) iArr2[8]) & 4294967295L) + (j108 >>> 32);
                long j110 = j108 & 4294967295L;
                long j111 = (j107 * j2) + (jD2 & 4294967295L);
                int i43 = (int) j111;
                iArr2[4] = i33 | (i43 << 1);
                long jD4 = a.d(j107, j42, j111 >>> 32, j106);
                long jD5 = a.d(j107, j57, jD4 >>> 32, j105 & 4294967295L);
                long jD6 = a.d(j107, j85, jD5 >>> 32, j110);
                long j112 = jD5 & 4294967295L;
                long j113 = j109 + (jD6 >>> 32);
                long j114 = jD6 & 4294967295L;
                long j115 = ((long) iArr[5]) & 4294967295L;
                long j116 = (((long) iArr2[9]) & 4294967295L) + (j113 >>> 32);
                long j117 = (((long) iArr2[10]) & 4294967295L) + (j116 >>> 32);
                long j118 = (j115 * j2) + (jD4 & 4294967295L);
                int i59 = (int) j118;
                iArr2[5] = (i43 >>> 31) | (i59 << 1);
                int i66 = i59 >>> 31;
                long jD7 = a.d(j115, j42, j118 >>> 32, j112);
                long jD8 = a.d(j115, j57, jD7 >>> 32, j114);
                long jD9 = a.d(j115, j85, jD8 >>> 32, j113 & 4294967295L);
                long j119 = jD8 & 4294967295L;
                long jD10 = a.d(j115, j107, jD9 >>> 32, j116 & 4294967295L);
                long j120 = jD9 & 4294967295L;
                long j121 = j117 + (jD10 >>> 32);
                long j122 = ((long) iArr[6]) & 4294967295L;
                long j123 = (((long) iArr2[11]) & 4294967295L) + (j121 >>> 32);
                long j124 = (((long) iArr2[12]) & 4294967295L) + (j123 >>> 32);
                long j125 = (j122 * j2) + (jD7 & 4294967295L);
                int i74 = (int) j125;
                iArr2[6] = i66 | (i74 << 1);
                int i92 = i74 >>> 31;
                long jD11 = a.d(j122, j42, j125 >>> 32, j119);
                long jD12 = a.d(j122, j57, jD11 >>> 32, j120);
                long jD13 = a.d(j122, j85, jD12 >>> 32, jD10 & 4294967295L);
                long j126 = jD12 & 4294967295L;
                long jD14 = a.d(j122, j107, jD13 >>> 32, j121 & 4294967295L);
                long j127 = jD13 & 4294967295L;
                long jD15 = a.d(j122, j115, jD14 >>> 32, j123 & 4294967295L);
                long j128 = j124 + (jD15 >>> 32);
                long j129 = ((long) iArr[7]) & 4294967295L;
                long j130 = (((long) iArr2[13]) & 4294967295L) + (j128 >>> 32);
                long j131 = (((long) iArr2[14]) & 4294967295L) + (j130 >>> 32);
                long j132 = j130 & 4294967295L;
                long j133 = (j129 * j2) + (jD11 & 4294967295L);
                int i96 = (int) j133;
                iArr2[7] = (i96 << 1) | i92;
                int i99 = i96 >>> 31;
                long jD16 = a.d(j129, j42, j133 >>> 32, j126);
                long jD17 = a.d(j129, j57, jD16 >>> 32, j127);
                long jD18 = a.d(j129, j85, jD17 >>> 32, jD14 & 4294967295L);
                long jD19 = a.d(j129, j107, jD18 >>> 32, jD15 & 4294967295L);
                long jD20 = a.d(j129, j115, jD19 >>> 32, j128 & 4294967295L);
                long jD21 = a.d(j129, j122, jD20 >>> 32, j132);
                long j134 = j131 + (jD21 >>> 32);
                int i100 = (int) jD16;
                iArr2[8] = (i100 << 1) | i99;
                int i101 = (int) jD17;
                iArr2[9] = (i100 >>> 31) | (i101 << 1);
                int i102 = i101 >>> 31;
                int i103 = (int) jD18;
                iArr2[10] = i102 | (i103 << 1);
                int i104 = i103 >>> 31;
                int i105 = (int) jD19;
                iArr2[11] = i104 | (i105 << 1);
                int i106 = i105 >>> 31;
                int i107 = (int) jD20;
                iArr2[12] = i106 | (i107 << 1);
                int i108 = i107 >>> 31;
                int i109 = (int) jD21;
                iArr2[13] = i108 | (i109 << 1);
                int i110 = i109 >>> 31;
                int i111 = (int) j134;
                iArr2[14] = i110 | (i111 << 1);
                iArr2[15] = ((iArr2[15] + ((int) (j134 >>> 32))) << 1) | (i111 >>> 31);
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
        long j46 = ((((long) iArr[6]) & 4294967295L) - (((long) iArr2[6]) & 4294967295L)) + (j42 >> 32);
        iArr3[6] = (int) j46;
        long j47 = ((((long) iArr[7]) & 4294967295L) - (((long) iArr2[7]) & 4294967295L)) + (j46 >> 32);
        iArr3[7] = (int) j47;
        return (int) (j47 >> 32);
    }

    public static int subFrom(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        long j2 = ((((long) iArr2[i2]) & 4294967295L) - (((long) iArr[i]) & 4294967295L)) + (((long) i3) & 4294967295L);
        iArr2[i2] = (int) j2;
        long j3 = j2 >> 32;
        int i5 = i2 + 1;
        long j5 = ((((long) iArr2[i5]) & 4294967295L) - (((long) iArr[i + 1]) & 4294967295L)) + j3;
        iArr2[i5] = (int) j5;
        int i6 = i2 + 2;
        long j16 = ((((long) iArr2[i6]) & 4294967295L) - (((long) iArr[i + 2]) & 4294967295L)) + (j5 >> 32);
        iArr2[i6] = (int) j16;
        int i21 = i2 + 3;
        long j22 = ((((long) iArr2[i21]) & 4294967295L) - (((long) iArr[i + 3]) & 4294967295L)) + (j16 >> 32);
        iArr2[i21] = (int) j22;
        int i22 = i2 + 4;
        long j42 = ((((long) iArr2[i22]) & 4294967295L) - (((long) iArr[i + 4]) & 4294967295L)) + (j22 >> 32);
        iArr2[i22] = (int) j42;
        int i32 = i2 + 5;
        long j46 = ((((long) iArr2[i32]) & 4294967295L) - (((long) iArr[i + 5]) & 4294967295L)) + (j42 >> 32);
        iArr2[i32] = (int) j46;
        int i33 = i2 + 6;
        long j47 = ((((long) iArr2[i33]) & 4294967295L) - (((long) iArr[i + 6]) & 4294967295L)) + (j46 >> 32);
        iArr2[i33] = (int) j47;
        int i43 = i2 + 7;
        long j57 = ((((long) iArr2[i43]) & 4294967295L) - (((long) iArr[i + 7]) & 4294967295L)) + (j47 >> 32);
        iArr2[i43] = (int) j57;
        return (int) (j57 >> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2, int i) {
        long j2 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) i) & 4294967295L);
        iArr2[0] = (int) j2;
        long j3 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j2 >>> 32);
        iArr2[1] = (int) j3;
        long j5 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j3 >>> 32);
        iArr2[2] = (int) j5;
        long j16 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j5 >>> 32);
        iArr2[3] = (int) j16;
        long j22 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (j16 >>> 32);
        iArr2[4] = (int) j22;
        long j42 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (j22 >>> 32);
        iArr2[5] = (int) j42;
        long j46 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (j42 >>> 32);
        iArr2[6] = (int) j46;
        long j47 = (((long) iArr[7]) & 4294967295L) + (4294967295L & ((long) iArr2[7])) + (j46 >>> 32);
        iArr2[7] = (int) j47;
        return (int) (j47 >>> 32);
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
        long j42 = ((((long) iArr2[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L)) + (j22 >> 32);
        iArr2[5] = (int) j42;
        long j46 = ((((long) iArr2[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L)) + (j42 >> 32);
        iArr2[6] = (int) j46;
        long j47 = ((((long) iArr2[7]) & 4294967295L) - (4294967295L & ((long) iArr[7]))) + (j46 >> 32);
        iArr2[7] = (int) j47;
        return (int) (j47 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2, int i) {
        long j2 = ((((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L)) + (((long) i) & 4294967295L);
        iArr2[0] = (int) j2;
        long j3 = ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j2 >> 32);
        iArr2[1] = (int) j3;
        long j5 = ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j3 >> 32);
        iArr2[2] = (int) j5;
        long j16 = ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) + (j5 >> 32);
        iArr2[3] = (int) j16;
        long j22 = ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) + (j16 >> 32);
        iArr2[4] = (int) j22;
        long j42 = ((((long) iArr2[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L)) + (j22 >> 32);
        iArr2[5] = (int) j42;
        long j46 = ((((long) iArr2[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L)) + (j42 >> 32);
        iArr2[6] = (int) j46;
        long j47 = ((((long) iArr2[7]) & 4294967295L) - (4294967295L & ((long) iArr[7]))) + (j46 >> 32);
        iArr2[7] = (int) j47;
        return (int) (j47 >> 32);
    }
}
