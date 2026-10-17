package com.revolut;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ProtectedRevolutApplication$RevolutApplication$a {
    private int Eb;

    /* JADX INFO: renamed from: asf, reason: collision with root package name */
    private final byte[] f50271asf;

    public ProtectedRevolutApplication$RevolutApplication$a(byte[] bArr) {
        this.f50271asf = bArr;
        this.Eb = 0;
    }

    public ProtectedRevolutApplication$RevolutApplication$a(byte[] bArr, int i) {
        this.f50271asf = bArr;
        this.Eb = i;
    }

    public void aDG(int i, int i2) {
        byte[] bArr = this.f50271asf;
        int i3 = this.Eb;
        Arrays.fill(bArr, i3, i3 + i2, (byte) i);
    }

    byte ebCA(int i) {
        return this.f50271asf[this.Eb + i];
    }

    int ey(int i) {
        return ProtectedRevolutApplication$ProtectedRevolutApplication$q.g(this.f50271asf[this.Eb + i]);
    }

    public ProtectedRevolutApplication$RevolutApplication$a ig(int i) {
        return new ProtectedRevolutApplication$RevolutApplication$a(this.f50271asf, this.Eb + i);
    }

    byte[] ime(int i, int i2) {
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f50271asf, this.Eb + i, bArr, 0, i2);
        return bArr;
    }

    void li(int i, byte b4) {
        this.f50271asf[this.Eb + i] = b4;
    }

    public void xzF(int i) {
        this.Eb += i;
    }

    void yy(byte[] bArr, int i) {
        System.arraycopy(bArr, 0, this.f50271asf, this.Eb + i, bArr.length);
    }
}
