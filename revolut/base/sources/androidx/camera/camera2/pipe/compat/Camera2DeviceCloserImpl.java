package androidx.camera.camera2.pipe.compat;

import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper;
import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import gim.d;
import gim.i;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.o0;
import org.jetbrains.annotations.NotNull;
import rkm.b;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 $2\u00020\u0001:\u0001$B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJE\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJC\u0010\u001d\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#¨\u0006%"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2DeviceCloserImpl;", "Landroidx/camera/camera2/pipe/compat/Camera2DeviceCloser;", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Landroidx/camera/camera2/pipe/compat/Camera2Quirks;", "camera2Quirks", "Landroidx/camera/camera2/pipe/compat/RetryingCameraStateOpener;", "retryingCameraStateOpener", "<init>", "(Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/compat/Camera2Quirks;Landroidx/camera/camera2/pipe/compat/RetryingCameraStateOpener;)V", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "cameraDeviceWrapper", "Landroid/hardware/camera2/CameraDevice;", "cameraDevice", "Landroidx/camera/camera2/pipe/compat/AndroidCameraState;", "androidCameraState", "", "shouldReopenCamera", "shouldCreateEmptyCaptureSession", "Lkotlin/Pair;", "handleQuirksBeforeClosing", "(Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/pipe/compat/AndroidCameraState;ZZ)Lkotlin/Pair;", "", "closeCameraDevice", "(Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/pipe/compat/AndroidCameraState;)V", "createCaptureSession", "(Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;)V", "Landroidx/camera/camera2/pipe/compat/AudioRestrictionController;", "audioRestrictionController", "closeCamera", "(Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/pipe/compat/AndroidCameraState;Landroidx/camera/camera2/pipe/compat/AudioRestrictionController;ZZ)V", "Landroidx/camera/camera2/pipe/core/Threads;", "getThreads", "()Landroidx/camera/camera2/pipe/core/Threads;", "Landroidx/camera/camera2/pipe/compat/Camera2Quirks;", "Landroidx/camera/camera2/pipe/compat/RetryingCameraStateOpener;", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2DeviceCloserImpl implements Camera2DeviceCloser {

    @NotNull
    private final Camera2Quirks camera2Quirks;

    @NotNull
    private final RetryingCameraStateOpener retryingCameraStateOpener;

    @NotNull
    private final Threads threads;

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl$closeCameraDevice$2, reason: invalid class name */
    @d(c = "androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl$closeCameraDevice$2", f = "Camera2DeviceCloser.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ CameraDevice $cameraDevice;
        final /* synthetic */ Ref$BooleanRef $cameraDeviceClosed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CameraDevice cameraDevice, Ref$BooleanRef ref$BooleanRef, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$cameraDevice = cameraDevice;
            this.$cameraDeviceClosed = ref$BooleanRef;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass2(this.$cameraDevice, this.$cameraDeviceClosed, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            CameraDeviceWrapperKt.closeWithTrace(this.$cameraDevice);
            this.$cameraDeviceClosed.f186407a = true;
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public Camera2DeviceCloserImpl(@NotNull Threads threads, @NotNull Camera2Quirks camera2Quirks, @NotNull RetryingCameraStateOpener retryingCameraStateOpener) {
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(camera2Quirks, "camera2Quirks");
        Intrinsics.checkNotNullParameter(retryingCameraStateOpener, "retryingCameraStateOpener");
        this.threads = threads;
        this.camera2Quirks = camera2Quirks;
        this.retryingCameraStateOpener = retryingCameraStateOpener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeCameraDevice(CameraDevice cameraDevice, AndroidCameraState androidCameraState) {
        String id10 = cameraDevice.getId();
        Intrinsics.checkNotNullExpressionValue(id10, "getId(...)");
        Log log2 = Log.INSTANCE;
        if (log2.getDEBUG_LOGGABLE()) {
            String str = "closeCameraDevice(" + id10 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        if (((Unit) this.threads.runBlockingCheckedOrNull(CapturePresenter.MANUAL_FALLBACK_DELAY_MS, new AnonymousClass2(cameraDevice, ref$BooleanRef, null))) == null && log2.getERROR_LOGGABLE()) {
            String str2 = "Failed to close CameraDevice(" + id10 + ") after 7000ms. The camera is likely in a bad state.";
        }
        CameraId.Companion companion = CameraId.INSTANCE;
        String id11 = cameraDevice.getId();
        Intrinsics.checkNotNullExpressionValue(id11, "getId(...)");
        String strM182constructorimpl = CameraId.m182constructorimpl(id11);
        if (this.camera2Quirks.m410shouldWaitForCameraDeviceOnClosedEfqyGwQ$camera_camera2_pipe(strM182constructorimpl) && ref$BooleanRef.f186407a) {
            if (log2.getDEBUG_LOGGABLE()) {
                String str3 = "Waiting for OnClosed from " + ((Object) CameraId.m186toStringimpl(strM182constructorimpl));
            }
            if (androidCameraState.awaitCameraDeviceClosed$camera_camera2_pipe(2000L)) {
                if (log2.getDEBUG_LOGGABLE()) {
                    String str4 = "Received OnClosed for " + ((Object) CameraId.m186toStringimpl(strM182constructorimpl));
                    return;
                }
                return;
            }
            if (log2.getWARN_LOGGABLE()) {
                String str5 = "Failed to close " + ((Object) CameraId.m186toStringimpl(strM182constructorimpl)) + " after 2000ms!";
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createCaptureSession(CameraDeviceWrapper cameraDeviceWrapper) throws InterruptedException {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, DefaultFrameSampler.DESIRED_FRAME_WIDTH);
        final Surface surface = new Surface(surfaceTexture);
        final b bVarG = hx7.b.g(false);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (cameraDeviceWrapper.createCaptureSession(u.c(surface), new CameraCaptureSessionWrapper.StateCallback() { // from class: androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl$createCaptureSession$callback$1
            @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
            public void onActive(CameraCaptureSessionWrapper session) {
                Intrinsics.checkNotNullParameter(session, "session");
            }

            @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
            public void onCaptureQueueEmpty(CameraCaptureSessionWrapper session) {
                Intrinsics.checkNotNullParameter(session, "session");
            }

            @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
            public void onClosed(CameraCaptureSessionWrapper session) {
                Intrinsics.checkNotNullParameter(session, "session");
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                }
                if (bVarG.a()) {
                    surface.release();
                    surfaceTexture.release();
                }
            }

            @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
            public void onConfigureFailed(CameraCaptureSessionWrapper session) {
                Intrinsics.checkNotNullParameter(session, "session");
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                }
                if (bVarG.a()) {
                    surface.release();
                    surfaceTexture.release();
                }
                countDownLatch.countDown();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
            public void onConfigured(CameraCaptureSessionWrapper session) throws Exception {
                boolean zIsTerminated;
                Intrinsics.checkNotNullParameter(session, "session");
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                }
                if (session instanceof AutoCloseable) {
                    session.close();
                } else if (session instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) session;
                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z = false;
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z) {
                                    executorService.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else if (session instanceof TypedArray) {
                    ((TypedArray) session).recycle();
                } else {
                    if (!(session instanceof MediaMetadataRetriever)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaMetadataRetriever) session).release();
                }
                countDownLatch.countDown();
            }

            @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
            public void onReady(CameraCaptureSessionWrapper session) {
                Intrinsics.checkNotNullParameter(session, "session");
            }

            @Override // androidx.camera.camera2.pipe.compat.SessionStateCallback
            public void onSessionDisconnected() {
            }

            @Override // androidx.camera.camera2.pipe.compat.SessionStateCallback
            public void onSessionFinalized() {
            }
        })) {
            countDownLatch.await();
            return;
        }
        if (Log.INSTANCE.getERROR_LOGGABLE()) {
        }
        if (bVarG.a()) {
            surface.release();
            surfaceTexture.release();
        }
    }

    private final Pair<CameraDeviceWrapper, AndroidCameraState> handleQuirksBeforeClosing(CameraDeviceWrapper cameraDeviceWrapper, CameraDevice cameraDevice, AndroidCameraState androidCameraState, boolean shouldReopenCamera, boolean shouldCreateEmptyCaptureSession) {
        AwaitOpenCameraResult awaitOpenCameraResult;
        Log log2 = Log.INSTANCE;
        if (log2.getDEBUG_LOGGABLE()) {
            String str = "handleQuirksBeforeClosing(" + cameraDevice + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        String cameraId = cameraDeviceWrapper.getCameraId();
        if (shouldReopenCamera) {
            Debug debug = Debug.INSTANCE;
            try {
                Trace.beginSection("Camera2DeviceCloserImpl#reopenCameraDevice");
                if (log2.getDEBUG_LOGGABLE()) {
                }
                closeCameraDevice(cameraDevice, androidCameraState);
                awaitOpenCameraResult = this.retryingCameraStateOpener.mo423openAndAwaitCameraWithRetry0r8Bogc(cameraId, this);
                Trace.endSection();
            } finally {
            }
        } else {
            awaitOpenCameraResult = new AwaitOpenCameraResult(cameraDeviceWrapper, androidCameraState);
        }
        if (awaitOpenCameraResult.getCameraDeviceWrapper() == null || awaitOpenCameraResult.getAndroidCameraState() == null) {
            return log2.getERROR_LOGGABLE() ? null : null;
        }
        if (shouldCreateEmptyCaptureSession) {
            Debug debug2 = Debug.INSTANCE;
            try {
                Trace.beginSection("Camera2DeviceCloserImpl#createCaptureSession");
                if (log2.getDEBUG_LOGGABLE()) {
                    String str2 = "Creating an empty capture session before closing " + ((Object) CameraId.m186toStringimpl(cameraId));
                }
                createCaptureSession(awaitOpenCameraResult.getCameraDeviceWrapper());
                if (log2.getDEBUG_LOGGABLE()) {
                }
                Unit unit = Unit.f186387a;
                Trace.endSection();
            } finally {
            }
        }
        return new Pair<>(awaitOpenCameraResult.getCameraDeviceWrapper(), awaitOpenCameraResult.getAndroidCameraState());
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2DeviceCloser
    public void closeCamera(CameraDeviceWrapper cameraDeviceWrapper, CameraDevice cameraDevice, @NotNull AndroidCameraState androidCameraState, @NotNull AudioRestrictionController audioRestrictionController, boolean shouldReopenCamera, boolean shouldCreateEmptyCaptureSession) throws Throwable {
        Intrinsics.checkNotNullParameter(androidCameraState, "androidCameraState");
        Intrinsics.checkNotNullParameter(audioRestrictionController, "audioRestrictionController");
        CameraDevice cameraDevice2 = cameraDeviceWrapper != null ? (CameraDevice) cameraDeviceWrapper.unwrapAs(o0.f186429a.b(CameraDevice.class)) : null;
        if (cameraDevice2 == null) {
            if (cameraDevice != null) {
                closeCameraDevice(cameraDevice, androidCameraState);
                return;
            }
            return;
        }
        CameraId.Companion companion = CameraId.INSTANCE;
        String id10 = cameraDevice2.getId();
        Intrinsics.checkNotNullExpressionValue(id10, "getId(...)");
        String strM182constructorimpl = CameraId.m182constructorimpl(id10);
        if (cameraDevice != null && !Intrinsics.f(strM182constructorimpl, cameraDevice.getId())) {
            StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Unwrapped camera device has camera ID ", strM182constructorimpl, ", but the wrapped camera device has camera ID ");
            sbX.append(cameraDevice.getId());
            sbX.append('!');
            throw new IllegalStateException(sbX.toString().toString());
        }
        if (Build.VERSION.SDK_INT >= 30) {
            audioRestrictionController.removeListener(cameraDeviceWrapper);
        }
        CameraDevice cameraDevice3 = cameraDevice2;
        Pair<CameraDeviceWrapper, AndroidCameraState> pairHandleQuirksBeforeClosing = handleQuirksBeforeClosing(cameraDeviceWrapper, cameraDevice3, androidCameraState, shouldReopenCamera, shouldCreateEmptyCaptureSession);
        if (pairHandleQuirksBeforeClosing == null) {
            if (Log.INSTANCE.getERROR_LOGGABLE()) {
            }
            cameraDeviceWrapper.onDeviceClosing();
            cameraDeviceWrapper.onDeviceClosed();
            androidCameraState.onFinalized$camera_camera2_pipe(cameraDevice3);
            return;
        }
        CameraDeviceWrapper cameraDeviceWrapper2 = (CameraDeviceWrapper) pairHandleQuirksBeforeClosing.f186385a;
        AndroidCameraState androidCameraState2 = (AndroidCameraState) pairHandleQuirksBeforeClosing.f186386b;
        Object objUnwrapAs = cameraDeviceWrapper2.unwrapAs(o0.f186429a.b(CameraDevice.class));
        if (objUnwrapAs == null) {
            throw new IllegalStateException("Required value was null.");
        }
        cameraDeviceWrapper.onDeviceClosing();
        closeCameraDevice((CameraDevice) objUnwrapAs, androidCameraState2);
        cameraDeviceWrapper.onDeviceClosed();
        if (shouldReopenCamera) {
            androidCameraState.onFinalized$camera_camera2_pipe(cameraDevice3);
        }
    }
}
