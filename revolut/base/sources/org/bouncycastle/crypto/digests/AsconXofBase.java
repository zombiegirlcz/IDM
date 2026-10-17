package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.Xof;

/* JADX INFO: loaded from: classes14.dex */
abstract class AsconXofBase extends AsconBaseDigest implements Xof {
    private final byte[] buffer = new byte[this.BlockSize];
    private int bytesInBuffer;
    private boolean m_squeezing;

    private void ensureNoAbsorbWhileSqueezing(boolean z) {
        if (z) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
    }

    public int doFinal(byte[] bArr, int i, int i2) {
        int iDoOutput = doOutput(bArr, i, i2);
        reset();
        return iDoOutput;
    }

    public int doOutput(byte[] bArr, int i, int i2) {
        int iHash;
        ensureSufficientOutputBuffer(bArr, i, i2);
        int i3 = this.bytesInBuffer;
        if (i3 != 0) {
            int i5 = this.BlockSize - i3;
            iHash = Math.min(i2, i3);
            System.arraycopy(this.buffer, i5, bArr, i, iHash);
            this.bytesInBuffer -= iHash;
        } else {
            iHash = 0;
        }
        int i6 = i2 - iHash;
        int i21 = this.BlockSize;
        if (i6 >= i21) {
            iHash += hash(bArr, i + iHash, i6 - (i6 % i21));
        }
        if (iHash >= i2) {
            return iHash;
        }
        hash(this.buffer, 0, this.BlockSize);
        int i22 = i2 - iHash;
        System.arraycopy(this.buffer, 0, bArr, i + iHash, i22);
        this.bytesInBuffer = this.buffer.length - i22;
        return iHash + i22;
    }

    @Override // org.bouncycastle.crypto.digests.AsconBaseDigest
    public void padAndAbsorb() {
        if (this.m_squeezing) {
            this.f228299p.p(this.ASCON_PB_ROUNDS);
        } else {
            this.m_squeezing = true;
            super.padAndAbsorb();
        }
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        this.m_squeezing = false;
        this.bytesInBuffer = 0;
        super.reset();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void update(byte b4) {
        ensureNoAbsorbWhileSqueezing(this.m_squeezing);
        super.update(b4);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        ensureNoAbsorbWhileSqueezing(this.m_squeezing);
        super.update(bArr, i, i2);
    }
}
