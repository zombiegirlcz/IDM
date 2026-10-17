package com.fourthline.vision.internal;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
final class b8 implements na {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SelfieScannerConfig f36004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f36005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f36006c;

    public b8(@NotNull SelfieScannerConfig config, @NotNull Function0<Rect> faceDetectionAreaProvider, @NotNull Function0<Matrix> imageToScreenCoordsMatrixFactory) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(faceDetectionAreaProvider, "faceDetectionAreaProvider");
        Intrinsics.checkNotNullParameter(imageToScreenCoordsMatrixFactory, "imageToScreenCoordsMatrixFactory");
        this.f36004a = config;
        this.f36005b = faceDetectionAreaProvider;
        this.f36006c = imageToScreenCoordsMatrixFactory;
    }

    @Override // com.fourthline.vision.internal.na, com.fourthline.vision.internal.oa
    @NotNull
    public fa contentDetectionArea() {
        float[] fArrM2049constructorimpl = Matrix.m2049constructorimpl((float[]) ((Matrix) this.f36006c.invoke()).getValues().clone());
        Matrix.m2054invertimpl(fArrM2049constructorimpl);
        return ga.toRectangle(RectHelper_androidKt.toAndroidRect(Matrix.m2056mapimpl(fArrM2049constructorimpl, (Rect) this.f36005b.invoke())));
    }

    @Override // com.fourthline.vision.internal.na
    public /* bridge */ boolean getShouldStartAutomatically() {
        return super.getShouldStartAutomatically();
    }

    @Override // com.fourthline.vision.internal.na
    @NotNull
    public SelfieScannerConfig config() {
        return this.f36004a;
    }
}
