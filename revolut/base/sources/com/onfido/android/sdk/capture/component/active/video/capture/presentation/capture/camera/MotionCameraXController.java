package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvc;
import com.onfido.android.sdk.capture.internal.camera.OnfidoCamera;
import com.onfido.android.sdk.capture.internal.camera.camerax.CameraX;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import igm.g;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 '2\u00020\u0001:\u0002'(B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000e\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u0014\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0011J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u0011J\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionCameraXController;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionCameraController;", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/CameraX;", "cameraX", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvc;", "faceDetector", "<init>", "(Lcom/onfido/android/sdk/capture/internal/camera/camerax/CameraX;Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvc;)V", "Lkotlin/Function0;", "", "onSuccess", "Lkotlin/Function1;", "", "onError", "start", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "reset", "()V", "onStarted", "onFinished", "startRecording", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "cancelRecording", "finishRecording", "", "getVideoFilePath", "()Ljava/lang/String;", "onStop", "onDestroy", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/CameraX;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvc;", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$VideoRecorder;", "recorder", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$VideoRecorder;", "filePath", "Ljava/lang/String;", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "Companion", "Factory", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MotionCameraXController implements MotionCameraController {

    @NotNull
    private final CameraX cameraX;

    @NotNull
    private final CompositeDisposable compositeDisposable;

    @NotNull
    private final FaceDetectorAvc faceDetector;
    private String filePath;
    private OnfidoCamera.VideoRecorder recorder;

    @NotNull
    public static final String ERROR_MESSAGE_CAMERA_NOT_AVAILABLE = "CameraX: Camera Not Available";

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionCameraXController$Factory;", "", "create", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionCameraXController;", "cameraX", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/CameraX;", "faceDetector", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvc;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Factory {
        @NotNull
        MotionCameraXController create(@NotNull CameraX cameraX, @NotNull FaceDetectorAvc faceDetector);
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraXController$start$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "cameraStatus", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$CameraStatus;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function1<OnfidoCamera.CameraStatus, Unit> {
        final /* synthetic */ Function1<Throwable, Unit> $onError;
        final /* synthetic */ Function0<Unit> $onSuccess;
        final /* synthetic */ MotionCameraXController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function0<Unit> function0, MotionCameraXController motionCameraXController, Function1<? super Throwable, Unit> function1) {
            super(1);
            this.$onSuccess = function0;
            this.this$0 = motionCameraXController;
            this.$onError = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((OnfidoCamera.CameraStatus) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull OnfidoCamera.CameraStatus cameraStatus) {
            Function1<Throwable, Unit> function1;
            Throwable illegalStateException;
            Intrinsics.checkNotNullParameter(cameraStatus, "cameraStatus");
            if (Intrinsics.f(cameraStatus, OnfidoCamera.CameraStatus.Started.INSTANCE)) {
                this.$onSuccess.invoke();
                this.this$0.faceDetector.initialize();
                CompositeDisposable compositeDisposable = this.this$0.compositeDisposable;
                Observable observableObserveFrame = this.this$0.cameraX.observeFrame();
                final MotionCameraXController motionCameraXController = this.this$0;
                Disposable disposableSubscribe = observableObserveFrame.subscribe(new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraXController.start.1.1
                    @Override // igm.g
                    public final void accept(@NotNull Object motionImage) {
                        Intrinsics.checkNotNullParameter(motionImage, "motionImage");
                        motionCameraXController.faceDetector.processFrame((MotionImage) motionImage);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
                RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
            } else {
                if (cameraStatus instanceof OnfidoCamera.CameraStatus.Failed) {
                    function1 = this.$onError;
                    illegalStateException = ((OnfidoCamera.CameraStatus.Failed) cameraStatus).getError();
                } else if (!Intrinsics.f(cameraStatus, OnfidoCamera.CameraStatus.NotFound.INSTANCE) && Intrinsics.f(cameraStatus, OnfidoCamera.CameraStatus.NotAvailable.INSTANCE)) {
                    function1 = this.$onError;
                    illegalStateException = new IllegalStateException("CameraX: Camera Not Available");
                }
                function1.invoke(illegalStateException);
            }
            Timber.INSTANCE.d(cameraStatus.toString(), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraXController$startRecording$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "event", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$VideoCaptureEvent;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C19671 extends u implements Function1<OnfidoCamera.VideoCaptureEvent, Unit> {
        final /* synthetic */ Function1<Throwable, Unit> $onError;
        final /* synthetic */ Function0<Unit> $onFinished;
        final /* synthetic */ Function0<Unit> $onStarted;
        final /* synthetic */ MotionCameraXController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19671(Function0<Unit> function0, MotionCameraXController motionCameraXController, Function0<Unit> function02, Function1<? super Throwable, Unit> function1) {
            super(1);
            this.$onStarted = function0;
            this.this$0 = motionCameraXController;
            this.$onFinished = function02;
            this.$onError = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((OnfidoCamera.VideoCaptureEvent) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull OnfidoCamera.VideoCaptureEvent event) {
            Function0<Unit> function0;
            Intrinsics.checkNotNullParameter(event, "event");
            if (Intrinsics.f(event, OnfidoCamera.VideoCaptureEvent.Started.INSTANCE)) {
                function0 = this.$onStarted;
            } else {
                if (!(event instanceof OnfidoCamera.VideoCaptureEvent.Recorded)) {
                    if (!Intrinsics.f(event, OnfidoCamera.VideoCaptureEvent.Canceled.INSTANCE) && !Intrinsics.f(event, OnfidoCamera.VideoCaptureEvent.Timeout.INSTANCE) && (event instanceof OnfidoCamera.VideoCaptureEvent.Error)) {
                        OnfidoCamera.VideoCaptureEvent.Error error = (OnfidoCamera.VideoCaptureEvent.Error) event;
                        Timber.INSTANCE.e(error.getError());
                        this.$onError.invoke(error.getError());
                    }
                    Timber.INSTANCE.d(event.toString(), new Object[0]);
                }
                Timber.INSTANCE.d("Recording stopped. Output file: " + this.this$0.filePath, new Object[0]);
                this.this$0.filePath = ((OnfidoCamera.VideoCaptureEvent.Recorded) event).getFilePath();
                function0 = this.$onFinished;
            }
            function0.invoke();
            Timber.INSTANCE.d(event.toString(), new Object[0]);
        }
    }

    public MotionCameraXController(@NotNull CameraX cameraX, @NotNull FaceDetectorAvc faceDetector) {
        Intrinsics.checkNotNullParameter(cameraX, "cameraX");
        Intrinsics.checkNotNullParameter(faceDetector, "faceDetector");
        this.cameraX = cameraX;
        this.faceDetector = faceDetector;
        this.compositeDisposable = new CompositeDisposable();
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraController
    public void cancelRecording() {
        OnfidoCamera.VideoRecorder videoRecorder = this.recorder;
        if (videoRecorder != null) {
            videoRecorder.cancel();
        }
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraController
    public void finishRecording() {
        OnfidoCamera.VideoRecorder videoRecorder = this.recorder;
        if (videoRecorder != null) {
            videoRecorder.finish();
        }
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraController
    @NotNull
    public String getVideoFilePath() {
        String str = this.filePath;
        Intrinsics.h(str);
        return str;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraController
    public void onDestroy() {
        this.recorder = null;
        this.faceDetector.close();
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraController
    public void onStop() {
        this.compositeDisposable.d();
        this.cameraX.stop();
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraController
    public void reset() {
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraController
    public void start(@NotNull Function0<Unit> onSuccess, @NotNull Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.cameraX.start(OnfidoCamera.CameraFacing.FRONT, new AnonymousClass1(onSuccess, this, onError));
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraController
    public void startRecording(@NotNull Function0<Unit> onStarted, @NotNull Function0<Unit> onFinished, @NotNull Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(onStarted, "onStarted");
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.recorder = this.cameraX.takeVideo(new C19671(onStarted, this, onFinished, onError));
    }
}
