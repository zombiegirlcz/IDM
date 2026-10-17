package androidx.camera.camera2.compat.workaround;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Range;
import androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.internal.ZoomMath;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.Logger;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/camera/camera2/pipe/CameraMetadata;", "Landroid/util/Range;", "", "getControlZoomRatioRangeSafely", "(Landroidx/camera/camera2/pipe/CameraMetadata;)Landroid/util/Range;", "Landroid/graphics/Rect;", "getActiveArraySizeSafely", "(Landroidx/camera/camera2/pipe/CameraMetadata;)Landroid/graphics/Rect;", "camera-camera2"}, k = 2, mv = {2, 1, 0}, xi = 48)
public abstract class CameraMetadataSafeGetterKt {
    @NotNull
    public static final Rect getActiveArraySizeSafely(@NotNull CameraMetadata cameraMetadata) {
        Intrinsics.checkNotNullParameter(cameraMetadata, "<this>");
        CameraCharacteristics.Key SENSOR_INFO_ACTIVE_ARRAY_SIZE = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        Intrinsics.checkNotNullExpressionValue(SENSOR_INFO_ACTIVE_ARRAY_SIZE, "SENSOR_INFO_ACTIVE_ARRAY_SIZE");
        Rect rect = (Rect) cameraMetadata.get(SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect != null) {
            return rect;
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isWarnEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
            String str = "Failed to read SENSOR_INFO_ACTIVE_ARRAY_SIZE for " + ((Object) CameraId.m186toStringimpl(cameraMetadata.mo191getCameraDz_R5H8())) + '!';
        }
        return new Rect(0, 0, 4000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
    }

    public static final Range<Float> getControlZoomRatioRangeSafely(@NotNull CameraMetadata cameraMetadata) {
        Float f;
        Float fValueOf = Float.valueOf(1.0f);
        Intrinsics.checkNotNullParameter(cameraMetadata, "<this>");
        try {
            CameraCharacteristics.Key CONTROL_ZOOM_RATIO_RANGE = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            Intrinsics.checkNotNullExpressionValue(CONTROL_ZOOM_RATIO_RANGE, "CONTROL_ZOOM_RATIO_RANGE");
            Range range = (Range) cameraMetadata.get(CONTROL_ZOOM_RATIO_RANGE);
            if (range == null) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isWarnEnabled("CXCP")) {
                    String unused = Camera2Logger.TRUNCATED_TAG;
                    String str = "Failed to read CONTROL_ZOOM_RATIO_RANGE for " + ((Object) CameraId.m186toStringimpl(cameraMetadata.mo191getCameraDz_R5H8())) + '!';
                }
                return new Range<>(fValueOf, fValueOf);
            }
            ZoomMath zoomMath = ZoomMath.INSTANCE;
            Object lower = range.getLower();
            Intrinsics.checkNotNullExpressionValue(lower, "getLower(...)");
            if (zoomMath.nearZero$camera_camera2(((Number) lower).floatValue()) || ((Number) range.getLower()).floatValue() < BitmapDescriptorFactory.HUE_RED) {
                Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
                if (Logger.isWarnEnabled("CXCP")) {
                    String unused2 = Camera2Logger.TRUNCATED_TAG;
                    String str2 = "Invalid lower zoom range detected: " + range.getLower();
                }
                f = fValueOf;
            } else {
                f = (Float) range.getLower();
            }
            Object upper = range.getUpper();
            Intrinsics.checkNotNullExpressionValue(upper, "getUpper(...)");
            if (zoomMath.nearZero$camera_camera2(((Number) upper).floatValue()) || ((Number) range.getUpper()).floatValue() < BitmapDescriptorFactory.HUE_RED) {
                Camera2Logger camera2Logger3 = Camera2Logger.INSTANCE;
                if (Logger.isWarnEnabled("CXCP")) {
                    String unused3 = Camera2Logger.TRUNCATED_TAG;
                    String str3 = "Invalid upper zoom range detected: " + range.getUpper();
                }
            } else {
                fValueOf = (Float) range.getUpper();
            }
            return new Range<>(f, fValueOf);
        } catch (AssertionError e) {
            if (DeviceQuirks.INSTANCE.get(ControlZoomRatioRangeAssertionErrorQuirk.class) != null) {
                Camera2Logger camera2Logger4 = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled("CXCP")) {
                    String unused4 = Camera2Logger.TRUNCATED_TAG;
                    String str4 = "Device is known to throw an exception while retrieving the value for CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE. CONTROL_ZOOM_RATIO_RANGE is not supported. [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "].";
                }
            } else {
                Camera2Logger camera2Logger5 = Camera2Logger.INSTANCE;
                if (Logger.isErrorEnabled("CXCP")) {
                    String unused5 = Camera2Logger.TRUNCATED_TAG;
                    String str5 = "Exception thrown while retrieving the value for CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE on devices not known to throw exceptions during this operation. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "]. CONTROL_ZOOM_RATIO_RANGE is not available.";
                }
            }
            if (!Logger.isWarnEnabled("CXCP")) {
                return null;
            }
            String unused6 = Camera2Logger.TRUNCATED_TAG;
            return null;
        }
    }
}
