package androidx.camera.camera2.compat;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Range;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.pipe.CameraMetadata;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.g0;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/camera/camera2/compat/AndroidRZoomCompat;", "Landroidx/camera/camera2/compat/ZoomCompat;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Landroid/util/Range;", "", "range", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;Landroid/util/Range;)V", "zoomRatio", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "requestControl", "Lskm/g0;", "", "applyAsync", "(FLandroidx/camera/camera2/impl/UseCaseCameraRequestControl;)Lskm/g0;", "resetAsync", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)Lskm/g0;", "Landroid/graphics/Rect;", "getCropSensorRegion", "()Landroid/graphics/Rect;", "Landroidx/camera/camera2/impl/CameraProperties;", "Landroid/util/Range;", "getMinZoomRatio", "()F", "minZoomRatio", "getMaxZoomRatio", "maxZoomRatio", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidRZoomCompat implements ZoomCompat {

    @NotNull
    private final CameraProperties cameraProperties;

    @NotNull
    private final Range<Float> range;

    public AndroidRZoomCompat(@NotNull CameraProperties cameraProperties, @NotNull Range<Float> range) {
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(range, "range");
        this.cameraProperties = cameraProperties;
        this.range = range;
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    @NotNull
    public g0 applyAsync(float zoomRatio, @NotNull UseCaseCameraRequestControl requestControl) {
        Intrinsics.checkNotNullParameter(requestControl, "requestControl");
        float minZoomRatio = getMinZoomRatio();
        if (zoomRatio > getMaxZoomRatio() || minZoomRatio > zoomRatio) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        LinkedHashMap linkedHashMapN = r0.n(new Pair(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(zoomRatio)));
        if (Build.VERSION.SDK_INT >= 34 && CameraMetadata.INSTANCE.getSupportsZoomOverride(this.cameraProperties.getMetadata())) {
            Api34Compat.setSettingsOverrideZoom(linkedHashMapN);
        }
        return UseCaseCameraRequestControl.setParametersAsync$default(requestControl, linkedHashMapN, null, null, 6, null);
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    @NotNull
    public Rect getCropSensorRegion() {
        CameraMetadata metadata = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key SENSOR_INFO_ACTIVE_ARRAY_SIZE = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        Intrinsics.checkNotNullExpressionValue(SENSOR_INFO_ACTIVE_ARRAY_SIZE, "SENSOR_INFO_ACTIVE_ARRAY_SIZE");
        Object obj2 = metadata.get((CameraCharacteristics.Key<Object>) SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        Intrinsics.h(obj2);
        return (Rect) obj2;
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public float getMaxZoomRatio() {
        Object upper = this.range.getUpper();
        Intrinsics.checkNotNullExpressionValue(upper, "getUpper(...)");
        return ((Number) upper).floatValue();
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public float getMinZoomRatio() {
        Object lower = this.range.getLower();
        Intrinsics.checkNotNullExpressionValue(lower, "getLower(...)");
        return ((Number) lower).floatValue();
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    @NotNull
    public g0 resetAsync(@NotNull UseCaseCameraRequestControl requestControl) {
        Intrinsics.checkNotNullParameter(requestControl, "requestControl");
        CaptureRequest.Key CONTROL_ZOOM_RATIO = CaptureRequest.CONTROL_ZOOM_RATIO;
        Intrinsics.checkNotNullExpressionValue(CONTROL_ZOOM_RATIO, "CONTROL_ZOOM_RATIO");
        ArrayList arrayListN = v.n(CONTROL_ZOOM_RATIO);
        if (Build.VERSION.SDK_INT >= 34) {
            CaptureRequest.Key CONTROL_SETTINGS_OVERRIDE = CaptureRequest.CONTROL_SETTINGS_OVERRIDE;
            Intrinsics.checkNotNullExpressionValue(CONTROL_SETTINGS_OVERRIDE, "CONTROL_SETTINGS_OVERRIDE");
            arrayListN.add(CONTROL_SETTINGS_OVERRIDE);
        }
        return UseCaseCameraRequestControl.removeParametersAsync$default(requestControl, arrayListN, null, 2, null);
    }
}
