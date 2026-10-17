package org.bouncycastle.crypto.signers;

import java.io.IOException;
import java.security.SecureRandom;
import okl.m;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.MLDSAParameters;
import org.bouncycastle.crypto.params.MLDSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.MLDSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithContext;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.signers.mldsa.MLDSAEngine;
import org.bouncycastle.pqc.crypto.DigestUtils;

/* JADX INFO: loaded from: classes14.dex */
public class HashMLDSASigner implements Signer {
    private static final byte[] EMPTY_CONTEXT = new byte[0];
    private Digest digest;
    private byte[] digestOIDEncoding;
    private MLDSAEngine engine;
    private byte[] k;
    private MLDSAPrivateKeyParameters privKey;
    private MLDSAPublicKeyParameters pubKey;
    private SecureRandom random;
    private byte[] rho;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private byte[] f228563s1;
    private byte[] s2;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private byte[] f228564t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private byte[] f228565t1;

    private static Digest createDigest(MLDSAParameters mLDSAParameters) {
        int type = mLDSAParameters.getType();
        if (type == 0 || type == 1) {
            return new SHA512Digest();
        }
        throw new IllegalArgumentException("unknown parameters type");
    }

    private SHAKEDigest finishPreHash() {
        int digestSize = this.digest.getDigestSize();
        byte[] bArr = new byte[digestSize];
        this.digest.doFinal(bArr, 0);
        SHAKEDigest shake256Digest = this.engine.getShake256Digest();
        byte[] bArr2 = this.digestOIDEncoding;
        shake256Digest.update(bArr2, 0, bArr2.length);
        shake256Digest.update(bArr, 0, digestSize);
        return shake256Digest;
    }

    private void initDigest(MLDSAParameters mLDSAParameters) {
        Digest digestCreateDigest = createDigest(mLDSAParameters);
        this.digest = digestCreateDigest;
        try {
            this.digestOIDEncoding = DigestUtils.getDigestOid(digestCreateDigest.getAlgorithmName()).getEncoded("DER");
        } catch (IOException e) {
            throw new IllegalStateException(m.f(e, new StringBuilder("oid encoding failed: ")));
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws DataLengthException, CryptoException {
        SHAKEDigest sHAKEDigestFinishPreHash = finishPreHash();
        byte[] bArr = new byte[32];
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr);
        }
        return this.engine.generateSignature(this.engine.generateMu(sHAKEDigestFinishPreHash), sHAKEDigestFinishPreHash, this.rho, this.k, this.f228564t0, this.f228563s1, this.s2, bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, CipherParameters cipherParameters) {
        MLDSAParameters parameters;
        byte[] context = EMPTY_CONTEXT;
        this.s2 = null;
        this.f228563s1 = null;
        this.f228565t1 = null;
        this.f228564t0 = null;
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
            this.f228564t0 = this.privKey.getT0();
            this.k = this.privKey.getK();
            this.f228563s1 = this.privKey.getS1();
            this.s2 = this.privKey.getS2();
            this.engine.initSign(this.privKey.getTr(), true, context);
        } else {
            MLDSAPublicKeyParameters mLDSAPublicKeyParameters = (MLDSAPublicKeyParameters) cipherParameters;
            this.pubKey = mLDSAPublicKeyParameters;
            this.privKey = null;
            this.random = null;
            parameters = mLDSAPublicKeyParameters.getParameters();
            this.engine = MLDSAEngine.getInstance(parameters, null);
            this.rho = this.pubKey.getRho();
            byte[] t16 = this.pubKey.getT1();
            this.f228565t1 = t16;
            this.engine.initVerify(this.rho, t16, true, context);
        }
        initDigest(parameters);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b4) {
        this.digest.update(b4);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        return this.engine.verifyInternal(bArr, bArr.length, finishPreHash(), this.rho, this.f228565t1);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        this.digest.update(bArr, i, i2);
    }
}
