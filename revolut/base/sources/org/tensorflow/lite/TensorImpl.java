package org.tensorflow.lite;

import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import org.tensorflow.lite.Tensor;
import p.a;

/* JADX INFO: loaded from: classes14.dex */
final class TensorImpl implements Tensor {
    private final DataType dtype;
    private long nativeHandle;
    private final Tensor.QuantizationParams quantizationParamsCopy;
    private int[] shapeCopy;
    private final int[] shapeSignatureCopy;

    private TensorImpl(long j2) {
        this.nativeHandle = j2;
        this.dtype = DataTypeUtils.fromC(dtype(j2));
        this.shapeCopy = shape(j2);
        this.shapeSignatureCopy = shapeSignature(j2);
        this.quantizationParamsCopy = new Tensor.QuantizationParams(quantizationScale(j2), quantizationZeroPoint(j2));
    }

    private ByteBuffer buffer() {
        return buffer(this.nativeHandle).order(ByteOrder.nativeOrder());
    }

    private static native ByteBuffer buffer(long j2);

    public static int computeNumDimensions(Object obj2) {
        if (obj2 == null || !obj2.getClass().isArray()) {
            return 0;
        }
        if (Array.getLength(obj2) != 0) {
            return computeNumDimensions(Array.get(obj2, 0)) + 1;
        }
        throw new IllegalArgumentException("Array lengths cannot be 0.");
    }

    public static int computeNumElements(int[] iArr) {
        int i = 1;
        for (int i2 : iArr) {
            i *= i2;
        }
        return i;
    }

    private int[] computeShapeOf(Object obj2) {
        int iComputeNumDimensions = computeNumDimensions(obj2);
        if (this.dtype == DataType.STRING) {
            Class<?> componentType = obj2.getClass();
            if (componentType.isArray()) {
                while (componentType.isArray()) {
                    componentType = componentType.getComponentType();
                }
                if (Byte.TYPE.equals(componentType)) {
                    iComputeNumDimensions--;
                }
            }
        }
        int[] iArr = new int[iComputeNumDimensions];
        fillShape(obj2, 0, iArr);
        return iArr;
    }

    private static native long create(long j2, int i, int i2);

    private static native long createSignatureInputTensor(long j2, String str);

    private static native long createSignatureOutputTensor(long j2, String str);

    private static native void delete(long j2);

    private static native int dtype(long j2);

    public static void fillShape(Object obj2, int i, int[] iArr) {
        if (iArr == null || i == iArr.length) {
            return;
        }
        int length = Array.getLength(obj2);
        int i2 = iArr[i];
        if (i2 == 0) {
            iArr[i] = length;
        } else if (i2 != length) {
            throw new IllegalArgumentException(String.format("Mismatched lengths (%d and %d) in dimension %d", Integer.valueOf(iArr[i]), Integer.valueOf(length), Integer.valueOf(i)));
        }
        int i3 = i + 1;
        if (i3 == iArr.length) {
            return;
        }
        for (int i5 = 0; i5 < length; i5++) {
            fillShape(Array.get(obj2, i5), i3, iArr);
        }
    }

    public static TensorImpl fromIndex(long j2, int i) {
        return new TensorImpl(create(j2, i, 0));
    }

    public static TensorImpl fromSignatureInput(long j2, String str) {
        long jCreateSignatureInputTensor = createSignatureInputTensor(j2, str);
        if (jCreateSignatureInputTensor != -1) {
            return new TensorImpl(jCreateSignatureInputTensor);
        }
        throw new IllegalArgumentException(a.p("Input error: input ", str, " not found."));
    }

    public static TensorImpl fromSignatureOutput(long j2, String str) {
        long jCreateSignatureOutputTensor = createSignatureOutputTensor(j2, str);
        if (jCreateSignatureOutputTensor != -1) {
            return new TensorImpl(jCreateSignatureOutputTensor);
        }
        throw new IllegalArgumentException(a.p("Input error: output ", str, " not found."));
    }

    private static native boolean hasDelegateBufferHandle(long j2);

    private static native int index(long j2);

    private static boolean isBuffer(Object obj2) {
        return obj2 instanceof Buffer;
    }

    private static boolean isByteBuffer(Object obj2) {
        return obj2 instanceof ByteBuffer;
    }

    private static native String name(long j2);

    private static native int numBytes(long j2);

    private static native float quantizationScale(long j2);

    private static native int quantizationZeroPoint(long j2);

    private static native void readMultiDimensionalArray(long j2, Object obj2);

    private static native int[] shape(long j2);

    private static native int[] shapeSignature(long j2);

