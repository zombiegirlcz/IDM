package com.revolut.feature.crypto.strategies.api.navigation;

import com.revolut.feature.crypto.strategies.api.navigation.destinations.CryptoStrategiesDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.retail.core.R$anim;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/strategies/api/navigation/CryptoStrategiesKompotFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "CryptoStrategies", "Lcom/revolut/feature/crypto/strategies/api/navigation/CryptoStrategiesKompotFeatureConfig$CryptoStrategies;", "feature_crypto_strategies_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CryptoStrategiesKompotFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/strategies/api/navigation/CryptoStrategiesKompotFeatureConfig$CryptoStrategies;", "Lcom/revolut/feature/crypto/strategies/api/navigation/CryptoStrategiesKompotFeatureConfig;", "<init>", "()V", "feature_crypto_strategies_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CryptoStrategies extends CryptoStrategiesKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final CryptoStrategies f70998g = new CryptoStrategies();

        private CryptoStrategies() {
            super(new ActivityAnimation.System(Integer.valueOf(R$anim.slide_in_end), Integer.valueOf(R$anim.no_animation)), CryptoStrategiesDestination.f70999a, false, null, 0, 44);
        }
    }
}
