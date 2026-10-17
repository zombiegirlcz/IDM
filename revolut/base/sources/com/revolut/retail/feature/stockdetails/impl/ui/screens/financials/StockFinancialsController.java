package com.revolut.retail.feature.stockdetails.impl.ui.screens.financials;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import avk.j;
import cli.o;
import com.revolut.core.ui_kit.delegates.BarChartDelegate;
import com.revolut.core.ui_kit.delegates.ErrorChartDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HistogramLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.R$layout;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials.StockFinancialsController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials.StockFinancialsControllerContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kvk.b;
import kvk.d;
import kvk.i;
import kvk.l;
import prk.e0;
import prk.g0;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/financials/StockFinancialsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lkvk/l;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StockFinancialsController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(StockFinancialsController.class, "binding", "getBinding()Lcom/revolut/retail/feature/stockdetails/impl/databinding/FragmentAssetDetailsBinding;", 0))};
    public final StockFinancialsControllerContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final BarChartDelegate P;
    public final FixedTabsDelegate Q;
    public final FullScreenStateDelegate R;
    public final HistogramLoadingDelegate S;
    public final ListSubheaderDelegate T;
    public final TextDelegate U;
    public final Object V;
    public final j W;

    public StockFinancialsController(StockFinancialsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: kvk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockFinancialsController f190138b;

            {
                this.f190138b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StockFinancialsController stockFinancialsController = this.f190138b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StockFinancialsController.X;
                        qji.b bVarU2 = stockFinancialsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.financials.di.StockFinancialsControllerComponentInjector");
                        e0 e0Var = (e0) ((quk.a) bVarU2);
                        g0 g0Var = e0Var.f239090g;
                        e0 e0Var2 = e0Var.f239091h;
                        StockFinancialsControllerContract$InputData stockFinancialsControllerContract$InputData = stockFinancialsController.K;
                        avk.j jVar = stockFinancialsController.W;
                        stockFinancialsControllerContract$InputData.getClass();
                        jVar.getClass();
                        return new prk.h0(g0Var, e0Var2, stockFinancialsControllerContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = StockFinancialsController.X;
                        return (i) ((prk.h0) stockFinancialsController.L.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = StockFinancialsController.X;
                        StockFinancialsController stockFinancialsController2 = this.f190138b;
                        return dli.f.a(stockFinancialsController2, stockFinancialsController2.d(), v.k(stockFinancialsController2.P, new ErrorChartDelegate(), stockFinancialsController2.Q, stockFinancialsController2.R, stockFinancialsController2.S, stockFinancialsController2.T, new ListSubheaderLoadingDelegate(), stockFinancialsController2.U), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: kvk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockFinancialsController f190138b;

            {
                this.f190138b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StockFinancialsController stockFinancialsController = this.f190138b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StockFinancialsController.X;
                        qji.b bVarU2 = stockFinancialsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.financials.di.StockFinancialsControllerComponentInjector");
                        e0 e0Var = (e0) ((quk.a) bVarU2);
                        g0 g0Var = e0Var.f239090g;
                        e0 e0Var2 = e0Var.f239091h;
                        StockFinancialsControllerContract$InputData stockFinancialsControllerContract$InputData = stockFinancialsController.K;
                        avk.j jVar = stockFinancialsController.W;
                        stockFinancialsControllerContract$InputData.getClass();
                        jVar.getClass();
                        return new prk.h0(g0Var, e0Var2, stockFinancialsControllerContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = StockFinancialsController.X;
                        return (i) ((prk.h0) stockFinancialsController.L.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = StockFinancialsController.X;
                        StockFinancialsController stockFinancialsController2 = this.f190138b;
                        return dli.f.a(stockFinancialsController2, stockFinancialsController2.d(), v.k(stockFinancialsController2.P, new ErrorChartDelegate(), stockFinancialsController2.Q, stockFinancialsController2.R, stockFinancialsController2.S, stockFinancialsController2.T, new ListSubheaderLoadingDelegate(), stockFinancialsController2.U), 0, null, null, null, 60);
                }
            }
        });
        this.N = R$layout.fragment_asset_details;
        this.O = s.t(this, b.f);
        this.P = new BarChartDelegate();
        this.Q = new FixedTabsDelegate();
        this.R = new FullScreenStateDelegate();
        this.S = new HistogramLoadingDelegate();
        this.T = new ListSubheaderDelegate();
        this.U = new TextDelegate();
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: kvk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockFinancialsController f190138b;

            {
                this.f190138b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StockFinancialsController stockFinancialsController = this.f190138b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StockFinancialsController.X;
                        qji.b bVarU2 = stockFinancialsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.financials.di.StockFinancialsControllerComponentInjector");
                        e0 e0Var = (e0) ((quk.a) bVarU2);
                        g0 g0Var = e0Var.f239090g;
                        e0 e0Var2 = e0Var.f239091h;
                        StockFinancialsControllerContract$InputData stockFinancialsControllerContract$InputData = stockFinancialsController.K;
                        avk.j jVar = stockFinancialsController.W;
                        stockFinancialsControllerContract$InputData.getClass();
                        jVar.getClass();
                        return new prk.h0(g0Var, e0Var2, stockFinancialsControllerContract$InputData, jVar);
                    case 1:
                        KProperty[] kPropertyArr2 = StockFinancialsController.X;
                        return (i) ((prk.h0) stockFinancialsController.L.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = StockFinancialsController.X;
                        StockFinancialsController stockFinancialsController2 = this.f190138b;
                        return dli.f.a(stockFinancialsController2, stockFinancialsController2.d(), v.k(stockFinancialsController2.P, new ErrorChartDelegate(), stockFinancialsController2.Q, stockFinancialsController2.R, stockFinancialsController2.S, stockFinancialsController2.T, new ListSubheaderLoadingDelegate(), stockFinancialsController2.U), 0, null, null, null, 60);
                }
            }
        });
        this.W = new j(this, 15);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((l) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (prk.h0) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.wealth_trading_instrument_financials, null, null, 14));
        ViewBinding value = this.O.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((nrk.b) value).f218664b.setTag("StockFinancialsRecyclerView");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, new kge.b(rd0.e.b(this.Q.f52339c.f121375b), 27), new d(this, continuation, 2), 3);
        ViewController.P2(this, new kge.b(rd0.e.b(this.P.f51714c.f121375b), 25), new d(this, continuation, 0), 3);
        ViewController.P2(this, new kge.b(rd0.e.b(this.T.f52707c), 26), new d(this, continuation, 1), 3);
        ViewController.P2(this, new kge.b(rd0.e.b(this.R.f52371h.f121375b), 28), new kvk.h(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.V.getValue();
    }
}
