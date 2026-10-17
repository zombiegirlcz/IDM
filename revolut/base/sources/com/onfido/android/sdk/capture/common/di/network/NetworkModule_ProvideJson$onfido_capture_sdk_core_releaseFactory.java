package com.onfido.android.sdk.capture.common.di.network;

import el.b;
import kotlinx.serialization.json.Json;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class NetworkModule_ProvideJson$onfido_capture_sdk_core_releaseFactory implements b {

    public static final class InstanceHolder {
        private static final NetworkModule_ProvideJson$onfido_capture_sdk_core_releaseFactory INSTANCE = new NetworkModule_ProvideJson$onfido_capture_sdk_core_releaseFactory();

        private InstanceHolder() {
        }
    }

    public static NetworkModule_ProvideJson$onfido_capture_sdk_core_releaseFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Json provideJson$onfido_capture_sdk_core_release() {
        Json jsonProvideJson$onfido_capture_sdk_core_release = NetworkModule.INSTANCE.provideJson$onfido_capture_sdk_core_release();
        e.g(jsonProvideJson$onfido_capture_sdk_core_release);
        return jsonProvideJson$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public Json get() {
        return provideJson$onfido_capture_sdk_core_release();
    }
}
