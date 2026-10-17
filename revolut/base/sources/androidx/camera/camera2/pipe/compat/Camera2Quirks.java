package androidx.camera.camera2.pipe.compat;

import android.os.Build;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.StrictMode;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import zhm.q0;
import zhm.r0;
import zhm.y0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0015\u0010\u0011J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0002\b\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2Quirks;", "", "metadataProvider", "Landroidx/camera/camera2/pipe/compat/Camera2MetadataProvider;", "strictMode", "Landroidx/camera/camera2/pipe/StrictMode;", "<init>", "(Landroidx/camera/camera2/pipe/compat/Camera2MetadataProvider;Landroidx/camera/camera2/pipe/StrictMode;)V", "shouldWaitForRepeatingRequestStartOnDisconnect", "", "graphConfig", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "shouldWaitForRepeatingRequestStartOnDisconnect$camera_camera2_pipe", "shouldCreateEmptyCaptureSessionBeforeClosing", "cameraId", "Landroidx/camera/camera2/pipe/CameraId;", "shouldCreateEmptyCaptureSessionBeforeClosing-EfqyGwQ$camera_camera2_pipe", "(Ljava/lang/String;)Z", "shouldWaitForCameraDeviceOnClosed", "shouldWaitForCameraDeviceOnClosed-EfqyGwQ$camera_camera2_pipe", "shouldCloseCameraBeforeCreatingCaptureSession", "shouldCloseCameraBeforeCreatingCaptureSession-EfqyGwQ$camera_camera2_pipe", "getRepeatingRequestFrameCountForCapture", "", "graphConfigFlags", "Landroidx/camera/camera2/pipe/CameraGraph$Flags;", "getRepeatingRequestFrameCountForCapture$camera_camera2_pipe", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2Quirks {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Map<String, Set<String>> SHOULD_WAIT_FOR_REPEATING_DEVICE_MAP;

    @NotNull
    private static final Map<String, Set<String>> SM8150_DEVICES;

    @NotNull
    private final Camera2MetadataProvider metadataProvider;

    @NotNull
    private final StrictMode strictMode;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000bR \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2Quirks$Companion;", "", "<init>", "()V", "SHOULD_WAIT_FOR_REPEATING_DEVICE_MAP", "", "", "", "SM8150_DEVICES", "shouldCloseCaptureSessionOnDisconnect", "", "shouldCloseCaptureSessionOnDisconnect$camera_camera2_pipe", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean shouldCloseCaptureSessionOnDisconnect$camera_camera2_pipe() {
            int i = Build.VERSION.SDK_INT;
            String str = Build.HARDWARE;
            if (Intrinsics.f(str, "samsungexynos7870")) {
                return true;
            }
            if (!a0.z(str, "qcom", true) || i > 31) {
                Map map = Camera2Quirks.SM8150_DEVICES;
                String BRAND = Build.BRAND;
                Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                Locale locale = Locale.ROOT;
                String lowerCase = BRAND.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                Set set = (Set) map.get(lowerCase);
                if (set == null) {
                    return false;
                }
                String MODEL = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                String lowerCase2 = MODEL.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (!set.contains(lowerCase2)) {
                    return false;
                }
            }
            return true;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior.values().length];
            try {
                iArr[CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior.AT_LEAST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior.EXACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        String[] elements = {"oriole", "raven", "bluejay", "panther", "cheetah", "lynx"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        SHOULD_WAIT_FOR_REPEATING_DEVICE_MAP = q0.c(new Pair("Google", d.y0(elements)));
        String[] elements2 = {"pixel 4", "pixel 4 xl"};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        SM8150_DEVICES = r0.k(new Pair("google", d.y0(elements2)), new Pair("samsung", y0.b("sm-g770f")));
    }

    public Camera2Quirks(@NotNull Camera2MetadataProvider metadataProvider, @NotNull StrictMode strictMode) {
        Intrinsics.checkNotNullParameter(metadataProvider, "metadataProvider");
        Intrinsics.checkNotNullParameter(strictMode, "strictMode");
        this.metadataProvider = metadataProvider;
        this.strictMode = strictMode;
    }

    public final int getRepeatingRequestFrameCountForCapture$camera_camera2_pipe(@NotNull CameraGraph.Flags graphConfigFlags) {
        Intrinsics.checkNotNullParameter(graphConfigFlags, "graphConfigFlags");
        int iMax = 0;
        if (this.strictMode.getEnabled()) {
            return 0;
        }
        CameraGraph.RepeatingRequestRequirementsBeforeCapture awaitRepeatingRequestBeforeCapture = graphConfigFlags.getAwaitRepeatingRequestBeforeCapture();
        Set<String> set = SHOULD_WAIT_FOR_REPEATING_DEVICE_MAP.get(Build.MANUFACTURER);
        if (set != null && set.contains(Build.DEVICE) && Build.VERSION.SDK_INT < 34) {
            iMax = Math.max(0, 10);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[awaitRepeatingRequestBeforeCapture.getCompletionBehavior().ordinal()];
        if (i == 1) {
            return Math.max(iMax, awaitRepeatingRequestBeforeCapture.getRepeatingFramesToComplete());
        }
        if (i == 2) {
            return awaitRepeatingRequestBeforeCapture.getRepeatingFramesToComplete();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: shouldCloseCameraBeforeCreatingCaptureSession-EfqyGwQ$camera_camera2_pipe, reason: not valid java name */
    public final boolean m408x552c1673(@NotNull String cameraId) {
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        if (this.strictMode.getEnabled()) {
            return false;
        }
        return (Build.VERSION.SDK_INT <= 32 && CameraMetadata.INSTANCE.isHardwareLevelLegacy(this.metadataProvider.mo405awaitCameraMetadataEfqyGwQ(cameraId))) || ("motorola".equalsIgnoreCase(Build.BRAND) && "moto e20".equalsIgnoreCase(Build.MODEL) && Intrinsics.f(cameraId, "1"));
    }

    /* JADX INFO: renamed from: shouldCreateEmptyCaptureSessionBeforeClosing-EfqyGwQ$camera_camera2_pipe, reason: not valid java name */
    public final boolean m409xfcf3eba9(@NotNull String cameraId) {
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        return !this.strictMode.getEnabled() && Build.VERSION.SDK_INT < 29 && CameraMetadata.INSTANCE.isHardwareLevelLegacy(this.metadataProvider.mo405awaitCameraMetadataEfqyGwQ(cameraId));
    }

    /* JADX INFO: renamed from: shouldWaitForCameraDeviceOnClosed-EfqyGwQ$camera_camera2_pipe, reason: not valid java name */
    public final boolean m410shouldWaitForCameraDeviceOnClosedEfqyGwQ$camera_camera2_pipe(@NotNull String cameraId) {
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        if (this.strictMode.getEnabled()) {
            return false;
        }
        return CameraMetadata.INSTANCE.isHardwareLevelLegacy(this.metadataProvider.mo405awaitCameraMetadataEfqyGwQ(cameraId));
    }

    public final boolean shouldWaitForRepeatingRequestStartOnDisconnect$camera_camera2_pipe(@NotNull CameraGraph.Config graphConfig) {
        Intrinsics.checkNotNullParameter(graphConfig, "graphConfig");
        if (this.strictMode.getEnabled()) {
            return false;
        }
        Boolean awaitRepeatingRequestOnDisconnect = graphConfig.getFlags().getAwaitRepeatingRequestOnDisconnect();
        return awaitRepeatingRequestOnDisconnect != null ? awaitRepeatingRequestOnDisconnect.booleanValue() : CameraMetadata.INSTANCE.isHardwareLevelLegacy(this.metadataProvider.mo405awaitCameraMetadataEfqyGwQ(graphConfig.getCamera()));
    }
}
