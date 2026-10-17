package a2i;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.feature_exchange.impl.ui.exchange.order_summary.OrderSummaryActivity;
import com.revolut.feature_exchange.impl.ui.exchange.order_summary.OrderSummaryContract$Configuration;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import qfm.r0;
import rp0.t;
import rp0.y;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends pri.c implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z1i.f f871h;
    public final a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f872j;
    public final t2i.j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ypi.i f873l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c90.c f874m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wm.e f875n;
    public final u2i.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u2i.c f876p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u2i.q f877q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final OrderSummaryContract$Configuration f878r;

    public o(z1i.f router, a presentationModel, f mapper, t2i.j orderDetailsUiMapper, ypi.i nextButtonView, c90.c uiResources, wm.e expandableDialogActionDispatcher, u2i.d cryptoOrderPriceDialogFactory, u2i.c commodityOrderPriceDialogFactory, u2i.q cryptoCommodityDelegate, OrderSummaryContract$Configuration configuration) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(orderDetailsUiMapper, "orderDetailsUiMapper");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(expandableDialogActionDispatcher, "expandableDialogActionDispatcher");
        Intrinsics.checkNotNullParameter(cryptoOrderPriceDialogFactory, "cryptoOrderPriceDialogFactory");
        Intrinsics.checkNotNullParameter(commodityOrderPriceDialogFactory, "commodityOrderPriceDialogFactory");
        Intrinsics.checkNotNullParameter(cryptoCommodityDelegate, "cryptoCommodityDelegate");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f871h = router;
        this.i = presentationModel;
        this.f872j = mapper;
        this.k = orderDetailsUiMapper;
        this.f873l = nextButtonView;
        this.f874m = uiResources;
        this.f875n = expandableDialogActionDispatcher;
        this.o = cryptoOrderPriceDialogFactory;
        this.f876p = commodityOrderPriceDialogFactory;
        this.f877q = cryptoCommodityDelegate;
        this.f878r = configuration;
    }

    public static LayeredImage N(int i) {
        return LayeredImage.Companion.f(LayeredImage.INSTANCE, i, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorBackground, Integer.valueOf(R$attr.uikit_colorOnAccentNeutral), 2.0f, 2.0f, null, 64);
    }

    public final efm.b O(e dialogData) {
        int i;
        y yVar;
        Intrinsics.checkNotNullParameter(dialogData, "dialogData");
        if (dialogData instanceof d) {
            yVar = this.o.b(((d) dialogData).f861a);
        } else {
            if (!(dialogData instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            u2i.a dialogData2 = ((c) dialogData).f860a;
            this.f876p.getClass();
            Intrinsics.checkNotNullParameter(dialogData2, "dialogData");
            t tVar = new t(new TextLocalisedClause(R$string.fx_orders_commodity_price_explanation_dialog_title, null, null, 14), null, null, 30);
            int i2 = u2i.b.f276664a[dialogData2.f276661a.ordinal()];
            if (i2 == 1) {
                i = R$string.fx_orders_commodity_price_explanation_dialog_description_buy;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.fx_orders_commodity_price_explanation_dialog_description_sell;
            }
            PlainTextDelegate.Model model = new PlainTextDelegate.Model("COMMODITY_LEARN_MORE_TEXT_ID", (UrlImage) null, (Clause) null, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "COMMODITY_LEARN_MORE_TEXT_ID", false), 10))), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp0, 0, 0, 0, 30698);
            LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("COMMODITY_PRICE_DESCRIPTION_GOT_IY_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), false, null, null, null, null, 744);
            yp0.b.r(model2, 0, 0, 0, 0, 15);
            yVar = new y(v.k(model, model2), tVar, null, null, null, null, "COMMODITY_PRICE_DESCRIPTION_DIALOG_DELEGATES_KEY", null, null, null, 3836);
        }
        if (yVar != null) {
            return this.f875n.c0(new wm.c(yVar));
        }
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        g view = (g) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        efm.r map = this.f873l.a().map(new a05.a(new h(this, 1), 22));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarF = o70.a.f(map);
        int i = 4;
        a08.e eVar = new a08.e(1, view, g.class, "setBottomPadding", "setBottomPadding(I)V", 0, i);
        Function1 function1K = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new a08.r(2, new j(new BreadcrumbException(), 5)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a0d.g(1, eVar), new a0d.g(1, function1K), new a08.q(4, function0J));
        ifm.b bVar = this.f239031a;
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        OrderSummaryActivity orderSummaryActivity = (OrderSummaryActivity) view;
        efm.b bVarFlatMapCompletable = ((PlainTextDelegate) orderSummaryActivity.z0.getValue()).d.f121375b.flatMapCompletable(new a05.a(new h(this, 6), 21));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1K2 = K();
        a08.r rVar = new a08.r(2, new j(new BreadcrumbException(), i));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarFlatMapCompletable, rVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new a0d.g(1, function1K2), new a08.q(4, n.f870a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar, hVarW);
        ?? r102 = orderSummaryActivity.A0;
        efm.b bVarFlatMapCompletable2 = ((LargeActionButtonDelegate) r102.getValue()).d.f121375b.flatMapCompletable(new a05.a(new h(this, 0), 24));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable2, "flatMapCompletable(...)");
        Function1 function1K3 = K();
        a08.r rVar2 = new a08.r(2, new j(new BreadcrumbException(), 3));
        bVarFlatMapCompletable2.getClass();
        pfm.a aVar3 = new pfm.a(bVarFlatMapCompletable2, rVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new a0d.g(1, function1K3), new a08.q(4, m.f869a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        efm.r rVarFilter = ((LargeActionButtonDelegate) r102.getValue()).d.f121375b.filter(new a05.a(new a09.a(14), 25));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        r0 r0VarD = w.D(rVarFilter, new h(this, 3));
        Function1 function1K4 = K();
        pfm.a aVar4 = new pfm.a(r0VarD, new a08.r(2, new j(new BreadcrumbException(), 0)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new a0d.g(1, function1K4), new a08.q(4, i.f864a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
        r0 r0VarD2 = w.D(w.a0(orderSummaryActivity.c1().d, new a09.a(15)), new h(this, 4));
        Function1 function1K5 = K();
        pfm.a aVar5 = new pfm.a(r0VarD2, new a08.r(2, new j(new BreadcrumbException(), 1)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new a0d.g(1, function1K5), new a08.q(4, k.f867a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar, hVarW4);
        r0 r0VarD3 = w.D(w.a0(((CellDetailsDelegate) orderSummaryActivity.y0.getValue()).d, new a09.a(16)), new h(this, 5));
        Function1 function1K6 = K();
        pfm.a aVar6 = new pfm.a(r0VarD3, new a08.r(2, new j(new BreadcrumbException(), 2)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new a0d.g(1, function1K6), new a08.q(4, l.f868a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        w.j0(bVar, hVarW5);
    }
}
