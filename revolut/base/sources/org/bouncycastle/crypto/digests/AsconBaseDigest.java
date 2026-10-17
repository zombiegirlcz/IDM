package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.digests.BufferBaseDigest;
import org.bouncycastle.crypto.digests.ISAPDigest;
import org.bouncycastle.crypto.engines.AsconPermutationFriend;

/* JADX INFO: loaded from: classes14.dex */
abstract class AsconBaseDigest extends BufferBaseDigest {
    protected int ASCON_PB_ROUNDS;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    AsconPermutationFriend.AsconPermutation f228299p;

    public static class Friend {
        private static final Friend INSTANCE = new Friend();

        private Friend() {
        }
    }

    public AsconBaseDigest() {
        super(BufferBaseDigest.ProcessingBufferType.Immediate, 8);
        this.ASCON_PB_ROUNDS = 12;
        this.f228299p = AsconPermutationFriend.getAsconPermutation(ISAPDigest.Friend.getFriend(Friend.INSTANCE));
        this.DigestSize = 32;
    }

    public void ensureSufficientOutputBuffer(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            throw new OutputLengthException("output buffer is too short");
        }
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    public void finish(byte[] bArr, int i) {
        padAndAbsorb();
        squeeze(bArr, i, this.DigestSize);
    }

    public int hash(byte[] bArr, int i, int i2) {
        ensureSufficientOutputBuffer(bArr, i, i2);
        padAndAbsorb();
        squeeze(bArr, i, i2);
        return i2;
    }

    public abstract long loadBytes(byte[] bArr, int i);

    public abstract long loadBytes(byte[] bArr, int i, int i2);

    public abstract long pad(int i);

    public void padAndAbsorb() {
        this.f228299p.f228341x0 ^= loadBytes(this.m_buf, 0, this.m_bufPos) ^ pad(this.m_bufPos);
        this.f228299p.p(12);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    public void processBytes(byte[] bArr, int i) {
        AsconPermutationFriend.AsconPermutation asconPermutation = this.f228299p;
        asconPermutation.f228341x0 = loadBytes(bArr, i) ^ asconPermutation.f228341x0;
        this.f228299p.p(this.ASCON_PB_ROUNDS);
    }

    public abstract void setBytes(long j2, byte[] bArr, int i);

    public abstract void setBytes(long j2, byte[] bArr, int i, int i2);

    public void squeeze(byte[] bArr, int i, int i2) {
        int i3 = i;
        int i5 = i2;
        while (i5 > this.BlockSize) {
            setBytes(this.f228299p.f228341x0, bArr, i3);
            this.f228299p.p(this.ASCON_PB_ROUNDS);
            int i6 = this.BlockSize;
            i3 += i6;
            i5 -= i6;
        }
        setBytes(this.f228299p.f228341x0, bArr, i3, i5);
    }
}
