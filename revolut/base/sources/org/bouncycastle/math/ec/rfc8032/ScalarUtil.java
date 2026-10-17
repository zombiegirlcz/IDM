package org.bouncycastle.math.ec.rfc8032;

import org.bouncycastle.util.Integers;
import zsc.p;

/* JADX INFO: loaded from: classes14.dex */
abstract class ScalarUtil {
    private static final long M = 4294967295L;

    public static void addShifted_NP(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i;
        int[] iArr5 = iArr3;
        char c2 = p.SPACE_CHAR;
        int i5 = 0;
        long j2 = 4294967295L;
        long j3 = 0;
        if (i2 == 0) {
            long j5 = 0;
            while (i5 <= i3) {
                long j16 = ((long) iArr5[i5]) & 4294967295L;
                long j22 = j3 + (((long) iArr[i5]) & 4294967295L) + j16;
                long j42 = j5 + j16 + (((long) iArr2[i5]) & 4294967295L);
                int i6 = (int) j42;
                j5 = j42 >>> 32;
                iArr5[i5] = i6;
                long j46 = j22 + (((long) i6) & 4294967295L);
                iArr[i5] = (int) j46;
                j3 = j46 >>> 32;
                i5++;
            }
            return;
        }
        if (i2 < 32) {
            int i21 = 0;
            long j47 = 0;
            long j57 = 0;
            int i22 = 0;
            int i32 = 0;
            while (i5 <= i3) {
                int i33 = iArr5[i5];
                char c3 = c2;
                int i43 = -i2;
                long j58 = j2;
                long j65 = j47 + (((long) iArr[i5]) & j58) + (((long) ((i21 >>> i43) | (i33 << i2))) & j58);
                int i59 = iArr2[i5];
                long j69 = j57 + (((long) i33) & j58) + (((long) ((i59 << i2) | (i22 >>> i43))) & j58);
                int i66 = (int) j69;
                j57 = j69 >>> c3;
                iArr5[i5] = i66;
                long j76 = j65 + (((long) ((i32 >>> i43) | (i66 << i2))) & j58);
                iArr[i5] = (int) j76;
                j47 = j76 >>> c3;
                i5++;
                i22 = i59;
                i32 = i66;
                i21 = i33;
                c2 = c3;
                j2 = j58;
            }
            return;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, i3);
        int i74 = i2 >>> 5;
        int i92 = i2 & 31;
        if (i92 == 0) {
            long j85 = 0;
            for (int i96 = i74; i96 <= i3; i96++) {
                int i99 = i96 - i74;
                long j100 = j3 + (((long) iArr[i96]) & 4294967295L) + (((long) iArr4[i99]) & 4294967295L);
                long j101 = j85 + (((long) iArr5[i96]) & 4294967295L) + (((long) iArr2[i99]) & 4294967295L);
                iArr5[i96] = (int) j101;
                j85 = j101 >>> 32;
                long j102 = j100 + (((long) iArr5[i99]) & 4294967295L);
                iArr[i96] = (int) j102;
                j3 = j102 >>> 32;
            }
            return;
        }
        int i100 = i74;
        int i101 = 0;
        int i102 = 0;
        long j103 = 0;
        while (i100 <= i3) {
            int i103 = i100 - i74;
            int i104 = iArr4[i103];
            int i105 = -i92;
            int i106 = i92;
            long j104 = j3 + (((long) iArr[i100]) & 4294967295L) + (((long) ((i5 >>> i105) | (i104 << i92))) & 4294967295L);
            int i107 = iArr2[i103];
            long j105 = j103 + (((long) iArr5[i100]) & 4294967295L) + (((long) ((i107 << i106) | (i101 >>> i105))) & 4294967295L);
            iArr3[i100] = (int) j105;
            j103 = j105 >>> 32;
            int i108 = iArr3[i103];
            long j106 = j104 + (((long) ((i108 << i106) | (i102 >>> i105))) & 4294967295L);
            iArr[i100] = (int) j106;
            j3 = j106 >>> 32;
            i100++;
            i92 = i106;
            iArr5 = iArr3;
            i102 = i108;
            i101 = i107;
            i5 = i104;
            i3 = i;
        }
    }

