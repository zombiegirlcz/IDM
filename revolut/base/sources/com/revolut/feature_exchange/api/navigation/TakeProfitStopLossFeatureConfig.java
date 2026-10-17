package com.revolut.feature_exchange.api.navigation;

import com.revolut.feature_exchange.api.models.TakeProfitStopLossParams;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_exchange/api/navigation/TakeProfitStopLossFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "TakeProfitStopLoss", "Lcom/revolut/feature_exchange/api/navigation/TakeProfitStopLossFeatureConfig$TakeProfitStopLoss;", "feature_exchange_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TakeProfitStopLossFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_exchange/api/navigation/TakeProfitStopLossFeatureConfig$TakeProfitStopLoss;", "Lcom/revolut/feature_exchange/api/navigation/TakeProfitStopLossFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_exchange_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TakeProfitStopLoss extends TakeProfitStopLossFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TakeProfitStopLossParams f96866g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Integer f96867h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TakeProfitStopLoss(TakeProfitStopLossParams params, Integer num) {
            super(null, new TakeProfitStopLossDestination(params), false, null, 0, 44);
            Intrinsics.checkNotNullParameter(params, "params");
            this.f96866g = params;
            this.f96867h = num;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF98953g() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getF96867h() {
            return this.f96867h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TakeProfitStopLoss)) {
                return false;
            }
            TakeProfitStopLoss takeProfitStopLoss = (TakeProfitStopLoss) obj2;
            return Intrinsics.f(this.f96866g, takeProfitStopLoss.f96866g) && Intrinsics.f(this.f96867h, takeProfitStopLoss.f96867h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f96866g.hashCode() * 31;
            Integer num = this.f96867h;
            return (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        }
    }
}
