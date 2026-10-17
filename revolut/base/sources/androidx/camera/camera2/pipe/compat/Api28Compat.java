package androidx.camera.camera2.pipe.compat;

import android.hardware.HardwareBuffer;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.Image;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010$\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\r2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u001eH\u0007¢\u0006\u0004\b/\u00100J!\u00102\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u001e2\b\u00101\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b2\u00103J/\u00108\u001a\u00020\b2\u0006\u00105\u001a\u0002042\u0006\u00101\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 2\u0006\u00107\u001a\u000206H\u0007¢\u0006\u0004\b8\u00109J'\u0010;\u001a\u00020\b2\u0006\u00105\u001a\u0002042\u0006\u0010!\u001a\u00020 2\u0006\u00107\u001a\u00020:H\u0007¢\u0006\u0004\b;\u0010<J1\u0010B\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010=*\u00020\u00012\u0006\u0010?\u001a\u00020>2\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000@H\u0007¢\u0006\u0004\bB\u0010C¨\u0006D"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Api28Compat;", "", "<init>", "()V", "Landroid/hardware/camera2/CameraDevice;", "cameraDevice", "Landroid/hardware/camera2/params/SessionConfiguration;", "sessionConfig", "", "createCaptureSession", "(Landroid/hardware/camera2/CameraDevice;Landroid/hardware/camera2/params/SessionConfiguration;)V", "Landroid/hardware/camera2/CameraCharacteristics;", "cameraCharacteristics", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "getAvailablePhysicalCameraRequestKeys", "(Landroid/hardware/camera2/CameraCharacteristics;)Ljava/util/List;", "getAvailableSessionKeys", "", "", "getPhysicalCameraIds", "(Landroid/hardware/camera2/CameraCharacteristics;)Ljava/util/Set;", "Landroid/hardware/camera2/TotalCaptureResult;", "totalCaptureResult", "", "Landroid/hardware/camera2/CaptureResult;", "getPhysicalCaptureResults", "(Landroid/hardware/camera2/TotalCaptureResult;)Ljava/util/Map;", "", "sessionType", "Landroid/hardware/camera2/params/OutputConfiguration;", "outputs", "Ljava/util/concurrent/Executor;", "executor", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "stateCallback", "newSessionConfiguration", "(ILjava/util/List;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Landroid/hardware/camera2/params/SessionConfiguration;", "Landroid/hardware/camera2/params/InputConfiguration;", "inputConfig", "setInputConfiguration", "(Landroid/hardware/camera2/params/SessionConfiguration;Landroid/hardware/camera2/params/InputConfiguration;)V", "Landroid/hardware/camera2/CaptureRequest;", "params", "setSessionParameters", "(Landroid/hardware/camera2/params/SessionConfiguration;Landroid/hardware/camera2/CaptureRequest;)V", "outputConfig", "getMaxSharedSurfaceCount", "(Landroid/hardware/camera2/params/OutputConfiguration;)I", "cameraId", "setPhysicalCameraId", "(Landroid/hardware/camera2/params/OutputConfiguration;Ljava/lang/String;)V", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "callback", "openCamera", "(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V", "Landroid/hardware/camera2/CameraManager$AvailabilityCallback;", "registerAvailabilityCallback", "(Landroid/hardware/camera2/CameraManager;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V", "T", "Landroid/media/Image;", "image", "Lkotlin/reflect/KClass;", "type", "unwrapAsHardwareBuffer", "(Landroid/media/Image;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Api28Compat {

    @NotNull
    public static final Api28Compat INSTANCE = new Api28Compat();

    private Api28Compat() {
    }

    public static final void createCaptureSession(@NotNull CameraDevice cameraDevice, @NotNull SessionConfiguration sessionConfig) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(cameraDevice, "cameraDevice");
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        cameraDevice.createCaptureSession(sessionConfig);
    }

    public static final List<CaptureRequest.Key<?>> getAvailablePhysicalCameraRequestKeys(@NotNull CameraCharacteristics cameraCharacteristics) {
        Intrinsics.checkNotNullParameter(cameraCharacteristics, "cameraCharacteristics");
        return cameraCharacteristics.getAvailablePhysicalCameraRequestKeys();
    }

    public static final List<CaptureRequest.Key<?>> getAvailableSessionKeys(@NotNull CameraCharacteristics cameraCharacteristics) {
        Intrinsics.checkNotNullParameter(cameraCharacteristics, "cameraCharacteristics");
        return cameraCharacteristics.getAvailableSessionKeys();
    }

    public static final int getMaxSharedSurfaceCount(@NotNull OutputConfiguration outputConfig) {
        Intrinsics.checkNotNullParameter(outputConfig, "outputConfig");
        return outputConfig.getMaxSharedSurfaceCount();
    }

    @NotNull
    public static final Set<String> getPhysicalCameraIds(@NotNull CameraCharacteristics cameraCharacteristics) {
        Intrinsics.checkNotNullParameter(cameraCharacteristics, "cameraCharacteristics");
        Set<String> physicalCameraIds = cameraCharacteristics.getPhysicalCameraIds();
        Intrinsics.checkNotNullExpressionValue(physicalCameraIds, "getPhysicalCameraIds(...)");
        return physicalCameraIds;
    }

    public static final Map<String, CaptureResult> getPhysicalCaptureResults(@NotNull TotalCaptureResult totalCaptureResult) {
        Intrinsics.checkNotNullParameter(totalCaptureResult, "totalCaptureResult");
        return totalCaptureResult.getPhysicalCameraResults();
    }

    @NotNull
    public static final SessionConfiguration newSessionConfiguration(int sessionType, @NotNull List<OutputConfiguration> outputs, @NotNull Executor executor, @NotNull CameraCaptureSession.StateCallback stateCallback) {
        Intrinsics.checkNotNullParameter(outputs, "outputs");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(stateCallback, "stateCallback");
        return new SessionConfiguration(sessionType, outputs, executor, stateCallback);
    }

    public static final void openCamera(@NotNull CameraManager cameraManager, @NotNull String cameraId, @NotNull Executor executor, @NotNull CameraDevice.StateCallback callback) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(cameraManager, "cameraManager");
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        cameraManager.openCamera(cameraId, executor, callback);
    }

    public static final void registerAvailabilityCallback(@NotNull CameraManager cameraManager, @NotNull Executor executor, @NotNull CameraManager.AvailabilityCallback callback) {
        Intrinsics.checkNotNullParameter(cameraManager, "cameraManager");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        cameraManager.registerAvailabilityCallback(executor, callback);
    }

    public static final void setInputConfiguration(@NotNull SessionConfiguration sessionConfig, @NotNull InputConfiguration inputConfig) {
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        sessionConfig.setInputConfiguration(inputConfig);
    }

    public static final void setPhysicalCameraId(@NotNull OutputConfiguration outputConfig, String cameraId) {
        Intrinsics.checkNotNullParameter(outputConfig, "outputConfig");
        outputConfig.setPhysicalCameraId(cameraId);
    }

    public static final void setSessionParameters(@NotNull SessionConfiguration sessionConfig, @NotNull CaptureRequest params) {
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        Intrinsics.checkNotNullParameter(params, "params");
        sessionConfig.setSessionParameters(params);
    }

    public static final <T> T unwrapAsHardwareBuffer(@NotNull Image image, @NotNull KClass type) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.f(type, o0.f186429a.b(HardwareBuffer.class))) {
            return (T) image.getHardwareBuffer();
        }
        return null;
    }
}
