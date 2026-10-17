package ehe;

import a0e.y;
import android.app.Activity;
import android.content.Context;
import b9.w2;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import cie.a0;
import cie.f0;
import cie.o1;
import cie.p1;
import cie.v;
import cie.w;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.photo.ui.screen.card_photo.CardPhotoScreenContract$InputData;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.feature.apm.core.code.ui.ApmCodeControllerContract$InputData;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoWithdrawalInputData;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.EntitiesListItem;
import com.revolut.feature.backend_flow.domain.models.EntitiesSelectionItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.card_design.impl.card_design.carousel.CardDesignCarouselScreenContract$InputData;
import com.revolut.feature.passcode.PasscodeScreenContract$InputData;
import com.revolut.feature.statements.impl.ui.documents_hub.DocumentsHubScreenContract$InputData;
import com.revolut.feature.subscriptions.impl.block_card_subscription.screen.BlockSubscriptionScreenContract$InputData;
import com.revolut.feature.subscriptions.impl.block_future_payments.screen.BlockFuturePaymentsScreenContract$InputData;
import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$InputData;
import com.revolut.feature.transport.impl.ui.hub.transit.TransportHubTransitScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.TravelHotelsSearchResultsMapScreenContract$InputData;
import com.revolut.feature.wealth.analytics.ui.widgetised.allocation.WidgetisedAnalyticsAllocationScreenContract$InputData;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.WidgetisedAnalyticsDashboardContract$InputData;
import com.revolut.feature.wealth.analytics.ui.widgetised.total_value.WidgetisedAnalyticsTotalValueScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_category_budgets.SetCategoryBudgetsScreenContract$InputData;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_overall_budget.SetOverallBudgetScreenContract$InputData;
import com.revolut.retail.feature.limits.impl.ui.limits.flow.SettingsLimitsFlowContract$InputData;
import cu8.r0;
import g9g.i0;
import g9g.j0;
import g9g.o0;
import gie.b0;
import gie.z;
import i60.b;
import i9g.h0;
import ip0.v7;
import iyg.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import kl.c0;
import kl.t1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import l10.e0;
import ljl.q0;
import om4.m4;
import qgk.i3;
import qgk.k3;
import rp0.g1;
import rp0.l0;
import rp0.p0;
import sx2.v0;
import t80.e;
import ueg.b1;
import vge.z2;
import vy5.k0;
import wik.u;
import wli.x;
import xf6.q1;
import xf6.t;
import yna.c1;
import yna.e1;
import yna.h1;
import zhm.d0;
import zzd.m0;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f126090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f126091c;
    public final Object d;
    public final Object e;

    public /* synthetic */ o(Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f126089a = i2;
        this.f126090b = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f126091c = i;
    }

    private final Object a() {
        b bVar = (b) this.d;
        c cVar = (c) this.f126090b;
        q qVar = (q) this.e;
        int i = this.f126091c;
        switch (i) {
            case 0:
                return f9f.b.A(qVar.f126120a, qVar.f126122b, (com.revolut.kompot.navigable.a) qVar.i.get(), ((tc7.d) cVar.J).j());
            case 1:
                return s2l.c.j((r60.b) qVar.f126132l.get());
            case 2:
                return s2l.c.q((com.revolut.kompot.navigable.a) qVar.i.get(), (p0) qVar.k.get(), kxa.j.o(new nji.b()));
            case 3:
                return new p0();
            case 4:
                fd6.a aVar = (fd6.a) qVar.o.get();
                va.g.t(aVar);
                return aVar;
            case 5:
                return va.g.s(((zc6.a) cVar.M).d(), (xc6.a) qVar.f126134n.get());
            case 6:
                return r6.b.k((zc6.a) cVar.M, "factory");
            case 7:
                Object impl = (j60.a) qVar.f126138q.get();
                Intrinsics.checkNotNullParameter(impl, "impl");
                yji.d dVar = (yji.d) impl;
                vc.s.k(dVar);
                return dVar;
            case 8:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) qVar.i.get();
                he2.b dialogHostFinder = kxa.j.o(new nji.b());
                Intrinsics.checkNotNullParameter(controller, "controller");
                Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
                return new j60.c(controller, new rp0.m(), dialogHostFinder);
            case 9:
                return ufg.p0.z((Map) qVar.F.get());
            case 10:
                return ufg.p0.B((com.revolut.kompot.navigable.a) qVar.i.get(), n.r(), (Map) qVar.E.get());
            case 11:
                return ufg.p0.A(qVar.b());
            case 12:
                k0 provider = ((yy5.b) cVar.f125993t).d();
                Intrinsics.checkNotNullParameter(provider, "provider");
                return provider;
            case 13:
                pfe.d provider2 = ((c89.a) cVar.u).a();
                vc.s.j(provider2);
                Intrinsics.checkNotNullParameter(provider2, "provider");
                return provider2;
            case 14:
                pfe.d provider3 = ((k78.b) cVar.i).r();
                vc.s.j(provider3);
                Intrinsics.checkNotNullParameter(provider3, "provider");
                return provider3;
            case 15:
                pfe.d provider4 = ((eqe.a) cVar.f125980j).a();
                vc.s.j(provider4);
                Intrinsics.checkNotNullParameter(provider4, "provider");
                return provider4;
            case 16:
                pfe.d provider5 = ((c6e.a) cVar.f).a();
                vc.s.j(provider5);
                Intrinsics.checkNotNullParameter(provider5, "provider");
                return provider5;
            case 17:
                pfe.d provider6 = ((fob.a) cVar.k).d();
                vc.s.j(provider6);
                Intrinsics.checkNotNullParameter(provider6, "provider");
                return provider6;
            case 18:
                pfe.d provider7 = ((t15.d) cVar.f125978h).g();
                vc.s.j(provider7);
                Intrinsics.checkNotNullParameter(provider7, "provider");
                return provider7;
            case 19:
                pfe.d provider8 = ((yha.a) cVar.o).c();
                vc.s.j(provider8);
                Intrinsics.checkNotNullParameter(provider8, "provider");
                return provider8;
            case 20:
                pfe.d provider9 = ((q1) cVar.f125977g).a();
                vc.s.j(provider9);
                Intrinsics.checkNotNullParameter(provider9, "provider");
                return provider9;
            case 21:
                pfe.d provider10 = ((q38.b) cVar.f125984n).c();
                vc.s.j(provider10);
                Intrinsics.checkNotNullParameter(provider10, "provider");
                return provider10;
            case 22:
                pfe.d provider11 = ((q38.b) cVar.f125984n).a();
                vc.s.j(provider11);
                Intrinsics.checkNotNullParameter(provider11, "provider");
                return provider11;
            case 23:
                qVar.getClass();
                ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(8);
                yfe.a aVar2 = yfe.a.Crypto;
                c cVar2 = qVar.f126127g;
                yfe.d dVarA = cVar2.A.a();
                vc.s.j(dVarA);
                builderBuilderWithExpectedSize.put(aVar2, dVarA);
                builderBuilderWithExpectedSize.put(yfe.a.Invest, ((mkh.s) cVar2.B).c());
                yfe.a aVar3 = yfe.a.Credit;
                yfe.d dVarF = ((t15.d) cVar2.f125978h).f();
                vc.s.j(dVarF);
                builderBuilderWithExpectedSize.put(aVar3, dVarF);
                yfe.a aVar4 = yfe.a.Joint;
                yfe.d dVarB = ((q38.b) cVar2.f125984n).b();
                vc.s.j(dVarB);
                builderBuilderWithExpectedSize.put(aVar4, dVarB);
                yfe.a aVar5 = yfe.a.Pro;
                yfe.d dVarB2 = ((yha.a) cVar2.o).b();
                vc.s.j(dVarB2);
                builderBuilderWithExpectedSize.put(aVar5, dVarB2);
                yfe.a aVar6 = yfe.a.Youth;
                yfe.d dVarS = ((k78.b) cVar2.i).s();
                vc.s.j(dVarS);
                builderBuilderWithExpectedSize.put(aVar6, dVarS);
                yfe.a aVar7 = yfe.a.Savings;
                yfe.d dVarE = ((fob.a) cVar2.k).e();
                vc.s.j(dVarE);
                builderBuilderWithExpectedSize.put(aVar7, dVarE);
                yfe.a aVar8 = yfe.a.Linked;
                yfe.d dVarE2 = ((t) cVar2.z).e();
                vc.s.j(dVarE2);
                builderBuilderWithExpectedSize.put(aVar8, dVarE2);
                ImmutableMap immutableMapBuild = builderBuilderWithExpectedSize.build();
                oqk.l lVarB = cVar2.E.b();
                vc.s.j(lVarB);
                b bVar2 = qVar.f126128h;
                nhe.t provider12 = new nhe.t(immutableMapBuild, lVarB, (ahe.n) bVar2.f125961s.get(), (ahe.t) bVar2.v.get(), new uge.e(), cVar2.f125988q.a(), cVar2.f125998x.c(), cVar2.f125983m.e(), new nhe.g(), new c0(cVar2.P.b()));
                Intrinsics.checkNotNullParameter(provider12, "provider");
                return provider12;
            case 24:
                return xb1.a.C((j60.a) qVar.H.get());
            case 25:
                return xb1.a.e((com.revolut.kompot.navigable.a) qVar.i.get(), new j60.e());
            case 26:
                h60.d dVar2 = (h60.d) qVar.J.get();
                kk8.e eVar = (kk8.e) ((jk8.a) cVar.Q).k.get();
                vc.s.j(eVar);
                return new aah.g(dVar2, eVar);
            case 27:
                com.revolut.kompot.navigable.a aVar9 = (com.revolut.kompot.navigable.a) qVar.i.get();
                i60.b.Companion.getClass();
                return b.a.a(aVar9);
            case 28:
                wn.a extension = (wn.a) qVar.L.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 29:
                return v7.z(cVar.R, "provider");
            case 30:
                b0 extension2 = (b0) qVar.N.get();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                vc.s.k(extension2);
                return extension2;
            case 31:
                b0 extension3 = new b0(qVar.f126122b, (wn.a) qVar.L.get());
                Intrinsics.checkNotNullParameter(extension3, "extension");
                return extension3;
            case 32:
                itg.a factory = (itg.a) cVar.S.f.get();
                vc.s.j(factory);
                Intrinsics.checkNotNullParameter(factory, "factory");
                dtg.a aVar10 = factory.f168379a;
                vc.s.k(aVar10);
                return aVar10;
            case 33:
                return pge.b.a((oge.f) qVar.Q.get());
            case 34:
                return new oge.f((z2) bVar.B.get(), (zge.a) bVar.F.get());
            case 35:
                return va.g.u((xc6.a) qVar.f126134n.get());
            case 36:
                i49.b mainScreenPendingActionsBottomDelegateClickHandler = (i49.b) qVar.T.get();
                Intrinsics.checkNotNullParameter(mainScreenPendingActionsBottomDelegateClickHandler, "mainScreenPendingActionsBottomDelegateClickHandler");
                vc.s.k(mainScreenPendingActionsBottomDelegateClickHandler);
                return mainScreenPendingActionsBottomDelegateClickHandler;
            case 37:
                k49.m mainScreenPendingActionsBottomDelegateClickHandlerProvider = (k49.m) cVar.L.f202680c.get();
                vc.s.j(mainScreenPendingActionsBottomDelegateClickHandlerProvider);
                j60.a bottomDialogExtension = (j60.a) qVar.f126138q.get();
                Intrinsics.checkNotNullParameter(mainScreenPendingActionsBottomDelegateClickHandlerProvider, "mainScreenPendingActionsBottomDelegateClickHandlerProvider");
                Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
                Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
                return new k49.l(mainScreenPendingActionsBottomDelegateClickHandlerProvider.f180864a, bottomDialogExtension, mainScreenPendingActionsBottomDelegateClickHandlerProvider.f180865b);
            case 38:
                return ufg.p0.y((Map) qVar.W.get());
            case 39:
                ImmutableMap immutableMapB = qVar.b();
                Map map = (Map) qVar.F.get();
                l0 l0Var = (l0) qVar.V.get();
                gte.a aVarB = qVar.f126127g.v.b();
                vc.s.j(aVarB);
                return ufg.p0.g(immutableMapB, map, l0Var, new vhe.a(aVarB), (com.revolut.kompot.navigable.a) qVar.i.get());
            case 40:
                return ufg.p0.v((com.revolut.kompot.navigable.a) qVar.i.get());
            case 41:
                dte.b extension4 = (dte.b) qVar.Y.get();
                Intrinsics.checkNotNullParameter(extension4, "extension");
                vc.s.k(extension4);
                return extension4;
            case 42:
                ete.a factory2 = (ete.a) cVar.U.f324910h.get();
                vc.s.j(factory2);
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return factory2.a();
            case 43:
                return xb1.a.D((sb7.b) qVar.f126121a0.get());
            case 44:
                xb7.b bVarA = cVar.V.a();
                vc.s.j(bVarA);
                return xb1.a.i(bVarA, (j60.a) qVar.H.get());
            case 45:
                cc7.l extension5 = new cc7.l((j60.a) qVar.H.get(), (sb7.b) qVar.f126121a0.get());
                Intrinsics.checkNotNullParameter(extension5, "extension");
                return extension5;
            case 46:
                mkd.g view = qVar.f126124c;
                rkd.m factory3 = cVar.K.a();
                vc.s.j(factory3);
                fie.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(factory3, "factory");
                return factory3.a(view);
            case 47:
                ta9.m mVar = cVar.W;
                kmg.a aVar11 = cVar.Z;
                q89.e eVarA = mVar.a();
                vc.s.j(eVarA);
                lfa.b bVarA2 = cVar.X.a();
                w51.a aVarB2 = cVar.Y.b();
                vc.s.j(aVarB2);
                skd.i iVarC = cVar.K.c();
                eie.a aVar12 = (eie.a) bVar.G.get();
                emg.a aVarA = aVar11.a();
                vc.s.j(aVarA);
                emg.a aVarB3 = aVar11.b();
                vc.s.j(aVarB3);
                v vVarC = qVar.c();
                b bVar3 = qVar.f126128h;
                return new z(eVarA, bVarA2, aVarB2, iVarC, aVar12, aVarA, aVarB3, vVarC, new zq.a((vge.d) bVar3.D.get(), (z2) bVar3.B.get()));
            case 48:
                emg.a aVarA2 = cVar.Z.a();
                vc.s.j(aVarA2);
                emg.a aVarB4 = cVar.Z.b();
                vc.s.j(aVarB4);
                eie.a aVar13 = (eie.a) bVar.G.get();
                mkd.d dVar3 = (mkd.d) qVar.f126125d0.get();
                b bVar4 = qVar.f126128h;
                return new gie.s(aVarA2, aVarB4, aVar13, new cie.z(dVar3, (z2) bVar4.B.get(), new w(qVar.f126127g.f125967a0.b(), qVar.j()), (vge.d) bVar4.D.get()), qVar.c(), (mkd.d) qVar.f126125d0.get(), (gie.a) qVar.f0.get(), (sri.m) qVar.g0.get());
            case 49:
                u uVar = (u) cVar.c0.Q.get();
                vc.s.j(uVar);
                return new gie.e(uVar);
            case 50:
                Context context = cVar.C;
                fie.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return sri.o.c(context, null, null, 14);
            case 51:
                return new gie.i((lie.b) qVar.j0.get(), (rxl.b) qVar.l0.get());
            case 52:
                ite.a aVar14 = cVar.v;
                kmg.a aVar15 = cVar.Z;
                gte.a aVarB5 = aVar14.b();
                vc.s.j(aVarB5);
                ang.f fVarE = cVar.f125983m.e();
                vge.d dVar4 = (vge.d) bVar.D.get();
                n30.n nVarK = ((h30.n) cVar.f125973d0).k();
                v vVarC2 = qVar.c();
                skd.i iVarC2 = cVar.K.c();
                emg.a aVarA3 = aVar15.a();
                vc.s.j(aVarA3);
                emg.a aVarB6 = aVar15.b();
                vc.s.j(aVarB6);
                lie.l lVar = (lie.l) qVar.i0.get();
                qge.b bVar5 = (qge.b) cVar.f125992s0.get();
                wxl.a aVar16 = (wxl.a) cVar.f125966a.f293101g.get();
                vc.s.j(aVar16);
                return new lie.i(aVarB5, fVarE, dVar4, nVarK, vVarC2, iVarC2, aVarA3, aVarB6, lVar, bVar5, aVar16);
            case 53:
                vxl.a aVar17 = cVar.f125966a;
                l70.e eVar2 = cVar.T;
                wxl.a aVar18 = (wxl.a) aVar17.f293101g.get();
                vc.s.j(aVar18);
                l80.e eVarH = eVar2.h();
                vc.s.j(eVarH);
                b70.e eVarB = eVar2.b();
                vc.s.j(eVarB);
                return new lie.l(aVar18, eVarH, eVarB, ((h30.n) cVar.f125973d0).t());
            case 54:
                Activity activity = (Activity) qVar.f126131k0.get();
                rxl.a aVar19 = (rxl.a) cVar.f125966a.f293102h.get();
                vc.s.j(aVar19);
                return f9f.b.m(activity, aVar19);
            case 55:
                ViewController viewController = qVar.d;
                fie.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(viewController, "viewController");
                Activity activityM2 = viewController.m2();
                vc.s.k(activityM2);
                return activityM2;
            case 56:
                return new iie.b((List) qVar.f126136o0.get(), (z2) bVar.B.get());
            case 57:
                b bVar6 = qVar.f126128h;
                vge.d dVar5 = (vge.d) bVar6.D.get();
                c cVar3 = qVar.f126127g;
                jie.f fVar = new jie.f(dVar5, ((zc6.a) cVar3.M).b(), ((zc6.a) cVar3.M).c(), e4m.b.a(bVar6.v), new jhe.i());
                pfe.i iVar = (pfe.i) qVar.f126135n0.get();
                u45.h hVar = cVar.g0;
                m35.g gVar = (m35.g) hVar.E.get();
                y45.i iVarI = hVar.f277124a.i();
                vc.s.j(iVarI);
                q55.b bVar7 = new q55.b(gVar, iVarI);
                am4.a aVar20 = (am4.a) cVar.f125979h0.f176258b.get();
                vc.s.j(aVar20);
                return f9f.b.B(fVar, iVar, bVar7, aVar20);
            case 58:
                vge.d dVar6 = (vge.d) bVar.D.get();
                l61.a aVarB7 = cVar.f125983m.b();
                vc.s.j(aVarB7);
                mre.c cVarB = cVar.f125975e0.b();
                vc.s.j(cVarB);
                return new kie.g(dVar6, aVarB7, cVarB, cVar.f0.b());
            case 59:
                return j40.h.a(((h30.n) cVar.f125973d0).s());
            case 60:
                c cVar4 = qVar.f126127g;
                c cVar5 = qVar.f126127g;
                b bVar8 = qVar.f126128h;
                i49.a aVar21 = (i49.a) cVar4.L.f202679b.get();
                vc.s.j(aVar21);
                mkd.d dVar7 = (mkd.d) qVar.f126125d0.get();
                die.b bVar9 = new die.b(new wqi.a());
                cie.u uVar2 = new cie.u();
                itb.c cVarB2 = cVar4.i0.b();
                vc.s.j(cVarB2);
                cie.c0 c0VarJ = qVar.j();
                a0 a0Var = new a0(cVar4.f125969b0.a());
                cie.t tVar = new cie.t(new w(cVar5.f125967a0.b(), qVar.j()));
                gte.a aVarB8 = cVar4.v.b();
                vc.s.j(aVarB8);
                b9k.f dependencies = bVar8.f125949a;
                sge.a aVar22 = sge.b.Companion;
                aVar22.getClass();
                Intrinsics.checkNotNullParameter(dependencies, "dependencies");
                o1 o1Var = new o1(aVar21, dVar7, bVar9, uVar2, cVarB2, c0VarJ, a0Var, tVar, aVarB8, (nge.d) dependencies.f13818c);
                TabAccountsScreenContract$InputData tabAccountsScreenContract$InputData = qVar.e;
                i49.b bVar10 = (i49.b) qVar.T.get();
                ang.f fVarE2 = cVar.f125983m.e();
                z2 z2Var = (z2) bVar.B.get();
                vge.d dVar8 = (vge.d) bVar.D.get();
                oge.f fVar2 = (oge.f) qVar.Q.get();
                the.a aVar23 = (the.a) qVar.f126140r0.get();
                w8i.b bVar11 = (w8i.b) cVar.j0.d.get();
                vc.s.j(bVar11);
                x xVarD = ((s41.a) cVar.f125981k0).d();
                wif.a aVarA4 = cVar.l0.a();
                sb7.b bVar12 = (sb7.b) qVar.f126121a0.get();
                wa7.m mVarI = cVar.f125991s.i();
                za7.b bVar13 = new za7.b();
                zq.a aVar24 = new zq.a((vge.d) bVar8.D.get(), (z2) bVar8.B.get());
                mkd.d dVar9 = (mkd.d) qVar.f126125d0.get();
                fc7.h modelExtensionHolder = (fc7.h) qVar.f126130j.get();
                Intrinsics.checkNotNullParameter(modelExtensionHolder, "modelExtensionHolder");
                nsh.o oVar = modelExtensionHolder.f133655a;
                yii.c cVar6 = (yii.c) cVar.m0.f263491g.get();
                vc.s.j(cVar6);
                ntb.c cVar7 = (ntb.c) cVar.f125985n0.f229578a.get();
                vc.s.j(cVar7);
                cie.u uVar3 = new cie.u();
                wn.a aVar25 = (wn.a) qVar.L.get();
                gte.a aVarB9 = cVar.v.b();
                vc.s.j(aVarB9);
                fhe.a aVarA5 = hhe.c.a();
                sjf.e eVarD = ((bjf.a) cVar.G).d();
                vc.s.j(eVarD);
                iie.a aVar26 = (iie.a) qVar.p0.get();
                uc7.a aVar27 = (uc7.a) ((tc7.d) cVar.J).U2.get();
                vc.s.j(aVar27);
                f0 f0Var = qVar.f;
                rkd.g gVar2 = cVar5.K;
                f4h.a aVar28 = new f4h.a(new lld.p(), new mp.p((the.a) qVar.f126140r0.get(), new hie.a(), (z2) bVar8.B.get()));
                gie.j jVar = (gie.j) qVar.f126129h0.get();
                gie.t tVar2 = (gie.t) qVar.f126126e0.get();
                utk.f fVarJ = cVar.f125986o0.f136167c.j();
                j40.a aVar29 = (j40.a) qVar.q0.get();
                p1 p1Var = new p1();
                kbb.c cVarA = cVar.i0.a();
                whe.c cVar8 = (whe.c) qVar.f126142s0.get();
                r10.q qVarD = cVar.f125983m.d();
                x48.k kVarB = ((q38.b) cVar.f125984n).u.b();
                gie.a aVar30 = (gie.a) qVar.f0.get();
                hl2.a aVar31 = (hl2.a) cVar.q0.f185272q.get();
                vc.s.j(aVar31);
                uge.e eVar3 = new uge.e();
                b9k.f dependencies2 = bVar.f125949a;
                aVar22.getClass();
                Intrinsics.checkNotNullParameter(dependencies2, "dependencies");
                nge.c cVar9 = (nge.c) dependencies2.e;
                d4m.a aVarA6 = e4m.b.a(bVar.v);
                c70.a aVarZ = cVar.T.z();
                vc.s.j(aVarZ);
                return new com.revolut.feature.tab.accounts.impl.ui.tab.d(o1Var, tabAccountsScreenContract$InputData, bVar10, fVarE2, z2Var, dVar8, fVar2, aVar23, bVar11, xVarD, aVarA4, bVar12, mVarI, bVar13, aVar24, dVar9, oVar, cVar6, cVar7, uVar3, aVar25, aVarB9, aVarA5, eVarD, aVar26, aVar27, f0Var, aVar28, jVar, tVar2, fVarJ, aVar29, p1Var, cVarA, cVar8, qVarD, kVarB, aVar30, aVar31, eVar3, cVar9, aVarA6, aVarZ, (gie.f) qVar.m0.get(), (qge.b) cVar.f125992s0.get());
            case 61:
                return new the.a((Map) qVar.W.get());
            case 62:
                CoroutineScope coroutineScope = (CoroutineScope) bVar.d.get();
                com.revolut.analytics.tracking.v3.d dVarF2 = cVar.p0.f();
                vc.s.j(dVarF2);
                sjf.e eVarD2 = ((bjf.a) cVar.G).d();
                vc.s.j(eVarD2);
                return new whe.c(coroutineScope, dVarF2, eVarD2);
            case 63:
                os2.g factory4 = cVar.R.c();
                Intrinsics.checkNotNullParameter(factory4, "factory");
                return (sn.a) factory4.f229224b;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        ewg.h hVar = (ewg.h) this.f126090b;
        ewg.j jVar = (ewg.j) this.e;
        ewg.k kVar = jVar.d;
        ewg.h hVar2 = jVar.f130226c;
        int i = this.f126091c;
        if (i == 0) {
            return new aah.g(jVar.f130224a, (pyg.a) jVar.f.get());
        }
        if (i == 1) {
            return new pyg.g((v9j.a) jVar.e.get());
        }
        if (i == 2) {
            w9j.a aVarA = hVar.f130209q.a();
            vc.s.j(aVarA);
            return qw7.u.m(aVarA);
        }
        if (i != 3) {
            if (i != 4) {
                throw new AssertionError(i);
            }
            com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) jVar.f130228h.get();
            lyg.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(controller, "controller");
            return new l0(controller.m2());
        }
        WidgetisedAnalyticsDashboardContract$InputData widgetisedAnalyticsDashboardContract$InputData = jVar.f130225b;
        gte.a aVarB = hVar2.k.b();
        vc.s.j(aVarB);
        uyg.e eVar = new uyg.e(aVarB);
        myg.l lVar = new myg.l();
        myg.j jVar2 = new myg.j();
        dmc.a aVar = hVar2.f130204m;
        ite.a aVar2 = hVar2.k;
        nmc.d dVarD = aVar.d();
        gte.a aVarB2 = aVar2.b();
        vc.s.j(aVarB2);
        vxg.b bVar = new vxg.b(dVarD, aVarB2);
        gte.a aVarB3 = aVar2.b();
        vc.s.j(aVarB3);
        myg.c cVar = new myg.c(bVar, aVarB3);
        gte.a aVarB4 = aVar2.b();
        vc.s.j(aVarB4);
        myg.k kVar2 = new myg.k(aVarB4);
        bbj.c cVarA = hVar2.f130210r.a();
        vc.s.j(cVarA);
        gte.a aVarB5 = aVar2.b();
        vc.s.j(aVarB5);
        pyg.i iVar = new pyg.i(cVarA, aVarB5);
        uyg.l lVar2 = new uyg.l(hVar2.c());
        fxg.c cVar2 = new fxg.c(new exg.a(), hVar2.f130211s.g());
        gte.a aVarB6 = aVar2.b();
        vc.s.j(aVarB6);
        g0 g0Var = new g0(eVar, lVar, jVar2, cVar, kVar2, iVar, lVar2, cVar2, aVarB6);
        tyg.f fVar = new tyg.f((kwg.l) kVar.c(), hVar2.d());
        kwg.b bVarC = kVar.c();
        kwg.b bVarC2 = kVar.c();
        ybl.b bVarB = hVar2.f130205n.b();
        vc.s.j(bVarB);
        kwg.l lVar3 = (kwg.l) bVarC2;
        jpc.e eVar2 = new jpc.e(lVar3, new sxg.k(bVarB, (kwg.l) kVar.c(), hVar2.d()), hVar2.d());
        kbb.c cVarB = kVar.b();
        ybl.b bVarB2 = hVar2.f130205n.b();
        vc.s.j(bVarB2);
        kwg.l lVar4 = (kwg.l) bVarC;
        ou5.b bVar2 = new ou5.b(lVar4, eVar2, cVarB, new sxg.k(bVarB2, (kwg.l) kVar.c(), hVar2.d()), hVar2.d());
        kwg.b bVarC3 = kVar.c();
        ybl.b bVarB3 = hVar2.f130205n.b();
        vc.s.j(bVarB3);
        kwg.l lVar5 = (kwg.l) kVar.c();
        jpc.e eVar3 = new jpc.e((kwg.l) bVarC3, new sxg.k(bVarB3, lVar5, hVar2.d()), hVar2.d());
        tyg.m mVar = new tyg.m((ue0.c) hVar2.m0.get());
        ybl.b bVarB4 = hVar2.f130205n.b();
        vc.s.j(bVarB4);
        tyg.h hVar3 = new tyg.h(new xxg.m(bVarB4, (kwg.l) kVar.c(), hVar2.d(), hVar2.o.a()), hVar2.d());
        kpj.f fVar2 = new kpj.f((hwg.a) hVar.l0.get());
        kwg.b bVarC4 = kVar.c();
        xoj.a aVarA2 = hVar2.f130203l.a();
        vc.s.j(aVarA2);
        gte.a aVarB7 = hVar2.k.b();
        vc.s.j(aVarB7);
        tzg.m mVarT = hVar2.i.t();
        vc.s.j(mVarT);
        jwg.h hVar4 = new jwg.h((kwg.l) bVarC4, aVarA2, aVarB7, mVarT, hVar2.d());
        y2f.a aVarB8 = hVar2.f130212t.b();
        vc.s.j(aVarB8);
        mw5.l lVar6 = hVar2.u;
        lu5.r rVarI = lVar6.f209380m.i();
        whf.b bVarA = lVar6.f209381n.a();
        vc.s.j(bVarA);
        jxg.a aVar3 = new jxg.a(aVarB8, new jid.z(rVarI, bVarA));
        w9j.e eVarB = hVar2.f130209q.b();
        vc.s.j(eVarB);
        tyg.a aVar4 = new tyg.a(eVarB);
        tyg.j jVarD = hVar.d();
        jul.o oVarB = hVar.b();
        ybl.l lVarF = hVar.i.f();
        AnalyticsProduct analyticsProduct = ((ewg.k) this.d).f130232c;
        xwg.a aVar5 = new xwg.a();
        bwg.b bVar3 = new bwg.b();
        l0 l0Var = (l0) jVar.i.get();
        gte.a aVarB9 = hVar2.k.b();
        vc.s.j(aVarB9);
        myg.i iVar2 = new myg.i(new uyg.e(aVarB9), new uyg.l(hVar2.c()), hVar2.c());
        gte.a aVarB10 = hVar.k.b();
        vc.s.j(aVarB10);
        return new com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a(widgetisedAnalyticsDashboardContract$InputData, g0Var, fVar, bVar2, eVar3, mVar, hVar3, fVar2, hVar4, aVar3, aVar4, jVarD, oVarB, lVarF, analyticsProduct, aVar5, bVar3, l0Var, iVar2, aVarB10);
    }

    private final Object c() {
        eyd.b0 b0Var = (eyd.b0) this.f126090b;
        eyd.f fVar = (eyd.f) this.e;
        int i = this.f126091c;
        switch (i) {
            case 0:
                return iz8.c.i((i0e.f) fVar.f.get());
            case 1:
                return new i0e.m((j60.a) fVar.f130736b.get(), (i0e.g) fVar.e.get());
            case 2:
                return iz8.c.B((com.revolut.kompot.navigable.a) fVar.f130735a.get(), kxa.j.o(new nji.b()));
            case 3:
                i0e.c cVar = (i0e.c) fVar.f130737c.get();
                zxd.c cVarA = ((eyd.b) b0Var.f130699c).a();
                vc.s.j(cVarA);
                return new i0e.q(cVar, cVarA, (i0e.h) fVar.d.get(), (j60.a) fVar.f130736b.get());
            case 4:
                return new i0e.r();
            case 5:
                return new i0e.g0();
            case 6:
                return iz8.c.h((j60.a) fVar.f130736b.get());
            case 7:
                return iz8.c.j((i0e.g) fVar.e.get());
            case 8:
                wyd.o oVar = new wyd.o();
                wyd.p pVar = ((eyd.e) this.d).f130729a;
                vxd.b bVar = b0Var.f130699c;
                nj0.a aVar = b0Var.f130701h;
                zxd.c cVarA2 = ((eyd.b) bVar).a();
                vc.s.j(cVarA2);
                i0e.e eVar = (i0e.e) fVar.e.get();
                ang.f fVarE = b0Var.e.e();
                ij0.a aVar2 = ((nj0.d) aVar).f216295c;
                vxd.b bVar2 = b0Var.f130699c;
                vyd.a aVar3 = new vyd.a();
                n0e.b bVarC = ((eyd.b) bVar2).c();
                hk0.a aVarJ = ((nj0.d) aVar).j();
                o oVar2 = fVar.f130740j;
                sf0.h hVarB = b0Var.d.b();
                vc.s.j(hVarB);
                return new com.revolut.feature.statements.impl.ui.account.a(oVar, pVar, cVarA2, eVar, fVarE, aVar2, aVar3, bVarC, aVarJ, oVar2, hVarB);
            case 9:
                return new wyd.c0(b0Var.i.b(), b0Var.f.g(), b0Var.k.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        eyd.r rVar = (eyd.r) this.d;
        eyd.b0 b0Var = (eyd.b0) this.f126090b;
        vxd.b bVar = b0Var.f130699c;
        eyd.t tVar = (eyd.t) this.e;
        eyd.b0 b0Var2 = tVar.f130824a;
        int i = this.f126091c;
        if (i == 0) {
            Object impl = (a0e.d) tVar.f130827g.get();
            b0e.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(impl, "impl");
            yji.n nVar = (yji.n) impl;
            vc.s.k(nVar);
            return nVar;
        }
        if (i == 1) {
            DocumentsHubScreenContract$InputData documentsHubScreenContract$InputData = rVar.f130818a;
            kdh.b bVarB = tVar.b();
            lyd.e eVar = new lyd.e(ImmutableMap.of("PERSONAL_CURRENT", b0Var2.u, "PRO_CURRENT", b0Var2.v, "JOINT_CURRENT", b0Var2.f130711w));
            l70.e eVar2 = b0Var2.f130698b;
            qd0.b bVarN = eVar2.n();
            vc.s.j(bVarN);
            zjh.i iVar = new zjh.i(new d0e.c());
            d0e.c cVar = new d0e.c();
            h0e.b bVar2 = new h0e.b();
            l80.e eVarH = eVar2.h();
            vc.s.j(eVarH);
            return new a0e.q(documentsHubScreenContract$InputData, new w2(bVarB, eVar, bVarN, iVar, cVar, bVar2, new a0e.w(eVarH, 0), new a0e.c()), new e0e.i(), tVar.f130826c, tVar.d, new l2j.a(), new wzd.c(new e0e.i()), (l0) tVar.f.get());
        }
        if (i == 2) {
            return new lyd.f(tVar.b(), new lyd.e(ImmutableMap.of("PERSONAL_CURRENT", b0Var2.u, "PRO_CURRENT", b0Var2.v, "JOINT_CURRENT", b0Var2.f130711w)));
        }
        if (i == 3) {
            nzd.d localesProvider = new nzd.d();
            b0e.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(localesProvider, "localesProvider");
            return new nzd.c(localesProvider, true);
        }
        if (i == 4) {
            com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) tVar.e.get();
            b0e.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(controller, "controller");
            return new l0(controller.m2());
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        DocumentsHubScreenContract$InputData documentsHubScreenContract$InputData2 = rVar.f130818a;
        l70.e eVar3 = b0Var2.f130698b;
        pqi.a aVar = b0Var2.f;
        f01.c cVarG = aVar.g();
        zzd.e eVar4 = new zzd.e();
        zzd.l0 l0Var = new zzd.l0(aVar.g());
        zzd.d dVar = new zzd.d();
        d0e.a aVar2 = new d0e.a();
        qd0.b bVarN2 = eVar3.n();
        vc.s.j(bVarN2);
        zjh.j jVar = new zjh.j(bVarN2);
        qd0.b bVarN3 = eVar3.n();
        vc.s.j(bVarN3);
        h0e.g gVar = new h0e.g(bVarN3);
        sf0.h hVarB = b0Var2.d.b();
        vc.s.j(hVarB);
        a0e.t tVar2 = new a0e.t(aVar2, jVar, gVar, new zzd.c(hVarB), new zzd.b(), new y());
        zzd.b bVar3 = new zzd.b();
        y yVar = new y();
        sf0.h hVarB2 = b0Var2.d.b();
        vc.s.j(hVarB2);
        zzd.c cVar2 = new zzd.c(hVarB2);
        eyd.r rVar2 = tVar.f130825b;
        zzd.a aVar3 = new zzd.a(rVar2.f130818a);
        gte.a aVarB = b0Var2.f130697a.b();
        vc.s.j(aVarB);
        zzd.k0 k0Var = new zzd.k0(cVarG, eVar4, l0Var, dVar, tVar2, bVar3, yVar, cVar2, aVar3, aVarB, rVar2.f130818a);
        eyd.b bVar4 = (eyd.b) bVar;
        jyd.b bVar5 = new jyd.b((nyd.a) bVar4.f130694w.get(), bVar4.d.e());
        ang.f fVarE = b0Var.e.e();
        m0 m0Var = new m0();
        x xVarD = ((s41.a) b0Var.f130705n).d();
        a0e.d dVar2 = (a0e.d) tVar.f130827g.get();
        y yVar2 = new y();
        vyd.a aVar4 = new vyd.a();
        n0e.b bVarC = ((eyd.b) bVar).c();
        nj0.a aVar5 = b0Var.f130701h;
        return new com.revolut.feature.statements.impl.ui.documents_hub.a(documentsHubScreenContract$InputData2, k0Var, bVar5, fVarE, m0Var, xVarD, dVar2, yVar2, aVar4, bVarC, ((nj0.d) aVar5).f216295c, ((nj0.d) aVar5).j());
    }

    private final Object e() {
        czj.a aVar;
        ezj.b bVar = (ezj.b) this.f126090b;
        SettingsLimitsFlowContract$InputData inputData = ((ezj.d) this.d).f130960a;
        ezj.c cVar = (ezj.c) this.e;
        int i = this.f126091c;
        switch (i) {
            case 0:
                return s2l.c.j((r60.b) cVar.f130957c.get());
            case 1:
                return s2l.c.q((com.revolut.kompot.navigable.a) cVar.f130955a.get(), (p0) cVar.f130956b.get(), kxa.j.o(new nji.b()));
            case 2:
                return new p0();
            case 3:
                yk2.a extension = (yk2.a) cVar.e.get();
                lzj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 4:
                cl2.a aVar2 = bVar.f130953c;
                ffk.t tVarF = aVar2.f24924a.f();
                vc.s.j(tVarF);
                r10.v promptModelDataSource = new r10.v(tVarF, aVar2.f24925b.e(), new al2.e());
                zj2.a atmDestinationsResolver = new zj2.a();
                Intrinsics.checkNotNullParameter(promptModelDataSource, "promptModelDataSource");
                Intrinsics.checkNotNullParameter(atmDestinationsResolver, "atmDestinationsResolver");
                by5.a factory = new by5.a(2);
                r60.b promptControllerExtension = (r60.b) cVar.f130957c.get();
                lzj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(promptControllerExtension, "promptControllerExtension");
                Intrinsics.checkNotNullParameter(promptControllerExtension, "promptControllerExtension");
                return new al2.d(promptControllerExtension, promptModelDataSource, atmDestinationsResolver);
            case 5:
                bzj.b extension2 = (bzj.b) cVar.f130958g.get();
                lzj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                vc.s.k(extension2);
                return extension2;
            case 6:
                bzj.c factory2 = (bzj.c) bVar.d.f130950h.get();
                vc.s.j(factory2);
                r60.b promptControllerExtension2 = (r60.b) cVar.f130957c.get();
                yk2.a atmNetworkControllerExtension = (yk2.a) cVar.e.get();
                lzj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(promptControllerExtension2, "promptControllerExtension");
                Intrinsics.checkNotNullParameter(atmNetworkControllerExtension, "atmNetworkControllerExtension");
                Set set = inputData.f101781a;
                bzj.a configuration = new bzj.a(inputData.f101782b, set);
                gzj.f fVar = (gzj.f) factory2;
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Intrinsics.checkNotNullParameter(promptControllerExtension2, "promptControllerExtension");
                Intrinsics.checkNotNullParameter(atmNetworkControllerExtension, "atmNetworkControllerExtension");
                a5h.g gVar = fVar.f148153c;
                hd.r rVar = fVar.f148152b;
                hzj.j jVar = fVar.f148151a;
                Set set2 = set;
                ArrayList arrayList = new ArrayList(zhm.w.t(set2, 10));
                Iterator it8 = set2.iterator();
                while (it8.hasNext()) {
                    int i2 = gzj.e.f148150a[((com.revolut.retail.feature.limits.api.navigation.b) it8.next()).ordinal()];
                    if (i2 == 1) {
                        aVar = czj.a.WALLET;
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar = czj.a.PRICING_PLAN;
                    }
                    arrayList.add(aVar);
                }
                return new gzj.d(atmNetworkControllerExtension, rVar, jVar, configuration, d0.i1(arrayList), gVar, promptControllerExtension2, fVar.d);
            case 7:
                return new kzj.g(new kzj.h(), inputData, (bzj.b) cVar.f130958g.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        l70.e eVar = ((fa0.k) this.f126090b).f133103c;
        fa0.e eVar2 = (fa0.e) this.e;
        int i = this.f126091c;
        if (i == 0) {
            return kxa.j.k((j60.a) eVar2.d.get());
        }
        if (i == 1) {
            return n.s((com.revolut.kompot.navigable.a) eVar2.f133027b.get(), (rp0.m) eVar2.f133028c.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            if (i == 4) {
                return new lc0.c0();
            }
            if (i != 5) {
                throw new AssertionError(i);
            }
            zk0.b bVarL = eVar.l();
            vc.s.j(bVarL);
            return new hc0.b(bVarL);
        }
        lc0.k kVar = (lc0.k) eVar2.f.get();
        CardPhotoScreenContract$InputData cardPhotoScreenContract$InputData = eVar2.f133026a;
        jc0.d dVar = (jc0.d) ((fa0.c) this.d).f.get();
        hc0.b bVar = (hc0.b) eVar2.f133029g.get();
        j60.a aVar = (j60.a) eVar2.d.get();
        y80.a aVarR = eVar.r();
        vc.s.j(aVarR);
        return new lc0.b0(kVar, cardPhotoScreenContract$InputData, dVar, bVar, aVar, aVarR);
    }

    private final Object g() {
        fa0.j jVar = (fa0.j) this.d;
        fa0.k kVar = (fa0.k) this.f126090b;
        fa0.m mVar = (fa0.m) this.e;
        hb0.h inputData = mVar.f133112b;
        int i = this.f126091c;
        if (i == 0) {
            return c21.l.l((gb0.a) mVar.d.get());
        }
        if (i == 1) {
            ib0.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            EntitiesListItem item = inputData.f150541b;
            vc.s.k(item);
            Intrinsics.checkNotNullParameter(item, "item");
            db0.a aVar = (db0.a) mVar.f133113c.get();
            l80.e eVarH = kVar.f133103c.h();
            vc.s.j(eVarH);
            return new gb0.f(item, aVar, eVarH, new yk0.d());
        }
        if (i != 2) {
            if (i == 3) {
                return new eb0.a(jVar.j());
            }
            throw new AssertionError(i);
        }
        BackendFlow backendFlow = jVar.f133070a;
        ib0.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        EntitiesListItem item2 = inputData.f150541b;
        vc.s.k(item2);
        Intrinsics.checkNotNullParameter(item2, "item");
        fc0.f fVarD = kVar.f133104g.d();
        vc.s.j(fVarD);
        return new db0.a(backendFlow, item2, fVarD);
    }

    private final Object h() {
        fa0.j jVar = (fa0.j) this.d;
        fa0.k kVar = (fa0.k) this.f126090b;
        fa0.o oVar = (fa0.o) this.e;
        FormScreen formScreen = oVar.f133119b;
        int i = this.f126091c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) oVar.f.get());
            case 1:
                return n.s((com.revolut.kompot.navigable.a) oVar.d.get(), (rp0.m) oVar.e.get());
            case 2:
                return new rp0.m();
            case 3:
                return c21.l.l((gb0.a) oVar.i.get());
            case 4:
                EntitiesSelectionItem entitiesSelectionItemD = ka1.c.d(formScreen);
                db0.a aVar = (db0.a) oVar.f133122h.get();
                l80.e eVarH = kVar.f133103c.h();
                vc.s.j(eVarH);
                return new gb0.f(entitiesSelectionItemD, aVar, eVarH, new yk0.d());
            case 5:
                BackendFlow backendFlow = jVar.f133070a;
                EntitiesSelectionItem entitiesSelectionItemD2 = ka1.c.d(formScreen);
                fc0.f fVarD = kVar.f133104g.d();
                vc.s.j(fVarD);
                return new db0.a(backendFlow, entitiesSelectionItemD2, fVarD);
            case 6:
                return new eb0.a(jVar.j());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        fa0.h hVar = (fa0.h) this.d;
        fa0.k kVar = (fa0.k) this.f126090b;
        fa0.m mVar = (fa0.m) this.e;
        hb0.h inputData = mVar.f133112b;
        int i = this.f126091c;
        if (i == 0) {
            return c21.l.l((gb0.a) mVar.d.get());
        }
        if (i == 1) {
            ib0.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            EntitiesListItem item = inputData.f150541b;
            vc.s.k(item);
            Intrinsics.checkNotNullParameter(item, "item");
            db0.a aVar = (db0.a) mVar.f133113c.get();
            l80.e eVarH = kVar.f133103c.h();
            vc.s.j(eVarH);
            return new gb0.f(item, aVar, eVarH, new yk0.d());
        }
        if (i != 2) {
            if (i == 3) {
                return new eb0.a(hVar.j());
            }
            throw new AssertionError(i);
        }
        BackendFlow backendFlow = hVar.f133036a;
        ib0.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        EntitiesListItem item2 = inputData.f150541b;
        vc.s.k(item2);
        Intrinsics.checkNotNullParameter(item2, "item");
        fc0.f fVarD = kVar.f133104g.d();
        vc.s.j(fVarD);
        return new db0.a(backendFlow, item2, fVarD);
    }

    private final Object j() {
        fa0.h hVar = (fa0.h) this.d;
        fa0.k kVar = (fa0.k) this.f126090b;
        fa0.o oVar = (fa0.o) this.e;
        FormScreen formScreen = oVar.f133119b;
        int i = this.f126091c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) oVar.f.get());
            case 1:
                return n.s((com.revolut.kompot.navigable.a) oVar.d.get(), (rp0.m) oVar.e.get());
            case 2:
                return new rp0.m();
            case 3:
                return c21.l.l((gb0.a) oVar.i.get());
            case 4:
                EntitiesSelectionItem entitiesSelectionItemD = ka1.c.d(formScreen);
                db0.a aVar = (db0.a) oVar.f133122h.get();
                l80.e eVarH = kVar.f133103c.h();
                vc.s.j(eVarH);
                return new gb0.f(entitiesSelectionItemD, aVar, eVarH, new yk0.d());
            case 5:
                BackendFlow backendFlow = hVar.f133036a;
                EntitiesSelectionItem entitiesSelectionItemD2 = ka1.c.d(formScreen);
                fc0.f fVarD = kVar.f133104g.d();
                vc.s.j(fVarD);
                return new db0.a(backendFlow, entitiesSelectionItemD2, fVarD);
            case 6:
                return new eb0.a(hVar.j());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        fma.c0 c0Var = (fma.c0) this.f126090b;
        int i = this.f126091c;
        if (i != 0) {
            if (i == 1) {
                return new ona.j();
            }
            throw new AssertionError(i);
        }
        jki.p pVar = (jki.p) ((fma.p) this.e).f136213a.get();
        yp.b bVarA = c0Var.M.a();
        fk3.b bVarB = c0Var.N.b();
        vc.s.j(bVarB);
        q06.l lVarA = c0Var.O.a();
        vc.s.j(lVarA);
        f01.a aVar = (f01.a) ((fma.d0) this.d).f.get();
        f80.a aVarX = c0Var.f136052b.x();
        vc.s.j(aVarX);
        return new ona.i(pVar, bVarA, bVarB, lVarA, aVar, aVarX, c0Var.f136067p.f136165a.i());
    }

    private final Object l() {
        fma.d0 d0Var = (fma.d0) this.d;
        fma.y yVar = (fma.y) this.e;
        fma.c0 c0Var = (fma.c0) this.f126090b;
        int i = this.f126091c;
        switch (i) {
            case 0:
                return kxa.j.l((j60.a) yVar.i.get());
            case 1:
                return h30.l.p((com.revolut.kompot.navigable.a) yVar.f136238g.get(), (rp0.m) yVar.f136239h.get());
            case 2:
                return new rp0.m();
            case 3:
                return f0k.d.o((e60.a) yVar.f136246r.get());
            case 4:
                com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) yVar.f136238g.get();
                g60.a aVarA = f60.n.a((com.revolut.kompot.navigable.a) yVar.f136238g.get());
                Activity activityA = f60.l.a((com.revolut.kompot.navigable.a) yVar.f136238g.get());
                t80.g gVar = (t80.g) yVar.k.get();
                com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) yVar.f136238g.get();
                f60.q.a(aVar2);
                d4m.a aVarA2 = e4m.b.a(yVar.f136241l);
                nli.a aVar3 = new nli.a((t80.c) yVar.f136242m.get(), f60.l.a((com.revolut.kompot.navigable.a) yVar.f136238g.get()));
                t80.g gVar2 = (t80.g) yVar.k.get();
                zk0.b bVarL = yVar.d.f136052b.l();
                vc.s.j(bVarL);
                return f0k.d.u(aVar, new t80.v(aVarA, activityA, gVar, aVar2, aVarA2, aVar3, new oli.c(gVar2, bVarL, new nli.a((t80.c) yVar.f136242m.get(), f60.l.a((com.revolut.kompot.navigable.a) yVar.f136238g.get())), f60.n.a((com.revolut.kompot.navigable.a) yVar.f136238g.get()), yVar.e()), new oli.g(f60.m.a(f60.l.a((com.revolut.kompot.navigable.a) yVar.f136238g.get())), pli.b.a(f60.m.a(f60.l.a((com.revolut.kompot.navigable.a) yVar.f136238g.get()))), new ami.n(e4m.b.a(yVar.f136243n), 1), e4m.b.a(yVar.f136241l), (t80.g) yVar.k.get(), new nli.a((t80.c) yVar.f136242m.get(), f60.l.a((com.revolut.kompot.navigable.a) yVar.f136238g.get())), new i90.b(), yVar.d(), yVar.e()), yVar.e()), f60.p.a(), (rp0.m) yVar.o.get(), (e60.t) yVar.f136245q.get(), new nji.b());
            case 5:
                l70.e eVar = c0Var.f136052b;
                l70.e eVar2 = c0Var.f136052b;
                f80.a aVarX = eVar.x();
                vc.s.j(aVarX);
                l80.e eVarH = eVar2.h();
                vc.s.j(eVarH);
                zk0.b bVarL2 = eVar2.l();
                vc.s.j(bVarL2);
                return new t80.b(aVarX, eVarH, bVarL2);
            case 6:
                com.revolut.kompot.navigable.a aVar4 = (com.revolut.kompot.navigable.a) yVar.f136238g.get();
                f60.q.a(aVar4);
                return pli.c.a(new ks0.n(aVar4));
            case 7:
                zna.a.Companion.getClass();
                return new t80.c(new e.a("profile_details"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
            case 8:
                return t96.a.a();
            case 9:
                return f60.r.a();
            case 10:
                aii.o oVar = (aii.o) yVar.f136244p.get();
                y80.a aVarR = c0Var.f136052b.r();
                vc.s.j(aVarR);
                return new e60.y(oVar, aVarR, yVar.d(), Optional.empty());
            case 11:
                fd6.a extension = (fd6.a) yVar.u.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 12:
                i4b.f factory = ((zc6.a) c0Var.f136058h).d();
                xc6.a modelExtension = (xc6.a) yVar.f136248t.get();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(modelExtension, "legalEntityControllerModelExtension");
                Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
                return new fd6.a(modelExtension);
            case 13:
                return r6.b.k((zc6.a) c0Var.f136058h, "factory");
            case 14:
                en.c navigationDelegate = new en.c(ImmutableSet.of((ln.d) yVar.e.f136087g.get()), (sri.m) yVar.f136249w.get());
                zna.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(navigationDelegate, "navigationDelegate");
                return new c84.w(navigationDelegate);
            case 15:
                Context context = c0Var.P;
                zna.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return sri.o.c(context, null, null, 14);
            case 16:
                yok.f factory2 = c0Var.f136067p.d.c();
                zna.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                return new yok.e();
            case 17:
                Object extension2 = (d6k.d) yVar.z.get();
                d6k.h.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                yji.n nVar = (yji.n) extension2;
                vc.s.k(nVar);
                return nVar;
            case 18:
                ang.f fVarE = c0Var.i.e();
                r0 r0VarA = c0Var.Q.a();
                v5k.a aVar5 = new v5k.a();
                j60.a aVar6 = (j60.a) yVar.i.get();
                fma.c0 c0Var2 = yVar.d;
                sf0.h hVarB = c0Var2.F.b();
                vc.s.j(hVarB);
                v60.e eVarA = c0Var2.G.a();
                vc.s.j(eVarA);
                return new d6k.g(fVarE, r0VarA, aVar5, aVar6, new d6k.b(hVarB, eVarA));
            case 19:
                e60.t tVar = (e60.t) yVar.f136245q.get();
                f60.o.a(tVar);
                return tVar;
            case 20:
                Object extension3 = (xc6.a) yVar.f136248t.get();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                yji.n nVar2 = (yji.n) extension3;
                vc.s.k(nVar2);
                return nVar2;
            case 21:
                nkd.b view = yVar.f136235a;
                kld.a factory3 = (kld.a) c0Var.R.K.get();
                vc.s.j(factory3);
                zna.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(factory3, "factory");
                return factory3.a(view);
            case 22:
                mkd.g view2 = yVar.f136236b;
                rkd.m factory4 = c0Var.R.a();
                vc.s.j(factory4);
                zna.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(factory4, "factory");
                return factory4.a(view2);
            case 23:
                mcf.a view3 = yVar.f136237c;
                ubf.c factory5 = (ubf.c) c0Var.S.O.get();
                vc.s.j(factory5);
                zna.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(view3, "view");
                Intrinsics.checkNotNullParameter(factory5, "factory");
                ubf.d dVar = (ubf.d) factory5.f278855a.f265379c;
                return new jcf.c(view3, (kbf.a) dVar.E.get(), (hcf.a) dVar.N.get());
            case 24:
                e4m.e eVar3 = yVar.I;
                fma.c0 c0Var3 = yVar.d;
                jki.p pVar = (jki.p) eVar3.get();
                fma.h hVar = c0Var.f136054c;
                afj.b bVar = c0Var.V;
                efk.a aVar7 = c0Var.C;
                b6b.h hVar2 = c0Var.f136072s0;
                l70.e eVar4 = c0Var.f136052b;
                fma.j jVar = c0Var.f136067p;
                tla.d dVarB = hVar.b();
                vc.s.j(dVarB);
                jn2.b bVar2 = (jn2.b) c0Var.Z.f162617c.get();
                vc.s.j(bVar2);
                c70.a aVarZ = eVar4.z();
                vc.s.j(aVarZ);
                gte.a aVarB = c0Var.e.b();
                vc.s.j(aVarB);
                r70.c cVarA = eVar4.A();
                vc.s.j(cVarA);
                ffk.t tVarF = aVar7.f();
                vc.s.j(tVarF);
                efk.a aVar8 = c0Var3.C;
                zxb.k0 k0Var = c0Var3.f136053b0;
                ffk.t tVarF2 = aVar8.f();
                vc.s.j(tVarF2);
                sh3.a aVarA3 = c0Var3.f136051a0.a();
                vc.s.j(aVarA3);
                gte.a aVarB2 = c0Var3.e.b();
                vc.s.j(aVarB2);
                eub.a aVarA4 = k0Var.a();
                vc.s.j(aVarA4);
                nyb.k kVarC = k0Var.c();
                vc.s.j(kVarC);
                toh.d dVar2 = new toh.d(aVarA4, kVarC);
                qga.a aVar9 = c0Var3.c0;
                zga.m mVar = new zga.m(aVar9.c(), (ne0.j) aVar9.f245713j.get());
                ffk.t tVarF3 = aVar9.f245709b.f();
                vc.s.j(tVarF3);
                ufm.d dVar3 = new ufm.d(mVar, tVarF3, (zga.a) aVar9.k.get());
                jgk.u planSubscriptionStateProvider = (jgk.u) c0Var3.T.V.get();
                vc.s.j(planSubscriptionStateProvider);
                Intrinsics.checkNotNullParameter(planSubscriptionStateProvider, "planSubscriptionStateProvider");
                aoa.j jVar2 = new aoa.j(tVarF2, aVarA3, aVarB2, dVar2, dVar3, new e1());
                g1 g1Var = (g1) d0Var.f136088h.get();
                f01.a aVar10 = (f01.a) d0Var.f.get();
                kd6.a aVarD = jVar.f136167c.d();
                ang.f fVarE2 = c0Var.i.e();
                mli.e eVarB = ((j51.a) c0Var.f136055d0).b();
                vc.s.j(eVarB);
                gpk.c cVarA2 = c0Var.f136056e0.a();
                am2.a aVarI = jVar.f136165a.i();
                d6k.d dVar4 = (d6k.d) yVar.z.get();
                e60.a aVar11 = (e60.a) yVar.f136246r.get();
                j60.a aVar12 = (j60.a) yVar.i.get();
                cpa.a aVar13 = (cpa.a) c0Var.f0.f128128b.get();
                vc.s.j(aVar13);
                wwa.b bVarA = c0Var.g0.a();
                vc.s.j(bVarA);
                xo.h hVarA = c0Var.f136059h0.a();
                yva.a aVarA5 = c0Var.i0.a();
                vc.s.j(aVarA5);
                nkd.a aVar14 = (nkd.a) yVar.D.get();
                mkd.d dVar5 = (mkd.d) yVar.E.get();
                ajk.f fVarH = c0Var.T.h();
                y70.a aVarC = eVar4.c();
                vc.s.j(aVarC);
                rqi.c cVarB = c0Var.f136076w.b();
                r69.a aVarA6 = c0Var.j0.a();
                vc.s.j(aVarA6);
                r69.a inboxInteractor = c0Var3.j0.a();
                vc.s.j(inboxInteractor);
                uvl.c securityHubNotificationsInteractor = c0Var3.f136061k0.a();
                n30.n chatInteractor = ((h30.n) c0Var3.l0).k();
                stj.k rewardsHubNotificationsInteractor = (stj.k) c0Var3.m0.o.get();
                vc.s.j(rewardsHubNotificationsInteractor);
                Intrinsics.checkNotNullParameter(inboxInteractor, "inboxInteractor");
                Intrinsics.checkNotNullParameter(securityHubNotificationsInteractor, "securityHubNotificationsInteractor");
                Intrinsics.checkNotNullParameter(chatInteractor, "chatInteractor");
                Intrinsics.checkNotNullParameter(rewardsHubNotificationsInteractor, "rewardsHubNotificationsInteractor");
                twg.c cVar = new twg.c();
                cVar.f275017a = inboxInteractor;
                cVar.f275018b = securityHubNotificationsInteractor;
                cVar.f275019c = chatInteractor;
                cVar.d = rewardsHubNotificationsInteractor;
                stj.k kVar = (stj.k) c0Var.m0.o.get();
                vc.s.j(kVar);
                kma.c cVar2 = (kma.c) c0Var.f136054c.F.get();
                vc.s.j(cVar2);
                uw1.c cVarD = ((lz1.m) c0Var.f136065n0).d();
                vc.s.j(cVarD);
                t1 t1VarA = c0Var.f136066o0.a();
                xjl.u uVarE = ((q0) c0Var.Y).e();
                smd.s sVarE = jVar.f136167c.e();
                i4b.f fVarB = ((zc6.a) c0Var.f136058h).b();
                lek.a aVar15 = (lek.a) c0Var.p0.f183121p.get();
                vc.s.j(aVar15);
                cti.a aVar16 = (cti.a) c0Var.W.i.get();
                vc.s.j(aVar16);
                fej.b bVarM = bVar.m();
                vc.s.j(bVarM);
                cej.a aVarL = bVar.l();
                vc.s.j(aVarL);
                oej.a aVarA7 = c0Var.q0.a();
                vc.s.j(aVarA7);
                tvi.a aVar17 = (tvi.a) c0Var.X.f109793d0.get();
                vc.s.j(aVar17);
                myj.e eVar5 = (myj.e) ((nyj.c) c0Var.f136070r0).K.get();
                vc.s.j(eVar5);
                q5b.b bVarB = hVar2.b();
                vc.s.j(bVarB);
                q5b.c cVarC = hVar2.c();
                vc.s.j(cVarC);
                s5b.a aVar18 = (s5b.a) hVar2.R.get();
                vc.s.j(aVar18);
                x xVarD = ((s41.a) c0Var.E).d();
                cha.c cVarJ = aVar7.j();
                vc.s.j(cVarJ);
                hl2.a aVar19 = (hl2.a) c0Var.f136074t0.f185272q.get();
                vc.s.j(aVar19);
                return new c1(pVar, dVarB, bVar2, aVarZ, aVarB, cVarA, tVarF, jVar2, g1Var, aVar10, aVarD, fVarE2, eVarB, cVarA2, aVarI, dVar4, aVar11, aVar12, aVar13, bVarA, hVarA, aVarA5, aVar14, dVar5, fVarH, aVarC, cVarB, aVarA6, cVar, kVar, cVar2, cVarD, t1VarA, uVarE, sVarE, fVarB, aVar15, aVar16, bVarM, aVarL, aVarA7, aVar17, eVar5, bVarB, cVarC, aVar18, xVarD, cVarJ, aVar19, jVar.f136167c.a(), jVar.f136167c.h(), (tla.f) yVar.f136251y.get());
            case 25:
                qoa.b bVar3 = (qoa.b) yVar.H.get();
                yik.g gVarA = ((k3) c0Var.U).a();
                xjl.u uVarE2 = ((q0) c0Var.Y).e();
                zjh.j jVarC = ((zc6.a) c0Var.f136058h).c();
                gte.a aVarB3 = c0Var.e.b();
                vc.s.j(aVarB3);
                return new h1(bVar3, gVarA, uVarE2, jVarC, aVarB3);
            case 26:
                fma.c0 c0Var4 = yVar.d;
                fma.c0 c0Var5 = yVar.d;
                jgk.u uVar = (jgk.u) c0Var4.T.V.get();
                vc.s.j(uVar);
                qoa.f fVar = new qoa.f(uVar, ((k3) c0Var4.U).b());
                gte.a aVarB4 = c0Var.e.b();
                vc.s.j(aVarB4);
                i3 i3Var = c0Var5.T;
                ite.a aVar20 = c0Var5.e;
                jgk.u uVar2 = (jgk.u) i3Var.V.get();
                vc.s.j(uVar2);
                aoa.f fVar2 = new aoa.f(uVar2, ((k3) c0Var5.U).b());
                efj.a aVar21 = (efj.a) c0Var5.V.B0.get();
                vc.s.j(aVar21);
                mti.h hVar3 = (mti.h) c0Var5.W.f189544p.get();
                vc.s.j(hVar3);
                dwi.x xVar = (dwi.x) c0Var5.X.f109801m.get();
                vc.s.j(xVar);
                gte.a aVarB5 = aVar20.b();
                vc.s.j(aVarB5);
                gte.a aVarB6 = c0Var5.e.b();
                vc.s.j(aVarB6);
                aoa.b bVar4 = new aoa.b(aVar21, hVar3, xVar, aVarB5, new aoa.k(aVarB6, 0));
                gte.a aVarB7 = aVar20.b();
                vc.s.j(aVarB7);
                gte.a aVarB8 = c0Var5.e.b();
                vc.s.j(aVarB8);
                return new qoa.e(fVar, aVarB4, new aoa.e(fVar2, bVar4, aVarB7, new aoa.k(aVarB8, 0), (AnimationRequest) yVar.G.get()));
            case 27:
                zna.a.Companion.getClass();
                return new AnimationRequest(false);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object m() {
        fma.z zVar = (fma.z) this.e;
        fma.c0 c0Var = (fma.c0) this.f126090b;
        int i = this.f126091c;
        if (i == 0) {
            coa.b bVar = (coa.b) zVar.f136253b.get();
            toa.a aVar = (toa.a) ((fma.d0) this.d).i.get();
            am2.a aVarI = c0Var.f136067p.f136165a.i();
            eub.k kVar = (eub.k) c0Var.f136053b0.Q.get();
            vc.s.j(kVar);
            pp3.b bVar2 = (pp3.b) ((t15.d) c0Var.D0).U.get();
            vc.s.j(bVar2);
            gte.a aVarB = c0Var.e.b();
            vc.s.j(aVarB);
            return new coa.i(bVar, aVar, aVarI, kVar, bVar2, aVarB);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        fma.c0 c0Var2 = zVar.f136252a;
        eub.a aVarA = c0Var2.f136053b0.a();
        vc.s.j(aVarA);
        gte.a aVarB2 = c0Var2.e.b();
        vc.s.j(aVarB2);
        r10.d dVar = new r10.d(aVarA, aVarB2);
        eoa.b emailStateChecker = new eoa.b();
        Intrinsics.checkNotNullParameter(emailStateChecker, "emailStateChecker");
        return new eoa.e(dVar, new eoa.h());
    }

    private final Object n() {
        o0 o0Var = (o0) this.d;
        i0 i0Var = (i0) this.e;
        g9g.d dVar = (g9g.d) this.f126090b;
        int i = this.f126091c;
        switch (i) {
            case 0:
                return kxa.j.j((j60.a) i0Var.f141694c.get());
            case 1:
                return v1.c.r((com.revolut.kompot.navigable.a) i0Var.f141692a.get(), (rp0.m) i0Var.f141693b.get());
            case 2:
                return new rp0.m();
            case 3:
                xdg.a extension = (xdg.a) i0Var.e.get();
                leg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 4:
                return new xdg.f((i9g.n) dVar.p0.get(), (i9g.l) dVar.E0.get(), (h0) dVar.f141631o0.get(), (i9g.b0) dVar.m0.get());
            case 5:
                return new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b((cli.n) i0Var.f141696h.get(), o0Var.f141765a, (i9g.l) dVar.E0.get(), (i9g.b0) dVar.m0.get(), (p8g.b) dVar.f141640v0.get(), dVar.f141629n.e(), (j60.a) i0Var.i.get(), (xag.g) o0Var.d.get(), (ieg.d0) i0Var.f141697j.get(), (xdg.a) i0Var.e.get(), (p8g.c) dVar.g0.get());
            case 6:
                l80.e eVarH = dVar.e.h();
                vc.s.j(eVarH);
                return new ieg.c0(eVarH, (p8g.c) dVar.g0.get(), (q8g.b) dVar.f141644x0.get(), (ieg.c) i0Var.f141695g.get());
            case 7:
                return new ieg.e();
            case 8:
                j60.a bottomExpandableDialogEmbeddedControllerExtension = (j60.a) i0Var.f141694c.get();
                leg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(bottomExpandableDialogEmbeddedControllerExtension, "bottomExpandableDialogEmbeddedControllerExtension");
                vc.s.k(bottomExpandableDialogEmbeddedControllerExtension);
                return bottomExpandableDialogEmbeddedControllerExtension;
            case 9:
                return new ieg.d0();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object o() {
        g9g.d dVar = (g9g.d) this.f126090b;
        j0 j0Var = (j0) this.e;
        int i = this.f126091c;
        switch (i) {
            case 0:
                return s2l.c.j((r60.b) j0Var.e.get());
            case 1:
                return s2l.c.q((com.revolut.kompot.navigable.a) j0Var.f141706c.get(), (p0) j0Var.d.get(), kxa.j.o(new nji.b()));
            case 2:
                return new p0();
            case 3:
                return kxa.j.k((j60.a) j0Var.f141708h.get());
            case 4:
                return n.s((com.revolut.kompot.navigable.a) j0Var.f141706c.get(), (rp0.m) j0Var.f141707g.get());
            case 5:
                return new rp0.m();
            case 6:
                ueg.a extension = (ueg.a) j0Var.k.get();
                veg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 7:
                p8g.a aVar = (p8g.a) dVar.f141635r0.get();
                ffk.t tVarF = dVar.k.f();
                vc.s.j(tVarF);
                return new ueg.c(aVar, tVarF, (j60.a) j0Var.f141708h.get(), (weg.a) j0Var.f141709j.get());
            case 8:
                return new weg.d();
            case 9:
                cli.n nVar = (cli.n) j0Var.f141719x.get();
                TravelHotelsSearchResultsMapScreenContract$InputData travelHotelsSearchResultsMapScreenContract$InputData = j0Var.f141704a;
                ueg.d dVar2 = (ueg.d) j0Var.f141720y.get();
                i9g.u uVar = (i9g.u) dVar.f141639t0.get();
                i9g.y yVar = (i9g.y) dVar.A0.get();
                h0 h0Var = (h0) dVar.f141631o0.get();
                p8g.d dVar3 = (p8g.d) dVar.l0.get();
                i9g.j0 j0Var2 = (i9g.j0) ((g9g.n) this.d).d.get();
                ueg.a aVar2 = (ueg.a) j0Var.k.get();
                j60.a aVar3 = (j60.a) j0Var.f141708h.get();
                p8g.c cVar = (p8g.c) dVar.g0.get();
                xcg.b bVar = (xcg.b) j0Var.z.get();
                weg.m mVar = new weg.m(fe0.d.a(), (p8g.c) j0Var.f141705b.g0.get());
                cf0.a aVar4 = (cf0.a) dVar.J.f.get();
                vc.s.j(aVar4);
                l80.e eVarH = dVar.e.h();
                vc.s.j(eVarH);
                i9g.i0 i0Var = (i9g.i0) dVar.u0.get();
                nyb.p0 p0Var = (nyb.p0) dVar.i.Z.get();
                vc.s.j(p0Var);
                return new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b(nVar, travelHotelsSearchResultsMapScreenContract$InputData, dVar2, uVar, yVar, h0Var, dVar3, j0Var2, aVar2, aVar3, cVar, bVar, mVar, aVar4, eVarH, i0Var, p0Var, dVar.c(), new meg.h(), new fcg.e(), ((s41.a) dVar.u).d());
            case 10:
                e4m.e eVar = j0Var.f141715r;
                g9g.d dVar4 = j0Var.f141705b;
                return new b1((weg.n) eVar.get(), new weg.i(new meg.i(dVar4.f141628m.g()), new peg.a(new meg.i(dVar4.f141628m.g()))), (weg.g) j0Var.f141717t.get(), (weg.f) j0Var.f141718w.get(), new weg.q());
            case 11:
                return new weg.p((rag.e) j0Var.o.get(), (pag.a) j0Var.f141713p.get(), (xcg.f) j0Var.f141714q.get(), new weg.e());
            case 12:
                return new rag.g((p8g.c) dVar.g0.get(), (c90.c) j0Var.f141711m.get(), (q8g.b) dVar.f141644x0.get(), new qd0.c(), (rag.c) j0Var.f141712n.get(), new rag.a());
            case 13:
                com.revolut.kompot.navigable.a screen = (com.revolut.kompot.navigable.a) j0Var.f141706c.get();
                veg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(screen, "screen");
                return new c90.c(screen.m2());
            case 14:
                l80.e eVarH2 = dVar.e.h();
                vc.s.j(eVarH2);
                return new rag.d(eVarH2);
            case 15:
                return new pag.b();
            case 16:
                l80.e eVarH3 = dVar.e.h();
                vc.s.j(eVarH3);
                return new xcg.h(eVarH3);
            case 17:
                return new weg.h((ah0.c) j0Var.f141716s.get());
            case 18:
                th0.a aVar5 = dVar.I;
                th0.b mapServices = th0.g.a();
                veg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapServices, "mapServices");
                return new com.revolut.core.mobile_services.impl.map.a();
            case 19:
                return new weg.f((qag.b) j0Var.u.get(), (qag.a) j0Var.v.get());
            case 20:
                qd0.b bVarN = j0Var.f141705b.e.n();
                vc.s.j(bVarN);
                return new qag.f(new tul.b(bVarN), (p8g.c) dVar.g0.get());
            case 21:
                return new qag.c();
            case 22:
                return new ueg.e((h0) dVar.f141631o0.get(), (i9g.b0) dVar.m0.get(), new yk0.d());
            case 23:
                l80.e eVarH4 = dVar.e.h();
                vc.s.j(eVarH4);
                return new xcg.d(eVarH4);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object p() {
        gy2.c cVar = (gy2.c) this.e;
        gy2.d dVar = cVar.f147776b;
        gy2.d dVar2 = (gy2.d) this.f126090b;
        jm4.r rVar = dVar2.f147792s;
        da3.j jVar = dVar2.f147780a;
        jk3.c cVar2 = dVar2.f147793t;
        fy2.d dVar3 = dVar2.k;
        ite.a aVar = dVar2.f147788n;
        int i = this.f126091c;
        if (i != 0) {
            if (i == 1) {
                jx2.e eVar = (jx2.e) cVar.f147777c.get();
                jx2.b bVar = (jx2.b) cVar.d.get();
                hy2.f fVarA = dVar3.a();
                jx2.i iVar = (jx2.i) cVar.e.get();
                gte.a aVarB = aVar.b();
                vc.s.j(aVarB);
                return new v0(eVar, bVar, fVarA, iVar, aVarB);
            }
            if (i == 2) {
                gte.a featureToggleInteractor = aVar.b();
                vc.s.j(featureToggleInteractor);
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                return new jx2.f();
            }
            if (i != 3) {
                if (i == 4) {
                    return new jx2.k(new jx2.g());
                }
                if (i != 5) {
                    throw new AssertionError(i);
                }
                fk3.a aVarA = cVar2.a();
                vc.s.j(aVarA);
                return new lx2.g(aVarA);
            }
            jx2.d dVar4 = new jx2.d();
            gte.a aVarB2 = dVar.f147788n.b();
            vc.s.j(aVarB2);
            jx2.n nVar = new jx2.n(aVarB2);
            gte.a aVarB3 = aVar.b();
            vc.s.j(aVarB3);
            return new jx2.c(dVar4, nVar, aVarB3);
        }
        cli.n nVar2 = (cli.n) cVar.f.get();
        CardDesignCarouselScreenContract$InputData cardDesignCarouselScreenContract$InputData = cVar.f147775a;
        ffk.t tVarF = dVar2.f147787m.f();
        vc.s.j(tVarF);
        hy2.f fVarA2 = dVar3.a();
        ang.f fVarE = dVar2.f147791r.e();
        hy2.h hVarB = dVar3.b();
        fk3.a aVarA2 = cVar2.a();
        vc.s.j(aVarA2);
        ha3.c cVar3 = (ha3.c) jVar.F.get();
        vc.s.j(cVar3);
        wsg.n nVarB = dVar2.e.b();
        lg3.a aVarA3 = ((og3.e) dVar2.f147786l).a();
        vc.s.j(aVarA3);
        r70.c cVarA = dVar2.f147783g.A();
        vc.s.j(cVarA);
        jla.h hVarA = dVar2.f147785j.a();
        hj8.a aVarA4 = dVar2.f.a();
        vc.s.j(aVarA4);
        m4 m4VarD = rVar.d();
        z43.a aVarA5 = dVar2.i.a();
        vc.s.j(aVarA5);
        ix2.e eVar2 = new ix2.e(dVar.a());
        gte.a aVarB4 = dVar.f147788n.b();
        vc.s.j(aVarB4);
        ix2.c cVar4 = new ix2.c(eVar2, aVarB4, (lx2.a) cVar.f147778g.get(), new lx2.d(dVar.a()));
        gte.a aVarB5 = aVar.b();
        vc.s.j(aVarB5);
        l93.f fVarJ = jVar.j();
        vc.s.j(fVarJ);
        kx2.a aVarB6 = ((gy2.e) this.d).b();
        al4.b bVarN = rVar.n();
        vc.s.j(bVarN);
        return new com.revolut.feature.card_design.impl.card_design.carousel.e(nVar2, cardDesignCarouselScreenContract$InputData, tVarF, fVarA2, fVarE, hVarB, aVarA2, cVar3, nVarB, aVarA3, cVarA, hVarA, aVarA4, m4VarD, aVarA5, cVar4, aVarB5, fVarJ, aVarB6, bVarN, dVar2.v.a());
    }

    private final Object q() {
        gy2.k kVar = (gy2.k) this.e;
        gy2.d dVar = (gy2.d) this.f126090b;
        ite.a aVar = dVar.f147788n;
        int i = this.f126091c;
        if (i == 0) {
            return new l10.n((cli.n) kVar.f147817c.get(), kVar.f147815a);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        c90.c cVarA = dVar.a();
        ay2.j jVar = new ay2.j();
        j10.a aVar2 = (j10.a) ((gy2.e) this.d).f.get();
        gte.a aVarB = aVar.b();
        vc.s.j(aVarB);
        ay2.s sVar = new ay2.s(aVarB);
        jx2.g gVar = new jx2.g();
        gte.a aVarB2 = aVar.b();
        vc.s.j(aVarB2);
        ay2.l lVar = new ay2.l(gVar, aVarB2);
        gte.a aVarB3 = aVar.b();
        vc.s.j(aVarB3);
        ay2.m mVar = new ay2.m(aVarB3);
        jub.b bVar = (jub.b) dVar.f147794w.Z.get();
        vc.s.j(bVar);
        return new e0(cVarA, jVar, aVar2, sVar, lVar, mVar, new zjh.f(bVar));
    }

    private final Object r() {
        hc2.k kVar = (hc2.k) this.e;
        int i = this.f126091c;
        if (i == 0) {
            n60.a aVar = (n60.a) kVar.d.get();
            o5k.i.l(aVar);
            return aVar;
        }
        if (i == 1) {
            return o5k.i.q((com.revolut.kompot.navigable.a) kVar.f150795c.get());
        }
        if (i != 2) {
            if (i == 3) {
                return new jx1.k(kVar.f150794b);
            }
            throw new AssertionError(i);
        }
        ApmCodeControllerContract$InputData apmCodeControllerContract$InputData = kVar.f150794b;
        hx1.a aVar2 = (hx1.a) ((hc2.o) this.d).f150819g.get();
        n60.a aVar3 = (n60.a) kVar.d.get();
        z80.b bVarS = ((hc2.m) this.f126090b).f150802g.s();
        vc.s.j(bVarS);
        return new com.revolut.feature.apm.core.code.ui.a(apmCodeControllerContract$InputData, aVar2, aVar3, bVarS, (cli.n) kVar.f.get());
    }

    private final Object s() {
        he9.g gVar = (he9.g) this.e;
        he9.e eVar = (he9.e) this.f126090b;
        int i = this.f126091c;
        if (i != 0) {
            if (i == 1) {
                return new de9.y(new de9.z());
            }
            throw new AssertionError(i);
        }
        PasscodeScreenContract$InputData passcodeScreenContract$InputData = gVar.f151618b;
        oe9.a aVar = (oe9.a) eVar.i.get();
        fe9.h hVar = new fe9.h(((he9.d) this.d).f151607c.f151609b.a());
        ie9.d dVar = (ie9.d) eVar.f151612h.get();
        wl0.c cVarA = eVar.f151609b.a();
        io.c cVarD = eVar.d.d();
        vc.s.j(cVarD);
        le9.c.Companion.getClass();
        return new de9.x(passcodeScreenContract$InputData, aVar, hVar, dVar, cVarA, cVarD, new le9.a(), (jki.p) gVar.d.get());
    }

    private final Object t() {
        hvf.q qVar = (hvf.q) this.f126090b;
        hvf.t tVar = (hvf.t) this.e;
        int i = this.f126091c;
        if (i == 0) {
            TransportHubTransitScreenContract$InputData transportHubTransitScreenContract$InputData = tVar.f155962a;
            ouf.a aVarA = ((hvf.b) qVar.f155941a).a();
            vc.s.j(aVarA);
            return new jwf.n(transportHubTransitScreenContract$InputData, aVarA, (lvf.a) qVar.f155948m.get(), (cwf.a) ((hvf.r) this.d).d.get(), (jki.p) tVar.f155964c.get());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        nvf.h ticketMapper = new nvf.h();
        nvf.l getHelpProvider = new nvf.l();
        Intrinsics.checkNotNullParameter(ticketMapper, "ticketMapper");
        Intrinsics.checkNotNullParameter(getHelpProvider, "getHelpProvider");
        return new jwf.p();
    }

    private final Object u() {
        i72.w wVar = (i72.w) this.d;
        i72.m mVar = (i72.m) this.f126090b;
        i72.a0 a0Var = (i72.a0) this.e;
        int i = this.f126091c;
        switch (i) {
            case 0:
                n60.b bVar = (n60.b) a0Var.d.get();
                o5k.i.m(bVar);
                return bVar;
            case 1:
                return o5k.i.r((com.revolut.kompot.navigable.a) a0Var.f159053c.get());
            case 2:
                n60.a aVar = (n60.a) a0Var.f.get();
                o5k.i.l(aVar);
                return aVar;
            case 3:
                return o5k.i.q((com.revolut.kompot.navigable.a) a0Var.f159053c.get());
            case 4:
                xdk.b bVar2 = (xdk.b) a0Var.f159055h.get();
                ydk.c.a(bVar2);
                return bVar2;
            case 5:
                xdk.a aVar2 = new xdk.a();
                z71.a aVarF = ((c21.b) mVar.u).f();
                vc.s.j(aVarF);
                return new xdk.g(aVar2, aVarF, mVar.v.a());
            case 6:
                i72.w wVar2 = a0Var.f159052b;
                i72.m mVar2 = a0Var.f159051a;
                MultibancoWithdrawalInputData multibancoWithdrawalInputData = wVar2.f159172a;
                d92.b bVar3 = (d92.b) wVar2.d.get();
                l72.i iVar = (l72.i) mVar2.K.get();
                x02.a aVarH = mVar2.f159132p.h();
                vc.s.j(aVarH);
                return new u82.m(new t82.f(multibancoWithdrawalInputData, bVar3, iVar, aVarH, new opf.c0()), new t82.g(mVar2.a(), (j72.a) a0Var.f159052b.f.get()), (d92.b) wVar.d.get(), (xdk.b) a0Var.f159055h.get(), (n60.a) a0Var.f.get(), (ldd.b) a0Var.f159056j.get(), (w80.b) wVar.i.get(), (cli.n) a0Var.f159057l.get());
            case 7:
                kdd.b bVar4 = mVar.f159137w;
                ldd.a factory = new ldd.a();
                v82.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return new ldd.b();
            case 8:
                yof.d dVar = (yof.d) a0Var.k.get();
                vo9.a aVarB = ((ut9.a) a0Var.f159051a.f159139y).b();
                vc.s.j(aVarB);
                return new u82.n(new w82.b(dVar, aVarB, new u80.o(), (w80.b) a0Var.f159052b.i.get(), (ldd.b) a0Var.f159056j.get()), (yof.d) a0Var.k.get());
            case 9:
                ppf.a factory2 = mVar.f159138x.b();
                vc.s.j(factory2);
                ldd.b delegate = (ldd.b) a0Var.f159056j.get();
                v82.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                return ppf.a.a(delegate);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object v() {
        i9e.o oVar = (i9e.o) this.f126090b;
        tr2.m mVar = oVar.f159706h;
        i9e.j jVar = (i9e.j) this.e;
        i9e.i iVar = jVar.d;
        i9e.o oVar2 = jVar.f159686c;
        int i = this.f126091c;
        if (i == 0) {
            return kxa.j.l((j60.a) jVar.f159687g.get());
        }
        if (i == 1) {
            return h30.l.p((com.revolut.kompot.navigable.a) jVar.e.get(), (rp0.m) jVar.f.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            if (i == 4) {
                a9e.h hVarB = ((i9e.i) this.d).b();
                ur2.c cVarA = mVar.a();
                vc.s.j(cVarA);
                return new t9e.y((mae.o) hVarB, cVarA);
            }
            if (i != 5) {
                throw new AssertionError(i);
            }
            BaseScreen screen = jVar.f159685b;
            u9e.a.Companion.getClass();
            Intrinsics.checkNotNullParameter(screen, "screen");
            return new f01.c(screen.m2());
        }
        jki.p pVar = (jki.p) jVar.i.get();
        BlockFuturePaymentsScreenContract$InputData blockFuturePaymentsScreenContract$InputData = jVar.f159684a;
        xua.a aVarA = oVar.f159703b.a();
        vc.s.j(aVarA);
        ur2.c cVarA2 = mVar.a();
        vc.s.j(cVarA2);
        ffk.t tVarF = oVar.i.f();
        vc.s.j(tVarF);
        j60.a aVar = (j60.a) jVar.f159687g.get();
        mde.e eVarE = oVar.f159707j.e();
        sf0.h hVarB2 = oVar.k.b();
        vc.s.j(hVarB2);
        whf.b bVarA = oVar.f159708l.a();
        vc.s.j(bVarA);
        xua.a aVarA2 = oVar2.f159703b.a();
        vc.s.j(aVarA2);
        ppg.b bVarB = ((wpg.l) oVar2.f159709m).b();
        vc.s.j(bVarB);
        a9e.h hVarB3 = iVar.b();
        hj8.a aVarA3 = oVar2.f159710n.a();
        vc.s.j(aVarA3);
        nhf.a aVarA4 = oVar2.o.a();
        vc.s.j(aVarA4);
        oce.e eVar = new oce.e(aVarA2, bVarB, hVarB3, aVarA3, aVarA4);
        xua.a aVarA5 = oVar2.f159703b.a();
        vc.s.j(aVarA5);
        ppg.b bVarB2 = ((wpg.l) oVar2.f159709m).b();
        vc.s.j(bVarB2);
        a9e.h hVarB4 = iVar.b();
        f01.a aVar2 = (f01.a) jVar.f159689j.get();
        t70.b bVarG = oVar2.e.g();
        vc.s.j(bVarG);
        hj8.a aVarA6 = oVar2.f159710n.a();
        vc.s.j(aVarA6);
        wsg.n nVarB = oVar2.f159711p.b();
        nhf.a aVarA7 = oVar2.o.a();
        vc.s.j(aVarA7);
        qce.d dVar = new qce.d(aVarA5, bVarB2, hVarB4, aVar2, bVarG, aVarA6, nVarB, aVarA7);
        hj8.a aVarA8 = oVar.f159710n.a();
        vc.s.j(aVarA8);
        return new t9e.w(pVar, blockFuturePaymentsScreenContract$InputData, aVarA, cVarA2, tVarF, aVar, eVarE, hVarB2, bVarA, eVar, dVar, aVarA8, oVar.f159711p.b());
    }

    private final Object w() {
        i9e.k kVar = (i9e.k) this.e;
        int i = this.f126091c;
        if (i == 0) {
            jki.p pVar = (jki.p) kVar.f159691b.get();
            BlockSubscriptionScreenContract$InputData blockSubscriptionScreenContract$InputData = kVar.f159690a;
            xua.a aVarA = ((i9e.o) this.f126090b).f159703b.a();
            vc.s.j(aVarA);
            return new n9e.i(pVar, blockSubscriptionScreenContract$InputData, aVarA);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        i9e.o oVar = ((i9e.h) this.d).f159679b;
        mae.p factory = oVar.f159704c.e();
        vc.s.j(factory);
        f01.c uiKitResources = oVar.d.g();
        t70.b currenciesLocalization = oVar.e.g();
        vc.s.j(currenciesLocalization);
        m9e.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        return new n9e.k(factory.d(uiKitResources, currenciesLocalization));
    }

    @Override // phm.a
    public final Object get() {
        Object cVar;
        Object fVar;
        Object zVar;
        Object gVar;
        Object mVar;
        Object fVar2;
        switch (this.f126089a) {
            case 0:
                a aVar = (a) this.d;
                c cVar2 = (c) this.f126090b;
                p pVar = (p) this.e;
                int i = this.f126091c;
                switch (i) {
                    case 0:
                        return f9f.b.A(pVar.f126092a, pVar.f126094b, (com.revolut.kompot.navigable.a) pVar.i.get(), ((tc7.d) cVar2.J).j());
                    case 1:
                        return s2l.c.j((r60.b) pVar.f126104l.get());
                    case 2:
                        return s2l.c.q((com.revolut.kompot.navigable.a) pVar.i.get(), (p0) pVar.k.get(), kxa.j.o(new nji.b()));
                    case 3:
                        return new p0();
                    case 4:
                        fd6.a aVar2 = (fd6.a) pVar.o.get();
                        va.g.t(aVar2);
                        return aVar2;
                    case 5:
                        return va.g.s(((zc6.a) cVar2.M).d(), (xc6.a) pVar.f126106n.get());
                    case 6:
                        return r6.b.k((zc6.a) cVar2.M, "factory");
                    case 7:
                        Object impl = (j60.a) pVar.f126110q.get();
                        Intrinsics.checkNotNullParameter(impl, "impl");
                        yji.d dVar = (yji.d) impl;
                        vc.s.k(dVar);
                        return dVar;
                    case 8:
                        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) pVar.i.get();
                        he2.b dialogHostFinder = kxa.j.o(new nji.b());
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
                        cVar = new j60.c(controller, new rp0.m(), dialogHostFinder);
                        return cVar;
                    case 9:
                        return ufg.p0.z((Map) pVar.F.get());
                    case 10:
                        return ufg.p0.B((com.revolut.kompot.navigable.a) pVar.i.get(), n.r(), (Map) pVar.E.get());
                    case 11:
                        return ufg.p0.A(pVar.b());
                    case 12:
                        k0 provider = ((yy5.b) cVar2.f125993t).d();
                        Intrinsics.checkNotNullParameter(provider, "provider");
                        return provider;
                    case 13:
                        pfe.d provider2 = ((c89.a) cVar2.u).a();
                        vc.s.j(provider2);
                        Intrinsics.checkNotNullParameter(provider2, "provider");
                        return provider2;
                    case 14:
                        pfe.d provider3 = ((k78.b) cVar2.i).r();
                        vc.s.j(provider3);
                        Intrinsics.checkNotNullParameter(provider3, "provider");
                        return provider3;
                    case 15:
                        pfe.d provider4 = ((eqe.a) cVar2.f125980j).a();
                        vc.s.j(provider4);
                        Intrinsics.checkNotNullParameter(provider4, "provider");
                        return provider4;
                    case 16:
                        pfe.d provider5 = ((c6e.a) cVar2.f).a();
                        vc.s.j(provider5);
                        Intrinsics.checkNotNullParameter(provider5, "provider");
                        return provider5;
                    case 17:
                        pfe.d provider6 = ((fob.a) cVar2.k).d();
                        vc.s.j(provider6);
                        Intrinsics.checkNotNullParameter(provider6, "provider");
                        return provider6;
                    case 18:
                        pfe.d provider7 = ((t15.d) cVar2.f125978h).g();
                        vc.s.j(provider7);
                        Intrinsics.checkNotNullParameter(provider7, "provider");
                        return provider7;
                    case 19:
                        pfe.d provider8 = ((yha.a) cVar2.o).c();
                        vc.s.j(provider8);
                        Intrinsics.checkNotNullParameter(provider8, "provider");
                        return provider8;
                    case 20:
                        pfe.d provider9 = ((q1) cVar2.f125977g).a();
                        vc.s.j(provider9);
                        Intrinsics.checkNotNullParameter(provider9, "provider");
                        return provider9;
                    case 21:
                        pfe.d provider10 = ((q38.b) cVar2.f125984n).c();
                        vc.s.j(provider10);
                        Intrinsics.checkNotNullParameter(provider10, "provider");
                        return provider10;
                    case 22:
                        pfe.d provider11 = ((q38.b) cVar2.f125984n).a();
                        vc.s.j(provider11);
                        Intrinsics.checkNotNullParameter(provider11, "provider");
                        return provider11;
                    case 23:
                        pVar.getClass();
                        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(8);
                        yfe.a aVar3 = yfe.a.Crypto;
                        c cVar3 = pVar.f126099g;
                        yfe.d dVarA = cVar3.A.a();
                        vc.s.j(dVarA);
                        builderBuilderWithExpectedSize.put(aVar3, dVarA);
                        builderBuilderWithExpectedSize.put(yfe.a.Invest, ((mkh.s) cVar3.B).c());
                        yfe.a aVar4 = yfe.a.Credit;
                        yfe.d dVarF = ((t15.d) cVar3.f125978h).f();
                        vc.s.j(dVarF);
                        builderBuilderWithExpectedSize.put(aVar4, dVarF);
                        yfe.a aVar5 = yfe.a.Joint;
                        yfe.d dVarB = ((q38.b) cVar3.f125984n).b();
                        vc.s.j(dVarB);
                        builderBuilderWithExpectedSize.put(aVar5, dVarB);
                        yfe.a aVar6 = yfe.a.Pro;
                        yfe.d dVarB2 = ((yha.a) cVar3.o).b();
                        vc.s.j(dVarB2);
                        builderBuilderWithExpectedSize.put(aVar6, dVarB2);
                        yfe.a aVar7 = yfe.a.Youth;
                        yfe.d dVarS = ((k78.b) cVar3.i).s();
                        vc.s.j(dVarS);
                        builderBuilderWithExpectedSize.put(aVar7, dVarS);
                        yfe.a aVar8 = yfe.a.Savings;
                        yfe.d dVarE = ((fob.a) cVar3.k).e();
                        vc.s.j(dVarE);
                        builderBuilderWithExpectedSize.put(aVar8, dVarE);
                        yfe.a aVar9 = yfe.a.Linked;
                        yfe.d dVarE2 = ((t) cVar3.z).e();
                        vc.s.j(dVarE2);
                        builderBuilderWithExpectedSize.put(aVar9, dVarE2);
                        ImmutableMap immutableMapBuild = builderBuilderWithExpectedSize.build();
                        oqk.l lVarB = cVar3.E.b();
                        vc.s.j(lVarB);
                        a aVar10 = pVar.f126100h;
                        nhe.t provider12 = new nhe.t(immutableMapBuild, lVarB, (ahe.n) aVar10.f125944s.get(), (ahe.t) aVar10.v.get(), new uge.e(), cVar3.f125988q.a(), cVar3.f125998x.c(), cVar3.f125983m.e(), new nhe.g(), new c0(cVar3.P.b()));
                        Intrinsics.checkNotNullParameter(provider12, "provider");
                        return provider12;
                    case 24:
                        return xb1.a.C((j60.a) pVar.H.get());
                    case 25:
                        return xb1.a.e((com.revolut.kompot.navigable.a) pVar.i.get(), new j60.e());
                    case 26:
                        h60.d dVar2 = (h60.d) pVar.J.get();
                        kk8.e eVar = (kk8.e) ((jk8.a) cVar2.Q).k.get();
                        vc.s.j(eVar);
                        return new aah.g(dVar2, eVar);
                    case 27:
                        com.revolut.kompot.navigable.a aVar11 = (com.revolut.kompot.navigable.a) pVar.i.get();
                        i60.b.Companion.getClass();
                        return b.a.a(aVar11);
                    case 28:
                        wn.a extension = (wn.a) pVar.L.get();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        vc.s.k(extension);
                        return extension;
                    case 29:
                        return v7.z(cVar2.R, "provider");
                    case 30:
                        b0 extension2 = (b0) pVar.N.get();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        vc.s.k(extension2);
                        return extension2;
                    case 31:
                        b0 extension3 = new b0(pVar.f126094b, (wn.a) pVar.L.get());
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        return extension3;
                    case 32:
                        itg.a factory = (itg.a) cVar2.S.f.get();
                        vc.s.j(factory);
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        dtg.a aVar12 = factory.f168379a;
                        vc.s.k(aVar12);
                        return aVar12;
                    case 33:
                        return pge.b.a((oge.f) pVar.Q.get());
                    case 34:
                        fVar = new oge.f((z2) aVar.B.get(), zge.j.f322121a);
                        return fVar;
                    case 35:
                        return va.g.u((xc6.a) pVar.f126106n.get());
                    case 36:
                        i49.b mainScreenPendingActionsBottomDelegateClickHandler = (i49.b) pVar.T.get();
                        Intrinsics.checkNotNullParameter(mainScreenPendingActionsBottomDelegateClickHandler, "mainScreenPendingActionsBottomDelegateClickHandler");
                        vc.s.k(mainScreenPendingActionsBottomDelegateClickHandler);
                        return mainScreenPendingActionsBottomDelegateClickHandler;
                    case 37:
                        k49.m mainScreenPendingActionsBottomDelegateClickHandlerProvider = (k49.m) cVar2.L.f202680c.get();
                        vc.s.j(mainScreenPendingActionsBottomDelegateClickHandlerProvider);
                        j60.a bottomDialogExtension = (j60.a) pVar.f126110q.get();
                        Intrinsics.checkNotNullParameter(mainScreenPendingActionsBottomDelegateClickHandlerProvider, "mainScreenPendingActionsBottomDelegateClickHandlerProvider");
                        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
                        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
                        cVar = new k49.l(mainScreenPendingActionsBottomDelegateClickHandlerProvider.f180864a, bottomDialogExtension, mainScreenPendingActionsBottomDelegateClickHandlerProvider.f180865b);
                        return cVar;
                    case 38:
                        return ufg.p0.y((Map) pVar.W.get());
                    case 39:
                        ImmutableMap immutableMapB = pVar.b();
                        Map map = (Map) pVar.F.get();
                        l0 l0Var = (l0) pVar.V.get();
                        gte.a aVarB = pVar.f126099g.v.b();
                        vc.s.j(aVarB);
                        return ufg.p0.g(immutableMapB, map, l0Var, new vhe.a(aVarB), (com.revolut.kompot.navigable.a) pVar.i.get());
                    case 40:
                        return ufg.p0.v((com.revolut.kompot.navigable.a) pVar.i.get());
                    case 41:
                        dte.b extension4 = (dte.b) pVar.Y.get();
                        Intrinsics.checkNotNullParameter(extension4, "extension");
                        vc.s.k(extension4);
                        return extension4;
                    case 42:
                        ete.a factory2 = (ete.a) cVar2.U.f324910h.get();
                        vc.s.j(factory2);
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        return factory2.a();
                    case 43:
                        return xb1.a.D((sb7.b) pVar.f126093a0.get());
                    case 44:
                        xb7.b bVarA = cVar2.V.a();
                        vc.s.j(bVarA);
                        return xb1.a.i(bVarA, (j60.a) pVar.H.get());
                    case 45:
                        cc7.l extension5 = new cc7.l((j60.a) pVar.H.get(), (sb7.b) pVar.f126093a0.get());
                        Intrinsics.checkNotNullParameter(extension5, "extension");
                        return extension5;
                    case 46:
                        mkd.g view = pVar.f126096c;
                        rkd.m factory3 = cVar2.K.a();
                        vc.s.j(factory3);
                        fie.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(view, "view");
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        return factory3.a(view);
                    case 47:
                        ta9.m mVar2 = cVar2.W;
                        kmg.a aVar13 = cVar2.Z;
                        q89.e eVarA = mVar2.a();
                        vc.s.j(eVarA);
                        lfa.b bVarA2 = cVar2.X.a();
                        w51.a aVarB2 = cVar2.Y.b();
                        vc.s.j(aVarB2);
                        skd.i iVarC = cVar2.K.c();
                        eie.a aVar14 = (eie.a) aVar.F.get();
                        emg.a aVarA = aVar13.a();
                        vc.s.j(aVarA);
                        emg.a aVarB3 = aVar13.b();
                        vc.s.j(aVarB3);
                        v vVarC = pVar.c();
                        a aVar15 = pVar.f126100h;
                        zVar = new z(eVarA, bVarA2, aVarB2, iVarC, aVar14, aVarA, aVarB3, vVarC, new zq.a((vge.d) aVar15.D.get(), (z2) aVar15.B.get()));
                        return zVar;
                    case 48:
                        emg.a aVarA2 = cVar2.Z.a();
                        vc.s.j(aVarA2);
                        emg.a aVarB4 = cVar2.Z.b();
                        vc.s.j(aVarB4);
                        eie.a aVar16 = (eie.a) aVar.F.get();
                        mkd.d dVar3 = (mkd.d) pVar.f126097d0.get();
                        a aVar17 = pVar.f126100h;
                        cVar = new gie.s(aVarA2, aVarB4, aVar16, new cie.z(dVar3, (z2) aVar17.B.get(), new w(pVar.f126099g.f125967a0.b(), pVar.j()), (vge.d) aVar17.D.get()), pVar.c(), (mkd.d) pVar.f126097d0.get(), (gie.a) pVar.f0.get(), (sri.m) pVar.g0.get());
                        return cVar;
                    case 49:
                        u uVar = (u) cVar2.c0.Q.get();
                        vc.s.j(uVar);
                        return new gie.e(uVar);
                    case 50:
                        Context context = cVar2.C;
                        fie.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        return sri.o.c(context, null, null, 14);
                    case 51:
                        return new gie.i((lie.b) pVar.j0.get(), (rxl.b) pVar.l0.get());
                    case 52:
                        ite.a aVar18 = cVar2.v;
                        kmg.a aVar19 = cVar2.Z;
                        gte.a aVarB5 = aVar18.b();
                        vc.s.j(aVarB5);
                        ang.f fVarE = cVar2.f125983m.e();
                        vge.d dVar4 = (vge.d) aVar.D.get();
                        n30.n nVarK = ((h30.n) cVar2.f125973d0).k();
                        v vVarC2 = pVar.c();
                        skd.i iVarC2 = cVar2.K.c();
                        emg.a aVarA3 = aVar19.a();
                        vc.s.j(aVarA3);
                        emg.a aVarB6 = aVar19.b();
                        vc.s.j(aVarB6);
                        lie.l lVar = (lie.l) pVar.i0.get();
                        qge.b bVar = (qge.b) cVar2.f125992s0.get();
                        wxl.a aVar20 = (wxl.a) cVar2.f125966a.f293101g.get();
                        vc.s.j(aVar20);
                        return new lie.i(aVarB5, fVarE, dVar4, nVarK, vVarC2, iVarC2, aVarA3, aVarB6, lVar, bVar, aVar20);
                    case 53:
                        vxl.a aVar21 = cVar2.f125966a;
                        l70.e eVar2 = cVar2.T;
                        wxl.a aVar22 = (wxl.a) aVar21.f293101g.get();
                        vc.s.j(aVar22);
                        l80.e eVarH = eVar2.h();
                        vc.s.j(eVarH);
                        b70.e eVarB = eVar2.b();
                        vc.s.j(eVarB);
                        return new lie.l(aVar22, eVarH, eVarB, ((h30.n) cVar2.f125973d0).t());
                    case 54:
                        Activity activity = (Activity) pVar.f126103k0.get();
                        rxl.a aVar23 = (rxl.a) cVar2.f125966a.f293102h.get();
                        vc.s.j(aVar23);
                        return f9f.b.m(activity, aVar23);
                    case 55:
                        ViewController viewController = pVar.d;
                        fie.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(viewController, "viewController");
                        Activity activityM2 = viewController.m2();
                        vc.s.k(activityM2);
                        return activityM2;
                    case 56:
                        fVar = new iie.b((List) pVar.f126108o0.get(), (z2) aVar.B.get());
                        return fVar;
                    case 57:
                        a aVar24 = pVar.f126100h;
                        vge.d dVar5 = (vge.d) aVar24.D.get();
                        c cVar4 = pVar.f126099g;
                        jie.f fVar3 = new jie.f(dVar5, ((zc6.a) cVar4.M).b(), ((zc6.a) cVar4.M).c(), e4m.b.a(aVar24.v), new jhe.i());
                        pfe.i iVar = (pfe.i) pVar.f126107n0.get();
                        u45.h hVar = cVar2.g0;
                        m35.g gVar2 = (m35.g) hVar.E.get();
                        y45.i iVarI = hVar.f277124a.i();
                        vc.s.j(iVarI);
                        q55.b bVar2 = new q55.b(gVar2, iVarI);
                        am4.a aVar25 = (am4.a) cVar2.f125979h0.f176258b.get();
                        vc.s.j(aVar25);
                        return f9f.b.B(fVar3, iVar, bVar2, aVar25);
                    case 58:
                        vge.d dVar6 = (vge.d) aVar.D.get();
                        l61.a aVarB7 = cVar2.f125983m.b();
                        vc.s.j(aVarB7);
                        mre.c cVarB = cVar2.f125975e0.b();
                        vc.s.j(cVarB);
                        fVar = new kie.g(dVar6, aVarB7, cVarB, cVar2.f0.b());
                        return fVar;
                    case 59:
                        return j40.h.a(((h30.n) cVar2.f125973d0).s());
                    case 60:
                        c cVar5 = pVar.f126099g;
                        c cVar6 = pVar.f126099g;
                        a aVar26 = pVar.f126100h;
                        i49.a aVar27 = (i49.a) cVar5.L.f202679b.get();
                        vc.s.j(aVar27);
                        mkd.d dVar7 = (mkd.d) pVar.f126097d0.get();
                        die.b bVar3 = new die.b(new wqi.a());
                        cie.u uVar2 = new cie.u();
                        itb.c cVarB2 = cVar5.i0.b();
                        vc.s.j(cVarB2);
                        cie.c0 c0VarJ = pVar.j();
                        a0 a0Var = new a0(cVar5.f125969b0.a());
                        cie.t tVar = new cie.t(new w(cVar6.f125967a0.b(), pVar.j()));
                        gte.a aVarB8 = cVar5.v.b();
                        vc.s.j(aVarB8);
                        w2 dependencies = aVar26.f125932a;
                        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
                        o1 o1Var = new o1(aVar27, dVar7, bVar3, uVar2, cVarB2, c0VarJ, a0Var, tVar, aVarB8, (vie.f) dependencies.d);
                        TabAccountsScreenContract$InputData tabAccountsScreenContract$InputData = pVar.e;
                        i49.b bVar4 = (i49.b) pVar.T.get();
                        ang.f fVarE2 = cVar2.f125983m.e();
                        z2 z2Var = (z2) aVar.B.get();
                        vge.d dVar8 = (vge.d) aVar.D.get();
                        oge.f fVar4 = (oge.f) pVar.Q.get();
                        the.a aVar28 = (the.a) pVar.f126112r0.get();
                        w8i.b bVar5 = (w8i.b) cVar2.j0.d.get();
                        vc.s.j(bVar5);
                        x xVarD = ((s41.a) cVar2.f125981k0).d();
                        wif.a aVarA4 = cVar2.l0.a();
                        sb7.b bVar6 = (sb7.b) pVar.f126093a0.get();
                        wa7.m mVarI = cVar2.f125991s.i();
                        za7.b bVar7 = new za7.b();
                        zq.a aVar29 = new zq.a((vge.d) aVar26.D.get(), (z2) aVar26.B.get());
                        mkd.d dVar9 = (mkd.d) pVar.f126097d0.get();
                        fc7.h modelExtensionHolder = (fc7.h) pVar.f126102j.get();
                        Intrinsics.checkNotNullParameter(modelExtensionHolder, "modelExtensionHolder");
                        nsh.o oVar = modelExtensionHolder.f133655a;
                        yii.c cVar7 = (yii.c) cVar2.m0.f263491g.get();
                        vc.s.j(cVar7);
                        ntb.c cVar8 = (ntb.c) cVar2.f125985n0.f229578a.get();
                        vc.s.j(cVar8);
                        cie.u uVar3 = new cie.u();
                        wn.a aVar30 = (wn.a) pVar.L.get();
                        gte.a aVarB9 = cVar2.v.b();
                        vc.s.j(aVarB9);
                        fhe.a aVarA5 = hhe.c.a();
                        sjf.e eVarD = ((bjf.a) cVar2.G).d();
                        vc.s.j(eVarD);
                        iie.a aVar31 = (iie.a) pVar.p0.get();
                        uc7.a aVar32 = (uc7.a) ((tc7.d) cVar2.J).U2.get();
                        vc.s.j(aVar32);
                        f0 f0Var = pVar.f;
                        rkd.g gVar3 = cVar6.K;
                        f4h.a aVar33 = new f4h.a(new lld.p(), new mp.p((the.a) pVar.f126112r0.get(), new hie.a(), (z2) aVar26.B.get()));
                        gie.j jVar = (gie.j) pVar.f126101h0.get();
                        gie.t tVar2 = (gie.t) pVar.f126098e0.get();
                        utk.f fVarJ = cVar2.f125986o0.f136167c.j();
                        j40.a aVar34 = (j40.a) pVar.q0.get();
                        p1 p1Var = new p1();
                        kbb.c cVarA = cVar2.i0.a();
                        whe.c cVar9 = (whe.c) pVar.f126114s0.get();
                        r10.q qVarD = cVar2.f125983m.d();
                        x48.k kVarB = ((q38.b) cVar2.f125984n).u.b();
                        gie.a aVar35 = (gie.a) pVar.f0.get();
                        hl2.a aVar36 = (hl2.a) cVar2.q0.f185272q.get();
                        vc.s.j(aVar36);
                        uge.e eVar3 = new uge.e();
                        w2 dependencies2 = aVar.f125932a;
                        Intrinsics.checkNotNullParameter(dependencies2, "dependencies");
                        vie.e eVar4 = (vie.e) dependencies2.f;
                        d4m.a aVarA6 = e4m.b.a(aVar.v);
                        c70.a aVarZ = cVar2.T.z();
                        vc.s.j(aVarZ);
                        return new com.revolut.feature.tab.accounts.impl.ui.tab.d(o1Var, tabAccountsScreenContract$InputData, bVar4, fVarE2, z2Var, dVar8, fVar4, aVar28, bVar5, xVarD, aVarA4, bVar6, mVarI, bVar7, aVar29, dVar9, oVar, cVar7, cVar8, uVar3, aVar30, aVarB9, aVarA5, eVarD, aVar31, aVar32, f0Var, aVar33, jVar, tVar2, fVarJ, aVar34, p1Var, cVarA, cVar9, qVarD, kVarB, aVar35, aVar36, eVar3, eVar4, aVarA6, aVarZ, (gie.f) pVar.m0.get(), (qge.b) cVar2.f125992s0.get());
                    case 61:
                        return new the.a((Map) pVar.W.get());
                    case 62:
                        CoroutineScope coroutineScope = (CoroutineScope) aVar.d.get();
                        com.revolut.analytics.tracking.v3.d dVarF2 = cVar2.p0.f();
                        vc.s.j(dVarF2);
                        sjf.e eVarD2 = ((bjf.a) cVar2.G).d();
                        vc.s.j(eVarD2);
                        zVar = new whe.c(coroutineScope, dVarF2, eVarD2);
                        return zVar;
                    case 63:
                        os2.g factory4 = cVar2.R.c();
                        Intrinsics.checkNotNullParameter(factory4, "factory");
                        return (sn.a) factory4.f229224b;
                    default:
                        throw new AssertionError(i);
                }
            case 1:
                return a();
            case 2:
                erj.h hVar2 = (erj.h) this.f126090b;
                erj.l lVar2 = (erj.l) this.e;
                SetCategoryBudgetsScreenContract$InputData inputData = lVar2.f128717a;
                erj.h hVar3 = lVar2.f128718b;
                int i2 = this.f126091c;
                if (i2 == 0) {
                    return kxa.j.l((j60.a) lVar2.e.get());
                }
                if (i2 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) lVar2.f128719c.get(), (rp0.m) lVar2.d.get());
                }
                if (i2 == 2) {
                    return new rp0.m();
                }
                if (i2 != 3) {
                    throw new AssertionError(i2);
                }
                ge3.e eVarD3 = hVar2.f128694g.d();
                vc.s.j(eVarD3);
                grj.j jVar2 = (grj.j) hVar2.E.get();
                tzi.a aVarA7 = hVar2.i.a();
                vc.s.j(aVarA7);
                pzi.b bVar8 = (pzi.b) hVar2.z.get();
                mrj.a aVar37 = (mrj.a) hVar2.F.get();
                qd0.b languageProvider = hVar3.e.n();
                vc.s.j(languageProvider);
                dsj.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                w80.b bVarB = v80.b.b(languageProvider, false, false, 62);
                thf.c categoryResourcesMapper = hVar3.f128699n.c();
                vc.s.j(categoryResourcesMapper);
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(categoryResourcesMapper, "categoryResourcesMapper");
                r10.w wVar = new r10.w();
                wVar.f250865a = inputData;
                wVar.f250866b = categoryResourcesMapper;
                j60.a aVar38 = (j60.a) lVar2.e.get();
                zrj.a aVar39 = new zrj.a();
                asj.j jVar3 = (asj.j) ((erj.k) this.d).d.get();
                thf.c cVarC = hVar3.f128699n.c();
                vc.s.j(cVarC);
                return new csj.u(eVarD3, jVar2, aVarA7, bVar8, aVar37, bVarB, wVar, aVar38, aVar39, jVar3, inputData, new csj.x(cVarC, inputData));
            case 3:
                erj.h hVar4 = (erj.h) this.f126090b;
                erj.m mVar3 = (erj.m) this.e;
                SetOverallBudgetScreenContract$InputData setOverallBudgetScreenContract$InputData = mVar3.f128721a;
                int i3 = this.f126091c;
                if (i3 == 0) {
                    return kxa.j.l((j60.a) mVar3.e.get());
                }
                if (i3 == 1) {
                    return h30.l.p((com.revolut.kompot.navigable.a) mVar3.f128723c.get(), (rp0.m) mVar3.d.get());
                }
                if (i3 == 2) {
                    return new rp0.m();
                }
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new AssertionError(i3);
                    }
                    ldd.a factory5 = new ldd.a();
                    fsj.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory5, "factory");
                    return new ldd.b();
                }
                tzi.a aVarA8 = hVar4.i.a();
                vc.s.j(aVarA8);
                pzi.b bVar9 = (pzi.b) hVar4.z.get();
                mrj.a aVar40 = (mrj.a) hVar4.F.get();
                grj.j jVar4 = (grj.j) hVar4.E.get();
                w80.b bVarD = mVar3.d();
                asj.j jVar5 = (asj.j) ((erj.k) this.d).d.get();
                esj.a aVar41 = new esj.a();
                j60.a aVar42 = (j60.a) mVar3.e.get();
                zrj.b bVar10 = new zrj.b();
                zrj.a aVar43 = new zrj.a();
                ldd.b bVar11 = (ldd.b) mVar3.f128724g.get();
                wsg.n nVarB = hVar4.f.b();
                cmd.b bVar12 = (cmd.b) mVar3.f128722b.f128698m.G0.get();
                vc.s.j(bVar12);
                return new esj.c0(aVarA8, bVar9, aVar40, jVar4, bVarD, jVar5, aVar41, aVar42, bVar10, aVar43, setOverallBudgetScreenContract$InputData, bVar11, nVarB, new esj.f0(bVar12, new u80.o(), mVar3.d(), setOverallBudgetScreenContract$InputData, (ldd.b) mVar3.f128724g.get()));
            case 4:
                ewg.e eVar5 = (ewg.e) this.e;
                int i5 = this.f126091c;
                if (i5 != 0) {
                    if (i5 == 1) {
                        return new bxg.y();
                    }
                    throw new AssertionError(i5);
                }
                dxg.a assetValueMapper = new dxg.a();
                Intrinsics.checkNotNullParameter(assetValueMapper, "assetValueMapper");
                dxg.b stockAssetMapper = new dxg.b();
                bxg.w sortOrderMapper = new bxg.w();
                Intrinsics.checkNotNullParameter(stockAssetMapper, "stockAssetMapper");
                Intrinsics.checkNotNullParameter(sortOrderMapper, "sortOrderMapper");
                return new com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.a(new bxg.x(), (bxg.j) eVar5.f130183c.get(), ((ewg.k) this.d).f130232c, eVar5.f130181a, ((ewg.h) this.f126090b).b(), new wwg.a(eVar5.f130182b.f130211s.g()));
            case 5:
                ewg.k kVar = (ewg.k) this.d;
                ewg.h hVar5 = (ewg.h) this.f126090b;
                zdl.c cVar10 = hVar5.f130205n;
                ewg.i iVar2 = (ewg.i) this.e;
                ewg.h hVar6 = iVar2.f130218c;
                int i6 = this.f126091c;
                switch (i6) {
                    case 0:
                        return new aah.g(iVar2.f130216a, (pyg.a) iVar2.e.get());
                    case 1:
                        return new pyg.g((v9j.a) iVar2.d.get());
                    case 2:
                        w9j.a aVarA9 = hVar5.f130209q.a();
                        vc.s.j(aVarA9);
                        return qw7.u.m(aVarA9);
                    case 3:
                        WidgetisedAnalyticsAllocationScreenContract$InputData widgetisedAnalyticsAllocationScreenContract$InputData = iVar2.f130217b;
                        uyg.h hVarB = iVar2.b();
                        uyg.k kVar2 = new uyg.k();
                        fyg.a aVar44 = (fyg.a) iVar2.f130219g.get();
                        dbj.a aVar45 = hVar6.f130210r;
                        ite.a aVar46 = hVar6.k;
                        bbj.c cVarA2 = aVar45.a();
                        vc.s.j(cVarA2);
                        gte.a aVarB10 = aVar46.b();
                        vc.s.j(aVarB10);
                        pyg.i iVar3 = new pyg.i(cVarA2, aVarB10);
                        gte.a aVarB11 = aVar46.b();
                        vc.s.j(aVarB11);
                        dyg.r rVar = new dyg.r(hVarB, kVar2, aVar44, iVar3, aVarB11);
                        tyg.h hVar7 = (tyg.h) iVar2.i.get();
                        oxg.m mVar4 = (oxg.m) iVar2.f130221j.get();
                        kbb.c cVarB3 = kVar.b();
                        byg.a aVar47 = new byg.a();
                        l0 l0Var2 = (l0) iVar2.f130222l.get();
                        w9j.e eVarB2 = hVar6.f130209q.b();
                        vc.s.j(eVarB2);
                        return new com.revolut.feature.wealth.analytics.ui.widgetised.allocation.a(widgetisedAnalyticsAllocationScreenContract$InputData, rVar, hVar7, mVar4, cVarB3, aVar47, l0Var2, new tyg.a(eVarB2), hVar5.d(), kVar.f130232c);
                    case 4:
                        gte.a aVarB12 = hVar6.k.b();
                        vc.s.j(aVarB12);
                        kxg.b bVar13 = new kxg.b(aVarB12);
                        gte.a aVarB13 = hVar6.k.b();
                        vc.s.j(aVarB13);
                        kxg.b bVar14 = new kxg.b(aVarB13);
                        hyg.b bVar15 = new hyg.b();
                        l80.e eVarH2 = hVar6.f130195c.h();
                        vc.s.j(eVarH2);
                        gte.a aVarB14 = hVar6.k.b();
                        vc.s.j(aVarB14);
                        gyg.m mVar5 = new gyg.m(bVar14, bVar15, eVarH2, aVarB14);
                        uyg.h hVarB2 = iVar2.b();
                        gte.a aVarB15 = hVar5.k.b();
                        vc.s.j(aVarB15);
                        gVar = new fyg.g(bVar13, mVar5, hVarB2, aVarB15);
                        return gVar;
                    case 5:
                        gVar = new tyg.h((xxg.a) iVar2.f130220h.get(), hVar5.d());
                        return gVar;
                    case 6:
                        ybl.b bVarB2 = cVar10.b();
                        vc.s.j(bVarB2);
                        mVar = new xxg.m(bVarB2, (kwg.l) kVar.c(), hVar5.d(), hVar5.o.a());
                        return mVar;
                    case 7:
                        tzg.m mVarT = hVar5.i.t();
                        vc.s.j(mVarT);
                        ybl.d dVarH = cVar10.h();
                        vc.s.j(dVarH);
                        bwg.a aVar48 = new bwg.a();
                        gwg.a aVar49 = kVar.f130231b;
                        clc.b bVarA3 = hVar5.f130208p.a();
                        vc.s.j(bVarA3);
                        mVar = new oxg.q(mVarT, dVarH, aVar48, aVar49, bVarA3);
                        return mVar;
                    case 8:
                        com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) iVar2.k.get();
                        eyg.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller2, "controller");
                        return new l0(controller2.m2());
                    default:
                        throw new AssertionError(i6);
                }
            case 6:
                return b();
            case 7:
                ewg.k kVar3 = (ewg.k) this.d;
                ewg.h hVar8 = (ewg.h) this.f126090b;
                ewg.n nVar = (ewg.n) this.e;
                int i21 = this.f126091c;
                switch (i21) {
                    case 0:
                        return new aah.g(nVar.f130249a, (pyg.a) nVar.f.get());
                    case 1:
                        return new pyg.g((v9j.a) nVar.e.get());
                    case 2:
                        w9j.a aVarA10 = hVar8.f130209q.a();
                        vc.s.j(aVarA10);
                        return qw7.u.m(aVarA10);
                    case 3:
                        WidgetisedAnalyticsTotalValueScreenContract$InputData widgetisedAnalyticsTotalValueScreenContract$InputData = nVar.f130250b;
                        ewg.k kVar4 = nVar.d;
                        ewg.h hVar9 = nVar.f130251c;
                        gte.a aVarB16 = hVar9.k.b();
                        vc.s.j(aVarB16);
                        uyg.e eVar6 = new uyg.e(aVarB16);
                        uyg.c cVar11 = new uyg.c();
                        ite.a aVar50 = hVar9.k;
                        gte.a aVarB17 = aVar50.b();
                        vc.s.j(aVarB17);
                        izg.a aVar51 = new izg.a(eVar6, cVar11, aVarB17, new gzg.c());
                        mxg.a aVar52 = (mxg.a) nVar.i.get();
                        nxg.a aVar53 = (nxg.a) nVar.f130254j.get();
                        gte.a aVarB18 = aVar50.b();
                        vc.s.j(aVarB18);
                        gyg.o oVar2 = new gyg.o(new kxg.e(new kxg.b(aVarB18), aVar52, aVar53));
                        gte.a aVarB19 = hVar9.k.b();
                        vc.s.j(aVarB19);
                        uyg.e eVar7 = new uyg.e(aVarB19);
                        tyg.j jVarD = hVar9.d();
                        nmc.d dVarD = hVar9.f130204m.d();
                        gte.a aVarB20 = aVar50.b();
                        vc.s.j(aVarB20);
                        uyg.h hVar10 = new uyg.h(jVarD, dVarD, aVarB20);
                        uyg.k kVar5 = new uyg.k();
                        bbj.c cVarA3 = hVar9.f130210r.a();
                        vc.s.j(cVarA3);
                        gte.a aVarB21 = aVar50.b();
                        vc.s.j(aVarB21);
                        pyg.i iVar4 = new pyg.i(cVarA3, aVarB21);
                        gte.a aVarB22 = aVar50.b();
                        vc.s.j(aVarB22);
                        gzg.d0 d0Var = new gzg.d0(aVar51, oVar2, eVar7, hVar10, kVar5, iVar4, aVarB22, new gzg.c());
                        tyg.f fVar5 = (tyg.f) nVar.k.get();
                        gzg.b bVar16 = new gzg.b(kVar4.f130232c);
                        gzg.a aVar54 = new gzg.a(kVar4.f130232c);
                        tzg.m mVarT2 = hVar9.i.t();
                        vc.s.j(mVarT2);
                        ybl.d dVarH2 = hVar9.f130205n.h();
                        vc.s.j(dVarH2);
                        bwg.a aVar55 = new bwg.a();
                        gwg.a aVar56 = kVar4.f130231b;
                        clc.b bVarA4 = hVar9.f130208p.a();
                        vc.s.j(bVarA4);
                        oxg.q qVar = new oxg.q(mVarT2, dVarH2, aVar55, aVar56, bVarA4);
                        tyg.h hVar11 = (tyg.h) nVar.f130256m.get();
                        byg.a aVar57 = new byg.a();
                        l0 l0Var3 = (l0) nVar.o.get();
                        w9j.e eVarB3 = hVar9.f130209q.b();
                        vc.s.j(eVarB3);
                        return new com.revolut.feature.wealth.analytics.ui.widgetised.total_value.a(widgetisedAnalyticsTotalValueScreenContract$InputData, d0Var, fVar5, bVar16, aVar54, qVar, hVar11, aVar57, l0Var3, new tyg.a(eVarB3), hVar8.d());
                    case 4:
                        return new mxg.b((lxg.a) nVar.f130253h.get());
                    case 5:
                        return new lxg.b();
                    case 6:
                        return new nxg.b();
                    case 7:
                        fVar2 = new tyg.f((kwg.l) kVar3.c(), hVar8.d());
                        break;
                    case 8:
                        return new tyg.h((xxg.a) nVar.f130255l.get(), hVar8.d());
                    case 9:
                        ybl.b bVarB3 = hVar8.f130205n.b();
                        vc.s.j(bVarB3);
                        fVar2 = new xxg.m(bVarB3, (kwg.l) kVar3.c(), hVar8.d(), hVar8.o.a());
                        break;
                    case 10:
                        com.revolut.kompot.navigable.a controller3 = (com.revolut.kompot.navigable.a) nVar.f130257n.get();
                        hzg.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller3, "controller");
                        return new l0(controller3.m2());
                    default:
                        throw new AssertionError(i21);
                }
                return fVar2;
            case 8:
                return c();
            case 9:
                return d();
            case 10:
                return e();
            case 11:
                return f();
            case 12:
                return g();
            case 13:
                return h();
            case 14:
                return i();
            case 15:
                return j();
            case 16:
                return k();
            case 17:
                return l();
            case 18:
                return m();
            case 19:
                return n();
            case 20:
                return o();
            case 21:
                return p();
            case 22:
                return q();
            case 23:
                return r();
            case 24:
                return s();
            case 25:
                return t();
            case 26:
                return u();
            case 27:
                return v();
            case 28:
                return w();
            default:
                if2.a aVar58 = (if2.a) this.e;
                if2.f fVar6 = (if2.f) this.f126090b;
                int i22 = this.f126091c;
                if (i22 == 0) {
                    return new og2.m(aVar58.f160836a, ((if2.k) this.d).b(), (cli.n) aVar58.f160837b.get());
                }
                if (i22 != 1) {
                    throw new AssertionError(i22);
                }
                l80.e eVarH3 = fVar6.f160851a.h();
                vc.s.j(eVarH3);
                return new og2.o(eVarH3, new t12.b());
        }
    }
}
