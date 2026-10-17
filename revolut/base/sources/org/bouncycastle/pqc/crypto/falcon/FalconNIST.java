package org.bouncycastle.pqc.crypto.falcon;

import a0.d;
import ehe.n;
import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
class FalconNIST {
    final int CRYPTO_BYTES;
    private final int CRYPTO_PUBLICKEYBYTES;
    private final int CRYPTO_SECRETKEYBYTES;
    final int LOGN;
    private final int N;
    final int NONCELEN;
    private final SecureRandom rand;

    public FalconNIST(int i, int i2, SecureRandom secureRandom) {
        this.rand = secureRandom;
        this.LOGN = i;
        this.NONCELEN = i2;
        int i3 = 1 << i;
        this.N = i3;
        this.CRYPTO_PUBLICKEYBYTES = d.D(i3, 14, 8, 1);
        if (i == 10) {
            this.CRYPTO_SECRETKEYBYTES = 2305;
            this.CRYPTO_BYTES = 1330;
            return;
        }
        if (i == 9 || i == 8) {
            this.CRYPTO_SECRETKEYBYTES = ((i3 * 12) / 8) + 1 + i3;
            this.CRYPTO_BYTES = 690;
        } else if (i == 7 || i == 6) {
            this.CRYPTO_SECRETKEYBYTES = ((i3 * 14) / 8) + 1 + i3;
            this.CRYPTO_BYTES = 690;
        } else {
            this.CRYPTO_SECRETKEYBYTES = n.a(i3, 2, 1, i3);
            this.CRYPTO_BYTES = 690;
        }
    }

    public byte[] crypto_sign(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        int i2 = this.N;
        byte[] bArr4 = new byte[i2];
        byte[] bArr5 = new byte[i2];
        byte[] bArr6 = new byte[i2];
        byte[] bArr7 = new byte[i2];
        short[] sArr = new short[i2];
        short[] sArr2 = new short[i2];
        byte[] bArr8 = new byte[48];
        byte[] bArr9 = new byte[this.NONCELEN];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        FalconSign falconSign = new FalconSign();
        int i3 = this.LOGN;
        byte[] bArr10 = FalconCodec.max_fg_bits;
        int iTrim_i8_decode = FalconCodec.trim_i8_decode(bArr4, i3, bArr10[i3], bArr3, 0, this.CRYPTO_SECRETKEYBYTES);
        if (iTrim_i8_decode == 0) {
            throw new IllegalStateException("f decode failed");
        }
        int i5 = this.LOGN;
        int iTrim_i8_decode2 = FalconCodec.trim_i8_decode(bArr5, i5, bArr10[i5], bArr3, iTrim_i8_decode, this.CRYPTO_SECRETKEYBYTES - iTrim_i8_decode);
        if (iTrim_i8_decode2 == 0) {
            throw new IllegalStateException("g decode failed");
        }
        int i6 = iTrim_i8_decode + iTrim_i8_decode2;
        int i21 = this.LOGN;
        int iTrim_i8_decode3 = FalconCodec.trim_i8_decode(bArr6, i21, FalconCodec.max_FG_bits[i21], bArr3, i6, this.CRYPTO_SECRETKEYBYTES - i6);
        if (iTrim_i8_decode3 == 0) {
            throw new IllegalArgumentException("F decode failed");
        }
        if (iTrim_i8_decode3 + i6 != this.CRYPTO_SECRETKEYBYTES - 1) {
            throw new IllegalStateException("full key not used");
        }
        if (!FalconVrfy.complete_private(bArr7, bArr4, bArr5, bArr6, this.LOGN, new short[this.N * 2])) {
            throw new IllegalStateException("complete_private failed");
        }
        this.rand.nextBytes(bArr9);
        sHAKEDigest.update(bArr9, 0, this.NONCELEN);
        sHAKEDigest.update(bArr2, 0, i);
        FalconCommon.hash_to_point_vartime(sHAKEDigest, sArr2, this.LOGN);
        this.rand.nextBytes(bArr8);
        sHAKEDigest.reset();
        sHAKEDigest.update(bArr8, 0, 48);
        falconSign.sign_dyn(sArr, sHAKEDigest, bArr4, bArr5, bArr6, bArr7, sArr2, this.LOGN, new double[this.N * 10]);
        int i22 = (this.CRYPTO_BYTES - 2) - this.NONCELEN;
        byte[] bArr11 = new byte[i22];
        int iComp_encode = FalconCodec.comp_encode(bArr11, i22, sArr, this.LOGN);
        if (iComp_encode == 0) {
            throw new IllegalStateException("signature failed to generate");
        }
        bArr[0] = (byte) (this.LOGN + 48);
        System.arraycopy(bArr9, 0, bArr, 1, this.NONCELEN);
        System.arraycopy(bArr11, 0, bArr, this.NONCELEN + 1, iComp_encode);
        return Arrays.copyOfRange(bArr, 0, this.NONCELEN + 1 + iComp_encode);
    }

