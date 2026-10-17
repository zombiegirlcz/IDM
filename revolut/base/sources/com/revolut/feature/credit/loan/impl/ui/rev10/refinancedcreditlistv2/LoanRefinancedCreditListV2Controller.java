package com.revolut.feature.credit.loan.impl.ui.rev10.refinancedcreditlistv2;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ay4.f;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.impl.ui.rev10.refinancedcreditlistv2.LoanRefinancedCreditListV2Controller;
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
import ltf.b;
import m3g.c;
import m75.d;
import m75.g;
import te0.w;
import tx0.j0;
import u45.z;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/refinancedcreditlistv2/LoanRefinancedCreditListV2Controller;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lm75/h;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanRefinancedCreditListV2Controller extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(LoanRefinancedCreditListV2Controller.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final boolean L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final h T;

    public LoanRefinancedCreditListV2Controller(LoanRefinancedCreditListV2ControllerContract$InputData inputModel) {
        Intrinsics.checkNotNullParameter(inputModel, "inputModel");
        this.K = R$layout.screen_recycler_navbar;
        this.L = true;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: m75.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanRefinancedCreditListV2Controller f203321b;

            {
                this.f203321b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = LoanRefinancedCreditListV2Controller.U;
                        return (g) ((z) this.f203321b.O.getValue()).f277262g.get();
                    default:
                        KProperty[] kPropertyArr2 = LoanRefinancedCreditListV2Controller.U;
                        LoanRefinancedCreditListV2Controller loanRefinancedCreditListV2Controller = this.f203321b;
                        return dli.f.a(loanRefinancedCreditListV2Controller, (g) loanRefinancedCreditListV2Controller.M.getValue(), v.k((RowDelegate) loanRefinancedCreditListV2Controller.R.getValue(), (FullScreenStateDelegate) loanRefinancedCreditListV2Controller.S.getValue(), (CellDetailsDelegate) loanRefinancedCreditListV2Controller.Q.getValue(), new ProgressStepVerticalDelegate(), new RowLoadingDelegate(), new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: m75.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanRefinancedCreditListV2Controller f203321b;

            {
                this.f203321b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LoanRefinancedCreditListV2Controller.U;
                        return (g) ((z) this.f203321b.O.getValue()).f277262g.get();
                    default:
                        KProperty[] kPropertyArr2 = LoanRefinancedCreditListV2Controller.U;
                        LoanRefinancedCreditListV2Controller loanRefinancedCreditListV2Controller = this.f203321b;
                        return dli.f.a(loanRefinancedCreditListV2Controller, (g) loanRefinancedCreditListV2Controller.M.getValue(), v.k((RowDelegate) loanRefinancedCreditListV2Controller.R.getValue(), (FullScreenStateDelegate) loanRefinancedCreditListV2Controller.S.getValue(), (CellDetailsDelegate) loanRefinancedCreditListV2Controller.Q.getValue(), new ProgressStepVerticalDelegate(), new RowLoadingDelegate(), new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.O = w.y0(new b(this, inputModel, 18));
        this.P = w.y0(new c(6));
        this.Q = w.y0(new c(7));
        this.R = w.y0(new c(8));
        this.S = w.y0(new c(9));
        this.T = s.t(this, d.f);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        m75.h uiState = (m75.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ViewBinding value = this.T.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.loan_refinancing_credit_list_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.loan_refinancing_credit_list_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setSecondDescriptionVisible(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((z) this.O.getValue()).d.get()).d(v.k((CellDetailsDelegate) this.Q.getValue(), (LargeActionButtonDelegate) this.P.getValue()));
    }

    /* JADX WARN: Type inference failed for: r14v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.T.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new lpl.c(this, null, 25), 3);
        vkm.d dVarB = rd0.e.b(((FullScreenStateDelegate) this.S.getValue()).f52371h.f121375b);
        ?? r110 = this.R;
        vkm.d dVarB2 = rd0.e.b(((RowDelegate) r110.getValue()).f53218h);
        vkm.d dVarB3 = rd0.e.b(((RowDelegate) r110.getValue()).f53220l);
        ?? r56 = this.Q;
        com.revolut.kompot.navigable.a.g2(this, new f(vkm.q.J(dVarB, dVarB2, dVarB3, rd0.e.b(((CellDetailsDelegate) r56.getValue()).f), rd0.e.b(((CellDetailsDelegate) r56.getValue()).d), rd0.e.b(((CellDetailsDelegate) r56.getValue()).e), rd0.e.b(((LargeActionButtonDelegate) this.P.getValue()).d.f121375b)), yx4.b.Companion, 19), null, new jl6.b(2, (g) this.M.getValue(), g.class, "onItemClicked", "onItemClicked(Lcom/revolut/feature/credit/core/ui/ClickWrapper;)V", 4, 25), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
