package rtl;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.trading_orders.api.invest.placement.account.selector.InvestAccountSelectorContract$Disclaimer;
import com.revolut.feature.trading_orders.api.invest.placement.account.selector.InvestAccountSelectorContract$SectionParams;
import com.revolut.trading.orders.ui.invest.placement.account.selector.screen.InvestAccountSelectorScreenContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tv5.a;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class u extends oki.h implements p {
    public final InvestAccountSelectorScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ybl.b f257335p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c0 f257336q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final aah.h f257337r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f257338s;

    public u(InvestAccountSelectorScreenContract$InputData inputData, q stateMapper, o saveStateDelegate, ybl.b instrumentTickerInteractor, c0 sectionsProvider, aah.h wealthDisclaimersExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(sectionsProvider, "sectionsProvider");
        Intrinsics.checkNotNullParameter(wealthDisclaimersExtension, "wealthDisclaimersExtension");
        this.o = inputData;
        this.f257335p = instrumentTickerInteractor;
        this.f257336q = sectionsProvider;
        this.f257337r = wealthDisclaimersExtension;
        this.f257338s = te0.w.y0(new qg7.k(this, 4, stateMapper, saveStateDelegate));
    }

    @Override // yji.l
    public final void I1() {
        Object next;
        Flow flowI;
        Object next2;
        Flow flowI2;
        Object next3;
        Flow flowI3;
        Object next4;
        Flow flowI4;
        Flow flowI5;
        efm.r rVarJ;
        InvestAccountSelectorScreenContract$InputData investAccountSelectorScreenContract$InputData = this.o;
        List list = investAccountSelectorScreenContract$InputData.f106832c;
        List list2 = investAccountSelectorScreenContract$InputData.f106832c;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (next instanceof InvestAccountSelectorContract$SectionParams.InvestSectionParams) {
                    break;
                }
            }
        }
        if (!(next instanceof InvestAccountSelectorContract$SectionParams.InvestSectionParams)) {
            next = null;
        }
        InvestAccountSelectorContract$SectionParams.InvestSectionParams investSectionParams = (InvestAccountSelectorContract$SectionParams.InvestSectionParams) next;
        ybl.b bVar = this.f257335p;
        od0.i iVar = od0.i.f224256b;
        if (investSectionParams != null) {
            InvestAccountSelectorContract$SectionParams.InvestSectionParams.HoldingsDisplayConfiguration holdingsDisplayConfiguration = investSectionParams.f91718a;
            if (holdingsDisplayConfiguration instanceof InvestAccountSelectorContract$SectionParams.InvestSectionParams.HoldingsDisplayConfiguration.HoldingWithInstrumentCurrency) {
                flowI = nim.a.v(rd0.e.b(((ael.k) bVar).f(((InvestAccountSelectorContract$SectionParams.InvestSectionParams.HoldingsDisplayConfiguration.HoldingWithInstrumentCurrency) holdingsDisplayConfiguration).f91722a)), new rsl.c(15));
            } else {
                if (!(holdingsDisplayConfiguration instanceof InvestAccountSelectorContract$SectionParams.InvestSectionParams.HoldingsDisplayConfiguration.AllHoldings)) {
                    throw new NoWhenBranchMatchedException();
                }
                od0.i.Companion.getClass();
                flowI = zi0.c.i(iVar);
            }
        } else {
            od0.i.Companion.getClass();
            flowI = zi0.c.i(iVar);
        }
        yji.l.a1(this, flowI, null, null, new t(this, null, 2), 3);
        Iterator it9 = list2.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it9.next();
                if (next2 instanceof InvestAccountSelectorContract$SectionParams.InvestSectionParams) {
                    break;
                }
            }
        }
        if (!(next2 instanceof InvestAccountSelectorContract$SectionParams.InvestSectionParams)) {
            next2 = null;
        }
        InvestAccountSelectorContract$SectionParams.InvestSectionParams params = (InvestAccountSelectorContract$SectionParams.InvestSectionParams) next2;
        final c0 c0Var = this.f257336q;
        if (params != null) {
            c0Var.getClass();
            Intrinsics.checkNotNullParameter(params, "params");
            flowI2 = rd0.e.n(nim.a.v(xam.a.h(new b0(c0Var, null), nim.a.v(ybl.k.k(c0Var.f257314a, null, null, null, 7), new rrd.l(params, 6))), new rsl.p(c0Var, params, 1)), h0.f322473a);
        } else {
            flowI2 = zi0.c.i(f0.f322471a);
        }
        yji.l.a1(this, flowI2, null, null, new t(this, null, 3), 3);
        Iterator it10 = list2.iterator();
        while (true) {
            if (!it10.hasNext()) {
                next3 = null;
                break;
            } else {
                next3 = it10.next();
                if (next3 instanceof InvestAccountSelectorContract$SectionParams.MainAccountSectionParams) {
                    break;
                }
            }
        }
        if (!(next3 instanceof InvestAccountSelectorContract$SectionParams.MainAccountSectionParams)) {
            next3 = null;
        }
        InvestAccountSelectorContract$SectionParams.MainAccountSectionParams params2 = (InvestAccountSelectorContract$SectionParams.MainAccountSectionParams) next3;
        AccountId.Personal personal = AccountId.Personal.f51414a;
        w4l.h hVar = w4l.h.f294642c;
        if (params2 != null) {
            c0Var.getClass();
            Intrinsics.checkNotNullParameter(params2, "params");
            efm.r rVar = (efm.r) c0Var.f.getValue();
            wsg.n nVar = c0Var.d;
            efm.r rVarW = nim.a.w(kli.a.h(rVar, nVar.J(personal, hVar)), new rsl.p(c0Var, params2, 2));
            InvestAccountSelectorContract$SectionParams.MainAccountSectionParams.BaseCurrency baseCurrency = params2.f91725a;
            if (baseCurrency instanceof InvestAccountSelectorContract$SectionParams.MainAccountSectionParams.BaseCurrency.InstrumentCurrency) {
                rVarJ = nim.a.w(((ael.k) c0Var.f257315b).f(((InvestAccountSelectorContract$SectionParams.MainAccountSectionParams.BaseCurrency.InstrumentCurrency) baseCurrency).f91728a), new rsl.c(19));
            } else {
                if (!Intrinsics.f(baseCurrency, InvestAccountSelectorContract$SectionParams.MainAccountSectionParams.BaseCurrency.PersonalAccountBaseCurrency.f91729a)) {
                    throw new NoWhenBranchMatchedException();
                }
                rVarJ = nVar.J(personal, hVar);
            }
            flowI3 = rd0.e.b(ue0.e.p(pd.b.r(kli.a.h(rVarJ, rVarW), new rrd.l(c0Var, 7)), h0.f322473a));
        } else {
            flowI3 = zi0.c.i(f0.f322471a);
        }
        yji.l.a1(this, flowI3, null, null, new t(this, null, 4), 3);
        Iterator it11 = list2.iterator();
        while (true) {
            if (!it11.hasNext()) {
                next4 = null;
                break;
            } else {
                next4 = it11.next();
                if (next4 instanceof InvestAccountSelectorContract$SectionParams.CommoditySectionParams) {
                    break;
                }
            }
        }
        if (!(next4 instanceof InvestAccountSelectorContract$SectionParams.CommoditySectionParams)) {
            next4 = null;
        }
        final InvestAccountSelectorContract$SectionParams.CommoditySectionParams params3 = (InvestAccountSelectorContract$SectionParams.CommoditySectionParams) next4;
        if (params3 != null) {
            c0Var.getClass();
            Intrinsics.checkNotNullParameter(params3, "params");
            final int i = 0;
            final int i2 = 1;
            flowI4 = rd0.e.b(ue0.e.p(nim.a.w(pd.b.r(kli.a.h(c0Var.d.J(personal, hVar), nim.a.w((efm.r) c0Var.f.getValue(), new Function1() { // from class: rtl.z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    efm.r rVarH;
                    switch (i) {
                        case 0:
                            List<Pair> it12 = (List) obj2;
                            Intrinsics.checkNotNullParameter(it12, "it");
                            ArrayList arrayList = new ArrayList();
                            for (Pair pair : it12) {
                                io3.d dVar = (io3.d) pair.f186385a;
                                xi0.b bVar2 = (xi0.b) pair.f186386b;
                                dj0.d dVarJ = z92.f.j(dVar);
                                InvestAccountSelectorContract$SectionParams.CommoditySectionParams commoditySectionParams = params3;
                                fdf.b bVar3 = commoditySectionParams.f91717b;
                                c0Var.getClass();
                                boolean zA = c0.a(dVarJ, bVar3);
                                boolean zB = c0.b(commoditySectionParams.f91716a, bVar2);
                                if (!cp5.d.y(bVar2) || !zA || !zB) {
                                    dVar = null;
                                }
                                if (dVar != null) {
                                    arrayList.add(dVar);
                                }
                            }
                            return arrayList;
                        default:
                            Pair pair2 = (Pair) obj2;
                            Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                            xi0.b bVar4 = (xi0.b) pair2.f186385a;
                            List list3 = (List) pair2.f186386b;
                            c0 c0Var2 = c0Var;
                            efm.r rVarO = c0Var2.d.O(list3, true, bVar4);
                            InvestAccountSelectorContract$SectionParams.CommoditySectionParams commoditySectionParams2 = params3;
                            if (commoditySectionParams2.f91717b == fdf.b.NONE) {
                                List list4 = list3;
                                ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                                Iterator it13 = list4.iterator();
                                while (it13.hasNext()) {
                                    arrayList2.add(((io3.d) it13.next()).f163147c);
                                }
                                rVarH = nim.a.w(((xv5.h) c0Var2.e).a(a.C1526a.f274716a), new qz9.o(c0Var2, 27, commoditySectionParams2, arrayList2));
                            } else {
                                rVarH = null;
                            }
                            if (rVarH == null) {
                                rVarH = te0.w.h(new Data(f0.f322471a, null, false, 2, null));
                            }
                            return kli.a.h(rVarO, rVarH);
                    }
                }
            })), new Function1() { // from class: rtl.z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    efm.r rVarH;
                    switch (i2) {
                        case 0:
                            List<Pair> it12 = (List) obj2;
                            Intrinsics.checkNotNullParameter(it12, "it");
                            ArrayList arrayList = new ArrayList();
                            for (Pair pair : it12) {
                                io3.d dVar = (io3.d) pair.f186385a;
                                xi0.b bVar2 = (xi0.b) pair.f186386b;
                                dj0.d dVarJ = z92.f.j(dVar);
                                InvestAccountSelectorContract$SectionParams.CommoditySectionParams commoditySectionParams = params3;
                                fdf.b bVar3 = commoditySectionParams.f91717b;
                                c0Var.getClass();
                                boolean zA = c0.a(dVarJ, bVar3);
                                boolean zB = c0.b(commoditySectionParams.f91716a, bVar2);
                                if (!cp5.d.y(bVar2) || !zA || !zB) {
                                    dVar = null;
                                }
                                if (dVar != null) {
                                    arrayList.add(dVar);
                                }
                            }
                            return arrayList;
                        default:
                            Pair pair2 = (Pair) obj2;
                            Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                            xi0.b bVar4 = (xi0.b) pair2.f186385a;
                            List list3 = (List) pair2.f186386b;
                            c0 c0Var2 = c0Var;
                            efm.r rVarO = c0Var2.d.O(list3, true, bVar4);
                            InvestAccountSelectorContract$SectionParams.CommoditySectionParams commoditySectionParams2 = params3;
                            if (commoditySectionParams2.f91717b == fdf.b.NONE) {
                                List list4 = list3;
                                ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                                Iterator it13 = list4.iterator();
                                while (it13.hasNext()) {
                                    arrayList2.add(((io3.d) it13.next()).f163147c);
                                }
                                rVarH = nim.a.w(((xv5.h) c0Var2.e).a(a.C1526a.f274716a), new qz9.o(c0Var2, 27, commoditySectionParams2, arrayList2));
                            } else {
                                rVarH = null;
                            }
                            if (rVarH == null) {
                                rVarH = te0.w.h(new Data(f0.f322471a, null, false, 2, null));
                            }
                            return kli.a.h(rVarO, rVarH);
                    }
                }
            }), new rsl.c(20)), h0.f322473a));
        } else {
            flowI4 = zi0.c.i(f0.f322471a);
        }
        yji.l.a1(this, flowI4, null, null, new t(this, null, 0), 3);
        yji.l.a1(this, this.f257337r.f2828l.w0(), null, null, new t(this, null, 5), 3);
        InvestAccountSelectorContract$Disclaimer investAccountSelectorContract$Disclaimer = investAccountSelectorScreenContract$InputData.d;
        if (investAccountSelectorContract$Disclaimer instanceof InvestAccountSelectorContract$Disclaimer.Securities) {
            flowI5 = nim.a.v(rd0.e.b(((ael.k) bVar).f(((InvestAccountSelectorContract$Disclaimer.Securities) investAccountSelectorContract$Disclaimer).f91709a)), new rsl.c(16));
        } else {
            if (!(investAccountSelectorContract$Disclaimer instanceof InvestAccountSelectorContract$Disclaimer.Commodities)) {
                throw new NoWhenBranchMatchedException();
            }
            flowI5 = zi0.c.i(h.f257323a);
        }
        yji.l.a1(this, flowI5, null, null, new t(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.z
    public final cli.g getState() {
        return (cli.g) this.f257338s.getValue();
    }
}
