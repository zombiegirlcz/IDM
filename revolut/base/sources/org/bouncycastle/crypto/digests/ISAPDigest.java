package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.digests.AsconBaseDigest;
import org.bouncycastle.crypto.digests.BufferBaseDigest;
import org.bouncycastle.crypto.engines.AsconPermutationFriend;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class ISAPDigest extends BufferBaseDigest {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AsconPermutationFriend.AsconPermutation f228316p;

    public static class Friend {
        private static final Friend INSTANCE = new Friend();

        private Friend() {
        }

        public static Friend getFriend(AsconBaseDigest.Friend friend) {
            if (friend != null) {
                return INSTANCE;
            }
            throw new NullPointerException("This method is only for use by AsconBaseDigest");
        }
    }

    public ISAPDigest() {
        super(BufferBaseDigest.ProcessingBufferType.Immediate, 8);
        this.f228316p = AsconPermutationFriend.getAsconPermutation(Friend.INSTANCE);
        this.DigestSize = 32;
        this.algorithmName = "ISAP Hash";
        reset();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i) {
        return super.doFinal(bArr, i);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    public void finish(byte[] bArr, int i) {
        this.f228316p.f228341x0 ^= 128 << ((7 - this.m_bufPos) << 3);
        while (true) {
            int i2 = this.m_bufPos;
            if (i2 <= 0) {
                break;
            }
            AsconPermutationFriend.AsconPermutation asconPermutation = this.f228316p;
            long j2 = asconPermutation.f228341x0;
            byte[] bArr2 = this.m_buf;
            int i3 = i2 - 1;
            this.m_bufPos = i3;
            asconPermutation.f228341x0 = j2 ^ ((((long) bArr2[i3]) & 255) << ((7 - i3) << 3));
        }
        for (int i5 = 0; i5 < 4; i5++) {
            this.f228316p.p(12);
            Pack.longToBigEndian(this.f228316p.f228341x0, bArr, i);
            i += 8;
        }
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.ExtendedDigest
    public /* bridge */ /* synthetic */ int getByteLength() {
        return super.getByteLength();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ int getDigestSize() {
        return super.getDigestSize();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    public void processBytes(byte[] bArr, int i) {
        AsconPermutationFriend.AsconPermutation asconPermutation = this.f228316p;
        asconPermutation.f228341x0 = Pack.bigEndianToLong(bArr, i) ^ asconPermutation.f228341x0;
        this.f228316p.p(12);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f228316p.set(-1255492011513352131L, -8380609354527731710L, -5437372128236807582L, 4834782570098516968L, 3787428097924915520L);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ void update(byte b4) {
        super.update(b4);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ void update(byte[] bArr, int i, int i2) {
        super.update(bArr, i, i2);
    }
}
