package com.onfido.android.sdk.capture.detector.face;

import a31.o;
import abf.c;
import android.graphics.Rect;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import com.onfido.android.sdk.capture.detector.face.FaceDetectionResult;
import com.onfido.android.sdk.capture.ui.camera.FaceDetectionFrame;
import igm.p;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kgm.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import pd.b;
import pgm.d1;
import pgm.g0;
import zhm.d0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000 )2\u00020\u0001:\u0001)B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0012¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0012¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0012¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0017\u001a\u00020\u0016*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u00072\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0000\u0012\u00020\n0\u0014H\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0016¢\u0006\u0004\b\u0019\u0010\u000fJ\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u0003R\u0016\u0010\u001f\u001a\u00020\u001e8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010\"\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`!8R@\u0012X\u0092\u000e¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0006R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u001a8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\r8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/onfido/android/sdk/capture/detector/face/FaceDetectorGoogle;", "Lcom/onfido/android/sdk/capture/detector/face/FaceDetector;", "<init>", "()V", "Lcom/google/mlkit/vision/face/FaceDetector;", "createFaceDetector", "()Lcom/google/mlkit/vision/face/FaceDetector;", "Lcom/onfido/android/sdk/capture/ui/camera/FaceDetectionFrame;", "faceDetectionFrame", "Lio/reactivex/rxjava3/core/Single;", "Lcom/onfido/android/sdk/capture/detector/face/FaceDetectionResult;", "detect", "(Lcom/onfido/android/sdk/capture/ui/camera/FaceDetectionFrame;)Lio/reactivex/rxjava3/core/Single;", "Lio/reactivex/rxjava3/core/Flowable;", "getFaceDetectionObservable", "()Lio/reactivex/rxjava3/core/Flowable;", "Lcom/google/android/gms/tasks/Task;", "", "Lmh/a;", "frame", "Lio/reactivex/rxjava3/core/SingleEmitter;", "subscriber", "", "addSuccessAndFailureListeners", "(Lcom/google/android/gms/tasks/Task;Lcom/onfido/android/sdk/capture/ui/camera/FaceDetectionFrame;Lio/reactivex/rxjava3/core/SingleEmitter;)V", "observeFaceTracking", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "getFaceDetectionSubject", "()Lio/reactivex/rxjava3/subjects/PublishSubject;", "close", "Ljava/util/concurrent/atomic/AtomicBoolean;", "shouldProcessNextFrame", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/onfido/android/sdk/capture/detector/face/FaceDetectorMLKit;", "detector", "Lcom/google/mlkit/vision/face/FaceDetector;", "getDetector", "faceTrackingSubject", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "faceTrackingObservable", "Lio/reactivex/rxjava3/core/Flowable;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class FaceDetectorGoogle implements FaceDetector {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int ROTATION_MULTIPLIER = 90;
    private com.google.mlkit.vision.face.FaceDetector detector;

    @NotNull
    private AtomicBoolean shouldProcessNextFrame = new AtomicBoolean(true);

    @NotNull
    private PublishSubject faceTrackingSubject = ch.qos.logback.core.util.a.n("create(...)");

    @NotNull
    private Flowable faceTrackingObservable = getFaceDetectionObservable();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/detector/face/FaceDetectorGoogle$Companion;", "", "()V", "ROTATION_MULTIPLIER", "", "toFaceDetectionRect", "Lcom/onfido/android/sdk/capture/detector/face/FaceDetectionRect;", "Landroid/graphics/Rect;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final FaceDetectionRect toFaceDetectionRect(Rect rect) {
            return new FaceDetectionRect(rect.left, rect.top, rect.right, rect.bottom);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.detector.face.FaceDetectorGoogle$addSuccessAndFailureListeners$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lmh/a;", "kotlin.jvm.PlatformType", "faces", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends u implements Function1<List<? extends mh.a>, Unit> {
        final /* synthetic */ FaceDetectionFrame $frame;
        final /* synthetic */ int $frameHeight;
        final /* synthetic */ FaceDetectionRect $frameRect;
        final /* synthetic */ int $frameWidth;
        final /* synthetic */ int $rotation;
        final /* synthetic */ SingleEmitter $subscriber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, int i2, int i3, FaceDetectionRect faceDetectionRect, FaceDetectionFrame faceDetectionFrame, SingleEmitter singleEmitter) {
            super(1);
            this.$rotation = i;
            this.$frameWidth = i2;
            this.$frameHeight = i3;
            this.$frameRect = faceDetectionRect;
            this.$frame = faceDetectionFrame;
            this.$subscriber = singleEmitter;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((List<? extends mh.a>) obj2);
            return Unit.f186387a;
        }

        public final void invoke(List<? extends mh.a> list) {
            FaceDetectorGoogle.this.shouldProcessNextFrame.set(true);
            Intrinsics.h(list);
            if (list.isEmpty()) {
                this.$subscriber.onSuccess(FaceDetectionResult.NoFaceDetected.INSTANCE);
                return;
            }
            Companion companion = FaceDetectorGoogle.Companion;
            Rect rect = ((mh.a) d0.b0(list)).f205333a;
            Intrinsics.checkNotNullExpressionValue(rect, "getBoundingBox(...)");
            FaceDetectionRect faceDetectionRect = companion.toFaceDetectionRect(rect);
            float f = ((mh.a) d0.b0(list)).f205336g;
            int i = this.$rotation;
            this.$subscriber.onSuccess(new FaceDetectionResult.FaceDetected(FaceDetectionRect.INSTANCE.fromOnfidoRect$onfido_capture_sdk_core_release(faceDetectionRect.rotate$onfido_capture_sdk_core_release(i, this.$frameWidth, this.$frameHeight).toOnfidoRect$onfido_capture_sdk_core_release()), f * (i != 0 ? -1 : 1), this.$frameRect, this.$frame.getCropRect()));
        }
    }

    private void addSuccessAndFailureListeners(Task<List<mh.a>> task, FaceDetectionFrame faceDetectionFrame, SingleEmitter singleEmitter) {
        task.addOnSuccessListener(new o(7, new AnonymousClass1(faceDetectionFrame.getRotation(), faceDetectionFrame.getPictureWidth(), faceDetectionFrame.getPictureHeight(), new FaceDetectionRect(0, 0, faceDetectionFrame.getCropRect().getPreviewWidth(), faceDetectionFrame.getCropRect().getPreviewHeight()), faceDetectionFrame, singleEmitter)));
        task.addOnFailureListener(new c(this, singleEmitter, 13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSuccessAndFailureListeners$lambda$1(Function1 tmp0, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSuccessAndFailureListeners$lambda$2(FaceDetectorGoogle this$0, SingleEmitter subscriber, Exception it8) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(subscriber, "$subscriber");
        Intrinsics.checkNotNullParameter(it8, "it");
        this$0.shouldProcessNextFrame.set(true);
        String message = it8.getMessage();
        if (message == null) {
            message = "";
        }
        subscriber.onSuccess(new FaceDetectionResult.Error(message));
    }

    private com.google.mlkit.vision.face.FaceDetector createFaceDetector() {
        oh.a aVarF = b.f(new FaceDetectorOptions(1, 1, 1, 1, 0.1f));
        Intrinsics.checkNotNullExpressionValue(aVarF, "getClient(...)");
        return aVarF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Single<FaceDetectionResult> detect(FaceDetectionFrame faceDetectionFrame) {
        this.shouldProcessNextFrame.set(false);
        tgm.b bVar = new tgm.b(new c(faceDetectionFrame, this, 14), 0);
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detect$lambda$0(FaceDetectionFrame faceDetectionFrame, FaceDetectorGoogle this$0, SingleEmitter emitter) {
        Task taskProcess;
        Intrinsics.checkNotNullParameter(faceDetectionFrame, "$faceDetectionFrame");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        InputImage inputImageB = InputImage.b(faceDetectionFrame.getPictureWidth(), faceDetectionFrame.getPictureHeight(), faceDetectionFrame.getRotation() * 90, faceDetectionFrame.getYuv());
        Intrinsics.checkNotNullExpressionValue(inputImageB, "fromByteArray(...)");
        com.google.mlkit.vision.face.FaceDetector detector = this$0.getDetector();
        if (detector == null || (taskProcess = detector.process(inputImageB)) == null) {
            return;
        }
        this$0.addSuccessAndFailureListeners(taskProcess, faceDetectionFrame, emitter);
    }

    private com.google.mlkit.vision.face.FaceDetector getDetector() {
        com.google.mlkit.vision.face.FaceDetector faceDetector = this.detector;
        if (faceDetector != null) {
            return faceDetector;
        }
        com.google.mlkit.vision.face.FaceDetector faceDetectorCreateFaceDetector = createFaceDetector();
        this.detector = faceDetectorCreateFaceDetector;
        return faceDetectorCreateFaceDetector;
    }

    private Flowable getFaceDetectionObservable() {
        j.a(Integer.MAX_VALUE, "maxConcurrency");
        g0 g0Var = new g0(this.faceTrackingSubject.hide().toFlowable(fgm.a.LATEST).b(new p() { // from class: com.onfido.android.sdk.capture.detector.face.FaceDetectorGoogle.getFaceDetectionObservable.1
            @Override // igm.p
            public final boolean test(FaceDetectionFrame faceDetectionFrame) {
                return FaceDetectorGoogle.this.shouldProcessNextFrame.get();
            }
        }), new igm.o() { // from class: com.onfido.android.sdk.capture.detector.face.FaceDetectorGoogle.getFaceDetectionObservable.2
            @Override // igm.o
            @NotNull
            public final Single<FaceDetectionResult> apply(@NotNull FaceDetectionFrame p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return FaceDetectorGoogle.this.detect(p0);
            }
        }, Integer.MAX_VALUE, 1);
        int i = Flowable.f163113a;
        j.a(i, "bufferSize");
        d1 d1Var = new d1(new d1(g0Var, i));
        Intrinsics.checkNotNullExpressionValue(d1Var, "share(...)");
        return d1Var;
    }

    @Override // com.onfido.android.sdk.capture.detector.face.FaceDetector
    public void close() {
        com.google.mlkit.vision.face.FaceDetector detector = getDetector();
        if (detector != null) {
            detector.close();
        }
        this.detector = null;
        this.faceTrackingSubject = ch.qos.logback.core.util.a.n("create(...)");
        this.faceTrackingObservable = getFaceDetectionObservable();
        this.shouldProcessNextFrame.set(true);
    }

    @Override // com.onfido.android.sdk.capture.detector.face.FaceDetector
    @NotNull
    /* JADX INFO: renamed from: getFaceDetectionSubject, reason: from getter */
    public PublishSubject getFaceTrackingSubject() {
        return this.faceTrackingSubject;
    }

    @Override // com.onfido.android.sdk.capture.detector.face.FaceDetector
    @NotNull
    /* JADX INFO: renamed from: observeFaceTracking, reason: from getter */
    public Flowable getFaceTrackingObservable() {
        return this.faceTrackingObservable;
    }
}
