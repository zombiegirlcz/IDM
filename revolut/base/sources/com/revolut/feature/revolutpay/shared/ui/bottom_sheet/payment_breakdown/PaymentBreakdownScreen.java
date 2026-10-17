package com.revolut.feature.revolutpay.shared.ui.bottom_sheet.payment_breakdown;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.feature.revolutpay.shared.R$id;
import com.revolut.feature.revolutpay.shared.R$layout;
import com.revolut.feature.revolutpay.shared.ui.bottom_sheet.payment_breakdown.PaymentBreakdownScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ldc.f;
import ldc.g;
import p7c.l;
import p7c.m;
import pki.b;
import te0.w;
import vc.s;
import wcc.c;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolutpay/shared/ui/bottom_sheet/payment_breakdown/PaymentBreakdownScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lldc/g;", "<init>", "()V", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentBreakdownScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(PaymentBreakdownScreen.class, "binding", "getBinding()Lcom/revolut/feature/revolutpay/shared/databinding/ScreenPaymentBreakdownBinding;", 0))};
    public final int K = R$layout.screen_payment_breakdown;
    public final h L = s.t(this, a.f);
    public final Object M;
    public final Object N;
    public final Object O;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/revolutpay/shared/databinding/ScreenPaymentBreakdownBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            int i = R$id.paymentBreakdown_footerView;
            FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(p0, i);
            if (footerTextView != null) {
                i = R$id.paymentBreakdown_NavBar;
                NavBarBottomSheet navBarBottomSheet = (NavBarBottomSheet) ViewBindings.findChildViewById(p0, i);
                if (navBarBottomSheet != null) {
                    i = R$id.paymentBreakdown_RecyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new c(controllerContainerCoordinatorLayout, footerTextView, navBarBottomSheet);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public PaymentBreakdownScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ldc.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentBreakdownScreen f194066b;

            {
                this.f194066b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PaymentBreakdownScreen paymentBreakdownScreen = this.f194066b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentBreakdownScreen.P;
                        qji.b bVarU2 = paymentBreakdownScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.shared.ui.bottom_sheet.payment_breakdown.di.PaymentBreakdownScreenInjector");
                        l lVar = (l) bVarU2;
                        return new m(lVar.f233637b, lVar.f233638c);
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentBreakdownScreen.P;
                        return (f) ((m) paymentBreakdownScreen.M.getValue()).f233643b.get();
                    default:
                        KProperty[] kPropertyArr3 = PaymentBreakdownScreen.P;
                        PaymentBreakdownScreen paymentBreakdownScreen2 = this.f194066b;
                        return dli.f.a(paymentBreakdownScreen2, (f) paymentBreakdownScreen2.N.getValue(), v.k(new FullScreenStateDelegate(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate()), R$id.paymentBreakdown_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ldc.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentBreakdownScreen f194066b;

            {
                this.f194066b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PaymentBreakdownScreen paymentBreakdownScreen = this.f194066b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentBreakdownScreen.P;
                        qji.b bVarU2 = paymentBreakdownScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.shared.ui.bottom_sheet.payment_breakdown.di.PaymentBreakdownScreenInjector");
                        l lVar = (l) bVarU2;
                        return new m(lVar.f233637b, lVar.f233638c);
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentBreakdownScreen.P;
                        return (f) ((m) paymentBreakdownScreen.M.getValue()).f233643b.get();
                    default:
                        KProperty[] kPropertyArr3 = PaymentBreakdownScreen.P;
                        PaymentBreakdownScreen paymentBreakdownScreen2 = this.f194066b;
                        return dli.f.a(paymentBreakdownScreen2, (f) paymentBreakdownScreen2.N.getValue(), v.k(new FullScreenStateDelegate(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate()), R$id.paymentBreakdown_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: ldc.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentBreakdownScreen f194066b;

            {
                this.f194066b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PaymentBreakdownScreen paymentBreakdownScreen = this.f194066b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentBreakdownScreen.P;
                        qji.b bVarU2 = paymentBreakdownScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.shared.ui.bottom_sheet.payment_breakdown.di.PaymentBreakdownScreenInjector");
                        l lVar = (l) bVarU2;
                        return new m(lVar.f233637b, lVar.f233638c);
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentBreakdownScreen.P;
                        return (f) ((m) paymentBreakdownScreen.M.getValue()).f233643b.get();
                    default:
                        KProperty[] kPropertyArr3 = PaymentBreakdownScreen.P;
                        PaymentBreakdownScreen paymentBreakdownScreen2 = this.f194066b;
                        return dli.f.a(paymentBreakdownScreen2, (f) paymentBreakdownScreen2.N.getValue(), v.k(new FullScreenStateDelegate(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate()), R$id.paymentBreakdown_RecyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f296398c.setHeaderModel(new lw0.a(uiState.f194063b, null, null, null, false, 30));
        FooterTextView footerTextView = d3().f296397b;
        Clause clause = uiState.f194064c;
        footerTextView.setTextClause(clause);
        footerTextView.setVisibility(clause != null ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (f) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f296397b.f58608l), new l1g.e(this, (Continuation) null, 22), 3);
    }

    public final c d3() {
        ViewBinding value = this.L.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
