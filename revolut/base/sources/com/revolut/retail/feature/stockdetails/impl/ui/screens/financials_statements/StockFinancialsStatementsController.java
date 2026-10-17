package com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import au0.e0;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.R$layout;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.StockFinancialsStatementsController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.StockFinancialsStatementsControllerContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import nvk.f;
import nvk.g;
import nvk.i;
import nvk.l;
import nvk.n;
import prk.g0;
import prk.i0;
import prk.n0;
import te0.w;
import tki.h;
import vc.s;
import xki.e;
import z4l.j;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/financials_statements/StockFinancialsStatementsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/h;", "Lnvk/n;", "Lno/m;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StockFinancialsStatementsController extends ViewController<q> implements h, m {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f103961a0 = {o0.f186429a.j(new h0(StockFinancialsStatementsController.class, "binding", "getBinding()Lcom/revolut/retail/feature/stockdetails/impl/databinding/StockFinancialsStatementsBinding;", 0))};
    public final StockFinancialsStatementsControllerContract$InputData K;
    public final ao.h L;
    public final FullScreenStateDelegate M;
    public final ListSubheaderDelegate N;
    public final TextDelegate O;
    public final Object P;
    public int Q;
    public int R;
    public boolean S;
    public List T;
    public final i U;
    public final AnalyticsProduct.Retail V;
    public final int W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    public StockFinancialsStatementsController(StockFinancialsStatementsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, nvk.b.f);
        this.M = new FullScreenStateDelegate();
        this.N = new ListSubheaderDelegate();
        this.O = new TextDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: nvk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockFinancialsStatementsController f219703b;

            {
                this.f219703b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StockFinancialsStatementsController stockFinancialsStatementsController = this.f219703b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StockFinancialsStatementsController.f103961a0;
                        return new z4l.j(7, zhm.u.c(new ContainerDelegate(zhm.v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), stockFinancialsStatementsController.M, stockFinancialsStatementsController.N, new ListSubheaderLoadingDelegate(), stockFinancialsStatementsController.O), null, 6)), false);
                    case 1:
                        KProperty[] kPropertyArr2 = StockFinancialsStatementsController.f103961a0;
                        phm.a aVar = (phm.a) ue0.e.j(stockFinancialsStatementsController.m2()).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        StockFinancialsStatementsControllerContract$InputData stockFinancialsStatementsControllerContract$InputData = stockFinancialsStatementsController.K;
                        uqk.l lVar = stockFinancialsStatementsControllerContract$InputData.f103963b;
                        lVar.getClass();
                        return new i0(g0Var, stockFinancialsStatementsControllerContract$InputData, lVar);
                    case 2:
                        KProperty[] kPropertyArr3 = StockFinancialsStatementsController.f103961a0;
                        return (j) ((i0) stockFinancialsStatementsController.X.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr4 = StockFinancialsStatementsController.f103961a0;
                        return tki.g.b(stockFinancialsStatementsController, stockFinancialsStatementsController.R2());
                }
            }
        });
        this.T = f0.f322471a;
        this.U = new i(this);
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137505r;
        this.V = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.W = R$layout.stock_financials_statements;
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: nvk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockFinancialsStatementsController f219703b;

            {
                this.f219703b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StockFinancialsStatementsController stockFinancialsStatementsController = this.f219703b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StockFinancialsStatementsController.f103961a0;
                        return new z4l.j(7, zhm.u.c(new ContainerDelegate(zhm.v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), stockFinancialsStatementsController.M, stockFinancialsStatementsController.N, new ListSubheaderLoadingDelegate(), stockFinancialsStatementsController.O), null, 6)), false);
                    case 1:
                        KProperty[] kPropertyArr2 = StockFinancialsStatementsController.f103961a0;
                        phm.a aVar = (phm.a) ue0.e.j(stockFinancialsStatementsController.m2()).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        StockFinancialsStatementsControllerContract$InputData stockFinancialsStatementsControllerContract$InputData = stockFinancialsStatementsController.K;
                        uqk.l lVar = stockFinancialsStatementsControllerContract$InputData.f103963b;
                        lVar.getClass();
                        return new i0(g0Var, stockFinancialsStatementsControllerContract$InputData, lVar);
                    case 2:
                        KProperty[] kPropertyArr3 = StockFinancialsStatementsController.f103961a0;
                        return (j) ((i0) stockFinancialsStatementsController.X.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr4 = StockFinancialsStatementsController.f103961a0;
                        return tki.g.b(stockFinancialsStatementsController, stockFinancialsStatementsController.R2());
                }
            }
        });
        final int i3 = 2;
        this.Y = w.y0(new Function0(this) { // from class: nvk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockFinancialsStatementsController f219703b;

            {
                this.f219703b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StockFinancialsStatementsController stockFinancialsStatementsController = this.f219703b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StockFinancialsStatementsController.f103961a0;
                        return new z4l.j(7, zhm.u.c(new ContainerDelegate(zhm.v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), stockFinancialsStatementsController.M, stockFinancialsStatementsController.N, new ListSubheaderLoadingDelegate(), stockFinancialsStatementsController.O), null, 6)), false);
                    case 1:
                        KProperty[] kPropertyArr2 = StockFinancialsStatementsController.f103961a0;
                        phm.a aVar = (phm.a) ue0.e.j(stockFinancialsStatementsController.m2()).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        StockFinancialsStatementsControllerContract$InputData stockFinancialsStatementsControllerContract$InputData = stockFinancialsStatementsController.K;
                        uqk.l lVar = stockFinancialsStatementsControllerContract$InputData.f103963b;
                        lVar.getClass();
                        return new i0(g0Var, stockFinancialsStatementsControllerContract$InputData, lVar);
                    case 2:
                        KProperty[] kPropertyArr3 = StockFinancialsStatementsController.f103961a0;
                        return (j) ((i0) stockFinancialsStatementsController.X.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr4 = StockFinancialsStatementsController.f103961a0;
                        return tki.g.b(stockFinancialsStatementsController, stockFinancialsStatementsController.R2());
                }
            }
        });
        final int i5 = 3;
        this.Z = w.y0(new Function0(this) { // from class: nvk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockFinancialsStatementsController f219703b;

            {
                this.f219703b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                StockFinancialsStatementsController stockFinancialsStatementsController = this.f219703b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StockFinancialsStatementsController.f103961a0;
                        return new z4l.j(7, zhm.u.c(new ContainerDelegate(zhm.v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), stockFinancialsStatementsController.M, stockFinancialsStatementsController.N, new ListSubheaderLoadingDelegate(), stockFinancialsStatementsController.O), null, 6)), false);
                    case 1:
                        KProperty[] kPropertyArr2 = StockFinancialsStatementsController.f103961a0;
                        phm.a aVar = (phm.a) ue0.e.j(stockFinancialsStatementsController.m2()).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        StockFinancialsStatementsControllerContract$InputData stockFinancialsStatementsControllerContract$InputData = stockFinancialsStatementsController.K;
                        uqk.l lVar = stockFinancialsStatementsControllerContract$InputData.f103963b;
                        lVar.getClass();
                        return new i0(g0Var, stockFinancialsStatementsControllerContract$InputData, lVar);
                    case 2:
                        KProperty[] kPropertyArr3 = StockFinancialsStatementsController.f103961a0;
                        return (j) ((i0) stockFinancialsStatementsController.X.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr4 = StockFinancialsStatementsController.f103961a0;
                        return tki.g.b(stockFinancialsStatementsController, stockFinancialsStatementsController.R2());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        int i = this.Q + 1;
        this.Q = i;
        this.S = true;
        this.T = uiState.e;
        ((j) this.P.getValue()).c(uiState.f219722a);
        NavBarWithToolbar navBarWithToolbar = d3().f218672b;
        TextLocalisedClause textLocalisedClause = uiState.f219723b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(uiState.f219724c);
        navBarWithToolbar.setSecondDescriptionTextStyle(e0.CAPTION);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setActions(u.c(uiState.d));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        Tabs tabs = d3().f218673c;
        tabs.setVisibility(uiState.e.isEmpty() ? 8 : 0);
        Tabs.setItems$default(tabs, uiState.f219725g, null, 2, null);
        if (!(qVar instanceof l) || ((l) qVar).f219719a) {
            f3(uiState);
        }
        nvk.m mVar = uiState.f;
        d3().d.post(new androidx.view.j(i, this, mVar != null ? Integer.valueOf(mVar.f219721b) : null));
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getV() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i0) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.wealth_trading_instrument_financials, null, null, 14));
        d3().d.setAdapter((j) this.P.getValue());
        d3().f218673c.setVisibility(8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        d3().d.unregisterOnPageChangeCallback(this.U);
        this.Q++;
        this.R++;
        this.S = false;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f218672b.f59410q), new nuh.j(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().f218672b.s0()), new nvk.e(this, null), 3);
        ViewController.P2(this, new njj.n(rd0.e.b(d3().f218673c.f58882b), 20), new f(this, continuation, 0), 3);
        ViewController.P2(this, new njj.n(rd0.e.b(this.N.f), 21), new f(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.d), new f(this, continuation, 2), 3);
        d3().d.registerOnPageChangeCallback(this.U);
    }

    public final nrk.e d3() {
        ViewBinding value = this.L.getValue(this, f103961a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (nrk.e) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final nvk.j R2() {
        return (nvk.j) this.Y.getValue();
    }

    public final void f3(n nVar) {
        nvk.m mVar = nVar.f;
        if (mVar != null) {
            String str = mVar.f219720a;
            int i = mVar.f219721b;
            Tabs tabs = d3().f218673c;
            Intrinsics.checkNotNullExpressionValue(tabs, "tabs");
            Tabs.u(tabs, str, false, false, false, 12);
            d3().d.setCurrentItem(i, false);
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.W;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.e) this.Z.getValue();
    }
}
