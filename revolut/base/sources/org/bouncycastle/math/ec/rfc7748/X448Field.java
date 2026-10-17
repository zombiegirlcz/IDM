package org.bouncycastle.math.ec.rfc7748;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.math.raw.Mod;
import org.jmrtd.PassportService;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes14.dex */
public abstract class X448Field {
    private static final int M28 = 268435455;
    private static final int[] P32 = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};
    public static final int SIZE = 16;
    private static final long U32 = 4294967295L;

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 16; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }

    public static void addOne(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    public static int areEqual(int[] iArr, int[] iArr2) {
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
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
        int i59 = iArr[10];
        int i66 = iArr[11];
        int i74 = iArr[12];
        int i92 = iArr[13];
        int i96 = iArr[14];
        int i99 = iArr[15];
        int i100 = i2 + (i >>> 28);
        int i101 = i & M28;
        int i102 = i21 + (i6 >>> 28);
        int i103 = i6 & M28;
        int i104 = i43 + (i33 >>> 28);
        int i105 = i33 & M28;
        int i106 = i92 + (i74 >>> 28);
        int i107 = i74 & M28;
        int i108 = i3 + (i100 >>> 28);
        int i109 = i100 & M28;
        int i110 = i22 + (i102 >>> 28);
        int i111 = i102 & M28;
        int i112 = i59 + (i104 >>> 28);
        int i113 = i104 & M28;
        int i114 = i96 + (i106 >>> 28);
        int i115 = i106 & M28;
        int i116 = i5 + (i108 >>> 28);
        int i117 = i108 & M28;
        int i118 = i32 + (i110 >>> 28);
        int i119 = i110 & M28;
        int i120 = i66 + (i112 >>> 28);
        int i121 = i112 & M28;
        int i122 = i99 + (i114 >>> 28);
        int i123 = i114 & M28;
        int i124 = i122 >>> 28;
        int i125 = i122 & M28;
        int i126 = i101 + i124;
        int i127 = i103 + (i116 >>> 28);
        int i128 = i116 & M28;
        int i129 = i105 + i124 + (i118 >>> 28);
        int i130 = i118 & M28;
        int i131 = i107 + (i120 >>> 28);
        int i132 = i120 & M28;
        int i133 = i109 + (i126 >>> 28);
        int i134 = i126 & M28;
        int i135 = i111 + (i127 >>> 28);
        int i136 = i127 & M28;
        int i137 = i113 + (i129 >>> 28);
        int i138 = i129 & M28;
        int i139 = i115 + (i131 >>> 28);
        int i140 = i131 & M28;
        iArr[0] = i134;
        iArr[1] = i133;
        iArr[2] = i117;
        iArr[3] = i128;
        iArr[4] = i136;
        iArr[5] = i135;
        iArr[6] = i119;
        iArr[7] = i130;
        iArr[8] = i138;
        iArr[9] = i137;
        iArr[10] = i121;
        iArr[11] = i132;
        iArr[12] = i140;
        iArr[13] = i139;
        iArr[14] = i123;
        iArr[15] = i125;
    }

    public static void cmov(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        for (int i5 = 0; i5 < 16; i5++) {
            int i6 = i3 + i5;
            int i21 = iArr2[i6];
            iArr2[i6] = i21 ^ ((iArr[i2 + i5] ^ i21) & i);
        }
    }

    public static void cnegate(int i, int[] iArr) {
        int[] iArrCreate = create();
        sub(iArrCreate, iArr, iArrCreate);
        cmov(-i, iArrCreate, 0, iArr, 0);
    }

    public static void copy(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 0; i3 < 16; i3++) {
            iArr2[i2 + i3] = iArr[i + i3];
        }
    }

    public static int[] create() {
        return new int[16];
    }

    public static int[] createTable(int i) {
        return new int[i * 16];
    }

    public static void cswap(int i, int[] iArr, int[] iArr2) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 16; i3++) {
            int i5 = iArr[i3];
            int i6 = iArr2[i3];
            int i21 = (i5 ^ i6) & i2;
            iArr[i3] = i5 ^ i21;
            iArr2[i3] = i6 ^ i21;
        }
    }

    public static void decode(byte[] bArr, int i, int[] iArr) {
        decode448(bArr, i, iArr, 0);
    }

    private static void decode224(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = iArr[i];
        int i5 = iArr[i + 1];
        int i6 = iArr[i + 2];
        int i21 = iArr[i + 3];
        int i22 = iArr[i + 4];
        int i32 = iArr[i + 5];
        int i33 = iArr[i + 6];
        iArr2[i2] = i3 & M28;
        iArr2[i2 + 1] = ((i3 >>> 28) | (i5 << 4)) & M28;
        iArr2[i2 + 2] = ((i5 >>> 24) | (i6 << 8)) & M28;
        iArr2[i2 + 3] = ((i6 >>> 20) | (i21 << 12)) & M28;
        iArr2[i2 + 4] = ((i21 >>> 16) | (i22 << 16)) & M28;
        iArr2[i2 + 5] = ((i22 >>> 12) | (i32 << 20)) & M28;
        iArr2[i2 + 6] = M28 & ((i32 >>> 8) | (i33 << 24));
        iArr2[i2 + 7] = i33 >>> 4;
    }

    private static int decode24(byte[] bArr, int i) {
        return ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16) | (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8);
    }

    public static int decode32(byte[] bArr, int i) {
        return (bArr[i + 3] << Ascii.CAN) | (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public static void decode448(byte[] bArr, int i, int[] iArr, int i2) {
        decode56(bArr, i, iArr, i2);
        decode56(bArr, i + 7, iArr, i2 + 2);
        decode56(bArr, i + 14, iArr, i2 + 4);
        decode56(bArr, i + 21, iArr, i2 + 6);
        decode56(bArr, i + 28, iArr, i2 + 8);
        decode56(bArr, i + 35, iArr, i2 + 10);
        decode56(bArr, i + 42, iArr, i2 + 12);
        decode56(bArr, i + 49, iArr, i2 + 14);
    }

    private static void decode56(byte[] bArr, int i, int[] iArr, int i2) {
        int iDecode32 = decode32(bArr, i);
        int iDecode24 = decode24(bArr, i + 4);
        iArr[i2] = M28 & iDecode32;
        iArr[i2 + 1] = (iDecode24 << 4) | (iDecode32 >>> 28);
    }

    public static void encode(int[] iArr, int i, byte[] bArr, int i2) {
        encode56(iArr, i, bArr, i2);
        encode56(iArr, i + 2, bArr, i2 + 7);
        encode56(iArr, i + 4, bArr, i2 + 14);
        encode56(iArr, i + 6, bArr, i2 + 21);
        encode56(iArr, i + 8, bArr, i2 + 28);
        encode56(iArr, i + 10, bArr, i2 + 35);
        encode56(iArr, i + 12, bArr, i2 + 42);
        encode56(iArr, i + 14, bArr, i2 + 49);
    }

    private static void encode224(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = iArr[i];
        int i5 = iArr[i + 1];
        int i6 = iArr[i + 2];
        int i21 = iArr[i + 3];
        int i22 = iArr[i + 4];
        int i32 = iArr[i + 5];
        int i33 = iArr[i + 6];
        int i43 = iArr[i + 7];
        iArr2[i2] = (i5 << 28) | i3;
        iArr2[i2 + 1] = (i5 >>> 4) | (i6 << 24);
        iArr2[i2 + 2] = (i6 >>> 8) | (i21 << 20);
        iArr2[i2 + 3] = (i21 >>> 12) | (i22 << 16);
        iArr2[i2 + 4] = (i22 >>> 16) | (i32 << 12);
        iArr2[i2 + 5] = (i32 >>> 20) | (i33 << 8);
        iArr2[i2 + 6] = (i43 << 4) | (i33 >>> 24);
    }

    private static void encode24(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
    }

    private static void encode32(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private static void encode56(int[] iArr, int i, byte[] bArr, int i2) {
        int i3 = iArr[i];
        int i5 = iArr[i + 1];
        encode32((i5 << 28) | i3, bArr, i2);
        encode24(i5 >>> 4, bArr, i2 + 4);
    }

    public static void inv(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        int[] iArr3 = new int[14];
        copy(iArr, 0, iArrCreate, 0);
        normalize(iArrCreate);
        encode(iArrCreate, iArr3, 0);
        Mod.modOddInverse(P32, iArr3, iArr3);
        decode448(iArr3, iArr2);
    }

    public static void invVar(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        int[] iArr3 = new int[14];
        copy(iArr, 0, iArrCreate, 0);
        normalize(iArrCreate);
        encode(iArrCreate, iArr3, 0);
        Mod.modOddInverseVar(P32, iArr3, iArr3);
        decode448(iArr3, iArr2);
    }

    public static int isOne(int[] iArr) {
        int i = iArr[0] ^ 1;
        for (int i2 = 1; i2 < 16; i2++) {
            i |= iArr[i2];
        }
        return ((i - 1) & (~i)) >> 31;
    }

    public static boolean isOneVar(int[] iArr) {
        return isOne(iArr) != 0;
    }

    public static int isZero(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
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
        int i66 = iArr[10];
        int i74 = iArr[11];
        int i92 = iArr[12];
        int i96 = iArr[13];
        int i99 = iArr[14];
        int i100 = iArr[15];
        long j2 = i;
        long j3 = ((long) i3) * j2;
        int i101 = ((int) j3) & M28;
        long j5 = j3 >>> 28;
        long j16 = ((long) i22) * j2;
        int i102 = ((int) j16) & M28;
        long j22 = j16 >>> 28;
        long j42 = ((long) i59) * j2;
        int i103 = ((int) j42) & M28;
        long j46 = j42 >>> 28;
        long j47 = ((long) i96) * j2;
        int i104 = ((int) j47) & M28;
        long j57 = j47 >>> 28;
        long j58 = (((long) i5) * j2) + j5;
        iArr2[2] = ((int) j58) & M28;
        long j65 = j58 >>> 28;
        long j69 = (((long) i32) * j2) + j22;
        iArr2[6] = ((int) j69) & M28;
        long j76 = j69 >>> 28;
        long j85 = (((long) i66) * j2) + j46;
        iArr2[10] = ((int) j85) & M28;
        long j100 = (((long) i99) * j2) + j57;
        iArr2[14] = ((int) j100) & M28;
        long j101 = j100 >>> 28;
        long j102 = (((long) i6) * j2) + j65;
        iArr2[3] = ((int) j102) & M28;
        long j103 = (((long) i33) * j2) + j76;
        iArr2[7] = ((int) j103) & M28;
        long j104 = (((long) i74) * j2) + (j85 >>> 28);
        iArr2[11] = ((int) j104) & M28;
        long j105 = j104 >>> 28;
        long j106 = (((long) i100) * j2) + j101;
        iArr2[15] = ((int) j106) & M28;
        long j107 = j106 >>> 28;
        long j108 = (((long) i21) * j2) + (j102 >>> 28);
        iArr2[4] = ((int) j108) & M28;
        long j109 = j108 >>> 28;
        long j110 = (((long) i43) * j2) + (j103 >>> 28) + j107;
        iArr2[8] = ((int) j110) & M28;
        long j111 = (((long) i92) * j2) + j105;
        iArr2[12] = ((int) j111) & M28;
        long j112 = j111 >>> 28;
        long j113 = (((long) i2) * j2) + j107;
        iArr2[0] = ((int) j113) & M28;
        iArr2[1] = i101 + ((int) (j113 >>> 28));
        iArr2[5] = i102 + ((int) j109);
        iArr2[9] = i103 + ((int) (j110 >>> 28));
        iArr2[13] = i104 + ((int) j112);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        sub(create(), iArr, iArr2);
    }

    public static void normalize(int[] iArr) {
        reduce(iArr, 1);
        reduce(iArr, -1);
    }

    public static void one(int[] iArr) {
        iArr[0] = 1;
        for (int i = 1; i < 16; i++) {
            iArr[i] = 0;
        }
    }

    private static void powPm3d4(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        sqr(iArr, iArrCreate);
        mul(iArr, iArrCreate, iArrCreate);
        int[] iArrCreate2 = create();
        sqr(iArrCreate, iArrCreate2);
        mul(iArr, iArrCreate2, iArrCreate2);
        int[] iArrCreate3 = create();
        sqr(iArrCreate2, 3, iArrCreate3);
        mul(iArrCreate2, iArrCreate3, iArrCreate3);
        int[] iArrCreate4 = create();
        sqr(iArrCreate3, 3, iArrCreate4);
        mul(iArrCreate2, iArrCreate4, iArrCreate4);
        int[] iArrCreate5 = create();
        sqr(iArrCreate4, 9, iArrCreate5);
        mul(iArrCreate4, iArrCreate5, iArrCreate5);
        int[] iArrCreate6 = create();
        sqr(iArrCreate5, iArrCreate6);
        mul(iArr, iArrCreate6, iArrCreate6);
        int[] iArrCreate7 = create();
        sqr(iArrCreate6, 18, iArrCreate7);
        mul(iArrCreate5, iArrCreate7, iArrCreate7);
        int[] iArrCreate8 = create();
        sqr(iArrCreate7, 37, iArrCreate8);
        mul(iArrCreate7, iArrCreate8, iArrCreate8);
        int[] iArrCreate9 = create();
        sqr(iArrCreate8, 37, iArrCreate9);
        mul(iArrCreate7, iArrCreate9, iArrCreate9);
        int[] iArrCreate10 = create();
        sqr(iArrCreate9, LDSFile.EF_DG15_TAG, iArrCreate10);
        mul(iArrCreate9, iArrCreate10, iArrCreate10);
        int[] iArrCreate11 = create();
        sqr(iArrCreate10, iArrCreate11);
        mul(iArr, iArrCreate11, iArrCreate11);
        int[] iArrCreate12 = create();
        sqr(iArrCreate11, PassportService.DEFAULT_MAX_BLOCKSIZE, iArrCreate12);
        mul(iArrCreate12, iArrCreate10, iArr2);
    }

    private static void reduce(int[] iArr, int i) {
        int i2;
        int i3 = iArr[15];
        int i5 = i3 & M28;
        long j2 = (i3 >>> 28) + i;
        int i6 = 0;
        long j3 = j2;
        while (true) {
            if (i6 >= 8) {
                break;
            }
            long j5 = j3 + (4294967295L & ((long) iArr[i6]));
            iArr[i6] = ((int) j5) & M28;
            j3 = j5 >> 28;
            i6++;
        }
        long j16 = j3 + j2;
        for (i2 = 8; i2 < 15; i2++) {
            long j22 = j16 + (((long) iArr[i2]) & 4294967295L);
            iArr[i2] = ((int) j22) & M28;
            j16 = j22 >> 28;
        }
        iArr[15] = i5 + ((int) j16);
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
        sqr(iArr, iArrCreate);
        mul(iArrCreate, iArr2, iArrCreate);
        sqr(iArrCreate, iArrCreate2);
        mul(iArrCreate, iArr, iArrCreate);
        mul(iArrCreate2, iArr, iArrCreate2);
        mul(iArrCreate2, iArr2, iArrCreate2);
        int[] iArrCreate3 = create();
        powPm3d4(iArrCreate2, iArrCreate3);
        mul(iArrCreate3, iArrCreate, iArrCreate3);
        int[] iArrCreate4 = create();
        sqr(iArrCreate3, iArrCreate4);
        mul(iArrCreate4, iArr2, iArrCreate4);
        sub(iArr, iArrCreate4, iArrCreate4);
        normalize(iArrCreate4);
        if (!isZeroVar(iArrCreate4)) {
            return false;
        }
        copy(iArrCreate3, 0, iArr3, 0);
        return true;
    }

    public static void sub(int[] iArr, int[] iArr2, int[] iArr3) {
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
        int i59 = iArr[10];
        int i66 = iArr[11];
        int i74 = iArr[12];
        int i92 = iArr[13];
        int i96 = iArr[14];
        int i99 = iArr[15];
        int i100 = iArr2[0];
        int i101 = iArr2[1];
        int i102 = iArr2[2];
        int i103 = iArr2[3];
        int i104 = iArr2[4];
        int i105 = iArr2[5];
        int i106 = iArr2[6];
        int i107 = iArr2[7];
        int i108 = iArr2[8];
        int i109 = iArr2[9];
        int i110 = iArr2[10];
        int i111 = iArr2[11];
        int i112 = iArr2[12];
        int i113 = iArr2[13];
        int i114 = iArr2[14];
        int i115 = (i2 + 536870910) - i101;
        int i116 = (i21 + 536870910) - i105;
        int i117 = (i43 + 536870910) - i109;
        int i118 = (i92 + 536870910) - i113;
        int i119 = (i99 + 536870910) - iArr2[15];
        int i120 = ((i3 + 536870910) - i102) + (i115 >>> 28);
        int i121 = i115 & M28;
        int i122 = ((i22 + 536870910) - i106) + (i116 >>> 28);
        int i123 = i116 & M28;
        int i124 = ((i59 + 536870910) - i110) + (i117 >>> 28);
        int i125 = i117 & M28;
        int i126 = ((i96 + 536870910) - i114) + (i118 >>> 28);
        int i127 = i118 & M28;
        int i128 = ((i5 + 536870910) - i103) + (i120 >>> 28);
        int i129 = i120 & M28;
        int i130 = ((i32 + 536870910) - i107) + (i122 >>> 28);
        int i131 = i122 & M28;
        int i132 = ((i66 + 536870910) - i111) + (i124 >>> 28);
        int i133 = i124 & M28;
        int i134 = i119 + (i126 >>> 28);
        int i135 = i126 & M28;
        int i136 = i134 >>> 28;
        int i137 = i134 & M28;
        int i138 = ((i + 536870910) - i100) + i136;
        int i139 = ((i6 + 536870910) - i104) + (i128 >>> 28);
        int i140 = i128 & M28;
        int i141 = ((i33 + 536870908) - i108) + i136 + (i130 >>> 28);
        int i142 = i130 & M28;
        int i143 = ((i74 + 536870910) - i112) + (i132 >>> 28);
        int i144 = i132 & M28;
        int i145 = i121 + (i138 >>> 28);
        int i146 = i138 & M28;
        int i147 = i123 + (i139 >>> 28);
        int i148 = i139 & M28;
        int i149 = i125 + (i141 >>> 28);
        int i150 = i141 & M28;
        int i151 = i127 + (i143 >>> 28);
        int i152 = i143 & M28;
        iArr3[0] = i146;
        iArr3[1] = i145;
        iArr3[2] = i129;
        iArr3[3] = i140;
        iArr3[4] = i148;
        iArr3[5] = i147;
        iArr3[6] = i131;
        iArr3[7] = i142;
        iArr3[8] = i150;
        iArr3[9] = i149;
        iArr3[10] = i133;
        iArr3[11] = i144;
        iArr3[12] = i152;
        iArr3[13] = i151;
        iArr3[14] = i135;
        iArr3[15] = i137;
    }

    public static void subOne(int[] iArr) {
        int[] iArrCreate = create();
        iArrCreate[0] = 1;
        sub(iArr, iArrCreate, iArr);
    }

    public static void zero(int[] iArr) {
        for (int i = 0; i < 16; i++) {
            iArr[i] = 0;
        }
    }

    public static void addOne(int[] iArr, int i) {
        iArr[i] = iArr[i] + 1;
    }

    public static void decode(byte[] bArr, int i, int[] iArr, int i2) {
        decode448(bArr, i, iArr, i2);
    }

    public static void decode448(byte[] bArr, int[] iArr) {
        decode448(bArr, 0, iArr, 0);
    }

    public static void encode(int[] iArr, byte[] bArr) {
        encode56(iArr, 0, bArr, 0);
        encode56(iArr, 2, bArr, 7);
        encode56(iArr, 4, bArr, 14);
        encode56(iArr, 6, bArr, 21);
        encode56(iArr, 8, bArr, 28);
        encode56(iArr, 10, bArr, 35);
        encode56(iArr, 12, bArr, 42);
        encode56(iArr, 14, bArr, 49);
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
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
        int i59 = iArr[10];
        int i66 = iArr[11];
        int i74 = iArr[12];
        int i92 = iArr[13];
        int i96 = iArr[14];
        int i99 = iArr[15];
        int i100 = iArr2[0];
        int i101 = iArr2[1];
        int i102 = iArr2[2];
        int i103 = iArr2[3];
        int i104 = iArr2[4];
        int i105 = iArr2[5];
        int i106 = iArr2[6];
        int i107 = iArr2[7];
        int i108 = iArr2[8];
        int i109 = iArr2[9];
        int i110 = iArr2[10];
        int i111 = iArr2[11];
        int i112 = iArr2[12];
        int i113 = iArr2[13];
        int i114 = iArr2[14];
        int i115 = iArr2[15];
        int i116 = i + i33;
        int i117 = i2 + i43;
        int i118 = i3 + i59;
        int i119 = i5 + i66;
        int i120 = i6 + i74;
        int i121 = i21 + i92;
        int i122 = i22 + i96;
        int i123 = i32 + i99;
        int i124 = i100 + i108;
        int i125 = i101 + i109;
        int i126 = i102 + i110;
        int i127 = i103 + i111;
        int i128 = i104 + i112;
        int i129 = i105 + i113;
        int i130 = i106 + i114;
        int i131 = i107 + i115;
        long j2 = i;
        long j3 = i100;
        long j5 = j2 * j3;
        long j16 = i32;
        long j22 = i101;
        long j42 = j16 * j22;
        long j46 = i22;
        long j47 = i102;
        long j57 = (j46 * j47) + j42;
        long j58 = i21;
        long j65 = i103;
        long j69 = i6;
        long j76 = i104;
        long j85 = i5;
        long j100 = i105;
        long j101 = (j85 * j100) + (j69 * j76) + (j58 * j65) + j57;
        long j102 = i3;
        long j103 = i106;
        long j104 = i2;
        long j105 = i107;
        long j106 = j104 * j105;
        long j107 = i33;
        long j108 = i108;
        long j109 = j107 * j108;
        long j110 = i99;
        long j111 = i109;
        long j112 = j110 * j111;
        long j113 = i96;
        long j114 = i110;
        long j115 = (j113 * j114) + j112;
        long j116 = i92;
        long j117 = i111;
        long j118 = (j116 * j117) + j115;
        long j119 = i74;
        long j120 = i112;
        long j121 = (j119 * j120) + j118;
        long j122 = i66;
        long j123 = i113;
        long j124 = (j122 * j123) + j121;
        long j125 = i59;
        long j126 = i114;
        long j127 = (j125 * j126) + j124;
        long j128 = i43;
        long j129 = i115;
        long j130 = (j128 * j129) + j127;
        long j131 = i116;
        long j132 = i124;
        long j133 = j131 * j132;
        long j134 = i123;
        long j135 = i125;
        long j136 = j134 * j135;
        long j137 = i122;
        long j138 = i126;
        long j139 = (j137 * j138) + j136;
        long j140 = i121;
        long j141 = i127;
        long j142 = (j140 * j141) + j139;
        long j143 = i120;
        long j144 = i128;
        long j145 = (j143 * j144) + j142;
        long j146 = i119;
        long j147 = i129;
        long j148 = (j146 * j147) + j145;
        long j149 = i118;
        long j150 = i130;
        long j151 = (j149 * j150) + j148;
        long j152 = i117;
        long j153 = i131;
        long j154 = (j152 * j153) + j151;
        long j155 = ((j5 + j109) + j154) - (j106 + ((j102 * j103) + j101));
        int i132 = ((int) j155) & M28;
        long j156 = ((j130 + j133) - j5) + j154;
        int i133 = ((int) j156) & M28;
        long j157 = j156 >>> 28;
        long j158 = (j2 * j22) + (j104 * j3);
        long j159 = (j125 * j129) + (j122 * j126) + (j119 * j123) + (j116 * j120) + (j113 * j117) + (j110 * j114);
        long j160 = (j131 * j135) + (j152 * j132);
        long j161 = (j149 * j153) + (j146 * j150) + (j143 * j147) + (j140 * j144) + (j137 * j141) + (j134 * j138);
        long j162 = (((j158 + ((j107 * j111) + (j128 * j108))) + j161) - ((j102 * j105) + ((j85 * j103) + ((j69 * j100) + ((j58 * j76) + ((j46 * j65) + (j16 * j47))))))) + (j155 >>> 28);
        int i134 = ((int) j162) & M28;
        long j163 = j162 >>> 28;
        long j164 = ((j159 + j160) - j158) + j161 + j157;
        int i135 = ((int) j164) & M28;
        long j165 = j164 >>> 28;
        long j166 = (j2 * j47) + (j104 * j22) + (j102 * j3);
        long j167 = (j122 * j129) + (j119 * j126) + (j116 * j123) + (j113 * j120) + (j110 * j117);
        long j168 = (j131 * j138) + (j152 * j135) + (j149 * j132);
        long j169 = (j146 * j153) + (j143 * j150) + (j140 * j147) + (j137 * j144) + (j134 * j141);
        long j170 = (((j166 + ((j107 * j114) + ((j128 * j111) + (j125 * j108)))) + j169) - ((j85 * j105) + ((j69 * j103) + ((j58 * j100) + ((j46 * j76) + (j16 * j65)))))) + j163;
        int i136 = ((int) j170) & M28;
        long j171 = j170 >>> 28;
        long j172 = ((j167 + j168) - j166) + j169 + j165;
        int i137 = ((int) j172) & M28;
        long j173 = j172 >>> 28;
        long j174 = (j2 * j65) + (j104 * j47) + (j102 * j22) + (j85 * j3);
        long j175 = (j119 * j129) + (j116 * j126) + (j113 * j123) + (j110 * j120);
        long j176 = (j131 * j141) + (j152 * j138) + (j149 * j135) + (j146 * j132);
        long j177 = (j143 * j153) + (j140 * j150) + (j137 * j147) + (j134 * j144);
        long j178 = (((j174 + ((j107 * j117) + ((j128 * j114) + ((j125 * j111) + (j122 * j108))))) + j177) - ((j69 * j105) + ((j58 * j103) + ((j46 * j100) + (j16 * j76))))) + j171;
        int i138 = ((int) j178) & M28;
        long j179 = j178 >>> 28;
        long j180 = ((j175 + j176) - j174) + j177 + j173;
        int i139 = ((int) j180) & M28;
        long j181 = j180 >>> 28;
        long j182 = (j2 * j76) + (j104 * j65) + (j102 * j47) + (j85 * j22) + (j69 * j3);
        long j183 = (j116 * j129) + (j113 * j126) + (j110 * j123);
        long j184 = (j131 * j144) + (j152 * j141) + (j149 * j138) + (j146 * j135) + (j143 * j132);
        long j185 = (j140 * j153) + (j137 * j150) + (j134 * j147);
        long j186 = (((j182 + ((j107 * j120) + ((j128 * j117) + ((j125 * j114) + ((j122 * j111) + (j119 * j108)))))) + j185) - ((j58 * j105) + ((j46 * j103) + (j16 * j100)))) + j179;
        int i140 = ((int) j186) & M28;
        long j187 = j186 >>> 28;
        long j188 = ((j183 + j184) - j182) + j185 + j181;
        int i141 = ((int) j188) & M28;
        long j189 = j188 >>> 28;
        long j190 = (j2 * j100) + (j104 * j76) + (j102 * j65) + (j85 * j47) + (j69 * j22) + (j58 * j3);
        long j191 = (j113 * j129) + (j110 * j126);
        long j192 = (j131 * j147) + (j152 * j144) + (j149 * j141) + (j146 * j138) + (j143 * j135) + (j140 * j132);
        long j193 = (j137 * j153) + (j134 * j150);
        long j194 = (((j190 + ((j107 * j123) + ((j128 * j120) + ((j125 * j117) + ((j122 * j114) + ((j119 * j111) + (j116 * j108))))))) + j193) - ((j46 * j105) + (j16 * j103))) + j187;
        int i142 = ((int) j194) & M28;
        long j195 = j194 >>> 28;
        long j196 = ((j191 + j192) - j190) + j193 + j189;
        int i143 = ((int) j196) & M28;
        long j197 = j196 >>> 28;
        long j198 = (j2 * j103) + (j104 * j100) + (j102 * j76) + (j85 * j65) + (j69 * j47) + (j58 * j22) + (j46 * j3);
        long j199 = j110 * j129;
        long j200 = (j131 * j150) + (j152 * j147) + (j149 * j144) + (j146 * j141) + (j143 * j138) + (j140 * j135) + (j137 * j132);
        long j201 = j134 * j153;
        long j202 = (((j198 + ((j107 * j126) + ((j128 * j123) + ((j125 * j120) + ((j122 * j117) + ((j119 * j114) + ((j116 * j111) + (j113 * j108)))))))) + j201) - (j16 * j105)) + j195;
        int i144 = ((int) j202) & M28;
        long j203 = j202 >>> 28;
        long j204 = ((j199 + j200) - j198) + j201 + j197;
        int i145 = ((int) j204) & M28;
        long j205 = j85 * j76;
        long j206 = (j2 * j105) + (j104 * j103) + (j102 * j100) + j205 + (j69 * j65) + (j58 * j47) + (j46 * j22) + (j3 * j16);
        long j207 = (j107 * j129) + (j128 * j126) + (j125 * j123) + (j122 * j120) + (j119 * j117) + (j116 * j114) + (j113 * j111) + (j110 * j108) + j206 + j203;
        int i146 = ((int) j207) & M28;
        long j208 = (((j131 * j153) + ((j152 * j150) + ((j149 * j147) + ((j146 * j144) + ((j143 * j141) + ((j140 * j138) + ((j137 * j135) + (j134 * j132)))))))) - j206) + (j204 >>> 28);
        int i147 = ((int) j208) & M28;
        long j209 = j208 >>> 28;
        long j210 = (j207 >>> 28) + j209 + ((long) i133);
        int i148 = ((int) j210) & M28;
        long j211 = j209 + ((long) i132);
        iArr3[0] = ((int) j211) & M28;
        iArr3[1] = i134 + ((int) (j211 >>> 28));
        iArr3[2] = i136;
        iArr3[3] = i138;
        iArr3[4] = i140;
        iArr3[5] = i142;
        iArr3[6] = i144;
        iArr3[7] = i146;
        iArr3[8] = i148;
        iArr3[9] = i135 + ((int) (j210 >>> 28));
        iArr3[10] = i137;
        iArr3[11] = i139;
        iArr3[12] = i141;
        iArr3[13] = i143;
        iArr3[14] = i145;
        iArr3[15] = i147;
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
        int i59 = iArr[10];
        int i66 = iArr[11];
        int i74 = iArr[12];
        int i92 = iArr[13];
        int i96 = iArr[14];
        int i99 = iArr[15];
        int i100 = i * 2;
        int i101 = i2 * 2;
        int i102 = i6 * 2;
        int i103 = i21 * 2;
        int i104 = i22 * 2;
        int i105 = i33 * 2;
        int i106 = i59 * 2;
        int i107 = i66 * 2;
        int i108 = i74 * 2;
        int i109 = i + i33;
        int i110 = i2 + i43;
        int i111 = i3 + i59;
        int i112 = i5 + i66;
        int i113 = i6 + i74;
        int i114 = i21 + i92;
        int i115 = i22 + i96;
        int i116 = i109 * 2;
        int i117 = i110 * 2;
        int i118 = i111 * 2;
        int i119 = i112 * 2;
        long j2 = i;
        long j3 = j2 * j2;
        long j5 = i32;
        long j16 = i101;
        long j22 = j5 * j16;
        long j42 = i22;
        long j46 = i3 * 2;
        long j47 = (j42 * j46) + j22;
        long j57 = i21;
        long j58 = i5 * 2;
        long j65 = (j57 * j58) + j47;
        long j69 = i6;
        long j76 = i33;
        long j85 = j76 * j76;
        long j100 = i99;
        long j101 = i43 * 2;
        long j102 = i96;
        long j103 = i106;
        long j104 = (j102 * j103) + (j100 * j101);
        long j105 = i92;
        long j106 = i107;
        long j107 = i74;
        long j108 = j107 * j107;
        long j109 = i109;
        long j110 = j109 * j109;
        long j111 = i32 + i99;
        long j112 = ((long) i117) & 4294967295L;
        long j113 = j111 * j112;
        long j114 = i115;
        long j115 = ((long) i118) & 4294967295L;
        long j116 = (j114 * j115) + j113;
        long j117 = i114;
        long j118 = ((long) i119) & 4294967295L;
        long j119 = (j117 * j118) + j116;
        long j120 = i113;
        long j121 = (j120 * j120) + j119;
        long j122 = ((j3 + j85) + j121) - ((j69 * j69) + j65);
        int i120 = ((int) j122) & M28;
        long j123 = j122 >>> 28;
        long j124 = (((j108 + ((j105 * j106) + j104)) + j110) - j3) + j121;
        int i121 = ((int) j124) & M28;
        long j125 = j124 >>> 28;
        long j126 = i2;
        long j127 = i100;
        long j128 = j126 * j127;
        long j129 = i102;
        long j130 = j57 * j129;
        long j131 = i43;
        long j132 = i105;
        long j133 = j131 * j132;
        long j134 = i108;
        long j135 = j105 * j134;
        long j136 = i110;
        long j137 = ((long) i116) & 4294967295L;
        long j138 = j136 * j137;
        long j139 = (j114 * j118) + (j111 * j115);
        long j140 = ((long) (i113 * 2)) & 4294967295L;
        long j141 = (j117 * j140) + j139;
        long j142 = (((j128 + j133) + j141) - (j130 + ((j42 * j58) + (j5 * j46)))) + j123;
        int i122 = ((int) j142) & M28;
        long j143 = j142 >>> 28;
        long j144 = (((j135 + ((j102 * j106) + (j100 * j103))) + j138) - j128) + j141 + j125;
        int i123 = ((int) j144) & M28;
        long j145 = j144 >>> 28;
        long j146 = i3;
        long j147 = (j126 * j126) + (j146 * j127);
        long j148 = (j42 * j129) + (j5 * j58);
        long j149 = i59;
        long j150 = (j131 * j131) + (j149 * j132);
        long j151 = (j102 * j134) + (j100 * j106);
        long j152 = i111;
        long j153 = (j136 * j136) + (j152 * j137);
        long j154 = (j117 * j117) + (j114 * j140) + (j111 * j118);
        long j155 = (((j147 + j150) + j154) - ((j57 * j57) + j148)) + j143;
        int i124 = ((int) j155) & M28;
        long j156 = j155 >>> 28;
        long j157 = ((((j105 * j105) + j151) + j153) - j147) + j154 + j145;
        int i125 = ((int) j157) & M28;
        long j158 = j157 >>> 28;
        long j159 = i5;
        long j160 = (j146 * j16) + (j159 * j127);
        long j161 = j5 * j129;
        long j162 = i103;
        long j163 = (j42 * j162) + j161;
        long j164 = i66;
        long j165 = (j149 * j101) + (j164 * j132);
        long j166 = j100 * j134;
        long j167 = i92 * 2;
        long j168 = (j102 * j167) + j166;
        long j169 = i112;
        long j170 = (j152 * j112) + (j169 * j137);
        long j171 = j140 * j111;
        long j172 = ((long) (i114 * 2)) & 4294967295L;
        long j173 = (j114 * j172) + j171;
        long j174 = (((j160 + j165) + j173) - j163) + j156;
        int i126 = ((int) j174) & M28;
        long j175 = j174 >>> 28;
        long j176 = ((j168 + j170) - j160) + j173 + j158;
        int i127 = ((int) j176) & M28;
        long j177 = j176 >>> 28;
        long j178 = (j146 * j146) + (j159 * j16) + (j69 * j127);
        long j179 = (j102 * j102) + (j167 * j100);
        long j180 = (j152 * j152) + (j169 * j112) + (j120 * j137);
        long j181 = (j114 * j114) + (j111 * j172);
        long j182 = (((j178 + ((j149 * j149) + ((j164 * j101) + (j107 * j132)))) + j181) - ((j42 * j42) + (j5 * j162))) + j175;
        int i128 = ((int) j182) & M28;
        long j183 = j182 >>> 28;
        long j184 = ((j179 + j180) - j178) + j181 + j177;
        int i129 = ((int) j184) & M28;
        long j185 = j184 >>> 28;
        long j186 = (j159 * j46) + (j69 * j16) + (j57 * j127);
        long j187 = (j164 * j103) + (j107 * j101) + (j105 * j132);
        long j188 = (j169 * j115) + (j120 * j112) + (j117 * j137);
        long j189 = (((long) (i115 * 2)) & 4294967295L) * j111;
        long j190 = (((j186 + j187) + j189) - (((long) i104) * j5)) + j183;
        int i130 = ((int) j190) & M28;
        long j191 = j190 >>> 28;
        long j192 = (((((long) (i96 * 2)) * j100) + j188) - j186) + j189 + j185;
        int i131 = ((int) j192) & M28;
        long j193 = j192 >>> 28;
        long j194 = (j159 * j159) + (j69 * j46) + (j57 * j16) + (j42 * j127);
        long j195 = (j169 * j169) + (j120 * j115) + (j117 * j112) + (j114 * j137);
        long j196 = j111 * j111;
        long j197 = (((j194 + ((j164 * j164) + ((j107 * j103) + ((j105 * j101) + (j102 * j132))))) + j196) - (j5 * j5)) + j191;
        int i132 = ((int) j197) & M28;
        long j198 = j197 >>> 28;
        long j199 = (((j100 * j100) + j195) - j194) + j196 + j193;
        int i133 = ((int) j199) & M28;
        long j200 = (j58 * j69) + (j57 * j46) + (j42 * j16) + (j5 * j127);
        long j201 = j105 * j103;
        long j202 = (j107 * j106) + j201 + (j102 * j101) + (j100 * j132);
        long j203 = j202 + j200 + j198;
        int i134 = ((int) j203) & M28;
        long j204 = (((j120 * j118) + ((j117 * j115) + ((j114 * j112) + (j111 * j137)))) - j200) + (j199 >>> 28);
        int i135 = ((int) j204) & M28;
        long j205 = j204 >>> 28;
        long j206 = (j203 >>> 28) + j205 + ((long) i121);
        int i136 = ((int) j206) & M28;
        long j207 = j205 + ((long) i120);
        iArr2[0] = ((int) j207) & M28;
        iArr2[1] = i122 + ((int) (j207 >>> 28));
        iArr2[2] = i124;
        iArr2[3] = i126;
        iArr2[4] = i128;
        iArr2[5] = i130;
        iArr2[6] = i132;
        iArr2[7] = i134;
        iArr2[8] = i136;
        iArr2[9] = i123 + ((int) (j206 >>> 28));
        iArr2[10] = i125;
        iArr2[11] = i127;
        iArr2[12] = i129;
        iArr2[13] = i131;
        iArr2[14] = i133;
        iArr2[15] = i135;
    }

    public static void decode(byte[] bArr, int[] iArr) {
        decode448(bArr, 0, iArr, 0);
    }

    public static void decode448(int[] iArr, int i, int[] iArr2, int i2) {
        decode224(iArr, i, iArr2, i2);
        decode224(iArr, i + 7, iArr2, i2 + 8);
    }

    public static void encode(int[] iArr, byte[] bArr, int i) {
        encode56(iArr, 0, bArr, i);
        encode56(iArr, 2, bArr, i + 7);
        encode56(iArr, 4, bArr, i + 14);
        encode56(iArr, 6, bArr, i + 21);
        encode56(iArr, 8, bArr, i + 28);
        encode56(iArr, 10, bArr, i + 35);
        encode56(iArr, 12, bArr, i + 42);
        encode56(iArr, 14, bArr, i + 49);
    }

    public static void decode(int[] iArr, int i, int[] iArr2) {
        decode448(iArr, i, iArr2, 0);
    }

    public static void decode448(int[] iArr, int[] iArr2) {
        decode448(iArr, 0, iArr2, 0);
    }

    public static void encode(int[] iArr, int[] iArr2, int i) {
        encode224(iArr, 0, iArr2, i);
        encode224(iArr, 8, iArr2, i + 7);
    }
}
