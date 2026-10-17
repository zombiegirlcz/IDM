package dqj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.impl.AnalyticsDatabase;
import com.revolut.retail.feature.impl.analytics_cycle.air_tip.network.AnalyticsAirTipService;
import com.revolut.retail.feature.impl.analytics_cycle.budget_suggestion.network.BudgetSuggestionConfigService;
import com.revolut.retail.feature.impl.analytics_cycle.network.AnalyticsSpendingCycleService;
import com.revolut.retail.feature.impl.analytics_cycle.network.TransactionAnalyticsService;
import com.revolut.retail.feature.impl.balance_history.network.BalanceHistoryService;
import com.revolut.retail.feature.impl.budget.database.BudgetHistoryDatabase;
import com.revolut.retail.feature.impl.budget.network.BudgetService;
import com.revolut.retail.feature.impl.custom_assets.network.CustomAssetsApiService;
import com.revolut.retail.feature.impl.travel.network.TravelService;
import com.revolut.retail.feature.impl.trips.network.TripsApiService;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes13.dex */
public final class q implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f117009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f117010b;

    public q(r rVar, int i) {
        this.f117009a = rVar;
        this.f117010b = i;
    }

    @Override // phm.a
    public final Object get() {
        r rVar = this.f117009a;
        int i = this.f117010b;
        switch (i) {
            case 0:
                je0.d dVarB = rVar.f117011a.b();
                vc.s.j(dVarB);
                yk0.a aVarB = rVar.f117013b.b();
                vc.s.j(aVarB);
                xe0.f fVarF = rVar.f117011a.f();
                vc.s.j(fVarF);
                return db5.e.j(dVarB, fVarF, aVarB);
            case 1:
                je0.d dVarB2 = rVar.f117011a.b();
                vc.s.j(dVarB2);
                yk0.a aVarB2 = rVar.f117013b.b();
                vc.s.j(aVarB2);
                xe0.f fVarF2 = rVar.f117011a.f();
                vc.s.j(fVarF2);
                return d.D(dVarB2, fVarF2, aVarB2);
            case 2:
                je0.d dVar = (je0.d) rVar.f117030r.get();
                yk0.a aVarB3 = rVar.f117013b.b();
                vc.s.j(aVarB3);
                xe0.f fVarF3 = rVar.f117011a.f();
                vc.s.j(fVarF3);
                return d.q(dVar, fVarF3, aVarB3);
            case 3:
                Json json = (Json) rVar.f117029q.get();
                me0.a aVarE = rVar.f117011a.e();
                vc.s.j(aVarE);
                return d.s(json, aVarE);
            case 4:
                ee0.a aVar = rVar.f117011a;
                Json jsonA = fe0.d.a();
                d.r(jsonA);
                return jsonA;
            case 5:
                je0.d dVar2 = (je0.d) rVar.f117030r.get();
                yk0.a aVarB4 = rVar.f117013b.b();
                vc.s.j(aVarB4);
                xe0.f fVarF4 = rVar.f117011a.f();
                vc.s.j(fVarF4);
                return d.A(dVar2, fVarF4, aVarB4);
            case 6:
                je0.d dVar3 = (je0.d) rVar.f117030r.get();
                yk0.a aVarB5 = rVar.f117013b.b();
                vc.s.j(aVarB5);
                xe0.f fVarF5 = rVar.f117011a.f();
                vc.s.j(fVarF5);
                return db5.e.m(dVar3, fVarF5, aVarB5);
            case 7:
                je0.d dVar4 = (je0.d) rVar.f117030r.get();
                yk0.a aVarB6 = rVar.f117013b.b();
                vc.s.j(aVarB6);
                xe0.f fVarF6 = rVar.f117011a.f();
                vc.s.j(fVarF6);
                return db5.e.k(dVar4, fVarF6, aVarB6);
            case 8:
                je0.d dVar5 = (je0.d) rVar.f117030r.get();
                yk0.a aVarB7 = rVar.f117013b.b();
                vc.s.j(aVarB7);
                xe0.f fVarF7 = rVar.f117011a.f();
                vc.s.j(fVarF7);
                return d.y(dVar5, fVarF7, aVarB7);
            case 9:
                je0.d dVar6 = (je0.d) rVar.f117030r.get();
                yk0.a aVarB8 = rVar.f117013b.b();
                vc.s.j(aVarB8);
                xe0.f fVarF8 = rVar.f117011a.f();
                vc.s.j(fVarF8);
                return d.j(dVar6, fVarF8, aVarB8);
            case 10:
                je0.d dVarB3 = rVar.f117011a.b();
                vc.s.j(dVarB3);
                yk0.a aVarB9 = rVar.f117013b.b();
                vc.s.j(aVarB9);
                xe0.f fVarF9 = rVar.f117011a.f();
                vc.s.j(fVarF9);
                return db5.e.h(dVarB3, fVarF9, aVarB9);
            case 11:
                je0.d dVarB4 = rVar.f117011a.b();
                vc.s.j(dVarB4);
                yk0.a aVarB10 = rVar.f117013b.b();
                vc.s.j(aVarB10);
                xe0.f fVarF10 = rVar.f117011a.f();
                vc.s.j(fVarF10);
                return d.e(dVarB4, fVarF10, aVarB10);
            case 12:
                z70.a aVarF = rVar.d.f();
                vc.s.j(aVarF);
                yk0.a aVarB11 = rVar.f117013b.b();
                vc.s.j(aVarB11);
                return d.k(aVarF, aVarB11, ((c21.b) rVar.e).b(), ImmutableSet.of((qsj.c) new xsj.a((Json) rVar.f117029q.get()), (qsj.c) new xsj.d((Json) rVar.f117029q.get()), (qsj.c) new xsj.b((Json) rVar.f117029q.get()), (qsj.c) new xsj.c((Json) rVar.f117029q.get()), (qsj.c) new rvj.a((Json) rVar.f117029q.get()), new qsj.c((Json) rVar.f117029q.get()), (qsj.c[]) new ce0.h[]{new qsj.a((Json) rVar.f117029q.get()), new qsj.b((Json) rVar.f117029q.get())}));
            case 13:
                z70.a aVarF2 = rVar.d.f();
                vc.s.j(aVarF2);
                yk0.a aVarB12 = rVar.f117013b.b();
                vc.s.j(aVarB12);
                return d.d(aVarF2, aVarB12, ((c21.b) rVar.e).b(), new sqj.a((Json) rVar.f117029q.get()));
            case 14:
                xe0.f fVarF11 = rVar.f117011a.f();
                vc.s.j(fVarF11);
                yk0.a aVarB13 = rVar.f117013b.b();
                vc.s.j(aVarB13);
                je0.d dVarB5 = rVar.f117011a.b();
                vc.s.j(dVarB5);
                return d.l(dVarB5, fVarF11, aVarB13);
            case 15:
                jqj.h hVar = (jqj.h) rVar.F.get();
                l80.e eVarH = rVar.d.h();
                vc.s.j(eVarH);
                return new eqj.d(hVar, eVarH);
            case 16:
                return new jqj.h((ue0.c) rVar.o.get(), new ne0.d(), (AnalyticsSpendingCycleService) rVar.D.get(), (kzi.a) rVar.E.get());
            case 17:
                Retrofit retrofitI = ((c21.b) rVar.e).i();
                vc.s.j(retrofitI);
                return db5.e.i(retrofitI);
            case 18:
                qd0.b bVarN = rVar.d.n();
                vc.s.j(bVarN);
                l80.e eVarH2 = rVar.d.h();
                vc.s.j(eVarH2);
                return new gqj.c(bVarN, eVarH2);
            case 19:
                tzi.a aVarA = rVar.f.a();
                vc.s.j(aVarA);
                return new eqj.f(aVarA);
            case 20:
                return new rpj.a((tpj.d) rVar.J.get());
            case 21:
                return new tpj.d((AnalyticsAirTipService) rVar.I.get(), new ne0.d(), (ue0.c) rVar.f117038y.get());
            case 22:
                Retrofit retrofitI2 = ((c21.b) rVar.e).i();
                vc.s.j(retrofitI2);
                return db5.e.g(retrofitI2);
            case 23:
                return new uqj.b((wqj.a) rVar.N.get(), (wpj.a) rVar.P.get(), rVar.f117018g.a());
            case 24:
                BudgetService budgetService = (BudgetService) rVar.L.get();
                ne0.d dVar7 = new ne0.d();
                ue0.c cVar = (ue0.c) rVar.u.get();
                rqj.h hVar2 = (rqj.h) rVar.M.get();
                l80.e eVarH3 = rVar.d.h();
                vc.s.j(eVarH3);
                ze0.a aVarA2 = rVar.f117011a.a();
                vc.s.j(aVarA2);
                return new wqj.j(budgetService, dVar7, cVar, hVar2, eVarH3, aVarA2);
            case 25:
                Retrofit retrofitI3 = ((c21.b) rVar.e).i();
                vc.s.j(retrofitI3);
                return db5.e.l(retrofitI3);
            case 26:
                return d.c((BudgetHistoryDatabase) rVar.B.get());
            case 27:
                return new wpj.e((BudgetSuggestionConfigService) rVar.O.get(), new ne0.d(), (ue0.c) rVar.z.get());
            case 28:
                Retrofit retrofitI4 = ((c21.b) rVar.e).i();
                vc.s.j(retrofitI4);
                return db5.e.n(retrofitI4);
            case 29:
                l80.e eVarH4 = rVar.d.h();
                vc.s.j(eVarH4);
                return new gqj.h(eVarH4);
            case 30:
                qd0.b bVarN2 = rVar.d.n();
                vc.s.j(bVarN2);
                t70.g gVarO = rVar.d.o();
                vc.s.j(gVarO);
                return new gqj.f(bVarN2, gVarO);
            case 31:
                return new eqj.g((jqj.m) rVar.W.get(), rVar.f117018g.b(), (fqj.a) rVar.V.get());
            case 32:
                TransactionAnalyticsService transactionAnalyticsService = (TransactionAnalyticsService) rVar.T.get();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) rVar.f117019h).c();
                vc.s.j(aVarC);
                return new jqj.m(transactionAnalyticsService, aVarC, (fqj.a) rVar.V.get());
            case 33:
                Retrofit retrofitI5 = ((c21.b) rVar.e).i();
                vc.s.j(retrofitI5);
                return d.x(retrofitI5);
            case 34:
                lfm.c cVar2 = (lfm.c) ((c21.b) rVar.e).U.get();
                vc.s.j(cVar2);
                b80.c cVarP = rVar.d.p();
                vc.s.j(cVarP);
                return new fqj.h(cVar2, cVarP, (jqj.l) rVar.U.get(), rVar.f117018g.b(), rVar.i.a());
            case 35:
                ue0.c cVar3 = (ue0.c) rVar.C.get();
                TransactionAnalyticsService transactionAnalyticsService2 = (TransactionAnalyticsService) rVar.T.get();
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) rVar.f117019h).c();
                vc.s.j(aVarC2);
                return new jqj.l(cVar3, transactionAnalyticsService2, aVarC2);
            case 36:
                return new ftj.a();
            case 37:
                return new dtj.a(rVar.f117021j.g(), (zsc.s) rVar.Z.get());
            case 38:
                j.a();
                return zsc.r.f324883a;
            case 39:
                return new nqj.c((qqj.h) rVar.f117017e0.get(), (CoroutineScope) rVar.f0.get());
            case 40:
                BalanceHistoryService balanceHistoryService = (BalanceHistoryService) rVar.c0.get();
                lqj.a aVar2 = (lqj.a) rVar.f117016d0.get();
                ne0.d dVar8 = new ne0.d();
                ue0.c cVar4 = (ue0.c) rVar.v.get();
                l80.e eVarH5 = rVar.d.h();
                vc.s.j(eVarH5);
                return new qqj.h(balanceHistoryService, aVar2, dVar8, cVar4, eVarH5);
            case 41:
                ik0.b bVarM = ((nj0.d) rVar.k).m();
                vc.s.j(bVarM);
                return c.a(bVarM, (Converter.Factory) rVar.f117014b0.get());
            case 42:
                return p.a((Json) rVar.f117029q.get());
            case 43:
                return d.b((AnalyticsDatabase) rVar.A.get());
            case 44:
                return m.a();
            case 45:
                xvj.e eVar = (xvj.e) rVar.j0.get();
                jla.h hVarA = rVar.f117023l.a();
                gte.a aVarB14 = rVar.f117024m.b();
                vc.s.j(aVarB14);
                return new vvj.g(eVar, hVarA, aVarB14);
            case 46:
                return new xvj.e((qvj.a) rVar.f117020h0.get(), new ne0.d(), (TripsApiService) rVar.i0.get(), (ue0.c) rVar.f117034t.get(), new i90.b());
            case 47:
                return d.z((AnalyticsDatabase) rVar.A.get());
            case 48:
                ik0.b bVarM2 = ((nj0.d) rVar.k).m();
                vc.s.j(bVarM2);
                return g.a(bVarM2, (Converter.Factory) rVar.f117014b0.get());
            case 49:
                ouj.a aVar3 = (ouj.a) rVar.m0.get();
                toa.a aVarA3 = rVar.f117025n.a();
                vc.s.j(aVarA3);
                jla.h hVarA2 = rVar.f117023l.a();
                gte.a aVarB15 = rVar.f117024m.b();
                vc.s.j(aVarB15);
                return new muj.c(aVar3, aVarA3, hVarA2, aVarB15);
            case 50:
                return new ouj.d((TravelService) rVar.l0.get(), new ne0.d(), (ue0.c) rVar.f117036w.get());
            case 51:
                ik0.b bVarM3 = ((nj0.d) rVar.k).m();
                vc.s.j(bVarM3);
                return f.a(bVarM3, (Converter.Factory) rVar.f117014b0.get());
            case 52:
                return new tsj.g((vsj.a) rVar.f117031r0.get(), rVar.f117023l.a());
            case 53:
                return new vsj.q((psj.a) rVar.f117027o0.get(), (psj.b) rVar.p0.get(), (CustomAssetsApiService) rVar.q0.get(), new ne0.d(), (ue0.c) rVar.f117037x.get());
            case 54:
                return d.i((AnalyticsDatabase) rVar.A.get());
            case 55:
                return d.n((AnalyticsDatabase) rVar.A.get());
            case 56:
                ik0.b bVarM4 = ((nj0.d) rVar.k).m();
                vc.s.j(bVarM4);
                return e.a(bVarM4, (Converter.Factory) rVar.f117014b0.get());
            case 57:
                return new ktj.a();
            default:
                throw new AssertionError(i);
        }
    }
}
