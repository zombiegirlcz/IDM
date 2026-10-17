package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.viewfinder.CameraViewfinder;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraController;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionImage;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.RecorderWrapper;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.persistentsurface.IsPersistentSurfaceSupportedUseCase;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvc;
import com.onfido.android.sdk.capture.internal.camera.camerax.FrameSampler;
import com.onfido.android.sdk.capture.internal.camera.camerax.PreviewConfig;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.ui.camera.capture.VideoCaptureConfig;
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
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u00018BW\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001d\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00150\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010\u0017J?\u0010\"\u001a\u00020\u00152\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00150\u001aH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0015H\u0016¢\u0006\u0004\b$\u0010\u0017J\u000f\u0010%\u001a\u00020\u0015H\u0016¢\u0006\u0004\b%\u0010\u0017J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0015H\u0016¢\u0006\u0004\b)\u0010\u0017J\u000f\u0010*\u001a\u00020\u0015H\u0016¢\u0006\u0004\b*\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00100R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00101R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001e\u00106\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/MotionCamera2Controller;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionCameraController;", "Landroidx/camera/viewfinder/CameraViewfinder;", "cameraViewfinder", "Lcom/onfido/android/sdk/capture/ui/camera/capture/VideoCaptureConfig;", "videoCaptureConfig", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/PreviewConfig;", "previewConfig", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvc;", "faceDetector", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/Camera2Wrapper;", "camera2Wrapper", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/recorder/RecorderWrapper;", "recorderWrapper", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/recorder/persistentsurface/IsPersistentSurfaceSupportedUseCase;", "isPersistentSurfaceSupportedUseCase", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/FrameSampler;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionImage;", "frameSampler", "<init>", "(Landroidx/camera/viewfinder/CameraViewfinder;Lcom/onfido/android/sdk/capture/ui/camera/capture/VideoCaptureConfig;Lcom/onfido/android/sdk/capture/internal/camera/camerax/PreviewConfig;Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvc;Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/Camera2Wrapper;Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/recorder/RecorderWrapper;Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/recorder/persistentsurface/IsPersistentSurfaceSupportedUseCase;Lcom/onfido/android/sdk/capture/internal/camera/camerax/FrameSampler;)V", "", "stopRecording", "()V", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onError", "start", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "reset", "onStarted", "onFinished", "startRecording", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "cancelRecording", "finishRecording", "", "getVideoFilePath", "()Ljava/lang/String;", "onStop", "onDestroy", "Landroidx/camera/viewfinder/CameraViewfinder;", "Lcom/onfido/android/sdk/capture/ui/camera/capture/VideoCaptureConfig;", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/PreviewConfig;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvc;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/Camera2Wrapper;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/recorder/RecorderWrapper;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/recorder/persistentsurface/IsPersistentSurfaceSupportedUseCase;", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/FrameSampler;", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "onFinishedCallback", "Lkotlin/jvm/functions/Function0;", "Factory", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MotionCamera2Controller implements MotionCameraController {

    @NotNull
    private final Camera2Wrapper camera2Wrapper;

    @NotNull
    private final CameraViewfinder cameraViewfinder;

    @NotNull
    private final CompositeDisposable compositeDisposable;

    @NotNull
    private final FaceDetectorAvc faceDetector;

    @NotNull
    private final FrameSampler<MotionImage> frameSampler;

    @NotNull
    private final IsPersistentSurfaceSupportedUseCase isPersistentSurfaceSupportedUseCase;
    private Function0<Unit> onFinishedCallback;

    @NotNull
    private final PreviewConfig previewConfig;

    @NotNull
    private final RecorderWrapper recorderWrapper;

    @NotNull
    private final VideoCaptureConfig videoCaptureConfig;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/MotionCamera2Controller$Factory;", "", "create", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/MotionCamera2Controller;", "cameraViewfinder", "Landroidx/camera/viewfinder/CameraViewfinder;", "videoCaptureConfig", "Lcom/onfido/android/sdk/capture/ui/camera/capture/VideoCaptureConfig;", "previewConfig", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/PreviewConfig;", "faceDetector", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvc;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Factory {
        @NotNull
        MotionCamera2Controller create(@NotNull CameraViewfinder cameraViewfinder, @NotNull VideoCaptureConfig videoCaptureConfig, @NotNull PreviewConfig previewConfig, @NotNull FaceDetectorAvc faceDetector);
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.MotionCamera2Controller$start$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "cameraCharacteristics", "Landroid/hardware/camera2/CameraCharacteristics;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function1<CameraCharacteristics, Unit> {
        final /* synthetic */ Function1<Throwable, Unit> $onError;
        final /* synthetic */ Function0<Unit> $onSuccess;

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.MotionCamera2Controller$start$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C03591 extends u implements Function0<Unit> {
            final /* synthetic */ Function0<Unit> $onSuccess;
            final /* synthetic */ MotionCamera2Controller this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03591(Function0<Unit> function0, MotionCamera2Controller motionCamera2Controller) {
                super(0);
                this.$onSuccess = function0;
                this.this$0 = motionCamera2Controller;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m3673invoke();
                return Unit.f186387a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3673invoke() {
                this.$onSuccess.invoke();
                this.this$0.faceDetector.initialize();
                this.this$0.frameSampler.mo3668onPreviewAvailableHG0u8IE(this.this$0.cameraViewfinder, this.this$0.previewConfig.m3699getFrameSamplingPeriodUwyO8pc());
                CompositeDisposable compositeDisposable = this.this$0.compositeDisposable;
                Observable observableObserveFrame = this.this$0.frameSampler.observeFrame();
                final FaceDetectorAvc faceDetectorAvc = this.this$0.faceDetector;
                Disposable disposableSubscribe = observableObserveFrame.subscribe(new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.MotionCamera2Controller.start.1.1.1
                    @Override // igm.g
                    public final void accept(@NotNull MotionImage p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        faceDetectorAvc.processFrame(p0);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
                RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super Throwable, Unit> function1, Function0<Unit> function0) {
            super(1);
            this.$onError = function1;
            this.$onSuccess = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((CameraCharacteristics) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull CameraCharacteristics cameraCharacteristics) {
            Intrinsics.checkNotNullParameter(cameraCharacteristics, "cameraCharacteristics");
            MotionCamera2Controller.this.recorderWrapper.initialize(MotionCamera2Controller.this.videoCaptureConfig, cameraCharacteristics);
            MotionCamera2Controller.this.camera2Wrapper.start(MotionCamera2Controller.this.cameraViewfinder, MotionCamera2Controller.this.recorderWrapper.getMediaRecorderSurface(), new C03591(this.$onSuccess, MotionCamera2Controller.this), this.$onError);
        }
    }

    public MotionCamera2Controller(@NotNull CameraViewfinder cameraViewfinder, @NotNull VideoCaptureConfig videoCaptureConfig, @NotNull PreviewConfig previewConfig, @NotNull FaceDetectorAvc faceDetector, @NotNull Camera2Wrapper camera2Wrapper, @NotNull RecorderWrapper recorderWrapper, @NotNull IsPersistentSurfaceSupportedUseCase isPersistentSurfaceSupportedUseCase, @NotNull FrameSampler<MotionImage> frameSampler) {
        Intrinsics.checkNotNullParameter(cameraViewfinder, "cameraViewfinder");
        Intrinsics.checkNotNullParameter(videoCaptureConfig, "videoCaptureConfig");
        Intrinsics.checkNotNullParameter(previewConfig, "previewConfig");
        Intrinsics.checkNotNullParameter(faceDetector, "faceDetector");
        Intrinsics.checkNotNullParameter(camera2Wrapper, "camera2Wrapper");
        Intrinsics.checkNotNullParameter(recorderWrapper, "recorderWrapper");
        Intrinsics.checkNotNullParameter(isPersistentSurfaceSupportedUseCase, "isPersistentSurfaceSupportedUseCase");
        Intrinsics.checkNotNullParameter(frameSampler, "frameSampler");
        this.cameraViewfinder = cameraViewfinder;
        this.videoCaptureConfig = videoCaptureConfig;
        this.previewConfig = previewConfig;
        this.faceDetector = faceDetector;
        this.camera2Wrapper = camera2Wrapper;
        this.recorderWrapper = recorderWrapper;
        this.isPersistentSurfaceSupportedUseCase = isPersistentSurfaceSupportedUseCase;
        this.frameSampler = frameSampler;
        this.compositeDisposable = new CompositeDisposable();
    }

    private final void stopRecording() {
        this.camera2Wrapper.stopPreview();
        this.recorderWrapper.stopRecording();
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraController
    public void cancelRecording() {
        try {
            stopRecording();
        } catch (RuntimeException e) {
            Timber.INSTANCE.e(e);
        }
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraController
    public void finishRecording() {
        stopRecording();
        Function0<Unit> function0 = this.onFinishedCallback;
        if (function0 != null) {
            function0.invoke();
        }
        this.onFinishedCallback = null;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraController
    @NotNull
    public String getVideoFilePath() {
        return this.recorderWrapper.getVideoFilePath();
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraController
    public void onDestroy() {
        this.camera2Wrapper.cleanup();
        this.faceDetector.close();
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraController
    public void onStop() {
        this.compositeDisposable.d();
        this.frameSampler.close();
        this.camera2Wrapper.closeCamera();
        this.recorderWrapper.releaseRecorder();
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraController
    public void reset() {
        this.recorderWrapper.reset(this.videoCaptureConfig, this.camera2Wrapper.getCharacteristics());
        if (this.isPersistentSurfaceSupportedUseCase.invoke()) {
            this.camera2Wrapper.setPreviewMode();
        } else {
            this.camera2Wrapper.resetCaptureSession(this.recorderWrapper.getMediaRecorderSurface());
        }
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraController
    public void start(@NotNull Function0<Unit> onSuccess, @NotNull Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.camera2Wrapper.findSelfieCamera(new AnonymousClass1(onError, onSuccess), onError);
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraController
    public void startRecording(@NotNull Function0<Unit> onStarted, @NotNull Function0<Unit> onFinished, @NotNull Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(onStarted, "onStarted");
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.camera2Wrapper.setRecordingMode(this.recorderWrapper.getMediaRecorderSurface());
        this.recorderWrapper.startRecording(onStarted, onError);
        this.onFinishedCallback = onFinished;
    }
}
