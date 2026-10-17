package dw;

import androidx.camera.core.SurfaceOutput;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f118173b;

    public /* synthetic */ e(h hVar, int i) {
        this.f118172a = i;
        this.f118173b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f118172a) {
            case 0:
                this.f118173b.f118181b.a();
                break;
            default:
                h hVar = this.f118173b;
                if (!hVar.f118184h) {
                    SurfaceOutput surfaceOutput = hVar.f118183g;
                    if (surfaceOutput != null) {
                        surfaceOutput.close();
                    }
                    hVar.f118183g = null;
                    hVar.f118181b.release();
                    hVar.f118180a.quitSafely();
                    hVar.f118184h = true;
                }
                break;
        }
    }
}
