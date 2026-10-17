package q2j;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureDestination;
import com.revolut.feature.pockets.api.navigation.PocketDetailsDestination;
import com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData;
import com.revolut.feature.pockets.api.navigation.PocketDetailsInitialAction;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.balance.picker.legacy.api.navigation.BalancePickerFeatureConfig;
import com.revolut.retail.feature.balance.picker.legacy.impl.BalanceActivity;
import com.revolut.retail.feature.balance.picker.legacy.impl.BalanceScreenContract$Configuration;
import com.revolut.retail.feature.balance.picker.legacy.impl.BalanceScreenContract$GlobalExchangeAccessParams;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsFeatureConfig;
import com.revolut.revolut.feature_fourthline_impl.R;
import e0f.v0;
import e7l.g;
import efm.d0;
import grl.k9;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import le.u1;
import nii.o0;
import om4.x2;
import org.jetbrains.annotations.NotNull;
import qfm.e1;
import qfm.j1;
import qfm.p0;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class x extends pri.a {

    @NotNull
    public static final l Companion = new l();
    public final xpi.g A;
    public final td0.b B;
    public final kpi.c C;
    public final z D;
    public final ihm.b E;
    public final BalanceScreenContract$Configuration i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ada.a f241696j;
    public final wsg.n k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ppk.f f241697l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final rea.m f241698m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fk3.b f241699n;
    public final t70.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t70.b f241700p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ang.f f241701q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vte.a f241702r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f241703s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final sri.m f241704t;
    public final npi.f u;
    public final tpi.j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f9b.f f241705w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final al4.n f241706x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k3l.b f241707y;
    public final wq4.b z;

    public x(BalanceScreenContract$Configuration configuration, ada.a accountDetailsNavigationPresenter, wsg.n walletInteractor, ppk.f ratesInteractor, rea.m pocketDetailsInteractor, fk3.b configurationRepository, t70.g localization, t70.b currencyLocalization, ang.f userInteractor, vte.a topUpInteractor, a balanceListItemMapper, sri.m navigator, npi.f dialogView, tpi.j progressView, f9b.f errorView, al4.n creditCardInteractor, k3l.b statusDialogView, wq4.b creditCardTransferDialogFactory, xpi.g navBarView, td0.b currencySetsProvider, kpi.c activityResultDelegate, z state) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(accountDetailsNavigationPresenter, "accountDetailsNavigationPresenter");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(topUpInteractor, "topUpInteractor");
        Intrinsics.checkNotNullParameter(balanceListItemMapper, "balanceListItemMapper");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(dialogView, "dialogView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(statusDialogView, "statusDialogView");
        Intrinsics.checkNotNullParameter(creditCardTransferDialogFactory, "creditCardTransferDialogFactory");
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        Intrinsics.checkNotNullParameter(currencySetsProvider, "currencySetsProvider");
        Intrinsics.checkNotNullParameter(activityResultDelegate, "activityResultDelegate");
        Intrinsics.checkNotNullParameter(state, "state");
        this.i = configuration;
        this.f241696j = accountDetailsNavigationPresenter;
        this.k = walletInteractor;
        this.f241697l = ratesInteractor;
        this.f241698m = pocketDetailsInteractor;
        this.f241699n = configurationRepository;
        this.o = localization;
        this.f241700p = currencyLocalization;
        this.f241701q = userInteractor;
        this.f241702r = topUpInteractor;
        this.f241703s = balanceListItemMapper;
        this.f241704t = navigator;
        this.u = dialogView;
        this.v = progressView;
        this.f241705w = errorView;
        this.f241706x = creditCardInteractor;
        this.f241707y = statusDialogView;
        this.z = creditCardTransferDialogFactory;
        this.A = navBarView;
        this.B = currencySetsProvider;
        this.C = activityResultDelegate;
        this.D = state;
        P(zhm.u.c(accountDetailsNavigationPresenter));
        m70.a.c(t0.f186434a);
        ihm.b bVarE = ihm.b.e("");
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.E = bVarE;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        a0 view = (a0) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        BalanceScreenContract$Configuration balanceScreenContract$Configuration = this.i;
        Integer num = balanceScreenContract$Configuration.f99580n;
        TextLocalisedClause textLocalisedClause = num != null ? new TextLocalisedClause(num.intValue(), null, null, 14) : new TextLocalisedClause(R.string.currency_choose_title, null, null, 14);
        xpi.c cVar = (xpi.c) this.A;
        cVar.n0(textLocalisedClause);
        cVar.p0(textLocalisedClause);
        Integer num2 = balanceScreenContract$Configuration.o;
        TextLocalisedClause textLocalisedClause2 = num2 != null ? new TextLocalisedClause(num2.intValue(), null, null, 14) : null;
        cVar.Z(textLocalisedClause2 != null);
        if (textLocalisedClause2 != null) {
            cVar.Y(textLocalisedClause2);
        }
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        NavBarWithToolbar navBarWithToolbar = cVar.f307974j;
        if (navBarWithToolbar == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        navBarWithToolbar.setNavigationButtonImage(resourceImage);
        TextLocalisedClause hint = new TextLocalisedClause(R.string.contacts_search, null, null, 14);
        Intrinsics.checkNotNullParameter(hint, "hint");
        NavBarWithToolbar navBarWithToolbar2 = cVar.f307974j;
        if (navBarWithToolbar2 == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        navBarWithToolbar2.setHint(hint);
        cVar.d0(zhm.u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "MENU_ITEM_ID_SEARCH", new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)));
        NavBarWithToolbar navBarWithToolbar3 = cVar.f307974j;
        if (navBarWithToolbar3 == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        ihm.f fVar = navBarWithToolbar3.f59409p.f57337m;
        e eVar = new e(this, 11);
        Function1 function1K = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = fVar.onErrorResumeNext(new n1i.b(9, new pzc.g(new BreadcrumbException(), 13)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o0(9, eVar), new o0(9, function1K), new ozc.z(15, function0J));
        ifm.b bVar = this.f239031a;
        te0.w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        NavBarWithToolbar navBarWithToolbar4 = cVar.f307974j;
        if (navBarWithToolbar4 == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        efm.r rVarMerge = efm.r.merge(navBarWithToolbar4.f59409p.f57336l, cVar.Q());
        Intrinsics.h(rVarMerge);
        p0 p0VarF = te0.w.F(rVarMerge, new e(this, 12));
        e eVar2 = new e(this, 13);
        Function1 function1K2 = K();
        Function0 function0J2 = J();
        j1 j1Var = new j1(p0VarF, new n1i.b(9, new pzc.g(new BreadcrumbException(), 14)), 1);
        Intrinsics.checkNotNullExpressionValue(j1Var, "onErrorResumeNext(...)");
        te0.w.j0(bVar, j1Var.m(new o0(9, eVar2), new o0(9, function1K2), new ozc.z(15, function0J2), e1.INSTANCE));
        efm.r rVarB = cVar.b();
        e eVar3 = new e(this, 14);
        Function1 function1K3 = K();
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext2 = rVarB.onErrorResumeNext(new n1i.b(9, new pzc.g(new BreadcrumbException(), 15)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new o0(9, eVar3), new o0(9, function1K3), new ozc.z(15, function0J3));
        te0.w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        efm.r rVarDistinctUntilChanged = this.E.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        efm.r map = te0.w.w0(te0.w.l(rVarDistinctUntilChanged, m70.a.g(U(), null, new pyb.g(28), 1))).map(new q09.c(21, new e(this, 4)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarF = o70.a.f(map);
        e eVar4 = new e(this, 5);
        Function1 function1K4 = K();
        Function0 function0J4 = J();
        efm.r rVarOnErrorResumeNext3 = rVarF.onErrorResumeNext(new n1i.b(9, new pzc.g(new BreadcrumbException(), 7)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new o0(9, eVar4), new o0(9, function1K4), new ozc.z(15, function0J4));
        te0.w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        efm.r rVarFilter = ((k3l.d) this.f241707y).f180813j.filter(new q09.c(14, new q2a.a(18))).filter(new q09.c(19, new q2a.a(19)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        e eVar5 = new e(this, 7);
        Function1 function1K5 = K();
        Function0 function0J5 = J();
        efm.r rVarOnErrorResumeNext4 = rVarFilter.onErrorResumeNext(new n1i.b(9, new pzc.g(new BreadcrumbException(), 6)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new o0(9, eVar5), new o0(9, function1K5), new ozc.z(15, function0J5));
        te0.w.j0(bVar, cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
        ihm.f fVar2 = ((BalanceActivity) view).u0.f51551c.f53218h;
        e eVar6 = new e(this, 6);
        Function1 function1K6 = K();
        Function0 function0J6 = J();
        efm.r rVarOnErrorResumeNext5 = fVar2.onErrorResumeNext(new n1i.b(9, new pzc.g(new BreadcrumbException(), 8)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext5, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe5 = rVarOnErrorResumeNext5.subscribe(new o0(9, eVar6), new o0(9, function1K6), new ozc.z(15, function0J6));
        te0.w.j0(bVar, cVarSubscribe5);
        Intrinsics.h(cVarSubscribe5);
        efm.r rVarSwitchMapSingle = i26.l.g(this.C.N(1024)).filter(new q09.c(22, new q2a.a(21))).switchMapSingle(new q09.c(23, new e(this, 8)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMapSingle, "switchMapSingle(...)");
        e eVar7 = new e(this, 9);
        Function1 function1K7 = K();
        Function0 function0J7 = J();
        efm.r rVarOnErrorResumeNext6 = rVarSwitchMapSingle.onErrorResumeNext(new n1i.b(9, new pzc.g(new BreadcrumbException(), 9)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext6, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe6 = rVarOnErrorResumeNext6.subscribe(new o0(9, eVar7), new o0(9, function1K7), new ozc.z(15, function0J7));
        te0.w.j0(bVar, cVarSubscribe6);
        Intrinsics.h(cVarSubscribe6);
    }

    public final void Q(d dVar) {
        Map mapG;
        Map mapX = a0.d.x("argCurrency", dVar.e().f306286a);
        String str = dVar.f241669c;
        if (str == null || (mapG = a0.d.x("argPocketId", str)) == null) {
            mapG = r0.g();
        }
        this.f241704t.c(new FinishCommand(-1, r0.p(mapX, mapG), null, 4));
    }

    public final d0 R(xi0.b bVar, io3.l lVar) {
        return hx7.a.O(mo3.a.w(o70.a.i(this.f241698m.g(this.i.f99584s, lVar, bVar)), this.v), this.f241705w, false, null, 24);
    }

    public final void S(io3.d dVar) {
        this.f241704t.c(new FinishCommand(-1, r0.k(new Pair("argCurrency", dVar.f163147c), new Pair("argPocketId", dVar.f163145a)), null, 4));
    }

    public final void T(xi0.b bVar, boolean z) {
        te0.e eVarW0 = ((c0) this.D).w0();
        od0.h hVar = od0.i.Companion;
        BalanceScreenContract$GlobalExchangeAccessParams balanceScreenContract$GlobalExchangeAccessParams = new BalanceScreenContract$GlobalExchangeAccessParams(bVar, z);
        hVar.getClass();
        eVarW0.set(od0.h.a(balanceScreenContract$GlobalExchangeAccessParams));
        k9 k9Var = k9.Accounts;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.f241704t.c(new FeatureCommand(new KompotOverlayFeatureConfig((ParcelableDestination) new ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureDestination(null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), true), yhi.b.SOLID, (Integer) 1024, 8)));
    }

    public final efm.r U() {
        efm.r rVarJ;
        efm.r rVarJ2;
        efm.r rVarJust;
        BalanceScreenContract$Configuration balanceScreenContract$Configuration = this.i;
        io3.l lVar = balanceScreenContract$Configuration.f99573b;
        io3.j jVar = io3.j.PERSONAL;
        efm.r rVarE = osg.b.e(this.k, false, lVar, null, io3.i.INTERNAL, jVar, qsg.a.RECENT_FIRST, balanceScreenContract$Configuration.f99584s, 4);
        BalancePickerFeatureConfig.Currencies currencies = balanceScreenContract$Configuration.d;
        if (Intrinsics.f(currencies, BalancePickerFeatureConfig.Currencies.TopUpAll.f99559a)) {
            rVarJ = nim.a.w(((ik3.c) ((v0) this.f241702r).f121693a).k(g.b.f123407a), new dz7.k(21));
        } else {
            rVarJ = zi0.c.j(h0.f322473a);
        }
        boolean zF = Intrinsics.f(currencies, BalancePickerFeatureConfig.Currencies.TopUpRevXFiat.f99561a);
        w4l.h hVar = w4l.h.f294642c;
        if (zF) {
            rVarJ2 = this.k.J(AccountId.Personal.f51414a, hVar);
        } else {
            xi0.b.Companion.getClass();
            rVarJ2 = zi0.c.j(xi0.b.f306271c);
        }
        efm.r rVarR = pd.b.r(u1.e(rVarE, rVarJ, rVarJ2), new e(this, 2));
        if (balanceScreenContract$Configuration.f99583r && (balanceScreenContract$Configuration.f99584s instanceof AccountId.Personal)) {
            rVarJust = rd0.e.c(nim.a.v(((x2) this.f241706x).l(hVar), new e(this, 1)), kotlin.coroutines.g.f186406a);
        } else {
            rVarJust = efm.r.just(zi0.c.P(f0.f322471a, false, null, 3));
            Intrinsics.h(rVarJust);
        }
        if (Intrinsics.f(balanceScreenContract$Configuration.f99578l, BalancePickerFeatureConfig.ShowBalancesSetting.InItemAndBaseCurrencies.f99563a)) {
            rVarJust = pd.b.r(rVarJust, new e(this, 3));
        }
        return nim.a.w(u1.d(rVarR, rVarJust), new e(this, 10));
    }

    public final void V(io3.d pocket) {
        AccountId account = this.i.f99584s;
        CheckoutOrder.INSTANCE.getClass();
        CheckoutOrder checkoutOrder = CheckoutOrder.f65846g;
        sri.m mVar = ((ada.b) this.f241696j).f3310h;
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(checkoutOrder, "checkoutOrder");
        Intrinsics.checkNotNullParameter(account, "account");
        xi0.a aVar = xi0.b.Companion;
        String str = pocket.f163147c;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str);
        if (cp5.d.z(bVarA) || cp5.d.y(bVarA)) {
            mVar.c(new FeatureCommand(new CryptoCommodityDetailsFeatureConfig(bVarA, null, null, null, 62)));
        } else {
            mVar.c(u0.f(new PocketDetailsDestination(new PocketDetailsFlowContract$InputData(pocket, account, true, true, (wi0.b) null, false, false, (CheckoutParams) null, checkoutOrder, (PocketDetailsInitialAction) null, false, 3184))));
        }
    }

    public final void W(String str, String str2) {
        ((npi.c) this.u).Q(new npi.d("DisabledItemDialog", str, str2, uc0.b.g(R$string.common_action_ok, this.o), null, null, 240));
    }

    public final void X(d dVar, String str) {
        int i = com.revolut.retail.feature.balance.picker.legacy.R$string.currency_unavailable_alert_title;
        t70.g gVar = this.o;
        W(uc0.b.g(i, gVar), gVar.i(com.revolut.retail.feature.balance.picker.legacy.R$string.currency_unavailable_alert_subtitle_format, cp5.d.K(dVar.e()), str));
    }
}
