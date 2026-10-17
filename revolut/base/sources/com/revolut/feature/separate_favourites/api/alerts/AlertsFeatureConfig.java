package com.revolut.feature.separate_favourites.api.alerts;

import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.SharedAlertsConfiguration;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.SharedAlertsDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/separate_favourites/api/alerts/AlertsFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "AlertsScreen", "Lcom/revolut/feature/separate_favourites/api/alerts/AlertsFeatureConfig$AlertsScreen;", "feature_separate_favourites_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AlertsFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/separate_favourites/api/alerts/AlertsFeatureConfig$AlertsScreen;", "Lcom/revolut/feature/separate_favourites/api/alerts/AlertsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_separate_favourites_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AlertsScreen extends AlertsFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SharedAlertsConfiguration f86004g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AlertsScreen(SharedAlertsConfiguration configuration) {
            super(null, new SharedAlertsDestination(configuration, true), false, null, 0, 52);
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f86004g = configuration;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF99934h() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: c */
        public final Integer getF89982h() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AlertsScreen) && Intrinsics.f(this.f86004g, ((AlertsScreen) obj2).f86004g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f86004g.hashCode() * 961;
        }
    }
}
