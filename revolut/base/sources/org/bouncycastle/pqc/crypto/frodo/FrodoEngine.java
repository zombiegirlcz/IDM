package org.bouncycastle.pqc.crypto.frodo;

import a0.d;
import com.google.common.primitives.UnsignedBytes;
import ehe.n;
import java.security.SecureRandom;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
class FrodoEngine {
    private static final int len_chi = 16;
    private static final int len_chi_bytes = 2;
    private static final int len_seedA = 128;
    private static final int len_seedA_bytes = 16;
    private static final int len_z = 128;
    private static final int len_z_bytes = 16;
    private static final int mbar = 8;
    static final int nbar = 8;
    private final int B;
    private final int D;
    private final short[] T_chi;
    private final Xof digest;
    private final FrodoMatrixGenerator gen;
    private final int len_ct_bytes;
    private final int len_k;
    private final int len_k_bytes;
    private final int len_mu;
    private final int len_mu_bytes;
    private final int len_pk_bytes;
    private final int len_pkh;
    private final int len_pkh_bytes;
    private final int len_s;
    private final int len_s_bytes;
    private final int len_seedSE;
    private final int len_seedSE_bytes;
    private final int len_sk_bytes;
    private final int len_ss;
    private final int len_ss_bytes;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f228800n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f228801q;

    public FrodoEngine(int i, int i2, int i3, short[] sArr, Xof xof2, FrodoMatrixGenerator frodoMatrixGenerator) {
        this.f228800n = i;
        this.D = i2;
        this.f228801q = 1 << i2;
        this.B = i3;
        int i5 = i3 * 64;
        this.len_mu = i5;
        this.len_seedSE = i5;
        this.len_s = i5;
        this.len_k = i5;
        this.len_pkh = i5;
        this.len_ss = i5;
        this.len_mu_bytes = i5 / 8;
        this.len_seedSE_bytes = i5 / 8;
        int i6 = i5 / 8;
        this.len_s_bytes = i6;
        this.len_k_bytes = i5 / 8;
        int i21 = i5 / 8;
        this.len_pkh_bytes = i21;
        this.len_ss_bytes = i5 / 8;
        int i22 = ((i2 * i) * 8) / 8;
        this.len_ct_bytes = d.D(i2, 64, 8, i22);
        int i32 = i22 + 16;
        this.len_pk_bytes = i32;
        this.len_sk_bytes = n.a(i, 16, i21, i6 + i32);
        this.T_chi = sArr;
        this.digest = xof2;
        this.gen = frodoMatrixGenerator;
    }

    private static int ctverify(short[] sArr, short[] sArr2, short[] sArr3, short[] sArr4) {
        int i = 0;
        for (int i2 = 0; i2 < sArr.length; i2++) {
            i |= sArr[i2] ^ sArr3[i2];
        }
        for (int i3 = 0; i3 < sArr2.length; i3++) {
            i |= sArr2[i3] ^ sArr4[i3];
        }
        return Nat.czero(i);
    }

    private byte[] decode(short[] sArr) {
        int i = this.B;
        short s2 = (short) ((1 << i) - 1);
        short s3 = (short) ((1 << this.D) - 1);
        byte[] bArr = new byte[i * 8];
        int i2 = 0;
        for (int i3 = 0; i3 < 8; i3++) {
            long j2 = 0;
            for (int i5 = 0; i5 < 8; i5++) {
                int i6 = sArr[i2] & s3;
                int i21 = this.D;
                int i22 = this.B;
                j2 |= ((long) (((short) ((i6 + (1 << ((i21 - i22) - 1))) >> (i21 - i22))) & s2)) << (i22 * i5);
                i2++;
            }
            int i32 = 0;
            while (true) {
                int i33 = this.B;
                if (i32 < i33) {
                    bArr[(i33 * i3) + i32] = (byte) ((j2 >> (i32 * 8)) & 255);
                    i32++;
                }
            }
        }
        return bArr;
    }

    private short[] encode(byte[] bArr) {
        int i;
        short[] sArr = new short[64];
        int i2 = 0;
        int i3 = 0;
        for (int i5 = 0; i5 < 8; i5++) {
            for (int i6 = 0; i6 < 8; i6++) {
                int i21 = 0;
                int i22 = 0;
                while (true) {
                    i = this.B;
                    if (i21 < i) {
                        i22 += ((bArr[i2] >>> i3) & 1) << i21;
                        int i32 = i3 + 1;
                        i2 += i32 >>> 3;
                        i3 = i32 & 7;
                        i21++;
                    }
                }
                sArr[(i5 * 8) + i6] = (short) ((this.f228801q / (1 << i)) * i22);
            }
        }
        return sArr;
    }

