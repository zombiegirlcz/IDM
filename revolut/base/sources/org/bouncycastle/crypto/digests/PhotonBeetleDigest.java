package org.bouncycastle.crypto.digests;

import com.google.common.primitives.SignedBytes;
import org.bouncycastle.crypto.digests.BufferBaseDigest;
import org.bouncycastle.crypto.engines.PhotonBeetleEngine;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;

/* JADX INFO: loaded from: classes14.dex */
public class PhotonBeetleDigest extends BufferBaseDigest {
    private static final int D = 8;
    private static final int SQUEEZE_RATE_INBYTES = 16;
    private int blockCount;
    private final byte[] state;

    public static class Friend {
        private static final Friend INSTANCE = new Friend();

        private Friend() {
        }
    }

    public PhotonBeetleDigest() {
        super(BufferBaseDigest.ProcessingBufferType.Buffered, 4);
        this.DigestSize = 32;
        this.state = new byte[32];
        this.algorithmName = "Photon-Beetle Hash";
        this.blockCount = 0;
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i) {
        return super.doFinal(bArr, i);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    public void finish(byte[] bArr, int i) {
        int i2 = this.m_bufPos;
        if (i2 == 0 && this.blockCount == 0) {
            byte[] bArr2 = this.state;
            int i3 = this.DigestSize - 1;
            bArr2[i3] = (byte) (bArr2[i3] ^ 32);
        } else {
            int i5 = this.blockCount;
            if (i5 < 4) {
                System.arraycopy(this.m_buf, 0, this.state, i5 << 2, i2);
                byte[] bArr3 = this.state;
                int i6 = (this.blockCount << 2) + this.m_bufPos;
                bArr3[i6] = (byte) (bArr3[i6] ^ 1);
                int i21 = this.DigestSize - 1;
                bArr3[i21] = (byte) (bArr3[i21] ^ 32);
            } else if (i5 == 4 && i2 == 0) {
                byte[] bArr4 = this.state;
                int i22 = this.DigestSize - 1;
                bArr4[i22] = (byte) (bArr4[i22] ^ SignedBytes.MAX_POWER_OF_TWO);
            } else {
                PhotonBeetleEngine.photonPermutation(Friend.INSTANCE, this.state);
                Bytes.xorTo(this.m_bufPos, this.m_buf, this.state);
                int i32 = this.m_bufPos;
                int i33 = this.BlockSize;
                if (i32 < i33) {
                    byte[] bArr5 = this.state;
                    bArr5[i32] = (byte) (bArr5[i32] ^ 1);
                }
                byte[] bArr6 = this.state;
                int i43 = this.DigestSize - 1;
                bArr6[i43] = (byte) (((i32 % i33 != 0 ? 2 : 1) << 5) ^ bArr6[i43]);
            }
        }
        PhotonBeetleEngine.photonPermutation(Friend.INSTANCE, this.state);
        System.arraycopy(this.state, 0, bArr, i, 16);
        PhotonBeetleEngine.photonPermutation(Friend.INSTANCE, this.state);
        System.arraycopy(this.state, 0, bArr, i + 16, 16);
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
        int i2 = this.blockCount;
        if (i2 < 4) {
            System.arraycopy(bArr, i, this.state, i2 << 2, this.BlockSize);
        } else {
            PhotonBeetleEngine.photonPermutation(Friend.INSTANCE, this.state);
            Bytes.xorTo(this.BlockSize, bArr, i, this.state);
        }
        this.blockCount++;
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        Arrays.fill(this.state, (byte) 0);
        this.blockCount = 0;
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
