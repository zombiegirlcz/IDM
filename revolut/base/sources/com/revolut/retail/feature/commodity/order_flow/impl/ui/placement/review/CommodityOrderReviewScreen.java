package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.retail.feature.commodity.order_flow.impl.R$string;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.review.CommodityOrderReviewScreen;
import dli.a;
import efm.r;
import in0.g;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kw4.b;
import l5a.u;
import l7j.c;
import l7j.d;
import l7j.f;
import l7j.i;
import l7j.l;
import mga.i0;
import no.m;
import te0.w;
import vc.s;
import xki.e;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/review/CommodityOrderReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ll7j/i;", "Ldli/a;", "Ll7j/m;", "Lmga/i0;", "Lin0/g;", "Lno/m;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CommodityOrderReviewScreen extends ViewController<i> implements a, i0, g, m {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(CommodityOrderReviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final h T;
    public final Object U;
    public final Object V;
    public final Lazy W;

    public CommodityOrderReviewScreen(CommodityOrderReviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.L = w.y0(new b(23));
        this.M = w.y0(new b(24));
        this.N = w.y0(new b(25));
        this.O = w.y0(new b(19));
        this.P = w.y0(new b(20));
        this.Q = w.y0(new b(21));
        this.R = w.y0(new b(22));
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: l7j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityOrderReviewScreen f192668b;

            {
                this.f192668b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CommodityOrderReviewScreen.X;
                        CommodityOrderReviewScreen commodityOrderReviewScreen = this.f192668b;
                        return dli.f.a(commodityOrderReviewScreen, commodityOrderReviewScreen.d(), zhm.v.k((CellDetailsDelegate) commodityOrderReviewScreen.L.getValue(), (CellDetailsActionDelegate) commodityOrderReviewScreen.M.getValue(), new CellDetailsLoadingDelegate(), (RowDelegate) commodityOrderReviewScreen.Q.getValue(), (FullScreenStateDelegate) commodityOrderReviewScreen.N.getValue(), (HighlightTileDelegate) commodityOrderReviewScreen.R.getValue(), new HighlightTileLoadingDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = CommodityOrderReviewScreen.X;
                        return (j) ((r6j.e) this.f192668b.U.getValue()).o.get();
                }
            }
        });
        this.T = s.t(this, c.f);
        this.U = w.y0(new kpl.b(this, inputData, 15));
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: l7j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityOrderReviewScreen f192668b;

            {
                this.f192668b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CommodityOrderReviewScreen.X;
                        CommodityOrderReviewScreen commodityOrderReviewScreen = this.f192668b;
                        return dli.f.a(commodityOrderReviewScreen, commodityOrderReviewScreen.d(), zhm.v.k((CellDetailsDelegate) commodityOrderReviewScreen.L.getValue(), (CellDetailsActionDelegate) commodityOrderReviewScreen.M.getValue(), new CellDetailsLoadingDelegate(), (RowDelegate) commodityOrderReviewScreen.Q.getValue(), (FullScreenStateDelegate) commodityOrderReviewScreen.N.getValue(), (HighlightTileDelegate) commodityOrderReviewScreen.R.getValue(), new HighlightTileLoadingDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = CommodityOrderReviewScreen.X;
                        return (j) ((r6j.e) this.f192668b.U.getValue()).o.get();
                }
            }
        });
        this.W = j.b(l7j.b.f192669a);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l7j.m uiState = (l7j.m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().e;
        l lVar = uiState.f192678a;
        MoneyClause moneyClause = lVar.f192675a;
        navBarWithToolbar.setTitle(moneyClause, null);
        navBarWithToolbar.setToolbarTitle(moneyClause);
        navBarWithToolbar.setDescriptionText(lVar.f192676b);
        navBarWithToolbar.setEndIconImage(lVar.f192677c);
        d3().f174558c.setTextClause(uiState.f192679b.f192674a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.i0
    public final r N0() {
        return ((HighlightTileDelegate) this.R.getValue()).f52437c;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return (AnalyticsProduct) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r6j.e) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((r6j.e) this.U.getValue()).f.get()).d(v.k((PlainTextDelegate) this.O.getValue(), (LargeActionButtonDelegate) this.P.getValue()));
        jii.s sVarD3 = d3();
        NavBarWithToolbar navBarWithToolbar = sVarD3.e;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setDescriptionVisible(true);
        LargeActionButton largeActionButton = sVarD3.f174557b;
        largeActionButton.setText(new TextLocalisedClause(R$string.wealth_commodities_order_flow_common_button_submit, null, null, 14));
        largeActionButton.setLoadingButtonTag("SUBMIT_BUTTON_LOADING_TAG");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.i0
    public final r a2() {
        return ((RowDelegate) this.Q.getValue()).f53218h;
    }

    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().e.f59410q), new d(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174557b.o), new d(this, continuation, 2), 3);
        ?? r72 = this.M;
        r rVarFilter = ((CellDetailsActionDelegate) r72.getValue()).d.filter(new l5i.b(9, new u(9)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter), new l7j.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(w.a0(((CellDetailsActionDelegate) r72.getValue()).d, new u(10))), new l1g.e(this, (Continuation) null, 8), 3);
        r rVarFilter2 = ((LargeActionButtonDelegate) this.P.getValue()).d.f121375b.filter(new l5i.b(10, new u(11)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter2), new f(this, null), 3);
        r rVarFilter3 = ((PlainTextDelegate) this.O.getValue()).d.f121375b.filter(new l5i.b(11, new u(12)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter3, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter3), new d(this, continuation, 0), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.T.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l7j.j d() {
        return (l7j.j) this.V.getValue();
    }

    @Override // mga.l0
    public final View g0() {
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = d3().f174556a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        return controllerContainerCoordinatorLayout;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