    public static void addShifted_UV(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i2 >>> 5;
        int i5 = i2 & 31;
        char c2 = p.SPACE_CHAR;
        long j2 = 4294967295L;
        long j3 = 0;
        if (i5 == 0) {
            long j5 = 0;
            for (int i6 = i3; i6 <= i; i6++) {
                long j16 = j3 + (((long) iArr[i6]) & 4294967295L);
                long j22 = j5 + (((long) iArr2[i6]) & 4294967295L);
                int i21 = i6 - i3;
                long j42 = j16 + (((long) iArr3[i21]) & 4294967295L);
                long j46 = j22 + (((long) iArr4[i21]) & 4294967295L);
                iArr[i6] = (int) j42;
                j3 = j42 >>> 32;
                iArr2[i6] = (int) j46;
                j5 = j46 >>> 32;
            }
            return;
        }
        int i22 = i3;
        int i32 = 0;
        int i33 = 0;
        long j47 = 0;
        while (i22 <= i) {
            int i43 = i22 - i3;
            int i59 = iArr3[i43];
            int i66 = iArr4[i43];
            char c3 = c2;
            int i74 = -i5;
            long j57 = j2;
            long j58 = j3 + (((long) iArr[i22]) & j57);
            long j65 = j58 + (((long) ((i32 >>> i74) | (i59 << i5))) & j57);
            long j69 = j47 + (((long) iArr2[i22]) & j57) + (((long) ((i33 >>> i74) | (i66 << i5))) & j57);
            iArr[i22] = (int) j65;
            j3 = j65 >>> c3;
            iArr2[i22] = (int) j69;
            j47 = j69 >>> c3;
            i22++;
            c2 = c3;
            i33 = i66;
            i32 = i59;
            j2 = j57;
        }
    }

    public static int getBitLength(int i, int[] iArr) {
        int i2 = iArr[i] >> 31;
        while (i > 0 && iArr[i] == i2) {
            i--;
        }
        return Integers.bitLength(iArr[i] ^ i2) + (i * 32);
    }

    public static int getBitLengthPositive(int i, int[] iArr) {
        while (i > 0 && iArr[i] == 0) {
            i--;
        }
        return Integers.bitLength(iArr[i]) + (i * 32);
    }

    public static boolean lessThanUnsigned(int i, int[] iArr, int[] iArr2) {
        do {
            int i2 = iArr[i] - Integer.MIN_VALUE;
            int i3 = iArr2[i] - Integer.MIN_VALUE;
            if (i2 < i3) {
                return true;
            }
            if (i2 > i3) {
                return false;
            }
            i--;
        } while (i >= 0);
        return false;
    }

