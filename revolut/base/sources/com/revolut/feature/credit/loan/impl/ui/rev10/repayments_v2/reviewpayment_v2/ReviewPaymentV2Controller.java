package com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment_v2;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b75.d;
import bx4.c;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment_v2.ReviewPaymentV2Controller;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kx4.f0;
import l85.b;
import l85.i;
import te0.w;
import u45.x0;
import vc.s;
import xki.e;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/reviewpayment_v2/ReviewPaymentV2Controller;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ll85/i;", "Lbx4/c;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReviewPaymentV2Controller extends ViewController<q> implements a, c {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(ReviewPaymentV2Controller.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerBasicNavbarActionFooterBinding;", 0))};
    public final h K;
    public final int L;
    public final Object M;
    public final Object N;
    public final FullScreenStateDelegate O;
    public final Object P;

    public ReviewPaymentV2Controller(ReviewPaymentV2ControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = R$layout.screen_recycler_basic_navbar_action_footer;
        this.M = w.y0(new kpl.b(this, inputData, 16));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: l85.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewPaymentV2Controller f192783b;

            {
                this.f192783b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ReviewPaymentV2Controller.Q;
                        return (h) ((x0) this.f192783b.M.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr2 = ReviewPaymentV2Controller.Q;
                        ReviewPaymentV2Controller reviewPaymentV2Controller = this.f192783b;
                        return dli.f.a(reviewPaymentV2Controller, (h) reviewPaymentV2Controller.N.getValue(), d0.E0(u.c(reviewPaymentV2Controller.O), ((x0) reviewPaymentV2Controller.M.getValue()).c().Q()), R$id.screenRecyclerBasicNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = new FullScreenStateDelegate();
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: l85.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewPaymentV2Controller f192783b;

            {
                this.f192783b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ReviewPaymentV2Controller.Q;
                        return (h) ((x0) this.f192783b.M.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr2 = ReviewPaymentV2Controller.Q;
                        ReviewPaymentV2Controller reviewPaymentV2Controller = this.f192783b;
                        return dli.f.a(reviewPaymentV2Controller, (h) reviewPaymentV2Controller.N.getValue(), d0.E0(u.c(reviewPaymentV2Controller.O), ((x0) reviewPaymentV2Controller.M.getValue()).c().Q()), R$id.screenRecyclerBasicNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174528c.setTitle(uiState.f192792b);
        ActionFooterView actionFooterView = d3().f174527b;
        Intrinsics.checkNotNullExpressionValue(actionFooterView, "screenRecyclerBasicNavba…ionFooterActionFooterView");
        aw0.i iVar = uiState.f192793c;
        actionFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            d3().f174527b.setModel(iVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (l85.h) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        BasicNavBar basicNavBar = d3().f174528c;
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        basicNavBar.setExpanded(false);
        basicNavBar.setTitleCentered(true);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, vkm.q.J(new f0(rd0.e.b(d3().f174527b.f), 9), new f0(rd0.e.b(d3().f174528c.f59211b), 10), new d(rd0.e.b(this.O.f52371h.f121375b), yx4.b.Companion, 11)), new jl6.b(2, (l85.h) this.N.getValue(), l85.h.class, "onItemClick", "onItemClick(Lcom/revolut/feature/credit/core/ui/ClickWrapper;)V", 4, 15), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    public final ax4.d d() {
        return (l85.h) this.N.getValue();
    }

    public final jii.i d3() {
        ViewBinding value = this.K.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.i) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
