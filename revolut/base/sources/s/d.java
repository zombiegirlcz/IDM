package s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.adapter.CameraUseCaseAdapter;
import androidx.camera.camera2.impl.CameraCallbackMap;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraUseCaseAdapter.CaptureCallbackContainer f258712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f258713c;
    public final /* synthetic */ CaptureRequest d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    public /* synthetic */ d(CameraUseCaseAdapter.CaptureCallbackContainer captureCallbackContainer, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j2, long j3, int i) {
        this.f258711a = i;
        this.f258712b = captureCallbackContainer;
        this.f258713c = cameraCaptureSession;
        this.d = captureRequest;
        this.e = j2;
        this.f = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f258711a) {
            case 0:
                CameraCallbackMap.onReadoutStarted_mP9r_9w$lambda$0(this.f258712b, this.f258713c, this.d, this.e, this.f);
                break;
            default:
                CameraCallbackMap.onStarted_uGKBvU4$lambda$0(this.f258712b, this.f258713c, this.d, this.e, this.f);
                break;
        }
    }
}
