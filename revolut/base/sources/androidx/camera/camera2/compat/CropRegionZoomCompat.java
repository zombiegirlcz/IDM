package androidx.camera.camera2.compat;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.internal.ZoomMath;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.Logger;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.g0;
import zhm.q0;
import zhm.u;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/camera/camera2/compat/CropRegionZoomCompat;", "Landroidx/camera/camera2/compat/ZoomCompat;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;)V", "Landroid/graphics/Rect;", "sensorRect", "", "zoomRatio", "computeCropRect", "(Landroid/graphics/Rect;F)Landroid/graphics/Rect;", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "requestControl", "Lskm/g0;", "", "applyAsync", "(FLandroidx/camera/camera2/impl/UseCaseCameraRequestControl;)Lskm/g0;", "resetAsync", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)Lskm/g0;", "getCropSensorRegion", "()Landroid/graphics/Rect;", "Landroidx/camera/camera2/impl/CameraProperties;", "currentCropRect", "Landroid/graphics/Rect;", "getMinZoomRatio", "()F", "minZoomRatio", "getMaxZoomRatio", "maxZoomRatio", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CropRegionZoomCompat implements ZoomCompat {

    @NotNull
    private final CameraProperties cameraProperties;
    private Rect currentCropRect;

    @NotNull
    private final Rect sensorRect;

    public CropRegionZoomCompat(@NotNull CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        this.cameraProperties = cameraProperties;
        CameraMetadata metadata = cameraProperties.getMetadata();
        CameraCharacteristics.Key SENSOR_INFO_ACTIVE_ARRAY_SIZE = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        Intrinsics.checkNotNullExpressionValue(SENSOR_INFO_ACTIVE_ARRAY_SIZE, "SENSOR_INFO_ACTIVE_ARRAY_SIZE");
        Object obj2 = metadata.get((CameraCharacteristics.Key<Object>) SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        Intrinsics.h(obj2);
        this.sensorRect = (Rect) obj2;
    }

    private final Rect computeCropRect(Rect sensorRect, float zoomRatio) {
        if (ZoomMath.INSTANCE.nearZero$camera_camera2(zoomRatio)) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isWarnEnabled("CXCP")) {
                String unused = Camera2Logger.TRUNCATED_TAG;
            }
            zoomRatio = 1.0f;
        }
        float fWidth = sensorRect.width() / zoomRatio;
        float fHeight = sensorRect.height() / zoomRatio;
        float fWidth2 = (sensorRect.width() - fWidth) / 2.0f;
        float fHeight2 = (sensorRect.height() - fHeight) / 2.0f;
        return new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    @NotNull
    public g0 applyAsync(float zoomRatio, @NotNull UseCaseCameraRequestControl requestControl) {
        Intrinsics.checkNotNullParameter(requestControl, "requestControl");
        Rect rectComputeCropRect = computeCropRect(this.sensorRect, zoomRatio);
        this.currentCropRect = rectComputeCropRect;
        CaptureRequest.Key key = CaptureRequest.SCALER_CROP_REGION;
        Intrinsics.i(rectComputeCropRect, "null cannot be cast to non-null type kotlin.Any");
        return UseCaseCameraRequestControl.setParametersAsync$default(requestControl, q0.c(new Pair(key, rectComputeCropRect)), null, null, 6, null);
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    @NotNull
    public Rect getCropSensorRegion() {
        Rect rect = this.currentCropRect;
        return rect == null ? this.sensorRect : rect;
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public float getMaxZoomRatio() {
        CameraMetadata metadata = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key SCALER_AVAILABLE_MAX_DIGITAL_ZOOM = CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM;
        Intrinsics.checkNotNullExpressionValue(SCALER_AVAILABLE_MAX_DIGITAL_ZOOM, "SCALER_AVAILABLE_MAX_DIGITAL_ZOOM");
        Float f = (Float) metadata.getOrDefault((CameraCharacteristics.Key<Float>) SCALER_AVAILABLE_MAX_DIGITAL_ZOOM, Float.valueOf(getMinZoomRatio()));
        ZoomMath zoomMath = ZoomMath.INSTANCE;
        Intrinsics.h(f);
        if (!zoomMath.nearZero$camera_camera2(f.floatValue())) {
            return f.floatValue();
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (!Logger.isWarnEnabled("CXCP")) {
            return 1.0f;
        }
        String unused = Camera2Logger.TRUNCATED_TAG;
        String str = "Invalid max zoom ratio of " + f + " detected, defaulting to 1.0f";
        return 1.0f;
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public float getMinZoomRatio() {
        return 1.0f;
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    @NotNull
    public g0 resetAsync(@NotNull UseCaseCameraRequestControl requestControl) {
        Intrinsics.checkNotNullParameter(requestControl, "requestControl");
        return UseCaseCameraRequestControl.removeParametersAsync$default(requestControl, u.c(CaptureRequest.SCALER_CROP_REGION), null, 2, null);
    }
}
