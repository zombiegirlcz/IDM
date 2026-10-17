package com.onfido.android.sdk.capture.analytics;

import android.content.Context;
import com.onfido.android.sdk.capture.native_detector.NativeDetector;
import com.onfido.android.sdk.capture.utils.DeviceMetadataProvider;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class IdentityInteractor_Factory implements b {
    private final Provider contextProvider;
    private final Provider deviceMetadataProvider;
    private final Provider nativeDetectorProvider;

    public IdentityInteractor_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.contextProvider = provider;
        this.nativeDetectorProvider = provider2;
        this.deviceMetadataProvider = provider3;
    }

    public static IdentityInteractor_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new IdentityInteractor_Factory(provider, provider2, provider3);
    }

    public static IdentityInteractor newInstance(Context context, NativeDetector nativeDetector, DeviceMetadataProvider deviceMetadataProvider) {
        return new IdentityInteractor(context, nativeDetector, deviceMetadataProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public IdentityInteractor get() {
        return newInstance((Context) this.contextProvider.get(), (NativeDetector) this.nativeDetectorProvider.get(), (DeviceMetadataProvider) this.deviceMetadataProvider.get());
    }
}
