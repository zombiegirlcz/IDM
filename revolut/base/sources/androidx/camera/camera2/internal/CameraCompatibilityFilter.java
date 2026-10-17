package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.pipe.CameraDevices;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.InitializationException;
import androidx.camera.core.Logger;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\r"}, d2 = {"Landroidx/camera/camera2/internal/CameraCompatibilityFilter;", "", "<init>", "()V", "getBackwardCompatibleCameraIds", "", "", "cameraDevices", "Landroidx/camera/camera2/pipe/CameraDevices;", "availableCameraIds", "isBackwardCompatible", "", "cameraId", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraCompatibilityFilter {

    @NotNull
    public static final CameraCompatibilityFilter INSTANCE = new CameraCompatibilityFilter();

    private CameraCompatibilityFilter() {
    }

    @NotNull
    public static final List<String> getBackwardCompatibleCameraIds(@NotNull CameraDevices cameraDevices, @NotNull List<String> availableCameraIds) {
        Intrinsics.checkNotNullParameter(cameraDevices, "cameraDevices");
        Intrinsics.checkNotNullParameter(availableCameraIds, "availableCameraIds");
        ArrayList arrayList = new ArrayList();
        for (String str : availableCameraIds) {
            if (Intrinsics.f(str, "0") || Intrinsics.f(str, "1")) {
                arrayList.add(str);
            } else if (isBackwardCompatible(str, cameraDevices)) {
                arrayList.add(str);
            } else {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled("CXCP")) {
                    String unused = Camera2Logger.TRUNCATED_TAG;
                    String str2 = "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.";
                }
            }
        }
        return arrayList;
    }

    public static final boolean isBackwardCompatible(@NotNull String cameraId, @NotNull CameraDevices cameraDevices) throws InitializationException {
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        Intrinsics.checkNotNullParameter(cameraDevices, "cameraDevices");
        if (Intrinsics.f(Build.FINGERPRINT, "robolectric")) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (!Logger.isDebugEnabled("CXCP")) {
                return true;
            }
            String unused = Camera2Logger.TRUNCATED_TAG;
            return true;
        }
        try {
            CameraMetadata cameraMetadataM122awaitCameraMetadataFpsL5FU$default = CameraDevices.m122awaitCameraMetadataFpsL5FU$default(cameraDevices, CameraId.m182constructorimpl(cameraId), null, 2, null);
            if (cameraMetadataM122awaitCameraMetadataFpsL5FU$default == null) {
                throw new IllegalStateException("Required value was null.");
            }
            CameraCharacteristics.Key REQUEST_AVAILABLE_CAPABILITIES = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
            Intrinsics.checkNotNullExpressionValue(REQUEST_AVAILABLE_CAPABILITIES, "REQUEST_AVAILABLE_CAPABILITIES");
            int[] iArr = (int[]) cameraMetadataM122awaitCameraMetadataFpsL5FU$default.get(REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                return d.G(iArr, 0);
            }
            return false;
        } catch (CameraAccessException e) {
            Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
            if (Logger.isErrorEnabled("CXCP")) {
                String unused2 = Camera2Logger.TRUNCATED_TAG;
                String str = "Error while accessing metadata for cameraID: " + cameraId;
            }
            throw new InitializationException(e);
        }
    }
}
