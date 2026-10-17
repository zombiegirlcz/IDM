package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$StateCallback;
import androidx.camera.camera2.pipe.CameraInterop;
import androidx.camera.camera2.pipe.compat.CameraExtensionSessionWrapper;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import ib.b;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rkm.h;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%¨\u0006'"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidExtensionSessionStateCallback;", "Landroid/hardware/camera2/CameraExtensionSession$StateCallback;", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "device", "Landroidx/camera/camera2/pipe/compat/CameraExtensionSessionWrapper$StateCallback;", "stateCallback", "Landroidx/camera/camera2/pipe/compat/SessionStateCallback;", "lastStateCallback", "Landroidx/camera/camera2/pipe/internal/CameraErrorListener;", "cameraErrorListener", "Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;", "interopCaptureSessionListener", "Ljava/util/concurrent/Executor;", "callbackExecutor", "<init>", "(Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;Landroidx/camera/camera2/pipe/compat/CameraExtensionSessionWrapper$StateCallback;Landroidx/camera/camera2/pipe/compat/SessionStateCallback;Landroidx/camera/camera2/pipe/internal/CameraErrorListener;Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;Ljava/util/concurrent/Executor;)V", "Landroid/hardware/camera2/CameraExtensionSession;", b.Session, "Landroidx/camera/camera2/pipe/compat/CameraExtensionSessionWrapper;", "getWrapped", "(Landroid/hardware/camera2/CameraExtensionSession;Landroidx/camera/camera2/pipe/internal/CameraErrorListener;)Landroidx/camera/camera2/pipe/compat/CameraExtensionSessionWrapper;", "wrapSession", "", "finalizeSession", "()V", "finalizeLastSession", "onConfigured", "(Landroid/hardware/camera2/CameraExtensionSession;)V", "onConfigureFailed", "onClosed", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "Landroidx/camera/camera2/pipe/compat/CameraExtensionSessionWrapper$StateCallback;", "Landroidx/camera/camera2/pipe/internal/CameraErrorListener;", "Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;", "Ljava/util/concurrent/Executor;", "Lrkm/h;", "_lastStateCallback", "Lrkm/h;", "extensionSession", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidExtensionSessionStateCallback extends CameraExtensionSession$StateCallback {

    @NotNull
    private final h _lastStateCallback;

    @NotNull
    private final Executor callbackExecutor;

    @NotNull
    private final CameraErrorListener cameraErrorListener;

    @NotNull
    private final CameraDeviceWrapper device;

    @NotNull
    private final h extensionSession;
    private final CameraInterop.CaptureSessionListener interopCaptureSessionListener;

    @NotNull
    private final CameraExtensionSessionWrapper.StateCallback stateCallback;

    public AndroidExtensionSessionStateCallback(@NotNull CameraDeviceWrapper device, @NotNull CameraExtensionSessionWrapper.StateCallback stateCallback, SessionStateCallback sessionStateCallback, @NotNull CameraErrorListener cameraErrorListener, CameraInterop.CaptureSessionListener captureSessionListener, @NotNull Executor callbackExecutor) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(stateCallback, "stateCallback");
        Intrinsics.checkNotNullParameter(cameraErrorListener, "cameraErrorListener");
        Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.device = device;
        this.stateCallback = stateCallback;
        this.cameraErrorListener = cameraErrorListener;
        this.interopCaptureSessionListener = captureSessionListener;
        this.callbackExecutor = callbackExecutor;
        this._lastStateCallback = hx7.b.j(sessionStateCallback);
        this.extensionSession = hx7.b.j(null);
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

    private final CameraExtensionSessionWrapper getWrapped(CameraExtensionSession session, CameraErrorListener cameraErrorListener) {
        CameraExtensionSessionWrapper cameraExtensionSessionWrapper = (CameraExtensionSessionWrapper) this.extensionSession.f254900a;
        if (cameraExtensionSessionWrapper != null) {
            return cameraExtensionSessionWrapper;
        }
        CameraExtensionSessionWrapper cameraExtensionSessionWrapperWrapSession = wrapSession(session, cameraErrorListener);
        if (this.extensionSession.a(null, cameraExtensionSessionWrapperWrapSession)) {
            return cameraExtensionSessionWrapperWrapSession;
        }
        Object obj2 = this.extensionSession.f254900a;
        Intrinsics.h(obj2);
        return (CameraExtensionSessionWrapper) obj2;
    }

    private final CameraExtensionSessionWrapper wrapSession(CameraExtensionSession session, CameraErrorListener cameraErrorListener) {
        return new AndroidCameraExtensionSession(this.device, session, cameraErrorListener, this.callbackExecutor);
    }

    public void onClosed(@NotNull CameraExtensionSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        CameraExtensionSessionWrapper wrapped = getWrapped(session, this.cameraErrorListener);
        this.stateCallback.onClosed(getWrapped(session, this.cameraErrorListener));
        finalizeSession();
        CameraInterop.CaptureSessionListener captureSessionListener = this.interopCaptureSessionListener;
        if (captureSessionListener != null) {
            captureSessionListener.mo27onClosedrphkYDA(this.device.getCameraId(), wrapped.getId());
        }
    }

    public void onConfigureFailed(@NotNull CameraExtensionSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        CameraExtensionSessionWrapper wrapped = getWrapped(session, this.cameraErrorListener);
        this.stateCallback.onConfigureFailed(wrapped);
        finalizeSession();
        CameraInterop.CaptureSessionListener captureSessionListener = this.interopCaptureSessionListener;
        if (captureSessionListener != null) {
            captureSessionListener.mo28onConfigureFailedrphkYDA(this.device.getCameraId(), wrapped.getId());
        }
    }

    public void onConfigured(@NotNull CameraExtensionSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        CameraExtensionSessionWrapper wrapped = getWrapped(session, this.cameraErrorListener);
        this.stateCallback.onConfigured(wrapped);
        finalizeLastSession();
        CameraInterop.CaptureSessionListener captureSessionListener = this.interopCaptureSessionListener;
        if (captureSessionListener != null) {
            captureSessionListener.mo29onConfiguredrphkYDA(this.device.getCameraId(), wrapped.getId());
        }
    }
}
