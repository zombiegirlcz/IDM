package com.onfido.android.sdk.capture.component.active.video.capture.di.capture;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionImage;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.preview.PreviewBitmapHelper;
import com.onfido.android.sdk.capture.internal.camera.camerax.FrameSampler;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionFrameSamplerModule_ProvidesMotionFrameSamplerFactory implements b {
    private final MotionFrameSamplerModule module;
    private final Provider previewBitmapHelperProvider;
    private final Provider schedulersProvider;

    public MotionFrameSamplerModule_ProvidesMotionFrameSamplerFactory(MotionFrameSamplerModule motionFrameSamplerModule, Provider provider, Provider provider2) {
        this.module = motionFrameSamplerModule;
        this.previewBitmapHelperProvider = provider;
        this.schedulersProvider = provider2;
    }

    public static MotionFrameSamplerModule_ProvidesMotionFrameSamplerFactory create(MotionFrameSamplerModule motionFrameSamplerModule, Provider provider, Provider provider2) {
        return new MotionFrameSamplerModule_ProvidesMotionFrameSamplerFactory(motionFrameSamplerModule, provider, provider2);
    }

    public static FrameSampler<MotionImage> providesMotionFrameSampler(MotionFrameSamplerModule motionFrameSamplerModule, PreviewBitmapHelper previewBitmapHelper, SchedulersProvider schedulersProvider) {
        FrameSampler<MotionImage> frameSamplerProvidesMotionFrameSampler = motionFrameSamplerModule.providesMotionFrameSampler(previewBitmapHelper, schedulersProvider);
        e.g(frameSamplerProvidesMotionFrameSampler);
        return frameSamplerProvidesMotionFrameSampler;
    }

    @Override // com.onfido.javax.inject.Provider
    public FrameSampler<MotionImage> get() {
        return providesMotionFrameSampler(this.module, (PreviewBitmapHelper) this.previewBitmapHelperProvider.get(), (SchedulersProvider) this.schedulersProvider.get());
    }
}
