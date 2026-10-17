package com.revolut.feature.staking.api.navigation;

import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.staking.api.navigation.destination.StakeFeatureDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/staking/api/navigation/StakingKompotFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "Stake", "Lcom/revolut/feature/staking/api/navigation/StakingKompotFeatureConfig$Stake;", "feature_staking_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StakingKompotFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/staking/api/navigation/StakingKompotFeatureConfig$Stake;", "Lcom/revolut/feature/staking/api/navigation/StakingKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_staking_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Stake extends StakingKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f88093g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final StakingProduct f88094h;
        public final StakingPocket i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Stake(String str, StakingProduct stakingProduct, StakingPocket stakingPocket) {
            super(null, new StakeFeatureDestination(str, stakingProduct, stakingPocket), false, null, 0, 44);
            Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
            this.f88093g = str;
            this.f88094h = stakingProduct;
            this.i = stakingPocket;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF75028j() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Stake)) {
                return false;
            }
            Stake stake = (Stake) obj2;
            return Intrinsics.f(this.f88093g, stake.f88093g) && Intrinsics.f(this.f88094h, stake.f88094h) && Intrinsics.f(this.i, stake.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            String str = this.f88093g;
            int iHashCode = (this.f88094h.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
            StakingPocket stakingPocket = this.i;
            return (iHashCode + (stakingPocket != null ? stakingPocket.hashCode() : 0)) * 31;
        }
    }
}
