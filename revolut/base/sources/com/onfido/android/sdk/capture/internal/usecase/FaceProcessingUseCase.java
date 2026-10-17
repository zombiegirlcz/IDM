package com.onfido.android.sdk.capture.internal.usecase;

import com.onfido.android.sdk.capture.detector.face.FaceDetectionResult;
import com.onfido.android.sdk.capture.detector.face.FaceDetector;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import igm.p;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ogm.e;
import org.jetbrains.annotations.NotNull;
import pgm.b0;
import pgm.m;
import pgm.s0;
import pgm.x;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\r\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fJ\f\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/usecase/FaceProcessingUseCase;", "", "faceDetectorGoogle", "Lcom/onfido/android/sdk/capture/detector/face/FaceDetector;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "(Lcom/onfido/android/sdk/capture/detector/face/FaceDetector;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;)V", "getFaceDetectionFlowable", "Lio/reactivex/rxjava3/core/Flowable;", "Lcom/onfido/android/sdk/capture/detector/face/FaceDetectionResult;", "observeFaceOut", "Lio/reactivex/rxjava3/core/Completable;", "observeFaceOut$onfido_capture_sdk_core_release", "isInsideVideoFrame", "", "Lcom/onfido/android/sdk/capture/detector/face/FaceDetectionResult$FaceDetected;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FaceProcessingUseCase {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final long FACE_OUT_TIMEOUT_S = 3;

    @Deprecated
    public static final float MINIMUM_RATIO_DIFFERENCE_THRESHOLD = 0.1f;

    @NotNull
    private final FaceDetector faceDetectorGoogle;

    @NotNull
    private final SchedulersProvider schedulersProvider;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/usecase/FaceProcessingUseCase$Companion;", "", "()V", "FACE_OUT_TIMEOUT_S", "", "MINIMUM_RATIO_DIFFERENCE_THRESHOLD", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FaceProcessingUseCase(@NotNull FaceDetector faceDetectorGoogle, @NotNull SchedulersProvider schedulersProvider) {
        Intrinsics.checkNotNullParameter(faceDetectorGoogle, "faceDetectorGoogle");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        this.faceDetectorGoogle = faceDetectorGoogle;
        this.schedulersProvider = schedulersProvider;
    }

    private final Flowable getFaceDetectionFlowable() {
        return this.faceDetectorGoogle.getFaceTrackingObservable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isInsideVideoFrame(FaceDetectionResult.FaceDetected faceDetected) {
        return faceDetected.getFrameRect().contains$onfido_capture_sdk_core_release(faceDetected.getFaceRect()) && ((Math.abs(((float) 1) - (((float) faceDetected.getFaceRect().width$onfido_capture_sdk_core_release()) / ((float) faceDetected.getFaceRect().height$onfido_capture_sdk_core_release()))) > 0.1f ? 1 : (Math.abs(((float) 1) - (((float) faceDetected.getFaceRect().width$onfido_capture_sdk_core_release()) / ((float) faceDetected.getFaceRect().height$onfido_capture_sdk_core_release()))) == 0.1f ? 0 : -1)) < 0);
    }

    @NotNull
    public final Completable observeFaceOut$onfido_capture_sdk_core_release() {
        s0 s0VarG = getFaceDetectionFlowable().g(FaceDetectionResult.FaceDetected.class);
        Intrinsics.checkNotNullExpressionValue(s0VarG, "ofType(...)");
        b0 b0VarB = s0VarG.b(new p() { // from class: com.onfido.android.sdk.capture.internal.usecase.FaceProcessingUseCase$observeFaceOut$1
            @Override // igm.p
            public final boolean test(@NotNull FaceDetectionResult.FaceDetected it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.this$0.isInsideVideoFrame(it8);
            }
        });
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Scheduler timer = this.schedulersProvider.getTimer();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(timer, "scheduler is null");
        e eVar = new e(new x(new m(b0VarB, timer)), 7);
        Intrinsics.checkNotNullExpressionValue(eVar, "ignoreElement(...)");
        return eVar;
    }
}
