package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class SipHash128 extends SipHash {
    public SipHash128() {
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, DataLengthException {
        long j2 = this.f228452m;
        int i2 = this.wordPos;
        this.f228452m = ((j2 >>> ((7 - i2) << 3)) >>> 8) | ((((long) ((this.wordCount << 3) + i2)) & 255) << 56);
        processMessageWord();
        this.v2 ^= 238;
        applySipRounds(this.d);
        long j3 = this.f228453v0;
        long j5 = this.f228454v1;
        long j16 = ((j3 ^ j5) ^ this.v2) ^ this.f228455v3;
        this.f228454v1 = j5 ^ 221;
        applySipRounds(this.d);
        long j22 = ((this.f228453v0 ^ this.f228454v1) ^ this.v2) ^ this.f228455v3;
        reset();
        Pack.longToLittleEndian(j16, bArr, i);
        Pack.longToLittleEndian(j22, bArr, i + 8);
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash128-" + this.f228449c + "-" + this.d;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public void reset() {
        super.reset();
        this.f228454v1 ^= 238;
    }

    public SipHash128(int i, int i2) {
        super(i, i2);
    }

    @Override // org.bouncycastle.crypto.macs.SipHash
    public long doFinal() throws IllegalStateException, DataLengthException {
        throw new UnsupportedOperationException("doFinal() is not supported");
    }
}
