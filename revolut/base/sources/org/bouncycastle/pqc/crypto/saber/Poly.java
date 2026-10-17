package org.bouncycastle.pqc.crypto.saber;

import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: loaded from: classes14.dex */
class Poly {
    private static final int KARATSUBA_N = 64;
    private static int SCHB_N = 16;
    private final int N_RES;
    private final int N_SB;
    private final int N_SB_RES;
    private final int SABER_L;
    private final int SABER_N;
    private final SABEREngine engine;
    private final Utils utils;

    public Poly(SABEREngine sABEREngine) {
        this.engine = sABEREngine;
        this.SABER_L = sABEREngine.getSABER_L();
        int saber_n = sABEREngine.getSABER_N();
        this.SABER_N = saber_n;
        this.N_RES = saber_n << 1;
        this.N_SB = saber_n >> 2;
        this.N_SB_RES = (r0 * 2) - 1;
        this.utils = sABEREngine.getUtils();
    }

    private short OVERFLOWING_MUL(int i, int i2) {
        return (short) (i * i2);
    }

    private void cbd(short[] sArr, byte[] bArr, int i) {
        int i2 = 4;
        int[] iArr = new int[4];
        char c2 = 2;
        if (this.engine.getSABER_MU() == 6) {
            for (int i3 = 0; i3 < this.SABER_N / 4; i3++) {
                int iLoad_littleendian = (int) load_littleendian(bArr, (i3 * 3) + i, 3);
                int i5 = 0;
                for (int i6 = 0; i6 < 3; i6++) {
                    i5 += (iLoad_littleendian >> i6) & 2396745;
                }
                iArr[0] = i5 & 7;
                iArr[1] = (i5 >>> 6) & 7;
                iArr[2] = (i5 >>> 12) & 7;
                iArr[3] = (i5 >>> 18) & 7;
                int i21 = i3 * 4;
                sArr[i21] = (short) (iArr[0] - ((i5 >>> 3) & 7));
                sArr[i21 + 1] = (short) (iArr[1] - ((i5 >>> 9) & 7));
                sArr[i21 + 2] = (short) (iArr[2] - ((i5 >>> 15) & 7));
                sArr[i21 + 3] = (short) (iArr[3] - (i5 >>> 21));
            }
            return;
        }
        if (this.engine.getSABER_MU() == 8) {
            for (int i22 = 0; i22 < this.SABER_N / 4; i22++) {
                int i32 = i22 * 4;
                int iLoad_littleendian2 = (int) load_littleendian(bArr, i + i32, 4);
                int i33 = 0;
                for (int i43 = 0; i43 < 4; i43++) {
                    i33 += (iLoad_littleendian2 >>> i43) & 286331153;
                }
                iArr[0] = i33 & 15;
                iArr[1] = (i33 >>> 8) & 15;
                iArr[2] = (i33 >>> 16) & 15;
                iArr[3] = (i33 >>> 24) & 15;
                sArr[i32] = (short) (iArr[0] - ((i33 >>> 4) & 15));
                sArr[i32 + 1] = (short) (iArr[1] - ((i33 >>> 12) & 15));
                sArr[i32 + 2] = (short) (iArr[2] - ((i33 >>> 20) & 15));
                sArr[i32 + 3] = (short) (iArr[3] - (i33 >>> 28));
            }
            return;
        }
        char c3 = '\n';
        if (this.engine.getSABER_MU() == 10) {
            int i59 = 0;
            while (i59 < this.SABER_N / i2) {
                long jLoad_littleendian = load_littleendian(bArr, (i59 * 5) + i, 5);
                long j2 = 0;
                for (int i66 = 0; i66 < 5; i66++) {
                    j2 += (jLoad_littleendian >>> i66) & 35468117025L;
                }
                int[] iArr2 = iArr;
                iArr2[0] = (int) (j2 & 31);
                char c5 = c2;
                iArr2[1] = (int) ((j2 >>> c3) & 31);
                int i74 = i59;
                iArr2[c5] = (int) ((j2 >>> 20) & 31);
                iArr2[3] = (int) ((j2 >>> 30) & 31);
                int i92 = i74 * 4;
                sArr[i92] = (short) (iArr2[0] - ((int) ((j2 >>> 5) & 31)));
                sArr[i92 + 1] = (short) (iArr2[1] - ((int) ((j2 >>> 15) & 31)));
                sArr[i92 + 2] = (short) (iArr2[c5] - ((int) ((j2 >>> 25) & 31)));
                sArr[i92 + 3] = (short) (iArr2[3] - ((int) (j2 >>> 35)));
                i59 = i74 + 1;
                iArr = iArr2;
                c2 = c5;
                i2 = 4;
                c3 = '\n';
            }
        }
    }

