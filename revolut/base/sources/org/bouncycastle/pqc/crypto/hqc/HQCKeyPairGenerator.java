package org.bouncycastle.pqc.crypto.hqc;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes14.dex */
public class HQCKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private HQCParameters parameters;
    private SecureRandom random;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        byte[] bArr = new byte[this.parameters.getPublicKeyBytes()];
        byte[] bArr2 = new byte[this.parameters.getSecretKeyBytes()];
        this.parameters.getEngine().genKeyPair(bArr, bArr2, this.random);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new HQCPublicKeyParameters(this.parameters, bArr), (AsymmetricKeyParameter) new HQCPrivateKeyParameters(this.parameters, bArr2));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.random = keyGenerationParameters.getRandom();
        this.parameters = ((HQCKeyGenerationParameters) keyGenerationParameters).getParameters();
    }
}
