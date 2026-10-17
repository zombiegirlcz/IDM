package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionImage;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorResult;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.tfmodel.BlazeFaceModel;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.tfmodel.Detection;
import com.onfido.android.sdk.capture.internal.util.OnfidoRectF;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import igm.g;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kgm.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pgm.b0;
import pgm.g0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u000b0\u000b0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010!\u001a\b\u0012\u0004\u0012\u00020\r0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvcTflite;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvc;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/tfmodel/BlazeFaceModel;", "blazeFaceModel", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvcResultMapper;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/tfmodel/Detection;", "resultMapper", "<init>", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/tfmodel/BlazeFaceModel;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvcResultMapper;)V", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionImage;", "motionImage", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorResult;", "detect", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionImage;)Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorResult;", "", "initialize", "()V", "processFrame", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionImage;)V", "close", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/tfmodel/BlazeFaceModel;", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvcResultMapper;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isModelClosed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "frameSubject", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "Lio/reactivex/rxjava3/core/Observable;", "resultObservable", "Lio/reactivex/rxjava3/core/Observable;", "getResultObservable", "()Lio/reactivex/rxjava3/core/Observable;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FaceDetectorAvcTflite implements FaceDetectorAvc {

    @NotNull
    private final BlazeFaceModel blazeFaceModel;

    @NotNull
    private final PublishSubject frameSubject;

    @NotNull
    private final AtomicBoolean isModelClosed;

    @NotNull
    private final FaceDetectorAvcResultMapper<Detection> resultMapper;

    @NotNull
    private final Observable resultObservable;

    @NotNull
    private final SchedulersProvider schedulersProvider;

    public FaceDetectorAvcTflite(@NotNull BlazeFaceModel blazeFaceModel, @NotNull SchedulersProvider schedulersProvider, @NotNull FaceDetectorAvcResultMapper<Detection> resultMapper) {
        Intrinsics.checkNotNullParameter(blazeFaceModel, "blazeFaceModel");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        Intrinsics.checkNotNullParameter(resultMapper, "resultMapper");
        this.blazeFaceModel = blazeFaceModel;
        this.schedulersProvider = schedulersProvider;
        this.resultMapper = resultMapper;
        this.isModelClosed = new AtomicBoolean(false);
        PublishSubject publishSubjectN = ch.qos.logback.core.util.a.n("create(...)");
        this.frameSubject = publishSubjectN;
        Flowable flowable = publishSubjectN.toFlowable(fgm.a.DROP);
        g gVar = new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvcTflite$resultObservable$1
            @Override // igm.g
            public final void accept(MotionImage motionImage) {
                Timber.INSTANCE.d("onBackpressureDrop", new Object[0]);
            }
        };
        flowable.getClass();
        Objects.requireNonNull(gVar, "onDrop is null");
        b0 b0Var = new b0(flowable, gVar, 1);
        FaceDetectorAvcTflite$resultObservable$2 faceDetectorAvcTflite$resultObservable$2 = new FaceDetectorAvcTflite$resultObservable$2(this);
        j.a(1, "maxConcurrency");
        Observable observableShare = new mgm.j(new g0(b0Var, faceDetectorAvcTflite$resultObservable$2, 1, 1), 8).share();
        Intrinsics.checkNotNullExpressionValue(observableShare, "share(...)");
        this.resultObservable = observableShare;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FaceDetectorResult detect(MotionImage motionImage) {
        if (this.isModelClosed.get()) {
            return FaceDetectorResult.FaceNotDetected.INSTANCE;
        }
        FaceDetectorResult faceDetectorResultMapToFaceDetectorResult = this.resultMapper.mapToFaceDetectorResult(this.blazeFaceModel.run(motionImage.getImage()), OnfidoRectF.INSTANCE.toOnfidoRectF(motionImage.getImage()), motionImage.getPreviewFrame());
        motionImage.getImage().recycle();
        return faceDetectorResultMapToFaceDetectorResult;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvc
    public void close() {
        if (this.isModelClosed.compareAndSet(false, true)) {
            this.blazeFaceModel.close();
        }
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvc
    @NotNull
    public Observable getResultObservable() {
        return this.resultObservable;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvc
    public void initialize() throws IOException {
        this.blazeFaceModel.initialize();
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvc
    public void processFrame(@NotNull MotionImage motionImage) {
        Intrinsics.checkNotNullParameter(motionImage, "motionImage");
        this.frameSubject.onNext(motionImage);
    }
}
