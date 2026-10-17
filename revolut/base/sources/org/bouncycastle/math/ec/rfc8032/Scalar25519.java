package org.bouncycastle.math.ec.rfc8032;

import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* JADX INFO: loaded from: classes14.dex */
abstract class Scalar25519 {
    private static final int L0 = -50998291;
    private static final int L1 = 19280294;
    private static final int L2 = 127719000;
    private static final int L3 = -6428113;
    private static final int L4 = 5343;
    private static final long M08L = 255;
    private static final long M28L = 268435455;
    private static final long M32L = 4294967295L;
    private static final int SCALAR_BYTES = 32;
    static final int SIZE = 8;
    private static final int TARGET_LENGTH = 254;
    private static final int[] L = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};
    private static final int[] LSq = {-1424848535, -487721339, 580428573, 1745064566, -770181698, 1036971123, 461123738, -1582065343, 1268693629, -889041821, -731974758, 43769659, 0, 0, 0, 16777216};

    public static boolean checkVar(byte[] bArr, int[] iArr) {
        decode(bArr, iArr);
        return !Nat256.gte(iArr, L);
    }

    public static void decode(byte[] bArr, int[] iArr) {
        Codec.decode32(bArr, 0, iArr, 0, 8);
    }

    public static void getOrderWnafVar(int i, byte[] bArr) {
        Wnaf.getSignedVar(L, i, bArr);
    }

    public static void multiply128Var(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        Nat256.mul128(iArr, iArr2, iArr4);
        if (iArr2[3] < 0) {
            Nat256.addTo(L, 0, iArr4, 4, 0);
            Nat256.subFrom(iArr, 0, iArr4, 4, 0);
        }
        byte[] bArr = new byte[48];
        Codec.encode32(iArr4, 0, 12, bArr, 0);
        decode(reduce384(bArr), iArr3);
    }

    public static byte[] reduce384(byte[] bArr) {
        long jDecode32 = ((long) Codec.decode32(bArr, 0)) & 4294967295L;
        long jDecode24 = ((long) (Codec.decode24(bArr, 4) << 4)) & 4294967295L;
        long jDecode322 = ((long) Codec.decode32(bArr, 7)) & 4294967295L;
        long jDecode242 = ((long) (Codec.decode24(bArr, 11) << 4)) & 4294967295L;
        long jDecode323 = ((long) Codec.decode32(bArr, 14)) & 4294967295L;
        long jDecode243 = ((long) (Codec.decode24(bArr, 18) << 4)) & 4294967295L;
        long jDecode324 = ((long) Codec.decode32(bArr, 21)) & 4294967295L;
        long jDecode244 = ((long) (Codec.decode24(bArr, 25) << 4)) & 4294967295L;
        long jDecode325 = ((long) Codec.decode32(bArr, 28)) & 4294967295L;
        long jDecode245 = Codec.decode24(bArr, 32) << 4;
        long j2 = jDecode245 & 4294967295L;
        long jDecode326 = Codec.decode32(bArr, 35);
        long j3 = jDecode326 & 4294967295L;
        long jDecode246 = Codec.decode24(bArr, 39) << 4;
        long j5 = jDecode246 & 4294967295L;
        long jDecode327 = Codec.decode32(bArr, 42);
        long jDecode16 = (((long) (Codec.decode16(bArr, 46) << 4)) & 4294967295L) + ((jDecode327 & 4294967295L) >> 28);
        long j16 = jDecode325 - (jDecode16 * 5343);
        long j22 = (jDecode327 & M28L) + (j5 >> 28);
        long j42 = (jDecode323 - (jDecode16 * (-50998291))) - (j22 * 19280294);
        long j46 = (jDecode243 - (jDecode16 * 19280294)) - (j22 * 127719000);
        long j47 = (jDecode324 - (jDecode16 * 127719000)) - (j22 * (-6428113));
        long j57 = (jDecode244 - (jDecode16 * (-6428113))) - (j22 * 5343);
        long j58 = (jDecode246 & M28L) + (j3 >> 28);
        long j65 = jDecode322 - (j58 * (-50998291));
        long j69 = (jDecode242 - (j22 * (-50998291))) - (j58 * 19280294);
        long j76 = j42 - (j58 * 127719000);
        long j85 = j46 - (j58 * (-6428113));
        long j100 = j47 - (j58 * 5343);
        long j101 = (jDecode326 & M28L) + (j2 >> 28);
        long j102 = jDecode245 & M28L;
        long j103 = jDecode24 - (j101 * (-50998291));
        long j104 = j65 - (j101 * 19280294);
        long j105 = j69 - (j101 * 127719000);
        long j106 = j76 - (j101 * (-6428113));
        long j107 = j85 - (j101 * 5343);
        long j108 = j16 + (j57 >> 28);
        long j109 = j57 & M28L;
        long j110 = j102 + (j108 >> 28);
        long j111 = j108 & M28L;
        long j112 = j111 >>> 27;
        long j113 = j110 + j112;
        long j114 = jDecode32 - (j113 * (-50998291));
        long j115 = j104 - (j113 * 127719000);
        long j116 = j105 - (j113 * (-6428113));
        long j117 = j106 - (j113 * 5343);
        long j118 = (j103 - (j113 * 19280294)) + (j114 >> 28);
        long j119 = j114 & M28L;
        long j120 = j115 + (j118 >> 28);
        long j121 = j118 & M28L;
        long j122 = j116 + (j120 >> 28);
        long j123 = j120 & M28L;
        long j124 = j117 + (j122 >> 28);
        long j125 = j122 & M28L;
        long j126 = j107 + (j124 >> 28);
        long j127 = j124 & M28L;
        long j128 = j100 + (j126 >> 28);
        long j129 = j126 & M28L;
        long j130 = j109 + (j128 >> 28);
        long j131 = j128 & M28L;
        long j132 = j111 + (j130 >> 28);
        long j133 = j130 & M28L;
        long j134 = j132 >> 28;
        long j135 = j132 & M28L;
        long j136 = j134 - j112;
        long j137 = j119 + (j136 & (-50998291));
        long j138 = j121 + (j136 & 19280294) + (j137 >> 28);
        long j139 = j137 & M28L;
        long j140 = j123 + (j136 & 127719000) + (j138 >> 28);
        long j141 = j138 & M28L;
        long j142 = j125 + (j136 & (-6428113)) + (j140 >> 28);
        long j143 = j140 & M28L;
        long j144 = j127 + (j136 & 5343) + (j142 >> 28);
        long j145 = j142 & M28L;
        long j146 = j129 + (j144 >> 28);
        long j147 = j144 & M28L;
        long j148 = j131 + (j146 >> 28);
        long j149 = j146 & M28L;
        long j150 = j133 + (j148 >> 28);
        long j151 = j148 & M28L;
        long j152 = j135 + (j150 >> 28);
        long j153 = M28L & j150;
        byte[] bArr2 = new byte[64];
        Codec.encode56(j139 | (j141 << 28), bArr2, 0);
        Codec.encode56(j143 | (j145 << 28), bArr2, 7);
        Codec.encode56((j149 << 28) | j147, bArr2, 14);
        Codec.encode56((j153 << 28) | j151, bArr2, 21);
        Codec.encode32((int) j152, bArr2, 28);
        return bArr2;
    }

    public static byte[] reduce512(byte[] bArr) {
        long jDecode32 = ((long) Codec.decode32(bArr, 0)) & 4294967295L;
        long jDecode24 = ((long) (Codec.decode24(bArr, 4) << 4)) & 4294967295L;
        long jDecode322 = ((long) Codec.decode32(bArr, 7)) & 4294967295L;
        long jDecode242 = ((long) (Codec.decode24(bArr, 11) << 4)) & 4294967295L;
        long jDecode323 = ((long) Codec.decode32(bArr, 14)) & 4294967295L;
        long jDecode243 = ((long) (Codec.decode24(bArr, 18) << 4)) & 4294967295L;
        long jDecode324 = ((long) Codec.decode32(bArr, 21)) & 4294967295L;
        long jDecode244 = ((long) (Codec.decode24(bArr, 25) << 4)) & 4294967295L;
        long jDecode325 = ((long) Codec.decode32(bArr, 28)) & 4294967295L;
        long jDecode245 = ((long) (Codec.decode24(bArr, 32) << 4)) & 4294967295L;
        long jDecode326 = ((long) Codec.decode32(bArr, 35)) & 4294967295L;
        long jDecode246 = ((long) (Codec.decode24(bArr, 39) << 4)) & 4294967295L;
        long jDecode327 = ((long) Codec.decode32(bArr, 42)) & 4294967295L;
        long jDecode247 = ((long) (Codec.decode24(bArr, 46) << 4)) & 4294967295L;
        long jDecode328 = Codec.decode32(bArr, 49);
        long j2 = jDecode328 & 4294967295L;
        long jDecode248 = ((long) (Codec.decode24(bArr, 53) << 4)) & 4294967295L;
        long jDecode329 = Codec.decode32(bArr, 56);
        long jDecode249 = ((long) (Codec.decode24(bArr, 60) << 4)) & 4294967295L;
        long j3 = ((long) bArr[63]) & M08L;
        long j5 = jDecode249 + ((jDecode329 & 4294967295L) >> 28);
        long j16 = jDecode329 & M28L;
        long j22 = (jDecode327 - (j3 * (-6428113))) - (j5 * 5343);
        long j42 = (jDecode325 - (j5 * (-50998291))) - (j16 * 19280294);
        long j46 = ((jDecode245 - (j3 * (-50998291))) - (j5 * 19280294)) - (j16 * 127719000);
        long j47 = ((jDecode326 - (j3 * 19280294)) - (j5 * 127719000)) - (j16 * (-6428113));
        long j57 = ((jDecode246 - (j3 * 127719000)) - (j5 * (-6428113))) - (j16 * 5343);
        long j58 = jDecode248 + (j2 >> 28);
        long j65 = jDecode328 & M28L;
        long j69 = j47 - (j58 * 5343);
        long j76 = (j46 - (j58 * (-6428113))) - (j65 * 5343);
        long j85 = (jDecode247 - (j3 * 5343)) + (j22 >> 28);
        long j100 = ((jDecode324 - (j58 * (-50998291))) - (j65 * 19280294)) - (j85 * 127719000);
        long j101 = (((jDecode244 - (j16 * (-50998291))) - (j58 * 19280294)) - (j65 * 127719000)) - (j85 * (-6428113));
        long j102 = ((j42 - (j58 * 127719000)) - (j65 * (-6428113))) - (j85 * 5343);
        long j103 = (j22 & M28L) + (j57 >> 28);
        long j104 = (jDecode323 - (j85 * (-50998291))) - (j103 * 19280294);
        long j105 = ((jDecode243 - (j65 * (-50998291))) - (j85 * 19280294)) - (j103 * 127719000);
        long j106 = j101 - (j103 * 5343);
        long j107 = (j57 & M28L) + (j69 >> 28);
        long j108 = jDecode322 - (j107 * (-50998291));
        long j109 = (jDecode242 - (j103 * (-50998291))) - (j107 * 19280294);
        long j110 = j104 - (j107 * 127719000);
        long j111 = j105 - (j107 * (-6428113));
        long j112 = (j100 - (j103 * (-6428113))) - (j107 * 5343);
        long j113 = (j69 & M28L) + (j76 >> 28);
        long j114 = j76 & M28L;
        long j115 = jDecode24 - (j113 * (-50998291));
        long j116 = j108 - (j113 * 19280294);
        long j117 = j109 - (j113 * 127719000);
        long j118 = j110 - (j113 * (-6428113));
        long j119 = j111 - (j113 * 5343);
        long j120 = j102 + (j106 >> 28);
        long j121 = j106 & M28L;
        long j122 = j114 + (j120 >> 28);
        long j123 = j120 & M28L;
        long j124 = j123 >>> 27;
        long j125 = j122 + j124;
        long j126 = jDecode32 - (j125 * (-50998291));
        long j127 = j116 - (j125 * 127719000);
        long j128 = j117 - (j125 * (-6428113));
        long j129 = j118 - (j125 * 5343);
        long j130 = (j115 - (j125 * 19280294)) + (j126 >> 28);
        long j131 = j126 & M28L;
        long j132 = j127 + (j130 >> 28);
        long j133 = j130 & M28L;
        long j134 = j128 + (j132 >> 28);
        long j135 = j132 & M28L;
        long j136 = j129 + (j134 >> 28);
        long j137 = j134 & M28L;
        long j138 = j119 + (j136 >> 28);
        long j139 = j136 & M28L;
        long j140 = j112 + (j138 >> 28);
        long j141 = j138 & M28L;
        long j142 = j121 + (j140 >> 28);
        long j143 = j140 & M28L;
        long j144 = j123 + (j142 >> 28);
        long j145 = j142 & M28L;
        long j146 = j144 >> 28;
        long j147 = j144 & M28L;
        long j148 = j146 - j124;
        long j149 = j131 + (j148 & (-50998291));
        long j150 = j133 + (j148 & 19280294) + (j149 >> 28);
        long j151 = j149 & M28L;
        long j152 = j135 + (j148 & 127719000) + (j150 >> 28);
        long j153 = j150 & M28L;
        long j154 = j137 + (j148 & (-6428113)) + (j152 >> 28);
        long j155 = j152 & M28L;
        long j156 = j139 + (j148 & 5343) + (j154 >> 28);
        long j157 = j154 & M28L;
        long j158 = j141 + (j156 >> 28);
        long j159 = j156 & M28L;
        long j160 = j143 + (j158 >> 28);
        long j161 = j158 & M28L;
        long j162 = j145 + (j160 >> 28);
        long j163 = j160 & M28L;
        long j164 = j147 + (j162 >> 28);
        long j165 = j162 & M28L;
        byte[] bArr2 = new byte[32];
        Codec.encode56(j151 | (j153 << 28), bArr2, 0);
        Codec.encode56(j155 | (j157 << 28), bArr2, 7);
        Codec.encode56((j161 << 28) | j159, bArr2, 14);
        Codec.encode56((j165 << 28) | j163, bArr2, 21);
        Codec.encode32((int) j164, bArr2, 28);
        return bArr2;
    }

    public static boolean reduceBasisVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        System.arraycopy(LSq, 0, iArr4, 0, 16);
        int[] iArr5 = new int[16];
        Nat256.square(iArr, iArr5);
        iArr5[0] = iArr5[0] + 1;
        int[] iArr6 = new int[16];
        int[] iArr7 = L;
        Nat256.mul(iArr7, iArr, iArr6);
        int[] iArr8 = new int[16];
        int[] iArr9 = new int[4];
        System.arraycopy(iArr7, 0, iArr9, 0, 4);
        int[] iArr10 = new int[4];
        System.arraycopy(iArr, 0, iArr10, 0, 4);
        int[] iArr11 = new int[4];
        iArr11[0] = 1;
        int i = 1016;
        int[] iArr12 = iArr11;
        int[] iArr13 = new int[4];
        int[] iArr14 = iArr9;
        int[] iArr15 = iArr10;
        int i2 = 15;
        int bitLengthPositive = ScalarUtil.getBitLengthPositive(15, iArr5);
        int[] iArr16 = iArr4;
        int[] iArr17 = iArr5;
        while (bitLengthPositive > 254) {
            i--;
            if (i < 0) {
                return false;
            }
            int bitLength = ScalarUtil.getBitLength(i2, iArr6) - bitLengthPositive;
            int i3 = bitLength & (~(bitLength >> 31));
            if (iArr6[i2] < 0) {
                ScalarUtil.addShifted_NP(i2, i3, iArr16, iArr17, iArr6, iArr8);
                ScalarUtil.addShifted_UV(3, i3, iArr14, iArr13, iArr15, iArr12);
            } else {
                ScalarUtil.subShifted_NP(i2, i3, iArr16, iArr17, iArr6, iArr8);
                ScalarUtil.subShifted_UV(3, i3, iArr14, iArr13, iArr15, iArr12);
            }
            int[] iArr18 = iArr15;
            int[] iArr19 = iArr12;
            if (ScalarUtil.lessThanUnsigned(i2, iArr16, iArr17)) {
                int i5 = bitLengthPositive >>> 5;
                int bitLengthPositive2 = ScalarUtil.getBitLengthPositive(i5, iArr16);
                int[] iArr20 = iArr17;
                iArr17 = iArr16;
                iArr16 = iArr20;
                i2 = i5;
                bitLengthPositive = bitLengthPositive2;
                iArr15 = iArr14;
                iArr12 = iArr13;
                iArr13 = iArr19;
                iArr14 = iArr18;
            } else {
                iArr12 = iArr19;
                iArr15 = iArr18;
            }
        }
        System.arraycopy(iArr15, 0, iArr2, 0, 4);
        System.arraycopy(iArr12, 0, iArr3, 0, 4);
        return true;
    }

    public static void toSignedDigits(int i, int[] iArr) {
        Nat.caddTo(8, (~iArr[0]) & 1, L, iArr);
        Nat.shiftDownBit(8, iArr, 1);
    }
}
