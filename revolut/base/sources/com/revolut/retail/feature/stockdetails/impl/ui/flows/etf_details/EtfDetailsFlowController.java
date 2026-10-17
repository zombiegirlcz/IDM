package com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details;

import aii.q;
import android.app.Activity;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
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
import com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.EtfDetailsFlowController;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.EtfDetailsFlowControllerContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ocb.d;
import oli.f;
import onh.b;
import oqk.c;
import otk.g;
import otk.i;
import otk.j;
import otk.k;
import prk.g0;
import prk.n0;
import te0.w;
import tx0.j0;
import tx0.t3;
import tx0.u3;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/etf_details/EtfDetailsFlowController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lski/a;", "Lotk/k;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/etf_details/EtfDetailsFlowControllerContract$Page;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EtfDetailsFlowController extends ViewController<q> implements ski.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(EtfDetailsFlowController.class, "binding", "getBinding()Lcom/revolut/retail/feature/stockdetails/impl/databinding/FlowStockDetailsBinding;", 0))};
    public final EtfDetailsFlowControllerContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final Object P;
    public final b Q;

    public EtfDetailsFlowController(EtfDetailsFlowControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: otk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EtfDetailsFlowController f229723b;

            {
                this.f229723b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EtfDetailsFlowController etfDetailsFlowController = this.f229723b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EtfDetailsFlowController.R;
                        EtfDetailsFlowController etfDetailsFlowController2 = this.f229723b;
                        Activity activityM2 = etfDetailsFlowController2.m2();
                        EtfDetailsFlowControllerContract$InputData etfDetailsFlowControllerContract$InputData = etfDetailsFlowController2.K;
                        phm.a aVar = (phm.a) ue0.e.j(activityM2).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        n2h.e eVar = new n2h.e(etfDetailsFlowControllerContract$InputData.f103837a, etfDetailsFlowControllerContract$InputData.f103839c);
                        onh.b bVar = etfDetailsFlowController2.Q;
                        ltk.b bVar2 = new ltk.b(etfDetailsFlowControllerContract$InputData.f103837a, etfDetailsFlowControllerContract$InputData.f103838b);
                        bVar.getClass();
                        return new prk.n(g0Var, new ptk.b(), new ptk.c(), etfDetailsFlowController2, etfDetailsFlowControllerContract$InputData, eVar, bVar, bVar2);
                    case 1:
                        KProperty[] kPropertyArr2 = EtfDetailsFlowController.R;
                        return (d) ((prk.n) ((ptk.a) etfDetailsFlowController.L.getValue())).f239254w.get();
                    default:
                        KProperty[] kPropertyArr3 = EtfDetailsFlowController.R;
                        return czi.c.c(etfDetailsFlowController, R$id.flowStockDetails_viewPager, etfDetailsFlowController.d());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: otk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EtfDetailsFlowController f229723b;

            {
                this.f229723b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EtfDetailsFlowController etfDetailsFlowController = this.f229723b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EtfDetailsFlowController.R;
                        EtfDetailsFlowController etfDetailsFlowController2 = this.f229723b;
                        Activity activityM2 = etfDetailsFlowController2.m2();
                        EtfDetailsFlowControllerContract$InputData etfDetailsFlowControllerContract$InputData = etfDetailsFlowController2.K;
                        phm.a aVar = (phm.a) ue0.e.j(activityM2).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        n2h.e eVar = new n2h.e(etfDetailsFlowControllerContract$InputData.f103837a, etfDetailsFlowControllerContract$InputData.f103839c);
                        onh.b bVar = etfDetailsFlowController2.Q;
                        ltk.b bVar2 = new ltk.b(etfDetailsFlowControllerContract$InputData.f103837a, etfDetailsFlowControllerContract$InputData.f103838b);
                        bVar.getClass();
                        return new prk.n(g0Var, new ptk.b(), new ptk.c(), etfDetailsFlowController2, etfDetailsFlowControllerContract$InputData, eVar, bVar, bVar2);
                    case 1:
                        KProperty[] kPropertyArr2 = EtfDetailsFlowController.R;
                        return (d) ((prk.n) ((ptk.a) etfDetailsFlowController.L.getValue())).f239254w.get();
                    default:
                        KProperty[] kPropertyArr3 = EtfDetailsFlowController.R;
                        return czi.c.c(etfDetailsFlowController, R$id.flowStockDetails_viewPager, etfDetailsFlowController.d());
                }
            }
        });
        this.N = R$layout.flow_stock_details;
        this.O = s.t(this, otk.b.f);
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: otk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EtfDetailsFlowController f229723b;

            {
                this.f229723b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EtfDetailsFlowController etfDetailsFlowController = this.f229723b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EtfDetailsFlowController.R;
                        EtfDetailsFlowController etfDetailsFlowController2 = this.f229723b;
                        Activity activityM2 = etfDetailsFlowController2.m2();
                        EtfDetailsFlowControllerContract$InputData etfDetailsFlowControllerContract$InputData = etfDetailsFlowController2.K;
                        phm.a aVar = (phm.a) ue0.e.j(activityM2).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        n2h.e eVar = new n2h.e(etfDetailsFlowControllerContract$InputData.f103837a, etfDetailsFlowControllerContract$InputData.f103839c);
                        onh.b bVar = etfDetailsFlowController2.Q;
                        ltk.b bVar2 = new ltk.b(etfDetailsFlowControllerContract$InputData.f103837a, etfDetailsFlowControllerContract$InputData.f103838b);
                        bVar.getClass();
                        return new prk.n(g0Var, new ptk.b(), new ptk.c(), etfDetailsFlowController2, etfDetailsFlowControllerContract$InputData, eVar, bVar, bVar2);
                    case 1:
                        KProperty[] kPropertyArr2 = EtfDetailsFlowController.R;
                        return (d) ((prk.n) ((ptk.a) etfDetailsFlowController.L.getValue())).f239254w.get();
                    default:
                        KProperty[] kPropertyArr3 = EtfDetailsFlowController.R;
                        return czi.c.c(etfDetailsFlowController, R$id.flowStockDetails_viewPager, etfDetailsFlowController.d());
                }
            }
        });
        this.Q = new b(this, 1);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        j jVar = uiState.f229734a;
        NavBarWithToolbar navBarWithToolbar = d3().f218662c;
        if (jVar instanceof g) {
            navBarWithToolbar.l0();
            g gVar = (g) jVar;
            TextClause textClause = gVar.f229728a;
            navBarWithToolbar.setDescriptionText(gVar.f229730c);
            Clause clause = gVar.d;
            if (clause != null) {
                navBarWithToolbar.setSecondDescriptionText(clause);
                navBarWithToolbar.setSecondDescriptionVisible(true);
            } else {
                navBarWithToolbar.setSecondDescriptionVisible(false);
            }
            Clause clause2 = gVar.f229729b;
            if (clause2 == null) {
                navBarWithToolbar.setToolbarTitle(textClause);
            } else {
                NavBarWithToolbar.setToolbar$default(navBarWithToolbar, textClause, clause2, null, 4, null);
            }
            navBarWithToolbar.setEndImage(gVar.e);
            navBarWithToolbar.setMenuItems(gVar.f229731g);
            TagViewData tagViewData = gVar.f;
            if (tagViewData != null) {
                navBarWithToolbar.setBottomTag(tagViewData);
            }
        } else if (jVar instanceof otk.h) {
            navBarWithToolbar.l0();
        } else {
            if (!(jVar instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        }
        ArrayList arrayList = uiState.f229735b;
        String str = uiState.f229736c;
        Tabs flowStockDetailsTabs = d3().d;
        Intrinsics.checkNotNullExpressionValue(flowStockDetailsTabs, "flowStockDetailsTabs");
        Tabs.setItems$default(flowStockDetailsTabs, arrayList, null, 2, null);
        if (str != null) {
            Tabs flowStockDetailsTabs2 = d3().d;
            Intrinsics.checkNotNullExpressionValue(flowStockDetailsTabs2, "flowStockDetailsTabs");
            Tabs.u(flowStockDetailsTabs2, str, false, false, false, 14);
        }
        d3().d.setVisibility(arrayList.size() < 2 ? 8 : 0);
        x2h.b bVar = uiState.d;
        TwinHorizontalButton flowStockDetailsBuySellPanel = d3().f218661b;
        Intrinsics.checkNotNullExpressionValue(flowStockDetailsBuySellPanel, "flowStockDetailsBuySellPanel");
        n2h.h.a(bVar, flowStockDetailsBuySellPanel);
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        EtfDetailsFlowControllerContract$Page page = (EtfDetailsFlowControllerContract$Page) pagerItem;
        Intrinsics.checkNotNullParameter(page, "pagerItem");
        Intrinsics.checkNotNullParameter(page, "pagerItem");
        a aVar = (a) d();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(page, "page");
        aVar.H2(aVar.v, new c(page, 15));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ptk.a) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (ptk.a) this.L.getValue();
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
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new d(this, null, 21), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.o.f57403b), new nt.e(2, d(), otk.d.class, "onMenuItemClicked", "onMenuItemClicked(Ljava/lang/String;)V", 4, 22), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.A0()), new nt.e(2, d(), otk.d.class, "onTagClicked", "onTagClicked(Lcom/revolut/core/ui_kit/internal/views/tag/TagViewData;)V", 4, 23), 3);
        ViewController.P2(this, new o9a.e(rd0.e.b(d3().d.f58882b), 21), new f(this, null, 21), 3);
    }

    public final nrk.a d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (nrk.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final otk.d d() {
        return (otk.d) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ski.c) this.P.getValue();
    }
}
