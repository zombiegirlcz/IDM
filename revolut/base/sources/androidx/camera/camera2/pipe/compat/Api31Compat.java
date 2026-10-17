package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraExtensionSession$StateCallback;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010&\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001e2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00042\u0006\u0010(\u001a\u00020\u001bH\u0007¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Api31Compat;", "", "<init>", "()V", "", "Landroidx/camera/camera2/pipe/compat/InputConfigData;", "inputConfigData", "", "cameraId", "Landroid/hardware/camera2/params/InputConfiguration;", "newInputConfiguration", "(Ljava/util/List;Ljava/lang/String;)Landroid/hardware/camera2/params/InputConfiguration;", "Landroid/hardware/camera2/TotalCaptureResult;", "totalCaptureResult", "", "Landroid/hardware/camera2/CaptureResult;", "getPhysicalCameraTotalResults", "(Landroid/hardware/camera2/TotalCaptureResult;)Ljava/util/Map;", "Landroid/hardware/camera2/CameraDevice;", "cameraDevice", "Landroid/hardware/camera2/params/ExtensionSessionConfiguration;", "extensionConfiguration", "", "createExtensionCaptureSession", "(Landroid/hardware/camera2/CameraDevice;Landroid/hardware/camera2/params/ExtensionSessionConfiguration;)V", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Landroid/hardware/camera2/CameraExtensionCharacteristics;", "getCameraExtensionCharacteristics", "(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;)Landroid/hardware/camera2/CameraExtensionCharacteristics;", "", "extensionMode", "Landroid/hardware/camera2/params/OutputConfiguration;", "outputs", "Ljava/util/concurrent/Executor;", "executor", "Landroid/hardware/camera2/CameraExtensionSession$StateCallback;", "stateCallback", "newExtensionSessionConfiguration", "(ILjava/util/List;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraExtensionSession$StateCallback;)Landroid/hardware/camera2/params/ExtensionSessionConfiguration;", "extensionCharacteristics", "getSupportedExtensions", "(Landroid/hardware/camera2/CameraExtensionCharacteristics;)Ljava/util/List;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Api31Compat {

    @NotNull
    public static final Api31Compat INSTANCE = new Api31Compat();

    private Api31Compat() {
    }

    public static final void createExtensionCaptureSession(@NotNull CameraDevice cameraDevice, @NotNull ExtensionSessionConfiguration extensionConfiguration) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(cameraDevice, "cameraDevice");
        Intrinsics.checkNotNullParameter(extensionConfiguration, "extensionConfiguration");
        cameraDevice.createExtensionSession(extensionConfiguration);
    }

    @NotNull
    public static final CameraExtensionCharacteristics getCameraExtensionCharacteristics(@NotNull CameraManager cameraManager, @NotNull String cameraId) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(cameraManager, "cameraManager");
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        CameraExtensionCharacteristics cameraExtensionCharacteristics = cameraManager.getCameraExtensionCharacteristics(cameraId);
        Intrinsics.checkNotNullExpressionValue(cameraExtensionCharacteristics, "getCameraExtensionCharacteristics(...)");
        return cameraExtensionCharacteristics;
    }

    public static final Map<String, CaptureResult> getPhysicalCameraTotalResults(@NotNull TotalCaptureResult totalCaptureResult) {
        Intrinsics.checkNotNullParameter(totalCaptureResult, "totalCaptureResult");
        return totalCaptureResult.getPhysicalCameraTotalResults();
    }

    @NotNull
    public static final List<Integer> getSupportedExtensions(@NotNull CameraExtensionCharacteristics extensionCharacteristics) {
        Intrinsics.checkNotNullParameter(extensionCharacteristics, "extensionCharacteristics");
        List<Integer> supportedExtensions = extensionCharacteristics.getSupportedExtensions();
        Intrinsics.checkNotNullExpressionValue(supportedExtensions, "getSupportedExtensions(...)");
        return supportedExtensions;
    }

    @NotNull
    public static final ExtensionSessionConfiguration newExtensionSessionConfiguration(int extensionMode, @NotNull List<OutputConfiguration> outputs, @NotNull Executor executor, @NotNull CameraExtensionSession$StateCallback stateCallback) {
        Intrinsics.checkNotNullParameter(outputs, "outputs");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(stateCallback, "stateCallback");
        return u3.a.e(extensionMode, outputs, executor, stateCallback);
    }

    @NotNull
    public static final InputConfiguration newInputConfiguration(@NotNull List<InputConfigData> inputConfigData, @NotNull String cameraId) {
        Intrinsics.checkNotNullParameter(inputConfigData, "inputConfigData");
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        if (inputConfigData.isEmpty()) {
            throw new IllegalStateException("Call to create InputConfiguration but list of InputConfigData is empty.");
        }
        if (inputConfigData.size() == 1) {
            InputConfigData inputConfigData2 = (InputConfigData) d0.b0(inputConfigData);
            return new InputConfiguration(inputConfigData2.getWidth(), inputConfigData2.getHeight(), inputConfigData2.getFormat());
        }
        List<InputConfigData> list = inputConfigData;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (InputConfigData inputConfigData3 : list) {
            u3.a.m();
            arrayList.add(u3.a.g(inputConfigData3.getWidth(), inputConfigData3.getHeight(), cameraId));
        }
        return u3.a.f(((InputConfigData) d0.b0(inputConfigData)).getFormat(), arrayList);
    }
}
