package s;

import androidx.camera.camera2.impl.CameraCallbackMap;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.core.impl.CameraCaptureCallback;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraCaptureCallback f258703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CameraCallbackMap f258704c;
    public final /* synthetic */ RequestMetadata d;

    public /* synthetic */ a(CameraCaptureCallback cameraCaptureCallback, CameraCallbackMap cameraCallbackMap, RequestMetadata requestMetadata, int i) {
        this.f258702a = i;
        this.f258703b = cameraCaptureCallback;
        this.f258704c = cameraCallbackMap;
        this.d = requestMetadata;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f258702a) {
            case 0:
                CameraCallbackMap.onRequestSequenceAborted$lambda$1(this.f258703b, this.f258704c, this.d);
                break;
            default:
                CameraCallbackMap.onStarted_uGKBvU4$lambda$1(this.f258703b, this.f258704c, this.d);
                break;
        }
    }
}
