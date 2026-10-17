package w0;

import androidx.camera.video.internal.encoder.EncoderCallback;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EncoderCallback f293597b;

    public /* synthetic */ e(EncoderCallback encoderCallback, int i) {
        this.f293596a = i;
        this.f293597b = encoderCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f293596a) {
            case 0:
                this.f293597b.onEncodeStop();
                break;
            case 1:
                this.f293597b.onEncodeStart();
                break;
            default:
                this.f293597b.onEncodePaused();
                break;
        }
    }
}
