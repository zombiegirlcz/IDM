package org.bouncycastle.pqc.crypto.slhdsa;

/* JADX INFO: loaded from: classes14.dex */
class SIG_XMSS {
    final byte[][] auth;

    /* JADX INFO: renamed from: sig, reason: collision with root package name */
    final byte[] f228866sig;

    public SIG_XMSS(byte[] bArr, byte[][] bArr2) {
        this.f228866sig = bArr;
        this.auth = bArr2;
    }

    public byte[] getWOTSSig() {
        return this.f228866sig;
    }

    public byte[][] getXMSSAUTH() {
        return this.auth;
    }
}
