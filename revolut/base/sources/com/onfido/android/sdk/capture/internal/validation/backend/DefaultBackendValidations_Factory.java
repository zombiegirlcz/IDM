package com.onfido.android.sdk.capture.internal.validation.backend;

import com.onfido.android.sdk.capture.native_detector.NativeDetector;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class DefaultBackendValidations_Factory implements b {
    private final Provider nativeDetectorProvider;

    public DefaultBackendValidations_Factory(Provider provider) {
        this.nativeDetectorProvider = provider;
    }

    public static DefaultBackendValidations_Factory create(Provider provider) {
        return new DefaultBackendValidations_Factory(provider);
    }

    public static DefaultBackendValidations newInstance(NativeDetector nativeDetector) {
        return new DefaultBackendValidations(nativeDetector);
    }

    @Override // com.onfido.javax.inject.Provider
    public DefaultBackendValidations get() {
        return newInstance((NativeDetector) this.nativeDetectorProvider.get());
    }
}
