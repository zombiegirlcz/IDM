package jm4;

import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.CategoryDetailsScreenContract$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category_items.CategoryItemsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.credit_cards.CreditCardsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.create.InstalmentFlowContract$InputData;
import com.revolut.feature.rev_points.exclusive_store.api.navigation.ExclusiveStoreInputData;
import com.revolut.feature.store.impl.ui.root.StoreFlowContract$InputData;
import com.revolut.feature.user.checklist.impl.ui.flow.ChecklistFlowContract$ChecklistFlowInputData;
import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlowContract$InputData;
import com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.EditScreenerScreenContract$Input;
import com.revolut.feature.wealth_discovery.impl.screener.screens.new_screener.NewScreenerScreenContract$Input;
import com.revolut.feature.wealth_protection.sso.impl.ui.WealthProtectionSsoFlowContract$InputData;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.flow.BreakdownFlowContract$InputData;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction.TransactionBreakdownScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.widget.AsftWidgetFlowContract$InputData;
import com.revolut.retail.feature.payments.core.fees.mapper.RateExplanationDialogMapper;
import com.revolut.retail.feature.trading_onboarding.impl.ui.documents.TradingOnboardingOpenDocumentFlowContract$InputData;
import com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow.GiaOnboardingFailedFlowContract$InputData;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_workflow.OnboardingWorkflowContract$InputData;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c3 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f176025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qji.b f176026c;

    public /* synthetic */ c3(Object obj2, qji.b bVar, int i) {
        this.f176024a = i;
        this.f176025b = obj2;
        this.f176026c = bVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f176024a) {
            case 0:
                d3 d3Var = (d3) this.f176026c;
                CreditCardsScreenContract$InputData creditCardsScreenContract$InputData = d3Var.f176038a;
                a3 a3Var = (a3) this.f176025b;
                al4.n nVarS = a3Var.f175965b.s();
                vc.s.j(nVarS);
                mt8.d dVarB = a3Var.D.b();
                vc.s.j(dVarB);
                a3 a3Var2 = d3Var.f176039b;
                an4.e eVar = new an4.e(((eyd.b) a3Var2.F).c());
                dp4.w wVar = (dp4.w) a3Var2.f175974k0.get();
                gte.a aVarB = a3Var2.f175982r.b();
                vc.s.j(aVarB);
                lal.a aVar = new lal.a(wVar, aVarB, a3Var2.B.e(), a3Var2.f175965b.a());
                nyb.j jVarB = a3Var.f175973j.b();
                vc.s.j(jVarB);
                m93.g gVarI = a3Var2.e.i();
                vc.s.j(gVarI);
                return new qq4.e(creditCardsScreenContract$InputData, nVarS, dVarB, eVar, aVar, jVarB, new qq4.f(new rm4.c(gVarI)));
            case 1:
                k3 k3Var = (k3) this.f176026c;
                InstalmentFlowContract$InputData instalmentFlowContract$InputData = k3Var.f176171a;
                vt4.b bVar = new vt4.b();
                a3 a3Var3 = (a3) this.f176025b;
                r rVar = a3Var3.f175965b;
                al4.m mVarR = rVar.r();
                vc.s.j(mVarR);
                a3 a3Var4 = k3Var.f176172b;
                r rVar2 = a3Var4.f175965b;
                al4.m mVarR2 = rVar2.r();
                vc.s.j(mVarR2);
                al4.e eVarP = rVar2.p();
                vc.s.j(eVarP);
                mri.w wVarA = ((ozl.a) a3Var4.P).a();
                vc.s.j(wVarA);
                vr4.f fVar = new vr4.f(mVarR2, eVarP, wVarA);
                r rVar3 = a3Var4.f175965b;
                al4.m mVarR3 = rVar3.r();
                vc.s.j(mVarR3);
                al4.e eVarP2 = rVar3.p();
                vc.s.j(eVarP2);
                vr4.s sVar = new vr4.s(mVarR3, eVarP2, a3Var4.f.e(), a3Var4.f175976m.g());
                al4.n nVarS2 = rVar.s();
                vc.s.j(nVarS2);
                bp4.c ineligibilityDialogLocalizationProvider = new bp4.c();
                Intrinsics.checkNotNullParameter(ineligibilityDialogLocalizationProvider, "ineligibilityDialogLocalizationProvider");
                return new com.revolut.feature.credit.card.impl.ui.instalment.create.b(instalmentFlowContract$InputData, bVar, mVarR, fVar, sVar, nVarS2, new wr4.a(), a3Var3.f.e());
            case 2:
                a3 a3Var5 = (a3) this.f176025b;
                lb5.b bVarA = a3Var5.d.a();
                vc.s.j(bVarA);
                d3j.b bVarE = ((b3j.p) a3Var5.f175989x).e();
                sf0.h hVarB = a3Var5.f175984s.b();
                vc.s.j(hVarB);
                return new com.revolut.feature.credit.card.impl.ui.direct_debit.b(bVarA, bVarE, hVarB, ((x3) this.f176026c).f176437a);
            case 3:
                joh.g gVar = (joh.g) this.f176026c;
                vph.n nVar = new vph.n(new vph.l());
                joh.w wVar2 = gVar.f177004b;
                gqh.j jVar = new gqh.j(nVar, new vph.j(wVar2.f177068b.g()), 0);
                NewScreenerScreenContract$Input newScreenerScreenContract$Input = gVar.f177003a;
                noh.b.Companion.getClass();
                zzl.c cVar = new zzl.c();
                ugl.c cVarD = wVar2.f.d();
                vc.s.j(cVarD);
                moh.e eVar2 = new moh.e(cVar, cVarD);
                ugl.c cVarD2 = ((joh.w) this.f176025b).f.d();
                vc.s.j(cVarD2);
                return new gqh.e(jVar, newScreenerScreenContract$Input, eVar2, cVarD2);
            case 4:
                joh.j jVar2 = (joh.j) this.f176026c;
                kqh.o instrumentGroupResourceMapper = new kqh.o();
                vph.h screenerFiltersViewTextMapper = new vph.h();
                Intrinsics.checkNotNullParameter(instrumentGroupResourceMapper, "instrumentGroupResourceMapper");
                Intrinsics.checkNotNullParameter(screenerFiltersViewTextMapper, "screenerFiltersViewTextMapper");
                xoh.w wVar3 = new xoh.w();
                ScreenerAllFiltersFlowContract$InputData screenerAllFiltersFlowContract$InputData = jVar2.f177009a;
                vph.a aVar2 = new vph.a();
                joh.w wVar4 = (joh.w) this.f176025b;
                fkg.a aVarF = wVar4.f();
                x8h.m mVarG = wVar4.d.g();
                joh.w wVar5 = jVar2.f177011c;
                tzg.m mVarT = wVar5.d.t();
                vc.s.j(mVarT);
                ybl.i iVarB = wVar5.f177070g.b();
                vc.s.j(iVarB);
                gte.a aVarB2 = wVar5.e.b();
                vc.s.j(aVarB2);
                return new com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.a(wVar3, screenerAllFiltersFlowContract$InputData, aVar2, aVarF, mVarG, new kl.t1(new aoh.a(mVarT, iVarB, aVarB2)));
            case 5:
                joh.s sVar2 = (joh.s) this.f176026c;
                joh.w wVar6 = sVar2.f177056b;
                kgm.c cVar2 = new kgm.c(wVar6.f());
                tzg.m mVarT2 = wVar6.d.t();
                vc.s.j(mVarT2);
                ybl.i iVarB2 = wVar6.f177070g.b();
                vc.s.j(iVarB2);
                gte.a aVarB3 = wVar6.e.b();
                vc.s.j(aVarB3);
                kl.t1 t1Var = new kl.t1(new aoh.a(mVarT2, iVarB2, aVarB3));
                x8h.m mVarG2 = ((joh.w) this.f176025b).d.g();
                kqh.o instrumentGroupResourceMapper2 = new kqh.o();
                Intrinsics.checkNotNullParameter(instrumentGroupResourceMapper2, "instrumentGroupResourceMapper");
                kqh.p productItemMapper = new kqh.p();
                Intrinsics.checkNotNullParameter(productItemMapper, "productItemMapper");
                return new kqh.u(cVar2, t1Var, mVarG2, new kqh.r(), sVar2.f177055a);
            case 6:
                joh.y yVar = (joh.y) this.f176026c;
                vph.n nVar2 = new vph.n(new vph.l());
                joh.w wVar7 = yVar.f177079c;
                gqh.j jVar3 = new gqh.j(nVar2, new vph.j(wVar7.f177068b.g()), 1);
                EditScreenerScreenContract$Input editScreenerScreenContract$Input = yVar.f177078b;
                noh.b.Companion.getClass();
                zzl.c cVar3 = new zzl.c();
                ugl.c cVarD3 = wVar7.f.d();
                vc.s.j(cVarD3);
                moh.e eVar3 = new moh.e(cVar3, cVarD3);
                ugl.c cVarD4 = ((joh.w) this.f176025b).f.d();
                vc.s.j(cVarD4);
                return new com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.a(jVar3, editScreenerScreenContract$Input, eVar3, cVarD4, new wph.f());
            case 7:
                joh.y yVar2 = (joh.y) this.f176026c;
                vph.n nVar3 = new vph.n(new vph.l());
                joh.w wVar8 = yVar2.f177079c;
                gqh.j jVar4 = new gqh.j(nVar3, new vph.j(wVar8.f177068b.g()), 1);
                EditScreenerScreenContract$Input editScreenerScreenContract$Input2 = yVar2.f177078b;
                noh.b.Companion.getClass();
                zzl.c cVar4 = new zzl.c();
                ugl.c cVarD5 = wVar8.f.d();
                vc.s.j(cVarD5);
                moh.e eVar4 = new moh.e(cVar4, cVarD5);
                ugl.c cVarD6 = ((joh.w) this.f176025b).f.d();
                vc.s.j(cVarD6);
                return new com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.a(jVar4, editScreenerScreenContract$Input2, eVar4, cVarD6, new wph.f());
            case 8:
                return new com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.flow.a(((jok.d) this.f176026c).f177156a, ((s41.a) ((jok.c) this.f176025b).e).d());
            case 9:
                wok.o oVar = new wok.o();
                jok.c cVar5 = (jok.c) this.f176025b;
                return new com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.a(oVar, cVar5.a(), new kl.b0(fe0.c.a()), ((jok.f) this.f176026c).f177162a, ((s41.a) cVar5.e).d());
            case 10:
                StoreFlowContract$InputData storeFlowContract$InputData = ((k2e.k) this.f176026c).f180527a;
                eub.i iVarE = ((k2e.j) this.f176025b).f180511b.e();
                vc.s.j(iVarE);
                return new com.revolut.feature.store.impl.ui.root.b(storeFlowContract$InputData, iVarE);
            case 11:
                l3e.o oVar2 = new l3e.o(((k2e.m) this.f176026c).f180532a.d());
                k2e.j jVar5 = (k2e.j) this.f176025b;
                kye.e eVarG = jVar5.g();
                iwb.r rVar4 = jVar5.f180512c;
                jwb.e eVarB = rVar4.b();
                vc.s.j(eVarB);
                svb.a aVarA = rVar4.a();
                vc.s.j(aVarA);
                l80.e eVarH = jVar5.f180516l.h();
                vc.s.j(eVarH);
                return new com.revolut.feature.store.impl.ui.orders.a(oVar2, eVarG, eVarB, aVarA, eVarH);
            case 12:
                k4i.b bVar2 = (k4i.b) this.f176026c;
                BreakdownFlowContract$InputData breakdownFlowContract$InputData = bVar2.f180908a;
                s4i.a aVar3 = new s4i.a();
                k4i.c cVar6 = (k4i.c) this.f176025b;
                wli.x xVarD = ((s41.a) cVar6.f180911a).d();
                s4i.i iVar = new s4i.i(new qpk.b(), 0);
                mre.c cVarB = cVar6.f180912b.b();
                vc.s.j(cVarB);
                jt0.b factory = bVar2.f180910c.f180913c.a();
                ViewController eventsDispatcher = bVar2.f180909b;
                t4i.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(eventsDispatcher, "viewController");
                Intrinsics.checkNotNullParameter(eventsDispatcher, "eventsDispatcher");
                return new s4i.h(breakdownFlowContract$InputData, aVar3, xVarD, iVar, cVarB, new prl.e((p56.a) factory.f178265b, eventsDispatcher, (gte.a) factory.f178266c, (wli.x) factory.d), new RateExplanationDialogMapper(), new s4i.j());
            case 13:
                k4i.e eVar5 = (k4i.e) this.f176026c;
                TransactionBreakdownScreenContract$InputData transactionBreakdownScreenContract$InputData = eVar5.f180920a;
                k4i.c cVar7 = eVar5.f180921b;
                o7.b bVarA2 = cVar7.d.a();
                ybl.b bVarB = cVar7.e.b();
                vc.s.j(bVarB);
                w4i.c cVar8 = new w4i.c(transactionBreakdownScreenContract$InputData, bVarA2, bVarB, new m5i.a(), cVar7.f180913c.b());
                w4i.d dVar = new w4i.d();
                ang.f fVarE = ((k4i.c) this.f176025b).f.e();
                TransactionBreakdownScreenContract$InputData transactionBreakdownScreenContract$InputData2 = eVar5.f180920a;
                z4i.f fVar2 = new z4i.f(transactionBreakdownScreenContract$InputData2);
                z4i.d dVar2 = new z4i.d(transactionBreakdownScreenContract$InputData2);
                k4i.b bVar3 = eVar5.f180922c;
                s5i.k kVarB = bVar3.b();
                gte.a aVarB4 = cVar7.i.b();
                vc.s.j(aVarB4);
                n5i.f fVar3 = new n5i.f(kVarB, aVarB4, eVar5.b());
                s5i.k kVarB2 = bVar3.b();
                gte.a aVarB5 = cVar7.i.b();
                vc.s.j(aVarB5);
                ks0.n nVar4 = new ks0.n(new n5i.f(kVarB2, aVarB5, eVar5.b()));
                s5i.k kVarB3 = bVar3.b();
                ite.a aVar4 = cVar7.i;
                gte.a aVarB6 = aVar4.b();
                vc.s.j(aVarB6);
                n5i.d dVar3 = new n5i.d(kVarB3, aVarB6, eVar5.b());
                n5i.n nVar5 = new n5i.n(bVar3.b());
                n5i.p pVar = new n5i.p(bVar3.b());
                s5i.k kVarB4 = bVar3.b();
                s5i.b bVar4 = new s5i.b();
                gte.a aVarB7 = aVar4.b();
                vc.s.j(aVarB7);
                n5i.q qVar = new n5i.q(kVarB4, bVar4, aVarB7);
                n5i.a aVar5 = new n5i.a(bVar3.b(), new s5i.b());
                n5i.i iVar2 = new n5i.i(bVar3.b(), new s5i.b());
                n5i.l lVar = new n5i.l(bVar3.b());
                s5i.k kVarB5 = bVar3.b();
                gte.a aVarB8 = aVar4.b();
                vc.s.j(aVarB8);
                return new w4i.d0(transactionBreakdownScreenContract$InputData, cVar8, dVar, fVarE, new bof.r(fVar2, dVar2, new z4i.b(transactionBreakdownScreenContract$InputData2, new l5i.q(fVar3, nVar4, dVar3, nVar5, pVar, qVar, aVar5, iVar2, lVar, new lal.a(kVarB5, aVarB8, eVar5.b(), new p5k.p())), new y4i.b())));
            case 14:
                kek.d dVar4 = (kek.d) this.f176026c;
                return new com.revolut.retail.feature.pod_nominees.impl.flow.b(dVar4.f183127a, ((ldb.a) ((kek.c) this.f176025b).f183114c).a(), dVar4.b());
            case 15:
                kl2.b bVar5 = (kl2.b) this.f176026c;
                vxc.h hVar = bVar5.f185274b.f;
                yxc.l lVar2 = (yxc.l) hVar.f293075b.get();
                vc.s.j(lVar2);
                yxc.l lVarA = hVar.a();
                vc.s.j(lVarA);
                com.revolut.feature.backend_driven_limits.impl.v2.ui.list.e eVar6 = new com.revolut.feature.backend_driven_limits.impl.v2.ui.list.e(lVar2, lVarA, bVar5.f185273a);
                kl2.a aVar6 = (kl2.a) this.f176025b;
                return new com.revolut.feature.backend_driven_limits.impl.v2.ui.list.d(eVar6, (hl2.a) aVar6.f185272q.get(), ((s41.a) aVar6.f185265g).d(), new sl2.b(), bVar5.f185273a);
            case 16:
                kmg.b bVar6 = (kmg.b) this.f176026c;
                ChecklistFlowContract$ChecklistFlowInputData checklistFlowContract$ChecklistFlowInputData = bVar6.f185865a;
                kmg.d dVar5 = (kmg.d) this.f176025b;
                wli.x xVarD2 = ((s41.a) dVar5.f185871a).d();
                emg.a userChecklistInteractor = dVar5.f185872b.b();
                vc.s.j(userChecklistInteractor);
                kmg.i.Companion.getClass();
                Intrinsics.checkNotNullParameter(userChecklistInteractor, "userChecklistInteractor");
                kmg.d dVar6 = bVar6.f185866b;
                return new com.revolut.feature.user.checklist.impl.ui.flow.b(checklistFlowContract$ChecklistFlowInputData, xVarD2, userChecklistInteractor, new jid.z(dVar6.f185873c.c(), dVar6.d.b()));
            case 17:
                WealthProtectionSsoFlowContract$InputData wealthProtectionSsoFlowContract$InputData = ((krh.b) this.f176026c).f188874a;
                krh.a aVar7 = (krh.a) this.f176025b;
                ljl.q1 q1Var = aVar7.f188869a;
                xjl.i iVar3 = (xjl.i) ((ljl.q0) q1Var).Z.get();
                vc.s.j(iVar3);
                nkl.b bVarI = ((ljl.q0) q1Var).i();
                ppg.b bVarB2 = ((wpg.l) aVar7.f188870b).b();
                vc.s.j(bVarB2);
                eli.j jVarA = aVar7.f188871c.a();
                nrh.b bVar7 = new nrh.b();
                rql.a aVarB9 = aVar7.d.b();
                vc.s.j(aVarB9);
                return new com.revolut.feature.wealth_protection.sso.impl.ui.a(wealthProtectionSsoFlowContract$InputData, iVar3, bVarI, bVarB2, jVarA, bVar7, aVarB9, new x0i.j((p0i.b) aVar7.e.u.get(), new nd.k(new l4i.a())), (irh.a) aVar7.f188873h.get());
            case 18:
                AsftWidgetFlowContract$InputData asftWidgetFlowContract$InputData = ((kti.j) this.f176026c).f189558a;
                rui.a aVar8 = new rui.a();
                zsi.e eVarA = ((kti.i) this.f176025b).f189555a.a();
                vc.s.j(eVarA);
                return new com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.widget.a(asftWidgetFlowContract$InputData, aVar8, eVarA);
            case 19:
                ExclusiveStoreInputData exclusiveStoreInputData = ((kvb.d) this.f176026c).f190076a;
                kvb.b bVar8 = (kvb.b) this.f176025b;
                zja.a aVarA2 = ((ika.b) bVar8.f).a();
                vc.s.j(aVarA2);
                return new com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a(exclusiveStoreInputData, aVarA2, new o7.b((y1e.d) bVar8.f190062g.e.get()), ((c21.b) bVar8.f190063h).c());
            case 20:
                GiaOnboardingFailedFlowContract$InputData giaOnboardingFailedFlowContract$InputData = ((kyk.c) this.f176026c).f190931a;
                kyk.v vVar = (kyk.v) this.f176025b;
                return new com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow.a(giaOnboardingFailedFlowContract$InputData, vVar.d(), vVar.f190994q.a(), vVar.e());
            case 21:
                return new a0l.n(new a0l.p(), new a0l.o(), ((kyk.h) this.f176026c).f190944a, new zzk.a((zzl.b) ((kyk.i) this.f176025b).f190948c.get()));
            case 22:
                kyk.v vVar2 = (kyk.v) this.f176025b;
                til.m mVarA = vVar2.f190998w.a();
                vc.s.j(mVarA);
                OnboardingWorkflowContract$InputData onboardingWorkflowContract$InputData = ((kyk.l) this.f176026c).f190955a;
                Map mapA = vVar2.f190991m.a();
                vc.s.j(mapA);
                return new com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_workflow.a(mVarA, onboardingWorkflowContract$InputData, mapA);
            case 23:
                TradingOnboardingOpenDocumentFlowContract$InputData tradingOnboardingOpenDocumentFlowContract$InputData = ((kyk.w) this.f176026c).f191001a;
                kyk.v vVar3 = (kyk.v) this.f176025b;
                return new wyk.b(tradingOnboardingOpenDocumentFlowContract$InputData, (hyk.c) vVar3.B.get(), vVar3.e());
            case 24:
                return new q5h.k(new kpj.f((f5h.c) ((l5h.a) this.f176025b).k.get()), ((l5h.b) this.f176026c).f192267a, new q5h.m());
            case 25:
                raf.q qVar2 = new raf.q(new kpj.f(((l9f.d) this.f176026c).f193161a.f193190n.H()));
                l9f.k kVar = (l9f.k) this.f176025b;
                return new raf.n(qVar2, kVar.a(), kVar.f193192q.a(), kVar.f193190n.f(), kVar.f193193r.d());
            case 26:
                l9f.l lVar3 = (l9f.l) this.f176026c;
                paf.c cVar9 = lVar3.f193199a;
                zja.a aVarA3 = ((ika.b) lVar3.f193200b.o).a();
                vc.s.j(aVarA3);
                qaf.b bVar9 = new qaf.b(aVarA3);
                l9f.k kVar2 = (l9f.k) this.f176025b;
                gte.a aVarB10 = kVar2.f193183b.b();
                vc.s.j(aVarB10);
                return new com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.d(cVar9, bVar9, aVarB10, (o9f.i) kVar2.C.get());
            case 27:
                return new abf.o(((l9f.m) this.f176026c).f193202a, (o9f.c) ((l9f.k) this.f176025b).P.get(), new abf.p());
            case 28:
                ld1.e eVar7 = (ld1.e) this.f176026c;
                CategoryDetailsScreenContract$InputData categoryDetailsScreenContract$InputData = eVar7.f193934a;
                je1.l lVar4 = new je1.l(categoryDetailsScreenContract$InputData, (pd1.a) eVar7.f193935b.f193968t.get(), (rd1.b) eVar7.f193936c.e.get());
                ld1.l lVar5 = (ld1.l) this.f176025b;
                return new com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.a(lVar4, categoryDetailsScreenContract$InputData, (nd1.c) lVar5.f193960j.get(), (pd1.a) lVar5.f193968t.get());
            default:
                ld1.f fVar4 = (ld1.f) this.f176026c;
                le1.k kVar3 = new le1.k(new ge1.j((pd1.a) fVar4.f193938b.f193968t.get()));
                CategoryItemsScreenContract$InputData categoryItemsScreenContract$InputData = fVar4.f193937a;
                ld1.l lVar6 = (ld1.l) this.f176025b;
                return new le1.i(kVar3, categoryItemsScreenContract$InputData, (nd1.c) lVar6.f193960j.get(), (nd1.n) lVar6.f193964p.get(), (nd1.i) lVar6.f193966r.get(), (pd1.a) lVar6.f193968t.get());
        }
    }
}
