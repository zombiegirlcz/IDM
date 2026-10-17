package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class HQCKEMExtractor implements EncapsulatedSecretExtractor {
    private final HQCEngine engine;
    private final HQCPrivateKeyParameters privateKey;

    public HQCKEMExtractor(HQCPrivateKeyParameters hQCPrivateKeyParameters) {
        if (hQCPrivateKeyParameters == null) {
            throw new NullPointerException("'privateKey' cannot be null");
        }
        this.privateKey = hQCPrivateKeyParameters;
        this.engine = hQCPrivateKeyParameters.getParameters().getEngine();
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public byte[] extractSecret(byte[] bArr) {
        byte[] bArr2 = new byte[64];
        this.engine.decaps(bArr2, bArr, this.privateKey.getPrivateKey());
        return Arrays.copyOfRange(bArr2, 0, 32);
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public int getEncapsulationLength() {
        return this.engine.getCipherTextBytes();
    }
}
