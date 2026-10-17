package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.signers.mldsa.MLDSAEngine;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class MLDSAPrivateKeyParameters extends MLDSAKeyParameters {
    public static final int BOTH = 0;
    public static final int EXPANDED_KEY = 2;
    public static final int SEED_ONLY = 1;
    final byte[] k;
    private final int prefFormat;
    final byte[] rho;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    final byte[] f228523s1;
    final byte[] s2;
    private final byte[] seed;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    final byte[] f228524t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private final byte[] f228525t1;

    /* JADX INFO: renamed from: tr, reason: collision with root package name */
    final byte[] f228526tr;

    public MLDSAPrivateKeyParameters(MLDSAParameters mLDSAParameters, byte[] bArr) {
        this(mLDSAParameters, bArr, null);
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(new byte[][]{this.rho, this.k, this.f228526tr, this.f228523s1, this.s2, this.f228524t0});
    }

    public byte[] getK() {
        return Arrays.clone(this.k);
    }

    public MLDSAPrivateKeyParameters getParametersWithFormat(int i) {
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
        return new MLDSAPrivateKeyParameters(this, i);
    }

    public int getPreferredFormat() {
        return this.prefFormat;
    }

    @Deprecated
    public byte[] getPrivateKey() {
        return getEncoded();
    }

    public byte[] getPublicKey() {
        return MLDSAPublicKeyParameters.getEncoded(this.rho, this.f228525t1);
    }

    public MLDSAPublicKeyParameters getPublicKeyParameters() {
        if (this.f228525t1 == null) {
            return null;
        }
        return new MLDSAPublicKeyParameters(getParameters(), this.rho, this.f228525t1);
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }

    public byte[] getS1() {
        return Arrays.clone(this.f228523s1);
    }

    public byte[] getS2() {
        return Arrays.clone(this.s2);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.seed);
    }

    public byte[] getT0() {
        return Arrays.clone(this.f228524t0);
    }

    public byte[] getT1() {
        return Arrays.clone(this.f228525t1);
    }

    public byte[] getTr() {
        return Arrays.clone(this.f228526tr);
    }

    public MLDSAPrivateKeyParameters(MLDSAParameters mLDSAParameters, byte[] bArr, MLDSAPublicKeyParameters mLDSAPublicKeyParameters) {
        super(true, mLDSAParameters);
        MLDSAEngine mLDSAEngine = MLDSAEngine.getInstance(mLDSAParameters, null);
        if (bArr.length == 32) {
            byte[][] bArrGenerateKeyPairInternal = mLDSAEngine.generateKeyPairInternal(bArr);
            this.rho = bArrGenerateKeyPairInternal[0];
            this.k = bArrGenerateKeyPairInternal[1];
            this.f228526tr = bArrGenerateKeyPairInternal[2];
            this.f228523s1 = bArrGenerateKeyPairInternal[3];
            this.s2 = bArrGenerateKeyPairInternal[4];
            this.f228524t0 = bArrGenerateKeyPairInternal[5];
            this.f228525t1 = bArrGenerateKeyPairInternal[6];
            this.seed = bArrGenerateKeyPairInternal[7];
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 32);
            this.rho = bArrCopyOfRange;
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 32, 64);
            this.k = bArrCopyOfRange2;
            byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr, 64, 128);
            this.f228526tr = bArrCopyOfRange3;
            int dilithiumPolyEtaPackedBytes = (mLDSAEngine.getDilithiumPolyEtaPackedBytes() * mLDSAEngine.getDilithiumL()) + 128;
            byte[] bArrCopyOfRange4 = Arrays.copyOfRange(bArr, 128, dilithiumPolyEtaPackedBytes);
            this.f228523s1 = bArrCopyOfRange4;
            int dilithiumPolyEtaPackedBytes2 = (mLDSAEngine.getDilithiumPolyEtaPackedBytes() * mLDSAEngine.getDilithiumK()) + dilithiumPolyEtaPackedBytes;
            byte[] bArrCopyOfRange5 = Arrays.copyOfRange(bArr, dilithiumPolyEtaPackedBytes, dilithiumPolyEtaPackedBytes2);
            this.s2 = bArrCopyOfRange5;
            byte[] bArrCopyOfRange6 = Arrays.copyOfRange(bArr, dilithiumPolyEtaPackedBytes2, (mLDSAEngine.getDilithiumK() * 416) + dilithiumPolyEtaPackedBytes2);
            this.f228524t0 = bArrCopyOfRange6;
            this.f228525t1 = mLDSAEngine.deriveT1(bArrCopyOfRange, bArrCopyOfRange2, bArrCopyOfRange3, bArrCopyOfRange4, bArrCopyOfRange5, bArrCopyOfRange6);
            this.seed = null;
        }
        if (mLDSAPublicKeyParameters != null && !Arrays.constantTimeAreEqual(this.f228525t1, mLDSAPublicKeyParameters.getT1())) {
            throw new IllegalArgumentException("passed in public key does not match private values");
        }
        this.prefFormat = this.seed != null ? 0 : 2;
    }

    public MLDSAPrivateKeyParameters(MLDSAParameters mLDSAParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        this(mLDSAParameters, bArr, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7, null);
    }

    public MLDSAPrivateKeyParameters(MLDSAParameters mLDSAParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8) {
        super(true, mLDSAParameters);
        this.rho = Arrays.clone(bArr);
        this.k = Arrays.clone(bArr2);
        this.f228526tr = Arrays.clone(bArr3);
        this.f228523s1 = Arrays.clone(bArr4);
        this.s2 = Arrays.clone(bArr5);
        this.f228524t0 = Arrays.clone(bArr6);
        this.f228525t1 = Arrays.clone(bArr7);
        this.seed = Arrays.clone(bArr8);
        this.prefFormat = bArr8 != null ? 0 : 2;
    }

    private MLDSAPrivateKeyParameters(MLDSAPrivateKeyParameters mLDSAPrivateKeyParameters, int i) {
        super(true, mLDSAPrivateKeyParameters.getParameters());
        this.rho = mLDSAPrivateKeyParameters.rho;
        this.k = mLDSAPrivateKeyParameters.k;
        this.f228526tr = mLDSAPrivateKeyParameters.f228526tr;
        this.f228523s1 = mLDSAPrivateKeyParameters.f228523s1;
        this.s2 = mLDSAPrivateKeyParameters.s2;
        this.f228524t0 = mLDSAPrivateKeyParameters.f228524t0;
        this.f228525t1 = mLDSAPrivateKeyParameters.f228525t1;
        this.seed = mLDSAPrivateKeyParameters.seed;
        this.prefFormat = i;
    }
}
