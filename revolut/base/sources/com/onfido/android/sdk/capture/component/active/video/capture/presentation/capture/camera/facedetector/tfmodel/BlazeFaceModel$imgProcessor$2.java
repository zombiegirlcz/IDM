package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.tfmodel;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.tensorflow.lite.support.common.TensorOperator;
import org.tensorflow.lite.support.common.ops.NormalizeOp;
import org.tensorflow.lite.support.image.ImageOperator;
import org.tensorflow.lite.support.image.ImageProcessor;
import org.tensorflow.lite.support.image.ops.ResizeOp;
import org.tensorflow.lite.support.image.ops.ResizeWithCropOrPadOp;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lorg/tensorflow/lite/support/image/ImageProcessor;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class BlazeFaceModel$imgProcessor$2 extends u implements Function0<ImageProcessor> {
    final /* synthetic */ BlazeFaceModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlazeFaceModel$imgProcessor$2(BlazeFaceModel blazeFaceModel) {
        super(0);
        this.this$0 = blazeFaceModel;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [org.tensorflow.lite.support.image.ImageProcessor] */
    @Override // kotlin.jvm.functions.Function0
    public final ImageProcessor invoke() {
        int iMax = Math.max(this.this$0.imageWidth, this.this$0.imageHeight);
        return new ImageProcessor.Builder().add((ImageOperator) new ResizeWithCropOrPadOp(iMax, iMax)).add((ImageOperator) new ResizeOp(this.this$0.inputWidth, this.this$0.inputHeight, ResizeOp.ResizeMethod.BILINEAR)).add((TensorOperator) new NormalizeOp(BlazeFaceModel.meanNormalizeOp, BlazeFaceModel.scaleNormalizeOp)).build();
    }
}
