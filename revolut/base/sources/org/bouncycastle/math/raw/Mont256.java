package org.bouncycastle.math.raw;

import zsc.p;

/* JADX INFO: loaded from: classes14.dex */
public abstract class Mont256 {
    private static final long M = 4294967295L;

    public static int inverse32(int i) {
        int i2 = (2 - (i * i)) * i;
        int i3 = (2 - (i * i2)) * i2;
        int i5 = (2 - (i * i3)) * i3;
        return (2 - (i * i5)) * i5;
    }

    public static void multAdd(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        char c2 = 0;
        long j2 = 4294967295L;
        long j3 = ((long) iArr2[0]) & 4294967295L;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 8) {
            long j5 = ((long) iArr3[c2]) & j2;
            long j16 = ((long) iArr[i2]) & j2;
            long j22 = j16 * j3;
            long j42 = (j22 & j2) + j5;
            char c3 = c2;
            long j46 = j2;
            long j47 = ((long) (((int) j42) * i)) & j46;
            long j57 = (((long) iArr4[c3]) & j46) * j47;
            char c5 = p.SPACE_CHAR;
            long j58 = ((j42 + (j57 & j46)) >>> 32) + (j22 >>> 32) + (j57 >>> 32);
            int i5 = 1;
            while (i5 < 8) {
                long j65 = (((long) iArr2[i5]) & j46) * j16;
                char c6 = c5;
                long j69 = (((long) iArr4[i5]) & j46) * j47;
                long j76 = (j65 & j46) + (j69 & j46) + (((long) iArr3[i5]) & j46) + j58;
                iArr3[i5 - 1] = (int) j76;
                j58 = (j76 >>> c6) + (j65 >>> c6) + (j69 >>> c6);
                i5++;
                c5 = c6;
                j3 = j3;
                j47 = j47;
            }
            char c7 = c5;
            long j85 = j58 + (((long) i3) & j46);
            iArr3[7] = (int) j85;
            i3 = (int) (j85 >>> c7);
            i2++;
            c2 = c3;
            j2 = j46;
            j3 = j3;
        }
        if (i3 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr3, iArr4, iArr3);
        }
    }

    public static void multAddXF(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        char c2 = 0;
        long j2 = 4294967295L;
        long j3 = ((long) iArr2[0]) & 4294967295L;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= 8) {
                break;
            }
            long j5 = ((long) iArr[i]) & j2;
            long j16 = (j5 * j3) + (((long) iArr3[c2]) & j2);
            long j22 = j16 & j2;
            long j42 = (j16 >>> 32) + j22;
            int i3 = 1;
            for (int i5 = 8; i3 < i5; i5 = 8) {
                long j46 = j2;
                long j47 = (((long) iArr2[i3]) & j46) * j5;
                int i6 = i3;
                long j57 = (((long) iArr4[i3]) & j46) * j22;
                long j58 = (j47 & j46) + (j57 & j46) + (((long) iArr3[i6]) & j46) + j42;
                iArr3[i6 - 1] = (int) j58;
                j42 = (j58 >>> 32) + (j47 >>> 32) + (j57 >>> 32);
                i3 = i6 + 1;
                j2 = j46;
                j3 = j3;
            }
            long j65 = j42 + (((long) i2) & j2);
            iArr3[7] = (int) j65;
            i2 = (int) (j65 >>> 32);
            i++;
            j3 = j3;
            c2 = 0;
        }
        if (i2 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr3, iArr4, iArr3);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2, int i) {
        char c2 = 0;
        int i2 = 0;
        while (i2 < 8) {
            int i3 = iArr[c2];
            long j2 = ((long) (i3 * i)) & 4294967295L;
            long j3 = (((((long) iArr2[c2]) & 4294967295L) * j2) + (((long) i3) & 4294967295L)) >>> 32;
            int i5 = 1;
            while (i5 < 8) {
                long j5 = ((((long) iArr2[i5]) & 4294967295L) * j2) + (((long) iArr[i5]) & 4294967295L) + j3;
                iArr[i5 - 1] = (int) j5;
                j3 = j5 >>> 32;
                i5++;
                i2 = i2;
            }
            iArr[7] = (int) j3;
            i2++;
            c2 = 0;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }

    public static void reduceXF(int[] iArr, int[] iArr2) {
        for (int i = 0; i < 8; i++) {
            long j2 = ((long) iArr[0]) & 4294967295L;
            long j3 = j2;
            for (int i2 = 1; i2 < 8; i2++) {
                long j5 = ((((long) iArr2[i2]) & 4294967295L) * j2) + (((long) iArr[i2]) & 4294967295L) + j3;
                iArr[i2 - 1] = (int) j5;
                j3 = j5 >>> 32;
            }
            iArr[7] = (int) j3;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }
}
