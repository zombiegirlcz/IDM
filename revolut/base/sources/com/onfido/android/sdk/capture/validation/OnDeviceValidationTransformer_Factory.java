package com.onfido.android.sdk.capture.validation;

import com.onfido.android.sdk.capture.native_detector.NativeDetector;
import com.onfido.dagger.Lazy;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class OnDeviceValidationTransformer_Factory implements el.b {
    private final Provider barcodeDetectorProvider;
    private final Provider faceOnDocumentDetectorProvider;
    private final Provider mRZDetectorProvider;
    private final Provider nativeDetectorProvider;

    public OnDeviceValidationTransformer_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.nativeDetectorProvider = provider;
        this.mRZDetectorProvider = provider2;
        this.barcodeDetectorProvider = provider3;
        this.faceOnDocumentDetectorProvider = provider4;
    }

    public static OnDeviceValidationTransformer_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new OnDeviceValidationTransformer_Factory(provider, provider2, provider3, provider4);
    }

    public static OnDeviceValidationTransformer newInstance(NativeDetector nativeDetector, Lazy lazy, Lazy lazy2, Lazy lazy3) {
        return new OnDeviceValidationTransformer(nativeDetector, lazy, lazy2, lazy3);
    }

    @Override // com.onfido.javax.inject.Provider
    public OnDeviceValidationTransformer get() {
        return newInstance((NativeDetector) this.nativeDetectorProvider.get(), el.a.a(this.mRZDetectorProvider), el.a.a(this.barcodeDetectorProvider), el.a.a(this.faceOnDocumentDetectorProvider));
    }
}
