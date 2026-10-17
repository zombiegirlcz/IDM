package bke;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tnb.g0;

/* JADX INFO: loaded from: classes8.dex */
public final class y {
    public final ss5.a A;
    public final qje.d B;
    public final jr5.a C;
    public final hc5.a D;
    public final til.m E;
    public final k18.c F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gv5.d f16384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xh5.a f16385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qje.m f16386c;
    public final qje.n d;
    public final bn2.p e;
    public final gte.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rje.h f16387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final sh5.d f16388h;
    public final wif.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ji5.i f16389j;
    public final kwg.l k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j60.a f16390l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tje.a f16391m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final lje.b f16392n;
    public final xv5.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xv5.g f16393p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final po5.a f16394q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ap5.b f16395r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final fbj.a f16396s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g0 f16397t;
    public final c90.c u;
    public final o5c.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vh5.a f16398w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final qje.e f16399x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ur5.c f16400y;
    public final k18.c z;

    public y(gv5.d cryptoInvestmentsSummaryDataProvider, xh5.a cryptoFeatureEnabledInteractor, qje.m headerActionsExtension, qje.n menuItemsExtension, bn2.p backgroundsInteractor, gte.a featureToggleInteractor, rje.h menuItemsProvider, sh5.d cryptoFcaDisclaimerWidget, wif.a userFeaturesChecker, ji5.i cryptoOnboardingInteractor, kwg.l complexAnalyticsInteractor, j60.a bottomDialogControllerExtension, tje.a cryptoDisplayCurrencyDialogMapper, lje.b cryptoCurrencyDisplayInteractor, xv5.c cryptoCommodityBaseCurrencyInteractor, xv5.g cryptoCommodityStorageInteractor, po5.a cryptoWithdrawEnabledStateChecker, ap5.b cryptoWithdrawInteractor, fbj.a cryptoDepositsInteractor, g0 cryptoExchangeFeesFeatureChecker, c90.c uiResources, o5c.a cryptoExchangeEligibilityInteractor, vh5.a cryptoPermissionModelExtension, qje.e inviteFriendsActionCampaignTypeProvider, ur5.c revolutXFiatBalanceInteractor, k18.c derivativesBalanceInteractor, ss5.a cryptoFeedWidgetsEventObserver, qje.d cryptoProductIntrosFinishedRelay, jr5.a cryptoZeroFeesInteractor, hc5.a cryptoAccountInteractor, til.m workflowFlowDestinationProvider, k18.c deFiAccountsInteractor) {
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
        this.f16384a = cryptoInvestmentsSummaryDataProvider;
        this.f16385b = cryptoFeatureEnabledInteractor;
        this.f16386c = headerActionsExtension;
        this.d = menuItemsExtension;
        this.e = backgroundsInteractor;
        this.f = featureToggleInteractor;
        this.f16387g = menuItemsProvider;
        this.f16388h = cryptoFcaDisclaimerWidget;
        this.i = userFeaturesChecker;
        this.f16389j = cryptoOnboardingInteractor;
        this.k = complexAnalyticsInteractor;
        this.f16390l = bottomDialogControllerExtension;
        this.f16391m = cryptoDisplayCurrencyDialogMapper;
        this.f16392n = cryptoCurrencyDisplayInteractor;
        this.o = cryptoCommodityBaseCurrencyInteractor;
        this.f16393p = cryptoCommodityStorageInteractor;
        this.f16394q = cryptoWithdrawEnabledStateChecker;
        this.f16395r = cryptoWithdrawInteractor;
        this.f16396s = cryptoDepositsInteractor;
        this.f16397t = cryptoExchangeFeesFeatureChecker;
        this.u = uiResources;
        this.v = cryptoExchangeEligibilityInteractor;
        this.f16398w = cryptoPermissionModelExtension;
        this.f16399x = inviteFriendsActionCampaignTypeProvider;
        this.f16400y = revolutXFiatBalanceInteractor;
        this.z = derivativesBalanceInteractor;
        this.A = cryptoFeedWidgetsEventObserver;
        this.B = cryptoProductIntrosFinishedRelay;
        this.C = cryptoZeroFeesInteractor;
        this.D = cryptoAccountInteractor;
        this.E = workflowFlowDestinationProvider;
        this.F = deFiAccountsInteractor;
    }

    public final x a(zje.b stateUpdater, Function2 modalOpener) {
        Intrinsics.checkNotNullParameter(stateUpdater, "stateUpdater");
        Intrinsics.checkNotNullParameter(modalOpener, "modalOpener");
        return new x(stateUpdater, modalOpener, this.f16384a, this.f16385b, this.f16386c, this.d, this.e, this.f, this.f16387g, this.f16388h, this.i, this.f16389j, this.k, this.f16390l, this.f16391m, this.f16392n, this.o, this.f16393p, this.f16394q, this.f16395r, this.f16396s, this.f16397t, this.u, this.v, this.f16398w, this.f16399x, this.f16400y, this.z, this.A, this.B, this.C, this.D, this.E, this.F);
    }
}
