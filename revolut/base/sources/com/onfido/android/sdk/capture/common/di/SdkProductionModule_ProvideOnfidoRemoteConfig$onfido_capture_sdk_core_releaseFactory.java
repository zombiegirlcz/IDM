package com.onfido.android.sdk.capture.common.di;

import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkProductionModule_ProvideOnfidoRemoteConfig$onfido_capture_sdk_core_releaseFactory implements b {

    public static final class InstanceHolder {
        private static final SdkProductionModule_ProvideOnfidoRemoteConfig$onfido_capture_sdk_core_releaseFactory INSTANCE = new SdkProductionModule_ProvideOnfidoRemoteConfig$onfido_capture_sdk_core_releaseFactory();

        private InstanceHolder() {
        }
    }

    public static SdkProductionModule_ProvideOnfidoRemoteConfig$onfido_capture_sdk_core_releaseFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static OnfidoRemoteConfig provideOnfidoRemoteConfig$onfido_capture_sdk_core_release() {
        OnfidoRemoteConfig onfidoRemoteConfigProvideOnfidoRemoteConfig$onfido_capture_sdk_core_release = SdkProductionModule.INSTANCE.provideOnfidoRemoteConfig$onfido_capture_sdk_core_release();
        e.g(onfidoRemoteConfigProvideOnfidoRemoteConfig$onfido_capture_sdk_core_release);
        return onfidoRemoteConfigProvideOnfidoRemoteConfig$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public OnfidoRemoteConfig get() {
        return provideOnfidoRemoteConfig$onfido_capture_sdk_core_release();
    }
}
