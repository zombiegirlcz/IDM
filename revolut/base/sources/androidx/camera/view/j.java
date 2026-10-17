package androidx.camera.view;

import androidx.camera.core.CameraSelector;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.PreviewView;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6945c;

    public /* synthetic */ j(Object obj2, Object obj3, int i) {
        this.f6943a = i;
        this.f6945c = obj2;
        this.f6944b = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6943a) {
            case 0:
                ((PreviewView.AnonymousClass1) this.f6945c).lambda$onSurfaceRequested$0((SurfaceRequest) this.f6944b);
                break;
            case 1:
                ((TextureViewImplementation) this.f6945c).lambda$onSurfaceRequested$0((SurfaceRequest) this.f6944b);
                break;
            default:
                ((CameraController) this.f6945c).lambda$setCameraSelector$4((CameraSelector) this.f6944b);
                break;
        }
    }
}
