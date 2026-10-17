package com.revolut.feature.separate_favourites.api.alerts;

import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.AddSharedAlertsConfiguration;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.AddSharedAlertsDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/separate_favourites/api/alerts/AddAlertFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "AddAlertScreen", "Lcom/revolut/feature/separate_favourites/api/alerts/AddAlertFeatureConfig$AddAlertScreen;", "feature_separate_favourites_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AddAlertFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/separate_favourites/api/alerts/AddAlertFeatureConfig$AddAlertScreen;", "Lcom/revolut/feature/separate_favourites/api/alerts/AddAlertFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_separate_favourites_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddAlertScreen extends AddAlertFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AddSharedAlertsConfiguration f86002g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddAlertScreen(AddSharedAlertsConfiguration configuration) {
            super(null, new AddSharedAlertsDestination(configuration), false, null, 0, 52);
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f86002g = configuration;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF99934h() {
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
            return (obj2 instanceof AddAlertScreen) && Intrinsics.f(this.f86002g, ((AddAlertScreen) obj2).f86002g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f86002g.hashCode() * 961;
        }
    }
}
