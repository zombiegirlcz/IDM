package z1i;

import aw0.o9;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature_exchange.impl.ui.exchange.order_summary.OrderSummaryActivity;
import com.revolut.feature_exchange.impl.ui.exchange.order_summary.OrderSummaryContract$Configuration;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nii.o0;
import org.jetbrains.annotations.NotNull;
import qfm.r0;
import rp0.g1;
import rp0.k1;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 extends pri.a implements e {

    @NotNull
    public static final o Companion = new o();
    public final hsc.c A;
    public final v60.i B;
    public final tm.g C;
    public final f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ypi.i f318803j;
    public final d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f9b.f f318804l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k3l.b f318805m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k1i.j f318806n;
    public final b9k.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a2i.b f318807p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l4i.a f318808q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f318809r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final opi.d f318810s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h5i.g f318811t;
    public final lrh.a u;
    public final OrderSummaryContract$Configuration v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final nd.k f318812w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final sd5.c f318813x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final q06.l f318814y;
    public final g1 z;

    public b0(f router, ypi.i nextButtonView, d presentationModel, f9b.f errorView, k3l.b statusView, k1i.j feePresenterDelegate, i0 toolbarPresenterDelegate, b9k.f itemsPresenterDelegate, a2i.b cryptoCommodityDelegate, l4i.a amountConverter, g orderSummarySuccessConfigurationItemMapper, com.google.firebase.messaging.t actionDelegateFactory, mga.h0 upgradeEntryPointPresenterDelegate, m1i.e0 marketOrderExchangeStatusPresenterDelegate, mkd.e slotManagerFeedDelegate, u2i.k bannerManagerDelegate, pri.f authorizedPresenterDelegate, opi.d expandableDialogView, h5i.g currencyExchangeSummaryMapper, lrh.a wealthProtectionErrorParser, OrderSummaryContract$Configuration inputData, nd.k orderSummaryMapper, sd5.c cryptoConfigInteractor, q06.l deeplinkRouter, g1 shotDialogDisplayer, hsc.c cryptoScaPromptShotDialogProvider) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(statusView, "statusView");
        Intrinsics.checkNotNullParameter(feePresenterDelegate, "feePresenterDelegate");
        Intrinsics.checkNotNullParameter(toolbarPresenterDelegate, "toolbarPresenterDelegate");
        Intrinsics.checkNotNullParameter(itemsPresenterDelegate, "itemsPresenterDelegate");
        Intrinsics.checkNotNullParameter(cryptoCommodityDelegate, "cryptoCommodityDelegate");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(orderSummarySuccessConfigurationItemMapper, "orderSummarySuccessConfigurationItemMapper");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        Intrinsics.checkNotNullParameter(upgradeEntryPointPresenterDelegate, "upgradeEntryPointPresenterDelegate");
        Intrinsics.checkNotNullParameter(marketOrderExchangeStatusPresenterDelegate, "marketOrderExchangeStatusPresenterDelegate");
        Intrinsics.checkNotNullParameter(slotManagerFeedDelegate, "slotManagerFeedDelegate");
        Intrinsics.checkNotNullParameter(bannerManagerDelegate, "bannerManagerDelegate");
        Intrinsics.checkNotNullParameter(authorizedPresenterDelegate, "authorizedPresenterDelegate");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(currencyExchangeSummaryMapper, "currencyExchangeSummaryMapper");
        Intrinsics.checkNotNullParameter(wealthProtectionErrorParser, "wealthProtectionErrorParser");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(orderSummaryMapper, "orderSummaryMapper");
        Intrinsics.checkNotNullParameter(cryptoConfigInteractor, "cryptoConfigInteractor");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(cryptoScaPromptShotDialogProvider, "cryptoScaPromptShotDialogProvider");
        this.i = router;
        this.f318803j = nextButtonView;
        this.k = presentationModel;
        this.f318804l = errorView;
        this.f318805m = statusView;
        this.f318806n = feePresenterDelegate;
        this.o = itemsPresenterDelegate;
        this.f318807p = cryptoCommodityDelegate;
        this.f318808q = amountConverter;
        this.f318809r = orderSummarySuccessConfigurationItemMapper;
        this.f318810s = expandableDialogView;
        this.f318811t = currencyExchangeSummaryMapper;
        this.u = wealthProtectionErrorParser;
        this.v = inputData;
        this.f318812w = orderSummaryMapper;
        this.f318813x = cryptoConfigInteractor;
        this.f318814y = deeplinkRouter;
        this.z = shotDialogDisplayer;
        this.A = cryptoScaPromptShotDialogProvider;
        this.B = new v60.i();
        this.C = actionDelegateFactory.e(new yq0.e(this, 18));
        P(zhm.v.k(authorizedPresenterDelegate, feePresenterDelegate, toolbarPresenterDelegate, cryptoCommodityDelegate, marketOrderExchangeStatusPresenterDelegate, upgradeEntryPointPresenterDelegate, slotManagerFeedDelegate, bannerManagerDelegate));
    }

    public static CompositeClause Q(CurrencyClause currencyClause, String str, double d, xi0.b bVar) {
        List listK = zhm.v.k(currencyClause, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new RateClause(new BigDecimal(String.valueOf(d)), bVar, new RateClause.Format.ExchangeRate(true), null));
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    /* JADX WARN: Type inference failed for: r1v58, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v66, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        h view = (h) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Object obj2 = this.k;
        ((nri.a) obj2).init();
        b9k.f fVar = this.o;
        efm.d0 d0VarFirstOrError = ((t2i.b) fVar.f13817b).d().firstOrError();
        yzc.a aVar2 = new yzc.a(18, new k(fVar, 0));
        d0VarFirstOrError.getClass();
        sfm.b bVar = new sfm.b(d0VarFirstOrError, aVar2, 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        efm.r rVarF = o70.a.f(bVar);
        yea.l lVar = new yea.l(1, view, h.class, "setItems", "setItems(Ljava/util/List;)V", 0, 20);
        Function1 function1K = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new yma.h(1, new yma.w(new BreadcrumbException(), 17)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o0(25, lVar), new o0(25, function1K), new yzc.p(1, function0J));
        ifm.b bVar2 = this.f239031a;
        te0.w.j0(bVar2, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        g1i.d0 d0Var = (g1i.d0) obj2;
        efm.r map = d0Var.d().map(new n(new m(this, 11), 2));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarF2 = o70.a.f(map);
        int i = 0;
        yea.l lVar2 = new yea.l(1, this.f318803j, ypi.i.class, "setText", "setText(Lcom/revolut/core/ui_kit/models/Clause;)V", i, 21);
        Function1 function1K2 = K();
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarF2.onErrorResumeNext(new yma.h(1, new yma.w(new BreadcrumbException(), 18)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new o0(25, lVar2), new o0(25, function1K2), new yzc.p(1, function0J2));
        te0.w.j0(bVar2, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        ypi.i iVar = this.f318803j;
        iVar.setEnabled(true);
        r0 r0VarD = te0.w.D(iVar.s(), new m(this, 12));
        Function1 function1K3 = K();
        pfm.a aVar3 = new pfm.a(r0VarD, new yma.h(1, new yma.w(new BreadcrumbException(), 19)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar3.w(new o0(25, function1K3), new yzc.p(1, x.f318846a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(bVar2, hVarW);
        efm.r rVarHide = ((ihm.j) d0Var.M.d).hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.r rVarFlatMap = o70.a.f(rVarHide).flatMap(new n(new m(this, 13), 3));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        m mVar = new m(this, 14);
        k3l.b bVar3 = this.f318805m;
        efm.r rVarK = hx7.a.K(com.revolut.retail.operation_status.modal_status.b.b(rVarFlatMap, bVar3, mVar), this.f318804l, false, false, null, 24);
        Function1 function1K4 = K();
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = rVarK.onErrorResumeNext(new yma.h(1, new yma.w(new BreadcrumbException(), 21)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new o0(25, z.f318848a), new o0(25, function1K4), new yzc.p(1, function0J3));
        te0.w.j0(bVar2, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        efm.r rVarB = com.revolut.retail.operation_status.modal_status.b.b(o70.a.f(nim.a.w(nim.a.w(d0Var.u.e.f, new g1i.d(d0Var, 20)), new yea.l(1, this.f318809r, g.class, "mapRecurringBuysSuccessConfiguration", "mapRecurringBuysSuccessConfiguration(Lcom/revolut/feature_exchange/impl/ui/exchange/recurring_order_settings/RecurringOrderSettingsContract$RecurringOrderSummary;)Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration;", i, 22))), bVar3, new l(1));
        Function1 function1K5 = K();
        Function0 function0J4 = J();
        efm.r rVarOnErrorResumeNext4 = rVarB.onErrorResumeNext(new yma.h(1, new yma.w(new BreadcrumbException(), 22)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new o0(25, a0.f318800a), new o0(25, function1K5), new yzc.p(1, function0J4));
        te0.w.j0(bVar2, cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
        r0 r0VarD2 = te0.w.D(((k3l.d) bVar3).f180813j, new m(this, 10));
        Function1 function1K6 = K();
        pfm.a aVar4 = new pfm.a(r0VarD2, new yma.h(1, new yma.w(new BreadcrumbException(), 20)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar4.w(new o0(25, function1K6), new yzc.p(1, y.f318847a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar2, hVarW2);
        OrderSummaryActivity orderSummaryActivity = (OrderSummaryActivity) view;
        r0 r0VarD3 = te0.w.D(orderSummaryActivity.c1().d, new m(this, 1));
        Function1 function1K7 = K();
        pfm.a aVar5 = new pfm.a(r0VarD3, new yma.h(1, new yma.w(new BreadcrumbException(), 12)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar5.w(new o0(25, function1K7), new yzc.p(1, r.f318840a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        te0.w.j0(bVar2, hVarW3);
        r0 r0VarD4 = te0.w.D(te0.w.a0(orderSummaryActivity.c1().d, new l(2)), new m(this, 2));
        Function1 function1K8 = K();
        pfm.a aVar6 = new pfm.a(r0VarD4, new yma.h(1, new yma.w(new BreadcrumbException(), 13)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar6.w(new o0(25, function1K8), new yzc.p(1, s.f318841a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        te0.w.j0(bVar2, hVarW4);
        efm.r rVarFilter = orderSummaryActivity.c1().d.filter(new yzc.a(23, new l(3)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        r0 r0VarD5 = te0.w.D(rVarFilter, new m(this, 3));
        Function1 function1K9 = K();
        pfm.a aVar7 = new pfm.a(r0VarD5, new yma.h(1, new yma.w(new BreadcrumbException(), 14)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar7.w(new o0(25, function1K9), new yzc.p(1, t.f318842a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        te0.w.j0(bVar2, hVarW5);
        r0 r0VarD6 = te0.w.D(((FixedTabsDelegate) orderSummaryActivity.B0.getValue()).f52339c.f121375b, new m(this, 4));
        Function1 function1K10 = K();
        pfm.a aVar8 = new pfm.a(r0VarD6, new yma.h(1, new yma.w(new BreadcrumbException(), 15)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar8, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar8.w(new o0(25, function1K10), new yzc.p(1, u.f318843a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        te0.w.j0(bVar2, hVarW6);
        r0 r0VarD7 = te0.w.D(((CellDetailsSwitcherDelegate) orderSummaryActivity.f96916x0.getValue()).f51912c, new m(this, 5));
        Function1 function1K11 = K();
        pfm.a aVar9 = new pfm.a(r0VarD7, new yma.h(1, new yma.w(new BreadcrumbException(), 11)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar9, "onErrorResumeNext(...)");
        ofm.h hVarW7 = aVar9.w(new o0(25, function1K11), new yzc.p(1, v.f318844a));
        Intrinsics.checkNotNullExpressionValue(hVarW7, "subscribe(...)");
        te0.w.j0(bVar2, hVarW7);
        efm.b bVarFlatMapCompletable = this.B.flatMapCompletable(new yzc.a(24, new m(this, 0)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1K12 = K();
        yma.h hVar = new yma.h(1, new yma.w(new BreadcrumbException(), 16));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar10 = new pfm.a(bVarFlatMapCompletable, hVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar10, "onErrorResumeNext(...)");
        ofm.h hVarW8 = aVar10.w(new o0(25, function1K12), new yzc.p(1, w.f318845a));
        Intrinsics.checkNotNullExpressionValue(hVarW8, "subscribe(...)");
        te0.w.j0(bVar2, hVarW8);
        efm.b bVarFlatMapCompletable2 = m70.a.g(d0Var.f139600g.q(), null, null, 3).flatMapCompletable(new g1i.e(6, new g1i.d(d0Var, 4)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable2, "flatMapCompletable(...)");
        Function1 function1K13 = K();
        yma.h hVar2 = new yma.h(1, new yma.w(new BreadcrumbException(), 10));
        bVarFlatMapCompletable2.getClass();
        pfm.a aVar11 = new pfm.a(bVarFlatMapCompletable2, hVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar11, "onErrorResumeNext(...)");
        ofm.h hVarW9 = aVar11.w(new o0(25, function1K13), new yzc.p(1, q.f318839a));
        Intrinsics.checkNotNullExpressionValue(hVarW9, "subscribe(...)");
        te0.w.j0(bVar2, hVarW9);
        if (this.v.e) {
            ((k1) this.z).d(this.A.a());
        }
    }

    public final pfm.a R() {
        efm.d0 d0VarFirstOrError = ((g1i.d0) this.k).F3().firstOrError();
        yzc.a aVar = new yzc.a(27, new m(this, 7));
        d0VarFirstOrError.getClass();
        pfm.a aVar2 = new pfm.a(d0VarFirstOrError, aVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        return aVar2;
    }
}
