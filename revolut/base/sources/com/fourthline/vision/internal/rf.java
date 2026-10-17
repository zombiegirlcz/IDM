package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.util.Size;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;

/* JADX INFO: loaded from: classes23.dex */
public interface rf extends ImageAnalysis.Analyzer {
    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    /* synthetic */ void analyze(ImageProxy imageProxy);

    sf getCallback();

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    /* bridge */ /* synthetic */ default Size getDefaultTargetResolution() {
        return super.getDefaultTargetResolution();
    }

    Object getPublicStep();

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    /* bridge */ /* synthetic */ default int getTargetCoordinateSystem() {
        return super.getTargetCoordinateSystem();
    }

    void handleError(Object obj2);

    void handleEvent(Object obj2);

    void setCallback(sf sfVar);

    void start();

    void stop();

    void takePicture();

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    /* bridge */ /* synthetic */ default void updateTransform(Matrix matrix) {
        super.updateTransform(matrix);
    }
}
