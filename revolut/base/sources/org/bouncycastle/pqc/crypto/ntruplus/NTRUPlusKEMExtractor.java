package org.bouncycastle.pqc.crypto.ntruplus;

import org.bouncycastle.crypto.EncapsulatedSecretExtractor;

/* JADX INFO: loaded from: classes14.dex */
public class NTRUPlusKEMExtractor implements EncapsulatedSecretExtractor {
    private final NTRUPlusEngine engine;
    private final NTRUPlusPrivateKeyParameters privateKey;

    public NTRUPlusKEMExtractor(NTRUPlusPrivateKeyParameters nTRUPlusPrivateKeyParameters) {
        if (nTRUPlusPrivateKeyParameters == null) {
            throw new NullPointerException("'privateKey' cannot be null");
        }
        this.privateKey = nTRUPlusPrivateKeyParameters;
        this.engine = new NTRUPlusEngine(nTRUPlusPrivateKeyParameters.getParameters());
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public byte[] extractSecret(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        this.engine.crypto_kem_dec(bArr2, 0, bArr, 0, this.privateKey.getEncoded(), 0);
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public int getEncapsulationLength() {
        return this.privateKey.getParameters().getCiphertextBytes();
    }
}
