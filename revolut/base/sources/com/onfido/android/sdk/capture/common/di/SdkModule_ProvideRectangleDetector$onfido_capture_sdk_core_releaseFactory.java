package com.onfido.android.sdk.capture.common.di;

import android.content.Context;
import com.onfido.android.sdk.capture.detector.rectangle.RectangleDetector;
import com.onfido.dagger.Lazy;
import com.onfido.javax.inject.Provider;
import el.a;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideRectangleDetector$onfido_capture_sdk_core_releaseFactory implements b {
    private final Provider contextProvider;
    private final SdkModule module;
    private final Provider rectangleDetectorEmptyProvider;
    private final Provider rectangleDetectorGoogleProvider;

    public SdkModule_ProvideRectangleDetector$onfido_capture_sdk_core_releaseFactory(SdkModule sdkModule, Provider provider, Provider provider2, Provider provider3) {
        this.module = sdkModule;
        this.contextProvider = provider;
        this.rectangleDetectorGoogleProvider = provider2;
        this.rectangleDetectorEmptyProvider = provider3;
    }

    public static SdkModule_ProvideRectangleDetector$onfido_capture_sdk_core_releaseFactory create(SdkModule sdkModule, Provider provider, Provider provider2, Provider provider3) {
        return new SdkModule_ProvideRectangleDetector$onfido_capture_sdk_core_releaseFactory(sdkModule, provider, provider2, provider3);
    }

    public static RectangleDetector provideRectangleDetector$onfido_capture_sdk_core_release(SdkModule sdkModule, Context context, Lazy lazy, Lazy lazy2) {
        RectangleDetector rectangleDetectorProvideRectangleDetector$onfido_capture_sdk_core_release = sdkModule.provideRectangleDetector$onfido_capture_sdk_core_release(context, lazy, lazy2);
        e.g(rectangleDetectorProvideRectangleDetector$onfido_capture_sdk_core_release);
        return rectangleDetectorProvideRectangleDetector$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public RectangleDetector get() {
        return provideRectangleDetector$onfido_capture_sdk_core_release(this.module, (Context) this.contextProvider.get(), a.a(this.rectangleDetectorGoogleProvider), a.a(this.rectangleDetectorEmptyProvider));
    }
}
