package d2h;

import ael.t;
import akl.z;
import android.content.Context;
import bo8.b0;
import bo8.e0;
import com.google.common.collect.ImmutableMap;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.list.ChallengesOverviewListScreenContract$InputData;
import com.revolut.feature.revolutpay.api.shared.navigation.PayWithAnyControllerDescriptor$InputData;
import com.revolut.feature.revolutpay.api.shared.navigation.PaymentBreakdownControllerDescriptor$InputData;
import com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.SetTrustedLocationScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.transactions_limits_change.TransactionsLimitsChangeScreenContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.budget.category_budgets.CategoryBudgetsContract$InputData;
import com.revolut.feature.tab.accounts.api.remove_account.RemoveAccountContract$InputData;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.travel.hotels.impl.network.TravelHotelsService;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.amendment.TravelHotelsRoomsSelectionAmendmentScreenContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details.TravelMilesFlightSearchResultDetailsScreenContract$InputData;
import com.revolut.feature.wealth.asset.selection.impl.ui.screens.cash.CashSelectionControllerContract$InputData;
import com.revolut.feature.wealth.asset.selection.impl.ui.screens.instrument.InstrumentSelectionControllerContract$InputData;
import com.revolut.feature.workflow.engine.polling.PollingControllerContract$InputData;
import dec.x;
import dec.y;
import dw3.b4;
import dw3.c1;
import dw3.x4;
import ehe.h;
import ehe.i;
import eq8.f0;
import eq8.k0;
import eq8.m0;
import fag.o;
import g9g.g0;
import g9g.p0;
import hw3.p;
import i2h.j;
import i2h.l;
import ieg.d0;
import java.util.Map;
import k2h.n;
import k2h.q;
import kotlin.jvm.internal.Intrinsics;
import ljl.j0;
import ljl.q0;
import m2b.a0;
import m2b.v;
import nnd.c0;
import nnd.i0;
import ove.u;
import p7c.r;
import ppd.n0;
import rnd.v0;
import t2b.f;
import vc.s;
import vge.z2;
import vtc.w;
import x8h.k;
import xag.g;
import yhe.m;
import z0g.f1;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f110836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f110837c;
    public final Object d;

    public /* synthetic */ b(Object obj2, int i, Object obj3, Object obj4) {
        this.f110835a = i;
        this.f110836b = obj2;
        this.f110837c = obj3;
        this.d = obj4;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f110835a) {
            case 0:
                CashSelectionControllerContract$InputData cashSelectionControllerContract$InputData = ((c) this.d).f110838a;
                wzg.a aVarE = ((e) this.f110836b).f110842a.e();
                s.j(aVarE);
                a aVar = (a) this.f110837c;
                e2h.b bVar = (e2h.b) aVar.d.get();
                e2h.a aVar2 = (e2h.a) aVar.e.get();
                h2h.a searchMapper = new h2h.a();
                Intrinsics.checkNotNullParameter(searchMapper, "searchMapper");
                return new j(cashSelectionControllerContract$InputData, aVarE, bVar, aVar2, new l());
            case 1:
                InstrumentSelectionControllerContract$InputData instrumentSelectionControllerContract$InputData = ((d) this.d).f110840a;
                e eVar = (e) this.f110836b;
                zdl.c cVar = eVar.f110843b;
                ybl.b bVarB = cVar.b();
                s.j(bVarB);
                t tVarF = cVar.f();
                s.j(tVarF);
                k kVarD = eVar.f110842a.d();
                a aVar3 = (a) this.f110837c;
                e2h.b bVar2 = (e2h.b) aVar3.d.get();
                e2h.a aVar4 = (e2h.a) aVar3.e.get();
                Map mapA = eVar.f110844c.a();
                s.j(mapA);
                return new n(instrumentSelectionControllerContract$InputData, bVarB, tVarF, kVarD, bVar2, aVar4, mapA, new q(h9h.a.y(), new h2h.a()));
            case 2:
                b4 b4Var = (b4) this.f110837c;
                return new vd4.k((p) b4Var.D.get(), (hw3.s) b4Var.B.get(), ((c1) this.f110836b).f118454m, ((x4) this.d).f120144a, new vd4.l());
            case 3:
                h hVar = (h) this.d;
                RemoveAccountContract$InputData removeAccountContract$InputData = hVar.f126041a;
                ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(6);
                ProductId productId = ProductId.CURRENCY;
                ehe.c cVar2 = hVar.f126042b;
                builderBuilderWithExpectedSize.put(productId, cVar2.Z0.get());
                builderBuilderWithExpectedSize.put(ProductId.PRO, cVar2.a1.get());
                builderBuilderWithExpectedSize.put(ProductId.JOINT, cVar2.f125970b1.get());
                builderBuilderWithExpectedSize.put(ProductId.YOUTH, cVar2.f125972c1.get());
                builderBuilderWithExpectedSize.put(ProductId.SUBACCOUNT, cVar2.f125974d1.get());
                builderBuilderWithExpectedSize.put(ProductId.SAVINGS, cVar2.f125976e1.get());
                ImmutableMap immutableMapBuild = builderBuilderWithExpectedSize.build();
                ehe.a aVar5 = (ehe.a) this.f110837c;
                ImmutableMap immutableMapM = aVar5.m();
                z2 z2Var = (z2) aVar5.B.get();
                sf0.h hVarB = cVar2.N.b();
                s.j(hVarB);
                v60.e eVarA = cVar2.O.a();
                s.j(eVarA);
                return f1.f(removeAccountContract$InputData, immutableMapBuild, immutableMapM, z2Var, new qek.a(hVarB, eVarA, 2), ((ehe.c) this.f110836b).f125991s.i(), new m());
            case 4:
                i iVar = (i) this.d;
                RemoveAccountContract$InputData removeAccountContract$InputData2 = iVar.f126044a;
                ImmutableMap.Builder builderBuilderWithExpectedSize2 = ImmutableMap.builderWithExpectedSize(6);
                ProductId productId2 = ProductId.CURRENCY;
                ehe.c cVar3 = iVar.f126045b;
                builderBuilderWithExpectedSize2.put(productId2, cVar3.Z0.get());
                builderBuilderWithExpectedSize2.put(ProductId.PRO, cVar3.a1.get());
                builderBuilderWithExpectedSize2.put(ProductId.JOINT, cVar3.f125970b1.get());
                builderBuilderWithExpectedSize2.put(ProductId.YOUTH, cVar3.f125972c1.get());
                builderBuilderWithExpectedSize2.put(ProductId.SUBACCOUNT, cVar3.f125974d1.get());
                builderBuilderWithExpectedSize2.put(ProductId.SAVINGS, cVar3.f125976e1.get());
                ImmutableMap immutableMapBuild2 = builderBuilderWithExpectedSize2.build();
                ehe.b bVar3 = (ehe.b) this.f110837c;
                ImmutableMap immutableMapN = bVar3.n();
                z2 z2Var2 = (z2) bVar3.B.get();
                sf0.h hVarB2 = cVar3.N.b();
                s.j(hVarB2);
                v60.e eVarA2 = cVar3.O.a();
                s.j(eVarA2);
                return f1.f(removeAccountContract$InputData2, immutableMapBuild2, immutableMapN, z2Var2, new qek.a(hVarB2, eVarA2, 2), ((ehe.c) this.f110836b).f125991s.i(), new m());
            case 5:
                g0 g0Var = (g0) this.d;
                ieg.e eVar2 = new ieg.e();
                g9g.d dVar = g0Var.f141674b;
                l80.e eVarH = dVar.e.h();
                s.j(eVarH);
                beg.t tVar = new beg.t(eVar2, new feg.c(eVarH, (p8g.c) dVar.g0.get(), (q8g.b) dVar.f141644x0.get()));
                TravelHotelsRoomsSelectionAmendmentScreenContract$InputData travelHotelsRoomsSelectionAmendmentScreenContract$InputData = g0Var.f141673a;
                g9g.d dVar2 = (g9g.d) this.f110836b;
                return new beg.s(tVar, travelHotelsRoomsSelectionAmendmentScreenContract$InputData, new o((TravelHotelsService) dVar2.P.get(), (ne0.j) dVar2.R.get()), (g) ((p0) this.f110837c).e.get(), new d0(), dVar2.c());
            case 6:
                gp8.l lVar = (gp8.l) this.d;
                k0 k0Var = new k0(new m0());
                ChallengesOverviewListScreenContract$InputData challengesOverviewListScreenContract$InputData = lVar.f145319a;
                hj8.a aVarA = ((gp8.n) this.f110836b).f.a();
                s.j(aVarA);
                return new f0(k0Var, challengesOverviewListScreenContract$InputData, aVarA, (zp8.h) ((gp8.k) this.f110837c).f.get());
            case 7:
                q0 q0Var = (q0) this.f110836b;
                z zVarC = q0Var.c();
                x7a.d dVar3 = (x7a.d) ((j0) this.f110837c).f196000g.get();
                ljl.p pVar = (ljl.p) this.d;
                return new com.revolut.sso.impl.ui.country_selection.b(zVarC, dVar3, pVar.f196047a, (bjl.p0) q0Var.H.get(), new i3g.k((bjl.p0) pVar.f196048b.H.get()));
            case 8:
                v vVar = (v) this.f110836b;
                l4i.a aVar6 = new l4i.a();
                m2b.p pVar2 = (m2b.p) this.f110837c;
                o7.b bVarQ = pVar2.q();
                kge.d dVarA = vVar.f201923c.a();
                w3b.e eVar3 = ((a0) this.d).f201771b;
                ybl.b bVarB2 = vVar.e.b();
                s.j(bVarB2);
                return new com.revolut.feature.retail.cfd.impl.screens.margin.a(aVar6, bVarQ, dVarA, eVar3, bVarB2, (f) pVar2.k.get(), new w3b.k());
            case 9:
                v vVar2 = (v) this.f110836b;
                l4i.a aVar7 = new l4i.a();
                m2b.m mVar = (m2b.m) this.f110837c;
                o7.b bVarQ2 = mVar.q();
                kge.d dVarA2 = vVar2.f201923c.a();
                w3b.e eVar4 = ((a0) this.d).f201771b;
                ybl.b bVarB3 = vVar2.e.b();
                s.j(bVarB3);
                return new com.revolut.feature.retail.cfd.impl.screens.margin.a(aVar7, bVarQ2, dVarA2, eVar4, bVarB3, (f) mVar.f201857l.get(), new w3b.k());
            case 10:
                mn8.f fVar = (mn8.f) this.d;
                wi8.e eVar5 = fVar.f207427b.u;
                e0 e0Var = new e0(new aj8.a(eVar5.f297847a.d(), eVar5.a()));
                bo8.c cVar4 = fVar.f207426a;
                mn8.o oVar = (mn8.o) this.f110836b;
                hj8.a aVarA2 = oVar.f.a();
                s.j(aVarA2);
                te8.z zVarE = oVar.f207465g.e();
                s.j(zVarE);
                kd8.e eVarA3 = oVar.d.a();
                s.j(eVarA3);
                wsg.b bVarA = oVar.f207466h.a();
                fmc.z zVarA = oVar.f207473r.a();
                uw1.c cVarD = ((lz1.m) oVar.v).d();
                s.j(cVarD);
                c70.a aVarZ = oVar.f207462a.z();
                s.j(aVarZ);
                return new b0(e0Var, cVar4, aVarA2, zVarE, eVarA3, bVarA, zVarA, cVarD, aVarZ, oVar.u.a(), (zn8.c) ((mn8.g) this.f110837c).d.get());
            case 11:
                dze.d dVar4 = ((ove.z) this.d).f230176b;
                ove.t tVar2 = ((ove.j) this.f110837c).f230085b;
                y51.a aVar8 = (y51.a) tVar2.U.get();
                sf0.h hVarB3 = tVar2.v.b();
                s.j(hVarB3);
                c0f.d dVar5 = new c0f.d(aVar8, hVarB3);
                wwh.a aVarB = ((ove.t) this.f110836b).i.b();
                s.j(aVarB);
                return new com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c(dVar4, dVar5, aVarB);
            case 12:
                dze.d dVar6 = ((ove.z) this.d).f230176b;
                ove.t tVar3 = ((u) this.f110837c).f230160b;
                y51.a aVar9 = (y51.a) tVar3.U.get();
                sf0.h hVarB4 = tVar3.v.b();
                s.j(hVarB4);
                c0f.d dVar7 = new c0f.d(aVar9, hVarB4);
                wwh.a aVarB2 = ((ove.t) this.f110836b).i.b();
                s.j(aVarB2);
                return new com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c(dVar6, dVar7, aVarB2);
            case 13:
                dze.d dVar8 = ((ove.z) this.d).f230176b;
                ove.t tVar4 = ((ove.h) this.f110837c).f230072b;
                y51.a aVar10 = (y51.a) tVar4.U.get();
                sf0.h hVarB5 = tVar4.v.b();
                s.j(hVarB5);
                c0f.d dVar9 = new c0f.d(aVar10, hVarB5);
                wwh.a aVarB3 = ((ove.t) this.f110836b).i.b();
                s.j(aVarB3);
                return new com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c(dVar8, dVar9, aVarB3);
            case 14:
                ox7.c cVar5 = (ox7.c) this.d;
                ox7.a aVar11 = (ox7.a) this.f110837c;
                xpi.g gVar = (xpi.g) aVar11.f230651n.get();
                iqi.h hVar2 = (iqi.h) aVar11.o.get();
                l80.e eVarH2 = cVar5.f230677a.f230661b.h();
                s.j(eVarH2);
                px7.h hVar3 = new px7.h(gVar, hVar2, new com.revolut.feature.insurance_pet.impl.ui.pet.dob.a(eVarH2), (nx7.b) ((ox7.b) this.f110836b).H.get(), new qx7.a());
                kli.a.p(hVar3, bq.i.d(cVar5.f230678b.f230643a));
                return hVar3;
            case 15:
                ox7.d dVar10 = (ox7.d) this.d;
                ox7.a aVar12 = (ox7.a) this.f110837c;
                ux7.n nVar = new ux7.n((xpi.g) aVar12.f230651n.get(), (iqi.h) aVar12.o.get(), (nx7.b) ((ox7.b) this.f110836b).H.get(), new vx7.c(new yx7.d()));
                kli.a.p(nVar, bq.i.d(dVar10.f230680a.f230643a));
                return nVar;
            case 16:
                ox7.e eVar6 = (ox7.e) this.d;
                ox7.a aVar13 = (ox7.a) this.f110837c;
                xpi.g gVar2 = (xpi.g) aVar13.f230651n.get();
                iqi.h hVar4 = (iqi.h) aVar13.o.get();
                ox7.b bVar4 = (ox7.b) this.f110836b;
                nx7.b bVar5 = (nx7.b) bVar4.H.get();
                nx7.c cVar6 = (nx7.c) bVar4.M.get();
                opi.d dVar11 = (opi.d) aVar13.f230649l.get();
                ox7.a aVar14 = eVar6.f230683b;
                os2.g gVar3 = new os2.g((opi.d) aVar14.f230649l.get());
                sx7.d dVar12 = new sx7.d(new yx7.d());
                w80.b bVarJ = eVar6.f230682a.f230661b.j();
                s.j(bVarJ);
                rx7.m mVar2 = new rx7.m(gVar2, hVar4, bVar5, cVar6, dVar11, gVar3, dVar12, new sz7.b(bVarJ));
                kli.a.p(mVar2, bq.i.d(aVar14.f230643a));
                return mVar2;
            case 17:
                ox7.g gVar4 = (ox7.g) this.d;
                ox7.a aVar15 = (ox7.a) this.f110837c;
                xpi.g gVar5 = (xpi.g) aVar15.f230651n.get();
                iqi.h hVar5 = (iqi.h) aVar15.o.get();
                ox7.b bVar6 = (ox7.b) this.f110836b;
                nx7.b bVar7 = (nx7.b) bVar6.H.get();
                nx7.c cVar7 = (nx7.c) bVar6.M.get();
                fx7.f fVarB = gVar4.f230697a.f230662c.b();
                s.j(fVarB);
                yx7.h petImageBuilder = new yx7.h(fVarB);
                Intrinsics.checkNotNullParameter(petImageBuilder, "petImageBuilder");
                wx7.j jVar = new wx7.j(gVar5, hVar5, bVar7, cVar7, new xx7.c());
                kli.a.p(jVar, bq.i.d(gVar4.f230698b.f230643a));
                return jVar;
            case 18:
                r rVar = (r) this.f110836b;
                q7c.g gVarE = rVar.e();
                k6c.c cVar8 = (k6c.c) rVar.u0.get();
                bec.a aVar16 = new bec.a();
                p7c.j jVar2 = (p7c.j) this.f110837c;
                PayWithAnyControllerDescriptor$InputData payWithAnyControllerDescriptor$InputData = jVar2.f233624a;
                h9c.b bVar8 = (h9c.b) jVar2.i.get();
                bec.b bVar9 = (bec.b) jVar2.f233629j.get();
                p7c.k kVar = (p7c.k) this.d;
                dec.v vVar3 = new dec.v(new dec.a0(new x(new y(new dec.r()))), new x(new y(new dec.r())));
                dec.g gVar6 = new dec.g();
                dec.a aVar17 = new dec.a();
                l80.e eVarH3 = kVar.f233632a.f233675g.h();
                s.j(eVarH3);
                return new com.revolut.feature.revolutpay.shared.ui.pay_with_any.a(gVarE, cVar8, aVar16, payWithAnyControllerDescriptor$InputData, bVar8, bVar9, new bec.e0(vVar3, new dec.c(gVar6, aVar17, eVarH3), new dec.f(new y(new dec.r()))));
            case 19:
                PaymentBreakdownControllerDescriptor$InputData paymentBreakdownControllerDescriptor$InputData = ((p7c.l) this.f110837c).f233636a;
                l61.a aVarB4 = ((r) this.f110836b).f.b();
                s.j(aVarB4);
                ks0.n nVar2 = new ks0.n(aVarB4);
                y6c.a disclaimerMapper = (y6c.a) ((p7c.m) this.d).f233642a.z.i.get();
                s.j(disclaimerMapper);
                tdc.f quoteMapper = new tdc.f();
                Intrinsics.checkNotNullParameter(disclaimerMapper, "disclaimerMapper");
                Intrinsics.checkNotNullParameter(quoteMapper, "quoteMapper");
                return new ldc.k(paymentBreakdownControllerDescriptor$InputData, nVar2, new ldc.j());
            case 20:
                ppd.e eVar7 = (ppd.e) this.d;
                ppd.n nVar3 = eVar7.f238395a;
                zjh.j jVarC = ((zc6.a) nVar3.f238502r0).c();
                pnd.c cVarB = eVar7.b();
                ite.a aVar18 = nVar3.f238482a;
                gte.a aVarB5 = aVar18.b();
                s.j(aVarB5);
                pnd.n nVar4 = new pnd.n(cVarB, aVarB5);
                pnd.k kVar2 = new pnd.k(eVar7.b());
                ppd.l lVar2 = eVar7.f238396b;
                pnd.e eVar8 = new pnd.e(lVar2.j());
                gte.a aVarB6 = aVar18.b();
                s.j(aVarB6);
                nnd.k0 k0Var2 = new nnd.k0(jVarC, nVar4, kVar2, eVar8, aVarB6);
                rnd.j jVar3 = (rnd.j) lVar2.f238468g.get();
                wsg.n nVarB = nVar3.f.b();
                ppk.f fVarA = nVar3.f238510x.a();
                zf8.k kVarA = nVar3.l0.a();
                s.j(kVarA);
                v0 v0VarS = lVar2.s();
                ge3.a aVarE2 = nVar3.f238486c.e();
                s.j(aVarE2);
                c0 c0Var = new c0(jVar3, nVarB, fVarA, kVarA, v0VarS, aVarE2, new j9l.a());
                ppd.l lVar3 = (ppd.l) this.f110837c;
                rnd.j jVar4 = (rnd.j) lVar3.f238468g.get();
                qnd.b bVar10 = new qnd.b(((zc6.a) nVar3.f238502r0).b());
                xnd.j jVar5 = (xnd.j) lVar3.i.get();
                qnd.d dVar13 = new qnd.d();
                rnd.i iVarJ = lVar3.j();
                gte.a aVarB7 = ((ppd.n) this.f110836b).f238482a.b();
                s.j(aVarB7);
                return new i0(k0Var2, c0Var, jVar4, bVar10, jVar5, dVar13, iVarJ, aVarB7);
            case 21:
                ppd.r rVar2 = (ppd.r) this.d;
                CategoryBudgetsContract$InputData categoryBudgetsContract$InputData = rVar2.f238532a;
                ppd.n nVar5 = (ppd.n) this.f110836b;
                w80.b bVarJ2 = nVar5.d.j();
                s.j(bVarJ2);
                ppd.n nVar6 = rVar2.f238533b;
                izi.a aVar19 = nVar6.f238484b;
                jzi.a aVarD = ((dqj.r) aVar19).d();
                s.j(aVarD);
                dqj.r rVar3 = (dqj.r) aVar19;
                eqj.f fVar2 = (eqj.f) rVar3.H.get();
                s.j(fVar2);
                ke3.e eVar9 = nVar6.f238486c;
                ge3.e eVarD = eVar9.d();
                s.j(eVarD);
                l5i.q qVarB = eVar9.b();
                ge3.a aVarE3 = eVar9.e();
                s.j(aVarE3);
                ang.f fVarE = nVar6.i.e();
                ge3.d dVarF = eVar9.f();
                s.j(dVarF);
                kzi.a aVarB8 = rVar3.b();
                s.j(aVarB8);
                ou5.b bVar11 = new ou5.b(aVarD, fVar2, eVarD, new wmd.f(qVarB, aVarE3, fVarE, dVarF, aVarB8), new gmd.b(nVar6.f.a(), nVar6.f238494l.c()));
                smd.y yVar = (smd.y) ((ppd.o) this.f110837c).d.get();
                jzi.a aVarD2 = ((dqj.r) nVar5.f238484b).d();
                s.j(aVarD2);
                thf.c cVarC = nVar6.f238490h.c();
                s.j(cVarC);
                return new smd.u(categoryBudgetsContract$InputData, bVarJ2, bVar11, yVar, aVarD2, new smd.x(cVarC));
            case 22:
                djf.c cVar9 = ((n0) this.d).f238513a.f238490h;
                thf.d dVarD = cVar9.d();
                s.j(dVarD);
                thf.m mVarG = cVar9.g();
                s.j(mVarG);
                nqd.q qVar = new nqd.q(new pqd.f(dVarD, mVarG, new j9l.a()));
                ppd.n nVar7 = (ppd.n) this.f110836b;
                wzi.a aVarA3 = ((ctj.b) nVar7.I).a();
                s.j(aVarA3);
                wsg.n nVarB2 = nVar7.f.b();
                whf.b bVarA2 = nVar7.f238490h.a();
                s.j(bVarA2);
                prl.e eVarB = ((ppd.j0) this.f110837c).b();
                rqd.h hVar6 = (rqd.h) nVar7.f238489g.C0.get();
                s.j(hVar6);
                return new nqd.o(qVar, aVarA3, nVarB2, bVarA2, eVarB, hVar6);
            case 23:
                sth.f fVar3 = new sth.f();
                PollingControllerContract$InputData pollingControllerContract$InputData = ((qth.d) this.d).f249124a;
                jvh.a aVarA4 = ((qth.g) this.f110836b).f249134c.a();
                s.j(aVarA4);
                qth.i iVar2 = (qth.i) this.f110837c;
                return new sth.e(fVar3, pollingControllerContract$InputData, aVarA4, iVar2.j(), iVar2.b());
            case 24:
                k7i.i iVar3 = (k7i.i) this.d;
                ryc.b bVar12 = (ryc.b) this.f110836b;
                wyc.b0 b0Var = new wyc.b0((pyc.h) bVar12.f258304t.get(), (pyc.f) bVar12.f258302r.get(), (wyc.b) bVar12.f258305w.get(), (mxc.b) bVar12.f258306x.get(), (tpi.j) ((ryc.c) this.f110837c).f258311h.get());
                kli.a.p(b0Var, bq.i.d(((ryc.c) iVar3.f182069b).f258307a));
                return b0Var;
            case 25:
                u41.b bVar13 = (u41.b) this.f110836b;
                yf.c cVarA = bVar13.f276996y.a();
                wsg.n nVarB3 = bVar13.f276994w.b();
                sri.m mVar3 = (sri.m) ((u41.a) this.f110837c).f276973q.get();
                jpc.e eVar10 = (jpc.e) this.d;
                return new uee.d(cVarA, nVarB3, mVar3, (String) eVar10.f177256b, (uce.c) eVar10.f177257c);
            case 26:
                ufg.l lVar4 = (ufg.l) this.d;
                ufg.g gVar7 = lVar4.f279760b;
                Context context = gVar7.f279710b;
                lhg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                gig.t tVar5 = new gig.t(new mhg.d(new jhg.b(new f01.c(context))), new iig.d(), new iig.m(new agg.d()), new iig.n(), new iig.g(), new mhg.a(), new iig.h());
                TravelMilesFlightSearchResultDetailsScreenContract$InputData travelMilesFlightSearchResultDetailsScreenContract$InputData = lVar4.f279759a;
                tig.b bVar14 = (tig.b) ((ufg.t) this.f110837c).d.get();
                sf0.h hVarB6 = gVar7.o.b();
                s.j(hVarB6);
                v60.e eVarA4 = gVar7.z.a();
                s.j(eVarA4);
                iig.f fVar4 = new iig.f(hVarB6, eVarA4);
                ufg.g gVar8 = (ufg.g) this.f110836b;
                return new com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details.a(tVar5, travelMilesFlightSearchResultDetailsScreenContract$InputData, bVar14, fVar4, gVar8.c(), (vfg.q) gVar8.G.get());
            case 27:
                w wVar = (w) this.d;
                SetTrustedLocationScreenContract$InputData setTrustedLocationScreenContract$InputData = wVar.f292089a;
                qee.s sVar = new qee.s(setTrustedLocationScreenContract$InputData);
                vtc.t tVar6 = (vtc.t) this.f110836b;
                f49.a aVar20 = tVar6.i;
                w39.b bVarA3 = aVar20.a();
                s.j(bVarA3);
                d49.a aVar21 = (d49.a) aVar20.f132031l.get();
                s.j(aVar21);
                return new com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.d(sVar, setTrustedLocationScreenContract$InputData, bVarA3, aVar21, (pvc.a) ((vtc.x) this.f110837c).d.get(), tVar6.f292068j.d(), new qr0.i((ah0.c) wVar.f292090b.m0.get()), new buc.a(), tVar6.f292072n.e());
            case 28:
                vtc.t tVar7 = (vtc.t) this.f110836b;
                wtc.k kVar3 = (wtc.k) tVar7.g0.get();
                vtc.a0 a0Var = (vtc.a0) this.d;
                TransactionsLimitsChangeScreenContract$InputData transactionsLimitsChangeScreenContract$InputData = a0Var.f291948a;
                w80.b bVarA4 = tVar7.a();
                jwc.a aVar22 = new jwc.a();
                ang.f fVarE2 = tVar7.f292072n.e();
                smd.s sVarB = ((vtc.u) this.f110837c).b();
                lwc.d dVar14 = new lwc.d();
                u80.o oVar2 = new u80.o();
                vtc.t tVar8 = a0Var.f291949b;
                return new com.revolut.feature.security_hub.impl.ui.transactions_limits_change.a(kVar3, transactionsLimitsChangeScreenContract$InputData, bVarA4, aVar22, fVarE2, sVarB, dVar14, new jwc.n(oVar2, tVar8.a(), (wtc.q0) tVar8.f0.get(), new lwc.b()));
            default:
                su9.c cVar10 = (su9.c) this.d;
                vzc.b bVar15 = (vzc.b) this.f110836b;
                ozc.d dVar15 = (ozc.d) bVar15.f293465y.get();
                vzc.c cVar11 = (vzc.c) this.f110837c;
                a0d.k kVar4 = new a0d.k(dVar15, (ozc.a) cVar11.G.get(), (ozc.f) bVar15.C.get(), (mxc.b) bVar15.z.get(), (tpi.j) cVar11.f293469g.get());
                kli.a.p(kVar4, bq.i.d(((vzc.c) cVar10.f265693a).f293466a));
                return kVar4;
        }
    }
}
