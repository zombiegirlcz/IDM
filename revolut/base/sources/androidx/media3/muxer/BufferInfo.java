package androidx.media3.muxer;

/* JADX INFO: loaded from: classes15.dex */
public final class BufferInfo {
    public final int flags;
    public final long presentationTimeUs;
    public final int size;

    public BufferInfo(long j2, int i, int i2) {
        this.presentationTimeUs = j2;
        this.size = i;
        this.flags = i2;
    }
}
