package uah;

import android.content.Context;
import com.revolut.feature.wealth.api.declaration.TopMoversFeatureConfig;
import com.revolut.feature.wealth_discovery.api.declaration.collection.TopMoversDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import g9h.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mzg.f;
import sri.m;
import wnh.d;
import xzg.l0;
import xzg.n0;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements uri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f278661a;

    public b(e topMoversDestinationProvider) {
        Intrinsics.checkNotNullParameter(topMoversDestinationProvider, "topMoversDestinationProvider");
        this.f278661a = topMoversDestinationProvider;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof TopMoversFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        l0 l0Var;
        n0 n0Var;
        wnh.e eVar;
        d dVar;
        FeatureCommand featureCommandF;
        TopMoversFeatureConfig config = (TopMoversFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        f f95215a = config.getF95215a();
        Intrinsics.checkNotNullParameter(f95215a, "<this>");
        int i = a.f278659b[f95215a.ordinal()];
        if (i == 1) {
            l0Var = l0.ONE_DAY;
        } else if (i == 2) {
            l0Var = l0.ONE_WEEK;
        } else if (i == 3) {
            l0Var = l0.ONE_MONTH;
        } else if (i == 4) {
            l0Var = l0.ONE_YEAR;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            l0Var = l0.FIVE_YEARS;
        }
        mzg.e f95216b = config.getF95216b();
        Intrinsics.checkNotNullParameter(f95216b, "<this>");
        int i2 = a.f278658a[f95216b.ordinal()];
        if (i2 == 1) {
            n0Var = n0.ALL;
        } else if (i2 == 2) {
            n0Var = n0.GAINERS;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            n0Var = n0.LOSERS;
        }
        if (config instanceof TopMoversFeatureConfig.TradingTopMovers) {
            featureCommandF = this.f278661a.a(l0Var, n0Var);
        } else {
            if (!(config instanceof TopMoversFeatureConfig.CryptoTopMovers)) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = a.d[l0Var.ordinal()];
            if (i3 == 1) {
                eVar = wnh.e.ONE_DAY;
            } else if (i3 == 2) {
                eVar = wnh.e.ONE_WEEK;
            } else if (i3 == 3) {
                eVar = wnh.e.ONE_MONTH;
            } else if (i3 == 4) {
                eVar = wnh.e.ONE_YEAR;
            } else {
                if (i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar = wnh.e.FIVE_YEARS;
            }
            int i5 = a.f278660c[n0Var.ordinal()];
            if (i5 == 1) {
                dVar = d.ALL;
            } else if (i5 == 2) {
                dVar = d.GAINERS;
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = d.LOSERS;
            }
            featureCommandF = u0.f(new TopMoversDestination.Crypto(eVar, dVar, ((TopMoversFeatureConfig.CryptoTopMovers) config).f95214c));
        }
        navigator.c(featureCommandF);
    }
}
