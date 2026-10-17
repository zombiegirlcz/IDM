package q4h;

import com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig;
import com.revolut.feature.wealth.assetdetails.ui.impl.investments.screen.InvestmentsDestination;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import pkf.x;
import vkm.q;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends h3h.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h3h.e f242163l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c4h.b f242164m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c4h.c f242165n;
    public final h3h.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vki.a f242166p;

    public d(h3h.e inputData, c4h.b investmentsInteractor, c4h.c stockOnboardingInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(investmentsInteractor, "investmentsInteractor");
        Intrinsics.checkNotNullParameter(stockOnboardingInteractor, "stockOnboardingInteractor");
        this.f242163l = inputData;
        this.f242164m = investmentsInteractor;
        this.f242165n = stockOnboardingInteractor;
        h3h.d dVar = new h3h.d(null);
        this.o = dVar;
        this.f242166p = pyd.c.a(this, dVar);
    }

    @Override // yji.n
    public final void H2() {
        n.l2(this, q.Q(this.f242165n.a(), new x(null, this, 23)), null, null, 7);
    }

    @Override // h3h.b
    public final void Z2(TradingAccount tradingAccount, String ref2) {
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        String string = com.revolut.shared.feature.wealth.models.trading_accounts.d.l(tradingAccount).f105210a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        A2(new CfdTradingFeatureConfig.CfdPositionsDestination(ref2, string, null, false));
    }

    @Override // h3h.b
    public final void b3(UUID tradingAccountId, String ref2) {
        Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        B2(new InvestmentsDestination(new InvestmentsDestination.InputData(ref2, tradingAccountId, this.f242163l.f149128b)));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f242166p;
    }
}
