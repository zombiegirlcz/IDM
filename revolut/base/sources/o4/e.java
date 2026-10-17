package o4;

import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f221900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f221901c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e(Object obj2, Object obj3, int i, long j2, long j3) {
        this.f221899a = i;
        this.d = obj2;
        this.e = obj3;
        this.f221900b = j2;
        this.f221901c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f221899a) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) this.d).lambda$decoderInitialized$1((String) this.e, this.f221900b, this.f221901c);
                break;
            default:
                ((Request.Listener) this.d).mo19onStarteduGKBvU4((RequestMetadata) this.e, this.f221900b, this.f221901c);
                break;
        }
    }
}
