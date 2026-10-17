package org.bouncycastle.pqc.crypto.mldsa;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.ParametersWithContext;
import org.bouncycastle.crypto.params.ParametersWithRandom;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class MLDSASigner implements Signer {
    private static final byte[] EMPTY_CONTEXT = new byte[0];
    private MLDSAEngine engine;
    private SHAKEDigest msgDigest;
    private MLDSAPrivateKeyParameters privKey;
    private MLDSAPublicKeyParameters pubKey;
    private SecureRandom random;

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
        MLDSAEngine mLDSAEngine = this.engine;
        SHAKEDigest sHAKEDigest = this.msgDigest;
        MLDSAPrivateKeyParameters mLDSAPrivateKeyParameters = this.privKey;
        byte[] bArrGenerateSignature = mLDSAEngine.generateSignature(bArr, sHAKEDigest, mLDSAPrivateKeyParameters.rho, mLDSAPrivateKeyParameters.k, mLDSAPrivateKeyParameters.f228836t0, mLDSAPrivateKeyParameters.f228835s1, mLDSAPrivateKeyParameters.s2, bArr2);
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
        byte[] bArrGenerateMu = this.engine.generateMu(this.msgDigest);
        MLDSAEngine mLDSAEngine = this.engine;
        SHAKEDigest sHAKEDigest = this.msgDigest;
        MLDSAPrivateKeyParameters mLDSAPrivateKeyParameters = this.privKey;
        byte[] bArrGenerateSignature = mLDSAEngine.generateSignature(bArrGenerateMu, sHAKEDigest, mLDSAPrivateKeyParameters.rho, mLDSAPrivateKeyParameters.k, mLDSAPrivateKeyParameters.f228836t0, mLDSAPrivateKeyParameters.f228835s1, mLDSAPrivateKeyParameters.s2, bArr);
        reset();
        return bArrGenerateSignature;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, CipherParameters cipherParameters) {
        MLDSAParameters parameters;
        byte[] context = EMPTY_CONTEXT;
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
            MLDSAEngine engine = parameters.getEngine(this.random);
            this.engine = engine;
            engine.initSign(this.privKey.f228838tr, false, context);
        } else {
            MLDSAPublicKeyParameters mLDSAPublicKeyParameters = (MLDSAPublicKeyParameters) cipherParameters;
            this.pubKey = mLDSAPublicKeyParameters;
            this.privKey = null;
            this.random = null;
            parameters = mLDSAPublicKeyParameters.getParameters();
            MLDSAEngine engine2 = parameters.getEngine(null);
            this.engine = engine2;
            MLDSAPublicKeyParameters mLDSAPublicKeyParameters2 = this.pubKey;
            engine2.initVerify(mLDSAPublicKeyParameters2.rho, mLDSAPublicKeyParameters2.f228839t1, false, context);
        }
        if (parameters.isPreHash()) {
            throw new IllegalArgumentException("\"pure\" ml-dsa must use non pre-hash parameters");
        }
        reset();
    }

    public byte[] internalGenerateSignature(byte[] bArr, byte[] bArr2) {
        MLDSAEngine engine = this.privKey.getParameters().getEngine(this.random);
        engine.initSign(this.privKey.f228838tr, false, null);
        int length = bArr.length;
        MLDSAPrivateKeyParameters mLDSAPrivateKeyParameters = this.privKey;
        return engine.signInternal(bArr, length, mLDSAPrivateKeyParameters.rho, mLDSAPrivateKeyParameters.k, mLDSAPrivateKeyParameters.f228836t0, mLDSAPrivateKeyParameters.f228835s1, mLDSAPrivateKeyParameters.s2, bArr2);
    }

    public boolean internalVerifySignature(byte[] bArr, byte[] bArr2) {
        MLDSAEngine engine = this.pubKey.getParameters().getEngine(this.random);
        MLDSAPublicKeyParameters mLDSAPublicKeyParameters = this.pubKey;
        engine.initVerify(mLDSAPublicKeyParameters.rho, mLDSAPublicKeyParameters.f228839t1, false, null);
        SHAKEDigest shake256Digest = engine.getShake256Digest();
        shake256Digest.update(bArr, 0, bArr.length);
        int length = bArr2.length;
        MLDSAPublicKeyParameters mLDSAPublicKeyParameters2 = this.pubKey;
        return engine.verifyInternal(bArr2, length, shake256Digest, mLDSAPublicKeyParameters2.rho, mLDSAPublicKeyParameters2.f228839t1);
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
        MLDSAEngine mLDSAEngine = this.engine;
        int length = bArr2.length;
        SHAKEDigest sHAKEDigest = this.msgDigest;
        MLDSAPublicKeyParameters mLDSAPublicKeyParameters = this.pubKey;
        boolean zVerifyInternalMuSignature = mLDSAEngine.verifyInternalMuSignature(bArr, bArr2, length, sHAKEDigest, mLDSAPublicKeyParameters.rho, mLDSAPublicKeyParameters.f228839t1);
        reset();
        return zVerifyInternalMuSignature;
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        MLDSAEngine mLDSAEngine = this.engine;
        int length = bArr.length;
        SHAKEDigest sHAKEDigest = this.msgDigest;
        MLDSAPublicKeyParameters mLDSAPublicKeyParameters = this.pubKey;
        boolean zVerifyInternal = mLDSAEngine.verifyInternal(bArr, length, sHAKEDigest, mLDSAPublicKeyParameters.rho, mLDSAPublicKeyParameters.f228839t1);
        reset();
        return zVerifyInternal;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        this.msgDigest.update(bArr, i, i2);
    }
}
