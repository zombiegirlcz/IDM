package androidx.media3.exoplayer.dash.manifest;

/* JADX INFO: loaded from: classes15.dex */
public final class ServiceDescriptionElement {
    public final long maxOffsetMs;
    public final float maxPlaybackSpeed;
    public final long minOffsetMs;
    public final float minPlaybackSpeed;
    public final long targetOffsetMs;

    public ServiceDescriptionElement(long j2, long j3, long j5, float f, float f4) {
        this.targetOffsetMs = j2;
        this.minOffsetMs = j3;
        this.maxOffsetMs = j5;
        this.minPlaybackSpeed = f;
        this.maxPlaybackSpeed = f4;
    }
}
