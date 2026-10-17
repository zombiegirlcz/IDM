package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.config.CameraAppComponent;
import androidx.camera.camera2.config.CameraConfig;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.pipe.CameraDevices;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.DoNotDisturbException;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.InitializationException;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.internal.StreamSpecsCalculator;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/internal/CameraSelectionOptimizer;", "", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CameraSelectionOptimizer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/camera/camera2/internal/CameraSelectionOptimizer$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraDevices;", "cameraDevices", "", "lensFacingInteger", "", "decideSkippedCameraIdByHeuristic", "(Landroidx/camera/camera2/pipe/CameraDevices;Ljava/lang/Integer;)Ljava/lang/String;", "Landroidx/camera/camera2/config/CameraAppComponent;", "cameraAppComponent", "Landroidx/camera/core/CameraSelector;", "availableCamerasSelector", "", "cameraIdList", "Landroidx/camera/core/internal/StreamSpecsCalculator;", "streamSpecsCalculator", "getSelectedAvailableCameraIds", "(Landroidx/camera/camera2/config/CameraAppComponent;Landroidx/camera/core/CameraSelector;Ljava/util/List;Landroidx/camera/core/internal/StreamSpecsCalculator;)Ljava/util/List;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String decideSkippedCameraIdByHeuristic(CameraDevices cameraDevices, Integer lensFacingInteger) {
            if (lensFacingInteger == null) {
                return null;
            }
            try {
                if (lensFacingInteger.intValue() == 1) {
                    CameraMetadata cameraMetadataM122awaitCameraMetadataFpsL5FU$default = CameraDevices.m122awaitCameraMetadataFpsL5FU$default(cameraDevices, CameraId.m182constructorimpl("0"), null, 2, null);
                    if (cameraMetadataM122awaitCameraMetadataFpsL5FU$default == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    CameraCharacteristics.Key LENS_FACING = CameraCharacteristics.LENS_FACING;
                    Intrinsics.checkNotNullExpressionValue(LENS_FACING, "LENS_FACING");
                    Integer num = (Integer) cameraMetadataM122awaitCameraMetadataFpsL5FU$default.get(LENS_FACING);
                    if (num != null && num.intValue() == 1) {
                        return "1";
                    }
                } else if (lensFacingInteger.intValue() == 0) {
                    CameraMetadata cameraMetadataM122awaitCameraMetadataFpsL5FU$default2 = CameraDevices.m122awaitCameraMetadataFpsL5FU$default(cameraDevices, CameraId.m182constructorimpl("1"), null, 2, null);
                    if (cameraMetadataM122awaitCameraMetadataFpsL5FU$default2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    CameraCharacteristics.Key LENS_FACING2 = CameraCharacteristics.LENS_FACING;
                    Intrinsics.checkNotNullExpressionValue(LENS_FACING2, "LENS_FACING");
                    Integer num2 = (Integer) cameraMetadataM122awaitCameraMetadataFpsL5FU$default2.get(LENS_FACING2);
                    if (num2 != null && num2.intValue() == 0) {
                        return "0";
                    }
                }
            } catch (DoNotDisturbException unused) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isErrorEnabled("CXCP")) {
                    String unused2 = Camera2Logger.TRUNCATED_TAG;
                }
            }
            return null;
        }

        @NotNull
        public final List<String> getSelectedAvailableCameraIds(@NotNull CameraAppComponent cameraAppComponent, CameraSelector availableCamerasSelector, @NotNull List<String> cameraIdList, @NotNull StreamSpecsCalculator streamSpecsCalculator) {
            String strDecideSkippedCameraIdByHeuristic;
            Intrinsics.checkNotNullParameter(cameraAppComponent, "cameraAppComponent");
            Intrinsics.checkNotNullParameter(cameraIdList, "cameraIdList");
            Intrinsics.checkNotNullParameter(streamSpecsCalculator, "streamSpecsCalculator");
            try {
                ArrayList arrayList = new ArrayList();
                CameraDevices cameraDevices = cameraAppComponent.getCameraDevices();
                if (availableCamerasSelector == null) {
                    return cameraIdList;
                }
                try {
                    strDecideSkippedCameraIdByHeuristic = decideSkippedCameraIdByHeuristic(cameraDevices, availableCamerasSelector.getLensFacing());
                } catch (IllegalStateException e) {
                    Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                    if (Logger.isDebugEnabled("CXCP")) {
                        String unused = Camera2Logger.TRUNCATED_TAG;
                    }
                    strDecideSkippedCameraIdByHeuristic = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : cameraIdList) {
                    if (!Intrinsics.f(str, strDecideSkippedCameraIdByHeuristic)) {
                        CameraInfoInternal cameraInfoInternal = cameraAppComponent.cameraBuilder().config(new CameraConfig(CameraId.m182constructorimpl(str), null)).streamSpecsCalculator(streamSpecsCalculator).build().getCameraInternal().getCameraInfoInternal();
                        Intrinsics.checkNotNullExpressionValue(cameraInfoInternal, "getCameraInfoInternal(...)");
                        arrayList2.add(cameraInfoInternal);
                    }
                }
                List<CameraInfo> listFilter = availableCamerasSelector.filter(arrayList2);
                Intrinsics.checkNotNullExpressionValue(listFilter, "filter(...)");
                for (CameraInfo cameraInfo : listFilter) {
                    Intrinsics.i(cameraInfo, "null cannot be cast to non-null type androidx.camera.core.impl.CameraInfoInternal");
                    String cameraId = ((CameraInfoInternal) cameraInfo).getCameraId();
                    Intrinsics.checkNotNullExpressionValue(cameraId, "getCameraId(...)");
                    arrayList.add(cameraId);
                }
                return arrayList;
            } catch (IllegalStateException e2) {
                Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
                if (Logger.isErrorEnabled("CXCP")) {
                    String unused2 = Camera2Logger.TRUNCATED_TAG;
                }
                throw new InitializationException(e2);
            }
        }

        private Companion() {
        }
    }
}
