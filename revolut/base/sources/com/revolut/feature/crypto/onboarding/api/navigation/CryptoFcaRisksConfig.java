package com.revolut.feature.crypto.onboarding.api.navigation;

import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoFcaRisksDestination;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/onboarding/api/navigation/CryptoFcaRisksConfig;", "Lcom/revolut/feature/crypto/onboarding/api/navigation/CryptoOnboardingKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_crypto_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoFcaRisksConfig extends CryptoOnboardingKompotFeatureConfig {
    public CryptoFcaRisksConfig() {
        super(null, new CryptoFcaRisksDestination(null), false, null, 0, 44);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof CryptoFcaRisksConfig);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        return 0;
    }
}
