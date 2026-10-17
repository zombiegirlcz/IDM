package com.revolut.feature.separate_favourites.api.converter;

import com.revolut.feature.shared_separate_favourites.api.converter.navigation.SharedConverterDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.retail.core.navigation.ActivityAnimation;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/separate_favourites/api/converter/ConverterFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "ConverterScreen", "Lcom/revolut/feature/separate_favourites/api/converter/ConverterFeatureConfig$ConverterScreen;", "feature_separate_favourites_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ConverterFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/separate_favourites/api/converter/ConverterFeatureConfig$ConverterScreen;", "Lcom/revolut/feature/separate_favourites/api/converter/ConverterFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_separate_favourites_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConverterScreen extends ConverterFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Set f86015g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final SharedConverterDestination.Configuration.Action f86016h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConverterScreen(int i, Set convertibleAssets) {
            super(null, new SharedConverterDestination(new SharedConverterDestination.Configuration(convertibleAssets, null)), false, null, 0, 52);
            Intrinsics.checkNotNullParameter(convertibleAssets, "convertibleAssets");
            this.f86015g = convertibleAssets;
            this.f86016h = null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF78199g() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: c */
        public final Integer getD() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ConverterScreen)) {
                return false;
            }
            ConverterScreen converterScreen = (ConverterScreen) obj2;
            return Intrinsics.f(this.f86015g, converterScreen.f86015g) && Intrinsics.f(this.f86016h, converterScreen.f86016h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f86015g.hashCode() * 31;
            SharedConverterDestination.Configuration.Action action = this.f86016h;
            return (iHashCode + (action == null ? 0 : action.hashCode())) * 961;
        }
    }
}
