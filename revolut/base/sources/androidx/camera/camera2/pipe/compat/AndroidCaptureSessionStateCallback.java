package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Handler;
import androidx.camera.camera2.pipe.CameraInterop;
import androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import ib.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rkm.h;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010\u001bJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(¨\u0006*"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidCaptureSessionStateCallback;", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "device", "Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper$StateCallback;", "stateCallback", "Landroidx/camera/camera2/pipe/compat/SessionStateCallback;", "lastStateCallback", "Landroidx/camera/camera2/pipe/internal/CameraErrorListener;", "cameraErrorListener", "Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;", "interopCaptureSessionListener", "Landroid/os/Handler;", "callbackHandler", "<init>", "(Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper$StateCallback;Landroidx/camera/camera2/pipe/compat/SessionStateCallback;Landroidx/camera/camera2/pipe/internal/CameraErrorListener;Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;Landroid/os/Handler;)V", "Landroid/hardware/camera2/CameraCaptureSession;", b.Session, "Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper;", "getWrapped", "(Landroid/hardware/camera2/CameraCaptureSession;Landroidx/camera/camera2/pipe/internal/CameraErrorListener;)Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper;", "wrapSession", "", "finalizeSession", "()V", "finalizeLastSession", "onConfigured", "(Landroid/hardware/camera2/CameraCaptureSession;)V", "onConfigureFailed", "onReady", "onActive", "onClosed", "onCaptureQueueEmpty", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper$StateCallback;", "Landroidx/camera/camera2/pipe/internal/CameraErrorListener;", "Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;", "Landroid/os/Handler;", "Lrkm/h;", "_lastStateCallback", "Lrkm/h;", "captureSession", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidCaptureSessionStateCallback extends CameraCaptureSession.StateCallback {

    @NotNull
    private final h _lastStateCallback;

    @NotNull
    private final Handler callbackHandler;

    @NotNull
    private final CameraErrorListener cameraErrorListener;

    @NotNull
    private final h captureSession;

    @NotNull
    private final CameraDeviceWrapper device;
    private final CameraInterop.CaptureSessionListener interopCaptureSessionListener;

    @NotNull
    private final CameraCaptureSessionWrapper.StateCallback stateCallback;

    public AndroidCaptureSessionStateCallback(@NotNull CameraDeviceWrapper device, @NotNull CameraCaptureSessionWrapper.StateCallback stateCallback, SessionStateCallback sessionStateCallback, @NotNull CameraErrorListener cameraErrorListener, CameraInterop.CaptureSessionListener captureSessionListener, @NotNull Handler callbackHandler) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(stateCallback, "stateCallback");
        Intrinsics.checkNotNullParameter(cameraErrorListener, "cameraErrorListener");
        Intrinsics.checkNotNullParameter(callbackHandler, "callbackHandler");
        this.device = device;
        this.stateCallback = stateCallback;
        this.cameraErrorListener = cameraErrorListener;
        this.interopCaptureSessionListener = captureSessionListener;
        this.callbackHandler = callbackHandler;
        this._lastStateCallback = hx7.b.j(sessionStateCallback);
        this.captureSession = hx7.b.j(null);
    }

    private final void finalizeLastSession() {
        h hVar = this._lastStateCallback;
        hVar.getClass();
        SessionStateCallback sessionStateCallback = (SessionStateCallback) h.f254899b.getAndSet(hVar, null);
        if (sessionStateCallback != null) {
            sessionStateCallback.onSessionFinalized();
        }
    }

    private final void finalizeSession() {
        finalizeLastSession();
        this.stateCallback.onSessionFinalized();
    }

    private final CameraCaptureSessionWrapper getWrapped(CameraCaptureSession session, CameraErrorListener cameraErrorListener) {
        CameraCaptureSessionWrapper cameraCaptureSessionWrapper = (CameraCaptureSessionWrapper) this.captureSession.f254900a;
        if (cameraCaptureSessionWrapper != null) {
            return cameraCaptureSessionWrapper;
        }
        CameraCaptureSessionWrapper cameraCaptureSessionWrapperWrapSession = wrapSession(session, cameraErrorListener);
        if (this.captureSession.a(null, cameraCaptureSessionWrapperWrapSession)) {
            return cameraCaptureSessionWrapperWrapSession;
        }
        Object obj2 = this.captureSession.f254900a;
        Intrinsics.h(obj2);
        return (CameraCaptureSessionWrapper) obj2;
    }

    private final CameraCaptureSessionWrapper wrapSession(CameraCaptureSession session, CameraErrorListener cameraErrorListener) {
        return session instanceof CameraConstrainedHighSpeedCaptureSession ? new AndroidCameraConstrainedHighSpeedCaptureSession(this.device, (CameraConstrainedHighSpeedCaptureSession) session, cameraErrorListener, this.callbackHandler) : new AndroidCameraCaptureSession(this.device, session, cameraErrorListener, this.callbackHandler);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onActive(@NotNull CameraCaptureSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        CameraCaptureSessionWrapper wrapped = getWrapped(session, this.cameraErrorListener);
        this.stateCallback.onActive(getWrapped(session, this.cameraErrorListener));
        CameraInterop.CaptureSessionListener captureSessionListener = this.interopCaptureSessionListener;
        if (captureSessionListener != null) {
            captureSessionListener.mo25onActiverphkYDA(this.device.getCameraId(), wrapped.getId());
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onCaptureQueueEmpty(@NotNull CameraCaptureSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        CameraCaptureSessionWrapper wrapped = getWrapped(session, this.cameraErrorListener);
        this.stateCallback.onCaptureQueueEmpty(getWrapped(session, this.cameraErrorListener));
        CameraInterop.CaptureSessionListener captureSessionListener = this.interopCaptureSessionListener;
        if (captureSessionListener != null) {
            captureSessionListener.mo26onCaptureQueueEmptyrphkYDA(this.device.getCameraId(), wrapped.getId());
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(@NotNull CameraCaptureSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        CameraCaptureSessionWrapper wrapped = getWrapped(session, this.cameraErrorListener);
        this.stateCallback.onClosed(getWrapped(session, this.cameraErrorListener));
        finalizeSession();
        CameraInterop.CaptureSessionListener captureSessionListener = this.interopCaptureSessionListener;
        if (captureSessionListener != null) {
            captureSessionListener.mo27onClosedrphkYDA(this.device.getCameraId(), wrapped.getId());
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigureFailed(@NotNull CameraCaptureSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        CameraCaptureSessionWrapper wrapped = getWrapped(session, this.cameraErrorListener);
        this.stateCallback.onConfigureFailed(wrapped);
        finalizeSession();
        CameraInterop.CaptureSessionListener captureSessionListener = this.interopCaptureSessionListener;
        if (captureSessionListener != null) {
            captureSessionListener.mo28onConfigureFailedrphkYDA(this.device.getCameraId(), wrapped.getId());
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(@NotNull CameraCaptureSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        CameraCaptureSessionWrapper wrapped = getWrapped(session, this.cameraErrorListener);
        this.stateCallback.onConfigured(wrapped);
        finalizeLastSession();
        CameraInterop.CaptureSessionListener captureSessionListener = this.interopCaptureSessionListener;
        if (captureSessionListener != null) {
            captureSessionListener.mo29onConfiguredrphkYDA(this.device.getCameraId(), wrapped.getId());
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onReady(@NotNull CameraCaptureSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        CameraCaptureSessionWrapper wrapped = getWrapped(session, this.cameraErrorListener);
        this.stateCallback.onReady(getWrapped(session, this.cameraErrorListener));
        CameraInterop.CaptureSessionListener captureSessionListener = this.interopCaptureSessionListener;
        if (captureSessionListener != null) {
            captureSessionListener.mo30onReadyrphkYDA(this.device.getCameraId(), wrapped.getId());
        }
    }
}
