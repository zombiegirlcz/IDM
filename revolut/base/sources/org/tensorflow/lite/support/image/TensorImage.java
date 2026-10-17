package org.tensorflow.lite.support.image;

import android.graphics.Bitmap;
import android.media.Image;
import java.nio.ByteBuffer;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.common.internal.SupportPreconditions;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

/* JADX INFO: loaded from: classes14.dex */
public class TensorImage {
    private ImageContainer container;
    private final DataType dataType;

    public TensorImage() {
        this(DataType.UINT8);
    }

    public static TensorImage createFrom(TensorImage tensorImage, DataType dataType) {
        TensorImage tensorImage2 = new TensorImage(dataType);
        tensorImage2.container = tensorImage.container.clone();
        return tensorImage2;
    }

    public static TensorImage fromBitmap(Bitmap bitmap) {
        TensorImage tensorImage = new TensorImage();
        tensorImage.load(bitmap);
        return tensorImage;
    }

    public Bitmap getBitmap() {
        ImageContainer imageContainer = this.container;
        if (imageContainer != null) {
            return imageContainer.getBitmap();
        }
        throw new IllegalStateException("No image has been loaded yet.");
    }

    public ByteBuffer getBuffer() {
        return getTensorBuffer().getBuffer();
    }

    public ColorSpaceType getColorSpaceType() {
        ImageContainer imageContainer = this.container;
        if (imageContainer != null) {
            return imageContainer.getColorSpaceType();
        }
        throw new IllegalStateException("No image has been loaded yet.");
    }

    public DataType getDataType() {
        return this.dataType;
    }

    public int getHeight() {
        ImageContainer imageContainer = this.container;
        if (imageContainer != null) {
            return imageContainer.getHeight();
        }
        throw new IllegalStateException("No image has been loaded yet.");
    }

    public Image getMediaImage() {
        ImageContainer imageContainer = this.container;
        if (imageContainer != null) {
            return imageContainer.getMediaImage();
        }
        throw new IllegalStateException("No image has been loaded yet.");
    }

    public TensorBuffer getTensorBuffer() {
        ImageContainer imageContainer = this.container;
        if (imageContainer != null) {
            return imageContainer.getTensorBuffer(this.dataType);
        }
        throw new IllegalStateException("No image has been loaded yet.");
    }

    public int getWidth() {
        ImageContainer imageContainer = this.container;
        if (imageContainer != null) {
            return imageContainer.getWidth();
        }
        throw new IllegalStateException("No image has been loaded yet.");
    }

    public void load(Bitmap bitmap) {
        this.container = BitmapContainer.create(bitmap);
    }

    public TensorImage(DataType dataType) {
        this.container = null;
        SupportPreconditions.checkArgument(dataType == DataType.UINT8 || dataType == DataType.FLOAT32, "Illegal data type for TensorImage: Only FLOAT32 and UINT8 are accepted");
        this.dataType = dataType;
    }

    public void load(float[] fArr, int[] iArr) {
        TensorBuffer tensorBufferCreateDynamic = TensorBuffer.createDynamic(getDataType());
        tensorBufferCreateDynamic.loadArray(fArr, iArr);
        load(tensorBufferCreateDynamic);
    }

    public void load(int[] iArr, int[] iArr2) {
        TensorBuffer tensorBufferCreateDynamic = TensorBuffer.createDynamic(getDataType());
        tensorBufferCreateDynamic.loadArray(iArr, iArr2);
        load(tensorBufferCreateDynamic);
    }

    public void load(TensorBuffer tensorBuffer) {
        load(tensorBuffer, ColorSpaceType.RGB);
    }

    public void load(TensorBuffer tensorBuffer, ColorSpaceType colorSpaceType) {
        SupportPreconditions.checkArgument(colorSpaceType == ColorSpaceType.RGB || colorSpaceType == ColorSpaceType.GRAYSCALE, "Only ColorSpaceType.RGB and ColorSpaceType.GRAYSCALE are supported. Use `load(TensorBuffer, ImageProperties)` for other color space types.");
        this.container = TensorBufferContainer.create(tensorBuffer, colorSpaceType);
    }

    public void load(TensorBuffer tensorBuffer, ImageProperties imageProperties) {
        this.container = TensorBufferContainer.create(tensorBuffer, imageProperties);
    }

    public void load(ByteBuffer byteBuffer, ImageProperties imageProperties) {
        TensorBuffer tensorBufferCreateDynamic = TensorBuffer.createDynamic(DataType.UINT8);
        tensorBufferCreateDynamic.loadBuffer(byteBuffer, new int[]{byteBuffer.limit()});
        this.container = TensorBufferContainer.create(tensorBufferCreateDynamic, imageProperties);
    }

    public void load(Image image) {
        this.container = MediaImageContainer.create(image);
    }
}
