package m1i;

import android.app.Activity;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.MarketOrderActivity;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.tracking.v3.RatesSourceContext;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class i1 extends pri.a implements l {

    @NotNull
    public static final m0 Companion = new m0();
    public final p1i.a A;
    public final ji5.i B;
    public final g3l.a C;
    public final zrc.d D;
    public final kpi.c E;
    public boolean F;
    public final AtomicBoolean G;
    public final xpi.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f201543j;
    public final k k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ypi.i f201544l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w80.b f201545m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final tpi.j f201546n;
    public final f9b.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cu8.a f201547p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rpi.c f201548q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tri.c f201549r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c2i.k f201550s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h1i.a f201551t;
    public final l4i.a u;
    public final e2i.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h f201552w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k5i.c f201553x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n1i.d f201554y;
    public final gte.a z;

    public i1(xpi.g navBarView, m router, k presentationModel, ypi.i nextButtonView, w80.b amountFormatter, tpi.j progressView, f9b.f errorView, cu8.a kycActionWrapperDelegate, rpi.c keyboardView, tri.c backButtonView, c2i.k kVar, pri.f authorizedPresenterDelegate, e0 marketOrderExchangeStatusPresenterDelegate, h1i.a aVar, l4i.a converter, e2i.a aVar2, h mapper, k5i.c exchangeCurrencyRateMapper, n1i.d keyboardSuggestionsPresenterDelegate, AccountId accountId, gte.a featureToggleInteractor, p1i.a limitsPresenterDelegate, ji5.i cryptoOnboardingInteractor, g3l.a statusDialogViewConfigurationDispatcher, zrc.d cryptoScaInteractor, kpi.c activityResultDelegate) {
        c2i.k orderTypeDialogDelegate = kVar;
        h1i.a cryptoLimitPresenterDelegate = aVar;
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(kycActionWrapperDelegate, "kycActionWrapperDelegate");
        Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        Intrinsics.checkNotNullParameter(orderTypeDialogDelegate, "orderTypeDialogDelegate");
        Intrinsics.checkNotNullParameter(authorizedPresenterDelegate, "authorizedPresenterDelegate");
        Intrinsics.checkNotNullParameter(marketOrderExchangeStatusPresenterDelegate, "marketOrderExchangeStatusPresenterDelegate");
        Intrinsics.checkNotNullParameter(cryptoLimitPresenterDelegate, "cryptoLimitPresenterDelegate");
        Intrinsics.checkNotNullParameter(converter, "converter");
        e2i.a recurringOrderDelegate = aVar2;
        Intrinsics.checkNotNullParameter(recurringOrderDelegate, "recurringOrderDelegate");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(exchangeCurrencyRateMapper, "exchangeCurrencyRateMapper");
        Intrinsics.checkNotNullParameter(keyboardSuggestionsPresenterDelegate, "keyboardSuggestionsPresenterDelegate");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(limitsPresenterDelegate, "limitsPresenterDelegate");
        Intrinsics.checkNotNullParameter(cryptoOnboardingInteractor, "cryptoOnboardingInteractor");
        Intrinsics.checkNotNullParameter(statusDialogViewConfigurationDispatcher, "statusDialogViewConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(cryptoScaInteractor, "cryptoScaInteractor");
        Intrinsics.checkNotNullParameter(activityResultDelegate, "activityResultDelegate");
        this.i = navBarView;
        this.f201543j = router;
        this.k = presentationModel;
        this.f201544l = nextButtonView;
        this.f201545m = amountFormatter;
        this.f201546n = progressView;
        this.o = errorView;
        this.f201547p = kycActionWrapperDelegate;
        this.f201548q = keyboardView;
        this.f201549r = backButtonView;
        this.f201550s = orderTypeDialogDelegate;
        this.f201551t = cryptoLimitPresenterDelegate;
        this.u = converter;
        this.v = recurringOrderDelegate;
        this.f201552w = mapper;
        this.f201553x = exchangeCurrencyRateMapper;
        this.f201554y = keyboardSuggestionsPresenterDelegate;
        this.z = featureToggleInteractor;
        this.A = limitsPresenterDelegate;
        this.B = cryptoOnboardingInteractor;
        this.C = statusDialogViewConfigurationDispatcher;
        this.D = cryptoScaInteractor;
        this.E = activityResultDelegate;
        boolean z = accountId instanceof AccountId.Personal;
        pri.f[] elements = {authorizedPresenterDelegate, z ? orderTypeDialogDelegate : null, marketOrderExchangeStatusPresenterDelegate, z ? recurringOrderDelegate : null, z ? cryptoLimitPresenterDelegate : null, keyboardSuggestionsPresenterDelegate, limitsPresenterDelegate};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        Intrinsics.checkNotNullParameter(listL, "<set-?>");
        this.f239030h = listL;
        this.F = true;
        this.G = new AtomicBoolean(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q(m1i.i1 r16, m1i.d1 r17, gim.c r18) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m1i.i1.Q(m1i.i1, m1i.d1, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        if (nim.a.a(r7, r1) == r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if (nim.a.a(r7, r1) == r2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object R(m1i.i1 r7, gim.c r8) {
        /*
            m1i.m r0 = r7.f201543j
            boolean r1 = r8 instanceof m1i.e1
            if (r1 == 0) goto L15
            r1 = r8
            m1i.e1 r1 = (m1i.e1) r1
            int r2 = r1.f201530w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f201530w = r2
            goto L1a
        L15:
            m1i.e1 r1 = new m1i.e1
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f201530w
            r4 = 3
            r5 = 1
            r6 = 2
            if (r3 == 0) goto L3f
            if (r3 == r5) goto L3b
            if (r3 == r6) goto L37
            if (r3 != r4) goto L2f
            yhm.o.b(r8)
            goto L92
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            yhm.o.b(r8)
            goto L82
        L3b:
            yhm.o.b(r8)
            goto L56
        L3f:
            yhm.o.b(r8)
            m1i.k r8 = r7.k
            g1i.d0 r8 = (g1i.d0) r8
            ang.f r8 = r8.i
            r3 = 0
            efm.d0 r8 = r8.f(r3)
            r1.f201530w = r5
            java.lang.Object r8 = nim.a.b(r8, r1)
            if (r8 != r2) goto L56
            goto L91
        L56:
            do3.n r8 = (do3.n) r8
            kotlin.jvm.internal.Intrinsics.h(r8)
            wi0.a r3 = wi0.b.Companion
            r3.getClass()
            wi0.b r3 = wi0.b.f297756l
            boolean r8 = te0.w.S(r8, r3)
            if (r8 == 0) goto L85
            cu8.a r7 = r7.f201547p
            ks8.a r8 = new ks8.a
            int r3 = com.revolut.feature_exchange.impl.R$string.fx_orders_kyc_verify_identity_title
            r8.<init>(r3)
            efm.b r0 = m1i.m.c(r0, r4)
            pfm.a r7 = cu8.a.a(r7, r8, r0)
            r1.f201530w = r6
            java.lang.Object r7 = nim.a.a(r7, r1)
            if (r7 != r2) goto L82
            goto L91
        L82:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L85:
            efm.b r7 = m1i.m.c(r0, r4)
            r1.f201530w = r4
            java.lang.Object r7 = nim.a.a(r7, r1)
            if (r7 != r2) goto L92
        L91:
            return r2
        L92:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m1i.i1.R(m1i.i1, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
    
        if (nim.a.a(r10, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d8, code lost:
    
        if (r11.invoke(r0) == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object S(m1i.i1 r10, m1i.d1 r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m1i.i1.S(m1i.i1, m1i.d1, gim.c):java.lang.Object");
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        final n view = (n) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        this.F = true;
        Object obj2 = this.k;
        ((nri.a) obj2).init();
        Integer numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_back);
        xpi.c cVar = (xpi.c) this.i;
        cVar.e0(numValueOf);
        NavBarWithToolbar navBarWithToolbar = cVar.f307974j;
        if (navBarWithToolbar == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        efm.b bVarFlatMapCompletable = navBarWithToolbar.p0().flatMapCompletable(new j0(new i0(this, 9), 7));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1K = K();
        a08.f0 f0Var = new a08.f0(24, new m08.i(new BreadcrumbException(), 17));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarFlatMapCompletable, f0Var, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new a08.s(24, function1K), new j7a.j(7, a1.f201510a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        te0.w.j0(bVar, hVarW);
        efm.r rVarMergeWith = cVar.Q().mergeWith(this.f201549r.f273801b);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        qfm.r0 r0VarD = te0.w.D(rVarMergeWith, new i0(this, 11));
        Function1 function1K2 = K();
        pfm.a aVar3 = new pfm.a(r0VarD, new a08.f0(24, new m08.i(new BreadcrumbException(), 18)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new a08.s(24, function1K2), new j7a.j(7, b1.f201514a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar, hVarW2);
        g1i.d0 d0Var = (g1i.d0) obj2;
        efm.r rVarF3 = d0Var.F3();
        g1i.b bVar2 = d0Var.e;
        efm.r rVarF = o70.a.f(rVarF3);
        i0 i0Var = new i0(this, 12);
        Function1 function1K3 = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new a08.f0(24, new m08.i(new BreadcrumbException(), 16)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a08.s(24, i0Var), new a08.s(24, function1K3), new j7a.j(7, function0J));
        te0.w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        efm.r rVarF32 = d0Var.F3();
        te0.e eVarE0 = ((g1i.m0) bVar2).E0();
        te0.s sVar = te0.s.f270018a;
        efm.r rVarDistinctUntilChanged = te0.w.n(rVarF32, eVarE0.c(sVar), ((g1i.m0) bVar2).D0().c(sVar), ((g1i.m0) bVar2).C0().c(sVar)).map(new j0(new i0(this, 8), 3)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        efm.r rVarF2 = o70.a.f(rVarDistinctUntilChanged);
        final int i = 0;
        Function1 function1 = new Function1() { // from class: m1i.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                Activity activity;
                switch (i) {
                    case 0:
                        List list = (List) obj3;
                        Intrinsics.h(list);
                        ((MarketOrderActivity) view).setItems(list);
                        i1 i1Var = this;
                        if (i1Var.F && (activity = ((rpi.b) i1Var.f201548q).f256387h) != null) {
                            e0m.e.e(activity.getCurrentFocus());
                        }
                        i1Var.F = false;
                        break;
                    default:
                        wd6.c currencyMode = (wd6.c) obj3;
                        Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
                        int i2 = p0.f[currencyMode.ordinal()];
                        AnalyticsContext analyticsContext = null;
                        grl.g0 g0Var = i2 != 1 ? i2 != 2 ? (i2 == 3 || i2 == 4) ? grl.g0.FIAT : null : grl.g0.COMMODITY : grl.g0.CRYPTO;
                        if (g0Var != null) {
                            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                            RatesSourceContext.a aVarNewBuilder = RatesSourceContext.newBuilder();
                            aVarNewBuilder.h(g0Var);
                            com.google.protobuf.w0 w0VarA = aVarNewBuilder.a();
                            companion.getClass();
                            analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
                        }
                        ((MarketOrderActivity) view).f96869t0 = analyticsContext;
                        ((com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog.a) this.f201550s).f96931n = analyticsContext;
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1K4 = K();
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarF2.onErrorResumeNext(new a08.f0(24, new m08.i(new BreadcrumbException(), 14)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new a08.s(24, function1), new a08.s(24, function1K4), new j7a.j(7, function0J2));
        te0.w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        ypi.i iVar = this.f201544l;
        iVar.setEnabled(false);
        efm.r rVarF4 = o70.a.f(d0Var.E3());
        i0 i0Var2 = new i0(this, 13);
        Function1 function1K5 = K();
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = rVarF4.onErrorResumeNext(new a08.f0(24, new m08.i(new BreadcrumbException(), 15)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new a08.s(24, i0Var2), new a08.s(24, function1K5), new j7a.j(7, function0J3));
        te0.w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        MarketOrderActivity marketOrderActivity = (MarketOrderActivity) view;
        qfm.r0 r0VarD2 = te0.w.D(marketOrderActivity.c1().f51620q, new i0(this, 5));
        Function1 function1K6 = K();
        pfm.a aVar4 = new pfm.a(r0VarD2, new a08.f0(24, new m08.i(new BreadcrumbException(), 9)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new a08.s(24, function1K6), new j7a.j(7, t0.f201582a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        te0.w.j0(bVar, hVarW3);
        efm.r map = marketOrderActivity.C0.map(new m0g.d(5, new m18.n(7)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        int i2 = 0;
        int i3 = 1;
        T(map, new kotlin.jvm.internal.h0() { // from class: m1i.v0
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj3) {
                return ((ExchangeOrderDraft) obj3).f96879a;
            }
        }, new lrk.h(i3, this.k, k.class, "setTopAmount", "setTopAmount(J)Lio/reactivex/Completable;", i2, 9), r1i.h.TOP);
        efm.r map2 = marketOrderActivity.D0.map(new m0g.d(4, new m18.n(6)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        T(map2, new kotlin.jvm.internal.h0() { // from class: m1i.z0
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj3) {
                return ((ExchangeOrderDraft) obj3).f96880b;
            }
        }, new lrk.h(i3, this.k, k.class, "setBottomAmount", "setBottomAmount(J)Lio/reactivex/Completable;", i2, 11), r1i.h.BOTTOM);
        efm.r rVarMerge = efm.r.merge(marketOrderActivity.c1().e.f121375b.map(new m0g.d(27, new m18.n(16))), marketOrderActivity.c1().k.f121375b.map(new m0g.d(28, new m18.n(17))));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        qfm.r0 r0VarD3 = te0.w.D(rVarMerge, new i0(this, 3));
        Function1 function1K7 = K();
        pfm.a aVar5 = new pfm.a(r0VarD3, new a08.f0(24, new m08.i(new BreadcrumbException(), 11)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new a08.s(24, function1K7), new j7a.j(7, w0.f201589a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        te0.w.j0(bVar, hVarW4);
        qfm.r0 r0VarD4 = te0.w.D(iVar.s(), new i0(this, 4));
        Function1 function1K8 = K();
        pfm.a aVar6 = new pfm.a(r0VarD4, new a08.f0(24, new m08.i(new BreadcrumbException(), 10)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new a08.s(24, function1K8), new j7a.j(7, u0.f201586a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        te0.w.j0(bVar, hVarW5);
        efm.r rVarWithLatestFrom = efm.r.merge(marketOrderActivity.c1().f.f121375b.map(new m0g.d(29, new m18.n(18))), marketOrderActivity.c1().f51616l.f121375b.map(new j0(new m18.n(19), 0))).withLatestFrom(d0Var.F3(), new j0(new lxi.g(12), 1));
        Intrinsics.checkNotNullExpressionValue(rVarWithLatestFrom, "withLatestFrom(...)");
        qfm.r0 r0VarD5 = te0.w.D(rVarWithLatestFrom, new i0(this, 6));
        Function1 function1K9 = K();
        pfm.a aVar7 = new pfm.a(r0VarD5, new a08.f0(24, new m08.i(new BreadcrumbException(), 8)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar7.w(new a08.s(24, function1K9), new j7a.j(7, s0.f201578a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        te0.w.j0(bVar, hVarW6);
        qfm.r0 r0VarD6 = te0.w.D(marketOrderActivity.f96870v0.f53220l, new i0(this, 2));
        Function1 function1K10 = K();
        pfm.a aVar8 = new pfm.a(r0VarD6, new a08.f0(24, new m08.i(new BreadcrumbException(), 7)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar8, "onErrorResumeNext(...)");
        ofm.h hVarW7 = aVar8.w(new a08.s(24, function1K10), new j7a.j(7, r0.f201573a));
        Intrinsics.checkNotNullExpressionValue(hVarW7, "subscribe(...)");
        te0.w.j0(bVar, hVarW7);
        efm.r rVarMerge2 = efm.r.merge(te0.w.a0(marketOrderActivity.c1().i.f121375b, new m18.n(12)), te0.w.a0(marketOrderActivity.c1().o.f121375b, new m18.n(13)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge2, "merge(...)");
        qfm.r0 r0VarD7 = te0.w.D(rVarMerge2, new lrk.h(1, this, i1.class, "handleInputHintClick", "handleInputHintClick(Lcom/revolut/feature_exchange/impl/ui/exchange/market_order/MarketOrderPresenter$HintClickData;)Lio/reactivex/Completable;", 0, 10));
        Function1 function1K11 = K();
        pfm.a aVar9 = new pfm.a(r0VarD7, new a08.f0(24, new m08.i(new BreadcrumbException(), 12)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar9, "onErrorResumeNext(...)");
        ofm.h hVarW8 = aVar9.w(new a08.s(24, function1K11), new j7a.j(7, x0.f201593a));
        Intrinsics.checkNotNullExpressionValue(hVarW8, "subscribe(...)");
        te0.w.j0(bVar, hVarW8);
        efm.b bVarFlatMapCompletable2 = efm.r.merge(marketOrderActivity.c1().f51614h.f121375b.map(new m0g.d(24, new m18.n(14))), marketOrderActivity.c1().f51618n.f121375b.map(new m0g.d(25, new m18.n(15)))).flatMapCompletable(new m0g.d(26, new i0(this, 1)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable2, "flatMapCompletable(...)");
        Function1 function1K12 = K();
        a08.f0 f0Var2 = new a08.f0(24, new m08.i(new BreadcrumbException(), 13));
        bVarFlatMapCompletable2.getClass();
        pfm.a aVar10 = new pfm.a(bVarFlatMapCompletable2, f0Var2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar10, "onErrorResumeNext(...)");
        ofm.h hVarW9 = aVar10.w(new a08.s(24, function1K12), new j7a.j(7, y0.f201596a));
        Intrinsics.checkNotNullExpressionValue(hVarW9, "subscribe(...)");
        te0.w.j0(bVar, hVarW9);
        ihm.f fVar = this.f201554y.f211369l;
        i0 i0Var3 = new i0(this, 0);
        Function1 function1K13 = K();
        Function0 function0J4 = J();
        efm.r rVarOnErrorResumeNext4 = fVar.onErrorResumeNext(new a08.f0(24, new m08.i(new BreadcrumbException(), 20)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new a08.s(24, i0Var3), new a08.s(24, function1K13), new j7a.j(7, function0J4));
        te0.w.j0(bVar, cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
        efm.r map3 = d0Var.F3().map(new g1i.e(22, new g1i.d(d0Var, 14)));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        final int i5 = 1;
        Function1 function12 = new Function1() { // from class: m1i.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                Activity activity;
                switch (i5) {
                    case 0:
                        List list = (List) obj3;
                        Intrinsics.h(list);
                        ((MarketOrderActivity) view).setItems(list);
                        i1 i1Var = this;
                        if (i1Var.F && (activity = ((rpi.b) i1Var.f201548q).f256387h) != null) {
                            e0m.e.e(activity.getCurrentFocus());
                        }
                        i1Var.F = false;
                        break;
                    default:
                        wd6.c currencyMode = (wd6.c) obj3;
                        Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
                        int i22 = p0.f[currencyMode.ordinal()];
                        AnalyticsContext analyticsContext = null;
                        grl.g0 g0Var = i22 != 1 ? i22 != 2 ? (i22 == 3 || i22 == 4) ? grl.g0.FIAT : null : grl.g0.COMMODITY : grl.g0.CRYPTO;
                        if (g0Var != null) {
                            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                            RatesSourceContext.a aVarNewBuilder = RatesSourceContext.newBuilder();
                            aVarNewBuilder.h(g0Var);
                            com.google.protobuf.w0 w0VarA = aVarNewBuilder.a();
                            companion.getClass();
                            analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
                        }
                        ((MarketOrderActivity) view).f96869t0 = analyticsContext;
                        ((com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog.a) this.f201550s).f96931n = analyticsContext;
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1K14 = K();
        Function0 function0J5 = J();
        efm.r rVarOnErrorResumeNext5 = map3.onErrorResumeNext(new a08.f0(24, new m08.i(new BreadcrumbException(), 22)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext5, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe5 = rVarOnErrorResumeNext5.subscribe(new a08.s(24, function12), new a08.s(24, function1K14), new j7a.j(7, function0J5));
        te0.w.j0(bVar, cVarSubscribe5);
        Intrinsics.h(cVarSubscribe5);
        efm.b bVarFlatMapCompletable3 = this.E.N(328).flatMapCompletable(new j0(new i0(this, 7), 2));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable3, "flatMapCompletable(...)");
        Function1 function1K15 = K();
        a08.f0 f0Var3 = new a08.f0(24, new m08.i(new BreadcrumbException(), 19));
        bVarFlatMapCompletable3.getClass();
        pfm.a aVar11 = new pfm.a(bVarFlatMapCompletable3, f0Var3, 2);
        Intrinsics.checkNotNullExpressionValue(aVar11, "onErrorResumeNext(...)");
        ofm.h hVarW10 = aVar11.w(new a08.s(24, function1K15), new j7a.j(7, f1.f201533a));
        Intrinsics.checkNotNullExpressionValue(hVarW10, "subscribe(...)");
        te0.w.j0(bVar, hVarW10);
    }

    public final void T(efm.r rVar, kotlin.jvm.internal.h0 h0Var, Function1 function1, r1i.h hVar) {
        efm.b bVarSwitchMapCompletable = rVar.switchMapCompletable(new m0g.d(23, new ja3.d(this, hVar, h0Var, function1)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        Function1 function1K = K();
        a08.f0 f0Var = new a08.f0(24, new m08.i(new BreadcrumbException(), 6));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar = new pfm.a(bVarSwitchMapCompletable, f0Var, 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new a08.s(24, function1K), new j7a.j(7, q0.f201571a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(this.f239031a, hVarW);
    }

    public final void U(xi0.b currency, int i, wd6.i iVar, String str) {
        efm.b bVarR3;
        Intrinsics.checkNotNullParameter(currency, "currency");
        k kVar = this.k;
        if (i == 321) {
            g1i.d0 d0Var = (g1i.d0) kVar;
            d0Var.getClass();
            Intrinsics.checkNotNullParameter(currency, "currency");
            bVarR3 = d0Var.R3(new eed.i(d0Var, 26, currency, iVar));
        } else if (i != 322) {
            bVarR3 = pfm.m.f235744a;
            Intrinsics.checkNotNullExpressionValue(bVarR3, "complete(...)");
        } else {
            bVarR3 = k.P(kVar, currency, str, iVar, 4);
        }
        efm.b bVarU = mo3.a.u(o70.a.g(bVarR3), this.f201546n, false);
        Intrinsics.checkNotNullExpressionValue(bVarU, "withProgress(...)");
        efm.b bVarL = hx7.a.L(bVarU, this.o, false, null, 24);
        Function1 function1K = K();
        pfm.a aVar = new pfm.a(bVarL, new a08.f0(24, new m08.i(new BreadcrumbException(), 21)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new a08.s(24, function1K), new j7a.j(7, g1.f201535a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(this.f239031a, hVarW);
    }
}
