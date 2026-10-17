package o4;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f221897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AudioSink.AudioTrackConfig f221898c;

    public /* synthetic */ d(AudioRendererEventListener.EventDispatcher eventDispatcher, AudioSink.AudioTrackConfig audioTrackConfig, int i) {
        this.f221896a = i;
        this.f221897b = eventDispatcher;
        this.f221898c = audioTrackConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f221896a) {
            case 0:
                this.f221897b.lambda$audioTrackReleased$11(this.f221898c);
                break;
            default:
                this.f221897b.lambda$audioTrackInitialized$10(this.f221898c);
                break;
        }
    }
}
