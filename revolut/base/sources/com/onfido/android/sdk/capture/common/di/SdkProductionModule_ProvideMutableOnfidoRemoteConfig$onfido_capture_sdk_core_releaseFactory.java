package com.onfido.android.sdk.capture.common.di;

import com.onfido.android.sdk.capture.internal.config.MutableOnfidoRemoteConfig;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkProductionModule_ProvideMutableOnfidoRemoteConfig$onfido_capture_sdk_core_releaseFactory implements b {

    public static final class InstanceHolder {
        private static final SdkProductionModule_ProvideMutableOnfidoRemoteConfig$onfido_capture_sdk_core_releaseFactory INSTANCE = new SdkProductionModule_ProvideMutableOnfidoRemoteConfig$onfido_capture_sdk_core_releaseFactory();

        private InstanceHolder() {
        }
    }

    public static SdkProductionModule_ProvideMutableOnfidoRemoteConfig$onfido_capture_sdk_core_releaseFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MutableOnfidoRemoteConfig provideMutableOnfidoRemoteConfig$onfido_capture_sdk_core_release() {
        MutableOnfidoRemoteConfig mutableOnfidoRemoteConfigProvideMutableOnfidoRemoteConfig$onfido_capture_sdk_core_release = SdkProductionModule.INSTANCE.provideMutableOnfidoRemoteConfig$onfido_capture_sdk_core_release();
        e.g(mutableOnfidoRemoteConfigProvideMutableOnfidoRemoteConfig$onfido_capture_sdk_core_release);
        return mutableOnfidoRemoteConfigProvideMutableOnfidoRemoteConfig$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public MutableOnfidoRemoteConfig get() {
        return provideMutableOnfidoRemoteConfig$onfido_capture_sdk_core_release();
    }
}
