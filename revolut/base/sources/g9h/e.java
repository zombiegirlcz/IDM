package g9h;

import com.revolut.feature.wealth_discovery.api.ScreenerApi$Toggles$InvestTopMoversScreenerRedesign;
import com.revolut.feature.wealth_discovery.api.declaration.ScreenerTopMoversDestination;
import com.revolut.feature.wealth_discovery.api.declaration.collection.TopMoversDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import xzg.l0;
import xzg.n0;
import zel.k;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f141875a;

    public e(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f141875a = featureToggleInteractor;
    }

    public final FeatureCommand a(l0 timeSpan, n0 filter) {
        wnh.e eVar;
        wnh.d dVar;
        k kVar;
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(filter, "filter");
        if (((jte.d) this.f141875a).c(ScreenerApi$Toggles$InvestTopMoversScreenerRedesign.f96095c)) {
            zel.f fVar = zel.f.STOCKS;
            int i = d.f141873a[filter.ordinal()];
            if (i == 1) {
                kVar = null;
            } else if (i == 2) {
                kVar = k.TOP_GAINERS;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                kVar = k.TOP_LOSERS;
            }
            return u0.f(new ScreenerTopMoversDestination(fVar, kVar));
        }
        int i2 = d.f141874b[timeSpan.ordinal()];
        if (i2 == 1) {
            eVar = wnh.e.ONE_DAY;
        } else if (i2 == 2) {
            eVar = wnh.e.ONE_WEEK;
        } else if (i2 == 3) {
            eVar = wnh.e.ONE_MONTH;
        } else if (i2 == 4) {
            eVar = wnh.e.ONE_YEAR;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            eVar = wnh.e.FIVE_YEARS;
        }
        int i3 = d.f141873a[filter.ordinal()];
        if (i3 == 1) {
            dVar = wnh.d.ALL;
        } else if (i3 == 2) {
            dVar = wnh.d.GAINERS;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = wnh.d.LOSERS;
        }
        return u0.f(new TopMoversDestination.Trading(eVar, dVar));
    }
}
