package org.bouncycastle.pqc.crypto.slhdsa;

import java.io.IOException;
import java.security.SecureRandom;
import okl.m;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.ParametersWithContext;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.DigestUtils;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class HashSLHDSASigner implements Signer {
    private Digest digest;
    private byte[] msgPrefix;
    private byte[] optRand;
    private SLHDSAPrivateKeyParameters privKey;
    private SLHDSAPublicKeyParameters pubKey;
    private SecureRandom random;

    private static Digest createDigest(SLHDSAParameters sLHDSAParameters) {
        int type = sLHDSAParameters.getType();
        if (type == 0) {
            return sLHDSAParameters.getName().startsWith("sha2") ? (SLHDSAParameters.sha2_128f == sLHDSAParameters || SLHDSAParameters.sha2_128s == sLHDSAParameters) ? SHA256Digest.newInstance() : new SHA512Digest() : (SLHDSAParameters.shake_128f == sLHDSAParameters || SLHDSAParameters.shake_128s == sLHDSAParameters) ? new SHAKEDigest(128) : new SHAKEDigest(256);
        }
        if (type == 1) {
            return SHA256Digest.newInstance();
        }
        if (type == 2) {
            return new SHA512Digest();
        }
        if (type == 3) {
            return new SHAKEDigest(128);
        }
        if (type == 4) {
            return new SHAKEDigest(256);
        }
        throw new IllegalArgumentException("unknown parameters type");
    }

    private void initDigest(SLHDSAParameters sLHDSAParameters, ParametersWithContext parametersWithContext) {
        Digest digestCreateDigest = createDigest(sLHDSAParameters);
        this.digest = digestCreateDigest;
        try {
            byte[] encoded = DigestUtils.getDigestOid(digestCreateDigest.getAlgorithmName()).getEncoded("DER");
            int contextLength = parametersWithContext == null ? 0 : parametersWithContext.getContextLength();
            int i = contextLength + 2;
            byte[] bArr = new byte[encoded.length + i];
            this.msgPrefix = bArr;
            bArr[0] = 1;
            bArr[1] = (byte) contextLength;
            if (parametersWithContext != null) {
                parametersWithContext.copyContextTo(bArr, 2, contextLength);
            }
            System.arraycopy(encoded, 0, this.msgPrefix, i, encoded.length);
        } catch (IOException e) {
            throw new IllegalStateException(m.f(e, new StringBuilder("oid encoding failed: ")));
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws DataLengthException, CryptoException {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            secureRandom.nextBytes(this.optRand);
        } else {
            byte[] bArr2 = this.privKey.pk.seed;
            byte[] bArr3 = this.optRand;
            System.arraycopy(bArr2, 0, bArr3, 0, bArr3.length);
        }
        return SLHDSAEngine.internalGenerateSignature(this.privKey, this.msgPrefix, bArr, this.optRand);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, CipherParameters cipherParameters) {
        ParametersWithContext parametersWithContext;
        SLHDSAParameters parameters;
        if (cipherParameters instanceof ParametersWithContext) {
            ParametersWithContext parametersWithContext2 = (ParametersWithContext) cipherParameters;
            CipherParameters parameters2 = parametersWithContext2.getParameters();
            if (parametersWithContext2.getContextLength() > 255) {
                throw new IllegalArgumentException("context too long");
            }
            parametersWithContext = parametersWithContext2;
            cipherParameters = parameters2;
        } else {
            parametersWithContext = null;
        }
        if (z) {
            this.pubKey = null;
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.privKey = (SLHDSAPrivateKeyParameters) parametersWithRandom.getParameters();
                this.random = parametersWithRandom.getRandom();
            } else {
                this.privKey = (SLHDSAPrivateKeyParameters) cipherParameters;
                this.random = null;
            }
            parameters = this.privKey.getParameters();
            this.optRand = new byte[parameters.getN()];
        } else {
            SLHDSAPublicKeyParameters sLHDSAPublicKeyParameters = (SLHDSAPublicKeyParameters) cipherParameters;
            this.pubKey = sLHDSAPublicKeyParameters;
            this.privKey = null;
            this.random = null;
            parameters = sLHDSAPublicKeyParameters.getParameters();
        }
        initDigest(parameters, parametersWithContext);
    }

    public byte[] internalGenerateSignature(byte[] bArr, byte[] bArr2) {
        return SLHDSAEngine.internalGenerateSignature(this.privKey, null, bArr, bArr2);
    }

    public boolean internalVerifySignature(byte[] bArr, byte[] bArr2) {
        return SLHDSAEngine.internalVerifySignature(this.pubKey, null, bArr, bArr2);
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
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        return SLHDSAEngine.internalVerifySignature(this.pubKey, this.msgPrefix, bArr2, bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        this.digest.update(bArr, i, i2);
    }
}
