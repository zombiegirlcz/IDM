package com.onfido.android.sdk.capture.common.di;

import com.google.mlkit.vision.barcode.BarcodeScanner;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideMlKitBarcodeScanner$onfido_capture_sdk_core_releaseFactory implements b {
    private final SdkModule module;

    public SdkModule_ProvideMlKitBarcodeScanner$onfido_capture_sdk_core_releaseFactory(SdkModule sdkModule) {
        this.module = sdkModule;
    }

    public static SdkModule_ProvideMlKitBarcodeScanner$onfido_capture_sdk_core_releaseFactory create(SdkModule sdkModule) {
        return new SdkModule_ProvideMlKitBarcodeScanner$onfido_capture_sdk_core_releaseFactory(sdkModule);
    }

    public static BarcodeScanner provideMlKitBarcodeScanner$onfido_capture_sdk_core_release(SdkModule sdkModule) {
        BarcodeScanner barcodeScannerProvideMlKitBarcodeScanner$onfido_capture_sdk_core_release = sdkModule.provideMlKitBarcodeScanner$onfido_capture_sdk_core_release();
        e.g(barcodeScannerProvideMlKitBarcodeScanner$onfido_capture_sdk_core_release);
        return barcodeScannerProvideMlKitBarcodeScanner$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public BarcodeScanner get() {
        return provideMlKitBarcodeScanner$onfido_capture_sdk_core_release(this.module);
    }
}
