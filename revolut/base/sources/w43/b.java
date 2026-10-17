package w43;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.data.network.models.recurringpayment.BlockUnblockSubscriptionRequest;
import com.revolut.data.network.services.RecurringPaymentService;
import com.revolut.feature.atm.api.model.AtmLocation;
import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodInputData;
import com.revolut.feature.rev_points.api.navigation.RevPointsOptInDestination;
import com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination;
import com.revolut.feature.rev_points.api.navigation.descriptor.LifestyleRevPointsOptInController$InputData;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.robo.api.RoboApi$Toggles;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.api.domain.model.balance.WealthAccountBalance;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import d9.e1;
import efm.d0;
import efm.k;
import efm.r;
import h93.f0;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m1c.r0;
import rfm.m;
import skm.p0;
import t9f.n;
import te0.w;
import vkm.j2;
import wg9.p;
import x03.q;
import x8h.q0;
import x8h.t0;
import yj2.l;
import yrb.s;
import yrb.u;
import yrb.x;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f294492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f294493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f294494c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj2, Object obj3, Object obj4, boolean z, int i) {
        this.f294492a = i;
        this.f294494c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f294493b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Flow flowD;
        BigDecimal bigDecimalY;
        int iIntValue;
        switch (this.f294492a) {
            case 0:
                SelectPaymentMethodInputData.UseCase useCase = (SelectPaymentMethodInputData.UseCase) this.f294494c;
                i iVar = (i) this.d;
                xi0.b bVar = (xi0.b) this.e;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                r rVarX = w.o0(p0.f264003c, new g(useCase, iVar, bVar, (List) pair.f186385a, (List) pair.f186386b, this.f294493b, null)).x();
                Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                return rVarX;
            case 1:
                q qVar = (q) this.f294494c;
                wy2.d dVar = (wy2.d) this.d;
                x03.b bVar2 = (x03.b) this.e;
                f0 card = (f0) obj2;
                Intrinsics.checkNotNullParameter(card, "card");
                String str = card.u;
                k kVarFirstElement = rd0.e.c(qVar.f301481a.c(), kotlin.coroutines.g.f186406a).firstElement();
                wx9.b bVar3 = new wx9.b(new wsg.j(str, 8), 17);
                kVarFirstElement.getClass();
                rfm.f0 f0VarP = new m(kVarFirstElement, bVar3, 1).p(new Data(AccountId.Personal.f51414a, null, false, 6, null));
                Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                return new pfm.a(new ufm.i(new ufm.i(zi0.c.s(f0VarP), new wx9.b(new wwa.a(qVar, card, 15), 21), 0), new wx9.b(new p(dVar, qVar, bVar2, card, 4), 22), 0), new wx9.b(new n(this.f294493b, qVar, 14), 23), 4);
            case 2:
                Function1 function1 = (Function1) this.f294494c;
                final t0 t0Var = (t0) this.d;
                final n9l.b bVar4 = (n9l.b) this.e;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list = (List) pair2.f186385a;
                xi0.b bVar5 = (xi0.b) pair2.f186386b;
                ArrayList<WealthAccount> arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (((Boolean) function1.invoke((WealthAccount) obj3)).booleanValue()) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                for (WealthAccount wealthAccount : arrayList) {
                    if (wealthAccount instanceof WealthAccount.Commodities) {
                        final int i = 0;
                        Function2 function2 = new Function2() { // from class: x8h.r0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Flow eVar;
                                switch (i) {
                                    case 0:
                                        xi0.b displayCurrency = (xi0.b) obj5;
                                        Intrinsics.checkNotNullParameter((WealthAccount.Commodities) obj4, "<unused var>");
                                        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
                                        return nim.a.w(hb9.b.w(ue0.e.p(t0Var.f303389c.y(displayCurrency, bVar4), zhm.h0.f322473a), displayCurrency), new h(20));
                                    case 1:
                                        WealthAccount.Margin account = (WealthAccount.Margin) obj4;
                                        xi0.b displayCurrency2 = (xi0.b) obj5;
                                        Intrinsics.checkNotNullParameter(account, "account");
                                        Intrinsics.checkNotNullParameter(displayCurrency2, "displayCurrency");
                                        t0 t0Var2 = t0Var;
                                        t0Var2.getClass();
                                        String str2 = account.f95234c;
                                        if (str2 == null) {
                                            efm.r rVarJust = efm.r.just(new Data(t0.b(displayCurrency2), null, false, 6, null));
                                            Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                                            return rVarJust;
                                        }
                                        efm.r rVarR = pd.b.r(rd0.e.c(vkm.q.q(nim.a.v(((ael.y) t0Var2.e).e(str2, w4l.h.f294642c), new h(21))), kotlin.coroutines.g.f186406a), new wg9.p(t0Var2, str2, displayCurrency2, bVar4, 6));
                                        zhm.h0 h0Var = zhm.h0.f322473a;
                                        return ue0.e.H(ue0.e.p(rVarR, h0Var), h0Var, new x52.a(t0Var2, displayCurrency2, 11));
                                    default:
                                        WealthAccount.Robo account2 = (WealthAccount.Robo) obj4;
                                        xi0.b targetCurrency = (xi0.b) obj5;
                                        Intrinsics.checkNotNullParameter(account2, "account");
                                        Intrinsics.checkNotNullParameter(targetCurrency, "displayCurrency");
                                        l0 l0Var = t0Var.f303390g;
                                        List list2 = account2.f95237c;
                                        ArrayList arrayList3 = new ArrayList();
                                        for (Object obj6 : list2) {
                                            if (zhm.v.k(com.revolut.shared.feature.wealth.models.trading_accounts.a.ACTIVE, com.revolut.shared.feature.wealth.models.trading_accounts.a.SUSPENDED, com.revolut.shared.feature.wealth.models.trading_accounts.a.OFFBOARDING).contains(((TradingAccount.Portfolio) obj6).f105211b)) {
                                                arrayList3.add(obj6);
                                            }
                                        }
                                        ArrayList<String> portfolioIds = new ArrayList(zhm.w.t(arrayList3, 10));
                                        Iterator it8 = arrayList3.iterator();
                                        while (it8.hasNext()) {
                                            portfolioIds.add(((TradingAccount.Portfolio) it8.next()).f105210a.toString());
                                        }
                                        Intrinsics.checkNotNullParameter(portfolioIds, "portfolioIds");
                                        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
                                        n9l.b ratesUpdatePeriod = bVar4;
                                        Intrinsics.checkNotNullParameter(ratesUpdatePeriod, "ratesUpdatePeriod");
                                        if (portfolioIds.isEmpty()) {
                                            eVar = zi0.c.i(new WealthAccountBalance(new dj0.d(0L, targetCurrency), new dj0.d(0L, targetCurrency)));
                                        } else {
                                            ArrayList arrayList4 = new ArrayList(zhm.w.t(portfolioIds, 10));
                                            for (String str3 : portfolioIds) {
                                                arrayList4.add(nim.a.v(rd0.e.b(ael.t.d(l0Var.f303359b, str3, false, ratesUpdatePeriod, targetCurrency, true, null, 32)), new wsg.j(str3, 18)));
                                            }
                                            j23.b bVarK = zh9.u0.k(arrayList4);
                                            eVar = ((jte.d) l0Var.f303358a).c(RoboApi$Toggles.RoboUkBePerformanceCalculation.f85025c) ? new t38.e(bVarK, 24, new vkm.y(new vkm.y(new wda.l(2, 9, null), nim.a.A(rd0.e.n(l0Var.f303360c.f(portfolioIds, targetCurrency), zhm.h0.f322473a), new h(15))), new v77.c(3, 9, null)), new wvg.i(l0Var, null, 14)) : nim.a.v(bVarK, new d(l0Var, 13));
                                        }
                                        return ue0.e.E(rd0.e.c(eVar, kotlin.coroutines.g.f186406a), zi0.c.P(t0.b(targetCurrency), false, null, 3));
                                }
                            }
                        };
                        t0Var.getClass();
                        flowD = t0.d(wealthAccount, bVar5, function2);
                    } else if (wealthAccount instanceof WealthAccount.Margin) {
                        final int i2 = 1;
                        Function2 function22 = new Function2() { // from class: x8h.r0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Flow eVar;
                                switch (i2) {
                                    case 0:
                                        xi0.b displayCurrency = (xi0.b) obj5;
                                        Intrinsics.checkNotNullParameter((WealthAccount.Commodities) obj4, "<unused var>");
                                        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
                                        return nim.a.w(hb9.b.w(ue0.e.p(t0Var.f303389c.y(displayCurrency, bVar4), zhm.h0.f322473a), displayCurrency), new h(20));
                                    case 1:
                                        WealthAccount.Margin account = (WealthAccount.Margin) obj4;
                                        xi0.b displayCurrency2 = (xi0.b) obj5;
                                        Intrinsics.checkNotNullParameter(account, "account");
                                        Intrinsics.checkNotNullParameter(displayCurrency2, "displayCurrency");
                                        t0 t0Var2 = t0Var;
                                        t0Var2.getClass();
                                        String str2 = account.f95234c;
                                        if (str2 == null) {
                                            efm.r rVarJust = efm.r.just(new Data(t0.b(displayCurrency2), null, false, 6, null));
                                            Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                                            return rVarJust;
                                        }
                                        efm.r rVarR = pd.b.r(rd0.e.c(vkm.q.q(nim.a.v(((ael.y) t0Var2.e).e(str2, w4l.h.f294642c), new h(21))), kotlin.coroutines.g.f186406a), new wg9.p(t0Var2, str2, displayCurrency2, bVar4, 6));
                                        zhm.h0 h0Var = zhm.h0.f322473a;
                                        return ue0.e.H(ue0.e.p(rVarR, h0Var), h0Var, new x52.a(t0Var2, displayCurrency2, 11));
                                    default:
                                        WealthAccount.Robo account2 = (WealthAccount.Robo) obj4;
                                        xi0.b targetCurrency = (xi0.b) obj5;
                                        Intrinsics.checkNotNullParameter(account2, "account");
                                        Intrinsics.checkNotNullParameter(targetCurrency, "displayCurrency");
                                        l0 l0Var = t0Var.f303390g;
                                        List list2 = account2.f95237c;
                                        ArrayList arrayList3 = new ArrayList();
                                        for (Object obj6 : list2) {
                                            if (zhm.v.k(com.revolut.shared.feature.wealth.models.trading_accounts.a.ACTIVE, com.revolut.shared.feature.wealth.models.trading_accounts.a.SUSPENDED, com.revolut.shared.feature.wealth.models.trading_accounts.a.OFFBOARDING).contains(((TradingAccount.Portfolio) obj6).f105211b)) {
                                                arrayList3.add(obj6);
                                            }
                                        }
                                        ArrayList<String> portfolioIds = new ArrayList(zhm.w.t(arrayList3, 10));
                                        Iterator it8 = arrayList3.iterator();
                                        while (it8.hasNext()) {
                                            portfolioIds.add(((TradingAccount.Portfolio) it8.next()).f105210a.toString());
                                        }
                                        Intrinsics.checkNotNullParameter(portfolioIds, "portfolioIds");
                                        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
                                        n9l.b ratesUpdatePeriod = bVar4;
                                        Intrinsics.checkNotNullParameter(ratesUpdatePeriod, "ratesUpdatePeriod");
                                        if (portfolioIds.isEmpty()) {
                                            eVar = zi0.c.i(new WealthAccountBalance(new dj0.d(0L, targetCurrency), new dj0.d(0L, targetCurrency)));
                                        } else {
                                            ArrayList arrayList4 = new ArrayList(zhm.w.t(portfolioIds, 10));
                                            for (String str3 : portfolioIds) {
                                                arrayList4.add(nim.a.v(rd0.e.b(ael.t.d(l0Var.f303359b, str3, false, ratesUpdatePeriod, targetCurrency, true, null, 32)), new wsg.j(str3, 18)));
                                            }
                                            j23.b bVarK = zh9.u0.k(arrayList4);
                                            eVar = ((jte.d) l0Var.f303358a).c(RoboApi$Toggles.RoboUkBePerformanceCalculation.f85025c) ? new t38.e(bVarK, 24, new vkm.y(new vkm.y(new wda.l(2, 9, null), nim.a.A(rd0.e.n(l0Var.f303360c.f(portfolioIds, targetCurrency), zhm.h0.f322473a), new h(15))), new v77.c(3, 9, null)), new wvg.i(l0Var, null, 14)) : nim.a.v(bVarK, new d(l0Var, 13));
                                        }
                                        return ue0.e.E(rd0.e.c(eVar, kotlin.coroutines.g.f186406a), zi0.c.P(t0.b(targetCurrency), false, null, 3));
                                }
                            }
                        };
                        t0Var.getClass();
                        flowD = t0.d(wealthAccount, bVar5, function22);
                    } else if (wealthAccount instanceof WealthAccount.Robo) {
                        final int i3 = 2;
                        Function2 function23 = new Function2() { // from class: x8h.r0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Flow eVar;
                                switch (i3) {
                                    case 0:
                                        xi0.b displayCurrency = (xi0.b) obj5;
                                        Intrinsics.checkNotNullParameter((WealthAccount.Commodities) obj4, "<unused var>");
                                        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
                                        return nim.a.w(hb9.b.w(ue0.e.p(t0Var.f303389c.y(displayCurrency, bVar4), zhm.h0.f322473a), displayCurrency), new h(20));
                                    case 1:
                                        WealthAccount.Margin account = (WealthAccount.Margin) obj4;
                                        xi0.b displayCurrency2 = (xi0.b) obj5;
                                        Intrinsics.checkNotNullParameter(account, "account");
                                        Intrinsics.checkNotNullParameter(displayCurrency2, "displayCurrency");
                                        t0 t0Var2 = t0Var;
                                        t0Var2.getClass();
                                        String str2 = account.f95234c;
                                        if (str2 == null) {
                                            efm.r rVarJust = efm.r.just(new Data(t0.b(displayCurrency2), null, false, 6, null));
                                            Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                                            return rVarJust;
                                        }
                                        efm.r rVarR = pd.b.r(rd0.e.c(vkm.q.q(nim.a.v(((ael.y) t0Var2.e).e(str2, w4l.h.f294642c), new h(21))), kotlin.coroutines.g.f186406a), new wg9.p(t0Var2, str2, displayCurrency2, bVar4, 6));
                                        zhm.h0 h0Var = zhm.h0.f322473a;
                                        return ue0.e.H(ue0.e.p(rVarR, h0Var), h0Var, new x52.a(t0Var2, displayCurrency2, 11));
                                    default:
                                        WealthAccount.Robo account2 = (WealthAccount.Robo) obj4;
                                        xi0.b targetCurrency = (xi0.b) obj5;
                                        Intrinsics.checkNotNullParameter(account2, "account");
                                        Intrinsics.checkNotNullParameter(targetCurrency, "displayCurrency");
                                        l0 l0Var = t0Var.f303390g;
                                        List list2 = account2.f95237c;
                                        ArrayList arrayList3 = new ArrayList();
                                        for (Object obj6 : list2) {
                                            if (zhm.v.k(com.revolut.shared.feature.wealth.models.trading_accounts.a.ACTIVE, com.revolut.shared.feature.wealth.models.trading_accounts.a.SUSPENDED, com.revolut.shared.feature.wealth.models.trading_accounts.a.OFFBOARDING).contains(((TradingAccount.Portfolio) obj6).f105211b)) {
                                                arrayList3.add(obj6);
                                            }
                                        }
                                        ArrayList<String> portfolioIds = new ArrayList(zhm.w.t(arrayList3, 10));
                                        Iterator it8 = arrayList3.iterator();
                                        while (it8.hasNext()) {
                                            portfolioIds.add(((TradingAccount.Portfolio) it8.next()).f105210a.toString());
                                        }
                                        Intrinsics.checkNotNullParameter(portfolioIds, "portfolioIds");
                                        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
                                        n9l.b ratesUpdatePeriod = bVar4;
                                        Intrinsics.checkNotNullParameter(ratesUpdatePeriod, "ratesUpdatePeriod");
                                        if (portfolioIds.isEmpty()) {
                                            eVar = zi0.c.i(new WealthAccountBalance(new dj0.d(0L, targetCurrency), new dj0.d(0L, targetCurrency)));
                                        } else {
                                            ArrayList arrayList4 = new ArrayList(zhm.w.t(portfolioIds, 10));
                                            for (String str3 : portfolioIds) {
                                                arrayList4.add(nim.a.v(rd0.e.b(ael.t.d(l0Var.f303359b, str3, false, ratesUpdatePeriod, targetCurrency, true, null, 32)), new wsg.j(str3, 18)));
                                            }
                                            j23.b bVarK = zh9.u0.k(arrayList4);
                                            eVar = ((jte.d) l0Var.f303358a).c(RoboApi$Toggles.RoboUkBePerformanceCalculation.f85025c) ? new t38.e(bVarK, 24, new vkm.y(new vkm.y(new wda.l(2, 9, null), nim.a.A(rd0.e.n(l0Var.f303360c.f(portfolioIds, targetCurrency), zhm.h0.f322473a), new h(15))), new v77.c(3, 9, null)), new wvg.i(l0Var, null, 14)) : nim.a.v(bVarK, new d(l0Var, 13));
                                        }
                                        return ue0.e.E(rd0.e.c(eVar, kotlin.coroutines.g.f186406a), zi0.c.P(t0.b(targetCurrency), false, null, 3));
                                }
                            }
                        };
                        t0Var.getClass();
                        flowD = t0.d(wealthAccount, bVar5, function23);
                    } else {
                        boolean z = wealthAccount instanceof WealthAccount.Securities;
                        final boolean z3 = this.f294493b;
                        if (z) {
                            final int i5 = 0;
                            Function2 function24 = new Function2() { // from class: x8h.s0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    UUID uuid;
                                    UUID uuid2;
                                    switch (i5) {
                                        case 0:
                                            WealthAccount.Securities account = (WealthAccount.Securities) obj4;
                                            xi0.b displayCurrency = (xi0.b) obj5;
                                            Intrinsics.checkNotNullParameter(account, "account");
                                            Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
                                            t0 t0Var2 = t0Var;
                                            t0Var2.getClass();
                                            if (account != null) {
                                                TradingAccount.Portfolio portfolio = account.f95240c;
                                                return t0.f(t0Var2, (portfolio == null || (uuid = portfolio.f105210a) == null) ? null : uuid.toString(), displayCurrency, bVar4, z3);
                                            }
                                            throw new IllegalStateException("provide handling for " + account.T0());
                                        default:
                                            WealthAccount.TaxAdvantageWealthAccount account2 = (WealthAccount.TaxAdvantageWealthAccount) obj4;
                                            xi0.b displayCurrency2 = (xi0.b) obj5;
                                            Intrinsics.checkNotNullParameter(account2, "account");
                                            Intrinsics.checkNotNullParameter(displayCurrency2, "displayCurrency");
                                            t0 t0Var3 = t0Var;
                                            t0Var3.getClass();
                                            TradingAccount.Portfolio d = account2.getD();
                                            return t0.f(t0Var3, (d == null || (uuid2 = d.f105210a) == null) ? null : uuid2.toString(), displayCurrency2, bVar4, z3);
                                    }
                                }
                            };
                            t0Var.getClass();
                            flowD = t0.d(wealthAccount, bVar5, function24);
                        } else {
                            if (!(wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            final int i6 = 1;
                            Function2 function25 = new Function2() { // from class: x8h.s0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    UUID uuid;
                                    UUID uuid2;
                                    switch (i6) {
                                        case 0:
                                            WealthAccount.Securities account = (WealthAccount.Securities) obj4;
                                            xi0.b displayCurrency = (xi0.b) obj5;
                                            Intrinsics.checkNotNullParameter(account, "account");
                                            Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
                                            t0 t0Var2 = t0Var;
                                            t0Var2.getClass();
                                            if (account != null) {
                                                TradingAccount.Portfolio portfolio = account.f95240c;
                                                return t0.f(t0Var2, (portfolio == null || (uuid = portfolio.f105210a) == null) ? null : uuid.toString(), displayCurrency, bVar4, z3);
                                            }
                                            throw new IllegalStateException("provide handling for " + account.T0());
                                        default:
                                            WealthAccount.TaxAdvantageWealthAccount account2 = (WealthAccount.TaxAdvantageWealthAccount) obj4;
                                            xi0.b displayCurrency2 = (xi0.b) obj5;
                                            Intrinsics.checkNotNullParameter(account2, "account");
                                            Intrinsics.checkNotNullParameter(displayCurrency2, "displayCurrency");
                                            t0 t0Var3 = t0Var;
                                            t0Var3.getClass();
                                            TradingAccount.Portfolio d = account2.getD();
                                            return t0.f(t0Var3, (d == null || (uuid2 = d.f105210a) == null) ? null : uuid2.toString(), displayCurrency2, bVar4, z3);
                                    }
                                }
                            };
                            t0Var.getClass();
                            flowD = t0.d(wealthAccount, bVar5, function25);
                        }
                    }
                    arrayList2.add(nim.a.v(flowD, new q0(wealthAccount, 0)));
                }
                return u0.k(arrayList2);
            case 3:
                y13.c cVar = (y13.c) this.f294494c;
                String str2 = (String) this.d;
                b93.b bVar6 = (b93.b) this.e;
                hha.d pricingPlan = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                return hx2.c.a(cVar.f310285b, this.f294493b ? c93.f.JUNIOR_VIRTUAL : c93.f.JUNIOR, str2, bVar6, pricingPlan, false, null, null, 65434);
            case 4:
                yj2.d dVar2 = (yj2.d) this.f294494c;
                AtmLocation atmLocation = (AtmLocation) this.d;
                x39.b bVar7 = (x39.b) this.e;
                Boolean surchargeFree = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(surchargeFree, "surchargeFree");
                l lVar = dVar2.f314384a;
                boolean zBooleanValue = surchargeFree.booleanValue();
                sj2.c cVar2 = sj2.c.AUTO_EXPANSION;
                ufm.i iVar2 = new ufm.i(lVar.c(true), new yj2.a(9, new yi5.b(12)), 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                sfm.b bVar8 = new sfm.b(new ufm.i(iVar2, new yj2.a(5, new yj2.g(lVar, 1)), 1), new yj2.a(6, new kxj.f(lVar, zBooleanValue, this.f294493b, cVar2)), 2);
                Intrinsics.checkNotNullExpressionValue(bVar8, "flatMapObservable(...)");
                return nim.a.w(ue0.e.y(bVar8, h0.f322473a, new yi5.b(11)), new yj2.b(dVar2, atmLocation, bVar7));
            case 5:
                BigDecimal bigDecimal = (BigDecimal) this.f294494c;
                s sVar = (s) this.d;
                u uVar = (u) this.e;
                x update = (x) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                yrb.w wVar = update.f;
                qrb.a aVarA = uVar.f316248c.a();
                vki.a aVar = sVar.z;
                int i21 = yrb.j.f316220b[((x) ((j2) aVar.f22677a).getValue()).f316253c.ordinal()];
                if (i21 == 1) {
                    bigDecimalY = pyd.c.Y(aVarA.f248681a);
                } else {
                    if (i21 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bigDecimalY = aVarA.f248682b.f104717a;
                }
                if (e1.I(bigDecimalY)) {
                    iIntValue = 0;
                } else {
                    ((x) ((j2) aVar.f22677a).getValue()).f.getClass();
                    BigDecimal bigDecimalMultiply = bigDecimal.multiply(new BigDecimal(String.valueOf(100)), MathContext.DECIMAL128);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                    iIntValue = bigDecimalMultiply.divide(bigDecimalY, 2, RoundingMode.HALF_EVEN).intValue();
                }
                boolean z4 = this.f294493b;
                wVar.getClass();
                return x.a(update, null, null, null, bigDecimal, null, new yrb.w(iIntValue, !z4), z4, null, null, null, null, null, new Data(null, null, true, 3, null), null, null, 28567);
            case 6:
                s71.a aVar2 = ((yua.q) this.f294494c).f316963a;
                String subscriptionId = (String) this.d;
                String str3 = (String) this.e;
                hbd.a params = (hbd.a) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                if (this.f294493b) {
                    a31.x xVar = (a31.x) aVar2;
                    Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
                    Intrinsics.checkNotNullParameter(params, "params");
                    RecurringPaymentService recurringPaymentService = xVar.f999a;
                    if (str3 == null) {
                        str3 = null;
                    }
                    pfm.a aVarE = recurringPaymentService.blockSubscription(subscriptionId, new BlockUnblockSubscriptionRequest(str3, null, 2, null)).e(xVar.e(params, new a31.i(subscriptionId, true, 1)));
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    return w.g0(aVarE);
                }
                a31.x xVar2 = (a31.x) aVar2;
                Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
                Intrinsics.checkNotNullParameter(params, "params");
                RecurringPaymentService recurringPaymentService2 = xVar2.f999a;
                if (str3 == null) {
                    str3 = null;
                }
                pfm.a aVarE2 = recurringPaymentService2.unblockSubscription(subscriptionId, new BlockUnblockSubscriptionRequest(str3, null, 2, null)).e(xVar2.e(params, new a31.i(subscriptionId, false, 1)));
                Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                return w.g0(aVarE2);
            case 7:
                yxb.s sVar2 = (yxb.s) this.f294494c;
                String str4 = (String) this.d;
                Integer num = (Integer) this.e;
                Boolean spareChangeEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(spareChangeEnabled, "spareChangeEnabled");
                if (!spareChangeEnabled.booleanValue()) {
                    return d0.m(Boolean.FALSE);
                }
                ufm.i iVar3 = new ufm.i(this.f294493b ? d0.D(yxb.s.c(), sVar2.h(num, str4), new yxb.c(new yw9.j(15), 16)) : sVar2.h(num, str4), new yxb.c(new yxb.a(sVar2, 15), 17), 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                return ue0.e.F(iVar3, Boolean.TRUE);
            default:
                NaviCommand naviCommand = (NaviCommand) this.f294494c;
                RevPointsOptInNextDestination revPointsOptInNextDestination = (RevPointsOptInNextDestination) this.d;
                String str5 = (String) this.e;
                r0 optInState = (r0) obj2;
                Intrinsics.checkNotNullParameter(optInState, "optInState");
                int i22 = yxb.d.f317613b[optInState.f201447a.ordinal()];
                if (i22 == 1) {
                    return naviCommand;
                }
                if (i22 == 2) {
                    return u0.f(new RevPointsOptInDestination(revPointsOptInNextDestination, RevPointsOptInNextDestination.Default.f83526a, new LifestyleRevPointsOptInController$InputData(new RevPointsOptInSource.Deeplink(str5), this.f294493b, 4)));
                }
                throw new NoWhenBranchMatchedException();
        }
    }

    public /* synthetic */ b(yj2.d dVar, boolean z, AtmLocation atmLocation, x39.b bVar) {
        this.f294492a = 4;
        this.f294494c = dVar;
        this.f294493b = z;
        this.d = atmLocation;
        this.e = bVar;
    }

    public /* synthetic */ b(boolean z, Object obj2, String str, Serializable serializable, int i) {
        this.f294492a = i;
        this.f294493b = z;
        this.f294494c = obj2;
        this.d = str;
        this.e = serializable;
    }
}
