package androidx.camera.core.processing;

import androidx.camera.core.processing.SurfaceEdge;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SurfaceEdge.SettableSurface f6875b;

    public /* synthetic */ b(SurfaceEdge.SettableSurface settableSurface, int i) {
        this.f6874a = i;
        this.f6875b = settableSurface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6874a) {
            case 0:
                this.f6875b.close();
                break;
            case 1:
                this.f6875b.decrementUseCount();
                break;
            default:
                this.f6875b.lambda$close$1();
                break;
        }
    }
}
