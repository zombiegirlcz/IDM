package org.bouncycastle.pqc.crypto.ntruplus;

import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;

/* JADX INFO: loaded from: classes14.dex */
class NTRUPlusEngine {
    private static final short OMEGA = -886;
    private static final short Q = 3457;
    private static final short QINV = 12929;
    private static final short QMinus1_Half = 1728;
    private static final short QPlus1_Half = 1729;
    private static final short Q_HALF = 1728;
    private static final short RINV = -682;
    private static final short RSQ = 867;
    static final int SSBytes = 32;
    private static final short V = 19412;
    private static final byte hash_f_domain = 0;
    private static final byte hash_g_domain = 1;
    private static final byte hash_h_domain = 2;
    private final int blockSize;
    private final int doubleBlockSize;
    private final int eighthN;
    private final int halfN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f228851n;
    private final NTRUPlusParameters params;
    public short polyBytes;
    private final int quarterN;
    private final SHAKEDigest shakeDigest = new SHAKEDigest(256);
    private final int zetaOffset;
    public short[] zetas;

    public NTRUPlusEngine(NTRUPlusParameters nTRUPlusParameters) {
        this.params = nTRUPlusParameters;
        int n3 = nTRUPlusParameters.getN();
        this.f228851n = n3;
        this.halfN = n3 >> 1;
        this.quarterN = n3 >> 2;
        this.eighthN = n3 >> 3;
        int i = n3 == 864 ? 3 : 4;
        this.blockSize = i;
        this.doubleBlockSize = i << 1;
        this.zetaOffset = nTRUPlusParameters.getZetasOffset();
        this.polyBytes = (short) nTRUPlusParameters.getPublicKeyBytes();
        this.zetas = nTRUPlusParameters.getZetas();
    }

    private int baseinv3(short[] sArr, int i, short[] sArr2, int i2, short s2) {
        short s3 = sArr2[i2];
        short s4 = sArr2[i2 + 1];
        short s6 = sArr2[i2 + 2];
        short sMontgomery_reduce = montgomery_reduce(s4 * s6);
        short sMontgomery_reduce2 = montgomery_reduce(s6 * s6);
        short sMontgomery_reduce3 = montgomery_reduce((s4 * s4) - (s3 * s6));
        short sMontgomery_reduce4 = montgomery_reduce((s3 * s3) - (sMontgomery_reduce * s2));
        short sMontgomery_reduce5 = montgomery_reduce((sMontgomery_reduce2 * s2) - (s3 * s4));
        int i3 = s3 * sMontgomery_reduce4;
        short sMontgomery_reduce6 = montgomery_reduce(i3 + (montgomery_reduce((s6 * sMontgomery_reduce5) + (s4 * sMontgomery_reduce3)) * s2));
        if (sMontgomery_reduce6 == 0) {
            return 1;
        }
        short sMontgomery_reduce7 = montgomery_reduce(fqinv(sMontgomery_reduce6) * RINV);
        sArr[i] = montgomery_reduce(sMontgomery_reduce4 * sMontgomery_reduce7);
        sArr[i + 1] = montgomery_reduce(sMontgomery_reduce5 * sMontgomery_reduce7);
        sArr[i + 2] = montgomery_reduce(sMontgomery_reduce3 * sMontgomery_reduce7);
        return 0;
    }

    private void basemul(short[] sArr, int i, short[] sArr2, int i2, short[] sArr3, int i3, short s2) {
        multiplyCore(sArr, i, sArr2, i2, sArr3, i3, s2, this.blockSize);
        finalizeMultiplication(sArr, i, this.blockSize);
    }

    private void basemul_add(short[] sArr, int i, short[] sArr2, int i2, short[] sArr3, int i3, short[] sArr4, int i5, short s2, int i6) {
        multiplyCore(sArr, i, sArr2, i2, sArr3, i3, s2, i6);
        finalizeWithAddition(sArr, i, sArr4, i5, i6);
    }

