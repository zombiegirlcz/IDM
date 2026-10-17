package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.pipe.CameraInterop;
import androidx.camera.core.impl.SessionConfig;
import hx7.b;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rkm.h;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository;", "", "<init>", "()V", "_deviceStateCallback", "Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository$CameraDeviceStateCallbacks;", "_sessionStateCallback", "Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository$CaptureSessionStateCallbacks;", "updateCallbacks", "", "sessionConfig", "Landroidx/camera/core/impl/SessionConfig;", "deviceStateCallback", "getDeviceStateCallback", "()Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository$CameraDeviceStateCallbacks;", "sessionStateCallback", "Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;", "getSessionStateCallback", "()Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;", "CameraDeviceStateCallbacks", "CaptureSessionStateCallbacks", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraInteropStateCallbackRepository {

    @NotNull
    private final CameraDeviceStateCallbacks _deviceStateCallback = new CameraDeviceStateCallbacks();

    @NotNull
    private final CaptureSessionStateCallbacks _sessionStateCallback = new CaptureSessionStateCallbacks();

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00150\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository$CameraDeviceStateCallbacks;", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "<init>", "()V", "Landroidx/camera/core/impl/SessionConfig;", "sessionConfig", "", "updateCallbacks$camera_camera2", "(Landroidx/camera/core/impl/SessionConfig;)V", "updateCallbacks", "Landroid/hardware/camera2/CameraDevice;", "cameraDevice", "onOpened", "(Landroid/hardware/camera2/CameraDevice;)V", "onClosed", "onDisconnected", "", "errorCode", "onError", "(Landroid/hardware/camera2/CameraDevice;I)V", "Lrkm/h;", "", "callbacks", "Lrkm/h;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CameraDeviceStateCallbacks extends CameraDevice.StateCallback {

        @NotNull
        private h callbacks = b.j(f0.f322471a);

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(@NotNull CameraDevice cameraDevice) {
            Intrinsics.checkNotNullParameter(cameraDevice, "cameraDevice");
            Iterator it8 = ((List) this.callbacks.f254900a).iterator();
            while (it8.hasNext()) {
                ((CameraDevice.StateCallback) it8.next()).onClosed(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(@NotNull CameraDevice cameraDevice) {
            Intrinsics.checkNotNullParameter(cameraDevice, "cameraDevice");
            Iterator it8 = ((List) this.callbacks.f254900a).iterator();
            while (it8.hasNext()) {
                ((CameraDevice.StateCallback) it8.next()).onDisconnected(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(@NotNull CameraDevice cameraDevice, int errorCode) {
            Intrinsics.checkNotNullParameter(cameraDevice, "cameraDevice");
            Iterator it8 = ((List) this.callbacks.f254900a).iterator();
            while (it8.hasNext()) {
                ((CameraDevice.StateCallback) it8.next()).onError(cameraDevice, errorCode);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(@NotNull CameraDevice cameraDevice) {
            Intrinsics.checkNotNullParameter(cameraDevice, "cameraDevice");
            Iterator it8 = ((List) this.callbacks.f254900a).iterator();
            while (it8.hasNext()) {
                ((CameraDevice.StateCallback) it8.next()).onOpened(cameraDevice);
            }
        }

        public final void updateCallbacks$camera_camera2(@NotNull SessionConfig sessionConfig) {
            Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
            h hVar = this.callbacks;
            List<CameraDevice.StateCallback> deviceStateCallbacks = sessionConfig.getDeviceStateCallbacks();
            Intrinsics.checkNotNullExpressionValue(deviceStateCallbacks, "getDeviceStateCallbacks(...)");
            hVar.f254900a = d0.d1(deviceStateCallbacks);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u000fR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository$CaptureSessionStateCallbacks;", "Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;", "<init>", "()V", "Landroidx/camera/core/impl/SessionConfig;", "sessionConfig", "", "updateCallbacks$camera_camera2", "(Landroidx/camera/core/impl/SessionConfig;)V", "updateCallbacks", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "Landroidx/camera/camera2/pipe/CameraInterop$CameraCaptureSessionId;", "captureSessionId", "onConfigured-rphkYDA", "(Ljava/lang/String;I)V", "onConfigured", "onConfigureFailed-rphkYDA", "onConfigureFailed", "onReady-rphkYDA", "onReady", "onActive-rphkYDA", "onActive", "onCaptureQueueEmpty-rphkYDA", "onCaptureQueueEmpty", "onClosed-rphkYDA", "onClosed", "Landroidx/camera/camera2/impl/RejectOperationCameraCaptureSession;", "placeholderSession", "Landroidx/camera/camera2/impl/RejectOperationCameraCaptureSession;", "Lrkm/h;", "", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "callbacks", "Lrkm/h;", "Api26CompatImpl", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CaptureSessionStateCallbacks implements CameraInterop.CaptureSessionListener {

        @NotNull
        private final RejectOperationCameraCaptureSession placeholderSession = new RejectOperationCameraCaptureSession();

        @NotNull
        private h callbacks = b.j(f0.f322471a);

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository$CaptureSessionStateCallbacks$Api26CompatImpl;", "", "<init>", "()V", "Landroid/hardware/camera2/CameraCaptureSession;", ib.b.Session, "Lrkm/h;", "", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "callbacks", "", "onCaptureQueueEmpty", "(Landroid/hardware/camera2/CameraCaptureSession;Lrkm/h;)V", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Api26CompatImpl {

            @NotNull
            public static final Api26CompatImpl INSTANCE = new Api26CompatImpl();

            private Api26CompatImpl() {
            }

            public static final void onCaptureQueueEmpty(@NotNull CameraCaptureSession session, @NotNull h callbacks) {
                Intrinsics.checkNotNullParameter(session, "session");
                Intrinsics.checkNotNullParameter(callbacks, "callbacks");
                Iterator it8 = ((List) callbacks.f254900a).iterator();
                while (it8.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it8.next()).onCaptureQueueEmpty(session);
                }
            }
        }

        @Override // androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener
        /* JADX INFO: renamed from: onActive-rphkYDA, reason: not valid java name */
        public void mo25onActiverphkYDA(@NotNull String cameraId, int captureSessionId) {
            Intrinsics.checkNotNullParameter(cameraId, "cameraId");
            Iterator it8 = ((List) this.callbacks.f254900a).iterator();
            while (it8.hasNext()) {
                ((CameraCaptureSession.StateCallback) it8.next()).onActive(this.placeholderSession);
            }
        }

        @Override // androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener
        /* JADX INFO: renamed from: onCaptureQueueEmpty-rphkYDA, reason: not valid java name */
        public void mo26onCaptureQueueEmptyrphkYDA(@NotNull String cameraId, int captureSessionId) {
            Intrinsics.checkNotNullParameter(cameraId, "cameraId");
            Api26CompatImpl.onCaptureQueueEmpty(this.placeholderSession, this.callbacks);
        }

        @Override // androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener
        /* JADX INFO: renamed from: onClosed-rphkYDA, reason: not valid java name */
        public void mo27onClosedrphkYDA(@NotNull String cameraId, int captureSessionId) {
            Intrinsics.checkNotNullParameter(cameraId, "cameraId");
            Iterator it8 = ((List) this.callbacks.f254900a).iterator();
            while (it8.hasNext()) {
                ((CameraCaptureSession.StateCallback) it8.next()).onClosed(this.placeholderSession);
            }
        }

        @Override // androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener
        /* JADX INFO: renamed from: onConfigureFailed-rphkYDA, reason: not valid java name */
        public void mo28onConfigureFailedrphkYDA(@NotNull String cameraId, int captureSessionId) {
            Intrinsics.checkNotNullParameter(cameraId, "cameraId");
            Iterator it8 = ((List) this.callbacks.f254900a).iterator();
            while (it8.hasNext()) {
                ((CameraCaptureSession.StateCallback) it8.next()).onConfigureFailed(this.placeholderSession);
            }
        }

        @Override // androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener
        /* JADX INFO: renamed from: onConfigured-rphkYDA, reason: not valid java name */
        public void mo29onConfiguredrphkYDA(@NotNull String cameraId, int captureSessionId) {
            Intrinsics.checkNotNullParameter(cameraId, "cameraId");
            Iterator it8 = ((List) this.callbacks.f254900a).iterator();
            while (it8.hasNext()) {
                ((CameraCaptureSession.StateCallback) it8.next()).onConfigured(this.placeholderSession);
            }
        }

        @Override // androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener
        /* JADX INFO: renamed from: onReady-rphkYDA, reason: not valid java name */
        public void mo30onReadyrphkYDA(@NotNull String cameraId, int captureSessionId) {
            Intrinsics.checkNotNullParameter(cameraId, "cameraId");
            Iterator it8 = ((List) this.callbacks.f254900a).iterator();
            while (it8.hasNext()) {
                ((CameraCaptureSession.StateCallback) it8.next()).onReady(this.placeholderSession);
            }
        }

        public final void updateCallbacks$camera_camera2(@NotNull SessionConfig sessionConfig) {
            Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
            h hVar = this.callbacks;
            List<CameraCaptureSession.StateCallback> sessionStateCallbacks = sessionConfig.getSessionStateCallbacks();
            Intrinsics.checkNotNullExpressionValue(sessionStateCallbacks, "getSessionStateCallbacks(...)");
            hVar.f254900a = d0.d1(sessionStateCallbacks);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getDeviceStateCallback, reason: from getter */
    public final CameraDeviceStateCallbacks get_deviceStateCallback() {
        return this._deviceStateCallback;
    }

    @NotNull
    public final CameraInterop.CaptureSessionListener getSessionStateCallback() {
        return this._sessionStateCallback;
    }

    public final void updateCallbacks(@NotNull SessionConfig sessionConfig) {
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        this._deviceStateCallback.updateCallbacks$camera_camera2(sessionConfig);
        this._sessionStateCallback.updateCallbacks$camera_camera2(sessionConfig);
    }
}
