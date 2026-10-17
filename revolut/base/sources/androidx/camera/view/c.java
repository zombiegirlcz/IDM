package androidx.camera.view;

import androidx.arch.core.util.Function;
import androidx.camera.view.RotationProvider;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements Function, RotationProvider.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraController f6932b;

    public /* synthetic */ c(CameraController cameraController, int i) {
        this.f6931a = i;
        this.f6932b = cameraController;
    }

    @Override // androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        switch (this.f6931a) {
            case 0:
                return this.f6932b.lambda$new$0((ProcessCameraProviderWrapper) obj2);
            case 1:
                return this.f6932b.enableTorch(((Boolean) obj2).booleanValue());
            case 2:
                return this.f6932b.setLinearZoom(((Float) obj2).floatValue());
            default:
                return this.f6932b.setZoomRatio(((Float) obj2).floatValue());
        }
    }
}
