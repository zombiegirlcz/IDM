package androidx.camera.viewfinder;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.viewfinder.CameraViewfinder;
import androidx.camera.viewfinder.ViewfinderSurfaceRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"populateFromCharacteristics", "Landroidx/camera/viewfinder/ViewfinderSurfaceRequest$Builder;", "cameraCharacteristics", "Landroid/hardware/camera2/CameraCharacteristics;", "camera-viewfinder_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ViewfinderSurfaceRequestUtil {
    @NotNull
    public static final ViewfinderSurfaceRequest.Builder populateFromCharacteristics(@NotNull ViewfinderSurfaceRequest.Builder builder, @NotNull CameraCharacteristics cameraCharacteristics) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(cameraCharacteristics, "cameraCharacteristics");
        Object obj2 = cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
        Intrinsics.h(obj2);
        builder.setLensFacing(((Number) obj2).intValue());
        Object obj3 = cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
        Intrinsics.h(obj3);
        builder.setSensorOrientation(((Number) obj3).intValue());
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null && num.intValue() == 2) {
            builder.setImplementationMode(CameraViewfinder.ImplementationMode.COMPATIBLE);
        }
        return builder;
    }
}
