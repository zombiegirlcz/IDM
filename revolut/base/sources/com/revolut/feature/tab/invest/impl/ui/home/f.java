package com.revolut.feature.tab.invest.impl.ui.home;

import ael.h0;
import akl.o;
import androidx.work.Constraints;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import au6.a3;
import bk6.n;
import ble.b0;
import ble.c0;
import ble.c1;
import ble.e0;
import ble.g1;
import ble.h1;
import ble.i1;
import ble.j0;
import ble.j1;
import ble.k0;
import ble.k1;
import ble.l0;
import ble.m0;
import ble.m1;
import ble.n0;
import ble.o0;
import ble.o1;
import ble.q;
import ble.r0;
import ble.s0;
import ble.u0;
import ble.w0;
import ble.x;
import ble.y;
import ble.y0;
import ble.z;
import ble.z0;
import bn2.p;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.backgroundpicker.models.RetailBackgroundKey;
import com.revolut.feature.tab.invest.api.TabInvestApi$Toggles;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestControllerContract$ModalStep;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.feature.wealth.impl.domain.workers.TradingTransactionsCleanUpWorker;
import com.revolut.kompot.common.ModalDestination;
import d4f.s;
import d9.e1;
import e7l.g;
import fsl.m;
import gld.f0;
import hih.b;
import ip0.v7;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import oki.h;
import okl.l1;
import org.jetbrains.annotations.NotNull;
import r10.t;
import rle.j;
import vkm.j2;
import vkm.q0;
import vkm.v1;
import vkm.z1;
import w4l.i;
import x8h.p0;
import x8h.t0;
import x8h.v0;
import ybl.k;
import ybl.l;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends h implements q {

    @NotNull
    public static final b0 Companion = new b0();
    public static final Set j0;
    public final p0 A;
    public final utk.f B;
    public final ble.c C;
    public final j40.a D;
    public final q28.a E;
    public final r10.q F;
    public final r10.d G;
    public final k H;
    public final bih.a I;
    public final whh.h J;
    public final sb7.b K;
    public final m L;
    public final cle.f M;
    public final gte.a N;
    public final sxk.a O;
    public final x8h.k P;
    public final mkd.d Q;
    public final eih.a R;
    public final ash.e S;
    public final ble.b T;
    public final tul.b U;
    public final j V;
    public final hle.a W;
    public final d1h.e X;
    public final o5d.a Y;
    public final t5d.f Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ile.a f89870a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final fk3.a f89871b0;
    public final y2f.a c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final s f89872d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final cli.h f89873e0;
    public final com.revolut.kompot.navigable.vc.modal.a f0;
    public boolean g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final z1 f89874h0;
    public final j2 i0;
    public final zke.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xjh.b f89875p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kbb.c f89876q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wif.a f89877r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tzg.m f89878s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l f89879t;
    public final tzg.l u;
    public final p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final kwg.l f89880w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final mbf.a f89881x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a87.c f89882y;
    public final xke.e z;

    static {
        ybl.p[] elements = {ybl.p.TRADING, ybl.p.ROBO};
        Intrinsics.checkNotNullParameter(elements, "elements");
        j0 = kotlin.collections.d.y0(elements);
    }

    public f(zke.g actionsProvider, xjh.b actionsHandler, kbb.c headerUiParamsProvider, wif.a userFeaturesChecker, tzg.m wealthAccountsInteractor, l tradingConfigInteractor, tzg.l accountsBalanceInteractor, p backgroundsInteractor, kwg.l complexAnalyticsInteractor, g stateMapper, mbf.a tradingAddOnsUpsellingFirstEnterProvider, a87.c globalMarketsFeatureInteractor, xke.e complexAnalyticsNavigationProvider, p0 tradingTransactionsCleanUpWorkerInteractor, utk.f profileNotificationInteractor, ble.c investProductIntrosFinishedRelay, j40.a assistantModelExtension, q28.a investFeedWidgetsEventObserver, r10.q userRegisteredIdentitiesInteractor, r10.d legalEntityProviderFactory, k tradingAccountsInteractor, bih.a productWidgetExtension, whh.h accountsClosuresExtension, sb7.b homeNPSWidgetExtension, m investOrdersWidgetProvider, cle.f tradingBannersExtension, gte.a featureToggleInteractor, sxk.a partnerConsentExtension, x8h.k displayCurrencyInteractor, mkd.d slotManagerFeedControllerModelExtension, eih.a availableToOnboardAccountsWidgetProvider, ash.e widgetsControllerModelExtension, ble.b investIntroChecklistAvailabilityProvider, tul.b recurringBuyWidgetProvider, j uspWidgetProvider, hle.a prefetchNonActiveProfilePortfoliosInteractor, d1h.e disclaimersModelExtension, o5d.a swipeAssetTradeActionsExtension, t5d.f swipeableAssetsListItemParser, ile.a tabInvestModalsProvider, fk3.a configurationInteractor, y2f.a tradingTransactionsInteractor, s wealthFeaturesInteractor) {
        Intrinsics.checkNotNullParameter(actionsProvider, "actionsProvider");
        Intrinsics.checkNotNullParameter(actionsHandler, "actionsHandler");
        Intrinsics.checkNotNullParameter(headerUiParamsProvider, "headerUiParamsProvider");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(accountsBalanceInteractor, "accountsBalanceInteractor");
        Intrinsics.checkNotNullParameter(backgroundsInteractor, "backgroundsInteractor");
        Intrinsics.checkNotNullParameter(complexAnalyticsInteractor, "complexAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(tradingAddOnsUpsellingFirstEnterProvider, "tradingAddOnsUpsellingFirstEnterProvider");
        Intrinsics.checkNotNullParameter(globalMarketsFeatureInteractor, "globalMarketsFeatureInteractor");
        Intrinsics.checkNotNullParameter(complexAnalyticsNavigationProvider, "complexAnalyticsNavigationProvider");
        Intrinsics.checkNotNullParameter(tradingTransactionsCleanUpWorkerInteractor, "tradingTransactionsCleanUpWorkerInteractor");
        Intrinsics.checkNotNullParameter(profileNotificationInteractor, "profileNotificationInteractor");
        Intrinsics.checkNotNullParameter(investProductIntrosFinishedRelay, "investProductIntrosFinishedRelay");
        Intrinsics.checkNotNullParameter(assistantModelExtension, "assistantModelExtension");
        Intrinsics.checkNotNullParameter(investFeedWidgetsEventObserver, "investFeedWidgetsEventObserver");
        Intrinsics.checkNotNullParameter(userRegisteredIdentitiesInteractor, "userRegisteredIdentitiesInteractor");
        Intrinsics.checkNotNullParameter(legalEntityProviderFactory, "legalEntityProviderFactory");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(productWidgetExtension, "productWidgetExtension");
        Intrinsics.checkNotNullParameter(accountsClosuresExtension, "accountsClosuresExtension");
        Intrinsics.checkNotNullParameter(homeNPSWidgetExtension, "homeNPSWidgetExtension");
        Intrinsics.checkNotNullParameter(investOrdersWidgetProvider, "investOrdersWidgetProvider");
        Intrinsics.checkNotNullParameter(tradingBannersExtension, "tradingBannersExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(partnerConsentExtension, "partnerConsentExtension");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        Intrinsics.checkNotNullParameter(slotManagerFeedControllerModelExtension, "slotManagerFeedControllerModelExtension");
        Intrinsics.checkNotNullParameter(availableToOnboardAccountsWidgetProvider, "availableToOnboardAccountsWidgetProvider");
        Intrinsics.checkNotNullParameter(widgetsControllerModelExtension, "widgetsControllerModelExtension");
        Intrinsics.checkNotNullParameter(investIntroChecklistAvailabilityProvider, "investIntroChecklistAvailabilityProvider");
        Intrinsics.checkNotNullParameter(recurringBuyWidgetProvider, "recurringBuyWidgetProvider");
        Intrinsics.checkNotNullParameter(uspWidgetProvider, "uspWidgetProvider");
        Intrinsics.checkNotNullParameter(prefetchNonActiveProfilePortfoliosInteractor, "prefetchNonActiveProfilePortfoliosInteractor");
        Intrinsics.checkNotNullParameter(disclaimersModelExtension, "disclaimersModelExtension");
        Intrinsics.checkNotNullParameter(swipeAssetTradeActionsExtension, "swipeAssetTradeActionsExtension");
        Intrinsics.checkNotNullParameter(swipeableAssetsListItemParser, "swipeableAssetsListItemParser");
        Intrinsics.checkNotNullParameter(tabInvestModalsProvider, "tabInvestModalsProvider");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(tradingTransactionsInteractor, "tradingTransactionsInteractor");
        Intrinsics.checkNotNullParameter(wealthFeaturesInteractor, "wealthFeaturesInteractor");
        this.o = actionsProvider;
        this.f89875p = actionsHandler;
        this.f89876q = headerUiParamsProvider;
        this.f89877r = userFeaturesChecker;
        this.f89878s = wealthAccountsInteractor;
        this.f89879t = tradingConfigInteractor;
        this.u = accountsBalanceInteractor;
        this.v = backgroundsInteractor;
        this.f89880w = complexAnalyticsInteractor;
        this.f89881x = tradingAddOnsUpsellingFirstEnterProvider;
        this.f89882y = globalMarketsFeatureInteractor;
        this.z = complexAnalyticsNavigationProvider;
        this.A = tradingTransactionsCleanUpWorkerInteractor;
        this.B = profileNotificationInteractor;
        this.C = investProductIntrosFinishedRelay;
        this.D = assistantModelExtension;
        this.E = investFeedWidgetsEventObserver;
        this.F = userRegisteredIdentitiesInteractor;
        this.G = legalEntityProviderFactory;
        this.H = tradingAccountsInteractor;
        this.I = productWidgetExtension;
        this.J = accountsClosuresExtension;
        this.K = homeNPSWidgetExtension;
        this.L = investOrdersWidgetProvider;
        this.M = tradingBannersExtension;
        this.N = featureToggleInteractor;
        this.O = partnerConsentExtension;
        this.P = displayCurrencyInteractor;
        this.Q = slotManagerFeedControllerModelExtension;
        this.R = availableToOnboardAccountsWidgetProvider;
        this.S = widgetsControllerModelExtension;
        this.T = investIntroChecklistAvailabilityProvider;
        this.U = recurringBuyWidgetProvider;
        this.V = uspWidgetProvider;
        this.W = prefetchNonActiveProfilePortfoliosInteractor;
        this.X = disclaimersModelExtension;
        this.Y = swipeAssetTradeActionsExtension;
        this.Z = swipeableAssetsListItemParser;
        this.f89870a0 = tabInvestModalsProvider;
        this.f89871b0 = configurationInteractor;
        this.c0 = tradingTransactionsInteractor;
        this.f89872d0 = wealthFeaturesInteractor;
        Intrinsics.checkNotNullParameter("TabInvestController", "keyValue");
        this.f89873e0 = mra.d.e(this, "TabInvestController", new TabInvestControllerContract$State(null, null, null, Integer.MAX_VALUE), stateMapper, null, 24);
        this.f0 = hx7.e.a(this, new bhi.c(this, 6));
        this.g0 = true;
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f89874h0 = z1VarB;
        jte.d dVar = (jte.d) featureToggleInteractor;
        this.i0 = vkm.q.c((dVar.c(TabInvestApi$Toggles.InvestPreOnboardedUSPOnly.f89827c) && dVar.c(FeatureWealthApi$Toggles.InvestHomeUSP.f95158c)) ? ble.p.USP_AND_DISCLAIMER : ble.p.STANDARD);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, this.f89876q.P(), null, null, new u0(this, null), 3);
        wog.a aVar = wog.a.ANALYTICS;
        wif.a aVar2 = this.f89877r;
        yji.l.a1(this, ta6.a.h(rd0.e.b(aVar2.d(aVar)), rd0.e.b(aVar2.d(wog.a.CARDS)), this.f89882y.a(), new o0(this, null)), null, null, new o(2, 15, null), 3);
        p0 p0Var = this.A;
        p0Var.getClass();
        p0Var.f303371a.enqueueUniqueWork("Trading transactions clean-up", ExistingWorkPolicy.REPLACE, new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) TradingTransactionsCleanUpWorker.class).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).build());
        yji.l.a1(this, O2(this.J.e3()), null, null, new y0(this, null), 3);
        yji.l.a1(this, new t38.e(this.P.a(), 24, mo3.a.g(com.revolut.data.database.models.openbanking.d.x("TabInvestController", "observeAccounts", tzg.m.c(this.f89878s, null, cfl.k.f23744a, 1)), null, new n(7), 1), new awd.b(this, continuation, 11)), null, null, new z0(this, null), 3);
        l2(new c0(4, this, continuation), new z(4));
        H2(this.f89873e0, new y(this, 0));
    }

    public final void I2(Function0 function0) {
        yji.l.b1(this, vkm.q.P(new bbk.z(this.i0, 5), 1), null, new e0(0, null, function0), 3);
    }

    public final q0 J2() {
        boolean zC = ((jte.d) this.N).c(TabInvestApi$Toggles.CachedFxRatesForMissingRates.f89825c);
        t0 t0Var = (t0) this.u;
        return com.revolut.data.database.models.openbanking.d.x("TabInvestControllerModel", "observeAccountsBalance", nim.a.v(t0.e(t0Var, t0Var.f.b(), null, null, zC, 6), new x8h.d(t0Var, 14)));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f0;
    }

    public final akg.n K2(boolean z) {
        return nim.a.v(rd0.e.n(this.v.g(new RetailBackgroundKey.InvestAccount(z ? md6.d.OPENED : md6.d.DISCOVERY)), zhm.y0.b(new Pair("TabInvestControllerModel", "observeHeaderBackground"))), new z(6));
    }

    public final q0 L2(hel.b bVar) {
        return com.revolut.data.database.models.openbanking.d.x("TabInvestControllerModel", "observeShouldShowCapitalAtRisk", nim.a.v(zh9.u0.m(rd0.e.b(((ik3.c) this.f89871b0).l(g.b.f123407a, w4l.h.f294642c)), this.f89873e0.B(new z(8))), new amh.p(bVar, 1)));
    }

    public final void M2(Function1 function1, Function1 function12, Function1 function13, Function1 function14) {
        yji.l.b1(this, vkm.q.Q(vkm.q.r(new n(10), nim.a.v(new ahd.y(O2(tzg.m.c(this.f89878s, null, cfl.k.f23744a, 1)), function1, function12, 6), new a31.k(8, function13))), new w0((Continuation) null, function14)), null, null, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N2(eel.c r5, com.revolut.kompot.common.transition.ZoomTarget.ListId r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof ble.x0
            if (r0 == 0) goto L13
            r0 = r7
            ble.x0 r0 = (ble.x0) r0
            int r1 = r0.f16613x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16613x = r1
            goto L18
        L13:
            ble.x0 r0 = new ble.x0
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f16613x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.tab.invest.impl.ui.home.f r5 = r0.u
            yhm.o.b(r7)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            r0.u = r4
            r0.f16613x = r3
            xke.e r7 = r4.z
            java.lang.Object r7 = r7.b(r5, r6, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            r5 = r4
        L42:
            aii.u r7 = (aii.u) r7
            r5.C1(r7)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.tab.invest.impl.ui.home.f.N2(eel.c, com.revolut.kompot.common.transition.ZoomTarget$ListId, gim.c):java.lang.Object");
    }

    public final wkm.l O2(Flow flow) {
        return vkm.q.Q(this.i0, new o1(0, null, flow));
    }

    @Override // yji.l
    public final void T1(long j2) {
        Flow flowI;
        Continuation continuation = null;
        n2(new c0(1, this, continuation), new z(16));
        n2(new c0(2, this, continuation), new bjg.c(28));
        tzg.m mVar = this.f89878s;
        yji.l.b1(this, boh.f.e(vkm.q.s(tzg.m.c(mVar, null, cfl.m.f23746a, 1), new z(3), vkm.q.f290100b), new y(this, 2)), null, new b(this, null), 3);
        yji.l.b1(this, mo3.a.e(v7.y("TabInvestControllerModel", "observeActionHeaderState", boh.f.e(tzg.m.c(mVar, null, null, 3), new y(this, 1))), new n(8), new n(9)), null, new k0(this, null), 3);
        yji.l.b1(this, this.B.d(), null, new s0(this, null), 3);
        yji.l.b1(this, this.E.f241545a, null, new c(this, null), 3);
        n2(new j0(this, null), new whi.b(6));
        if (!this.g0) {
            xbf.d dVar = (xbf.d) this.f89881x;
            yji.l.b1(this, vkm.q.P(O2(mo3.a.g(xam.a.h(new xbf.c(dVar, continuation, 1), l.d(dVar.d)), null, new x48.a(29), 1)), 1), null, new bi2.n(this, continuation, 5), 3);
        }
        yji.l.b1(this, this.D.Z2(), null, new i1(this, null), 3);
        yji.l.b1(this, new q0(com.revolut.data.database.models.openbanking.d.x("TabInvestController", "observeAccounts onShown", ((v0) mVar).e(i.f294643c, cfl.k.f23744a)), new be7.s(this, continuation, 12), 1), null, new j1(this, null), 3);
        yji.l.b1(this, ((gah.e) this.X).Z2(u.c(rdh.b.INVEST_MAIN_DISCLAIMER)), null, new n0(this, null), 3);
        I2(new x(this, 0));
        yji.l.b1(this, prk.o.w("TabInvestControllerModel", "observeSlotManager", O2(((f0) this.Q).f144638l.h())), null, new ble.q0(this, null), 3);
        djh.d dVar2 = (djh.d) this.R;
        akg.n nVarC = tzg.m.c(dVar2.f115393a, null, null, 3);
        akg.n nVarD = l.d(dVar2.f115394b);
        akg.n nVarD2 = ((h0) dVar2.f115395c).d();
        jlh.o oVar = (jlh.o) dVar2.d;
        ulh.n nVar = (ulh.n) oVar.f175787a;
        akg.n nVarV = nim.a.v(zh9.u0.m(vkm.q.q(new vkm.y(new ulh.e(nVar, null, 1), new l1(new q0(t1.E(((ue0.c) nVar.f281020a.get()).C0(ulh.n.f281017g, Boolean.TYPE)), new ulh.d(nVar, null, 1), 1), 12))), nVar.a()), new jlh.g(oVar, 0));
        t tVar = dVar2.e;
        yji.l.b1(this, prk.o.w("TabInvestControllerModel", "observeAvailableToOnboardAccountsWidgetsState", O2(nim.a.u(new d8j.c(null, dVar2), zh9.u0.m(zh9.u0.i(nVarC, nVarD, nVarD2), zh9.u0.m(nVarV, vkm.q.Q(bla.b.b((jla.h) tVar.f250857a, ne8.b.f214421c.a()), new a3(continuation, tVar, 13))))))), null, new l0(this, null), 3);
        j jVar = this.V;
        if (((jte.d) jVar.f255036b).c(FeatureWealthApi$Toggles.InvestHomeUSP.f95158c)) {
            flowI = nim.a.u(new r83.g(jVar, continuation, 26), tzg.m.c(jVar.f255035a, null, null, 3));
        } else {
            od0.i.Companion.getClass();
            flowI = zi0.c.i(od0.i.f224256b);
        }
        yji.l.b1(this, flowI, null, new r0(this, null), 3);
        M2(new z(13), new z(14), new z(15), new k1(0, this, continuation));
        M2(new z(10), new z(11), new z(12), new k1(1, this, continuation));
        M2(new bjg.c(27), new z(2), new z(5), new k1(2, this, continuation));
        M2(new bjg.c(29), new z(0), new z(1), new k1(3, this, continuation));
        ble.b bVar = this.T;
        yji.l.b1(this, vkm.q.Q(O2(new ba4.x(bVar.f16557c, bVar, 3)), new m0(0, this, continuation)), null, new a(this, null), 3);
        I2(new x(this, 2));
        yji.l.b1(this, O2(this.C.f16560b), null, new bf5.a(this, continuation, 14), 3);
        bih.a aVar = this.I;
        int i = 0;
        v1 v1VarN = e1.N(new a97.i(2, this, f.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", i, 4), O2(aVar.f3()));
        v1 v1VarN2 = e1.N(new a97.i(2, this, f.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", i, 5), vkm.q.Q(O2(this.f89874h0), new m0(1, this, continuation)));
        yji.l.b1(this, v1VarN, null, new ble.l1(this, null), 3);
        yji.l.b1(this, v1VarN2, null, new m1(this, null), 3);
        yji.l.b1(this, O2(this.Y.Z2(O2(new t38.e(new c1(v1VarN, 0), 24, new ba4.x(v1VarN2, this, 4), new bec.n0(3, 1, null))))), null, new g1(this, null), 3);
        yji.l.b1(this, O2(aVar.g3()), null, new h1(this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f89873e0;
    }

    @Override // yji.l
    public final aii.n o2(aii.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof hih.c;
        b.C0876b c0876b = b.C0876b.f152604a;
        if (!z) {
            return event instanceof b.a ? c0876b : super.o2(event);
        }
        h.v2(this.f0, new TabInvestControllerContract$ModalStep.KompotDescriptor(((hih.c) event).f152605b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return c0876b;
    }
}
