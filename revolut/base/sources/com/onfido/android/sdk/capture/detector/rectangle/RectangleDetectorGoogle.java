package com.onfido.android.sdk.capture.detector.rectangle;

import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.FaceDetector;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognizer;
import com.onfido.android.sdk.capture.detector.rectangle.RectDetectionFaceResult;
import com.onfido.android.sdk.capture.detector.rectangle.RectDetectionResult;
import com.onfido.android.sdk.capture.internal.util.OnfidoRectF;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.TaskExtensionKt;
import com.onfido.android.sdk.capture.ui.camera.DocumentDetectionFrame;
import com.onfido.android.sdk.capture.ui.camera.OverlayMetrics;
import igm.o;
import igm.p;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tgm.g;
import yhm.j;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000 :2\u00020\u0001:\u0001:B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0012¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0012¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017*\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u0018H\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u0010\u001a\u00020\u001d*\b\u0012\u0004\u0012\u00020\u001c0\u00172\u0006\u0010\t\u001a\u00020\bH\u0012¢\u0006\u0004\b\u0010\u0010\u001eJ+\u0010\u0010\u001a\u00020\u000f*\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001dH\u0012¢\u0006\u0004\b\u0010\u0010!J9\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\"2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u001b\u00101\u001a\u00020,8RX\u0092\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028RX\u0092\u0084\u0002¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00105R\u0016\u00108\u001a\u0002078\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Lcom/onfido/android/sdk/capture/detector/rectangle/RectangleDetectorGoogle;", "Lcom/onfido/android/sdk/capture/detector/rectangle/RectangleDetector;", "Lcom/onfido/android/sdk/capture/detector/rectangle/RectangleTransformer;", "transformer", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "schedulersProvider", "<init>", "(Lcom/onfido/android/sdk/capture/detector/rectangle/RectangleTransformer;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;)V", "Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;", "documentDetectionFrame", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayMetrics;", "overlayMetrics", "", "shouldUseFaceDetection", "Lio/reactivex/rxjava3/core/Single;", "Lcom/onfido/android/sdk/capture/detector/rectangle/RectDetectionResult;", "process", "(Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;Lcom/onfido/android/sdk/capture/ui/camera/OverlayMetrics;Z)Lio/reactivex/rxjava3/core/Single;", "Ljava/lang/Runnable;", "runnable", "Lio/reactivex/rxjava3/disposables/Disposable;", "computationThread", "(Ljava/lang/Runnable;)Lio/reactivex/rxjava3/disposables/Disposable;", "", "Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;", "faceRectF", "filterByFace", "(Ljava/util/List;Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;)Ljava/util/List;", "Lmh/a;", "Lcom/onfido/android/sdk/capture/detector/rectangle/RectDetectionFaceResult;", "(Ljava/util/List;Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;)Lcom/onfido/android/sdk/capture/detector/rectangle/RectDetectionFaceResult;", "Lcom/google/mlkit/vision/text/Text;", "faceDetectionResult", "(Lcom/google/mlkit/vision/text/Text;Lcom/onfido/android/sdk/capture/ui/camera/OverlayMetrics;Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;Lcom/onfido/android/sdk/capture/detector/rectangle/RectDetectionFaceResult;)Lcom/onfido/android/sdk/capture/detector/rectangle/RectDetectionResult;", "Lio/reactivex/rxjava3/core/Observable;", "overlayMetricsObservable", "documentFrameObservable", "observeRectDetection", "(Lio/reactivex/rxjava3/core/Observable;Lio/reactivex/rxjava3/core/Observable;Z)Lio/reactivex/rxjava3/core/Observable;", "", "close", "()V", "Lcom/onfido/android/sdk/capture/detector/rectangle/RectangleTransformer;", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "Lcom/google/mlkit/vision/text/TextRecognizer;", "textDetector$delegate", "Lkotlin/Lazy;", "getTextDetector", "()Lcom/google/mlkit/vision/text/TextRecognizer;", "textDetector", "Lcom/google/mlkit/vision/face/FaceDetector;", "faceDetector$delegate", "getFaceDetector", "()Lcom/google/mlkit/vision/face/FaceDetector;", "faceDetector", "Ljava/util/concurrent/atomic/AtomicBoolean;", "shouldProcessNextFrame", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class RectangleDetectorGoogle implements RectangleDetector {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final float DOCUMENT_RATIO = 1.5f;

    @Deprecated
    public static final float ID_FACE_RATIO = 2.2f;

    @Deprecated
    public static final float ID_WIDTH_RATIO_BY_FACE = 4.0f;

    @Deprecated
    public static final int MIN_TEXT_LENGTH = 1;

    @Deprecated
    public static final int ROTATION_MULTIPLIER = 90;

    /* JADX INFO: renamed from: faceDetector$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy faceDetector;

    @NotNull
    private final SchedulersProvider schedulersProvider;

    @NotNull
    private AtomicBoolean shouldProcessNextFrame;

    /* JADX INFO: renamed from: textDetector$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy textDetector;

    @NotNull
    private final RectangleTransformer transformer;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/detector/rectangle/RectangleDetectorGoogle$Companion;", "", "()V", "DOCUMENT_RATIO", "", "ID_FACE_RATIO", "ID_WIDTH_RATIO_BY_FACE", "MIN_TEXT_LENGTH", "", "ROTATION_MULTIPLIER", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.detector.rectangle.RectangleDetectorGoogle$process$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/rxjava3/core/SingleSource;", "Lcom/onfido/android/sdk/capture/detector/rectangle/RectDetectionResult;", "result", "Lcom/onfido/android/sdk/capture/detector/rectangle/RectDetectionFaceResult;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20062<T, R> implements o {
        final /* synthetic */ DocumentDetectionFrame $documentDetectionFrame;
        final /* synthetic */ InputImage $inputImage;
        final /* synthetic */ OverlayMetrics $overlayMetrics;

        public C20062(InputImage inputImage, OverlayMetrics overlayMetrics, DocumentDetectionFrame documentDetectionFrame) {
            this.$inputImage = inputImage;
            this.$overlayMetrics = overlayMetrics;
            this.$documentDetectionFrame = documentDetectionFrame;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RectDetectionResult apply$lambda$0(Throwable it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            return RectDetectionResult.NoRectDetected.INSTANCE;
        }

        @Override // igm.o
        @NotNull
        public final SingleSource apply(@NotNull final RectDetectionFaceResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            Task taskProcess = RectangleDetectorGoogle.this.getTextDetector().process(this.$inputImage);
            Intrinsics.checkNotNullExpressionValue(taskProcess, "process(...)");
            Single single = TaskExtensionKt.toSingle(taskProcess, new c(RectangleDetectorGoogle.this, 0));
            final RectangleDetectorGoogle rectangleDetectorGoogle = RectangleDetectorGoogle.this;
            final OverlayMetrics overlayMetrics = this.$overlayMetrics;
            final DocumentDetectionFrame documentDetectionFrame = this.$documentDetectionFrame;
            return new g(single.g(new o() { // from class: com.onfido.android.sdk.capture.detector.rectangle.RectangleDetectorGoogle.process.2.2
                @Override // igm.o
                @NotNull
                public final RectDetectionResult apply(Text text) {
                    RectangleDetectorGoogle rectangleDetectorGoogle2 = rectangleDetectorGoogle;
                    Intrinsics.h(text);
                    return rectangleDetectorGoogle2.process(text, overlayMetrics, documentDetectionFrame, result);
                }
            }), new d(0), 2);
        }
    }

    public RectangleDetectorGoogle(@NotNull RectangleTransformer transformer, @NotNull SchedulersProvider schedulersProvider) {
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        this.transformer = transformer;
        this.schedulersProvider = schedulersProvider;
        this.textDetector = j.b(RectangleDetectorGoogle$textDetector$2.INSTANCE);
        this.faceDetector = j.b(RectangleDetectorGoogle$faceDetector$2.INSTANCE);
        this.shouldProcessNextFrame = new AtomicBoolean(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Disposable computationThread(Runnable runnable) {
        Disposable disposableC = this.schedulersProvider.getComputation().c(runnable);
        Intrinsics.checkNotNullExpressionValue(disposableC, "scheduleDirect(...)");
        return disposableC;
    }

    private List<OnfidoRectF> filterByFace(List<OnfidoRectF> list, OnfidoRectF onfidoRectF) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            OnfidoRectF onfidoRectF2 = (OnfidoRectF) obj2;
            if (onfidoRectF.getLeft() - onfidoRectF.width() <= onfidoRectF2.getLeft() && onfidoRectF.getTop() - (onfidoRectF.height() * 2.0f) <= onfidoRectF2.getTop()) {
                if ((onfidoRectF.height() * 2.0f) + onfidoRectF.getBottom() >= onfidoRectF2.getBottom()) {
                    if ((onfidoRectF.width() * 4.0f) + onfidoRectF.getRight() >= onfidoRectF2.getRight()) {
                        arrayList.add(obj2);
                    }
                }
            }
        }
        return arrayList;
    }

    private FaceDetector getFaceDetector() {
        return (FaceDetector) this.faceDetector.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TextRecognizer getTextDetector() {
        return (TextRecognizer) this.textDetector.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectDetectionFaceResult process(List<? extends mh.a> list, DocumentDetectionFrame documentDetectionFrame) {
        mh.a aVar = (mh.a) d0.d0(list);
        if (aVar == null) {
            return RectDetectionFaceResult.NoFaceDetected.INSTANCE;
        }
        Intrinsics.checkNotNullExpressionValue(aVar.f205333a, "getBoundingBox(...)");
        return new RectDetectionFaceResult.FaceDetected(this.transformer.invoke$onfido_capture_sdk_core_release(new OnfidoRectF(r5.left, r5.top, r5.right, r5.bottom), documentDetectionFrame.getCropRect()));
    }

    public static /* synthetic */ Single process$default(RectangleDetectorGoogle rectangleDetectorGoogle, DocumentDetectionFrame documentDetectionFrame, OverlayMetrics overlayMetrics, boolean z, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: process");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return rectangleDetectorGoogle.process(documentDetectionFrame, overlayMetrics, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource process$lambda$1(boolean z, final RectangleDetectorGoogle this$0, InputImage inputImage, final DocumentDetectionFrame documentDetectionFrame) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(inputImage, "$inputImage");
        Intrinsics.checkNotNullParameter(documentDetectionFrame, "$documentDetectionFrame");
        if (!z) {
            return Single.f(RectDetectionFaceResult.NoFaceDetected.INSTANCE);
        }
        Task taskProcess = this$0.getFaceDetector().process(inputImage);
        Intrinsics.checkNotNullExpressionValue(taskProcess, "process(...)");
        return new g(TaskExtensionKt.toSingle(taskProcess, new c(this$0, 1)).g(new o() { // from class: com.onfido.android.sdk.capture.detector.rectangle.RectangleDetectorGoogle$process$1$2
            @Override // igm.o
            @NotNull
            public final RectDetectionFaceResult apply(List<mh.a> list) {
                RectangleDetectorGoogle rectangleDetectorGoogle = this.this$0;
                Intrinsics.h(list);
                return rectangleDetectorGoogle.process(list, documentDetectionFrame);
            }
        }), new d(1), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RectDetectionFaceResult process$lambda$1$lambda$0(Throwable it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return RectDetectionFaceResult.NoFaceDetected.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void process$lambda$2(RectangleDetectorGoogle this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.shouldProcessNextFrame.set(true);
    }

    @Override // com.onfido.android.sdk.capture.detector.rectangle.RectangleDetector
    public void close() {
        getFaceDetector().close();
        getTextDetector().close();
    }

    @Override // com.onfido.android.sdk.capture.detector.rectangle.RectangleDetector
    @NotNull
    public Observable observeRectDetection(@NotNull Observable overlayMetricsObservable, @NotNull Observable documentFrameObservable, final boolean shouldUseFaceDetection) {
        Intrinsics.checkNotNullParameter(overlayMetricsObservable, "overlayMetricsObservable");
        Intrinsics.checkNotNullParameter(documentFrameObservable, "documentFrameObservable");
        Observable observableFlatMapSingle = Observable.combineLatest(overlayMetricsObservable, documentFrameObservable, new igm.c() { // from class: com.onfido.android.sdk.capture.detector.rectangle.RectangleDetectorGoogle.observeRectDetection.1
            @Override // igm.c
            @NotNull
            public final Pair<OverlayMetrics, DocumentDetectionFrame> apply(@NotNull OverlayMetrics p0, @NotNull DocumentDetectionFrame p17) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                return new Pair<>(p0, p17);
            }
        }).filter(new p() { // from class: com.onfido.android.sdk.capture.detector.rectangle.RectangleDetectorGoogle.observeRectDetection.2
            @Override // igm.p
            public final boolean test(@NotNull Pair<OverlayMetrics, DocumentDetectionFrame> it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                return RectangleDetectorGoogle.this.shouldProcessNextFrame.get();
            }
        }).flatMapSingle(new o() { // from class: com.onfido.android.sdk.capture.detector.rectangle.RectangleDetectorGoogle.observeRectDetection.3
            @Override // igm.o
            @NotNull
            public final SingleSource apply(@NotNull Pair<OverlayMetrics, DocumentDetectionFrame> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                OverlayMetrics overlayMetrics = (OverlayMetrics) pair.f186385a;
                DocumentDetectionFrame documentDetectionFrame = (DocumentDetectionFrame) pair.f186386b;
                RectangleDetectorGoogle.this.shouldProcessNextFrame.set(false);
                RectangleDetectorGoogle rectangleDetectorGoogle = RectangleDetectorGoogle.this;
                Intrinsics.h(documentDetectionFrame);
                Intrinsics.h(overlayMetrics);
                return rectangleDetectorGoogle.process(documentDetectionFrame, overlayMetrics, shouldUseFaceDetection);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMapSingle, "flatMapSingle(...)");
        return observableFlatMapSingle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectDetectionResult process(Text text, OverlayMetrics overlayMetrics, DocumentDetectionFrame documentDetectionFrame, RectDetectionFaceResult rectDetectionFaceResult) {
        OnfidoRectF onfidoRectF;
        List listUnmodifiableList = Collections.unmodifiableList(text.f49674a);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "getTextBlocks(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listUnmodifiableList) {
            if (((com.google.mlkit.vision.text.a) obj2).j().length() > 1) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            Rect rect = (Rect) ((com.google.mlkit.vision.text.a) it8.next()).f151344b;
            OnfidoRectF onfidoRectF2 = rect != null ? OnfidoRectF.INSTANCE.toOnfidoRectF(new RectF(rect)) : null;
            if (onfidoRectF2 != null) {
                arrayList2.add(onfidoRectF2);
            }
        }
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            arrayList3.add(this.transformer.invoke$onfido_capture_sdk_core_release((OnfidoRectF) it9.next(), documentDetectionFrame.getCropRect()));
        }
        boolean z = rectDetectionFaceResult instanceof RectDetectionFaceResult.FaceDetected;
        List<OnfidoRectF> listFilterByFace = arrayList3;
        if (z) {
            listFilterByFace = filterByFace(arrayList3, ((RectDetectionFaceResult.FaceDetected) rectDetectionFaceResult).getRect());
        }
        if (listFilterByFace.isEmpty()) {
            return RectDetectionResult.NoRectDetected.INSTANCE;
        }
        if (z) {
            OnfidoRectF rect2 = ((RectDetectionFaceResult.FaceDetected) rectDetectionFaceResult).getRect();
            Iterator it10 = listFilterByFace.iterator();
            if (!it10.hasNext()) {
                throw new NoSuchElementException();
            }
            float top = ((OnfidoRectF) it10.next()).getTop();
            while (it10.hasNext()) {
                top = Math.min(top, ((OnfidoRectF) it10.next()).getTop());
            }
            float fCenterY = (rect2.centerY() - top) * 2.2f;
            float f = 2;
            float f4 = fCenterY / f;
            onfidoRectF = new OnfidoRectF(rect2.getLeft() - (rect2.width() / f), rect2.centerY() - f4, (fCenterY * 1.5f) + (rect2.getLeft() - (rect2.width() / f)), rect2.centerY() + f4);
        } else {
            Iterator it11 = listFilterByFace.iterator();
            if (!it11.hasNext()) {
                throw new NoSuchElementException();
            }
            float left = ((OnfidoRectF) it11.next()).getLeft();
            while (it11.hasNext()) {
                left = Math.min(left, ((OnfidoRectF) it11.next()).getLeft());
            }
            Iterator it12 = listFilterByFace.iterator();
            if (!it12.hasNext()) {
                throw new NoSuchElementException();
            }
            float top2 = ((OnfidoRectF) it12.next()).getTop();
            while (it12.hasNext()) {
                top2 = Math.min(top2, ((OnfidoRectF) it12.next()).getTop());
            }
            Iterator it13 = listFilterByFace.iterator();
            if (!it13.hasNext()) {
                throw new NoSuchElementException();
            }
            float right = ((OnfidoRectF) it13.next()).getRight();
            while (it13.hasNext()) {
                right = Math.max(right, ((OnfidoRectF) it13.next()).getRight());
            }
            Iterator it14 = listFilterByFace.iterator();
            if (!it14.hasNext()) {
                throw new NoSuchElementException();
            }
            float bottom = ((OnfidoRectF) it14.next()).getBottom();
            while (it14.hasNext()) {
                bottom = Math.max(bottom, ((OnfidoRectF) it14.next()).getBottom());
            }
            onfidoRectF = new OnfidoRectF(left, top2, right, bottom);
        }
        OnfidoRectF.Companion companion = OnfidoRectF.INSTANCE;
        return new RectDetectionResult.RectDetected(onfidoRectF, companion.toOnfidoRectF(overlayMetrics.getVisibleCaptureRect()), companion.toOnfidoRectF(overlayMetrics.getRealCaptureRect()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Single<RectDetectionResult> process(DocumentDetectionFrame documentDetectionFrame, OverlayMetrics overlayMetrics, boolean shouldUseFaceDetection) {
        InputImage inputImageB = InputImage.b(documentDetectionFrame.getFrameWidth(), documentDetectionFrame.getFrameHeight(), documentDetectionFrame.getRotation() * 90, documentDetectionFrame.getYuv());
        Intrinsics.checkNotNullExpressionValue(inputImageB, "fromByteArray(...)");
        tgm.d dVar = new tgm.d(new g(new tgm.b(new a(shouldUseFaceDetection, this, inputImageB, documentDetectionFrame), 1), new C20062(inputImageB, overlayMetrics, documentDetectionFrame), 0), new igm.a() { // from class: com.onfido.android.sdk.capture.detector.rectangle.b
            @Override // igm.a
            public final void run() {
                RectangleDetectorGoogle.process$lambda$2(this.f49914a);
            }
        }, 1);
        Intrinsics.checkNotNullExpressionValue(dVar, "doFinally(...)");
        return dVar;
    }
}
