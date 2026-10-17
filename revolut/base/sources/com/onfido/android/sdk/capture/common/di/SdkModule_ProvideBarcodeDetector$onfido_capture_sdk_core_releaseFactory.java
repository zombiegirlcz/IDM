package com.onfido.android.sdk.capture.common.di;

import android.content.Context;
import com.onfido.android.sdk.capture.detector.barcode.BarcodeDetector;
import com.onfido.dagger.Lazy;
import com.onfido.javax.inject.Provider;
import el.a;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideBarcodeDetector$onfido_capture_sdk_core_releaseFactory implements b {
    private final Provider barcodeDetectorEmptyProvider;
    private final Provider barcodeDetectorGoogleProvider;
    private final Provider contextProvider;
    private final SdkModule module;

    public SdkModule_ProvideBarcodeDetector$onfido_capture_sdk_core_releaseFactory(SdkModule sdkModule, Provider provider, Provider provider2, Provider provider3) {
        this.module = sdkModule;
        this.contextProvider = provider;
        this.barcodeDetectorGoogleProvider = provider2;
        this.barcodeDetectorEmptyProvider = provider3;
    }

    public static SdkModule_ProvideBarcodeDetector$onfido_capture_sdk_core_releaseFactory create(SdkModule sdkModule, Provider provider, Provider provider2, Provider provider3) {
        return new SdkModule_ProvideBarcodeDetector$onfido_capture_sdk_core_releaseFactory(sdkModule, provider, provider2, provider3);
    }

    public static BarcodeDetector provideBarcodeDetector$onfido_capture_sdk_core_release(SdkModule sdkModule, Context context, Lazy lazy, Lazy lazy2) {
        BarcodeDetector barcodeDetectorProvideBarcodeDetector$onfido_capture_sdk_core_release = sdkModule.provideBarcodeDetector$onfido_capture_sdk_core_release(context, lazy, lazy2);
        e.g(barcodeDetectorProvideBarcodeDetector$onfido_capture_sdk_core_release);
        return barcodeDetectorProvideBarcodeDetector$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public BarcodeDetector get() {
        return provideBarcodeDetector$onfido_capture_sdk_core_release(this.module, (Context) this.contextProvider.get(), a.a(this.barcodeDetectorGoogleProvider), a.a(this.barcodeDetectorEmptyProvider));
    }
}
