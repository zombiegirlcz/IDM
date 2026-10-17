package com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details;

import a9j.v;
import cli.y;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoFcaRisksDestination;
import com.revolut.feature.exchange.models.BuyFundingCurrencyPrefill;
import com.revolut.feature.separate_favourites.api.alerts.widget.AlertsWidgetContext;
import com.revolut.feature.shared_separate_favourites.domain.AssetIdWithSymbol;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.CryptoAssetDetailsScreenContract$ModalStep;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.CryptoEarningScreen;
import d9j.e;
import efm.r;
import j61.b;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.o;
import l3d.h0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pt5.m;
import r4k.x;
import sh5.d;
import u6b.k;
import u7k.w;
import u8j.c;
import u8j.f;
import u8j.g;
import u8j.i;
import vkm.j2;
import vw4.j;
import x8j.i0;
import x8j.j0;
import x8j.k0;
import x8j.n;
import yji.l;
import zh9.u0;
import zhm.f0;
import zhm.u;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements c {

    @NotNull
    private static final f Companion = new f();
    public static final Regex O = new Regex("[^:]+$");
    public final m1d.a A;
    public final m B;
    public final e C;
    public final n D;
    public final y8j.a E;
    public final xv5.c F;
    public final b G;
    public final tv5.b H;
    public final r8j.b I;
    public final sd5.c J;
    public final myj.e K;
    public final e5d.a L;
    public final y M;
    public final com.revolut.kompot.navigable.vc.modal.a N;
    public final u8j.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l1d.a f99966p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u1d.a f99967q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CryptoAssetDetailsScreenContract$InputData f99968r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r8j.a f99969s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f99970t;
    public final vyj.a u;
    public final v v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final g9j.b f99971w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c8j.c f99972x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final w7j.a f99973y;
    public final t8j.c z;

    public a(cli.n stateMapper, u8j.e view, l1d.a alertsExtension, u1d.a watchlistExtension, CryptoAssetDetailsScreenContract$InputData inputData, r8j.a exchangeRateInteractor, d cryptoFcaDisclaimerWidget, vyj.a learnWidget, v chartModelExtension, g9j.b investmentModelExtension, c8j.c statsModelExtension, w7j.a aboutModelExtension, t8j.c newsModelExtension, m1d.a alertsModelExtension, m activityWidgetControllerModelExtension, e collectionsExtension, n actionsModelExtension, y8j.a advancedChartExtension, xv5.c baseCurrencyInteractor, b mainWalletTransactionsInteractor, tv5.b currencyDiscoveryInteractor, r8j.b cryptoAssetDetailsContextInteractor, sd5.c cryptoConfigInteractor, myj.e learnFeatureStateChecker, e5d.a airTipExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(alertsExtension, "alertsExtension");
        Intrinsics.checkNotNullParameter(watchlistExtension, "watchlistExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(exchangeRateInteractor, "exchangeRateInteractor");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        Intrinsics.checkNotNullParameter(learnWidget, "learnWidget");
        Intrinsics.checkNotNullParameter(chartModelExtension, "chartModelExtension");
        Intrinsics.checkNotNullParameter(investmentModelExtension, "investmentModelExtension");
        Intrinsics.checkNotNullParameter(statsModelExtension, "statsModelExtension");
        Intrinsics.checkNotNullParameter(aboutModelExtension, "aboutModelExtension");
        Intrinsics.checkNotNullParameter(newsModelExtension, "newsModelExtension");
        Intrinsics.checkNotNullParameter(alertsModelExtension, "alertsModelExtension");
        Intrinsics.checkNotNullParameter(activityWidgetControllerModelExtension, "activityWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(collectionsExtension, "collectionsExtension");
        Intrinsics.checkNotNullParameter(actionsModelExtension, "actionsModelExtension");
        Intrinsics.checkNotNullParameter(advancedChartExtension, "advancedChartExtension");
        Intrinsics.checkNotNullParameter(baseCurrencyInteractor, "baseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(mainWalletTransactionsInteractor, "mainWalletTransactionsInteractor");
        Intrinsics.checkNotNullParameter(currencyDiscoveryInteractor, "currencyDiscoveryInteractor");
        Intrinsics.checkNotNullParameter(cryptoAssetDetailsContextInteractor, "cryptoAssetDetailsContextInteractor");
        Intrinsics.checkNotNullParameter(cryptoConfigInteractor, "cryptoConfigInteractor");
        Intrinsics.checkNotNullParameter(learnFeatureStateChecker, "learnFeatureStateChecker");
        Intrinsics.checkNotNullParameter(airTipExtension, "airTipExtension");
        this.o = view;
        this.f99966p = alertsExtension;
        this.f99967q = watchlistExtension;
        this.f99968r = inputData;
        this.f99969s = exchangeRateInteractor;
        this.f99970t = cryptoFcaDisclaimerWidget;
        this.u = learnWidget;
        this.v = chartModelExtension;
        this.f99971w = investmentModelExtension;
        this.f99972x = statsModelExtension;
        this.f99973y = aboutModelExtension;
        this.z = newsModelExtension;
        this.A = alertsModelExtension;
        this.B = activityWidgetControllerModelExtension;
        this.C = collectionsExtension;
        this.D = actionsModelExtension;
        this.E = advancedChartExtension;
        this.F = baseCurrencyInteractor;
        this.G = mainWalletTransactionsInteractor;
        this.H = currencyDiscoveryInteractor;
        this.I = cryptoAssetDetailsContextInteractor;
        this.J = cryptoConfigInteractor;
        this.K = learnFeatureStateChecker;
        this.L = airTipExtension;
        xi0.b bVar = inputData.f99962a;
        IconNavBarMenuItem iconNavBarMenuItemZ2 = alertsExtension.Z2();
        f0 f0Var = f0.f322471a;
        this.M = mra.d.b(this, new u8j.b(false, bVar, iconNavBarMenuItemZ2, null, null, null, f0Var, new Data(null, null, true, 3, null), f0Var, f0Var, f0Var, f0Var, new Data(null, null, true, 3, null), f0Var, f0Var, f0Var, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, null, null, null), stateMapper, null, false, 12);
        this.N = hx7.e.a(this, new w(this, 4));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, rd0.e.b(this.F.a()), null, null, new i(this, continuation, 0), 3);
        n2(new g(this, continuation, 2), new whi.b(6));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.N;
    }

    @Override // yji.l
    public final void T1(long j2) {
        String value;
        Continuation continuation = null;
        n2(new g(this, continuation, 1), new whi.b(6));
        y1d.b.Companion.getClass();
        FavouritesAssetTypeKey favouritesAssetTypeKey = y1d.a.f310359c;
        CryptoAssetDetailsScreenContract$InputData cryptoAssetDetailsScreenContract$InputData = this.f99968r;
        l.b1(this, this.f99967q.d3(favouritesAssetTypeKey, cryptoAssetDetailsScreenContract$InputData.f99962a.f306286a), null, new rf9.h(this, continuation, 9), 3);
        y yVar = this.M;
        xi0.b pocketCurrency = ((u8j.b) ((j2) yVar.f22677a).getValue()).f278224b;
        r8j.a aVar = this.f99969s;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        l.b1(this, rd0.e.b(pd.b.r(aVar.f252461b.a(), new x(aVar, pocketCurrency, 6))), null, new i(this, continuation, 1), 3);
        BuyFundingCurrencyPrefill buyFundingCurrencyPrefill = cryptoAssetDetailsScreenContract$InputData.f99963b;
        n nVar = this.D;
        nVar.j3(buyFundingCurrencyPrefill);
        xi0.b pocketCurrency2 = cryptoAssetDetailsScreenContract$InputData.f99962a;
        l.b1(this, this.f99971w.e3(pocketCurrency2), null, new i(this, continuation, 7), 3);
        boolean zIsEmpty = ((u8j.b) ((j2) yVar.f22677a).getValue()).f278226g.isEmpty();
        v vVar = this.v;
        l.b1(this, vVar.Z2(pocketCurrency2, zIsEmpty), null, new i(this, continuation, 8), 3);
        l.b1(this, vVar.b3(pocketCurrency2), null, new i(this, continuation, 9), 3);
        l.b1(this, this.f99972x.Z2(pocketCurrency2, new CurrencyClause(pocketCurrency2, CurrencyClause.Format.Ticker.f57756a, null, 4)), null, new i(this, continuation, 10), 3);
        l.b1(this, this.f99973y.Z2(pocketCurrency2), null, new i(this, continuation, 11), 3);
        l.b1(this, this.z.Z2(pocketCurrency2), null, new i(this, continuation, 12), 3);
        Set setB = y0.b(favouritesAssetTypeKey);
        AssetIdWithSymbol assetIdWithSymbol = new AssetIdWithSymbol(pocketCurrency2.f306286a, cp5.d.J(pocketCurrency2));
        mgd.d dVar = mgd.d.ACTIVE;
        l.b1(this, this.A.Z2(new AlertsWidgetContext(setB, null, assetIdWithSymbol, null, u.c(dVar), o1d.f.WHEN_LIMIT_REACHED, 182)), null, new i(this, continuation, 13), 3);
        l.b1(this, this.C.Z2(pocketCurrency2), null, new i(this, continuation, 14), 3);
        m mVar = this.B;
        mVar.m3(pocketCurrency2);
        l.b1(this, mVar.l3(), null, new i(this, continuation, 15), 3);
        l.b1(this, mVar.e3(), null, new i(this, continuation, 16), 3);
        l.b1(this, nVar.Z2(pocketCurrency2), null, new i(this, continuation, 4), 3);
        l.b1(this, this.E.b3(pocketCurrency2), null, new i(this, continuation, 5), 3);
        l.b1(this, this.L.Z2(), null, new i(this, continuation, 6), 3);
        u09.v domain = u09.v.CRYPTO;
        CryptoAssetDetailsScreen cryptoAssetDetailsScreen = (CryptoAssetDetailsScreen) this.o;
        ihm.f subheaderClicks = cryptoAssetDetailsScreen.j0().f52707c;
        ihm.f smallCardClicks = cryptoAssetDetailsScreen.p0.d;
        this.u.getClass();
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(subheaderClicks, "subheaderClicks");
        Intrinsics.checkNotNullParameter(smallCardClicks, "smallCardClicks");
        r rVarMerge = r.merge(subheaderClicks.filter(new vx9.w(new j(28), 24)).map(new vx9.w(new pyj.b(domain, 1), 25)), smallCardClicks.filter(new vx9.w(new j(29), 26)).map(new vx9.w(new pyj.b(domain, 2), 27)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        l.b1(this, new tzh.g(rd0.e.b(rVarMerge), 8), null, new i(this, continuation, 3), 3);
        n2(new g(this, continuation, 0), new whi.b(6));
        r8j.c cVar = (r8j.c) this.I;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(pocketCurrency2, "currency");
        r rVarA = cVar.f252462a.a();
        g9j.w wVar = cVar.f252464c;
        r rVarA2 = wVar.a(pocketCurrency2);
        Intrinsics.checkNotNullParameter(pocketCurrency2, "pocketCurrency");
        cxe.u uVarB = wVar.d.b(pocketCurrency2, w4l.i.f294643c);
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        r rVarG = m70.a.g(rd0.e.c(uVarB, gVar), null, null, 3);
        h0 h0Var = cVar.f252463b;
        String str = pocketCurrency2.f306286a;
        r map = te0.w.o(rVarA, rVarA2, rVarG, rd0.e.c(h0Var.e(favouritesAssetTypeKey, str), gVar), ((l2d.n) cVar.d).c(new mgd.g(u.c(favouritesAssetTypeKey), u.c(dVar), u.c(str), (List) null, (Integer) 1, false, (List) null, 232), false)).map(new r83.d(5, new ou5.a(14, pocketCurrency2)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        l.b1(this, rd0.e.b(map), null, new u8j.h(this, null), 3);
        sd5.c cVar2 = this.J;
        l.b1(this, nim.a.v(u0.m(rd0.e.b(cVar2.a(false)), rd0.e.b(this.F.a())), new k(this, 12)), null, new i(this, continuation, 17), 3);
        o oVarB = O.b(pocketCurrency2.f306286a);
        if (oVarB == null || (value = oVarB.getValue()) == null) {
            return;
        }
        l.b1(this, boh.f.e(u0.m(rd0.e.b(this.K.b()), rd0.e.b(cVar2.a(false))), new u69.g(this, value, 13)), null, new i(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.M;
    }

    @Override // d8j.f
    public final void l(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        CryptoFcaRisksDestination cryptoFcaRisksDestinationD = ((gi5.d) this.f99970t).d(clickData);
        if (cryptoFcaRisksDestinationD != null) {
            C1(cryptoFcaRisksDestinationD);
        }
    }

    @Override // yji.l
    public final aii.n o2(aii.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof x8j.h0;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.N;
        aii.w wVar = aii.w.f5295a;
        if (z) {
            h.v2(aVar, new CryptoAssetDetailsScreenContract$ModalStep.GiftAssetTransferInfo(((x8j.h0) event).f303448b, false), bottom_dialog);
            return wVar;
        }
        if (event instanceof i0) {
            h.v2(aVar, new CryptoAssetDetailsScreenContract$ModalStep.GiftAssetTransferInfo(((i0) event).f303451b, true), bottom_dialog);
            return wVar;
        }
        boolean z3 = event instanceof j0;
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        if (z3) {
            StakingPocket stakingPocket = ((j0) event).f303455b.f316699a;
            if (stakingPocket != null && !stakingPocket.f88084g.k()) {
                l.j2(this, new CryptoEarningScreen(stakingPocket), popup, null, 2);
                return wVar;
            }
        } else {
            if (!(event instanceof k0)) {
                return super.o2(event);
            }
            StakingPocket stakingPocket2 = ((k0) event).f303457b.f316701a;
            if (stakingPocket2 != null && !stakingPocket2.f88084g.k()) {
                l.j2(this, new CryptoEarningScreen(stakingPocket2), popup, null, 2);
            }
        }
        return wVar;
    }
}
