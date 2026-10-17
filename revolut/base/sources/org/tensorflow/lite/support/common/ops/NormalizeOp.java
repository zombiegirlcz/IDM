package org.tensorflow.lite.support.common.ops;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.common.TensorOperator;
import org.tensorflow.lite.support.common.internal.SupportPreconditions;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

/* JADX INFO: loaded from: classes14.dex */
public class NormalizeOp implements TensorOperator {
    private final boolean isIdentityOp;
    private final float[] mean;
    private final int numChannels;
    private final float[] stddev;

    public NormalizeOp(float f, float f4) {
        if (f == BitmapDescriptorFactory.HUE_RED && (f4 == BitmapDescriptorFactory.HUE_RED || Float.isInfinite(f4))) {
            f4 = 1.0f;
        }
        SupportPreconditions.checkArgument(f4 != BitmapDescriptorFactory.HUE_RED, "Stddev cannot be zero.");
        this.isIdentityOp = f == BitmapDescriptorFactory.HUE_RED && f4 == 1.0f;
        this.mean = new float[]{f};
        this.stddev = new float[]{f4};
        this.numChannels = 1;
    }

    @Override // org.tensorflow.lite.support.common.TensorOperator, org.tensorflow.lite.support.common.Operator
    public TensorBuffer apply(TensorBuffer tensorBuffer) {
        if (this.isIdentityOp) {
            return tensorBuffer;
        }
        int[] shape = tensorBuffer.getShape();
        int i = this.numChannels;
        SupportPreconditions.checkArgument(i == 1 || (shape.length != 0 && shape[shape.length - 1] == i), "Number of means (stddevs) is not same with number of channels (size of last axis).");
        float[] floatArray = tensorBuffer.getFloatArray();
        int i2 = 0;
        for (int i3 = 0; i3 < floatArray.length; i3++) {
            floatArray[i3] = (floatArray[i3] - this.mean[i2]) / this.stddev[i2];
            i2 = (i2 + 1) % this.numChannels;
        }
        TensorBuffer tensorBufferCreateDynamic = tensorBuffer.isDynamic() ? TensorBuffer.createDynamic(DataType.FLOAT32) : TensorBuffer.createFixedSize(shape, DataType.FLOAT32);
        tensorBufferCreateDynamic.loadArray(floatArray, shape);
        return tensorBufferCreateDynamic;
    }

    public NormalizeOp(float[] fArr, float[] fArr2) {
        SupportPreconditions.checkNotNull(fArr, "Mean cannot be null");
        SupportPreconditions.checkNotNull(fArr2, "Stddev cannot be null");
        SupportPreconditions.checkArgument(fArr.length == fArr2.length, "Per channel normalization requires same number of means and stddevs");
        SupportPreconditions.checkArgument(fArr.length > 0, "Means and stddevs are empty.");
        this.mean = (float[]) fArr.clone();
        this.stddev = (float[]) fArr2.clone();
        this.numChannels = fArr.length;
        boolean z = true;
        for (int i = 0; i < this.numChannels; i++) {
            SupportPreconditions.checkArgument(this.stddev[i] != BitmapDescriptorFactory.HUE_RED, "Stddev cannot be zero.");
            if (this.stddev[i] != 1.0f || this.mean[i] != BitmapDescriptorFactory.HUE_RED) {
                z = false;
            }
        }
        this.isIdentityOp = z;
    }
}
