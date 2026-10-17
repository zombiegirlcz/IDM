package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Trace;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraInterop;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.Timestamps;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import rkm.b;
import rkm.h;
import v1.c;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0016*\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J%\u0010\u001e\u001a\u00020\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0011\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b\"\u0010#J-\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0011\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010'J%\u0010(\u001a\u00020\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0011\u001a\u00020\u001dH\u0016¢\u0006\u0004\b(\u0010\u001fJ%\u0010+\u001a\u00020\u00132\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u001a2\u0006\u0010\u0011\u001a\u00020\u001dH\u0017¢\u0006\u0004\b+\u0010\u001fJ-\u0010.\u001a\u00020\u00132\u0006\u0010-\u001a\u00020,2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020)0\u001a2\u0006\u0010\u0011\u001a\u00020\u001dH\u0017¢\u0006\u0004\b.\u0010/J\u0017\u0010\u001e\u001a\u00020\u00132\u0006\u0010!\u001a\u000200H\u0017¢\u0006\u0004\b\u001e\u00101J\u0019\u00107\u001a\u0004\u0018\u0001042\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b5\u00106J\u0019\u0010:\u001a\u0004\u0018\u0001042\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010@\u001a\u00020\u00162\u0006\u0010=\u001a\u00020<H\u0017¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020\u0016H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0016H\u0016¢\u0006\u0004\bC\u0010BJ)\u0010H\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010E*\u00020D2\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000FH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010MR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010NR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010O\u001a\u0004\bP\u0010LR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010QR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010RR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001c\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010Y¨\u0006Z"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidCameraDevice;", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "Landroid/hardware/camera2/CameraDevice;", "cameraDevice", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "Landroidx/camera/camera2/pipe/internal/CameraErrorListener;", "cameraErrorListener", "Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;", "interopCaptureSessionListener", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "<init>", "(Landroidx/camera/camera2/pipe/CameraMetadata;Landroid/hardware/camera2/CameraDevice;Ljava/lang/String;Landroidx/camera/camera2/pipe/internal/CameraErrorListener;Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;Landroidx/camera/camera2/pipe/core/Threads;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/camera/camera2/pipe/compat/SessionStateCallback;", "stateCallback", "Lkotlin/Pair;", "", "checkAndSetStateCallback", "(Landroidx/camera/camera2/pipe/compat/SessionStateCallback;)Lkotlin/Pair;", "", "onSessionDisconnectedWithTrace", "(Landroidx/camera/camera2/pipe/compat/SessionStateCallback;)V", "onSessionFinalizedWithTrace", "", "Landroid/view/Surface;", "outputs", "Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper$StateCallback;", "createCaptureSession", "(Ljava/util/List;Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper$StateCallback;)Z", "Landroidx/camera/camera2/pipe/compat/ExtensionSessionConfigData;", "config", "createExtensionSession", "(Landroidx/camera/camera2/pipe/compat/ExtensionSessionConfigData;)Z", "Landroid/hardware/camera2/params/InputConfiguration;", "input", "createReprocessableCaptureSession", "(Landroid/hardware/camera2/params/InputConfiguration;Ljava/util/List;Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper$StateCallback;)Z", "createConstrainedHighSpeedCaptureSession", "Landroidx/camera/camera2/pipe/compat/OutputConfigurationWrapper;", "outputConfigurations", "createCaptureSessionByOutputConfigurations", "Landroidx/camera/camera2/pipe/compat/InputConfigData;", "inputConfig", "createReprocessableCaptureSessionByConfigurations", "(Landroidx/camera/camera2/pipe/compat/InputConfigData;Ljava/util/List;Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper$StateCallback;)Z", "Landroidx/camera/camera2/pipe/compat/SessionConfigData;", "(Landroidx/camera/camera2/pipe/compat/SessionConfigData;)Z", "Landroidx/camera/camera2/pipe/RequestTemplate;", "template", "Landroid/hardware/camera2/CaptureRequest$Builder;", "createCaptureRequest-2PPcXtw", "(I)Landroid/hardware/camera2/CaptureRequest$Builder;", "createCaptureRequest", "Landroid/hardware/camera2/TotalCaptureResult;", "inputResult", "createReprocessCaptureRequest", "(Landroid/hardware/camera2/TotalCaptureResult;)Landroid/hardware/camera2/CaptureRequest$Builder;", "Landroidx/camera/camera2/pipe/AudioRestrictionMode;", "mode", "onCameraAudioRestrictionUpdated-LwUUkyU", "(I)V", "onCameraAudioRestrictionUpdated", "onDeviceClosing", "()V", "onDeviceClosed", "", "T", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/camera2/pipe/CameraMetadata;", "Landroid/hardware/camera2/CameraDevice;", "Ljava/lang/String;", "getCameraId-Dz_R5H8", "Landroidx/camera/camera2/pipe/internal/CameraErrorListener;", "Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;", "Landroidx/camera/camera2/pipe/core/Threads;", "Lrkm/b;", "closed", "Lrkm/b;", "Lrkm/h;", "_lastStateCallback", "Lrkm/h;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidCameraDevice implements CameraDeviceWrapper {

    @NotNull
    private final h _lastStateCallback;

    @NotNull
    private final CameraDevice cameraDevice;

    @NotNull
    private final CameraErrorListener cameraErrorListener;

    @NotNull
    private final String cameraId;

    @NotNull
    private final CameraMetadata cameraMetadata;

    @NotNull
    private final b closed;
    private final CameraInterop.CaptureSessionListener interopCaptureSessionListener;

    @NotNull
    private final Threads threads;

    public /* synthetic */ AndroidCameraDevice(CameraMetadata cameraMetadata, CameraDevice cameraDevice, String str, CameraErrorListener cameraErrorListener, CameraInterop.CaptureSessionListener captureSessionListener, Threads threads, DefaultConstructorMarker defaultConstructorMarker) {
        this(cameraMetadata, cameraDevice, str, cameraErrorListener, captureSessionListener, threads);
    }

    private final Pair<Boolean, SessionStateCallback> checkAndSetStateCallback(SessionStateCallback stateCallback) {
        if (this.closed.b()) {
            onSessionFinalizedWithTrace(stateCallback);
            return new Pair<>(Boolean.FALSE, null);
        }
        Boolean bool = Boolean.TRUE;
        h hVar = this._lastStateCallback;
        hVar.getClass();
        return new Pair<>(bool, h.f254899b.getAndSet(hVar, stateCallback));
    }

    private final void onSessionDisconnectedWithTrace(SessionStateCallback sessionStateCallback) {
        Debug debug = Debug.INSTANCE;
        try {
            Trace.beginSection(this + "#onSessionDisconnected");
            sessionStateCallback.onSessionDisconnected();
            Unit unit = Unit.f186387a;
        } finally {
            Trace.endSection();
        }
    }

    private final void onSessionFinalizedWithTrace(SessionStateCallback sessionStateCallback) {
        Debug debug = Debug.INSTANCE;
        try {
            Trace.beginSection(this + "#onSessionFinalized");
            sessionStateCallback.onSessionFinalized();
            Unit unit = Unit.f186387a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /* JADX INFO: renamed from: createCaptureRequest-2PPcXtw, reason: not valid java name */
    public CaptureRequest.Builder mo364createCaptureRequest2PPcXtw(int template) throws Throwable {
        double d;
        CaptureRequest.Builder builderCreateCaptureRequest;
        Debug debug = Debug.INSTANCE;
        String str = "CXCP#createCaptureRequest-" + getCameraId();
        long jMo441nowvQl9yQU = debug.getSystemTimeSource$camera_camera2_pipe().mo441nowvQl9yQU();
        try {
            Trace.beginSection(str);
            String cameraId = getCameraId();
            d = 1000000.0d;
            try {
                CameraErrorListener cameraErrorListener = this.cameraErrorListener;
                try {
                    builderCreateCaptureRequest = this.cameraDevice.createCaptureRequest(template);
                } catch (Exception e) {
                    if (e instanceof CameraAccessException) {
                        if (Log.INSTANCE.getWARN_LOGGABLE()) {
                            String str2 = "Failed to execute call: Camera encountered an error: " + e.getMessage();
                        }
                        cameraErrorListener.mo396onCameraError3M5Xam4(cameraId, CameraError.INSTANCE.m138fromPVuDhNw$camera_camera2_pipe((CameraAccessException) e), true);
                    } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                        if (Log.INSTANCE.getWARN_LOGGABLE()) {
                            String str3 = "Failed to execute call: Unexpected exception: " + e.getMessage();
                        }
                        cameraErrorListener.mo396onCameraError3M5Xam4(cameraId, CameraError.INSTANCE.m149getERROR_GRAPH_CONFIGv7Vf74A(), false);
                    } else {
                        if (!(e instanceof IllegalStateException)) {
                            throw e;
                        }
                        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                        }
                    }
                    builderCreateCaptureRequest = null;
                }
                long jD = c.d(debug, jMo441nowvQl9yQU);
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    StringBuilder sbL = v0.a.l(str, " - ");
                    Timestamps timestamps = Timestamps.INSTANCE;
                    j6.a.C(sbL, m72.b.t(new Object[]{Double.valueOf(jD / 1000000.0d)}, 1, null, "%.3f ms", "format(...)"), "CXCP");
                }
                return builderCreateCaptureRequest;
            } catch (Throwable th10) {
                th = th10;
                long jD2 = c.d(debug, jMo441nowvQl9yQU);
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    StringBuilder sbL2 = v0.a.l(str, " - ");
                    Timestamps timestamps2 = Timestamps.INSTANCE;
                    j6.a.C(sbL2, m72.b.t(new Object[]{Double.valueOf(jD2 / d)}, 1, null, "%.3f ms", "format(...)"), "CXCP");
                }
                throw th;
            }
        } catch (Throwable th11) {
            th = th11;
            d = 1000000.0d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce A[Catch: all -> 0x009e, TryCatch #9 {all -> 0x009e, blocks: (B:17:0x0089, B:36:0x00ca, B:38:0x00ce, B:40:0x00d6, B:41:0x00e7, B:43:0x00f7, B:45:0x00fb, B:47:0x00ff, B:49:0x0103, B:52:0x0108, B:54:0x010c, B:57:0x0118, B:58:0x0119, B:60:0x0121, B:61:0x0132), top: B:86:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7 A[Catch: all -> 0x009e, TryCatch #9 {all -> 0x009e, blocks: (B:17:0x0089, B:36:0x00ca, B:38:0x00ce, B:40:0x00d6, B:41:0x00e7, B:43:0x00f7, B:45:0x00fb, B:47:0x00ff, B:49:0x0103, B:52:0x0108, B:54:0x010c, B:57:0x0118, B:58:0x0119, B:60:0x0121, B:61:0x0132), top: B:86:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0194 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b2  */
    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean createCaptureSession(@org.jetbrains.annotations.NotNull java.util.List<? extends android.view.Surface> r25, @org.jetbrains.annotations.NotNull androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.AndroidCameraDevice.createCaptureSession(java.util.List, androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper$StateCallback):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fb A[Catch: all -> 0x00da, TryCatch #2 {all -> 0x00da, blocks: (B:24:0x00c7, B:36:0x00f7, B:38:0x00fb, B:40:0x0103, B:41:0x0119, B:44:0x0127, B:46:0x012b, B:48:0x012f, B:50:0x0133, B:53:0x0138, B:55:0x013c, B:58:0x0148, B:59:0x0149, B:61:0x0151, B:62:0x0167), top: B:85:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0127 A[Catch: all -> 0x00da, TryCatch #2 {all -> 0x00da, blocks: (B:24:0x00c7, B:36:0x00f7, B:38:0x00fb, B:40:0x0103, B:41:0x0119, B:44:0x0127, B:46:0x012b, B:48:0x012f, B:50:0x0133, B:53:0x0138, B:55:0x013c, B:58:0x0148, B:59:0x0149, B:61:0x0151, B:62:0x0167), top: B:85:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01dd  */
    /* JADX WARN: Type inference failed for: r11v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v7, types: [int] */
    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean createCaptureSessionByOutputConfigurations(@org.jetbrains.annotations.NotNull java.util.List<? extends androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper> r24, @org.jetbrains.annotations.NotNull androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.AndroidCameraDevice.createCaptureSessionByOutputConfigurations(java.util.List, androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper$StateCallback):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce A[Catch: all -> 0x009e, TryCatch #9 {all -> 0x009e, blocks: (B:17:0x0089, B:36:0x00ca, B:38:0x00ce, B:40:0x00d6, B:41:0x00e7, B:43:0x00f7, B:45:0x00fb, B:47:0x00ff, B:49:0x0103, B:52:0x0108, B:54:0x010c, B:57:0x0118, B:58:0x0119, B:60:0x0121, B:61:0x0132), top: B:86:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7 A[Catch: all -> 0x009e, TryCatch #9 {all -> 0x009e, blocks: (B:17:0x0089, B:36:0x00ca, B:38:0x00ce, B:40:0x00d6, B:41:0x00e7, B:43:0x00f7, B:45:0x00fb, B:47:0x00ff, B:49:0x0103, B:52:0x0108, B:54:0x010c, B:57:0x0118, B:58:0x0119, B:60:0x0121, B:61:0x0132), top: B:86:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0194 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b2  */
    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean createConstrainedHighSpeedCaptureSession(@org.jetbrains.annotations.NotNull java.util.List<? extends android.view.Surface> r25, @org.jetbrains.annotations.NotNull androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.AndroidCameraDevice.createConstrainedHighSpeedCaptureSession(java.util.List, androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper$StateCallback):boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:115|12|(2:121|13)|(15:14|15|(3:113|17|18)(1:110)|22|23|24|25|60|(3:62|(1:64)|65)(10:67|(2:76|(2:78|(1:80))(1:81))|82|(1:84)|85|86|87|(1:89)|(3:91|(1:93)|(1:95))|(2:97|123)(2:98|99))|66|47|87|(0)|(0)|(0)(0))|26|27|117|28|29|119|30|31|112|32|(2:36|(1:38)(2:43|44))|45|46|47|87|(0)|(0)|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(24:(1:10)|11|115|12|(2:121|13)|(15:14|15|(3:113|17|18)(1:110)|22|23|24|25|60|(3:62|(1:64)|65)(10:67|(2:76|(2:78|(1:80))(1:81))|82|(1:84)|85|86|87|(1:89)|(3:91|(1:93)|(1:95))|(2:97|123)(2:98|99))|66|47|87|(0)|(0)|(0)(0))|26|27|117|28|29|119|30|31|112|32|(2:36|(1:38)(2:43|44))|45|46|47|87|(0)|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0110, code lost:
    
        r8 = r14;
        r11 = r19;
        r4 = r21;
        r12 = "%.3f ms";
        r7 = " - ";
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0134, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0135, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0144, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0159 A[Catch: all -> 0x010f, TryCatch #10 {all -> 0x010f, blocks: (B:32:0x00e6, B:34:0x00f3, B:36:0x00f9, B:38:0x010b, B:43:0x011e, B:44:0x0125, B:45:0x0126, B:60:0x0155, B:62:0x0159, B:64:0x0161, B:65:0x0177, B:67:0x0186, B:69:0x018a, B:71:0x018e, B:73:0x0192, B:76:0x0197, B:78:0x019b, B:81:0x01a7, B:82:0x01a8, B:84:0x01b0, B:85:0x01c6), top: B:115:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0186 A[Catch: all -> 0x010f, TryCatch #10 {all -> 0x010f, blocks: (B:32:0x00e6, B:34:0x00f3, B:36:0x00f9, B:38:0x010b, B:43:0x011e, B:44:0x0125, B:45:0x0126, B:60:0x0155, B:62:0x0159, B:64:0x0161, B:65:0x0177, B:67:0x0186, B:69:0x018a, B:71:0x018e, B:73:0x0192, B:76:0x0197, B:78:0x019b, B:81:0x01a7, B:82:0x01a8, B:84:0x01b0, B:85:0x01c6), top: B:115:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0229  */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean createExtensionSession(@org.jetbrains.annotations.NotNull androidx.camera.camera2.pipe.compat.ExtensionSessionConfigData r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.AndroidCameraDevice.createExtensionSession(androidx.camera.camera2.pipe.compat.ExtensionSessionConfigData):boolean");
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public CaptureRequest.Builder createReprocessCaptureRequest(@NotNull TotalCaptureResult inputResult) throws Throwable {
        double d;
        String cameraId;
        CaptureRequest.Builder builderCreateReprocessCaptureRequest;
        Intrinsics.checkNotNullParameter(inputResult, "inputResult");
        Debug debug = Debug.INSTANCE;
        String str = "CXCP#createReprocessCaptureRequest-" + getCameraId();
        long jMo441nowvQl9yQU = debug.getSystemTimeSource$camera_camera2_pipe().mo441nowvQl9yQU();
        try {
            Trace.beginSection(str);
            cameraId = getCameraId();
            d = 1000000.0d;
        } catch (Throwable th10) {
            th = th10;
            d = 1000000.0d;
        }
        try {
            CameraErrorListener cameraErrorListener = this.cameraErrorListener;
            try {
                builderCreateReprocessCaptureRequest = this.cameraDevice.createReprocessCaptureRequest(inputResult);
            } catch (Exception e) {
                if (e instanceof CameraAccessException) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        String str2 = "Failed to execute call: Camera encountered an error: " + e.getMessage();
                    }
                    cameraErrorListener.mo396onCameraError3M5Xam4(cameraId, CameraError.INSTANCE.m138fromPVuDhNw$camera_camera2_pipe((CameraAccessException) e), true);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        String str3 = "Failed to execute call: Unexpected exception: " + e.getMessage();
                    }
                    cameraErrorListener.mo396onCameraError3M5Xam4(cameraId, CameraError.INSTANCE.m149getERROR_GRAPH_CONFIGv7Vf74A(), false);
                } else {
                    if (!(e instanceof IllegalStateException)) {
                        throw e;
                    }
                    if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    }
                }
                builderCreateReprocessCaptureRequest = null;
            }
            long jD = c.d(debug, jMo441nowvQl9yQU);
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                StringBuilder sbL = v0.a.l(str, " - ");
                Timestamps timestamps = Timestamps.INSTANCE;
                j6.a.C(sbL, m72.b.t(new Object[]{Double.valueOf(jD / 1000000.0d)}, 1, null, "%.3f ms", "format(...)"), "CXCP");
            }
            return builderCreateReprocessCaptureRequest;
        } catch (Throwable th11) {
            th = th11;
            long jD2 = c.d(debug, jMo441nowvQl9yQU);
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                StringBuilder sbL2 = v0.a.l(str, " - ");
                Timestamps timestamps2 = Timestamps.INSTANCE;
                j6.a.C(sbL2, m72.b.t(new Object[]{Double.valueOf(jD2 / d)}, 1, null, "%.3f ms", "format(...)"), "CXCP");
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3 A[Catch: all -> 0x00b3, TryCatch #1 {all -> 0x00b3, blocks: (B:17:0x009c, B:38:0x00ef, B:40:0x00f3, B:42:0x00fb, B:43:0x010c, B:45:0x011d, B:47:0x0121, B:49:0x0125, B:51:0x0129, B:54:0x012e, B:56:0x0132, B:59:0x013e, B:60:0x013f, B:62:0x0147, B:63:0x0158), top: B:87:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d A[Catch: all -> 0x00b3, TryCatch #1 {all -> 0x00b3, blocks: (B:17:0x009c, B:38:0x00ef, B:40:0x00f3, B:42:0x00fb, B:43:0x010c, B:45:0x011d, B:47:0x0121, B:49:0x0125, B:51:0x0129, B:54:0x012e, B:56:0x0132, B:59:0x013e, B:60:0x013f, B:62:0x0147, B:63:0x0158), top: B:87:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e1  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v7, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean] */
    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean createReprocessableCaptureSession(@org.jetbrains.annotations.NotNull android.hardware.camera2.params.InputConfiguration r30, @org.jetbrains.annotations.NotNull java.util.List<? extends android.view.Surface> r31, @org.jetbrains.annotations.NotNull androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.AndroidCameraDevice.createReprocessableCaptureSession(android.hardware.camera2.params.InputConfiguration, java.util.List, androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper$StateCallback):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c A[Catch: all -> 0x00f9, TryCatch #3 {all -> 0x00f9, blocks: (B:25:0x00e4, B:37:0x0118, B:39:0x011c, B:41:0x0124, B:42:0x013a, B:45:0x014a, B:47:0x014e, B:49:0x0152, B:51:0x0156, B:54:0x015b, B:56:0x015f, B:59:0x016b, B:60:0x016c, B:62:0x0174, B:63:0x018a), top: B:89:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014a A[Catch: all -> 0x00f9, TryCatch #3 {all -> 0x00f9, blocks: (B:25:0x00e4, B:37:0x0118, B:39:0x011c, B:41:0x0124, B:42:0x013a, B:45:0x014a, B:47:0x014e, B:49:0x0152, B:51:0x0156, B:54:0x015b, B:56:0x015f, B:59:0x016b, B:60:0x016c, B:62:0x0174, B:63:0x018a), top: B:89:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020a  */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v7, types: [int] */
    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean createReprocessableCaptureSessionByConfigurations(@org.jetbrains.annotations.NotNull androidx.camera.camera2.pipe.compat.InputConfigData r25, @org.jetbrains.annotations.NotNull java.util.List<? extends androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper> r26, @org.jetbrains.annotations.NotNull androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.AndroidCameraDevice.createReprocessableCaptureSessionByConfigurations(androidx.camera.camera2.pipe.compat.InputConfigData, java.util.List, androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper$StateCallback):boolean");
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    @NotNull
    /* JADX INFO: renamed from: getCameraId-Dz_R5H8, reason: not valid java name and from getter */
    public String getCameraId() {
        return this.cameraId;
    }

    @Override // androidx.camera.camera2.pipe.compat.AudioRestrictionController.Listener
    /* JADX INFO: renamed from: onCameraAudioRestrictionUpdated-LwUUkyU, reason: not valid java name */
    public void mo366onCameraAudioRestrictionUpdatedLwUUkyU(int mode) {
        Debug debug = Debug.INSTANCE;
        try {
            Trace.beginSection("setCameraAudioRestriction");
            String cameraId = getCameraId();
            CameraErrorListener cameraErrorListener = this.cameraErrorListener;
            try {
                Api30Compat.setCameraAudioRestriction(this.cameraDevice, mode);
                Unit unit = Unit.f186387a;
            } catch (Exception e) {
                if (e instanceof CameraAccessException) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        String str = "Failed to execute call: Camera encountered an error: " + e.getMessage();
                    }
                    cameraErrorListener.mo396onCameraError3M5Xam4(cameraId, CameraError.INSTANCE.m138fromPVuDhNw$camera_camera2_pipe((CameraAccessException) e), true);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        String str2 = "Failed to execute call: Unexpected exception: " + e.getMessage();
                    }
                    cameraErrorListener.mo396onCameraError3M5Xam4(cameraId, CameraError.INSTANCE.m149getERROR_GRAPH_CONFIGv7Vf74A(), false);
                } else {
                    if (!(e instanceof IllegalStateException)) {
                        throw e;
                    }
                    if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    }
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public void onDeviceClosed() {
        if (!this.closed.b()) {
            throw new IllegalStateException("Check failed.");
        }
        h hVar = this._lastStateCallback;
        hVar.getClass();
        SessionStateCallback sessionStateCallback = (SessionStateCallback) h.f254899b.getAndSet(hVar, null);
        if (sessionStateCallback != null) {
            onSessionFinalizedWithTrace(sessionStateCallback);
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public void onDeviceClosing() {
        SessionStateCallback sessionStateCallback;
        if (!this.closed.a() || (sessionStateCallback = (SessionStateCallback) this._lastStateCallback.f254900a) == null) {
            return;
        }
        onSessionDisconnectedWithTrace(sessionStateCallback);
    }

    @NotNull
    public String toString() {
        return "AndroidCameraDevice(camera=" + ((Object) CameraId.m186toStringimpl(getCameraId())) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public <T> T unwrapAs(@NotNull KClass type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!Intrinsics.f(type, o0.f186429a.b(CameraDevice.class))) {
            return null;
        }
        T t2 = (T) this.cameraDevice;
        Intrinsics.i(t2, "null cannot be cast to non-null type T of androidx.camera.camera2.pipe.compat.AndroidCameraDevice.unwrapAs");
        return t2;
    }

    private AndroidCameraDevice(CameraMetadata cameraMetadata, CameraDevice cameraDevice, String cameraId, CameraErrorListener cameraErrorListener, CameraInterop.CaptureSessionListener captureSessionListener, Threads threads) {
        Intrinsics.checkNotNullParameter(cameraMetadata, "cameraMetadata");
        Intrinsics.checkNotNullParameter(cameraDevice, "cameraDevice");
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        Intrinsics.checkNotNullParameter(cameraErrorListener, "cameraErrorListener");
        Intrinsics.checkNotNullParameter(threads, "threads");
        this.cameraMetadata = cameraMetadata;
        this.cameraDevice = cameraDevice;
        this.cameraId = cameraId;
        this.cameraErrorListener = cameraErrorListener;
        this.interopCaptureSessionListener = captureSessionListener;
        this.threads = threads;
        this.closed = hx7.b.g(false);
        this._lastStateCallback = hx7.b.j(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02b0 A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:32:0x00de, B:34:0x00eb, B:36:0x00f1, B:41:0x0110, B:42:0x0142, B:45:0x014e, B:47:0x0154, B:55:0x0199, B:57:0x01ac, B:58:0x01ce, B:60:0x01d4, B:61:0x01e2, B:62:0x01ee, B:64:0x01f4, B:66:0x0206, B:68:0x0213, B:69:0x0217, B:71:0x0233, B:73:0x023e, B:74:0x0241, B:76:0x0243, B:77:0x0246, B:48:0x0158, B:50:0x0160, B:52:0x017a, B:54:0x0182, B:93:0x027e, B:95:0x0282, B:97:0x028a, B:98:0x02a0, B:101:0x02b0, B:103:0x02b4, B:105:0x02b8, B:107:0x02bc, B:110:0x02c1, B:112:0x02c5, B:115:0x02d1, B:116:0x02d2, B:118:0x02da, B:119:0x02f0), top: B:142:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0282 A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:32:0x00de, B:34:0x00eb, B:36:0x00f1, B:41:0x0110, B:42:0x0142, B:45:0x014e, B:47:0x0154, B:55:0x0199, B:57:0x01ac, B:58:0x01ce, B:60:0x01d4, B:61:0x01e2, B:62:0x01ee, B:64:0x01f4, B:66:0x0206, B:68:0x0213, B:69:0x0217, B:71:0x0233, B:73:0x023e, B:74:0x0241, B:76:0x0243, B:77:0x0246, B:48:0x0158, B:50:0x0160, B:52:0x017a, B:54:0x0182, B:93:0x027e, B:95:0x0282, B:97:0x028a, B:98:0x02a0, B:101:0x02b0, B:103:0x02b4, B:105:0x02b8, B:107:0x02bc, B:110:0x02c1, B:112:0x02c5, B:115:0x02d1, B:116:0x02d2, B:118:0x02da, B:119:0x02f0), top: B:142:0x0055 }] */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9, types: [int] */
    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean createCaptureSession(@org.jetbrains.annotations.NotNull androidx.camera.camera2.pipe.compat.SessionConfigData r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.AndroidCameraDevice.createCaptureSession(androidx.camera.camera2.pipe.compat.SessionConfigData):boolean");
    }
}
