package org.bouncycastle.crypto.generators;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.kems.mlkem.MLKEMEngine;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.MLKEMKeyGenerationParameters;
import org.bouncycastle.crypto.params.MLKEMParameters;
import org.bouncycastle.crypto.params.MLKEMPrivateKeyParameters;
import org.bouncycastle.crypto.params.MLKEMPublicKeyParameters;

/* JADX INFO: loaded from: classes14.dex */
public class MLKEMKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private MLKEMParameters mlkemParams;
    private SecureRandom random;

    private AsymmetricCipherKeyPair genKeyPair() {
        byte[][] bArrGenerateKemKeyPair = MLKEMEngine.getInstance(this.mlkemParams).generateKemKeyPair(this.random);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new MLKEMPublicKeyParameters(this.mlkemParams, bArrGenerateKemKeyPair[0], bArrGenerateKemKeyPair[1]), (AsymmetricKeyParameter) new MLKEMPrivateKeyParameters(this.mlkemParams, bArrGenerateKemKeyPair[2], bArrGenerateKemKeyPair[3], bArrGenerateKemKeyPair[4], bArrGenerateKemKeyPair[0], bArrGenerateKemKeyPair[1], bArrGenerateKemKeyPair[5]));
    }

    private void initialize(KeyGenerationParameters keyGenerationParameters) {
        this.mlkemParams = ((MLKEMKeyGenerationParameters) keyGenerationParameters).getParameters();
        this.random = keyGenerationParameters.getRandom();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }
}
