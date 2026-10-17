package xsl;

import android.app.Activity;
import android.content.Context;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResultRegistry;
import c84.w;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.backend_flow.ui.BackendFlowContract$Configuration;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.common.impl.flow.field_search.search.FieldSearchScreenContract$InputData;
import com.revolut.feature.address.common.impl.flow.validation_flow.suggestion.SuggestionSheetContract$InputData;
import com.revolut.feature.cashback.impl.ui.pocket.details.CashbackPocketDetailsScreenContract$InputData;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_product.CashbackProductScreenContract$InputData;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_transactions.CashbackTransactionsScreenContract$InputData;
import com.revolut.feature.cashback.impl.ui.yourcashback.withdraw.CashbackWithdrawMetalScreenContract$InputData;
import com.revolut.feature.credit.core.ui.progress.CreditProgressContract$Configuration;
import com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.questionnaire.ForbearanceApplicationQuestionnaireContract$Configuration;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingpicker.CryptoAddressHostingPickerContract$InputData;
import com.revolut.feature.giro.impl.ui.form.DirectDebitFormScreenContract$InputData;
import com.revolut.feature.giro.impl.ui.review.DirectDebitReviewScreenContract$InputData;
import com.revolut.feature.global_markets.impl.data.network.GlobalMarketsService;
import com.revolut.feature.global_markets.impl.ui.flow.index_details.IndexDetailsFlowContract$InputData;
import com.revolut.feature.global_markets.impl.ui.redesign.screen.collection_details.GlobalMarketsCollectionScreenContract$InputData;
import com.revolut.feature.global_markets.impl.ui.redesign.screen.market.MarketDetailsRedesignScreenContract$InputData;
import com.revolut.feature.global_markets.impl.ui.screen.index_overview.IndexOverviewScreen;
import com.revolut.feature.global_markets.impl.ui.screen.index_overview.IndexOverviewScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.travel_status.impl.ui.screens.partner.TravelStatusPartnerScreenContract$InputData;
import et6.h1;
import i2l.m0;
import i2l.p0;
import i2l.q0;
import java.util.Collection;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import od3.s0;
import od3.t0;
import od3.y0;
import qgk.k3;
import rd3.b0;
import rd3.z;
import rp0.l0;
import tnb.g0;
import ud3.e0;
import ud3.i0;
import wli.x;
import wp5.y;
import yc0.f0;
import z0h.q1;
import zuj.d0;
import zxb.k0;

