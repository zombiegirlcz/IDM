package org.tensorflow.lite.support.image.ops;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import org.tensorflow.lite.support.common.internal.SupportPreconditions;
import org.tensorflow.lite.support.image.ColorSpaceType;
import org.tensorflow.lite.support.image.ImageOperator;
import org.tensorflow.lite.support.image.TensorImage;

/* JADX INFO: loaded from: classes14.dex */
public class ResizeWithCropOrPadOp implements ImageOperator {
    private final Bitmap output;
    private final int targetHeight;
    private final int targetWidth;

    public ResizeWithCropOrPadOp(int i, int i2) {
        this.targetHeight = i;
        this.targetWidth = i2;
        this.output = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
    }

    private static PointF transformImpl(PointF pointF, int i, int i2, int i3, int i5) {
        return new PointF(pointF.x + ((i5 - i2) / 2), pointF.y + ((i3 - i) / 2));
    }

    @Override // org.tensorflow.lite.support.image.ImageOperator
    public int getOutputImageHeight(int i, int i2) {
        return this.targetHeight;
    }

    @Override // org.tensorflow.lite.support.image.ImageOperator
    public int getOutputImageWidth(int i, int i2) {
        return this.targetWidth;
    }

    @Override // org.tensorflow.lite.support.image.ImageOperator
    public PointF inverseTransform(PointF pointF, int i, int i2) {
        return transformImpl(pointF, this.targetHeight, this.targetWidth, i, i2);
    }

    @Override // org.tensorflow.lite.support.image.ImageOperator, org.tensorflow.lite.support.common.Operator
    public TensorImage apply(TensorImage tensorImage) {
        int i;
        int i2;
        int i3;
        int i5;
        int i6;
        int i21;
        int i22 = 0;
        SupportPreconditions.checkArgument(tensorImage.getColorSpaceType() == ColorSpaceType.RGB, "Only RGB images are supported in ResizeWithCropOrPadOp, but not " + tensorImage.getColorSpaceType().name());
        Bitmap bitmap = tensorImage.getBitmap();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i32 = this.targetWidth;
        if (i32 > width) {
            i5 = (i32 - width) / 2;
            i3 = i5 + width;
            i2 = width;
            i = 0;
        } else {
            i = (width - i32) / 2;
            i2 = i + i32;
            i3 = i32;
            i5 = 0;
        }
        int i33 = this.targetHeight;
        if (i33 > height) {
            i6 = (i33 - height) / 2;
            i21 = i6 + height;
        } else {
            int i43 = (height - i33) / 2;
            int i59 = i43 + i33;
            i6 = 0;
            i22 = i43;
            height = i59;
            i21 = i33;
        }
        new Canvas(this.output).drawBitmap(bitmap, new Rect(i, i22, i2, height), new Rect(i5, i6, i3, i21), (Paint) null);
        tensorImage.load(this.output);
        return tensorImage;
    }
}
