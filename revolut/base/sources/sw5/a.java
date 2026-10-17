package sw5;

import android.content.Context;
import com.revolut.feature.cryptocommodity_invest.api.CryptoCommodityInvestApi$Toggles;
import com.revolut.feature.cryptocommodity_invest.api.CryptoCommodityInvestFeatureConfig;
import com.revolut.feature.cryptocommodity_invest.api.CryptoInvestFeatureConfig;
import com.revolut.feature.cryptocommodity_invest.api.navigation.CryptoCommodityInvestBizFeatureConfig;
import com.revolut.feature.cryptocommodity_invest.api.navigation.CryptoTradeDestination;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.CryptoCommodityDiscoverAllContract$Configuration;
import com.revolut.feature.mainscreen.api.R$string;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import jte.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import vx5.b;
import vx5.c;
import vx5.j;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements uri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f266109a;

    public a(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f266109a = featureToggleInteractor;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof CryptoCommodityInvestFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        NaviCommand featureCommand;
        int i;
        CryptoCommodityInvestFeatureConfig config = (CryptoCommodityInvestFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof CryptoInvestFeatureConfig.Invest) {
            featureCommand = u0.f(new CryptoTradeDestination(null, null, 3));
        } else if (config instanceof CryptoInvestFeatureConfig.AllCrypto) {
            if (((d) this.f266109a).c(CryptoCommodityInvestApi$Toggles.CryptoDiscoverAllKompotMigration.f71494c)) {
                featureCommand = new FeatureCommand(new CryptoCommodityInvestBizFeatureConfig.DiscoverAllKompot(0));
            } else {
                c cVar = j.Companion;
                zx5.a currencyMode = zx5.a.CRYPTO;
                cVar.getClass();
                Intrinsics.checkNotNullParameter("CRYPTO_INVEST_FLOW", "flowName");
                Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
                ExplicitActivityDestination explicitActivityDestination = c.f292816b;
                int i2 = b.f292814a[currencyMode.ordinal()];
                if (i2 == 1) {
                    i = R$string.crypto_discovery_all_crypto;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = com.revolut.retail.wealth.resources.R$string.wealth_plan_action_invest;
                }
                featureCommand = new ActivityNavigateCommand(explicitActivityDestination, new CryptoCommodityDiscoverAllContract$Configuration("CRYPTO_INVEST_FLOW", currencyMode, i), null, null, 0, null, null, null, null, false, 1020);
            }
        } else if (config instanceof CryptoInvestFeatureConfig.CollectionDetails) {
            featureCommand = new FeatureCommand(new CryptoCommodityInvestBizFeatureConfig.CollectionDetails(((CryptoInvestFeatureConfig.CollectionDetails) config).f71498a));
        } else {
            if (!(config instanceof CryptoInvestFeatureConfig.CollectionsHome)) {
                throw new NoWhenBranchMatchedException();
            }
            featureCommand = new FeatureCommand(new CryptoCommodityInvestBizFeatureConfig.OverviewCollections(0));
        }
        navigator.c(featureCommand);
    }
}
