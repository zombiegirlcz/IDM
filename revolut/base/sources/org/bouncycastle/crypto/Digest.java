package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes14.dex */
public interface Digest {
    int doFinal(byte[] bArr, int i);

    String getAlgorithmName();

    int getDigestSize();

    void reset();

    void update(byte b4);

    void update(byte[] bArr, int i, int i2);
}
