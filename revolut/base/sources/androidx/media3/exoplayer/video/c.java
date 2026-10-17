package androidx.media3.exoplayer.video;

import androidx.media3.exoplayer.video.VideoFrameReleaseHelper;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7604b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f7603a = i;
        this.f7604b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7603a) {
            case 0:
                ((DefaultVideoSink) this.f7604b).lambda$handleInputFrame$2();
                break;
            default:
                ((VideoFrameReleaseHelper.VSyncSamplerV33) this.f7604b).lambda$onVsync$0();
                break;
        }
    }
}
