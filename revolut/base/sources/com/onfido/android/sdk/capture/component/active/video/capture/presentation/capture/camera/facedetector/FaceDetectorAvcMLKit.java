package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector;

import android.graphics.Bitmap;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.FaceDetector;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import com.onfido.android.sdk.capture.component.active.video.capture.analytics.AvcAnalyticsEvent;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionImage;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorResult;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import igm.g;
import igm.o;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Objects;
import kgm.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pgm.b0;
import pgm.g0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 72\u00020\u0001:\u00017B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u000e0\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001e\u001a\u00020\u001d2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0017H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0017H\u0016¢\u0006\u0004\b'\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00100\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\u000b0\u000b0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00103\u001a\b\u0012\u0004\u0012\u00020\u000e028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvcMLKit;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvc;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;", "analytics", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvcResultMapper;", "Lmh/a;", "resultMapper", "<init>", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvcResultMapper;)V", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionImage;", "motionImage", "Lio/reactivex/rxjava3/core/Single;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorResult;", "detect", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionImage;)Lio/reactivex/rxjava3/core/Single;", "Landroid/graphics/Bitmap;", "image", "getFaceDetectionBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "Lio/reactivex/rxjava3/core/SingleEmitter;", "data", "", "emitOnSuccess", "(Lio/reactivex/rxjava3/core/SingleEmitter;Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorResult;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ex", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorResult$Error;", "mapToError", "(Ljava/lang/Exception;)Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorResult$Error;", "faceDetectionBitmap", "recycleBitmaps", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V", "initialize", "()V", "processFrame", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionImage;)V", "close", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvcResultMapper;", "Lcom/google/mlkit/vision/face/FaceDetector;", "detector", "Lcom/google/mlkit/vision/face/FaceDetector;", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "frameSubject", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "Lio/reactivex/rxjava3/core/Observable;", "resultObservable", "Lio/reactivex/rxjava3/core/Observable;", "getResultObservable", "()Lio/reactivex/rxjava3/core/Observable;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FaceDetectorAvcMLKit implements FaceDetectorAvc {
    public static final int FACE_DETECTION_FRAME_WIDTH = 240;

    @NotNull
    private final OnfidoAnalytics analytics;
    private FaceDetector detector;

    @NotNull
    private final PublishSubject frameSubject;

    @NotNull
    private final FaceDetectorAvcResultMapper<mh.a> resultMapper;

    @NotNull
    private final Observable resultObservable;

    @NotNull
    private final SchedulersProvider schedulersProvider;

    public FaceDetectorAvcMLKit(@NotNull OnfidoAnalytics analytics, @NotNull SchedulersProvider schedulersProvider, @NotNull FaceDetectorAvcResultMapper<mh.a> resultMapper) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        Intrinsics.checkNotNullParameter(resultMapper, "resultMapper");
        this.analytics = analytics;
        this.schedulersProvider = schedulersProvider;
        this.resultMapper = resultMapper;
        PublishSubject publishSubjectN = ch.qos.logback.core.util.a.n("create(...)");
        this.frameSubject = publishSubjectN;
        Flowable flowable = publishSubjectN.toFlowable(fgm.a.DROP);
        g gVar = new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvcMLKit$resultObservable$1
            @Override // igm.g
            public final void accept(MotionImage motionImage) {
                Timber.INSTANCE.d("onBackpressureDrop", new Object[0]);
            }
        };
        flowable.getClass();
        Objects.requireNonNull(gVar, "onDrop is null");
        int i = 1;
        b0 b0Var = new b0(flowable, gVar, i);
        o oVar = new o() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvcMLKit$resultObservable$2
            @Override // igm.o
            @NotNull
            public final SingleSource apply(MotionImage motionImage) {
                FaceDetectorAvcMLKit faceDetectorAvcMLKit = this.this$0;
                Intrinsics.h(motionImage);
                return faceDetectorAvcMLKit.detect(motionImage).k(this.this$0.schedulersProvider.getComputation());
            }
        };
        j.a(1, "maxConcurrency");
        Observable observableShare = new mgm.j(new g0(b0Var, oVar, i, 1), 8).share();
        Intrinsics.checkNotNullExpressionValue(observableShare, "share(...)");
        this.resultObservable = observableShare;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<FaceDetectorResult> detect(MotionImage motionImage) {
        tgm.b bVar = new tgm.b(new a(getFaceDetectionBitmap(motionImage.getImage()), this, motionImage), 0);
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detect$lambda$3(Bitmap faceDetectionBitmap, final FaceDetectorAvcMLKit this$0, MotionImage motionImage, final SingleEmitter emitter) {
        Intrinsics.checkNotNullParameter(faceDetectionBitmap, "$faceDetectionBitmap");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(motionImage, "$motionImage");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        InputImage inputImageA = InputImage.a(faceDetectionBitmap, 0);
        Intrinsics.checkNotNullExpressionValue(inputImageA, "fromBitmap(...)");
        if (emitter.isDisposed()) {
            this$0.recycleBitmaps(motionImage.getImage(), faceDetectionBitmap);
            return;
        }
        FaceDetector faceDetector = this$0.detector;
        if (faceDetector == null) {
            Intrinsics.r("detector");
            throw null;
        }
        faceDetector.process(inputImageA).addOnSuccessListener(new a31.o(5, new FaceDetectorAvcMLKit$detect$1$1(this$0, emitter, faceDetectionBitmap, motionImage))).addOnFailureListener(new OnFailureListener() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.b
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc2) {
                FaceDetectorAvcMLKit.detect$lambda$3$lambda$1(this.f49889a, emitter, exc2);
            }
        }).addOnCompleteListener(new a(this$0, motionImage, faceDetectionBitmap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detect$lambda$3$lambda$0(Function1 tmp0, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detect$lambda$3$lambda$1(FaceDetectorAvcMLKit this$0, SingleEmitter emitter, Exception it8) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        Intrinsics.checkNotNullParameter(it8, "it");
        FaceDetectorResult.Error errorMapToError = this$0.mapToError(it8);
        this$0.analytics.track(new AvcAnalyticsEvent.MLKitError(errorMapToError.getMessage()));
        Timber.INSTANCE.e(errorMapToError.getMessage(), new Object[0]);
        this$0.emitOnSuccess(emitter, errorMapToError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detect$lambda$3$lambda$2(FaceDetectorAvcMLKit this$0, MotionImage motionImage, Bitmap faceDetectionBitmap, Task it8) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(motionImage, "$motionImage");
        Intrinsics.checkNotNullParameter(faceDetectionBitmap, "$faceDetectionBitmap");
        Intrinsics.checkNotNullParameter(it8, "it");
        this$0.recycleBitmaps(motionImage.getImage(), faceDetectionBitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitOnSuccess(SingleEmitter singleEmitter, FaceDetectorResult faceDetectorResult) {
        if (singleEmitter.isDisposed()) {
            return;
        }
        singleEmitter.onSuccess(faceDetectorResult);
    }

    private final Bitmap getFaceDetectionBitmap(Bitmap image) {
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(image, 240, (int) (240 * (image.getHeight() / image.getWidth())), true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        return bitmapCreateScaledBitmap;
    }

    private final FaceDetectorResult.Error mapToError(Exception ex4) {
        int i = ex4 instanceof MlKitException ? ((MlKitException) ex4).f49665a : -1;
        StringBuilder sb6 = new StringBuilder();
        String message = ex4.getMessage();
        if (message == null) {
            message = "";
        }
        sb6.append(message);
        sb6.append(", Error code: ");
        sb6.append(i);
        return new FaceDetectorResult.Error(sb6.toString(), ex4);
    }

    private final void recycleBitmaps(Bitmap motionImage, Bitmap faceDetectionBitmap) {
        motionImage.recycle();
        faceDetectionBitmap.recycle();
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvc
    public void close() {
        FaceDetector faceDetector = this.detector;
        if (faceDetector != null) {
            faceDetector.close();
        }
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvc
    @NotNull
    public Observable getResultObservable() {
        return this.resultObservable;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvc
    public void initialize() {
        oh.a aVarF = pd.b.f(new FaceDetectorOptions(1, 1, 1, 1, 0.1f));
        Intrinsics.checkNotNullExpressionValue(aVarF, "getClient(...)");
        this.detector = aVarF;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvc
    public void processFrame(@NotNull MotionImage motionImage) {
        Intrinsics.checkNotNullParameter(motionImage, "motionImage");
        this.frameSubject.onNext(motionImage);
    }
}
