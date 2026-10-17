package androidx.camera.video;

import androidx.camera.video.Recorder;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6900b;

    public /* synthetic */ h(Object obj2, int i) {
        this.f6899a = i;
        this.f6900b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6899a) {
            case 0:
                ((Recorder.SetupVideoTask.AnonymousClass1) this.f6900b).lambda$onFailure$0();
                break;
            default:
                ((VideoEncoderSession) this.f6900b).lambda$terminateNow$3();
                break;
        }
    }
}