    private void karatsuba_simple(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 31;
        int[] iArr4 = new int[31];
        int[] iArr5 = new int[31];
        int[] iArr6 = new int[31];
        int[] iArr7 = new int[63];
        int i2 = 0;
        while (true) {
            if (i2 >= 16) {
                break;
            }
            int i3 = iArr[i2];
            int i5 = iArr[i2 + 16];
            int i6 = iArr[i2 + 32];
            int i21 = iArr[i2 + 48];
            int i22 = 0;
            for (int i32 = 16; i22 < i32; i32 = 16) {
                int i33 = iArr2[i22];
                int i43 = iArr2[i22 + 16];
                int i59 = i2 + i22;
                iArr3[i59] = iArr3[i59] + OVERFLOWING_MUL(i3, i33);
                int i66 = i59 + 32;
                iArr3[i66] = iArr3[i66] + OVERFLOWING_MUL(i5, i43);
                int[] iArr8 = iArr4;
                iArr8[i59] = (int) ((((long) (i3 + i5)) * ((long) (i33 + i43))) + ((long) iArr4[i59]));
                int i74 = iArr2[i22 + 32];
                int i92 = iArr2[i22 + 48];
                int i96 = i59 + 64;
                iArr3[i96] = iArr3[i96] + OVERFLOWING_MUL(i74, i6);
                int i99 = i59 + 96;
                iArr3[i99] = iArr3[i99] + OVERFLOWING_MUL(i92, i21);
                iArr6[i59] = iArr6[i59] + OVERFLOWING_MUL(i6 + i21, i74 + i92);
                int i100 = i33 + i74;
                int i101 = i3 + i6;
                iArr7[i59] = iArr7[i59] + OVERFLOWING_MUL(i100, i101);
                int i102 = i43 + i92;
                int i103 = i5 + i21;
                iArr7[i66] = iArr7[i66] + OVERFLOWING_MUL(i102, i103);
                iArr5[i59] = iArr5[i59] + OVERFLOWING_MUL(i100 + i102, i101 + i103);
                i22++;
                iArr4 = iArr8;
            }
            i2++;
            i = 31;
        }
        int[] iArr9 = iArr4;
        int i104 = i;
        int i105 = 0;
        while (i105 < i104) {
            int i106 = i105 + 32;
            iArr5[i105] = (iArr5[i105] - iArr7[i105]) - iArr7[i106];
            iArr9[i105] = (iArr9[i105] - iArr3[i105]) - iArr3[i106];
            iArr6[i105] = (iArr6[i105] - iArr3[i105 + 64]) - iArr3[i105 + 96];
            i105++;
            i104 = 31;
        }
        for (int i107 = 0; i107 < i104; i107++) {
            int i108 = i107 + 16;
            iArr7[i108] = iArr7[i108] + iArr5[i107];
            iArr3[i108] = iArr3[i108] + iArr9[i107];
            int i109 = i107 + 80;
            iArr3[i109] = iArr3[i109] + iArr6[i107];
        }
        for (int i110 = 0; i110 < 63; i110++) {
            iArr7[i110] = (iArr7[i110] - iArr3[i110]) - iArr3[i110 + 64];
        }
        for (int i111 = 0; i111 < 63; i111++) {
            int i112 = i111 + 32;
            iArr3[i112] = iArr3[i112] + iArr7[i111];
        }
    }

    private long load_littleendian(byte[] bArr, int i, int i2) {
        long j2 = bArr[i] & UnsignedBytes.MAX_VALUE;
        for (int i3 = 1; i3 < i2; i3++) {
            j2 |= ((long) (bArr[i + i3] & UnsignedBytes.MAX_VALUE)) << (i3 * 8);
        }
        return j2;
    }

