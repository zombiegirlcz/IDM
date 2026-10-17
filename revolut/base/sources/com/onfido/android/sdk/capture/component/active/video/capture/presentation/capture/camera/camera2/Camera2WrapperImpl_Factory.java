package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2;

import android.content.Context;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.util.SurfaceSizeProvider;
import com.onfido.api.client.data.SdkConfiguration;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class Camera2WrapperImpl_Factory implements b {
    private final Provider contextProvider;
    private final Provider motionVideoSettingsProvider;
    private final Provider surfaceSizeProvider;

    public Camera2WrapperImpl_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.contextProvider = provider;
        this.surfaceSizeProvider = provider2;
        this.motionVideoSettingsProvider = provider3;
    }

    public static Camera2WrapperImpl_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new Camera2WrapperImpl_Factory(provider, provider2, provider3);
    }

    public static Camera2WrapperImpl newInstance(Context context, SurfaceSizeProvider surfaceSizeProvider, SdkConfiguration.MotionCapture.MotionVideoSettings motionVideoSettings) {
        return new Camera2WrapperImpl(context, surfaceSizeProvider, motionVideoSettings);
    }

    @Override // com.onfido.javax.inject.Provider
    public Camera2WrapperImpl get() {
        return newInstance((Context) this.contextProvider.get(), (SurfaceSizeProvider) this.surfaceSizeProvider.get(), (SdkConfiguration.MotionCapture.MotionVideoSettings) this.motionVideoSettingsProvider.get());
    }
}
