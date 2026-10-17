package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.ImageProxy;
import com.fourthline.vision.selfie.SelfieScannerError;
import com.fourthline.vision.selfie.SelfieScannerStep;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class g7 extends l implements g6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f36240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f6 f36241c;
    private final uc d;
    private final SelfieScannerStep e;

    public g7(@NotNull u cameraEngine, @NotNull f6 faceAnalyzer, @NotNull uc stepFlowRepository) {
        Intrinsics.checkNotNullParameter(cameraEngine, "cameraEngine");
        Intrinsics.checkNotNullParameter(faceAnalyzer, "faceAnalyzer");
        Intrinsics.checkNotNullParameter(stepFlowRepository, "stepFlowRepository");
        this.f36240b = cameraEngine;
        this.f36241c = faceAnalyzer;
        this.d = stepFlowRepository;
        this.e = SelfieScannerStep.TURN_HEAD_LEFT;
    }

    private final void handleDetectedFace(mh.a aVar) {
        sf callback;
        if (aVar.f205336g <= 20.0f || (callback = getCallback()) == null) {
            return;
        }
        sf.onComplete$default(callback, this, zc.f37200a, null, 4, null);
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf, androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(@NotNull ImageProxy image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f36241c.analyze(image);
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
            if (System.currentTimeMillis() - this.d.getLastFoundFaceTimestamp() > 200) {
                handleError(SelfieScannerError.FACE_DISAPPEARED);
                return;
            }
            return;
        }
        mh.a aVar = faces.get(0);
        Function1<fa, fa> boundingBoxToScreen = this.f36240b.getCoordinates().getBoundingBoxToScreen();
        Rect rect = aVar.f205333a;
        Intrinsics.checkNotNullExpressionValue(rect, "getBoundingBox(...)");
        this.d.setRecognizedBounds((fa) boundingBoxToScreen.invoke(ga.toRectangle(rect)));
        this.d.setLastFoundFaceTimestamp(System.currentTimeMillis());
        handleDetectedFace(aVar);
    }

    @Override // com.fourthline.vision.internal.g6
    public void onModelsMissing() {
        handleError(SelfieScannerError.RECOGNITION_MODELS_NOT_DOWNLOADED);
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf
    public void start() {
        this.f36241c.setCallback(this);
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf
    public void stop() {
        this.f36241c.setCallback(null);
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf, androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ void updateTransform(Matrix matrix) {
        super.updateTransform(matrix);
    }

    @Override // com.fourthline.vision.internal.l, com.fourthline.vision.internal.rf
    @NotNull
    public SelfieScannerStep getPublicStep() {
        return this.e;
    }
}
