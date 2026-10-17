package com.onfido.android.sdk.capture.detector.face;

import a31.o;
import abf.c;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import com.onfido.android.sdk.capture.detector.helper.DocumentDetectionExtensionKt;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.ui.camera.DocumentDetectionFrame;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import com.onfido.android.sdk.capture.validation.device.FaceOnDocumentValidationResult;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tgm.b;
import tgm.d;
import zhm.d0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 12\u00020\u0001:\u00011B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001d\u001a\u00020\u001c*\b\u0012\u0004\u0012\u00020\u00130\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010)\u001a\u0004\u0018\u00010\b8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/onfido/android/sdk/capture/detector/face/FaceOnDocumentDetectorGoogle;", "Lcom/onfido/android/sdk/capture/detector/face/FaceOnDocumentDetector;", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "remoteConfig", "<init>", "(Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;)V", "Lcom/google/mlkit/vision/face/FaceDetectorOptions;", "options", "Lcom/google/mlkit/vision/face/FaceDetector;", "getFaceDetector", "(Lcom/google/mlkit/vision/face/FaceDetectorOptions;)Lcom/google/mlkit/vision/face/FaceDetector;", "", "faceDetectionMode", "getFaceDetectorOptions", "(I)Lcom/google/mlkit/vision/face/FaceDetectorOptions;", "Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;", "documentFrame", "degree", "Lio/reactivex/rxjava3/core/Single;", "Lcom/onfido/android/sdk/capture/validation/device/FaceOnDocumentValidationResult;", "detectWithDegree", "(Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;I)Lio/reactivex/rxjava3/core/Single;", "", "Lmh/a;", "toFaceDetectionResult", "(Ljava/util/List;)Lcom/onfido/android/sdk/capture/validation/device/FaceOnDocumentValidationResult;", "Lio/reactivex/rxjava3/core/SingleEmitter;", "result", "", "onSuccessIfNotDisposed", "(Lio/reactivex/rxjava3/core/SingleEmitter;Lcom/onfido/android/sdk/capture/validation/device/FaceOnDocumentValidationResult;)V", "detect", "(Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;)Lio/reactivex/rxjava3/core/Single;", "close", "()V", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "", "isRealtimeProcessingOngoing", "Z", "fastFaceDetectionOptions", "Lcom/google/mlkit/vision/face/FaceDetectorOptions;", "fastDetector", "Lcom/google/mlkit/vision/face/FaceDetector;", "getFastDetector", "()Lcom/google/mlkit/vision/face/FaceDetector;", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "Lcom/onfido/android/sdk/capture/ui/camera/FaceDetectionFrame;", "faceDetectionSubject", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FaceOnDocumentDetectorGoogle implements FaceOnDocumentDetector {

    @NotNull
    private PublishSubject faceDetectionSubject;
    private com.google.mlkit.vision.face.FaceDetector fastDetector;

    @NotNull
    private final FaceDetectorOptions fastFaceDetectionOptions;
    private boolean isRealtimeProcessingOngoing;

    @NotNull
    private final OnfidoRemoteConfig remoteConfig;

    @NotNull
    private static final FaceOnDocumentValidationResult OMITTED_FRAME_ANALYSE_RESULT = new FaceOnDocumentValidationResult(null == true ? 1 : 0, false, 1, null == true ? 1 : 0);

    @NotNull
    private static final Integer[] IMAGE_DEGREES = {0, 90, 180, 270};

    public FaceOnDocumentDetectorGoogle(@NotNull OnfidoRemoteConfig remoteConfig) {
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        this.remoteConfig = remoteConfig;
        this.fastFaceDetectionOptions = getFaceDetectorOptions(1);
        this.faceDetectionSubject = ch.qos.logback.core.util.a.n("create(...)");
    }

    private final Single<FaceOnDocumentValidationResult> detectWithDegree(DocumentDetectionFrame documentFrame, int degree) {
        b bVar = new b(new a(documentFrame, degree, this), 0);
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detectWithDegree$lambda$3(DocumentDetectionFrame documentFrame, int i, FaceOnDocumentDetectorGoogle this$0, SingleEmitter emitter) {
        Task taskProcess;
        Intrinsics.checkNotNullParameter(documentFrame, "$documentFrame");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        try {
            InputImage inputImageFromJpeg = DocumentDetectionExtensionKt.toInputImageFromJpeg(documentFrame, i, this$0.remoteConfig.getDocumentPostCaptureValidationTargetWidth());
            com.google.mlkit.vision.face.FaceDetector fastDetector = this$0.getFastDetector();
            if (fastDetector == null || (taskProcess = fastDetector.process(inputImageFromJpeg)) == null) {
                return;
            }
            Task taskAddOnSuccessListener = taskProcess.addOnSuccessListener(new o(8, new FaceOnDocumentDetectorGoogle$detectWithDegree$1$1(this$0, emitter)));
            if (taskAddOnSuccessListener != null) {
                taskAddOnSuccessListener.addOnFailureListener(new c(this$0, emitter, 15));
            }
        } catch (Exception unused) {
            this$0.isRealtimeProcessingOngoing = false;
            this$0.onSuccessIfNotDisposed(emitter, OMITTED_FRAME_ANALYSE_RESULT);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detectWithDegree$lambda$3$lambda$1(Function1 tmp0, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detectWithDegree$lambda$3$lambda$2(FaceOnDocumentDetectorGoogle this$0, SingleEmitter emitter, Exception it8) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        Intrinsics.checkNotNullParameter(it8, "it");
        this$0.isRealtimeProcessingOngoing = false;
        this$0.onSuccessIfNotDisposed(emitter, OMITTED_FRAME_ANALYSE_RESULT);
    }

    private final com.google.mlkit.vision.face.FaceDetector getFaceDetector(FaceDetectorOptions options) {
        oh.a aVarF = pd.b.f(options);
        Intrinsics.checkNotNullExpressionValue(aVarF, "getClient(...)");
        return aVarF;
    }

    private final FaceDetectorOptions getFaceDetectorOptions(int faceDetectionMode) {
        FaceDetectorOptions faceDetectorOptions = new FaceDetectorOptions(1, 1, 1, faceDetectionMode, 0.1f);
        Intrinsics.checkNotNullExpressionValue(faceDetectorOptions, "build(...)");
        return faceDetectorOptions;
    }

    private final com.google.mlkit.vision.face.FaceDetector getFastDetector() {
        com.google.mlkit.vision.face.FaceDetector faceDetector = this.fastDetector;
        return faceDetector == null ? getFaceDetector(this.fastFaceDetectionOptions) : faceDetector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSuccessIfNotDisposed(SingleEmitter singleEmitter, FaceOnDocumentValidationResult faceOnDocumentValidationResult) {
        if (singleEmitter.isDisposed()) {
            return;
        }
        singleEmitter.onSuccess(faceOnDocumentValidationResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FaceOnDocumentValidationResult toFaceDetectionResult(List<? extends mh.a> list) {
        return new FaceOnDocumentValidationResult(Boolean.valueOf(!list.isEmpty()), true);
    }

    @Override // com.onfido.android.sdk.capture.detector.face.FaceOnDocumentDetector
    public void close() {
        com.google.mlkit.vision.face.FaceDetector fastDetector = getFastDetector();
        if (fastDetector != null) {
            fastDetector.close();
        }
        this.fastDetector = null;
        this.faceDetectionSubject = ch.qos.logback.core.util.a.n("create(...)");
        this.isRealtimeProcessingOngoing = false;
    }

    @Override // com.onfido.android.sdk.capture.detector.face.FaceOnDocumentDetector
    @NotNull
    public synchronized Single<FaceOnDocumentValidationResult> detect(@NotNull DocumentDetectionFrame documentFrame) {
        Intrinsics.checkNotNullParameter(documentFrame, "documentFrame");
        if (this.isRealtimeProcessingOngoing) {
            return RxExtensionsKt.asSingle(OMITTED_FRAME_ANALYSE_RESULT);
        }
        this.isRealtimeProcessingOngoing = true;
        Integer[] numArr = IMAGE_DEGREES;
        ArrayList arrayList = new ArrayList(numArr.length);
        for (Integer num : numArr) {
            arrayList.add(detectWithDegree(documentFrame, num.intValue()));
        }
        igm.o oVar = new igm.o() { // from class: com.onfido.android.sdk.capture.detector.face.FaceOnDocumentDetectorGoogle.detect.2
            @Override // igm.o
            @NotNull
            public final FaceOnDocumentValidationResult apply(@NotNull Object[] outputs) {
                Intrinsics.checkNotNullParameter(outputs, "outputs");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : outputs) {
                    if (obj2 instanceof FaceOnDocumentValidationResult) {
                        arrayList2.add(obj2);
                    }
                }
                FaceOnDocumentValidationResult faceOnDocumentValidationResult = (FaceOnDocumentValidationResult) d0.d0(arrayList2);
                return faceOnDocumentValidationResult == null ? FaceOnDocumentDetectorGoogle.OMITTED_FRAME_ANALYSE_RESULT : faceOnDocumentValidationResult;
            }
        };
        Objects.requireNonNull(oVar, "zipper is null");
        d dVar = new d(arrayList, oVar, 4);
        Intrinsics.checkNotNullExpressionValue(dVar, "zip(...)");
        return dVar;
    }
}
