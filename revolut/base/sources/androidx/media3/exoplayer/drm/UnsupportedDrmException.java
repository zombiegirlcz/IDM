package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes15.dex */
public final class UnsupportedDrmException extends Exception {
    public final int reason;

    public UnsupportedDrmException(int i) {
        this.reason = i;
    }

    public UnsupportedDrmException(int i, Exception exc2) {
        super(exc2);
        this.reason = i;
    }
}
