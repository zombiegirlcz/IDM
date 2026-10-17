package com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridSingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.LoanSelectNewRepaymentDayV2Screen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rr0.f;
import s65.b;
import s65.d;
import s65.g;
import s65.i;
import s65.j;
import s65.k;
import s65.l;
import s65.m;
import te0.w;
import tki.c;
import tx0.t3;
import u45.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/changerepaymentday/selectday_v2/LoanSelectNewRepaymentDayV2Screen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ls65/g;", "Ltki/c;", "Ls65/m;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanSelectNewRepaymentDayV2Screen extends ViewController<g> implements c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(LoanSelectNewRepaymentDayV2Screen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final h K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public LoanSelectNewRepaymentDayV2Screen(LoanSelectNewRepaymentDayV2ScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: s65.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanSelectNewRepaymentDayV2Screen f260134b;

            {
                this.f260134b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LoanSelectNewRepaymentDayV2Screen loanSelectNewRepaymentDayV2Screen = this.f260134b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LoanSelectNewRepaymentDayV2Screen.T;
                        return (h) ((j0) loanSelectNewRepaymentDayV2Screen.N.getValue()).f277159c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = LoanSelectNewRepaymentDayV2Screen.T;
                        return loanSelectNewRepaymentDayV2Screen.d3().f174564b.A.V();
                    default:
                        KProperty[] kPropertyArr3 = LoanSelectNewRepaymentDayV2Screen.T;
                        LoanSelectNewRepaymentDayV2Screen loanSelectNewRepaymentDayV2Screen2 = this.f260134b;
                        return tki.g.a(loanSelectNewRepaymentDayV2Screen2, loanSelectNewRepaymentDayV2Screen2.R2(), v.k((GridSingleChoiceDelegate) loanSelectNewRepaymentDayV2Screen2.R.getValue(), (FullScreenStateDelegate) loanSelectNewRepaymentDayV2Screen2.P.getValue(), (CellDetailsDelegate) loanSelectNewRepaymentDayV2Screen2.Q.getValue(), new PlainTextDelegate(), new CellDetailsLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.N = w.y0(new rxe.b(this, inputData, 24));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: s65.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanSelectNewRepaymentDayV2Screen f260134b;

            {
                this.f260134b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LoanSelectNewRepaymentDayV2Screen loanSelectNewRepaymentDayV2Screen = this.f260134b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanSelectNewRepaymentDayV2Screen.T;
                        return (h) ((j0) loanSelectNewRepaymentDayV2Screen.N.getValue()).f277159c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = LoanSelectNewRepaymentDayV2Screen.T;
                        return loanSelectNewRepaymentDayV2Screen.d3().f174564b.A.V();
                    default:
                        KProperty[] kPropertyArr3 = LoanSelectNewRepaymentDayV2Screen.T;
                        LoanSelectNewRepaymentDayV2Screen loanSelectNewRepaymentDayV2Screen2 = this.f260134b;
                        return tki.g.a(loanSelectNewRepaymentDayV2Screen2, loanSelectNewRepaymentDayV2Screen2.R2(), v.k((GridSingleChoiceDelegate) loanSelectNewRepaymentDayV2Screen2.R.getValue(), (FullScreenStateDelegate) loanSelectNewRepaymentDayV2Screen2.P.getValue(), (CellDetailsDelegate) loanSelectNewRepaymentDayV2Screen2.Q.getValue(), new PlainTextDelegate(), new CellDetailsLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.P = w.y0(new s1g.a(15));
        this.Q = w.y0(new s1g.a(16));
        this.R = w.y0(new s1g.a(17));
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: s65.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanSelectNewRepaymentDayV2Screen f260134b;

            {
                this.f260134b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LoanSelectNewRepaymentDayV2Screen loanSelectNewRepaymentDayV2Screen = this.f260134b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanSelectNewRepaymentDayV2Screen.T;
                        return (h) ((j0) loanSelectNewRepaymentDayV2Screen.N.getValue()).f277159c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = LoanSelectNewRepaymentDayV2Screen.T;
                        return loanSelectNewRepaymentDayV2Screen.d3().f174564b.A.V();
                    default:
                        KProperty[] kPropertyArr3 = LoanSelectNewRepaymentDayV2Screen.T;
                        LoanSelectNewRepaymentDayV2Screen loanSelectNewRepaymentDayV2Screen2 = this.f260134b;
                        return tki.g.a(loanSelectNewRepaymentDayV2Screen2, loanSelectNewRepaymentDayV2Screen2.R2(), v.k((GridSingleChoiceDelegate) loanSelectNewRepaymentDayV2Screen2.R.getValue(), (FullScreenStateDelegate) loanSelectNewRepaymentDayV2Screen2.P.getValue(), (CellDetailsDelegate) loanSelectNewRepaymentDayV2Screen2.Q.getValue(), new PlainTextDelegate(), new CellDetailsLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        l lVar = uiState.f260143a;
        if (lVar instanceof k) {
            navBarWithToolbar.H0(false);
            navBarWithToolbar.I0(t3.DEFAULT, false);
            LargeActionButton goToButton = d3().f174564b;
            Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
            goToButton.setVisibility(8);
            return;
        }
        if (lVar instanceof j) {
            navBarWithToolbar.j0(false);
            navBarWithToolbar.l0();
            LargeActionButton goToButton2 = d3().f174564b;
            Intrinsics.checkNotNullExpressionValue(goToButton2, "goToButton");
            goToButton2.setVisibility(8);
            return;
        }
        if (!(lVar instanceof i)) {
            throw new NoWhenBranchMatchedException();
        }
        i iVar = (i) lVar;
        TextLocalisedClause textLocalisedClause = iVar.f260139a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(iVar.f260140b);
        navBarWithToolbar.l0();
        navBarWithToolbar.H0(false);
        LargeActionButton goToButton3 = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton3, "goToButton");
        goToButton3.setVisibility(0);
        d3().f174564b.setEnabled(uiState.f260145c);
        ((f) ((sy0.b) this.O.getValue())).b(uiState.f260144b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j0) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setHeaderTitleMode(tx0.j0.MULTILINE_LARGE);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f174564b.setText(new TextLocalisedClause(R$string.loan_management_confirm_button_title, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new s65.c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((GridSingleChoiceDelegate) this.R.getValue()).f52390g.f121375b), null, new s56.i(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.P.getValue()).f52371h.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsDelegate) this.Q.getValue()).d), null, new s65.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new s65.c(this, continuation, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.K.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final s65.h R2() {
        return (s65.h) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }
}
