package androidx.camera.camera2.pipe;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.compat.Api33Compat;
import androidx.camera.camera2.pipe.compat.Api34Compat;
import androidx.camera.camera2.pipe.compat.Api35Compat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!J&\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/CameraMetadata;", "Landroidx/camera/camera2/pipe/Metadata;", "Landroidx/camera/camera2/pipe/UnsafeWrapper;", "T", "Landroid/hardware/camera2/CameraCharacteristics$Key;", "key", "get", "(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;", "default", "getOrDefault", "(Landroid/hardware/camera2/CameraCharacteristics$Key;Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "awaitPhysicalMetadata-EfqyGwQ", "(Ljava/lang/String;)Landroidx/camera/camera2/pipe/CameraMetadata;", "awaitPhysicalMetadata", "", "extension", "Landroidx/camera/camera2/pipe/CameraExtensionMetadata;", "awaitExtensionMetadata", "(I)Landroidx/camera/camera2/pipe/CameraExtensionMetadata;", "getCamera-Dz_R5H8", "()Ljava/lang/String;", "camera", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "getSessionKeys", "()Ljava/util/Set;", "sessionKeys", "getPhysicalCameraIds", "physicalCameraIds", "getSupportedExtensions", "supportedExtensions", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface CameraMetadata extends Metadata, UnsafeWrapper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\b\u0010\tR&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\r\u0010\tR&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0007\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\tR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0015\u0010\u001d\u001a\u00020\u0013*\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u001f\u001a\u00020\u0013*\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0015\u0010!\u001a\u00020 *\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0015\u0010#\u001a\u00020 *\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0015\u0010$\u001a\u00020 *\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0015\u0010&\u001a\u00020 *\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b%\u0010\"R\u0015\u0010(\u001a\u00020 *\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b'\u0010\"R\u0015\u0010*\u001a\u00020 *\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b)\u0010\"R\u0015\u0010,\u001a\u00020 *\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b+\u0010\"R\u0015\u0010.\u001a\u00020 *\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b-\u0010\"R\u0015\u00100\u001a\u00020 *\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b/\u0010\"R\u0015\u00104\u001a\u000201*\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b2\u00103R\u0015\u00106\u001a\u000201*\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b5\u00103R\u0015\u00108\u001a\u00020 *\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b7\u0010\"R\u0015\u0010:\u001a\u00020 *\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b9\u0010\"¨\u0006;"}, d2 = {"Landroidx/camera/camera2/pipe/CameraMetadata$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/Metadata$Key;", "Landroidx/camera/camera2/pipe/CameraStreamConfigurationMap;", "CAMERA_STREAM_CONFIGURATION_MAP", "Landroidx/camera/camera2/pipe/Metadata$Key;", "getCAMERA_STREAM_CONFIGURATION_MAP", "()Landroidx/camera/camera2/pipe/Metadata$Key;", "getCAMERA_STREAM_CONFIGURATION_MAP$annotations", "Landroidx/camera/camera2/pipe/CameraMultiResolutionStreamConfigurationMap;", "CAMERA_MULTI_RESOLUTION_STREAM_CONFIGURATION_MAP", "getCAMERA_MULTI_RESOLUTION_STREAM_CONFIGURATION_MAP", "getCAMERA_MULTI_RESOLUTION_STREAM_CONFIGURATION_MAP$annotations", "Landroidx/camera/camera2/pipe/CameraColorSpaceProfiles;", "CAMERA_AVAILABLE_COLOR_SPACE_PROFILES", "getCAMERA_AVAILABLE_COLOR_SPACE_PROFILES", "getCAMERA_AVAILABLE_COLOR_SPACE_PROFILES$annotations", "", "EMPTY_INT_ARRAY", "[I", "getEMPTY_INT_ARRAY", "()[I", "setEMPTY_INT_ARRAY", "([I)V", "Landroidx/camera/camera2/pipe/CameraMetadata;", "getAvailableCapabilities", "(Landroidx/camera/camera2/pipe/CameraMetadata;)[I", "availableCapabilities", "getAvailableVideoStabilizationModes", "availableVideoStabilizationModes", "", "isHardwareLevelExternal", "(Landroidx/camera/camera2/pipe/CameraMetadata;)Z", "isHardwareLevelLegacy", "isHardwareLevelLimited", "getSupportsPrivateReprocessing", "supportsPrivateReprocessing", "getSupportsHighSpeedVideo", "supportsHighSpeedVideo", "getSupportsLogicalMultiCamera", "supportsLogicalMultiCamera", "getSupportsAutoFocusTrigger", "supportsAutoFocusTrigger", "getSupportsZoomOverride", "supportsZoomOverride", "getSupportsTorchStrength", "supportsTorchStrength", "", "getMaxTorchStrengthLevel", "(Landroidx/camera/camera2/pipe/CameraMetadata;)I", "maxTorchStrengthLevel", "getDefaultTorchStrengthLevel", "defaultTorchStrengthLevel", "getSupportsLowLightBoost", "supportsLowLightBoost", "getSupportsPreviewStabilization", "supportsPreviewStabilization", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final Metadata.Key<CameraColorSpaceProfiles> CAMERA_AVAILABLE_COLOR_SPACE_PROFILES;

        @NotNull
        private static final Metadata.Key<CameraMultiResolutionStreamConfigurationMap> CAMERA_MULTI_RESOLUTION_STREAM_CONFIGURATION_MAP;

        @NotNull
        private static final Metadata.Key<CameraStreamConfigurationMap> CAMERA_STREAM_CONFIGURATION_MAP;

        @NotNull
        private static int[] EMPTY_INT_ARRAY;

        static {
            Metadata.Key.Companion companion = Metadata.Key.INSTANCE;
            p0 p0Var = o0.f186429a;
            CAMERA_STREAM_CONFIGURATION_MAP = companion.create("androidx.camera.camera2.pipe.scalar.streamConfigurationMap", p0Var.b(CameraStreamConfigurationMap.class));
            CAMERA_MULTI_RESOLUTION_STREAM_CONFIGURATION_MAP = companion.create("androidx.camera.camera2.pipe.scalar.multiResolutionStreamConfigurationMap", p0Var.b(CameraMultiResolutionStreamConfigurationMap.class));
            CAMERA_AVAILABLE_COLOR_SPACE_PROFILES = companion.create("androidx.camera.camera2.pipe.request.availableColorSpaceProfilesMap", p0Var.b(CameraColorSpaceProfiles.class));
            EMPTY_INT_ARRAY = new int[0];
        }

        private Companion() {
        }

        @NotNull
        public final int[] getAvailableCapabilities(@NotNull CameraMetadata cameraMetadata) {
            Intrinsics.checkNotNullParameter(cameraMetadata, "<this>");
            CameraCharacteristics.Key REQUEST_AVAILABLE_CAPABILITIES = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
            Intrinsics.checkNotNullExpressionValue(REQUEST_AVAILABLE_CAPABILITIES, "REQUEST_AVAILABLE_CAPABILITIES");
            int[] iArr = (int[]) cameraMetadata.get(REQUEST_AVAILABLE_CAPABILITIES);
            return iArr == null ? EMPTY_INT_ARRAY : iArr;
        }

        @NotNull
        public final int[] getAvailableVideoStabilizationModes(@NotNull CameraMetadata cameraMetadata) {
            Intrinsics.checkNotNullParameter(cameraMetadata, "<this>");
            CameraCharacteristics.Key CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES = CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES;
            Intrinsics.checkNotNullExpressionValue(CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES, "CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES");
            int[] iArr = (int[]) cameraMetadata.get(CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
            return iArr == null ? EMPTY_INT_ARRAY : iArr;
        }

        public final int getDefaultTorchStrengthLevel(@NotNull CameraMetadata cameraMetadata) {
            Intrinsics.checkNotNullParameter(cameraMetadata, "<this>");
            if (Build.VERSION.SDK_INT >= 35) {
                return Api35Compat.getDefaultTorchStrengthLevel(cameraMetadata);
            }
            return 1;
        }

        public final int getMaxTorchStrengthLevel(@NotNull CameraMetadata cameraMetadata) {
            Intrinsics.checkNotNullParameter(cameraMetadata, "<this>");
            if (Build.VERSION.SDK_INT >= 35) {
                return Api35Compat.getMaxTorchStrengthLevel(cameraMetadata);
            }
            return 1;
        }

        public final boolean getSupportsAutoFocusTrigger(@NotNull CameraMetadata cameraMetadata) {
            Intrinsics.checkNotNullParameter(cameraMetadata, "<this>");
            CameraCharacteristics.Key LENS_INFO_MINIMUM_FOCUS_DISTANCE = CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE;
            Intrinsics.checkNotNullExpressionValue(LENS_INFO_MINIMUM_FOCUS_DISTANCE, "LENS_INFO_MINIMUM_FOCUS_DISTANCE");
            Float f = (Float) cameraMetadata.get(LENS_INFO_MINIMUM_FOCUS_DISTANCE);
            if (f != null) {
                return f.floatValue() > BitmapDescriptorFactory.HUE_RED;
            }
            CameraCharacteristics.Key CONTROL_AF_AVAILABLE_MODES = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
            Intrinsics.checkNotNullExpressionValue(CONTROL_AF_AVAILABLE_MODES, "CONTROL_AF_AVAILABLE_MODES");
            int[] iArr = (int[]) cameraMetadata.get(CONTROL_AF_AVAILABLE_MODES);
            if (iArr == null) {
                return false;
            }
            return d.G(iArr, 1) || d.G(iArr, 2) || d.G(iArr, 4) || d.G(iArr, 3);
        }

        public final boolean getSupportsHighSpeedVideo(@NotNull CameraMetadata cameraMetadata) {
            Intrinsics.checkNotNullParameter(cameraMetadata, "<this>");
            return d.G(getAvailableCapabilities(cameraMetadata), 9);
        }

        public final boolean getSupportsLogicalMultiCamera(@NotNull CameraMetadata cameraMetadata) {
            Intrinsics.checkNotNullParameter(cameraMetadata, "<this>");
            return d.G(getAvailableCapabilities(cameraMetadata), 11);
        }

        public final boolean getSupportsLowLightBoost(@NotNull CameraMetadata cameraMetadata) {
            Intrinsics.checkNotNullParameter(cameraMetadata, "<this>");
            CameraCharacteristics.Key CONTROL_AE_AVAILABLE_MODES = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
            Intrinsics.checkNotNullExpressionValue(CONTROL_AE_AVAILABLE_MODES, "CONTROL_AE_AVAILABLE_MODES");
            int[] iArr = (int[]) cameraMetadata.get(CONTROL_AE_AVAILABLE_MODES);
            if (iArr == null) {
                return false;
            }
            return d.G(iArr, 6);
        }

        public final boolean getSupportsPreviewStabilization(@NotNull CameraMetadata cameraMetadata) {
            Intrinsics.checkNotNullParameter(cameraMetadata, "<this>");
            if (Build.VERSION.SDK_INT >= 33) {
                return Api33Compat.INSTANCE.supportsPreviewStabilization(cameraMetadata);
            }
            return false;
        }

        public final boolean getSupportsPrivateReprocessing(@NotNull CameraMetadata cameraMetadata) {
            Intrinsics.checkNotNullParameter(cameraMetadata, "<this>");
            return d.G(getAvailableCapabilities(cameraMetadata), 4);
        }

        public final boolean getSupportsTorchStrength(@NotNull CameraMetadata cameraMetadata) {
            Intrinsics.checkNotNullParameter(cameraMetadata, "<this>");
            return Build.VERSION.SDK_INT >= 35 && Api35Compat.isTorchStrengthSupported(cameraMetadata);
        }

        public final boolean getSupportsZoomOverride(@NotNull CameraMetadata cameraMetadata) {
            Intrinsics.checkNotNullParameter(cameraMetadata, "<this>");
            return Build.VERSION.SDK_INT >= 34 && Api34Compat.isZoomOverrideSupported(cameraMetadata);
        }

        public final boolean isHardwareLevelExternal(@NotNull CameraMetadata cameraMetadata) {
            Intrinsics.checkNotNullParameter(cameraMetadata, "<this>");
            CameraCharacteristics.Key INFO_SUPPORTED_HARDWARE_LEVEL = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
            Intrinsics.checkNotNullExpressionValue(INFO_SUPPORTED_HARDWARE_LEVEL, "INFO_SUPPORTED_HARDWARE_LEVEL");
            Integer num = (Integer) cameraMetadata.get(INFO_SUPPORTED_HARDWARE_LEVEL);
            return num != null && num.intValue() == 4;
        }

        public final boolean isHardwareLevelLegacy(@NotNull CameraMetadata cameraMetadata) {
            Intrinsics.checkNotNullParameter(cameraMetadata, "<this>");
            CameraCharacteristics.Key INFO_SUPPORTED_HARDWARE_LEVEL = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
            Intrinsics.checkNotNullExpressionValue(INFO_SUPPORTED_HARDWARE_LEVEL, "INFO_SUPPORTED_HARDWARE_LEVEL");
            Integer num = (Integer) cameraMetadata.get(INFO_SUPPORTED_HARDWARE_LEVEL);
            return num != null && num.intValue() == 2;
        }

        public final boolean isHardwareLevelLimited(@NotNull CameraMetadata cameraMetadata) {
            Intrinsics.checkNotNullParameter(cameraMetadata, "<this>");
            CameraCharacteristics.Key INFO_SUPPORTED_HARDWARE_LEVEL = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
            Intrinsics.checkNotNullExpressionValue(INFO_SUPPORTED_HARDWARE_LEVEL, "INFO_SUPPORTED_HARDWARE_LEVEL");
            Integer num = (Integer) cameraMetadata.get(INFO_SUPPORTED_HARDWARE_LEVEL);
            return num != null && num.intValue() == 0;
        }
    }

    @NotNull
    CameraExtensionMetadata awaitExtensionMetadata(int extension);

    @NotNull
    /* JADX INFO: renamed from: awaitPhysicalMetadata-EfqyGwQ, reason: not valid java name */
    CameraMetadata mo190awaitPhysicalMetadataEfqyGwQ(@NotNull String cameraId);

    <T> T get(@NotNull CameraCharacteristics.Key<T> key);

    @NotNull
    /* JADX INFO: renamed from: getCamera-Dz_R5H8, reason: not valid java name */
    String mo191getCameraDz_R5H8();

    <T> T getOrDefault(@NotNull CameraCharacteristics.Key<T> key, T t2);

    @NotNull
    Set<CameraId> getPhysicalCameraIds();

    @NotNull
    Set<CaptureRequest.Key<?>> getSessionKeys();

    @NotNull
    Set<Integer> getSupportedExtensions();
}
