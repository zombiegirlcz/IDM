package org.bouncycastle.pqc.crypto.ntruplus;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes14.dex */
public class NTRUPlusKeyGenerationParameters extends KeyGenerationParameters {
    private final NTRUPlusParameters params;

    public NTRUPlusKeyGenerationParameters(SecureRandom secureRandom, NTRUPlusParameters nTRUPlusParameters) {
        super(secureRandom, 256);
        this.params = nTRUPlusParameters;
    }

    public NTRUPlusParameters getParameters() {
        return this.params;
    }
}
