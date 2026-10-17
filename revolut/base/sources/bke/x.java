package bke;

import android.os.Parcelable;
import bbk.z;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import com.revolut.core.ui_kit.views.slider_layout.HomeOverlayConfig;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey;
import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoFcaRisksDestination;
import com.revolut.feature.defi.accounts.api.DeFiAccountsApi$Toggles$CryptoDeFiAccount;
import com.revolut.feature.globalsearch.api.navigation.GlobalSearchScreenDestination;
import com.revolut.feature.globalsearch.models.RetailGlobalSearchContext;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.revolut_x_promo.api.RevolutXPromoApi$Toggles;
import com.revolut.feature.tab.crypto.impl.portfolio.CryptoPortfolioScreen;
import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlowContract$ModalStep;
import com.revolut.feature.wealth.analytics.navigation.ComplexAnalyticsDestination;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlow;
import com.revolut.kompot.common.transition.ZoomTarget;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import grl.k9;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import om4.r0;
import org.jmrtd.lds.LDSFile;
import skm.p0;
import tnb.g0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class x extends a {
    public final lje.b A;
    public final xv5.c B;
    public final xv5.g C;
    public final po5.a D;
    public final ap5.b E;
    public final fbj.a F;
    public final g0 G;
    public final c90.c H;
    public final o5c.a I;
    public final vh5.a J;
    public final qje.e K;
    public final ur5.c L;
    public final k18.c M;
    public final ss5.a N;
    public final qje.d O;
    public final jr5.a P;
    public final hc5.a Q;
    public final til.m R;
    public final k18.c S;
    public final int T;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zje.b f16373l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kotlin.jvm.internal.q f16374m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gv5.d f16375n;
    public final xh5.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qje.m f16376p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qje.n f16377q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final bn2.p f16378r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f16379s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final rje.h f16380t;
    public final sh5.d u;
    public final wif.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ji5.i f16381w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final kwg.l f16382x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j60.a f16383y;
    public final tje.a z;

    /* JADX WARN: Multi-variable type inference failed */
    public x(zje.b stateUpdater, Function2 modalOpener, gv5.d cryptoInvestmentsSummaryDataProvider, xh5.a cryptoFeatureEnabledInteractor, qje.m headerActionsExtension, qje.n menuItemsExtension, bn2.p backgroundsInteractor, gte.a featureToggleInteractor, rje.h menuItemsProvider, sh5.d cryptoFcaDisclaimerWidget, wif.a userFeaturesChecker, ji5.i cryptoOnboardingInteractor, kwg.l complexAnalyticsInteractor, j60.a bottomDialogControllerExtension, tje.a cryptoDisplayCurrencyDialogMapper, lje.b cryptoCurrencyDisplayInteractor, xv5.c cryptoCommodityBaseCurrencyInteractor, xv5.g cryptoCommodityStorageInteractor, po5.a cryptoWithdrawEnabledStateChecker, ap5.b cryptoWithdrawInteractor, fbj.a cryptoDepositsInteractor, g0 cryptoExchangeFeesFeatureChecker, c90.c uiResources, o5c.a cryptoExchangeEligibilityInteractor, vh5.a cryptoPermissionModelExtension, qje.e inviteFriendsActionCampaignTypeProvider, ur5.c revolutXFiatBalanceInteractor, k18.c derivativesBalanceInteractor, ss5.a cryptoFeedWidgetsEventObserver, qje.d cryptoProductIntrosFinishedRelay, jr5.a cryptoZeroFeesInteractor, hc5.a cryptoAccountInteractor, til.m workflowFlowDestinationProvider, k18.c deFiAccountsInteractor) {
        Intrinsics.checkNotNullParameter(stateUpdater, "stateUpdater");
        Intrinsics.checkNotNullParameter(modalOpener, "modalOpener");
        Intrinsics.checkNotNullParameter(cryptoInvestmentsSummaryDataProvider, "cryptoInvestmentsSummaryDataProvider");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        Intrinsics.checkNotNullParameter(headerActionsExtension, "headerActionsExtension");
        Intrinsics.checkNotNullParameter(menuItemsExtension, "menuItemsExtension");
        Intrinsics.checkNotNullParameter(backgroundsInteractor, "backgroundsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(menuItemsProvider, "menuItemsProvider");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        Intrinsics.checkNotNullParameter(cryptoOnboardingInteractor, "cryptoOnboardingInteractor");
        Intrinsics.checkNotNullParameter(complexAnalyticsInteractor, "complexAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogControllerExtension, "bottomDialogControllerExtension");
        Intrinsics.checkNotNullParameter(cryptoDisplayCurrencyDialogMapper, "cryptoDisplayCurrencyDialogMapper");
        Intrinsics.checkNotNullParameter(cryptoCurrencyDisplayInteractor, "cryptoCurrencyDisplayInteractor");
        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(cryptoCommodityStorageInteractor, "cryptoCommodityStorageInteractor");
        Intrinsics.checkNotNullParameter(cryptoWithdrawEnabledStateChecker, "cryptoWithdrawEnabledStateChecker");
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        Intrinsics.checkNotNullParameter(cryptoDepositsInteractor, "cryptoDepositsInteractor");
        Intrinsics.checkNotNullParameter(cryptoExchangeFeesFeatureChecker, "cryptoExchangeFeesFeatureChecker");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(cryptoExchangeEligibilityInteractor, "cryptoExchangeEligibilityInteractor");
        Intrinsics.checkNotNullParameter(cryptoPermissionModelExtension, "cryptoPermissionModelExtension");
        Intrinsics.checkNotNullParameter(inviteFriendsActionCampaignTypeProvider, "inviteFriendsActionCampaignTypeProvider");
        Intrinsics.checkNotNullParameter(revolutXFiatBalanceInteractor, "revolutXFiatBalanceInteractor");
        Intrinsics.checkNotNullParameter(derivativesBalanceInteractor, "derivativesBalanceInteractor");
        Intrinsics.checkNotNullParameter(cryptoFeedWidgetsEventObserver, "cryptoFeedWidgetsEventObserver");
        Intrinsics.checkNotNullParameter(cryptoProductIntrosFinishedRelay, "cryptoProductIntrosFinishedRelay");
        Intrinsics.checkNotNullParameter(cryptoZeroFeesInteractor, "cryptoZeroFeesInteractor");
        Intrinsics.checkNotNullParameter(cryptoAccountInteractor, "cryptoAccountInteractor");
        Intrinsics.checkNotNullParameter(workflowFlowDestinationProvider, "workflowFlowDestinationProvider");
        Intrinsics.checkNotNullParameter(deFiAccountsInteractor, "deFiAccountsInteractor");
        this.f16373l = stateUpdater;
        this.f16374m = (kotlin.jvm.internal.q) modalOpener;
        this.f16375n = cryptoInvestmentsSummaryDataProvider;
        this.o = cryptoFeatureEnabledInteractor;
        this.f16376p = headerActionsExtension;
        this.f16377q = menuItemsExtension;
        this.f16378r = backgroundsInteractor;
        this.f16379s = featureToggleInteractor;
        this.f16380t = menuItemsProvider;
        this.u = cryptoFcaDisclaimerWidget;
        this.v = userFeaturesChecker;
        this.f16381w = cryptoOnboardingInteractor;
        this.f16382x = complexAnalyticsInteractor;
        this.f16383y = bottomDialogControllerExtension;
        this.z = cryptoDisplayCurrencyDialogMapper;
        this.A = cryptoCurrencyDisplayInteractor;
        this.B = cryptoCommodityBaseCurrencyInteractor;
        this.C = cryptoCommodityStorageInteractor;
        this.D = cryptoWithdrawEnabledStateChecker;
        this.E = cryptoWithdrawInteractor;
        this.F = cryptoDepositsInteractor;
        this.G = cryptoExchangeFeesFeatureChecker;
        this.H = uiResources;
        this.I = cryptoExchangeEligibilityInteractor;
        this.J = cryptoPermissionModelExtension;
        this.K = inviteFriendsActionCampaignTypeProvider;
        this.L = revolutXFiatBalanceInteractor;
        this.M = derivativesBalanceInteractor;
        this.N = cryptoFeedWidgetsEventObserver;
        this.O = cryptoProductIntrosFinishedRelay;
        this.P = cryptoZeroFeesInteractor;
        this.Q = cryptoAccountInteractor;
        this.R = workflowFlowDestinationProvider;
        this.S = deFiAccountsInteractor;
        this.T = kli.a.k(uiResources.f22265a, 8.0f);
    }

    @Override // yji.n
    public final void D2() {
        Continuation continuation = null;
        T2(new d(this, continuation, 0), new yi5.b(27));
        T2(new d(this, continuation, 5), new yi5.b(27));
        T2(new f(this, null), new yi5.b(27));
    }

    @Override // yji.n
    public final void H2() {
        Flow flowI;
        Continuation continuation = null;
        yji.n.l2(this, mo3.a.g(xam.a.h(new l(this, null), vkm.q.q(rd0.e.b(((ji5.e) this.o).f()))), null, new bk6.n(2), 1), null, new n(this, null), 3);
        g3();
        rje.j jVar = (rje.j) this.f16380t;
        yji.n.l2(this, vkm.q.q(new qna.n(rd0.e.b(jVar.f254664a.d(wog.a.CARDS)), jVar, 17)), null, new r(this, null), 3);
        yji.n.j2(this, rd0.e.b(xv5.c.b(this.B)), null, new s(this, null), 3);
        yji.n.j2(this, this.A.a(), null, new u(this, null), 3);
        yji.n.l2(this, this.N.f265311a, null, new v(this, null), 3);
        if (((jte.d) this.f16379s).c(DeFiAccountsApi$Toggles$CryptoDeFiAccount.f71633c)) {
            k18.c cVar = this.S;
            cVar.getClass();
            w4l.h loadingStrategy = w4l.h.f294642c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            flowI = n14.k.p(nim.a.v(vkm.q.Q(rd0.e.b(xv5.c.b((xv5.c) cVar.f180141c)), new r0(continuation, cVar, loadingStrategy, 9)), new bjg.c(12)), new bjg.c(18));
        } else {
            flowI = zi0.c.i(Boolean.FALSE);
        }
        yji.n.l2(this, vkm.q.q(flowI), null, new j(this, null), 3);
    }

    @Override // bke.a
    public final void L(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        CryptoFcaRisksDestination cryptoFcaRisksDestinationD = ((gi5.d) this.u).d(clickData);
        if (cryptoFcaRisksDestinationD != null) {
            A2(cryptoFcaRisksDestinationD);
        }
    }

    @Override // bke.a
    public final void N1(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        j60.a.v(this.f16383y, false, null, 3);
        if (model.u instanceof xi0.b) {
            V2(new w(this, model, null), new yi5.b(29));
        }
    }

    @Override // bke.a
    public final void Q(AccountSelectionNavBarContentView.b scrollingState) {
        Intrinsics.checkNotNullParameter(scrollingState, "scrollingState");
        this.f16373l.c(new c(scrollingState, 0));
    }

    @Override // bke.a
    public final void V1(ux0.s state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (Intrinsics.f(state, ux0.q.f283796a)) {
            V2(new d(this, null, 3), new yi5.b(29));
        } else if (!Intrinsics.f(state, ux0.r.f283798a)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // bke.a
    public final void W1() {
        A2(new GlobalSearchScreenDestination(RetailGlobalSearchContext.CRYPTO_HOME));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.q] */
    @Override // bke.a
    public final void Z2(ThemedBackgroundKey backgroundKey) {
        Intrinsics.checkNotNullParameter(backgroundKey, "backgroundKey");
        this.f16374m.invoke(new TabCryptoFlowContract$ModalStep.ThemeCustomisation(backgroundKey), null);
    }

    @Override // bke.a
    public final void b3() {
        V2(new d(this, null, 2), new yi5.b(29));
    }

    @Override // bke.a
    public final void c1() {
        T2(new b96.d(this, null, 16), new yi5.b(27));
    }

    @Override // bke.a
    public final Object c3(ActionsView.Item item, Continuation continuation) {
        if (Intrinsics.f(item.f58316a, "CRYPTO_ONBOARDING_ID")) {
            b3();
            return Unit.f186387a;
        }
        rje.d dVar = (rje.d) this.f16376p;
        dVar.getClass();
        Object objB = pu7.a.B(dVar.e, "onHeaderActionClick", new rje.c(item, dVar, null), continuation);
        return objB == fim.a.COROUTINE_SUSPENDED ? objB : Unit.f186387a;
    }

    @Override // bke.a
    public final void d3(String menuItemId) {
        Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
        rje.f fVar = (rje.f) this.f16377q;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
        if (Intrinsics.f(menuItemId, "CARDS_MENU_ITEM_ID")) {
            fVar.A2(new MainContainerScreenDestination.Slide(dy0.o.LEFT, false));
            return;
        }
        if (Intrinsics.f(menuItemId, "ANALYTICS_MENU_ITEM_ID")) {
            ZoomTarget.ListId listId = new ZoomTarget.ListId("ANALYTICS_MENU_ITEM_ID");
            ixg.b bVar = ixg.b.CRYPTO;
            ixg.a aVar = ixg.a.PERFORMANCE;
            k9 k9Var = k9.Crypto;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            AnalyticsProduct.Retail retailH = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
            TransitionAnimation.Companion companion = TransitionAnimation.INSTANCE;
            HomeOverlayConfig.INSTANCE.getClass();
            fVar.A2(new ComplexAnalyticsDestination(null, bVar, aVar, null, retailH, com.revolut.kompot.common.transition.a.d(companion, listId, HomeOverlayConfig.f59654b), 1));
        }
    }

    @Override // bke.a
    public final ViewController e3(TabCryptoFlowContract$ModalStep step) {
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof TabCryptoFlowContract$ModalStep.ThemeCustomisation) {
            ThemedBackgroundKey themedBackgroundKey = ((TabCryptoFlowContract$ModalStep.ThemeCustomisation) step).f89792a;
            em2.b.Companion.getClass();
            return o2(new cm2.h(themedBackgroundKey, em2.a.a(), null));
        }
        if (!(step instanceof TabCryptoFlowContract$ModalStep.MicaAutoPrompt)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((TabCryptoFlowContract$ModalStep.MicaAutoPrompt) step).f89791a;
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = k9.Crypto;
        companion.getClass();
        WorkflowFlow workflowFlowB = til.m.b(this.R, new WorkflowConfiguration.Workflow(str, (wi0.b) null, (NaviCommand) null, (String) null, AnalyticsProduct.Companion.b(k9Var), (WorkflowConfiguration.Extras) null, LDSFile.EF_DG14_TAG), WorkflowFlowType.Inner.f105817a, null, 60);
        b block = new b(this, 1);
        Intrinsics.checkNotNullParameter(block, "block");
        workflowFlowB.H = block;
        return workflowFlowB;
    }

    @Override // bke.a
    public final CryptoPortfolioScreen f3() {
        return new CryptoPortfolioScreen();
    }

    public final void g3() {
        efm.r rVarJust;
        V2(new p(this, null), new yi5.b(29));
        yji.n.l2(this, xam.a.h(new h(this, null), vkm.q.q(new z(this.f16373l.stream(), 3))), null, new i(this, null), 3);
        efm.r rVarF = ((ji5.e) this.o).f();
        gv5.d dVar = this.f16375n;
        efm.r rVarSwitchMap = xv5.c.b(dVar.f147061b).switchMap(new gqk.b(new gv5.a(dVar, 0), 29));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        efm.r rVarSwitchMap2 = xv5.c.b(dVar.f147061b).switchMap(new gv5.b(new gv5.a(dVar, 2), 0));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap2, "switchMap(...)");
        efm.r rVarSwitchMap3 = xv5.c.b(dVar.f147061b).switchMap(new gv5.b(new gv5.a(dVar, 3), 1));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap3, "switchMap(...)");
        efm.r rVarI = kli.a.i(rVarSwitchMap, rVarSwitchMap2, rVarSwitchMap3);
        wog.a aVar = wog.a.CRYPTO_SEND_ACTION;
        wif.a aVar2 = this.v;
        efm.r map = aVar2.d(aVar).map(new bjg.d(13, new bjg.c(19)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r map2 = aVar2.d(wog.a.CRYPTO_RECEIVE_ACTION).map(new bjg.d(14, new bjg.c(21)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        efm.r rVarH = kli.a.h(map, map2);
        efm.r map3 = this.D.d().x().map(new bjg.d(9, new bjg.c(13)));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        efm.r map4 = te0.w.o0(p0.f264003c, new d(this, null, 1)).x().map(new bjg.d(10, new bjg.c(14)));
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        lkf.v vVarA = ((lr5.c) this.P).a();
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        efm.r map5 = rd0.e.c(vVarA, gVar).map(new bjg.d(11, new bjg.c(15)));
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        if (((jte.d) this.f16379s).c(RevolutXPromoApi$Toggles.RevolutXMorePromo.f84263c)) {
            rVarJust = nim.a.w(rd0.e.c(this.I.a(), gVar), new bjg.c(16));
        } else {
            rVarJust = efm.r.just(new Data(Boolean.FALSE, null, false, 6, null));
            Intrinsics.h(rVarJust);
        }
        efm.r rVarC = rd0.e.c(this.f16381w.a(false), gVar);
        qje.e eVar = this.K;
        efm.r rVarSwitchMap4 = nim.a.w(zi0.c.J(ue0.e.p(wwa.b.d(eVar.f246834a, false, pwa.n.CRYPTO_INTERNAL, 4), h0.f322473a)), new qg7.v(16)).switchMap(new qe0.g(22, new qgf.o(eVar, 7)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap4, "switchMap(...)");
        efm.r rVarSwitchMap5 = xv5.c.b(this.B).switchMap(new bjg.d(12, new b(this, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap5, "switchMap(...)");
        yji.n.l2(this, rd0.e.b(nim.a.w(mif.a.k(rVarF, rVarI, rVarH, map3, map4, map5, rVarJust, rVarC, rVarSwitchMap4, rVarSwitchMap5), new bjg.c(20))), null, new q(this, null), 3);
    }

    @Override // bke.a
    public final void j() {
        ixg.b bVar = ixg.b.CRYPTO;
        ixg.a aVar = ixg.a.TOTAL_VALUE;
        eel.c cVar = eel.c.ONE_WEEK;
        k9 k9Var = k9.Crypto;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        A2(new ComplexAnalyticsDestination(null, bVar, aVar, cVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, 33));
    }
}
