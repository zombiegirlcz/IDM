package org.bouncycastle.crypto.kems.mlkem;

import com.google.android.material.internal.ViewUtils;
import j6.a;
import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.MLKEMParameters;
import org.bouncycastle.crypto.params.MLKEMPrivateKeyParameters;
import org.bouncycastle.crypto.params.MLKEMPublicKeyParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class MLKEMEngine {
    static final int Eta2 = 2;
    static final int N = 256;
    static final int PolyBytes = 384;
    static final int Q = 3329;
    static final int Qinv = 62209;
    public static final int SeedBytes = 64;
    static final int SharedSecretBytes = 32;
    public static final int SymBytes = 32;
    private static final MLKEMEngine[] engines = {new MLKEMEngine(MLKEMParameters.ml_kem_512.getK()), new MLKEMEngine(MLKEMParameters.ml_kem_768.getK()), new MLKEMEngine(MLKEMParameters.ml_kem_1024.getK())};
    private final int CipherTextBytes;
    private final int Eta1;
    private final int IndCpaPublicKeyBytes;
    private final int IndCpaSecretKeyBytes;
    private final int K;
    private final int PolyCompressedBytes;
    private final int PolyVecBytes;
    private final int PolyVecCompressedBytes;
    private final int SecretKeyBytes;
    private final MLKEMIndCpa indCpa;

    private MLKEMEngine(int i) {
        this.K = i;
        if (i == 2) {
            this.Eta1 = 3;
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalArgumentException(a.l(i, "K: ", " is not supported for ML-KEM"));
                }
                this.Eta1 = 2;
                this.PolyCompressedBytes = 160;
                this.PolyVecCompressedBytes = i * 352;
                int i2 = i * PolyBytes;
                this.PolyVecBytes = i2;
                int i3 = i2 + 32;
                this.IndCpaPublicKeyBytes = i3;
                this.IndCpaSecretKeyBytes = i2;
                this.CipherTextBytes = this.PolyVecCompressedBytes + this.PolyCompressedBytes;
                this.SecretKeyBytes = i2 + i3 + 64;
                this.indCpa = new MLKEMIndCpa(this);
            }
            this.Eta1 = 2;
        }
        this.PolyCompressedBytes = 128;
        this.PolyVecCompressedBytes = i * 320;
        int i22 = i * PolyBytes;
        this.PolyVecBytes = i22;
        int i32 = i22 + 32;
        this.IndCpaPublicKeyBytes = i32;
        this.IndCpaSecretKeyBytes = i22;
        this.CipherTextBytes = this.PolyVecCompressedBytes + this.PolyCompressedBytes;
        this.SecretKeyBytes = i22 + i32 + 64;
        this.indCpa = new MLKEMIndCpa(this);
    }

    private void cmov(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = (0 - i2) >> 24;
        for (int i5 = 0; i5 != i; i5++) {
            bArr[i5] = (byte) ((bArr2[i5] & i3) | (bArr[i5] & (~i3)));
        }
    }

    private int constantTimeZeroOnEqual(byte[] bArr, byte[] bArr2) {
        int length = bArr2.length ^ bArr.length;
        for (int i = 0; i != bArr2.length; i++) {
            length |= bArr[i] ^ bArr2[i];
        }
        return length & 255;
    }

    public static MLKEMEngine getInstance(MLKEMParameters mLKEMParameters) {
        return engines[mLKEMParameters.getK() - 2];
    }

    public static void hash_G(byte[] bArr, byte[] bArr2) {
        implDigest(new SHA3Digest(512), bArr, 0, bArr.length, bArr2, 0);
    }

    private static void hash_H(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        implDigest(new SHA3Digest(256), bArr, i, i2, bArr2, i3);
    }

    private static void implDigest(SHA3Digest sHA3Digest, byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        sHA3Digest.update(bArr, i, i2);
        sHA3Digest.doFinal(bArr2, i3);
    }

    public boolean checkModulus(byte[] bArr) {
        return PolyVec.checkModulus(this, bArr) < 0;
    }

    public boolean checkPrivateKey(byte[] bArr) {
        int k = getK();
        int i = k * PolyBytes;
        int i2 = k * ViewUtils.EDGE_TO_EDGE_FLAGS;
        if (i2 + 96 != bArr.length) {
            throw new IllegalArgumentException("'encoding' has invalid length");
        }
        byte[] bArr2 = new byte[32];
        hash_H(bArr, i, i + 32, bArr2, 0);
        return Arrays.constantTimeAreEqual(32, bArr2, 0, bArr, i2 + 32);
    }

    public byte[][] generateKemKeyPair(SecureRandom secureRandom) {
        byte[] bArr = new byte[32];
        byte[] bArr2 = new byte[32];
        secureRandom.nextBytes(bArr);
        secureRandom.nextBytes(bArr2);
        return generateKemKeyPairInternal(bArr, bArr2);
    }

    public byte[][] generateKemKeyPairInternal(byte[] bArr, byte[] bArr2) {
        byte[][] bArrGenerateKeyPair = this.indCpa.generateKeyPair(bArr);
        int i = this.IndCpaSecretKeyBytes;
        byte[] bArr3 = new byte[i];
        System.arraycopy(bArrGenerateKeyPair[1], 0, bArr3, 0, i);
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = bArrGenerateKeyPair[0];
        hash_H(bArr5, 0, bArr5.length, bArr4, 0);
        int i2 = this.IndCpaPublicKeyBytes;
        byte[] bArr6 = new byte[i2];
        System.arraycopy(bArrGenerateKeyPair[0], 0, bArr6, 0, i2);
        int i3 = i2 - 32;
        return new byte[][]{Arrays.copyOfRange(bArr6, 0, i3), Arrays.copyOfRange(bArr6, i3, i2), bArr3, bArr4, bArr2, Arrays.concatenate(bArr, bArr2)};
    }

    public int getCipherTextBytes() {
        return this.CipherTextBytes;
    }

    public int getEta1() {
        return this.Eta1;
    }

    public int getIndCpaPublicKeyBytes() {
        return this.IndCpaPublicKeyBytes;
    }

    public int getIndCpaSecretKeyBytes() {
        return this.IndCpaSecretKeyBytes;
    }

    public int getK() {
        return this.K;
    }

    public int getPolyCompressedBytes() {
        return this.PolyCompressedBytes;
    }

    public int getPolyVecBytes() {
        return this.PolyVecBytes;
    }

    public int getPolyVecCompressedBytes() {
        return this.PolyVecCompressedBytes;
    }

    public int getPublicKeyBytes() {
        return getIndCpaPublicKeyBytes();
    }

    public int getSecretKeyBytes() {
        return this.SecretKeyBytes;
    }

    public byte[] kemDecrypt(MLKEMPrivateKeyParameters mLKEMPrivateKeyParameters, byte[] bArr) {
        byte[] encoded = mLKEMPrivateKeyParameters.getEncoded();
        byte[] bArr2 = new byte[64];
        this.indCpa.decrypt(encoded, bArr, bArr2);
        System.arraycopy(encoded, this.SecretKeyBytes - 64, bArr2, 32, 32);
        byte[] bArr3 = new byte[64];
        hash_G(bArr2, bArr3);
        int iConstantTimeZeroOnEqual = constantTimeZeroOnEqual(bArr, this.indCpa.encrypt(encoded, this.IndCpaSecretKeyBytes, bArr2, 0, bArr3, 32));
        byte[] bArr4 = new byte[32];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(encoded, this.SecretKeyBytes - 32, 32);
        sHAKEDigest.update(bArr, 0, this.CipherTextBytes);
        sHAKEDigest.doFinal(bArr4, 0, 32);
        cmov(bArr3, bArr4, 32, iConstantTimeZeroOnEqual);
        return Arrays.copyOfRange(bArr3, 0, 32);
    }

    public byte[][] kemEncrypt(MLKEMPublicKeyParameters mLKEMPublicKeyParameters, byte[] bArr) {
        byte[] encoded = mLKEMPublicKeyParameters.getEncoded();
        byte[] bArr2 = new byte[64];
        byte[] bArr3 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, 32);
        hash_H(encoded, 0, encoded.length, bArr2, 32);
        hash_G(bArr2, bArr3);
        byte[] bArrEncrypt = this.indCpa.encrypt(encoded, 0, bArr2, 0, bArr3, 32);
        byte[] bArr4 = new byte[32];
        System.arraycopy(bArr3, 0, bArr4, 0, 32);
        return new byte[][]{bArr4, bArrEncrypt};
    }
}
