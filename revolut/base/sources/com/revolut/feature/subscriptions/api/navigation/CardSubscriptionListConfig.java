package com.revolut.feature.subscriptions.api.navigation;

import b9e.d;
import com.revolut.feature.subscriptions.api.navigation.SubscriptionsFlowDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/api/navigation/CardSubscriptionListConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardSubscriptionListConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f89141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f89142h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardSubscriptionListConfig(String cardId, d action) {
        super((ActivityAnimation) null, (ParcelableDestination) new SubscriptionsFlowDestination(new SubscriptionsFlowDestination.StartType.CardSubscriptionList(cardId, action)), false, (Integer) null, 0, 52);
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f89141g = cardId;
        this.f89142h = action;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    /* JADX INFO: renamed from: a */
    public final ActivityAnimation getF87400g() {
        return null;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    /* JADX INFO: renamed from: c */
    public final Integer getF89980g() {
        return null;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardSubscriptionListConfig)) {
            return false;
        }
        CardSubscriptionListConfig cardSubscriptionListConfig = (CardSubscriptionListConfig) obj2;
        return Intrinsics.f(this.f89141g, cardSubscriptionListConfig.f89141g) && this.f89142h == cardSubscriptionListConfig.f89142h;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        return (this.f89142h.hashCode() + (this.f89141g.hashCode() * 31)) * 961;
    }
}
