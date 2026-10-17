package db1;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import bjl.q0;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.confirmation_code.ui.otp.ESignOtpScreenContract$InputData;
import com.revolut.feature.onboarding.impl.user_migration.UserMigrationFlowContract$InputData;
import com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreenContract$InputData;
import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$Input;
import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$State;
import com.revolut.feature.robo.impl.ui.screen.acknowledgement.AgreementsScreenContract$Input;
import com.revolut.feature.robo.impl.ui.screen.portfolio_allocations_details.PortfolioAllocationsDetailsScreen;
import com.revolut.feature.robo.impl.ui.screen.portfolio_allocations_details.PortfolioAllocationsDetailsScreenContract$InputData;
import com.revolut.feature.robo.impl.ui.screen.portfolio_details.PortfolioDetailsScreenContract$InputData;
import com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.PortfolioStrategyInformationScreenContract$Input;
import com.revolut.feature.robo.impl.ui.screen.settings.SettingsScreen;
import com.revolut.feature.robo.impl.ui.screen.spare_change.PortfolioSpareChangeScreenContract$Input;
import com.revolut.feature.robo.impl.ui.screen.templates.TemplatesScreenContract$Input;
import com.revolut.feature.robo.impl.ui.screen.widgets.projection_chart.pen_contribution.PenContributionScreenContract$InputData;
import com.revolut.feature.shops.impl.service.AdvertisingService;
import com.revolut.feature.shops.impl.ui.bid_screen.ShopsItemsBidScreenContract$InputData;
import com.revolut.feature.shops.impl.ui.carousel_details.ShopsCarouselDetailsScreenContract$InputData;
import com.revolut.feature.shops.impl.ui.fullscreen_opt_in.ShopsPromptScreenContract$InputData;
import com.revolut.feature.shops.impl.ui.home.ShopsCombinedHomeScreenContract$InputData;
import com.revolut.feature.shops.impl.ui.items_details.ShopsItemsDetailsScreenContract$InputData;
import com.revolut.feature.wealth.mutual_funds.api.ui.details.MutualFundDetailsContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import dmc.j;
import dmc.k;
import dmc.r;
import doc.a0;
import doc.b0;
import doc.h;
import doc.w;
import fmc.c0;
import fnc.d0;
import fnc.t;
import fnc.v;
import ip0.v7;
import jfb.x0;
import jki.p;
import jlc.x;
import jlc.y;
import jlc.z;
import kotlin.jvm.internal.Intrinsics;
import kwg.l;
import nd.m;
import noc.o;
import noc.u;
import r10.q;
import rp0.g1;
import uoc.i;
import vc.s;
import vdl.i0;
import vtc.p0;
import wnc.g0;
import xmc.f0;
import yji.n;
import zhm.y0;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f112657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f112658c;
    public final Object d;

    public /* synthetic */ f(Object obj2, Object obj3, int i, int i2) {
        this.f112656a = i2;
        this.f112658c = obj2;
        this.d = obj3;
        this.f112657b = i;
    }

    private final Object a() {
        j jVar = (j) this.d;
        PenContributionScreenContract$InputData penContributionScreenContract$InputData = jVar.f115971a;
        int i = this.f112657b;
        if (i == 0) {
            return new uoc.g((p) jVar.d.get(), penContributionScreenContract$InputData, (w80.b) jVar.f115973c.get());
        }
        if (i == 1) {
            return new i(penContributionScreenContract$InputData, (w80.b) jVar.f115973c.get());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        qd0.b languageProvider = ((r) this.f112658c).f116031h.n();
        s.j(languageProvider);
        voc.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return v80.b.b(languageProvider, false, false, 58);
    }

    private final Object b() {
        r rVar = (r) this.f112658c;
        k kVar = (k) this.d;
        int i = this.f112657b;
        switch (i) {
            case 0:
                spc.c extensions = (spc.c) kVar.f115988p.get();
                gnc.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extensions, "extensions");
                return extensions.f264945a;
            case 1:
                kVar.getClass();
                spc.f fVar = new spc.f(new nmc.g());
                j60.a aVar = (j60.a) kVar.o.get();
                spc.b bVar = kVar.f115974a;
                m rebalanceStatusExtensionFactory = new m(fVar, aVar, bVar);
                gnc.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(rebalanceStatusExtensionFactory, "rebalanceStatusExtensionFactory");
                c84.c cVar = new c84.c(aVar, fVar);
                return new spc.c(new spc.d(bVar.V0(), cVar), cVar);
            case 2:
                return v1.c.r((com.revolut.kompot.navigable.a) kVar.f115986m.get(), (rp0.m) kVar.f115987n.get());
            case 3:
                return new rp0.m();
            case 4:
                v1h.b extensions2 = (v1h.b) kVar.f115990r.get();
                Intrinsics.checkNotNullParameter(extensions2, "extensions");
                return extensions2.f285316a;
            case 5:
                h9h.a aVar2 = rVar.f116028b;
                return p0.m(new bdh.d(), kVar.f115976b);
            case 6:
                return kxa.j.j((j60.a) kVar.o.get());
            case 7:
                noc.f extensions3 = (noc.f) kVar.u.get();
                Intrinsics.checkNotNullParameter(extensions3, "extensions");
                return extensions3.f217982b;
            case 8:
                jt0.b factory = new jt0.b(new noc.m(), (j60.a) kVar.o.get(), kVar.f115978c);
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.W();
            case 9:
                h extensions4 = (h) kVar.f115993w.get();
                Intrinsics.checkNotNullParameter(extensions4, "extensions");
                return extensions4.f116503b;
            case 10:
                r rVar2 = kVar.f115985l;
                dmc.a aVar3 = rVar2.e;
                emc.e eVarC = aVar3.c();
                l lVarH = w40.c.h(((ewg.h) rVar2.f116034m).a());
                l80.e eVarH = rVar2.f116031h.h();
                s.j(eVarH);
                h9h.a aVar4 = rVar2.f116028b;
                kge.d dVar = new kge.d(lVarH, eVarH, aVar4.d());
                qmc.d dVarG = rVar2.g();
                zjh.f fVarA = aVar3.a();
                gte.a aVarB = rVar2.d.b();
                s.j(aVarB);
                q factory2 = new q(new loc.b(eVarC, dVar, dVarG, fVarA, aVarB, aVar4.d(), aVar4.F()), new eoc.a(), new eoc.b());
                doc.g delegates = kVar.d;
                doc.i widgetInput = kVar.e;
                j60.a bottomExpandableDialogControllerExtension = (j60.a) kVar.o.get();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(delegates, "delegates");
                Intrinsics.checkNotNullParameter(widgetInput, "widgetInput");
                Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                return factory2.c(delegates, widgetInput, bottomExpandableDialogControllerExtension);
            case 11:
                jlc.f extensions5 = (jlc.f) kVar.f115995y.get();
                Intrinsics.checkNotNullParameter(extensions5, "extensions");
                return extensions5.f175682a;
            case 12:
                return ka1.c.D(rVar.e(), kVar.f, (j60.a) kVar.o.get());
            case 13:
                z extensions6 = (z) kVar.A.get();
                Intrinsics.checkNotNullParameter(extensions6, "extensions");
                return extensions6.f175710a;
            case 14:
                t1j.b factory3 = rVar.i();
                y delegates2 = kVar.f115981g;
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(delegates2, "delegates");
                Intrinsics.checkNotNullParameter(delegates2, "delegates");
                f88.f fVar2 = new f88.f((c0) factory3.f267380b);
                return new z(new upc.c(fVar2, delegates2), fVar2);
            case 15:
                return a10.b.f((u8h.b) rVar.i, "factory");
            case 16:
                hbh.j jVarA = rVar.f116035n.a();
                s.j(jVarA);
                return hy1.g.k(jVarA, kVar.i, (h1h.b) kVar.D.get());
            case 17:
                hbh.j jVarA2 = rVar.f116035n.a();
                s.j(jVarA2);
                return hy1.g.l(jVarA2);
            case 18:
                f1h.c cVarA = rVar.o.a();
                s.j(cVarA);
                return fp8.c.s(cVarA, (f1h.f) kVar.F.get(), (f1h.b) kVar.G.get());
            case 19:
                f1h.c cVarA2 = rVar.o.a();
                s.j(cVarA2);
                return fp8.c.t(cVarA2);
            case 20:
                spc.c extensions7 = (spc.c) kVar.f115988p.get();
                gnc.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extensions7, "extensions");
                return extensions7.f264946b;
            case 21:
                v1h.b extensions8 = (v1h.b) kVar.f115990r.get();
                Intrinsics.checkNotNullParameter(extensions8, "extensions");
                return extensions8.f285317b;
            case 22:
                Object delegate = (boc.m) kVar.L.get();
                coc.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                n nVar = (n) delegate;
                s.k(nVar);
                return nVar;
            case 23:
                return new boc.h(new boc.n((boc.i) kVar.K.get(), new boc.b()), (j60.a) kVar.o.get(), rVar.e.a(), new m4f.b());
            case 24:
                PortfolioDetailsScreenContract$InputData inputData = kVar.f115984j;
                gnc.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                return new boc.i(inputData.f85166a);
            case 25:
                noc.f extensions9 = (noc.f) kVar.u.get();
                Intrinsics.checkNotNullParameter(extensions9, "extensions");
                return extensions9.f217981a;
            case 26:
                h extensions10 = (h) kVar.f115993w.get();
                Intrinsics.checkNotNullParameter(extensions10, "extensions");
                return extensions10.f116502a;
            case 27:
                jlc.f extensions11 = (jlc.f) kVar.f115995y.get();
                Intrinsics.checkNotNullParameter(extensions11, "extensions");
                return extensions11.f175683b;
            case 28:
                z extensions12 = (z) kVar.A.get();
                Intrinsics.checkNotNullParameter(extensions12, "extensions");
                return extensions12.f175711b;
            case 29:
                x parcelHandler = (x) kVar.R.get();
                Intrinsics.checkNotNullParameter(parcelHandler, "parcelHandler");
                s.k(parcelHandler);
                return parcelHandler;
            case 30:
                dmc.p factory4 = (dmc.p) rVar.z.get();
                Intrinsics.checkNotNullParameter(factory4, "factory");
                n4f.a aVar5 = factory4.f116019a.f116033l;
                m4f.b wealthAddMoneyCommandProvider = new m4f.b();
                Intrinsics.checkNotNullParameter(wealthAddMoneyCommandProvider, "wealthAddMoneyCommandProvider");
                return new tpc.h(wealthAddMoneyCommandProvider);
            case 31:
                return new umc.a();
            case 32:
                mkd.g view = kVar.k;
                rkd.m factory5 = rVar.f116036p.a();
                s.j(factory5);
                gnc.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(factory5, "factory");
                return factory5.a(view);
            case 33:
                fnc.m mVar = (fnc.m) kVar.V.get();
                v vVar = (v) kVar.f115977b0.get();
                qmc.h hVarA = rVar.f116029c.a();
                zjh.f fVarA2 = rVar.e.a();
                r rVar3 = kVar.f115985l;
                u uVar = new u(rVar3.e.c(), rVar3.f116029c.a(), rVar3.f116028b.n());
                PortfolioDetailsScreenContract$InputData portfolioDetailsScreenContract$InputData = kVar.f115984j;
                boc.m mVar2 = (boc.m) kVar.L.get();
                moc.a aVar6 = (moc.a) kVar.c0.get();
                jlc.u uVar2 = (jlc.u) kVar.f115979d0.get();
                tpc.i iVar = (tpc.i) kVar.f115980e0.get();
                x xVar = (x) kVar.R.get();
                xvh.c cVarA3 = ((a6d.e) rVar.f116032j).a();
                s.j(cVarA3);
                rul.e eVar = new rul.e(cVarA3, rVar.f116029c.a());
                h1h.b bVar2 = (h1h.b) kVar.D.get();
                doc.f fVar3 = (doc.f) kVar.f0.get();
                jlc.d dVar2 = (jlc.d) kVar.g0.get();
                gte.a aVarB2 = rVar.d.b();
                s.j(aVarB2);
                return new d0(mVar, vVar, hVarA, fVarA2, uVar, portfolioDetailsScreenContract$InputData, mVar2, aVar6, uVar2, iVar, xVar, eVar, bVar2, fVar3, dVar2, aVarB2, (mkd.d) kVar.U.get(), rVar.f(), (e7f.b) kVar.f115983h0.get());
            case 34:
                gnc.b.Companion.getClass();
                return new fnc.m(0);
            case 35:
                r10.v vVar2 = new r10.v(kVar.f115985l.e.d(), (boc.m) kVar.L.get(), new spc.h(r.h(), new nmc.g()));
                r10.r rVarB = kVar.b();
                gte.a aVarB3 = kVar.f115985l.d.b();
                s.j(aVarB3);
                b0 b0Var = new b0(new doc.y(rVarB, aVarB3, new ael.z()), new w(new foc.g(), kVar.b(), new doc.v()), new a0(new foc.j(), new yoc.p(), kVar.b()), new o7.d(kVar.b()), new foc.b());
                jlc.w wVar = (jlc.w) kVar.W.get();
                o oVar = new o(new yoc.a(new yoc.b()), new spc.h(r.h(), new nmc.g()), new noc.n());
                fnc.u uVar3 = new fnc.u((jlc.o) kVar.X.get());
                h9h.a aVar7 = rVar.f116028b;
                bdh.e eVar2 = new bdh.e();
                jlc.s sVar = (jlc.s) kVar.Y.get();
                he2.b bVar3 = new he2.b(new boc.b());
                fnc.s sVar2 = new fnc.s(new f4h.a(new ooc.b()), new t());
                upc.d dVar3 = new upc.d();
                l5f.a aVar8 = (l5f.a) kVar.f115975a0.get();
                gte.a aVarB4 = rVar.d.b();
                s.j(aVarB4);
                return new v(vVar2, b0Var, wVar, oVar, uVar3, eVar2, sVar, bVar3, sVar2, dVar3, aVar8, aVarB4);
            case 36:
                dmc.p factory6 = (dmc.p) rVar.z.get();
                Intrinsics.checkNotNullParameter(factory6, "factory");
                factory6.getClass();
                return new tpc.d(new tpc.b());
            case 37:
                qoc.d0 factory7 = rVar.e();
                jlc.e delegates3 = kVar.f;
                Intrinsics.checkNotNullParameter(factory7, "factory");
                Intrinsics.checkNotNullParameter(delegates3, "delegates");
                return factory7.b(delegates3);
            case 38:
                dmc.o factory8 = (dmc.o) rVar.A.get();
                Intrinsics.checkNotNullParameter(factory8, "factory");
                return factory8.a();
            case 39:
                w5f.h factory9 = (w5f.h) kVar.Z.get();
                Intrinsics.checkNotNullParameter(factory9, "factory");
                factory9.getClass();
                return new e7f.i(new kpj.f(factory9.f295178a.k.H()), new ufl.b(new tfl.a()));
            case 40:
                Context context = rVar.f116037q;
                phm.a aVar9 = (phm.a) kii.e.l(context, "context", context, w5f.m.class);
                b60.a aVar10 = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar10 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", w5f.m.class, " is not found"));
                }
                w5f.h hVar = (w5f.h) ((w5f.m) aVar10.b()).f295202t.get();
                s.k(hVar);
                return hVar;
            case 41:
                return new moc.b();
            case 42:
                dmc.o factory10 = (dmc.o) rVar.A.get();
                Intrinsics.checkNotNullParameter(factory10, "factory");
                return factory10.b();
            case 43:
                dmc.p factory11 = (dmc.p) rVar.z.get();
                Intrinsics.checkNotNullParameter(factory11, "factory");
                return factory11.a();
            case 44:
                h extensions13 = (h) kVar.f115993w.get();
                Intrinsics.checkNotNullParameter(extensions13, "extensions");
                return extensions13.f116502a;
            case 45:
                jlc.f extensions14 = (jlc.f) kVar.f115995y.get();
                Intrinsics.checkNotNullParameter(extensions14, "extensions");
                return extensions14.f175683b;
            case 46:
                w5f.h factory12 = (w5f.h) kVar.Z.get();
                Intrinsics.checkNotNullParameter(factory12, "factory");
                w5f.m mVar3 = factory12.f295178a;
                qmc.d dVarG2 = mVar3.f295190b.g();
                qmc.h hVarA2 = mVar3.f.a();
                i0 i0VarD = mVar3.f295195l.d();
                s.j(i0VarD);
                return new e7f.b(dVarG2, hVarA2, i0VarD, new ael.z(), mVar3.k.f());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        r rVar = (r) this.f112658c;
        dmc.l lVar = (dmc.l) this.d;
        r rVar2 = lVar.f115997b;
        int i = this.f112657b;
        if (i == 0) {
            return kxa.j.k((j60.a) lVar.e.get());
        }
        if (i == 1) {
            return ehe.n.s((com.revolut.kompot.navigable.a) lVar.f115998c.get(), (rp0.m) lVar.d.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        nmc.d dVarD = rVar2.e.d();
        gte.a aVarB = rVar2.d.b();
        s.j(aVarB);
        kxk.o oVar = new kxk.o(new unc.s(dVarD, aVarB), new unc.u(), new unc.t(), new unc.r());
        PortfolioSpareChangeScreenContract$Input portfolioSpareChangeScreenContract$Input = lVar.f115996a;
        nmc.d dVarD2 = rVar2.e.d();
        gte.a aVarB2 = rVar2.d.b();
        s.j(aVarB2);
        unc.p pVar = new unc.p(dVarD2, aVarB2);
        j60.a aVar = (j60.a) lVar.e.get();
        qmc.h hVarA = rVar.f116029c.a();
        xvh.c cVarA = ((a6d.e) rVar2.f116032j).a();
        s.j(cVarA);
        tul.b bVar = new tul.b(cVarA);
        xvh.c cVarA2 = ((a6d.e) rVar.f116032j).a();
        s.j(cVarA2);
        return new unc.b0(oVar, portfolioSpareChangeScreenContract$Input, pVar, aVar, hVarA, bVar, cVarA2, rVar.f116028b.d());
    }

    private final Object d() {
        r rVar = (r) this.f112658c;
        dmc.m mVar = (dmc.m) this.d;
        int i = this.f112657b;
        switch (i) {
            case 0:
                h extensions = (h) mVar.k.get();
                Intrinsics.checkNotNullParameter(extensions, "extensions");
                return extensions.f116503b;
            case 1:
                r rVar2 = mVar.f116003g;
                dmc.a aVar = rVar2.e;
                emc.e eVarC = aVar.c();
                l lVarH = w40.c.h(((ewg.h) rVar2.f116034m).a());
                l80.e eVarH = rVar2.f116031h.h();
                s.j(eVarH);
                h9h.a aVar2 = rVar2.f116028b;
                kge.d dVar = new kge.d(lVarH, eVarH, aVar2.d());
                qmc.d dVarG = rVar2.g();
                zjh.f fVarA = aVar.a();
                gte.a aVarB = rVar2.d.b();
                s.j(aVarB);
                q factory = new q(new loc.b(eVarC, dVar, dVarG, fVarA, aVarB, aVar2.d(), aVar2.F()), new eoc.a(), new eoc.b());
                doc.g delegates = mVar.f116000a;
                doc.i widgetInput = mVar.f116001b;
                j60.a bottomExpandableDialogControllerExtension = (j60.a) mVar.f116005j.get();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(delegates, "delegates");
                Intrinsics.checkNotNullParameter(widgetInput, "widgetInput");
                Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                return factory.c(delegates, widgetInput, bottomExpandableDialogControllerExtension);
            case 2:
                return ehe.n.s((com.revolut.kompot.navigable.a) mVar.f116004h.get(), (rp0.m) mVar.i.get());
            case 3:
                return new rp0.m();
            case 4:
                return kxa.j.k((j60.a) mVar.f116005j.get());
            case 5:
                v1h.b extensions2 = (v1h.b) mVar.f116008n.get();
                Intrinsics.checkNotNullParameter(extensions2, "extensions");
                return extensions2.f285316a;
            case 6:
                h9h.a aVar3 = rVar.f116028b;
                return p0.m(new bdh.d(), mVar.f116002c);
            case 7:
                noc.f extensions3 = (noc.f) mVar.f116009p.get();
                Intrinsics.checkNotNullParameter(extensions3, "extensions");
                return extensions3.f217982b;
            case 8:
                jt0.b factory2 = new jt0.b(new noc.m(), (j60.a) mVar.f116005j.get(), mVar.d);
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return factory2.W();
            case 9:
                return a10.b.f((u8h.b) rVar.i, "factory");
            case 10:
                h extensions4 = (h) mVar.k.get();
                Intrinsics.checkNotNullParameter(extensions4, "extensions");
                return extensions4.f116502a;
            case 11:
                v1h.b extensions5 = (v1h.b) mVar.f116008n.get();
                Intrinsics.checkNotNullParameter(extensions5, "extensions");
                return extensions5.f285317b;
            case 12:
                noc.f extensions6 = (noc.f) mVar.f116009p.get();
                Intrinsics.checkNotNullParameter(extensions6, "extensions");
                return extensions6.f217981a;
            case 13:
                r rVar3 = mVar.f116003g;
                yoc.j jVar = new yoc.j(rVar3.e.d());
                r10.r rVarB = mVar.b();
                gte.a aVarB2 = rVar3.d.b();
                s.j(aVarB2);
                inc.j jVar2 = new inc.j(jVar, new b0(new doc.y(rVarB, aVarB2, new ael.z()), new w(new foc.g(), mVar.b(), new doc.v()), new a0(new foc.j(), new yoc.p(), mVar.b()), new o7.d(mVar.b()), new foc.b()), new o(new yoc.a(new yoc.b()), new spc.h(r.h(), new nmc.g()), new noc.n()), new poc.a(new nnc.d(), new nnc.b()), new ooc.b(), new bdh.e(), new ppc.t(new m(new qpc.a(), new qpc.b()), new kbh.a()));
                PortfolioStrategyInformationScreenContract$Input portfolioStrategyInformationScreenContract$Input = mVar.f;
                zjh.f fVarA2 = rVar.e.a();
                doc.f fVar = (doc.f) mVar.v.get();
                emc.e eVarC2 = rVar.e.c();
                poc.b bVar = new poc.b(new poc.a(new nnc.d(), new nnc.b()), (j60.a) mVar.f116005j.get());
                r rVar4 = mVar.f116003g;
                zdl.f fVar2 = rVar4.f116030g;
                h9h.a aVar4 = rVar4.f116028b;
                ybl.k kVarD = fVar2.d();
                s.j(kVarD);
                return new com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.a(jVar2, portfolioStrategyInformationScreenContract$Input, fVarA2, fVar, eVarC2, bVar, new ppc.u(kVarD, new rpc.f(aVar4.f()), new a87.c(aVar4.f(), 1), new onh.b(aVar4.f())));
            case 14:
                h extensions7 = (h) mVar.k.get();
                Intrinsics.checkNotNullParameter(extensions7, "extensions");
                return extensions7.f116502a;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        r rVar = (r) this.f112658c;
        dmc.q qVar = (dmc.q) this.d;
        int i = this.f112657b;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) qVar.f.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) qVar.d.get(), (rp0.m) qVar.e.get());
            case 2:
                return new rp0.m();
            case 3:
                v1h.b extensions = (v1h.b) qVar.f116024h.get();
                Intrinsics.checkNotNullParameter(extensions, "extensions");
                return extensions.f285316a;
            case 4:
                return p0.m(new bdh.d(), qVar.f116020a);
            case 5:
                vmc.g factory = (vmc.g) rVar.f116043y.get();
                j60.a bottomExpandableDialogControllerExtension = (j60.a) qVar.f.get();
                aoc.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                factory.getClass();
                Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                return new vmc.f(bottomExpandableDialogControllerExtension, factory.f290562a);
            case 6:
                v1h.b extensions2 = (v1h.b) qVar.f116024h.get();
                Intrinsics.checkNotNullParameter(extensions2, "extensions");
                return extensions2.f285317b;
            case 7:
                aoc.b.Companion.getClass();
                return new znc.n(new znc.d(null), new znc.l(new znc.i(), new znc.k(new bdh.e()), (glc.b) qVar.f116022c.f116042x.get()), qVar.f116021b, (glc.d) rVar.f116041w.get(), (glc.c) qVar.f116025j.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        r rVar = (r) this.f112658c;
        dmc.s sVar = (dmc.s) this.d;
        int i = this.f112657b;
        switch (i) {
            case 0:
                dlc.e extensions = (dlc.e) sVar.i.get();
                Intrinsics.checkNotNullParameter(extensions, "extensions");
                return extensions.f115727a;
            case 1:
                hmc.h factory = (hmc.h) rVar.v.get();
                j60.a bottomExpandableDialogControllerExtension = (j60.a) sVar.f.get();
                dlc.d delegatesProvider = (dlc.d) sVar.f116048h.get();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                Intrinsics.checkNotNullParameter(delegatesProvider, "delegatesProvider");
                return factory.a(delegatesProvider, bottomExpandableDialogControllerExtension);
            case 2:
                return h30.l.p((com.revolut.kompot.navigable.a) sVar.d.get(), (rp0.m) sVar.e.get());
            case 3:
                return new rp0.m();
            case 4:
                SettingsScreen screen = (SettingsScreen) sVar.f116047g.get();
                Intrinsics.checkNotNullParameter(screen, "screen");
                s.k(screen);
                return screen;
            case 5:
                BaseScreen screen2 = sVar.f116044a;
                tnc.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(screen2, "screen");
                return (SettingsScreen) screen2;
            case 6:
                return kxa.j.l((j60.a) sVar.f.get());
            case 7:
                dlc.e extensions2 = (dlc.e) sVar.i.get();
                Intrinsics.checkNotNullParameter(extensions2, "extensions");
                return extensions2.f115728b;
            case 8:
                return new snc.k((snc.e) sVar.f116051m.get(), (snc.c) sVar.f116052n.get(), sVar.f116045b, (dlc.g) rVar.f116040t.get(), rVar.f116029c.a());
            case 9:
                tnc.b.Companion.getClass();
                return new snc.e(null, null);
            case 10:
                r rVar2 = sVar.f116046c;
                nmc.d dVarD = rVar2.e.d();
                gte.a aVarB = rVar2.d.b();
                s.j(aVarB);
                return new snc.c(new snc.b(dVarD, aVarB), new snc.a(sVar.f116046c.e.d(), 0), (dlc.f) rVar.u.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        r rVar = (r) this.f112658c;
        dmc.t tVar = (dmc.t) this.d;
        int i = this.f112657b;
        switch (i) {
            case 0:
                noc.f extensions = (noc.f) tVar.f116059l.get();
                Intrinsics.checkNotNullParameter(extensions, "extensions");
                return extensions.f217982b;
            case 1:
                jt0.b factory = new jt0.b(new noc.m(), (j60.a) tVar.k.get(), tVar.f116053a);
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.W();
            case 2:
                return h30.l.p((com.revolut.kompot.navigable.a) tVar.i.get(), (rp0.m) tVar.f116058j.get());
            case 3:
                return new rp0.m();
            case 4:
                v1h.b extensions2 = (v1h.b) tVar.f116061n.get();
                Intrinsics.checkNotNullParameter(extensions2, "extensions");
                return extensions2.f285316a;
            case 5:
                h9h.a aVar = rVar.f116028b;
                bdh.d extensionFactory = new bdh.d();
                v1h.a delegates = tVar.f116054b;
                Intrinsics.checkNotNullParameter(extensionFactory, "extensionFactory");
                Intrinsics.checkNotNullParameter(delegates, "delegates");
                Intrinsics.checkNotNullParameter(delegates, "delegates");
                bdh.c cVar = new bdh.c();
                return new v1h.b(new bdh.b(cVar, delegates), cVar);
            case 6:
                xnc.a aVar2 = tVar.f116055c;
                h extensions3 = (h) tVar.f116062p.get();
                Intrinsics.checkNotNullParameter(extensions3, "extensions");
                return extensions3.f116503b;
            case 7:
                xnc.a aVar3 = tVar.f116055c;
                r rVar2 = tVar.f116057h;
                dmc.a aVar4 = rVar2.e;
                emc.e eVarC = aVar4.c();
                l lVarH = w40.c.h(((ewg.h) rVar2.f116034m).a());
                l80.e eVarH = rVar2.f116031h.h();
                s.j(eVarH);
                h9h.a aVar5 = rVar2.f116028b;
                kge.d dVar = new kge.d(lVarH, eVarH, aVar5.d());
                qmc.d dVarG = rVar2.g();
                zjh.f fVarA = aVar4.a();
                gte.a aVarB = rVar2.d.b();
                s.j(aVarB);
                q factory2 = new q(new loc.b(eVarC, dVar, dVarG, fVarA, aVarB, aVar5.d(), aVar5.F()), new eoc.a(), new eoc.b());
                doc.g delegates2 = tVar.d;
                doc.i widgetInput = tVar.e;
                j60.a bottomExpandableDialogControllerExtension = (j60.a) tVar.k.get();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(delegates2, "delegates");
                Intrinsics.checkNotNullParameter(widgetInput, "widgetInput");
                Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                return factory2.c(delegates2, widgetInput, bottomExpandableDialogControllerExtension);
            case 8:
                return kxa.j.l((j60.a) tVar.k.get());
            case 9:
                return a10.b.f((u8h.b) rVar.i, "factory");
            case 10:
                noc.f extensions4 = (noc.f) tVar.f116059l.get();
                Intrinsics.checkNotNullParameter(extensions4, "extensions");
                return extensions4.f217981a;
            case 11:
                v1h.b extensions5 = (v1h.b) tVar.f116061n.get();
                Intrinsics.checkNotNullParameter(extensions5, "extensions");
                return extensions5.f285317b;
            case 12:
                xnc.a aVar6 = tVar.f116055c;
                h extensions6 = (h) tVar.f116062p.get();
                Intrinsics.checkNotNullParameter(extensions6, "extensions");
                return extensions6.f116502a;
            case 13:
                e4m.e eVar = tVar.f116068x;
                r rVar3 = tVar.f116057h;
                ync.m mVar = (ync.m) eVar.get();
                ync.c cVar2 = new ync.c(rVar3.e.d());
                wnc.m mVar2 = (wnc.m) tVar.f116069y.get();
                poc.b bVar = new poc.b(new poc.a(new nnc.d(), new nnc.b()), (j60.a) tVar.k.get());
                j60.a aVar7 = (j60.a) tVar.k.get();
                TemplatesScreenContract$Input templatesScreenContract$Input = tVar.f116056g;
                dmc.a aVar8 = rVar3.e;
                return new g0(mVar, cVar2, mVar2, bVar, aVar7, new com.revolut.feature.robo.impl.ui.screen.templates.a(templatesScreenContract$Input, aVar8.a(), aVar8.c()), new wnc.y(), (moc.a) tVar.z.get(), (jlc.u) tVar.A.get(), (doc.f) tVar.B.get(), rVar.f(), rVar.e.c(), new ync.h());
            case 14:
                r rVar4 = tVar.f116057h;
                r rVar5 = tVar.f116057h;
                d8f.z zVar = new d8f.z(rVar4.e.d(), 1);
                ync.l lVar = new ync.l(rVar5.e.d());
                ync.j jVar = new ync.j();
                yoc.j jVar2 = new yoc.j(rVar5.e.d());
                ync.d dVar2 = new ync.d();
                r10.r rVarD = dmc.t.d();
                gte.a aVarB2 = rVar5.d.b();
                s.j(aVarB2);
                return new ync.m(zVar, lVar, jVar, new ybh.c0(new ync.e(jVar2, dVar2, new b0(new doc.y(rVarD, aVarB2, new ael.z()), new w(new foc.g(), dmc.t.d(), new doc.v()), new a0(new foc.j(), new yoc.p(), dmc.t.d()), new o7.d(dmc.t.d()), new foc.b()), new poc.a(new nnc.d(), new nnc.b()), new o(new yoc.a(new yoc.b()), new spc.h(r.h(), new nmc.g()), new noc.n()), new bdh.e(), new ooc.b(), (jlc.s) tVar.f116067w.get())), new ync.h(), new snc.a(rVar5.e.d(), 1));
            case 15:
                dmc.o factory3 = (dmc.o) rVar.A.get();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                return factory3.a();
            case 16:
                xnc.c.Companion.getClass();
                return new wnc.m(0);
            case 17:
                return new moc.b();
            case 18:
                dmc.o factory4 = (dmc.o) rVar.A.get();
                Intrinsics.checkNotNullParameter(factory4, "factory");
                return factory4.b();
            case 19:
                xnc.a aVar9 = tVar.f116055c;
                h extensions7 = (h) tVar.f116062p.get();
                Intrinsics.checkNotNullParameter(extensions7, "extensions");
                return extensions7.f116502a;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        r rVar = (r) this.f112658c;
        dmc.v vVar = (dmc.v) this.d;
        int i = this.f112657b;
        switch (i) {
            case 0:
                spc.c extensions = (spc.c) vVar.f116078j.get();
                enc.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(extensions, "extensions");
                return extensions.f264945a;
            case 1:
                vVar.getClass();
                spc.f fVar = new spc.f(new nmc.g());
                j60.a aVar = (j60.a) vVar.f116077h.get();
                spc.b bVar = (spc.b) vVar.i.get();
                m factory = new m(fVar, aVar, bVar);
                enc.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                c84.c cVar = new c84.c(aVar, fVar);
                return new spc.c(new spc.d(bVar.V0(), cVar), cVar);
            case 2:
                return kxa.j.q((com.revolut.kompot.navigable.a) vVar.f.get(), (rp0.m) vVar.f116076g.get(), new j60.e());
            case 3:
                return new rp0.m();
            case 4:
                BaseScreen screen = vVar.f116074b;
                enc.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(screen, "screen");
                PortfolioAllocationsDetailsScreen portfolioAllocationsDetailsScreen = (PortfolioAllocationsDetailsScreen) screen;
                s.k(portfolioAllocationsDetailsScreen);
                return portfolioAllocationsDetailsScreen;
            case 5:
                return kxa.j.s((j60.a) vVar.f116077h.get());
            case 6:
                return a10.b.f((u8h.b) rVar.i, "factory");
            case 7:
                spc.c extensions2 = (spc.c) vVar.f116078j.get();
                enc.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(extensions2, "extensions");
                return extensions2.f264946b;
            case 8:
                p pVar = (p) vVar.f116084r.get();
                PortfolioAllocationsDetailsScreenContract$InputData portfolioAllocationsDetailsScreenContract$InputData = vVar.d;
                ybl.b bVarB = rVar.f116027a.b();
                s.j(bVarB);
                return new dnc.r(pVar, portfolioAllocationsDetailsScreenContract$InputData, bVarB, (jlc.u) vVar.f116085s.get(), rVar.f());
            case 9:
                PortfolioAllocationsDetailsScreenContract$InputData portfolioAllocationsDetailsScreenContract$InputData2 = vVar.d;
                yoc.a aVar2 = new yoc.a(new yoc.b());
                dnc.h hVar = (dnc.h) vVar.o.get();
                dnc.g gVar = (dnc.g) vVar.f116082p.get();
                nmc.d dVarD = rVar.e.d();
                jlc.s sVar = (jlc.s) vVar.f116083q.get();
                spc.h hVar2 = new spc.h(r.h(), new nmc.g());
                gte.a aVarB = rVar.d.b();
                s.j(aVarB);
                return new dnc.t(portfolioAllocationsDetailsScreenContract$InputData2, aVar2, hVar, gVar, dVarD, sVar, hVar2, aVarB);
            case 10:
                return new dnc.y();
            case 11:
                return new dnc.x(vVar.d);
            case 12:
                dmc.o factory2 = (dmc.o) rVar.A.get();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return factory2.a();
            case 13:
                dmc.o factory3 = (dmc.o) rVar.A.get();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                return factory3.b();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        r rVar = (r) this.f112658c;
        dmc.w wVar = (dmc.w) this.d;
        int i = this.f112657b;
        switch (i) {
            case 0:
                jlc.f extensions = (jlc.f) wVar.i.get();
                Intrinsics.checkNotNullParameter(extensions, "extensions");
                return extensions.f175682a;
            case 1:
                return ka1.c.D(rVar.e(), wVar.f116088b, (j60.a) wVar.f116091h.get());
            case 2:
                return ehe.n.s((com.revolut.kompot.navigable.a) wVar.f.get(), (rp0.m) wVar.f116090g.get());
            case 3:
                return new rp0.m();
            case 4:
                return kxa.j.k((j60.a) wVar.f116091h.get());
            case 5:
                return a10.b.f((u8h.b) rVar.i, "factory");
            case 6:
                jlc.f extensions2 = (jlc.f) wVar.i.get();
                Intrinsics.checkNotNullParameter(extensions2, "extensions");
                return extensions2.f175683b;
            case 7:
                return knc.e.a();
            case 8:
                qoc.d0 factory = rVar.e();
                jlc.e delegates = wVar.f116088b;
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(delegates, "delegates");
                return factory.b(delegates);
            case 9:
                dmc.o factory2 = (dmc.o) rVar.A.get();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return factory2.a();
            case 10:
                jlc.f extensions3 = (jlc.f) wVar.i.get();
                Intrinsics.checkNotNullParameter(extensions3, "extensions");
                return extensions3.f175683b;
            case 11:
                return new moc.b();
            case 12:
                dmc.o factory3 = (dmc.o) rVar.A.get();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                return factory3.b();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        r rVar = (r) this.f112658c;
        dmc.v vVar = (dmc.v) this.d;
        int i = this.f112657b;
        switch (i) {
            case 0:
                spc.c extensions = (spc.c) vVar.f116078j.get();
                enc.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(extensions, "extensions");
                return extensions.f264945a;
            case 1:
                vVar.getClass();
                spc.f fVar = new spc.f(new nmc.g());
                j60.a aVar = (j60.a) vVar.f116077h.get();
                spc.b bVar = (spc.b) vVar.i.get();
                m factory = new m(fVar, aVar, bVar);
                enc.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                c84.c cVar = new c84.c(aVar, fVar);
                return new spc.c(new spc.d(bVar.V0(), cVar), cVar);
            case 2:
                return kxa.j.q((com.revolut.kompot.navigable.a) vVar.f.get(), (rp0.m) vVar.f116076g.get(), new j60.e());
            case 3:
                return new rp0.m();
            case 4:
                BaseScreen screen = vVar.f116074b;
                enc.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(screen, "screen");
                PortfolioAllocationsDetailsScreen portfolioAllocationsDetailsScreen = (PortfolioAllocationsDetailsScreen) screen;
                s.k(portfolioAllocationsDetailsScreen);
                return portfolioAllocationsDetailsScreen;
            case 5:
                return kxa.j.s((j60.a) vVar.f116077h.get());
            case 6:
                return a10.b.f((u8h.b) rVar.i, "factory");
            case 7:
                spc.c extensions2 = (spc.c) vVar.f116078j.get();
                enc.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(extensions2, "extensions");
                return extensions2.f264946b;
            case 8:
                p pVar = (p) vVar.f116084r.get();
                PortfolioAllocationsDetailsScreenContract$InputData portfolioAllocationsDetailsScreenContract$InputData = vVar.d;
                ybl.b bVarB = rVar.f116027a.b();
                s.j(bVarB);
                return new dnc.r(pVar, portfolioAllocationsDetailsScreenContract$InputData, bVarB, (jlc.u) vVar.f116085s.get(), rVar.f());
            case 9:
                PortfolioAllocationsDetailsScreenContract$InputData portfolioAllocationsDetailsScreenContract$InputData2 = vVar.d;
                yoc.a aVar2 = new yoc.a(new yoc.b());
                dnc.h hVar = (dnc.h) vVar.o.get();
                dnc.g gVar = (dnc.g) vVar.f116082p.get();
                nmc.d dVarD = rVar.e.d();
                jlc.s sVar = (jlc.s) vVar.f116083q.get();
                vVar.e.getClass();
                spc.h hVar2 = new spc.h(r.h(), new nmc.g());
                gte.a aVarB = rVar.d.b();
                s.j(aVarB);
                return new dnc.t(portfolioAllocationsDetailsScreenContract$InputData2, aVar2, hVar, gVar, dVarD, sVar, hVar2, aVarB);
            case 10:
                return new dnc.y();
            case 11:
                return new dnc.x(vVar.d);
            case 12:
                dmc.o factory2 = (dmc.o) rVar.A.get();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return factory2.a();
            case 13:
                dmc.o factory3 = (dmc.o) rVar.A.get();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                return factory3.b();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        r rVar = (r) this.f112658c;
        dmc.w wVar = (dmc.w) this.d;
        int i = this.f112657b;
        switch (i) {
            case 0:
                jlc.f extensions = (jlc.f) wVar.i.get();
                Intrinsics.checkNotNullParameter(extensions, "extensions");
                return extensions.f175682a;
            case 1:
                return ka1.c.D(rVar.e(), wVar.f116088b, (j60.a) wVar.f116091h.get());
            case 2:
                return ehe.n.s((com.revolut.kompot.navigable.a) wVar.f.get(), (rp0.m) wVar.f116090g.get());
            case 3:
                return new rp0.m();
            case 4:
                return kxa.j.k((j60.a) wVar.f116091h.get());
            case 5:
                return a10.b.f((u8h.b) rVar.i, "factory");
            case 6:
                jlc.f extensions2 = (jlc.f) wVar.i.get();
                Intrinsics.checkNotNullParameter(extensions2, "extensions");
                return extensions2.f175683b;
            case 7:
                return knc.e.a();
            case 8:
                qoc.d0 factory = rVar.e();
                jlc.e delegates = wVar.f116088b;
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(delegates, "delegates");
                return factory.b(delegates);
            case 9:
                dmc.o factory2 = (dmc.o) rVar.A.get();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return factory2.a();
            case 10:
                jlc.f extensions3 = (jlc.f) wVar.i.get();
                Intrinsics.checkNotNullParameter(extensions3, "extensions");
                return extensions3.f175683b;
            case 11:
                return new moc.b();
            case 12:
                dmc.o factory3 = (dmc.o) rVar.A.get();
                Intrinsics.checkNotNullParameter(factory3, "factory");
                return factory3.b();
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object eVar;
        switch (this.f112656a) {
            case 0:
                b bVar = (b) this.f112658c;
                lfc.b bVar2 = bVar.f112644a;
                int i = this.f112657b;
                if (i == 0) {
                    p pVar = (p) ((g) this.d).f112659a.get();
                    xa1.a aVar = (xa1.a) bVar2.f194851j.get();
                    s.j(aVar);
                    wa1.a aVarA = bVar2.a();
                    s.j(aVarA);
                    return new lb1.n(pVar, aVar, aVarA);
                }
                if (i != 1) {
                    throw new AssertionError(i);
                }
                uh1.a aVar2 = (uh1.a) ((yh1.e) bVar.f112645b).f.get();
                s.j(aVar2);
                wa1.a aVarA2 = bVar2.a();
                s.j(aVarA2);
                return new lb1.o(aVar2, aVarA2);
            case 1:
                dd9.b bVar3 = (dd9.b) this.d;
                dd9.e eVar2 = (dd9.e) bVar3.d;
                dd9.e eVar3 = (dd9.e) this.f112658c;
                ite.a aVar3 = eVar3.i;
                int i2 = this.f112657b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        rpa.b bVarA = eVar3.f113133g.a();
                        s.j(bVarA);
                        return new tk3.e(bVarA, new tk3.c());
                    }
                    if (i2 != 2) {
                        throw new AssertionError(i2);
                    }
                    ji0.a aVarG = eVar3.f113134h.g();
                    s.j(aVarG);
                    tk3.c cVar = new tk3.c();
                    gte.a aVarB = aVar3.b();
                    s.j(aVarB);
                    return new tk3.k(aVarG, cVar, aVarB);
                }
                ESignOtpScreenContract$InputData eSignOtpScreenContract$InputData = bVar3.f113122b;
                pk3.a aVar4 = (pk3.a) eVar3.u.get();
                ImmutableMap immutableMapOf = ImmutableMap.of(nk3.a.PUSH, (f) bVar3.e, nk3.a.SMS, (f) bVar3.f);
                nf0.a aVar5 = eVar2.d;
                sf0.h hVarB = aVar5.b();
                s.j(hVarB);
                qk3.c cVar2 = new qk3.c(hVarB);
                sf0.h hVarB2 = aVar5.b();
                s.j(hVarB2);
                qk3.e eVar4 = new qk3.e(hVarB2);
                sf0.h hVarB3 = aVar5.b();
                s.j(hVarB3);
                ImmutableSet immutableSetOf = ImmutableSet.of((qk3.g) cVar2, (qk3.g) eVar4, new qk3.g(hVarB3));
                ESignOtpScreenContract$InputData eSignOtpScreenContract$InputData2 = bVar3.f113122b;
                z80.b bVarS = eVar2.f113135j.s();
                s.j(bVarS);
                rk3.p pVar2 = new rk3.p(eSignOtpScreenContract$InputData2, bVarS);
                gte.a aVarB2 = aVar3.b();
                s.j(aVarB2);
                return new com.revolut.feature.confirmation_code.ui.otp.a(eSignOtpScreenContract$InputData, aVar4, immutableMapOf, immutableSetOf, pVar2, aVarB2);
            case 2:
                dd9.e eVar5 = (dd9.e) this.f112658c;
                int i3 = this.f112657b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        return new oc9.m();
                    }
                    throw new AssertionError(i3);
                }
                rqi.c cVarB = eVar5.f113131b.b();
                ang.f fVarE = eVar5.f113132c.e();
                a99.g gVar = (a99.g) eVar5.f113140q.get();
                UserMigrationFlowContract$InputData userMigrationFlowContract$InputData = ((dd9.f) this.d).f113144a;
                j89.a aVar6 = (j89.a) eVar5.f.u.get();
                s.j(aVar6);
                return new com.revolut.feature.onboarding.impl.user_migration.e(cVarB, fVarE, gVar, userMigrationFlowContract$InputData, aVar6);
            case 3:
                deh.b bVar4 = (deh.b) this.f112658c;
                deh.a aVar7 = (deh.a) this.d;
                int i5 = this.f112657b;
                switch (i5) {
                    case 0:
                        return f0k.d.g(aVar7.f113439a, ((z3h.g) bVar4.f113457b).h(), (e3h.d) aVar7.k.get(), aVar7.f113441c);
                    case 1:
                        MutualFundDetailsContract$InputData inputData = aVar7.f113440b;
                        ieh.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData, "inputData");
                        String str = inputData.f95714a.f95715a;
                        eel.c cVar3 = eel.c.ONE_WEEK;
                        eel.c cVar4 = eel.c.ONE_MONTH;
                        eel.c cVar5 = eel.c.SIX_MONTHS;
                        return new e3h.d(str, zhm.v.k(cVar3, cVar4, cVar5, eel.c.ONE_YEAR, eel.c.FIVE_YEAR, eel.c.ALL), cVar5, y0.b(TradingAccountType.Gia.f105270a), false, inputData.f95714a.f95716b, false, false, false, null, 1984);
                    case 2:
                        return oyj.c.f(((z3h.g) bVar4.f113457b).a(), aVar7.d, (n2h.a) aVar7.f113447n.get());
                    case 3:
                        jid.z zVarA = ((z3h.g) bVar4.f113457b).a();
                        MutualFundDetailsContract$InputData inputData2 = aVar7.f113440b;
                        heh.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData2, "inputData");
                        return oyj.c.h(zVarA, new n2h.e(inputData2.f95714a.f95715a, true), new geh.a((gdh.a) aVar7.f113446m.get(), 0));
                    case 4:
                        kbb.c factory = bVar4.f113458c.a();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return factory.s();
                    case 5:
                        return efk.j.d((dtl.a) aVar7.f113449q.get());
                    case 6:
                        return efk.j.q(bVar4.d.a(), aVar7.e, (dtl.b) aVar7.f113448p.get());
                    case 7:
                        return efk.j.r(bVar4.d.a());
                    case 8:
                        m2h.b bVar5 = bVar4.f113457b;
                        return p0.h(new a4h.c(), aVar7.f, (v2h.b) aVar7.f113451s.get());
                    case 9:
                        m2h.b bVar6 = bVar4.f113457b;
                        a4h.c factory2 = new a4h.c();
                        w2h.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        return new a4h.b();
                    case 10:
                        fsl.t tVarA = bVar4.e.a();
                        s.j(tVarA);
                        return fp8.c.p(tVarA, aVar7.f113442g, (fsl.i) aVar7.v.get());
                    case 11:
                        fsl.t tVarA2 = bVar4.e.a();
                        s.j(tVarA2);
                        return fp8.c.q(tVarA2, (fsl.c) aVar7.u.get());
                    case 12:
                        ieh.e.Companion.getClass();
                        return new ieh.c();
                    case 13:
                        return ige.d.m(bVar4.f.b(), (htl.g) aVar7.f113454x.get(), (htl.d) aVar7.f113455y.get());
                    case 14:
                        return ige.d.n(bVar4.f.b());
                    case 15:
                        hbh.j jVarA = bVar4.f113459g.a();
                        s.j(jVarA);
                        return hy1.g.k(jVarA, aVar7.f113443h, (h1h.b) aVar7.A.get());
                    case 16:
                        hbh.j jVarA2 = bVar4.f113459g.a();
                        s.j(jVarA2);
                        return hy1.g.l(jVarA2);
                    case 17:
                        f1h.c cVarA = bVar4.f113460h.a();
                        s.j(cVarA);
                        return fp8.c.s(cVarA, (f1h.f) aVar7.C.get(), (f1h.b) aVar7.D.get());
                    case 18:
                        f1h.c cVarA2 = bVar4.f113460h.a();
                        s.j(cVarA2);
                        return fp8.c.t(cVarA2);
                    case 19:
                        return efk.j.e((dtl.b) aVar7.f113448p.get());
                    case 20:
                        ael.d0 d0VarK = bVar4.f113456a.k();
                        s.j(d0VarK);
                        ybl.b bVarB = bVar4.f113456a.b();
                        s.j(bVarB);
                        e3h.a extensions = (e3h.a) aVar7.f113445l.get();
                        Intrinsics.checkNotNullParameter(extensions, "extensions");
                        i4h.p0 p0Var = extensions.f122271b;
                        fsl.m mVarB = bVar4.e.b();
                        s.j(mVarB);
                        h1h.b bVar7 = (h1h.b) aVar7.A.get();
                        n2h.a aVar8 = (n2h.a) aVar7.f113447n.get();
                        jeh.a aVar9 = new jeh.a();
                        f3h.a aVar10 = aVar7.i;
                        m2h.b bVar8 = aVar7.f113444j.f113457b;
                        return new feh.m(d0VarK, bVarB, p0Var, mVarB, bVar7, aVar8, new cq9.m(aVar9, f0k.d.n(aVar10, ((z3h.g) bVar8).h()), new a4h.d(), (fsl.k) aVar7.G.get(), oyj.c.m(((z3h.g) bVar8).a())), aVar7.f113440b);
                    case 21:
                        fsl.t tVarA3 = bVar4.e.a();
                        s.j(tVarA3);
                        return fp8.c.r(tVarA3, bVar4.f.a());
                    default:
                        throw new AssertionError(i5);
                }
            case 4:
                dfb.d dVar = (dfb.d) this.d;
                dfb.b bVar9 = (dfb.b) this.f112658c;
                int i6 = this.f112657b;
                if (i6 == 0) {
                    j6c.b bVar10 = (j6c.b) bVar9.e.f233677h0.get();
                    s.j(bVar10);
                    uli.c cVarA3 = bVar9.f.a();
                    s.j(cVarA3);
                    return new jfb.y0(bVar10, cVarA3, new jfb.p(), new lfb.e(), new lfb.a());
                }
                if (i6 == 1) {
                    q0 q0Var = (q0) ((ljl.q0) bVar9.f113833g).q0.get();
                    s.j(q0Var);
                    cli.n nVar = (cli.n) dVar.d.get();
                    ReverywhereWebAppScreenContract$InputData reverywhereWebAppScreenContract$InputData = dVar.f113846a;
                    x0 x0Var = (x0) dVar.f113848c.get();
                    efb.h hVar = (efb.h) bVar9.u.get();
                    web.b bVar11 = (web.b) bVar9.f113835j.i.get();
                    s.j(bVar11);
                    return new com.revolut.feature.retail.reverywhere.impl.web_app.d(q0Var, nVar, reverywhereWebAppScreenContract$InputData, x0Var, hVar, bVar11, new com.revolut.feature.retail.reverywhere.impl.web_app.a(((nj0.d) dVar.f113847b.f113834h).f216295c, new jfb.y()), (jfb.a0) dVar.e.get(), dVar.b());
                }
                if (i6 == 2) {
                    gte.a aVarB3 = bVar9.f113831b.b();
                    s.j(aVarB3);
                    eVar = new com.revolut.feature.retail.reverywhere.impl.web_app.e(aVarB3);
                } else {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            throw new AssertionError(i6);
                        }
                        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) dVar.f113849g.get();
                        kfb.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        return new c90.c(controller.m2());
                    }
                    com.revolut.analytics.tracking.v3.d dVarF = bVar9.k.f();
                    s.j(dVarF);
                    l80.e eVarH = bVar9.f113836l.h();
                    s.j(eVarH);
                    eVar = new jfb.a0(dVarF, eVarH, new i90.b());
                }
                return eVar;
            case 5:
                did.d dVar2 = (did.d) this.f112658c;
                did.c cVar6 = (did.c) this.d;
                int i21 = this.f112657b;
                if (i21 != 0) {
                    if (i21 == 1) {
                        return new ojd.i(cVar6.f114989a);
                    }
                    throw new AssertionError(i21);
                }
                cli.n nVar2 = (cli.n) cVar6.f114990b.get();
                mre.c cVarB2 = dVar2.f115001p.b();
                s.j(cVarB2);
                return new ojd.g(nVar2, cVarB2, ((c21.b) dVar2.i).c());
            case 6:
                did.d dVar3 = (did.d) this.f112658c;
                vn.a aVar11 = dVar3.f114999m;
                did.h hVar2 = (did.h) this.d;
                did.d dVar4 = hVar2.f115017b;
                int i22 = this.f112657b;
                if (i22 == 0) {
                    wn.a extension = (wn.a) hVar2.f115018c.get();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    s.k(extension);
                    return extension;
                }
                if (i22 == 1) {
                    return v7.z(aVar11, "provider");
                }
                if (i22 != 2) {
                    if (i22 != 3) {
                        if (i22 != 4) {
                            throw new AssertionError(i22);
                        }
                        os2.g factory3 = aVar11.c();
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        return (sn.a) factory3.f229224b;
                    }
                    hjd.n nVar3 = new hjd.n();
                    hjd.z zVar = new hjd.z();
                    ShopsCarouselDetailsScreenContract$InputData shopsCarouselDetailsScreenContract$InputData = hVar2.f115016a;
                    l80.e eVarH2 = dVar3.f114995g.h();
                    s.j(eVarH2);
                    return new yid.s(nVar3, zVar, shopsCarouselDetailsScreenContract$InputData, eVarH2);
                }
                oid.e shopsCarouselDetailsRepository = new oid.e((AdvertisingService) dVar4.B.get(), (ne0.j) dVar4.C.get(), (ue0.c) dVar4.D.get(), 1);
                jid.v shopsLocationInteractor = dVar4.c();
                Intrinsics.checkNotNullParameter(shopsCarouselDetailsRepository, "shopsCarouselDetailsRepository");
                Intrinsics.checkNotNullParameter(shopsLocationInteractor, "shopsLocationInteractor");
                r10.d dVar5 = new r10.d();
                dVar5.f250818a = shopsCarouselDetailsRepository;
                dVar5.f250819b = shopsLocationInteractor;
                ShopsCarouselDetailsScreenContract$InputData shopsCarouselDetailsScreenContract$InputData2 = hVar2.f115016a;
                fn2.c cVarA4 = dVar3.a();
                wn.a aVar12 = (wn.a) hVar2.f115018c.get();
                h4g.g gVarB = dVar3.f114992a.b();
                jid.p pVar3 = (jid.p) dVar3.H.get();
                l80.e eVarH3 = dVar4.f114995g.h();
                s.j(eVarH3);
                return new com.revolut.feature.shops.impl.ui.carousel_details.a(dVar5, shopsCarouselDetailsScreenContract$InputData2, cVarA4, aVar12, gVarB, pVar3, new wid.c(eVarH3), (cli.n) hVar2.e.get());
            case 7:
                did.d dVar6 = (did.d) this.f112658c;
                did.i iVar = (did.i) this.d;
                int i32 = this.f112657b;
                switch (i32) {
                    case 0:
                        Object extension2 = (r60.b) iVar.e.get();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        yji.d dVar7 = (yji.d) extension2;
                        s.k(dVar7);
                        return dVar7;
                    case 1:
                        com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) iVar.f115022c.get();
                        rp0.p0 displayer = (rp0.p0) iVar.d.get();
                        j60.e dialogHostFinder = new j60.e();
                        Intrinsics.checkNotNullParameter(controller2, "controller");
                        Intrinsics.checkNotNullParameter(displayer, "displayer");
                        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
                        return new r60.d(controller2, displayer, dialogHostFinder);
                    case 2:
                        return new rp0.p0();
                    case 3:
                        fd6.a aVar13 = (fd6.a) iVar.f115024h.get();
                        va.g.t(aVar13);
                        return aVar13;
                    case 4:
                        return va.g.s(((zc6.a) dVar6.f114998l).d(), (xc6.a) iVar.f115023g.get());
                    case 5:
                        return r6.b.k((zc6.a) dVar6.f114998l, "factory");
                    case 6:
                        wn.a extension3 = (wn.a) iVar.f115025j.get();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        s.k(extension3);
                        return extension3;
                    case 7:
                        return v7.z(dVar6.f114999m, "provider");
                    case 8:
                        return va.g.u((xc6.a) iVar.f115023g.get());
                    case 9:
                        e4m.e eVar6 = iVar.f115027m;
                        did.d dVar8 = iVar.f115021b;
                        cli.n nVar4 = (cli.n) eVar6.get();
                        oid.e eVar7 = new oid.e((AdvertisingService) dVar8.B.get(), (ne0.j) dVar8.C.get(), (ue0.c) dVar8.D.get(), 4);
                        lvb.e eVar8 = (lvb.e) dVar8.o.f190070r.get();
                        s.j(eVar8);
                        r10.f fVar = new r10.f(eVar7, eVar8);
                        f4h.a aVar14 = new f4h.a(new oid.e((AdvertisingService) dVar8.B.get(), (ne0.j) dVar8.C.get(), (ue0.c) dVar8.D.get(), 3));
                        mre.c cVarB3 = dVar8.f115001p.b();
                        s.j(cVarB3);
                        pjd.a aVar15 = new pjd.a(cVarB3);
                        jid.v vVarC = dVar6.c();
                        efk.a aVar16 = dVar6.f115002q;
                        nyb.k kVarC = dVar6.f114997j.c();
                        s.j(kVarC);
                        h4g.g gVarB2 = dVar6.f114992a.b();
                        fn2.c cVarA5 = dVar6.a();
                        wn.a aVar17 = (wn.a) iVar.f115025j.get();
                        ffk.t tVarF = aVar16.f();
                        s.j(tVarF);
                        egk.e eVarE = dVar6.f115003r.e();
                        s.j(eVarE);
                        sfk.a aVarE = aVar16.e();
                        s.j(aVarE);
                        fnc.s sVar = new fnc.s(new oid.e((AdvertisingService) dVar8.B.get(), (ne0.j) dVar8.C.get(), (ue0.c) dVar8.D.get(), 0));
                        jid.d dVar9 = new jid.d(new oid.e((AdvertisingService) dVar8.B.get(), (ne0.j) dVar8.C.get(), (ue0.c) dVar8.D.get(), 2), new yk0.d());
                        wli.x xVarD = ((s41.a) dVar6.f115004s).d();
                        y21.c cVarC = ((c21.b) dVar6.i).c();
                        g1 g1Var = (g1) iVar.f115028n.get();
                        ShopsCombinedHomeScreenContract$InputData shopsCombinedHomeScreenContract$InputData = iVar.f115020a;
                        i4b.f fVarB = ((zc6.a) dVar6.f114998l).b();
                        fjd.n nVar5 = (fjd.n) dVar6.G.get();
                        jid.p pVar4 = (jid.p) dVar6.H.get();
                        l80.e eVarH4 = dVar8.f114995g.h();
                        s.j(eVarH4);
                        wid.c cVar7 = new wid.c(eVarH4);
                        s70.a aVarM = dVar6.f114995g.m();
                        s.j(aVarM);
                        return new com.revolut.feature.shops.impl.ui.home.a(nVar4, fVar, aVar14, aVar15, vVarC, kVarC, gVarB2, cVarA5, aVar17, tVarF, eVarE, aVarE, sVar, dVar9, xVarD, cVarC, g1Var, shopsCombinedHomeScreenContract$InputData, fVarB, nVar5, pVar4, cVar7, aVarM);
                    case 10:
                        ljd.b bVar12 = new ljd.b();
                        did.d dVar10 = iVar.f115021b;
                        did.d dVar11 = iVar.f115021b;
                        did.q qVar = dVar10.f114992a;
                        ite.a aVar18 = dVar10.f115000n;
                        hjd.w wVar = new hjd.w(bVar12, qVar.b());
                        hjd.z shopsBadgeMapper = new hjd.z();
                        Intrinsics.checkNotNullParameter(shopsBadgeMapper, "shopsBadgeMapper");
                        hjd.j jVar = new hjd.j();
                        hjd.e eVar9 = new hjd.e();
                        hjd.h hVar3 = new hjd.h();
                        hjd.z shopsBadgeMapper2 = new hjd.z();
                        gte.a featureToggleInteractor = aVar18.b();
                        s.j(featureToggleInteractor);
                        Intrinsics.checkNotNullParameter(shopsBadgeMapper2, "shopsBadgeMapper");
                        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                        hjd.b bVar13 = new hjd.b();
                        hjd.z zVar2 = new hjd.z();
                        gte.a aVarB4 = dVar11.f115000n.b();
                        s.j(aVarB4);
                        hjd.g gVar2 = new hjd.g(zVar2, aVarB4);
                        hjd.x xVar = new hjd.x();
                        gte.a featureToggleInteractor2 = aVar18.b();
                        s.j(featureToggleInteractor2);
                        Intrinsics.checkNotNullParameter(featureToggleInteractor2, "featureToggleInteractor");
                        hjd.b0 b0Var = new hjd.b0();
                        l80.e eVarH5 = dVar10.f114995g.h();
                        s.j(eVarH5);
                        hjd.l lVar = new hjd.l(wVar, jVar, eVar9, hVar3, bVar13, gVar2, xVar, b0Var, new hjd.q(eVarH5));
                        hjd.m mVar = new hjd.m();
                        hjd.z zVar3 = new hjd.z();
                        gte.a aVarB5 = dVar11.f115000n.b();
                        s.j(aVarB5);
                        return new fjd.i0(lVar, mVar, new hjd.g(zVar3, aVarB5), new hjd.c(), ((zc6.a) dVar6.f114998l).c());
                    case 11:
                        com.revolut.kompot.navigable.a controller3 = (com.revolut.kompot.navigable.a) iVar.f115022c.get();
                        gjd.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller3, "controller");
                        return rp0.x0.a(g1.Companion, controller3.D2());
                    case 12:
                        os2.g factory4 = dVar6.f114999m.c();
                        Intrinsics.checkNotNullParameter(factory4, "factory");
                        return (sn.a) factory4.f229224b;
                    default:
                        throw new AssertionError(i32);
                }
            case 8:
                did.j jVar2 = (did.j) this.d;
                did.d dVar12 = (did.d) this.f112658c;
                vn.a aVar19 = dVar12.f114999m;
                int i33 = this.f112657b;
                if (i33 == 0) {
                    wn.a extension4 = (wn.a) jVar2.f115031b.get();
                    Intrinsics.checkNotNullParameter(extension4, "extension");
                    s.k(extension4);
                    return extension4;
                }
                if (i33 == 1) {
                    return v7.z(aVar19, "provider");
                }
                if (i33 != 2) {
                    if (i33 == 3) {
                        hjd.z shopsBadgeMapper3 = new hjd.z();
                        Intrinsics.checkNotNullParameter(shopsBadgeMapper3, "shopsBadgeMapper");
                        return new ajd.u(new bjd.c());
                    }
                    if (i33 != 4) {
                        throw new AssertionError(i33);
                    }
                    os2.g factory5 = aVar19.c();
                    Intrinsics.checkNotNullParameter(factory5, "factory");
                    return (sn.a) factory5.f229224b;
                }
                jid.z zVarE = dVar12.e();
                did.d dVar13 = jVar2.f115030a;
                zhd.b bVar14 = (zhd.b) dVar13.I.get();
                l80.e eVarH6 = dVar13.f114995g.h();
                s.j(eVarH6);
                ks0.n nVar6 = new ks0.n(bVar14, eVarH6);
                fn2.c cVarA6 = dVar12.a();
                wn.a aVar20 = (wn.a) jVar2.f115031b.get();
                h4g.g gVarB3 = dVar12.f114992a.b();
                nyb.k kVarC2 = dVar12.f114997j.c();
                s.j(kVarC2);
                return new ajd.s(zVarE, nVar6, cVarA6, aVar20, gVarB3, kVarC2, (p) jVar2.d.get());
            case 9:
                did.k kVar = (did.k) this.d;
                did.d dVar14 = (did.d) this.f112658c;
                int i43 = this.f112657b;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new AssertionError(i43);
                    }
                    l80.e eVarH7 = dVar14.f114995g.h();
                    s.j(eVarH7);
                    return new xid.n(eVarH7);
                }
                ShopsItemsBidScreenContract$InputData shopsItemsBidScreenContract$InputData = kVar.f115033a;
                jid.p pVar5 = (jid.p) dVar14.H.get();
                l80.e eVarH8 = kVar.f115034b.f114995g.h();
                s.j(eVarH8);
                return new xid.l(shopsItemsBidScreenContract$InputData, pVar5, new wid.c(eVarH8), (cli.n) kVar.f115035c.get(), dVar14.f114992a.b());
            case 10:
                did.d dVar15 = (did.d) this.f112658c;
                ite.a aVar21 = dVar15.f115000n;
                int i59 = this.f112657b;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new AssertionError(i59);
                    }
                    gte.a aVarB6 = aVar21.b();
                    s.j(aVarB6);
                    return new ijd.h(aVarB6);
                }
                did.l lVar2 = (did.l) this.d;
                ShopsItemsDetailsScreenContract$InputData shopsItemsDetailsScreenContract$InputData = lVar2.f115036a;
                cli.n nVar7 = (cli.n) lVar2.f115037b.get();
                kye.e eVarG = dVar15.f114993b.g();
                gte.a aVarB7 = aVar21.b();
                s.j(aVarB7);
                return new com.revolut.feature.shops.impl.ui.items_details.b(shopsItemsDetailsScreenContract$InputData, nVar7, eVarG, aVarB7, dVar15.f115007x.e());
            case 11:
                did.m mVar2 = (did.m) this.d;
                did.d dVar16 = (did.d) this.f112658c;
                vn.a aVar22 = dVar16.f114999m;
                int i66 = this.f112657b;
                if (i66 == 0) {
                    wn.a extension5 = (wn.a) mVar2.f115041c.get();
                    Intrinsics.checkNotNullParameter(extension5, "extension");
                    s.k(extension5);
                    return extension5;
                }
                if (i66 == 1) {
                    return v7.z(aVar22, "provider");
                }
                if (i66 == 2) {
                    return new com.revolut.feature.shops.impl.ui.map_view.e(dVar16.d(), dVar16.f114992a.b(), dVar16.c(), (wn.a) mVar2.f115041c.get(), mVar2.f115039a, (cli.n) mVar2.e.get());
                }
                if (i66 != 3) {
                    if (i66 != 4) {
                        throw new AssertionError(i66);
                    }
                    os2.g factory6 = aVar22.c();
                    Intrinsics.checkNotNullParameter(factory6, "factory");
                    return (sn.a) factory6.f229224b;
                }
                hjd.z zVar4 = new hjd.z();
                l70.e eVar10 = mVar2.f115040b.f114995g;
                qd0.c cVar8 = new qd0.c();
                qd0.b bVarN = eVar10.n();
                s.j(bVarN);
                t70.g gVarO = eVar10.o();
                s.j(gVarO);
                return new com.revolut.feature.shops.impl.ui.map_view.f(zVar4, new ljd.g(cVar8, bVarN, gVarO), new ljd.b());
            case 12:
                int i74 = this.f112657b;
                if (i74 != 0) {
                    if (i74 == 1) {
                        return new njd.g();
                    }
                    throw new AssertionError(i74);
                }
                toa.a aVarA3 = ((did.d) this.f112658c).f115006w.a();
                s.j(aVarA3);
                return new njd.f(aVarA3, (cli.n) ((did.n) this.d).f115043a.get());
            case 13:
                did.d dVar17 = (did.d) this.f112658c;
                did.o oVar = (did.o) this.d;
                ShopsPromptScreenContract$InputData shopsPromptScreenContract$InputData = oVar.f115045a;
                int i92 = this.f112657b;
                if (i92 == 0) {
                    lzb.c extension6 = (lzb.c) oVar.f115046b.get();
                    Intrinsics.checkNotNullParameter(extension6, "extension");
                    s.k(extension6);
                    return extension6;
                }
                if (i92 == 1) {
                    jid.z factory7 = dVar17.f114997j.h();
                    Intrinsics.checkNotNullParameter(factory7, "factory");
                    Object obj2 = ((phm.a) factory7.f174462c).get();
                    Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                    lzb.c cVar9 = (lzb.c) obj2;
                    s.k(cVar9);
                    return cVar9;
                }
                if (i92 != 2) {
                    if (i92 == 3) {
                        return new ejd.m(shopsPromptScreenContract$InputData);
                    }
                    throw new AssertionError(i92);
                }
                p pVar6 = (p) oVar.d.get();
                y21.c cVarC2 = ((c21.b) dVar17.i).c();
                toa.a aVarA4 = dVar17.f115006w.a();
                s.j(aVarA4);
                mre.c cVarB4 = dVar17.f115001p.b();
                s.j(cVarB4);
                return new ejd.k(pVar6, shopsPromptScreenContract$InputData, cVarC2, aVarA4, cVarB4, (lzb.c) oVar.f115046b.get());
            case 14:
                dj5.e eVar11 = (dj5.e) this.f112658c;
                l70.e eVar12 = eVar11.f115100a;
                dj5.f fVar2 = (dj5.f) this.d;
                int i96 = this.f112657b;
                if (i96 == 0) {
                    cli.n nVar8 = (cli.n) fVar2.f115115b.get();
                    fj5.i iVar2 = new fj5.i((aj5.a) fVar2.f115114a.u.get());
                    y80.a aVarR = eVar12.r();
                    s.j(aVarR);
                    return new com.revolut.feature.crypto.qr.parser.impl.ui.scanner.a(nVar8, iVar2, aVarR, (ar2.c) fVar2.f.get());
                }
                if (i96 == 1) {
                    return new com.revolut.feature.crypto.qr.parser.impl.ui.scanner.b();
                }
                if (i96 == 2) {
                    xq2.d dVar18 = (xq2.d) fVar2.f115116c.get();
                    er2.a aVar23 = (er2.a) fVar2.d.get();
                    l80.h hVarV = eVar12.v();
                    s.j(hVarV);
                    return new ar2.c(dVar18, aVar23, hVarV, (LifecycleOwner) fVar2.e.get(), eVar11.f115101b.e(), new ar2.e());
                }
                if (i96 == 3) {
                    gj5.b.Companion.getClass();
                    return new xq2.d(xq2.e.QR_CODE);
                }
                if (i96 == 4) {
                    return new er2.a();
                }
                if (i96 != 5) {
                    throw new AssertionError(i96);
                }
                gj5.b.Companion.getClass();
                return new cv.c(cv.a.BACK);
            case 15:
                dm5.e eVar13 = (dm5.e) this.d;
                dm5.d dVar19 = (dm5.d) this.f112658c;
                ei5.d dVar20 = dVar19.f115863b;
                nl5.e eVar14 = dVar19.d;
                int i99 = this.f112657b;
                if (i99 == 0) {
                    ii5.a aVarD = dVar20.d();
                    s.j(aVarD);
                    return w40.c.j(aVarD);
                }
                if (i99 == 1) {
                    ji5.i iVarC = dVar20.c();
                    s.j(iVarC);
                    zja.a aVarA5 = ((ika.b) dVar19.f115864c).a();
                    s.j(aVarA5);
                    return new gm5.e(iVarC, aVarA5, (vh5.a) eVar13.f115867a.get());
                }
                if (i99 != 2) {
                    if (i99 == 3) {
                        return new fm5.m();
                    }
                    throw new AssertionError(i99);
                }
                gm5.b bVar15 = (gm5.b) eVar13.f115868b.get();
                jl5.a aVar24 = (jl5.a) eVar14.f217025t.get();
                s.j(aVar24);
                tl5.b bVar16 = (tl5.b) eVar14.f217023r.get();
                s.j(bVar16);
                return new fm5.l(bVar15, aVar24, bVar16, dVar19.e.a(), (cli.n) eVar13.f115869c.get());
            case 16:
                r rVar = (r) this.f112658c;
                dmc.d dVar21 = (dmc.d) this.d;
                r rVar2 = dVar21.f115931b;
                int i100 = this.f112657b;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new AssertionError(i100);
                    }
                    xmc.t tVar = new xmc.t();
                    gte.a aVarB8 = rVar2.d.b();
                    s.j(aVarB8);
                    xmc.u uVar = new xmc.u(tVar, aVarB8);
                    gte.a aVarB9 = rVar2.d.b();
                    s.j(aVarB9);
                    xmc.w wVar2 = new xmc.w(aVarB9);
                    xmc.x xVar2 = new xmc.x();
                    gte.a aVarB10 = rVar2.d.b();
                    s.j(aVarB10);
                    return new xmc.y(uVar, wVar2, xVar2, new xmc.r(aVarB10));
                }
                AgreementsScreenContract$Input agreementsScreenContract$Input = dVar21.f115930a;
                xmc.y yVar = (xmc.y) dVar21.f115932c.get();
                qmc.b roboContextProvider = rVar2.f();
                ybl.l tradingConfigInteractor = rVar2.f116028b.f();
                zmc.b eeaDocumentsProvider = new zmc.b();
                zmc.f ukDocumentsProvider = new zmc.f();
                zmc.h usDocumentsProvider = new zmc.h();
                zmc.d sgDocumentsProvider = new zmc.d();
                Intrinsics.checkNotNullParameter(roboContextProvider, "roboContextProvider");
                Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
                Intrinsics.checkNotNullParameter(eeaDocumentsProvider, "eeaDocumentsProvider");
                Intrinsics.checkNotNullParameter(ukDocumentsProvider, "ukDocumentsProvider");
                Intrinsics.checkNotNullParameter(usDocumentsProvider, "usDocumentsProvider");
                Intrinsics.checkNotNullParameter(sgDocumentsProvider, "sgDocumentsProvider");
                hd.r rVar3 = new hd.r();
                rVar3.f151364a = roboContextProvider;
                rVar3.f151365b = tradingConfigInteractor;
                rVar3.f151366c = eeaDocumentsProvider;
                rVar3.d = ukDocumentsProvider;
                rVar3.e = usDocumentsProvider;
                rVar3.f = sgDocumentsProvider;
                qmc.b bVarF = rVar.f();
                ybl.o oVarL = rVar.f116027a.l();
                s.j(oVarL);
                return new f0(agreementsScreenContract$Input, yVar, rVar3, bVarF, oVarL);
            case 17:
                dmc.i iVar3 = (dmc.i) this.d;
                OnboardingFlowContract$Input onboardingFlowContract$Input = iVar3.f115967a;
                r rVar4 = (r) this.f112658c;
                dmc.a aVar25 = rVar4.e;
                int i101 = this.f112657b;
                if (i101 != 0) {
                    if (i101 != 1) {
                        throw new AssertionError(i101);
                    }
                    i90.b uuidGenerator = new i90.b();
                    lmc.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
                    return new OnboardingFlowContract$State(uuidGenerator.a(), null, null, null, null);
                }
                OnboardingFlowContract$State onboardingFlowContract$State = (OnboardingFlowContract$State) iVar3.d.get();
                zjh.f fVarA = aVar25.a();
                emc.e eVarC = aVar25.c();
                kmc.n nVar9 = new kmc.n();
                ybl.k kVarD = rVar4.f116030g.d();
                s.j(kVarD);
                qmc.b bVarF2 = rVar4.f();
                r rVar5 = iVar3.f115968b;
                m4f.b bVar17 = new m4f.b();
                l80.e eVarH9 = rVar5.f116031h.h();
                s.j(eVarH9);
                kmc.h hVar4 = new kmc.h(onboardingFlowContract$Input, bVar17, eVarH9);
                gte.a aVarB11 = rVar4.d.b();
                s.j(aVarB11);
                return new kmc.s(onboardingFlowContract$State, onboardingFlowContract$Input, fVarA, eVarC, nVar9, kVarD, bVarF2, hVar4, aVarB11);
            case 18:
                return a();
            case 19:
                return b();
            case 20:
                return c();
            case 21:
                return d();
            case 22:
                return e();
            case 23:
                return f();
            case 24:
                return g();
            case 25:
                return h();
            case 26:
                return i();
            case 27:
                return j();
            case 28:
                return k();
            default:
                dmc.a aVar26 = ((r) this.f112658c).e;
                dmc.z zVar5 = (dmc.z) this.d;
                int i102 = this.f112657b;
                if (i102 == 0) {
                    return new lnc.f((lnc.g) zVar5.f116108c.get(), zVar5.f116107b, aVar26.c(), new onc.c((aii.o) zVar5.d.get()), new pnc.c((aii.o) zVar5.d.get()));
                }
                if (i102 == 1) {
                    return new lnc.g(new onc.b(new nnc.d(), new nnc.b()), new pnc.b(new nnc.d(), new nnc.b()), aVar26.d(), zVar5.f116107b);
                }
                throw new AssertionError(i102);
        }
    }
}
