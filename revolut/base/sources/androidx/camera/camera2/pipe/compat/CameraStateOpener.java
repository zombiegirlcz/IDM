package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.TimeSource;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.q;
import skm.r;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0080@¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010#\u001a\u00020 H\u0000¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020 0+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Landroidx/camera/camera2/pipe/compat/CameraStateOpener;", "", "Landroidx/camera/camera2/pipe/compat/CameraOpener;", "cameraOpener", "Landroidx/camera/camera2/pipe/compat/Camera2MetadataProvider;", "camera2MetadataProvider", "Landroidx/camera/camera2/pipe/internal/CameraErrorListener;", "cameraErrorListener", "Landroidx/camera/camera2/pipe/compat/Camera2Quirks;", "camera2Quirks", "Landroidx/camera/camera2/pipe/core/TimeSource;", "timeSource", "Landroidx/camera/camera2/pipe/CameraPipe$CameraInteropConfig;", "cameraInteropConfig", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "<init>", "(Landroidx/camera/camera2/pipe/compat/CameraOpener;Landroidx/camera/camera2/pipe/compat/Camera2MetadataProvider;Landroidx/camera/camera2/pipe/internal/CameraErrorListener;Landroidx/camera/camera2/pipe/compat/Camera2Quirks;Landroidx/camera/camera2/pipe/core/TimeSource;Landroidx/camera/camera2/pipe/CameraPipe$CameraInteropConfig;Landroidx/camera/camera2/pipe/core/Threads;)V", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "", "attempts", "Landroidx/camera/camera2/pipe/core/TimestampNs;", "requestTimestamp", "Landroidx/camera/camera2/pipe/compat/Camera2DeviceCloser;", "camera2DeviceCloser", "Landroidx/camera/camera2/pipe/compat/AudioRestrictionController;", "audioRestrictionController", "Landroidx/camera/camera2/pipe/compat/OpenCameraResult;", "tryOpenCamera-7pD7j80$camera_camera2_pipe", "(Ljava/lang/String;IJLandroidx/camera/camera2/pipe/compat/Camera2DeviceCloser;Landroidx/camera/camera2/pipe/compat/AudioRestrictionController;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryOpenCamera", "", "cancelOpen$camera_camera2_pipe", "()V", "cancelOpen", "Landroidx/camera/camera2/pipe/compat/CameraOpener;", "Landroidx/camera/camera2/pipe/compat/Camera2MetadataProvider;", "Landroidx/camera/camera2/pipe/internal/CameraErrorListener;", "Landroidx/camera/camera2/pipe/compat/Camera2Quirks;", "Landroidx/camera/camera2/pipe/core/TimeSource;", "Landroidx/camera/camera2/pipe/CameraPipe$CameraInteropConfig;", "Landroidx/camera/camera2/pipe/core/Threads;", "Lskm/q;", "cameraOpenCancelled", "Lskm/q;", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraStateOpener {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Camera2MetadataProvider camera2MetadataProvider;

    @NotNull
    private final Camera2Quirks camera2Quirks;

    @NotNull
    private final CameraErrorListener cameraErrorListener;
    private final CameraPipe.CameraInteropConfig cameraInteropConfig;

    @NotNull
    private q cameraOpenCancelled;

    @NotNull
    private final CameraOpener cameraOpener;

    @NotNull
    private final Threads threads;

    @NotNull
    private final TimeSource timeSource;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/camera/camera2/pipe/compat/CameraStateOpener$Companion;", "", "<init>", "()V", "CAMERA_OPEN_TIMEOUT_MS", "", "CAMERA_OPEN_CANCEL_TIMEOUT_MS", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CameraStateOpener(@NotNull CameraOpener cameraOpener, @NotNull Camera2MetadataProvider camera2MetadataProvider, @NotNull CameraErrorListener cameraErrorListener, @NotNull Camera2Quirks camera2Quirks, @NotNull TimeSource timeSource, CameraPipe.CameraInteropConfig cameraInteropConfig, @NotNull Threads threads) {
        Intrinsics.checkNotNullParameter(cameraOpener, "cameraOpener");
        Intrinsics.checkNotNullParameter(camera2MetadataProvider, "camera2MetadataProvider");
        Intrinsics.checkNotNullParameter(cameraErrorListener, "cameraErrorListener");
        Intrinsics.checkNotNullParameter(camera2Quirks, "camera2Quirks");
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        Intrinsics.checkNotNullParameter(threads, "threads");
        this.cameraOpener = cameraOpener;
        this.camera2MetadataProvider = camera2MetadataProvider;
        this.cameraErrorListener = cameraErrorListener;
        this.camera2Quirks = camera2Quirks;
        this.timeSource = timeSource;
        this.cameraInteropConfig = cameraInteropConfig;
        this.threads = threads;
        this.cameraOpenCancelled = e0.b();
    }

    public final void cancelOpen$camera_camera2_pipe() {
        ((r) this.cameraOpenCancelled).U(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX INFO: renamed from: tryOpenCamera-7pD7j80$camera_camera2_pipe, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m413tryOpenCamera7pD7j80$camera_camera2_pipe(@org.jetbrains.annotations.NotNull java.lang.String r23, int r24, long r25, @org.jetbrains.annotations.NotNull androidx.camera.camera2.pipe.compat.Camera2DeviceCloser r27, @org.jetbrains.annotations.NotNull androidx.camera.camera2.pipe.compat.AudioRestrictionController r28, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.OpenCameraResult> r29) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r29
            boolean r3 = r2 instanceof androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$1
            if (r3 == 0) goto L19
            r3 = r2
            androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$1 r3 = (androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.label = r4
            goto L1e
        L19:
            androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$1 r3 = new androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$1
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.result
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.label
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L52
            if (r5 == r7) goto L38
            if (r5 != r6) goto L30
            yhm.o.b(r2)
            return r2
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            long r7 = r3.J$0
            int r1 = r3.I$0
            java.lang.Object r5 = r3.L$2
            androidx.camera.camera2.pipe.compat.AudioRestrictionController r5 = (androidx.camera.camera2.pipe.compat.AudioRestrictionController) r5
            java.lang.Object r9 = r3.L$1
            androidx.camera.camera2.pipe.compat.Camera2DeviceCloser r9 = (androidx.camera.camera2.pipe.compat.Camera2DeviceCloser) r9
            java.lang.Object r10 = r3.L$0
            java.lang.String r10 = (java.lang.String) r10
            yhm.o.b(r2)
            r18 = r5
            r11 = r7
            r15 = r9
            r8 = r10
            r10 = r1
            goto L78
        L52:
            yhm.o.b(r2)
            androidx.camera.camera2.pipe.compat.Camera2MetadataProvider r2 = r0.camera2MetadataProvider
            r3.L$0 = r1
            r5 = r27
            r3.L$1 = r5
            r8 = r28
            r3.L$2 = r8
            r9 = r24
            r3.I$0 = r9
            r10 = r25
            r3.J$0 = r10
            r3.label = r7
            java.lang.Object r2 = r2.mo406getCameraMetadata0r8Bogc(r1, r3)
            if (r2 != r4) goto L72
            goto Lbd
        L72:
            r15 = r5
            r18 = r8
            r11 = r10
            r8 = r1
            r10 = r9
        L78:
            r9 = r2
            androidx.camera.camera2.pipe.CameraMetadata r9 = (androidx.camera.camera2.pipe.CameraMetadata) r9
            androidx.camera.camera2.pipe.compat.AndroidCameraState r7 = new androidx.camera.camera2.pipe.compat.AndroidCameraState
            androidx.camera.camera2.pipe.core.TimeSource r13 = r0.timeSource
            androidx.camera.camera2.pipe.internal.CameraErrorListener r14 = r0.cameraErrorListener
            androidx.camera.camera2.pipe.compat.Camera2Quirks r1 = r0.camera2Quirks
            androidx.camera.camera2.pipe.core.Threads r2 = r0.threads
            androidx.camera.camera2.pipe.CameraPipe$CameraInteropConfig r5 = r0.cameraInteropConfig
            r6 = 0
            if (r5 == 0) goto L91
            android.hardware.camera2.CameraDevice$StateCallback r5 = r5.getCameraDeviceStateCallback()
            r19 = r5
            goto L93
        L91:
            r19 = r6
        L93:
            androidx.camera.camera2.pipe.CameraPipe$CameraInteropConfig r5 = r0.cameraInteropConfig
            if (r5 == 0) goto L9e
            androidx.camera.camera2.pipe.CameraInterop$CaptureSessionListener r5 = r5.getCameraCaptureSessionListener()
            r20 = r5
            goto La0
        L9e:
            r20 = r6
        La0:
            r21 = 0
            r16 = r1
            r17 = r2
            r7.<init>(r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2 r1 = new androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2
            r1.<init>(r0, r8, r7, r6)
            r3.L$0 = r6
            r3.L$1 = r6
            r3.L$2 = r6
            r2 = 2
            r3.label = r2
            java.lang.Object r1 = skm.e0.G(r1, r3)
            if (r1 != r4) goto Lbe
        Lbd:
            return r4
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.CameraStateOpener.m413tryOpenCamera7pD7j80$camera_camera2_pipe(java.lang.String, int, long, androidx.camera.camera2.pipe.compat.Camera2DeviceCloser, androidx.camera.camera2.pipe.compat.AudioRestrictionController, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
