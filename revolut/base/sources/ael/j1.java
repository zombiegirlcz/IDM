package ael;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class j1 implements ybl.q {

    @NotNull
    public static final g1 Companion = new g1();
    public static final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set f3629g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.b f3630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.k f3631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f3632c;
    public final d4f.s d;
    public final ybl.d e;

    static {
        cfl.b bVar = cfl.b.CREATED;
        cfl.b bVar2 = cfl.b.ONBOARDING;
        cfl.b bVar3 = cfl.b.ACTIVE;
        cfl.b[] elements = {bVar, bVar2, bVar3, cfl.b.SUSPENDED, cfl.b.OFFBOARDING};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f = kotlin.collections.d.y0(elements);
        f3629g = zhm.y0.b(bVar3);
    }

    public j1(ybl.b instrumentTickerInteractor, ybl.k tradingAccountsInteractor, c1 wealthInstrumentOnboardingDetailsChecker, d4f.s featuresInteractor, ybl.d portfolioInteractor) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(wealthInstrumentOnboardingDetailsChecker, "wealthInstrumentOnboardingDetailsChecker");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        this.f3630a = instrumentTickerInteractor;
        this.f3631b = tradingAccountsInteractor;
        this.f3632c = wealthInstrumentOnboardingDetailsChecker;
        this.d = featuresInteractor;
        this.e = portfolioInteractor;
    }

    public static boolean b(TradingAccount tradingAccount) {
        Set set;
        if ((tradingAccount instanceof TradingAccount.GIA) || (tradingAccount instanceof TradingAccount.Margin) || (tradingAccount instanceof TradingAccount.MoneyMarketFunds) || (tradingAccount instanceof TradingAccount.Robo.Regular) || (tradingAccount instanceof TradingAccount.TaxAdvantage.Isa) || (tradingAccount instanceof TradingAccount.TaxAdvantage.Pea) || (tradingAccount instanceof TradingAccount.TaxAdvantage.Unknown) || (tradingAccount instanceof TradingAccount.PaperTrading) || (tradingAccount instanceof TradingAccount.Unknown)) {
            set = f;
        } else {
            if (!(tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa)) {
                throw new NoWhenBranchMatchedException();
            }
            set = f3629g;
        }
        return set.contains(tradingAccount.getD());
    }

    public final jhi.k c(Map map, w4l.k kVar) {
        ArrayList arrayListU = zhm.w.u(map.values());
        ArrayList arrayList = new ArrayList(zhm.w.t(arrayListU, 10));
        Iterator it8 = arrayListU.iterator();
        while (it8.hasNext()) {
            arrayList.add(((nel.y) it8.next()).f214637a.f214596b);
        }
        List listU = zhm.d0.U(arrayList);
        boolean zEquals = kVar.equals(w4l.i.f294643c);
        ybl.b bVar = this.f3630a;
        vkm.d dVarB = rd0.e.b(ue0.e.q(zEquals ? ybl.b.a(bVar, listU) : ((k) bVar).n(listU, kVar), zhm.h0.f322473a));
        Flow flowQ = vkm.q.q(ybl.k.k(this.f3631b, null, null, cfl.k.f23744a, 3));
        return nim.a.u(new a26.q(null, map, this), zh9.u0.m(zh9.u0.i(flowQ, boh.f.e(flowQ, new acb.f(this, map, 16)), dVarB), vkm.q.q(this.d.a(zhm.d0.i1(ybl.p.a())))));
    }
}
