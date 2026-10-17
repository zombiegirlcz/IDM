package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.util.Size;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import androidx.camera.mlkit.vision.MlKitAnalyzer;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.face.FaceDetector;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class f6 implements ImageAnalysis.Analyzer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g6 f36175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FaceDetectorOptions f36176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FaceDetector f36177c;
    private final t6 d;
    private final MlKitAnalyzer e;

    public f6(@NotNull Executor mainExecutor, int i) {
        FaceDetector s2Var;
        Intrinsics.checkNotNullParameter(mainExecutor, "mainExecutor");
        FaceDetectorOptions faceDetectorOptions = new FaceDetectorOptions(1, 1, 2, 1, 0.4f);
        Intrinsics.checkNotNullExpressionValue(faceDetectorOptions, "build(...)");
        this.f36176b = faceDetectorOptions;
        try {
            s2Var = pd.b.f(faceDetectorOptions);
        } catch (MlKitException unused) {
            s2Var = new s2();
        }
        this.f36177c = s2Var;
        this.d = new t6("CameraXSelfie", 0L, 2, null);
        this.e = new MlKitAnalyzer(zhm.u.c(s2Var), i, mainExecutor, new pg(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mlKitAnalyzer$lambda$0(f6 f6Var, MlKitAnalyzer.Result result) {
        g6 g6Var;
        g6 g6Var2;
        List<? extends mh.a> list = (List) result.getValue(f6Var.f36177c);
        if (list != null && (g6Var2 = f6Var.f36175a) != null) {
            g6Var2.onFacesDetection(list);
        }
        Throwable throwable = result.getThrowable(f6Var.f36177c);
        if (throwable == null || !e9.isMissingModelsException(throwable) || (g6Var = f6Var.f36175a) == null) {
            return;
        }
        g6Var.onModelsMissing();
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(@NotNull ImageProxy image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.d.monitor();
        this.e.analyze(image);
    }

    public final g6 getCallback() {
        return this.f36175a;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    @NotNull
    public Size getDefaultTargetResolution() {
        Size defaultTargetResolution = this.e.getDefaultTargetResolution();
        Intrinsics.checkNotNullExpressionValue(defaultTargetResolution, "getDefaultTargetResolution(...)");
        return defaultTargetResolution;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public int getTargetCoordinateSystem() {
        return this.e.getTargetCoordinateSystem();
    }

    public final void setCallback(g6 g6Var) {
        this.f36175a = g6Var;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void updateTransform(Matrix matrix) {
        this.e.updateTransform(matrix);
    }
}
