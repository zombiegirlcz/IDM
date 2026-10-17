package com.onfido.android.sdk.capture.internal.analytics.inhouse;

import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.analytics.IdentityInteractor;
import com.onfido.android.sdk.capture.internal.util.SessionIdProvider;
import com.onfido.android.sdk.capture.internal.util.environment.EnvironmentIntegrityChecker;
import com.onfido.android.sdk.capture.utils.DeviceMetadataProvider;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import com.onfido.android.sdk.capture.utils.UuidProvider;
import com.onfido.javax.inject.Provider;
import el.b;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoAnalyticsMapper_Factory implements b {
    private final Provider deviceMetadataProvider;
    private final Provider environmentIntegrityCheckerProvider;
    private final Provider identityInteractorProvider;
    private final Provider jsonParserProvider;
    private final Provider metadataProvider;
    private final Provider onfidoConfigProvider;
    private final Provider sdkTokenParserProvider;
    private final Provider sessionIdProvider;
    private final Provider timeProvider;
    private final Provider uuidProvider;

    public OnfidoAnalyticsMapper_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10) {
        this.timeProvider = provider;
        this.uuidProvider = provider2;
        this.metadataProvider = provider3;
        this.onfidoConfigProvider = provider4;
        this.sessionIdProvider = provider5;
        this.sdkTokenParserProvider = provider6;
        this.deviceMetadataProvider = provider7;
        this.jsonParserProvider = provider8;
        this.environmentIntegrityCheckerProvider = provider9;
        this.identityInteractorProvider = provider10;
    }

    public static OnfidoAnalyticsMapper_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10) {
        return new OnfidoAnalyticsMapper_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static OnfidoAnalyticsMapper newInstance(TimeProvider timeProvider, UuidProvider uuidProvider, AnalyticsMetadataProvider analyticsMetadataProvider, OnfidoConfig onfidoConfig, SessionIdProvider sessionIdProvider, SdkTokenParser sdkTokenParser, DeviceMetadataProvider deviceMetadataProvider, Json json, EnvironmentIntegrityChecker environmentIntegrityChecker, IdentityInteractor identityInteractor) {
        return new OnfidoAnalyticsMapper(timeProvider, uuidProvider, analyticsMetadataProvider, onfidoConfig, sessionIdProvider, sdkTokenParser, deviceMetadataProvider, json, environmentIntegrityChecker, identityInteractor);
    }

    @Override // com.onfido.javax.inject.Provider
    public OnfidoAnalyticsMapper get() {
        return newInstance((TimeProvider) this.timeProvider.get(), (UuidProvider) this.uuidProvider.get(), (AnalyticsMetadataProvider) this.metadataProvider.get(), (OnfidoConfig) this.onfidoConfigProvider.get(), (SessionIdProvider) this.sessionIdProvider.get(), (SdkTokenParser) this.sdkTokenParserProvider.get(), (DeviceMetadataProvider) this.deviceMetadataProvider.get(), (Json) this.jsonParserProvider.get(), (EnvironmentIntegrityChecker) this.environmentIntegrityCheckerProvider.get(), (IdentityInteractor) this.identityInteractorProvider.get());
    }
}
