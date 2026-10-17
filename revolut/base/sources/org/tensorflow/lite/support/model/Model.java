package org.tensorflow.lite.support.model;

import android.content.Context;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.util.Map;
import org.tensorflow.lite.InterpreterApi;
import org.tensorflow.lite.Tensor;
import org.tensorflow.lite.support.common.FileUtil;
import org.tensorflow.lite.support.common.internal.SupportPreconditions;

/* JADX INFO: loaded from: classes14.dex */
public class Model {
    private final MappedByteBuffer byteModel;
    private final GpuDelegateProxy gpuDelegateProxy;
    private final InterpreterApi interpreter;
    private final String modelPath;

    /* JADX INFO: renamed from: org.tensorflow.lite.support.model.Model$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$tensorflow$lite$support$model$Model$Device;

        static {
            int[] iArr = new int[Device.values().length];
            $SwitchMap$org$tensorflow$lite$support$model$Model$Device = iArr;
            try {
                iArr[Device.NNAPI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$tensorflow$lite$support$model$Model$Device[Device.GPU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$tensorflow$lite$support$model$Model$Device[Device.CPU.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Deprecated
    public static class Builder {
        private final MappedByteBuffer byteModel;
        private final String modelPath;
        private Device device = Device.CPU;
        private int numThreads = 1;

        public Builder(Context context, String str) throws IOException {
            this.modelPath = str;
            this.byteModel = FileUtil.loadMappedFile(context, str);
        }

        public Model build() {
            return Model.createModel(this.byteModel, this.modelPath, new Options.Builder().setNumThreads(this.numThreads).setDevice(this.device).build());
        }

        public Builder setDevice(Device device) {
            this.device = device;
            return this;
        }

        public Builder setNumThreads(int i) {
            this.numThreads = i;
            return this;
        }
    }

    public enum Device {
        CPU,
        NNAPI,
        GPU
    }

    public static class Options {
        private final Device device;
        private final int numThreads;
        private final InterpreterApi.Options.TfLiteRuntime tfLiteRuntime;

        public static class Builder {
            private Device device = Device.CPU;
            private int numThreads = 1;
            private InterpreterApi.Options.TfLiteRuntime tfLiteRuntime;

            public Options build() {
                return new Options(this, null);
            }

            public Builder setDevice(Device device) {
                this.device = device;
                return this;
            }

            public Builder setNumThreads(int i) {
                this.numThreads = i;
                return this;
            }

            public Builder setTfLiteRuntime(InterpreterApi.Options.TfLiteRuntime tfLiteRuntime) {
                this.tfLiteRuntime = tfLiteRuntime;
                return this;
            }
        }

        public /* synthetic */ Options(Builder builder, AnonymousClass1 anonymousClass1) {
            this(builder);
        }

        private Options(Builder builder) {
            this.device = builder.device;
            this.numThreads = builder.numThreads;
            this.tfLiteRuntime = builder.tfLiteRuntime;
        }
    }

    private Model(String str, MappedByteBuffer mappedByteBuffer, InterpreterApi interpreterApi, GpuDelegateProxy gpuDelegateProxy) {
        this.modelPath = str;
        this.byteModel = mappedByteBuffer;
        this.interpreter = interpreterApi;
        this.gpuDelegateProxy = gpuDelegateProxy;
    }

    public static Model createModel(Context context, String str) throws IOException {
        return createModel(context, str, new Options.Builder().build());
    }

    public void close() {
        InterpreterApi interpreterApi = this.interpreter;
        if (interpreterApi != null) {
            interpreterApi.close();
        }
        GpuDelegateProxy gpuDelegateProxy = this.gpuDelegateProxy;
        if (gpuDelegateProxy != null) {
            gpuDelegateProxy.close();
        }
    }

    public MappedByteBuffer getData() {
        return this.byteModel;
    }

    public Tensor getInputTensor(int i) {
        return this.interpreter.getInputTensor(i);
    }

    public Tensor getOutputTensor(int i) {
        return this.interpreter.getOutputTensor(i);
    }

    public int[] getOutputTensorShape(int i) {
        return this.interpreter.getOutputTensor(i).shape();
    }

    public String getPath() {
        return this.modelPath;
    }

    public void run(Object[] objArr, Map<Integer, Object> map) {
        this.interpreter.runForMultipleInputsOutputs(objArr, map);
    }

    public static Model createModel(Context context, String str, Options options) throws IOException {
        SupportPreconditions.checkNotEmpty(str, "Model path in the asset folder cannot be empty.");
        return createModel(FileUtil.loadMappedFile(context, str), str, options);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.tensorflow.lite.support.model.Model createModel(java.nio.MappedByteBuffer r4, java.lang.String r5, org.tensorflow.lite.support.model.Model.Options r6) {
        /*
            org.tensorflow.lite.InterpreterApi$Options r0 = new org.tensorflow.lite.InterpreterApi$Options
            r0.<init>()
            int[] r1 = org.tensorflow.lite.support.model.Model.AnonymousClass1.$SwitchMap$org$tensorflow$lite$support$model$Model$Device
            org.tensorflow.lite.support.model.Model$Device r2 = org.tensorflow.lite.support.model.Model.Options.access$400(r6)
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L29
            r3 = 2
            if (r1 == r3) goto L18
            goto L2c
        L18:
            org.tensorflow.lite.support.model.GpuDelegateProxy r1 = org.tensorflow.lite.support.model.GpuDelegateProxy.maybeNewInstance()
            if (r1 == 0) goto L1f
            goto L20
        L1f:
            r2 = 0
        L20:
            java.lang.String r3 = "Cannot inference with GPU. Did you add \"tensorflow-lite-gpu\" as dependency?"
            org.tensorflow.lite.support.common.internal.SupportPreconditions.checkArgument(r2, r3)
            r0.addDelegate(r1)
            goto L2d
        L29:
            r0.setUseNNAPI(r2)
        L2c:
            r1 = 0
        L2d:
            int r2 = org.tensorflow.lite.support.model.Model.Options.access$500(r6)
            r0.setNumThreads(r2)
            org.tensorflow.lite.InterpreterApi$Options$TfLiteRuntime r2 = org.tensorflow.lite.support.model.Model.Options.access$600(r6)
            if (r2 == 0) goto L41
            org.tensorflow.lite.InterpreterApi$Options$TfLiteRuntime r6 = org.tensorflow.lite.support.model.Model.Options.access$600(r6)
            r0.setRuntime(r6)
        L41:
            org.tensorflow.lite.InterpreterApi r6 = org.tensorflow.lite.InterpreterApi.create(r4, r0)
            org.tensorflow.lite.support.model.Model r0 = new org.tensorflow.lite.support.model.Model
            r0.<init>(r5, r4, r6, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tensorflow.lite.support.model.Model.createModel(java.nio.MappedByteBuffer, java.lang.String, org.tensorflow.lite.support.model.Model$Options):org.tensorflow.lite.support.model.Model");
    }
}
