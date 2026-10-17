package com.onfido.android.sdk.capture.ui.camera.liveness.challenges;

import com.onfido.android.sdk.capture.network.OnfidoApiService;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class LivenessChallengesRepository_Factory implements b {
    private final Provider livenessChallengesTransformerProvider;
    private final Provider onfidoAPIProvider;

    public LivenessChallengesRepository_Factory(Provider provider, Provider provider2) {
        this.onfidoAPIProvider = provider;
        this.livenessChallengesTransformerProvider = provider2;
    }

    public static LivenessChallengesRepository_Factory create(Provider provider, Provider provider2) {
        return new LivenessChallengesRepository_Factory(provider, provider2);
    }

    public static LivenessChallengesRepository newInstance(OnfidoApiService onfidoApiService, LivenessChallengesTransformer livenessChallengesTransformer) {
        return new LivenessChallengesRepository(onfidoApiService, livenessChallengesTransformer);
    }

    @Override // com.onfido.javax.inject.Provider
    public LivenessChallengesRepository get() {
        return newInstance((OnfidoApiService) this.onfidoAPIProvider.get(), (LivenessChallengesTransformer) this.livenessChallengesTransformerProvider.get());
    }
}
