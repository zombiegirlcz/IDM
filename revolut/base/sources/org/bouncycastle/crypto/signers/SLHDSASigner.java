package org.bouncycastle.crypto.signers;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ParametersWithContext;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.SLHDSAParameters;
import org.bouncycastle.crypto.params.SLHDSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.SLHDSAPublicKeyParameters;
import org.bouncycastle.crypto.signers.slhdsa.SLHDSAEngine;
import org.bouncycastle.pqc.crypto.MessageSigner;

/* JADX INFO: loaded from: classes14.dex */
public class SLHDSASigner implements MessageSigner {
    private static final byte[] DEFAULT_PREFIX = {0, 0};
    private byte[] msgPrefix;
    private byte[] optRand;
    private byte[] pkRoot;
    private byte[] pkSeed;
    private SLHDSAPrivateKeyParameters privKey;
    private SLHDSAPublicKeyParameters pubKey;
    private SecureRandom random;
    private byte[] skPrf;
    private byte[] skSeed;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            secureRandom.nextBytes(this.optRand);
        } else {
            byte[] publicSeed = this.privKey.getPublicSeed();
            byte[] bArr2 = this.optRand;
            System.arraycopy(publicSeed, 0, bArr2, 0, bArr2.length);
        }
        return SLHDSAEngine.internalGenerateSignature(this.privKey.getParameters(), this.skSeed, this.skPrf, this.pkSeed, this.pkRoot, this.msgPrefix, bArr, this.optRand);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z, CipherParameters cipherParameters) {
        SLHDSAParameters parameters;
        if (cipherParameters instanceof ParametersWithContext) {
            ParametersWithContext parametersWithContext = (ParametersWithContext) cipherParameters;
            CipherParameters parameters2 = parametersWithContext.getParameters();
            int contextLength = parametersWithContext.getContextLength();
            if (contextLength > 255) {
                throw new IllegalArgumentException("context too long");
            }
            byte[] bArr = new byte[contextLength + 2];
            this.msgPrefix = bArr;
            bArr[0] = 0;
            bArr[1] = (byte) contextLength;
            parametersWithContext.copyContextTo(bArr, 2, contextLength);
            cipherParameters = parameters2;
        } else {
            this.msgPrefix = DEFAULT_PREFIX;
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
            this.skSeed = this.privKey.getSeed();
            this.skPrf = this.privKey.getPrf();
            this.pkSeed = this.privKey.getPublicSeed();
            this.pkRoot = this.privKey.getRoot();
            parameters = this.privKey.getParameters();
            this.optRand = new byte[parameters.getN()];
        } else {
            SLHDSAPublicKeyParameters sLHDSAPublicKeyParameters = (SLHDSAPublicKeyParameters) cipherParameters;
            this.pubKey = sLHDSAPublicKeyParameters;
            this.privKey = null;
            this.random = null;
            this.skSeed = null;
            this.skPrf = null;
            this.pkSeed = sLHDSAPublicKeyParameters.getSeed();
            this.pkRoot = this.pubKey.getRoot();
            parameters = this.pubKey.getParameters();
        }
        if (parameters.isPreHash()) {
            throw new IllegalArgumentException("\"pure\" slh-dsa must use non pre-hash parameters");
        }
    }

    public byte[] internalGenerateSignature(byte[] bArr, byte[] bArr2) {
        return SLHDSAEngine.internalGenerateSignature(this.privKey.getParameters(), this.skSeed, this.skPrf, this.pkSeed, this.pkRoot, null, bArr, bArr2);
    }

    public boolean internalVerifySignature(byte[] bArr, byte[] bArr2) {
        return SLHDSAEngine.internalVerifySignature(this.pubKey.getParameters(), this.pkSeed, this.pkRoot, null, bArr, bArr2);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        return SLHDSAEngine.internalVerifySignature(this.pubKey.getParameters(), this.pkSeed, this.pkRoot, this.msgPrefix, bArr, bArr2);
    }
}
