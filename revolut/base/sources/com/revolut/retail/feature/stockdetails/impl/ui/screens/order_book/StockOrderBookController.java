package com.revolut.retail.feature.stockdetails.impl.ui.screens.order_book;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bk6.c;
import bwk.f;
import cli.o;
import com.revolut.core.ui_kit.delegates.OrderBookChartDelegate;
import com.revolut.core.ui_kit.delegates.OrderBookHeaderDelegate;
import com.revolut.core.ui_kit.delegates.OrderBookItemDelegate;
import com.revolut.core.ui_kit.delegates.OrderBookItemLoadingDelegate;
import com.revolut.core.ui_kit.delegates.OrderBookRestrictedDelegate;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.R$layout;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.order_book.StockOrderBookController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.order_book.StockOrderBookControllerContract$InputData;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import prk.e0;
import prk.g0;
import prk.j0;
import te0.w;
import vc.s;
import xki.e;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/order_book/StockOrderBookController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lbwk/h;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StockOrderBookController extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(StockOrderBookController.class, "binding", "getBinding()Lcom/revolut/retail/feature/stockdetails/impl/databinding/FragmentAssetDetailsBinding;", 0))};
    public final StockOrderBookControllerContract$InputData K;
    public final Object L;
    public final h M;
    public final int N;
    public final Object O;
    public final OrderBookItemDelegate P;
    public final OrderBookRestrictedDelegate Q;
    public final Lazy R;

    public StockOrderBookController(StockOrderBookControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: bwk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockOrderBookController f19368b;

            {
                this.f19368b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StockOrderBookController stockOrderBookController = this.f19368b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StockOrderBookController.S;
                        return (f) ((j0) stockOrderBookController.O.getValue()).f239199b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = StockOrderBookController.S;
                        qji.b bVarU2 = stockOrderBookController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.order_book.di.StockOrderBookControllerComponentInjector");
                        e0 e0Var = (e0) ((quk.a) bVarU2);
                        g0 g0Var = e0Var.f239090g;
                        e0 e0Var2 = e0Var.f239091h;
                        StockOrderBookControllerContract$InputData stockOrderBookControllerContract$InputData = stockOrderBookController.K;
                        stockOrderBookControllerContract$InputData.getClass();
                        return new j0(g0Var, e0Var2, stockOrderBookControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = StockOrderBookController.S;
                        StockOrderBookController stockOrderBookController2 = this.f19368b;
                        return dli.f.a(stockOrderBookController2, (f) stockOrderBookController2.L.getValue(), v.k(new OrderBookHeaderDelegate(), new OrderBookChartDelegate(0), stockOrderBookController2.P, new OrderBookItemLoadingDelegate(), stockOrderBookController2.Q), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        this.M = s.t(this, bwk.b.f);
        this.N = R$layout.fragment_asset_details;
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: bwk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockOrderBookController f19368b;

            {
                this.f19368b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StockOrderBookController stockOrderBookController = this.f19368b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StockOrderBookController.S;
                        return (f) ((j0) stockOrderBookController.O.getValue()).f239199b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = StockOrderBookController.S;
                        qji.b bVarU2 = stockOrderBookController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.order_book.di.StockOrderBookControllerComponentInjector");
                        e0 e0Var = (e0) ((quk.a) bVarU2);
                        g0 g0Var = e0Var.f239090g;
                        e0 e0Var2 = e0Var.f239091h;
                        StockOrderBookControllerContract$InputData stockOrderBookControllerContract$InputData = stockOrderBookController.K;
                        stockOrderBookControllerContract$InputData.getClass();
                        return new j0(g0Var, e0Var2, stockOrderBookControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = StockOrderBookController.S;
                        StockOrderBookController stockOrderBookController2 = this.f19368b;
                        return dli.f.a(stockOrderBookController2, (f) stockOrderBookController2.L.getValue(), v.k(new OrderBookHeaderDelegate(), new OrderBookChartDelegate(0), stockOrderBookController2.P, new OrderBookItemLoadingDelegate(), stockOrderBookController2.Q), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        this.P = new OrderBookItemDelegate();
        this.Q = new OrderBookRestrictedDelegate();
        final int i3 = 2;
        this.R = j.b(new Function0(this) { // from class: bwk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockOrderBookController f19368b;

            {
                this.f19368b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StockOrderBookController stockOrderBookController = this.f19368b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StockOrderBookController.S;
                        return (f) ((j0) stockOrderBookController.O.getValue()).f239199b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = StockOrderBookController.S;
                        qji.b bVarU2 = stockOrderBookController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.order_book.di.StockOrderBookControllerComponentInjector");
                        e0 e0Var = (e0) ((quk.a) bVarU2);
                        g0 g0Var = e0Var.f239090g;
                        e0 e0Var2 = e0Var.f239091h;
                        StockOrderBookControllerContract$InputData stockOrderBookControllerContract$InputData = stockOrderBookController.K;
                        stockOrderBookControllerContract$InputData.getClass();
                        return new j0(g0Var, e0Var2, stockOrderBookControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = StockOrderBookController.S;
                        StockOrderBookController stockOrderBookController2 = this.f19368b;
                        return dli.f.a(stockOrderBookController2, (f) stockOrderBookController2.L.getValue(), v.k(new OrderBookHeaderDelegate(), new OrderBookChartDelegate(0), stockOrderBookController2.P, new OrderBookItemLoadingDelegate(), stockOrderBookController2.Q), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((bwk.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((nrk.b) value).f218664b.setItemAnimator(null);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.Q.f52886c.f121375b), new brc.h(this, null, 14), 3);
        OrderBookItemDelegate orderBookItemDelegate = this.P;
        ViewController.P2(this, new c(rd0.e.b(orderBookItemDelegate.f52882c.f121375b), 20), new bwk.e(this, null, 0), 3);
        ViewController.P2(this, new c(rd0.e.b(orderBookItemDelegate.d.f121375b), 21), new bwk.e(this, null, 1), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.N;
    }

    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
