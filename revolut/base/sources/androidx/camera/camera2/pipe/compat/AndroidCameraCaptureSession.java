package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.os.Trace;
import android.view.Surface;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraInterop;
import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Timestamps;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import m72.b;
import org.jetbrains.annotations.NotNull;
import v1.c;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u0004\u0018\u00010\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u0004\u0018\u00010\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J!\u0010\u001b\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u000eJ\u001d\u0010\u001f\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0016H\u0017¢\u0006\u0004\b\u001f\u0010 J)\u0010%\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\"*\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u001a\u00101\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0016\u00108\u001a\u0004\u0018\u0001058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidCameraCaptureSession;", "Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper;", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "device", "Landroid/hardware/camera2/CameraCaptureSession;", "cameraCaptureSession", "Landroidx/camera/camera2/pipe/internal/CameraErrorListener;", "cameraErrorListener", "Landroid/os/Handler;", "callbackHandler", "<init>", "(Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;Landroid/hardware/camera2/CameraCaptureSession;Landroidx/camera/camera2/pipe/internal/CameraErrorListener;Landroid/os/Handler;)V", "", "abortCaptures", "()Z", "Landroid/hardware/camera2/CaptureRequest;", "request", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "listener", "", "capture", "(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;", "", "requests", "captureBurst", "(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Ljava/lang/Integer;", "setRepeatingBurst", "setRepeatingRequest", "stopRepeating", "Landroidx/camera/camera2/pipe/compat/OutputConfigurationWrapper;", "outputConfigs", "finalizeOutputConfigurations", "(Ljava/util/List;)Z", "", "T", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "", "close", "()V", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "getDevice", "()Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "Landroid/hardware/camera2/CameraCaptureSession;", "Landroidx/camera/camera2/pipe/internal/CameraErrorListener;", "Landroid/os/Handler;", "Landroidx/camera/camera2/pipe/CameraInterop$CameraCaptureSessionId;", "id", "I", "getId-159jkk4", "()I", "Landroid/view/Surface;", "getInputSurface", "()Landroid/view/Surface;", "inputSurface", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class AndroidCameraCaptureSession implements CameraCaptureSessionWrapper {

    @NotNull
    private final Handler callbackHandler;

    @NotNull
    private final CameraCaptureSession cameraCaptureSession;

    @NotNull
    private final CameraErrorListener cameraErrorListener;

    @NotNull
    private final CameraDeviceWrapper device;
    private final int id;

    public AndroidCameraCaptureSession(@NotNull CameraDeviceWrapper device, @NotNull CameraCaptureSession cameraCaptureSession, @NotNull CameraErrorListener cameraErrorListener, @NotNull Handler callbackHandler) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(cameraCaptureSession, "cameraCaptureSession");
        Intrinsics.checkNotNullParameter(cameraErrorListener, "cameraErrorListener");
        Intrinsics.checkNotNullParameter(callbackHandler, "callbackHandler");
        this.device = device;
        this.cameraCaptureSession = cameraCaptureSession;
        this.cameraErrorListener = cameraErrorListener;
        this.callbackHandler = callbackHandler;
        this.id = CameraInterop.m188nextCameraCaptureSessionId159jkk4$camera_camera2_pipe();
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public boolean abortCaptures() throws Throwable {
        double d;
        String cameraId;
        Unit unit;
        Debug debug = Debug.INSTANCE;
        String str = "CXCP#abortCaptures-" + getDevice().getCameraId();
        long jMo441nowvQl9yQU = debug.getSystemTimeSource$camera_camera2_pipe().mo441nowvQl9yQU();
        try {
            Trace.beginSection(str);
            cameraId = getDevice().getCameraId();
            d = 1000000.0d;
        } catch (Throwable th10) {
            th = th10;
            d = 1000000.0d;
        }
        try {
            CameraErrorListener cameraErrorListener = this.cameraErrorListener;
            try {
                this.cameraCaptureSession.abortCaptures();
                unit = Unit.f186387a;
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
                unit = null;
            }
            long jD = c.d(debug, jMo441nowvQl9yQU);
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                StringBuilder sbL = v0.a.l(str, " - ");
                Timestamps timestamps = Timestamps.INSTANCE;
                j6.a.C(sbL, b.t(new Object[]{Double.valueOf(jD / 1000000.0d)}, 1, null, "%.3f ms", "format(...)"), "CXCP");
            }
            return unit != null;
        } catch (Throwable th11) {
            th = th11;
            long jD2 = c.d(debug, jMo441nowvQl9yQU);
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                StringBuilder sbL2 = v0.a.l(str, " - ");
                Timestamps timestamps2 = Timestamps.INSTANCE;
                j6.a.C(sbL2, b.t(new Object[]{Double.valueOf(jD2 / d)}, 1, null, "%.3f ms", "format(...)"), "CXCP");
            }
            throw th;
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public Integer capture(@NotNull CaptureRequest request, @NotNull CameraCaptureSession.CaptureCallback listener) throws Throwable {
        double d;
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Debug debug = Debug.INSTANCE;
        String str = "CXCP#capture-" + getDevice().getCameraId();
        long jMo441nowvQl9yQU = debug.getSystemTimeSource$camera_camera2_pipe().mo441nowvQl9yQU();
        try {
            Trace.beginSection(str);
            d = 1000000.0d;
            try {
                String cameraId = getDevice().getCameraId();
                CameraErrorListener cameraErrorListener = this.cameraErrorListener;
                try {
                    numValueOf = Integer.valueOf(this.cameraCaptureSession.capture(request, listener, this.callbackHandler));
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
                    numValueOf = null;
                }
                long jD = c.d(debug, jMo441nowvQl9yQU);
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    StringBuilder sbL = v0.a.l(str, " - ");
                    Timestamps timestamps = Timestamps.INSTANCE;
                    j6.a.C(sbL, b.t(new Object[]{Double.valueOf(jD / 1000000.0d)}, 1, null, "%.3f ms", "format(...)"), "CXCP");
                }
                return numValueOf;
            } catch (Throwable th10) {
                th = th10;
                long jD2 = c.d(debug, jMo441nowvQl9yQU);
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    StringBuilder sbL2 = v0.a.l(str, " - ");
                    Timestamps timestamps2 = Timestamps.INSTANCE;
                    j6.a.C(sbL2, b.t(new Object[]{Double.valueOf(jD2 / d)}, 1, null, "%.3f ms", "format(...)"), "CXCP");
                }
                throw th;
            }
        } catch (Throwable th11) {
            th = th11;
            d = 1000000.0d;
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public Integer captureBurst(@NotNull List<CaptureRequest> requests, @NotNull CameraCaptureSession.CaptureCallback listener) throws Throwable {
        double d;
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Debug debug = Debug.INSTANCE;
        String str = "CXCP#captureBurst-" + getDevice().getCameraId();
        long jMo441nowvQl9yQU = debug.getSystemTimeSource$camera_camera2_pipe().mo441nowvQl9yQU();
        try {
            Trace.beginSection(str);
            d = 1000000.0d;
            try {
                String cameraId = getDevice().getCameraId();
                CameraErrorListener cameraErrorListener = this.cameraErrorListener;
                try {
                    numValueOf = Integer.valueOf(this.cameraCaptureSession.captureBurst(requests, listener, this.callbackHandler));
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
                    numValueOf = null;
                }
                long jD = c.d(debug, jMo441nowvQl9yQU);
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    StringBuilder sbL = v0.a.l(str, " - ");
                    Timestamps timestamps = Timestamps.INSTANCE;
                    j6.a.C(sbL, b.t(new Object[]{Double.valueOf(jD / 1000000.0d)}, 1, null, "%.3f ms", "format(...)"), "CXCP");
                }
                return numValueOf;
            } catch (Throwable th10) {
                th = th10;
                long jD2 = c.d(debug, jMo441nowvQl9yQU);
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    StringBuilder sbL2 = v0.a.l(str, " - ");
                    Timestamps timestamps2 = Timestamps.INSTANCE;
                    j6.a.C(sbL2, b.t(new Object[]{Double.valueOf(jD2 / d)}, 1, null, "%.3f ms", "format(...)"), "CXCP");
                }
                throw th;
            }
        } catch (Throwable th11) {
            th = th11;
            d = 1000000.0d;
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.cameraCaptureSession.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0127 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean finalizeOutputConfigurations(@org.jetbrains.annotations.NotNull java.util.List<? extends androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.AndroidCameraCaptureSession.finalizeOutputConfigurations(java.util.List):boolean");
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    @NotNull
    public CameraDeviceWrapper getDevice() {
        return this.device;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    /* JADX INFO: renamed from: getId-159jkk4, reason: not valid java name and from getter */
    public int getId() {
        return this.id;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public Surface getInputSurface() {
        return this.cameraCaptureSession.getInputSurface();
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public Integer setRepeatingBurst(@NotNull List<CaptureRequest> requests, @NotNull CameraCaptureSession.CaptureCallback listener) throws Throwable {
        double d;
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Debug debug = Debug.INSTANCE;
        String str = "CXCP#setRepeatingBurst-" + getDevice().getCameraId();
        long jMo441nowvQl9yQU = debug.getSystemTimeSource$camera_camera2_pipe().mo441nowvQl9yQU();
        try {
            Trace.beginSection(str);
            d = 1000000.0d;
            try {
                String cameraId = getDevice().getCameraId();
                CameraErrorListener cameraErrorListener = this.cameraErrorListener;
                try {
                    numValueOf = Integer.valueOf(this.cameraCaptureSession.setRepeatingBurst(requests, listener, this.callbackHandler));
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
                    numValueOf = null;
                }
                long jD = c.d(debug, jMo441nowvQl9yQU);
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    StringBuilder sbL = v0.a.l(str, " - ");
                    Timestamps timestamps = Timestamps.INSTANCE;
                    j6.a.C(sbL, b.t(new Object[]{Double.valueOf(jD / 1000000.0d)}, 1, null, "%.3f ms", "format(...)"), "CXCP");
                }
                return numValueOf;
            } catch (Throwable th10) {
                th = th10;
                long jD2 = c.d(debug, jMo441nowvQl9yQU);
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    StringBuilder sbL2 = v0.a.l(str, " - ");
                    Timestamps timestamps2 = Timestamps.INSTANCE;
                    j6.a.C(sbL2, b.t(new Object[]{Double.valueOf(jD2 / d)}, 1, null, "%.3f ms", "format(...)"), "CXCP");
                }
                throw th;
            }
        } catch (Throwable th11) {
            th = th11;
            d = 1000000.0d;
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public Integer setRepeatingRequest(@NotNull CaptureRequest request, @NotNull CameraCaptureSession.CaptureCallback listener) throws Throwable {
        double d;
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Debug debug = Debug.INSTANCE;
        String str = "CXCP#setRepeatingRequest-" + getDevice().getCameraId();
        long jMo441nowvQl9yQU = debug.getSystemTimeSource$camera_camera2_pipe().mo441nowvQl9yQU();
        try {
            Trace.beginSection(str);
            d = 1000000.0d;
            try {
                String cameraId = getDevice().getCameraId();
                CameraErrorListener cameraErrorListener = this.cameraErrorListener;
                try {
                    numValueOf = Integer.valueOf(this.cameraCaptureSession.setRepeatingRequest(request, listener, this.callbackHandler));
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
                    numValueOf = null;
                }
                long jD = c.d(debug, jMo441nowvQl9yQU);
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    StringBuilder sbL = v0.a.l(str, " - ");
                    Timestamps timestamps = Timestamps.INSTANCE;
                    j6.a.C(sbL, b.t(new Object[]{Double.valueOf(jD / 1000000.0d)}, 1, null, "%.3f ms", "format(...)"), "CXCP");
                }
                return numValueOf;
            } catch (Throwable th10) {
                th = th10;
                long jD2 = c.d(debug, jMo441nowvQl9yQU);
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    StringBuilder sbL2 = v0.a.l(str, " - ");
                    Timestamps timestamps2 = Timestamps.INSTANCE;
                    j6.a.C(sbL2, b.t(new Object[]{Double.valueOf(jD2 / d)}, 1, null, "%.3f ms", "format(...)"), "CXCP");
                }
                throw th;
            }
        } catch (Throwable th11) {
            th = th11;
            d = 1000000.0d;
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper
    public boolean stopRepeating() throws Throwable {
        double d;
        String cameraId;
        Unit unit;
        Debug debug = Debug.INSTANCE;
        String str = "CXCP#stopRepeating-" + getDevice().getCameraId();
        long jMo441nowvQl9yQU = debug.getSystemTimeSource$camera_camera2_pipe().mo441nowvQl9yQU();
        try {
            Trace.beginSection(str);
            cameraId = getDevice().getCameraId();
            d = 1000000.0d;
        } catch (Throwable th10) {
            th = th10;
            d = 1000000.0d;
        }
        try {
            CameraErrorListener cameraErrorListener = this.cameraErrorListener;
            try {
                this.cameraCaptureSession.stopRepeating();
                unit = Unit.f186387a;
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
                unit = null;
            }
            long jD = c.d(debug, jMo441nowvQl9yQU);
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                StringBuilder sbL = v0.a.l(str, " - ");
                Timestamps timestamps = Timestamps.INSTANCE;
                j6.a.C(sbL, b.t(new Object[]{Double.valueOf(jD / 1000000.0d)}, 1, null, "%.3f ms", "format(...)"), "CXCP");
            }
            return unit != null;
        } catch (Throwable th11) {
            th = th11;
            long jD2 = c.d(debug, jMo441nowvQl9yQU);
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                StringBuilder sbL2 = v0.a.l(str, " - ");
                Timestamps timestamps2 = Timestamps.INSTANCE;
                j6.a.C(sbL2, b.t(new Object[]{Double.valueOf(jD2 / d)}, 1, null, "%.3f ms", "format(...)"), "CXCP");
            }
            throw th;
        }
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public <T> T unwrapAs(@NotNull KClass type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.f(type, o0.f186429a.b(CameraCaptureSession.class))) {
            return (T) this.cameraCaptureSession;
        }
        return null;
    }
}
