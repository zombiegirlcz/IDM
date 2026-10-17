package com.onfido.android.sdk.capture.common.di.network;

import com.google.android.gms.internal.mlkit_vision_face.a;
import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.analytics.IdentityInteractor;
import com.onfido.android.sdk.capture.document.supported.data.remote.datasource.SupportedDocumentsApi;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.network.OnfidoAnalyticsApi;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.network.OnfidoAssetsApi;
import com.onfido.android.sdk.capture.internal.network.InternalOnfidoNetworkInterceptorsProvider;
import com.onfido.android.sdk.capture.internal.performance.repository.PerformanceAnalyticsApi;
import com.onfido.android.sdk.capture.internal.token.OnfidoTokenProvider;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.internal.util.logging.network.OnfidoLoggerApi;
import com.onfido.android.sdk.capture.ui.camera.liveness.intro.LivenessIntroVideoApi;
import com.onfido.android.sdk.capture.ui.proofOfAddress.network.ProofOfAddressApi;
import com.onfido.android.sdk.capture.ui.userconsent.network.UserConsentApi;
import com.onfido.api.client.OnfidoAPI;
import com.onfido.api.client.OnfidoFetcher;
import com.onfido.api.client.e;
import com.onfido.api.client.m;
import com.onfido.api.client.p;
import com.onfido.api.client.token.sdk.InternalSDKToken;
import com.onfido.api.client.token.sdk.model.InternalSDKTokenPayload;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import lmm.b;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import ulm.a1;
import ulm.b1;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0005J\r\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\b\rJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0011J-\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\u001bJ\u0015\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\b\u001eJ\u0015\u0010\u001f\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\b!J5\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007H\u0001¢\u0006\u0002\b&J\u0015\u0010'\u001a\u00020(2\u0006\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\b)J\u0015\u0010*\u001a\u00020+2\u0006\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\b,J\u0015\u0010-\u001a\u00020.2\u0006\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\b/J\u001d\u00100\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0007H\u0001¢\u0006\u0002\b1J\u0015\u00102\u001a\u0002032\u0006\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\b4J\u0015\u00105\u001a\u0002062\u0006\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\b7¨\u00068"}, d2 = {"Lcom/onfido/android/sdk/capture/common/di/network/NetworkModule;", "", "()V", "provideInternalOnfidoNetworkInterceptorsProvider", "Lcom/onfido/android/sdk/capture/internal/network/InternalOnfidoNetworkInterceptorsProvider;", "provideInternalOnfidoNetworkInterceptorsProvider$onfido_capture_sdk_core_release", "provideJson", "Lkotlinx/serialization/json/Json;", "provideJson$onfido_capture_sdk_core_release", "provideLivenessIntroVideoAPI", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/intro/LivenessIntroVideoApi;", "retrofit", "Lretrofit2/Retrofit;", "provideLivenessIntroVideoAPI$onfido_capture_sdk_core_release", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "provider", "provideOkHttpClient$onfido_capture_sdk_core_release", "provideOnfidoAPI", "Lcom/onfido/api/client/OnfidoAPI;", "tokenProvider", "Lcom/onfido/android/sdk/capture/internal/token/OnfidoTokenProvider;", "onfidoFetcher", "Lcom/onfido/api/client/OnfidoFetcher;", "identityInteractor", "Lcom/onfido/android/sdk/capture/analytics/IdentityInteractor;", "json", "provideOnfidoAPI$onfido_capture_sdk_core_release", "provideOnfidoAnalyticsApi", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/OnfidoAnalyticsApi;", "provideOnfidoAnalyticsApi$onfido_capture_sdk_core_release", "provideOnfidoAssetsApi", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/OnfidoAssetsApi;", "provideOnfidoAssetsApi$onfido_capture_sdk_core_release", "provideOnfidoFetcher", "okHttpClient", "onfidoConfig", "Lcom/onfido/android/sdk/capture/OnfidoConfig;", "provideOnfidoFetcher$onfido_capture_sdk_core_release", "provideOnfidoLoggerApi", "Lcom/onfido/android/sdk/capture/internal/util/logging/network/OnfidoLoggerApi;", "provideOnfidoLoggerApi$onfido_capture_sdk_core_release", "providePerformanceAnalyticsApi", "Lcom/onfido/android/sdk/capture/internal/performance/repository/PerformanceAnalyticsApi;", "providePerformanceAnalyticsApi$onfido_capture_sdk_core_release", "provideProofOfAddressApi", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/network/ProofOfAddressApi;", "provideProofOfAddressApi$onfido_capture_sdk_core_release", "provideRetrofit", "provideRetrofit$onfido_capture_sdk_core_release", "provideSupportedDocumentsApi", "Lcom/onfido/android/sdk/capture/document/supported/data/remote/datasource/SupportedDocumentsApi;", "provideSupportedDocumentsApi$onfido_capture_sdk_core_release", "provideUserConsentApi", "Lcom/onfido/android/sdk/capture/ui/userconsent/network/UserConsentApi;", "provideUserConsentApi$onfido_capture_sdk_core_release", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NetworkModule {

    @NotNull
    public static final NetworkModule INSTANCE = new NetworkModule();

    private NetworkModule() {
    }

    @NotNull
    public final InternalOnfidoNetworkInterceptorsProvider provideInternalOnfidoNetworkInterceptorsProvider$onfido_capture_sdk_core_release() {
        return InternalOnfidoNetworkInterceptorsProvider.INSTANCE;
    }

    @NotNull
    public final Json provideJson$onfido_capture_sdk_core_release() {
        return e.f50133a;
    }

    @NotNull
    public final LivenessIntroVideoApi provideLivenessIntroVideoAPI$onfido_capture_sdk_core_release(@NotNull Retrofit retrofit) {
        return (LivenessIntroVideoApi) a.i(retrofit, "retrofit", LivenessIntroVideoApi.class, "create(...)");
    }

    @NotNull
    public final OkHttpClient provideOkHttpClient$onfido_capture_sdk_core_release(@NotNull InternalOnfidoNetworkInterceptorsProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        OkHttpClient.a aVar = new OkHttpClient.a();
        Iterator<T> it8 = provider.getInterceptors().iterator();
        while (it8.hasNext()) {
            aVar.a((Interceptor) it8.next());
        }
        return new OkHttpClient(aVar);
    }

    @NotNull
    public final OnfidoAPI provideOnfidoAPI$onfido_capture_sdk_core_release(@NotNull OnfidoTokenProvider tokenProvider, @NotNull OnfidoFetcher onfidoFetcher, @NotNull IdentityInteractor identityInteractor, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        Intrinsics.checkNotNullParameter(onfidoFetcher, "onfidoFetcher");
        Intrinsics.checkNotNullParameter(identityInteractor, "identityInteractor");
        Intrinsics.checkNotNullParameter(json, "json");
        return m.a(tokenProvider, onfidoFetcher, identityInteractor.getSdkSource$onfido_capture_sdk_core_release(), identityInteractor.getSdkVersion$onfido_capture_sdk_core_release(), json);
    }

    @NotNull
    public final OnfidoAnalyticsApi provideOnfidoAnalyticsApi$onfido_capture_sdk_core_release(@NotNull OnfidoFetcher onfidoFetcher) {
        Intrinsics.checkNotNullParameter(onfidoFetcher, "onfidoFetcher");
        return (OnfidoAnalyticsApi) onfidoFetcher.a(OnfidoAnalyticsApi.class);
    }

    @NotNull
    public final OnfidoAssetsApi provideOnfidoAssetsApi$onfido_capture_sdk_core_release(@NotNull OnfidoFetcher onfidoFetcher) {
        Intrinsics.checkNotNullParameter(onfidoFetcher, "onfidoFetcher");
        return (OnfidoAssetsApi) onfidoFetcher.a(OnfidoAssetsApi.class);
    }

    @NotNull
    public final OnfidoFetcher provideOnfidoFetcher$onfido_capture_sdk_core_release(@NotNull OkHttpClient okHttpClient, @NotNull OnfidoTokenProvider tokenProvider, @NotNull OnfidoConfig onfidoConfig, @NotNull IdentityInteractor identityInteractor, @NotNull Json json) {
        String baseUrl;
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        Intrinsics.checkNotNullParameter(onfidoConfig, "onfidoConfig");
        Intrinsics.checkNotNullParameter(identityInteractor, "identityInteractor");
        Intrinsics.checkNotNullParameter(json, "json");
        p pVar = OnfidoFetcher.Companion;
        InternalSDKToken internalSDKTokenProvideToken = tokenProvider.provideToken();
        dl.a aVar = internalSDKTokenProvideToken.f50155a;
        String tokenValue = internalSDKTokenProvideToken.getTokenValue();
        aVar.getClass();
        InternalSDKTokenPayload sDKTokenPayload = InternalSDKTokenPayload.parseSDKTokenPayload(tokenValue);
        String baseUrl2 = (sDKTokenPayload == null || (baseUrl = sDKTokenPayload.getBaseUrl()) == null || baseUrl.length() == 0) ? "https://api.onfido.com" : sDKTokenPayload.getBaseUrl();
        Intrinsics.checkNotNullExpressionValue(baseUrl2, "createApiUrl(...)");
        String[] apiCertificatePinningPKHashes = onfidoConfig.getApiCertificatePinningPKHashes();
        String sdkVersion = identityInteractor.getSdkVersion$onfido_capture_sdk_core_release();
        String sdkVariant = identityInteractor.getSdkVariant$onfido_capture_sdk_core_release();
        String sdkWrapperPlatform = identityInteractor.getWrapperSdkPlatform$onfido_capture_sdk_core_release();
        String sdkWrapperVersion = identityInteractor.getWrapperSdkVersion$onfido_capture_sdk_core_release();
        pVar.getClass();
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        Intrinsics.checkNotNullParameter(baseUrl2, "baseUrl");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(sdkVariant, "sdkVariant");
        Intrinsics.checkNotNullParameter(sdkWrapperPlatform, "sdkWrapperPlatform");
        Intrinsics.checkNotNullParameter(sdkWrapperVersion, "sdkWrapperVersion");
        Intrinsics.checkNotNullParameter(json, "json");
        return new OnfidoFetcher(okHttpClient, tokenProvider, baseUrl2, apiCertificatePinningPKHashes, sdkVersion, sdkVariant, sdkWrapperPlatform, sdkWrapperVersion, json);
    }

    @NotNull
    public final OnfidoLoggerApi provideOnfidoLoggerApi$onfido_capture_sdk_core_release(@NotNull OnfidoFetcher onfidoFetcher) {
        Intrinsics.checkNotNullParameter(onfidoFetcher, "onfidoFetcher");
        return (OnfidoLoggerApi) onfidoFetcher.a(OnfidoLoggerApi.class);
    }

    @NotNull
    public final PerformanceAnalyticsApi providePerformanceAnalyticsApi$onfido_capture_sdk_core_release(@NotNull OnfidoFetcher onfidoFetcher) {
        Intrinsics.checkNotNullParameter(onfidoFetcher, "onfidoFetcher");
        return (PerformanceAnalyticsApi) onfidoFetcher.a(PerformanceAnalyticsApi.class);
    }

    @NotNull
    public final ProofOfAddressApi provideProofOfAddressApi$onfido_capture_sdk_core_release(@NotNull OnfidoFetcher onfidoFetcher) {
        Intrinsics.checkNotNullParameter(onfidoFetcher, "onfidoFetcher");
        return (ProofOfAddressApi) onfidoFetcher.a(ProofOfAddressApi.class);
    }

    @NotNull
    public final Retrofit provideRetrofit$onfido_capture_sdk_core_release(@NotNull OkHttpClient okHttpClient, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(json, "json");
        lmm.e eVar = new lmm.e(0);
        b bVar = b.BASIC;
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        eVar.d = bVar;
        OkHttpClient.a aVarA = okHttpClient.a();
        aVarA.a(eVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVarA.d(5000L, timeUnit);
        aVarA.f(5000L, timeUnit);
        aVarA.h(5000L, timeUnit);
        aVarA.f = false;
        OkHttpClient okHttpClient2 = new OkHttpClient(aVarA);
        Retrofit.Builder builderAddCallAdapterFactory = new Retrofit.Builder().addCallAdapterFactory(RxJava3CallAdapterFactory.create());
        b1.Companion.getClass();
        Retrofit retrofitBuild = builderAddCallAdapterFactory.addConverterFactory(ek.b.a(json, a1.a("application/json"))).client(okHttpClient2).baseUrl("https://mock.base.url/").build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @NotNull
    public final SupportedDocumentsApi provideSupportedDocumentsApi$onfido_capture_sdk_core_release(@NotNull OnfidoFetcher onfidoFetcher) {
        Intrinsics.checkNotNullParameter(onfidoFetcher, "onfidoFetcher");
        return (SupportedDocumentsApi) onfidoFetcher.a(SupportedDocumentsApi.class);
    }

    @NotNull
    public final UserConsentApi provideUserConsentApi$onfido_capture_sdk_core_release(@NotNull OnfidoFetcher onfidoFetcher) {
        Intrinsics.checkNotNullParameter(onfidoFetcher, "onfidoFetcher");
        return (UserConsentApi) onfidoFetcher.a(UserConsentApi.class);
    }
}
