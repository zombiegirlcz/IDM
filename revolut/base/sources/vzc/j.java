package vzc;

import android.app.Activity;
import android.content.Context;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResultRegistry;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.backend_flow.ui.BackendFlowContract$Configuration;
import com.revolut.feature.defi.trade.impl.ui.asset_picker.DeFiAssetPickerContract$InputData;
import com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$InputData;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.RentAndBillsFlowContract$InputData;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.unlink_payment.RentAndBillsUnlinkPaymentsStatusDialogFactory;
import com.revolut.feature.trading.managed_portfolios.impl.ui.compare.ManagedPortfoliosCompareController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsControllerContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.ManagedPortfolioDetailsAllocationContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.info.ManagedPortfolioDetailsAboutInfoExtensionContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.investments.ManagedPortfolioDetailsInvestmentsExtensionContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealScreenContract$InputData;
import com.revolut.feature.trading.transfer.investments.api.navigation.TransferOutFeatureConfig;
import com.revolut.feature_exchange.impl.network.service.FxService;
import com.revolut.feature_exchange.impl.ui.order_details.screen.OrderDetailsActivity;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.asset_details.CommodityAssetDetailsScreen;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.asset_details.CommodityAssetDetailsScreenContract$InputData;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.CommodityPositionDetailsController;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.CommodityPositionDetailsControllerContract$InputData;
import cu8.r0;
import d6j.n0;
import dmc.p;
import dmc.r;
import fmc.c0;
import g6j.v;
import i6f.q0;
import j6f.q;
import j6f.t;
import java.util.Collection;
import jlc.w;
import jlc.x;
import jlc.y;
import jlc.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import lp.l9;
import pgb.a0;
import pgb.b0;
import qc0.i1;
import qgk.k3;
import qoc.d0;
import qw7.u;
import rp0.g1;
import rp0.x0;
import t6f.o;
import us6.w3;
import vc.s;
import vdl.i0;
import whc.e0;
import yc0.f0;
import z0h.q1;
import zc0.y2;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f293502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f293503c;
    public final Object d;

    public /* synthetic */ j(Object obj2, Object obj3, int i, int i2) {
        this.f293501a = i2;
        this.f293502b = obj2;
        this.d = obj3;
        this.f293503c = i;
    }

    private final Object a() {
        w5f.m mVar = (w5f.m) this.f293502b;
        w5f.f fVar = (w5f.f) this.d;
        int i = this.f293503c;
        switch (i) {
            case 0:
                z extensions = (z) fVar.f295160x.get();
                Intrinsics.checkNotNullParameter(extensions, "extensions");
                return extensions.f175710a;
            case 1:
                t1j.b factory = mVar.f295190b.i();
                y delegates = fVar.f295138a;
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(delegates, "delegates");
                Intrinsics.checkNotNullParameter(delegates, "delegates");
                f88.f fVar2 = new f88.f((c0) factory.f267380b);
                return new z(new upc.c(fVar2, delegates), fVar2);
            case 2:
                ViewController view = fVar.f295140b;
                q6f.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                return (ManagedPortfolioDetailsController) view;
            case 3:
                return kii.e.j((u8h.b) mVar.f295191c, "factory");
            case 4:
                return new g7f.b(fVar.f295142c, (o6f.b) fVar.B.get());
            case 5:
                return new o6f.m(fVar.d, mVar.d(), (x5f.k) mVar.v.get(), mVar.f.a());
            case 6:
                return new t6f.f(fVar.e, (t6f.g) fVar.D.get());
            case 7:
                qmc.b bVarF = mVar.f295190b.f();
                emc.e eVarC = mVar.d.c();
                t1j.b bVarA = mVar.a();
                ManagedPortfolioDetailsAboutInfoExtensionContract$InputData managedPortfolioDetailsAboutInfoExtensionContract$InputData = fVar.f;
                gte.a aVarB = mVar.f295189a.b();
                s.j(aVarB);
                return new o(bVarF, eVarC, bVarA, managedPortfolioDetailsAboutInfoExtensionContract$InputData, aVarB);
            case 8:
                return new r6f.c(fVar.f295145g, (r6f.d) fVar.F.get());
            case 9:
                return new r6f.l(mVar.f295190b.f(), mVar.d.c(), fVar.f295146h);
            case 10:
                return new v6f.c((v6f.d) fVar.H.get(), fVar.f295148j);
            case 11:
                qmc.d dVarG = mVar.f295190b.g();
                qmc.h hVarA = mVar.f.a();
                tul.b bVarN = mVar.k.n();
                i0 i0VarD = mVar.f295195l.d();
                s.j(i0VarD);
                ou5.b bVar = new ou5.b(dVarG, hVarA, bVarN, i0VarD, new ael.z());
                ManagedPortfolioDetailsInvestmentsExtensionContract$InputData managedPortfolioDetailsInvestmentsExtensionContract$InputData = fVar.i;
                gte.a aVarB2 = mVar.f295189a.b();
                s.j(aVarB2);
                return new v6f.l(bVar, managedPortfolioDetailsInvestmentsExtensionContract$InputData, aVarB2);
            case 12:
                return new j6f.m(fVar.k, (j6f.b) fVar.J.get());
            case 13:
                return new t(mVar.c(), mVar.b(), new h7f.f(), fVar.f295150l, (d1h.e) fVar.A.get());
            case 14:
                return new g7f.b(fVar.f295151m, (g7f.h) fVar.L.get());
            case 15:
                return new g7f.h((x5f.k) mVar.v.get(), fVar.f295152n);
            case 16:
                return new b7f.b(fVar.o, fVar.f295154p, (b7f.h) fVar.N.get());
            case 17:
                return new b7f.h(mVar.d.c(), fVar.f295154p);
            case 18:
                e7f.h view2 = fVar.f295155q;
                e7f.k model = (e7f.k) fVar.P.get();
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                return new e7f.d(view2, model, "ManagedPortfolioPerformanceSummaryExtensionContract");
            case 19:
                qmc.h hVarA2 = mVar.f.a();
                qmc.d dVarG2 = mVar.f295190b.g();
                i0 i0VarD2 = mVar.f295195l.d();
                s.j(i0VarD2);
                return new e7f.k(hVarA2, dVarG2, i0VarD2, new ael.z(), mVar.k.f(), fVar.f295156r);
            case 20:
                i7f.a model2 = (i7f.a) fVar.S.get();
                i7f.e view3 = fVar.f295157s;
                Intrinsics.checkNotNullParameter(model2, "model");
                Intrinsics.checkNotNullParameter(view3, "view");
                return new e7f.d(view3, model2, "ManagedPortfolioDetailsTransactionsExtensionContract");
            case 21:
                qmc.h hVarA3 = mVar.f.a();
                h1h.b bVar2 = (h1h.b) fVar.R.get();
                ybl.k kVarD = mVar.k.f150256a.d();
                s.j(kVarD);
                return new i7f.g(hVarA3, bVar2, new bbh.c(kVarD), fVar.f295152n);
            case 22:
                hbh.j jVarA = mVar.f295197n.a();
                s.j(jVarA);
                return hy1.g.l(jVarA);
            case 23:
                return new a7f.b((a7f.k) fVar.W.get(), fVar.f295158t);
            case 24:
                qmc.h hVarA4 = mVar.f.a();
                ManagedPortfolioDetailsControllerContract$InputData managedPortfolioDetailsControllerContract$InputData = fVar.f295152n;
                tpc.i iVar = (tpc.i) fVar.U.get();
                r rVar = mVar.f295190b;
                xvh.c cVarA = ((a6d.e) rVar.f116032j).a();
                s.j(cVarA);
                return new a7f.k(hVarA4, managedPortfolioDetailsControllerContract$InputData, iVar, new rul.e(cVarA, rVar.f116029c.a()), (x) fVar.V.get());
            case 25:
                p factory2 = (p) mVar.f295190b.z.get();
                s.j(factory2);
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return factory2.a();
            case 26:
                p factory3 = (p) mVar.f295190b.z.get();
                s.j(factory3);
                Intrinsics.checkNotNullParameter(factory3, "factory");
                n4f.a aVar = factory3.f116019a.f116033l;
                m4f.b wealthAddMoneyCommandProvider = new m4f.b();
                Intrinsics.checkNotNullParameter(wealthAddMoneyCommandProvider, "wealthAddMoneyCommandProvider");
                return new tpc.h(wealthAddMoneyCommandProvider);
            case 27:
                hbh.j jVarA2 = mVar.f295197n.a();
                s.j(jVarA2);
                return hy1.g.k(jVarA2, fVar.u, (h1h.b) fVar.R.get());
            case 28:
                f1h.c cVarA2 = mVar.o.a();
                s.j(cVarA2);
                return fp8.c.s(cVarA2, (f1h.f) fVar.Z.get(), (f1h.b) fVar.f295139a0.get());
            case 29:
                f1h.c cVarA3 = mVar.o.a();
                s.j(cVarA3);
                return fp8.c.t(cVarA3);
            case 30:
                x parcelHandler = (x) fVar.V.get();
                Intrinsics.checkNotNullParameter(parcelHandler, "parcelHandler");
                s.k(parcelHandler);
                return parcelHandler;
            case 31:
                z extensions2 = (z) fVar.f295160x.get();
                Intrinsics.checkNotNullParameter(extensions2, "extensions");
                return extensions2.f175711b;
            case 32:
                mkd.g view4 = fVar.v;
                rkd.m factory4 = mVar.f295198p.a();
                s.j(factory4);
                q6f.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(view4, "view");
                Intrinsics.checkNotNullParameter(factory4, "factory");
                return factory4.a(view4);
            case 33:
                t6f.g gVar = (t6f.g) fVar.D.get();
                r6f.d dVar = (r6f.d) fVar.F.get();
                v6f.d dVar2 = (v6f.d) fVar.H.get();
                o6f.b bVar3 = (o6f.b) fVar.B.get();
                j6f.b bVar4 = (j6f.b) fVar.J.get();
                g7f.h hVar = (g7f.h) fVar.L.get();
                b7f.h hVar2 = (b7f.h) fVar.N.get();
                e7f.k kVar = (e7f.k) fVar.P.get();
                i7f.a aVar2 = (i7f.a) fVar.S.get();
                a7f.k kVar2 = (a7f.k) fVar.W.get();
                mkd.d dVar3 = (mkd.d) fVar.f295144e0.get();
                d1h.e eVar = (d1h.e) fVar.A.get();
                ManagedPortfolioDetailsControllerContract$InputData managedPortfolioDetailsControllerContract$InputData2 = fVar.f295152n;
                dmc.c cVar = mVar.f;
                dmc.a aVar3 = mVar.d;
                qmc.h hVarA5 = cVar.a();
                nmc.d dVarD = aVar3.d();
                emc.e eVarC2 = aVar3.c();
                r rVar2 = mVar.f295190b;
                qmc.d dVarG3 = rVar2.g();
                qmc.b bVarF2 = rVar2.f();
                gte.a aVarB3 = mVar.f295189a.b();
                s.j(aVarB3);
                i0 i0VarD3 = mVar.f295195l.d();
                s.j(i0VarD3);
                x5f.e eVar2 = new x5f.e(hVarA5, dVarD, eVarC2, dVarG3, bVarF2, aVarB3, i0VarD3, new ael.z());
                x5f.k kVar3 = (x5f.k) mVar.v.get();
                x5f.c cVarB = mVar.b();
                h7f.f fVar3 = new h7f.f();
                qmc.h hVarA6 = mVar.f.a();
                zjh.f fVarA = aVar3.a();
                emc.e eVarC3 = aVar3.c();
                cli.n nVar = (cli.n) fVar.f0.get();
                r6f.j jVar = new r6f.j();
                cli.n nVar2 = (cli.n) fVar.g0.get();
                cli.n nVar3 = (cli.n) fVar.f295147h0.get();
                cli.n nVar4 = (cli.n) fVar.j0.get();
                g7f.g gVar2 = new g7f.g();
                b7f.g gVar3 = new b7f.g((f01.a) fVar.l0.get());
                ufl.b bVar5 = new ufl.b(new tfl.a());
                w5f.m mVar2 = fVar.f295159w;
                e7f.i iVar2 = new e7f.i(new kpj.f(mVar2.k.H()), bVar5);
                i7f.f fVar4 = new i7f.f();
                a7f.h hVar3 = new a7f.h((w) fVar.m0.get(), new upc.d());
                d1h.h hVar4 = (d1h.h) fVar.i0.get();
                h7f.d dVar4 = new h7f.d();
                boc.b bVar6 = new boc.b();
                gte.a aVarB4 = mVar2.f295189a.b();
                s.j(aVarB4);
                return new com.revolut.feature.trading.managed_portfolios.impl.ui.details.c(gVar, dVar, dVar2, bVar3, bVar4, hVar, hVar2, kVar, aVar2, kVar2, dVar3, eVar, managedPortfolioDetailsControllerContract$InputData2, eVar2, kVar3, cVarB, fVar3, hVarA6, fVarA, eVarC3, new q0(nVar, jVar, nVar2, nVar3, nVar4, gVar2, gVar3, iVar2, fVar4, hVar3, hVar4, dVar4, bVar6, aVarB4));
            case 34:
                ManagedPortfolioDetailsAboutInfoExtensionContract$InputData managedPortfolioDetailsAboutInfoExtensionContract$InputData2 = fVar.f;
                gte.a aVarB5 = mVar.f295189a.b();
                s.j(aVarB5);
                return new t6f.m(managedPortfolioDetailsAboutInfoExtensionContract$InputData2, aVarB5);
            case 35:
                z6f.a aVar4 = new z6f.a();
                gte.a aVarB6 = mVar.f295189a.b();
                s.j(aVarB6);
                return new v6f.j(aVar4, aVarB6);
            case 36:
                fVar.getClass();
                return new o6f.k(new r10.w(new c6f.e(), new c6f.c()));
            case 37:
                fVar.getClass();
                k6f.f fVar5 = new k6f.f(new l6f.a(), (d1h.h) fVar.i0.get());
                l6f.a aVar5 = new l6f.a();
                gte.a aVarB7 = fVar.f295159w.f295189a.b();
                s.j(aVarB7);
                return new q(fVar5, new k6f.m(aVar5, aVarB7), new k6f.k(new l6f.a()), new k6f.n(), new j6f.n(fVar.f295150l), new k6f.h(), new k6f.g());
            case 38:
                return kii.e.k((u8h.b) mVar.f295191c);
            case 39:
                return c21.l.B((com.revolut.kompot.navigable.a) fVar.f295149k0.get());
            case 40:
                p factory5 = (p) mVar.f295190b.z.get();
                s.j(factory5);
                Intrinsics.checkNotNullParameter(factory5, "factory");
                return new tpc.d(new tpc.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        w5f.m mVar = (w5f.m) this.f293502b;
        u8h.c cVar = mVar.f295191c;
        w5f.c0 c0Var = (w5f.c0) this.d;
        ManagedPortfolioDetailsAllocationContract$InputData managedPortfolioDetailsAllocationContract$InputData = c0Var.f295124c;
        int i = this.f293503c;
        switch (i) {
            case 0:
                return kii.e.j((u8h.b) cVar, "factory");
            case 1:
                return new j6f.m(c0Var.f295123b, (j6f.b) c0Var.f.get());
            case 2:
                return new t(mVar.c(), mVar.b(), new h7f.f(), managedPortfolioDetailsAllocationContract$InputData, (d1h.e) c0Var.e.get());
            case 3:
                return new r8f.f((j6f.b) c0Var.f.get(), (cli.n) c0Var.f295127j.get());
            case 4:
                return new qee.s((cli.n) c0Var.i.get());
            case 5:
                k6f.f fVar = new k6f.f(new l6f.a(), (d1h.h) c0Var.f295126h.get());
                l6f.a aVar = new l6f.a();
                gte.a aVarB = c0Var.d.f295189a.b();
                s.j(aVarB);
                return new q(fVar, new k6f.m(aVar, aVarB), new k6f.k(new l6f.a()), new k6f.n(), new j6f.n(managedPortfolioDetailsAllocationContract$InputData), new k6f.h(), new k6f.g());
            case 6:
                return kii.e.k((u8h.b) cVar);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        w5j.b bVar = (w5j.b) this.f293502b;
        w5j.c cVar = (w5j.c) this.d;
        int i = this.f293503c;
        switch (i) {
            case 0:
                Object extension = (j60.a) cVar.f295319h.get();
                e6j.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.d dVar = (yji.d) extension;
                s.k(dVar);
                return dVar;
            case 1:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) cVar.f.get();
                rp0.m dialogDisplayer = (rp0.m) cVar.f295318g.get();
                he2.b dialogHostFinder = ehe.n.r();
                e6j.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
                Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
                return new j60.c(controller, dialogDisplayer, dialogHostFinder);
            case 2:
                e6j.e.Companion.getClass();
                return new rp0.m();
            case 3:
                n2d.h hVarB = bVar.f295299j.b();
                s.j(hVarB);
                return ms1.g.h(hVarB, (m1d.b) cVar.f295321j.get(), (m1d.a) cVar.f295322l.get());
            case 4:
                ViewController screen = cVar.f295311a;
                e6j.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(screen, "screen");
                return (CommodityAssetDetailsScreen) screen;
            case 5:
                n2d.h hVarB2 = bVar.f295299j.b();
                s.j(hVarB2);
                return ms1.g.g(hVarB2, (g1) cVar.k.get());
            case 6:
                CommodityAssetDetailsScreen screen2 = (CommodityAssetDetailsScreen) cVar.f295321j.get();
                e6j.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(screen2, "screen");
                return x0.a(g1.Companion, screen2.D2());
            case 7:
                return efk.j.d((dtl.a) cVar.o.get());
            case 8:
                return efk.j.q(bVar.k.a(), cVar.f295313b, (dtl.b) cVar.f295324n.get());
            case 9:
                return efk.j.r(bVar.k.a());
            case 10:
                jpc.e factory = bVar.f295300l.b();
                pcj.f viewDelegate = (pcj.f) cVar.f295328s.get();
                pcj.a controllerModelExtension = (pcj.a) cVar.f295327r.get();
                j60.a bottomExpandableDialogControllerExtension = (j60.a) cVar.u.get();
                qcj.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(viewDelegate, "viewDelegate");
                Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
                Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                Intrinsics.checkNotNullParameter(viewDelegate, "viewDelegate");
                Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
                Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                return new o9h.f(viewDelegate, controllerModelExtension, bottomExpandableDialogControllerExtension, (rdj.a) factory.d);
            case 11:
                jpc.e factory2 = bVar.f295300l.b();
                pcj.e view = (pcj.e) cVar.f295321j.get();
                pcj.a router = (pcj.a) cVar.f295327r.get();
                pcj.d presentationModel = (pcj.d) cVar.f295326q.get();
                qcj.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(router, "router");
                Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
                Intrinsics.checkNotNullParameter(router, "router");
                return new rdj.j(view, presentationModel, router);
            case 12:
                jpc.e factory3 = bVar.f295300l.b();
                pcj.d presentationModel2 = (pcj.d) cVar.f295326q.get();
                qcj.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(presentationModel2, "presentationModel");
                od0.i overrideInitialState = od0.i.f224256b;
                Intrinsics.checkNotNullParameter(overrideInitialState, "overrideInitialState");
                Intrinsics.checkNotNullParameter(presentationModel2, "presentationModel");
                Intrinsics.checkNotNullParameter(overrideInitialState, "overrideInitialState");
                return new tdj.c(presentationModel2, overrideInitialState);
            case 13:
                jpc.e factory4 = bVar.f295300l.b();
                qcj.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory4, "factory");
                return new rdj.h((a61.a) factory4.f177257c, (l80.e) factory4.f177256b);
            case 14:
                return ehe.n.s((com.revolut.kompot.navigable.a) cVar.f.get(), (rp0.m) cVar.f295329t.get());
            case 15:
                return new rp0.m();
            case 16:
                ufm.d factory5 = bVar.f295301m.a();
                qzj.g viewDelegate2 = (qzj.g) cVar.f295332y.get();
                uzj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory5, "factory");
                Intrinsics.checkNotNullParameter(viewDelegate2, "viewDelegate");
                Intrinsics.checkNotNullParameter(viewDelegate2, "viewDelegate");
                return new c84.w(viewDelegate2);
            case 17:
                ufm.d factory6 = bVar.f295301m.a();
                qzj.f view2 = (qzj.f) cVar.f295321j.get();
                qzj.b router2 = (qzj.b) cVar.f295331x.get();
                uzj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory6, "factory");
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(router2, "router");
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(router2, "router");
                return new v0k.h(view2, router2);
            case 18:
                ufm.d factory7 = bVar.f295301m.a();
                qzj.e presentationModel3 = (qzj.e) cVar.f295330w.get();
                uzj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory7, "factory");
                Intrinsics.checkNotNullParameter(presentationModel3, "presentationModel");
                Intrinsics.checkNotNullParameter(presentationModel3, "presentationModel");
                return new x0k.a(presentationModel3, (v0k.b) factory7.f279877c);
            case 19:
                ufm.d factory8 = bVar.f295301m.a();
                uzj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory8, "factory");
                return new v0k.e((m0k.e) factory8.f279875a);
            case 20:
                return a10.b.f((u8h.b) bVar.f295302n, "factory");
            case 21:
                return kxa.j.k((j60.a) cVar.u.get());
            case 22:
                return u.k(((z3h.g) bVar.o).e(), cVar.f295315c, (q2h.b) cVar.C.get());
            case 23:
                return u.l(((z3h.g) bVar.o).e());
            case 24:
                fsl.t tVarA = bVar.f295303p.a();
                s.j(tVarA);
                return fp8.c.p(tVarA, (fsl.o) cVar.f295321j.get(), (fsl.i) cVar.F.get());
            case 25:
                fsl.t tVarA2 = bVar.f295303p.a();
                s.j(tVarA2);
                return fp8.c.q(tVarA2, (fsl.c) cVar.E.get());
            case 26:
                e6j.c.Companion.getClass();
                return new e6j.a();
            case 27:
                return ige.d.m(bVar.f295304q.b(), (htl.g) cVar.f295321j.get(), (htl.d) cVar.H.get());
            case 28:
                return ige.d.n(bVar.f295304q.b());
            case 29:
                hbh.j jVarA = bVar.f295305r.a();
                s.j(jVarA);
                return hy1.g.k(jVarA, (h1h.f) cVar.f295321j.get(), (h1h.b) cVar.J.get());
            case 30:
                hbh.j jVarA2 = bVar.f295305r.a();
                s.j(jVarA2);
                return hy1.g.l(jVarA2);
            case 31:
                f1h.c cVarA = bVar.f295306s.a();
                s.j(cVarA);
                return fp8.c.s(cVarA, (f1h.f) cVar.f295321j.get(), (f1h.b) cVar.L.get());
            case 32:
                f1h.c cVarA2 = bVar.f295306s.a();
                s.j(cVarA2);
                return fp8.c.t(cVarA2);
            case 33:
                jxk.c factory9 = (jxk.c) bVar.f295307t.f130464m.get();
                s.j(factory9);
                jxk.e presenterDelegate = (jxk.e) cVar.P.get();
                wwk.e view3 = (wwk.e) cVar.f295321j.get();
                xwk.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory9, "factory");
                Intrinsics.checkNotNullParameter(presenterDelegate, "presenterDelegate");
                Intrinsics.checkNotNullParameter(view3, "view");
                Intrinsics.checkNotNullParameter(view3, "view");
                Intrinsics.checkNotNullParameter(presenterDelegate, "presenterDelegate");
                return new jxk.a(view3, presenterDelegate);
            case 34:
                jxk.c factory10 = (jxk.c) bVar.f295307t.f130464m.get();
                s.j(factory10);
                f6j.a presentationModel4 = (f6j.a) cVar.N.get();
                wwk.c router3 = (wwk.c) cVar.O.get();
                xwk.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory10, "factory");
                Intrinsics.checkNotNullParameter(presentationModel4, "presentationModel");
                Intrinsics.checkNotNullParameter(router3, "router");
                Intrinsics.checkNotNullParameter(presentationModel4, "presentationModel");
                Intrinsics.checkNotNullParameter(router3, "router");
                return new jxk.e(presentationModel4, router3);
            case 35:
                return new f6j.a((t5j.b) bVar.O.get());
            case 36:
                return new f6j.b((sri.m) bVar.K.get());
            case 37:
                return efk.j.e((dtl.b) cVar.f295324n.get());
            case 38:
                k2d.d dVar2 = bVar.f295299j;
                m2d.a factory11 = new m2d.a();
                e6j.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory11, "factory");
                return m2d.a.a();
            case 39:
                jpc.e factory12 = bVar.u.a();
                j60.a bottomExpandableDialog = (j60.a) cVar.f295319h.get();
                e6j.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory12, "factory");
                Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
                return factory12.c("COMBINED_WATCHLIST_ORDERING_HOME", bottomExpandableDialog);
            case 40:
                w5j.b bVar2 = cVar.e;
                r0 r0VarA = bVar2.v.a();
                z5j.d dVarA = bVar2.f295308w.a();
                he2.b factory13 = new he2.b(r0VarA, dVarA);
                c6j.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory13, "factory");
                return new b6j.b(r0VarA, dVarA);
            case 41:
                jxk.c factory14 = (jxk.c) bVar.f295307t.f130464m.get();
                s.j(factory14);
                jxk.e presenterDelegate2 = (jxk.e) cVar.P.get();
                wwk.c router4 = (wwk.c) cVar.O.get();
                xwk.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory14, "factory");
                Intrinsics.checkNotNullParameter(presenterDelegate2, "presenterDelegate");
                Intrinsics.checkNotNullParameter(router4, "router");
                Intrinsics.checkNotNullParameter(router4, "router");
                Intrinsics.checkNotNullParameter(presenterDelegate2, "presenterDelegate");
                return new jxk.b(router4, presenterDelegate2);
            case 42:
                cli.n nVar = (cli.n) cVar.g0.get();
                CommodityAssetDetailsScreenContract$InputData commodityAssetDetailsScreenContract$InputData = cVar.d;
                x8h.k kVarD = bVar.f295309x.d();
                gte.a aVarB = bVar.f295310y.b();
                s.j(aVarB);
                l1d.a aVar = (l1d.a) cVar.S.get();
                m1d.a aVar2 = (m1d.a) cVar.f295322l.get();
                u1d.a aVar3 = (u1d.a) cVar.T.get();
                fsl.m mVarB = bVar.f295303p.b();
                s.j(mVarB);
                h1h.b bVar3 = (h1h.b) cVar.J.get();
                pcj.a aVar4 = (pcj.a) cVar.f295327r.get();
                qzj.b bVar4 = (qzj.b) cVar.f295331x.get();
                aah.h hVar = (aah.h) cVar.A.get();
                ybl.l lVarF = bVar.f295309x.f();
                ppk.f fVarA = bVar.z.a();
                f61.a aVarB2 = ((n51.a) bVar.A).b();
                y5j.g gVar = (y5j.g) bVar.P.get();
                whf.b bVarA = bVar.B.a();
                s.j(bVarA);
                wsg.n nVarB = bVar.C.b();
                fk3.a aVarA = bVar.D.a();
                s.j(aVarA);
                ou5.b bVarB = bVar.E.b();
                tv5.b bVarC = bVar.F.c();
                s.j(bVarC);
                j60.a aVar5 = (j60.a) cVar.u.get();
                l80.e eVarH = bVar.f295296c.h();
                s.j(eVarH);
                j61.b bVarC2 = bVar.G.c();
                s.j(bVarC2);
                return new n0(nVar, commodityAssetDetailsScreenContract$InputData, kVarD, aVarB, aVar, aVar2, aVar3, mVarB, bVar3, aVar4, bVar4, hVar, lVarF, fVarA, aVarB2, gVar, bVarA, nVarB, aVarA, bVarB, bVarC, aVar5, eVarH, bVarC2, (wwk.b) cVar.V.get(), (b6j.a) cVar.U.get(), ((z3h.g) bVar.o).b(), bVar.f295308w.a());
            case 43:
                g6j.g gVar2 = (g6j.g) cVar.W.get();
                g6j.m mVar = (g6j.m) cVar.X.get();
                l70.e eVar = cVar.e.f295296c;
                l80.e eVarH2 = eVar.h();
                s.j(eVarH2);
                t70.b bVarG = eVar.g();
                s.j(bVarG);
                return new g6j.y(new v(gVar2, mVar, eVarH2, bVarG), (g6j.a) cVar.Y.get(), (g6j.d) cVar.Z.get(), (g6j.q) cVar.f295312a0.get(), (fsl.k) cVar.f295314b0.get(), (pcj.c) cVar.c0.get(), (qzj.d) cVar.f295316d0.get(), new g6j.p(), (q1) cVar.f295317e0.get(), (jxk.f) cVar.f0.get(), ((z3h.g) bVar.o).c(), cVar.d);
            case 44:
                return new g6j.l();
            case 45:
                l80.e eVarH3 = bVar.f295296c.h();
                s.j(eVarH3);
                return new g6j.o(eVarH3);
            case 46:
                g6j.g gVar3 = (g6j.g) cVar.W.get();
                g6j.m mVar2 = (g6j.m) cVar.X.get();
                l80.e eVarH4 = bVar.f295296c.h();
                s.j(eVarH4);
                return new g6j.c(gVar3, mVar2, eVarH4);
            case 47:
                return new g6j.f();
            case 48:
                return new g6j.s(new kpj.f(bVar.f295309x.H()));
            case 49:
                fsl.t tVarA3 = bVar.f295303p.a();
                s.j(tVarA3);
                return fp8.c.r(tVarA3, bVar.f295304q.a());
            case 50:
                jpc.e factory15 = bVar.f295300l.b();
                qcj.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory15, "factory");
                return new rdj.c((l80.e) factory15.f177256b);
            case 51:
                ufm.d factory16 = bVar.f295301m.a();
                uzj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory16, "factory");
                Object obj2 = ((phm.a) factory16.f279876b).get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                qzj.d dVar3 = (qzj.d) obj2;
                s.k(dVar3);
                return dVar3;
            case 52:
                return a10.b.g((u8h.b) bVar.f295302n, "factory");
            case 53:
                jxk.c factory17 = (jxk.c) bVar.f295307t.f130464m.get();
                s.j(factory17);
                vwk.a tradingHoursUiAssetMapper = (vwk.a) bVar.f295307t.f130463l.get();
                s.j(tradingHoursUiAssetMapper);
                xwk.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory17, "factory");
                Intrinsics.checkNotNullParameter(tradingHoursUiAssetMapper, "tradingHoursUiAssetMapper");
                Intrinsics.checkNotNullParameter(tradingHoursUiAssetMapper, "tradingHoursUiAssetMapper");
                return new jxk.f(tradingHoursUiAssetMapper);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        w5j.b bVar = (w5j.b) this.f293502b;
        h9h.a aVar = bVar.f295309x;
        ku5.g gVar = bVar.E;
        w5j.e eVar = (w5j.e) this.d;
        w5j.b bVar2 = eVar.f295336c;
        int i = this.f293503c;
        if (i == 0) {
            s5h.e widget = (s5h.e) eVar.e.get();
            e5h.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(widget, "widget");
            return widget.f260080a;
        }
        if (i == 1) {
            l5h.a aVar2 = bVar.H;
            jla.h hVarA = aVar2.f192261a.a();
            gte.a aVarB = aVar2.f192262b.b();
            s.j(aVarB);
            nd.n factory = new nd.n(aVarB, hVarA);
            d5h.a host = (d5h.a) eVar.d.get();
            e5h.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(host, "host");
            gjh.e eVar2 = new gjh.e(hVarA, aVarB, host);
            return new s5h.e(new s5h.b(host, eVar2), eVar2, new s5h.d((vki.a) eVar2.f144298p));
        }
        if (i == 2) {
            ViewController viewController = eVar.f295334a;
            j6j.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(viewController, "viewController");
            return (CommodityPositionDetailsController) viewController;
        }
        if (i == 3) {
            s5h.e widget2 = (s5h.e) eVar.e.get();
            e5h.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(widget2, "widget");
            return widget2.f260081b;
        }
        if (i == 4) {
            r0 r0VarA = bVar2.v.a();
            z5j.d dVarA = bVar2.f295308w.a();
            he2.b factory2 = new he2.b(r0VarA, dVarA);
            c6j.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(factory2, "factory");
            return new b6j.b(r0VarA, dVarA);
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        CommodityPositionDetailsControllerContract$InputData commodityPositionDetailsControllerContract$InputData = eVar.f295335b;
        ou5.b bVarB = gVar.b();
        ybl.l lVarF = aVar.f();
        x8h.k kVarD = aVar.d();
        wsg.n nVarB = bVar.C.b();
        fk3.a aVarA = bVar.D.a();
        s.j(aVarA);
        lal.a aVarC = gVar.c();
        b6j.a aVar3 = (b6j.a) eVar.f295338h.get();
        kpj.f fVar = new kpj.f(bVar2.f295309x.H());
        s5h.e widget3 = (s5h.e) eVar.e.get();
        e5h.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(widget3, "widget");
        return new com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.a(commodityPositionDetailsControllerContract$InputData, bVarB, lVarF, kVarD, nVarB, aVarA, aVarC, aVar3, new i6j.s(fVar, widget3.f260082c));
    }

    private final Object e() {
        w66.c cVar = (w66.c) this.d;
        w66.e eVar = (w66.e) this.f293502b;
        int i = this.f293503c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            u66.b bVar = (u66.b) eVar.f295400a.f295393j.get();
            s.j(bVar);
            return new a76.e(bVar);
        }
        y66.s sVar = new y66.s(cVar.f295394a);
        DeFiAssetPickerContract$InputData deFiAssetPickerContract$InputData = cVar.f295394a;
        k18.c cVarA = eVar.e.a();
        xv5.c cVarA2 = eVar.f295402c.a();
        s.j(cVarA2);
        return new y66.o(sVar, deFiAssetPickerContract$InputData, cVarA, cVarA2, (a76.b) cVar.f295395b.get());
    }

    private final Object f() {
        w66.d dVar = (w66.d) this.d;
        w66.e eVar = (w66.e) this.f293502b;
        int i = this.f293503c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            u66.b bVar = (u66.b) eVar.f295400a.f295393j.get();
            s.j(bVar);
            return new a76.e(bVar);
        }
        z66.t tVar = new z66.t();
        a76.b bVar2 = (a76.b) dVar.f295398b.get();
        t46.a aVar = (t46.a) eVar.f295401b.i.get();
        s.j(aVar);
        xv5.c cVarA = eVar.f295402c.a();
        s.j(cVarA);
        n16.b bVar3 = eVar.d;
        ang.f fVarE = bVar3.f.e();
        mre.c cVarB = bVar3.f211250g.b();
        s.j(cVarB);
        return new com.revolut.feature.defi.trade.impl.ui.trade.a(tVar, bVar2, aVar, cVarA, new o16.e(fVarE, cVarB), dVar.f295397a);
    }

    private final Object g() {
        w81.c cVar = (w81.c) this.f293502b;
        int i = this.f293503c;
        if (i != 0) {
            if (i == 1) {
                return new a91.i();
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) ((w81.b) this.d).f295568a.get();
        x81.b interactor = cVar.f295570a.a();
        w81.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        s70.a aVarM = cVar.f295571b.m();
        s.j(aVarM);
        return new a91.h(nVar, interactor, aVarM, cVar.f295572c.b());
    }

    private final Object h() {
        waf.d dVar = (waf.d) this.f293502b;
        waf.a aVar = (waf.a) this.d;
        int i = this.f293503c;
        switch (i) {
            case 0:
                ypi.h hVar = aVar.f295873b;
                fsi.g gVar = aVar.f295872a;
                return new ypi.e(hVar, bq.i.b(gVar), bq.i.o(gVar), bq.i.g(gVar));
            case 1:
                return new hqi.f(aVar.f295874c, bq.i.b(aVar.f295872a));
            case 2:
                return kpi.f.a();
            case 3:
                Context contextI = bq.i.i(aVar.f295872a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar.f295872a);
                t70.g gVarO = dVar.f295907b.o();
                s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 4:
                return new tpi.i((rpi.c) aVar.f295877j.get(), gsi.c.a(aVar.f295872a));
            case 5:
                return new rpi.b(bq.i.b(aVar.f295872a));
            case 6:
                return new rpi.h(bq.i.b(aVar.f295872a));
            case 7:
                return new iri.g((iri.j) dVar.f295919n.get(), (iri.m) dVar.f295922p.get(), bq.i.f(aVar.f295872a), bq.i.l(aVar.f295872a));
            case 8:
                return new iri.l((iri.m) dVar.f295922p.get(), bq.i.f(aVar.f295872a), (iri.d) aVar.f295880n.get());
            case 9:
                return new iri.d(bq.i.f(aVar.f295872a));
            case 10:
                return new opi.b(bq.i.f(aVar.f295872a));
            case 11:
                return new qi3.l(bq.i.l(aVar.f295872a), (f9b.f) aVar.f295882q.get(), (qi3.r) dVar.f295906a0.get(), (com.revolut.feature.chooser.c) dVar.f295908b0.get(), aVar.d, (ypi.i) aVar.f.get(), (hqi.l) aVar.f295875g.get(), (opi.d) aVar.f295881p.get(), (tpi.j) aVar.k.get(), bq.i.o(aVar.f295872a));
            case 12:
                return bq.i.t(aVar.f295872a);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        String str;
        waf.d dVar = (waf.d) this.f293502b;
        waf.b bVar = (waf.b) this.d;
        int i = this.f293503c;
        switch (i) {
            case 0:
                bVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) dVar.N.get(), dVar.d());
            case 1:
                um.c cVar = (um.c) dVar.P.get();
                bVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(6);
                waf.d dVar2 = bVar.f295889g;
                hn.h hVar = (hn.h) dVar2.c0.get();
                t70.g gVarO = dVar2.f295907b.o();
                s.j(gVarO);
                builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(dVar2.h());
                builderBuilderWithExpectedSize.add(new xc0.a((qc0.j) dVar2.Z.get(), (qc0.h) dVar2.W.get()));
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(bVar.i)));
                return new in.e(cVar, builderBuilderWithExpectedSize.build(), dVar.d());
            case 2:
                return bq.i.t(bVar.f295884a);
            case 3:
                bVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(bVar.k.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(bVar.f295893m)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) dVar.O.get(), dVar.d());
            case 4:
                return new zm.a();
            case 5:
                return new tpi.i((rpi.c) bVar.f295892l.get(), gsi.c.a(bVar.f295884a));
            case 6:
                return new rpi.b(bq.i.b(bVar.f295884a));
            case 7:
                bVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(bVar.f295889g.h());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) dVar.c0.get(), (npi.f) bVar.o.get());
            case 8:
                Context contextI = bq.i.i(bVar.f295884a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(bVar.f295884a);
                t70.g gVarO2 = dVar.f295907b.o();
                s.j(gVarO2);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO2);
            case 9:
                waf.d dVar3 = bVar.f295889g;
                return new en.c(ImmutableSet.of((ln.d) dVar3.f295914h0.get(), (ln.d) dVar3.f295910d0.get()), bq.i.l(bVar.f295884a));
            case 10:
                return new gn.c((lpi.e) bVar.f295897r.get(), (sm.e) dVar.i0.get(), ImmutableSet.copyOf((Collection) gn.e.a()), dVar.d());
            case 11:
                return new lpi.b(bq.i.i(bVar.f295884a), bq.i.j(bVar.f295884a));
            case 12:
                bVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) dVar.j0.get(), dVar.d());
            case 13:
                bVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize4.addAll((Iterable) g3l.f.a());
                waf.d dVar4 = bVar.f295889g;
                builderBuilderWithExpectedSize4.add(new wc0.a((qc0.k) dVar4.o.get(), ((s41.a) dVar4.i).d(), (ln.a) dVar4.f295910d0.get(), (qc0.j) dVar4.Z.get(), (xl2.f) dVar4.L.get(), dVar4.a()));
                return new g3l.c(builderBuilderWithExpectedSize4.build(), (g3l.g) dVar.f295916k0.get(), (k3l.b) bVar.u.get(), dVar.d());
            case 14:
                return new k3l.d(bq.i.b(bVar.f295884a));
            case 15:
                ypi.h hVar2 = bVar.f295886b;
                xoi.d dVar5 = bVar.f295884a;
                return new ypi.e(hVar2, bq.i.b(dVar5), bq.i.o(dVar5), bq.i.g(dVar5));
            case 16:
                return new hqi.f(bVar.f295888c, bq.i.b(bVar.f295884a));
            case 17:
                return new rpi.h(bq.i.b(bVar.f295884a));
            case 18:
                return new iri.g((iri.j) dVar.f295919n.get(), (iri.m) dVar.o.get(), bq.i.f(bVar.f295884a), bq.i.l(bVar.f295884a));
            case 19:
                return new iri.l((iri.m) dVar.o.get(), bq.i.f(bVar.f295884a), (iri.d) bVar.A.get());
            case 20:
                return new iri.d(bq.i.f(bVar.f295884a));
            case 21:
                return new an.q((cqi.h) bVar.C.get(), (an.a) dVar.l0.get(), ImmutableSet.copyOf((Collection) bn.b.a()), dVar.d());
            case 22:
                return new cqi.j(bq.i.f(bVar.f295884a));
            case 23:
                bVar.getClass();
                return new xpi.c(xpi.f.d, bq.i.b(bVar.f295884a));
            case 24:
                return new com.revolut.retail.toast.mediator.a((d4l.a) dVar.m0.get(), (c4l.b) bVar.F.get());
            case 25:
                return new c4l.e(bq.i.i(bVar.f295884a), bq.i.g(bVar.f295884a));
            case 26:
                return new f5l.c((f5l.a) dVar.f295920n0.get(), bq.i.b(bVar.f295884a));
            case 27:
                return new opi.b(bq.i.f(bVar.f295884a));
            case 28:
                return new iqi.b(bVar.d, bq.i.b(bVar.f295884a));
            case 29:
                Activity activityB = bq.i.b(bVar.f295884a);
                y80.b bVar2 = new y80.b();
                g60.a aVar = (g60.a) bVar.K.get();
                xoi.d dVar6 = bVar.f295884a;
                Activity activityB2 = bq.i.b(dVar6);
                t80.g gVar = (t80.g) bVar.L.get();
                BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(dVar6);
                d4m.a aVarA = e4m.b.a(bVar.M);
                nli.a aVarG = bVar.g();
                t80.g gVar2 = (t80.g) bVar.L.get();
                l70.e eVar = bVar.f295889g.f295907b;
                zk0.b bVarL = eVar.l();
                s.j(bVarL);
                oli.c cVar2 = new oli.c(gVar2, bVarL, bVar.g(), (g60.a) bVar.K.get(), bVar.h());
                ComponentActivity componentActivityA = gmf.b.a(dVar6);
                ActivityResultRegistry activityResultRegistryA = pli.b.a(gmf.b.a(dVar6));
                ami.n nVar = new ami.n(e4m.b.a(bVar.N), 1);
                d4m.a aVarA2 = e4m.b.a(bVar.M);
                t80.g gVar3 = (t80.g) bVar.L.get();
                nli.a aVarG2 = bVar.g();
                i90.b bVar3 = new i90.b();
                z70.a aVarF = eVar.f();
                s.j(aVarF);
                c70.b bVar4 = new c70.b(aVarF, 2);
                z70.a aVarF2 = eVar.f();
                s.j(aVarF2);
                return new upi.b(activityB, bVar2, new t80.v(aVar, activityB2, gVar, baseDelegatesActivityF2, aVarA, aVarG, cVar2, new oli.g(componentActivityA, activityResultRegistryA, nVar, aVarA2, gVar3, aVarG2, bVar3, new u96.b(bVar4, new smd.s(aVarF2)), bVar.h()), bVar.h()));
            case 30:
                return new g60.a(bq.i.b(bVar.f295884a));
            case 31:
                l70.e eVar2 = dVar.f295907b;
                l70.e eVar3 = dVar.f295907b;
                f80.a aVarX = eVar2.x();
                s.j(aVarX);
                l80.e eVarH = eVar3.h();
                s.j(eVarH);
                zk0.b bVarL2 = eVar3.l();
                s.j(bVarL2);
                return new t80.b(aVarX, eVarH, bVarL2);
            case 32:
                return pli.c.a(new ks0.n(bq.i.f(bVar.f295884a)));
            case 33:
                return t96.a.a();
            case 34:
                return new aqi.d(bq.i.b(bVar.f295884a), new y80.b());
            case 35:
                qc0.j router = (qc0.j) dVar.Z.get();
                qc0.k state = (qc0.k) dVar.o.get();
                qc0.h presentationModel = (qc0.h) dVar.W.get();
                ypi.i nextButtonView = (ypi.i) bVar.f295900w.get();
                f9b.f errorView = (f9b.f) bVar.i.get();
                tpi.j progressView = (tpi.j) bVar.f295893m.get();
                hqi.l toolbarView = (hqi.l) bVar.f295901x.get();
                npi.a dialogView = (npi.a) bVar.o.get();
                BackendFlowContract$Configuration configuration = (BackendFlowContract$Configuration) bVar.Q.get();
                k3l.b statusViewModel = (k3l.b) bVar.u.get();
                xpi.g navBarWithToolbarView = (xpi.g) bVar.E.get();
                rpi.c keyboardView = (rpi.c) bVar.f295892l.get();
                qc0.h hVar3 = (qc0.h) bVar.f295889g.W.get();
                wpg.v.b(hVar3);
                ImmutableSet initSet = ImmutableSet.of(hVar3);
                mm.d actionsDispatcher = (mm.d) dVar.X.get();
                n9f.a transferTypeProvider = bVar.f;
                TransferOutFeatureConfig.TransferOut config = bVar.e;
                opi.d expandableDialogView = (opi.d) bVar.I.get();
                qd0.b languageProvider = dVar.f295907b.n();
                s.j(languageProvider);
                Intrinsics.checkNotNullParameter(router, "router");
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
                Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
                Intrinsics.checkNotNullParameter(errorView, "errorView");
                Intrinsics.checkNotNullParameter(progressView, "progressView");
                Intrinsics.checkNotNullParameter(toolbarView, "toolbarView");
                Intrinsics.checkNotNullParameter(dialogView, "dialogView");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Intrinsics.checkNotNullParameter(statusViewModel, "statusViewModel");
                Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
                Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
                Intrinsics.checkNotNullParameter(initSet, "initSet");
                Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
                Intrinsics.checkNotNullParameter(transferTypeProvider, "transferTypeProvider");
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                xaf.b bVar5 = new xaf.b(router, state, presentationModel, nextButtonView, errorView, progressView, toolbarView, configuration, keyboardView, dialogView, new xaf.a(), statusViewModel, navBarWithToolbarView, initSet, actionsDispatcher, expandableDialogView, languageProvider);
                wp0.b fn7 = new wp0.b(config, 22);
                Intrinsics.checkNotNullParameter(fn7, "fn");
                transferTypeProvider.f213644a = fn7;
                return bVar5;
            case 36:
                TransferOutFeatureConfig.TransferOut config2 = bVar.e;
                yaf.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(config2, "config");
                switch (yaf.a.f312011a[config2.f91540a.ordinal()]) {
                    case 1:
                        str = "FLOW_ACAT_FULL";
                        break;
                    case 2:
                        str = "FLOW_ACAT_PARTIAL";
                        break;
                    case 3:
                        str = "FLOW_DRS";
                        break;
                    case 4:
                        str = "FLOW_DTC";
                        break;
                    case 5:
                        str = "FLOW_FOP";
                        break;
                    case 6:
                        throw new IllegalStateException("ISA transfer out is not supported");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return new BackendFlowContract$Configuration(30, null, str);
            case 37:
                zc0.g gVar4 = (zc0.g) bVar.S.get();
                e4m.e eVar4 = dVar.Z;
                y90.e eVar5 = dVar.k;
                qc0.j jVar = (qc0.j) eVar4.get();
                ypi.i iVar = (ypi.i) bVar.f295900w.get();
                waf.d dVar7 = bVar.f295889g;
                l70.e eVar6 = dVar7.f295907b;
                w80.b bVarJ = eVar6.j();
                s.j(bVarJ);
                t70.g gVarO3 = eVar6.o();
                s.j(gVarO3);
                zc0.c cVar3 = new zc0.c(bVarJ, gVarO3, (p80.a) bVar.T.get(), (aa0.y) dVar7.f295931y.get(), bVar.f(), new yc0.j(new yc0.q(bVar.e()), bVar.e(), (yc0.g) dVar7.p0.get(), (ad0.a) dVar7.M.get(), (ad0.p) bVar.Y.get(), new yc0.p()), new yc0.o((yc0.g) dVar7.p0.get()), (ad0.p) bVar.Y.get(), (ad0.c) bVar.V.get(), new ad0.t(bVar.e(), new yc0.p()), new ad0.s(bVar.e(), new yc0.p()), new ad0.g(bVar.e()), new ad0.v(new yc0.q(bVar.e())), new ad0.o(), new yc0.q(bVar.e()), new yc0.p(), (yc0.y) dVar7.q0.get(), (bd0.a) dVar7.f295925r0.get(), (yc0.v) dVar7.f295927s0.get(), (yc0.c0) bVar.Z.get());
                npi.a aVar2 = (npi.a) bVar.o.get();
                xpi.g gVar5 = (xpi.g) bVar.E.get();
                k3l.b bVar6 = (k3l.b) bVar.u.get();
                rpi.c cVar4 = (rpi.c) bVar.f295892l.get();
                zd7.b bVar7 = (zd7.b) bVar.f295887b0.get();
                tpi.j jVar2 = (tpi.j) bVar.f295893m.get();
                opi.d dVar8 = (opi.d) bVar.I.get();
                cqi.h hVar4 = (cqi.h) bVar.C.get();
                i1 i1VarB = eVar5.b();
                s.j(i1VarB);
                oc0.f fVarC = eVar5.c();
                s.j(fVarC);
                fc0.f fVarD = eVar5.d();
                s.j(fVarD);
                oc0.m mVarE = eVar5.e();
                s.j(mVarE);
                t9l.g gVarA = dVar.f295915j.a();
                s.j(gVarA);
                oc0.k kVarA = eVar5.a();
                s.j(kVarA);
                return new y2(hVar4, eVar5.f(), fVarD, bVar6, aVar2, fVarC, kVarA, mVarE, dVar8, jVar, i1VarB, cVar4, gVarA, jVar2, gVar5, iVar, cVar3, gVar4, bVar7);
            case 38:
                Context context = bq.i.i(bVar.f295884a);
                yaf.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return new p80.a(context);
            case 39:
                x90.c cVar5 = dVar.f295909c;
                yc0.q qVar = new yc0.q(bVar.e());
                yc0.r rVar = (yc0.r) bVar.U.get();
                ad0.c cVar6 = (ad0.c) bVar.V.get();
                ad0.w wVarG = dVar.k.g();
                s.j(wVarG);
                f0 f0Var = (f0) bVar.W.get();
                ad0.h hVar5 = (ad0.h) bVar.X.get();
                ad0.n nVarF = bVar.f();
                u9l.a aVarB = dVar.f295915j.b();
                s.j(aVarB);
                return wpg.v.o(cVar5, qVar, rVar, cVar6, wVarG, f0Var, hVar5, nVarF, aVarB);
            case 40:
                return wpg.v.n(dVar.f295909c, bVar.e(), new yc0.p());
            case 41:
                x90.c cVar7 = dVar.f295909c;
                return new ad0.d();
            case 42:
                x90.c cVar8 = dVar.f295909c;
                hbl.d dVarC = dVar.f295915j.c();
                s.j(dVarC);
                return wpg.v.y(cVar8, dVarC);
            case 43:
                return wpg.v.a(dVar.f295909c, bVar.f());
            case 44:
                return wpg.v.w(dVar.f295909c, (yc0.r) bVar.U.get(), new yc0.p());
            case 45:
                return new ae7.i((upi.f) bVar.O.get(), (t80.c) dVar.f295921o0.get(), (d4l.a) dVar.m0.get(), (aqi.a) bVar.f295885a0.get(), new ae7.j(), bq.i.l(bVar.f295884a));
            case 46:
                return aqi.f.a(bVar.f295884a, (aqi.d) bVar.P.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        wcb.a aVar = (wcb.a) this.d;
        wcb.c cVar = (wcb.c) this.f293502b;
        int i = this.f293503c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            ii5.a cryptoPermissionExtensionFactory = cVar.f296389c.d();
            s.j(cryptoPermissionExtensionFactory);
            zcb.a.Companion.getClass();
            Intrinsics.checkNotNullParameter(cryptoPermissionExtensionFactory, "cryptoPermissionExtensionFactory");
            return cryptoPermissionExtensionFactory.a();
        }
        ycb.c cVar2 = aVar.f296381a;
        xoj.a featuresInteractor = cVar.f296387a.a();
        s.j(featuresInteractor);
        l9f.k kVar = cVar.f296388b;
        ybl.k kVarD = kVar.f193182a.d();
        s.j(kVarD);
        gte.a aVarB = kVar.f193183b.b();
        s.j(aVarB);
        o9f.f transferInvestmentsAvailabilityInteractor = new o9f.f(kVarD, aVarB);
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(transferInvestmentsAvailabilityInteractor, "transferInvestmentsAvailabilityInteractor");
        smd.s sVar = new smd.s();
        sVar.f264432a = featuresInteractor;
        sVar.f264433b = transferInvestmentsAvailabilityInteractor;
        return new com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.flow.b(cVar2, sVar, (vh5.a) aVar.d.get());
    }

    private final Object k() {
        wfb.l lVar = (wfb.l) this.d;
        wfb.i iVar = lVar.f297061b;
        wfb.i iVar2 = (wfb.i) this.f293502b;
        int i = this.f293503c;
        if (i == 0) {
            mkd.g view = lVar.f297060a;
            rkd.m factory = iVar2.f297046m.a();
            s.j(factory);
            sgb.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(factory, "factory");
            return factory.a(view);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        l80.e eVarH = iVar.f297041c.h();
        s.j(eVarH);
        a0 a0Var = new a0(new pgb.y(eVarH));
        xfb.s sVar = (xfb.s) iVar2.G.get();
        yik.h hVarB = ((k3) iVar.f297047n).b();
        f90.b bVarT = iVar.f297041c.t();
        s.j(bVarT);
        ngb.f fVar = new ngb.f(hVarB, bVarT);
        b0 b0Var = new b0();
        mkd.d dVar = (mkd.d) lVar.f297062c.get();
        wzi.a aVarA = ((ctj.b) iVar2.f297044j).a();
        s.j(aVarA);
        q06.d dVarA = iVar2.k.a();
        s.j(dVarA);
        q06.l lVarA = iVar2.f297045l.a();
        s.j(lVarA);
        return new com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a(a0Var, sVar, fVar, b0Var, dVar, aVarA, dVarA, lVarA);
    }

    private final Object l() {
        wfb.n nVar = (wfb.n) this.d;
        wfb.i iVar = (wfb.i) this.f293502b;
        int i = this.f293503c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            ViewController controller = nVar.f297065b;
            ygb.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(controller, "controller");
            return new c90.c(controller.m2());
        }
        wfb.i iVar2 = nVar.f297066c;
        ahb.b bVar = new ahb.b(iVar2.f297049q.g());
        g80.c cVarY = iVar2.f297041c.y();
        s.j(cVarY);
        wgb.x xVar = new wgb.x(bVar, cVarY, new wgb.a());
        zgb.a aVar = (zgb.a) iVar.O.get();
        df7.d dVar = (df7.d) ((cf7.b) iVar.f297050r).A.get();
        s.j(dVar);
        pre.c cVarA = iVar.f297051s.a();
        s.j(cVarA);
        q06.d dVarA = iVar.k.a();
        s.j(dVarA);
        q06.l lVarA = iVar.f297045l.a();
        s.j(lVarA);
        return new com.revolut.feature.retail.salary_account.impl.salary_promotion.b(xVar, aVar, dVar, cVarA, dVarA, lVarA, nVar.f297064a);
    }

    private final Object m() {
        whc.f fVar = (whc.f) this.d;
        int i = this.f293503c;
        if (i == 0) {
            return new cic.d(((s41.a) ((whc.s) this.f293502b).o).d(), new cic.f(new bic.f((f01.a) fVar.f297517c.get()), fVar.f297515a));
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) fVar.f297516b.get();
        dic.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new f01.c(controller.m2());
    }

    private final Object n() {
        whc.s sVar = (whc.s) this.f293502b;
        whc.i iVar = (whc.i) this.d;
        int i = this.f293503c;
        if (i == 0) {
            mhc.b bVarA = sVar.f297568b.a();
            s.j(bVarA);
            return new eic.t(new ugc.a(bVarA), ((s41.a) sVar.o).d(), new bof.r(new bic.h(), new bic.b((f01.a) iVar.f297536b.get()), new bic.g(), new bic.j(new bic.f((f01.a) iVar.f297536b.get())), new a26.p((f01.a) iVar.f297536b.get())));
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) iVar.f297535a.get();
        fic.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new f01.c(controller.m2());
    }

    private final Object o() {
        whc.s sVar = (whc.s) this.f293502b;
        whc.n nVar = (whc.n) this.d;
        int i = this.f293503c;
        switch (i) {
            case 0:
                Object handler = (kic.b) nVar.f297550h.get();
                whc.c0.Companion.getClass();
                Intrinsics.checkNotNullParameter(handler, "handler");
                yji.n nVar2 = (yji.n) handler;
                s.k(nVar2);
                return nVar2;
            case 1:
                PerkDetailsFlowContract$InputData perkDetailsFlowContract$InputData = nVar.f297546a;
                whc.s sVar2 = nVar.f297548c;
                return new lic.o(perkDetailsFlowContract$InputData, (bgc.e) sVar.u.get(), new twg.c(nVar.f297546a, (bgc.e) sVar2.u.get(), new gic.a(new hic.a()), sVar2.f.e()), (gic.h) nVar.f297549g.get(), new oic.i(new hic.b(), sVar2.f297571h.g()));
            case 2:
                bgc.e eVar = (bgc.e) sVar.u.get();
                aii.o oVar = (aii.o) nVar.e.get();
                c70.a aVarZ = sVar.f297572j.z();
                s.j(aVarZ);
                return new gic.h(eVar, oVar, aVarZ, new ajk.b(sVar.f297577q.f245945a.e()), (lic.g) nVar.f.get());
            case 3:
                ViewController viewController = nVar.f297547b;
                e0.Companion.getClass();
                Intrinsics.checkNotNullParameter(viewController, "viewController");
                return viewController;
            case 4:
                PerkDetailsFlowContract$InputData perkDetailsFlowContract$InputData2 = nVar.f297546a;
                bgc.e eVar2 = (bgc.e) sVar.u.get();
                aii.o oVar2 = (aii.o) nVar.e.get();
                sf0.h hVarB = sVar.f297574m.b();
                s.j(hVarB);
                return new lic.g(perkDetailsFlowContract$InputData2, eVar2, oVar2, hVarB, new jx0.a(nVar.f297546a, (bgc.e) nVar.f297548c.u.get()));
            case 5:
                lic.g handler2 = (lic.g) nVar.f.get();
                whc.c0.Companion.getClass();
                Intrinsics.checkNotNullParameter(handler2, "handler");
                lic.g gVar = handler2;
                s.k(gVar);
                return gVar;
            case 6:
                gic.h navigator = (gic.h) nVar.f297549g.get();
                whc.c0.Companion.getClass();
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                s.k(navigator);
                return navigator;
            case 7:
                lic.s handler3 = (lic.s) nVar.f297552l.get();
                whc.c0.Companion.getClass();
                Intrinsics.checkNotNullParameter(handler3, "handler");
                s.k(handler3);
                return handler3;
            case 8:
                return new lic.s(nVar.f297546a, (bgc.e) sVar.u.get(), new jx0.a(nVar.f297546a, (bgc.e) nVar.f297548c.u.get()));
            case 9:
                Object handler4 = (kic.d) nVar.f297554n.get();
                whc.c0.Companion.getClass();
                Intrinsics.checkNotNullParameter(handler4, "handler");
                yji.n nVar3 = (yji.n) handler4;
                s.k(nVar3);
                return nVar3;
            case 10:
                return new lic.i(nVar.f297546a, (bgc.e) sVar.u.get(), (gic.h) nVar.f297549g.get());
            case 11:
                PerkDetailsFlowContract$InputData perkDetailsFlowContract$InputData3 = nVar.f297546a;
                bgc.e eVar3 = (bgc.e) sVar.u.get();
                kic.b bVar = (kic.b) nVar.f297550h.get();
                lic.g gVar2 = (lic.g) nVar.f.get();
                kic.d dVar = (kic.d) nVar.f297554n.get();
                lic.s sVar3 = (lic.s) nVar.f297552l.get();
                wli.x xVarD = ((s41.a) sVar.o).d();
                h4g.g gVarB = sVar.k.b();
                pic.f fVar = new pic.f(sVar.f(), new pic.b());
                gic.h hVar = (gic.h) nVar.f297549g.get();
                mre.c cVarB = sVar.f297578r.b();
                s.j(cVarB);
                return new com.revolut.feature.rewards.impl.ui.details.flow.b(perkDetailsFlowContract$InputData3, eVar3, bVar, gVar2, dVar, sVar3, xVarD, gVarB, fVar, hVar, cVarB, new ajk.b(sVar.f297577q.f245945a.e()), new sjc.a(), sVar.f297579s.a());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object oVar;
        Object sVar;
        int i = this.f293501a;
        Object obj2 = this.f293502b;
        int i2 = this.f293503c;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                b bVar = (b) obj2;
                k kVar = (k) obj3;
                switch (i2) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI = bq.i.i(kVar.f293504a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(kVar.f293504a);
                        t70.g gVarO = bVar.f293450b.o();
                        s.j(gVarO);
                        return new npi.c(contextI, baseDelegatesActivityF, gVarO);
                    case 2:
                        return new tpi.i((rpi.c) kVar.e.get(), gsi.c.a(kVar.f293504a));
                    case 3:
                        return new rpi.b(bq.i.b(kVar.f293504a));
                    case 4:
                        return new rpi.h(bq.i.b(kVar.f293504a));
                    case 5:
                        return new iri.g((iri.j) bVar.k.get(), (iri.m) bVar.f293458p.get(), bq.i.f(kVar.f293504a), bq.i.l(kVar.f293504a));
                    case 6:
                        return new iri.l((iri.m) bVar.f293458p.get(), bq.i.f(kVar.f293504a), (iri.d) kVar.i.get());
                    case 7:
                        return new iri.d(bq.i.f(kVar.f293504a));
                    case 8:
                        return new opi.b(bq.i.f(kVar.f293504a));
                    case 9:
                        kVar.getClass();
                        return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) bVar.f293459q.get(), bVar.a());
                    case 10:
                        um.c cVar = (um.c) bVar.f293460r.get();
                        kVar.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
                        b bVar2 = kVar.f293505b;
                        hn.h hVar = (hn.h) bVar2.f293461s.get();
                        t70.g gVarO2 = bVar2.f293450b.o();
                        s.j(gVarO2);
                        builderBuilderWithExpectedSize.add(new jn.a(hVar, gVarO2));
                        builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                        builderBuilderWithExpectedSize.add(bVar2.d());
                        builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                        builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(kVar.f293511m)));
                        return new in.e(cVar, builderBuilderWithExpectedSize.build(), bVar.a());
                    case 11:
                        return bq.i.t(kVar.f293504a);
                    case 12:
                        kVar.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                        builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                        builderBuilderWithExpectedSize2.add(kVar.o.get());
                        builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(kVar.f)));
                        return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) bVar.u.get(), bVar.a());
                    case 13:
                        return new zm.a();
                    case 14:
                        kVar.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                        builderBuilderWithExpectedSize3.add(kVar.f293505b.d());
                        return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) bVar.f293461s.get(), (npi.f) kVar.d.get());
                    case 15:
                        return new en.c(ImmutableSet.of((ln.d) kVar.f293505b.f293462t.get()), bq.i.l(kVar.f293504a));
                    case 16:
                        return new gn.c((lpi.e) kVar.f293516s.get(), (sm.e) bVar.f293463w.get(), ImmutableSet.copyOf((Collection) gn.e.a()), bVar.a());
                    case 17:
                        return new lpi.b(bq.i.i(kVar.f293504a), bq.i.j(kVar.f293504a));
                    case 18:
                        kVar.getClass();
                        return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) bVar.f293464x.get(), bVar.a());
                    case 19:
                        kVar.getClass();
                        wpi.c cVar2 = wpi.d.Companion;
                        return new wpi.b(bq.i.b(kVar.f293504a));
                    case 20:
                        ozc.d dVar = (ozc.d) bVar.f293465y.get();
                        e4m.e eVar = kVar.f293518w;
                        xoi.d dVar2 = kVar.f293504a;
                        d0d.k kVar2 = new d0d.k(dVar, (d0d.a) eVar.get(), (mxc.b) bVar.z.get(), (wpi.e) kVar.v.get(), bq.i.l(dVar2), bq.i.e(dVar2));
                        kli.a.p(kVar2, bq.i.d(dVar2));
                        return kVar2;
                    case 21:
                        return new d0d.f();
                    default:
                        throw new AssertionError(i2);
                }
            case 1:
                b bVar3 = (b) obj2;
                d dVar3 = (d) obj3;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new uzc.f();
                    }
                    throw new AssertionError(i2);
                }
                uzc.k kVar3 = new uzc.k((ozc.d) bVar3.f293465y.get(), (ozc.f) bVar3.C.get(), (uzc.b) dVar3.f293484b.get());
                kli.a.p(kVar3, bq.i.d(dVar3.f293483a.f293466a));
                return kVar3;
            case 2:
                b bVar4 = (b) obj2;
                e eVar2 = (e) obj3;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new e0d.f();
                    }
                    throw new AssertionError(i2);
                }
                e0d.j jVar = new e0d.j((ozc.d) bVar4.f293465y.get(), (ozc.f) bVar4.C.get(), (e0d.b) eVar2.f293487b.get());
                kli.a.p(jVar, bq.i.d(eVar2.f293486a.f293466a));
                return jVar;
            case 3:
                b bVar5 = (b) obj2;
                f fVar = (f) obj3;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new xzc.e();
                    }
                    throw new AssertionError(i2);
                }
                xzc.i iVar = new xzc.i((ozc.d) bVar5.f293465y.get(), (xzc.b) fVar.f293490b.get(), (ozc.f) bVar5.C.get());
                kli.a.p(iVar, bq.i.d(fVar.f293489a.f293466a));
                return iVar;
            case 4:
                w06.b bVar6 = (w06.b) obj3;
                w06.a aVar = (w06.a) obj2;
                switch (i2) {
                    case 0:
                        return new iri.g((iri.j) aVar.f293640q.get(), new iri.b(), bq.i.f(bVar6.f293641a), bq.i.l(bVar6.f293641a));
                    case 1:
                        return new iri.l(new iri.b(), bq.i.f(bVar6.f293641a), (iri.d) bVar6.e.get());
                    case 2:
                        return new iri.d(bq.i.f(bVar6.f293641a));
                    case 3:
                        Context contextI2 = bq.i.i(bVar6.f293641a);
                        BaseDelegatesActivity baseDelegatesActivityF2 = bq.i.f(bVar6.f293641a);
                        t70.g gVarO3 = aVar.f293630a.o();
                        s.j(gVarO3);
                        return new npi.c(contextI2, baseDelegatesActivityF2, gVarO3);
                    case 4:
                        return new tpi.i((rpi.c) bVar6.f293645h.get(), gsi.c.a(bVar6.f293641a));
                    case 5:
                        return new rpi.b(bq.i.b(bVar6.f293641a));
                    case 6:
                        return new rpi.h(bq.i.b(bVar6.f293641a));
                    case 7:
                        return new lpi.b(bq.i.i(bVar6.f293641a), bq.i.j(bVar6.f293641a));
                    case 8:
                        return new gqi.b(bq.i.b(bVar6.f293641a));
                    case 9:
                        return bq.i.t(bVar6.f293641a);
                    case 10:
                        sri.m mVarL = bq.i.l(bVar6.f293641a);
                        u06.a aVar2 = aVar.f293631b;
                        emi.a aVar3 = aVar.f;
                        q06.d dVarA = aVar2.a();
                        s.j(dVarA);
                        q06.m mVar = (q06.m) bVar6.f293647l.get();
                        com.revolut.analytics.tracking.v3.c cVarE = aVar.k.e();
                        cmi.n nVarA = aVar3.a();
                        s.j(nVarA);
                        w51.a aVarB = aVar.f293636l.b();
                        s.j(aVarB);
                        qpa.a aVar4 = (qpa.a) aVar.f293637m.f227549g.get();
                        s.j(aVar4);
                        return new v06.j(mVarL, dVarA, mVar, cVarE, nVarA, aVarB, aVar4, new ami.n(e4m.b.a(aVar3.f127661a.o), 0), bVar6.f293642b, (v06.b) bVar6.f293648m.get(), new v06.a());
                    case 11:
                        asi.b bVar7 = aVar.f293632c;
                        u06.a aVar5 = aVar.f293631b;
                        asi.d dVarC = ((j51.a) bVar7).c();
                        s.j(dVarC);
                        fwj.p pVarA = aVar.d.a();
                        s.j(pVarA);
                        q06.l lVarA = aVar.e.a();
                        s.j(lVarA);
                        ami.n nVar = new ami.n(e4m.b.a(aVar.f.f127661a.o), 0);
                        x06.b bVar8 = (x06.b) aVar5.f276065g.get();
                        s.j(bVar8);
                        q06.g gVar = (q06.g) aVar5.f276066h.get();
                        s.j(gVar);
                        uli.g gVar2 = (uli.g) aVar.f293633g.f16835a.get();
                        s.j(gVar2);
                        onh.b bVarB = aVar.f293634h.b();
                        xjl.h hVar2 = (xjl.h) ((ljl.q0) aVar.i).f0.get();
                        s.j(hVar2);
                        xa9.d dVar4 = (xa9.d) aVar.f293635j.W.get();
                        s.j(dVar4);
                        return new s06.o(dVarC, pVarA, lVarA, nVar, bVar8, gVar, gVar2, bVarB, hVar2, dVar4);
                    case 12:
                        erl.a aVar6 = aVar.f293638n;
                        q06.d deeplinkParser = aVar6.f128740b.a();
                        s.j(deeplinkParser);
                        z70.a aVarF = aVar6.f128739a.f();
                        s.j(aVarF);
                        r10.t testRecorderApiProvider = new r10.t(aVarF);
                        CoroutineScope coroutineScope = aVar6.f128741c.a();
                        s.j(coroutineScope);
                        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
                        Intrinsics.checkNotNullParameter(testRecorderApiProvider, "testRecorderApiProvider");
                        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
                        r10.r rVar = new r10.r();
                        rVar.f250851a = deeplinkParser;
                        rVar.f250852b = testRecorderApiProvider;
                        rVar.f250853c = coroutineScope;
                        return new v06.b(rVar);
                    default:
                        throw new AssertionError(i2);
                }
            case 5:
                w1c.d dVar5 = (w1c.d) obj3;
                if (i2 == 0) {
                    return new d2c.j((cli.n) dVar5.f293827a.get(), (p2c.z) dVar5.f293828b.get(), ((w1c.a) obj2).d.a());
                }
                if (i2 == 1) {
                    return new d2c.k();
                }
                if (i2 == 2) {
                    return new p2c.z();
                }
                throw new AssertionError(i2);
            case 6:
                w2i.a aVar7 = (w2i.a) obj3;
                w2i.b bVar9 = (w2i.b) obj2;
                switch (i2) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI3 = bq.i.i(aVar7.f294041a);
                        BaseDelegatesActivity baseDelegatesActivityF3 = bq.i.f(aVar7.f294041a);
                        t70.g gVarO4 = bVar9.f294059b.o();
                        s.j(gVarO4);
                        return new npi.c(contextI3, baseDelegatesActivityF3, gVarO4);
                    case 2:
                        return new tpi.i((rpi.c) aVar7.f.get(), gsi.c.a(aVar7.f294041a));
                    case 3:
                        return new rpi.b(bq.i.b(aVar7.f294041a));
                    case 4:
                        return new rpi.h(bq.i.b(aVar7.f294041a));
                    case 5:
                        return new iri.g((iri.j) bVar9.f294073x.get(), (iri.m) bVar9.f294074y.get(), bq.i.f(aVar7.f294041a), bq.i.l(aVar7.f294041a));
                    case 6:
                        return new iri.l((iri.m) bVar9.f294074y.get(), bq.i.f(aVar7.f294041a), (iri.d) aVar7.f294046j.get());
                    case 7:
                        return new iri.d(bq.i.f(aVar7.f294041a));
                    case 8:
                        return new opi.b(bq.i.f(aVar7.f294041a));
                    case 9:
                        aVar7.getClass();
                        return new xpi.c(xpi.f.f307976c, bq.i.b(aVar7.f294041a));
                    case 10:
                        aVar7.getClass();
                        return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) bVar9.z.get(), bVar9.a());
                    case 11:
                        um.c cVar3 = (um.c) bVar9.A.get();
                        aVar7.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(5);
                        w2i.b bVar10 = aVar7.f294043c;
                        hn.h hVar3 = (hn.h) bVar10.B.get();
                        t70.g gVarO5 = bVar10.f294059b.o();
                        s.j(gVarO5);
                        builderBuilderWithExpectedSize4.add(new jn.a(hVar3, gVarO5));
                        builderBuilderWithExpectedSize4.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                        builderBuilderWithExpectedSize4.add(bVar10.b());
                        builderBuilderWithExpectedSize4.addAll((Iterable) in.g.a());
                        builderBuilderWithExpectedSize4.add(new jn.d(e4m.b.a(aVar7.o)));
                        return new in.e(cVar3, builderBuilderWithExpectedSize4.build(), bVar9.a());
                    case 12:
                        return bq.i.t(aVar7.f294041a);
                    case 13:
                        aVar7.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize5 = ImmutableSet.builderWithExpectedSize(3);
                        builderBuilderWithExpectedSize5.addAll((Iterable) kn.g.a());
                        builderBuilderWithExpectedSize5.add(aVar7.f294051q.get());
                        builderBuilderWithExpectedSize5.add(new kn.h(e4m.b.a(aVar7.f294044g)));
                        return new kn.e(builderBuilderWithExpectedSize5.build(), (ym.d) bVar9.D.get(), bVar9.a());
                    case 14:
                        return new zm.a();
                    case 15:
                        aVar7.getClass();
                        ImmutableSet.Builder builderBuilderWithExpectedSize6 = ImmutableSet.builderWithExpectedSize(2);
                        builderBuilderWithExpectedSize6.addAll((Iterable) hn.g.a());
                        builderBuilderWithExpectedSize6.add(aVar7.f294043c.b());
                        return new hn.d(builderBuilderWithExpectedSize6.build(), (hn.h) bVar9.B.get(), (npi.f) aVar7.e.get());
                    case 16:
                        return new en.c(ImmutableSet.of((ln.d) aVar7.f294043c.C.get()), bq.i.l(aVar7.f294041a));
                    case 17:
                        return new gn.c((lpi.e) aVar7.u.get(), (sm.e) bVar9.F.get(), ImmutableSet.copyOf((Collection) gn.e.a()), bVar9.a());
                    case 18:
                        return new lpi.b(bq.i.i(aVar7.f294041a), bq.i.j(aVar7.f294041a));
                    case 19:
                        aVar7.getClass();
                        return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) bVar9.G.get(), bVar9.a());
                    case 20:
                        return new r3l.c((g1) aVar7.f294056x.get());
                    case 21:
                        return l9.k(bq.i.b(aVar7.f294041a));
                    case 22:
                        return new k3l.d(bq.i.b(aVar7.f294041a));
                    case 23:
                        return new t2i.e(new t2i.j(), bVar9.f294060c.b());
                    case 24:
                        return new u2i.b0(new f2i.a(), bVar9.f294063j.j(), new s1i.a());
                    case 25:
                        u2i.r rVar2 = (u2i.r) bVar9.H.get();
                        u2i.t tVar = (u2i.t) aVar7.B.get();
                        t2i.j jVar2 = new t2i.j();
                        u2i.t tVar2 = (u2i.t) aVar7.B.get();
                        h5i.g gVarB = bVar9.f294060c.b();
                        gte.a aVarB2 = bVar9.k.b();
                        s.j(aVarB2);
                        opi.d dVar6 = (opi.d) aVar7.f294047l.get();
                        u2i.d dVar7 = new u2i.d();
                        mre.c cVarB = bVar9.f294064l.b();
                        s.j(cVarB);
                        u2i.s sVar2 = (u2i.s) bVar9.I.get();
                        sh5.d dVarF = bVar9.f294065m.f();
                        s.j(dVarF);
                        return new u2i.y(rVar2, tVar, jVar2, tVar2, gVarB, aVarB2, dVar6, dVar7, cVarB, sVar2, dVarF, (u2i.k) aVar7.D.get(), new q2i.d(), new r2i.a());
                    case 26:
                        gte.a aVarB3 = bVar9.k.b();
                        s.j(aVarB3);
                        FxService fxServiceK = w3.k(bVar9.f294066n, ((nj0.d) bVar9.o).f());
                        ee0.a aVar8 = bVar9.f294067p;
                        je0.d dVarB = aVar8.b();
                        s.j(dVarB);
                        yk0.a aVarB4 = bVar9.f294068q.b();
                        s.j(aVarB4);
                        xe0.f fVarF = aVar8.f();
                        s.j(fVarF);
                        return new u2i.h(aVarB3, new c1i.g(fxServiceK, w3.j(dVarB, fVarF, aVarB4)), (u2i.r) bVar9.H.get(), (mkd.e) aVar7.C.get(), bVar9.f294070s.b(), new l4i.a());
                    case 27:
                        OrderDetailsActivity orderDetailsActivity = aVar7.f294042b;
                        sri.m mVarL2 = bq.i.l(aVar7.f294041a);
                        tpi.j jVar3 = (tpi.j) aVar7.f294044g.get();
                        r3l.a aVar9 = (r3l.a) aVar7.f294057y.get();
                        k3l.b bVar11 = (k3l.b) aVar7.z.get();
                        rkd.n nVar2 = (rkd.n) bVar9.f294069r.I.get();
                        s.j(nVar2);
                        return w3.t(orderDetailsActivity, mVarL2, jVar3, aVar9, bVar11, nVar2);
                    case 28:
                        qga.b bVar12 = bVar9.f294071t;
                        vn.a aVar10 = bVar9.u;
                        return n57.a.A(bVar12.c(), (ln.a) bVar9.C.get(), (wm.e) bVar9.J.get(), aVar10.c(), aVar10.a());
                    default:
                        throw new AssertionError(i2);
                }
            case 7:
                g gVar3 = (g) obj3;
                w41.a aVar11 = (w41.a) obj2;
                if (i2 == 0) {
                    return new iri.j();
                }
                if (i2 == 1) {
                    return new g3l.g();
                }
                if (i2 == 2) {
                    return new um.c();
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        return new twl.q();
                    }
                    throw new AssertionError(i2);
                }
                twl.c cVar4 = (twl.c) gVar3.d.get();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) aVar11.f294450y).c();
                s.j(aVarC);
                wsg.n nVarB = aVar11.f294448w.b();
                l93.f fVarJ = aVar11.z.j();
                s.j(fVarJ);
                return new twl.i(cVar4, aVarC, nVarB, fVarJ);
            case 8:
                w5f.b bVar13 = (w5f.b) obj3;
                if (i2 == 0) {
                    return new com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.b(bVar13.f295114a, ((w5f.m) obj2).a(), (vii.b) bVar13.d.get(), new com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.c());
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                m7f.b.Companion.getClass();
                return new vii.b();
            case 9:
                return a();
            case 10:
                w5f.n nVar3 = (w5f.n) obj3;
                if (i2 == 0) {
                    return new aah.g((g6f.d) nVar3.f295207b.get(), (g6f.c) nVar3.d.get());
                }
                if (i2 == 1) {
                    ViewController view = nVar3.f295206a;
                    h6f.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(view, "view");
                    return (ManagedPortfoliosCompareController) view;
                }
                if (i2 == 2) {
                    return new g6f.m(((w5f.m) obj2).d(), (cli.n) nVar3.f295208c.get());
                }
                if (i2 == 3) {
                    return new g6f.j(new r10.w(new c6f.e(), new c6f.c()));
                }
                if (i2 == 4) {
                    return new f6f.d((g6f.c) nVar3.d.get(), new f6f.e());
                }
                throw new AssertionError(i2);
            case 11:
                w5f.m mVar2 = (w5f.m) obj2;
                w5f.p pVar = (w5f.p) obj3;
                switch (i2) {
                    case 0:
                        return kii.e.j((u8h.b) mVar2.f295191c, "factory");
                    case 1:
                        return new t6f.f(pVar.f295212b, (t6f.g) pVar.f295221q.get());
                    case 2:
                        qmc.b bVarF = mVar2.f295190b.f();
                        emc.e eVarC = mVar2.d.c();
                        t1j.b bVarA = mVar2.a();
                        ManagedPortfolioDetailsAboutInfoExtensionContract$InputData managedPortfolioDetailsAboutInfoExtensionContract$InputData = pVar.f295213c;
                        gte.a aVarB5 = mVar2.f295189a.b();
                        s.j(aVarB5);
                        oVar = new o(bVarF, eVarC, bVarA, managedPortfolioDetailsAboutInfoExtensionContract$InputData, aVarB5);
                        break;
                    case 3:
                        return new j6f.m(pVar.d, (j6f.b) pVar.f295223s.get());
                    case 4:
                        oVar = new t(mVar2.c(), mVar2.b(), new h7f.f(), pVar.e, (d1h.e) pVar.f295220p.get());
                        break;
                    case 5:
                        return new g7f.b(pVar.f, (o6f.b) pVar.u.get());
                    case 6:
                        return new o6f.m(pVar.f295214g, mVar2.d(), (x5f.k) mVar2.v.get(), mVar2.f.a());
                    case 7:
                        return new r6f.c(pVar.f295215h, (r6f.d) pVar.f295225w.get());
                    case 8:
                        return new r6f.l(mVar2.f295190b.f(), mVar2.d.c(), pVar.i);
                    case 9:
                        return new b7f.b(pVar.f295216j, pVar.k, (b7f.h) pVar.f295227y.get());
                    case 10:
                        return new b7f.h(mVar2.d.c(), pVar.k);
                    case 11:
                        return new l8f.g(mVar2.d.c(), pVar.f295218m);
                    case 12:
                        oVar = new j8f.q((l8f.g) pVar.A.get(), (t6f.g) pVar.f295221q.get(), (o6f.b) pVar.u.get(), (b7f.h) pVar.f295227y.get(), (j6f.b) pVar.f295223s.get(), (r6f.d) pVar.f295225w.get(), (d1h.e) pVar.f295220p.get(), pVar.f295219n, new j8f.o(new l8f.f(pVar.o.d.d()), (cli.n) pVar.B.get(), (cli.n) pVar.C.get(), (cli.n) pVar.E.get(), new b7f.g((f01.a) pVar.G.get()), new r6f.j(), (d1h.h) pVar.D.get()));
                        break;
                    case 13:
                        ManagedPortfolioDetailsAboutInfoExtensionContract$InputData managedPortfolioDetailsAboutInfoExtensionContract$InputData2 = pVar.f295213c;
                        gte.a aVarB6 = mVar2.f295189a.b();
                        s.j(aVarB6);
                        return new t6f.m(managedPortfolioDetailsAboutInfoExtensionContract$InputData2, aVarB6);
                    case 14:
                        pVar.getClass();
                        return new o6f.k(new r10.w(new c6f.e(), new c6f.c()));
                    case 15:
                        pVar.getClass();
                        k6f.f fVar2 = new k6f.f(new l6f.a(), (d1h.h) pVar.D.get());
                        l6f.a aVar12 = new l6f.a();
                        gte.a aVarB7 = pVar.o.f295189a.b();
                        s.j(aVarB7);
                        return new q(fVar2, new k6f.m(aVar12, aVarB7), new k6f.k(new l6f.a()), new k6f.n(), new j6f.n(pVar.e), new k6f.h(), new k6f.g());
                    case 16:
                        return kii.e.k((u8h.b) mVar2.f295191c);
                    case 17:
                        return c21.l.B((com.revolut.kompot.navigable.a) pVar.F.get());
                    default:
                        throw new AssertionError(i2);
                }
                return oVar;
            case 12:
                w5f.x xVar = (w5f.x) obj3;
                PortfolioRevealScreenContract$InputData portfolioRevealScreenContract$InputData = xVar.f295249b;
                u8h.c cVar5 = ((w5f.m) obj2).f295191c;
                if (i2 == 0) {
                    return kii.e.j((u8h.b) cVar5, "factory");
                }
                if (i2 == 1) {
                    return new com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.b(portfolioRevealScreenContract$InputData, (d1h.e) xVar.d.get(), new b8f.y(portfolioRevealScreenContract$InputData, xVar.f295250c.f295199q.g(), (d1h.h) xVar.e.get()));
                }
                if (i2 == 2) {
                    return kii.e.k((u8h.b) cVar5);
                }
                throw new AssertionError(i2);
            case 13:
                w5f.m mVar3 = (w5f.m) obj2;
                w5f.z zVar = (w5f.z) obj3;
                switch (i2) {
                    case 0:
                        jlc.f extensions = (jlc.f) zVar.f295261n.get();
                        o8f.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extensions, "extensions");
                        return extensions.f175682a;
                    case 1:
                        d0 factory = mVar3.f295190b.e();
                        jlc.e delegates = zVar.f295253a;
                        j60.a bottomExpandableDialogControllerExtension = (j60.a) zVar.f295260m.get();
                        o8f.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(delegates, "delegates");
                        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                        return factory.a(delegates, bottomExpandableDialogControllerExtension);
                    case 2:
                        return ehe.n.s((com.revolut.kompot.navigable.a) zVar.k.get(), (rp0.m) zVar.f295259l.get());
                    case 3:
                        return new rp0.m();
                    case 4:
                        return kii.e.j((u8h.b) mVar3.f295191c, "factory");
                    case 5:
                        return kxa.j.k((j60.a) zVar.f295260m.get());
                    case 6:
                        return new b7f.b(zVar.f295255c, zVar.d, (b7f.h) zVar.f295264r.get());
                    case 7:
                        return new b7f.h(mVar3.d.c(), zVar.d);
                    case 8:
                        return new j6f.m(zVar.e, (j6f.b) zVar.f295266t.get());
                    case 9:
                        return new t(mVar3.c(), mVar3.b(), new h7f.f(), zVar.f, (d1h.e) zVar.f295262p.get());
                    case 10:
                        return new r6f.c(zVar.f295256g, (r6f.d) zVar.v.get());
                    case 11:
                        return new r6f.l(mVar3.f295190b.f(), mVar3.d.c(), zVar.f295257h);
                    case 12:
                        jlc.f extensions2 = (jlc.f) zVar.f295261n.get();
                        o8f.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extensions2, "extensions");
                        return extensions2.f175683b;
                    case 13:
                        sVar = new n8f.s(zVar.i, (jlc.d) zVar.f295269y.get(), mVar3.d.c(), (b7f.h) zVar.f295264r.get(), (j6f.b) zVar.f295266t.get(), (r6f.d) zVar.v.get(), (d1h.e) zVar.f295262p.get(), new n8f.q((jlc.o) zVar.z.get(), zVar.f295258j.d.d(), new b7f.g((f01.a) zVar.A.get()), (cli.n) zVar.C.get(), new r6f.j(), (d1h.h) zVar.B.get()));
                        break;
                    case 14:
                        jlc.f extensions3 = (jlc.f) zVar.f295261n.get();
                        o8f.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extensions3, "extensions");
                        return extensions3.f175683b;
                    case 15:
                        d0 factory2 = mVar3.f295190b.e();
                        jlc.e delegates2 = zVar.f295253a;
                        o8f.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        Intrinsics.checkNotNullParameter(delegates2, "delegates");
                        return factory2.b(delegates2);
                    case 16:
                        return c21.l.B((com.revolut.kompot.navigable.a) zVar.k.get());
                    case 17:
                        zVar.getClass();
                        k6f.f fVar3 = new k6f.f(new l6f.a(), (d1h.h) zVar.B.get());
                        l6f.a aVar13 = new l6f.a();
                        gte.a aVarB8 = zVar.f295258j.f295189a.b();
                        s.j(aVarB8);
                        sVar = new q(fVar3, new k6f.m(aVar13, aVarB8), new k6f.k(new l6f.a()), new k6f.n(), new j6f.n(zVar.f), new k6f.h(), new k6f.g());
                        break;
                    case 18:
                        return kii.e.k((u8h.b) mVar3.f295191c);
                    default:
                        throw new AssertionError(i2);
                }
                return sVar;
            case 14:
                w5f.b0 b0Var = (w5f.b0) obj3;
                if (i2 == 0) {
                    return new p8f.h(b0Var.f295117a, ((w5f.m) obj2).c(), (cli.n) b0Var.f295118b.get());
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                l6f.a allocationItemMapper = new l6f.a();
                Intrinsics.checkNotNullParameter(allocationItemMapper, "allocationItemMapper");
                return new at.r(new q8f.c());
            case 15:
                return b();
            case 16:
                return c();
            case 17:
                return d();
            case 18:
                return e();
            case 19:
                return f();
            case 20:
                return g();
            case 21:
                return h();
            case 22:
                return i();
            case 23:
                return j();
            case 24:
                return k();
            case 25:
                return l();
            case 26:
                return m();
            case 27:
                return n();
            case 28:
                return o();
            default:
                whc.p pVar2 = (whc.p) obj3;
                if (i2 == 0) {
                    return new c84.w((wic.b) pVar2.f297560b.get());
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                RentAndBillsFlowContract$InputData rentAndBillsFlowContract$InputData = pVar2.f297559a;
                zic.b bVar14 = new zic.b();
                eub.i iVarE = ((whc.s) obj2).f297576p.e();
                s.j(iVarE);
                return new com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.c(rentAndBillsFlowContract$InputData, bVar14, iVarE, new ejc.a(), new ejc.b(), new RentAndBillsUnlinkPaymentsStatusDialogFactory());
        }
    }
}
