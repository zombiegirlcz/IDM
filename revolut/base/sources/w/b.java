package w;

import androidx.camera.camera2.pipe.compat.Camera2CameraController;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Camera2CameraController f293582b;

    public /* synthetic */ b(Camera2CameraController camera2CameraController, int i) {
        this.f293581a = i;
        this.f293582b = camera2CameraController;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f293581a) {
            case 0:
                return Camera2CameraController.detachSessionAndCamera$lambda$0(this.f293582b, (Throwable) obj2);
            default:
                return Boolean.valueOf(Camera2CameraController.startLocked$lambda$2(this.f293582b, (Unit) obj2));
        }
    }
}
