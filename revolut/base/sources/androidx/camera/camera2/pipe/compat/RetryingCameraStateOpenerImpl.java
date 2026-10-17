package androidx.camera.camera2.pipe.compat;

import android.os.Build;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.core.DurationNs;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.TimeSource;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001%BK\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010#J\b\u0010$\u001a\u00020\u001cH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Landroidx/camera/camera2/pipe/compat/RetryingCameraStateOpenerImpl;", "Landroidx/camera/camera2/pipe/compat/RetryingCameraStateOpener;", "cameraStateOpener", "Landroidx/camera/camera2/pipe/compat/CameraStateOpener;", "cameraErrorListener", "Landroidx/camera/camera2/pipe/internal/CameraErrorListener;", "cameraAvailabilityMonitor", "Landroidx/camera/camera2/pipe/compat/CameraAvailabilityMonitor;", "timeSource", "Landroidx/camera/camera2/pipe/core/TimeSource;", "devicePolicyManager", "Landroidx/camera/camera2/pipe/compat/DevicePolicyManagerWrapper;", "audioRestrictionController", "Landroidx/camera/camera2/pipe/compat/AudioRestrictionController;", "cameraInteropConfig", "Landroidx/camera/camera2/pipe/CameraPipe$CameraInteropConfig;", "threads", "Landroidx/camera/camera2/pipe/core/Threads;", "<init>", "(Landroidx/camera/camera2/pipe/compat/CameraStateOpener;Landroidx/camera/camera2/pipe/internal/CameraErrorListener;Landroidx/camera/camera2/pipe/compat/CameraAvailabilityMonitor;Landroidx/camera/camera2/pipe/core/TimeSource;Landroidx/camera/camera2/pipe/compat/DevicePolicyManagerWrapper;Landroidx/camera/camera2/pipe/compat/AudioRestrictionController;Landroidx/camera/camera2/pipe/CameraPipe$CameraInteropConfig;Landroidx/camera/camera2/pipe/core/Threads;)V", "openCameraWithRetry", "Landroidx/camera/camera2/pipe/compat/OpenCameraResult;", "cameraId", "Landroidx/camera/camera2/pipe/CameraId;", "camera2DeviceCloser", "Landroidx/camera/camera2/pipe/compat/Camera2DeviceCloser;", "isForegroundObserver", "Lkotlin/Function1;", "", "", "openCameraWithRetry-aeCOTgg", "(Ljava/lang/String;Landroidx/camera/camera2/pipe/compat/Camera2DeviceCloser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openAndAwaitCameraWithRetry", "Landroidx/camera/camera2/pipe/compat/AwaitOpenCameraResult;", "openAndAwaitCameraWithRetry-0r8Bogc", "(Ljava/lang/String;Landroidx/camera/camera2/pipe/compat/Camera2DeviceCloser;)Landroidx/camera/camera2/pipe/compat/AwaitOpenCameraResult;", "cancelOpen", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RetryingCameraStateOpenerImpl implements RetryingCameraStateOpener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AudioRestrictionController audioRestrictionController;

    @NotNull
    private final CameraAvailabilityMonitor cameraAvailabilityMonitor;

    @NotNull
    private final CameraErrorListener cameraErrorListener;
    private final CameraPipe.CameraInteropConfig cameraInteropConfig;

    @NotNull
    private final CameraStateOpener cameraStateOpener;

    @NotNull
    private final DevicePolicyManagerWrapper devicePolicyManager;

    @NotNull
    private final Threads threads;

    @NotNull
    private final TimeSource timeSource;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroidx/camera/camera2/pipe/compat/RetryingCameraStateOpenerImpl$Companion;", "", "<init>", "()V", "shouldRetry", "", "errorCode", "Landroidx/camera/camera2/pipe/CameraError;", "attempts", "", "elapsedNs", "Landroidx/camera/camera2/pipe/core/DurationNs;", "camerasDisabledByDevicePolicy", "isForeground", "cameraOpenRetryMaxTimeoutNs", "shouldRetry-rbpwgO0$camera_camera2_pipe", "(IIJZZLandroidx/camera/camera2/pipe/core/DurationNs;)Z", "shouldActivateActiveResume", "shouldActivateActiveResume-8PWMtlg$camera_camera2_pipe", "(ZI)Z", "getRetryTimeoutNs", "activeResumeActivated", "getRetryTimeoutNs-om-7c1s$camera_camera2_pipe", "(ZLandroidx/camera/camera2/pipe/core/DurationNs;)J", "getRetryDelayMs", "", "getRetryDelayMs-t8DbYm4$camera_camera2_pipe", "(JZ)J", "min", "d1", "d2", "min-L1EDjxI", "(JLandroidx/camera/camera2/pipe/core/DurationNs;)J", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: min-L1EDjxI, reason: not valid java name */
        private final long m425minL1EDjxI(long d15, DurationNs d210) {
            return (d210 == null || DurationNs.m435compareTozYRVrok(d15, d210.getValue()) == -1) ? d15 : d210.getValue();
        }

        /* JADX INFO: renamed from: getRetryDelayMs-t8DbYm4$camera_camera2_pipe, reason: not valid java name */
        public final long m426getRetryDelayMst8DbYm4$camera_camera2_pipe(long elapsedNs, boolean activeResumeActivated) {
            if (activeResumeActivated && DurationNs.m435compareTozYRVrok(elapsedNs, RetryingCameraStateOpenerKt.activeResumeCameraRetryThresholds[0].getValue()) >= 0) {
                return DurationNs.m435compareTozYRVrok(elapsedNs, RetryingCameraStateOpenerKt.activeResumeCameraRetryThresholds[1].getValue()) < 0 ? 2000L : 4000L;
            }
            return 500L;
        }

        /* JADX INFO: renamed from: getRetryTimeoutNs-om-7c1s$camera_camera2_pipe, reason: not valid java name */
        public final long m427getRetryTimeoutNsom7c1s$camera_camera2_pipe(boolean activeResumeActivated, DurationNs cameraOpenRetryMaxTimeoutNs) {
            return !activeResumeActivated ? m425minL1EDjxI(RetryingCameraStateOpenerKt.defaultCameraRetryTimeoutNs, cameraOpenRetryMaxTimeoutNs) : m425minL1EDjxI(RetryingCameraStateOpenerKt.activeResumeCameraRetryTimeoutNs, cameraOpenRetryMaxTimeoutNs);
        }

        /* JADX INFO: renamed from: shouldActivateActiveResume-8PWMtlg$camera_camera2_pipe, reason: not valid java name */
        public final boolean m428shouldActivateActiveResume8PWMtlg$camera_camera2_pipe(boolean isForeground, int errorCode) {
            int i;
            if (!isForeground || 29 > (i = Build.VERSION.SDK_INT) || i >= 33) {
                return false;
            }
            CameraError.Companion companion = CameraError.INSTANCE;
            return CameraError.m132equalsimpl0(errorCode, companion.m143getERROR_CAMERA_IN_USEv7Vf74A()) || CameraError.m132equalsimpl0(errorCode, companion.m144getERROR_CAMERA_LIMIT_EXCEEDEDv7Vf74A()) || CameraError.m132equalsimpl0(errorCode, companion.m142getERROR_CAMERA_DISCONNECTEDv7Vf74A());
        }

        /* JADX INFO: renamed from: shouldRetry-rbpwgO0$camera_camera2_pipe, reason: not valid java name */
        public final boolean m429shouldRetryrbpwgO0$camera_camera2_pipe(int errorCode, int attempts, long elapsedNs, boolean camerasDisabledByDevicePolicy, boolean isForeground, DurationNs cameraOpenRetryMaxTimeoutNs) {
            boolean zM428shouldActivateActiveResume8PWMtlg$camera_camera2_pipe = m428shouldActivateActiveResume8PWMtlg$camera_camera2_pipe(isForeground, errorCode);
            if (!zM428shouldActivateActiveResume8PWMtlg$camera_camera2_pipe || Log.INSTANCE.getDEBUG_LOGGABLE()) {
            }
            if (DurationNs.m435compareTozYRVrok(elapsedNs, m427getRetryTimeoutNsom7c1s$camera_camera2_pipe(zM428shouldActivateActiveResume8PWMtlg$camera_camera2_pipe, cameraOpenRetryMaxTimeoutNs)) > 0) {
                return false;
            }
            CameraError.Companion companion = CameraError.INSTANCE;
            if (CameraError.m132equalsimpl0(errorCode, companion.m152getERROR_UNDETERMINEDv7Vf74A())) {
                return attempts <= 1;
            }
            if (CameraError.m132equalsimpl0(errorCode, companion.m143getERROR_CAMERA_IN_USEv7Vf74A())) {
                return Build.VERSION.SDK_INT >= 29 || attempts <= 1;
            }
            if (CameraError.m132equalsimpl0(errorCode, companion.m144getERROR_CAMERA_LIMIT_EXCEEDEDv7Vf74A())) {
                return true;
            }
            if (CameraError.m132equalsimpl0(errorCode, companion.m141getERROR_CAMERA_DISABLEDv7Vf74A())) {
                return !camerasDisabledByDevicePolicy || attempts <= 1;
            }
            if (CameraError.m132equalsimpl0(errorCode, companion.m140getERROR_CAMERA_DEVICEv7Vf74A()) || CameraError.m132equalsimpl0(errorCode, companion.m147getERROR_CAMERA_SERVICEv7Vf74A()) || CameraError.m132equalsimpl0(errorCode, companion.m142getERROR_CAMERA_DISCONNECTEDv7Vf74A()) || CameraError.m132equalsimpl0(errorCode, companion.m150getERROR_ILLEGAL_ARGUMENT_EXCEPTIONv7Vf74A())) {
                return true;
            }
            if (CameraError.m132equalsimpl0(errorCode, companion.m151getERROR_SECURITY_EXCEPTIONv7Vf74A())) {
                return attempts <= 1;
            }
            if (CameraError.m132equalsimpl0(errorCode, companion.m148getERROR_DO_NOT_DISTURB_ENABLEDv7Vf74A())) {
                return false;
            }
            if (CameraError.m132equalsimpl0(errorCode, companion.m153getERROR_UNKNOWN_EXCEPTIONv7Vf74A())) {
                return attempts <= 1;
            }
            if (Log.INSTANCE.getERROR_LOGGABLE()) {
                String str = "Unexpected CameraError: " + RetryingCameraStateOpenerImpl.INSTANCE;
            }
            return false;
        }

        private Companion() {
        }
    }

    public RetryingCameraStateOpenerImpl(@NotNull CameraStateOpener cameraStateOpener, @NotNull CameraErrorListener cameraErrorListener, @NotNull CameraAvailabilityMonitor cameraAvailabilityMonitor, @NotNull TimeSource timeSource, @NotNull DevicePolicyManagerWrapper devicePolicyManager, @NotNull AudioRestrictionController audioRestrictionController, CameraPipe.CameraInteropConfig cameraInteropConfig, @NotNull Threads threads) {
        Intrinsics.checkNotNullParameter(cameraStateOpener, "cameraStateOpener");
        Intrinsics.checkNotNullParameter(cameraErrorListener, "cameraErrorListener");
        Intrinsics.checkNotNullParameter(cameraAvailabilityMonitor, "cameraAvailabilityMonitor");
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        Intrinsics.checkNotNullParameter(devicePolicyManager, "devicePolicyManager");
        Intrinsics.checkNotNullParameter(audioRestrictionController, "audioRestrictionController");
        Intrinsics.checkNotNullParameter(threads, "threads");
        this.cameraStateOpener = cameraStateOpener;
        this.cameraErrorListener = cameraErrorListener;
        this.cameraAvailabilityMonitor = cameraAvailabilityMonitor;
        this.timeSource = timeSource;
        this.devicePolicyManager = devicePolicyManager;
        this.audioRestrictionController = audioRestrictionController;
        this.cameraInteropConfig = cameraInteropConfig;
        this.threads = threads;
    }

    @Override // androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener
    public void cancelOpen() {
        this.cameraStateOpener.cancelOpen$camera_camera2_pipe();
    }

    @Override // androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener
    @NotNull
    /* JADX INFO: renamed from: openAndAwaitCameraWithRetry-0r8Bogc */
    public AwaitOpenCameraResult mo423openAndAwaitCameraWithRetry0r8Bogc(@NotNull String cameraId, @NotNull Camera2DeviceCloser camera2DeviceCloser) {
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        Intrinsics.checkNotNullParameter(camera2DeviceCloser, "camera2DeviceCloser");
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            String str = this + "#openAndAwaitCameraWithRetry(" + ((Object) CameraId.m186toStringimpl(cameraId)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return (AwaitOpenCameraResult) e0.E(this.threads.getBlockingDispatcher(), new RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2(this, cameraId, camera2DeviceCloser, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0249, code lost:
    
        if (r6 == r4) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0125 A[Catch: all -> 0x005b, TRY_ENTER, TryCatch #1 {all -> 0x005b, blocks: (B:14:0x004b, B:69:0x024c, B:71:0x0254, B:73:0x025c, B:35:0x010b, B:40:0x0125, B:42:0x012b, B:47:0x013a, B:49:0x015c, B:52:0x0168, B:54:0x0174, B:58:0x017e, B:60:0x018d, B:62:0x0195, B:66:0x021f, B:22:0x0081), top: B:83:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018d A[Catch: all -> 0x005b, TryCatch #1 {all -> 0x005b, blocks: (B:14:0x004b, B:69:0x024c, B:71:0x0254, B:73:0x025c, B:35:0x010b, B:40:0x0125, B:42:0x012b, B:47:0x013a, B:49:0x015c, B:52:0x0168, B:54:0x0174, B:58:0x017e, B:60:0x018d, B:62:0x0195, B:66:0x021f, B:22:0x0081), top: B:83:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0249 -> B:16:0x0051). Please report as a decompilation issue!!! */
    @Override // androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener
    /* JADX INFO: renamed from: openCameraWithRetry-aeCOTgg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo424openCameraWithRetryaeCOTgg(@org.jetbrains.annotations.NotNull java.lang.String r32, @org.jetbrains.annotations.NotNull androidx.camera.camera2.pipe.compat.Camera2DeviceCloser r33, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.Unit, java.lang.Boolean> r34, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.OpenCameraResult> r35) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl.mo424openCameraWithRetryaeCOTgg(java.lang.String, androidx.camera.camera2.pipe.compat.Camera2DeviceCloser, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
