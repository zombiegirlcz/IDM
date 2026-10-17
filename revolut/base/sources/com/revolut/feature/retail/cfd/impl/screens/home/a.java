package com.revolut.feature.retail.cfd.impl.screens.home;

import boh.f;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.cfd.impl.screens.home.CfdTradingHomeScreenContract$ModalStep;
import com.revolut.feature.wealth.analytics.WealthAnalyticsApi$Toggles;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import d1h.e;
import d9.e1;
import f2b.b;
import fsl.m;
import fsl.w;
import hih.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k50.b2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlinx.coroutines.flow.Flow;
import oki.h;
import r3b.i;
import r3b.l;
import r3b.s;
import vii.c;
import vkm.q;
import vkm.t0;
import vkm.v1;
import vkm.z1;
import ybl.d;
import ybl.k;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements l {
    public final e A;
    public final b B;
    public final c C;
    public final c D;
    public final z1 E;
    public final y F;
    public final com.revolut.kompot.navigable.vc.modal.a G;
    public final CfdTradingHomeScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f82214p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h1h.b f82215q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f82216r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h5b.b f82217s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t2b.h f82218t;
    public final zhh.a u;
    public final xjh.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r3b.y f82219w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k f82220x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o5d.a f82221y;
    public final tzg.m z;

    public a(n stateMapper, gte.a featureToggleInteractor, CfdTradingHomeScreenContract$InputData input, d portfolioInteractor, h1h.b transactionsWidgetControllerModelExtension, m investOrdersWidgetProvider, h5b.b maintenanceMarginWidgetExtension, t2b.h pollUnrealisedPerformanceInDisplayCurrency, zhh.a cfdAccountActionsProvider, xjh.b wealthActionsHandler, r3b.y cfdTradingHomeScreenPositionsProvider, k tradingAccountsInteractor, o5d.a swipeAssetTradeActionsExtension, tzg.m wealthAccountsInteractor, e disclaimersModelExtension, b cfdPerformanceTracker) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(transactionsWidgetControllerModelExtension, "transactionsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(investOrdersWidgetProvider, "investOrdersWidgetProvider");
        Intrinsics.checkNotNullParameter(maintenanceMarginWidgetExtension, "maintenanceMarginWidgetExtension");
        Intrinsics.checkNotNullParameter(pollUnrealisedPerformanceInDisplayCurrency, "pollUnrealisedPerformanceInDisplayCurrency");
        Intrinsics.checkNotNullParameter(cfdAccountActionsProvider, "cfdAccountActionsProvider");
        Intrinsics.checkNotNullParameter(wealthActionsHandler, "wealthActionsHandler");
        Intrinsics.checkNotNullParameter(cfdTradingHomeScreenPositionsProvider, "cfdTradingHomeScreenPositionsProvider");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(swipeAssetTradeActionsExtension, "swipeAssetTradeActionsExtension");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(disclaimersModelExtension, "disclaimersModelExtension");
        Intrinsics.checkNotNullParameter(cfdPerformanceTracker, "cfdPerformanceTracker");
        this.o = input;
        this.f82214p = portfolioInteractor;
        this.f82215q = transactionsWidgetControllerModelExtension;
        this.f82216r = investOrdersWidgetProvider;
        this.f82217s = maintenanceMarginWidgetExtension;
        this.f82218t = pollUnrealisedPerformanceInDisplayCurrency;
        this.u = cfdAccountActionsProvider;
        this.v = wealthActionsHandler;
        this.f82219w = cfdTradingHomeScreenPositionsProvider;
        this.f82220x = tradingAccountsInteractor;
        this.f82221y = swipeAssetTradeActionsExtension;
        this.z = wealthAccountsInteractor;
        this.A = disclaimersModelExtension;
        this.B = cfdPerformanceTracker;
        this.C = new c();
        this.D = new c();
        this.E = q.b(1, 4, null);
        this.F = mra.d.b(this, new i(null, null, null, null, null, null, new Data(null, null, false, 7, null), ((jte.d) featureToggleInteractor).c(WealthAnalyticsApi$Toggles.CfdsAnalytics.f94966c), null, null, null), stateMapper, null, false, 12);
        this.G = hx7.e.a(this, new qm2.c(this, 24));
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, ((gah.e) this.A).Z2(u.c(rdh.b.CFD_HOME)), null, null, new s(2, this, null), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.G;
    }

    @Override // b2b.f
    public final Flow M1() {
        return q.q(this.E);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        wkm.l lVarQ = q.Q(this.C.a(Unit.f186387a, w4l.h.f294642c), new r3b.u(0, this, continuation));
        yji.l.b1(this, lVarQ, null, new s(7, this, continuation), 3);
        final int i = 0;
        v1 v1VarN = e1.N(new b2(2, this, a.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 29), f.e(q.q(nim.a.v(lVarQ, new h0() { // from class: r3b.w
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return Boolean.valueOf(i2b.a.m((wel.e) obj2));
            }
        })), new Function1(this) { // from class: r3b.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.retail.cfd.impl.screens.home.a f251263b;

            {
                this.f251263b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        if (!((Boolean) obj2).booleanValue()) {
                            return new go.g(new Data(null, null, false, 6, null), 2);
                        }
                        com.revolut.feature.retail.cfd.impl.screens.home.a aVar = this.f251263b;
                        return vkm.q.Q(aVar.D.a(Unit.f186387a, w4l.h.f294642c), new u(1, aVar, null));
                    case 1:
                        h performance = (h) obj2;
                        Intrinsics.checkNotNullParameter(performance, "performance");
                        List list = performance.f251239a;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(new p5d.b(((y49.h) it8.next()).f310847a.f214596b, "instrument", this.f251263b.o.f82212a));
                        }
                        return arrayList;
                    default:
                        od0.i accountOptional = (od0.i) obj2;
                        Intrinsics.checkNotNullParameter(accountOptional, "accountOptional");
                        return accountOptional.d() ? this.f251263b.u.a((TradingAccount) accountOptional.c()) : zi0.c.i(f0.f322471a);
                }
            }
        }));
        yji.l.b1(this, v1VarN, null, new s(8, this, continuation), 3);
        final int i2 = 1;
        yji.l.b1(this, this.f82221y.Z2(new q87.q(nim.a.v(v1VarN, new Function1(this) { // from class: r3b.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.retail.cfd.impl.screens.home.a f251263b;

            {
                this.f251263b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        if (!((Boolean) obj2).booleanValue()) {
                            return new go.g(new Data(null, null, false, 6, null), 2);
                        }
                        com.revolut.feature.retail.cfd.impl.screens.home.a aVar = this.f251263b;
                        return vkm.q.Q(aVar.D.a(Unit.f186387a, w4l.h.f294642c), new u(1, aVar, null));
                    case 1:
                        h performance = (h) obj2;
                        Intrinsics.checkNotNullParameter(performance, "performance");
                        List list = performance.f251239a;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(new p5d.b(((y49.h) it8.next()).f310847a.f214596b, "instrument", this.f251263b.o.f82212a));
                        }
                        return arrayList;
                    default:
                        od0.i accountOptional = (od0.i) obj2;
                        Intrinsics.checkNotNullParameter(accountOptional, "accountOptional");
                        return accountOptional.d() ? this.f251263b.u.a((TradingAccount) accountOptional.c()) : zi0.c.i(f0.f322471a);
                }
            }
        }), 1)), null, new s(9, this, continuation), 3);
        InvestTransactionsFilter.Companion companion = InvestTransactionsFilter.INSTANCE;
        WealthAccountType wealthAccountType = WealthAccountType.MARGIN;
        companion.getClass();
        InvestTransactionsFilter.InvestTransactionsFilterImpl investTransactionsFilterImplA = InvestTransactionsFilter.Companion.a(wealthAccountType);
        InvestTransactionsListContract$Disclaimers.INSTANCE.getClass();
        yji.l.b1(this, this.f82215q.c3(investTransactionsFilterImplA, w4l.i.f294643c, new h1h.c(InvestTransactionsListContract$Disclaimers.Companion.a(), 1)), null, new s(6, this, continuation), 3);
        yji.l.b1(this, ((w) this.f82216r).a(new InvestOrdersParams.OrdersAll(k4l.d.MARGIN, (Boolean) null, (String) null, 14)), null, new s(4, this, continuation), 3);
        yji.l.b1(this, this.f82217s.c3(), null, new s(3, this, continuation), 3);
        final int i3 = 2;
        yji.l.b1(this, f.e(k.h(this.f82220x, TradingAccountType.Margin.f105271a, null, 6), new Function1(this) { // from class: r3b.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.retail.cfd.impl.screens.home.a f251263b;

            {
                this.f251263b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        if (!((Boolean) obj2).booleanValue()) {
                            return new go.g(new Data(null, null, false, 6, null), 2);
                        }
                        com.revolut.feature.retail.cfd.impl.screens.home.a aVar = this.f251263b;
                        return vkm.q.Q(aVar.D.a(Unit.f186387a, w4l.h.f294642c), new u(1, aVar, null));
                    case 1:
                        h performance = (h) obj2;
                        Intrinsics.checkNotNullParameter(performance, "performance");
                        List list = performance.f251239a;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(new p5d.b(((y49.h) it8.next()).f310847a.f214596b, "instrument", this.f251263b.o.f82212a));
                        }
                        return arrayList;
                    default:
                        od0.i accountOptional = (od0.i) obj2;
                        Intrinsics.checkNotNullParameter(accountOptional, "accountOptional");
                        return accountOptional.d() ? this.f251263b.u.a((TradingAccount) accountOptional.c()) : zi0.c.i(f0.f322471a);
                }
            }
        }), null, new s(0, this, continuation), 3);
        yji.l.b1(this, nim.a.v(new t0(this.F.B(new r2d.d(17)), 1), new r2d.d(18)), null, new s(5, this, continuation), 3);
        yji.l.b1(this, tzg.m.b(this.z, this.o.f82212a), null, new s(1, this, continuation), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.F;
    }

    @Override // yji.l
    public final aii.n o2(aii.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof hih.c;
        b.C0876b c0876b = b.C0876b.f152604a;
        if (!z) {
            return event instanceof b.a ? c0876b : super.o2(event);
        }
        h.v2(this.G, new CfdTradingHomeScreenContract$ModalStep.KompotDescriptor(((hih.c) event).f152605b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return c0876b;
    }
}
