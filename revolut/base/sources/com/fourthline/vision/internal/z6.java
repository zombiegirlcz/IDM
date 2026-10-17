package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.util.Size;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;

/* JADX INFO: loaded from: classes23.dex */
public interface z6 extends ImageAnalysis.Analyzer {
    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    /* synthetic */ void analyze(ImageProxy imageProxy);

    a7 getCallback();

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    /* bridge */ /* synthetic */ default Size getDefaultTargetResolution() {
        return super.getDefaultTargetResolution();
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    /* bridge */ /* synthetic */ default int getTargetCoordinateSystem() {
        return super.getTargetCoordinateSystem();
    }

    boolean isProcessing();

    void setCallback(a7 a7Var);

    void start();

    void stop();

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    /* bridge */ /* synthetic */ default void updateTransform(Matrix matrix) {
        super.updateTransform(matrix);
    }
}
