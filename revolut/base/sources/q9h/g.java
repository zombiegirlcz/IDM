package q9h;

import com.revolut.feature.wealth.api.declaration.MostTradedAssetsFeatureConfig;
import com.revolut.feature.wealth_discovery.api.CollectionUIApi$Toggles$MostTradedKompotMigration;
import com.revolut.feature.wealth_discovery.api.declaration.collection.MostTradedAssetsDestination;
import com.revolut.kompot.common.StackDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k39.b f243904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f243905b;

    public g(k39.b navigationCommandsDispatcher, sgh.a navigationProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f243904a = navigationCommandsDispatcher;
        this.f243905b = featureToggleInteractor;
    }

    public final efm.b a(q0h.e assetType) {
        FeatureConfig trading;
        StackDestination stocks;
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        if (((jte.d) this.f243905b).c(CollectionUIApi$Toggles$MostTradedKompotMigration.f96090c)) {
            int i = e.f243902a[assetType.ordinal()];
            if (i == 1) {
                stocks = new MostTradedAssetsDestination.Stocks(0);
            } else if (i == 2) {
                stocks = new MostTradedAssetsDestination.Cfd(0);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                stocks = new MostTradedAssetsDestination.Crypto((wnh.b) null, (wnh.a) null, 7);
            }
            trading = u0.d(stocks);
        } else {
            int i2 = e.f243902a[assetType.ordinal()];
            if (i2 == 1) {
                trading = new MostTradedAssetsFeatureConfig.Trading(0);
            } else if (i2 == 2) {
                trading = new MostTradedAssetsFeatureConfig.Cfd(0);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                trading = new MostTradedAssetsFeatureConfig.Crypto((mzg.c) null, (mzg.b) null, 7);
            }
        }
        return this.f243904a.a(new FeatureCommand(trading));
    }
}
