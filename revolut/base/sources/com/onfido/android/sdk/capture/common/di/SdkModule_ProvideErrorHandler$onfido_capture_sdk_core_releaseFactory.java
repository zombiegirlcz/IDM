package com.onfido.android.sdk.capture.common.di;

import com.onfido.android.sdk.capture.network.error.ErrorHandler;
import com.onfido.api.client.ErrorParser;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideErrorHandler$onfido_capture_sdk_core_releaseFactory implements b {
    private final Provider errorParserProvider;
    private final SdkModule module;

    public SdkModule_ProvideErrorHandler$onfido_capture_sdk_core_releaseFactory(SdkModule sdkModule, Provider provider) {
        this.module = sdkModule;
        this.errorParserProvider = provider;
    }

    public static SdkModule_ProvideErrorHandler$onfido_capture_sdk_core_releaseFactory create(SdkModule sdkModule, Provider provider) {
        return new SdkModule_ProvideErrorHandler$onfido_capture_sdk_core_releaseFactory(sdkModule, provider);
    }

    public static ErrorHandler provideErrorHandler$onfido_capture_sdk_core_release(SdkModule sdkModule, ErrorParser errorParser) {
        ErrorHandler errorHandlerProvideErrorHandler$onfido_capture_sdk_core_release = sdkModule.provideErrorHandler$onfido_capture_sdk_core_release(errorParser);
        e.g(errorHandlerProvideErrorHandler$onfido_capture_sdk_core_release);
        return errorHandlerProvideErrorHandler$onfido_capture_sdk_core_release;
    }

    @Override // com.onfido.javax.inject.Provider
    public ErrorHandler get() {
        return provideErrorHandler$onfido_capture_sdk_core_release(this.module, (ErrorParser) this.errorParserProvider.get());
    }
}
