package ael;

import com.revolut.shared.feature.wealth.domain.api.interactors.InstrumentTickerInteractor$Companion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f3656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f3657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f3658c;
    public final ybl.d d;
    public final k9l.a e;
    public final ybl.b f;

    public t(q pnlInteractor, r portfolioBalanceDetailsComputer, w portfolioBalancesSortingInteractor, ybl.d portfolioInteractor, k9l.a ratesInteractor, ybl.b instrumentTickerInteractor) {
        Intrinsics.checkNotNullParameter(pnlInteractor, "pnlInteractor");
        Intrinsics.checkNotNullParameter(portfolioBalanceDetailsComputer, "portfolioBalanceDetailsComputer");
        Intrinsics.checkNotNullParameter(portfolioBalancesSortingInteractor, "portfolioBalancesSortingInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.f3656a = pnlInteractor;
        this.f3657b = portfolioBalanceDetailsComputer;
        this.f3658c = portfolioBalancesSortingInteractor;
        this.d = portfolioInteractor;
        this.e = ratesInteractor;
        this.f = instrumentTickerInteractor;
    }

    public static ArrayList a(List list, xi0.b bVar) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((kel.g) it8.next()).getCurrency());
        }
        Set setI1 = zhm.d0.i1(arrayList);
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj2 : setI1) {
            if (!Intrinsics.f((String) obj2, bVar.f306286a)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
        for (String str : arrayList2) {
            xi0.b.Companion.getClass();
            arrayList3.add(new Pair(xi0.a.a(str), bVar));
        }
        return arrayList3;
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof kel.n) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((kel.n) it8.next()).e);
        }
        return arrayList2;
    }

    public static efm.r d(t tVar, String portfolioId, boolean z, n9l.b bVar, xi0.b targetCurrency, boolean z3, del.f fVar, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            ybl.b.Companion.getClass();
            bVar = InstrumentTickerInteractor$Companion.f105074b;
        }
        n9l.b bVar2 = bVar;
        if ((i & 16) != 0) {
            z3 = true;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            fVar = null;
        }
        tVar.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        return tVar.c(portfolioId, z4, bVar2, targetCurrency, z6, fVar, false);
    }

    public final efm.r c(String id10, boolean z, n9l.b bVar, xi0.b targetCurrency, boolean z3, del.f fVar, boolean z4) {
        vkm.f fVarF;
        Intrinsics.checkNotNullParameter(id10, "portfolioId");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(id10, "id");
        ybl.d dVar = this.d;
        if (z3) {
            fVarF = ((y) dVar).e(id10, z ? w4l.i.f294643c : w4l.h.f294642c);
        } else {
            ybl.c cVar = ybl.d.Companion;
            fVarF = ((y) dVar).f(3L, id10);
        }
        return pd.b.r(rd0.e.c(nim.a.v(fVarF, new aed.a(13)), kotlin.coroutines.g.f186406a), new s(0, targetCurrency, this, bVar, fVar, z4));
    }
}
