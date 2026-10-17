package com.onfido.android.sdk.capture.common.di;

import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkProductionModule_ProvideSchedulers$onfido_capture_sdk_core_releaseFactory implements b {

    public static final class InstanceHolder {
        private static final SdkProductionModule_ProvideSchedulers$onfido_capture_sdk_core_releaseFactory INSTANCE = new SdkProductionModule_ProvideSchedulers$onfido_capture_sdk_core_releaseFactory();

        private InstanceHolder() {
        }
    }

    public static SdkProductionModule_ProvideSchedulers$onfido_capture_sdk_core_releaseFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SchedulersProvider provideSchedulers$onfido_capture_sdk_core_release() {
        SchedulersProvider schedulersProviderProvideSchedulers$onfido_capture_sdk_core_release = SdkProductionModule.INSTANCE.provideSchedulers$onfido_capture_sdk_core_release();
        e.g(schedulersProviderProvideSchedulers$onfido_capture_sdk_core_release);
        return schedulersProviderProvideSchedulers$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public SchedulersProvider get() {
        return provideSchedulers$onfido_capture_sdk_core_release();
    }
}
