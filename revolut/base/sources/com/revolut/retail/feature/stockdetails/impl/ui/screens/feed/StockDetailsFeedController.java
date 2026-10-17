package com.revolut.retail.feature.stockdetails.impl.ui.screens.feed;

import aii.q;
import android.view.View;
import avk.j;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.NewsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.R$layout;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.StockDetailsFeedController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.StockDetailsFeedControllerContract$InputData;
import ivk.c;
import ivk.d;
import ivk.e;
import ivk.f;
import ivk.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import prk.d0;
import prk.e0;
import prk.g0;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/feed/StockDetailsFeedController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Livk/l;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StockDetailsFeedController extends ViewController<q> implements dli.a {
    public final StockDetailsFeedControllerContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final FullScreenStateDelegate O;
    public final ListSubheaderDelegate P;
    public final NewsDelegate Q;
    public final TextDelegate R;
    public final Object S;
    public final j T;
    public final e U;

    public StockDetailsFeedController(StockDetailsFeedControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.fragment_asset_details;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ivk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockDetailsFeedController f168870b;

            {
                this.f168870b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StockDetailsFeedController stockDetailsFeedController = this.f168870b;
                switch (i2) {
                    case 0:
                        qji.b bVarU2 = stockDetailsFeedController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.di.StockDetailsFeedControllerComponentInjector");
                        e0 e0Var = (e0) ((quk.a) bVarU2);
                        g0 g0Var = e0Var.f239090g;
                        e0 e0Var2 = e0Var.f239091h;
                        StockDetailsFeedControllerContract$InputData stockDetailsFeedControllerContract$InputData = stockDetailsFeedController.K;
                        stockDetailsFeedControllerContract$InputData.getClass();
                        avk.j jVar = stockDetailsFeedController.T;
                        jVar.getClass();
                        e eVar = stockDetailsFeedController.U;
                        eVar.getClass();
                        return new d0(g0Var, e0Var2, stockDetailsFeedControllerContract$InputData, eVar, jVar);
                    case 1:
                        return (f) ((d0) stockDetailsFeedController.M.getValue()).i.get();
                    default:
                        StockDetailsFeedController stockDetailsFeedController2 = this.f168870b;
                        return dli.f.a(stockDetailsFeedController2, (f) stockDetailsFeedController2.N.getValue(), v.k(stockDetailsFeedController2.P, stockDetailsFeedController2.Q, stockDetailsFeedController2.O, stockDetailsFeedController2.R, new ListSubheaderLoadingDelegate(), new NewsLoadingDelegate(), new FullScreenStateLoadingDelegate()), 0, null, new koi.h(null, false, true, 3), null, 44);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ivk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockDetailsFeedController f168870b;

            {
                this.f168870b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StockDetailsFeedController stockDetailsFeedController = this.f168870b;
                switch (i22) {
                    case 0:
                        qji.b bVarU2 = stockDetailsFeedController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.di.StockDetailsFeedControllerComponentInjector");
                        e0 e0Var = (e0) ((quk.a) bVarU2);
                        g0 g0Var = e0Var.f239090g;
                        e0 e0Var2 = e0Var.f239091h;
                        StockDetailsFeedControllerContract$InputData stockDetailsFeedControllerContract$InputData = stockDetailsFeedController.K;
                        stockDetailsFeedControllerContract$InputData.getClass();
                        avk.j jVar = stockDetailsFeedController.T;
                        jVar.getClass();
                        e eVar = stockDetailsFeedController.U;
                        eVar.getClass();
                        return new d0(g0Var, e0Var2, stockDetailsFeedControllerContract$InputData, eVar, jVar);
                    case 1:
                        return (f) ((d0) stockDetailsFeedController.M.getValue()).i.get();
                    default:
                        StockDetailsFeedController stockDetailsFeedController2 = this.f168870b;
                        return dli.f.a(stockDetailsFeedController2, (f) stockDetailsFeedController2.N.getValue(), v.k(stockDetailsFeedController2.P, stockDetailsFeedController2.Q, stockDetailsFeedController2.O, stockDetailsFeedController2.R, new ListSubheaderLoadingDelegate(), new NewsLoadingDelegate(), new FullScreenStateLoadingDelegate()), 0, null, new koi.h(null, false, true, 3), null, 44);
                }
            }
        });
        this.O = new FullScreenStateDelegate();
        this.P = new ListSubheaderDelegate();
        this.Q = new NewsDelegate();
        this.R = new TextDelegate();
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: ivk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockDetailsFeedController f168870b;

            {
                this.f168870b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StockDetailsFeedController stockDetailsFeedController = this.f168870b;
                switch (i22) {
                    case 0:
                        qji.b bVarU2 = stockDetailsFeedController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.di.StockDetailsFeedControllerComponentInjector");
                        e0 e0Var = (e0) ((quk.a) bVarU2);
                        g0 g0Var = e0Var.f239090g;
                        e0 e0Var2 = e0Var.f239091h;
                        StockDetailsFeedControllerContract$InputData stockDetailsFeedControllerContract$InputData = stockDetailsFeedController.K;
                        stockDetailsFeedControllerContract$InputData.getClass();
                        avk.j jVar = stockDetailsFeedController.T;
                        jVar.getClass();
                        e eVar = stockDetailsFeedController.U;
                        eVar.getClass();
                        return new d0(g0Var, e0Var2, stockDetailsFeedControllerContract$InputData, eVar, jVar);
                    case 1:
                        return (f) ((d0) stockDetailsFeedController.M.getValue()).i.get();
                    default:
                        StockDetailsFeedController stockDetailsFeedController2 = this.f168870b;
                        return dli.f.a(stockDetailsFeedController2, (f) stockDetailsFeedController2.N.getValue(), v.k(stockDetailsFeedController2.P, stockDetailsFeedController2.Q, stockDetailsFeedController2.O, stockDetailsFeedController2.R, new ListSubheaderLoadingDelegate(), new NewsLoadingDelegate(), new FullScreenStateLoadingDelegate()), 0, null, new koi.h(null, false, true, 3), null, 44);
                }
            }
        });
        this.T = new j(this, 13);
        this.U = new e(this);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((l) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (f) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.P.f52707c), new ivk.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.p()), new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
