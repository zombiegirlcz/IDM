package hw;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    @NotNull
    public static final C0894a Companion = new C0894a();

    /* JADX INFO: renamed from: hw.a$a, reason: collision with other inner class name */
    public static final class C0894a {
        private C0894a() {
        }
    }

    public static void a(Camera camera, boolean z) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        try {
            m.Companion companion = m.INSTANCE;
            Camera2CameraControl.Companion companion2 = Camera2CameraControl.INSTANCE;
            CameraControl cameraControl = camera.getCameraControl();
            Intrinsics.checkNotNullExpressionValue(cameraControl, "getCameraControl(...)");
            Camera2CameraControl camera2CameraControlFrom = companion2.from(cameraControl);
            CaptureRequestOptions.Builder builder = new CaptureRequestOptions.Builder();
            CaptureRequest.Key CONTROL_AE_LOCK = CaptureRequest.CONTROL_AE_LOCK;
            Intrinsics.checkNotNullExpressionValue(CONTROL_AE_LOCK, "CONTROL_AE_LOCK");
            camera2CameraControlFrom.setCaptureRequestOptions(builder.setCaptureRequestOption(CONTROL_AE_LOCK, Boolean.valueOf(z)).build()).get(100L, TimeUnit.MILLISECONDS);
        } catch (Throwable th10) {
            m.Companion companion3 = m.INSTANCE;
            o.a(th10);
        }
    }
}
