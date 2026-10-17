package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor;
import androidx.camera.camera2.pipe.compat.Camera2DeviceCache;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CameraManager.AvailabilityCallback f6819c;

    public /* synthetic */ a(Object obj2, CameraManager.AvailabilityCallback availabilityCallback, int i) {
        this.f6817a = i;
        this.f6818b = obj2;
        this.f6819c = availabilityCallback;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6817a) {
            case 0:
                return Camera2CameraAvailabilityMonitor$availableCameraFlow$1.invokeSuspend$lambda$0((CameraManager) this.f6818b, (Camera2CameraAvailabilityMonitor$availableCameraFlow$1$availabilityCallback$1) this.f6819c);
            case 1:
                return Camera2CameraStatusMonitor.AnonymousClass1.invokeSuspend$lambda$0((Camera2CameraStatusMonitor) this.f6818b, (Camera2CameraStatusMonitor$cameraStatusFlow$1$availabilityCallback$1) this.f6819c);
            default:
                return Camera2DeviceCache.AnonymousClass1.invokeSuspend$lambda$1((CameraManager) this.f6818b, (Camera2DeviceCache$createCameraIdListFlow$1$callback$1) this.f6819c);
        }
    }
}