/* JADX INFO: loaded from: classes12.dex */
public final class q implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f308709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f308710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f308711c;
    public final Object d;

    public /* synthetic */ q(Object obj2, Object obj3, int i, int i2) {
        this.f308709a = i2;
        this.f308711c = obj2;
        this.d = obj3;
        this.f308710b = i;
    }

    private final Object a() {
        y77.c cVar = (y77.c) this.f308711c;
        y77.e eVar = (y77.e) this.d;
        int i = this.f308710b;
        switch (i) {
            case 0:
                return kxa.j.m((j60.a) eVar.f.get());
            case 1:
                return y.r((com.revolut.kompot.navigable.a) eVar.d.get(), (rp0.m) eVar.e.get());
            case 2:
                return new rp0.m();
            case 3:
                cli.n nVar = (cli.n) eVar.f311384h.get();
                IndexDetailsFlowContract$InputData indexDetailsFlowContract$InputData = eVar.f311380a;
                ecm.q qVarA = ((y77.i) cVar.f311369n).a();
                ybl.b bVarB = cVar.e.b();
                vc.s.j(bVarB);
                u1d.a aVar = (u1d.a) eVar.i.get();
                gte.a aVarB = cVar.f311364g.b();
                vc.s.j(aVarB);
                return new com.revolut.feature.global_markets.impl.ui.flow.index_details.b(nVar, indexDetailsFlowContract$InputData, qVarA, bVarB, aVar, aVarB);
            case 4:
                return new g87.a();
            case 5:
                jpc.e factory = cVar.f311370p.a();
                j60.a bottomExpandableDialog = (j60.a) eVar.f.get();
                f87.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
                return factory.c("COMBINED_WATCHLIST_ORDERING_HOME", bottomExpandableDialog);
            case 6:
                u1d.a controllerModelExtension = (u1d.a) eVar.i.get();
                f87.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
                vc.s.k(controllerModelExtension);
                return controllerModelExtension;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        y77.c cVar = (y77.c) this.f308711c;
        y77.f fVar = (y77.f) this.d;
        int i = this.f308710b;
        switch (i) {
            case 0:
                ViewController screen = fVar.f311386a;
                v87.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(screen, "screen");
                return (IndexOverviewScreen) screen;
            case 1:
                return a10.b.f((u8h.b) cVar.f311366j, "factory");
            case 2:
                k18.c factory = cVar.f311371q.a();
                k0h.h viewDelegate = (k0h.h) fVar.f311392l.get();
                m0h.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(viewDelegate, "viewDelegate");
                Intrinsics.checkNotNullParameter(viewDelegate, "viewDelegate");
                return new w(viewDelegate);
            case 3:
                k18.c factory2 = cVar.f311371q.a();
                k0h.g view = (k0h.g) fVar.e.get();
                k0h.a router = (k0h.a) fVar.k.get();
                m0h.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(router, "router");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(router, "router");
                return new k9h.g(view, router);
            case 4:
                k18.c factory3 = cVar.f311371q.a();
                k9h.e presentationModel = (k9h.e) fVar.f311389g.get();
                j60.a bottomExpandableDialogControllerExtension = (j60.a) fVar.f311391j.get();
                m0h.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
                Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
                Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                return new m9h.b(presentationModel, bottomExpandableDialogControllerExtension);
            case 5:
                k18.c factory4 = cVar.f311371q.a();
                m0h.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory4, "factory");
                return new k9h.e((x8h.g) factory4.f180140b);
            case 6:
                return ehe.n.s((com.revolut.kompot.navigable.a) fVar.f311390h.get(), (rp0.m) fVar.i.get());
            case 7:
                return new rp0.m();
            case 8:
                return kxa.j.k((j60.a) fVar.f311391j.get());
            case 9:
                IndexOverviewScreenContract$InputData indexOverviewScreenContract$InputData = fVar.f311387b;
                cli.n nVar = (cli.n) fVar.f311396q.get();
                aah.h hVar = (aah.h) fVar.f.get();
                ecm.q qVarA = ((y77.i) cVar.f311369n).a();
                zhl.k kVarA = cVar.d.a();
                ybl.b bVarB = cVar.e.b();
                vc.s.j(bVarB);
                return new u87.q(indexOverviewScreenContract$InputData, nVar, hVar, qVarA, kVarA, bVarB, (k0h.a) fVar.k.get(), cVar.f311362b.f(), ((z3h.g) cVar.f311368m).d());
            case 10:
                IndexOverviewScreenContract$InputData indexOverviewScreenContract$InputData2 = fVar.f311387b;
                q1 q1Var = (q1) fVar.o.get();
                y77.c cVar2 = fVar.f311388c;
                return new w87.a(indexOverviewScreenContract$InputData2, q1Var, new w87.b(f0k.d.n(cVar2.f311367l, ((z3h.g) cVar2.f311368m).h())), (k0h.c) fVar.f311395p.get());
            case 11:
                return a10.b.g((u8h.b) cVar.f311366j, "factory");
            case 12:
                k18.c factory5 = cVar.f311371q.a();
                m0h.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory5, "factory");
                return new k9h.c(new adh.c((nbh.a) factory5.f180141c, (nbh.f) factory5.d));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        y77.c cVar = (y77.c) this.f308711c;
        u8h.c cVar2 = cVar.f311366j;
        y77.g gVar = (y77.g) this.d;
        int i = this.f308710b;
        switch (i) {
            case 0:
                h87.e extensions = (h87.e) gVar.f.get();
                i87.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extensions, "extensions");
                return extensions.f149951a;
            case 1:
                return hy1.g.h(gVar.f311398a, new g2e.t((h87.c) gVar.e.get()));
            case 2:
                return new h87.l(gVar.b(), new s4i.i(new qpk.b(), 1));
            case 3:
                return a10.b.f((u8h.b) cVar2, "factory");
            case 4:
                h87.e extensions2 = (h87.e) gVar.f.get();
                i87.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extensions2, "extensions");
                yji.n nVar = extensions2.f149952b;
                vc.s.k(nVar);
                return nVar;
            case 5:
                h87.b bVar = new h87.b();
                y77.c cVar3 = gVar.d;
                m2h.b bVar2 = cVar3.f311368m;
                f3h.a aVar = cVar3.f311367l;
                h87.s sVar = new h87.s(bVar, new n87.v(cVar3.f311362b.C(), ((mkh.s) cVar3.k).b()));
                q1 q1Var = (q1) gVar.f311403j.get();
                t87.f performanceCalculator = new t87.f();
                Intrinsics.checkNotNullParameter(performanceCalculator, "performanceCalculator");
                t87.e eVar = new t87.e();
                t87.f performanceCalculator2 = new t87.f();
                Intrinsics.checkNotNullParameter(performanceCalculator2, "performanceCalculator");
                s87.c cVar4 = new s87.c();
                t87.f performanceCalculator3 = new t87.f();
                Intrinsics.checkNotNullParameter(performanceCalculator3, "performanceCalculator");
                cq9.m mVar = new cq9.m(sVar, q1Var, new s87.d(new s87.g(eVar, cVar4, new nd.l())), new t87.l(new t87.o(f0k.d.n(aVar, ((z3h.g) bVar2).h())), f0k.d.n(aVar, ((z3h.g) bVar2).h())));
                MarketDetailsRedesignScreenContract$InputData marketDetailsRedesignScreenContract$InputData = gVar.f311400c;
                b4h.e eVarD = ((z3h.g) cVar.f311368m).d();
                h87.c cVar5 = (h87.c) gVar.e.get();
                aah.h hVar = (aah.h) gVar.f311402h.get();
                y77.i iVar = (y77.i) cVar.f311369n;
                i4b.f fVar = new i4b.f(new prl.e((GlobalMarketsService) iVar.f311413m.get(), (ue0.c) iVar.f311418s.get(), new d7h.a((ne0.j) iVar.f311415p.get(), 1)));
                s87.a aVar2 = new s87.a();
                ou5.b bVarB = gVar.b();
                zhl.k kVarA = cVar.d.a();
                ybl.b bVarB2 = cVar.e.b();
                vc.s.j(bVarB2);
                return new com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a(mVar, marketDetailsRedesignScreenContract$InputData, eVarD, cVar5, hVar, fVar, aVar2, bVarB, kVarA, bVarB2, cVar.f311362b.f(), new t87.d(), (c87.c) cVar.f311374t.get());
            case 6:
                return a10.b.g((u8h.b) cVar2, "factory");
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        yc3.a aVar = (yc3.a) this.f308711c;
        ad3.f fVar = aVar.f312437c;
        yc3.b bVar = (yc3.b) this.d;
        yc3.a aVar2 = bVar.f312451c;
        int i = this.f308710b;
        switch (i) {
            case 0:
                return kxa.j.l((j60.a) bVar.f.get());
            case 1:
                return h30.l.p((com.revolut.kompot.navigable.a) bVar.d.get(), (rp0.m) bVar.e.get());
            case 2:
                return new rp0.m();
            case 3:
                mre.c cVarB = aVar.f312441l.b();
                vc.s.j(cVarB);
                return new qpg.b(cVarB);
            case 4:
                bd3.a aVarA = fVar.a();
                vc.s.j(aVarA);
                return new id3.c(aVarA, new od3.a());
            case 5:
                jki.p pVar = (jki.p) bVar.f312454j.get();
                CashbackPocketDetailsScreenContract$InputData cashbackPocketDetailsScreenContract$InputData = bVar.f312449a;
                jd3.k kVarD = bVar.d();
                bd3.a aVarA2 = fVar.a();
                vc.s.j(aVarA2);
                efk.a aVar3 = aVar2.d;
                ad3.f fVar2 = aVar2.f312437c;
                xmg.a aVar4 = aVar2.o;
                ffk.t tVarF = aVar3.f();
                vc.s.j(tVarF);
                bd3.a aVarA3 = fVar2.a();
                vc.s.j(aVarA3);
                l61.a aVarB = aVar4.b();
                vc.s.j(aVarB);
                nd3.d dVar = new nd3.d(aVar2.f312439h.b());
                whf.b bVarA = aVar2.f312436b.a();
                vc.s.j(bVarA);
                l61.a aVarB2 = aVar4.b();
                vc.s.j(aVarB2);
                ang.f fVarE = aVar4.e();
                bd3.a aVarA4 = fVar2.a();
                vc.s.j(aVarA4);
                hc5.a aVarA5 = ((gc5.c) aVar2.f312444p).a();
                vc.s.j(aVarA5);
                pd3.d dVar2 = new pd3.d(tVarF, aVarA3, aVarB, dVar, bVarA, new lal.a(aVarB2, fVarE, aVarA4, aVarA5), 1);
                qpg.b bVar2 = (qpg.b) bVar.f312453h.get();
                y0 y0Var = new y0(((k3) aVar2.f312442m).b());
                t0 t0Var = new t0();
                j60.a aVar5 = (j60.a) bVar.f.get();
                id3.a aVar6 = (id3.a) bVar.i.get();
                jd3.k kVarD2 = bVar.d();
                fk3.a aVarA6 = aVar.f312445q.a();
                vc.s.j(aVarA6);
                return new kd3.m(pVar, cashbackPocketDetailsScreenContract$InputData, kVarD, aVarA2, dVar2, bVar2, y0Var, t0Var, aVar5, aVar6, kVarD2, aVarA6);
            case 6:
                dbj.a aVar7 = aVar2.f312443n;
                bbj.c cVarA = aVar7.a();
                vc.s.j(cVarA);
                bbj.a aVar8 = (bbj.a) aVar7.f112759b.get();
                vc.s.j(aVar8);
                return new kd3.o(new rd3.b(cVarA, aVar8));
            case 7:
                BaseScreen screen = bVar.f312450b;
                ld3.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(screen, "screen");
                yy0.f fVarQ = jh.d.f(screen.m2()).Q();
                vc.s.k(fVarQ);
                return fVarQ;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        yc3.c cVar = (yc3.c) this.d;
        yc3.a aVar = (yc3.a) this.f308711c;
        int i = this.f308710b;
        switch (i) {
            case 0:
                return kxa.j.l((j60.a) cVar.e.get());
            case 1:
                return h30.l.p((com.revolut.kompot.navigable.a) cVar.f312458c.get(), (rp0.m) cVar.d.get());
            case 2:
                return new rp0.m();
            case 3:
                mre.c cVarB = aVar.f312441l.b();
                vc.s.j(cVarB);
                return new qpg.b(cVarB);
            case 4:
                e4m.e eVar = cVar.f312467r;
                yc3.a aVar2 = cVar.f312457b;
                jki.p pVar = (jki.p) eVar.get();
                CashbackProductScreenContract$InputData cashbackProductScreenContract$InputData = cVar.f312456a;
                bd3.a aVarA = aVar.f312437c.a();
                vc.s.j(aVarA);
                od3.a aVar3 = new od3.a();
                nd3.d dVarL = cVar.l();
                t0 t0Var = new t0();
                y0 y0Var = new y0(((k3) aVar2.f312442m).b());
                j60.a aVar4 = (j60.a) cVar.e.get();
                ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(10);
                builderBuilderWithExpectedSize.put(uc3.d.CREDIT, cVar.f312468s.get());
                builderBuilderWithExpectedSize.put(uc3.d.GIFTS, cVar.f312469t.get());
                builderBuilderWithExpectedSize.put(uc3.d.METAL, cVar.u.get());
                builderBuilderWithExpectedSize.put(uc3.d.PRO, cVar.v.get());
                builderBuilderWithExpectedSize.put(uc3.d.REWARDS, cVar.f312470w.get());
                builderBuilderWithExpectedSize.put(uc3.d.SHOPS, cVar.f312471x.get());
                builderBuilderWithExpectedSize.put(uc3.d.STAYS, cVar.f312472y.get());
                builderBuilderWithExpectedSize.put(uc3.d.PLAN, cVar.z.get());
                builderBuilderWithExpectedSize.put(uc3.d.SHOPPING, cVar.A.get());
                builderBuilderWithExpectedSize.put(uc3.d.TRAVEL, cVar.B.get());
                ImmutableMap immutableMapBuild = builderBuilderWithExpectedSize.build();
                ffk.t tVarF = aVar2.d.f();
                vc.s.j(tVarF);
                nd3.j jVar = new nd3.j(tVarF);
                qpg.b bVar = (qpg.b) cVar.f312459g.get();
                al4.q qVarA = aVar.f312438g.a();
                p9g.g gVarA = aVar.f.a();
                fk3.a aVarA2 = aVar.f312445q.a();
                vc.s.j(aVarA2);
                return new s0(pVar, cashbackProductScreenContract$InputData, aVarA, aVar3, dVarL, t0Var, y0Var, aVar4, immutableMapBuild, jVar, bVar, qVarA, gVarA, aVarA2);
            case 5:
                cVar.getClass();
                ImmutableMap.Builder builderBuilderWithExpectedSize2 = ImmutableMap.builderWithExpectedSize(10);
                builderBuilderWithExpectedSize2.put(uc3.d.CREDIT, cVar.f312460h.get());
                builderBuilderWithExpectedSize2.put(uc3.d.GIFTS, cVar.i.get());
                builderBuilderWithExpectedSize2.put(uc3.d.METAL, cVar.f312461j.get());
                builderBuilderWithExpectedSize2.put(uc3.d.PRO, cVar.k.get());
                builderBuilderWithExpectedSize2.put(uc3.d.REWARDS, cVar.f312462l.get());
                builderBuilderWithExpectedSize2.put(uc3.d.SHOPS, cVar.f312463m.get());
                builderBuilderWithExpectedSize2.put(uc3.d.STAYS, cVar.f312464n.get());
                builderBuilderWithExpectedSize2.put(uc3.d.PLAN, cVar.o.get());
                builderBuilderWithExpectedSize2.put(uc3.d.SHOPPING, cVar.f312465p.get());
                builderBuilderWithExpectedSize2.put(uc3.d.TRAVEL, cVar.f312466q.get());
                return new anl.j(builderBuilderWithExpectedSize2.build());
            case 6:
                thf.g transactionItemMapper = aVar.f312436b.e();
                vc.s.j(transactionItemMapper);
                Intrinsics.checkNotNullParameter(transactionItemMapper, "transactionItemMapper");
                return new rd3.f(transactionItemMapper);
            case 7:
                thf.g transactionItemMapper2 = aVar.f312436b.e();
                vc.s.j(transactionItemMapper2);
                Intrinsics.checkNotNullParameter(transactionItemMapper2, "transactionItemMapper");
                return new rd3.g(transactionItemMapper2);
            case 8:
                yik.h hVarB = ((k3) aVar.f312442m).b();
                rd3.b bVarE = cVar.e();
                od3.b bVar2 = new od3.b();
                thf.g gVarE = aVar.f312436b.e();
                vc.s.j(gVarE);
                return new rd3.j(hVarB, bVarE, bVar2, gVarE);
            case 9:
                thf.g transactionItemMapper3 = aVar.f312436b.e();
                vc.s.j(transactionItemMapper3);
                Intrinsics.checkNotNullParameter(transactionItemMapper3, "transactionItemMapper");
                return new rd3.q(transactionItemMapper3);
            case 10:
                thf.g transactionItemMapper4 = aVar.f312436b.e();
                vc.s.j(transactionItemMapper4);
                Intrinsics.checkNotNullParameter(transactionItemMapper4, "transactionItemMapper");
                return new rd3.s(transactionItemMapper4);
            case 11:
                thf.g transactionItemMapper5 = aVar.f312436b.e();
                vc.s.j(transactionItemMapper5);
                Intrinsics.checkNotNullParameter(transactionItemMapper5, "transactionItemMapper");
                return new rd3.w(transactionItemMapper5);
            case 12:
                thf.g transactionItemMapper6 = aVar.f312436b.e();
                vc.s.j(transactionItemMapper6);
                Intrinsics.checkNotNullParameter(transactionItemMapper6, "transactionItemMapper");
                return new z(transactionItemMapper6);
            case 13:
                yik.h hVarB2 = ((k3) aVar.f312442m).b();
                rd3.b bVarE2 = cVar.e();
                od3.b bVar3 = new od3.b();
                thf.g gVarE2 = aVar.f312436b.e();
                vc.s.j(gVarE2);
                return new rd3.o(hVarB2, bVarE2, bVar3, gVarE2);
            case 14:
                thf.g transactionItemMapper7 = aVar.f312436b.e();
                vc.s.j(transactionItemMapper7);
                Intrinsics.checkNotNullParameter(transactionItemMapper7, "transactionItemMapper");
                return new rd3.u(transactionItemMapper7);
            case 15:
                thf.g transactionItemMapper8 = aVar.f312436b.e();
                vc.s.j(transactionItemMapper8);
                Intrinsics.checkNotNullParameter(transactionItemMapper8, "transactionItemMapper");
                return new b0(transactionItemMapper8);
            case 16:
                al4.j jVarC = aVar.f312438g.c();
                nd3.d dVarL2 = cVar.l();
                whf.b bVarA = aVar.f312436b.a();
                vc.s.j(bVarA);
                return new pd3.b(jVarC, dVarL2, bVarA);
            case 17:
                nd3.d dVarL3 = cVar.l();
                whf.b bVarA2 = aVar.f312436b.a();
                vc.s.j(bVarA2);
                return new pd3.c(dVarL3, bVarA2, 0);
            case 18:
                ffk.t tVarF2 = aVar.d.f();
                vc.s.j(tVarF2);
                bd3.a aVarA3 = aVar.f312437c.a();
                vc.s.j(aVarA3);
                l61.a aVarB = aVar.o.b();
                vc.s.j(aVarB);
                nd3.d dVarL4 = cVar.l();
                whf.b bVarA3 = aVar.f312436b.a();
                vc.s.j(bVarA3);
                return new pd3.d(tVarF2, aVarA3, aVarB, dVarL4, bVarA3, cVar.d(), 0);
            case 19:
                h1 h1VarN = aVar.e.n();
                vc.s.j(h1VarN);
                ffk.t tVarF3 = aVar.d.f();
                vc.s.j(tVarF3);
                nd3.d dVarL5 = cVar.l();
                whf.b bVarA4 = aVar.f312436b.a();
                vc.s.j(bVarA4);
                return new pd3.e(h1VarN, tVarF3, dVarL5, bVarA4);
            case 20:
                nd3.d dVarL6 = cVar.l();
                whf.b bVarA5 = aVar.f312436b.a();
                vc.s.j(bVarA5);
                return new pd3.c(dVarL6, bVarA5, 1);
            case 21:
                nd3.d dVarL7 = cVar.l();
                whf.b bVarA6 = aVar.f312436b.a();
                vc.s.j(bVarA6);
                return new pd3.c(dVarL7, bVarA6, 3);
            case 22:
                p8g.a aVar5 = (p8g.a) aVar.f.f141635r0.get();
                vc.s.j(aVar5);
                ffk.t tVarF4 = aVar.d.f();
                vc.s.j(tVarF4);
                nd3.d dVarL8 = cVar.l();
                whf.b bVarA7 = aVar.f312436b.a();
                vc.s.j(bVarA7);
                return new pd3.f(aVar5, tVarF4, dVarL8, bVarA7);
            case 23:
                ffk.t tVarF5 = aVar.d.f();
                vc.s.j(tVarF5);
                bd3.a aVarA4 = aVar.f312437c.a();
                vc.s.j(aVarA4);
                l61.a aVarB2 = aVar.o.b();
                vc.s.j(aVarB2);
                nd3.d dVarL9 = cVar.l();
                whf.b bVarA8 = aVar.f312436b.a();
                vc.s.j(bVarA8);
                return new pd3.d(tVarF5, aVarA4, aVarB2, dVarL9, bVarA8, cVar.d(), 1);
            case 24:
                nd3.d dVarL10 = cVar.l();
                whf.b bVarA9 = aVar.f312436b.a();
                vc.s.j(bVarA9);
                return new pd3.c(dVarL10, bVarA9, 2);
            case 25:
                p8g.a aVar6 = (p8g.a) aVar.f.f141635r0.get();
                vc.s.j(aVar6);
                ffk.t tVarF6 = aVar.d.f();
                vc.s.j(tVarF6);
                nd3.d dVarL11 = cVar.l();
                whf.b bVarA10 = aVar.f312436b.a();
                vc.s.j(bVarA10);
                return new pd3.g(aVar6, tVarF6, dVarL11, bVarA10);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        djf.c cVar = ((yc3.a) this.f308711c).f312436b;
        yc3.d dVar = (yc3.d) this.d;
        int i = this.f308710b;
        if (i == 0) {
            return kxa.j.l((j60.a) dVar.e.get());
        }
        if (i == 1) {
            return h30.l.p((com.revolut.kompot.navigable.a) dVar.f312475c.get(), (rp0.m) dVar.d.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            if (i != 4) {
                throw new AssertionError(i);
            }
            whf.n nVarB = cVar.b();
            vc.s.j(nVarB);
            return new sd3.n(nVarB);
        }
        jki.p pVar = (jki.p) dVar.f312476g.get();
        CashbackTransactionsScreenContract$InputData cashbackTransactionsScreenContract$InputData = dVar.f312473a;
        whf.b bVarA = cVar.a();
        vc.s.j(bVarA);
        return new sd3.l(pVar, cashbackTransactionsScreenContract$InputData, bVarA, new nd3.d(dVar.f312474b.f312439h.b()), new sd3.o(), (j60.a) dVar.e.get());
    }

    private final Object g() {
        yc3.e eVar = (yc3.e) this.d;
        yc3.a aVar = (yc3.a) this.f308711c;
        l70.e eVar2 = aVar.f312446r;
        int i = this.f308710b;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            w80.b bVarJ = eVar2.j();
            vc.s.j(bVarJ);
            return new be3.o(bVarJ);
        }
        jki.p pVar = (jki.p) eVar.f312480c.get();
        CashbackWithdrawMetalScreenContract$InputData cashbackWithdrawMetalScreenContract$InputData = eVar.f312478a;
        k61.a aVarE = aVar.f312447s.e();
        vc.s.j(aVarE);
        bd3.a aVarA = aVar.f312437c.a();
        vc.s.j(aVarA);
        wsg.n nVarB = aVar.f312439h.b();
        yc3.a aVar2 = eVar.f312479b;
        bd3.a aVarA2 = aVar2.f312437c.a();
        vc.s.j(aVarA2);
        ffk.t tVarF = aVar2.d.f();
        vc.s.j(tVarF);
        jd3.k kVar = new jd3.k(aVarA2, tVarF, aVar2.f312439h.b(), aVar2.f312448t.c());
        w80.b bVarJ2 = eVar2.j();
        vc.s.j(bVarJ2);
        return new be3.m(pVar, cashbackWithdrawMetalScreenContract$InputData, aVarE, aVarA, nVarB, kVar, bVarJ2);
    }

    private final Object h() {
        yc3.a aVar = (yc3.a) this.f308711c;
        int i = this.f308710b;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            cd3.b cashbackSourceItemProvider = new cd3.b();
            Intrinsics.checkNotNullParameter(cashbackSourceItemProvider, "cashbackSourceItemProvider");
            return new zd3.k();
        }
        jki.p pVar = (jki.p) ((yc3.g) this.d).f312483a.get();
        bd3.a aVarA = aVar.f312437c.a();
        vc.s.j(aVarA);
        ffk.t tVarF = aVar.d.f();
        vc.s.j(tVarF);
        return new zd3.i(pVar, aVarA, tVarF);
    }

    private final Object i() {
        yc3.i iVar = (yc3.i) this.d;
        yc3.a aVar = iVar.f312488a;
        yc3.a aVar2 = (yc3.a) this.f308711c;
        k0 k0Var = aVar2.i;
        g9g.d dVar = aVar2.f;
        ad3.f fVar = aVar2.f312437c;
        djf.c cVar = aVar2.f312436b;
        jm4.r rVar = aVar2.f312438g;
        int i = this.f308710b;
        if (i == 0) {
            return kxa.j.l((j60.a) iVar.d.get());
        }
        if (i == 1) {
            return h30.l.p((com.revolut.kompot.navigable.a) iVar.f312489b.get(), (rp0.m) iVar.f312490c.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            if (i != 4) {
                throw new AssertionError(i);
            }
            thf.g gVarE = cVar.e();
            vc.s.j(gVarE);
            return new i0(gVarE, new cd3.b(), new wd3.b());
        }
        jki.p pVar = (jki.p) iVar.f.get();
        bd3.a aVarA = fVar.a();
        vc.s.j(aVarA);
        gd3.b bVar = (gd3.b) fVar.f3255q.get();
        vc.s.j(bVar);
        ffk.t tVarF = aVar2.d.f();
        vc.s.j(tVarF);
        h1 h1VarN = aVar2.e.n();
        vc.s.j(h1VarN);
        p8g.a aVar3 = (p8g.a) dVar.f141635r0.get();
        vc.s.j(aVar3);
        al4.q qVarA = rVar.a();
        al4.j jVarC = rVar.c();
        al4.p pVarI = rVar.i();
        nd3.d dVar2 = new nd3.d(aVar.f312439h.b());
        whf.b bVarA = cVar.a();
        vc.s.j(bVarA);
        ffk.t tVarF2 = aVar.d.f();
        vc.s.j(tVarF2);
        nd3.j jVar = new nd3.j(tVarF2);
        j60.a aVar4 = (j60.a) iVar.d.get();
        ud3.a aVar5 = new ud3.a();
        eub.a aVarA2 = k0Var.a();
        vc.s.j(aVarA2);
        com.revolut.feature.rev_points.api.navigation.a aVarA3 = aVar2.f312440j.a();
        vc.s.j(aVarA3);
        eub.i iVarE = k0Var.e();
        vc.s.j(iVarE);
        sha.c cVarA = ((yha.a) aVar2.k).a();
        vc.s.j(cVarA);
        return new e0(pVar, aVarA, bVar, tVarF, h1VarN, aVar3, qVarA, jVarC, pVarI, dVar2, bVarA, jVar, aVar4, aVar5, aVarA2, aVarA3, iVarE, cVarA, dVar.a());
    }

    private final Object j() {
        yh1.d dVar = (yh1.d) this.d;
        yh1.e eVar = (yh1.e) this.f308711c;
        int i = this.f308710b;
        if (i == 0) {
            mi1.d extension = (mi1.d) dVar.e.get();
            mi1.f.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            mi1.d dVar2 = extension;
            vc.s.k(dVar2);
            return dVar2;
        }
        if (i == 1) {
            y80.a aVarR = eVar.f313708b.r();
            vc.s.j(aVarR);
            w39.b bVarA = eVar.f313709c.a();
            vc.s.j(bVarA);
            return new mi1.d(aVarR, bVarA);
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        AddressFlowContract$InputData addressFlowContract$InputData = dVar.f313702a;
        gte.a aVarB = eVar.d.b();
        vc.s.j(aVarB);
        return new zh1.b(addressFlowContract$InputData, aVarB);
    }

    private final Object k() {
        yh1.e eVar = (yh1.e) this.f308711c;
        yh1.f fVar = (yh1.f) this.d;
        int i = this.f308710b;
        if (i == 0) {
            mi1.d extension = (mi1.d) fVar.d.get();
            mi1.f.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            mi1.d dVar = extension;
            vc.s.k(dVar);
            return dVar;
        }
        if (i != 1) {
            if (i == 2) {
                return new com.revolut.feature.address.common.impl.flow.screen.find.flow.a(fVar.f313712a, new vi1.i());
            }
            throw new AssertionError(i);
        }
        y80.a aVarR = eVar.f313708b.r();
        vc.s.j(aVarR);
        w39.b bVarA = eVar.f313709c.a();
        vc.s.j(bVarA);
        return new mi1.d(aVarR, bVarA);
    }

    private final Object l() {
        yh1.g gVar = (yh1.g) this.d;
        int i = this.f308710b;
        if (i == 0) {
            return new qi1.e((cli.n) gVar.f313716b.get());
        }
        if (i == 1) {
            return new qi1.h(gVar.f313715a, (uh1.a) ((yh1.e) this.f308711c).f.get());
        }
        throw new AssertionError(i);
    }

    private final Object m() {
        yh1.h hVar = (yh1.h) this.d;
        FieldSearchScreenContract$InputData fieldSearchScreenContract$InputData = hVar.f313718a;
        int i = this.f308710b;
        if (i != 0) {
            if (i == 1) {
                return new ei1.m(fieldSearchScreenContract$InputData, new xi1.a());
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) hVar.f313719b.get();
        rh1.b bVarA = ((yh1.e) this.f308711c).f313707a.a();
        vc.s.j(bVarA);
        return new ei1.k(nVar, fieldSearchScreenContract$InputData, bVarA);
    }

    private final Object n() {
        yh1.i iVar = (yh1.i) this.d;
        int i = this.f308710b;
        if (i == 0) {
            cli.n nVar = (cli.n) iVar.f313723c.get();
            rh1.b bVarA = ((yh1.e) this.f308711c).f313707a.a();
            vc.s.j(bVarA);
            return new ni1.i(nVar, bVarA, (e0m.f) iVar.e.get(), iVar.f313722b);
        }
        if (i == 1) {
            return new ni1.l(iVar.f313721a, new xi1.a());
        }
        if (i != 2) {
            if (i != 3) {
                throw new AssertionError(i);
            }
            oi1.a.Companion.getClass();
            return new zzl.c();
        }
        zzl.b regexMatcher = (zzl.b) iVar.d.get();
        oi1.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        return new e0m.f(regexMatcher);
    }

    private final Object o() {
        yh1.j jVar = (yh1.j) this.d;
        SuggestionSheetContract$InputData suggestionSheetContract$InputData = jVar.f313724a;
        int i = this.f308710b;
        if (i == 0) {
            return new ti1.g(suggestionSheetContract$InputData, (cli.n) jVar.f313725b.get());
        }
        if (i == 1) {
            return new ti1.h(suggestionSheetContract$InputData, (uh1.a) ((yh1.e) this.f308711c).f.get());
        }
        throw new AssertionError(i);
    }

    private final Object p() {
        yj4.b bVar = (yj4.b) this.f308711c;
        yj4.c cVar = (yj4.c) this.d;
        int i = this.f308710b;
        if (i == 0) {
            return kxa.j.l((j60.a) cVar.f314416c.get());
        }
        if (i == 1) {
            return h30.l.p((com.revolut.kompot.navigable.a) cVar.f314414a.get(), (rp0.m) cVar.f314415b.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            if (i == 4) {
                return new fk4.s();
            }
            throw new AssertionError(i);
        }
        jki.p pVar = (jki.p) cVar.e.get();
        zj4.a aVar = (zj4.a) bVar.f.get();
        com.revolut.feature.external_accounts.api.navigation.a aVarB = ((xf6.t) bVar.f314411b).b();
        vc.s.j(aVarB);
        return new fk4.q(pVar, aVar, aVarB);
    }

    @Override // phm.a
    public final Object get() {
        Object iVar;
        Object cVar;
        Object dVar;
        Object cVar2;
        Object cVar3;
        switch (this.f308709a) {
            case 0:
                trl.a aVar = ((p) this.f308711c).k;
                r rVar = (r) this.d;
                int i = this.f308710b;
                if (i == 0) {
                    iVar = new sul.i(rVar.f308712a, (sul.j) rVar.f308714c.get());
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new AssertionError(i);
                        }
                        wul.o oVarK = aVar.k();
                        xul.n nVar = (xul.n) aVar.Y.get();
                        vc.s.j(nVar);
                        return new svl.f(oVarK, nVar);
                    }
                    iVar = new sul.j(new tul.b((svl.g) rVar.f308713b.get()), new g0((svl.g) rVar.f308713b.get()), new p56.a((svl.g) rVar.f308713b.get()), new tul.a());
                }
                return iVar;
            case 1:
                xuj.f fVar = (xuj.f) this.d;
                xuj.i iVar2 = (xuj.i) this.f308711c;
                int i2 = this.f308710b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new AssertionError(i2);
                    }
                    com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) fVar.f309087c.get();
                    ivj.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller, "controller");
                    return new l0(controller.m2());
                }
                zuj.t tVar = fVar.f309085a;
                yuj.a aVar2 = (yuj.a) iVar2.f309104s.get();
                q06.l lVarA = iVar2.e.a();
                vc.s.j(lVarA);
                p8g.c cVarB = iVar2.f.b();
                vc.s.j(cVarB);
                hyf.a aVarA = iVar2.f309095g.a();
                vc.s.j(aVarA);
                mti.h hVar = (mti.h) iVar2.f309096h.f189544p.get();
                vc.s.j(hVar);
                gte.a aVarB = iVar2.f309092a.b();
                vc.s.j(aVarB);
                zuj.a aVar3 = new zuj.a();
                l0 l0Var = (l0) fVar.d.get();
                xuj.i iVar3 = fVar.f309086b;
                ozb.b bVar = new ozb.b(zxb.y0.w(iVar3.i.f326121c));
                qd0.b bVarN = iVar3.f309097j.n();
                vc.s.j(bVarN);
                return new com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a(tVar, aVar2, lVarA, cVarB, aVarA, hVar, aVarB, aVar3, l0Var, new d0(bVar, bVarN));
            case 2:
                xz4.d dVar2 = (xz4.d) this.f308711c;
                xz4.a aVar4 = (xz4.a) this.d;
                int i3 = this.f308710b;
                switch (i3) {
                    case 0:
                        ypi.h hVar2 = aVar4.f309794b;
                        fsi.g gVar = aVar4.f309793a;
                        return new ypi.e(hVar2, bq.i.b(gVar), bq.i.o(gVar), bq.i.g(gVar));
                    case 1:
                        return new hqi.f(aVar4.f309795c, bq.i.b(aVar4.f309793a));
                    case 2:
                        return kpi.f.a();
                    case 3:
                        Context contextI = bq.i.i(aVar4.f309793a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar4.f309793a);
                        t70.g gVarO = dVar2.f309841b.o();
                        vc.s.j(gVarO);
                        cVar = new npi.c(contextI, baseDelegatesActivityF, gVarO);
                        break;
                    case 4:
                        return new tpi.i((rpi.c) aVar4.f309798j.get(), gsi.c.a(aVar4.f309793a));
                    case 5:
                        return new rpi.b(bq.i.b(aVar4.f309793a));
                    case 6:
                        return new rpi.h(bq.i.b(aVar4.f309793a));
                    case 7:
                        cVar = new iri.g((iri.j) dVar2.f309853n.get(), (iri.m) dVar2.u.get(), bq.i.f(aVar4.f309793a), bq.i.l(aVar4.f309793a));
                        break;
                    case 8:
                        cVar = new iri.l((iri.m) dVar2.u.get(), bq.i.f(aVar4.f309793a), (iri.d) aVar4.f309801n.get());
                        break;
                    case 9:
                        return new iri.d(bq.i.f(aVar4.f309793a));
                    case 10:
                        return new opi.b(bq.i.f(aVar4.f309793a));
                    case 11:
                        return new qi3.l(bq.i.l(aVar4.f309793a), (f9b.f) aVar4.f309803q.get(), (qi3.r) dVar2.f309863t0.get(), (com.revolut.feature.chooser.c) dVar2.u0.get(), aVar4.d, (ypi.i) aVar4.f.get(), (hqi.l) aVar4.f309796g.get(), (opi.d) aVar4.f309802p.get(), (tpi.j) aVar4.k.get(), bq.i.o(aVar4.f309793a));
                    case 12:
                        return bq.i.t(aVar4.f309793a);
                    default:
                        throw new AssertionError(i3);
                }
                return cVar;
            case 3:
                xz4.d dVar3 = (xz4.d) this.f308711c;
                xz4.b bVar2 = (xz4.b) this.d;
                int i5 = this.f308710b;
                switch (i5) {
                    case 0:
                        bVar2.getClass();
                        dVar = new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) dVar3.o.get(), dVar3.k());
                        break;
                    case 1:
                        um.c cVar4 = (um.c) dVar3.f309856p.get();
                        bVar2.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
                        xz4.d dVar4 = bVar2.f309808g;
                        hn.h hVar3 = (hn.h) dVar4.f309857q.get();
                        t70.g gVarO2 = dVar4.f309841b.o();
                        vc.s.j(gVarO2);
                        builderBuilderWithExpectedSize.add(new jn.a(hVar3, gVarO2));
                        builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                        builderBuilderWithExpectedSize.add(dVar4.l());
                        builderBuilderWithExpectedSize.add(new xc0.a((qc0.j) dVar4.f309842b0.get(), (qc0.h) dVar4.X.get()));
                        builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                        builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(bVar2.i)));
                        dVar = new in.e(cVar4, builderBuilderWithExpectedSize.build(), dVar3.k());
                        break;
                    case 2:
                        return bq.i.t(bVar2.f309805a);
                    case 3:
                        bVar2.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                        builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                        builderBuilderWithExpectedSize2.add(bVar2.k.get());
                        builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(bVar2.f309812m)));
                        dVar = new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) dVar3.Q.get(), dVar3.k());
                        break;
                    case 4:
                        return new zm.a();
                    case 5:
                        return new tpi.i((rpi.c) bVar2.f309811l.get(), gsi.c.a(bVar2.f309805a));
                    case 6:
                        return new rpi.b(bq.i.b(bVar2.f309805a));
                    case 7:
                        bVar2.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                        builderBuilderWithExpectedSize3.add(bVar2.f309808g.l());
                        dVar = new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) dVar3.f309857q.get(), (npi.f) bVar2.o.get());
                        break;
                    case 8:
                        Context contextI2 = bq.i.i(bVar2.f309805a);
                        BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(bVar2.f309805a);
                        t70.g gVarO3 = dVar3.f309841b.o();
                        vc.s.j(gVarO3);
                        dVar = new npi.c(contextI2, baseDelegatesActivityF2, gVarO3);
                        break;
                    case 9:
                        xz4.d dVar5 = bVar2.f309808g;
                        return new en.c(ImmutableSet.of((ln.d) dVar5.f0.get(), (ln.d) dVar5.f309842b0.get(), (ln.d) dVar5.f309858r.get()), bq.i.l(bVar2.f309805a));
                    case 10:
                        dVar = new gn.c((lpi.e) bVar2.f309816r.get(), (sm.e) dVar3.g0.get(), ImmutableSet.copyOf((Collection) gn.e.a()), dVar3.k());
                        break;
                    case 11:
                        return new lpi.b(bq.i.i(bVar2.f309805a), bq.i.j(bVar2.f309805a));
                    case 12:
                        bVar2.getClass();
                        dVar = new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) dVar3.f309848h0.get(), dVar3.k());
                        break;
                    case 13:
                        bVar2.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize4.addAll((Iterable) g3l.f.a());
                        builderBuilderWithExpectedSize4.add(bVar2.f309808g.d());
                        dVar = new g3l.c(builderBuilderWithExpectedSize4.build(), (g3l.g) dVar3.i0.get(), (k3l.b) bVar2.u.get(), dVar3.k());
                        break;
                    case 14:
                        return new k3l.d(bq.i.b(bVar2.f309805a));
                    case 15:
                        ypi.h hVar4 = bVar2.f309806b;
                        fsi.g gVar2 = bVar2.f309805a;
                        return new ypi.e(hVar4, bq.i.b(gVar2), bq.i.o(gVar2), bq.i.g(gVar2));
                    case 16:
                        return new hqi.f(bVar2.f309807c, bq.i.b(bVar2.f309805a));
                    case 17:
                        return new rpi.h(bq.i.b(bVar2.f309805a));
                    case 18:
                        dVar = new iri.g((iri.j) dVar3.f309853n.get(), (iri.m) dVar3.f309860s.get(), bq.i.f(bVar2.f309805a), bq.i.l(bVar2.f309805a));
                        break;
                    case 19:
                        dVar = new iri.l((iri.m) dVar3.f309860s.get(), bq.i.f(bVar2.f309805a), (iri.d) bVar2.A.get());
                        break;
                    case 20:
                        return new iri.d(bq.i.f(bVar2.f309805a));
                    case 21:
                        dVar = new an.q((cqi.h) bVar2.C.get(), (an.a) dVar3.j0.get(), ImmutableSet.copyOf((Collection) bn.b.a()), dVar3.k());
                        break;
                    case 22:
                        return new cqi.j(bq.i.f(bVar2.f309805a));
                    case 23:
                        return new xpi.c(bVar2.d, bq.i.b(bVar2.f309805a));
                    case 24:
                        dVar = new com.revolut.retail.toast.mediator.a((d4l.a) dVar3.f309850k0.get(), (c4l.b) bVar2.F.get());
                        break;
                    case 25:
                        return new c4l.e(bq.i.i(bVar2.f309805a), bq.i.g(bVar2.f309805a));
                    case 26:
                        dVar = new f5l.c((f5l.a) dVar3.l0.get(), bq.i.b(bVar2.f309805a));
                        break;
                    case 27:
                        Activity activityB = bq.i.b(bVar2.f309805a);
                        y80.b bVar3 = new y80.b();
                        g60.a aVar5 = (g60.a) bVar2.I.get();
                        fsi.g gVar3 = bVar2.f309805a;
                        Activity activityB2 = bq.i.b(gVar3);
                        t80.g gVar4 = (t80.g) bVar2.J.get();
                        BaseDelegatesActivity baseDelegatesActivityF3 = bq.i.f(gVar3);
                        d4m.a aVarA2 = e4m.b.a(bVar2.K);
                        nli.a aVarG = bVar2.g();
                        t80.g gVar5 = (t80.g) bVar2.J.get();
                        l70.e eVar = bVar2.f309808g.f309841b;
                        zk0.b bVarL = eVar.l();
                        vc.s.j(bVarL);
                        oli.c cVar5 = new oli.c(gVar5, bVarL, bVar2.g(), (g60.a) bVar2.I.get(), bVar2.h());
                        ComponentActivity componentActivityA = gmf.b.a(gVar3);
                        ActivityResultRegistry activityResultRegistryA = pli.b.a(gmf.b.a(gVar3));
                        ami.n nVar2 = new ami.n(e4m.b.a(bVar2.L), 1);
                        d4m.a aVarA3 = e4m.b.a(bVar2.K);
                        t80.g gVar6 = (t80.g) bVar2.J.get();
                        nli.a aVarG2 = bVar2.g();
                        i90.b bVar4 = new i90.b();
                        z70.a aVarF = eVar.f();
                        vc.s.j(aVarF);
                        c70.b bVar5 = new c70.b(aVarF, 2);
                        z70.a aVarF2 = eVar.f();
                        vc.s.j(aVarF2);
                        return new upi.b(activityB, bVar3, new t80.v(aVar5, activityB2, gVar4, baseDelegatesActivityF3, aVarA2, aVarG, cVar5, new oli.g(componentActivityA, activityResultRegistryA, nVar2, aVarA3, gVar6, aVarG2, bVar4, new u96.b(bVar5, new smd.s(aVarF2)), bVar2.h()), bVar2.h()));
                    case 28:
                        return new g60.a(bq.i.b(bVar2.f309805a));
                    case 29:
                        l70.e eVar2 = dVar3.f309841b;
                        l70.e eVar3 = dVar3.f309841b;
                        f80.a aVarX = eVar2.x();
                        vc.s.j(aVarX);
                        l80.e eVarH = eVar3.h();
                        vc.s.j(eVarH);
                        zk0.b bVarL2 = eVar3.l();
                        vc.s.j(bVarL2);
                        dVar = new t80.b(aVarX, eVarH, bVarL2);
                        break;
                    case 30:
                        return pli.c.a(new ks0.n(bq.i.f(bVar2.f309805a)));
                    case 31:
                        return t96.a.a();
                    case 32:
                        return new aqi.d(bq.i.b(bVar2.f309805a), new y80.b());
                    case 33:
                        return new iqi.b(bVar2.e, bq.i.b(bVar2.f309805a));
                    case 34:
                        return new opi.b(bq.i.f(bVar2.f309805a));
                    case 35:
                        ForbearanceApplicationQuestionnaireContract$Configuration config = bVar2.f;
                        d05.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(config, "config");
                        BackendFlowContract$Configuration backendFlowContract$Configuration = config.f69944a;
                        vc.s.k(backendFlowContract$Configuration);
                        return backendFlowContract$Configuration;
                    case 36:
                        x90.c cVar6 = dVar3.d;
                        yc0.q qVar = new yc0.q(bVar2.e());
                        yc0.r rVar2 = (yc0.r) bVar2.R.get();
                        ad0.c cVar7 = (ad0.c) bVar2.S.get();
                        ad0.w wVarG = dVar3.k.g();
                        vc.s.j(wVarG);
                        f0 f0Var = (f0) bVar2.T.get();
                        ad0.h hVar5 = (ad0.h) bVar2.U.get();
                        ad0.n nVarF = bVar2.f();
                        u9l.a aVarB2 = dVar3.f309849j.b();
                        vc.s.j(aVarB2);
                        return wpg.v.o(cVar6, qVar, rVar2, cVar7, wVarG, f0Var, hVar5, nVarF, aVarB2);
                    case 37:
                        return wpg.v.n(dVar3.d, bVar2.e(), new yc0.p());
                    case 38:
                        x90.c cVar8 = dVar3.d;
                        return new ad0.d();
                    case 39:
                        x90.c cVar9 = dVar3.d;
                        hbl.d dVarC = dVar3.f309849j.c();
                        vc.s.j(dVarC);
                        return wpg.v.y(cVar9, dVarC);
                    case 40:
                        return wpg.v.a(dVar3.d, bVar2.f());
                    case 41:
                        return wpg.v.w(dVar3.d, (yc0.r) bVar2.R.get(), new yc0.p());
                    case 42:
                        dVar = new ae7.i((upi.f) bVar2.M.get(), (t80.c) dVar3.m0.get(), (d4l.a) dVar3.f309850k0.get(), (aqi.a) bVar2.X.get(), new ae7.j(), bq.i.l(bVar2.f309805a));
                        break;
                    case 43:
                        return aqi.f.a(bVar2.f309805a, (aqi.d) bVar2.N.get());
                    default:
                        throw new AssertionError(i5);
                }
                return dVar;
            case 4:
                xz4.d dVar6 = (xz4.d) this.f308711c;
                xz4.c cVar10 = (xz4.c) this.d;
                int i6 = this.f308710b;
                switch (i6) {
                    case 0:
                        cVar10.getClass();
                        return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) dVar6.o.get(), dVar6.k());
                    case 1:
                        um.c cVar11 = (um.c) dVar6.f309856p.get();
                        cVar10.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize5 = ImmutableSet.builderWithExpectedSize(6);
                        xz4.d dVar7 = cVar10.f309824c;
                        hn.h hVar6 = (hn.h) dVar7.f309857q.get();
                        t70.g gVarO4 = dVar7.f309841b.o();
                        vc.s.j(gVarO4);
                        builderBuilderWithExpectedSize5.add(new jn.a(hVar6, gVarO4));
                        builderBuilderWithExpectedSize5.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                        builderBuilderWithExpectedSize5.add(dVar7.l());
                        builderBuilderWithExpectedSize5.add(new xc0.a((qc0.j) dVar7.f309842b0.get(), (qc0.h) dVar7.X.get()));
                        builderBuilderWithExpectedSize5.addAll((Iterable) in.g.a());
                        builderBuilderWithExpectedSize5.add(new jn.d(e4m.b.a(cVar10.e)));
                        return new in.e(cVar11, builderBuilderWithExpectedSize5.build(), dVar6.k());
                    case 2:
                        return bq.i.t(cVar10.f309822a);
                    case 3:
                        cVar10.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize6 = ImmutableSet.builderWithExpectedSize(3);
                        builderBuilderWithExpectedSize6.addAll((Iterable) kn.g.a());
                        builderBuilderWithExpectedSize6.add(cVar10.f309825g.get());
                        builderBuilderWithExpectedSize6.add(new kn.h(e4m.b.a(cVar10.i)));
                        return new kn.e(builderBuilderWithExpectedSize6.build(), (ym.d) dVar6.Q.get(), dVar6.k());
                    case 4:
                        return new zm.a();
                    case 5:
                        return new tpi.i((rpi.c) cVar10.f309826h.get(), gsi.c.a(cVar10.f309822a));
                    case 6:
                        return new rpi.b(bq.i.b(cVar10.f309822a));
                    case 7:
                        cVar10.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize7 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize7.addAll((Iterable) hn.g.a());
                        builderBuilderWithExpectedSize7.add(cVar10.f309824c.l());
                        return new hn.d(builderBuilderWithExpectedSize7.build(), (hn.h) dVar6.f309857q.get(), (npi.f) cVar10.k.get());
                    case 8:
                        Context contextI3 = bq.i.i(cVar10.f309822a);
                        BaseDelegatesActivity baseDelegatesActivityF4 = bq.i.f(cVar10.f309822a);
                        t70.g gVarO5 = dVar6.f309841b.o();
                        vc.s.j(gVarO5);
                        return new npi.c(contextI3, baseDelegatesActivityF4, gVarO5);
                    case 9:
                        xz4.d dVar8 = cVar10.f309824c;
                        return new en.c(ImmutableSet.of((ln.d) dVar8.f0.get(), (ln.d) dVar8.f309842b0.get(), (ln.d) dVar8.f309858r.get()), bq.i.l(cVar10.f309822a));
                    case 10:
                        return new gn.c((lpi.e) cVar10.f309830n.get(), (sm.e) dVar6.g0.get(), ImmutableSet.copyOf((Collection) gn.e.a()), dVar6.k());
                    case 11:
                        return new lpi.b(bq.i.i(cVar10.f309822a), bq.i.j(cVar10.f309822a));
                    case 12:
                        cVar10.getClass();
                        return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) dVar6.f309848h0.get(), dVar6.k());
                    case 13:
                        cVar10.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize8 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize8.addAll((Iterable) g3l.f.a());
                        builderBuilderWithExpectedSize8.add(cVar10.f309824c.d());
                        return new g3l.c(builderBuilderWithExpectedSize8.build(), (g3l.g) dVar6.i0.get(), (k3l.b) cVar10.f309832q.get(), dVar6.k());
                    case 14:
                        return new k3l.d(bq.i.b(cVar10.f309822a));
                    case 15:
                        return kpi.f.a();
                    case 16:
                        return new rpi.h(bq.i.b(cVar10.f309822a));
                    case 17:
                        return new iri.g((iri.j) dVar6.f309853n.get(), (iri.m) dVar6.f309860s.get(), bq.i.f(cVar10.f309822a), bq.i.l(cVar10.f309822a));
                    case 18:
                        return new iri.l((iri.m) dVar6.f309860s.get(), bq.i.f(cVar10.f309822a), (iri.d) cVar10.v.get());
                    case 19:
                        return new iri.d(bq.i.f(cVar10.f309822a));
                    case 20:
                        return new opi.b(bq.i.f(cVar10.f309822a));
                    case 21:
                        return new an.q((cqi.h) cVar10.f309838y.get(), (an.a) dVar6.j0.get(), ImmutableSet.copyOf((Collection) bn.b.a()), dVar6.k());
                    case 22:
                        return new cqi.j(bq.i.f(cVar10.f309822a));
                    case 23:
                        CreditProgressContract$Configuration creditProgressContract$Configuration = cVar10.f309823b;
                        vz4.a aVar6 = (vz4.a) dVar6.X.get();
                        f9b.f fVar2 = (f9b.f) cVar10.e.get();
                        e05.b bVar6 = (e05.b) dVar6.f309861s0.get();
                        ln.a aVar7 = (ln.a) dVar6.f309858r.get();
                        mz4.a aVar8 = (mz4.a) dVar6.f309843c.f250355t.get();
                        vc.s.j(aVar8);
                        return new e05.i(creditProgressContract$Configuration, aVar6, fVar2, bVar6, aVar7, aVar8, (k3l.b) cVar10.f309832q.get());
                    default:
                        throw new AssertionError(i6);
                }
            case 5:
                y03.b bVar7 = (y03.b) this.f308711c;
                y03.a aVar9 = (y03.a) this.d;
                int i21 = this.f308710b;
                switch (i21) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI4 = bq.i.i(aVar9.f310110a);
                        BaseDelegatesActivity baseDelegatesActivityF5 = bq.i.f(aVar9.f310110a);
                        t70.g gVarO6 = bVar7.f310119a.o();
                        vc.s.j(gVarO6);
                        cVar2 = new npi.c(contextI4, baseDelegatesActivityF5, gVarO6);
                        break;
                    case 2:
                        return new tpi.i((rpi.c) aVar9.e.get(), gsi.c.a(aVar9.f310110a));
                    case 3:
                        return new rpi.b(bq.i.b(aVar9.f310110a));
                    case 4:
                        return new rpi.h(bq.i.b(aVar9.f310110a));
                    case 5:
                        cVar2 = new iri.g((iri.j) bVar7.i.get(), (iri.m) bVar7.f310124j.get(), bq.i.f(aVar9.f310110a), bq.i.l(aVar9.f310110a));
                        break;
                    case 6:
                        cVar2 = new iri.l((iri.m) bVar7.f310124j.get(), bq.i.f(aVar9.f310110a), (iri.d) aVar9.i.get());
                        break;
                    case 7:
                        return new iri.d(bq.i.f(aVar9.f310110a));
                    case 8:
                        return new opi.b(bq.i.f(aVar9.f310110a));
                    case 9:
                        aVar9.getClass();
                        return new xpi.c(xpi.f.f307976c, bq.i.b(aVar9.f310110a));
                    case 10:
                        return new en.c(ImmutableSet.of((ln.d) aVar9.f310111b.k.get()), bq.i.l(aVar9.f310110a));
                    case 11:
                        x03.h hVar7 = (x03.h) bVar7.f310125l.get();
                        m93.g gVarI = aVar9.f310111b.f310120b.i();
                        vc.s.j(gVarI);
                        return new x03.n(hVar7, new x03.f(gVarI), (xpi.g) aVar9.f310116l.get(), (x03.c) bVar7.o.get(), (tpi.j) aVar9.f.get(), (f9b.f) aVar9.f310118n.get());
                    case 12:
                        return bq.i.t(aVar9.f310110a);
                    default:
                        throw new AssertionError(i21);
                }
                return cVar2;
            case 6:
                y1l.g gVar7 = (y1l.g) this.d;
                y1l.b bVar8 = (y1l.b) this.f308711c;
                r7d.l lVar = bVar8.f;
                int i22 = this.f308710b;
                if (i22 == 0) {
                    return h7d.d.a(gVar7.f310411a, (i7d.o) gVar7.d.get(), lVar.d());
                }
                if (i22 == 1) {
                    return h7d.f.a(lVar.d(), Optional.empty());
                }
                if (i22 != 2) {
                    throw new AssertionError(i22);
                }
                TravelStatusPartnerScreenContract$InputData travelStatusPartnerScreenContract$InputData = gVar7.f310412b;
                z1l.d dVar9 = new z1l.d((u1l.e) bVar8.f310400p.get());
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) bVar8.f310394g).c();
                vc.s.j(aVarC);
                z1l.e eVar4 = new z1l.e();
                x xVarD = ((s41.a) bVar8.f310395h).d();
                sfk.a aVarE = bVar8.i.e();
                vc.s.j(aVarE);
                i7d.o oVar = (i7d.o) gVar7.d.get();
                y1l.b bVar9 = gVar7.f310413c;
                pqi.a aVar10 = bVar9.e;
                f01.c cVarG = aVar10.g();
                q0 q0Var = new q0();
                i2l.h hVar8 = new i2l.h(aVar10.g());
                thf.g gVarE = bVar9.f310396j.e();
                vc.s.j(gVarE);
                return new m0(travelStatusPartnerScreenContract$InputData, dVar9, aVarC, eVar4, xVarD, aVarE, oVar, new p0(cVarG, q0Var, hVar8, new i2l.t0(gVarE), new i2l.c(aVar10.g()), new nd7.d(new nd7.c())));
            case 7:
                y67.d dVar10 = (y67.d) this.f308711c;
                y67.b bVar10 = (y67.b) this.d;
                int i32 = this.f308710b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        return new b77.p();
                    }
                    throw new AssertionError(i32);
                }
                cli.n nVar3 = (cli.n) bVar10.f311211b.get();
                DirectDebitFormScreenContract$InputData directDebitFormScreenContract$InputData = bVar10.f311210a;
                l80.e eVarH2 = dVar10.f311218c.h();
                vc.s.j(eVarH2);
                d77.a aVar11 = new d77.a();
                vz1.g gVarH = ((lz1.m) dVar10.d).h();
                vc.s.j(gVarH);
                y67.j.Companion.getClass();
                xi0.b.Companion.getClass();
                xi0.b bVar11 = xi0.b.o;
                vc.s.k(bVar11);
                return new com.revolut.feature.giro.impl.ui.form.b(nVar3, directDebitFormScreenContract$InputData, eVarH2, aVar11, gVarH, bVar11);
            case 8:
                y67.c cVar12 = (y67.c) this.d;
                y67.d dVar11 = (y67.d) this.f308711c;
                int i33 = this.f308710b;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new AssertionError(i33);
                    }
                    gte.a aVarB3 = dVar11.e.b();
                    vc.s.j(aVarB3);
                    return new e77.m(aVarB3);
                }
                cli.n nVar4 = (cli.n) cVar12.f311215c.get();
                DirectDebitReviewScreenContract$InputData directDebitReviewScreenContract$InputData = cVar12.f311213a;
                vz1.g gVarH2 = ((lz1.m) cVar12.f311214b.d).h();
                vc.s.j(gVarH2);
                return new com.revolut.feature.giro.impl.ui.review.a(nVar4, directDebitReviewScreenContract$InputData, new f61.a(gVarH2), new l2j.a());
            case 9:
                y77.c cVar13 = (y77.c) this.f308711c;
                y77.a aVar12 = (y77.a) this.d;
                int i43 = this.f308710b;
                switch (i43) {
                    case 0:
                        h87.e extensions = (h87.e) aVar12.f.get();
                        i87.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extensions, "extensions");
                        return extensions.f149951a;
                    case 1:
                        return hy1.g.h(aVar12.f311349a, new g2e.t((h87.c) aVar12.e.get()));
                    case 2:
                        return new h87.l(aVar12.b(), new s4i.i(new qpk.b(), 1));
                    case 3:
                        j87.c extensions2 = (j87.c) aVar12.i.get();
                        k87.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extensions2, "extensions");
                        return extensions2.f172133a;
                    case 4:
                        j87.b delegates = aVar12.f311350b;
                        j87.a controllerModelExtension = (j87.a) aVar12.f311353h.get();
                        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
                        p96.a factory = new p96.a(19);
                        k87.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(delegates, "delegates");
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(delegates, "delegates");
                        cVar3 = new j87.c(new j87.l(delegates, controllerModelExtension), controllerModelExtension);
                        break;
                    case 5:
                        cVar3 = new j87.j(aVar12.b(), cVar13.f311365h.a(), new l87.c(new adh.a(), aVar12.d.i.g()), new s4i.i(new qpk.b(), 1));
                        break;
                    case 6:
                        return a10.b.f((u8h.b) cVar13.f311366j, "factory");
                    case 7:
                        h87.e extensions3 = (h87.e) aVar12.f.get();
                        i87.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extensions3, "extensions");
                        yji.n nVar5 = extensions3.f149952b;
                        vc.s.k(nVar5);
                        return nVar5;
                    case 8:
                        j87.c extensions4 = (j87.c) aVar12.i.get();
                        k87.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extensions4, "extensions");
                        yji.n nVar6 = extensions4.f172134b;
                        vc.s.k(nVar6);
                        return nVar6;
                    case 9:
                        h87.b bVar12 = new h87.b();
                        y77.c cVar14 = aVar12.d;
                        return new o87.f(new bof.r(new h87.s(bVar12, new n87.v(cVar14.f311362b.C(), ((mkh.s) cVar14.k).b())), (q1) aVar12.f311357n.get(), new j87.n()), (h87.c) aVar12.e.get(), (aah.h) aVar12.k.get(), (j87.a) aVar12.f311353h.get());
                    case 10:
                        return a10.b.g((u8h.b) cVar13.f311366j, "factory");
                    default:
                        throw new AssertionError(i43);
                }
                return cVar3;
            case 10:
                y77.c cVar15 = (y77.c) this.f308711c;
                u8h.c cVar16 = cVar15.f311366j;
                y77.b bVar13 = (y77.b) this.d;
                y77.c cVar17 = bVar13.f311360c;
                int i59 = this.f308710b;
                if (i59 == 0) {
                    return a10.b.f((u8h.b) cVar16, "factory");
                }
                if (i59 != 1) {
                    if (i59 == 2) {
                        return a10.b.g((u8h.b) cVar16, "factory");
                    }
                    throw new AssertionError(i59);
                }
                n87.t tVar2 = new n87.t(new n87.b(), new n87.v(cVar17.f311362b.C(), ((mkh.s) cVar17.k).b()), (q1) bVar13.e.get());
                GlobalMarketsCollectionScreenContract$InputData globalMarketsCollectionScreenContract$InputData = bVar13.f311359b;
                yhl.e eVar5 = (yhl.e) cVar17.d.E.get();
                vc.s.j(eVar5);
                zjh.c cVarA = cVar17.e.a();
                e9h.d dVarD = cVar17.f311362b.D();
                mk0.a aVarA4 = cVar17.f.a();
                vc.s.j(aVarA4);
                om4.d0 d0Var = new om4.d0(aVarA4);
                gte.a aVarB4 = cVar17.f311364g.b();
                vc.s.j(aVarB4);
                ou5.b bVar14 = new ou5.b(eVar5, cVarA, dVarD, d0Var, aVarB4);
                s4i.i iVar4 = new s4i.i(new qpk.b(), 1);
                qrk.d dVarB = ((prk.a) cVar15.o).b();
                vc.s.j(dVarB);
                return new n87.q(tVar2, globalMarketsCollectionScreenContract$InputData, bVar14, iVar4, dVarB, (aah.h) bVar13.d.get());
            case 11:
                return a();
            case 12:
                return b();
            case 13:
                return c();
            case 14:
                int i66 = this.f308710b;
                if (i66 == 0) {
                    return new z9j.e((cli.n) ((y9j.b) this.d).f311863a.get(), ((s41.a) ((y9j.a) this.f308711c).e).d());
                }
                if (i66 == 1) {
                    return new z9j.f();
                }
                throw new AssertionError(i66);
            case 15:
                return d();
            case 16:
                return e();
            case 17:
                return f();
            case 18:
                return g();
            case 19:
                int i74 = this.f308710b;
                if (i74 != 0) {
                    if (i74 == 1) {
                        return new xd3.e();
                    }
                    throw new AssertionError(i74);
                }
                jki.p pVar = (jki.p) ((yc3.f) this.d).f312481a.get();
                bd3.a aVarA5 = ((yc3.a) this.f308711c).f312437c.a();
                vc.s.j(aVarA5);
                return new xd3.d(pVar, aVarA5);
            case 20:
                return h();
            case 21:
                return i();
            case 22:
                return j();
            case 23:
                return k();
            case 24:
                return l();
            case 25:
                return m();
            case 26:
                return n();
            case 27:
                return o();
            case 28:
                return p();
            default:
                yo5.t tVar3 = (yo5.t) this.d;
                yo5.w wVar = (yo5.w) this.f308711c;
                int i92 = this.f308710b;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new AssertionError(i92);
                    }
                    t70.g gVarO7 = wVar.i.o();
                    vc.s.j(gVarO7);
                    return new sq5.t(gVarO7);
                }
                sq5.g gVar8 = (sq5.g) tVar3.f315582b.get();
                CryptoAddressHostingPickerContract$InputData cryptoAddressHostingPickerContract$InputData = tVar3.f315581a;
                sd5.c cVarA2 = wVar.f315594j.a();
                vc.s.j(cVarA2);
                return new sq5.q(gVar8, cryptoAddressHostingPickerContract$InputData, cVarA2);
        }
    }
}
