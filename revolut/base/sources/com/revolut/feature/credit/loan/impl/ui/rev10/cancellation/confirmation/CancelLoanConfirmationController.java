package com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bk6.c;
import buf.u;
import c0d.e;
import c1i.f;
import c65.b;
import c65.i;
import c65.l;
import c65.p;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.confirmation.CancelLoanConfirmationController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import u45.d;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/cancellation/confirmation/CancelLoanConfirmationController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lc65/l;", "Ldli/a;", "Lc65/p;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CancelLoanConfirmationController extends ViewController<l> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CancelLoanConfirmationController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final h K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final int T;

    public CancelLoanConfirmationController(CancelLoanConfirmationControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = w.y0(new e(14));
        this.M = w.y0(new e(15));
        this.N = w.y0(new e(16));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: c65.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancelLoanConfirmationController f21655b;

            {
                this.f21655b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CancelLoanConfirmationController cancelLoanConfirmationController = this.f21655b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CancelLoanConfirmationController.U;
                        return zhm.v.k((TextDelegate) cancelLoanConfirmationController.L.getValue(), new CellDetailsDelegate(), new SimpleMediaDelegate());
                    case 1:
                        KProperty[] kPropertyArr2 = CancelLoanConfirmationController.U;
                        return (j60.a) ((u45.d) cancelLoanConfirmationController.S.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CancelLoanConfirmationController.U;
                        return (o) ((u45.d) cancelLoanConfirmationController.S.getValue()).f277098j.get();
                    default:
                        KProperty[] kPropertyArr4 = CancelLoanConfirmationController.U;
                        CancelLoanConfirmationController cancelLoanConfirmationController2 = this.f21655b;
                        return dli.f.a(cancelLoanConfirmationController2, (o) cancelLoanConfirmationController2.Q.getValue(), (List) cancelLoanConfirmationController2.O.getValue(), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: c65.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancelLoanConfirmationController f21655b;

            {
                this.f21655b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CancelLoanConfirmationController cancelLoanConfirmationController = this.f21655b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CancelLoanConfirmationController.U;
                        return zhm.v.k((TextDelegate) cancelLoanConfirmationController.L.getValue(), new CellDetailsDelegate(), new SimpleMediaDelegate());
                    case 1:
                        KProperty[] kPropertyArr2 = CancelLoanConfirmationController.U;
                        return (j60.a) ((u45.d) cancelLoanConfirmationController.S.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CancelLoanConfirmationController.U;
                        return (o) ((u45.d) cancelLoanConfirmationController.S.getValue()).f277098j.get();
                    default:
                        KProperty[] kPropertyArr4 = CancelLoanConfirmationController.U;
                        CancelLoanConfirmationController cancelLoanConfirmationController2 = this.f21655b;
                        return dli.f.a(cancelLoanConfirmationController2, (o) cancelLoanConfirmationController2.Q.getValue(), (List) cancelLoanConfirmationController2.O.getValue(), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: c65.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancelLoanConfirmationController f21655b;

            {
                this.f21655b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CancelLoanConfirmationController cancelLoanConfirmationController = this.f21655b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CancelLoanConfirmationController.U;
                        return zhm.v.k((TextDelegate) cancelLoanConfirmationController.L.getValue(), new CellDetailsDelegate(), new SimpleMediaDelegate());
                    case 1:
                        KProperty[] kPropertyArr2 = CancelLoanConfirmationController.U;
                        return (j60.a) ((u45.d) cancelLoanConfirmationController.S.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CancelLoanConfirmationController.U;
                        return (o) ((u45.d) cancelLoanConfirmationController.S.getValue()).f277098j.get();
                    default:
                        KProperty[] kPropertyArr4 = CancelLoanConfirmationController.U;
                        CancelLoanConfirmationController cancelLoanConfirmationController2 = this.f21655b;
                        return dli.f.a(cancelLoanConfirmationController2, (o) cancelLoanConfirmationController2.Q.getValue(), (List) cancelLoanConfirmationController2.O.getValue(), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: c65.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancelLoanConfirmationController f21655b;

            {
                this.f21655b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CancelLoanConfirmationController cancelLoanConfirmationController = this.f21655b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CancelLoanConfirmationController.U;
                        return zhm.v.k((TextDelegate) cancelLoanConfirmationController.L.getValue(), new CellDetailsDelegate(), new SimpleMediaDelegate());
                    case 1:
                        KProperty[] kPropertyArr2 = CancelLoanConfirmationController.U;
                        return (j60.a) ((u45.d) cancelLoanConfirmationController.S.getValue()).d.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CancelLoanConfirmationController.U;
                        return (o) ((u45.d) cancelLoanConfirmationController.S.getValue()).f277098j.get();
                    default:
                        KProperty[] kPropertyArr4 = CancelLoanConfirmationController.U;
                        CancelLoanConfirmationController cancelLoanConfirmationController2 = this.f21655b;
                        return dli.f.a(cancelLoanConfirmationController2, (o) cancelLoanConfirmationController2.Q.getValue(), (List) cancelLoanConfirmationController2.O.getValue(), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        this.S = w.y0(new u(this, inputData, 20));
        this.T = R$layout.screen_recycler_navbar_footer_nextbutton;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setTitle(uiState.f21668a, null);
        navBarWithToolbar.setToolbarTitle(uiState.f21668a);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        d3().f174557b.setText(uiState.f21669b);
        Clause clause = uiState.f21670c;
        if (clause != null) {
            d3().f174558c.setTextClause(clause);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c65.o) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.P.getValue()).d(v.k((LargeActionButtonDelegate) this.M.getValue(), new CellDetailsDelegate(), (RowDelegate) this.N.getValue()));
        d3().f174557b.setLoadingButtonTag("LOAN_CANCELLATION_CONFIRMATION_LOADING_TAG");
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174557b.o), null, new i(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(new c(rd0.e.b(((TextDelegate) this.L.getValue()).d), 22), new c(rd0.e.b(((LargeActionButtonDelegate) this.M.getValue()).d.f121375b), 23), new c(rd0.e.b(((j60.a) this.P.getValue()).C()), 24), new c(rd0.e.b(d3().e.f59410q), 25), new c(rd0.e.b(((RowDelegate) this.N.getValue()).f53218h), 26)), null, new f(this, (Continuation) null, 12), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.K.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.T;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
