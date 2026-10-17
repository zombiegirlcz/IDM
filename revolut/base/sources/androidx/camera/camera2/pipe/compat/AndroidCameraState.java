package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraDevice;
import android.os.Trace;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraInterop;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.camera2.pipe.core.DurationNs;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.SystemTimeSource;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.TimeSource;
import androidx.camera.camera2.pipe.core.TimestampNs;
import androidx.camera.camera2.pipe.core.Timestamps;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import ch.qos.logback.core.CoreConstants;
import gim.d;
import gim.i;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import m72.b;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001oBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b\"\u0010'J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020%H\u0002¢\u0006\u0004\b*\u0010+J%\u0010/\u001a\u00020,*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b-\u0010.J%\u00101\u001a\u00020,*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b0\u0010.J\r\u00102\u001a\u00020\u001f¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u001fH\u0086@¢\u0006\u0004\b4\u00105J\u0017\u0010:\u001a\u00020,2\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b=\u0010<J\u001f\u0010?\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020#2\u0006\u0010>\u001a\u00020\u0006H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\bA\u0010<J\u0017\u0010C\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\bB\u0010<J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010I\u001a\u0004\bJ\u0010HR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010K\u001a\u0004\bL\u0010MR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010NR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010OR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010PR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010QR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010RR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010SR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010TR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010UR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010VR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010WR\u0014\u0010X\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010NR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u00020,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010^\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010`\u001a\u00020,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b`\u0010]R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010d\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010OR\u0018\u0010e\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020h0g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0017\u0010n\u001a\b\u0012\u0004\u0012\u00020h0k8F¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006p"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidCameraState;", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "Landroidx/camera/camera2/pipe/CameraMetadata;", "metadata", "", "attemptNumber", "Landroidx/camera/camera2/pipe/core/TimestampNs;", "attemptTimestampNanos", "Landroidx/camera/camera2/pipe/core/TimeSource;", "timeSource", "Landroidx/camera/camera2/pipe/internal/CameraErrorListener;", "cameraErrorListener", "Landroidx/camera/camera2/pipe/compat/Camera2DeviceCloser;", "camera2DeviceCloser", "Landroidx/camera/camera2/pipe/compat/Camera2Quirks;", "camera2Quirks", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Landroidx/camera/camera2/pipe/compat/AudioRestrictionController;", "audioRestrictionController", "interopCameraDeviceStateCallback", "Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;", "interopCaptureSessionListener", "<init>", "(Ljava/lang/String;Landroidx/camera/camera2/pipe/CameraMetadata;IJLandroidx/camera/camera2/pipe/core/TimeSource;Landroidx/camera/camera2/pipe/internal/CameraErrorListener;Landroidx/camera/camera2/pipe/compat/Camera2DeviceCloser;Landroidx/camera/camera2/pipe/compat/Camera2Quirks;Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/compat/AudioRestrictionController;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "throwable", "Landroidx/camera/camera2/pipe/CameraError;", "cameraError", "", "closeWith-8PWMtlg", "(Ljava/lang/Throwable;I)V", "closeWith", "Landroid/hardware/camera2/CameraDevice;", "cameraDevice", "Landroidx/camera/camera2/pipe/compat/AndroidCameraState$ClosingInfo;", "closeRequest", "(Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/pipe/compat/AndroidCameraState$ClosingInfo;)V", "closingInfo", "Landroidx/camera/camera2/pipe/compat/CameraStateClosed;", "computeClosedState", "(Landroidx/camera/camera2/pipe/compat/AndroidCameraState$ClosingInfo;)Landroidx/camera/camera2/pipe/compat/CameraStateClosed;", "", "shouldReopenCameraWhenClosing-_z0IXec", "(Landroidx/camera/camera2/pipe/compat/Camera2Quirks;Ljava/lang/String;Landroidx/camera/camera2/pipe/CameraError;)Z", "shouldReopenCameraWhenClosing", "shouldCreateEmptyCaptureSessionBeforeClosing-_z0IXec", "shouldCreateEmptyCaptureSessionBeforeClosing", "close", "()V", "awaitClosed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "timeoutMillis", "awaitCameraDeviceClosed$camera_camera2_pipe", "(J)Z", "awaitCameraDeviceClosed", "onOpened", "(Landroid/hardware/camera2/CameraDevice;)V", "onDisconnected", "errorCode", "onError", "(Landroid/hardware/camera2/CameraDevice;I)V", "onClosed", "onFinalized$camera_camera2_pipe", "onFinalized", "closeWith$camera_camera2_pipe", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getCameraId-Dz_R5H8", "Landroidx/camera/camera2/pipe/CameraMetadata;", "getMetadata", "()Landroidx/camera/camera2/pipe/CameraMetadata;", "I", "J", "Landroidx/camera/camera2/pipe/core/TimeSource;", "Landroidx/camera/camera2/pipe/internal/CameraErrorListener;", "Landroidx/camera/camera2/pipe/compat/Camera2DeviceCloser;", "Landroidx/camera/camera2/pipe/compat/Camera2Quirks;", "Landroidx/camera/camera2/pipe/core/Threads;", "Landroidx/camera/camera2/pipe/compat/AudioRestrictionController;", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;", "debugId", "", "lock", "Ljava/lang/Object;", "opening", "Z", "pendingClose", "Landroidx/camera/camera2/pipe/compat/AndroidCameraState$ClosingInfo;", "shouldDelayFinalizing", "Ljava/util/concurrent/CountDownLatch;", "cameraDeviceClosed", "Ljava/util/concurrent/CountDownLatch;", "requestTimestampNanos", "openTimestampNanos", "Landroidx/camera/camera2/pipe/core/TimestampNs;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/camera/camera2/pipe/compat/CameraState;", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "state", "ClosingInfo", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidCameraState extends CameraDevice.StateCallback {

    @NotNull
    private final MutableStateFlow _state;
    private final int attemptNumber;
    private final long attemptTimestampNanos;

    @NotNull
    private final AudioRestrictionController audioRestrictionController;

    @NotNull
    private final Camera2DeviceCloser camera2DeviceCloser;

    @NotNull
    private final Camera2Quirks camera2Quirks;

    @NotNull
    private final CountDownLatch cameraDeviceClosed;

    @NotNull
    private final CameraErrorListener cameraErrorListener;

    @NotNull
    private final String cameraId;
    private final int debugId;
    private final CameraDevice.StateCallback interopCameraDeviceStateCallback;
    private final CameraInterop.CaptureSessionListener interopCaptureSessionListener;

    @NotNull
    private final Object lock;

    @NotNull
    private final CameraMetadata metadata;
    private TimestampNs openTimestampNanos;
    private boolean opening;
    private ClosingInfo pendingClose;
    private final long requestTimestampNanos;
    private boolean shouldDelayFinalizing;

    @NotNull
    private final Threads threads;

    @NotNull
    private final TimeSource timeSource;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidCameraState$ClosingInfo;", "", "Landroidx/camera/camera2/pipe/compat/ClosedReason;", "reason", "Landroidx/camera/camera2/pipe/core/TimestampNs;", "closingTimestamp", "Landroidx/camera/camera2/pipe/CameraError;", "errorCode", "", "exception", "<init>", "(Landroidx/camera/camera2/pipe/compat/ClosedReason;JLandroidx/camera/camera2/pipe/CameraError;Ljava/lang/Throwable;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/camera/camera2/pipe/compat/ClosedReason;", "getReason", "()Landroidx/camera/camera2/pipe/compat/ClosedReason;", "J", "getClosingTimestamp-vQl9yQU", "()J", "Landroidx/camera/camera2/pipe/CameraError;", "getErrorCode-mVEW8x0", "()Landroidx/camera/camera2/pipe/CameraError;", "Ljava/lang/Throwable;", "getException", "()Ljava/lang/Throwable;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ClosingInfo {
        private final long closingTimestamp;
        private final CameraError errorCode;
        private final Throwable exception;

        @NotNull
        private final ClosedReason reason;

        public /* synthetic */ ClosingInfo(ClosedReason closedReason, long j2, CameraError cameraError, Throwable th10, DefaultConstructorMarker defaultConstructorMarker) {
            this(closedReason, j2, cameraError, th10);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClosingInfo)) {
                return false;
            }
            ClosingInfo closingInfo = (ClosingInfo) other;
            return this.reason == closingInfo.reason && TimestampNs.m445equalsimpl0(this.closingTimestamp, closingInfo.closingTimestamp) && Intrinsics.f(this.errorCode, closingInfo.errorCode) && Intrinsics.f(this.exception, closingInfo.exception);
        }

        /* JADX INFO: renamed from: getClosingTimestamp-vQl9yQU, reason: not valid java name and from getter */
        public final long getClosingTimestamp() {
            return this.closingTimestamp;
        }

        /* JADX INFO: renamed from: getErrorCode-mVEW8x0, reason: not valid java name and from getter */
        public final CameraError getErrorCode() {
            return this.errorCode;
        }

        public final Throwable getException() {
            return this.exception;
        }

        @NotNull
        public final ClosedReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            int iM446hashCodeimpl = (TimestampNs.m446hashCodeimpl(this.closingTimestamp) + (this.reason.hashCode() * 31)) * 31;
            CameraError cameraError = this.errorCode;
            int iM133hashCodeimpl = (iM446hashCodeimpl + (cameraError == null ? 0 : CameraError.m133hashCodeimpl(cameraError.getValue()))) * 31;
            Throwable th10 = this.exception;
            return iM133hashCodeimpl + (th10 != null ? th10.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ClosingInfo(reason=" + this.reason + ", closingTimestamp=" + ((Object) TimestampNs.m447toStringimpl(this.closingTimestamp)) + ", errorCode=" + this.errorCode + ", exception=" + this.exception + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        private ClosingInfo(ClosedReason reason, long j2, CameraError cameraError, Throwable th10) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
            this.closingTimestamp = j2;
            this.errorCode = cameraError;
            this.exception = th10;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ClosingInfo(ClosedReason closedReason, long j2, CameraError cameraError, Throwable th10, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                Timestamps timestamps = Timestamps.INSTANCE;
                j2 = new SystemTimeSource().mo441nowvQl9yQU();
            }
            this(closedReason, j2, (i & 4) != 0 ? null : cameraError, (i & 8) != 0 ? null : th10, null);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.compat.AndroidCameraState$awaitClosed$2, reason: invalid class name */
    @d(c = "androidx.camera.camera2.pipe.compat.AndroidCameraState$awaitClosed$2", f = "VirtualCamera.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/camera/camera2/pipe/compat/CameraState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<CameraState, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj2;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CameraState cameraState, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(cameraState, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return Boolean.valueOf(((CameraState) this.L$0) instanceof CameraStateClosed);
        }
    }

    public /* synthetic */ AndroidCameraState(String str, CameraMetadata cameraMetadata, int i, long j2, TimeSource timeSource, CameraErrorListener cameraErrorListener, Camera2DeviceCloser camera2DeviceCloser, Camera2Quirks camera2Quirks, Threads threads, AudioRestrictionController audioRestrictionController, CameraDevice.StateCallback stateCallback, CameraInterop.CaptureSessionListener captureSessionListener, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cameraMetadata, i, j2, timeSource, cameraErrorListener, camera2DeviceCloser, camera2Quirks, threads, audioRestrictionController, stateCallback, captureSessionListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void closeWith(android.hardware.camera2.CameraDevice r11, androidx.camera.camera2.pipe.compat.AndroidCameraState.ClosingInfo r12) throws java.lang.Throwable {
        /*
            r10 = this;
            kotlinx.coroutines.flow.MutableStateFlow r0 = r10._state
            java.lang.Object r0 = r0.getValue()
            androidx.camera.camera2.pipe.compat.CameraState r0 = (androidx.camera.camera2.pipe.compat.CameraState) r0
            boolean r1 = r0 instanceof androidx.camera.camera2.pipe.compat.CameraStateOpen
            r2 = 0
            if (r1 == 0) goto L15
            androidx.camera.camera2.pipe.compat.CameraStateOpen r0 = (androidx.camera.camera2.pipe.compat.CameraStateOpen) r0
            androidx.camera.camera2.pipe.compat.CameraDeviceWrapper r0 = r0.getCameraDevice()
            r4 = r0
            goto L16
        L15:
            r4 = r2
        L16:
            java.lang.Object r1 = r10.lock
            monitor-enter(r1)
            androidx.camera.camera2.pipe.compat.AndroidCameraState$ClosingInfo r0 = r10.pendingClose     // Catch: java.lang.Throwable -> La0
            if (r0 != 0) goto L29
            r10.pendingClose = r12     // Catch: java.lang.Throwable -> L24
            boolean r0 = r10.opening     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L29
            goto L2a
        L24:
            r0 = move-exception
            r11 = r0
            r6 = r10
            goto La3
        L29:
            r12 = r2
        L2a:
            monitor-exit(r1)
            if (r12 == 0) goto L9e
            androidx.camera.camera2.pipe.CameraError r0 = r12.getErrorCode()
            if (r0 == 0) goto L4b
            androidx.camera.camera2.pipe.compat.ClosedReason r0 = r12.getReason()
            androidx.camera.camera2.pipe.compat.ClosedReason r1 = androidx.camera.camera2.pipe.compat.ClosedReason.CAMERA2_EXCEPTION
            if (r0 == r1) goto L4b
            androidx.camera.camera2.pipe.internal.CameraErrorListener r0 = r10.cameraErrorListener
            java.lang.String r1 = r10.cameraId
            androidx.camera.camera2.pipe.CameraError r3 = r12.getErrorCode()
            int r3 = r3.getValue()
            r5 = 0
            r0.mo396onCameraError3M5Xam4(r1, r3, r5)
        L4b:
            kotlinx.coroutines.flow.MutableStateFlow r0 = r10._state
            androidx.camera.camera2.pipe.compat.CameraStateClosing r1 = new androidx.camera.camera2.pipe.compat.CameraStateClosing
            androidx.camera.camera2.pipe.CameraError r3 = r12.getErrorCode()
            r1.<init>(r3, r2)
            r0.setValue(r1)
            androidx.camera.camera2.pipe.compat.ClosedReason r0 = r12.getReason()
            androidx.camera.camera2.pipe.compat.ClosedReason r1 = androidx.camera.camera2.pipe.compat.ClosedReason.CAMERA2_CLOSED
            if (r0 == r1) goto L93
            androidx.camera.camera2.pipe.compat.Camera2Quirks r0 = r10.camera2Quirks
            java.lang.String r1 = r10.cameraId
            androidx.camera.camera2.pipe.CameraError r2 = r12.getErrorCode()
            boolean r8 = r10.m369shouldReopenCameraWhenClosing_z0IXec(r0, r1, r2)
            if (r8 == 0) goto L7d
            java.lang.Object r1 = r10.lock
            monitor-enter(r1)
            r0 = 1
            r10.shouldDelayFinalizing = r0     // Catch: java.lang.Throwable -> L79
            kotlin.Unit r0 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L79
            monitor-exit(r1)
            goto L7d
        L79:
            r0 = move-exception
            r11 = r0
            monitor-exit(r1)
            throw r11
        L7d:
            androidx.camera.camera2.pipe.compat.Camera2DeviceCloser r3 = r10.camera2DeviceCloser
            androidx.camera.camera2.pipe.compat.AudioRestrictionController r7 = r10.audioRestrictionController
            androidx.camera.camera2.pipe.compat.Camera2Quirks r0 = r10.camera2Quirks
            java.lang.String r1 = r10.cameraId
            androidx.camera.camera2.pipe.CameraError r2 = r12.getErrorCode()
            boolean r9 = r10.m368shouldCreateEmptyCaptureSessionBeforeClosing_z0IXec(r0, r1, r2)
            r6 = r10
            r5 = r11
            r3.closeCamera(r4, r5, r6, r7, r8, r9)
            goto L94
        L93:
            r6 = r10
        L94:
            kotlinx.coroutines.flow.MutableStateFlow r11 = r6._state
            androidx.camera.camera2.pipe.compat.CameraStateClosed r12 = r10.computeClosedState(r12)
            r11.setValue(r12)
            return
        L9e:
            r6 = r10
            return
        La0:
            r0 = move-exception
            r6 = r10
            r11 = r0
        La3:
            monitor-exit(r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.AndroidCameraState.closeWith(android.hardware.camera2.CameraDevice, androidx.camera.camera2.pipe.compat.AndroidCameraState$ClosingInfo):void");
    }

    /* JADX INFO: renamed from: closeWith-8PWMtlg, reason: not valid java name */
    private final void m367closeWith8PWMtlg(Throwable throwable, int cameraError) throws Throwable {
        closeWith(null, new ClosingInfo(ClosedReason.CAMERA2_EXCEPTION, 0L, CameraError.m129boximpl(cameraError), throwable, 2, null));
    }

    private final CameraStateClosed computeClosedState(ClosingInfo closingInfo) {
        Timestamps timestamps = Timestamps.INSTANCE;
        long jMo441nowvQl9yQU = this.timeSource.mo441nowvQl9yQU();
        TimestampNs timestampNs = this.openTimestampNanos;
        long closingTimestamp = closingInfo.getClosingTimestamp();
        DurationNs durationNsM434boximpl = timestampNs != null ? DurationNs.m434boximpl(DurationNs.m436constructorimpl(timestampNs.getValue() - this.attemptTimestampNanos)) : null;
        DurationNs durationNsM434boximpl2 = timestampNs != null ? DurationNs.m434boximpl(DurationNs.m436constructorimpl(timestampNs.getValue() - this.requestTimestampNanos)) : null;
        DurationNs durationNsM434boximpl3 = timestampNs != null ? DurationNs.m434boximpl(DurationNs.m436constructorimpl(closingTimestamp - timestampNs.getValue())) : null;
        long jM436constructorimpl = DurationNs.m436constructorimpl(jMo441nowvQl9yQU - closingTimestamp);
        return new CameraStateClosed(this.cameraId, closingInfo.getReason(), Integer.valueOf(this.attemptNumber - 1), durationNsM434boximpl, closingInfo.getException(), durationNsM434boximpl2, durationNsM434boximpl3, DurationNs.m434boximpl(jM436constructorimpl), closingInfo.getErrorCode(), null);
    }

    /* JADX INFO: renamed from: shouldCreateEmptyCaptureSessionBeforeClosing-_z0IXec, reason: not valid java name */
    private final boolean m368shouldCreateEmptyCaptureSessionBeforeClosing_z0IXec(Camera2Quirks camera2Quirks, String str, CameraError cameraError) {
        return camera2Quirks.m409xfcf3eba9(str) && cameraError == null;
    }

    /* JADX INFO: renamed from: shouldReopenCameraWhenClosing-_z0IXec, reason: not valid java name */
    private final boolean m369shouldReopenCameraWhenClosing_z0IXec(Camera2Quirks camera2Quirks, String str, CameraError cameraError) {
        return m368shouldCreateEmptyCaptureSessionBeforeClosing_z0IXec(camera2Quirks, str, cameraError) && camera2Quirks.m408x552c1673(str);
    }

    public final boolean awaitCameraDeviceClosed$camera_camera2_pipe(long timeoutMillis) {
        return this.cameraDeviceClosed.await(timeoutMillis, TimeUnit.MILLISECONDS);
    }

    public final Object awaitClosed(@NotNull Continuation<? super Unit> continuation) {
        Object objY = q.y(getState(), new AnonymousClass2(null), continuation);
        return objY == fim.a.COROUTINE_SUSPENDED ? objY : Unit.f186387a;
    }

    public final void close() throws Throwable {
        CameraState cameraState = (CameraState) this._state.getValue();
        CameraDeviceWrapper cameraDevice = cameraState instanceof CameraStateOpen ? ((CameraStateOpen) cameraState).getCameraDevice() : null;
        closeWith(cameraDevice != null ? (CameraDevice) cameraDevice.unwrapAs(o0.f186429a.b(CameraDevice.class)) : null, new ClosingInfo(ClosedReason.APP_CLOSED, 0L, null, null, 14, null));
    }

    public final void closeWith$camera_camera2_pipe(@NotNull Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        CameraError.Companion companion = CameraError.INSTANCE;
        int iM139fromPVuDhNw$camera_camera2_pipe = companion.m139fromPVuDhNw$camera_camera2_pipe(throwable);
        if (CameraError.m132equalsimpl0(iM139fromPVuDhNw$camera_camera2_pipe, companion.m152getERROR_UNDETERMINEDv7Vf74A())) {
            return;
        }
        m367closeWith8PWMtlg(throwable, iM139fromPVuDhNw$camera_camera2_pipe);
    }

    @NotNull
    /* JADX INFO: renamed from: getCameraId-Dz_R5H8, reason: not valid java name and from getter */
    public final String getCameraId() {
        return this.cameraId;
    }

    @NotNull
    public final StateFlow getState() {
        return this._state;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onClosed(@NotNull CameraDevice cameraDevice) throws Throwable {
        Intrinsics.checkNotNullParameter(cameraDevice, "cameraDevice");
        if (!Intrinsics.f(cameraDevice.getId(), this.cameraId)) {
            throw new IllegalStateException("Check failed.");
        }
        Log log2 = Log.INSTANCE;
        if (log2.getDEBUG_LOGGABLE()) {
            String str = ((Object) CameraId.m186toStringimpl(getCameraId())) + ": onClosed";
        }
        this.cameraDeviceClosed.countDown();
        synchronized (this.lock) {
            if (!this.shouldDelayFinalizing) {
                Unit unit = Unit.f186387a;
                onFinalized$camera_camera2_pipe(cameraDevice);
                return;
            }
            if (log2.getINFO_LOGGABLE()) {
                String str2 = this + "#onClosed: Delaying finalizing.";
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onDisconnected(@NotNull CameraDevice cameraDevice) throws Throwable {
        Intrinsics.checkNotNullParameter(cameraDevice, "cameraDevice");
        if (!Intrinsics.f(cameraDevice.getId(), this.cameraId)) {
            throw new IllegalStateException("Check failed.");
        }
        Debug debug = Debug.INSTANCE;
        Trace.beginSection(((Object) CameraId.m186toStringimpl(getCameraId())) + "#onDisconnected");
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            String str = ((Object) CameraId.m186toStringimpl(getCameraId())) + ": onDisconnected";
        }
        this.cameraDeviceClosed.countDown();
        closeWith(cameraDevice, new ClosingInfo(ClosedReason.CAMERA2_DISCONNECTED, 0L, CameraError.m129boximpl(CameraError.INSTANCE.m142getERROR_CAMERA_DISCONNECTEDv7Vf74A()), null, 10, null));
        CameraDevice.StateCallback stateCallback = this.interopCameraDeviceStateCallback;
        if (stateCallback != null) {
            stateCallback.onDisconnected(cameraDevice);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onError(@NotNull CameraDevice cameraDevice, int errorCode) throws Throwable {
        Intrinsics.checkNotNullParameter(cameraDevice, "cameraDevice");
        if (!Intrinsics.f(cameraDevice.getId(), this.cameraId)) {
            throw new IllegalStateException("Check failed.");
        }
        Debug debug = Debug.INSTANCE;
        Trace.beginSection(((Object) CameraId.m186toStringimpl(getCameraId())) + "#onError-" + errorCode);
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            String str = ((Object) CameraId.m186toStringimpl(getCameraId())) + ": onError " + errorCode;
        }
        this.cameraDeviceClosed.countDown();
        closeWith(cameraDevice, new ClosingInfo(ClosedReason.CAMERA2_ERROR, 0L, CameraError.m129boximpl(CameraError.INSTANCE.m137fromPVuDhNw$camera_camera2_pipe(errorCode)), null, 10, null));
        CameraDevice.StateCallback stateCallback = this.interopCameraDeviceStateCallback;
        if (stateCallback != null) {
            stateCallback.onError(cameraDevice, errorCode);
        }
        Trace.endSection();
    }

    public final void onFinalized$camera_camera2_pipe(@NotNull CameraDevice cameraDevice) throws Throwable {
        Intrinsics.checkNotNullParameter(cameraDevice, "cameraDevice");
        Debug debug = Debug.INSTANCE;
        Trace.beginSection(((Object) CameraId.m186toStringimpl(getCameraId())) + "#onFinalized");
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            String str = this + ": onFinalized";
        }
        closeWith(cameraDevice, new ClosingInfo(ClosedReason.CAMERA2_CLOSED, 0L, null, null, 14, null));
        CameraDevice.StateCallback stateCallback = this.interopCameraDeviceStateCallback;
        if (stateCallback != null) {
            stateCallback.onClosed(cameraDevice);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onOpened(@NotNull CameraDevice cameraDevice) {
        ClosingInfo closingInfo;
        ClosingInfo closingInfo2;
        Intrinsics.checkNotNullParameter(cameraDevice, "cameraDevice");
        if (!Intrinsics.f(cameraDevice.getId(), this.cameraId)) {
            throw new IllegalStateException("Check failed.");
        }
        Timestamps timestamps = Timestamps.INSTANCE;
        long jMo441nowvQl9yQU = this.timeSource.mo441nowvQl9yQU();
        this.openTimestampNanos = TimestampNs.m442boximpl(jMo441nowvQl9yQU);
        Debug debug = Debug.INSTANCE;
        Trace.beginSection(((Object) CameraId.m186toStringimpl(getCameraId())) + "#onOpened");
        if (Log.INSTANCE.getINFO_LOGGABLE()) {
            long jM436constructorimpl = DurationNs.m436constructorimpl(jMo441nowvQl9yQU - this.requestTimestampNanos);
            long jM436constructorimpl2 = DurationNs.m436constructorimpl(jMo441nowvQl9yQU - this.attemptTimestampNanos);
            if (this.attemptNumber == 1) {
                String str = "Opened " + ((Object) CameraId.m186toStringimpl(getCameraId())) + " in " + b.t(new Object[]{Double.valueOf(jM436constructorimpl / 1000000.0d)}, 1, null, "%.3f ms", "format(...)");
            } else {
                String str2 = "Opened " + ((Object) CameraId.m186toStringimpl(getCameraId())) + " in " + b.t(new Object[]{Double.valueOf(jM436constructorimpl / 1000000.0d)}, 1, null, "%.3f ms", "format(...)") + " (" + b.t(new Object[]{Double.valueOf(jM436constructorimpl2 / 1000000.0d)}, 1, null, "%.3f ms", "format(...)") + " total) after " + this.attemptNumber + " attempts.";
            }
        }
        synchronized (this.lock) {
            closingInfo = this.pendingClose;
            if (closingInfo == null) {
                this.opening = true;
            }
        }
        CameraDevice.StateCallback stateCallback = this.interopCameraDeviceStateCallback;
        if (stateCallback != null) {
            stateCallback.onOpened(cameraDevice);
        }
        if (closingInfo != null) {
            Camera2DeviceCloser.closeCamera$default(this.camera2DeviceCloser, null, cameraDevice, this, this.audioRestrictionController, m369shouldReopenCameraWhenClosing_z0IXec(this.camera2Quirks, this.cameraId, closingInfo.getErrorCode()), m368shouldCreateEmptyCaptureSessionBeforeClosing_z0IXec(this.camera2Quirks, this.cameraId, closingInfo.getErrorCode()), 1, null);
            return;
        }
        AndroidCameraDevice androidCameraDevice = new AndroidCameraDevice(this.metadata, cameraDevice, this.cameraId, this.cameraErrorListener, this.interopCaptureSessionListener, this.threads, null);
        this.audioRestrictionController.addListener(androidCameraDevice);
        this._state.setValue(new CameraStateOpen(androidCameraDevice));
        synchronized (this.lock) {
            this.opening = false;
            closingInfo2 = this.pendingClose;
        }
        if (closingInfo2 != null) {
            this._state.setValue(new CameraStateClosing(closingInfo2.getErrorCode(), null));
            this.camera2DeviceCloser.closeCamera(androidCameraDevice, cameraDevice, this, this.audioRestrictionController, m369shouldReopenCameraWhenClosing_z0IXec(this.camera2Quirks, this.cameraId, closingInfo2.getErrorCode()), m368shouldCreateEmptyCaptureSessionBeforeClosing_z0IXec(this.camera2Quirks, this.cameraId, closingInfo2.getErrorCode()));
            this._state.setValue(computeClosedState(closingInfo2));
        }
        Trace.endSection();
    }

    @NotNull
    public String toString() {
        return "CameraState-" + this.debugId;
    }

    private AndroidCameraState(String cameraId, CameraMetadata metadata, int i, long j2, TimeSource timeSource, CameraErrorListener cameraErrorListener, Camera2DeviceCloser camera2DeviceCloser, Camera2Quirks camera2Quirks, Threads threads, AudioRestrictionController audioRestrictionController, CameraDevice.StateCallback stateCallback, CameraInterop.CaptureSessionListener captureSessionListener) {
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        Intrinsics.checkNotNullParameter(cameraErrorListener, "cameraErrorListener");
        Intrinsics.checkNotNullParameter(camera2DeviceCloser, "camera2DeviceCloser");
        Intrinsics.checkNotNullParameter(camera2Quirks, "camera2Quirks");
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(audioRestrictionController, "audioRestrictionController");
        this.cameraId = cameraId;
        this.metadata = metadata;
        this.attemptNumber = i;
        this.attemptTimestampNanos = j2;
        this.timeSource = timeSource;
        this.cameraErrorListener = cameraErrorListener;
        this.camera2DeviceCloser = camera2DeviceCloser;
        this.camera2Quirks = camera2Quirks;
        this.threads = threads;
        this.audioRestrictionController = audioRestrictionController;
        this.interopCameraDeviceStateCallback = stateCallback;
        this.interopCaptureSessionListener = captureSessionListener;
        rkm.d androidCameraDebugIds = VirtualCameraKt.getAndroidCameraDebugIds();
        androidCameraDebugIds.getClass();
        this.debugId = rkm.d.f254895b.incrementAndGet(androidCameraDebugIds);
        this.lock = new Object();
        this.cameraDeviceClosed = new CountDownLatch(1);
        this._state = q.c(CameraStateUnopened.INSTANCE);
        if (Log.INSTANCE.getINFO_LOGGABLE()) {
            String str = "Opening " + ((Object) CameraId.m186toStringimpl(getCameraId()));
        }
        if (i != 1) {
            Timestamps timestamps = Timestamps.INSTANCE;
            j2 = timeSource.mo441nowvQl9yQU();
        }
        this.requestTimestampNanos = j2;
    }
}
