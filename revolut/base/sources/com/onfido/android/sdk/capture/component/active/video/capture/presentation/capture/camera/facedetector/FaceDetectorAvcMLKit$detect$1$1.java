package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector;

import android.graphics.Bitmap;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionImage;
import com.onfido.android.sdk.capture.internal.util.OnfidoRectF;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052*\u0010\u0004\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lmh/a;", "kotlin.jvm.PlatformType", "", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class FaceDetectorAvcMLKit$detect$1$1 extends u implements Function1<List<mh.a>, Unit> {
    final /* synthetic */ SingleEmitter $emitter;
    final /* synthetic */ Bitmap $faceDetectionBitmap;
    final /* synthetic */ MotionImage $motionImage;
    final /* synthetic */ FaceDetectorAvcMLKit this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceDetectorAvcMLKit$detect$1$1(FaceDetectorAvcMLKit faceDetectorAvcMLKit, SingleEmitter singleEmitter, Bitmap bitmap, MotionImage motionImage) {
        super(1);
        this.this$0 = faceDetectorAvcMLKit;
        this.$emitter = singleEmitter;
        this.$faceDetectionBitmap = bitmap;
        this.$motionImage = motionImage;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((List<mh.a>) obj2);
        return Unit.f186387a;
    }

    public final void invoke(List<mh.a> list) {
        FaceDetectorAvcMLKit faceDetectorAvcMLKit = this.this$0;
        SingleEmitter singleEmitter = this.$emitter;
        FaceDetectorAvcResultMapper faceDetectorAvcResultMapper = faceDetectorAvcMLKit.resultMapper;
        Intrinsics.h(list);
        faceDetectorAvcMLKit.emitOnSuccess(singleEmitter, faceDetectorAvcResultMapper.mapToFaceDetectorResult(list, OnfidoRectF.INSTANCE.toOnfidoRectF(this.$faceDetectionBitmap), this.$motionImage.getPreviewFrame()));
    }
}
