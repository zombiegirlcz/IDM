package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.ImageProxy;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerError;
import com.fourthline.vision.selfie.SelfieScannerStep;
import com.fourthline.vision.selfie.compose.SelfieScannerEvent;
import com.fourthline.vision.selfie.compose.SelfieScannerInternalConfig;
import com.fourthline.vision.selfie.internal.domain.steps.HeadMetadata;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class c8 extends l implements g6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SelfieScannerConfig f36068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u f36069c;
    private final f6 d;
    private final uc e;
    private final SelfieScannerStep f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ba f36070g;

    public c8(@NotNull SelfieScannerConfig config, @NotNull u cameraEngine, @NotNull f6 faceAnalyzer, @NotNull uc stepFlowRepository) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(cameraEngine, "cameraEngine");
        Intrinsics.checkNotNullParameter(faceAnalyzer, "faceAnalyzer");
        Intrinsics.checkNotNullParameter(stepFlowRepository, "stepFlowRepository");
        this.f36068b = config;
        this.f36069c = cameraEngine;
        this.d = faceAnalyzer;
        this.e = stepFlowRepository;
        this.f = bb.f36011h.getLivenessStepType();
        this.f36070g = new ba(new kg(this, 0));
    }

    private final void handleDetectedFace(mh.a aVar) {
        ba baVar = this.f36070g;
        final int i = 0;
        Function1<? super HeadMetadata, Unit> function1 = new Function1(this) { // from class: com.fourthline.vision.internal.lg

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c8 f36512b;

            {
                this.f36512b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        return c8.handleDetectedFace$lambda$0(this.f36512b, (HeadMetadata) obj2);
                    case 1:
                        return c8.handleDetectedFace$lambda$1(this.f36512b, ((Integer) obj2).intValue());
                    default:
                        return c8.handleDetectedFace$lambda$2(this.f36512b, ((Integer) obj2).intValue());
                }
            }
        };
        final int i2 = 1;
        Function1<? super Integer, Unit> function12 = new Function1(this) { // from class: com.fourthline.vision.internal.lg

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c8 f36512b;

            {
                this.f36512b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        return c8.handleDetectedFace$lambda$0(this.f36512b, (HeadMetadata) obj2);
                    case 1:
                        return c8.handleDetectedFace$lambda$1(this.f36512b, ((Integer) obj2).intValue());
                    default:
                        return c8.handleDetectedFace$lambda$2(this.f36512b, ((Integer) obj2).intValue());
                }
            }
        };
        final int i3 = 2;
        baVar.process(aVar, function1, function12, new Function1(this) { // from class: com.fourthline.vision.internal.lg

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c8 f36512b;

            {
                this.f36512b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        return c8.handleDetectedFace$lambda$0(this.f36512b, (HeadMetadata) obj2);
                    case 1:
                        return c8.handleDetectedFace$lambda$1(this.f36512b, ((Integer) obj2).intValue());
                    default:
                        return c8.handleDetectedFace$lambda$2(this.f36512b, ((Integer) obj2).intValue());
                }
            }
        }, new kg(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleDetectedFace$lambda$0(c8 c8Var, HeadMetadata it8) {
        Function1<SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent, Unit> callback;
        Intrinsics.checkNotNullParameter(it8, "it");
        SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness = c8Var.f36068b.getInternalConfig().getRandomnessLiveness();
        if (randomnessLiveness != null && (callback = randomnessLiveness.getCallback()) != null) {
            callback.invoke(new SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnHeadMoved(it8));
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleDetectedFace$lambda$1(c8 c8Var, int i) {
        Function1<SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent, Unit> callback;
        SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness = c8Var.f36068b.getInternalConfig().getRandomnessLiveness();
        if (randomnessLiveness != null && (callback = randomnessLiveness.getCallback()) != null) {
            callback.invoke(new SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepUpdate(i));
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleDetectedFace$lambda$2(c8 c8Var, int i) {
        Function1<SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent, Unit> callback;
        SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness = c8Var.f36068b.getInternalConfig().getRandomnessLiveness();
        if (randomnessLiveness != null && (callback = randomnessLiveness.getCallback()) != null) {
            callback.invoke(new SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepSuccess(i));
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleDetectedFace$lambda$3(c8 c8Var) {
        sf callback = c8Var.getCallback();
        if (callback != null) {
            sf.onComplete$default(callback, c8Var, zc.f37200a, null, 4, null);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List randomnessLivenessSteps$lambda$0(c8 c8Var) {
        SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness = c8Var.f36068b.getInternalConfig().getRandomnessLiveness();
        if (randomnessLiveness != null) {
            return randomnessLiveness.getSessionRandomnessLivenessSteps();
        }
        return null;
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf, androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(@NotNull ImageProxy image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.d.analyze(image);
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf, androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ Size getDefaultTargetResolution() {
        return super.getDefaultTargetResolution();
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf, androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ int getTargetCoordinateSystem() {
        return super.getTargetCoordinateSystem();
    }

    @Override // com.fourthline.vision.internal.g6
    public void onFacesDetection(@NotNull List<? extends mh.a> faces) {
        Intrinsics.checkNotNullParameter(faces, "faces");
        if (faces.size() > 1) {
            handleError(SelfieScannerError.MULTIPLE_FACES_DETECTED);
            return;
        }
        if (faces.isEmpty()) {
            if (System.currentTimeMillis() - this.e.getLastFoundFaceTimestamp() > 200) {
                handleError(SelfieScannerError.FACE_DISAPPEARED);
                return;
            }
            return;
        }
        mh.a aVar = faces.get(0);
        Function1<fa, fa> boundingBoxToScreen = this.f36069c.getCoordinates().getBoundingBoxToScreen();
        Rect rect = aVar.f205333a;
        Intrinsics.checkNotNullExpressionValue(rect, "getBoundingBox(...)");
        this.e.setRecognizedBounds((fa) boundingBoxToScreen.invoke(ga.toRectangle(rect)));
        this.e.setLastFoundFaceTimestamp(System.currentTimeMillis());
        handleDetectedFace(aVar);
    }

    @Override // com.fourthline.vision.internal.g6
    public void onModelsMissing() {
        handleEvent((SelfieScannerEvent) new SelfieScannerEvent.OnFail(SelfieScannerError.RECOGNITION_MODELS_NOT_DOWNLOADED));
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf
    public void start() {
        Function1<SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent, Unit> callback;
        Function1<SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent, Unit> callback2;
        this.d.setCallback(this);
        this.f36070g.start();
        ba baVar = this.f36070g;
        baVar.start();
        SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness = this.f36068b.getInternalConfig().getRandomnessLiveness();
        if (randomnessLiveness != null && (callback2 = randomnessLiveness.getCallback()) != null) {
            callback2.invoke(new SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepCountUpdate(baVar.getSteps().size()));
        }
        SelfieScannerInternalConfig.RandomnessLiveness randomnessLiveness2 = this.f36068b.getInternalConfig().getRandomnessLiveness();
        if (randomnessLiveness2 == null || (callback = randomnessLiveness2.getCallback()) == null) {
            return;
        }
        callback.invoke(new SelfieScannerInternalConfig.RandomnessLiveness.RandomnessLivenessEvent.OnLivenessStepUpdate(((Number) zhm.d0.b0(baVar.getSteps())).intValue()));
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf
    public void stop() {
        this.d.setCallback(null);
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf, androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ void updateTransform(Matrix matrix) {
        super.updateTransform(matrix);
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf
    @NotNull
    public SelfieScannerStep getPublicStep() {
        return this.f;
    }
}