    private void throwIfDstShapeIsIncompatible(Object obj2) {
        if (isBuffer(obj2)) {
            Buffer buffer = (Buffer) obj2;
            int iNumBytes = numBytes();
            int iCapacity = isByteBuffer(obj2) ? buffer.capacity() : buffer.capacity() * this.dtype.byteSize();
            if (iNumBytes > iCapacity) {
                throw new IllegalArgumentException(String.format("Cannot copy from a TensorFlowLite tensor (%s) with %d bytes to a Java Buffer with %d bytes.", name(), Integer.valueOf(iNumBytes), Integer.valueOf(iCapacity)));
            }
            return;
        }
        int[] iArrComputeShapeOf = computeShapeOf(obj2);
        if (Arrays.equals(iArrComputeShapeOf, this.shapeCopy)) {
            return;
        }
        throw new IllegalArgumentException(v0.a.i(v0.a.m("Cannot copy from a TensorFlowLite tensor (", name(), ") with shape ", Arrays.toString(this.shapeCopy), " to a Java object with shape "), Arrays.toString(iArrComputeShapeOf), "."));
    }

    private void throwIfSrcShapeIsIncompatible(Object obj2) {
        if (isBuffer(obj2)) {
            Buffer buffer = (Buffer) obj2;
            int iNumBytes = numBytes();
            int iCapacity = isByteBuffer(obj2) ? buffer.capacity() : buffer.capacity() * this.dtype.byteSize();
            if (iNumBytes != iCapacity) {
                throw new IllegalArgumentException(String.format("Cannot copy to a TensorFlowLite tensor (%s) with %d bytes from a Java Buffer with %d bytes.", name(), Integer.valueOf(iNumBytes), Integer.valueOf(iCapacity)));
            }
            return;
        }
        int[] iArrComputeShapeOf = computeShapeOf(obj2);
        if (Arrays.equals(iArrComputeShapeOf, this.shapeCopy)) {
            return;
        }
        throw new IllegalArgumentException(v0.a.i(v0.a.m("Cannot copy to a TensorFlowLite tensor (", name(), ") with shape ", Arrays.toString(this.shapeCopy), " from a Java object with shape "), Arrays.toString(iArrComputeShapeOf), "."));
    }

    private void throwIfTypeIsIncompatible(Object obj2) {
        DataType dataTypeDataTypeOf;
        if (isByteBuffer(obj2) || (dataTypeDataTypeOf = dataTypeOf(obj2)) == this.dtype || DataTypeUtils.toStringName(dataTypeDataTypeOf).equals(DataTypeUtils.toStringName(this.dtype))) {
            return;
        }
        throw new IllegalArgumentException("Cannot convert between a TensorFlowLite tensor with type " + this.dtype + " and a Java object of type " + obj2.getClass().getName() + " (which is compatible with the TensorFlowLite type " + dataTypeDataTypeOf + ").");
    }

    private static native void writeDirectBuffer(long j2, Buffer buffer);

    private static native void writeMultiDimensionalArray(long j2, Object obj2);

    private static native void writeScalar(long j2, Object obj2);

    @Override // org.tensorflow.lite.Tensor
    public ByteBuffer asReadOnlyBuffer() {
        return buffer().asReadOnlyBuffer().order(ByteOrder.nativeOrder());
    }

    public void close() {
        delete(this.nativeHandle);
        this.nativeHandle = 0L;
    }

