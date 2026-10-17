package w0;

import androidx.camera.video.internal.encoder.EncoderImpl;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EncoderImpl f293589b;

    public /* synthetic */ b(EncoderImpl encoderImpl, int i) {
        this.f293588a = i;
        this.f293589b = encoderImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f293588a) {
            case 0:
                this.f293589b.lambda$stop$3();
                break;
            case 1:
                this.f293589b.lambda$stop$2();
                break;
            case 2:
                this.f293589b.signalEndOfInputStream();
                break;
            case 3:
                this.f293589b.lambda$requestKeyFrame$8();
                break;
            case 4:
                this.f293589b.lambda$release$6();
                break;
            default:
                this.f293589b.lambda$signalSourceStopped$7();
                break;
        }
    }
}
