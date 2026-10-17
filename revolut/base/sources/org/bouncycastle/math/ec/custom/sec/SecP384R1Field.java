package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat384;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class SecP384R1Field {
    private static final long M = 4294967295L;
    private static final int P11 = -1;
    private static final int PExt23 = -1;
    static final int[] P = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] PExt = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] PExtInv = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && Nat.gte(12, iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(24, iArr, iArr2, iArr3) != 0 || (iArr3[23] == -1 && Nat.gte(24, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(24, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(12, iArr, iArr2) != 0 || (iArr2[11] == -1 && Nat.gte(12, iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j2 = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j2;
        long j3 = ((((long) iArr[1]) & 4294967295L) - 1) + (j2 >> 32);
        iArr[1] = (int) j3;
        long j5 = j3 >> 32;
        if (j5 != 0) {
            long j16 = j5 + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j16;
            j5 = j16 >> 32;
        }
        long j22 = (((long) iArr[3]) & 4294967295L) + 1 + j5;
        iArr[3] = (int) j22;
        long j42 = (4294967295L & ((long) iArr[4])) + 1 + (j22 >> 32);
        iArr[4] = (int) j42;
        if ((j42 >> 32) != 0) {
            Nat.incAt(12, iArr, 5);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat.fromBigInteger(384, bigInteger);
        if (iArrFromBigInteger[11] == -1) {
            int[] iArr = P;
            if (Nat.gte(12, iArrFromBigInteger, iArr)) {
                Nat.subFrom(12, iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(12, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(12, iArr2, Nat.add(12, iArr, P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        return Nat.equalToZero(12, iArr);
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreate = Nat.create(24);
        Nat384.mul(iArr, iArr2, iArrCreate);
        reduce(iArrCreate, iArr3);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat.sub(12, P, iArr, iArr2);
        } else {
            int[] iArr3 = P;
            Nat.sub(12, iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[48];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 12);
        } while (Nat.lessThan(12, iArr, P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j2 = ((long) iArr[16]) & 4294967295L;
        long j3 = ((long) iArr[17]) & 4294967295L;
        long j5 = ((long) iArr[18]) & 4294967295L;
        long j16 = ((long) iArr[19]) & 4294967295L;
        long j22 = ((long) iArr[20]) & 4294967295L;
        long j42 = ((long) iArr[21]) & 4294967295L;
        long j46 = ((long) iArr[22]) & 4294967295L;
        long j47 = ((long) iArr[23]) & 4294967295L;
        long j57 = ((((long) iArr[12]) & 4294967295L) + j22) - 1;
        long j58 = (((long) iArr[13]) & 4294967295L) + j46;
        long j65 = (((long) iArr[14]) & 4294967295L) + j46 + j47;
        long j69 = (((long) iArr[15]) & 4294967295L) + j47;
        long j76 = j3 + j42;
        long j85 = j42 - j47;
        long j100 = j46 - j47;
        long j101 = j57 + j85;
        long j102 = (((long) iArr[0]) & 4294967295L) + j101;
        iArr2[0] = (int) j102;
        long j103 = (((((long) iArr[1]) & 4294967295L) + j47) - j57) + j58 + (j102 >> 32);
        iArr2[1] = (int) j103;
        long j104 = (((((long) iArr[2]) & 4294967295L) - j42) - j58) + j65 + (j103 >> 32);
        iArr2[2] = (int) j104;
        long j105 = ((((long) iArr[3]) & 4294967295L) - j65) + j69 + j101 + (j104 >> 32);
        iArr2[3] = (int) j105;
        long j106 = (((((((long) iArr[4]) & 4294967295L) + j2) + j42) + j58) - j69) + j101 + (j105 >> 32);
        iArr2[4] = (int) j106;
        long j107 = ((((long) iArr[5]) & 4294967295L) - j2) + j58 + j65 + j76 + (j106 >> 32);
        iArr2[5] = (int) j107;
        long j108 = (((((long) iArr[6]) & 4294967295L) + j5) - j3) + j65 + j69 + (j107 >> 32);
        iArr2[6] = (int) j108;
        long j109 = ((((((long) iArr[7]) & 4294967295L) + j2) + j16) - j5) + j69 + (j108 >> 32);
        iArr2[7] = (int) j109;
        long j110 = (((((((long) iArr[8]) & 4294967295L) + j2) + j3) + j22) - j16) + (j109 >> 32);
        iArr2[8] = (int) j110;
        long j111 = (((((long) iArr[9]) & 4294967295L) + j5) - j22) + j76 + (j110 >> 32);
        iArr2[9] = (int) j111;
        long j112 = ((((((long) iArr[10]) & 4294967295L) + j5) + j16) - j85) + j100 + (j111 >> 32);
        iArr2[10] = (int) j112;
        long j113 = ((((((long) iArr[11]) & 4294967295L) + j16) + j22) - j100) + (j112 >> 32);
        iArr2[11] = (int) j113;
        reduce32((int) ((j113 >> 32) + 1), iArr2);
    }

    public static void reduce32(int i, int[] iArr) {
        long j2;
        if (i != 0) {
            long j3 = ((long) i) & 4294967295L;
            long j5 = (((long) iArr[0]) & 4294967295L) + j3;
            iArr[0] = (int) j5;
            long j16 = ((((long) iArr[1]) & 4294967295L) - j3) + (j5 >> 32);
            iArr[1] = (int) j16;
            long j22 = j16 >> 32;
            if (j22 != 0) {
                long j42 = j22 + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j42;
                j22 = j42 >> 32;
            }
            long j46 = (((long) iArr[3]) & 4294967295L) + j3 + j22;
            iArr[3] = (int) j46;
            long j47 = (4294967295L & ((long) iArr[4])) + j3 + (j46 >> 32);
            iArr[4] = (int) j47;
            j2 = j47 >> 32;
        } else {
            j2 = 0;
        }
        if ((j2 == 0 || Nat.incAt(12, iArr, 5) == 0) && !(iArr[11] == -1 && Nat.gte(12, iArr, P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreate = Nat.create(24);
        Nat384.square(iArr, iArrCreate);
        reduce(iArrCreate, iArr2);
    }

    public static void squareN(int[] iArr, int i, int[] iArr2) {
        int[] iArrCreate = Nat.create(24);
        Nat384.square(iArr, iArrCreate);
        while (true) {
            reduce(iArrCreate, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                Nat384.square(iArr2, iArrCreate);
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j2 = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j2;
        long j3 = (((long) iArr[1]) & 4294967295L) + 1 + (j2 >> 32);
        iArr[1] = (int) j3;
        long j5 = j3 >> 32;
        if (j5 != 0) {
            long j16 = j5 + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j16;
            j5 = j16 >> 32;
        }
        long j22 = ((((long) iArr[3]) & 4294967295L) - 1) + j5;
        iArr[3] = (int) j22;
        long j42 = ((4294967295L & ((long) iArr[4])) - 1) + (j22 >> 32);
        iArr[4] = (int) j42;
        if ((j42 >> 32) != 0) {
            Nat.decAt(12, iArr, 5);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(12, iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(24, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(24, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(12, iArr, 0, iArr2) != 0 || (iArr2[11] == -1 && Nat.gte(12, iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        Nat384.mul(iArr, iArr2, iArr4);
        reduce(iArr4, iArr3);
    }

    public static void square(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat384.square(iArr, iArr3);
        reduce(iArr3, iArr2);
    }

    public static void squareN(int[] iArr, int i, int[] iArr2, int[] iArr3) {
        Nat384.square(iArr, iArr3);
        while (true) {
            reduce(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                Nat384.square(iArr2, iArr3);
            }
        }
    }
}
