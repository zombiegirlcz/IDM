package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.engines.AEADBaseEngine;
import org.bouncycastle.crypto.engines.AsconPermutationFriend;

/* JADX INFO: loaded from: classes14.dex */
abstract class AsconBaseEngine extends AEADBaseEngine {
    protected long ASCON_IV;
    protected long K0;
    protected long K1;
    protected long N0;
    protected long N1;
    protected long dsep;

    /* JADX INFO: renamed from: nr, reason: collision with root package name */
    protected int f228339nr;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    AsconPermutationFriend.AsconPermutation f228340p = new AsconPermutationFriend.AsconPermutation();

    public abstract void ascon_aeadinit();

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void finishAAD(AEADBaseEngine.State state, boolean z) {
        int i = this.m_state.ord;
        if (i == 2 || i == 6) {
            processFinalAAD();
            this.f228340p.p(this.f228339nr);
        }
        this.f228340p.f228344x4 ^= this.dsep;
        this.m_aadPos = 0;
        this.m_state = state;
    }

    public abstract String getAlgorithmVersion();

    public abstract long loadBytes(byte[] bArr, int i);

    public abstract long pad(int i);

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferAAD(byte[] bArr, int i) {
        this.f228340p.f228341x0 ^= loadBytes(bArr, i);
        if (this.BlockSize == 16) {
            AsconPermutationFriend.AsconPermutation asconPermutation = this.f228340p;
            asconPermutation.f228342x1 = loadBytes(bArr, i + 8) ^ asconPermutation.f228342x1;
        }
        this.f228340p.p(this.f228339nr);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        long jLoadBytes = loadBytes(bArr, i);
        setBytes(this.f228340p.f228341x0 ^ jLoadBytes, bArr2, i2);
        this.f228340p.f228341x0 = jLoadBytes;
        if (this.BlockSize == 16) {
            long jLoadBytes2 = loadBytes(bArr, i + 8);
            setBytes(this.f228340p.f228342x1 ^ jLoadBytes2, bArr2, i2 + 8);
            this.f228340p.f228342x1 = jLoadBytes2;
        }
        this.f228340p.p(this.f228339nr);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        this.f228340p.f228341x0 ^= loadBytes(bArr, i);
        setBytes(this.f228340p.f228341x0, bArr2, i2);
        if (this.BlockSize == 16) {
            AsconPermutationFriend.AsconPermutation asconPermutation = this.f228340p;
            asconPermutation.f228342x1 = loadBytes(bArr, i + 8) ^ asconPermutation.f228342x1;
            setBytes(this.f228340p.f228342x1, bArr2, i2 + 8);
        }
        this.f228340p.p(this.f228339nr);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalBlock(byte[] bArr, int i) {
        if (this.forEncryption) {
            processFinalEncrypt(this.m_buf, this.m_bufPos, bArr, i);
        } else {
            processFinalDecrypt(this.m_buf, this.m_bufPos, bArr, i);
        }
        setBytes(this.f228340p.x3, this.mac, 0);
        setBytes(this.f228340p.f228344x4, this.mac, 8);
    }

    public abstract void processFinalDecrypt(byte[] bArr, int i, byte[] bArr2, int i2);

    public abstract void processFinalEncrypt(byte[] bArr, int i, byte[] bArr2, int i2);

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void reset(boolean z) {
        super.reset(z);
        ascon_aeadinit();
    }

    public abstract void setBytes(long j2, byte[] bArr, int i);
}
