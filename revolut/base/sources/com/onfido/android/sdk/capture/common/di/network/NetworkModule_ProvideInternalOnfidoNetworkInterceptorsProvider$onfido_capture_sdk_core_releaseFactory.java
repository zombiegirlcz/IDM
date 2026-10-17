package com.onfido.android.sdk.capture.common.di.network;

import com.onfido.android.sdk.capture.internal.network.InternalOnfidoNetworkInterceptorsProvider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class NetworkModule_ProvideInternalOnfidoNetworkInterceptorsProvider$onfido_capture_sdk_core_releaseFactory implements b {

    public static final class InstanceHolder {
        private static final NetworkModule_ProvideInternalOnfidoNetworkInterceptorsProvider$onfido_capture_sdk_core_releaseFactory INSTANCE = new NetworkModule_ProvideInternalOnfidoNetworkInterceptorsProvider$onfido_capture_sdk_core_releaseFactory();

        private InstanceHolder() {
        }
    }

    public static NetworkModule_ProvideInternalOnfidoNetworkInterceptorsProvider$onfido_capture_sdk_core_releaseFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static InternalOnfidoNetworkInterceptorsProvider provideInternalOnfidoNetworkInterceptorsProvider$onfido_capture_sdk_core_release() {
        InternalOnfidoNetworkInterceptorsProvider internalOnfidoNetworkInterceptorsProviderProvideInternalOnfidoNetworkInterceptorsProvider$onfido_capture_sdk_core_release = NetworkModule.INSTANCE.provideInternalOnfidoNetworkInterceptorsProvider$onfido_capture_sdk_core_release();
        e.g(internalOnfidoNetworkInterceptorsProviderProvideInternalOnfidoNetworkInterceptorsProvider$onfido_capture_sdk_core_release);
        return internalOnfidoNetworkInterceptorsProviderProvideInternalOnfidoNetworkInterceptorsProvider$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public InternalOnfidoNetworkInterceptorsProvider get() {
        return provideInternalOnfidoNetworkInterceptorsProvider$onfido_capture_sdk_core_release();
    }
}
