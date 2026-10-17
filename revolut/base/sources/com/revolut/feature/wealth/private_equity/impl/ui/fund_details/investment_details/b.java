package com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details;

import ael.q;
import akg.n;
import boh.f;
import cli.y;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import e54.r;
import efb.i;
import egh.g;
import egh.k;
import egh.o;
import hx7.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kwg.l;
import oki.h;
import vkm.t0;
import ybl.d;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements k {
    public final ybl.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f95817p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q f95818q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ybl.k f95819r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final kdh.b f95820s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gdh.a f95821t;
    public final l u;
    public final ybl.l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final FundInvestmentDetailsScreenContract$InputData f95822w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f95823x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f95824y;

    public b(ybl.b instrumentTickerInteractor, d portfolioInteractor, q pnlInteractor, ybl.k tradingAccountsInteractor, kdh.b instrumentActionsInteractor, gdh.a footerActionHandlerExtension, l complexAnalyticsInteractor, ybl.l tradingConfigInteractor, c stateMapper, FundInvestmentDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(pnlInteractor, "pnlInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(instrumentActionsInteractor, "instrumentActionsInteractor");
        Intrinsics.checkNotNullParameter(footerActionHandlerExtension, "footerActionHandlerExtension");
        Intrinsics.checkNotNullParameter(complexAnalyticsInteractor, "complexAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = instrumentTickerInteractor;
        this.f95817p = portfolioInteractor;
        this.f95818q = pnlInteractor;
        this.f95819r = tradingAccountsInteractor;
        this.f95820s = instrumentActionsInteractor;
        this.f95821t = footerActionHandlerExtension;
        this.u = complexAnalyticsInteractor;
        this.v = tradingConfigInteractor;
        this.f95822w = inputData;
        this.f95823x = mra.d.b(this, new g(null, null, null, null, null, null), stateMapper, null, false, 12);
        this.f95824y = e.a(this, new r(this, 29));
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(((ael.k) this.o).f(this.f95822w.f95809a)), null, null, new o(this, null, 3), 3);
        yji.l.a1(this, ybl.k.h(this.f95819r, TradingAccountType.Gia.f105270a, null, 6), null, null, new o(this, null, 0), 3);
        yji.l.a1(this, ybl.l.d(this.v), null, null, new o(this, null, 5), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f95824y;
    }

    @Override // yji.l
    public final void T1(long j2) {
        i iVar = new i(5);
        y yVar = this.f95823x;
        n nVarI = u0.i(new t0(yVar.B(iVar), 1), a.a.k(new t0(yVar.B(new i(6)), 1), new i(7)), ((ael.k) this.o).o(this.f95822w.f95809a, w4l.h.f294642c));
        final int i = 2;
        yji.l.b1(this, f.e(nVarI, new Function1(this) { // from class: egh.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.b f125658b;

            {
                this.f125658b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List listL;
                switch (i) {
                    case 0:
                        nel.n fundShare = (nel.n) obj2;
                        Intrinsics.checkNotNullParameter(fundShare, "fundShare");
                        return kdh.b.b0(this.f125658b.f95820s, fundShare.f214596b, 6);
                    case 1:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        nel.n nVar = (nel.n) pair.f186385a;
                        kel.e eVar = ((del.a) pair.f186386b).e.f183179l;
                        if (eVar == null || (listL = eVar.d) == null) {
                            listL = v.l(eVar != null ? eVar.e : null);
                        }
                        List list = listL;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(((kel.d) it8.next()).f183159b);
                        }
                        List listU = d0.U(arrayList);
                        if (listU.isEmpty()) {
                            return zi0.c.i(f0.f322471a);
                        }
                        kwg.l lVar = this.f125658b.u;
                        eel.c timeSpan = eel.c.ALL;
                        xi0.b currency = nVar.i;
                        mwg.h selector = new mwg.h(listU);
                        lVar.getClass();
                        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        Intrinsics.checkNotNullParameter(selector, "selector");
                        w4l.h loadingStrategy = w4l.h.f294642c;
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        return rd0.e.b(pd.b.r(lVar.f190353a.k(false), new js7.c(4, new ja3.d(lVar, timeSpan, selector, currency, 12))));
                    default:
                        yhm.r rVar = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                        nel.n nVar2 = (nel.n) rVar.f314201a;
                        od0.i iVar2 = (od0.i) rVar.f314202b;
                        InstrumentTicker instrumentTicker = (InstrumentTicker) rVar.f314203c;
                        com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.b bVar = this.f125658b;
                        ybl.d dVar = bVar.f95817p;
                        String str = nVar2.f214596b;
                        String string = com.revolut.shared.feature.wealth.models.trading_accounts.d.l((TradingAccount) iVar2.c()).f105210a.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        return nim.a.v(((ael.y) dVar).c(new kel.j(str, string), w4l.h.f294642c), new eed.j(bVar, instrumentTicker, 2));
                }
            }
        }), null, new o(this, null, 4), 3);
        final int i2 = 1;
        yji.l.b1(this, f.e(u0.m(new t0(yVar.B(new i(3)), 1), new t0(yVar.B(new i(4)), 1)), new Function1(this) { // from class: egh.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.b f125658b;

            {
                this.f125658b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List listL;
                switch (i2) {
                    case 0:
                        nel.n fundShare = (nel.n) obj2;
                        Intrinsics.checkNotNullParameter(fundShare, "fundShare");
                        return kdh.b.b0(this.f125658b.f95820s, fundShare.f214596b, 6);
                    case 1:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        nel.n nVar = (nel.n) pair.f186385a;
                        kel.e eVar = ((del.a) pair.f186386b).e.f183179l;
                        if (eVar == null || (listL = eVar.d) == null) {
                            listL = v.l(eVar != null ? eVar.e : null);
                        }
                        List list = listL;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(((kel.d) it8.next()).f183159b);
                        }
                        List listU = d0.U(arrayList);
                        if (listU.isEmpty()) {
                            return zi0.c.i(f0.f322471a);
                        }
                        kwg.l lVar = this.f125658b.u;
                        eel.c timeSpan = eel.c.ALL;
                        xi0.b currency = nVar.i;
                        mwg.h selector = new mwg.h(listU);
                        lVar.getClass();
                        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        Intrinsics.checkNotNullParameter(selector, "selector");
                        w4l.h loadingStrategy = w4l.h.f294642c;
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        return rd0.e.b(pd.b.r(lVar.f190353a.k(false), new js7.c(4, new ja3.d(lVar, timeSpan, selector, currency, 12))));
                    default:
                        yhm.r rVar = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                        nel.n nVar2 = (nel.n) rVar.f314201a;
                        od0.i iVar2 = (od0.i) rVar.f314202b;
                        InstrumentTicker instrumentTicker = (InstrumentTicker) rVar.f314203c;
                        com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.b bVar = this.f125658b;
                        ybl.d dVar = bVar.f95817p;
                        String str = nVar2.f214596b;
                        String string = com.revolut.shared.feature.wealth.models.trading_accounts.d.l((TradingAccount) iVar2.c()).f105210a.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        return nim.a.v(((ael.y) dVar).c(new kel.j(str, string), w4l.h.f294642c), new eed.j(bVar, instrumentTicker, 2));
                }
            }
        }), null, new o(this, null, 2), 3);
        final int i3 = 0;
        yji.l.b1(this, f.e(new t0(yVar.B(new i(2)), 1), new Function1(this) { // from class: egh.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.b f125658b;

            {
                this.f125658b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List listL;
                switch (i3) {
                    case 0:
                        nel.n fundShare = (nel.n) obj2;
                        Intrinsics.checkNotNullParameter(fundShare, "fundShare");
                        return kdh.b.b0(this.f125658b.f95820s, fundShare.f214596b, 6);
                    case 1:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        nel.n nVar = (nel.n) pair.f186385a;
                        kel.e eVar = ((del.a) pair.f186386b).e.f183179l;
                        if (eVar == null || (listL = eVar.d) == null) {
                            listL = v.l(eVar != null ? eVar.e : null);
                        }
                        List list = listL;
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(((kel.d) it8.next()).f183159b);
                        }
                        List listU = d0.U(arrayList);
                        if (listU.isEmpty()) {
                            return zi0.c.i(f0.f322471a);
                        }
                        kwg.l lVar = this.f125658b.u;
                        eel.c timeSpan = eel.c.ALL;
                        xi0.b currency = nVar.i;
                        mwg.h selector = new mwg.h(listU);
                        lVar.getClass();
                        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        Intrinsics.checkNotNullParameter(selector, "selector");
                        w4l.h loadingStrategy = w4l.h.f294642c;
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        return rd0.e.b(pd.b.r(lVar.f190353a.k(false), new js7.c(4, new ja3.d(lVar, timeSpan, selector, currency, 12))));
                    default:
                        yhm.r rVar = (yhm.r) obj2;
                        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                        nel.n nVar2 = (nel.n) rVar.f314201a;
                        od0.i iVar2 = (od0.i) rVar.f314202b;
                        InstrumentTicker instrumentTicker = (InstrumentTicker) rVar.f314203c;
                        com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.b bVar = this.f125658b;
                        ybl.d dVar = bVar.f95817p;
                        String str = nVar2.f214596b;
                        String string = com.revolut.shared.feature.wealth.models.trading_accounts.d.l((TradingAccount) iVar2.c()).f105210a.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        return nim.a.v(((ael.y) dVar).c(new kel.j(str, string), w4l.h.f294642c), new eed.j(bVar, instrumentTicker, 2));
                }
            }
        }), null, new o(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f95823x;
    }
}
