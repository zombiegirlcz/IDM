package com.revolut.feature.revolutpay.shared.ui.order_summary;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.revolutpay.shared.ui.order_summary.OrderSummaryScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p7c.i;
import te0.w;
import vc.s;
import xki.e;
import ywi.b;
import zdc.f;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/shared/ui/order_summary/OrderSummaryScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lzdc/h;", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderSummaryScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(OrderSummaryScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerBasicNavbarBinding;", 0))};
    public final Object K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;

    public OrderSummaryScreen(OrderSummaryScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new b(this, inputData, 23));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: zdc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderSummaryScreen f321444b;

            {
                this.f321444b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = OrderSummaryScreen.P;
                        return (i) ((p7c.i) this.f321444b.K.getValue()).f233621b.get();
                    default:
                        KProperty[] kPropertyArr2 = OrderSummaryScreen.P;
                        OrderSummaryScreen orderSummaryScreen = this.f321444b;
                        return dli.f.a(orderSummaryScreen, (i) orderSummaryScreen.L.getValue(), v.k(new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new FullScreenStateDelegate(), new RowDelegate(null, null, 7), new CellDetailsDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: zdc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderSummaryScreen f321444b;

            {
                this.f321444b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OrderSummaryScreen.P;
                        return (i) ((p7c.i) this.f321444b.K.getValue()).f233621b.get();
                    default:
                        KProperty[] kPropertyArr2 = OrderSummaryScreen.P;
                        OrderSummaryScreen orderSummaryScreen = this.f321444b;
                        return dli.f.a(orderSummaryScreen, (i) orderSummaryScreen.L.getValue(), v.k(new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new FullScreenStateDelegate(), new RowDelegate(null, null, 7), new CellDetailsDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.N = R$layout.screen_recycler_basic_navbar;
        this.O = s.t(this, f.f);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        zdc.h uiState = (zdc.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174530b.setTitle(uiState.f321447a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (zdc.i) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174530b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174530b.f59211b), new z3f.b(this, null, 11), 3);
    }

    public final j d3() {
        ViewBinding value = this.O.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (j) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.M.getValue();
    }
}
