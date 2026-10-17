package org.bouncycastle.math.ec.rfc7748;

import ch.qos.logback.core.util.a;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.math.raw.Mod;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes14.dex */
public abstract class X25519Field {
    private static final int M24 = 16777215;
    private static final int M25 = 33554431;
    private static final int M26 = 67108863;
    private static final int[] P32 = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] ROOT_NEG_ONE = {-32595792, -7943725, 4688975, 3500415, 6194736, 33281959, -12573105, -1002827, 163343, 5703241};
    public static final int SIZE = 10;

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }

    public static void addOne(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    public static void apm(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            int i3 = iArr2[i];
            iArr3[i] = i2 + i3;
            iArr4[i] = i2 - i3;
        }
    }

    public static int areEqual(int[] iArr, int[] iArr2) {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            i |= iArr[i2] ^ iArr2[i2];
        }
        return ((i - 1) & (~i)) >> 31;
    }

    public static boolean areEqualVar(int[] iArr, int[] iArr2) {
        return areEqual(iArr, iArr2) != 0;
    }

    public static void carry(int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i21 = iArr[5];
        int i22 = iArr[6];
        int i32 = iArr[7];
        int i33 = iArr[8];
        int i43 = iArr[9];
        int i59 = i3 + (i2 >> 26);
        int i66 = i2 & M26;
        int i74 = i6 + (i5 >> 26);
        int i92 = i5 & M26;
        int i96 = i32 + (i22 >> 26);
        int i99 = i22 & M26;
        int i100 = i43 + (i33 >> 26);
        int i101 = i33 & M26;
        int i102 = i92 + (i59 >> 25);
        int i103 = i59 & M25;
        int i104 = i21 + (i74 >> 25);
        int i105 = i74 & M25;
        int i106 = i101 + (i96 >> 25);
        int i107 = i96 & M25;
        int i108 = ((i100 >> 25) * 38) + i;
        int i109 = i100 & M25;
        int i110 = i66 + (i108 >> 26);
        int i111 = i108 & M26;
        int i112 = i99 + (i104 >> 26);
        int i113 = i104 & M26;
        int i114 = i103 + (i110 >> 26);
        int i115 = i110 & M26;
        int i116 = i105 + (i102 >> 26);
        int i117 = i102 & M26;
        int i118 = i107 + (i112 >> 26);
        int i119 = i112 & M26;
        int i120 = i109 + (i106 >> 26);
        int i121 = i106 & M26;
        iArr[0] = i111;
        iArr[1] = i115;
        iArr[2] = i114;
        iArr[3] = i117;
        iArr[4] = i116;
        iArr[5] = i113;
        iArr[6] = i119;
        iArr[7] = i118;
        iArr[8] = i121;
        iArr[9] = i120;
    }

    public static void cmov(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        for (int i5 = 0; i5 < 10; i5++) {
            int i6 = i3 + i5;
            int i21 = iArr2[i6];
            iArr2[i6] = i21 ^ ((iArr[i2 + i5] ^ i21) & i);
        }
    }

    public static void cnegate(int i, int[] iArr) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 10; i3++) {
            iArr[i3] = (iArr[i3] ^ i2) - i2;
        }
    }

    public static void copy(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 0; i3 < 10; i3++) {
            iArr2[i2 + i3] = iArr[i + i3];
        }
    }

    public static int[] create() {
        return new int[10];
    }

    public static int[] createTable(int i) {
        return new int[i * 10];
    }

    public static void cswap(int i, int[] iArr, int[] iArr2) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 10; i3++) {
            int i5 = iArr[i3];
            int i6 = iArr2[i3];
            int i21 = (i5 ^ i6) & i2;
            iArr[i3] = i5 ^ i21;
            iArr2[i3] = i6 ^ i21;
        }
    }

    public static void decode(byte[] bArr, int i, int[] iArr) {
        decode255(bArr, i, iArr, 0);
    }

    private static void decode128(byte[] bArr, int i, int[] iArr, int i2) {
        int iDecode32 = decode32(bArr, i);
        int iDecode322 = decode32(bArr, i + 4);
        int iDecode323 = decode32(bArr, i + 8);
        int iDecode324 = decode32(bArr, i + 12);
        iArr[i2] = iDecode32 & M26;
        iArr[i2 + 1] = ((iDecode32 >>> 26) | (iDecode322 << 6)) & M26;
        iArr[i2 + 2] = ((iDecode322 >>> 20) | (iDecode323 << 12)) & M25;
        iArr[i2 + 3] = M26 & ((iDecode324 << 19) | (iDecode323 >>> 13));
        iArr[i2 + 4] = iDecode324 >>> 7;
    }

    public static void decode255(byte[] bArr, int i, int[] iArr, int i2) {
        decode128(bArr, i, iArr, i2);
        decode128(bArr, i + 16, iArr, i2 + 5);
        int i3 = i2 + 9;
        iArr[i3] = iArr[i3] & M24;
    }

    public static int decode32(byte[] bArr, int i) {
        return (bArr[i + 3] << Ascii.CAN) | (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public static void encode(int[] iArr, int i, byte[] bArr, int i2) {
        encode128(iArr, i, bArr, i2);
        encode128(iArr, i + 5, bArr, i2 + 16);
    }

    private static void encode128(int[] iArr, int i, byte[] bArr, int i2) {
        int i3 = iArr[i];
        int i5 = iArr[i + 1];
        int i6 = iArr[i + 2];
        int i21 = iArr[i + 3];
        int i22 = iArr[i + 4];
        encode32((i5 << 26) | i3, bArr, i2);
        encode32((i5 >>> 6) | (i6 << 20), bArr, i2 + 4);
        encode32((i6 >>> 12) | (i21 << 13), bArr, i2 + 8);
        encode32((i22 << 7) | (i21 >>> 19), bArr, i2 + 12);
    }

    private static void encode32(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static void inv(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        int[] iArr3 = new int[8];
        copy(iArr, 0, iArrCreate, 0);
        normalize(iArrCreate);
        encode(iArrCreate, iArr3, 0);
        Mod.modOddInverse(P32, iArr3, iArr3);
        decode255(iArr3, iArr2);
    }

    public static void invVar(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        int[] iArr3 = new int[8];
        copy(iArr, 0, iArrCreate, 0);
        normalize(iArrCreate);
        encode(iArrCreate, iArr3, 0);
        Mod.modOddInverseVar(P32, iArr3, iArr3);
        decode255(iArr3, iArr2);
    }

    public static int isOne(int[] iArr) {
        int i = iArr[0] ^ 1;
        for (int i2 = 1; i2 < 10; i2++) {
            i |= iArr[i2];
        }
        return ((i - 1) & (~i)) >> 31;
    }

    public static boolean isOneVar(int[] iArr) {
        return isOne(iArr) != 0;
    }

    public static int isZero(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            i |= iArr[i2];
        }
        return ((i - 1) & (~i)) >> 31;
    }

    public static boolean isZeroVar(int[] iArr) {
        return isZero(iArr) != 0;
    }

    public static void mul(int[] iArr, int i, int[] iArr2) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        int i21 = iArr[4];
        int i22 = iArr[5];
        int i32 = iArr[6];
        int i33 = iArr[7];
        int i43 = iArr[8];
        int i59 = iArr[9];
        long j2 = i;
        long j3 = ((long) i5) * j2;
        int i66 = ((int) j3) & M25;
        long j5 = j3 >> 25;
        long j16 = ((long) i21) * j2;
        int i74 = ((int) j16) & M25;
        long j22 = ((long) i33) * j2;
        int i92 = ((int) j22) & M25;
        long j42 = ((long) i59) * j2;
        int i96 = ((int) j42) & M25;
        long j46 = (((long) i2) * j2) + ((j42 >> 25) * 38);
        iArr2[0] = ((int) j46) & M26;
        long j47 = (((long) i22) * j2) + (j16 >> 25);
        iArr2[5] = ((int) j47) & M26;
        long j57 = (((long) i3) * j2) + (j46 >> 26);
        iArr2[1] = ((int) j57) & M26;
        long j58 = (((long) i6) * j2) + j5;
        iArr2[3] = ((int) j58) & M26;
        long j65 = (((long) i32) * j2) + (j47 >> 26);
        iArr2[6] = ((int) j65) & M26;
        long j69 = (((long) i43) * j2) + (j22 >> 25);
        iArr2[8] = ((int) j69) & M26;
        iArr2[2] = i66 + ((int) (j57 >> 26));
        iArr2[4] = i74 + ((int) (j58 >> 26));
        iArr2[7] = i92 + ((int) (j65 >> 26));
        iArr2[9] = i96 + ((int) (j69 >> 26));
    }

    public static void negate(int[] iArr, int[] iArr2) {
        for (int i = 0; i < 10; i++) {
            iArr2[i] = -iArr[i];
        }
    }

    public static void normalize(int[] iArr) {
        int i = (iArr[9] >>> 23) & 1;
        reduce(iArr, i);
        reduce(iArr, -i);
    }

    public static void one(int[] iArr) {
        iArr[0] = 1;
        for (int i = 1; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    private static void powPm5d8(int[] iArr, int[] iArr2, int[] iArr3) {
        sqr(iArr, iArr2);
        mul(iArr, iArr2, iArr2);
        int[] iArrCreate = create();
        sqr(iArr2, iArrCreate);
        mul(iArr, iArrCreate, iArrCreate);
        sqr(iArrCreate, 2, iArrCreate);
        mul(iArr2, iArrCreate, iArrCreate);
        int[] iArrCreate2 = create();
        sqr(iArrCreate, 5, iArrCreate2);
        mul(iArrCreate, iArrCreate2, iArrCreate2);
        int[] iArrCreate3 = create();
        sqr(iArrCreate2, 5, iArrCreate3);
        mul(iArrCreate, iArrCreate3, iArrCreate3);
        sqr(iArrCreate3, 10, iArrCreate);
        mul(iArrCreate2, iArrCreate, iArrCreate);
        sqr(iArrCreate, 25, iArrCreate2);
        mul(iArrCreate, iArrCreate2, iArrCreate2);
        sqr(iArrCreate2, 25, iArrCreate3);
        mul(iArrCreate, iArrCreate3, iArrCreate3);
        sqr(iArrCreate3, 50, iArrCreate);
        mul(iArrCreate2, iArrCreate, iArrCreate);
        sqr(iArrCreate, ISO781611.SMT_TAG, iArrCreate2);
        mul(iArrCreate, iArrCreate2, iArrCreate2);
        sqr(iArrCreate2, 2, iArrCreate);
        mul(iArrCreate, iArr, iArr3);
    }

    private static void reduce(int[] iArr, int i) {
        int i2 = iArr[9];
        int i3 = M24 & i2;
        long j2 = ((long) (((i2 >> 24) + i) * 19)) + ((long) iArr[0]);
        iArr[0] = ((int) j2) & M26;
        long j3 = (j2 >> 26) + ((long) iArr[1]);
        iArr[1] = ((int) j3) & M26;
        long j5 = (j3 >> 26) + ((long) iArr[2]);
        iArr[2] = ((int) j5) & M25;
        long j16 = (j5 >> 25) + ((long) iArr[3]);
        iArr[3] = ((int) j16) & M26;
        long j22 = (j16 >> 26) + ((long) iArr[4]);
        iArr[4] = ((int) j22) & M25;
        long j42 = (j22 >> 25) + ((long) iArr[5]);
        iArr[5] = ((int) j42) & M26;
        long j46 = (j42 >> 26) + ((long) iArr[6]);
        iArr[6] = ((int) j46) & M26;
        long j47 = (j46 >> 26) + ((long) iArr[7]);
        iArr[7] = M25 & ((int) j47);
        long j57 = (j47 >> 25) + ((long) iArr[8]);
        iArr[8] = M26 & ((int) j57);
        iArr[9] = i3 + ((int) (j57 >> 26));
    }

    public static void sqr(int[] iArr, int i, int[] iArr2) {
        sqr(iArr, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            } else {
                sqr(iArr2, iArr2);
            }
        }
    }

    public static boolean sqrtRatioVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreate = create();
        int[] iArrCreate2 = create();
        mul(iArr, iArr2, iArrCreate);
        sqr(iArr2, iArrCreate2);
        mul(iArrCreate, iArrCreate2, iArrCreate);
        sqr(iArrCreate2, iArrCreate2);
        mul(iArrCreate2, iArrCreate, iArrCreate2);
        int[] iArrCreate3 = create();
        int[] iArrCreate4 = create();
        powPm5d8(iArrCreate2, iArrCreate3, iArrCreate4);
        mul(iArrCreate4, iArrCreate, iArrCreate4);
        int[] iArrCreate5 = create();
        sqr(iArrCreate4, iArrCreate5);
        mul(iArrCreate5, iArr2, iArrCreate5);
        sub(iArrCreate5, iArr, iArrCreate3);
        normalize(iArrCreate3);
        if (isZeroVar(iArrCreate3)) {
            copy(iArrCreate4, 0, iArr3, 0);
            return true;
        }
        add(iArrCreate5, iArr, iArrCreate3);
        normalize(iArrCreate3);
        if (!isZeroVar(iArrCreate3)) {
            return false;
        }
        mul(iArrCreate4, ROOT_NEG_ONE, iArr3);
        return true;
    }

    public static void sub(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] - iArr2[i];
        }
    }

    public static void subOne(int[] iArr) {
        iArr[0] = iArr[0] - 1;
    }

    public static void zero(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    public static void addOne(int[] iArr, int i) {
        iArr[i] = iArr[i] + 1;
    }

    public static void decode(byte[] bArr, int i, int[] iArr, int i2) {
        decode255(bArr, i, iArr, i2);
    }

    private static void decode128(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = iArr[i];
        int i5 = iArr[i + 1];
        int i6 = iArr[i + 2];
        int i21 = iArr[i + 3];
        iArr2[i2] = i3 & M26;
        iArr2[i2 + 1] = ((i3 >>> 26) | (i5 << 6)) & M26;
        iArr2[i2 + 2] = ((i5 >>> 20) | (i6 << 12)) & M25;
        iArr2[i2 + 3] = M26 & ((i21 << 19) | (i6 >>> 13));
        iArr2[i2 + 4] = i21 >>> 7;
    }

    public static void decode255(byte[] bArr, int[] iArr) {
        decode255(bArr, 0, iArr, 0);
    }

    public static void encode(int[] iArr, byte[] bArr) {
        encode128(iArr, 0, bArr, 0);
        encode128(iArr, 5, bArr, 16);
    }

    private static void encode128(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = iArr[i];
        int i5 = iArr[i + 1];
        int i6 = iArr[i + 2];
        int i21 = iArr[i + 3];
        int i22 = iArr[i + 4];
        iArr2[i2] = (i5 << 26) | i3;
        iArr2[i2 + 1] = (i5 >>> 6) | (i6 << 20);
        iArr2[i2 + 2] = (i6 >>> 12) | (i21 << 13);
        iArr2[i2 + 3] = (i22 << 7) | (i21 >>> 19);
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i2 = iArr2[0];
        int i3 = iArr[1];
        int i5 = iArr2[1];
        int i6 = iArr[2];
        int i21 = iArr2[2];
        int i22 = iArr[3];
        int i32 = iArr2[3];
        int i33 = iArr[4];
        int i43 = iArr2[4];
        int i59 = iArr[5];
        int i66 = iArr2[5];
        int i74 = iArr[6];
        int i92 = iArr2[6];
        int i96 = iArr[7];
        int i99 = iArr2[7];
        int i100 = iArr[8];
        int i101 = iArr2[8];
        int i102 = iArr[9];
        int i103 = iArr2[9];
        long j2 = i;
        long j3 = i2;
        long j5 = j2 * j3;
        long j16 = i5;
        long j22 = j2 * j16;
        long j42 = i3;
        long j46 = (j42 * j3) + j22;
        long j47 = i21;
        long j57 = (j42 * j16) + (j2 * j47);
        long j58 = i6;
        long j65 = (j58 * j3) + j57;
        long j69 = ((j58 * j16) + (j42 * j47)) << 1;
        long j76 = i32;
        long j85 = j2 * j76;
        long j100 = i22;
        long jD = a.d(j100, j3, j85, j69);
        long j101 = (j58 * j47) << 1;
        long j102 = i43;
        long j103 = i33;
        long jD2 = a.d(j103, j3, (j100 * j16) + (j42 * j76) + (j2 * j102), j101);
        long j104 = ((j103 * j16) + ((j100 * j47) + ((j58 * j76) + (j42 * j102)))) << 1;
        long j105 = (j100 * j76) + (((j103 * j47) + (j58 * j102)) << 1);
        long j106 = (j103 * j76) + (j100 * j102);
        long j107 = (j103 * j102) << 1;
        long j108 = i59;
        long j109 = i66;
        long j110 = j108 * j109;
        long j111 = i92;
        long j112 = j108 * j111;
        long j113 = i74;
        long j114 = (j113 * j109) + j112;
        long j115 = i99;
        long j116 = (j113 * j111) + (j108 * j115);
        long j117 = i96;
        long j118 = i101;
        long j119 = j108 * j118;
        long j120 = i100;
        long jD3 = a.d(j120, j109, j119, ((j117 * j111) + (j113 * j115)) << 1);
        long j121 = i103;
        long j122 = (j120 * j111) + (j113 * j118) + (j108 * j121);
        long j123 = i102;
        long jD4 = a.d(j123, j109, j122, (j117 * j115) << 1);
        long j124 = j5 - (((j111 * j123) + ((j120 * j115) + ((j117 * j118) + (j113 * j121)))) * 76);
        long j125 = j46 - (((j120 * j118) + (((j115 * j123) + (j117 * j121)) << 1)) * 38);
        long j126 = j65 - (((j123 * j118) + (j120 * j121)) * 38);
        long j127 = jD - ((j121 * j123) * 76);
        long j128 = j104 - j110;
        long j129 = j105 - j114;
        long j130 = j106 - ((j117 * j109) + j116);
        long j131 = j107 - jD3;
        long j132 = i + i59;
        long j133 = i2 + i66;
        long j134 = j132 * j133;
        long j135 = i5 + i92;
        long j136 = j132 * j135;
        long j137 = i3 + i74;
        long j138 = (j137 * j133) + j136;
        long j139 = i21 + i99;
        long j140 = i6 + i96;
        long j141 = (j140 * j133) + (j137 * j135) + (j132 * j139);
        long j142 = ((j140 * j135) + (j137 * j139)) << 1;
        long j143 = i32 + i101;
        long j144 = i22 + i100;
        long jD5 = a.d(j144, j133, j132 * j143, j142);
        long j145 = i43 + i103;
        long j146 = i33 + i102;
        long jD6 = a.d(j146, j133, (j144 * j135) + (j137 * j143) + (j132 * j145), (j140 * j139) << 1);
        long j147 = ((j135 * j146) + ((j144 * j139) + ((j140 * j143) + (j137 * j145)))) << 1;
        long j148 = (j144 * j143) + (((j139 * j146) + (j140 * j145)) << 1);
        long j149 = (j146 * j143) + (j144 * j145);
        long j150 = (j145 * j146) << 1;
        long j151 = (jD5 - j127) + j131;
        int i104 = ((int) j151) & M26;
        long j152 = ((jD6 - jD2) - jD4) + (j151 >> 26);
        int i105 = ((int) j152) & M25;
        long j153 = ((((j152 >> 25) + j147) - j128) * 38) + j124;
        iArr3[0] = ((int) j153) & M26;
        long j154 = ((j148 - j129) * 38) + j125 + (j153 >> 26);
        iArr3[1] = ((int) j154) & M26;
        long j155 = ((j149 - j130) * 38) + j126 + (j154 >> 26);
        iArr3[2] = ((int) j155) & M25;
        long j156 = ((j150 - j131) * 38) + j127 + (j155 >> 25);
        iArr3[3] = ((int) j156) & M26;
        long jD7 = a.d(jD4, 38L, jD2, j156 >> 26);
        iArr3[4] = ((int) jD7) & M25;
        long j157 = (j134 - j124) + j128 + (jD7 >> 25);
        iArr3[5] = ((int) j157) & M26;
        long j158 = (j138 - j125) + j129 + (j157 >> 26);
        iArr3[6] = ((int) j158) & M26;
        long j159 = (j141 - j126) + j130 + (j158 >> 26);
        iArr3[7] = ((int) j159) & M25;
        long j160 = (j159 >> 25) + ((long) i104);
        iArr3[8] = ((int) j160) & M26;
        iArr3[9] = i105 + ((int) (j160 >> 26));
    }

    public static void sqr(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i21 = iArr[5];
        int i22 = iArr[6];
        int i32 = iArr[7];
        int i33 = iArr[8];
        int i43 = iArr[9];
        long j2 = i;
        long j3 = j2 * j2;
        long j5 = i2 * 2;
        long j16 = j2 * j5;
        long j22 = i3 * 2;
        long j42 = j2 * j22;
        long j46 = i2;
        long j47 = (j46 * j46) + j42;
        long j57 = i5 * 2;
        long j58 = (j2 * j57) + (j5 * j22);
        long j65 = i6 * 2;
        long j69 = (j46 * j57) + (j2 * j65) + (((long) i3) * j22);
        long j76 = (j22 * j57) + (j5 * j65);
        long j85 = j22 * j65;
        long j100 = i5;
        long j101 = (j100 * j100) + j85;
        long j102 = j100 * j65;
        long j103 = i21;
        long j104 = j103 * j103;
        long j105 = i22 * 2;
        long j106 = j103 * j105;
        long j107 = i32 * 2;
        long j108 = j103 * j107;
        long j109 = i22;
        long j110 = (j109 * j109) + j108;
        long j111 = j105 * j107;
        long j112 = i33 * 2;
        long j113 = i43 * 2;
        long j114 = (j109 * j112) + (j103 * j113) + (((long) i32) * j107);
        long j115 = (j107 * j112) + (j105 * j113);
        long j116 = j107 * j113;
        long j117 = i33;
        long j118 = j3 - (j115 * 38);
        long j119 = j16 - (((j117 * j117) + j116) * 38);
        long j120 = j47 - ((j117 * j113) * 38);
        long j121 = j58 - ((((long) i43) * j113) * 38);
        long j122 = j76 - j104;
        long j123 = j101 - j106;
        long j124 = j102 - j110;
        long j125 = (((long) i6) * j65) - ((j103 * j112) + j111);
        int i59 = i2 + i22;
        int i66 = i3 + i32;
        int i74 = i5 + i33;
        int i92 = i6 + i43;
        long j126 = i + i21;
        long j127 = i59 * 2;
        long j128 = j126 * j127;
        long j129 = i66 * 2;
        long j130 = i59;
        long j131 = (j130 * j130) + (j126 * j129);
        long j132 = i74 * 2;
        long j133 = i92 * 2;
        long j134 = i74;
        long j135 = ((long) i92) * j133;
        long j136 = (((j126 * j132) + (j127 * j129)) - j121) + j125;
        int i96 = ((int) j136) & M26;
        long j137 = ((((j130 * j132) + ((j126 * j133) + (((long) i66) * j129))) - j69) - j114) + (j136 >> 26);
        int i99 = ((int) j137) & M25;
        long j138 = ((((j137 >> 25) + ((j132 * j129) + (j127 * j133))) - j122) * 38) + j118;
        iArr2[0] = ((int) j138) & M26;
        long j139 = ((((j134 * j134) + (j129 * j133)) - j123) * 38) + j119 + (j138 >> 26);
        iArr2[1] = ((int) j139) & M26;
        long j140 = (((j134 * j133) - j124) * 38) + j120 + (j139 >> 26);
        iArr2[2] = ((int) j140) & M25;
        long j141 = ((j135 - j125) * 38) + j121 + (j140 >> 25);
        iArr2[3] = ((int) j141) & M26;
        long jD = a.d(j114, 38L, j69, j141 >> 26);
        iArr2[4] = ((int) jD) & M25;
        long j142 = ((j126 * j126) - j118) + j122 + (jD >> 25);
        iArr2[5] = ((int) j142) & M26;
        long j143 = (j128 - j119) + j123 + (j142 >> 26);
        iArr2[6] = ((int) j143) & M26;
        long j144 = (j131 - j120) + j124 + (j143 >> 26);
        iArr2[7] = ((int) j144) & M25;
        long j145 = (j144 >> 25) + ((long) i96);
        iArr2[8] = ((int) j145) & M26;
        iArr2[9] = i99 + ((int) (j145 >> 26));
    }

    public static void decode(byte[] bArr, int[] iArr) {
        decode255(bArr, 0, iArr, 0);
    }

    public static void decode255(int[] iArr, int i, int[] iArr2, int i2) {
        decode128(iArr, i, iArr2, i2);
        decode128(iArr, i + 4, iArr2, i2 + 5);
        int i3 = i2 + 9;
        iArr2[i3] = iArr2[i3] & M24;
    }

    public static void encode(int[] iArr, byte[] bArr, int i) {
        encode128(iArr, 0, bArr, i);
        encode128(iArr, 5, bArr, i + 16);
    }

    public static void decode(int[] iArr, int i, int[] iArr2) {
        decode255(iArr, i, iArr2, 0);
    }

    public static void decode255(int[] iArr, int[] iArr2) {
        decode255(iArr, 0, iArr2, 0);
    }

    public static void encode(int[] iArr, int[] iArr2, int i) {
        encode128(iArr, 0, iArr2, i);
        encode128(iArr, 5, iArr2, i + 4);
    }
}
