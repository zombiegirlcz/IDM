package org.bouncycastle.pqc.crypto.ntruplus;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes14.dex */
public class NTRUPlusKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private NTRUPlusParameters params;
    private SecureRandom random;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        byte[] bArr = new byte[this.params.getPublicKeyBytes()];
        byte[] bArr2 = new byte[this.params.getSecretKeyBytes()];
        NTRUPlusEngine nTRUPlusEngine = new NTRUPlusEngine(this.params);
        byte[] bArr3 = new byte[32];
        int n3 = this.params.getN();
        short[] sArr = new short[n3];
        short[] sArr2 = new short[n3];
        short[] sArr3 = new short[n3];
        short[] sArr4 = new short[n3];
        do {
            this.random.nextBytes(bArr3);
        } while (nTRUPlusEngine.genf_derand(sArr, sArr2, bArr3) != 0);
        do {
            this.random.nextBytes(bArr3);
        } while (nTRUPlusEngine.geng_derand(sArr3, sArr4, bArr3) != 0);
        nTRUPlusEngine.crypto_kem_keypair_derand(bArr, bArr2, sArr, sArr2, sArr3, sArr4);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new NTRUPlusPublicKeyParameters(this.params, bArr), (AsymmetricKeyParameter) new NTRUPlusPrivateKeyParameters(this.params, bArr2));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.params = ((NTRUPlusKeyGenerationParameters) keyGenerationParameters).getParameters();
        this.random = keyGenerationParameters.getRandom();
    }
}
