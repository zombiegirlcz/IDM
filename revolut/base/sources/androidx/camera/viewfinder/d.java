package androidx.camera.viewfinder;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewfinderSurfaceRequest f6961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewfinderImplementation f6962c;

    public /* synthetic */ d(ViewfinderImplementation viewfinderImplementation, ViewfinderSurfaceRequest viewfinderSurfaceRequest, int i) {
        this.f6960a = i;
        this.f6962c = viewfinderImplementation;
        this.f6961b = viewfinderSurfaceRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6960a) {
            case 0:
                ((SurfaceViewImplementation) this.f6962c).lambda$onSurfaceRequested$1(this.f6961b);
                break;
            default:
                ((TextureViewImplementation) this.f6962c).lambda$onSurfaceRequested$0(this.f6961b);
                break;
        }
    }
}
