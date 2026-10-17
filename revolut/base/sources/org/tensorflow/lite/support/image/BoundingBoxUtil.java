package org.tensorflow.lite.support.image;

import android.graphics.RectF;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.common.internal.SupportPreconditions;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

/* JADX INFO: loaded from: classes14.dex */
public final class BoundingBoxUtil {

    /* JADX INFO: renamed from: org.tensorflow.lite.support.image.BoundingBoxUtil$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$tensorflow$lite$support$image$BoundingBoxUtil$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$org$tensorflow$lite$support$image$BoundingBoxUtil$Type = iArr;
            try {
                iArr[Type.BOUNDARIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$tensorflow$lite$support$image$BoundingBoxUtil$Type[Type.UPPER_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$tensorflow$lite$support$image$BoundingBoxUtil$Type[Type.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum CoordinateType {
        RATIO,
        PIXEL
    }

    public enum Type {
        BOUNDARIES,
        UPPER_LEFT,
        CENTER
    }

    private BoundingBoxUtil() {
    }

    public static List<RectF> convert(TensorBuffer tensorBuffer, int[] iArr, int i, Type type, CoordinateType coordinateType, int i2, int i3) {
        int[] iArr2 = iArr;
        int length = i;
        int[] shape = tensorBuffer.getShape();
        SupportPreconditions.checkArgument(length >= (-shape.length) && length < shape.length, String.format("Axis %d is not in range (-(D+1), D), where D is the number of dimensions of input tensor (shape=%s)", Integer.valueOf(length), Arrays.toString(shape)));
        if (length < 0) {
            length += shape.length;
        }
        SupportPreconditions.checkArgument(shape[length] == 4, String.format("Size of bounding box dimension %d is not 4. Got %d in shape %s", Integer.valueOf(length), Integer.valueOf(shape[length]), Arrays.toString(shape)));
        SupportPreconditions.checkArgument(iArr2.length == 4, String.format("Bounding box index array length %d is not 4. Got index array %s", Integer.valueOf(iArr2.length), Arrays.toString(iArr2)));
        SupportPreconditions.checkArgument(tensorBuffer.getDataType() == DataType.FLOAT32, "Bounding Boxes only create from FLOAT32 buffers. Got: " + tensorBuffer.getDataType().name());
        ArrayList arrayList = new ArrayList();
        int i5 = 1;
        for (int i6 = 0; i6 < length; i6++) {
            i5 *= shape[i6];
        }
        int i21 = 1;
        for (int i22 = length + 1; i22 < shape.length; i22++) {
            i21 *= shape[i22];
        }
        float[] fArr = new float[4];
        ByteBuffer buffer = tensorBuffer.getBuffer();
        buffer.rewind();
        FloatBuffer floatBufferAsFloatBuffer = buffer.asFloatBuffer();
        int i32 = 0;
        while (i32 < i5) {
            int i33 = 0;
            while (i33 < i21) {
                for (int i43 = 0; i43 < 4; i43++) {
                    fArr[i43] = floatBufferAsFloatBuffer.get((((i32 * 4) + i43) * i21) + i33);
                }
                arrayList.add(convertOneBoundingBox(fArr, iArr2, type, coordinateType, i2, i3));
                i33++;
                iArr2 = iArr;
            }
            i32++;
            iArr2 = iArr;
        }
        buffer.rewind();
        return arrayList;
    }

    private static RectF convertFromBoundaries(float[] fArr, CoordinateType coordinateType, int i, int i2) {
        return getRectF(fArr[0], fArr[1], fArr[2], fArr[3], i, i2, coordinateType);
    }

    private static RectF convertFromCenter(float[] fArr, CoordinateType coordinateType, int i, int i2) {
        float f = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2] / 2.0f;
        float f6 = fArr[3] / 2.0f;
        return getRectF(f - f5, f4 - f6, f + f5, f4 + f6, i, i2, coordinateType);
    }

    private static RectF convertFromUpperLeft(float[] fArr, CoordinateType coordinateType, int i, int i2) {
        float f = fArr[0];
        float f4 = fArr[1];
        return getRectF(f, f4, f + fArr[2], f4 + fArr[3], i, i2, coordinateType);
    }

    private static RectF convertOneBoundingBox(float[] fArr, int[] iArr, Type type, CoordinateType coordinateType, int i, int i2) {
        float[] fArr2 = new float[4];
        for (int i3 = 0; i3 < 4; i3++) {
            fArr2[i3] = fArr[iArr[i3]];
        }
        return convertOneBoundingBox(fArr2, type, coordinateType, i, i2);
    }

    private static RectF getRectF(float f, float f4, float f5, float f6, int i, int i2, CoordinateType coordinateType) {
        if (coordinateType == CoordinateType.PIXEL) {
            return new RectF(f, f4, f5, f6);
        }
        if (coordinateType == CoordinateType.RATIO) {
            float f32 = i2;
            float f35 = i;
            return new RectF(f * f32, f4 * f35, f5 * f32, f6 * f35);
        }
        throw new IllegalArgumentException("Cannot convert coordinate type " + coordinateType);
    }

    private static RectF convertOneBoundingBox(float[] fArr, Type type, CoordinateType coordinateType, int i, int i2) {
        int i3 = AnonymousClass1.$SwitchMap$org$tensorflow$lite$support$image$BoundingBoxUtil$Type[type.ordinal()];
        if (i3 == 1) {
            return convertFromBoundaries(fArr, coordinateType, i, i2);
        }
        if (i3 == 2) {
            return convertFromUpperLeft(fArr, coordinateType, i, i2);
        }
        if (i3 == 3) {
            return convertFromCenter(fArr, coordinateType, i, i2);
        }
        throw new IllegalArgumentException("Cannot recognize BoundingBox.Type " + type);
    }
}
