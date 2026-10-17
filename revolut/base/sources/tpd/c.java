package tpd;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.vaults.api.VaultsApi$Toggles;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestination;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import gim.i;
import go.g;
import h6e.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s6e.z;
import twb.b0;
import upd.h;
import upd.l;
import upd.n;
import upd.p;
import upd.r;
import vkm.q;
import vkm.v1;
import vkm.y;
import yhm.o;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f273344w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, List list, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
        this.f273344w = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, this.f273344w, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar;
        y yVar2;
        Flow flowV;
        xi0.b targetCurrency = (xi0.b) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = this.v;
        h hVar = fVar.f273352g;
        Continuation continuation = null;
        y yVarA = f.a(fVar, q.Q(toh.d.g(fVar.f273350b, null, 3), new d(continuation, fVar, targetCurrency, 1)));
        p pVar = fVar.e;
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        y yVarE = rd0.e.e(new v1(new b0(pVar, continuation, 28)), h0.f322473a, new pc2.d(3, 29, null));
        z zVar = (z) pVar.f281984b;
        f.e eVar = f.e.f149640a;
        w4l.h hVar2 = w4l.h.f294642c;
        y yVarY = cj9.c.y(zVar.w(eVar, hVar2));
        y yVarY2 = cj9.c.y(zVar.w(f.c.f149638a, hVar2));
        y yVarY3 = cj9.c.y(zVar.w(f.b.f149637a, hVar2));
        Flow flowY = cj9.c.y(zVar.w(f.d.f149639a, hVar2));
        jte.d dVar = (jte.d) pVar.f;
        if (!dVar.c(AnalyticsFeatureApi$Toggles.AnalyticsIncomeSorterJointSavingsAndPockets.f87385c) || !dVar.c(VaultsApi$Toggles.JointSubaccounts.f94695c)) {
            flowY = new g(new Data(f0.f322471a, null, false, 6, null), 2);
        }
        y yVarA2 = f.a(fVar, xam.a.h(new upd.o(pVar, targetCurrency, (Continuation) null), nim.a.u(new upd.o((Continuation) null, pVar, targetCurrency), u0.m(u0.i(yVarE, yVarY, yVarY2), u0.m(yVarY3, flowY)))));
        y yVarA3 = f.a(fVar, q.Q(new v1(new sma.f(fVar, (Continuation) null, 23)), new d(null, fVar, targetCurrency, 0)));
        y yVarA4 = f.a(fVar, hVar.a(com.revolut.feature.spending_analytics.api.models.income_sorter.a.ISA));
        y yVarA5 = f.a(fVar, hVar.a(com.revolut.feature.spending_analytics.api.models.income_sorter.a.PERSONAL_JISA));
        y yVarA6 = f.a(fVar, hVar.a(com.revolut.feature.spending_analytics.api.models.income_sorter.a.CUSTODIAN_JISA));
        y yVarA7 = f.a(fVar, hVar.a(com.revolut.feature.spending_analytics.api.models.income_sorter.a.GIA));
        n nVar = fVar.f273353h;
        y yVarA8 = f.a(fVar, xam.a.h(new l(nVar, null), rd0.e.b(((cpj.b) nVar.f281978a).k(yoj.c.ROBO, yoj.d.DISABLED))));
        wsg.n nVar2 = fVar.f273349a;
        AccountId.Personal personal = AccountId.Personal.f51414a;
        y yVarA9 = f.a(fVar, nim.a.v(rd0.e.b(osg.b.g(nVar2, hVar2, null, null, null, null, null, personal, 62)), new b(targetCurrency, personal, 0)));
        r rVar = fVar.i;
        List list = this.f273344w;
        if (list == null) {
            flowV = new g(new Data(f0.f322471a, null, false, 6, null), 2);
            yVar = yVarA7;
            yVar2 = yVarA8;
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                Iterator it9 = it8;
                IncomeSorterDestination incomeSorterDestination = (IncomeSorterDestination) it8.next();
                y yVar3 = yVarA7;
                IncomeSorterDestinationId incomeSorterDestinationId = incomeSorterDestination.f99167b;
                y yVar4 = yVarA8;
                if (incomeSorterDestinationId instanceof IncomeSorterDestinationId.Beneficiary) {
                    arrayList2.add(incomeSorterDestination);
                } else if (incomeSorterDestinationId instanceof IncomeSorterDestinationId.PeerToPeer) {
                    arrayList.add(incomeSorterDestination);
                } else if (!(incomeSorterDestinationId instanceof IncomeSorterDestinationId.Pocket) && !(incomeSorterDestinationId instanceof IncomeSorterDestinationId.Portfolio) && !(incomeSorterDestinationId instanceof IncomeSorterDestinationId.Savings) && !(incomeSorterDestinationId instanceof IncomeSorterDestinationId.Crypto)) {
                    throw new NoWhenBranchMatchedException();
                }
                yVarA7 = yVar3;
                it8 = it9;
                yVarA8 = yVar4;
            }
            yVar = yVarA7;
            yVar2 = yVarA8;
            cl3.a aVar2 = rVar.f281987a;
            ArrayList arrayList3 = new ArrayList(w.t(arrayList, 10));
            Iterator it10 = arrayList.iterator();
            while (it10.hasNext()) {
                cl3.a aVar3 = aVar2;
                IncomeSorterDestinationId incomeSorterDestinationId2 = ((IncomeSorterDestination) it10.next()).f99167b;
                Intrinsics.i(incomeSorterDestinationId2, "null cannot be cast to non-null type com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId.PeerToPeer");
                arrayList3.add(((IncomeSorterDestinationId.PeerToPeer) incomeSorterDestinationId2).f99172a);
                it10 = it10;
                aVar2 = aVar3;
            }
            wl3.h hVar3 = (wl3.h) aVar2;
            flowV = nim.a.v(u0.m(new tse.c(yh5.b.d(rd0.e.b(hVar3.o("")), rd0.e.b(hVar3.k(arrayList3))), arrayList, 23), rd0.e.b(nim.a.w(w2j.a.d(rVar.f281988b, null, false, null, 5), new ua2.r(3, arrayList2)))), new upc.b(14));
        }
        y yVarA10 = f.a(fVar, flowV);
        upd.b bVar = fVar.f273354j;
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        return nim.a.u(new tk9.i(2, 1, null), u0.j(u0.i(yVarA, yVarA2, yVarA3), u0.i(yVarA4, yVarA5, yVarA6), u0.i(yVar, yVar2, yVarA9), u0.m(yVarA10, f.a(fVar, !((jte.d) bVar.f281957a).c(WealthUiApi$Toggles.CryptoIncomeSorter.f95853c) ? new g(new Data(f0.f322471a, null, false, 6, null), 2) : boh.f.e(rd0.e.b(((ji5.e) bVar.f281958b).f()), new uif.d(bVar, targetCurrency, 13))))));
    }
}
