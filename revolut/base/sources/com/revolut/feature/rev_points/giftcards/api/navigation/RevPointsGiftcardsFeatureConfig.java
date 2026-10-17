package com.revolut.feature.rev_points.giftcards.api.navigation;

import com.revolut.feature.rev_points.giftcards.api.navigation.RevPointsGiftcardsDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "RevPointsGiftcardsHome", "Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsFeatureConfig$RevPointsGiftcardsHome;", "feature_rev_points_giftcards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsGiftcardsFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsFeatureConfig$RevPointsGiftcardsHome;", "Lcom/revolut/feature/rev_points/giftcards/api/navigation/RevPointsGiftcardsFeatureConfig;", "feature_rev_points_giftcards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsGiftcardsHome extends RevPointsGiftcardsFeatureConfig {
        public RevPointsGiftcardsHome() {
            this(false);
        }

        public RevPointsGiftcardsHome(boolean z) {
            super(null, new RevPointsGiftcardsDestination(new RevPointsGiftcardsDestination.StartType.OpenGiftcardsHome(new RevPointsGiftcardsDestination.GiftcardsHomePagerItem.Discover(z)), null), false, null, 0, 61);
        }
    }
}
