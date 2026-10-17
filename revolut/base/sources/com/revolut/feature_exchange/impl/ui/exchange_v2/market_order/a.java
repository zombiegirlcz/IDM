package com.revolut.feature_exchange.impl.ui.exchange_v2.market_order;

import a08.o0;
import a08.p0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.MoneyDetails;
import efm.r;
import f9b.f;
import g1i.d0;
import g1i.m0;
import i26.l;
import i2i.a0;
import i2i.b0;
import i2i.c0;
import i2i.f0;
import i2i.g;
import i2i.h;
import i2i.j;
import i2i.o;
import i2i.q;
import i2i.t;
import i2i.u;
import i2i.v;
import i2i.x;
import i2i.y;
import i2i.z;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kpi.c;
import m1i.e0;
import m1i.k;
import m1i.m;
import od0.i;
import org.jetbrains.annotations.NotNull;
import qfm.r0;
import te0.s;
import te0.w;
import vpi.e;
import w80.b;
import wsg.n;
import zrc.d;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends pri.a implements j {

    @NotNull
    public static final q Companion = new q();
    public final AccountId A;
    public final n B;
    public final vo9.a C;
    public final q2i.a D;
    public final c E;
    public final d F;
    public i G;
    public final AtomicBoolean H;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f96946j;
    public final k k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ypi.i f96947l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final opi.d f96948m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f96949n;
    public final tpi.j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f96950p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cu8.a f96951q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final rpi.c f96952r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n2i.a f96953s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g2i.a f96954t;
    public final l4i.a u;
    public final o2i.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h f96955w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i2i.e f96956x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i2i.i f96957y;
    public final g z;

    public a(e navBarView, m router, k presentationModel, ypi.i nextButtonView, opi.d expandableDialogView, b amountFormatter, tpi.j progressView, f errorView, cu8.a kycActionWrapperDelegate, rpi.c keyboardView, n2i.a aVar, pri.f authorizedPresenterDelegate, e0 marketOrderExchangeStatusPresenterDelegate, g2i.a aVar2, l4i.a converter, o2i.a aVar3, h mapper, i2i.e balanceBreakdownMapper, i2i.i navBarMapper, g keyboardSuggestionsPresenterDelegate, AccountId accountId, gte.a featureToggleInteractor, p1i.a brlLimitsPresenterDelegate, n walletInteractor, vo9.a pocketMapper, q2i.a takeProfitStopLossDelegate, c activityResultDelegate, d cryptoScaInteractor) {
        n2i.a orderTypeDialogDelegate = aVar;
        g2i.a cryptoLimitPresenterDelegate = aVar2;
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(kycActionWrapperDelegate, "kycActionWrapperDelegate");
        Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
        Intrinsics.checkNotNullParameter(orderTypeDialogDelegate, "orderTypeDialogDelegate");
        Intrinsics.checkNotNullParameter(authorizedPresenterDelegate, "authorizedPresenterDelegate");
        Intrinsics.checkNotNullParameter(marketOrderExchangeStatusPresenterDelegate, "marketOrderExchangeStatusPresenterDelegate");
        Intrinsics.checkNotNullParameter(cryptoLimitPresenterDelegate, "cryptoLimitPresenterDelegate");
        Intrinsics.checkNotNullParameter(converter, "converter");
        o2i.a recurringOrderDelegate = aVar3;
        Intrinsics.checkNotNullParameter(recurringOrderDelegate, "recurringOrderDelegate");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(balanceBreakdownMapper, "balanceBreakdownMapper");
        Intrinsics.checkNotNullParameter(navBarMapper, "navBarMapper");
        Intrinsics.checkNotNullParameter(keyboardSuggestionsPresenterDelegate, "keyboardSuggestionsPresenterDelegate");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(brlLimitsPresenterDelegate, "brlLimitsPresenterDelegate");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        Intrinsics.checkNotNullParameter(takeProfitStopLossDelegate, "takeProfitStopLossDelegate");
        Intrinsics.checkNotNullParameter(activityResultDelegate, "activityResultDelegate");
        Intrinsics.checkNotNullParameter(cryptoScaInteractor, "cryptoScaInteractor");
        this.i = navBarView;
        this.f96946j = router;
        this.k = presentationModel;
        this.f96947l = nextButtonView;
        this.f96948m = expandableDialogView;
        this.f96949n = amountFormatter;
        this.o = progressView;
        this.f96950p = errorView;
        this.f96951q = kycActionWrapperDelegate;
        this.f96952r = keyboardView;
        this.f96953s = orderTypeDialogDelegate;
        this.f96954t = cryptoLimitPresenterDelegate;
        this.u = converter;
        this.v = recurringOrderDelegate;
        this.f96955w = mapper;
        this.f96956x = balanceBreakdownMapper;
        this.f96957y = navBarMapper;
        this.z = keyboardSuggestionsPresenterDelegate;
        this.A = accountId;
        this.B = walletInteractor;
        this.C = pocketMapper;
        q2i.a aVar4 = takeProfitStopLossDelegate;
        this.D = aVar4;
        this.E = activityResultDelegate;
        this.F = cryptoScaInteractor;
        this.H = new AtomicBoolean(true);
        boolean z = accountId instanceof AccountId.Personal;
        pri.f[] elements = {authorizedPresenterDelegate, z ? orderTypeDialogDelegate : null, marketOrderExchangeStatusPresenterDelegate, z ? recurringOrderDelegate : null, z ? cryptoLimitPresenterDelegate : null, z ? aVar4 : null, keyboardSuggestionsPresenterDelegate, brlLimitsPresenterDelegate};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        Intrinsics.checkNotNullParameter(listL, "<set-?>");
        this.f239030h = listL;
    }

    public static r S(r rVar) {
        return l.g(rVar).map(new i2i.a(16, new o(3)));
    }

    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        i2i.k view = (i2i.k) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Object obj2 = this.k;
        ((nri.a) obj2).init();
        Integer numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_back);
        vpi.b bVar = (vpi.b) this.i;
        NavBarWithAvatar navBarWithAvatar = bVar.f291220j;
        if (navBarWithAvatar == null) {
            Intrinsics.r("navBarWithAvatarView");
            throw null;
        }
        navBarWithAvatar.setNavigationButtonIcon(numValueOf);
        NavBarWithAvatar navBarWithAvatar2 = bVar.f291220j;
        if (navBarWithAvatar2 == null) {
            Intrinsics.r("navBarWithAvatarView");
            throw null;
        }
        r0 r0VarD = w.D(navBarWithAvatar2.f59338a, new i2i.m(this, 8));
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new p0(19, new h2i.b(new BreadcrumbException(), 26)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new o0(23, function1K), new ea9.c(24, a0.f157948a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar2 = this.f239031a;
        w.j0(bVar2, hVarW);
        NavBarWithAvatar navBarWithAvatar3 = bVar.f291220j;
        if (navBarWithAvatar3 == null) {
            Intrinsics.r("navBarWithAvatarView");
            throw null;
        }
        r0 r0VarD2 = w.D(navBarWithAvatar3.f59343j, new i2i.m(this, 9));
        Function1 function1K2 = K();
        pfm.a aVar3 = new pfm.a(r0VarD2, new p0(19, new h2i.b(new BreadcrumbException(), 27)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new o0(23, function1K2), new ea9.c(24, b0.f157951a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar2, hVarW2);
        d0 d0Var = (d0) obj2;
        r rVarF3 = d0Var.F3();
        g1i.b bVar3 = d0Var.e;
        r rVarFlatMap = rVarF3.flatMap(new i2i.a(5, new i2i.m(this, 10)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        r rVarF = o70.a.f(rVarFlatMap);
        i2i.m mVar = new i2i.m(this, 11);
        Function1 function1K3 = K();
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new p0(19, new h2i.b(new BreadcrumbException(), 25)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o0(23, mVar), new o0(23, function1K3), new ea9.c(24, function0J));
        w.j0(bVar2, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        r rVarF32 = d0Var.F3();
        te0.e eVarE0 = ((m0) bVar3).E0();
        s sVar = s.f270018a;
        r rVarC = eVarE0.c(sVar);
        r rVarC2 = ((m0) bVar3).D0().c(sVar);
        r rVarC3 = ((m0) bVar3).C0().c(sVar);
        r rVarFlatMap2 = d0Var.F3().distinctUntilChanged(new i2i.a(11, new o(2))).flatMap(new i2i.a(12, new i2i.m(this, 16)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap2, "flatMap(...)");
        r rVarDistinctUntilChanged = w.o(rVarF32, rVarC, rVarC2, rVarC3, rVarFlatMap2).map(new i2i.a(2, new i2i.m(this, 1))).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        r rVarF2 = o70.a.f(rVarDistinctUntilChanged);
        i2i.n nVar = new i2i.n(view, this);
        Function1 function1K4 = K();
        Function0 function0J2 = J();
        r rVarOnErrorResumeNext2 = rVarF2.onErrorResumeNext(new p0(19, new h2i.b(new BreadcrumbException(), 23)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new o0(23, nVar), new o0(23, function1K4), new ea9.c(24, function0J2));
        w.j0(bVar2, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        ypi.i iVar = this.f96947l;
        iVar.setEnabled(false);
        r rVarF4 = o70.a.f(d0Var.E3());
        i2i.m mVar2 = new i2i.m(this, 5);
        Function1 function1K5 = K();
        Function0 function0J3 = J();
        r rVarOnErrorResumeNext3 = rVarF4.onErrorResumeNext(new p0(19, new h2i.b(new BreadcrumbException(), 24)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new o0(23, mVar2), new o0(23, function1K5), new ea9.c(24, function0J3));
        w.j0(bVar2, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        MarketOrderActivityV2 marketOrderActivityV2 = (MarketOrderActivityV2) view;
        CenteredAmountDelegate centeredAmountDelegate = marketOrderActivityV2.H0;
        r rVarMergeWith = centeredAmountDelegate.f51965h.f121375b.mergeWith(centeredAmountDelegate.i.f121375b);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        r0 r0VarD3 = w.D(rVarMergeWith, new i2i.m(this, 12));
        Function1 function1K6 = K();
        pfm.a aVar4 = new pfm.a(r0VarD3, new p0(19, new h2i.b(new BreadcrumbException(), 20)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new o0(23, function1K6), new ea9.c(24, x.f157980a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar2, hVarW3);
        CenteredAmountDelegate centeredAmountDelegate2 = marketOrderActivityV2.H0;
        r map = marketOrderActivityV2.F0.map(new i2i.a(0, new i0k.f(28)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.b bVarSwitchMapCompletable = map.switchMapCompletable(new i2i.a(1, new i2i.m(this, 24)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        Function1 function1K7 = K();
        p0 p0Var = new p0(19, new h2i.b(new BreadcrumbException(), 14));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar5 = new pfm.a(bVarSwitchMapCompletable, p0Var, 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new o0(23, function1K7), new ea9.c(24, t.f157976a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar2, hVarW4);
        r0 r0VarD4 = w.D(iVar.s(), new i2i.m(this, 2));
        Function1 function1K8 = K();
        pfm.a aVar6 = new pfm.a(r0VarD4, new p0(19, new h2i.b(new BreadcrumbException(), 21)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new o0(23, function1K8), new ea9.c(24, y.f157981a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        w.j0(bVar2, hVarW5);
        r rVarFlatMapSingle = centeredAmountDelegate2.e.f121375b.flatMapSingle(new i2i.a(4, new i2i.m(this, 6)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMapSingle, "flatMapSingle(...)");
        r0 r0VarD5 = w.D(rVarFlatMapSingle, new i2i.m(this, 7));
        Function1 function1K9 = K();
        pfm.a aVar7 = new pfm.a(r0VarD5, new p0(19, new h2i.b(new BreadcrumbException(), 17)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar7.w(new o0(23, function1K9), new ea9.c(24, i2i.w.f157979a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        w.j0(bVar2, hVarW6);
        r0 r0VarD6 = w.D(marketOrderActivityV2.f96942x0.f53220l, new i2i.m(this, 0));
        Function1 function1K10 = K();
        pfm.a aVar8 = new pfm.a(r0VarD6, new p0(19, new h2i.b(new BreadcrumbException(), 15)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar8, "onErrorResumeNext(...)");
        ofm.h hVarW7 = aVar8.w(new o0(23, function1K10), new ea9.c(24, u.f157977a));
        Intrinsics.checkNotNullExpressionValue(hVarW7, "subscribe(...)");
        w.j0(bVar2, hVarW7);
        r rVarFilter = ((CellDetailsActionDelegate) marketOrderActivityV2.A0.getValue()).d.filter(new i2i.a(6, new o(0)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        r0 r0VarD7 = w.D(rVarFilter, new i2i.m(this, 15));
        Function1 function1K11 = K();
        pfm.a aVar9 = new pfm.a(r0VarD7, new p0(19, new h2i.b(new BreadcrumbException(), 16)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar9, "onErrorResumeNext(...)");
        ofm.h hVarW8 = aVar9.w(new o0(23, function1K11), new ea9.c(24, v.f157978a));
        Intrinsics.checkNotNullExpressionValue(hVarW8, "subscribe(...)");
        w.j0(bVar2, hVarW8);
        r0 r0VarD8 = w.D(w.a0(centeredAmountDelegate2.f.f121375b, new o(1)), new hie.b(1, this, a.class, "handleInputHintClick", "handleInputHintClick(Lcom/revolut/feature_exchange/impl/ui/exchange_v2/market_order/MarketOrderPresenterV2$HintClickData;)Lio/reactivex/Completable;", 0, 27));
        Function1 function1K12 = K();
        pfm.a aVar10 = new pfm.a(r0VarD8, new p0(19, new h2i.b(new BreadcrumbException(), 22)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar10, "onErrorResumeNext(...)");
        ofm.h hVarW9 = aVar10.w(new o0(23, function1K12), new ea9.c(24, z.f157982a));
        Intrinsics.checkNotNullExpressionValue(hVarW9, "subscribe(...)");
        w.j0(bVar2, hVarW9);
        r rVarA0 = w.a0(marketOrderActivityV2.S(), new i0k.f(29));
        i2i.m mVar3 = new i2i.m(this, 4);
        Function1 function1K13 = K();
        Function0 function0J4 = J();
        r rVarOnErrorResumeNext4 = rVarA0.onErrorResumeNext(new p0(19, new h2i.b(new BreadcrumbException(), 18)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new o0(23, mVar3), new o0(23, function1K13), new ea9.c(24, function0J4));
        w.j0(bVar2, cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
        r rVarV = ((opi.b) this.f96948m).V();
        i2i.m mVar4 = new i2i.m(this, 13);
        Function1 function1K14 = K();
        Function0 function0J5 = J();
        r rVarOnErrorResumeNext5 = rVarV.onErrorResumeNext(new p0(19, new h2i.b(new BreadcrumbException(), 19)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext5, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe5 = rVarOnErrorResumeNext5.subscribe(new o0(23, mVar4), new o0(23, function1K14), new ea9.c(24, function0J5));
        w.j0(bVar2, cVarSubscribe5);
        Intrinsics.h(cVarSubscribe5);
        r map2 = d0Var.F3().map(new g1i.e(22, new g1i.d(d0Var, 14)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        i2i.n nVar2 = new i2i.n(this, view);
        Function1 function1K15 = K();
        Function0 function0J6 = J();
        r rVarOnErrorResumeNext6 = map2.onErrorResumeNext(new p0(19, new i2i.d0(new BreadcrumbException(), 6)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext6, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe6 = rVarOnErrorResumeNext6.subscribe(new o0(23, nVar2), new o0(23, function1K15), new ea9.c(24, function0J6));
        w.j0(bVar2, cVarSubscribe6);
        Intrinsics.h(cVarSubscribe6);
        c cVar = this.E;
        r rVarS = S(cVar.N(325));
        Intrinsics.checkNotNullExpressionValue(rVarS, "extractTPSLValues(...)");
        i2i.m mVar5 = new i2i.m(this, 18);
        Function1 function1K16 = K();
        Function0 function0J7 = J();
        r rVarOnErrorResumeNext7 = rVarS.onErrorResumeNext(new p0(19, new h2i.b(new BreadcrumbException(), 29)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext7, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe7 = rVarOnErrorResumeNext7.subscribe(new o0(23, mVar5), new o0(23, function1K16), new ea9.c(24, function0J7));
        w.j0(bVar2, cVarSubscribe7);
        Intrinsics.h(cVarSubscribe7);
        r rVarS2 = S(cVar.N(326));
        Intrinsics.checkNotNullExpressionValue(rVarS2, "extractTPSLValues(...)");
        i2i.m mVar6 = new i2i.m(this, 21);
        Function1 function1K17 = K();
        Function0 function0J8 = J();
        r rVarOnErrorResumeNext8 = rVarS2.onErrorResumeNext(new p0(19, new i2i.d0(new BreadcrumbException(), 0)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext8, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe8 = rVarOnErrorResumeNext8.subscribe(new o0(23, mVar6), new o0(23, function1K17), new ea9.c(24, function0J8));
        w.j0(bVar2, cVarSubscribe8);
        Intrinsics.h(cVarSubscribe8);
        r rVarS3 = S(cVar.N(327));
        Intrinsics.checkNotNullExpressionValue(rVarS3, "extractTPSLValues(...)");
        i2i.m mVar7 = new i2i.m(this, 22);
        Function1 function1K18 = K();
        Function0 function0J9 = J();
        r rVarOnErrorResumeNext9 = rVarS3.onErrorResumeNext(new p0(19, new i2i.d0(new BreadcrumbException(), 1)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext9, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe9 = rVarOnErrorResumeNext9.subscribe(new o0(23, mVar7), new o0(23, function1K18), new ea9.c(24, function0J9));
        w.j0(bVar2, cVarSubscribe9);
        Intrinsics.h(cVarSubscribe9);
        efm.b bVarFlatMapCompletable = cVar.N(328).flatMapCompletable(new i2i.a(21, new i2i.m(this, 23)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1K19 = K();
        p0 p0Var2 = new p0(19, new i2i.d0(new BreadcrumbException(), 2));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar11 = new pfm.a(bVarFlatMapCompletable, p0Var2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar11, "onErrorResumeNext(...)");
        ofm.h hVarW10 = aVar11.w(new o0(23, function1K19), new ea9.c(24, i2i.e0.f157957a));
        Intrinsics.checkNotNullExpressionValue(hVarW10, "subscribe(...)");
        w.j0(bVar2, hVarW10);
        int i = 3;
        efm.b bVarFlatMapCompletable2 = marketOrderActivityV2.D0.d.flatMapCompletable(new i2i.a(i, new i2i.m(this, 3)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable2, "flatMapCompletable(...)");
        Function1 function1K20 = K();
        p0 p0Var3 = new p0(19, new i2i.d0(new BreadcrumbException(), i));
        bVarFlatMapCompletable2.getClass();
        pfm.a aVar12 = new pfm.a(bVarFlatMapCompletable2, p0Var3, 2);
        Intrinsics.checkNotNullExpressionValue(aVar12, "onErrorResumeNext(...)");
        ofm.h hVarW11 = aVar12.w(new o0(23, function1K20), new ea9.c(24, f0.f157960a));
        Intrinsics.checkNotNullExpressionValue(hVarW11, "subscribe(...)");
        w.j0(bVar2, hVarW11);
    }

    public final void Q(Float f, wd6.h hVar) {
        if (f == null) {
            return;
        }
        efm.d0 d0VarFirstOrError = ((d0) this.k).F3().firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        pfm.a aVar = new pfm.a(o70.a.i(d0VarFirstOrError), new i2i.a(14, new hsa.l(this, 11, f, hVar)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        pfm.a aVarV = ue0.e.v(aVar);
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(aVarV, new p0(19, new h2i.b(new BreadcrumbException(), 28)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new o0(23, function1K), new ea9.c(24, c0.f157954a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f239031a, hVarW);
    }

    public final pfm.a R() {
        efm.d0 d0VarFirstOrError = ((d0) this.k).F3().firstOrError();
        i2i.a aVar = new i2i.a(19, new i2i.m(this, 20));
        d0VarFirstOrError.getClass();
        pfm.a aVar2 = new pfm.a(d0VarFirstOrError, aVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        return aVar2;
    }

    public final r T(ExchangeOrderDraft exchangeOrderDraft) {
        wd6.e eVar = exchangeOrderDraft.f96881c;
        MoneyDetails moneyDetails = exchangeOrderDraft.f96879a;
        if (eVar == wd6.e.SELL && cp5.d.z(moneyDetails.f96897a)) {
            return m70.a.g(nim.a.w(nim.a.z(((d0) this.k).J3(moneyDetails.f96897a), new o(4)), new o(5)), null, null, 3);
        }
        i.Companion.getClass();
        return w.h(i.f224256b);
    }

    public final pfm.a U(String str, h0 h0Var, Function1 function1, r1i.h hVar) {
        efm.d0 d0VarFirstOrError = ((d0) this.k).F3().firstOrError();
        i2i.a aVar = new i2i.a(9, new a5b.a(hVar, this, str, h0Var, function1));
        d0VarFirstOrError.getClass();
        pfm.a aVar2 = new pfm.a(d0VarFirstOrError, aVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        return ue0.e.v(aVar2);
    }
}
