package com.revolut.feature.revolutpay.impl.ui.payment_schedule;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepHorizontalV2Delegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.revolutpay.impl.ui.payment_schedule.PaymentScheduleScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import i9c.b;
import i9c.c;
import i9c.g;
import i9c.i;
import i9c.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p7c.n;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/payment_schedule/PaymentScheduleScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Li9c/b;", "Ldli/a;", "Li9c/c;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentScheduleScreen extends ViewController<b> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(PaymentScheduleScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final int K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final SelectableDelegate O;
    public final GridBoxDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public PaymentScheduleScreen(PaymentScheduleContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$style.UiKitTheme_Transparent;
        this.L = R$layout.screen_recycler_navbar_action_footer;
        this.M = s.t(this, g.f);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.N = rowDelegate;
        this.O = new SelectableDelegate(rowDelegate);
        final int i = 0;
        final int i2 = 1;
        this.P = new GridBoxDelegate(v.k(new CounterTextDelegate(), new RowLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, 8.0f, 6);
        this.Q = w.y0(new i1d.b(this, inputData, 8));
        this.R = w.y0(new Function0(this) { // from class: i9c.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentScheduleScreen f159628b;

            {
                this.f159628b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentScheduleScreen.T;
                        return (k) ((n) this.f159628b.Q.getValue()).f233649c.get();
                    default:
                        KProperty[] kPropertyArr2 = PaymentScheduleScreen.T;
                        PaymentScheduleScreen paymentScheduleScreen = this.f159628b;
                        return dli.f.a(paymentScheduleScreen, (k) paymentScheduleScreen.R.getValue(), v.k(paymentScheduleScreen.N, paymentScheduleScreen.O, paymentScheduleScreen.P, new ListSubheaderDelegate(), new ProgressStepHorizontalV2Delegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.S = w.y0(new Function0(this) { // from class: i9c.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentScheduleScreen f159628b;

            {
                this.f159628b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentScheduleScreen.T;
                        return (k) ((n) this.f159628b.Q.getValue()).f233649c.get();
                    default:
                        KProperty[] kPropertyArr2 = PaymentScheduleScreen.T;
                        PaymentScheduleScreen paymentScheduleScreen = this.f159628b;
                        return dli.f.a(paymentScheduleScreen, (k) paymentScheduleScreen.R.getValue(), v.k(paymentScheduleScreen.N, paymentScheduleScreen.O, paymentScheduleScreen.P, new ListSubheaderDelegate(), new ProgressStepHorizontalV2Delegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getN() {
        return Integer.valueOf(this.K);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(uiState.f159624b, null);
        d3().f174533b.setModel(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (k) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.f), null, new i9c.h(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.r()), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.f59410q), null, new i9c.h(this, null, 1), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
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
