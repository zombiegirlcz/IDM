package b0;

import androidx.camera.core.SurfaceRequest;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SurfaceRequest f11528b;

    public /* synthetic */ p(SurfaceRequest surfaceRequest, int i) {
        this.f11527a = i;
        this.f11528b = surfaceRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11527a) {
            case 0:
                this.f11528b.lambda$new$3();
                break;
            default:
                this.f11528b.willNotProvideSurface();
                break;
        }
    }
}
