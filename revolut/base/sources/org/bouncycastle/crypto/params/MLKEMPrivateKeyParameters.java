package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.kems.mlkem.MLKEMEngine;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class MLKEMPrivateKeyParameters extends MLKEMKeyParameters {
    public static final int BOTH = 0;
    public static final int EXPANDED_KEY = 2;
    public static final int SEED_ONLY = 1;

    /* JADX INFO: renamed from: hpk, reason: collision with root package name */
    final byte[] f228528hpk;
    final byte[] nonce;
    private final int prefFormat;
    final byte[] rho;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final byte[] f228529s;
    final byte[] seed;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final byte[] f228530t;

    public MLKEMPrivateKeyParameters(MLKEMParameters mLKEMParameters, byte[] bArr) {
        this(mLKEMParameters, bArr, null);
    }

    private void validate() {
        if (!MLKEMEngine.getInstance(getParameters()).checkPrivateKey(getEncoded())) {
            throw new IllegalArgumentException("'encoding' fails hash check");
        }
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(new byte[][]{this.f228529s, this.f228530t, this.rho, this.f228528hpk, this.nonce});
    }

    public byte[] getHPK() {
        return Arrays.clone(this.f228528hpk);
    }

    public byte[] getNonce() {
        return Arrays.clone(this.nonce);
    }

    public MLKEMPrivateKeyParameters getParametersWithFormat(int i) {
        return withPreferredFormat(i);
    }

    public int getPreferredFormat() {
        return this.prefFormat;
    }

    public byte[] getPublicKey() {
        return MLKEMPublicKeyParameters.getEncoded(this.f228530t, this.rho);
    }

    public MLKEMPublicKeyParameters getPublicKeyParameters() {
        return new MLKEMPublicKeyParameters(getParameters(), this.f228530t, this.rho);
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }

    public byte[] getS() {
        return Arrays.clone(this.f228529s);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.seed);
    }

    public byte[] getT() {
        return Arrays.clone(this.f228530t);
    }

    public MLKEMPrivateKeyParameters withPreferredFormat(int i) {
        if (this.prefFormat == i) {
            return this;
        }
        if (i == 0 || i == 1) {
            if (this.seed == null) {
                throw new IllegalStateException("no seed available");
            }
        } else if (i != 2) {
            throw new IllegalArgumentException("unknown format");
        }
        return new MLKEMPrivateKeyParameters(this, i);
    }

    public MLKEMPrivateKeyParameters(MLKEMParameters mLKEMParameters, byte[] bArr, MLKEMPublicKeyParameters mLKEMPublicKeyParameters) {
        super(true, mLKEMParameters);
        MLKEMEngine mLKEMEngine = MLKEMEngine.getInstance(mLKEMParameters);
        if (bArr.length == 64) {
            byte[][] bArrGenerateKemKeyPairInternal = mLKEMEngine.generateKemKeyPairInternal(Arrays.copyOfRange(bArr, 0, 32), Arrays.copyOfRange(bArr, 32, bArr.length));
            this.f228529s = bArrGenerateKemKeyPairInternal[2];
            this.f228528hpk = bArrGenerateKemKeyPairInternal[3];
            this.nonce = bArrGenerateKemKeyPairInternal[4];
            this.f228530t = bArrGenerateKemKeyPairInternal[0];
            this.rho = bArrGenerateKemKeyPairInternal[1];
            this.seed = bArrGenerateKemKeyPairInternal[5];
        } else {
            this.f228529s = Arrays.copyOfRange(bArr, 0, mLKEMEngine.getIndCpaSecretKeyBytes());
            int indCpaSecretKeyBytes = mLKEMEngine.getIndCpaSecretKeyBytes();
            this.f228530t = Arrays.copyOfRange(bArr, indCpaSecretKeyBytes, (mLKEMEngine.getIndCpaPublicKeyBytes() + indCpaSecretKeyBytes) - 32);
            int indCpaPublicKeyBytes = (mLKEMEngine.getIndCpaPublicKeyBytes() - 32) + indCpaSecretKeyBytes;
            int i = indCpaPublicKeyBytes + 32;
            this.rho = Arrays.copyOfRange(bArr, indCpaPublicKeyBytes, i);
            int i2 = indCpaPublicKeyBytes + 64;
            this.f228528hpk = Arrays.copyOfRange(bArr, i, i2);
            this.nonce = Arrays.copyOfRange(bArr, i2, indCpaPublicKeyBytes + 96);
            this.seed = null;
        }
        validate();
        if (mLKEMPublicKeyParameters != null && (!Arrays.constantTimeAreEqual(this.f228530t, mLKEMPublicKeyParameters.f228531t) || !Arrays.constantTimeAreEqual(this.rho, mLKEMPublicKeyParameters.rho))) {
            throw new IllegalArgumentException("passed in public key does not match private values");
        }
        this.prefFormat = this.seed != null ? 0 : 2;
    }

    public MLKEMPrivateKeyParameters(MLKEMParameters mLKEMParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this(mLKEMParameters, bArr, bArr2, bArr3, bArr4, bArr5, null);
    }

    public MLKEMPrivateKeyParameters(MLKEMParameters mLKEMParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        super(true, mLKEMParameters);
        this.f228529s = Arrays.clone(bArr);
        this.f228528hpk = Arrays.clone(bArr2);
        this.nonce = Arrays.clone(bArr3);
        this.f228530t = Arrays.clone(bArr4);
        this.rho = Arrays.clone(bArr5);
        this.seed = Arrays.clone(bArr6);
        this.prefFormat = 0;
        validate();
    }

    private MLKEMPrivateKeyParameters(MLKEMPrivateKeyParameters mLKEMPrivateKeyParameters, int i) {
        super(true, mLKEMPrivateKeyParameters.getParameters());
        this.f228529s = mLKEMPrivateKeyParameters.f228529s;
        this.f228530t = mLKEMPrivateKeyParameters.f228530t;
        this.rho = mLKEMPrivateKeyParameters.rho;
        this.f228528hpk = mLKEMPrivateKeyParameters.f228528hpk;
        this.nonce = mLKEMPrivateKeyParameters.nonce;
        this.seed = mLKEMPrivateKeyParameters.seed;
        this.prefFormat = i;
        validate();
    }
}