    public static void subShifted_NP(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i;
        int[] iArr5 = iArr3;
        char c2 = p.SPACE_CHAR;
        int i5 = 0;
        long j2 = 4294967295L;
        long j3 = 0;
        if (i2 == 0) {
            long j5 = 0;
            while (i5 <= i3) {
                long j16 = ((long) iArr5[i5]) & 4294967295L;
                long j22 = (j3 + (((long) iArr[i5]) & 4294967295L)) - j16;
                long j42 = (j5 + j16) - (((long) iArr2[i5]) & 4294967295L);
                int i6 = (int) j42;
                j5 = j42 >> 32;
                iArr5[i5] = i6;
                long j46 = j22 - (((long) i6) & 4294967295L);
                iArr[i5] = (int) j46;
                j3 = j46 >> 32;
                i5++;
            }
            return;
        }
        if (i2 < 32) {
            int i21 = 0;
            long j47 = 0;
            long j57 = 0;
            int i22 = 0;
            int i32 = 0;
            while (i5 <= i3) {
                int i33 = iArr5[i5];
                char c3 = c2;
                int i43 = -i2;
                long j58 = j2;
                long j65 = (j47 + (((long) iArr[i5]) & j58)) - (((long) ((i21 >>> i43) | (i33 << i2))) & j58);
                int i59 = iArr2[i5];
                long j69 = (j57 + (((long) i33) & j58)) - (((long) ((i59 << i2) | (i22 >>> i43))) & j58);
                int i66 = (int) j69;
                j57 = j69 >> c3;
                iArr5[i5] = i66;
                long j76 = j65 - (((long) ((i32 >>> i43) | (i66 << i2))) & j58);
                iArr[i5] = (int) j76;
                j47 = j76 >> c3;
                i5++;
                i22 = i59;
                i32 = i66;
                i21 = i33;
                c2 = c3;
                j2 = j58;
            }
            return;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, i3);
        int i74 = i2 >>> 5;
        int i92 = i2 & 31;
        if (i92 == 0) {
            long j85 = 0;
            for (int i96 = i74; i96 <= i3; i96++) {
                int i99 = i96 - i74;
                long j100 = (j3 + (((long) iArr[i96]) & 4294967295L)) - (((long) iArr4[i99]) & 4294967295L);
                long j101 = (j85 + (((long) iArr5[i96]) & 4294967295L)) - (((long) iArr2[i99]) & 4294967295L);
                iArr5[i96] = (int) j101;
                j85 = j101 >> 32;
                long j102 = j100 - (((long) iArr5[i99]) & 4294967295L);
                iArr[i96] = (int) j102;
                j3 = j102 >> 32;
            }
            return;
        }
        int i100 = i74;
        int i101 = 0;
        int i102 = 0;
        long j103 = 0;
        while (i100 <= i3) {
            int i103 = i100 - i74;
            int i104 = iArr4[i103];
            int i105 = -i92;
            int i106 = i92;
            long j104 = (j3 + (((long) iArr[i100]) & 4294967295L)) - (((long) ((i5 >>> i105) | (i104 << i92))) & 4294967295L);
            int i107 = iArr2[i103];
            long j105 = (j103 + (((long) iArr5[i100]) & 4294967295L)) - (((long) ((i107 << i106) | (i101 >>> i105))) & 4294967295L);
            iArr3[i100] = (int) j105;
            j103 = j105 >> 32;
            int i108 = iArr3[i103];
            long j106 = j104 - (((long) ((i108 << i106) | (i102 >>> i105))) & 4294967295L);
            iArr[i100] = (int) j106;
            j3 = j106 >> 32;
            i100++;
            i92 = i106;
            iArr5 = iArr3;
            i102 = i108;
            i101 = i107;
            i5 = i104;
            i3 = i;
        }
    }

    public static void subShifted_UV(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i2 >>> 5;
        int i5 = i2 & 31;
        char c2 = p.SPACE_CHAR;
        long j2 = 4294967295L;
        long j3 = 0;
        if (i5 == 0) {
            long j5 = 0;
            for (int i6 = i3; i6 <= i; i6++) {
                long j16 = j3 + (((long) iArr[i6]) & 4294967295L);
                long j22 = j5 + (((long) iArr2[i6]) & 4294967295L);
                int i21 = i6 - i3;
                long j42 = j16 - (((long) iArr3[i21]) & 4294967295L);
                long j46 = j22 - (((long) iArr4[i21]) & 4294967295L);
                iArr[i6] = (int) j42;
                j3 = j42 >> 32;
                iArr2[i6] = (int) j46;
                j5 = j46 >> 32;
            }
            return;
        }
        int i22 = i3;
        int i32 = 0;
        int i33 = 0;
        long j47 = 0;
        while (i22 <= i) {
            int i43 = i22 - i3;
            int i59 = iArr3[i43];
            int i66 = iArr4[i43];
            char c3 = c2;
            int i74 = -i5;
            long j57 = j2;
            long j58 = j3 + (((long) iArr[i22]) & j57);
            long j65 = j58 - (((long) ((i32 >>> i74) | (i59 << i5))) & j57);
            long j69 = (j47 + (((long) iArr2[i22]) & j57)) - (((long) ((i33 >>> i74) | (i66 << i5))) & j57);
            iArr[i22] = (int) j65;
            j3 = j65 >> c3;
            iArr2[i22] = (int) j69;
            j47 = j69 >> c3;
            i22++;
            c2 = c3;
            i33 = i66;
            i32 = i59;
            j2 = j57;
        }
    }
}
