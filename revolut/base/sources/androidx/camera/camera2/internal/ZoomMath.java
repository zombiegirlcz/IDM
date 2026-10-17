package androidx.camera.camera2.internal;

import androidx.core.math.MathUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/camera/camera2/internal/ZoomMath;", "", "<init>", "()V", "", "num1", "num2", "", "areFloatsEqual", "(FF)Z", "linearZoom", "minZoomRatio", "maxZoomRatio", "getZoomRatioFromLinearZoom", "(FFF)F", "num", "nearZero$camera_camera2", "(F)Z", "nearZero", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ZoomMath {

    @NotNull
    public static final ZoomMath INSTANCE = new ZoomMath();

    private ZoomMath() {
    }

    private final boolean areFloatsEqual(float num1, float num2) {
        return nearZero$camera_camera2(num1 - num2);
    }

    public final float getZoomRatioFromLinearZoom(float linearZoom, float minZoomRatio, float maxZoomRatio) {
        if (areFloatsEqual(linearZoom, 1.0f)) {
            return maxZoomRatio;
        }
        if (areFloatsEqual(linearZoom, BitmapDescriptorFactory.HUE_RED)) {
            return minZoomRatio;
        }
        float f = 1.0f / minZoomRatio;
        return MathUtils.clamp(1.0f / (f - ((f - (1.0f / maxZoomRatio)) * linearZoom)), minZoomRatio, maxZoomRatio);
    }

    public final boolean nearZero$camera_camera2(float num) {
        return ((double) Math.abs(num)) < ((double) Math.ulp(Math.abs(num))) * 2.0d;
    }
}
