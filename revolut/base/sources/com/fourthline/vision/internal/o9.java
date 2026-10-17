package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.util.Size;
import androidx.camera.core.ImageProxy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class o9 implements z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f36626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a7 f36627b;

    @Override // com.fourthline.vision.internal.z6, androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(@NotNull ImageProxy image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f36626a = true;
        image.close();
        this.f36626a = false;
    }

    @Override // com.fourthline.vision.internal.z6
    public a7 getCallback() {
        return this.f36627b;
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
        return this.f36626a;
    }

    @Override // com.fourthline.vision.internal.z6
    public void setCallback(a7 a7Var) {
        this.f36627b = a7Var;
    }

    @Override // com.fourthline.vision.internal.z6
    public void start() {
    }

    @Override // com.fourthline.vision.internal.z6
    public void stop() {
    }

    @Override // com.fourthline.vision.internal.z6, androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ void updateTransform(Matrix matrix) {
        super.updateTransform(matrix);
    }
}
