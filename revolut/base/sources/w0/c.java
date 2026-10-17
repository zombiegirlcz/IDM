package w0;

import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f293591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f293592c;

    public /* synthetic */ c(Object obj2, long j2, int i) {
        this.f293590a = i;
        this.f293591b = obj2;
        this.f293592c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f293590a) {
            case 0:
                ((EncoderImpl) this.f293591b).lambda$pause$5(this.f293592c);
                break;
            case 1:
                ((EncoderImpl) this.f293591b).lambda$start$1(this.f293592c);
                break;
            default:
                ((AudioRendererEventListener.EventDispatcher) this.f293591b).lambda$positionAdvancing$3(this.f293592c);
                break;
        }
    }
}
