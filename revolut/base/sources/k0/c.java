package k0;

import androidx.camera.core.processing.SurfaceEdge;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SurfaceEdge f179885b;

    public /* synthetic */ c(SurfaceEdge surfaceEdge, int i) {
        this.f179884a = i;
        this.f179885b = surfaceEdge;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f179884a) {
            case 0:
                this.f179885b.lambda$createSurfaceRequest$1();
                break;
            default:
                this.f179885b.lambda$createSurfaceRequest$0();
                break;
        }
    }
}
