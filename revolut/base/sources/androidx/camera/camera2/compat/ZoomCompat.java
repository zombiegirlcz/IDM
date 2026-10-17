package androidx.camera.camera2.compat;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Range;
import androidx.camera.camera2.compat.workaround.CameraMetadataSafeGetterKt;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.Logger;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.g0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\u0001\u0014J%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/compat/ZoomCompat;", "", "", "zoomRatio", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "requestControl", "Lskm/g0;", "", "applyAsync", "(FLandroidx/camera/camera2/impl/UseCaseCameraRequestControl;)Lskm/g0;", "resetAsync", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)Lskm/g0;", "Landroid/graphics/Rect;", "getCropSensorRegion", "()Landroid/graphics/Rect;", "getMinZoomRatio", "()F", "minZoomRatio", "getMaxZoomRatio", "maxZoomRatio", "Bindings", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ZoomCompat {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/ZoomCompat$Bindings;", "", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Bindings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Landroidx/camera/camera2/compat/ZoomCompat$Bindings$Companion;", "", "<init>", "()V", "provideZoomCompat", "Landroidx/camera/camera2/compat/ZoomCompat;", "cameraProperties", "Landroidx/camera/camera2/impl/CameraProperties;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ZoomCompat provideZoomCompat(@NotNull CameraProperties cameraProperties) {
                Range<Float> controlZoomRatioRangeSafely;
                Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
                if ("robolectric".equals(Build.FINGERPRINT)) {
                    List<CameraCharacteristics.Key<Rect>> requiredCharacteristics = NoOpZoomCompat.INSTANCE.getRequiredCharacteristics();
                    if (!(requiredCharacteristics instanceof Collection) || !requiredCharacteristics.isEmpty()) {
                        Iterator<T> it8 = requiredCharacteristics.iterator();
                        while (it8.hasNext()) {
                            CameraCharacteristics.Key key = (CameraCharacteristics.Key) it8.next();
                            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                            if (Logger.isWarnEnabled("CXCP")) {
                                String unused = Camera2Logger.TRUNCATED_TAG;
                                String str = "Failed to read " + key + " for zoom features.";
                            }
                            CameraMetadata metadata = cameraProperties.getMetadata();
                            Intrinsics.h(key);
                            if (metadata.get(key) == null) {
                                return new NoOpZoomCompat(cameraProperties);
                            }
                        }
                    }
                } else if (Build.VERSION.SDK_INT >= 30 && (controlZoomRatioRangeSafely = CameraMetadataSafeGetterKt.getControlZoomRatioRangeSafely(cameraProperties.getMetadata())) != null) {
                    return new AndroidRZoomCompat(cameraProperties, controlZoomRatioRangeSafely);
                }
                return new CropRegionZoomCompat(cameraProperties);
            }

            private Companion() {
            }
        }
    }

    @NotNull
    g0 applyAsync(float zoomRatio, @NotNull UseCaseCameraRequestControl requestControl);

    @NotNull
    Rect getCropSensorRegion();

    float getMaxZoomRatio();

    float getMinZoomRatio();

    @NotNull
    g0 resetAsync(@NotNull UseCaseCameraRequestControl requestControl);
}
