package org.tensorflow.lite.support.image;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

/* JADX INFO: loaded from: classes14.dex */
class ImageConversions {

    /* JADX INFO: renamed from: org.tensorflow.lite.support.image.ImageConversions$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$tensorflow$lite$DataType;

        static {
            int[] iArr = new int[DataType.values().length];
            $SwitchMap$org$tensorflow$lite$DataType = iArr;
            try {
                iArr[DataType.UINT8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$tensorflow$lite$DataType[DataType.FLOAT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private ImageConversions() {
    }

    public static void convertBitmapToTensorBuffer(Bitmap bitmap, TensorBuffer tensorBuffer) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        int i2 = 0;
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int[] iArr2 = {height, width, 3};
        int i3 = AnonymousClass1.$SwitchMap$org$tensorflow$lite$DataType[tensorBuffer.getDataType().ordinal()];
        if (i3 == 1) {
            byte[] bArr = new byte[i * 3];
            int i5 = 0;
            while (i2 < i) {
                int i6 = iArr[i2];
                bArr[i5] = (byte) ((i6 >> 16) & 255);
                int i21 = i5 + 2;
                bArr[i5 + 1] = (byte) ((i6 >> 8) & 255);
                i5 += 3;
                bArr[i21] = (byte) (i6 & 255);
                i2++;
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.order(ByteOrder.nativeOrder());
            tensorBuffer.loadBuffer(byteBufferWrap, iArr2);
            return;
        }
        if (i3 != 2) {
            throw new IllegalStateException("The type of TensorBuffer, " + tensorBuffer.getBuffer() + ", is unsupported.");
        }
        float[] fArr = new float[i * 3];
        int i22 = 0;
        while (i2 < i) {
            int i32 = iArr[i2];
            fArr[i22] = (i32 >> 16) & 255;
            int i33 = i22 + 2;
            fArr[i22 + 1] = (i32 >> 8) & 255;
            i22 += 3;
            fArr[i33] = i32 & 255;
            i2++;
        }
        tensorBuffer.loadArray(fArr, iArr2);
    }

    public static Bitmap convertGrayscaleTensorBufferToBitmap(TensorBuffer tensorBuffer) {
        DataType dataType = tensorBuffer.getDataType();
        DataType dataType2 = DataType.UINT8;
        if (dataType != dataType2) {
            tensorBuffer = TensorBuffer.createFrom(tensorBuffer, dataType2);
        }
        int[] shape = tensorBuffer.getShape();
        ColorSpaceType colorSpaceType = ColorSpaceType.GRAYSCALE;
        colorSpaceType.assertShape(shape);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(colorSpaceType.getWidth(shape), colorSpaceType.getHeight(shape), colorSpaceType.toBitmapConfig());
        tensorBuffer.getBuffer().rewind();
        bitmapCreateBitmap.copyPixelsFromBuffer(tensorBuffer.getBuffer());
        return bitmapCreateBitmap;
    }

    public static Bitmap convertRgbTensorBufferToBitmap(TensorBuffer tensorBuffer) {
        int[] shape = tensorBuffer.getShape();
        ColorSpaceType colorSpaceType = ColorSpaceType.RGB;
        colorSpaceType.assertShape(shape);
        int height = colorSpaceType.getHeight(shape);
        int width = colorSpaceType.getWidth(shape);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, colorSpaceType.toBitmapConfig());
        int i = width * height;
        int[] iArr = new int[i];
        int[] intArray = tensorBuffer.getIntArray();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i5 = intArray[i2];
            int i6 = i2 + 2;
            int i21 = intArray[i2 + 1];
            i2 += 3;
            iArr[i3] = Color.rgb(i5, i21, intArray[i6]);
        }
        bitmapCreateBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmapCreateBitmap;
    }
}
