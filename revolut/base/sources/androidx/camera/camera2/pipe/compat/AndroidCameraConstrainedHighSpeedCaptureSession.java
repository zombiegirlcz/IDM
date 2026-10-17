package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.os.Trace;
import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import ib.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J'\u0010\u0011\u001a\u0004\u0018\u0001H\u0012\"\b\b\u0000\u0010\u0012*\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0015H\u0016¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidCameraConstrainedHighSpeedCaptureSession;", "Landroidx/camera/camera2/pipe/compat/AndroidCameraCaptureSession;", "Landroidx/camera/camera2/pipe/compat/CameraConstrainedHighSpeedCaptureSessionWrapper;", "device", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", b.Session, "Landroid/hardware/camera2/CameraConstrainedHighSpeedCaptureSession;", "cameraErrorListener", "Landroidx/camera/camera2/pipe/internal/CameraErrorListener;", "callbackHandler", "Landroid/os/Handler;", "<init>", "(Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;Landroid/hardware/camera2/CameraConstrainedHighSpeedCaptureSession;Landroidx/camera/camera2/pipe/internal/CameraErrorListener;Landroid/os/Handler;)V", "createHighSpeedRequestList", "", "Landroid/hardware/camera2/CaptureRequest;", "request", "unwrapAs", "T", "", "type", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidCameraConstrainedHighSpeedCaptureSession extends AndroidCameraCaptureSession implements CameraConstrainedHighSpeedCaptureSessionWrapper {

    @NotNull
    private final CameraConstrainedHighSpeedCaptureSession session;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCameraConstrainedHighSpeedCaptureSession(@NotNull CameraDeviceWrapper device, @NotNull CameraConstrainedHighSpeedCaptureSession session, @NotNull CameraErrorListener cameraErrorListener, @NotNull Handler callbackHandler) {
        super(device, session, cameraErrorListener, callbackHandler);
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(cameraErrorListener, "cameraErrorListener");
        Intrinsics.checkNotNullParameter(callbackHandler, "callbackHandler");
        this.session = session;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraConstrainedHighSpeedCaptureSessionWrapper
    public List<CaptureRequest> createHighSpeedRequestList(@NotNull CaptureRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            Debug debug = Debug.INSTANCE;
            try {
                Trace.beginSection("CXCP#createHighSpeedRequestList");
                return this.session.createHighSpeedRequestList(request);
            } finally {
                Trace.endSection();
            }
        } catch (IllegalArgumentException unused) {
            if (!Log.INSTANCE.getWARN_LOGGABLE()) {
                return null;
            }
            String str = "Failed to createHighSpeedRequestList from " + getDevice() + " because the output surface was destroyed before calling createHighSpeedRequestList.";
            return null;
        } catch (IllegalStateException unused2) {
            if (!Log.INSTANCE.getWARN_LOGGABLE()) {
                return null;
            }
            String str2 = "Failed to createHighSpeedRequestList. " + getDevice() + " may be closed.";
            return null;
        } catch (UnsupportedOperationException unused3) {
            if (!Log.INSTANCE.getWARN_LOGGABLE()) {
                return null;
            }
            String str3 = "Failed to createHighSpeedRequestList from " + getDevice() + " because the output surface was not available.";
            return null;
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.AndroidCameraCaptureSession, androidx.camera.camera2.pipe.UnsafeWrapper
    public <T> T unwrapAs(@NotNull KClass type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return Intrinsics.f(type, o0.f186429a.b(CameraConstrainedHighSpeedCaptureSession.class)) ? (T) this.session : (T) super.unwrapAs(type);
    }
}
