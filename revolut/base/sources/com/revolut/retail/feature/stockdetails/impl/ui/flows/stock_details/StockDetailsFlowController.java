package com.revolut.retail.feature.stockdetails.impl.ui.flows.stock_details;

import aii.q;
import ali.c;
import ali.g;
import android.app.Activity;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import com.revolut.retail.feature.stockdetails.impl.R$id;
import com.revolut.retail.feature.stockdetails.impl.R$layout;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.stock_details.StockDetailsFlowController;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.stock_details.StockDetailsFlowControllerContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import prk.e0;
import prk.g0;
import prk.n0;
import pth.l;
import puk.b;
import puk.d;
import puk.i;
import puk.j;
import puk.k;
import quk.a;
import te0.w;
import tx0.j0;
import tx0.t3;
import tx0.u3;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/stock_details/StockDetailsFlowController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lali/g;", "Lpuk/k;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/stock_details/StockDetailsFlowControllerContract$Page;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StockDetailsFlowController extends ViewController<q> implements g {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(StockDetailsFlowController.class, "binding", "getBinding()Lcom/revolut/retail/feature/stockdetails/impl/databinding/FlowStockDetailsBinding;", 0))};
    public final StockDetailsFlowControllerContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final Object P;
    public final os2.g Q;

    public StockDetailsFlowController(StockDetailsFlowControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: puk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockDetailsFlowController f239926b;

            {
                this.f239926b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StockDetailsFlowController stockDetailsFlowController = this.f239926b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StockDetailsFlowController.R;
                        StockDetailsFlowController stockDetailsFlowController2 = this.f239926b;
                        Activity activityM2 = stockDetailsFlowController2.m2();
                        StockDetailsFlowControllerContract$InputData stockDetailsFlowControllerContract$InputData = stockDetailsFlowController2.K;
                        phm.a aVar = (phm.a) ue0.e.j(activityM2).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        n2h.e eVar = new n2h.e(stockDetailsFlowControllerContract$InputData.f103875a, stockDetailsFlowControllerContract$InputData.e);
                        os2.g gVar = stockDetailsFlowController2.Q;
                        ltk.b bVar = new ltk.b(stockDetailsFlowControllerContract$InputData.f103875a, stockDetailsFlowControllerContract$InputData.f103877c);
                        gVar.getClass();
                        return new e0(g0Var, new quk.b(), new quk.c(), stockDetailsFlowController2, stockDetailsFlowControllerContract$InputData, eVar, gVar, bVar);
                    case 1:
                        KProperty[] kPropertyArr2 = StockDetailsFlowController.R;
                        return (d) ((e0) ((quk.a) stockDetailsFlowController.L.getValue())).f239097q.get();
                    default:
                        KProperty[] kPropertyArr3 = StockDetailsFlowController.R;
                        return mif.a.a(stockDetailsFlowController, 0, R$id.flowStockDetails_viewPager, stockDetailsFlowController.d(), 5);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: puk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockDetailsFlowController f239926b;

            {
                this.f239926b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StockDetailsFlowController stockDetailsFlowController = this.f239926b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StockDetailsFlowController.R;
                        StockDetailsFlowController stockDetailsFlowController2 = this.f239926b;
                        Activity activityM2 = stockDetailsFlowController2.m2();
                        StockDetailsFlowControllerContract$InputData stockDetailsFlowControllerContract$InputData = stockDetailsFlowController2.K;
                        phm.a aVar = (phm.a) ue0.e.j(activityM2).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        n2h.e eVar = new n2h.e(stockDetailsFlowControllerContract$InputData.f103875a, stockDetailsFlowControllerContract$InputData.e);
                        os2.g gVar = stockDetailsFlowController2.Q;
                        ltk.b bVar = new ltk.b(stockDetailsFlowControllerContract$InputData.f103875a, stockDetailsFlowControllerContract$InputData.f103877c);
                        gVar.getClass();
                        return new e0(g0Var, new quk.b(), new quk.c(), stockDetailsFlowController2, stockDetailsFlowControllerContract$InputData, eVar, gVar, bVar);
                    case 1:
                        KProperty[] kPropertyArr2 = StockDetailsFlowController.R;
                        return (d) ((e0) ((quk.a) stockDetailsFlowController.L.getValue())).f239097q.get();
                    default:
                        KProperty[] kPropertyArr3 = StockDetailsFlowController.R;
                        return mif.a.a(stockDetailsFlowController, 0, R$id.flowStockDetails_viewPager, stockDetailsFlowController.d(), 5);
                }
            }
        });
        this.N = R$layout.flow_stock_details;
        this.O = s.t(this, b.f);
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: puk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockDetailsFlowController f239926b;

            {
                this.f239926b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StockDetailsFlowController stockDetailsFlowController = this.f239926b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StockDetailsFlowController.R;
                        StockDetailsFlowController stockDetailsFlowController2 = this.f239926b;
                        Activity activityM2 = stockDetailsFlowController2.m2();
                        StockDetailsFlowControllerContract$InputData stockDetailsFlowControllerContract$InputData = stockDetailsFlowController2.K;
                        phm.a aVar = (phm.a) ue0.e.j(activityM2).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        n2h.e eVar = new n2h.e(stockDetailsFlowControllerContract$InputData.f103875a, stockDetailsFlowControllerContract$InputData.e);
                        os2.g gVar = stockDetailsFlowController2.Q;
                        ltk.b bVar = new ltk.b(stockDetailsFlowControllerContract$InputData.f103875a, stockDetailsFlowControllerContract$InputData.f103877c);
                        gVar.getClass();
                        return new e0(g0Var, new quk.b(), new quk.c(), stockDetailsFlowController2, stockDetailsFlowControllerContract$InputData, eVar, gVar, bVar);
                    case 1:
                        KProperty[] kPropertyArr2 = StockDetailsFlowController.R;
                        return (d) ((e0) ((quk.a) stockDetailsFlowController.L.getValue())).f239097q.get();
                    default:
                        KProperty[] kPropertyArr3 = StockDetailsFlowController.R;
                        return mif.a.a(stockDetailsFlowController, 0, R$id.flowStockDetails_viewPager, stockDetailsFlowController.d(), 5);
                }
            }
        });
        this.Q = new os2.g(this, 6);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f218662c;
        j jVar = uiState.f239939a;
        if (jVar instanceof puk.g) {
            navBarWithToolbar.l0();
            puk.g gVar = (puk.g) jVar;
            TextClause textClause = gVar.f239933a;
            navBarWithToolbar.setDescriptionText(gVar.f239935c);
            Clause clause = gVar.d;
            if (clause != null) {
                navBarWithToolbar.setSecondDescriptionText(clause);
                navBarWithToolbar.setSecondDescriptionVisible(true);
            } else {
                navBarWithToolbar.setSecondDescriptionVisible(false);
            }
            if (((puk.g) uiState.f239939a).f239934b == null) {
                navBarWithToolbar.setToolbarTitle(textClause);
            } else {
                NavBarWithToolbar.setToolbar$default(navBarWithToolbar, textClause, gVar.f239934b, null, 4, null);
            }
            navBarWithToolbar.setEndImage(gVar.e);
            navBarWithToolbar.setMenuItems(gVar.f);
            navBarWithToolbar.setBottomTag(gVar.f239936g);
        } else if (jVar instanceof puk.h) {
            navBarWithToolbar.l0();
        } else {
            if (!(jVar instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        }
        ArrayList arrayList = uiState.f239940b;
        String str = uiState.f239941c;
        Tabs flowStockDetailsTabs = d3().d;
        Intrinsics.checkNotNullExpressionValue(flowStockDetailsTabs, "flowStockDetailsTabs");
        Tabs.setItems$default(flowStockDetailsTabs, arrayList, null, 2, null);
        if (str != null) {
            Tabs flowStockDetailsTabs2 = d3().d;
            Intrinsics.checkNotNullExpressionValue(flowStockDetailsTabs2, "flowStockDetailsTabs");
            Tabs.u(flowStockDetailsTabs2, str, false, false, false, 14);
        }
        x2h.b bVar = uiState.d;
        TwinHorizontalButton flowStockDetailsBuySellPanel = d3().f218661b;
        Intrinsics.checkNotNullExpressionValue(flowStockDetailsBuySellPanel, "flowStockDetailsBuySellPanel");
        n2h.h.a(bVar, flowStockDetailsBuySellPanel);
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        StockDetailsFlowControllerContract$Page page = (StockDetailsFlowControllerContract$Page) pagerItem;
        Intrinsics.checkNotNullParameter(page, "pagerItem");
        Intrinsics.checkNotNullParameter(page, "pagerItem");
        if (page == StockDetailsFlowControllerContract$Page.OPTIONS) {
            d3().f218662c.setExpanded(false, false);
        }
        puk.s sVar = (puk.s) d();
        sVar.getClass();
        Intrinsics.checkNotNullParameter(page, "page");
        sVar.H2(sVar.z, new l(page, 4));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (a) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.wealth_asset_details, null, null, 14));
        NavBarWithToolbar navBarWithToolbar = d3().f218662c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setTitleAutoSize(true);
        navBarWithToolbar.setTitleVisible(false);
        navBarWithToolbar.setToolbarTitleVisibilityMode(u3.COLLAPSING);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f218662c;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new pnb.b(this, null, 16), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.o.f57403b), new pp4.h(2, d(), d.class, "onMenuItemClicked", "onMenuItemClicked(Ljava/lang/String;)V", 4, 7), 3);
        ViewController.P2(this, new p73.d(rd0.e.b(d3().d.f58882b), 28), new pqc.k(this, null, 19), 3);
    }

    public final nrk.a d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (nrk.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final d d() {
        return (d) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
