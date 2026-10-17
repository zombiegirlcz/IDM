package com.revolut.feature.credit.loan.impl.ui.rev10.repaymenttype;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymenttype.LoanRepaymentTypeController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nsh.e;
import nuh.j;
import o85.b;
import o85.c;
import o85.f;
import o85.g;
import te0.w;
import tx0.j0;
import u45.e0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repaymenttype/LoanRepaymentTypeController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lo85/h;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanRepaymentTypeController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(LoanRepaymentTypeController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final int Q;

    public LoanRepaymentTypeController(LoanRepaymentTypeControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = w.y0(new o23.b(23));
        this.M = w.y0(new o23.b(24));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: o85.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanRepaymentTypeController f222934b;

            {
                this.f222934b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = LoanRepaymentTypeController.R;
                        return (f) ((e0) this.f222934b.P.getValue()).f277110c.get();
                    default:
                        KProperty[] kPropertyArr2 = LoanRepaymentTypeController.R;
                        LoanRepaymentTypeController loanRepaymentTypeController = this.f222934b;
                        return dli.f.a(loanRepaymentTypeController, (f) loanRepaymentTypeController.N.getValue(), v.k((ProductSelectionDelegate) loanRepaymentTypeController.L.getValue(), (FullScreenStateDelegate) loanRepaymentTypeController.M.getValue(), new RowLoadingDelegate(), new ProductSelectionLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: o85.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanRepaymentTypeController f222934b;

            {
                this.f222934b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LoanRepaymentTypeController.R;
                        return (f) ((e0) this.f222934b.P.getValue()).f277110c.get();
                    default:
                        KProperty[] kPropertyArr2 = LoanRepaymentTypeController.R;
                        LoanRepaymentTypeController loanRepaymentTypeController = this.f222934b;
                        return dli.f.a(loanRepaymentTypeController, (f) loanRepaymentTypeController.N.getValue(), v.k((ProductSelectionDelegate) loanRepaymentTypeController.L.getValue(), (FullScreenStateDelegate) loanRepaymentTypeController.M.getValue(), new RowLoadingDelegate(), new ProductSelectionLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.P = w.y0(new e(this, inputData, 27));
        this.Q = R$layout.screen_recycler_navbar;
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        o85.h uiState = (o85.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        g gVar = uiState.f222938a;
        TextLocalisedClause textLocalisedClause = gVar.f222936a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setSecondDescriptionText(gVar.f222937b);
        navBarWithToolbar.l0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (e0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new j(this, null, 22), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ProductSelectionDelegate) this.L.getValue()).p()), null, new c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