    private void poly_mul_acc(short[] sArr, short[] sArr2, short[] sArr3) {
        short[] sArr4 = new short[this.SABER_N * 2];
        toom_cook_4way(sArr, sArr2, sArr4);
        int i = this.SABER_N;
        while (true) {
            int i2 = this.SABER_N;
            if (i >= i2 * 2) {
                return;
            }
            int i3 = i - i2;
            sArr3[i3] = (short) ((sArr4[i - i2] - sArr4[i]) + sArr3[i3]);
            i++;
        }
    }

    private void toom_cook_4way(short[] sArr, short[] sArr2, short[] sArr3) {
        int i = this.N_SB;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int[] iArr4 = new int[i];
        int[] iArr5 = new int[i];
        int[] iArr6 = new int[i];
        int[] iArr7 = new int[i];
        int[] iArr8 = new int[i];
        int[] iArr9 = new int[i];
        int[] iArr10 = new int[i];
        int[] iArr11 = new int[i];
        int[] iArr12 = new int[i];
        int[] iArr13 = new int[i];
        int[] iArr14 = new int[i];
        int i2 = this.N_SB_RES;
        int[] iArr15 = new int[i2];
        int[] iArr16 = new int[i2];
        int[] iArr17 = new int[i2];
        int[] iArr18 = new int[i2];
        int[] iArr19 = new int[i2];
        int[] iArr20 = new int[i2];
        int[] iArr21 = new int[i2];
        int i3 = 0;
        while (true) {
            int i5 = this.N_SB;
            if (i3 >= i5) {
                break;
            }
            short s2 = sArr[i3];
            short s3 = sArr[i3 + i5];
            short s4 = sArr[(i5 * 2) + i3];
            short s6 = sArr[(i5 * 3) + i3];
            short s11 = (short) (s2 + s4);
            short s27 = (short) (s3 + s6);
            iArr3[i3] = (short) (s11 + s27);
            iArr4[i3] = (short) (s11 - s27);
            short s37 = (short) (((s2 << 2) + s4) << 1);
            short s51 = (short) ((s3 << 2) + s6);
            iArr5[i3] = (short) (s37 + s51);
            iArr6[i3] = (short) (s37 - s51);
            iArr2[i3] = (short) ((s6 << 3) + (s4 << 2) + (s3 << 1) + s2);
            iArr7[i3] = s2;
            iArr[i3] = s6;
            i3++;
        }
        int i6 = 0;
        while (true) {
            int i21 = this.N_SB;
            if (i6 >= i21) {
                break;
            }
            short s60 = sArr2[i6];
            short s61 = sArr2[i6 + i21];
            short s67 = sArr2[(i21 * 2) + i6];
            short s73 = sArr2[(i21 * 3) + i6];
            int i22 = s60 + s67;
            int i32 = s61 + s73;
            iArr10[i6] = i22 + i32;
            iArr11[i6] = i22 - i32;
            int i33 = ((s60 << 2) + s67) << 1;
            int i43 = (s61 << 2) + s73;
            iArr12[i6] = i33 + i43;
            iArr13[i6] = i33 - i43;
            iArr9[i6] = (s73 << 3) + (s67 << 2) + (s61 << 1) + s60;
            iArr14[i6] = s60;
            iArr8[i6] = s73;
            i6++;
        }
        karatsuba_simple(iArr, iArr8, iArr15);
        karatsuba_simple(iArr2, iArr9, iArr16);
        karatsuba_simple(iArr3, iArr10, iArr17);
        karatsuba_simple(iArr4, iArr11, iArr18);
        karatsuba_simple(iArr5, iArr12, iArr19);
        karatsuba_simple(iArr6, iArr13, iArr20);
        karatsuba_simple(iArr7, iArr14, iArr21);
        for (int i59 = 0; i59 < this.N_SB_RES; i59++) {
            int i66 = iArr15[i59];
            int i74 = iArr16[i59];
            int i92 = iArr17[i59];
            int i96 = iArr18[i59];
            int i99 = iArr19[i59];
            int i100 = iArr20[i59];
            int i101 = iArr21[i59];
            int i102 = i100 - i99;
            int i103 = ((i96 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) - (i92 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)) >>> 1;
            int i104 = i92 + i103;
            int i105 = ((i74 + i99) - (i104 << 6)) - i104;
            int i106 = (i104 - i101) - i66;
            int i107 = (i106 * 45) + i105;
            int i108 = (((((((i99 - i66) - (i101 << 6)) << 1) + i102) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) - (i106 << 3)) * 43691) >> 3;
            int i109 = (((i107 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) + ((i103 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) << 4)) * 36409) >> 1;
            int i110 = -(i103 + i109);
            int i111 = ((((i109 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) * 30) - ((i102 + i107) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)) * 61167) >> 2;
            int i112 = i106 - i108;
            int i113 = i109 - i111;
            sArr3[i59] = (short) (sArr3[i59] + (i101 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
            int i114 = i59 + 64;
            sArr3[i114] = (short) (sArr3[i114] + (i111 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
            int i115 = i59 + 128;
            sArr3[i115] = (short) (sArr3[i115] + (i108 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
            int i116 = i59 + 192;
            sArr3[i116] = (short) (sArr3[i116] + (i110 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
            int i117 = i59 + 256;
            sArr3[i117] = (short) (sArr3[i117] + (i112 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
            int i118 = i59 + 320;
            sArr3[i118] = (short) (sArr3[i118] + (i113 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
            int i119 = i59 + 384;
            sArr3[i119] = (short) (sArr3[i119] + (i66 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        }
    }

    public void GenMatrix(short[][][] sArr, byte[] bArr) {
        int saber_polyvecbytes = this.SABER_L * this.engine.getSABER_POLYVECBYTES();
        byte[] bArr2 = new byte[saber_polyvecbytes];
        SABEREngine sABEREngine = this.engine;
        sABEREngine.symmetric.prf(bArr2, bArr, sABEREngine.getSABER_SEEDBYTES(), saber_polyvecbytes);
        for (int i = 0; i < this.SABER_L; i++) {
            this.utils.BS2POLVECq(bArr2, this.engine.getSABER_POLYVECBYTES() * i, sArr[i]);
        }
    }

    public void GenSecret(short[][] sArr, byte[] bArr) {
        int saber_polycoinbytes = this.SABER_L * this.engine.getSABER_POLYCOINBYTES();
        byte[] bArr2 = new byte[saber_polycoinbytes];
        SABEREngine sABEREngine = this.engine;
        sABEREngine.symmetric.prf(bArr2, bArr, sABEREngine.getSABER_NOISE_SEEDBYTES(), saber_polycoinbytes);
        for (int i = 0; i < this.SABER_L; i++) {
            SABEREngine sABEREngine2 = this.engine;
            if (sABEREngine2.usingEffectiveMasking) {
                for (int i2 = 0; i2 < this.SABER_N / 4; i2++) {
                    int i3 = i2 * 4;
                    sArr[i][i3] = (short) (((bArr2[(this.engine.getSABER_POLYCOINBYTES() * i) + i2] & 3) ^ 2) - 2);
                    sArr[i][i3 + 1] = (short) ((((bArr2[(this.engine.getSABER_POLYCOINBYTES() * i) + i2] >>> 2) & 3) ^ 2) - 2);
                    sArr[i][i3 + 2] = (short) ((((bArr2[(this.engine.getSABER_POLYCOINBYTES() * i) + i2] >>> 4) & 3) ^ 2) - 2);
                    sArr[i][i3 + 3] = (short) ((((bArr2[(this.engine.getSABER_POLYCOINBYTES() * i) + i2] >>> 6) & 3) ^ 2) - 2);
                }
            } else {
                cbd(sArr[i], bArr2, sABEREngine2.getSABER_POLYCOINBYTES() * i);
            }
        }
    }

    public void InnerProd(short[][] sArr, short[][] sArr2, short[] sArr3) {
        for (int i = 0; i < this.SABER_L; i++) {
            poly_mul_acc(sArr[i], sArr2[i], sArr3);
        }
    }

    public void MatrixVectorMul(short[][][] sArr, short[][] sArr2, short[][] sArr3, int i) {
        for (int i2 = 0; i2 < this.SABER_L; i2++) {
            for (int i3 = 0; i3 < this.SABER_L; i3++) {
                if (i == 1) {
                    poly_mul_acc(sArr[i3][i2], sArr2[i3], sArr3[i2]);
                } else {
                    poly_mul_acc(sArr[i2][i3], sArr2[i3], sArr3[i2]);
                }
            }
        }
    }
}