    private short[] matrix_add(short[] sArr, short[] sArr2, int i, int i2) {
        int i3 = this.f228801q - 1;
        short[] sArr3 = new short[i * i2];
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = 0; i6 < i2; i6++) {
                int i21 = (i5 * i2) + i6;
                sArr3[i21] = (short) ((sArr[i21] + sArr2[i21]) & i3);
            }
        }
        return sArr3;
    }

    private short[] matrix_mul(short[] sArr, int i, int i2, short[] sArr2, int i3) {
        int i5 = this.f228801q - 1;
        short[] sArr3 = new short[i * i3];
        for (int i6 = 0; i6 < i; i6++) {
            for (int i21 = 0; i21 < i3; i21++) {
                int i22 = 0;
                for (int i32 = 0; i32 < i2; i32++) {
                    i22 += sArr[(i6 * i2) + i32] * sArr2[(i32 * i3) + i21];
                }
                sArr3[(i6 * i3) + i21] = (short) (i22 & i5);
            }
        }
        return sArr3;
    }

    private short[] matrix_sub(short[] sArr, short[] sArr2, int i, int i2) {
        int i3 = this.f228801q - 1;
        short[] sArr3 = new short[i * i2];
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = 0; i6 < i2; i6++) {
                int i21 = (i5 * i2) + i6;
                sArr3[i21] = (short) ((sArr[i21] - sArr2[i21]) & i3);
            }
        }
        return sArr3;
    }

    private short[] matrix_transpose(short[] sArr, int i, int i2) {
        short[] sArr2 = new short[i * i2];
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i5 = 0; i5 < i; i5++) {
                sArr2[(i3 * i) + i5] = sArr[(i5 * i2) + i3];
            }
        }
        return sArr2;
    }

    private byte[] pack(short[] sArr) {
        int length = sArr.length;
        int i = (this.D * length) / 8;
        byte[] bArr = new byte[i];
        short s2 = 0;
        short s3 = 0;
        byte b4 = 0;
        short s4 = 0;
        while (s2 < i && (s3 < length || (s3 == length && b4 > 0))) {
            byte b5 = 0;
            while (b5 < 8) {
                int i2 = 8 - b5;
                int iMin = Math.min(i2, (int) b4);
                int i3 = b4 - iMin;
                bArr[s2] = (byte) (bArr[s2] + (((byte) (((short) ((1 << iMin) - 1)) & (s4 >> i3))) << (i2 - iMin)));
                b5 = (byte) (b5 + iMin);
                b4 = (byte) i3;
                if (b4 == 0) {
                    if (s3 >= length) {
                        break;
                    }
                    short s6 = sArr[s3];
                    s3 = (short) (s3 + 1);
                    s4 = s6;
                    b4 = (byte) this.D;
                }
            }
            if (b5 == 8) {
                s2 = (short) (s2 + 1);
            }
        }
        return bArr;
    }

    private short[] sample_matrix(short[] sArr, int i, int i2, int i3) {
        short[] sArr2 = new short[i2 * i3];
        Noise.sample(this.T_chi, sArr, i, sArr2);
        return sArr2;
    }

    private short[] unpack(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        short[] sArr = new short[i3];
        short s2 = 0;
        short s3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        while (s2 < i3 && (s3 < bArr.length || (s3 == bArr.length && b4 > 0))) {
            byte b7 = 0;
            while (true) {
                int i5 = this.D;
                if (b7 >= i5) {
                    break;
                }
                int iMin = Math.min(i5 - b7, (int) b4);
                short s4 = (short) (((1 << iMin) - 1) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                sArr[s2] = (short) (((sArr[s2] & HPKE.aead_EXPORT_ONLY) + ((((byte) ((((b5 & UnsignedBytes.MAX_VALUE) >>> ((b4 & UnsignedBytes.MAX_VALUE) - iMin)) & (s4 & HPKE.aead_EXPORT_ONLY)) & 255)) & UnsignedBytes.MAX_VALUE) << ((this.D - (b7 & UnsignedBytes.MAX_VALUE)) - iMin))) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                b7 = (byte) (b7 + iMin);
                byte b13 = (byte) (b4 - iMin);
                byte b15 = (byte) ((~(s4 << b13)) & b5);
                if (b13 != 0) {
                    b5 = b15;
                    b4 = b13;
                } else {
                    if (s3 >= bArr.length) {
                        b5 = b15;
                        b4 = b13;
                        break;
                    }
                    byte b17 = bArr[s3];
                    s3 = (short) (s3 + 1);
                    b4 = 8;
                    b5 = b17;
                }
            }
            if (b7 == this.D) {
                s2 = (short) (s2 + 1);
            }
        }
        return sArr;
    }

    public int getCipherTextSize() {
        return this.len_ct_bytes;
    }

    public int getPrivateKeySize() {
        return this.len_sk_bytes;
    }

    public int getPublicKeySize() {
        return this.len_pk_bytes;
    }

    public int getSessionKeySize() {
        return this.len_ss_bytes;
    }

    public void kem_dec(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i = ((this.f228800n * 8) * this.D) / 8;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 0, i);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr2, i, d.D(this.D, 64, 8, i));
        int i2 = this.len_s_bytes + 16;
        int i3 = (((this.D * this.f228800n) * 8) / 8) + i2;
        byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr3, i2, i3);
        int iD = d.D(this.f228800n, 128, 8, i3);
        byte[] bArrCopyOfRange4 = Arrays.copyOfRange(bArr3, i3, iD);
        short[] sArr = new short[this.f228800n * 8];
        for (int i5 = 0; i5 < 8; i5++) {
            int i6 = 0;
            while (true) {
                int i21 = this.f228800n;
                if (i6 < i21) {
                    sArr[(i5 * i21) + i6] = Pack.littleEndianToShort(bArrCopyOfRange4, (i6 * 2) + (i21 * i5 * 2));
                    i6++;
                }
            }
        }
        short[] sArrMatrix_transpose = matrix_transpose(sArr, 8, this.f228800n);
        byte[] bArrCopyOfRange5 = Arrays.copyOfRange(bArr3, iD, this.len_pkh_bytes + iD);
        short[] sArrUnpack = unpack(bArrCopyOfRange, 8, this.f228800n);
        short[] sArrUnpack2 = unpack(bArrCopyOfRange2, 8, 8);
        byte[] bArrDecode = decode(matrix_sub(sArrUnpack2, matrix_mul(sArrUnpack, 8, this.f228800n, sArrMatrix_transpose, 8), 8, 8));
        byte[] bArr4 = new byte[this.len_seedSE_bytes + this.len_k_bytes];
        this.digest.update(bArrCopyOfRange5, 0, this.len_pkh_bytes);
        this.digest.update(bArrDecode, 0, this.len_mu_bytes);
        this.digest.doFinal(bArr4, 0, this.len_seedSE_bytes + this.len_k_bytes);
        int i22 = this.len_seedSE_bytes;
        byte[] bArrCopyOfRange6 = Arrays.copyOfRange(bArr4, i22, this.len_k_bytes + i22);
        int i32 = ((this.f228800n * 16) + 64) * 2;
        byte[] bArr5 = new byte[i32];
        this.digest.update((byte) -106);
        this.digest.update(bArr4, 0, this.len_seedSE_bytes);
        this.digest.doFinal(bArr5, 0, i32);
        short[] sArrLittleEndianToShort = Pack.littleEndianToShort(bArr5, 0, i32 / 2);
        short[] sArrSample_matrix = sample_matrix(sArrLittleEndianToShort, 0, 8, this.f228800n);
        int i33 = this.f228800n;
        short[] sArrSample_matrix2 = sample_matrix(sArrLittleEndianToShort, i33 * 8, 8, i33);
        short[] sArrGenMatrix = this.gen.genMatrix(bArr3, this.len_s_bytes, 16);
        int i43 = this.f228800n;
        Bytes.cmov(bArrCopyOfRange6.length, ~ctverify(sArrUnpack, sArrUnpack2, matrix_add(matrix_mul(sArrSample_matrix, 8, i43, sArrGenMatrix, i43), sArrSample_matrix2, 8, this.f228800n), matrix_add(matrix_add(matrix_mul(sArrSample_matrix, 8, this.f228800n, unpack(bArrCopyOfRange3, this.f228800n, 8), 8), sample_matrix(sArrLittleEndianToShort, this.f228800n * 16, 8, 8), 8, 8), encode(bArrDecode), 8, 8)), bArr3, bArrCopyOfRange6);
        this.digest.update(bArrCopyOfRange, 0, bArrCopyOfRange.length);
        this.digest.update(bArrCopyOfRange2, 0, bArrCopyOfRange2.length);
        this.digest.update(bArrCopyOfRange6, 0, bArrCopyOfRange6.length);
        this.digest.doFinal(bArr, 0, this.len_ss_bytes);
    }

    public void kem_enc(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, 16, this.len_pk_bytes);
        byte[] bArr4 = new byte[this.len_mu_bytes];
        secureRandom.nextBytes(bArr4);
        byte[] bArr5 = new byte[this.len_pkh_bytes];
        this.digest.update(bArr3, 0, this.len_pk_bytes);
        this.digest.doFinal(bArr5, 0, this.len_pkh_bytes);
        byte[] bArr6 = new byte[this.len_seedSE + this.len_k];
        this.digest.update(bArr5, 0, this.len_pkh_bytes);
        this.digest.update(bArr4, 0, this.len_mu_bytes);
        this.digest.doFinal(bArr6, 0, this.len_seedSE_bytes + this.len_k_bytes);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr6, 0, this.len_seedSE_bytes);
        int i = this.len_seedSE_bytes;
        byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr6, i, this.len_k_bytes + i);
        int i2 = ((this.f228800n * 16) + 64) * 2;
        byte[] bArr7 = new byte[i2];
        this.digest.update((byte) -106);
        this.digest.update(bArrCopyOfRange2, 0, bArrCopyOfRange2.length);
        this.digest.doFinal(bArr7, 0, i2);
        short[] sArrLittleEndianToShort = Pack.littleEndianToShort(bArr7, 0, i2 / 2);
        short[] sArrSample_matrix = sample_matrix(sArrLittleEndianToShort, 0, 8, this.f228800n);
        int i3 = this.f228800n;
        short[] sArrSample_matrix2 = sample_matrix(sArrLittleEndianToShort, i3 * 8, 8, i3);
        short[] sArrGenMatrix = this.gen.genMatrix(bArr3, 0, 16);
        int i5 = this.f228800n;
        byte[] bArrPack = pack(matrix_add(matrix_mul(sArrSample_matrix, 8, i5, sArrGenMatrix, i5), sArrSample_matrix2, 8, this.f228800n));
        byte[] bArrPack2 = pack(matrix_add(matrix_add(matrix_mul(sArrSample_matrix, 8, this.f228800n, unpack(bArrCopyOfRange, this.f228800n, 8), 8), sample_matrix(sArrLittleEndianToShort, this.f228800n * 16, 8, 8), 8, 8), encode(bArr4), 8, 8));
        System.arraycopy(bArrPack, 0, bArr, 0, bArrPack.length);
        System.arraycopy(bArrPack2, 0, bArr, bArrPack.length, this.len_ct_bytes - bArrPack.length);
        this.digest.update(bArr, 0, this.len_ct_bytes);
        this.digest.update(bArrCopyOfRange3, 0, this.len_k_bytes);
        this.digest.doFinal(bArr2, 0, this.len_s_bytes);
    }

    public void kem_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        byte[] bArr3 = new byte[this.len_s_bytes + this.len_seedSE_bytes + 16];
        secureRandom.nextBytes(bArr3);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, 0, this.len_s_bytes);
        int i = this.len_s_bytes;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr3, i, this.len_seedSE_bytes + i);
        int i2 = this.len_s_bytes;
        int i3 = this.len_seedSE_bytes;
        byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr3, i2 + i3, i2 + i3 + 16);
        byte[] bArr4 = new byte[16];
        this.digest.update(bArrCopyOfRange3, 0, bArrCopyOfRange3.length);
        this.digest.doFinal(bArr4, 0, 16);
        short[] sArrGenMatrix = this.gen.genMatrix(bArr4, 0, 16);
        int i5 = this.f228800n * 32;
        byte[] bArr5 = new byte[i5];
        this.digest.update((byte) 95);
        this.digest.update(bArrCopyOfRange2, 0, bArrCopyOfRange2.length);
        this.digest.doFinal(bArr5, 0, i5);
        short[] sArrLittleEndianToShort = Pack.littleEndianToShort(bArr5, 0, i5 / 2);
        short[] sArrSample_matrix = sample_matrix(sArrLittleEndianToShort, 0, 8, this.f228800n);
        short[] sArrMatrix_transpose = matrix_transpose(sArrSample_matrix, 8, this.f228800n);
        int i6 = this.f228800n;
        short[] sArrSample_matrix2 = sample_matrix(sArrLittleEndianToShort, i6 * 8, i6, 8);
        int i21 = this.f228800n;
        byte[] bArrPack = pack(matrix_add(matrix_mul(sArrGenMatrix, i21, i21, sArrMatrix_transpose, 8), sArrSample_matrix2, this.f228800n, 8));
        System.arraycopy(bArr4, 0, bArr, 0, 16);
        System.arraycopy(bArrPack, 0, bArr, 16, this.len_pk_bytes - 16);
        int i22 = this.len_pkh_bytes;
        byte[] bArr6 = new byte[i22];
        this.digest.update(bArr, 0, bArr.length);
        this.digest.doFinal(bArr6, 0, i22);
        System.arraycopy(bArrCopyOfRange, 0, bArr2, 0, this.len_s_bytes);
        System.arraycopy(bArr, 0, bArr2, this.len_s_bytes, this.len_pk_bytes);
        Pack.shortToLittleEndian(sArrSample_matrix, bArr2, this.len_s_bytes + this.len_pk_bytes);
        int i32 = this.len_sk_bytes;
        int i33 = this.len_pkh_bytes;
        System.arraycopy(bArr6, 0, bArr2, i32 - i33, i33);
    }
}
