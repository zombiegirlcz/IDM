package com.revolut.feature.credit.loan.impl.ui.rev10.repaymentdetails;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b85.b;
import b85.g;
import b85.i;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentdetails.LoanRepaymentDetailsController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentdetails.LoanRepaymentDetailsControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import u45.d0;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repaymentdetails/LoanRepaymentDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lb85/i;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanRepaymentDetailsController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(LoanRepaymentDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final LoanRepaymentDetailsControllerContract$InputData K;
    public final int L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public LoanRepaymentDetailsController(LoanRepaymentDetailsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: b85.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanRepaymentDetailsController f13092b;

            {
                this.f13092b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LoanRepaymentDetailsController loanRepaymentDetailsController = this.f13092b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LoanRepaymentDetailsController.U;
                        return (g) ((d0) loanRepaymentDetailsController.S.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = LoanRepaymentDetailsController.U;
                        u45.h hVar = czi.c.o(loanRepaymentDetailsController.m2()).B;
                        LoanRepaymentDetailsControllerContract$InputData loanRepaymentDetailsControllerContract$InputData = loanRepaymentDetailsController.K;
                        loanRepaymentDetailsControllerContract$InputData.getClass();
                        return new d0(hVar, loanRepaymentDetailsController, loanRepaymentDetailsControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = LoanRepaymentDetailsController.U;
                        LoanRepaymentDetailsController loanRepaymentDetailsController2 = this.f13092b;
                        return dli.f.a(loanRepaymentDetailsController2, (g) loanRepaymentDetailsController2.M.getValue(), v.k(new RowLoadingDelegate(), new CellDetailsDelegate(), (PlainTextWarningDelegate) loanRepaymentDetailsController2.O.getValue(), (CellDetailsChevronDelegate) loanRepaymentDetailsController2.P.getValue(), (FullScreenStateDelegate) loanRepaymentDetailsController2.R.getValue()), 0, null, null, null, 60);
                }
            }
        });
        this.N = s.t(this, b.f);
        this.O = w.y0(new aw1.a(26));
        this.P = w.y0(new aw1.a(27));
        this.Q = w.y0(new aw1.a(28));
        this.R = w.y0(new aw1.a(29));
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: b85.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanRepaymentDetailsController f13092b;

            {
                this.f13092b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LoanRepaymentDetailsController loanRepaymentDetailsController = this.f13092b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanRepaymentDetailsController.U;
                        return (g) ((d0) loanRepaymentDetailsController.S.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = LoanRepaymentDetailsController.U;
                        u45.h hVar = czi.c.o(loanRepaymentDetailsController.m2()).B;
                        LoanRepaymentDetailsControllerContract$InputData loanRepaymentDetailsControllerContract$InputData = loanRepaymentDetailsController.K;
                        loanRepaymentDetailsControllerContract$InputData.getClass();
                        return new d0(hVar, loanRepaymentDetailsController, loanRepaymentDetailsControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = LoanRepaymentDetailsController.U;
                        LoanRepaymentDetailsController loanRepaymentDetailsController2 = this.f13092b;
                        return dli.f.a(loanRepaymentDetailsController2, (g) loanRepaymentDetailsController2.M.getValue(), v.k(new RowLoadingDelegate(), new CellDetailsDelegate(), (PlainTextWarningDelegate) loanRepaymentDetailsController2.O.getValue(), (CellDetailsChevronDelegate) loanRepaymentDetailsController2.P.getValue(), (FullScreenStateDelegate) loanRepaymentDetailsController2.R.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: b85.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanRepaymentDetailsController f13092b;

            {
                this.f13092b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LoanRepaymentDetailsController loanRepaymentDetailsController = this.f13092b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanRepaymentDetailsController.U;
                        return (g) ((d0) loanRepaymentDetailsController.S.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = LoanRepaymentDetailsController.U;
                        u45.h hVar = czi.c.o(loanRepaymentDetailsController.m2()).B;
                        LoanRepaymentDetailsControllerContract$InputData loanRepaymentDetailsControllerContract$InputData = loanRepaymentDetailsController.K;
                        loanRepaymentDetailsControllerContract$InputData.getClass();
                        return new d0(hVar, loanRepaymentDetailsController, loanRepaymentDetailsControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = LoanRepaymentDetailsController.U;
                        LoanRepaymentDetailsController loanRepaymentDetailsController2 = this.f13092b;
                        return dli.f.a(loanRepaymentDetailsController2, (g) loanRepaymentDetailsController2.M.getValue(), v.k(new RowLoadingDelegate(), new CellDetailsDelegate(), (PlainTextWarningDelegate) loanRepaymentDetailsController2.O.getValue(), (CellDetailsChevronDelegate) loanRepaymentDetailsController2.P.getValue(), (FullScreenStateDelegate) loanRepaymentDetailsController2.R.getValue()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        b85.h hVar = uiState.f13102a;
        navBarWithToolbar.setEndIconImage(hVar.d);
        MoneyClause moneyClause = hVar.f13099a;
        navBarWithToolbar.setTitle(moneyClause, null);
        navBarWithToolbar.setToolbarTitle(moneyClause);
        navBarWithToolbar.setDescriptionText(hVar.f13100b);
        navBarWithToolbar.setSecondDescriptionText(hVar.f13101c);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.H0(false);
        navBarWithToolbar.l0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d0) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((d0) this.S.getValue()).d.get()).d(u.c((RowDelegate) this.Q.getValue()));
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        an9.i iVar = new an9.i(rd0.e.b(((CellDetailsChevronDelegate) this.P.getValue()).f51821c), 22);
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(iVar, new an9.i(rd0.e.b(((m) value).f174539b.f59410q), 23), new an9.i(rd0.e.b(((FullScreenStateDelegate) this.R.getValue()).f52371h.f121375b), 24)), null, new aee.g(2, (g) this.M.getValue(), g.class, "onItemClick", "onItemClick(Lcom/revolut/feature/credit/core/ui/ClickWrapper;)V", 4, 11), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.T.getValue();
    }
}
