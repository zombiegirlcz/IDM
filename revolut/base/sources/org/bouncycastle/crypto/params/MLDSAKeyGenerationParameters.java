package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes14.dex */
public class MLDSAKeyGenerationParameters extends KeyGenerationParameters {
    private final MLDSAParameters params;

    public MLDSAKeyGenerationParameters(SecureRandom secureRandom, MLDSAParameters mLDSAParameters) {
        super(secureRandom, 256);
        this.params = mLDSAParameters;
    }

    public MLDSAParameters getParameters() {
        return this.params;
    }
}
