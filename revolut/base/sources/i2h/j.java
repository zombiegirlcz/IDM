package i2h;

import cli.y;
import com.revolut.feature.wealth.asset.selection.impl.ui.screens.cash.CashSelectionControllerContract$InputData;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zh9.u0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends oki.h implements e {
    public final CashSelectionControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wzg.a f157941p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e2h.b f157942q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e2h.a f157943r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f157944s;

    public j(CashSelectionControllerContract$InputData inputData, wzg.a cashHoldingsInteractor, e2h.b selectedAssetsDataProvider, e2h.a assetSelectionSearchQueryProvider, l stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cashHoldingsInteractor, "cashHoldingsInteractor");
        Intrinsics.checkNotNullParameter(selectedAssetsDataProvider, "selectedAssetsDataProvider");
        Intrinsics.checkNotNullParameter(assetSelectionSearchQueryProvider, "assetSelectionSearchQueryProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f157941p = cashHoldingsInteractor;
        this.f157942q = selectedAssetsDataProvider;
        this.f157943r = assetSelectionSearchQueryProvider;
        this.f157944s = mra.d.b(this, new f(inputData.f95401a, inputData.f95402b, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        CashSelectionControllerContract$InputData cashSelectionControllerContract$InputData = this.o;
        TradingAccountType type = cashSelectionControllerContract$InputData.d;
        n9l.b period = n9l.b.SEC_3;
        String str = cashSelectionControllerContract$InputData.e;
        szg.c cashHoldingFilter = str != null ? new szg.b(str) : szg.a.f266811a;
        c9h.k kVar = (c9h.k) this.f157941p;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(cashHoldingFilter, "cashHoldingFilter");
        w4l.h portfolioLoadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(portfolioLoadingStrategy, "portfolioLoadingStrategy");
        Flow flowE = boh.f.e(kVar.m(new c9h.f(type), cashHoldingFilter, portfolioLoadingStrategy), new c9h.e(kVar, period, 0));
        final int i = 0;
        t38.e eVarM = u0.m(nim.a.v(flowE, new Function1(this) { // from class: i2h.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f157939b;

            {
                this.f157939b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        List cashHoldings = (List) obj2;
                        Intrinsics.checkNotNullParameter(cashHoldings, "cashHoldings");
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : cashHoldings) {
                            if (!this.f157939b.o.f95403c.contains(((kel.c) obj3).f183153a.f183148a.e)) {
                                arrayList.add(obj3);
                            }
                        }
                        return arrayList;
                    default:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        ?? arrayList2 = (List) pair.f186385a;
                        String str2 = (String) pair.f186386b;
                        e2h.b bVar = this.f157939b.f157942q;
                        Iterable iterable = (Iterable) arrayList2;
                        ArrayList arrayList3 = new ArrayList(w.t(iterable, 10));
                        Iterator it8 = iterable.iterator();
                        while (it8.hasNext()) {
                            arrayList3.add(new y1h.a(((kel.c) it8.next()).f183153a));
                        }
                        bVar.a(d0.i1(arrayList3));
                        if (!kotlin.text.d0.W(str2)) {
                            arrayList2 = new ArrayList();
                            for (Object obj4 : iterable) {
                                kel.c cVar = (kel.c) obj4;
                                if (jli.g.h(cVar.f183153a.f183148a.f, str2) || jli.g.h(cVar.getCurrency(), str2)) {
                                    arrayList2.add(obj4);
                                }
                            }
                        }
                        return new d(str2, arrayList2);
                }
            }
        }), this.f157943r.f122095b);
        final int i2 = 1;
        yji.l.b1(this, nim.a.v(eVarM, new Function1(this) { // from class: i2h.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f157939b;

            {
                this.f157939b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        List cashHoldings = (List) obj2;
                        Intrinsics.checkNotNullParameter(cashHoldings, "cashHoldings");
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : cashHoldings) {
                            if (!this.f157939b.o.f95403c.contains(((kel.c) obj3).f183153a.f183148a.e)) {
                                arrayList.add(obj3);
                            }
                        }
                        return arrayList;
                    default:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        ?? arrayList2 = (List) pair.f186385a;
                        String str2 = (String) pair.f186386b;
                        e2h.b bVar = this.f157939b.f157942q;
                        Iterable iterable = (Iterable) arrayList2;
                        ArrayList arrayList3 = new ArrayList(w.t(iterable, 10));
                        Iterator it8 = iterable.iterator();
                        while (it8.hasNext()) {
                            arrayList3.add(new y1h.a(((kel.c) it8.next()).f183153a));
                        }
                        bVar.a(d0.i1(arrayList3));
                        if (!kotlin.text.d0.W(str2)) {
                            arrayList2 = new ArrayList();
                            for (Object obj4 : iterable) {
                                kel.c cVar = (kel.c) obj4;
                                if (jli.g.h(cVar.f183153a.f183148a.f, str2) || jli.g.h(cVar.getCurrency(), str2)) {
                                    arrayList2.add(obj4);
                                }
                            }
                        }
                        return new d(str2, arrayList2);
                }
            }
        }), null, new i(this, null, 0), 3);
        yji.l.b1(this, this.f157942q.d, null, new i(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f157944s;
    }
}
