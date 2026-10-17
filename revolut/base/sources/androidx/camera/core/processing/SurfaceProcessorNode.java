package androidx.camera.core.processing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.camera.core.Logger;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.util.OutConfig;
import androidx.core.util.Preconditions;
import fp0.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes15.dex */
public class SurfaceProcessorNode {
    final CameraInternal mCameraInternal;
    private final String mDebugInfo;
    private In mInput;
    private Out mOutput;
    final SurfaceProcessorInternal mSurfaceProcessor;

    public static abstract class In {
        public static In of(SurfaceEdge surfaceEdge, List<OutConfig> list) {
            return new AutoValue_SurfaceProcessorNode_In(surfaceEdge, list);
        }

        public abstract List<OutConfig> getOutConfigs();

        public abstract SurfaceEdge getSurfaceEdge();
    }

    public static class Out extends HashMap<OutConfig, SurfaceEdge> {
    }

    public SurfaceProcessorNode(CameraInternal cameraInternal, SurfaceProcessorInternal surfaceProcessorInternal, String str) {
        this.mCameraInternal = cameraInternal;
        this.mSurfaceProcessor = surfaceProcessorInternal;
        this.mDebugInfo = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createAndSendSurfaceOutput, reason: merged with bridge method [inline-methods] */
    public void lambda$sendSurfaceOutputs$0(SurfaceEdge surfaceEdge, Map.Entry<OutConfig, SurfaceEdge> entry) {
        final SurfaceEdge value = entry.getValue();
        Logger.d("SurfaceProcessorNode", "     -> outputEdge = " + value);
        Futures.addCallback(value.createSurfaceOutputFuture(entry.getKey().getFormat(), SurfaceOutput.CameraInputInfo.of(surfaceEdge.getStreamSpec().getResolution(), entry.getKey().getCropRect(), surfaceEdge.hasCameraTransform() ? this.mCameraInternal : null, entry.getKey().getRotationDegrees(), entry.getKey().isMirroring()), null), new FutureCallback<SurfaceOutput>() { // from class: androidx.camera.core.processing.SurfaceProcessorNode.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th10) {
                if (value.getTargets() == 2 && (th10 instanceof CancellationException)) {
                    Logger.d("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                    return;
                }
                Logger.w("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + TargetUtils.getHumanReadableName(value.getTargets()), th10);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(SurfaceOutput surfaceOutput) throws ProcessingException {
                Preconditions.checkNotNull(surfaceOutput);
                SurfaceProcessorNode.this.mSurfaceProcessor.onOutputSurface(surfaceOutput);
            }
        }, CameraXExecutors.mainThreadExecutor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$2() {
        Out out = this.mOutput;
        if (out != null) {
            Iterator<SurfaceEdge> it8 = out.values().iterator();
            while (it8.hasNext()) {
                it8.next().close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setUpRotationUpdates$1(Map map, SurfaceRequest.TransformationInfo transformationInfo) {
        for (Map.Entry entry : map.entrySet()) {
            int rotationDegrees = transformationInfo.getRotationDegrees() - ((OutConfig) entry.getKey()).getRotationDegrees();
            if (((OutConfig) entry.getKey()).isMirroring()) {
                rotationDegrees = -rotationDegrees;
            }
            ((SurfaceEdge) entry.getValue()).updateTransformation(TransformUtils.within360(rotationDegrees), -1);
        }
    }

    private void sendSurfaceOutputs(SurfaceEdge surfaceEdge, Map<OutConfig, SurfaceEdge> map) {
        for (Map.Entry<OutConfig, SurfaceEdge> entry : map.entrySet()) {
            lambda$sendSurfaceOutputs$0(surfaceEdge, entry);
            entry.getValue().addOnInvalidatedListener(new b0.d(this, 12, surfaceEdge, entry));
        }
    }

    private void sendSurfaceRequest(SurfaceEdge surfaceEdge) throws ProcessingException {
        this.mSurfaceProcessor.onInputSurface(surfaceEdge.createSurfaceRequest(this.mCameraInternal));
    }

    private SurfaceEdge transformSingleOutput(SurfaceEdge surfaceEdge, OutConfig outConfig) {
        Rect rectSizeToRect;
        Rect cropRect = outConfig.getCropRect();
        int rotationDegrees = outConfig.getRotationDegrees();
        boolean zIsMirroring = outConfig.isMirroring();
        Matrix matrix = new Matrix(surfaceEdge.getSensorToBufferTransform());
        Matrix rectToRect = TransformUtils.getRectToRect(new RectF(cropRect), TransformUtils.sizeToRectF(outConfig.getSize()), rotationDegrees, zIsMirroring);
        matrix.postConcat(rectToRect);
        Preconditions.checkArgument(TransformUtils.isAspectRatioMatchingWithRoundingError(TransformUtils.getRotatedSize(cropRect, rotationDegrees), outConfig.getSize()));
        if (outConfig.shouldRespectInputCropRect()) {
            Preconditions.checkArgument(outConfig.getCropRect().contains(surfaceEdge.getCropRect()), "Output crop rect " + outConfig.getCropRect() + " must contain input crop rect " + surfaceEdge.getCropRect());
            rectSizeToRect = new Rect();
            RectF rectF = new RectF(surfaceEdge.getCropRect());
            rectToRect.mapRect(rectF);
            rectF.round(rectSizeToRect);
        } else {
            rectSizeToRect = TransformUtils.sizeToRect(outConfig.getSize());
        }
        return new SurfaceEdge(outConfig.getTargets(), outConfig.getFormat(), surfaceEdge.getStreamSpec().toBuilder().setResolution(outConfig.getSize()).build(), matrix, false, rectSizeToRect, surfaceEdge.getRotationDegrees() - rotationDegrees, -1, surfaceEdge.isMirroring() != zIsMirroring);
    }

    public SurfaceProcessorInternal getSurfaceProcessor() {
        return this.mSurfaceProcessor;
    }

    public void release() {
        this.mSurfaceProcessor.release();
        Threads.runOnMain(new l(this, 24));
    }

    public void setUpRotationUpdates(SurfaceEdge surfaceEdge, Map<OutConfig, SurfaceEdge> map) {
        surfaceEdge.addTransformationUpdateListener(new a70.a(map, 3));
    }

    public Out transform(In in10) throws ProcessingException {
        Threads.checkMainThread();
        StringBuilder sbL = v0.a.l(this.mDebugInfo == null ? "" : v0.a.i(new StringBuilder("["), this.mDebugInfo, "] "), "SurfaceProcessorNode Transform (Processor=");
        sbL.append(this.mSurfaceProcessor);
        sbL.append("\n   inputEdge = ");
        sbL.append(in10.getSurfaceEdge());
        Logger.d("SurfaceProcessorNode", sbL.toString());
        Iterator<OutConfig> it8 = in10.getOutConfigs().iterator();
        while (it8.hasNext()) {
            Logger.d("SurfaceProcessorNode", "   outputConfig = " + it8.next());
        }
        this.mInput = in10;
        this.mOutput = new Out();
        SurfaceEdge surfaceEdge = in10.getSurfaceEdge();
        for (OutConfig outConfig : in10.getOutConfigs()) {
            this.mOutput.put(outConfig, transformSingleOutput(surfaceEdge, outConfig));
        }
        sendSurfaceRequest(surfaceEdge);
        sendSurfaceOutputs(surfaceEdge, this.mOutput);
        setUpRotationUpdates(surfaceEdge, this.mOutput);
        return this.mOutput;
    }
}
