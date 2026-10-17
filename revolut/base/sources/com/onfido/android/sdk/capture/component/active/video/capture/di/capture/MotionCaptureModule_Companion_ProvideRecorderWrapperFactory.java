package com.onfido.android.sdk.capture.component.active.video.capture.di.capture;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.RecorderWrapper;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.RecorderWrapperFactory;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionCaptureModule_Companion_ProvideRecorderWrapperFactory implements b {
    private final Provider recorderWrapperFactoryProvider;

    public MotionCaptureModule_Companion_ProvideRecorderWrapperFactory(Provider provider) {
        this.recorderWrapperFactoryProvider = provider;
    }

    public static MotionCaptureModule_Companion_ProvideRecorderWrapperFactory create(Provider provider) {
        return new MotionCaptureModule_Companion_ProvideRecorderWrapperFactory(provider);
    }

    public static RecorderWrapper provideRecorderWrapper(RecorderWrapperFactory recorderWrapperFactory) {
        RecorderWrapper recorderWrapperProvideRecorderWrapper = MotionCaptureModule.INSTANCE.provideRecorderWrapper(recorderWrapperFactory);
        e.g(recorderWrapperProvideRecorderWrapper);
        return recorderWrapperProvideRecorderWrapper;
    }

    @Override // com.onfido.javax.inject.Provider
    public RecorderWrapper get() {
        return provideRecorderWrapper((RecorderWrapperFactory) this.recorderWrapperFactoryProvider.get());
    }
}
