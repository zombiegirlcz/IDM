package org.bouncycastle.crypto.prng;

/* JADX INFO: loaded from: classes14.dex */
public interface RandomGenerator {
    void addSeedMaterial(long j2);

    void addSeedMaterial(byte[] bArr);

    void nextBytes(byte[] bArr);

    void nextBytes(byte[] bArr, int i, int i2);
}
