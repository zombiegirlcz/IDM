package androidx.camera.view;

import androidx.camera.core.ImageCapture;
import androidx.camera.view.CameraController;
import androidx.camera.view.PreviewViewImplementation;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6929b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f6928a = i;
        this.f6929b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6928a) {
            case 0:
                ((CameraController.FocusMeteringResultCallback) this.f6929b).resetStateAndClose();
                break;
            case 1:
                ((h) ((PreviewViewImplementation.OnSurfaceNotInUseListener) this.f6929b)).a();
                break;
            default:
                ((ImageCapture.ScreenFlashListener) this.f6929b).onCompleted();
                break;
        }
    }
}
