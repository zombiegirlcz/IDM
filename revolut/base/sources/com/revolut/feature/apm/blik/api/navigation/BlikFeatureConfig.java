package com.revolut.feature.apm.blik.api.navigation;

import com.revolut.feature.apm.blik.api.navigation.BlikFlowDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import xi0.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/blik/api/navigation/BlikFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "BlikCodeConfig", "BlikTransactionConfirmationConfig", "Lcom/revolut/feature/apm/blik/api/navigation/BlikFeatureConfig$BlikCodeConfig;", "Lcom/revolut/feature/apm/blik/api/navigation/BlikFeatureConfig$BlikTransactionConfirmationConfig;", "feature_apm_blik_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BlikFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/blik/api/navigation/BlikFeatureConfig$BlikTransactionConfirmationConfig;", "Lcom/revolut/feature/apm/blik/api/navigation/BlikFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_apm_blik_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BlikTransactionConfirmationConfig extends BlikFeatureConfig {
        public BlikTransactionConfirmationConfig() {
            this(0);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof BlikTransactionConfirmationConfig);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return 0;
        }

        public BlikTransactionConfirmationConfig(int i) {
            super(new BlikFlowDestination(new BlikFlowDestination.StartType.OpenBlikConfirmation(null)));
        }
    }

    public BlikFeatureConfig(BlikFlowDestination blikFlowDestination) {
        super((ActivityAnimation) null, (ParcelableDestination) blikFlowDestination, false, (Integer) null, 0, 45);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/blik/api/navigation/BlikFeatureConfig$BlikCodeConfig;", "Lcom/revolut/feature/apm/blik/api/navigation/BlikFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_apm_blik_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BlikCodeConfig extends BlikFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b f61646g;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public BlikCodeConfig() {
            this(b.k);
            b.Companion.getClass();
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BlikCodeConfig) && Intrinsics.f(this.f61646g, ((BlikCodeConfig) obj2).f61646g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f61646g.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BlikCodeConfig(b currency) {
            super(new BlikFlowDestination(new BlikFlowDestination.StartType.OpenBlikCode(currency)));
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f61646g = currency;
        }
    }
}
