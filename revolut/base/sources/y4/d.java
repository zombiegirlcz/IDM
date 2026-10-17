package y4;

import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f310767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f310768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DecoderCounters f310769c;

    public /* synthetic */ d(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int i) {
        this.f310767a = i;
        this.f310768b = eventDispatcher;
        this.f310769c = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f310767a) {
            case 0:
                this.f310768b.lambda$enabled$0(this.f310769c);
                break;
            default:
                this.f310768b.lambda$disabled$8(this.f310769c);
                break;
        }
    }
}
