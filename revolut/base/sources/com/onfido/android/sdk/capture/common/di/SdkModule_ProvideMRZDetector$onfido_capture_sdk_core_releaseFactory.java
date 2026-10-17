package com.onfido.android.sdk.capture.common.di;

import android.content.Context;
import com.onfido.android.sdk.capture.detector.mrz.MRZDetector;
import com.onfido.dagger.Lazy;
import com.onfido.javax.inject.Provider;
import el.a;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideMRZDetector$onfido_capture_sdk_core_releaseFactory implements b {
    private final Provider contextProvider;
    private final SdkModule module;
    private final Provider mrzDetectorEmptyProvider;
    private final Provider mrzDetectorGoogleProvider;

    public SdkModule_ProvideMRZDetector$onfido_capture_sdk_core_releaseFactory(SdkModule sdkModule, Provider provider, Provider provider2, Provider provider3) {
        this.module = sdkModule;
        this.contextProvider = provider;
        this.mrzDetectorGoogleProvider = provider2;
        this.mrzDetectorEmptyProvider = provider3;
    }

    public static SdkModule_ProvideMRZDetector$onfido_capture_sdk_core_releaseFactory create(SdkModule sdkModule, Provider provider, Provider provider2, Provider provider3) {
        return new SdkModule_ProvideMRZDetector$onfido_capture_sdk_core_releaseFactory(sdkModule, provider, provider2, provider3);
    }

    public static MRZDetector provideMRZDetector$onfido_capture_sdk_core_release(SdkModule sdkModule, Context context, Lazy lazy, Lazy lazy2) {
        MRZDetector mRZDetectorProvideMRZDetector$onfido_capture_sdk_core_release = sdkModule.provideMRZDetector$onfido_capture_sdk_core_release(context, lazy, lazy2);
        e.g(mRZDetectorProvideMRZDetector$onfido_capture_sdk_core_release);
        return mRZDetectorProvideMRZDetector$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public MRZDetector get() {
        return provideMRZDetector$onfido_capture_sdk_core_release(this.module, (Context) this.contextProvider.get(), a.a(this.mrzDetectorGoogleProvider), a.a(this.mrzDetectorEmptyProvider));
    }
}
