package org.bouncycastle.crypto.signers;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.MLDSAParameters;
import org.bouncycastle.crypto.params.MLDSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.MLDSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithContext;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.signers.mldsa.MLDSAEngine;

/* JADX INFO: loaded from: classes14.dex */
public class MLDSASigner implements Signer {
    private static final byte[] EMPTY_CONTEXT = new byte[0];
    private MLDSAEngine engine;
    private byte[] k;
    private SHAKEDigest msgDigest;
    private MLDSAPrivateKeyParameters privKey;
    private MLDSAPublicKeyParameters pubKey;
    private SecureRandom random;
    private byte[] rho;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private byte[] f228566s1;
    private byte[] s2;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private byte[] f228567t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private byte[] f228568t1;

    public byte[] generateMu() throws DataLengthException, CryptoException {
        byte[] bArrGenerateMu = this.engine.generateMu(this.msgDigest);
        reset();
        return bArrGenerateMu;
    }

    public byte[] generateMuSignature(byte[] bArr) throws DataLengthException, CryptoException {
        if (bArr.length != 64) {
            throw new DataLengthException("mu value must be 64 bytes");
        }
        byte[] bArr2 = new byte[32];
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr2);
        }
        this.msgDigest.reset();
        byte[] bArrGenerateSignature = this.engine.generateSignature(bArr, this.msgDigest, this.rho, this.k, this.f228567t0, this.f228566s1, this.s2, bArr2);
        reset();
        return bArrGenerateSignature;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws DataLengthException, CryptoException {
        byte[] bArr = new byte[32];
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr);
        }
        byte[] bArrGenerateSignature = this.engine.generateSignature(this.engine.generateMu(this.msgDigest), this.msgDigest, this.rho, this.k, this.f228567t0, this.f228566s1, this.s2, bArr);
        reset();
        return bArrGenerateSignature;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, CipherParameters cipherParameters) {
        MLDSAParameters parameters;
        byte[] context = EMPTY_CONTEXT;
        this.s2 = null;
        this.f228566s1 = null;
        this.f228568t1 = null;
        this.f228567t0 = null;
        this.k = null;
        this.rho = null;
        if (cipherParameters instanceof ParametersWithContext) {
            ParametersWithContext parametersWithContext = (ParametersWithContext) cipherParameters;
            context = parametersWithContext.getContext();
            cipherParameters = parametersWithContext.getParameters();
            if (context.length > 255) {
                throw new IllegalArgumentException("context too long");
            }
        }
        if (z) {
            this.pubKey = null;
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.privKey = (MLDSAPrivateKeyParameters) parametersWithRandom.getParameters();
                this.random = parametersWithRandom.getRandom();
            } else {
                this.privKey = (MLDSAPrivateKeyParameters) cipherParameters;
                this.random = null;
            }
            parameters = this.privKey.getParameters();
            this.engine = MLDSAEngine.getInstance(parameters, this.random);
            this.rho = this.privKey.getRho();
            this.f228567t0 = this.privKey.getT0();
            this.k = this.privKey.getK();
            this.f228566s1 = this.privKey.getS1();
            this.s2 = this.privKey.getS2();
            this.engine.initSign(this.privKey.getTr(), false, context);
        } else {
            MLDSAPublicKeyParameters mLDSAPublicKeyParameters = (MLDSAPublicKeyParameters) cipherParameters;
            this.pubKey = mLDSAPublicKeyParameters;
            this.privKey = null;
            this.random = null;
            parameters = mLDSAPublicKeyParameters.getParameters();
            this.engine = MLDSAEngine.getInstance(parameters, null);
            this.f228568t1 = this.pubKey.getT1();
            byte[] rho = this.pubKey.getRho();
            this.rho = rho;
            this.engine.initVerify(rho, this.f228568t1, false, context);
        }
        if (parameters.isPreHash()) {
            throw new IllegalArgumentException("\"pure\" ml-dsa must use non pre-hash parameters");
        }
        reset();
    }

    public byte[] internalGenerateSignature(byte[] bArr, byte[] bArr2) {
        MLDSAEngine mLDSAEngine = MLDSAEngine.getInstance(this.privKey.getParameters(), this.random);
        mLDSAEngine.initSign(this.privKey.getTr(), false, null);
        return mLDSAEngine.signInternal(bArr, bArr.length, this.rho, this.k, this.f228567t0, this.f228566s1, this.s2, bArr2);
    }

    public boolean internalVerifySignature(byte[] bArr, byte[] bArr2) {
        MLDSAEngine mLDSAEngine = MLDSAEngine.getInstance(this.pubKey.getParameters(), this.random);
        mLDSAEngine.initVerify(this.rho, this.f228568t1, false, null);
        SHAKEDigest shake256Digest = mLDSAEngine.getShake256Digest();
        shake256Digest.update(bArr, 0, bArr.length);
        return mLDSAEngine.verifyInternal(bArr2, bArr2.length, shake256Digest, this.rho, this.f228568t1);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.msgDigest = this.engine.getShake256Digest();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b4) {
        this.msgDigest.update(b4);
    }

    public boolean verifyMu(byte[] bArr) {
        if (bArr.length != 64) {
            throw new DataLengthException("mu value must be 64 bytes");
        }
        boolean zVerifyInternalMu = this.engine.verifyInternalMu(bArr);
        reset();
        return zVerifyInternalMu;
    }

    public boolean verifyMuSignature(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 64) {
            throw new DataLengthException("mu value must be 64 bytes");
        }
        this.msgDigest.reset();
        boolean zVerifyInternalMuSignature = this.engine.verifyInternalMuSignature(bArr, bArr2, bArr2.length, this.msgDigest, this.rho, this.f228568t1);
        reset();
        return zVerifyInternalMuSignature;
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        boolean zVerifyInternal = this.engine.verifyInternal(bArr, bArr.length, this.msgDigest, this.rho, this.f228568t1);
        reset();
        return zVerifyInternal;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        this.msgDigest.update(bArr, i, i2);
    }
}
