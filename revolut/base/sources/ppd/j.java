package ppd;

import android.content.Context;
import aqd.s1;
import com.google.common.collect.ImmutableMap;
import com.revolut.chat.ChatApi$Toggles;
import com.revolut.controller_extensions.keyboardsuggestions.KeyboardSuggestionsControllerExtension;
import com.revolut.data.network.services.TopupService;
import com.revolut.feature.apm.core.code.ui.ApmCodeControllerContract$InputData;
import com.revolut.feature.apm.spin.impl.ui.deregister.SpinDeregisterPromptScreenContract$InputData;
import com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter;
import com.revolut.feature.shared.help_centre.impl.faq.screens.article.FaqArticleScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.troubleshooter.CardTroubleshooterScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.SubscriptionCancellationScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.main.HelpFlowContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.CustomPeriodSelectContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.IncomeSortersDetailsContract$InputData;
import com.revolut.feature.subaccount.impl.ui.create.screen.info.SubaccountInfoPickerScreenContract$InputData;
import com.revolut.feature.topup_screen.impl.data.network.service.BrazilPixTopUpService;
import com.revolut.feature.topup_screen.impl.data.network.service.IndiaTopUpService;
import com.revolut.feature.topup_screen.impl.data.network.service.TopUpFeesService;
import com.revolut.feature.topup_screen.impl.mcy.mcy_exchange_rate.McyExchangeRateScreenContract$InputData;
import com.revolut.feature.topup_screen.impl.screens.external_card_details.ExternalCardDetailsScreenContract$InputData;
import com.revolut.feature.topup_screen.impl.screens.topup_methods.TopupMethodsScreenContract$InputData;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.DocumentSelectionControllerContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.PlanPageScreenContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.delegates.stats.kompot.CustomisedStatsDialogProvider;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.StockDetailsFeedControllerContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview.StockDetailsOverviewControllerContract$InputData;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import ip0.pr;
import java.util.List;
import java.util.Optional;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kye.k3;
import kye.m3;
import kye.q3;
import m9d.o1;
import retrofit2.Retrofit;
import sgm.e3;
import z0h.q1;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f238440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qji.b f238441c;
    public final int d;
    public final Object e;

    public /* synthetic */ j(Object obj2, qji.b bVar, Object obj3, int i, int i2) {
        this.f238439a = i2;
        this.f238440b = obj2;
        this.f238441c = bVar;
        this.e = obj3;
        this.d = i;
    }

    private final Object a() {
        prk.e0 e0Var = (prk.e0) this.f238441c;
        prk.g0 g0Var = (prk.g0) this.f238440b;
        prk.f0 f0Var = (prk.f0) this.e;
        int i = this.d;
        switch (i) {
            case 0:
                n2d.h hVarB = g0Var.E.b();
                vc.s.j(hVarB);
                return ms1.g.h(hVarB, f0Var.f239106a, (m1d.a) f0Var.M.get());
            case 1:
                n2d.h hVarB2 = g0Var.E.b();
                vc.s.j(hVarB2);
                return ms1.g.g(hVarB2, (rp0.g1) f0Var.L.get());
            case 2:
                ViewController viewController = f0Var.f239108b;
                nwk.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(viewController, "viewController");
                return rp0.x0.a(rp0.g1.Companion, viewController.D2());
            case 3:
                return f0k.d.f(g0Var.i.a(), f0Var.f239110c, (e5d.a) f0Var.P.get());
            case 4:
                a5h.g gVarA = g0Var.i.a();
                StockDetailsOverviewControllerContract$InputData inputData = f0Var.d;
                prk.i factory = (prk.i) f0Var.O.get();
                nwk.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(factory, "factory");
                return f0k.d.c(gVarA, factory.a(inputData.f104061a));
            case 5:
                return new prk.i(this, 3);
            case 6:
                return qw7.u.q(f0Var.e, g0Var.H.a(), f0Var.f, (qdf.b) f0Var.R.get());
            case 7:
                return qw7.u.r(f0Var.e, g0Var.H.a(), vtc.p0.o(g0Var.H.a()));
            case 8:
                return h7d.d.a(f0Var.f239113g, (i7d.o) f0Var.T.get(), g0Var.f239145l.d());
            case 9:
                return h7d.f.a(g0Var.f239145l.d(), Optional.empty());
            case 10:
                return f0k.d.g(f0Var.f239114h, ((z3h.g) g0Var.f239142g).h(), (e3h.d) f0Var.V.get(), f0Var.i);
            case 11:
                StockDetailsOverviewControllerContract$InputData inputData2 = f0Var.d;
                Intrinsics.checkNotNullParameter(inputData2, "inputData");
                owk.b provider = new owk.b();
                nwk.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                String str = inputData2.f104061a;
                eel.c cVar = eel.c.ONE_DAY;
                List listK = zhm.v.k(cVar, eel.c.ONE_WEEK, eel.c.ONE_MONTH, eel.c.SIX_MONTHS, eel.c.ONE_YEAR, eel.c.FIVE_YEAR, eel.c.ALL);
                eel.c cVar2 = inputData2.f104063c;
                TradingAccountType[] elements = {TradingAccountType.Gia.f105270a, TradingAccountType.Taa.f105275a};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return new e3h.d(str, listK, cVar, kotlin.collections.d.y0(elements), true, cVar2, false, false, false, eel.d.SCROLLABLE, 960);
            case 12:
                return efk.j.d((dtl.a) f0Var.Y.get());
            case 13:
                return efk.j.q(g0Var.f239146m.a(), f0Var.f239116j, (dtl.b) f0Var.X.get());
            case 14:
                return efk.j.r(g0Var.f239146m.a());
            case 15:
                return a10.b.f((u8h.b) g0Var.d, "factory");
            case 16:
                return kxa.j.k((j60.a) f0Var.f239111d0.get());
            case 17:
                return ehe.n.s((com.revolut.kompot.navigable.a) f0Var.f239109b0.get(), (rp0.m) f0Var.c0.get());
            case 18:
                return new rp0.m();
            case 19:
                return new osk.k((osk.b) f0Var.f0.get(), f0Var.f239119m);
            case 20:
                osk.e eVar = f0Var.f239118l;
                ite.a aVar = g0Var.f239141c;
                zdl.c cVar3 = g0Var.e;
                gte.a aVarB = aVar.b();
                vc.s.j(aVarB);
                osk.s sVar = new osk.s(new osk.p(), new osk.q(), new osk.r(new qwk.b()));
                ybl.l lVarF = g0Var.v.f();
                ael.d0 d0VarK = cVar3.k();
                vc.s.j(d0VarK);
                ybl.b bVarB = cVar3.b();
                vc.s.j(bVarB);
                return new osk.n(eVar, aVarB, sVar, lVarF, d0VarK, bVarB);
            case 21:
                atk.e eVar2 = f0Var.o;
                ael.d0 d0VarK2 = g0Var.e.k();
                vc.s.j(d0VarK2);
                return new atk.l(eVar2, d0VarK2, ((z3h.g) g0Var.f239142g).l());
            case 22:
                return hy1.g.c(((z3h.g) g0Var.f239142g).i(), f0Var.f239123p, (h3h.b) f0Var.i0.get());
            case 23:
                return hy1.g.d(((z3h.g) g0Var.f239142g).i(), f0Var.f239124q);
            case 24:
                fsl.t tVarA = g0Var.f239150r.a();
                vc.s.j(tVarA);
                return fp8.c.p(tVarA, f0Var.f239125r, (fsl.i) f0Var.f239117k0.get());
            case 25:
                fsl.t tVarA2 = g0Var.f239150r.a();
                vc.s.j(tVarA2);
                return fp8.c.q(tVarA2, new owk.c());
            case 26:
                return ige.d.m(g0Var.f239151s.b(), (htl.g) f0Var.m0.get(), (htl.d) f0Var.f239121n0.get());
            case 27:
                return ige.d.n(g0Var.f239151s.b());
            case 28:
                hbh.j jVarA = g0Var.f239152t.a();
                vc.s.j(jVarA);
                return hy1.g.k(jVarA, f0Var.f239127s, (h1h.b) f0Var.p0.get());
            case 29:
                hbh.j jVarA2 = g0Var.f239152t.a();
                vc.s.j(jVarA2);
                return hy1.g.l(jVarA2);
            case 30:
                f1h.c cVarA = g0Var.u.a();
                vc.s.j(cVarA);
                return fp8.c.s(cVarA, (f1h.f) f0Var.f239126r0.get(), (f1h.b) f0Var.f239128s0.get());
            case 31:
                f1h.c cVarA2 = g0Var.u.a();
                vc.s.j(cVarA2);
                return fp8.c.t(cVarA2);
            case 32:
                return new ctk.r(f0Var.u, new ctk.c(f0Var.K.v.b()));
            case 33:
                ftk.e eVar3 = f0Var.f239132w;
                prk.g0 g0Var2 = f0Var.K;
                qrk.c cVarA3 = ((prk.a) g0Var2.f239147n).a();
                vc.s.j(cVarA3);
                ybl.b bVarB2 = g0Var2.e.b();
                vc.s.j(bVarB2);
                z0h.d dVarC = ((u8h.b) g0Var2.d).c();
                vc.s.j(dVarC);
                ybl.k kVarD = g0Var2.f239155y.d();
                vc.s.j(kVarD);
                ftk.d dVar = new ftk.d(cVarA3, bVarB2, dVarC, kVarD, g0Var2.v.f());
                gte.a aVarB2 = g0Var.f239141c.b();
                vc.s.j(aVarB2);
                return new gtk.f(eVar3, dVar, aVarB2, g0Var.f239143h.b(), (gdh.a) e0Var.f239095n.get());
            case 34:
                jtk.d dVar2 = f0Var.f239136y;
                prk.g0 g0Var3 = f0Var.K;
                zdl.c cVar4 = g0Var3.e;
                ael.d0 d0VarK3 = cVar4.k();
                vc.s.j(d0VarK3);
                ybl.b bVarB3 = cVar4.b();
                vc.s.j(bVarB3);
                yhl.b bVar = (yhl.b) g0Var3.f239153w.f297707t.get();
                vc.s.j(bVar);
                gte.a aVarB3 = g0Var3.f239141c.b();
                vc.s.j(aVarB3);
                fxk.a aVarA = g0Var3.f239154x.a();
                vc.s.j(aVarA);
                return new ktk.f(dVar2, new jtk.o(d0VarK3, bVarB3, bVar, aVarB3, aVarA), new jtk.k(new m4h.b()));
            case 35:
                kbb.c cVarA4 = g0Var.f239148p.a();
                prk.g0 g0Var4 = f0Var.K;
                return rga.l.B(cVarA4, rga.l.C(g0Var4.f239148p.a(), g0Var4.f239149q.g()));
            case 36:
                prk.g0 g0Var5 = f0Var.K;
                prk.g0 g0Var6 = f0Var.K;
                yhl.d dVarA = g0Var5.f239153w.a();
                vc.s.j(dVarA);
                ybl.b bVarB4 = g0Var5.e.b();
                vc.s.j(bVarB4);
                fkg.a aVar2 = new fkg.a(bVarB4);
                l80.e eVarH = g0Var5.f.h();
                vc.s.j(eVarH);
                h8b.k kVar = new h8b.k(aVar2, eVarH, dVarA);
                j60.a aVar3 = (j60.a) f0Var.f239111d0.get();
                j8b.a aVar4 = new j8b.a();
                jx0.a aVar5 = new jx0.a(new t1(f0Var.b()), new m8b.r(f0Var.b()), new m8b.q());
                ybl.d dVarH = g0Var6.e.h();
                vc.s.j(dVarH);
                ybl.k kVarD2 = g0Var6.f239155y.d();
                vc.s.j(kVarD2);
                l80.e eVarH2 = g0Var6.f.h();
                vc.s.j(eVarH2);
                h8b.c cVar5 = new h8b.c(aVar4, aVar5, dVarH, kVarD2, eVarH2);
                h8b.a aVar6 = new h8b.a();
                f80.a aVarX = g0Var.f.x();
                vc.s.j(aVarX);
                l70.e eVar4 = g0Var6.f;
                l80.e eVarH3 = eVar4.h();
                vc.s.j(eVarH3);
                j8b.f fVar = new j8b.f();
                l80.e eVarH4 = eVar4.h();
                vc.s.j(eVarH4);
                return new i8b.b(kVar, aVar3, cVar5, aVar6, aVarX, new j8b.h(eVarH3, fVar, new j8b.e(eVarH4), new j8b.d(), new j8b.c()));
            case 37:
                return new etk.g(f0Var.B, (dtk.b) f0Var.z0.get());
            case 38:
                mk0.a aVarA2 = f0Var.K.o.a();
                vc.s.j(aVarA2);
                ogm.i iVar = new ogm.i(new lrk.e(aVarA2, new grk.b(), new lrk.d()), new rrk.b());
                ael.h hVar = (ael.h) g0Var.e.f321569x0.get();
                vc.s.j(hVar);
                CustomisedStatsDialogProvider customisedStatsDialogProvider = new CustomisedStatsDialogProvider();
                gte.a aVarB4 = g0Var.f239141c.b();
                vc.s.j(aVarB4);
                return new etk.a(iVar, hVar, customisedStatsDialogProvider, aVarB4);
            case 39:
                return new usk.d(f0Var.C, (tsk.c) f0Var.B0.get());
            case 40:
                qrk.a aVar7 = (qrk.a) ((prk.a) f0Var.K.f239147n).A.get();
                vc.s.j(aVar7);
                return new usk.i(new tsk.t(aVar7), new tsk.a(), f0Var.D);
            case 41:
                return new ysk.h(f0Var.E, (xsk.b) f0Var.D0.get());
            case 42:
                l80.e eVarH5 = f0Var.K.f.h();
                vc.s.j(eVarH5);
                fuk.a aVar8 = new fuk.a(eVarH5, 0);
                qrk.a aVar9 = (qrk.a) ((prk.a) f0Var.K.f239147n).A.get();
                vc.s.j(aVar9);
                return new ysk.d(aVar8, new vfg.p(aVar9), f0Var.F);
            case 43:
                return qw7.u.k(((z3h.g) g0Var.f239142g).e(), f0Var.G, (q2h.b) f0Var.F0.get());
            case 44:
                return qw7.u.l(((z3h.g) g0Var.f239142g).e());
            case 45:
                gdh.a aVar10 = (gdh.a) e0Var.f239095n.get();
                ybl.b bVarB5 = g0Var.e.b();
                vc.s.j(bVarB5);
                return new itk.e(aVar10, bVarB5, g0Var.f239143h.b());
            case 46:
                rdf.a aVar11 = f0Var.e;
                qdf.b extension = (qdf.b) f0Var.R.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 47:
                return efk.j.e((dtl.b) f0Var.X.get());
            case 48:
                zsk.b bVar2 = f0Var.I;
                ybl.b bVarB6 = g0Var.e.b();
                vc.s.j(bVarB6);
                return new zsk.e(bVar2, bVarB6);
            case 49:
                StockDetailsOverviewControllerContract$InputData stockDetailsOverviewControllerContract$InputData = f0Var.d;
                prk.g0 g0Var7 = f0Var.K;
                trl.a aVar12 = g0Var7.H;
                m2h.b bVar3 = g0Var7.f239142g;
                Intrinsics.checkNotNullParameter(aVar12.a(), "factory");
                uvl.a aVar13 = new uvl.a();
                z3h.g gVar = (z3h.g) bVar3;
                e3h.f fVarN = f0k.d.n(f0Var.J, gVar.h());
                atk.a aVar14 = new atk.a();
                ctk.t tVar = new ctk.t(g0Var7.v.C());
                q1 q1Var = (q1) f0Var.L0.get();
                zsk.d dVar3 = new zsk.d();
                q4h.g gVarY = hy1.g.y(gVar.i());
                fsl.k kVar2 = (fsl.k) f0Var.M0.get();
                ftk.n nVar = new ftk.n();
                f4h.a aVar15 = new f4h.a(new htk.l(), new ytk.c());
                g2e.t tVar2 = new g2e.t(new htk.l(), new ytk.c());
                htk.l itemMapper = new htk.l();
                Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
                htk.g gVar2 = new htk.g(aVar15, tVar2, new htk.k());
                fmc.z zVar = new fmc.z(new htk.l(), new ytk.c());
                htk.l itemMapper2 = new htk.l();
                Intrinsics.checkNotNullParameter(itemMapper2, "itemMapper");
                ftk.o oVar = new ftk.o(nVar, new htk.h(gVar2, zVar, new r39.a(), new f4h.a(new htk.l(), new ytk.c())), (q1) f0Var.L0.get());
                osk.s sVar2 = new osk.s(new osk.p(), new osk.q(), new osk.r(new qwk.b()));
                ib7.j jVarB = f0Var.b();
                df0.b bVarA = g0Var7.A.a();
                vc.s.j(bVarA);
                jtk.l lVar = new jtk.l(new kgm.i(jVarB, bVarA), new m4h.d(), new m4h.b());
                dtk.a aVar16 = new dtk.a(new zvk.d(new o7.d(new x3h.a())));
                tsk.k kVar3 = new tsk.k();
                rwk.c chartEntryTitleBuilder = new rwk.c();
                Intrinsics.checkNotNullParameter(chartEntryTitleBuilder, "chartEntryTitleBuilder");
                mwk.t tVar3 = new mwk.t(aVar13, fVarN, aVar14, tVar, q1Var, dVar3, gVarY, kVar2, oVar, sVar2, lVar, aVar16, new tsk.r(new tsk.m(kVar3, new nd.p(), new om4.d0(new rwk.l(new rwk.e(), new nd.o(new rwk.d())))), new tsk.o(), new tsk.n(new ytk.c())), new xsk.m(new fuk.p0(new fuk.g0(new a61.a(new rwk.l(new rwk.e(), new nd.o(new rwk.d())), new nd.o(new rwk.d())), new fuk.a0()), new fuk.o0(new ytk.c()), new fuk.b0()), new xsk.j(), new xsk.i(new ytk.c())), gVar.c(), new itk.g());
                zdl.c cVar6 = g0Var.e;
                m2h.b bVar4 = g0Var.f239142g;
                ybl.b bVarB7 = cVar6.b();
                vc.s.j(bVarB7);
                ybl.b bVarB8 = g0Var7.e.b();
                vc.s.j(bVarB8);
                owk.a aVar17 = new owk.a(bVarB8, g0Var7.v.w());
                qdf.b bVar5 = (qdf.b) f0Var.R.get();
                e3h.a extensions = (e3h.a) f0Var.W.get();
                Intrinsics.checkNotNullParameter(extensions, "extensions");
                i4h.p0 p0Var = extensions.f122271b;
                atk.c cVar7 = (atk.c) f0Var.f239115h0.get();
                ctk.e eVar5 = (ctk.e) f0Var.u0.get();
                osk.b bVar6 = (osk.b) f0Var.f0.get();
                aah.h hVar2 = (aah.h) f0Var.f239107a0.get();
                zsk.c cVar8 = (zsk.c) f0Var.K0.get();
                h3h.b bVar7 = (h3h.b) f0Var.i0.get();
                fsl.m mVarB = g0Var.f239150r.b();
                vc.s.j(mVarB);
                return new mwk.s(stockDetailsOverviewControllerContract$InputData, tVar3, bVarB7, aVar17, bVar5, p0Var, cVar7, eVar5, bVar6, hVar2, cVar8, bVar7, mVarB, (ftk.k) f0Var.f239131v0.get(), (h1h.b) f0Var.p0.get(), (jtk.b) f0Var.f239133w0.get(), (s2h.e) f0Var.f239135x0.get(), (m1d.a) f0Var.M.get(), (h8b.h) f0Var.y0.get(), (dtk.b) f0Var.z0.get(), (tsk.c) f0Var.B0.get(), (xsk.b) f0Var.D0.get(), ((z3h.g) bVar4).b(), ((z3h.g) bVar4).l(), (itk.a) f0Var.H0.get(), (e5d.a) f0Var.P.get(), (i7d.o) f0Var.T.get());
            case 50:
                return a10.b.g((u8h.b) g0Var.d, "factory");
            case 51:
                fsl.t tVarA3 = g0Var.f239150r.a();
                vc.s.j(tVarA3);
                return fp8.c.r(tVarA3, g0Var.f239151s.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        qgk.i0 i0Var = (qgk.i0) this.f238440b;
        efk.a aVar = i0Var.f246013h;
        ite.a aVar2 = i0Var.f246011c;
        qgk.o oVar = (qgk.o) this.e;
        qgk.i0 i0Var2 = oVar.f246168a;
        int i = this.d;
        if (i == 0) {
            okk.i extension = (okk.i) oVar.f246169b.get();
            pkk.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            vc.s.k(extension);
            return extension;
        }
        if (i == 1) {
            o38.a aVarC = i0Var.H.c();
            vc.s.j(aVarC);
            return new com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.b(aVarC, i0Var.I.c(), new okk.b(i0Var2.J.a()));
        }
        if (i != 2) {
            if (i == 3) {
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.c cVar = new com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.c();
                zjk.c chargeClauseMapper = new zjk.c();
                Intrinsics.checkNotNullParameter(chargeClauseMapper, "chargeClauseMapper");
                mkk.a aVar3 = new mkk.a();
                gte.a aVarB = aVar2.b();
                vc.s.j(aVarB);
                return new com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.c(cVar, aVar3, aVarB);
            }
            if (i != 4) {
                throw new AssertionError(i);
            }
            com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) oVar.e.get();
            nkk.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(controller, "controller");
            rp0.x0 x0Var = rp0.g1.Companion;
            com.revolut.kompot.navigable.a aVar4 = controller.f98405m;
            return rp0.x0.a(x0Var, aVar4 != null ? aVar4.D2() : controller.D2());
        }
        cli.n nVar = (cli.n) oVar.d.get();
        cha.b bVarC = aVar.c();
        vc.s.j(bVarC);
        rp0.g1 g1Var = (rp0.g1) oVar.f.get();
        ffk.t tVarF = aVar.f();
        vc.s.j(tVarF);
        ite.a aVar5 = i0Var2.f246011c;
        tib.b bVar = i0Var2.f246015l;
        gte.a aVarB2 = aVar5.b();
        vc.s.j(aVarB2);
        g48.r0 r0VarC = i0Var2.I.c();
        hj8.a aVarA = i0Var2.K.a();
        vc.s.j(aVarA);
        an8.b bVarA = i0Var2.L.a();
        vc.s.j(bVarA);
        djb.n nVarA = i0Var2.f246016m.a();
        vc.s.j(nVarA);
        ijb.a aVarG = ((blb.e) bVar).g();
        vc.s.j(aVarG);
        com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.k kVar = new com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.k(aVarB2, r0VarC, aVarA, bVarA, nVarA, aVarG, new dcd.b(), i0Var2.M.a());
        okk.i iVar = (okk.i) oVar.f246169b.get();
        vjk.a aVar6 = (vjk.a) ((qgk.j) this.f238441c).f246060n.get();
        gte.a aVarB3 = aVar2.b();
        vc.s.j(aVarB3);
        return new com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b(nVar, bVarC, g1Var, tVarF, kVar, iVar, aVar6, aVarB3);
    }

    private final Object c() {
        qgk.v0 v0Var = (qgk.v0) this.f238441c;
        qgk.u0 u0Var = (qgk.u0) this.e;
        qgk.i0 i0Var = u0Var.d;
        qgk.v0 v0Var2 = u0Var.e;
        int i = this.d;
        if (i == 0) {
            return trl.f.j((t60.b) u0Var.f.get());
        }
        if (i == 1) {
            return trl.f.s(u0Var.f246266a);
        }
        if (i == 2) {
            cli.n nVar = (cli.n) u0Var.i.get();
            PlanPageScreenContract$InputData planPageScreenContract$InputData = u0Var.f246267b;
            ffk.t tVarF = ((qgk.i0) this.f238440b).f246013h.f();
            vc.s.j(tVarF);
            egk.e eVarE = i0Var.f246010b.e();
            vc.s.j(eVarE);
            return new com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.a(nVar, planPageScreenContract$InputData, tVarF, new ymk.a(eVarE), (enk.o) v0Var.e.get(), (enk.o) v0Var.e.get(), (enk.o) v0Var.e.get(), (yik.d) v0Var.f.get(), new dnk.d(), new i4b.f(((s41.a) i0Var.k).d()));
        }
        if (i != 3) {
            if (i != 4) {
                throw new AssertionError(i);
            }
            ViewController controller = u0Var.f246268c;
            bnk.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(controller, "controller");
            return new c90.c(controller.m2());
        }
        PlanPageScreenContract$InputData planPageScreenContract$InputData2 = u0Var.f246267b;
        mmk.e eVar = new mmk.e();
        dnk.g gVar = new dnk.g(v0Var2.b());
        dnk.k kVar = new dnk.k(v0Var2.b(), new dnk.i((c90.c) u0Var.f246270h.get()));
        dnk.l lVarB = v0Var2.b();
        return new ymk.b0(planPageScreenContract$InputData2, eVar, gVar, kVar, new dnk.a(new dnk.c(v0Var2.b()), new dnk.d(), lVarB), new dnk.m(new dnk.c(v0Var2.b()), new dnk.d(), v0Var2.b()), new com.revolut.retail.feature.pricing_plans.ui.impl.analytics.a((yik.d) v0Var2.f.get()), (c90.c) u0Var.f246270h.get());
    }

    private final Object d() {
        qve.n nVar = (qve.n) this.f238441c;
        qve.b bVar = (qve.b) this.e;
        qve.k kVar = (qve.k) this.f238440b;
        int i = this.d;
        switch (i) {
            case 0:
                Object extension = (j60.a) bVar.f.get();
                mye.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.d dVar = (yji.d) extension;
                vc.s.k(dVar);
                return dVar;
            case 1:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) bVar.d.get();
                rp0.m dialogDisplayer = (rp0.m) bVar.e.get();
                nVar.getClass();
                he2.b dialogHostFinder = kxa.j.o(new nji.b());
                mye.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
                Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
                return new j60.c(controller, dialogDisplayer, dialogHostFinder);
            case 2:
                mye.c.Companion.getClass();
                return new rp0.m();
            case 3:
                ite.a aVar = kVar.k;
                xmg.a aVar2 = kVar.f249613m;
                ove.t tVar = kVar.f249604b;
                gte.a aVarB = aVar.b();
                vc.s.j(aVarB);
                n8b.a aVarA = kVar.f249611j.a();
                vc.s.j(aVarA);
                e4m.e eVar = nVar.u;
                qve.k kVar2 = nVar.f249629b;
                eye.b bVar2 = (eye.b) eVar.get();
                q3 q3Var = (q3) nVar.v.get();
                e4m.e eVar2 = bVar.i;
                qve.k kVar3 = bVar.f249571b;
                cli.n nVar2 = (cli.n) eVar2.get();
                kye.n nVar3 = bVar.f249570a;
                n60.a aVar3 = (n60.a) nVar.i.get();
                gye.d dVar2 = (gye.d) bVar.f249575j.get();
                j60.a aVar4 = (j60.a) bVar.f.get();
                gye.g gVar = (gye.g) bVar.k.get();
                ote.a aVar5 = (ote.a) nVar.f249639r.get();
                ppk.f fVarA = kVar.R.a();
                pye.b bVar3 = (pye.b) bVar.f249576l.get();
                y51.a aVarA2 = tVar.a();
                vc.s.j(aVarA2);
                mb3.i iVar = kVar.Q;
                qb3.a aVar6 = new qb3.a();
                nb3.b bVarC = iVar.c();
                aah.h hVar = (aah.h) bVar.f249577m.get();
                c1f.b bVar4 = new c1f.b();
                wj0.a aVarI = ((nj0.d) kVar.f249602a).i();
                vc.s.j(aVarI);
                uye.c cVar = (uye.c) nVar.k.get();
                uye.b bVar5 = (uye.b) nVar.f249634l.get();
                u51.a aVarA3 = kVar.e.a();
                vc.s.j(aVarA3);
                je6.h hVarC = ((xf6.t) kVar2.f).c();
                vc.s.j(hVarC);
                com.revolut.feature.topup_screen.impl.flows.topup.flow.data.h hVar2 = new com.revolut.feature.topup_screen.impl.flows.topup.flow.data.h(hVarC, new oye.c(new sze.d(new sze.b())));
                vte.b bVar6 = (vte.b) tVar.l0.get();
                vc.s.j(bVar6);
                t0f.b bVar7 = (t0f.b) bVar.f249578n.get();
                wsg.n nVarB = kVar.o.b();
                uye.d dVar3 = (uye.d) nVar.f249635m.get();
                f0f.a aVar7 = (f0f.a) kVar.W.f240057a.get();
                vc.s.j(aVar7);
                nj0.a aVar8 = kVar3.f249602a;
                Retrofit retrofit = ((nj0.d) aVar8).f();
                ove.o0.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Object objCreate = retrofit.create(IndiaTopUpService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                IndiaTopUpService indiaTopUpService = (IndiaTopUpService) objCreate;
                vc.s.k(indiaTopUpService);
                TopUpFeesService topUpFeesService = (TopUpFeesService) a0.d.f((nj0.d) aVar8, "retrofit", TopUpFeesService.class, "create(...)");
                vc.s.k(topUpFeesService);
                Intrinsics.checkNotNullParameter(indiaTopUpService, "indiaTopUpService");
                Intrinsics.checkNotNullParameter(topUpFeesService, "topUpFeesService");
                r10.w wVar = new r10.w();
                wVar.f250865a = indiaTopUpService;
                wVar.f250866b = topUpFeesService;
                t1j.b bVar8 = new t1j.b(wVar);
                hg6.a aVar9 = (hg6.a) ((xf6.t) kVar.f).A0.get();
                vc.s.j(aVar9);
                Retrofit retrofit3 = ((nj0.d) kVar2.f249602a).f();
                ove.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                Object objCreate2 = retrofit3.create(BrazilPixTopUpService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                BrazilPixTopUpService brazilPixTopUpService = (BrazilPixTopUpService) objCreate2;
                vc.s.k(brazilPixTopUpService);
                ogm.i iVar2 = new ogm.i(new tb4.t(brazilPixTopUpService, new lue.d()));
                sye.c cVar2 = new sye.c();
                Retrofit retrofitI = ((c21.b) kVar2.P).i();
                vc.s.j(retrofitI);
                rve.h hVar3 = new rve.h(new o7.d(olc.c.j(retrofitI)));
                l61.a aVarB2 = aVar2.b();
                vc.s.j(aVarB2);
                uye.a aVar10 = (uye.a) nVar.f249636n.get();
                wsg.n nVarB2 = kVar3.o.b();
                gr6.m mVarB = kVar3.F.b();
                vc.s.j(mVarB);
                yve.e eVar3 = new yve.e(nVarB2, mVarB);
                ang.f fVarE = aVar2.e();
                qd0.b bVarN = kVar.v.n();
                vc.s.j(bVarN);
                return new k3(aVarB, aVarA, bVar2, q3Var, nVar2, nVar3, aVar3, dVar2, aVar4, gVar, aVar5, fVarA, bVar3, aVarA2, aVar6, bVarC, hVar, bVar4, aVarI, cVar, bVar5, aVarA3, hVar2, bVar6, bVar7, nVarB, dVar3, aVar7, bVar8, aVar9, iVar2, cVar2, hVar3, aVarB2, aVar10, eVar3, fVarE, bVarN);
            case 4:
                kye.n nVar4 = bVar.f249570a;
                qve.k kVar4 = bVar.f249571b;
                u80.o moneyPrefixFormatter = new u80.o();
                Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
                hye.b bVar9 = new hye.b();
                qb3.u uVar = new qb3.u();
                gte.a aVarB3 = kVar4.k.b();
                vc.s.j(aVarB3);
                hye.n nVar5 = new hye.n(uVar, aVarB3);
                gte.a aVarB4 = kVar4.k.b();
                vc.s.j(aVarB4);
                return new m3(nVar4, bVar9, nVar5, new oye.f(aVarB4, (lye.c) bVar.f249574h.get()), new oye.a(), new oye.g(kVar4.f249609g.a()), new lye.b());
            case 5:
                z70.a aVarF = kVar.v.f();
                vc.s.j(aVarF);
                return new lye.c(aVarF);
            case 6:
                return new gye.e();
            case 7:
                return new gye.b();
            case 8:
                zf3.a aVar11 = (zf3.a) ((yf3.c) kVar.S).f313159h.get();
                vc.s.j(aVar11);
                fk3.a aVarA4 = kVar.A.a();
                vc.s.j(aVarA4);
                return new pye.g(aVar11, aVarA4, kVar.o.b());
            case 9:
                aah.i factory = ((u8h.b) kVar.T).d();
                vc.s.j(factory);
                mye.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a();
            case 10:
                mt8.d dVarB = kVar.U.b();
                vc.s.j(dVarB);
                xoj.a aVarA5 = kVar.V.a();
                vc.s.j(aVarA5);
                return new t0f.b(dVarB, aVarA5);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        qve.f fVar = (qve.f) this.e;
        qve.k kVar = (qve.k) this.f238440b;
        ove.t tVar = kVar.f249604b;
        ite.a aVar = kVar.k;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            n8b.a aVarA = kVar.f249611j.a();
            vc.s.j(aVarA);
            ExternalCardDetailsScreenContract$InputData externalCardDetailsScreenContract$InputData = fVar.f249588a;
            n3i.b bVarA = kVar.f249609g.a();
            qxe.a aVar2 = new qxe.a();
            gte.a aVarB = aVar.b();
            vc.s.j(aVarB);
            return new x0f.b0(aVarA, externalCardDetailsScreenContract$InputData, bVarA, aVar2, aVarB);
        }
        ExternalCardDetailsScreenContract$InputData externalCardDetailsScreenContract$InputData2 = fVar.f249588a;
        cli.n nVar = (cli.n) fVar.f249589b.get();
        y51.a aVarA2 = tVar.a();
        vc.s.j(aVarA2);
        i61.b bVarA2 = kVar.f249612l.a();
        ang.f fVarE = kVar.f249613m.e();
        q06.l lVarA = kVar.f249614n.a();
        vc.s.j(lVarA);
        vte.b bVar = (vte.b) tVar.l0.get();
        vc.s.j(bVar);
        wsg.n nVarB = kVar.o.b();
        gte.a aVarB2 = aVar.b();
        vc.s.j(aVarB2);
        return new x0f.y(externalCardDetailsScreenContract$InputData2, nVar, aVarA2, bVarA2, fVarE, lVarA, bVar, nVarB, aVarB2, (ewe.b) ((qve.e) this.f238441c).d.get());
    }

    private final Object f() {
        qve.m mVar = (qve.m) this.f238441c;
        qve.k kVar = (qve.k) this.f238440b;
        qve.j jVar = (qve.j) this.e;
        McyExchangeRateScreenContract$InputData mcyExchangeRateScreenContract$InputData = jVar.f249598a;
        int i = this.d;
        if (i == 0) {
            return kxa.j.j((j60.a) jVar.e.get());
        }
        if (i == 1) {
            return v1.c.r((com.revolut.kompot.navigable.a) jVar.f249600c.get(), (rp0.m) jVar.d.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        r0f.m mVar2 = new r0f.m(mcyExchangeRateScreenContract$InputData, jVar.f249599b.u.a());
        vte.a aVarC = kVar.f249604b.c();
        vc.s.j(aVarC);
        j60.a aVar = (j60.a) jVar.e.get();
        v2k.c cVarA = kVar.u.a();
        wj0.a aVarI = ((nj0.d) kVar.f249602a).i();
        vc.s.j(aVarI);
        return new r0f.k(mVar2, mcyExchangeRateScreenContract$InputData, aVarC, aVar, cVarA, aVarI, mVar.b(), (f01.a) mVar.f.get());
    }

    private final Object g() {
        q8b.a aVar = ((qve.k) this.f238440b).f249611j;
        qve.o oVar = (qve.o) this.e;
        int i = this.d;
        if (i == 0) {
            cli.n nVar = (cli.n) oVar.f249643b.get();
            x7a.d dVar = (x7a.d) oVar.f249644c.get();
            n8b.a aVarA = aVar.a();
            vc.s.j(aVarA);
            return new com.revolut.feature.topup_screen.impl.mcy.india_topup_select_country.a(nVar, dVar, aVarA);
        }
        if (i == 1) {
            return new n0f.m();
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        n8b.b bVarB = aVar.b();
        vc.s.j(bVarB);
        qve.k kVar = oVar.f249642a;
        return new p0f.a(bVarB, new yue.b((TopupService) kVar.f0.get(), (ne0.j) kVar.g0.get()), ((qve.m) this.f238441c).b());
    }

    private final Object h() {
        qve.y yVar = (qve.y) this.e;
        qve.w wVar = (qve.w) this.f238440b;
        int i = this.d;
        switch (i) {
            case 0:
                return kxa.j.j((j60.a) yVar.e.get());
            case 1:
                return v1.c.r((com.revolut.kompot.navigable.a) yVar.f249687c.get(), (rp0.m) yVar.d.get());
            case 2:
                return new rp0.m();
            case 3:
                fd6.a aVar = (fd6.a) yVar.f249689h.get();
                va.g.t(aVar);
                return aVar;
            case 4:
                return va.g.s(((zc6.a) wVar.f249675q).d(), (xc6.a) yVar.f249688g.get());
            case 5:
                return r6.b.k((zc6.a) wVar.f249675q, "factory");
            case 6:
                return va.g.u((xc6.a) yVar.f249688g.get());
            case 7:
                cli.n nVar = (cli.n) yVar.k.get();
                TopupMethodsScreenContract$InputData topupMethodsScreenContract$InputData = yVar.f249685a;
                tze.a aVar2 = (tze.a) ((qve.x) this.f238441c).e.get();
                u51.a aVar3 = (u51.a) wVar.A.get();
                wsg.n nVarB = wVar.o.b();
                b1f.a aVar4 = new b1f.a();
                j60.a aVar5 = (j60.a) yVar.f249691l.get();
                vte.a aVarC = wVar.f.c();
                vc.s.j(aVarC);
                i4b.f fVarB = ((zc6.a) wVar.f249675q).b();
                gr6.m mVarB = wVar.f249676r.b();
                vc.s.j(mVarB);
                ecm.q qVarA = wVar.f249677s.a();
                qve.w wVar2 = yVar.f249686b;
                wsg.n nVarB2 = wVar2.o.b();
                gr6.m mVarB2 = wVar2.f249676r.b();
                vc.s.j(mVarB2);
                yve.e eVar = new yve.e(nVarB2, mVarB2);
                gte.a aVarB = wVar.e.b();
                vc.s.j(aVarB);
                return new z0f.f0(nVar, topupMethodsScreenContract$InputData, aVar2, aVar3, nVarB, aVar4, aVar5, aVarC, fVarB, mVarB, qVarA, eVar, aVarB);
            case 8:
                zjh.j jVarC = ((zc6.a) wVar.f249675q).c();
                sze.d dVar = new sze.d(new sze.b());
                uze.a aVar6 = new uze.a();
                xte.a aVar7 = (xte.a) wVar.B.get();
                gte.a aVarB2 = wVar.e.b();
                vc.s.j(aVarB2);
                return new z0f.i0(jVarC, dVar, aVar6, aVar7, aVarB2);
            case 9:
                j60.a extension = (j60.a) yVar.e.get();
                a1f.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        r6e.j jVar = (r6e.j) this.f238441c;
        r6e.o oVar = (r6e.o) this.f238440b;
        wpg.o oVar2 = (wpg.o) this.e;
        int i = this.d;
        if (i == 0) {
            return xb1.a.p((xbb.d) jVar.f251758g.get());
        }
        if (i == 1) {
            return new ccb.c0((jki.p) oVar2.f.get(), oVar2.f299301b, (ybb.d) jVar.f251759h.get(), (ccb.j) oVar2.d.get(), (w80.b) oVar2.e.get(), (acb.j) oVar2.f299303g.get(), (zbb.a) oVar2.f299304h.get());
        }
        if (i == 2) {
            return new ccb.e0(new u80.o(), (w80.b) oVar2.e.get());
        }
        if (i == 3) {
            qd0.b bVarN = oVar.o.n();
            vc.s.j(bVarN);
            return xb1.a.d(bVarN);
        }
        if (i == 4) {
            return xb1.a.q(new l4i.a(), oVar.f251784t.a());
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        fk3.a aVarA = oVar.u.a();
        vc.s.j(aVarA);
        return xb1.a.o(aVarA);
    }

    private final Object j() {
        r6e.q qVar = (r6e.q) this.e;
        r6e.o oVar = (r6e.o) this.f238440b;
        l89.b bVar = oVar.f251778m;
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                return new v7e.v(oVar.f251785w.g());
            }
            throw new AssertionError(i);
        }
        jki.p pVar = (jki.p) qVar.f251794b.get();
        SubaccountInfoPickerScreenContract$InputData subaccountInfoPickerScreenContract$InputData = qVar.f251793a;
        g6e.b bVarA = oVar.f251775h.a();
        vc.s.j(bVarA);
        wsg.n nVarB = oVar.k.b();
        r7e.c cVar = (r7e.c) ((r6e.f) this.f238441c).f.get();
        tj3.a aVarA = oVar.C.a();
        vc.s.j(aVarA);
        ang.f fVarE = oVar.f.e();
        fk3.a aVarA2 = oVar.u.a();
        vc.s.j(aVarA2);
        t99.k kVarA = ((s99.a) bVar).a();
        vc.s.j(kVarA);
        s99.i iVarB = ((s99.a) bVar).b();
        n8b.a aVarA3 = oVar.D.a();
        vc.s.j(aVarA3);
        return new v7e.u(pVar, subaccountInfoPickerScreenContract$InputData, bVarA, nVarB, cVar, aVarA, fVarE, aVarA2, kVarA, iVarB, aVarA3);
    }

    private final Object k() {
        r7d.a aVar = (r7d.a) this.e;
        int i = this.d;
        if (i == 0) {
            return new z8d.j((jki.p) aVar.f252086b.get(), ((r7d.l) this.f238440b).f252134j.a(), aVar.f252085a);
        }
        if (i == 1) {
            return new z8d.i((p9d.c) ((r7d.t) this.f238441c).e.get());
        }
        throw new AssertionError(i);
    }

    private final Object l() {
        r7d.c cVar = (r7d.c) this.e;
        r7d.t tVar = (r7d.t) this.f238441c;
        r7d.l lVar = (r7d.l) this.f238440b;
        kde.a aVar = lVar.f252129a;
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                return new b9d.l(aVar.e(), (p9d.c) tVar.e.get());
            }
            throw new AssertionError(i);
        }
        wli.x xVarA = aVar.a();
        CardTroubleshooterScreenContract$InputData cardTroubleshooterScreenContract$InputData = cVar.f252101a;
        ie.a aVarA = lVar.f252134j.a();
        hg0.p pVar = (hg0.p) aVar.f182872b.P.get();
        vc.s.j(pVar);
        return new b9d.n(xVarA, cardTroubleshooterScreenContract$InputData, aVarA, pVar, new b8d.l0(), (b8d.m0) tVar.f.get(), aVar.e(), (b9d.a) tVar.f252176g.get(), aVar.c(), new b9d.o(), (jki.p) cVar.f252102b.get());
    }

    private final Object m() {
        r7d.d dVar = (r7d.d) this.e;
        r7d.t tVar = (r7d.t) this.f238441c;
        r7d.l lVar = (r7d.l) this.f238440b;
        int i = this.d;
        if (i == 0) {
            return new a9d.u((jki.p) dVar.f252105b.get(), dVar.f252104a, lVar.c(), lVar.f252134j.a(), (p9d.n) tVar.i.get());
        }
        if (i == 1) {
            return new a9d.r(lVar.f252129a.e(), (p9d.c) tVar.e.get(), (p9d.l) tVar.f252177h.get());
        }
        throw new AssertionError(i);
    }

    private final Object n() {
        r7d.t tVar = (r7d.t) this.f238441c;
        r7d.l lVar = (r7d.l) this.f238440b;
        kde.a aVar = lVar.f252129a;
        r7d.f fVar = (r7d.f) this.e;
        int i = this.d;
        switch (i) {
            case 0:
                return kxa.j.l((j60.a) fVar.e.get());
            case 1:
                return h30.l.p((com.revolut.kompot.navigable.a) fVar.f252112c.get(), (rp0.m) fVar.d.get());
            case 2:
                return new rp0.m();
            case 3:
                Object extension = (ep6.n) fVar.f252114h.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.n nVar = (yji.n) extension;
                vc.s.k(nVar);
                return nVar;
            case 4:
                return h7d.a.i(lVar.a(), (j60.a) fVar.e.get(), (rp0.g1) fVar.f252113g.get());
            case 5:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) fVar.f252112c.get();
                c8d.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return rp0.x0.a(rp0.g1.Companion, controller.D2());
            case 6:
                jki.p pVar = (jki.p) fVar.f252115j.get();
                h30.n nVar2 = (h30.n) lVar.e;
                jpc.e eVarG = nVar2.g();
                rf3.j jVarA = nVar2.f148906b.a();
                vc.s.j(jVarA);
                kge.d dVar = new kge.d(eVarG, jVarA);
                wli.x xVarA = aVar.a();
                b8d.l0 l0Var = new b8d.l0();
                p9d.e eVar = (p9d.e) tVar.f252178j.get();
                hg0.b bVarB = aVar.b();
                ep6.n nVar3 = (ep6.n) fVar.f252114h.get();
                FaqArticleScreenContract$InputData faqArticleScreenContract$InputData = fVar.f252110a;
                hg0.d dVar2 = (hg0.d) aVar.f182872b.z.get();
                vc.s.j(dVar2);
                return new com.revolut.feature.shared.help_centre.impl.faq.screens.article.c(pVar, dVar, xVarA, l0Var, eVar, bVarB, nVar3, faqArticleScreenContract$InputData, dVar2, aVar.e());
            case 7:
                return new b8d.k0(new d8d.c(fVar.f252111b.f252129a.e(), new e8d.b()), (p9d.c) tVar.e.get(), lVar.b(), aVar.e());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object o() {
        r7d.i iVar = (r7d.i) this.e;
        r7d.t tVar = (r7d.t) this.f238441c;
        r7d.l lVar = (r7d.l) this.f238440b;
        kde.a aVar = lVar.f252129a;
        int i = this.d;
        if (i == 0) {
            return new com.revolut.feature.shared.help_centre.impl.faq.screens.list.b((jki.p) iVar.f252121b.get(), aVar.a(), new b8d.l0(), lVar.c(), aVar.c(), iVar.f252120a, new lde.c(), aVar.e(), aVar.d(), new wde.c(), new ude.a());
        }
        if (i == 1) {
            return new k8d.u((p9d.c) tVar.e.get(), new l8d.b(), (p9d.l) tVar.f252177h.get());
        }
        throw new AssertionError(i);
    }

    private final Object p() {
        r7d.k kVar = (r7d.k) this.e;
        r7d.l lVar = (r7d.l) this.f238440b;
        int i = this.d;
        if (i == 0) {
            return new u8d.g((jki.p) kVar.f252127b.get(), new e8d.a(), lVar.c(), kVar.f252126a);
        }
        if (i == 1) {
            return new u8d.m(new e8d.a(), (p9d.c) ((r7d.t) this.f238441c).e.get(), lVar.f252129a.e());
        }
        throw new AssertionError(i);
    }

    private final Object q() {
        r7d.m mVar = (r7d.m) this.f238441c;
        r7d.n nVar = (r7d.n) this.e;
        r7d.l lVar = (r7d.l) this.f238440b;
        int i = this.d;
        switch (i) {
            case 0:
                return kxa.j.l((j60.a) nVar.f.get());
            case 1:
                return h30.l.p((com.revolut.kompot.navigable.a) nVar.d.get(), (rp0.m) nVar.e.get());
            case 2:
                return new rp0.m();
            case 3:
                x8d.a extension = (x8d.a) nVar.f252146h.get();
                n9d.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 4:
                return new x8d.b(lVar.f252129a.e());
            case 5:
                mse.a extension2 = (mse.a) nVar.f252148l.get();
                n9d.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                vc.s.k(extension2);
                return extension2;
            case 6:
                y9l.a actionControllerExtension = (y9l.a) nVar.f252147j.get();
                ep6.n feedbackExtension = (ep6.n) nVar.k.get();
                rul.e factory = lVar.f252132g.a();
                lde.n sharedHelpWidgetsInteractor = lVar.f252129a.e();
                n9d.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(actionControllerExtension, "actionControllerExtension");
                Intrinsics.checkNotNullParameter(feedbackExtension, "feedbackExtension");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(sharedHelpWidgetsInteractor, "sharedHelpWidgetsInteractor");
                return rul.e.b(factory, feedbackExtension, actionControllerExtension, null, !((jte.d) sharedHelpWidgetsInteractor.f194089a).c(ChatApi$Toggles.SupportNewInbox.f50985c), 20);
            case 7:
                byc.k factory2 = ((vxc.b) lVar.f).a();
                vc.s.j(factory2);
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return factory2.a();
            case 8:
                return h7d.a.i(lVar.a(), (j60.a) nVar.f.get(), (rp0.g1) mVar.f252141h.get());
            case 9:
                y9l.a extension3 = (y9l.a) nVar.f252147j.get();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                vc.s.k(extension3);
                return extension3;
            case 10:
                Object extension4 = (ep6.n) nVar.k.get();
                Intrinsics.checkNotNullParameter(extension4, "extension");
                yji.n nVar2 = (yji.n) extension4;
                vc.s.k(nVar2);
                return nVar2;
            case 11:
                jki.p pVar = (jki.p) nVar.f252153r.get();
                kde.a aVar = lVar.f252129a;
                ua3.a aVar2 = lVar.f252134j;
                h30.a aVar3 = lVar.e;
                kde.a aVar4 = lVar.f252129a;
                lde.a aVar5 = new lde.a(aVar.f.c());
                h30.n nVar3 = (h30.n) aVar3;
                m30.g gVarA = nVar3.a();
                e40.g gVarN = nVar3.n();
                n30.n nVarK = nVar3.k();
                l80.e eVarH = lVar.f252133h.h();
                vc.s.j(eVarH);
                be7.k kVarC = lVar.i.c();
                vc.s.j(kVarC);
                s7d.e eVar = new s7d.e(gVarA, gVarN, nVarK, eVarH, kVarC, nVar3.A());
                ie.a aVarA = aVar2.a();
                md0.b bVarA = aVar4.f182873c.a();
                vc.s.j(bVarA);
                e8d.a aVar6 = new e8d.a();
                j30.c cVarT = ((h30.n) aVar3).t();
                n30.n nVarK2 = ((h30.n) aVar3).k();
                n30.x xVarB = ((h30.n) aVar3).f148906b.b();
                vc.s.j(xVarB);
                wli.x xVarA = aVar4.a();
                k18.c cVarC = lVar.c();
                wf0.u0 u0Var = (wf0.u0) aVar4.f182872b.H.get();
                vc.s.j(u0Var);
                gg0.d dVar = aVar4.f182872b;
                wf0.m0 m0Var = new wf0.m0((wf0.u0) dVar.H.get(), dVar.f143575a.a());
                mde.e eVarC = aVar4.c();
                HelpFlowContract$InputData helpFlowContract$InputData = mVar.f252137a;
                o7d.b bVar = new o7d.b((ue0.c) lVar.f252136m.get());
                yf.c cVarA = aVar4.o.a();
                mt8.d dVarB = aVar4.f182880p.b();
                vc.s.j(dVarB);
                xoj.a aVarA2 = aVar4.f182881q.a();
                vc.s.j(aVarA2);
                kge.d dVar2 = new kge.d(cVarA, dVarB, aVarA2);
                lde.j jVar = new lde.j(new fde.a(aVar4.f182878m.b()), aVar4.f182874g.e());
                lde.n nVarE = aVar4.e();
                mse.a aVar7 = (mse.a) nVar.f252148l.get();
                use.d dVarB2 = lVar.f252132g.b();
                vc.s.j(dVarB2);
                jid.z zVar = new jid.z(new yce.a(), aVar4.f182874g.e());
                x8d.a aVar8 = (x8d.a) nVar.f252146h.get();
                lde.m mVarD = aVar4.d();
                ie.a aVarA3 = aVar2.a();
                bef.b bVar2 = (bef.b) lVar.k.f199665h.get();
                vc.s.j(bVar2);
                xce.f supportRepository = aVar4.o.b();
                Intrinsics.checkNotNullParameter(supportRepository, "supportRepository");
                dcl.q qVar = new dcl.q();
                lde.n nVarE2 = aVar4.e();
                wf0.u0 u0Var2 = (wf0.u0) aVar4.f182872b.H.get();
                vc.s.j(u0Var2);
                return new m9d.g1(pVar, aVar5, eVar, aVarA, bVarA, aVar6, cVarT, nVarK2, xVarB, xVarA, cVarC, u0Var, m0Var, eVarC, helpFlowContract$InputData, bVar, dVar2, jVar, nVarE, aVar7, dVarB2, zVar, aVar8, mVarD, new l9d.e(aVarA3, bVar2, qVar, nVarE2, u0Var2));
            case 12:
                j30.c cVarT2 = ((h30.n) lVar.e).t();
                r7d.l lVar2 = nVar.f252143b;
                r7d.l lVar3 = nVar.f252143b;
                lde.n widgetsInteractor = lVar2.f252129a.e();
                Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
                m9d.a aVar9 = new m9d.a();
                p9d.l lVar4 = (p9d.l) nVar.f252151p.get();
                o9d.a aVar10 = new o9d.a(lVar3.f252129a.e(), new e8d.a());
                c90.c uiResources = (c90.c) nVar.f252152q.get();
                lde.n widgetsInteractor2 = lVar3.f252129a.e();
                Intrinsics.checkNotNullParameter(uiResources, "uiResources");
                Intrinsics.checkNotNullParameter(widgetsInteractor2, "widgetsInteractor");
                o9d.b bVar3 = new o9d.b();
                o9d.d dVar3 = new o9d.d(new lde.d(), lVar3.f252129a.e(), ((h30.n) lVar3.e).t());
                lde.n widgetsInteractor3 = lVar3.f252129a.e();
                y8d.a topLevelFaqImageProvider = new y8d.a();
                Intrinsics.checkNotNullParameter(widgetsInteractor3, "widgetsInteractor");
                Intrinsics.checkNotNullParameter(topLevelFaqImageProvider, "topLevelFaqImageProvider");
                o9d.f fVar = new o9d.f();
                lde.d sharedHelpFeatureToggleInteractor = new lde.d();
                lde.n sharedHelpWidgetsInteractor2 = lVar3.f252129a.e();
                Intrinsics.checkNotNullParameter(sharedHelpFeatureToggleInteractor, "sharedHelpFeatureToggleInteractor");
                Intrinsics.checkNotNullParameter(sharedHelpWidgetsInteractor2, "sharedHelpWidgetsInteractor");
                return new o1(cVarT2, aVar9, lVar4, aVar10, bVar3, dVar3, fVar, new o9d.e(), lVar.f252132g.d(), lVar.f252129a.e());
            case 13:
                return new p9d.m(lVar.f252129a.e());
            case 14:
                BaseScreen screen = nVar.f252142a;
                n9d.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(screen, "screen");
                return new c90.c(screen.m2());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object r() {
        r7d.l lVar = (r7d.l) this.f238440b;
        kde.a aVar = lVar.f252129a;
        gp6.a aVar2 = lVar.f252130b;
        r7d.q qVar = (r7d.q) this.e;
        int i = this.d;
        switch (i) {
            case 0:
                return kxa.j.l((j60.a) qVar.e.get());
            case 1:
                return h30.l.p((com.revolut.kompot.navigable.a) qVar.f252163c.get(), (rp0.m) qVar.d.get());
            case 2:
                return new rp0.m();
            case 3:
                Object extension = (ep6.n) qVar.f252165h.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.n nVar = (yji.n) extension;
                vc.s.k(nVar);
                return nVar;
            case 4:
                zo6.a factory = aVar2.a();
                vc.s.j(factory);
                j60.a bottomExpandableDialogControllerExtension = (j60.a) qVar.e.get();
                rp0.g1 shotDialogDisplayer = (rp0.g1) qVar.f252164g.get();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
                Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
                ep6.n nVarA = factory.a(bottomExpandableDialogControllerExtension, shotDialogDisplayer, pr.f165860a);
                vc.s.k(nVarA);
                return nVarA;
            case 5:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) qVar.f252163c.get();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return rp0.x0.a(rp0.g1.Companion, controller.D2());
            case 6:
                jki.p pVar = (jki.p) qVar.f252166j.get();
                h30.n nVar2 = (h30.n) lVar.e;
                jpc.e eVarG = nVar2.g();
                rf3.j jVarA = nVar2.f148906b.a();
                vc.s.j(jVarA);
                return new m8d.h0(pVar, new kge.d(eVarG, jVarA), aVar.a(), new b8d.l0(), aVar.b(), lVar.c(), (ep6.n) qVar.f252165h.get(), qVar.f252161a);
            case 7:
                p9d.c cVar = (p9d.c) ((r7d.t) this.f238441c).e.get();
                bp6.b bVarC = aVar2.c();
                vc.s.j(bVarC);
                o8d.b bVar = new o8d.b(new p8d.a(new nl0.f()));
                o8d.d dVar = new o8d.d(new p8d.a(new nl0.f()));
                r7d.l lVar2 = qVar.f252162b;
                bp6.b bVarC2 = lVar2.f252130b.c();
                vc.s.j(bVarC2);
                return new m8d.j0(cVar, bVarC, bVar, dVar, new o8d.f(bVarC2, lVar2.f252129a.e(), new o8d.h(new e8d.b())), new o8d.h(new e8d.b()));
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f238439a) {
            case 0:
                n nVar = (n) this.f238440b;
                j5d.b bVar = nVar.Y;
                izi.a aVar = nVar.f238484b;
                ite.a aVar2 = nVar.f238482a;
                k kVar = (k) this.e;
                n nVar2 = kVar.f238449b;
                int i = this.d;
                switch (i) {
                    case 0:
                        return f0k.d.f(bVar.a(), (e5d.d) kVar.e.get(), (e5d.a) kVar.f238451g.get());
                    case 1:
                        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) kVar.d.get();
                        vnd.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        AnalyticsDashboardController analyticsDashboardController = (AnalyticsDashboardController) controller;
                        vc.s.k(analyticsDashboardController);
                        return analyticsDashboardController;
                    case 2:
                        return f0k.d.c(bVar.a(), (e5d.e) kVar.f.get());
                    case 3:
                        rpj.a aVar3 = (rpj.a) ((dqj.r) aVar).K.get();
                        vc.s.j(aVar3);
                        rnd.j jVar = (rnd.j) ((l) this.f238441c).f238468g.get();
                        gte.a aVarB = aVar2.b();
                        vc.s.j(aVarB);
                        return new tnd.b(aVar3, jVar, aVarB, kVar.f238448a);
                    case 4:
                        cli.n nVar3 = (cli.n) kVar.k.get();
                        l lVar = kVar.f238450c;
                        rnd.j jVar2 = (rnd.j) lVar.f238468g.get();
                        rnd.j jVar3 = (rnd.j) lVar.f238468g.get();
                        usg.a aVar4 = nVar2.f;
                        bnb.a aVar5 = nVar2.f238505t;
                        tib.b bVar2 = nVar2.M;
                        r6e.a0 a0Var = nVar2.F;
                        jmd.d dVar = nVar2.f238489g;
                        anb.s sVar = nVar2.f238492j;
                        izi.a aVar6 = nVar2.f238484b;
                        ite.a aVar7 = nVar2.f238482a;
                        wsg.n nVarB = aVar4.b();
                        g6e.d dVarB = a0Var.b();
                        vc.s.j(dVarB);
                        djb.n nVarA = sVar.a();
                        vc.s.j(nVarA);
                        xnd.a0 a0Var2 = new xnd.a0(jVar3, nVarB, dVarB, nVarA, ((blb.e) bVar2).e());
                        rnb.m mVar = (rnb.m) sVar.u.get();
                        vc.s.j(mVar);
                        rnb.w wVarB = aVar5.b();
                        vc.s.j(wVarB);
                        gte.a aVarB2 = aVar7.b();
                        vc.s.j(aVarB2);
                        n78.a aVar8 = (n78.a) ((k78.b) nVar2.i0).c0.get();
                        vc.s.j(aVar8);
                        v5a.c cVarA = ((u5a.f) nVar2.j0).a();
                        xnd.f fVar = (xnd.f) nVar2.Q0.get();
                        dqj.r rVar = (dqj.r) aVar6;
                        jzi.a aVarD = rVar.d();
                        vc.s.j(aVarD);
                        eqj.f fVar2 = (eqj.f) rVar.H.get();
                        vc.s.j(fVar2);
                        xnd.d dVar2 = new xnd.d(aVarD, fVar2, (rnd.j) lVar.f238468g.get(), new gmd.b(aVar4.a(), nVar2.f238494l.c()));
                        rul.e eVarC = kVar.c();
                        wsg.n nVarB2 = aVar4.b();
                        wzi.a aVarA = ((ctj.b) nVar2.I).a();
                        vc.s.j(aVarA);
                        gte.a aVarB3 = aVar7.b();
                        vc.s.j(aVarB3);
                        whf.b bVarA = nVar2.f238490h.a();
                        vc.s.j(bVarA);
                        xnd.a1 a1Var = new xnd.a1(nVarB2, aVarA, aVarB3, bVarA);
                        tsj.g gVarE = rVar.e();
                        vc.s.j(gVarE);
                        xnd.t0 t0Var = new xnd.t0(mVar, wVarB, aVarB2, aVar8, cVarA, fVar, dVar2, eVarC, a1Var, gVarE);
                        rul.e eVarC2 = kVar.c();
                        apd.a aVar9 = new apd.a();
                        mmd.b bVar3 = (mmd.b) dVar.B0.get();
                        vc.s.j(bVar3);
                        wsg.n nVarB3 = aVar4.b();
                        zf8.o oVar = (zf8.o) nVar2.l0.k.get();
                        vc.s.j(oVar);
                        wsg.n nVarB4 = aVar4.b();
                        npk.a aVar10 = nVar2.f238510x;
                        ppk.f fVarA = aVar10.a();
                        isd.c cVar = new isd.c();
                        g6e.d dVarB2 = a0Var.b();
                        vc.s.j(dVarB2);
                        te8.v vVarD = nVar2.c0.d();
                        vc.s.j(vVarD);
                        g6e.b bVarA2 = nVar2.f238491h0.a();
                        vc.s.j(bVarA2);
                        a5h.g gVar = new a5h.g(dVarB2, vVarD, new ksd.a(bVarA2), aVar10.a(), aVar4.b());
                        mj8.b bVar4 = nVar2.f238485b0;
                        hj8.a aVarA2 = bVar4.a();
                        vc.s.j(aVarA2);
                        a5h.g gVar2 = new a5h.g(oVar, nVarB4, fVarA, cVar, gVar, aVarA2);
                        djb.n nVarA2 = sVar.a();
                        vc.s.j(nVarA2);
                        zsd.f fVar3 = new zsd.f(new dcd.b());
                        an8.b bVarA3 = nVar2.m0.a();
                        vc.s.j(bVarA3);
                        ta7.a aVar11 = nVar2.f238488e0;
                        zsd.d dVar3 = new zsd.d(nVarA2, fVar3, bVarA3, aVar11.i(), ((fob.a) nVar2.f238497n0).h());
                        jla.h hVarA = nVar2.f238487d0.a();
                        ybl.k kVarD = nVar2.N.d();
                        vc.s.j(kVarD);
                        ael.t tVarF = nVar2.f238498o0.f();
                        vc.s.j(tVarF);
                        wsg.n nVarB5 = aVar4.b();
                        hj8.a aVarA3 = bVar4.a();
                        vc.s.j(aVarA3);
                        ufm.d dVar4 = new ufm.d(gVar2, dVar3, new ssd.b(hVarA, kVarD, tVarF, nVarB5, aVarA3, nVar2.O.f(), new ssd.g(nVar2.l())));
                        lmd.a aVarF = dVar.f();
                        vc.s.j(aVarF);
                        nqj.c cVarC = rVar.c();
                        vc.s.j(cVarC);
                        l70.e eVar = nVar2.d;
                        l80.e eVarH = eVar.h();
                        vc.s.j(eVarH);
                        r10.t tVar = new r10.t(cVarC, new c8i.j0(eVarH, 1));
                        dsd.f fVarK = dVar.k();
                        hj8.a aVarA4 = bVar4.a();
                        vc.s.j(aVarA4);
                        nqj.c cVarC2 = rVar.c();
                        vc.s.j(cVarC2);
                        gte.a aVarB4 = aVar7.b();
                        vc.s.j(aVarB4);
                        apd.f fVar4 = new apd.f(bVar3, nVarB3, dVar4, aVarF, tVar, fVarK, aVarA4, cVarC2, aVarB4);
                        l80.e eVarH2 = eVar.h();
                        vc.s.j(eVarH2);
                        zq.a aVar12 = new zq.a(eVarH2, new lnd.p0());
                        cpd.h hVar = new cpd.h();
                        ke3.e eVar2 = nVar2.f238486c;
                        ge3.e eVarD = eVar2.d();
                        vc.s.j(eVarD);
                        knd.v vVarC = nVar2.c();
                        djb.n nVarA3 = sVar.a();
                        vc.s.j(nVarA3);
                        rnb.w wVarB2 = aVar5.b();
                        vc.s.j(wVarB2);
                        knd.e eVar3 = new knd.e(nVarA3, wVarB2, eVar2.a(), aVar10.a(), new j9l.a(), aVar11.i());
                        knd.y0 y0Var = new knd.y0();
                        jnd.h hVar2 = (jnd.h) lVar.f238469h.get();
                        jnd.e eVar4 = new jnd.e();
                        l80.e eVarH3 = eVar.h();
                        vc.s.j(eVarH3);
                        ugc.a aVar13 = new ugc.a(eVar4, eVarH3);
                        gte.a aVarB5 = aVar7.b();
                        vc.s.j(aVarB5);
                        cpd.g gVar3 = new cpd.g(aVar12, hVar, eVarD, vVarC, eVar3, y0Var, hVar2, aVar13, aVarB5, (CoroutineScope) kVar.f238454l.get());
                        knd.v vVarC2 = nVar2.c();
                        wsg.n nVarB6 = aVar4.b();
                        djb.p pVar = (djb.p) sVar.f6709t.get();
                        vc.s.j(pVar);
                        rnb.w wVarB3 = aVar5.b();
                        vc.s.j(wVarB3);
                        bpd.g gVar4 = new bpd.g(vVarC2, new bpd.e(nVarB6, pVar, wVarB3, aVar10.a(), new j9l.a(), eVar2.a(), (CoroutineScope) kVar.f238454l.get()), (CoroutineScope) kVar.f238454l.get());
                        j0j.a aVarH = rVar.h();
                        vc.s.j(aVarH);
                        ekg.g gVarB = nVar2.p0.b();
                        ka7.a aVar14 = nVar2.f238508w;
                        ou5.b bVar5 = new ou5.b(aVar9, fVar4, gVar3, gVar4, new apd.o(aVarH, gVarB, new fmc.z(aVar14.a()), aVar14.a()), (xnd.f) nVar2.Q0.get());
                        xnd.s sVar2 = (xnd.s) nVar2.P0.get();
                        lmd.a aVarF2 = dVar.f();
                        vc.s.j(aVarF2);
                        xnd.z zVar = new xnd.z(aVarF2);
                        xnd.j jVar4 = (xnd.j) lVar.i.get();
                        xnd.n nVarD = nVar2.d();
                        tsj.g gVarE2 = rVar.e();
                        vc.s.j(gVarE2);
                        gte.a aVarB6 = aVar7.b();
                        vc.s.j(aVarB6);
                        gte.a aVarB7 = aVar7.b();
                        vc.s.j(aVarB7);
                        y91.b bVarA4 = nVar2.f0.a();
                        j0j.a aVarH2 = rVar.h();
                        vc.s.j(aVarH2);
                        tsj.g gVarE3 = rVar.e();
                        vc.s.j(gVarE3);
                        und.e eVar5 = new und.e(jVar2, a0Var2, t0Var, eVarC2, bVar5, sVar2, zVar, jVar4, nVarD, gVarE2, aVarB6, new xnd.h0(aVarB7, bVarA4, aVarH2, gVarE3), nVar2.i.e());
                        gte.a aVarB8 = aVar2.b();
                        vc.s.j(aVarB8);
                        return new com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.b(nVar3, eVar5, aVarB8, (CoroutineScope) kVar.f238454l.get(), ((s41.a) nVar.q0).d(), kVar.f238448a, new xnd.g(), (rp0.l0) kVar.f238455m.get(), new wnd.e(), new wnd.b(), kVar.b(), (e5d.a) kVar.f238451g.get());
                    case 5:
                        mzi.b bVarF = ((dqj.r) aVar).f();
                        vc.s.j(bVarF);
                        gte.a aVarB9 = nVar2.f238482a.b();
                        vc.s.j(aVarB9);
                        thf.m mVarG = nVar2.f238490h.g();
                        vc.s.j(mVarG);
                        wnd.h hVar3 = new wnd.h(aVarB9, mVarG);
                        ImmutableMap immutableMapOf = ImmutableMap.of(zod.v.class, (wod.a) kVar.i.get(), zod.f0.class, (wod.a) kVar.f238453j.get());
                        fsd.c cVar2 = new fsd.c();
                        thf.c cVarC3 = nVar2.f238490h.c();
                        vc.s.j(cVarC3);
                        yod.f fVar5 = new yod.f(cVar2, cVarC3, nVar2.k());
                        ite.a aVar15 = nVar2.f238482a;
                        l70.e eVar6 = nVar2.d;
                        bsd.e eVar7 = new bsd.e();
                        l80.e eVarH4 = eVar6.h();
                        vc.s.j(eVarH4);
                        rrd.r rVar2 = new rrd.r();
                        gte.a aVarB10 = aVar15.b();
                        vc.s.j(aVarB10);
                        bsd.h hVar4 = new bsd.h(eVar7, eVarH4, rVar2, aVarB10);
                        l80.e eVarH5 = eVar6.h();
                        vc.s.j(eVarH5);
                        ipd.h hVar5 = new ipd.h();
                        xod.x xVar = new xod.x();
                        fsd.c totalWealthGroupMapper = new fsd.c();
                        Intrinsics.checkNotNullParameter(totalWealthGroupMapper, "totalWealthGroupMapper");
                        yod.k kVar2 = new yod.k();
                        gte.a aVarB11 = aVar15.b();
                        vc.s.j(aVarB11);
                        yod.m mVar2 = new yod.m(fVar5, hVar4, eVarH5, hVar5, xVar, kVar2, aVarB11);
                        gte.a aVarB12 = nVar2.f238482a.b();
                        vc.s.j(aVarB12);
                        xod.c0 c0Var = new xod.c0(aVarB12);
                        xod.t tVar2 = new xod.t();
                        xod.z zVar2 = new xod.z();
                        wnd.a aVar16 = new wnd.a();
                        rrd.g gVar5 = new rrd.g();
                        wnd.e eVar8 = new wnd.e();
                        wnd.d dVarB3 = kVar.b();
                        gte.a aVarB13 = aVar2.b();
                        vc.s.j(aVarB13);
                        return new snd.i0(bVarF, hVar3, immutableMapOf, mVar2, c0Var, tVar2, zVar2, aVar16, gVar5, eVar8, dVarB3, aVarB13);
                    case 6:
                        return new xod.y();
                    case 7:
                        return vnd.c.a();
                    case 8:
                        com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) kVar.d.get();
                        vnd.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller2, "controller");
                        return new rp0.l0(controller2.m2());
                    default:
                        throw new AssertionError(i);
                }
            case 1:
                l lVar2 = (l) this.f238441c;
                n nVar4 = (n) this.f238440b;
                ite.a aVar17 = nVar4.f238482a;
                jmd.d dVar5 = nVar4.f238489g;
                ke3.e eVar9 = nVar4.f238486c;
                m mVar3 = (m) this.e;
                n nVar5 = mVar3.f238473b;
                int i2 = this.d;
                if (i2 == 0) {
                    Object extension = (bub.a) mVar3.d.get();
                    aod.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    yji.n nVar6 = (yji.n) extension;
                    vc.s.k(nVar6);
                    return nVar6;
                }
                if (i2 == 1) {
                    zu8.o0 o0Var = nVar4.f238504s0.f326229b;
                    g2e.t provider = new g2e.t(o0Var);
                    aod.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(provider, "provider");
                    Object obj2 = o0Var.get();
                    Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                    return (bub.a) obj2;
                }
                if (i2 != 2) {
                    if (i2 == 3) {
                        return aod.d.a();
                    }
                    if (i2 != 4) {
                        throw new AssertionError(i2);
                    }
                    cmd.a aVarG = dVar5.g();
                    vc.s.j(aVarG);
                    gte.a aVarB14 = nVar5.f238482a.b();
                    vc.s.j(aVarB14);
                    lnd.x xVar2 = new lnd.x(aVarB14);
                    lnd.h0 h0VarI = nVar5.i();
                    lnd.d dVarA = nVar5.a();
                    lnd.f0 f0VarE = nVar5.e();
                    l80.e eVarH6 = nVar5.d.h();
                    vc.s.j(eVarH6);
                    lnd.p0 p0Var = new lnd.p0();
                    knd.o0 o0Var2 = new knd.o0();
                    lnd.z zVarB = mVar3.b();
                    gte.a aVarB15 = nVar5.f238482a.b();
                    vc.s.j(aVarB15);
                    lnd.t tVar3 = new lnd.t(h0VarI, dVarA, f0VarE, eVarH6, p0Var, o0Var2, zVarB, aVarB15);
                    mzi.b bVarF2 = ((dqj.r) nVar5.f238484b).f();
                    vc.s.j(bVarF2);
                    lnd.k0 k0Var = new lnd.k0(bVarF2);
                    lnd.t0 t0VarK = nVar4.k();
                    mzi.b bVarF3 = ((dqj.r) nVar5.f238484b).f();
                    vc.s.j(bVarF3);
                    cod.f fVarJ = mVar3.j();
                    lnd.d dVarA2 = nVar5.a();
                    lnd.p0 p0Var2 = new lnd.p0();
                    knd.o0 o0Var3 = new knd.o0();
                    cod.c cVar3 = new cod.c();
                    jnd.e eVar10 = new jnd.e();
                    l80.e eVarH7 = nVar5.d.h();
                    vc.s.j(eVarH7);
                    cod.i iVar = new cod.i(bVarF3, fVarJ, dVarA2, p0Var2, o0Var3, cVar3, eVar10, eVarH7);
                    cod.f fVarJ2 = mVar3.j();
                    lnd.o0 o0VarC = mVar3.c();
                    gte.a aVarB16 = nVar5.f238482a.b();
                    vc.s.j(aVarB16);
                    cod.b bVar6 = new cod.b(aVarB16, mVar3.c());
                    pyb.h hVar6 = new pyb.h();
                    lnd.z zVarB2 = mVar3.b();
                    wnd.a aVar18 = new wnd.a();
                    AnalyticsDetailsContract$InputData analyticsDetailsContract$InputData = mVar3.f238472a;
                    gte.a aVarB17 = aVar17.b();
                    vc.s.j(aVarB17);
                    return new znd.c1(aVarG, xVar2, tVar3, k0Var, t0VarK, iVar, fVarJ2, o0VarC, bVar6, hVar6, zVarB2, aVar18, analyticsDetailsContract$InputData, aVarB17);
                }
                l5i.q qVarB = eVar9.b();
                lmd.a aVarF3 = dVar5.f();
                vc.s.j(aVarF3);
                eqj.g gVarG = ((dqj.r) nVar4.f238484b).g();
                vc.s.j(gVarG);
                ge3.e eVarD2 = eVar9.d();
                vc.s.j(eVarD2);
                ge3.d dVarF = eVar9.f();
                vc.s.j(dVarF);
                kge.d dVarQ = lVar2.q();
                knd.v vVarC3 = nVar4.c();
                AnalyticsDetailsContract$InputData analyticsDetailsContract$InputData2 = mVar3.f238472a;
                knd.p0 p0Var3 = new knd.p0();
                djb.q qVarC = nVar5.f238486c.f182976m.c();
                vc.s.j(qVarC);
                knd.x0 x0Var = new knd.x0(p0Var3, new knd.x(new le3.x(qVarC)));
                l80.e eVarH8 = nVar4.d.h();
                vc.s.j(eVarH8);
                xnd.n nVarD2 = nVar4.d();
                hr6.l lVarL = nVar4.f238506t0.l();
                vc.s.j(lVarL);
                nhf.a aVarA5 = nVar4.f238495m.a();
                vc.s.j(aVarA5);
                CoroutineScope coroutineScope = (CoroutineScope) mVar3.f.get();
                gte.a aVarB18 = aVar17.b();
                vc.s.j(aVarB18);
                knd.y0 y0Var2 = new knd.y0();
                djb.n nVarA4 = nVar5.f238492j.a();
                vc.s.j(nVarA4);
                rnb.w wVarB4 = nVar5.f238505t.b();
                vc.s.j(wVarB4);
                knd.e eVar11 = new knd.e(nVarA4, wVarB4, nVar5.f238486c.a(), nVar5.f238510x.a(), new j9l.a(), nVar5.f238488e0.i());
                lmd.a aVarF4 = nVar5.f238489g.f();
                vc.s.j(aVarF4);
                ge3.a aVarE = nVar5.f238486c.e();
                vc.s.j(aVarE);
                l93.f fVarJ3 = nVar5.f238499p.j();
                vc.s.j(fVarJ3);
                knd.j0 j0Var = new knd.j0(aVarF4, aVarE, fVarJ3, new gmd.d(nVar5.f238494l.c(), nVar5.i.e()));
                cod.c cVar4 = new cod.c();
                bub.a aVar19 = (bub.a) mVar3.d.get();
                kgm.c cVar5 = new kgm.c(new lnd.p0(), new j9l.a());
                rnd.j jVar5 = (rnd.j) lVar2.f238468g.get();
                rnd.v0 v0VarS = mVar3.f238474c.s();
                g6e.d dVarB4 = nVar5.F.b();
                vc.s.j(dVarB4);
                return new com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b(qVarB, aVarF3, gVarG, eVarD2, dVarF, dVarQ, vVarC3, analyticsDetailsContract$InputData2, x0Var, eVarH8, nVarD2, lVarL, aVarA5, coroutineScope, aVarB18, y0Var2, eVar11, j0Var, cVar4, aVar19, cVar5, jVar5, new xnd.a(v0VarS, dVarB4, nVar5.f.b()), new gmd.d(nVar5.f238494l.c(), nVar5.i.e()), (jnd.h) lVar2.f238469h.get(), nVar4.k.a(), (cli.n) mVar3.f238475g.get());
            case 2:
                n nVar7 = (n) this.f238440b;
                y yVar = (y) this.e;
                int i3 = this.d;
                if (i3 != 0) {
                    if (i3 == 1) {
                        return new mpd.r();
                    }
                    throw new AssertionError(i3);
                }
                CustomPeriodSelectContract$InputData customPeriodSelectContract$InputData = yVar.f238577a;
                l80.e eVarH9 = nVar7.d.h();
                vc.s.j(eVarH9);
                kge.d dVarQ2 = ((l) this.f238441c).q();
                ge3.d dVarF2 = nVar7.f238486c.f();
                vc.s.j(dVarF2);
                return new com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a(customPeriodSelectContract$InputData, eVarH9, dVarQ2, dVarF2, (cli.n) yVar.f238578b.get());
            case 3:
                n nVar8 = (n) this.f238440b;
                m0 m0Var = (m0) this.e;
                n nVar9 = m0Var.f238478b;
                int i5 = this.d;
                if (i5 == 0) {
                    n60.b bVar7 = (n60.b) m0Var.d.get();
                    o5k.i.m(bVar7);
                    return bVar7;
                }
                if (i5 == 1) {
                    return o5k.i.r((com.revolut.kompot.navigable.a) m0Var.f238479c.get());
                }
                if (i5 == 2) {
                    KeyboardSuggestionsControllerExtension keyboardSuggestionsControllerExtension = (KeyboardSuggestionsControllerExtension) m0Var.f.get();
                    pl1.d.n(keyboardSuggestionsControllerExtension);
                    return keyboardSuggestionsControllerExtension;
                }
                if (i5 == 3) {
                    return pl1.d.u((com.revolut.kompot.navigable.a) m0Var.f238479c.get());
                }
                if (i5 != 4) {
                    throw new AssertionError(i5);
                }
                s1 s1Var = new s1(new cqd.f(), m0Var.b(), new cqd.b(new dcd.b()), new cqd.i(new onh.b(new j9l.a())), new cqd.g(m0Var.b()), new cqd.j());
                IncomeSortersDetailsContract$InputData incomeSortersDetailsContract$InputData = m0Var.f238477a;
                usg.a aVar20 = nVar9.f;
                jmd.d dVar6 = nVar9.f238489g;
                wsg.n nVarB7 = aVar20.b();
                xld.b bVar8 = (xld.b) dVar6.D0.get();
                vc.s.j(bVar8);
                rqd.h hVar7 = (rqd.h) dVar6.C0.get();
                vc.s.j(hVar7);
                dqd.j jVar6 = new dqd.j(bVar8, hVar7);
                ijb.a aVarG2 = ((blb.e) nVar9.M).g();
                vc.s.j(aVarG2);
                toh.d dVarA3 = nVar9.f238505t.a();
                g48.r0 r0VarC = nVar9.f238494l.c();
                g6e.d dVarB5 = nVar9.F.b();
                vc.s.j(dVarB5);
                wsg.n nVarB8 = aVar20.b();
                ybl.k kVarD2 = nVar9.N.d();
                vc.s.j(kVarD2);
                ybl.l lVarF = nVar9.O.f();
                ite.a aVar21 = nVar9.f238482a;
                gte.a aVarB19 = aVar21.b();
                vc.s.j(aVarB19);
                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.providers.a aVar22 = new com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.providers.a(kVarD2, lVarF, aVarB19);
                gte.a aVarB20 = aVar21.b();
                vc.s.j(aVarB20);
                ffk.t tVarF2 = nVar9.D.f();
                vc.s.j(tVarF2);
                mqd.o oVar2 = new mqd.o(aVarG2, dVarA3, r0VarC, dVarB5, nVarB8, aVar22, aVarB20, tVarF2);
                wzi.a aVarA6 = ((ctj.b) nVar9.I).a();
                vc.s.j(aVarA6);
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) nVar9.v).c();
                vc.s.j(aVarC);
                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.d dVar7 = new com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.d(nVarB7, jVar6, oVar2, aVarA6, new rqd.k(aVarC), nVar9.i.e());
                kqd.e eVar12 = (kqd.e) ((j0) this.f238441c).d.get();
                qd0.b languageProvider = nVar9.d.n();
                vc.s.j(languageProvider);
                bqd.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                return new com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e(s1Var, incomeSortersDetailsContract$InputData, dVar7, eVar12, v80.b.b(languageProvider, false, false, 10), new dqd.r(), new dqd.y(nVar9.P.a(), nVar9.Q.c()), new j9l.a(), ((blb.e) nVar8.M).e(), (n60.b) m0Var.d.get());
            case 4:
                n nVar10 = (n) this.f238440b;
                ke3.e eVar13 = nVar10.f238486c;
                d1 d1Var = (d1) this.e;
                n nVar11 = d1Var.f238393b;
                int i6 = this.d;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            return pod.c.a();
                        }
                        throw new AssertionError(i6);
                    }
                    rod.g gVarB2 = d1Var.b();
                    mzi.b bVarF4 = ((dqj.r) nVar11.f238484b).f();
                    vc.s.j(bVarF4);
                    rod.j jVar7 = new rod.j(gVarB2, bVarF4, new fmc.z(nVar11.f238508w.a()));
                    cmd.a aVarG3 = nVar11.f238489g.g();
                    vc.s.j(aVarG3);
                    lnd.o0 o0Var4 = new lnd.o0(aVarG3, nVar11.k(), new lnd.p0(), new jnd.k(new jnd.e()));
                    rod.g gVarB3 = d1Var.b();
                    gte.a aVarB21 = nVar11.f238482a.b();
                    vc.s.j(aVarB21);
                    lnd.x xVar3 = new lnd.x(aVarB21);
                    mzi.b bVarF5 = ((dqj.r) nVar11.f238484b).f();
                    vc.s.j(bVarF5);
                    l80.e eVarH10 = nVar11.d.h();
                    vc.s.j(eVarH10);
                    return new ood.s0(jVar7, new rod.e(o0Var4, gVarB3, xVar3, bVarF5, eVarH10), d1Var.b());
                }
                cli.n nVar12 = (cli.n) d1Var.f238394c.get();
                j0j.a aVarH3 = ((dqj.r) nVar10.f238484b).h();
                vc.s.j(aVarH3);
                j0j.a aVarH4 = ((dqj.r) nVar11.f238484b).h();
                vc.s.j(aVarH4);
                knd.v vVarC4 = nVar11.c();
                ang.f fVarE = nVar11.i.e();
                le3.a aVarA7 = nVar11.f238486c.a();
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) nVar11.v).c();
                vc.s.j(aVarC2);
                ppk.f fVarA2 = nVar11.f238510x.a();
                l80.e eVarH11 = nVar11.d.h();
                vc.s.j(eVarH11);
                fod.k kVar3 = new fod.k(aVarH4, vVarC4, fVarE, aVarA7, aVarC2, fVarA2, eVarH11);
                ood.x0 x0Var2 = (ood.x0) ((c1) this.f238441c).d.get();
                ge3.e eVarD3 = eVar13.d();
                vc.s.j(eVarD3);
                lmd.a aVarF5 = nVar10.f238489g.f();
                vc.s.j(aVarF5);
                wsg.n nVarB9 = nVar10.f.b();
                knd.p0 p0Var4 = new knd.p0();
                djb.q qVarC2 = nVar11.f238486c.f182976m.c();
                vc.s.j(qVarC2);
                knd.x0 x0Var3 = new knd.x0(p0Var4, new knd.x(new le3.x(qVarC2)));
                ge3.d dVarF3 = eVar13.f();
                vc.s.j(dVarF3);
                return new ood.q0(nVar12, aVarH3, kVar3, x0Var2, eVarD3, aVarF5, nVarB9, x0Var3, dVarF3, eVar13.b(), d1Var.f238392a, (CoroutineScope) d1Var.d.get(), new fmc.z(nVar11.f238508w.a()), nVar10.f238508w.a());
            case 5:
                prk.d0 d0Var = (prk.d0) this.e;
                prk.g0 g0Var = (prk.g0) this.f238440b;
                u8h.c cVar6 = g0Var.d;
                m18.e eVar14 = g0Var.k;
                int i21 = this.d;
                if (i21 == 0) {
                    return a10.b.f((u8h.b) cVar6, "factory");
                }
                if (i21 == 1) {
                    return a0k.b.w(eVar14.e(), d0Var.f239078b, (a18.c) d0Var.f.get());
                }
                if (i21 == 2) {
                    prl.e eVarE = eVar14.e();
                    StockDetailsFeedControllerContract$InputData inputData = d0Var.f239079c;
                    jvk.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(inputData, "inputData");
                    return a0k.b.x(eVarE, new a18.e(new FeedFilter.ByRef(inputData.f103949a)));
                }
                if (i21 != 3) {
                    if (i21 == 4) {
                        return a10.b.g((u8h.b) cVar6, "factory");
                    }
                    throw new AssertionError(i21);
                }
                prl.e factory = d0Var.d.k.e();
                a18.i.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                ivk.p pVar2 = new ivk.p(new r18.n((q18.c) factory.f239325b), new a1k.a(), (q1) d0Var.f239081h.get());
                y08.a aVar23 = (y08.a) ((prk.e0) this.f238441c).f239096p.get();
                ybl.b bVarB = g0Var.e.b();
                vc.s.j(bVarB);
                a18.c cVar7 = (a18.c) d0Var.f.get();
                q18.h hVar8 = new q18.h();
                m0k.e eVar15 = (m0k.e) g0Var.I.H.get();
                vc.s.j(eVar15);
                z0h.d dVarC = ((u8h.b) eVar14.i).c();
                vc.s.j(dVarC);
                return new com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.a(pVar2, aVar23, bVarB, cVar7, hVar8, eVar15, new onh.b(dVarC), d0Var.f239079c);
            case 6:
                return a();
            case 7:
                qc9.d dVar8 = (qc9.d) this.f238441c;
                qc9.c cVar8 = (qc9.c) this.f238440b;
                ore.b bVar9 = cVar8.o;
                qc9.e eVar16 = (qc9.e) this.e;
                int i22 = this.d;
                if (i22 != 0) {
                    if (i22 == 1) {
                        return new oc9.e0(new oc9.d0(new m99.a(), new pc9.a()), eVar16.f244636a, (oc9.m) dVar8.f244635g.get());
                    }
                    throw new AssertionError(i22);
                }
                pre.c cVarA2 = bVar9.a();
                vc.s.j(cVarA2);
                mre.c cVarB = bVar9.b();
                vc.s.j(cVarB);
                return new oc9.b0(cVarA2, cVarB, (o99.a) cVar8.f244631y.get(), eVar16.f244636a, (oc9.m) dVar8.f244635g.get(), (oc9.e0) eVar16.f244638c.get());
            case 8:
                hc2.k kVar4 = (hc2.k) this.e;
                int i32 = this.d;
                if (i32 == 0) {
                    n60.a aVar24 = (n60.a) kVar4.d.get();
                    o5k.i.l(aVar24);
                    return aVar24;
                }
                if (i32 == 1) {
                    return o5k.i.q((com.revolut.kompot.navigable.a) kVar4.f150795c.get());
                }
                if (i32 != 2) {
                    if (i32 == 3) {
                        return new jx1.k(kVar4.f150794b);
                    }
                    throw new AssertionError(i32);
                }
                ApmCodeControllerContract$InputData apmCodeControllerContract$InputData = kVar4.f150794b;
                ci2.a aVar25 = new ci2.a((vw1.b) ((qd2.h) this.f238441c).f244848b.f244841m.get(), 3);
                n60.a aVar26 = (n60.a) kVar4.d.get();
                z80.b bVarS = ((qd2.f) this.f238440b).f244838h.s();
                vc.s.j(bVarS);
                return new com.revolut.feature.apm.core.code.ui.a(apmCodeControllerContract$InputData, aVar25, aVar26, bVarS, (cli.n) kVar4.f.get());
            case 9:
                qd2.g gVar6 = (qd2.g) this.e;
                qd2.f fVar6 = (qd2.f) this.f238440b;
                int i33 = this.d;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new AssertionError(i33);
                    }
                    z80.b bVarS2 = fVar6.f244838h.s();
                    vc.s.j(bVarS2);
                    return new ud2.s(bVarS2);
                }
                SpinDeregisterPromptScreenContract$InputData spinDeregisterPromptScreenContract$InputData = gVar6.f244844a;
                vw1.b bVar10 = (vw1.b) fVar6.f244841m.get();
                xd2.f fVar7 = (xd2.f) ((qd2.h) this.f238441c).d.get();
                v02.c cVarC4 = fVar6.d.c();
                vc.s.j(cVarC4);
                return new ud2.q(spinDeregisterPromptScreenContract$InputData, bVar10, fVar7, cVarC4, (cli.n) gVar6.f244845b.get());
            case 10:
                p12.l lVar3 = ((qd2.f) this.f238440b).d;
                int i43 = this.d;
                if (i43 != 0) {
                    if (i43 == 1) {
                        return new xd2.t();
                    }
                    throw new AssertionError(i43);
                }
                xd2.f fVar8 = (xd2.f) ((qd2.h) this.f238441c).d.get();
                v02.c cVarC5 = lVar3.c();
                vc.s.j(cVarC5);
                v02.b bVarB2 = lVar3.b();
                vc.s.j(bVarB2);
                return new com.revolut.feature.apm.spin.impl.ui.settings.a(fVar8, cVarC5, bVarB2, (cli.n) ((qd2.i) this.e).f244851a.get());
            case 11:
                return b();
            case 12:
                return c();
            case 13:
                qth.g gVar7 = (qth.g) this.f238440b;
                qth.c cVar9 = (qth.c) this.e;
                int i59 = this.d;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new AssertionError(i59);
                    }
                    DocumentSelectionControllerContract$InputData documentSelectionControllerContract$InputData = cVar9.f249121a;
                    atb.b bVar11 = (atb.b) gVar7.f.f316434c.get();
                    vc.s.j(bVar11);
                    return new mth.r(documentSelectionControllerContract$InputData, bVar11, new kth.a());
                }
                cli.n nVar13 = (cli.n) cVar9.f249122b.get();
                DocumentSelectionControllerContract$InputData documentSelectionControllerContract$InputData2 = cVar9.f249121a;
                oth.a aVar27 = (oth.a) ((qth.h) this.f238441c).f.get();
                jvh.a aVarA8 = gVar7.f249134c.a();
                vc.s.j(aVarA8);
                f80.a aVarX = gVar7.f249136h.x();
                vc.s.j(aVarX);
                return new com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a(nVar13, documentSelectionControllerContract$InputData2, aVar27, aVarA8, aVarX);
            case 14:
                return d();
            case 15:
                return e();
            case 16:
                return f();
            case 17:
                return g();
            case 18:
                return h();
            case 19:
                return i();
            case 20:
                return j();
            case 21:
                return k();
            case 22:
                return l();
            case 23:
                return m();
            case 24:
                return n();
            case 25:
                return o();
            case 26:
                return p();
            case 27:
                return q();
            case 28:
                return r();
            default:
                kde.a aVar28 = ((r7d.l) this.f238440b).f252129a;
                r7d.v vVar = (r7d.v) this.e;
                r7d.l lVar4 = vVar.f252182b;
                int i66 = this.d;
                if (i66 == 0) {
                    return kxa.j.l((j60.a) vVar.e.get());
                }
                if (i66 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) vVar.f252183c.get(), (rp0.m) vVar.d.get());
                }
                if (i66 == 2) {
                    return new rp0.m();
                }
                if (i66 != 3) {
                    if (i66 == 4) {
                        return new anl.j((p9d.c) ((r7d.t) this.f238441c).e.get());
                    }
                    throw new AssertionError(i66);
                }
                jki.p pVar3 = (jki.p) vVar.f252184g.get();
                j60.a aVar29 = (j60.a) vVar.e.get();
                kde.a aVar30 = lVar4.f252129a;
                xua.a aVarA9 = aVar30.f182879n.a();
                vc.s.j(aVarA9);
                djf.c cVar10 = aVar30.f182875h;
                Context context = cVar10.f115338p;
                t70.b currenciesLocalization = cVar10.d.g();
                vc.s.j(currenciesLocalization);
                ejf.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
                e3 e3Var = new e3(new f01.c(context), currenciesLocalization);
                gte.a aVarB22 = aVar30.d.b();
                vc.s.j(aVarB22);
                d9d.c cVar11 = new d9d.c(new kgm.i(aVarA9, e3Var, aVarB22));
                wli.x xVarA = aVar28.a();
                b8d.l0 l0Var = new b8d.l0();
                SubscriptionCancellationScreenContract$InputData.RecurrentPayment recurrentPayment = vVar.f252181a;
                mde.e eVarC3 = aVar28.c();
                d9d.d dVar9 = new d9d.d();
                kde.a aVar31 = lVar4.f252129a;
                lde.m mVarD = aVar31.d();
                hg0.p pVar4 = (hg0.p) aVar31.f182872b.P.get();
                vc.s.j(pVar4);
                return new com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.c(pVar3, aVar29, cVar11, xVarA, l0Var, recurrentPayment, eVarC3, dVar9, new r10.q(mVarD, pVar4), aVar28.e());
        }
    }
}
