package org.bouncycastle.pqc.legacy.sphincsplus;

/* JADX INFO: loaded from: classes14.dex */
class SIG_XMSS {
    final byte[][] auth;

    /* JADX INFO: renamed from: sig, reason: collision with root package name */
    final byte[] f228932sig;

    public SIG_XMSS(byte[] bArr, byte[][] bArr2) {
        this.f228932sig = bArr;
        this.auth = bArr2;
    }

    public byte[] getWOTSSig() {
        return this.f228932sig;
    }

    public byte[][] getXMSSAUTH() {
        return this.auth;
    }
}
