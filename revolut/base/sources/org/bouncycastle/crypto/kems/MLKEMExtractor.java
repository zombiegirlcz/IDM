package org.bouncycastle.crypto.kems;

import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.crypto.kems.mlkem.MLKEMEngine;
import org.bouncycastle.crypto.params.MLKEMPrivateKeyParameters;

/* JADX INFO: loaded from: classes14.dex */
public class MLKEMExtractor implements EncapsulatedSecretExtractor {
    private final MLKEMEngine engine;
    private final MLKEMPrivateKeyParameters privateKey;

    public MLKEMExtractor(MLKEMPrivateKeyParameters mLKEMPrivateKeyParameters) {
        if (mLKEMPrivateKeyParameters == null) {
            throw new NullPointerException("'privateKey' cannot be null");
        }
        this.privateKey = mLKEMPrivateKeyParameters;
        this.engine = MLKEMEngine.getInstance(mLKEMPrivateKeyParameters.getParameters());
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public byte[] extractSecret(byte[] bArr) {
        if (bArr.length == getEncapsulationLength()) {
            return this.engine.kemDecrypt(this.privateKey, bArr);
        }
        throw new IllegalArgumentException("encapsulation wrong length");
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public int getEncapsulationLength() {
        return this.engine.getCipherTextBytes();
    }
}
