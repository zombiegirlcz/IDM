package com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown.LoanRepaymentBreakdownController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.j0;
import tx0.t3;
import u45.b0;
import vc.s;
import vkm.d;
import xki.e;
import ys.i;
import z75.b;
import z75.f;
import z75.p;
import z75.r;
import z75.t;
import z75.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repaymentbreakdown/LoanRepaymentBreakdownController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lz75/u;", "Companion", "a", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanRepaymentBreakdownController extends ViewController<q> implements dli.a {
    public final h K;
    public final int L;
    public final Object M;
    public final Object N;
    public final CellDetailsDelegate O;
    public final CellDetailsActionDelegate P;
    public final AccountCellItemDelegate Q;
    public final LargeActionButtonDelegate R;
    public final ProgressStepVerticalV2Delegate S;
    public final FullScreenStateDelegate T;
    public final Object U;
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(LoanRepaymentBreakdownController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown.LoanRepaymentBreakdownController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public LoanRepaymentBreakdownController(LoanRepaymentBreakdownControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = w.y0(new ywi.b(this, inputData, 15));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: z75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanRepaymentBreakdownController f319906b;

            {
                this.f319906b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        LoanRepaymentBreakdownController.Companion companion = LoanRepaymentBreakdownController.INSTANCE;
                        return (p) ((b0) this.f319906b.M.getValue()).f277061j.get();
                    default:
                        LoanRepaymentBreakdownController.Companion companion2 = LoanRepaymentBreakdownController.INSTANCE;
                        LoanRepaymentBreakdownController loanRepaymentBreakdownController = this.f319906b;
                        return dli.f.a(loanRepaymentBreakdownController, (p) loanRepaymentBreakdownController.N.getValue(), zhm.v.k(new CounterTextDelegate(), new ListSubheaderDelegate(), loanRepaymentBreakdownController.O, loanRepaymentBreakdownController.S, loanRepaymentBreakdownController.T, loanRepaymentBreakdownController.Q, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.O = new CellDetailsDelegate();
        this.P = new CellDetailsActionDelegate();
        this.Q = new AccountCellItemDelegate();
        this.R = new LargeActionButtonDelegate();
        this.S = new ProgressStepVerticalV2Delegate();
        this.T = new FullScreenStateDelegate();
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: z75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanRepaymentBreakdownController f319906b;

            {
                this.f319906b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        LoanRepaymentBreakdownController.Companion companion = LoanRepaymentBreakdownController.INSTANCE;
                        return (p) ((b0) this.f319906b.M.getValue()).f277061j.get();
                    default:
                        LoanRepaymentBreakdownController.Companion companion2 = LoanRepaymentBreakdownController.INSTANCE;
                        LoanRepaymentBreakdownController loanRepaymentBreakdownController = this.f319906b;
                        return dli.f.a(loanRepaymentBreakdownController, (p) loanRepaymentBreakdownController.N.getValue(), zhm.v.k(new CounterTextDelegate(), new ListSubheaderDelegate(), loanRepaymentBreakdownController.O, loanRepaymentBreakdownController.S, loanRepaymentBreakdownController.T, loanRepaymentBreakdownController.Q, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        u uiState = (u) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f319933c);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        t tVar = uiState.f319932b;
        if (tVar instanceof z75.s) {
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.H0(false);
            navBarWithToolbar.I0(t3.TWO_LINES, false);
        } else if (tVar instanceof r) {
            NavBarWithToolbar.Companion companion2 = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.j0(false);
            navBarWithToolbar.l0();
        } else {
            if (!(tVar instanceof z75.q)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithToolbar.l0();
            z75.q qVar2 = (z75.q) tVar;
            TextLocalisedClause textLocalisedClause = qVar2.f319927a;
            navBarWithToolbar.setToolbarTitle(textLocalisedClause);
            navBarWithToolbar.setTitle(textLocalisedClause, null);
            navBarWithToolbar.setSecondDescriptionText(qVar2.f319928b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (p) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((b0) this.M.getValue()).e.get()).d(v.k(this.P, this.O, this.R));
        d3().f174564b.setLoadingButtonTag("LOADING_TAG_REPAY_BUTTON");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        yph.b bVar = new yph.b(rd0.e.b(d3().f174564b.o), 29);
        f fVar = new f(rd0.e.b(d3().f174565c.f59410q), 0);
        d dVarB = rd0.e.b(this.S.d);
        yx4.a aVar = yx4.b.Companion;
        b75.d dVar = new b75.d(dVarB, aVar, 17);
        b75.d dVar2 = new b75.d(rd0.e.b(this.R.d.f121375b), aVar, 18);
        CellDetailsDelegate cellDetailsDelegate = this.O;
        b75.d dVar3 = new b75.d(rd0.e.b(cellDetailsDelegate.f), aVar, 19);
        b75.d dVar4 = new b75.d(rd0.e.b(cellDetailsDelegate.d), aVar, 20);
        b75.d dVar5 = new b75.d(rd0.e.b(this.P.d), aVar, 21);
        b75.d dVar6 = new b75.d(rd0.e.b(this.T.f52371h.f121375b), aVar, 22);
        AccountCellItemDelegate accountCellItemDelegate = this.Q;
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(bVar, fVar, dVar, dVar2, dVar3, dVar4, dVar5, dVar6, new b75.d(rd0.e.b(accountCellItemDelegate.f51551c.f53218h), aVar, 23), new b75.d(rd0.e.b(accountCellItemDelegate.f51551c.f53220l), aVar, 16)), null, new i(2, (p) this.N.getValue(), p.class, "onItemClick", "onItemClick(Lcom/revolut/feature/credit/core/ui/ClickWrapper;)V", 4, 10), 3);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        d3().f174564b.setText(new TextLocalisedClause(R$string.loan_management_payment_confirm_payment, null, null, 14));
    }

    public final jii.u d3() {
        ViewBinding value = this.K.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.U.getValue();
    }
}
