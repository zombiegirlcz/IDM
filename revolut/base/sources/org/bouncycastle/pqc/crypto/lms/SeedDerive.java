package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes14.dex */
class SeedDerive {
    private final byte[] I;
    private final Digest digest;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f228829j;
    private final byte[] masterSeed;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f228830q;

    public SeedDerive(byte[] bArr, byte[] bArr2, Digest digest) {
        this.I = bArr;
        this.masterSeed = bArr2;
        this.digest = digest;
    }

    public void deriveSeed(byte[] bArr, boolean z) {
        deriveSeed(bArr, z, 0);
    }

    public byte[] getI() {
        return this.I;
    }

    public int getJ() {
        return this.f228829j;
    }

    public byte[] getMasterSeed() {
        return this.masterSeed;
    }

    public int getQ() {
        return this.f228830q;
    }

    public void setJ(int i) {
        this.f228829j = i;
    }

    public void setQ(int i) {
        this.f228830q = i;
    }

    public void deriveSeed(byte[] bArr, boolean z, int i) {
        deriveSeed(bArr, i);
        if (z) {
            this.f228829j++;
        }
    }

    public byte[] deriveSeed(byte[] bArr, int i) {
        if (bArr.length - i < this.digest.getDigestSize()) {
            throw new IllegalArgumentException("target length is less than digest size.");
        }
        Digest digest = this.digest;
        byte[] bArr2 = this.I;
        digest.update(bArr2, 0, bArr2.length);
        this.digest.update((byte) (this.f228830q >>> 24));
        this.digest.update((byte) (this.f228830q >>> 16));
        this.digest.update((byte) (this.f228830q >>> 8));
        this.digest.update((byte) this.f228830q);
        this.digest.update((byte) (this.f228829j >>> 8));
        this.digest.update((byte) this.f228829j);
        this.digest.update((byte) -1);
        Digest digest2 = this.digest;
        byte[] bArr3 = this.masterSeed;
        digest2.update(bArr3, 0, bArr3.length);
        this.digest.doFinal(bArr, i);
        return bArr;
    }
}
