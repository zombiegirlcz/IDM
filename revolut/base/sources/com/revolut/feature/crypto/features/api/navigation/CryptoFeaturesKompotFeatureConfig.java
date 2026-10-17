package com.revolut.feature.crypto.features.api.navigation;

import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import gg5.a;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/features/api/navigation/CryptoFeaturesKompotFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_crypto_features_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoFeaturesKompotFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f70850g;

    public CryptoFeaturesKompotFeatureConfig() {
        this(null);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CryptoFeaturesKompotFeatureConfig) && this.f70850g == ((CryptoFeaturesKompotFeatureConfig) obj2).f70850g;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        a aVar = this.f70850g;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public CryptoFeaturesKompotFeatureConfig(a aVar) {
        super((ActivityAnimation) null, (ParcelableDestination) new CryptoFeaturesDestination(aVar), false, (Integer) null, 0, 44);
        this.f70850g = aVar;
    }
}
