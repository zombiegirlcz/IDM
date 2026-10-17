package com.onfido.android.sdk.capture.common.di;

import com.onfido.android.sdk.capture.internal.util.DispatchersProvider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkProductionModule_ProvideDispatchersProvider$onfido_capture_sdk_core_releaseFactory implements b {

    public static final class InstanceHolder {
        private static final SdkProductionModule_ProvideDispatchersProvider$onfido_capture_sdk_core_releaseFactory INSTANCE = new SdkProductionModule_ProvideDispatchersProvider$onfido_capture_sdk_core_releaseFactory();

        private InstanceHolder() {
        }
    }

    public static SdkProductionModule_ProvideDispatchersProvider$onfido_capture_sdk_core_releaseFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DispatchersProvider provideDispatchersProvider$onfido_capture_sdk_core_release() {
        DispatchersProvider dispatchersProviderProvideDispatchersProvider$onfido_capture_sdk_core_release = SdkProductionModule.INSTANCE.provideDispatchersProvider$onfido_capture_sdk_core_release();
        e.g(dispatchersProviderProvideDispatchersProvider$onfido_capture_sdk_core_release);
        return dispatchersProviderProvideDispatchersProvider$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public DispatchersProvider get() {
        return provideDispatchersProvider$onfido_capture_sdk_core_release();
    }
}
