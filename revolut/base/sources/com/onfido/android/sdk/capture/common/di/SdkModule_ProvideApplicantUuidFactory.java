package com.onfido.android.sdk.capture.common.di;

import com.onfido.android.sdk.capture.internal.token.OnfidoTokenProvider;
import com.onfido.api.client.token.sdk.ApplicantId;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideApplicantUuidFactory implements b {
    private final SdkModule module;
    private final Provider tokenProvider;

    public SdkModule_ProvideApplicantUuidFactory(SdkModule sdkModule, Provider provider) {
        this.module = sdkModule;
        this.tokenProvider = provider;
    }

    public static SdkModule_ProvideApplicantUuidFactory create(SdkModule sdkModule, Provider provider) {
        return new SdkModule_ProvideApplicantUuidFactory(sdkModule, provider);
    }

    public static ApplicantId provideApplicantUuid(SdkModule sdkModule, OnfidoTokenProvider onfidoTokenProvider) {
        ApplicantId applicantIdProvideApplicantUuid = sdkModule.provideApplicantUuid(onfidoTokenProvider);
        e.g(applicantIdProvideApplicantUuid);
        return applicantIdProvideApplicantUuid;
    }

    @Override // com.onfido.javax.inject.Provider
    public ApplicantId get() {
        return provideApplicantUuid(this.module, (OnfidoTokenProvider) this.tokenProvider.get());
    }
}
