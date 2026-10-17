package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.tfmodel;

import afa.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.common.di.qualifier.ApplicationContext;
import com.onfido.android.sdk.capture.internal.util.OnfidoPointF;
import com.onfido.android.sdk.capture.internal.util.OnfidoRectF;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.Interpreter;
import org.tensorflow.lite.Tensor;
import org.tensorflow.lite.support.common.FileUtil;
import org.tensorflow.lite.support.common.TensorProcessor;
import org.tensorflow.lite.support.image.ImageProcessor;
import org.tensorflow.lite.support.image.TensorImage;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;
import yhm.j;
import zsc.p;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 52\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001:\u00015B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010#\u001a\u00020$H\u0016J\u0018\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\rH\u0002J\b\u0010(\u001a\u00020$H\u0002J(\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\u0006\u0010*\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0002J\b\u0010+\u001a\u00020$H\u0002J\b\u0010,\u001a\u00020$H\u0016JH\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0002j\b\u0012\u0004\u0012\u00020\r`\u00042\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020.0\u0002j\b\u0012\u0004\u0012\u00020.`\u0004H\u0002J\u0018\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\u0002J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0002J \u00104\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\u0006\u00102\u001a\u000203H\u0016R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0002j\b\u0012\u0004\u0012\u00020\t`\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u0002j\b\u0012\u0004\u0012\u00020\u001b`\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u0002j\b\u0012\u0004\u0012\u00020\u001d`\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u0002j\b\u0012\u0004\u0012\u00020\u001f`\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082.¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/tfmodel/BlazeFaceModel;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/tfmodel/TfliteModel;", "Ljava/util/ArrayList;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/tfmodel/Detection;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "anchors", "", "boxesBuffer", "Lorg/tensorflow/lite/support/tensorbuffer/TensorBuffer;", "imageHeight", "", "imageWidth", "imgProcessor", "Lorg/tensorflow/lite/support/image/ImageProcessor;", "kotlin.jvm.PlatformType", "getImgProcessor", "()Lorg/tensorflow/lite/support/image/ImageProcessor;", "imgProcessor$delegate", "Lkotlin/Lazy;", "inputHeight", "inputWidth", "interpreter", "Lorg/tensorflow/lite/Interpreter;", "outputDataTypes", "Lorg/tensorflow/lite/DataType;", "outputNames", "", "outputShapes", "", "scoresBuffer", "tensorProcessor", "Lorg/tensorflow/lite/support/common/TensorProcessor;", "close", "", "decodeBox", "boxes", "boxId", "generateAnchors", "getDetections", "scores", "getInputsOutputsInfo", "initialize", "nonMaximumSuppression", "", "postProcess", "preProcess", "Lorg/tensorflow/lite/support/image/TensorImage;", "bitmap", "Landroid/graphics/Bitmap;", "run", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BlazeFaceModel implements TfliteModel<ArrayList<Detection>> {
    private static final float ANCHOR_OFFSET_X = 0.5f;
    private static final float ANCHOR_OFFSET_Y = 0.5f;
    private static final int CPU_NUM_THREADS = 1;
    private static final double MIN_DETECTION_CONFIDENCE_THRESHOLD = 0.5d;
    private static final float MIN_SUPPRESSION_THRESHOLD = 0.6f;
    private static final int NUM_BOXES = 896;
    private static final int NUM_COORDINATES = 16;
    private static final int NUM_LAYERS = 4;

    @NotNull
    private final ArrayList<float[]> anchors;
    private TensorBuffer boxesBuffer;

    @NotNull
    private final Context context;
    private int imageHeight;
    private int imageWidth;

    /* JADX INFO: renamed from: imgProcessor$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy imgProcessor;
    private int inputHeight;
    private int inputWidth;
    private Interpreter interpreter;

    @NotNull
    private final ArrayList<DataType> outputDataTypes;

    @NotNull
    private final ArrayList<String> outputNames;

    @NotNull
    private final ArrayList<int[]> outputShapes;
    private TensorBuffer scoresBuffer;
    private TensorProcessor tensorProcessor;

    @NotNull
    private static final String BLAZE_FACE_MODEL_NAME = "blaze_face_short_range.tflite";

    @NotNull
    private static final float[] meanNormalizeOp = {127.5f, 127.5f, 127.5f};

    @NotNull
    private static final float[] scaleNormalizeOp = {127.5f, 127.5f, 127.5f};
    private static final double logitThreshold = Math.log(1.0d);

    @NotNull
    private static final int[] strides = {8, 16, 16, 16};

    public BlazeFaceModel(@ApplicationContext @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.outputNames = new ArrayList<>();
        this.outputDataTypes = new ArrayList<>();
        this.outputShapes = new ArrayList<>();
        this.anchors = new ArrayList<>();
        this.imgProcessor = j.b(new BlazeFaceModel$imgProcessor$2(this));
    }

    private final void decodeBox(float[] boxes, int boxId) {
        float f = this.inputHeight;
        int i = boxId * 16;
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = (i2 * 2) + i;
            boxes[i3] = boxes[i3] / f;
            int i5 = i3 + 1;
            boxes[i5] = boxes[i5] / f;
            if (i2 != 1) {
                boxes[i3] = boxes[i3] + this.anchors.get(boxId)[0];
                boxes[i5] = boxes[i5] + this.anchors.get(boxId)[1];
            }
        }
        int i6 = i + 2;
        float f4 = 2;
        float f5 = boxes[i6] / f4;
        int i21 = i + 3;
        float f6 = boxes[i21] / f4;
        float f32 = boxes[i];
        int i22 = i + 1;
        float f35 = boxes[i22];
        boxes[i] = f32 - f5;
        boxes[i22] = boxes[i22] - f6;
        boxes[i6] = f32 + f5;
        boxes[i21] = f35 + f6;
    }

    private final void generateAnchors() {
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            int i3 = i;
            while (i3 < 4) {
                int[] iArr = strides;
                if (iArr[i3] != iArr[i]) {
                    break;
                }
                i3++;
                i2 += 2;
            }
            int i5 = strides[i];
            int i6 = this.inputHeight / i5;
            int i21 = this.inputWidth / i5;
            for (int i22 = 0; i22 < i6; i22++) {
                float f = (i22 + 0.5f) / i6;
                for (int i32 = 0; i32 < i21; i32++) {
                    float f4 = (i32 + 0.5f) / i21;
                    for (int i33 = 0; i33 < i2; i33++) {
                        this.anchors.add(new float[]{f4, f});
                    }
                }
            }
            i = i3;
        }
    }

    private final ArrayList<Detection> getDetections(float[] scores, float[] boxes) {
        float[] fArr = boxes;
        ArrayList<Detection> arrayList = new ArrayList<>();
        int i = 0;
        while (i < NUM_BOXES) {
            double d = scores[i];
            if (d >= logitThreshold) {
                double d5 = 1.0f;
                float fExp = (float) (d5 / (Math.exp(-d) + d5));
                decodeBox(fArr, i);
                int i2 = i * 16;
                PointF pointF = new PointF(fArr[i2] * this.inputWidth, fArr[i2 + 1] * this.inputHeight);
                PointF pointF2 = new PointF(fArr[i2 + 2] * this.inputWidth, fArr[i2 + 3] * this.inputHeight);
                PointF pointF3 = new PointF(fArr[i2 + 4] * this.inputWidth, fArr[i2 + 5] * this.inputHeight);
                PointF pointF4 = new PointF(fArr[i2 + 6] * this.inputWidth, fArr[i2 + 7] * this.inputHeight);
                PointF pointF5 = new PointF(fArr[i2 + 8] * this.inputWidth, fArr[i2 + 9] * this.inputHeight);
                PointF pointF6 = new PointF(fArr[i2 + 10] * this.inputWidth, fArr[i2 + 11] * this.inputHeight);
                PointF pointF7 = new PointF(fArr[i2 + 12] * this.inputWidth, fArr[i2 + 13] * this.inputHeight);
                PointF pointF8 = new PointF(fArr[i2 + 14] * this.inputWidth, fArr[i2 + 15] * this.inputHeight);
                PointF pointFInverseTransform = getImgProcessor().inverseTransform(pointF, this.imageHeight, this.imageWidth);
                Intrinsics.checkNotNullExpressionValue(pointFInverseTransform, "inverseTransform(...)");
                PointF pointFInverseTransform2 = getImgProcessor().inverseTransform(pointF2, this.imageHeight, this.imageWidth);
                Intrinsics.checkNotNullExpressionValue(pointFInverseTransform2, "inverseTransform(...)");
                PointF pointFInverseTransform3 = getImgProcessor().inverseTransform(pointF3, this.imageHeight, this.imageWidth);
                Intrinsics.checkNotNullExpressionValue(pointFInverseTransform3, "inverseTransform(...)");
                PointF pointFInverseTransform4 = getImgProcessor().inverseTransform(pointF4, this.imageHeight, this.imageWidth);
                Intrinsics.checkNotNullExpressionValue(pointFInverseTransform4, "inverseTransform(...)");
                PointF pointFInverseTransform5 = getImgProcessor().inverseTransform(pointF5, this.imageHeight, this.imageWidth);
                Intrinsics.checkNotNullExpressionValue(pointFInverseTransform5, "inverseTransform(...)");
                PointF pointFInverseTransform6 = getImgProcessor().inverseTransform(pointF6, this.imageHeight, this.imageWidth);
                Intrinsics.checkNotNullExpressionValue(pointFInverseTransform6, "inverseTransform(...)");
                PointF pointFInverseTransform7 = getImgProcessor().inverseTransform(pointF7, this.imageHeight, this.imageWidth);
                Intrinsics.checkNotNullExpressionValue(pointFInverseTransform7, "inverseTransform(...)");
                PointF pointFInverseTransform8 = getImgProcessor().inverseTransform(pointF8, this.imageHeight, this.imageWidth);
                Intrinsics.checkNotNullExpressionValue(pointFInverseTransform8, "inverseTransform(...)");
                OnfidoRectF onfidoRectF = new OnfidoRectF(pointFInverseTransform.x, pointFInverseTransform.y, pointFInverseTransform2.x, pointFInverseTransform2.y);
                OnfidoPointF.Companion companion = OnfidoPointF.INSTANCE;
                arrayList.add(new Detection(onfidoRectF, companion.toOnfidoPointF(pointFInverseTransform3), companion.toOnfidoPointF(pointFInverseTransform4), companion.toOnfidoPointF(pointFInverseTransform5), companion.toOnfidoPointF(pointFInverseTransform6), companion.toOnfidoPointF(pointFInverseTransform7), companion.toOnfidoPointF(pointFInverseTransform8), fExp));
            }
            i++;
            fArr = boxes;
        }
        return arrayList;
    }

    private final ImageProcessor getImgProcessor() {
        return (ImageProcessor) this.imgProcessor.getValue();
    }

    private final void getInputsOutputsInfo() {
        Timber.Companion companion = Timber.INSTANCE;
        companion.i("Inputs:", new Object[0]);
        Interpreter interpreter = this.interpreter;
        if (interpreter == null) {
            Intrinsics.r("interpreter");
            throw null;
        }
        Tensor inputTensor = interpreter.getInputTensor(0);
        StringBuilder sb6 = new StringBuilder("\t");
        sb6.append(inputTensor.name());
        sb6.append(": ");
        sb6.append(inputTensor.dataType());
        sb6.append(p.SPACE_CHAR);
        String string = Arrays.toString(inputTensor.shape());
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb6.append(string);
        companion.i(sb6.toString(), new Object[0]);
        this.inputWidth = inputTensor.shape()[2];
        this.inputHeight = inputTensor.shape()[1];
        Interpreter interpreter2 = this.interpreter;
        if (interpreter2 == null) {
            Intrinsics.r("interpreter");
            throw null;
        }
        int outputTensorCount = interpreter2.getOutputTensorCount();
        companion.i("Outputs: ", new Object[0]);
        for (int i = 0; i < outputTensorCount; i++) {
            Interpreter interpreter3 = this.interpreter;
            if (interpreter3 == null) {
                Intrinsics.r("interpreter");
                throw null;
            }
            Tensor outputTensor = interpreter3.getOutputTensor(i);
            this.outputNames.add(outputTensor.name());
            this.outputDataTypes.add(outputTensor.dataType());
            this.outputShapes.add(outputTensor.shape());
            Timber.Companion companion2 = Timber.INSTANCE;
            StringBuilder sb9 = new StringBuilder("\t");
            sb9.append(outputTensor.name());
            sb9.append(": ");
            sb9.append(outputTensor.dataType());
            sb9.append(p.SPACE_CHAR);
            String string2 = Arrays.toString(outputTensor.shape());
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            sb9.append(string2);
            companion2.i(sb9.toString(), new Object[0]);
        }
    }

    private final ArrayList<Integer> nonMaximumSuppression(ArrayList<Detection> boxes, ArrayList<Float> scores) {
        ArrayList arrayList = new ArrayList();
        int size = boxes.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Float.valueOf((boxes.get(i).getFace().getBottom() - boxes.get(i).getFace().getTop()) * (boxes.get(i).getFace().getRight() - boxes.get(i).getFace().getLeft())));
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = scores.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList2.add(Integer.valueOf(i2));
        }
        Collections.sort(arrayList2, new a(scores, 2));
        int i3 = 0;
        while (i3 < arrayList2.size()) {
            Object obj2 = arrayList2.get(i3);
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            Float f = scores.get(((Number) obj2).intValue());
            Intrinsics.checkNotNullExpressionValue(f, "get(...)");
            if (f.floatValue() < BitmapDescriptorFactory.HUE_RED) {
                break;
            }
            i3++;
        }
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        boolean z = true;
        for (int i5 = 0; z && i5 < i3; i5++) {
            Object obj3 = arrayList2.get(i5);
            Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
            int iIntValue = ((Number) obj3).intValue();
            if (iIntValue >= 0) {
                arrayList3.add(Integer.valueOf(iIntValue));
                boolean z3 = false;
                for (int i6 = i5 + 1; i6 < i3; i6++) {
                    Object obj4 = arrayList2.get(i6);
                    Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                    int iIntValue2 = ((Number) obj4).intValue();
                    if (iIntValue2 >= 0) {
                        float right = boxes.get(iIntValue).getFace().getRight();
                        float right2 = boxes.get(iIntValue2).getFace().getRight();
                        if (right > right2) {
                            right = right2;
                        }
                        float left = boxes.get(iIntValue).getFace().getLeft();
                        float left2 = boxes.get(iIntValue2).getFace().getLeft();
                        if (left < left2) {
                            left = left2;
                        }
                        float f4 = right - left;
                        float bottom = boxes.get(iIntValue).getFace().getBottom();
                        float bottom2 = boxes.get(iIntValue2).getFace().getBottom();
                        if (bottom > bottom2) {
                            bottom = bottom2;
                        }
                        float top = boxes.get(iIntValue).getFace().getTop();
                        float top2 = boxes.get(iIntValue2).getFace().getTop();
                        if (top < top2) {
                            top = top2;
                        }
                        float f5 = bottom - top;
                        float f6 = (f4 <= BitmapDescriptorFactory.HUE_RED || f5 <= BitmapDescriptorFactory.HUE_RED) ? 0.0f : f4 * f5;
                        float fFloatValue = ((Number) arrayList.get(iIntValue)).floatValue();
                        Object obj5 = arrayList.get(iIntValue2);
                        Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                        if (f6 / ((((Number) obj5).floatValue() + fFloatValue) - f6) >= MIN_SUPPRESSION_THRESHOLD) {
                            arrayList2.set(i6, -1);
                        }
                        z3 = true;
                    }
                }
                z = z3;
            }
        }
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nonMaximumSuppression$lambda$1(ArrayList scores, int i, int i2) {
        Intrinsics.checkNotNullParameter(scores, "$scores");
        float fFloatValue = ((Number) scores.get(i2)).floatValue();
        Object obj2 = scores.get(i);
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return Float.compare(fFloatValue, ((Number) obj2).floatValue());
    }

    private final ArrayList<Detection> postProcess() {
        TensorProcessor tensorProcessor = this.tensorProcessor;
        if (tensorProcessor == null) {
            Intrinsics.r("tensorProcessor");
            throw null;
        }
        TensorBuffer tensorBuffer = this.scoresBuffer;
        if (tensorBuffer == null) {
            Intrinsics.r("scoresBuffer");
            throw null;
        }
        float[] floatArray = tensorProcessor.process(tensorBuffer).getFloatArray();
        TensorProcessor tensorProcessor2 = this.tensorProcessor;
        if (tensorProcessor2 == null) {
            Intrinsics.r("tensorProcessor");
            throw null;
        }
        TensorBuffer tensorBuffer2 = this.boxesBuffer;
        if (tensorBuffer2 == null) {
            Intrinsics.r("boxesBuffer");
            throw null;
        }
        float[] floatArray2 = tensorProcessor2.process(tensorBuffer2).getFloatArray();
        Intrinsics.h(floatArray);
        Intrinsics.h(floatArray2);
        ArrayList<Detection> detections = getDetections(floatArray, floatArray2);
        ArrayList<Float> arrayList = new ArrayList<>();
        Iterator<Detection> it8 = detections.iterator();
        while (it8.hasNext()) {
            arrayList.add(Float.valueOf(it8.next().getConfidence()));
        }
        ArrayList<Integer> arrayListNonMaximumSuppression = nonMaximumSuppression(detections, arrayList);
        ArrayList<Detection> arrayList2 = new ArrayList<>();
        for (Integer num : arrayListNonMaximumSuppression) {
            Intrinsics.h(num);
            arrayList2.add(detections.get(num.intValue()));
        }
        return arrayList2;
    }

    private final TensorImage preProcess(Bitmap bitmap) {
        TensorImage tensorImage = new TensorImage(DataType.FLOAT32);
        tensorImage.load(bitmap);
        TensorImage tensorImageProcess = getImgProcessor().process(tensorImage);
        Intrinsics.checkNotNullExpressionValue(tensorImageProcess, "process(...)");
        return tensorImageProcess;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.tfmodel.TfliteModel
    public void close() {
        Interpreter interpreter = this.interpreter;
        if (interpreter != null) {
            interpreter.close();
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, org.tensorflow.lite.support.common.TensorProcessor] */
    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.tfmodel.TfliteModel
    public void initialize() throws IOException {
        MappedByteBuffer mappedByteBufferLoadMappedFile = FileUtil.loadMappedFile(this.context, "blaze_face_short_range.tflite");
        Intrinsics.checkNotNullExpressionValue(mappedByteBufferLoadMappedFile, "loadMappedFile(...)");
        Interpreter.Options options = new Interpreter.Options();
        options.setNumThreads(1);
        this.interpreter = new Interpreter(mappedByteBufferLoadMappedFile, options);
        getInputsOutputsInfo();
        generateAnchors();
        TensorBuffer tensorBufferCreateFixedSize = TensorBuffer.createFixedSize(this.outputShapes.get(0), this.outputDataTypes.get(0));
        Intrinsics.checkNotNullExpressionValue(tensorBufferCreateFixedSize, "createFixedSize(...)");
        this.boxesBuffer = tensorBufferCreateFixedSize;
        TensorBuffer tensorBufferCreateFixedSize2 = TensorBuffer.createFixedSize(this.outputShapes.get(1), this.outputDataTypes.get(1));
        Intrinsics.checkNotNullExpressionValue(tensorBufferCreateFixedSize2, "createFixedSize(...)");
        this.scoresBuffer = tensorBufferCreateFixedSize2;
        ?? Build2 = new TensorProcessor.Builder().build();
        Intrinsics.checkNotNullExpressionValue(Build2, "build(...)");
        this.tensorProcessor = Build2;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.tfmodel.TfliteModel
    @NotNull
    public ArrayList<Detection> run(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.imageWidth = bitmap.getWidth();
        this.imageHeight = bitmap.getHeight();
        ByteBuffer buffer = preProcess(bitmap).getBuffer();
        Intrinsics.checkNotNullExpressionValue(buffer, "getBuffer(...)");
        Object[] objArr = {buffer};
        HashMap map = new HashMap();
        TensorBuffer tensorBuffer = this.boxesBuffer;
        if (tensorBuffer == null) {
            Intrinsics.r("boxesBuffer");
            throw null;
        }
        Buffer bufferRewind = tensorBuffer.getBuffer().rewind();
        Intrinsics.checkNotNullExpressionValue(bufferRewind, "rewind(...)");
        map.put(0, bufferRewind);
        TensorBuffer tensorBuffer2 = this.scoresBuffer;
        if (tensorBuffer2 == null) {
            Intrinsics.r("scoresBuffer");
            throw null;
        }
        Buffer bufferRewind2 = tensorBuffer2.getBuffer().rewind();
        Intrinsics.checkNotNullExpressionValue(bufferRewind2, "rewind(...)");
        map.put(1, bufferRewind2);
        Interpreter interpreter = this.interpreter;
        if (interpreter != null) {
            interpreter.runForMultipleInputsOutputs(objArr, map);
            return postProcess();
        }
        Intrinsics.r("interpreter");
        throw null;
    }
}
