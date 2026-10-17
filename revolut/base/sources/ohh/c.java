package ohh;

import ael.y;
import akg.n;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import i5f.g;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import t1h.i;
import w4l.h;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.d f225369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f225370b;

    public c(ybl.d portfolioInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f225369a = portfolioInteractor;
        this.f225370b = featureToggleInteractor;
    }

    @Override // t1h.i
    public final n a(String portfolioId, xi0.b currency) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return nim.a.v(((y) this.f225369a).e(portfolioId, h.f294642c), new g(28, currency));
    }

    @Override // t1h.i
    public final go.g b() {
        FeatureWealthApi$Toggles.CommoditiesMoveMoney commoditiesMoveMoney = FeatureWealthApi$Toggles.CommoditiesMoveMoney.f95156c;
        jte.d dVar = (jte.d) this.f225370b;
        Set setB = l1h.a.b(dVar.c(commoditiesMoveMoney), dVar.c(FeatureWealthApi$Toggles.InvestIsaMoveMoneyInvest.f95159c), false);
        od0.i.Companion.getClass();
        return zi0.c.i(od0.h.a(setB));
    }

    @Override // t1h.i
    public final Flow c(xi0.b sourceCurrency, f0h.a withdrawTarget) {
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(withdrawTarget, "withdrawTarget");
        if (withdrawTarget != null) {
            return zi0.c.i(new t1h.h(12, new dj0.d(1L, sourceCurrency), true));
        }
        throw new NoWhenBranchMatchedException();
    }
}