    public static void cmov(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        int i5 = (i3 - 1) & 255;
        for (int i6 = 0; i6 < i2; i6++) {
            int i21 = bArr[i6];
            bArr[i6] = (byte) (i21 ^ ((bArr2[i6 + i] ^ i21) & i5));
        }
    }

    private short crepmod3(short s2) {
        short s3 = (short) (((short) (s2 + ((short) (((s2 >> 15) & 3457) - 1729)))) + ((short) (((r2 >> 15) & 3457) - 1728)));
        return (short) (s3 - ((short) (((short) (((s3 * 10923) + 16384) >> 15)) * 3)));
    }

    private void finalizeMultiplication(short[] sArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            sArr[i] = montgomery_reduce(sArr[i] * RSQ);
            i3++;
            i++;
        }
    }

    private void finalizeWithAddition(short[] sArr, int i, short[] sArr2, int i2, int i3) {
        int i5 = 0;
        while (i5 < i3) {
            int i6 = i2 + 1;
            sArr[i] = montgomery_reduce((sArr[i] * RSQ) + (sArr2[i2] * 65536));
            i5++;
            i++;
            i2 = i6;
        }
    }

    private void multiplyCore(short[] sArr, int i, short[] sArr2, int i2, short[] sArr3, int i3, short s2, int i5) {
        short s3 = sArr2[i2];
        short s4 = sArr2[i2 + 1];
        short s6 = sArr2[i2 + 2];
        short s11 = sArr3[i3];
        short s27 = sArr3[i3 + 1];
        short s37 = sArr3[i3 + 2];
        if (i5 == 4) {
            short s51 = sArr2[i2 + 3];
            short s60 = sArr3[i3 + 3];
            sArr[i] = montgomery_reduce((s51 * s27) + (s6 * s37) + (s4 * s60));
            sArr[i + 1] = montgomery_reduce((s51 * s37) + (s6 * s60));
            sArr[i + 2] = montgomery_reduce((s6 * s11) + (s4 * s27) + (s3 * s37) + (montgomery_reduce(s51 * s60) * s2));
            int i6 = s6 * s27;
            int i21 = s51 * s11;
            sArr[i + 3] = montgomery_reduce(i21 + i6 + (s37 * s4) + (s60 * s3));
        } else {
            sArr[i] = montgomery_reduce((s4 * s37) + (s6 * s27));
            sArr[i + 1] = montgomery_reduce(s6 * s37);
            int i22 = s37 * s3;
            sArr[i + 2] = montgomery_reduce(i22 + (s4 * s27) + (s6 * s11));
        }
        sArr[i] = montgomery_reduce((s3 * s11) + (sArr[i] * s2));
        int i32 = i + 1;
        int i33 = s4 * s11;
        sArr[i32] = montgomery_reduce(i33 + (s3 * s27) + (sArr[i32] * s2));
    }

    private int poly_baseinv(short[] sArr, short[] sArr2) {
        if (this.f228851n == 864) {
            int i = this.zetaOffset;
            int i2 = 0;
            int i3 = 0;
            while (i2 < this.f228851n / 6) {
                short[] sArr3 = sArr;
                short[] sArr4 = sArr2;
                if (baseinv3(sArr3, i3, sArr4, i3, this.zetas[i]) == 1) {
                    Arrays.fill(sArr3, (short) 0);
                    return 1;
                }
                int i5 = i3 + 3;
                if (baseinv3(sArr3, i5, sArr4, i5, (short) (-this.zetas[i])) == 1) {
                    Arrays.fill(sArr3, (short) 0);
                    return 1;
                }
                i2++;
                i3 += 6;
                i++;
                sArr = sArr3;
                sArr2 = sArr4;
            }
        } else {
            NTRUPlusEngine nTRUPlusEngine = this;
            int i6 = nTRUPlusEngine.zetaOffset;
            int i21 = 0;
            int i22 = 0;
            while (i21 < nTRUPlusEngine.eighthN) {
                int i32 = i22;
                if (nTRUPlusEngine.baseinv(sArr, i22, sArr2, i22, nTRUPlusEngine.zetas[i6]) == 1) {
                    Arrays.fill(sArr, (short) 0);
                    return 1;
                }
                int i33 = i32 + 4;
                if (nTRUPlusEngine.baseinv(sArr, i33, sArr2, i33, (short) (-nTRUPlusEngine.zetas[i6])) == 1) {
                    Arrays.fill(sArr, (short) 0);
                    return 1;
                }
                i21++;
                i22 = i32 + 8;
                i6++;
                nTRUPlusEngine = this;
            }
        }
        return 0;
    }

    private void poly_basemul(short[] sArr, short[] sArr2, short[] sArr3) {
        int i = 0;
        while (true) {
            int i2 = this.f228851n;
            int i3 = this.doubleBlockSize;
            if (i >= i2 / i3) {
                return;
            }
            basemul(sArr, i3 * i, sArr2, i3 * i, sArr3, i3 * i, this.zetas[this.zetaOffset + i]);
            int i5 = this.doubleBlockSize;
            int i6 = this.blockSize;
            basemul(sArr, (i5 * i) + i6, sArr2, (i5 * i) + i6, sArr3, (i5 * i) + i6, (short) (-this.zetas[this.zetaOffset + i]));
            i++;
        }
    }

    private void poly_basemul_add(short[] sArr, short[] sArr2, short[] sArr3, short[] sArr4) {
        int i = 0;
        int i2 = this.zetaOffset;
        int i3 = 0;
        while (i3 < this.f228851n / this.doubleBlockSize) {
            basemul_add(sArr, i, sArr2, i, sArr3, i, sArr4, i, this.zetas[i2], this.blockSize);
            int i5 = this.blockSize;
            int i6 = i + i5;
            basemul_add(sArr, i6, sArr2, i6, sArr3, i6, sArr4, i6, (short) (-this.zetas[i2]), i5);
            i = i6 + this.blockSize;
            i3++;
            i2++;
        }
    }

    private void poly_cbd1(short[] sArr, byte[] bArr, int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i5 = this.eighthN;
            if (i2 >= i5) {
                return;
            }
            int i6 = i + i2;
            int i21 = bArr[i6] & UnsignedBytes.MAX_VALUE;
            int i22 = bArr[i6 + i5] & UnsignedBytes.MAX_VALUE;
            for (int i32 = 0; i32 < 8; i32++) {
                sArr[i3 + i32] = (short) ((i21 & 1) - (i22 & 1));
                i21 >>= 1;
                i22 >>= 1;
            }
            i2++;
            i3 += 8;
        }
    }

    private void poly_crepmod3(short[] sArr, short[] sArr2) {
        for (int i = 0; i < this.f228851n; i++) {
            sArr[i] = crepmod3(sArr2[i]);
        }
    }

    private void poly_frombytes(short[] sArr, byte[] bArr, int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.halfN) {
            int i5 = i3 + 1;
            int i6 = bArr[i] & UnsignedBytes.MAX_VALUE;
            byte b4 = bArr[i + 1];
            sArr[i3] = (short) ((i6 | ((b4 & UnsignedBytes.MAX_VALUE) << 8)) & 4095);
            i3 += 2;
            sArr[i5] = (short) ((((b4 & UnsignedBytes.MAX_VALUE) >> 4) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 4)) & 4095);
            i2++;
            i += 3;
        }
    }

    private void poly_invntt(short[] sArr) {
        short s2;
        short s3;
        int i;
        if (this.f228851n == 768) {
            s2 = -811;
            s3 = -1622;
            i = 191;
        } else {
            s2 = -1693;
            s3 = 71;
            i = 287;
        }
        int baseStep = this.params.getBaseStep();
        for (int minStep = this.params.getMinStep(); minStep <= baseStep; minStep <<= 1) {
            int i2 = 0;
            while (i2 < this.f228851n) {
                int i3 = i - 1;
                short s4 = this.zetas[i];
                int i5 = i2 + minStep;
                int i6 = i2;
                int i21 = i5;
                while (i6 < i5) {
                    short s6 = sArr[i21];
                    sArr[i21] = fqmul(s4, (short) (s6 - sArr[i6]));
                    sArr[i6] = barrett_reduce((short) (sArr[i6] + s6));
                    i6++;
                    i21++;
                }
                i2 += minStep << 1;
                i = i3;
            }
        }
        for (int i22 = baseStep << 1; i22 <= this.f228851n / 6; i22 *= 3) {
            int i32 = i22 << 1;
            for (int i33 = 0; i33 < this.f228851n; i33 += i22 * 3) {
                short[] sArr2 = this.zetas;
                int i43 = i - 1;
                short s11 = sArr2[i];
                i -= 2;
                short s27 = sArr2[i43];
                int i59 = i33 + i22;
                int i66 = i33 + i32;
                int i74 = i33;
                int i92 = i59;
                while (i74 < i59) {
                    short sFqmul = fqmul(OMEGA, (short) (sArr[i92] - sArr[i74]));
                    short sFqmul2 = fqmul(s27, (short) ((sArr[i66] - sArr[i74]) + sFqmul));
                    short sFqmul3 = fqmul(s11, (short) ((sArr[i66] - sArr[i92]) - sFqmul));
                    sArr[i74] = barrett_reduce((short) (sArr[i74] + sArr[i92] + sArr[i66]));
                    sArr[i92] = sFqmul2;
                    sArr[i66] = sFqmul3;
                    i74++;
                    i92++;
                    i66++;
                }
            }
        }
        int i96 = 0;
        while (true) {
            int i99 = this.halfN;
            if (i96 >= i99) {
                return;
            }
            short s37 = sArr[i96];
            short s51 = (short) (sArr[i96 + i99] + s37);
            short sFqmul4 = fqmul((short) -1665, (short) (s37 - sArr[i99 + i96]));
            sArr[i96] = fqmul(s2, (short) (s51 - sFqmul4));
            sArr[this.halfN + i96] = fqmul(s3, sFqmul4);
            i96++;
        }
    }

    private void poly_ntt(short[] sArr) {
        boolean z = true;
        short s2 = this.zetas[1];
        int i = this.halfN;
        int i2 = 0;
        while (i2 < this.halfN) {
            short sFqmul = fqmul(s2, sArr[i]);
            sArr[i] = (short) ((sArr[i2] + sArr[i]) - sFqmul);
            sArr[i2] = (short) (sArr[i2] + sFqmul);
            i2++;
            i++;
        }
        int baseStep = this.params.getBaseStep();
        int minStep = this.params.getMinStep();
        int i3 = 2;
        for (int i5 = this.f228851n / 6; i5 >= (baseStep << 1); i5 /= 3) {
            int i6 = i5 << 1;
            int i21 = i6 + i5;
            for (int i22 = 0; i22 < this.f228851n; i22 += i21) {
                short[] sArr2 = this.zetas;
                int i32 = i3 + 1;
                short s3 = sArr2[i3];
                i3 += 2;
                short s4 = sArr2[i32];
                int i33 = i22 + i5;
                int i43 = i22 + i6;
                int i59 = i22;
                int i66 = i33;
                while (i59 < i33) {
                    boolean z3 = z;
                    short sFqmul2 = fqmul(s3, sArr[i66]);
                    short sFqmul3 = fqmul(s4, sArr[i43]);
                    int i74 = baseStep;
                    short sFqmul4 = fqmul(OMEGA, (short) (sFqmul2 - sFqmul3));
                    sArr[i43] = (short) ((sArr[i59] - sFqmul2) - sFqmul4);
                    sArr[i66] = (short) ((sArr[i59] - sFqmul3) + sFqmul4);
                    sArr[i59] = (short) (sArr[i59] + sFqmul2 + sFqmul3);
                    i59++;
                    i66++;
                    i43++;
                    z = z3;
                    baseStep = i74;
                }
            }
        }
        while (baseStep >= minStep) {
            int i92 = 0;
            while (i92 < this.f228851n) {
                int i96 = i3 + 1;
                short s6 = this.zetas[i3];
                int i99 = i92 + baseStep;
                int i100 = i92;
                int i101 = i99;
                while (i100 < i99) {
                    short sFqmul5 = fqmul(s6, sArr[i101]);
                    sArr[i101] = barrett_reduce((short) (sArr[i100] - sFqmul5));
                    sArr[i100] = barrett_reduce((short) (sArr[i100] + sFqmul5));
                    i100++;
                    i101++;
                }
                i92 += baseStep << 1;
                i3 = i96;
            }
            baseStep >>= 1;
        }
    }

    private int poly_sotp_decode(byte[] bArr, short[] sArr, byte[] bArr2) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = this.eighthN;
            if (i >= i3) {
                break;
            }
            int i5 = bArr2[i] & UnsignedBytes.MAX_VALUE;
            int i6 = bArr2[i3 + i] & UnsignedBytes.MAX_VALUE;
            byte b4 = 0;
            for (int i21 = 0; i21 < 8; i21++) {
                int i22 = (i6 & 1) + sArr[(i * 8) + i21];
                i2 |= i22;
                b4 = (byte) (b4 ^ ((byte) (((i22 ^ i5) & 1) << i21)));
                i5 >>= 1;
                i6 >>= 1;
            }
            bArr[i] = b4;
            i++;
        }
        int i32 = (-(i2 >> 1)) >> 31;
        byte b5 = (byte) (i32 - 1);
        for (int i33 = 0; i33 < this.eighthN; i33++) {
            bArr[i33] = (byte) (bArr[i33] & b5);
        }
        return i32;
    }

    private void poly_sotp_encode(short[] sArr, byte[] bArr, byte[] bArr2) {
        Bytes.xorTo(this.eighthN, bArr, bArr2);
        poly_cbd1(sArr, bArr2, 0);
    }

    private void poly_sub(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i = 0; i < this.f228851n; i++) {
            sArr[i] = (short) (sArr2[i] - sArr3[i]);
        }
    }

    private void shake256(byte[] bArr, int i, int i2, byte b4, byte[] bArr2, int i3, int i5) {
        this.shakeDigest.update(b4);
        this.shakeDigest.update(bArr2, i3, i5);
        this.shakeDigest.doFinal(bArr, i, i2);
    }

    private int verify(byte[] bArr, byte[] bArr2, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 |= (bArr[i3] ^ bArr2[i3]) & 255;
        }
        return i2 != 0 ? 1 : 0;
    }

    public short barrett_reduce(short s2) {
        return (short) (s2 - ((((s2 * V) + 33554432) >> 26) * 3457));
    }

    public int baseinv(short[] sArr, int i, short[] sArr2, int i2, short s2) {
        short s3 = sArr2[i2];
        short s4 = sArr2[i2 + 1];
        short s6 = sArr2[i2 + 2];
        short s11 = sArr2[i2 + 3];
        short sMontgomery_reduce = montgomery_reduce((s6 * s6) - ((s4 * 2) * s11));
        short sMontgomery_reduce2 = montgomery_reduce(s11 * s11);
        short sMontgomery_reduce3 = montgomery_reduce((sMontgomery_reduce * s2) + (s3 * s3));
        short sMontgomery_reduce4 = montgomery_reduce(((sMontgomery_reduce2 * s2) + (s4 * s4)) - ((s3 * 2) * s6));
        short sMontgomery_reduce5 = montgomery_reduce(s2 * sMontgomery_reduce4);
        short sMontgomery_reduce6 = montgomery_reduce((sMontgomery_reduce3 * sMontgomery_reduce3) - (sMontgomery_reduce4 * sMontgomery_reduce5));
        if (sMontgomery_reduce6 == 0) {
            return 1;
        }
        short sMontgomery_reduce7 = montgomery_reduce((s6 * sMontgomery_reduce5) + (s3 * sMontgomery_reduce3));
        short sMontgomery_reduce8 = montgomery_reduce((s4 * sMontgomery_reduce3) + (sMontgomery_reduce5 * s11));
        short sMontgomery_reduce9 = montgomery_reduce((s3 * sMontgomery_reduce4) + (s6 * sMontgomery_reduce3));
        short sMontgomery_reduce10 = montgomery_reduce((s11 * sMontgomery_reduce3) + (s4 * sMontgomery_reduce4));
        short sMontgomery_reduce11 = montgomery_reduce(fqinv(sMontgomery_reduce6) * RINV);
        sArr[i] = montgomery_reduce(sMontgomery_reduce7 * sMontgomery_reduce11);
        sArr[i + 1] = (short) (-montgomery_reduce(sMontgomery_reduce8 * sMontgomery_reduce11));
        sArr[i + 2] = montgomery_reduce(sMontgomery_reduce9 * sMontgomery_reduce11);
        sArr[i + 3] = (short) (-montgomery_reduce(sMontgomery_reduce10 * sMontgomery_reduce11));
        return 0;
    }

    public void crypto_kem_dec(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        int i5 = this.eighthN + 32;
        byte[] bArr4 = new byte[i5];
        int i6 = this.polyBytes;
        byte[] bArr5 = new byte[i6];
        byte[] bArr6 = new byte[i6];
        int i21 = i6 + 32;
        byte[] bArr7 = new byte[i21];
        int i22 = this.f228851n;
        short[] sArr = new short[i22];
        short[] sArr2 = new short[i22];
        short[] sArr3 = new short[i22];
        short[] sArr4 = new short[i22];
        short[] sArr5 = new short[i22];
        short[] sArr6 = new short[i22];
        short[] sArr7 = new short[i22];
        poly_frombytes(sArr, bArr2, i2);
        poly_frombytes(sArr2, bArr3, i3);
        poly_frombytes(sArr3, bArr3, this.polyBytes + i3);
        poly_basemul(sArr6, sArr, sArr2);
        poly_invntt(sArr6);
        poly_crepmod3(sArr6, sArr6);
        System.arraycopy(sArr6, 0, sArr7, 0, this.f228851n);
        poly_ntt(sArr7);
        poly_sub(sArr, sArr, sArr7);
        poly_basemul(sArr5, sArr, sArr3);
        poly_tobytes(bArr5, 0, sArr5);
        shake256(bArr6, 0, this.quarterN, (byte) 1, bArr5, 0, this.polyBytes);
        int iPoly_sotp_decode = poly_sotp_decode(bArr4, sArr6, bArr6);
        System.arraycopy(bArr3, (this.polyBytes * 2) + i3, bArr4, this.eighthN, 32);
        shake256(bArr7, 0, i21, (byte) 2, bArr4, 0, i5);
        poly_cbd1(sArr4, bArr7, 32);
        poly_ntt(sArr4);
        poly_tobytes(bArr6, 0, sArr4);
        cmov(bArr, bArr7, i, 32, verify(bArr5, bArr6, this.polyBytes) | iPoly_sotp_decode);
    }

    public void crypto_kem_enc_derand(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, byte[] bArr4, int i5) {
        int i6 = this.eighthN;
        int i21 = i6 + 32;
        byte[] bArr5 = new byte[i21];
        int i22 = this.quarterN + 32;
        byte[] bArr6 = new byte[i22];
        byte[] bArr7 = new byte[this.polyBytes];
        int i32 = this.f228851n;
        short[] sArr = new short[i32];
        short[] sArr2 = new short[i32];
        short[] sArr3 = new short[i32];
        short[] sArr4 = new short[i32];
        System.arraycopy(bArr4, i5, bArr5, 0, i6);
        shake256(bArr5, this.eighthN, 32, (byte) 0, bArr3, i3, this.polyBytes);
        shake256(bArr6, 0, i22, (byte) 2, bArr5, 0, i21);
        poly_cbd1(sArr3, bArr6, 32);
        poly_ntt(sArr3);
        poly_tobytes(bArr7, 0, sArr3);
        shake256(bArr7, 0, this.quarterN, (byte) 1, bArr7, 0, this.polyBytes);
        poly_sotp_encode(sArr4, bArr5, bArr7);
        poly_ntt(sArr4);
        poly_frombytes(sArr2, bArr3, i3);
        poly_basemul_add(sArr, sArr2, sArr3, sArr4);
        poly_tobytes(bArr, i, sArr);
        System.arraycopy(bArr6, 0, bArr2, i2, 32);
    }

    public void crypto_kem_keypair_derand(byte[] bArr, byte[] bArr2, short[] sArr, short[] sArr2, short[] sArr3, short[] sArr4) {
        int i = this.f228851n;
        short[] sArr5 = new short[i];
        short[] sArr6 = new short[i];
        poly_basemul(sArr5, sArr3, sArr2);
        poly_basemul(sArr6, sArr, sArr4);
        poly_tobytes(bArr, 0, sArr5);
        poly_tobytes(bArr2, 0, sArr);
        poly_tobytes(bArr2, this.polyBytes, sArr6);
        short s2 = this.polyBytes;
        shake256(bArr2, s2 << 1, 32, (byte) 0, bArr, 0, s2);
    }

    public short fqinv(short s2) {
        short sFqmul = fqmul(s2, s2);
        short sFqmul2 = fqmul(sFqmul, sFqmul);
        short sFqmul3 = fqmul(sFqmul2, sFqmul2);
        short sFqmul4 = fqmul(sFqmul3, sFqmul3);
        short sFqmul5 = fqmul(sFqmul, sFqmul3);
        short sFqmul6 = fqmul(sFqmul5, sFqmul4);
        short sFqmul7 = fqmul(fqmul(sFqmul6, sFqmul6), s2);
        short sFqmul8 = fqmul(sFqmul5, sFqmul7);
        short sFqmul9 = fqmul(sFqmul7, sFqmul7);
        short sFqmul10 = fqmul(sFqmul9, sFqmul9);
        short sFqmul11 = fqmul(sFqmul10, sFqmul10);
        short sFqmul12 = fqmul(sFqmul11, sFqmul11);
        short sFqmul13 = fqmul(sFqmul12, sFqmul12);
        return fqmul(fqmul(sFqmul13, sFqmul13), sFqmul8);
    }

    public short fqmul(short s2, short s3) {
        return montgomery_reduce(s2 * s3);
    }

    public int genf_derand(short[] sArr, short[] sArr2, byte[] bArr) {
        int i = this.quarterN;
        byte[] bArr2 = new byte[i];
        shake256(bArr2, 0, i, bArr, 32);
        poly_cbd1(sArr, bArr2, 0);
        poly_triple(sArr, sArr);
        sArr[0] = (short) (sArr[0] + 1);
        poly_ntt(sArr);
        return poly_baseinv(sArr2, sArr);
    }

    public int geng_derand(short[] sArr, short[] sArr2, byte[] bArr) {
        int i = this.quarterN;
        byte[] bArr2 = new byte[i];
        shake256(bArr2, 0, i, bArr, 32);
        poly_cbd1(sArr, bArr2, 0);
        poly_triple(sArr, sArr);
        poly_ntt(sArr);
        return poly_baseinv(sArr2, sArr);
    }

    public short montgomery_reduce(int i) {
        return (short) ((i - (((short) (i * 12929)) * Q)) >> 16);
    }

    public void poly_tobytes(byte[] bArr, int i, short[] sArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.halfN; i3++) {
            int i5 = i2 + 1;
            short s2 = sArr[i2];
            int i6 = s2 + ((s2 >> 15) & 3457);
            i2 += 2;
            short s3 = sArr[i5];
            int i21 = s3 + ((s3 >> 15) & 3457);
            bArr[i] = (byte) i6;
            int i22 = i + 2;
            bArr[i + 1] = (byte) ((i6 >> 8) | (i21 << 4));
            i += 3;
            bArr[i22] = (byte) (i21 >> 4);
        }
    }

    public void poly_triple(short[] sArr, short[] sArr2) {
        for (int i = 0; i < this.f228851n; i++) {
            sArr[i] = (short) (sArr2[i] * 3);
        }
    }

    public void shake256(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.shakeDigest.update(bArr2, 0, i3);
        this.shakeDigest.doFinal(bArr, i, i2);
    }
}
