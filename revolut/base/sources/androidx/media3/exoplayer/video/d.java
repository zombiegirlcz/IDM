package androidx.media3.exoplayer.video;

import androidx.media3.exoplayer.video.DefaultVideoSink;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultVideoSink.FrameRendererImpl f7606b;

    public /* synthetic */ d(DefaultVideoSink.FrameRendererImpl frameRendererImpl, int i) {
        this.f7605a = i;
        this.f7606b = frameRendererImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7605a) {
            case 0:
                this.f7606b.lambda$renderFrame$1();
                break;
            default:
                this.f7606b.lambda$dropFrame$2();
                break;
        }
    }
}
