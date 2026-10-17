package org.bouncycastle.crypto.modes.gcm;

/* JADX INFO: loaded from: classes14.dex */
public class BasicGCMExponentiator implements GCMExponentiator {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long[] f228473x;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void exponentiateX(long j2, byte[] bArr) {
        long[] jArrOneAsLongs = GCMUtil.oneAsLongs();
        if (j2 > 0) {
            long[] jArr = new long[2];
            GCMUtil.copy(this.f228473x, jArr);
            do {
                if ((1 & j2) != 0) {
                    GCMUtil.multiply(jArrOneAsLongs, jArr);
                }
                GCMUtil.square(jArr, jArr);
                j2 >>>= 1;
            } while (j2 > 0);
        }
        GCMUtil.asBytes(jArrOneAsLongs, bArr);
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void init(byte[] bArr) {
        this.f228473x = GCMUtil.asLongs(bArr);
    }
}
