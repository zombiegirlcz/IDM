package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.io.LimitedBuffer;

/* JADX INFO: loaded from: classes14.dex */
public class Prehash implements Digest {
    private final String algorithmName;

    /* JADX INFO: renamed from: buf, reason: collision with root package name */
    private final LimitedBuffer f228317buf;

    private Prehash(Digest digest) {
        this.algorithmName = digest.getAlgorithmName();
        this.f228317buf = new LimitedBuffer(digest.getDigestSize());
    }

    public static Prehash forDigest(Digest digest) {
        return new Prehash(digest);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        try {
            if (getDigestSize() == this.f228317buf.size()) {
                return this.f228317buf.copyTo(bArr, i);
            }
            throw new IllegalStateException("Incorrect prehash size");
        } finally {
            reset();
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.f228317buf.limit();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.f228317buf.reset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b4) {
        this.f228317buf.write(b4);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        this.f228317buf.write(bArr, i, i2);
    }
}
