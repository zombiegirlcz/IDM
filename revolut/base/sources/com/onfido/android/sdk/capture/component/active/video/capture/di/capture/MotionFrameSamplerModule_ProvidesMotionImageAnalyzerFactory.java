package com.onfido.android.sdk.capture.component.active.video.capture.di.capture;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionImage;
import com.onfido.android.sdk.capture.internal.camera.camerax.ImageAnalyzer;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionFrameSamplerModule_ProvidesMotionImageAnalyzerFactory implements b {
    private final MotionFrameSamplerModule module;

    public MotionFrameSamplerModule_ProvidesMotionImageAnalyzerFactory(MotionFrameSamplerModule motionFrameSamplerModule) {
        this.module = motionFrameSamplerModule;
    }

    public static MotionFrameSamplerModule_ProvidesMotionImageAnalyzerFactory create(MotionFrameSamplerModule motionFrameSamplerModule) {
        return new MotionFrameSamplerModule_ProvidesMotionImageAnalyzerFactory(motionFrameSamplerModule);
    }

    public static ImageAnalyzer<MotionImage> providesMotionImageAnalyzer(MotionFrameSamplerModule motionFrameSamplerModule) {
        ImageAnalyzer<MotionImage> imageAnalyzerProvidesMotionImageAnalyzer = motionFrameSamplerModule.providesMotionImageAnalyzer();
        e.g(imageAnalyzerProvidesMotionImageAnalyzer);
        return imageAnalyzerProvidesMotionImageAnalyzer;
    }

    @Override // com.onfido.javax.inject.Provider
    public ImageAnalyzer<MotionImage> get() {
        return providesMotionImageAnalyzer(this.module);
    }
}
