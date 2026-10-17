package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes14.dex */
public interface Signer {
    byte[] generateSignature() throws DataLengthException, CryptoException;

    void init(boolean z, CipherParameters cipherParameters);

    void reset();

    void update(byte b4);

    void update(byte[] bArr, int i, int i2);

    boolean verifySignature(byte[] bArr);
}