    public void copyTo(Object obj2) {
        if (obj2 == null) {
            if (!hasDelegateBufferHandle(this.nativeHandle)) {
                throw new IllegalArgumentException("Null outputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        throwIfTypeIsIncompatible(obj2);
        throwIfDstShapeIsIncompatible(obj2);
        if (isBuffer(obj2)) {
            copyTo((Buffer) obj2);
        } else {
            readMultiDimensionalArray(this.nativeHandle, obj2);
        }
    }

    @Override // org.tensorflow.lite.Tensor
    public DataType dataType() {
        return this.dtype;
    }

    public DataType dataTypeOf(Object obj2) {
        Class<?> componentType = obj2.getClass();
        if (componentType.isArray()) {
            while (componentType.isArray()) {
                componentType = componentType.getComponentType();
            }
            if (Float.TYPE.equals(componentType)) {
                return DataType.FLOAT32;
            }
            if (Integer.TYPE.equals(componentType)) {
                return DataType.INT32;
            }
            if (Short.TYPE.equals(componentType)) {
                return DataType.INT16;
            }
            if (Byte.TYPE.equals(componentType)) {
                DataType dataType = this.dtype;
                DataType dataType2 = DataType.STRING;
                return dataType == dataType2 ? dataType2 : DataType.UINT8;
            }
            if (Long.TYPE.equals(componentType)) {
                return DataType.INT64;
            }
            if (Boolean.TYPE.equals(componentType)) {
                return DataType.BOOL;
            }
            if (String.class.equals(componentType)) {
                return DataType.STRING;
            }
        } else {
            if (Float.class.equals(componentType) || (obj2 instanceof FloatBuffer)) {
                return DataType.FLOAT32;
            }
            if (Integer.class.equals(componentType) || (obj2 instanceof IntBuffer)) {
                return DataType.INT32;
            }
            if (Short.class.equals(componentType) || (obj2 instanceof ShortBuffer)) {
                return DataType.INT16;
            }
            if (Byte.class.equals(componentType)) {
                return DataType.UINT8;
            }
            if (Long.class.equals(componentType) || (obj2 instanceof LongBuffer)) {
                return DataType.INT64;
            }
            if (Boolean.class.equals(componentType)) {
                return DataType.BOOL;
            }
            if (String.class.equals(componentType)) {
                return DataType.STRING;
            }
        }
        throw new IllegalArgumentException(v0.a.g(obj2, "DataType error: cannot resolve DataType of "));
    }

    public int[] getInputShapeIfDifferent(Object obj2) {
        if (obj2 == null || isBuffer(obj2)) {
            return null;
        }
        throwIfTypeIsIncompatible(obj2);
        int[] iArrComputeShapeOf = computeShapeOf(obj2);
        if (Arrays.equals(this.shapeCopy, iArrComputeShapeOf)) {
            return null;
        }
        return iArrComputeShapeOf;
    }

    @Override // org.tensorflow.lite.Tensor
    public int index() {
        return index(this.nativeHandle);
    }

    @Override // org.tensorflow.lite.Tensor
    public String name() {
        return name(this.nativeHandle);
    }

    @Override // org.tensorflow.lite.Tensor
    public int numBytes() {
        return numBytes(this.nativeHandle);
    }

    @Override // org.tensorflow.lite.Tensor
    public int numDimensions() {
        return this.shapeCopy.length;
    }

    @Override // org.tensorflow.lite.Tensor
    public int numElements() {
        return computeNumElements(this.shapeCopy);
    }

    @Override // org.tensorflow.lite.Tensor
    public Tensor.QuantizationParams quantizationParams() {
        return this.quantizationParamsCopy;
    }

    public void refreshShape() {
        this.shapeCopy = shape(this.nativeHandle);
    }

    public void setTo(Object obj2) {
        if (obj2 == null) {
            if (!hasDelegateBufferHandle(this.nativeHandle)) {
                throw new IllegalArgumentException("Null inputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        throwIfTypeIsIncompatible(obj2);
        throwIfSrcShapeIsIncompatible(obj2);
        if (isBuffer(obj2)) {
            setTo((Buffer) obj2);
            return;
        }
        if (this.dtype == DataType.STRING && this.shapeCopy.length == 0) {
            writeScalar(this.nativeHandle, obj2);
        } else if (obj2.getClass().isArray()) {
            writeMultiDimensionalArray(this.nativeHandle, obj2);
        } else {
            writeScalar(this.nativeHandle, obj2);
        }
    }

    @Override // org.tensorflow.lite.Tensor
    public int[] shape() {
        return this.shapeCopy;
    }

    @Override // org.tensorflow.lite.Tensor
    public int[] shapeSignature() {
        return this.shapeSignatureCopy;
    }

    private void copyTo(Buffer buffer) {
        if (buffer instanceof ByteBuffer) {
            ((ByteBuffer) buffer).put(buffer());
            return;
        }
        if (buffer instanceof FloatBuffer) {
            ((FloatBuffer) buffer).put(buffer().asFloatBuffer());
            return;
        }
        if (buffer instanceof LongBuffer) {
            ((LongBuffer) buffer).put(buffer().asLongBuffer());
            return;
        }
        if (buffer instanceof IntBuffer) {
            ((IntBuffer) buffer).put(buffer().asIntBuffer());
        } else if (buffer instanceof ShortBuffer) {
            ((ShortBuffer) buffer).put(buffer().asShortBuffer());
        } else {
            throw new IllegalArgumentException("Unexpected output buffer type: " + buffer);
        }
    }

    private void setTo(Buffer buffer) {
        if (buffer instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) buffer;
            if (byteBuffer.isDirect() && byteBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.nativeHandle, buffer);
                return;
            } else {
                buffer().put(byteBuffer);
                return;
            }
        }
        if (buffer instanceof LongBuffer) {
            LongBuffer longBuffer = (LongBuffer) buffer;
            if (longBuffer.isDirect() && longBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.nativeHandle, buffer);
                return;
            } else {
                buffer().asLongBuffer().put(longBuffer);
                return;
            }
        }
        if (buffer instanceof FloatBuffer) {
            FloatBuffer floatBuffer = (FloatBuffer) buffer;
            if (floatBuffer.isDirect() && floatBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.nativeHandle, buffer);
                return;
            } else {
                buffer().asFloatBuffer().put(floatBuffer);
                return;
            }
        }
        if (buffer instanceof IntBuffer) {
            IntBuffer intBuffer = (IntBuffer) buffer;
            if (intBuffer.isDirect() && intBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.nativeHandle, buffer);
                return;
            } else {
                buffer().asIntBuffer().put(intBuffer);
                return;
            }
        }
        if (buffer instanceof ShortBuffer) {
            ShortBuffer shortBuffer = (ShortBuffer) buffer;
            if (shortBuffer.isDirect() && shortBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.nativeHandle, buffer);
                return;
            } else {
                buffer().asShortBuffer().put(shortBuffer);
                return;
            }
        }
        throw new IllegalArgumentException("Unexpected input buffer type: " + buffer);
    }
}