    public byte[][] crypto_sign_keypair(byte[] bArr, byte[] bArr2) {
        int i = this.N;
        byte[] bArr3 = new byte[i];
        byte[] bArr4 = new byte[i];
        byte[] bArr5 = new byte[i];
        short[] sArr = new short[i];
        byte[] bArr6 = new byte[48];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        this.rand.nextBytes(bArr6);
        sHAKEDigest.update(bArr6, 0, 48);
        FalconKeyGen.keygen(sHAKEDigest, bArr3, bArr4, bArr5, sArr, this.LOGN);
        int i2 = this.LOGN;
        bArr2[0] = (byte) (i2 + 80);
        int i3 = this.CRYPTO_SECRETKEYBYTES - 1;
        byte[] bArr7 = FalconCodec.max_fg_bits;
        int iTrim_i8_encode = FalconCodec.trim_i8_encode(bArr2, 1, i3, bArr3, i2, bArr7[i2]);
        if (iTrim_i8_encode == 0) {
            throw new IllegalStateException("f encode failed");
        }
        int i5 = iTrim_i8_encode + 1;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 1, i5);
        int i6 = this.CRYPTO_SECRETKEYBYTES - i5;
        int i21 = this.LOGN;
        int iTrim_i8_encode2 = FalconCodec.trim_i8_encode(bArr2, i5, i6, bArr4, i21, bArr7[i21]);
        if (iTrim_i8_encode2 == 0) {
            throw new IllegalStateException("g encode failed");
        }
        int i22 = i5 + iTrim_i8_encode2;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr2, i5, i22);
        int i32 = this.CRYPTO_SECRETKEYBYTES - i22;
        int i33 = this.LOGN;
        int iTrim_i8_encode3 = FalconCodec.trim_i8_encode(bArr2, i22, i32, bArr5, i33, FalconCodec.max_FG_bits[i33]);
        if (iTrim_i8_encode3 == 0) {
            throw new IllegalStateException("F encode failed");
        }
        int i43 = iTrim_i8_encode3 + i22;
        byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr2, i22, i43);
        if (i43 != this.CRYPTO_SECRETKEYBYTES) {
            throw new IllegalStateException("secret key encoding failed");
        }
        int i59 = this.LOGN;
        bArr[0] = (byte) i59;
        if (FalconCodec.modq_encode(bArr, this.CRYPTO_PUBLICKEYBYTES - 1, sArr, i59) == this.CRYPTO_PUBLICKEYBYTES - 1) {
            return new byte[][]{Arrays.copyOfRange(bArr, 1, bArr.length), bArrCopyOfRange, bArrCopyOfRange2, bArrCopyOfRange3};
        }
        throw new IllegalStateException("public key encoding failed");
    }

    public int crypto_sign_open(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int i = this.N;
        short[] sArr = new short[i];
        short[] sArr2 = new short[i];
        short[] sArr3 = new short[i];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        if (FalconCodec.modq_decode(sArr, this.LOGN, bArr4, this.CRYPTO_PUBLICKEYBYTES - 1) != this.CRYPTO_PUBLICKEYBYTES - 1) {
            return -1;
        }
        FalconVrfy.to_ntt_monty(sArr, this.LOGN);
        int length = bArr.length;
        int length2 = bArr3.length;
        if (length < 1 || FalconCodec.comp_decode(sArr3, this.LOGN, bArr, length) != length) {
            return -1;
        }
        sHAKEDigest.update(bArr2, 0, this.NONCELEN);
        sHAKEDigest.update(bArr3, 0, length2);
        FalconCommon.hash_to_point_vartime(sHAKEDigest, sArr2, this.LOGN);
        return FalconVrfy.verify_raw(sArr2, sArr3, sArr, this.LOGN, new short[this.N]) == 0 ? -1 : 0;
    }
}
