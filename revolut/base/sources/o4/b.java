package o4;

import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f221891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DecoderCounters f221892c;

    public /* synthetic */ b(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int i) {
        this.f221890a = i;
        this.f221891b = eventDispatcher;
        this.f221892c = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f221890a) {
            case 0:
                this.f221891b.lambda$disabled$6(this.f221892c);
                break;
            default:
                this.f221891b.lambda$enabled$0(this.f221892c);
                break;
        }
    }
}
