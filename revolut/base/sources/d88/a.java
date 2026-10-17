package d88;

import afa.s;
import akg.n;
import com.revolut.data.model.Data;
import com.revolut.feature.junior.accounts.api.JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids;
import d7j.o0;
import d7j.p0;
import eb8.l;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kl.b0;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import sf8.m;
import w4l.i;
import w4l.j;
import w4l.k;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f112137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f112138c;

    public /* synthetic */ a(g gVar, k kVar, int i) {
        this.f112136a = i;
        this.f112137b = gVar;
        this.f112138c = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        r rVarW;
        r rVarC;
        r rVar;
        String str;
        ArrayList arrayList;
        m mVar;
        r map;
        Flow flowE;
        a aVar = this;
        switch (aVar.f112136a) {
            case 0:
                List accountInfoList = (List) obj2;
                Intrinsics.checkNotNullParameter(accountInfoList, "accountInfoList");
                String str2 = "just(...)";
                if (accountInfoList.isEmpty()) {
                    rVarW = r.just(f0.f322471a);
                    Intrinsics.checkNotNullExpressionValue(rVarW, "just(...)");
                } else {
                    List list = accountInfoList;
                    ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        m mVar2 = (m) it8.next();
                        g gVar = aVar.f112137b;
                        wsg.b bVar = gVar.k;
                        gte.a aVar2 = gVar.f112154j;
                        i iVar = i.f294643c;
                        k kVar = aVar.f112138c;
                        boolean zEquals = kVar.equals(iVar);
                        l93.f fVar = gVar.d;
                        String str3 = mVar2.f262360a;
                        String juniorId = mVar2.f262361b;
                        sfm.b bVarK = l93.f.k(fVar, str3, b93.d.RETAIL, zEquals, 8);
                        Intrinsics.checkNotNullParameter("observeCardsData", "addition");
                        r rVarA = cj9.c.A(bVarK, null);
                        m78.d dVar = gVar.f112150b;
                        String str4 = mVar2.f262360a;
                        io3.d dVar2 = mVar2.f262363g;
                        r rVarB = dVar.b(str4, dVar2 != null ? dVar2.f163145a : null, kVar);
                        Intrinsics.checkNotNullParameter("observeTransactions", "addition");
                        r rVarA2 = cj9.c.A(rVarB, null);
                        n nVarA = ic8.b.a(gVar.e, juniorId, zEquals);
                        kotlin.coroutines.g gVar2 = kotlin.coroutines.g.f186406a;
                        r rVarC2 = rd0.e.c(nVarA, gVar2);
                        Iterator it9 = it8;
                        Intrinsics.checkNotNullParameter("observeCardRequestsPresent", "addition");
                        r rVarA3 = cj9.c.A(rVarC2, null);
                        if (mVar2.i) {
                            rVarC = rd0.e.c(gVar.f112152g.l(juniorId, kVar), gVar2);
                        } else {
                            rVarC = r.just(new Data(l.f124309a, null, false, 6, null));
                            Intrinsics.checkNotNullExpressionValue(rVarC, str2);
                        }
                        Intrinsics.checkNotNullParameter("observeGraduation", "addition");
                        r rVarA4 = cj9.c.A(rVarC, null);
                        b0 b0Var = gVar.f112153h;
                        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                        om8.c cVar = (om8.c) b0Var.f185144b;
                        w4l.h hVar = w4l.h.f294642c;
                        r rVarC3 = rd0.e.c(nim.a.v(cVar.a(juniorId, hVar), new m62.l(5)), gVar2);
                        Intrinsics.checkNotNullParameter("observePartnershipsActionAvailable", "addition");
                        r rVarA5 = cj9.c.A(rVarC3, null);
                        r rVarC4 = rd0.e.c(gVar.i.j(j.f294644c), gVar2);
                        Intrinsics.checkNotNullParameter("observeUser", "addition");
                        r rVarA6 = cj9.c.A(rVarC4, null);
                        JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids juniorAccountsApi$Toggles$RetailMultiCurrencyForKids = JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids.f76697c;
                        jte.d dVar3 = (jte.d) aVar2;
                        boolean zC = dVar3.c(juniorAccountsApi$Toggles$RetailMultiCurrencyForKids);
                        od0.i iVar2 = od0.i.f224256b;
                        if (zC) {
                            rVar = rVarA;
                            str = str2;
                            arrayList = arrayList2;
                            mVar = mVar2;
                            map = pd.b.r(rd0.e.c(bVar.d(str4, kVar), gVar2), new a(gVar, kVar, 1)).map(new d73.n(new p0(14), 8));
                            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        } else {
                            od0.i.Companion.getClass();
                            rVar = rVarA;
                            map = r.just(iVar2);
                            Intrinsics.checkNotNullExpressionValue(map, str2);
                            arrayList = arrayList2;
                            str = str2;
                            mVar = mVar2;
                        }
                        Intrinsics.checkNotNullParameter("observePocketsWithTransactions", "addition");
                        r rVarA7 = cj9.c.A(map, null);
                        if (dVar3.c(juniorAccountsApi$Toggles$RetailMultiCurrencyForKids)) {
                            flowE = mo3.a.e(boh.f.e(bVar.d(str4, kVar), new b(gVar, 0)), new o0(4), new o0(5));
                        } else {
                            od0.i.Companion.getClass();
                            flowE = new go.g(iVar2, 2);
                        }
                        r rVarC5 = rd0.e.c(flowE, gVar2);
                        Intrinsics.checkNotNullParameter("observeBalanceOfCurrentPockets", "addition");
                        r rVarA8 = cj9.c.A(rVarC5, null);
                        r rVarC6 = rd0.e.c(!dVar3.c(juniorAccountsApi$Toggles$RetailMultiCurrencyForKids) ? new go.g(new Data(Boolean.FALSE, null, false, 6, null), 2) : nim.a.v(bVar.e(hVar), new p0(12)), gVar2);
                        Intrinsics.checkNotNullParameter("observeMulticurrencyDiscoverAvailable", "addition");
                        r rVarA9 = cj9.c.A(rVarC6, null);
                        r rVarC7 = rd0.e.c(gVar.f112158p.a(juniorId, hVar), gVar2);
                        Intrinsics.checkNotNullParameter("observeJuniorKyc", "addition");
                        r map2 = te0.w.t(rVar, rVarA2, rVarA3, rVarA4, rVarA5, rVarA6, rVarA7, rVarA8, rVarA9, cj9.c.A(rVarC7, null)).map(new d73.n(new d34.b(mVar, 19), 7));
                        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                        Intrinsics.checkNotNullParameter(map2, "<this>");
                        ArrayList arrayList3 = arrayList;
                        arrayList3.add(map2);
                        aVar = this;
                        arrayList2 = arrayList3;
                        it8 = it9;
                        str2 = str;
                    }
                    rVarW = te0.w.w(arrayList2);
                }
                r map3 = rVarW.map(new d73.n(new p0(13), 6));
                Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
                return map3;
            default:
                Pair walletWithPockets = (Pair) obj2;
                Intrinsics.checkNotNullParameter(walletWithPockets, "walletWithPockets");
                fo3.c cVar2 = (fo3.c) walletWithPockets.f186385a;
                ArrayList<io3.d> arrayListA = g.a((List) walletWithPockets.f186386b);
                if (arrayListA.isEmpty()) {
                    r rVarJust = r.just(new Data(f0.f322471a, null, false, 6, null));
                    Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                    return rVarJust;
                }
                ArrayList arrayList4 = new ArrayList(w.t(arrayListA, 10));
                for (io3.d dVar4 : arrayListA) {
                    arrayList4.add(nim.a.w(aVar.f112137b.f112150b.b(cVar2.f136801a, dVar4.f163145a, aVar.f112138c), new s(dVar4, 3)));
                }
                Intrinsics.checkNotNullParameter(arrayList4, "<this>");
                return mif.a.l(arrayList4);
        }
    }
}
