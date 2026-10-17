package androidx.camera.camera2.internal;

import androidx.camera.camera2.pipe.CameraMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/internal/IntrinsicZoomCalculator;", "", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "", "calculateIntrinsicZoomRatio", "(Landroidx/camera/camera2/pipe/CameraMetadata;)Ljava/lang/Float;", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IntrinsicZoomCalculator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/camera/camera2/internal/IntrinsicZoomCalculator$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/internal/IntrinsicZoomCalculator;", "NO_OP_INTRINSIC_ZOOM_CALCULATOR", "Landroidx/camera/camera2/internal/IntrinsicZoomCalculator;", "getNO_OP_INTRINSIC_ZOOM_CALCULATOR", "()Landroidx/camera/camera2/internal/IntrinsicZoomCalculator;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final IntrinsicZoomCalculator NO_OP_INTRINSIC_ZOOM_CALCULATOR = new IntrinsicZoomCalculator() { // from class: androidx.camera.camera2.internal.IntrinsicZoomCalculator$Companion$NO_OP_INTRINSIC_ZOOM_CALCULATOR$1
            @Override // androidx.camera.camera2.internal.IntrinsicZoomCalculator
            public Float calculateIntrinsicZoomRatio(CameraMetadata cameraMetadata) {
                Intrinsics.checkNotNullParameter(cameraMetadata, "cameraMetadata");
                return Float.valueOf(1.0f);
            }
        };

        private Companion() {
        }
    }

    Float calculateIntrinsicZoomRatio(@NotNull CameraMetadata cameraMetadata);
}
