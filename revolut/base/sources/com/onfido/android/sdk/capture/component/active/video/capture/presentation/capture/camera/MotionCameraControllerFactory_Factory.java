package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraXController;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.MotionCamera2Controller;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.camera.camerax.CameraX;
import com.onfido.android.sdk.capture.internal.camera.camerax.FrameSampler;
import com.onfido.android.sdk.capture.internal.camera.camerax.ImageAnalyzer;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionCameraControllerFactory_Factory implements b {
    private final Provider analyticsProvider;
    private final Provider camera2ControllerFactoryProvider;
    private final Provider cameraXControllerFactoryProvider;
    private final Provider cameraXFactoryProvider;
    private final Provider frameSamplerProvider;
    private final Provider imageAnalyzerProvider;

    public MotionCameraControllerFactory_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.cameraXFactoryProvider = provider;
        this.frameSamplerProvider = provider2;
        this.imageAnalyzerProvider = provider3;
        this.cameraXControllerFactoryProvider = provider4;
        this.camera2ControllerFactoryProvider = provider5;
        this.analyticsProvider = provider6;
    }

    public static MotionCameraControllerFactory_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new MotionCameraControllerFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static MotionCameraControllerFactory newInstance(CameraX.Factory factory, FrameSampler<MotionImage> frameSampler, ImageAnalyzer<MotionImage> imageAnalyzer, MotionCameraXController.Factory factory2, MotionCamera2Controller.Factory factory3, OnfidoAnalytics onfidoAnalytics) {
        return new MotionCameraControllerFactory(factory, frameSampler, imageAnalyzer, factory2, factory3, onfidoAnalytics);
    }

    @Override // com.onfido.javax.inject.Provider
    public MotionCameraControllerFactory get() {
        return newInstance((CameraX.Factory) this.cameraXFactoryProvider.get(), (FrameSampler) this.frameSamplerProvider.get(), (ImageAnalyzer) this.imageAnalyzerProvider.get(), (MotionCameraXController.Factory) this.cameraXControllerFactoryProvider.get(), (MotionCamera2Controller.Factory) this.camera2ControllerFactoryProvider.get(), (OnfidoAnalytics) this.analyticsProvider.get());
    }
}
