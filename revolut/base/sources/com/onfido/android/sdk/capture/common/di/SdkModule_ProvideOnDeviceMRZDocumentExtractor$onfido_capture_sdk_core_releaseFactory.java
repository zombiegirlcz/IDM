package com.onfido.android.sdk.capture.common.di;

import android.content.Context;
import com.onfido.android.sdk.capture.detector.mrzextraction.MRZDocumentExtractor;
import com.onfido.dagger.Lazy;
import com.onfido.javax.inject.Provider;
import el.a;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideOnDeviceMRZDocumentExtractor$onfido_capture_sdk_core_releaseFactory implements b {
    private final Provider contextProvider;
    private final SdkModule module;
    private final Provider mrzDocumentExtractorEmptyProvider;
    private final Provider mrzDocumentExtractorProvider;

    public SdkModule_ProvideOnDeviceMRZDocumentExtractor$onfido_capture_sdk_core_releaseFactory(SdkModule sdkModule, Provider provider, Provider provider2, Provider provider3) {
        this.module = sdkModule;
        this.contextProvider = provider;
        this.mrzDocumentExtractorProvider = provider2;
        this.mrzDocumentExtractorEmptyProvider = provider3;
    }

    public static SdkModule_ProvideOnDeviceMRZDocumentExtractor$onfido_capture_sdk_core_releaseFactory create(SdkModule sdkModule, Provider provider, Provider provider2, Provider provider3) {
        return new SdkModule_ProvideOnDeviceMRZDocumentExtractor$onfido_capture_sdk_core_releaseFactory(sdkModule, provider, provider2, provider3);
    }

    public static MRZDocumentExtractor provideOnDeviceMRZDocumentExtractor$onfido_capture_sdk_core_release(SdkModule sdkModule, Context context, Lazy lazy, Lazy lazy2) {
        MRZDocumentExtractor mRZDocumentExtractorProvideOnDeviceMRZDocumentExtractor$onfido_capture_sdk_core_release = sdkModule.provideOnDeviceMRZDocumentExtractor$onfido_capture_sdk_core_release(context, lazy, lazy2);
        e.g(mRZDocumentExtractorProvideOnDeviceMRZDocumentExtractor$onfido_capture_sdk_core_release);
        return mRZDocumentExtractorProvideOnDeviceMRZDocumentExtractor$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public MRZDocumentExtractor get() {
        return provideOnDeviceMRZDocumentExtractor$onfido_capture_sdk_core_release(this.module, (Context) this.contextProvider.get(), a.a(this.mrzDocumentExtractorProvider), a.a(this.mrzDocumentExtractorEmptyProvider));
    }
}
