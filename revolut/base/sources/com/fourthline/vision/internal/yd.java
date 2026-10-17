package com.fourthline.vision.internal;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.Size;
import androidx.camera.core.ImageProxy;
import com.fourthline.core.ContextExtensionsKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.tflite.client.TfLiteInitializationOptions;
import com.google.android.gms.tflite.java.TfLite;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.InterpreterApi;
import org.tensorflow.lite.Tensor;

/* JADX INFO: loaded from: classes23.dex */
public final class yd implements z6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f37153n = new a(null);
    public static final int o = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f37154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b7 f37155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c7 f37156c;
    private a7 d;
    private InterpreterApi e;
    private boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f37157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f37158h;
    private int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private DataType f37159j;
    private boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f37160l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private DataType f37161m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isAvailable() {
            return true;
        }

        private a() {
        }
    }

    public yd(@NotNull Context context, @NotNull b7 model, @NotNull c7 modelOutputProcessor, @NotNull Executor mainExecutor, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(modelOutputProcessor, "modelOutputProcessor");
        Intrinsics.checkNotNullParameter(mainExecutor, "mainExecutor");
        this.f37154a = context;
        this.f37155b = model;
        this.f37156c = modelOutputProcessor;
        this.f37157g = 192;
        this.f37158h = 192;
        this.i = 3;
        DataType dataType = DataType.FLOAT32;
        this.f37159j = dataType;
        this.f37161m = dataType;
    }

    private final void initializeModelInfo() {
        DataType dataType;
        DataType dataType2;
        try {
            InterpreterApi interpreterApi = this.e;
            Tensor inputTensor = interpreterApi != null ? interpreterApi.getInputTensor(0) : null;
            int[] iArrShape = inputTensor != null ? inputTensor.shape() : null;
            if (inputTensor == null || (dataType = inputTensor.dataType()) == null) {
                dataType = DataType.FLOAT32;
            }
            this.f37159j = dataType;
            int i = 1;
            if (iArrShape != null && iArrShape.length == 4) {
                this.f37158h = iArrShape[1];
                this.f37157g = iArrShape[2];
                this.i = iArrShape[3];
            }
            this.k = dataType == DataType.UINT8;
            InterpreterApi interpreterApi2 = this.e;
            Tensor outputTensor = interpreterApi2 != null ? interpreterApi2.getOutputTensor(0) : null;
            int[] iArrShape2 = outputTensor != null ? outputTensor.shape() : null;
            if (outputTensor == null || (dataType2 = outputTensor.dataType()) == null) {
                dataType2 = DataType.FLOAT32;
            }
            this.f37161m = dataType2;
            if (iArrShape2 != null) {
                if (iArrShape2.length == 0) {
                    throw new UnsupportedOperationException("Empty array can't be reduced.");
                }
                int i2 = iArrShape2[0];
                Intrinsics.checkNotNullParameter(iArrShape2, "<this>");
                int length = iArrShape2.length - 1;
                if (1 <= length) {
                    while (true) {
                        i2 *= iArrShape2[i];
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                this.f37160l = i2;
            }
        } catch (Exception unused) {
            a7 callback = getCallback();
            if (callback != null) {
                callback.onModelsMissing();
            }
        }
    }

    private final MappedByteBuffer loadModelFromAssets(Context context, String str) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(str);
        Intrinsics.checkNotNullExpressionValue(assetFileDescriptorOpenFd, "openFd(...)");
        MappedByteBuffer map = new FileInputStream(assetFileDescriptorOpenFd.getFileDescriptor()).getChannel().map(FileChannel.MapMode.READ_ONLY, assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getDeclaredLength());
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    private final MappedByteBuffer loadModelFromCdn(Context context, String str) throws IOException {
        File file = new File(ContextExtensionsKt.getAssetsFourthlineDirectory(context).getAbsolutePath() + "/" + str);
        MappedByteBuffer map = new FileInputStream(file).getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length());
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    private final ByteBuffer preprocessImage(Bitmap bitmap) {
        ByteBuffer byteBufferAllocateDirect = this.k ? ByteBuffer.allocateDirect(this.f37157g * this.f37158h * this.i) : ByteBuffer.allocateDirect(this.f37157g * 4 * this.f37158h * this.i);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        int i = this.f37157g;
        int i2 = this.f37158h;
        int[] iArr = new int[i * i2];
        bitmap.getPixels(iArr, 0, i, 0, 0, i, i2);
        int i3 = this.f37158h;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            int i21 = this.f37157g;
            int i22 = 0;
            while (i22 < i21) {
                int i32 = i5 + 1;
                int i33 = iArr[i5];
                int i43 = (i33 >> 16) & 255;
                int i59 = (i33 >> 8) & 255;
                int i66 = i33 & 255;
                if (this.k) {
                    byteBufferAllocateDirect.put((byte) i43);
                    byteBufferAllocateDirect.put((byte) i59);
                    byteBufferAllocateDirect.put((byte) i66);
                } else {
                    byteBufferAllocateDirect.putFloat(i43 / 255.0f);
                    byteBufferAllocateDirect.putFloat(i59 / 255.0f);
                    byteBufferAllocateDirect.putFloat(i66 / 255.0f);
                }
                i22++;
                i5 = i32;
            }
        }
        byteBufferAllocateDirect.rewind();
        return byteBufferAllocateDirect;
    }

    private final d7 processOutput(Map<Integer, ? extends Object> map) {
        try {
            c7 c7Var = this.f37156c;
            InterpreterApi interpreterApi = this.e;
            Intrinsics.h(interpreterApi);
            return c7Var.processHandAnalyzerOutput(interpreterApi, this.f37157g, this.f37158h, map, 0.75f);
        } catch (Exception unused) {
            return new d7(false, BitmapDescriptorFactory.HUE_RED, null, null, 12, null);
        }
    }

    private final void setupInterpreter() {
        try {
            TfLiteInitializationOptions tfLiteInitializationOptionsBuild = TfLiteInitializationOptions.builder().setEnableGpuDelegateSupport(false).build();
            Intrinsics.checkNotNullExpressionValue(tfLiteInitializationOptionsBuild, "build(...)");
            TfLite.initialize(this.f37154a, tfLiteInitializationOptionsBuild).addOnSuccessListener(new og(new eg(this, 10))).addOnFailureListener(new og(this));
        } catch (Exception unused) {
            a7 callback = getCallback();
            if (callback != null) {
                callback.onModelsMissing();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupInterpreter$lambda$0(yd ydVar, Void r3) {
        try {
            ydVar.e = InterpreterApi.create(ydVar.loadModelFromCdn(ydVar.f37154a, ydVar.f37155b.getModelName()), new InterpreterApi.Options().setRuntime(InterpreterApi.Options.TfLiteRuntime.FROM_SYSTEM_ONLY).setNumThreads(4));
            ydVar.initializeModelInfo();
        } catch (Exception unused) {
            a7 callback = ydVar.getCallback();
            if (callback != null) {
                callback.onModelsMissing();
            }
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupInterpreter$lambda$2(yd ydVar, Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        a7 callback = ydVar.getCallback();
        if (callback != null) {
            callback.onModelsMissing();
        }
    }

    @Override // com.fourthline.vision.internal.z6, androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(@NotNull ImageProxy imageProxy) {
        DataType dataType;
        int i;
        ByteBuffer byteBufferAllocateDirect;
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        if (isProcessing() || this.e == null) {
            imageProxy.close();
            a7 callback = getCallback();
            if (callback != null) {
                callback.onHandDetectionResult(null);
                return;
            }
            return;
        }
        this.f = true;
        try {
            if (imageProxy.getImage() == null) {
                imageProxy.close();
                a7 callback2 = getCallback();
                if (callback2 != null) {
                    callback2.onHandDetectionResult(null);
                }
                this.f = false;
                return;
            }
            Bitmap bitmap = imageProxy.toBitmap();
            Intrinsics.checkNotNullExpressionValue(bitmap, "toBitmap(...)");
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, this.f37157g, this.f37158h, true);
            ByteBuffer byteBufferPreprocessImage = preprocessImage(bitmapCreateScaledBitmap);
            InterpreterApi interpreterApi = this.e;
            int outputTensorCount = interpreterApi != null ? interpreterApi.getOutputTensorCount() : 0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i2 = 0; i2 < outputTensorCount; i2++) {
                InterpreterApi interpreterApi2 = this.e;
                Tensor outputTensor = interpreterApi2 != null ? interpreterApi2.getOutputTensor(i2) : null;
                int[] iArrShape = outputTensor != null ? outputTensor.shape() : null;
                if (outputTensor == null || (dataType = outputTensor.dataType()) == null) {
                    dataType = DataType.FLOAT32;
                }
                if (iArrShape == null) {
                    i = 0;
                } else {
                    if (iArrShape.length == 0) {
                        throw new UnsupportedOperationException("Empty array can't be reduced.");
                    }
                    i = iArrShape[0];
                    Intrinsics.checkNotNullParameter(iArrShape, "<this>");
                    int length = iArrShape.length - 1;
                    if (1 <= length) {
                        int i3 = 1;
                        while (true) {
                            i *= iArrShape[i3];
                            if (i3 == length) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                if (dataType == DataType.UINT8) {
                    byteBufferAllocateDirect = ByteBuffer.allocateDirect(i);
                    byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
                } else {
                    byteBufferAllocateDirect = ByteBuffer.allocateDirect(i * 4);
                    byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
                }
                linkedHashMap.put(Integer.valueOf(i2), byteBufferAllocateDirect);
            }
            InterpreterApi interpreterApi3 = this.e;
            if (interpreterApi3 != null) {
                interpreterApi3.runForMultipleInputsOutputs(new ByteBuffer[]{byteBufferPreprocessImage}, linkedHashMap);
            }
            d7 d7VarProcessOutput = processOutput(linkedHashMap);
            bitmap.recycle();
            bitmapCreateScaledBitmap.recycle();
            imageProxy.close();
            this.f = false;
            a7 callback3 = getCallback();
            if (callback3 != null) {
                callback3.onHandDetectionResult(d7VarProcessOutput);
            }
        } catch (Exception unused) {
            imageProxy.close();
            a7 callback4 = getCallback();
            if (callback4 != null) {
                callback4.onHandDetectionResult(null);
            }
            this.f = false;
        }
    }

    @Override // com.fourthline.vision.internal.z6
    public a7 getCallback() {
        return this.d;
    }

    @Override // com.fourthline.vision.internal.z6, androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ Size getDefaultTargetResolution() {
        return super.getDefaultTargetResolution();
    }

    @Override // com.fourthline.vision.internal.z6, androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ int getTargetCoordinateSystem() {
        return super.getTargetCoordinateSystem();
    }

    @Override // com.fourthline.vision.internal.z6
    public boolean isProcessing() {
        return this.f;
    }

    @Override // com.fourthline.vision.internal.z6
    public void setCallback(a7 a7Var) {
        this.d = a7Var;
    }

    @Override // com.fourthline.vision.internal.z6
    public void start() {
        if (this.e == null) {
            setupInterpreter();
        }
    }

    @Override // com.fourthline.vision.internal.z6
    public void stop() {
        InterpreterApi interpreterApi = this.e;
        if (interpreterApi != null) {
            interpreterApi.close();
        }
        this.e = null;
    }

    @Override // com.fourthline.vision.internal.z6, androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ void updateTransform(Matrix matrix) {
        super.updateTransform(matrix);
    }
}
