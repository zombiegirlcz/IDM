package com.revolut.feature.subscriptions.impl.label;

import com.revolut.feature.subscriptions.api.navigation.SubscriptionsFlowDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/label/SubscriptionLabelFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubscriptionLabelFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f89205g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionLabelFeatureConfig(p subscription) {
        super((ActivityAnimation) null, (ParcelableDestination) new SubscriptionsFlowDestination(new SubscriptionsFlowDestination.StartType.ChangeSubscriptionLabel(subscription)), false, (Integer) null, 0, 52);
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f89205g = subscription;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    /* JADX INFO: renamed from: a */
    public final ActivityAnimation getF101813h() {
        return null;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    /* JADX INFO: renamed from: c */
    public final Integer getF66060h() {
        return null;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SubscriptionLabelFeatureConfig) && Intrinsics.f(this.f89205g, ((SubscriptionLabelFeatureConfig) obj2).f89205g);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        return this.f89205g.hashCode() * 961;
    }
}
