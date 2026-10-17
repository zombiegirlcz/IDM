package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionImage;
import igm.o;
import io.reactivex.rxjava3.core.SingleSource;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/rxjava3/core/SingleSource;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorResult;", "kotlin.jvm.PlatformType", "it", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionImage;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class FaceDetectorAvcTflite$resultObservable$2<T, R> implements o {
    final /* synthetic */ FaceDetectorAvcTflite this$0;

    public FaceDetectorAvcTflite$resultObservable$2(FaceDetectorAvcTflite faceDetectorAvcTflite) {
        this.this$0 = faceDetectorAvcTflite;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FaceDetectorResult apply$lambda$0(FaceDetectorAvcTflite this$0, MotionImage motionImage) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.h(motionImage);
        return this$0.detect(motionImage);
    }

    @Override // igm.o
    @NotNull
    public final SingleSource apply(final MotionImage motionImage) {
        final FaceDetectorAvcTflite faceDetectorAvcTflite = this.this$0;
        return new tgm.b(new Callable() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FaceDetectorAvcTflite$resultObservable$2.apply$lambda$0(faceDetectorAvcTflite, motionImage);
            }
        }, 3).k(faceDetectorAvcTflite.schedulersProvider.getComputation());
    }
}
