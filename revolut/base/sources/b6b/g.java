package b6b;

import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsAccountsService;
import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsBillingService;
import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsPlanAdditionalValueService;
import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsPlansService;
import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsPromoCodeService;
import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsTransactionsService;
import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsWidgetService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import ulm.b1;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f12592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12593b;

    public g(h hVar, int i) {
        this.f12592a = hVar;
        this.f12593b = i;
    }

    @Override // phm.a
    public final Object get() {
        h hVar = this.f12592a;
        int i = this.f12593b;
        switch (i) {
            case 0:
                sri.m mVarD = ((g8b.a) hVar.f12597a).d();
                vc.s.j(mVarD);
                return new a6b.g(mVarD, (c6b.j) hVar.f12604m.get(), (q5b.c) hVar.f12605n.get(), (c6b.m) hVar.o.get());
            case 1:
                return new c6b.j((y5b.e0) hVar.f12603l.get());
            case 2:
                return new y5b.e0((CobrandedCardsPromoCodeService) hVar.f12602j.get(), (ue0.c) hVar.k.get());
            case 3:
                ik0.b retrofitFactory = ((nj0.d) hVar.f12598b).m();
                vc.s.j(retrofitFactory);
                ek.a converterFactory = ((nj0.d) hVar.f12598b).d();
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(CobrandedCardsPromoCodeService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                CobrandedCardsPromoCodeService cobrandedCardsPromoCodeService = (CobrandedCardsPromoCodeService) objCreate;
                vc.s.k(cobrandedCardsPromoCodeService);
                return cobrandedCardsPromoCodeService;
            case 4:
                je0.d mapper = hVar.f12599c.d();
                vc.s.j(mapper);
                yk0.a databaseSessionProvider = hVar.d.b();
                vc.s.j(databaseSessionProvider);
                xe0.f storageFactory = hVar.f12599c.f();
                vc.s.j(storageFactory);
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "cobranded_cards_promo_code", mapper, 0, null, 56);
            case 5:
                jla.h hVarA = hVar.e.a();
                fk3.a aVarA = hVar.f.a();
                vc.s.j(aVarA);
                return new c6b.p(hVarA, aVarA);
            case 6:
                return new c6b.m(hVar.f12600g.e());
            case 7:
                y5b.c0 c0Var = (y5b.c0) hVar.u.get();
                y5b.i0 i0Var = (y5b.i0) hVar.f12612x.get();
                fk3.a aVarA2 = hVar.f.a();
                vc.s.j(aVarA2);
                q5b.a aVar = (q5b.a) hVar.C.get();
                ffk.t tVarF = hVar.f12601h.f();
                vc.s.j(tVarF);
                return new c6b.i(c0Var, i0Var, aVarA2, aVar, tVarF);
            case 8:
                return new y5b.c0((CobrandedCardsPlansService) hVar.f12608r.get(), (ue0.c) hVar.f12609s.get(), (ne0.j) hVar.f12610t.get(), new v5b.d(fe0.d.a()));
            case 9:
                ik0.b retrofitFactory2 = ((nj0.d) hVar.f12598b).m();
                vc.s.j(retrofitFactory2);
                Json json = (Json) hVar.f12607q.get();
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory2, "retrofitFactory");
                Intrinsics.checkNotNullParameter(json, "json");
                Object objCreate2 = ik0.b.a(retrofitFactory2, null, null, p.a.g(b1.Companion, "application/json", json), null, 27).create(CobrandedCardsPlansService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                CobrandedCardsPlansService cobrandedCardsPlansService = (CobrandedCardsPlansService) objCreate2;
                vc.s.k(cobrandedCardsPlansService);
                return cobrandedCardsPlansService;
            case 10:
                ee0.a aVar2 = hVar.f12599c;
                Json json2 = fe0.d.a();
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(json2, "json");
                return ue0.e.b(json2, new b(json2, 0));
            case 11:
                je0.d mapper2 = hVar.f12599c.d();
                vc.s.j(mapper2);
                yk0.a databaseSessionProvider2 = hVar.d.b();
                vc.s.j(databaseSessionProvider2);
                xe0.f fVarF = hVar.f12599c.f();
                vc.s.j(fVarF);
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper2, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                return xe0.f.f(fVarF, databaseSessionProvider2, "cobranded_cards_plans", mapper2, 10, zhm.v.k(v0.a.c(fVarF, "storageFactory", 1, 2), new exa.a(2, 3, 5), new exa.a(3, 4, 5), new exa.a(4, 5, 5), new exa.a(5, 6, 5), new exa.a(6, 7, 5), new exa.a(7, 8, 5), new exa.a(8, 9, 5), new exa.a(9, 10, 5)), 32);
            case 12:
                return new ne0.d();
            case 13:
                return new y5b.i0((CobrandedCardsWidgetService) hVar.v.get(), (ue0.c) hVar.f12611w.get(), (ne0.j) hVar.f12610t.get());
            case 14:
                ik0.b retrofitFactory3 = ((nj0.d) hVar.f12598b).m();
                vc.s.j(retrofitFactory3);
                ek.a converterFactory2 = ((nj0.d) hVar.f12598b).d();
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory3, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory2, "converterFactory");
                Object objCreate3 = ik0.b.a(retrofitFactory3, null, null, converterFactory2, null, 27).create(CobrandedCardsWidgetService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate3, "create(...)");
                CobrandedCardsWidgetService cobrandedCardsWidgetService = (CobrandedCardsWidgetService) objCreate3;
                vc.s.k(cobrandedCardsWidgetService);
                return cobrandedCardsWidgetService;
            case 15:
                je0.d mapper3 = hVar.f12599c.d();
                vc.s.j(mapper3);
                yk0.a databaseSessionProvider3 = hVar.d.b();
                vc.s.j(databaseSessionProvider3);
                xe0.f storageFactory2 = hVar.f12599c.f();
                vc.s.j(storageFactory2);
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper3, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider3, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                return xe0.f.f(storageFactory2, databaseSessionProvider3, "cobranded_cards_widget", mapper3, 0, null, 56);
            case 16:
                fk3.a aVarA3 = hVar.f.a();
                vc.s.j(aVarA3);
                return new c6b.e(aVarA3, hVar.a());
            case 17:
                je0.d mapper4 = hVar.f12599c.d();
                vc.s.j(mapper4);
                yk0.a databaseSessionProvider4 = hVar.d.b();
                vc.s.j(databaseSessionProvider4);
                xe0.f storageFactory3 = hVar.f12599c.f();
                vc.s.j(storageFactory3);
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper4, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider4, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory3, "storageFactory");
                return xe0.f.f(storageFactory3, databaseSessionProvider4, "cobranded_cards_accounts", mapper4, 0, null, 56);
            case 18:
                je0.d mapper5 = hVar.f12599c.d();
                vc.s.j(mapper5);
                yk0.a databaseSessionProvider5 = hVar.d.b();
                vc.s.j(databaseSessionProvider5);
                xe0.f storageFactory4 = hVar.f12599c.f();
                vc.s.j(storageFactory4);
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper5, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider5, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory4, "storageFactory");
                return xe0.f.f(storageFactory4, databaseSessionProvider5, "cobranded_cards_transactions", mapper5, 0, null, 56);
            case 19:
                je0.d mapper6 = hVar.f12599c.d();
                vc.s.j(mapper6);
                yk0.a databaseSessionProvider6 = hVar.d.b();
                vc.s.j(databaseSessionProvider6);
                xe0.f storageFactory5 = hVar.f12599c.f();
                vc.s.j(storageFactory5);
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper6, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider6, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory5, "storageFactory");
                return xe0.f.f(storageFactory5, databaseSessionProvider6, "cobranded_cards_billing", mapper6, 0, null, 56);
            case 20:
                je0.d mapper7 = hVar.f12599c.d();
                vc.s.j(mapper7);
                yk0.a databaseSessionProvider7 = hVar.d.b();
                vc.s.j(databaseSessionProvider7);
                xe0.f storageFactory6 = hVar.f12599c.f();
                vc.s.j(storageFactory6);
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper7, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider7, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory6, "storageFactory");
                return xe0.f.f(storageFactory6, databaseSessionProvider7, "cobranded_cards_card_benefits_state", mapper7, 0, null, 56);
            case 21:
                return new c6b.f((y5b.u) hVar.F.get());
            case 22:
                return new y5b.u((CobrandedCardsPlanAdditionalValueService) hVar.E.get());
            case 23:
                ik0.b retrofitFactory4 = ((nj0.d) hVar.f12598b).m();
                vc.s.j(retrofitFactory4);
                ek.a converterFactory3 = ((nj0.d) hVar.f12598b).d();
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory4, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory3, "converterFactory");
                Object objCreate4 = ik0.b.a(retrofitFactory4, null, null, converterFactory3, null, 27).create(CobrandedCardsPlanAdditionalValueService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate4, "create(...)");
                CobrandedCardsPlanAdditionalValueService cobrandedCardsPlanAdditionalValueService = (CobrandedCardsPlanAdditionalValueService) objCreate4;
                vc.s.k(cobrandedCardsPlanAdditionalValueService);
                return cobrandedCardsPlanAdditionalValueService;
            case 24:
                return new c6b.a((y5b.j) hVar.I.get());
            case 25:
                CobrandedCardsAccountsService cobrandedCardsAccountsService = (CobrandedCardsAccountsService) hVar.H.get();
                ue0.c cVar = (ue0.c) hVar.f12613y.get();
                ne0.j jVar = (ne0.j) hVar.f12610t.get();
                sf0.h hVarB = hVar.i.b();
                vc.s.j(hVarB);
                return new y5b.j(cobrandedCardsAccountsService, cVar, jVar, hVarB);
            case 26:
                ik0.b retrofitFactory5 = ((nj0.d) hVar.f12598b).m();
                vc.s.j(retrofitFactory5);
                ek.a converterFactory4 = ((nj0.d) hVar.f12598b).d();
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory5, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory4, "converterFactory");
                Object objCreate5 = ik0.b.a(retrofitFactory5, null, null, converterFactory4, null, 27).create(CobrandedCardsAccountsService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate5, "create(...)");
                CobrandedCardsAccountsService cobrandedCardsAccountsService2 = (CobrandedCardsAccountsService) objCreate5;
                vc.s.k(cobrandedCardsAccountsService2);
                return cobrandedCardsAccountsService2;
            case 27:
                return new c6b.k((y5b.g0) hVar.L.get());
            case 28:
                return new y5b.g0((CobrandedCardsTransactionsService) hVar.K.get(), (ue0.c) hVar.z.get(), (ne0.j) hVar.f12610t.get());
            case 29:
                ik0.b retrofitFactory6 = ((nj0.d) hVar.f12598b).m();
                vc.s.j(retrofitFactory6);
                Json json3 = (Json) hVar.f12607q.get();
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory6, "retrofitFactory");
                Intrinsics.checkNotNullParameter(json3, "json");
                Object objCreate6 = ik0.b.a(retrofitFactory6, null, null, p.a.g(b1.Companion, "application/json", json3), null, 27).create(CobrandedCardsTransactionsService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate6, "create(...)");
                CobrandedCardsTransactionsService cobrandedCardsTransactionsService = (CobrandedCardsTransactionsService) objCreate6;
                vc.s.k(cobrandedCardsTransactionsService);
                return cobrandedCardsTransactionsService;
            case 30:
                return new c6b.b((y5b.p) hVar.O.get());
            case 31:
                return new y5b.p((CobrandedCardsBillingService) hVar.N.get(), (ue0.c) hVar.A.get(), (ne0.j) hVar.f12610t.get());
            case 32:
                ik0.b retrofitFactory7 = ((nj0.d) hVar.f12598b).m();
                vc.s.j(retrofitFactory7);
                ek.a converterFactory5 = ((nj0.d) hVar.f12598b).d();
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory7, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory5, "converterFactory");
                Object objCreate7 = ik0.b.a(retrofitFactory7, null, null, converterFactory5, null, 27).create(CobrandedCardsBillingService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate7, "create(...)");
                CobrandedCardsBillingService cobrandedCardsBillingService = (CobrandedCardsBillingService) objCreate7;
                vc.s.k(cobrandedCardsBillingService);
                return cobrandedCardsBillingService;
            case 33:
                return new c6b.n((y5b.i0) hVar.f12612x.get(), (q5b.a) hVar.C.get());
            case 34:
                return new d6b.b((q5b.c) hVar.f12605n.get());
            case 35:
                return new c6b.c((y5b.t) hVar.S.get());
            case 36:
                return new y5b.t((ue0.c) hVar.B.get());
            case 37:
                return new z5b.a();
            default:
                throw new AssertionError(i);
        }
    }
}
