package n0;

import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.streamsharing.VirtualCameraControl;
import androidx.camera.lifecycle.LifecycleCameraProviderImpl;
import com.google.common.util.concurrent.ListenableFuture;
import pth.l;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements AsyncFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f210833b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f210832a = i;
        this.f210833b = obj2;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public final ListenableFuture apply(Object obj2) {
        switch (this.f210832a) {
            case 0:
                return VirtualCameraControl.lambda$submitStillCaptureRequests$0((ListenableFuture) this.f210833b, (CameraCapturePipeline) obj2);
            case 1:
                return VirtualCameraControl.lambda$submitStillCaptureRequests$2((ListenableFuture) this.f210833b, (Void) obj2);
            default:
                return LifecycleCameraProviderImpl.initAsync$lambda$0$2((l) this.f210833b, obj2);
        }
    }
}
