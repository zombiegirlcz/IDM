package s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import androidx.camera.camera2.adapter.CameraUseCaseAdapter;
import androidx.camera.camera2.impl.CameraCallbackMap;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraUseCaseAdapter.CaptureCallbackContainer f258706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f258707c;
    public final /* synthetic */ CaptureRequest d;
    public final /* synthetic */ CaptureResult e;

    public /* synthetic */ b(CameraUseCaseAdapter.CaptureCallbackContainer captureCallbackContainer, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult, int i) {
        this.f258705a = i;
        this.f258706b = captureCallbackContainer;
        this.f258707c = cameraCaptureSession;
        this.d = captureRequest;
        this.e = captureResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f258705a) {
            case 0:
                CameraCallbackMap.onCaptureProgress$lambda$0(this.f258706b, this.f258707c, this.d, this.e);
                break;
            default:
                CameraCallbackMap.onPartialCaptureResult_CcXjc1I$lambda$0(this.f258706b, this.f258707c, this.d, this.e);
                break;
        }
    }
}
