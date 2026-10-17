package com.revolut.feature.credit.card.impl.ui.cancellation.repayment;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.cancellation.repayment.CreditCardTerminatedRepaymentScreen;
import com.revolut.feature.credit.card.impl.ui.cancellation.repayment.CreditCardTerminatedRepaymentScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ep4.b;
import gla.k;
import gq4.c;
import gq4.d;
import gq4.e;
import gq4.f;
import gq4.g;
import gq4.j;
import gq4.l;
import gq4.r;
import java.util.List;
import jii.t;
import jm4.a3;
import jm4.b3;
import jm4.x2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/cancellation/repayment/CreditCardTerminatedRepaymentScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgq4/j;", "Ldli/a;", "Lgq4/l;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardTerminatedRepaymentScreen extends ViewController<j> implements a, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CreditCardTerminatedRepaymentScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterTwoButtonsBinding;", 0))};
    public final /* synthetic */ b K;
    public final CreditCardTerminatedRepaymentScreenContract$InputData L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final int Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public CreditCardTerminatedRepaymentScreen(CreditCardTerminatedRepaymentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = inputData;
        this.M = s.t(this, gq4.b.f);
        this.N = w.y0(new k(14));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: gq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardTerminatedRepaymentScreen f145543b;

            {
                this.f145543b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardTerminatedRepaymentScreen creditCardTerminatedRepaymentScreen = this.f145543b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardTerminatedRepaymentScreen.U;
                        return creditCardTerminatedRepaymentScreen.d3().f174560b.A.V();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardTerminatedRepaymentScreen.U;
                        return creditCardTerminatedRepaymentScreen.d3().f.A.V();
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardTerminatedRepaymentScreen.U;
                        qji.b bVarU2 = creditCardTerminatedRepaymentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.cancellation.repayment.di.CreditCardTerminatedRepaymentScreenComponent.Injector");
                        b3 b3Var = (b3) bVarU2;
                        a3 a3Var = b3Var.f176006b;
                        b3 b3Var2 = b3Var.f176007c;
                        CreditCardTerminatedRepaymentScreenContract$InputData creditCardTerminatedRepaymentScreenContract$InputData = creditCardTerminatedRepaymentScreen.L;
                        creditCardTerminatedRepaymentScreenContract$InputData.getClass();
                        return new x2(a3Var, b3Var2, creditCardTerminatedRepaymentScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardTerminatedRepaymentScreen.U;
                        return (k) ((x2) creditCardTerminatedRepaymentScreen.R.getValue()).f176436b.get();
                    default:
                        KProperty[] kPropertyArr5 = CreditCardTerminatedRepaymentScreen.U;
                        CreditCardTerminatedRepaymentScreen creditCardTerminatedRepaymentScreen2 = this.f145543b;
                        return dli.f.a(creditCardTerminatedRepaymentScreen2, creditCardTerminatedRepaymentScreen2.d(), v.k((FullScreenStateDelegate) creditCardTerminatedRepaymentScreen2.N.getValue(), new CellDetailsDelegate(), new CellDetailsActionDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate()), R$id.screenRecyclerNavbarFooterTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: gq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardTerminatedRepaymentScreen f145543b;

            {
                this.f145543b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardTerminatedRepaymentScreen creditCardTerminatedRepaymentScreen = this.f145543b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardTerminatedRepaymentScreen.U;
                        return creditCardTerminatedRepaymentScreen.d3().f174560b.A.V();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardTerminatedRepaymentScreen.U;
                        return creditCardTerminatedRepaymentScreen.d3().f.A.V();
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardTerminatedRepaymentScreen.U;
                        qji.b bVarU2 = creditCardTerminatedRepaymentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.cancellation.repayment.di.CreditCardTerminatedRepaymentScreenComponent.Injector");
                        b3 b3Var = (b3) bVarU2;
                        a3 a3Var = b3Var.f176006b;
                        b3 b3Var2 = b3Var.f176007c;
                        CreditCardTerminatedRepaymentScreenContract$InputData creditCardTerminatedRepaymentScreenContract$InputData = creditCardTerminatedRepaymentScreen.L;
                        creditCardTerminatedRepaymentScreenContract$InputData.getClass();
                        return new x2(a3Var, b3Var2, creditCardTerminatedRepaymentScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardTerminatedRepaymentScreen.U;
                        return (k) ((x2) creditCardTerminatedRepaymentScreen.R.getValue()).f176436b.get();
                    default:
                        KProperty[] kPropertyArr5 = CreditCardTerminatedRepaymentScreen.U;
                        CreditCardTerminatedRepaymentScreen creditCardTerminatedRepaymentScreen2 = this.f145543b;
                        return dli.f.a(creditCardTerminatedRepaymentScreen2, creditCardTerminatedRepaymentScreen2.d(), v.k((FullScreenStateDelegate) creditCardTerminatedRepaymentScreen2.N.getValue(), new CellDetailsDelegate(), new CellDetailsActionDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate()), R$id.screenRecyclerNavbarFooterTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = R$layout.screen_recycler_navbar_footer_two_buttons;
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: gq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardTerminatedRepaymentScreen f145543b;

            {
                this.f145543b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardTerminatedRepaymentScreen creditCardTerminatedRepaymentScreen = this.f145543b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardTerminatedRepaymentScreen.U;
                        return creditCardTerminatedRepaymentScreen.d3().f174560b.A.V();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardTerminatedRepaymentScreen.U;
                        return creditCardTerminatedRepaymentScreen.d3().f.A.V();
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardTerminatedRepaymentScreen.U;
                        qji.b bVarU2 = creditCardTerminatedRepaymentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.cancellation.repayment.di.CreditCardTerminatedRepaymentScreenComponent.Injector");
                        b3 b3Var = (b3) bVarU2;
                        a3 a3Var = b3Var.f176006b;
                        b3 b3Var2 = b3Var.f176007c;
                        CreditCardTerminatedRepaymentScreenContract$InputData creditCardTerminatedRepaymentScreenContract$InputData = creditCardTerminatedRepaymentScreen.L;
                        creditCardTerminatedRepaymentScreenContract$InputData.getClass();
                        return new x2(a3Var, b3Var2, creditCardTerminatedRepaymentScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardTerminatedRepaymentScreen.U;
                        return (k) ((x2) creditCardTerminatedRepaymentScreen.R.getValue()).f176436b.get();
                    default:
                        KProperty[] kPropertyArr5 = CreditCardTerminatedRepaymentScreen.U;
                        CreditCardTerminatedRepaymentScreen creditCardTerminatedRepaymentScreen2 = this.f145543b;
                        return dli.f.a(creditCardTerminatedRepaymentScreen2, creditCardTerminatedRepaymentScreen2.d(), v.k((FullScreenStateDelegate) creditCardTerminatedRepaymentScreen2.N.getValue(), new CellDetailsDelegate(), new CellDetailsActionDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate()), R$id.screenRecyclerNavbarFooterTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: gq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardTerminatedRepaymentScreen f145543b;

            {
                this.f145543b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CreditCardTerminatedRepaymentScreen creditCardTerminatedRepaymentScreen = this.f145543b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardTerminatedRepaymentScreen.U;
                        return creditCardTerminatedRepaymentScreen.d3().f174560b.A.V();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardTerminatedRepaymentScreen.U;
                        return creditCardTerminatedRepaymentScreen.d3().f.A.V();
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardTerminatedRepaymentScreen.U;
                        qji.b bVarU2 = creditCardTerminatedRepaymentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.cancellation.repayment.di.CreditCardTerminatedRepaymentScreenComponent.Injector");
                        b3 b3Var = (b3) bVarU2;
                        a3 a3Var = b3Var.f176006b;
                        b3 b3Var2 = b3Var.f176007c;
                        CreditCardTerminatedRepaymentScreenContract$InputData creditCardTerminatedRepaymentScreenContract$InputData = creditCardTerminatedRepaymentScreen.L;
                        creditCardTerminatedRepaymentScreenContract$InputData.getClass();
                        return new x2(a3Var, b3Var2, creditCardTerminatedRepaymentScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardTerminatedRepaymentScreen.U;
                        return (k) ((x2) creditCardTerminatedRepaymentScreen.R.getValue()).f176436b.get();
                    default:
                        KProperty[] kPropertyArr5 = CreditCardTerminatedRepaymentScreen.U;
                        CreditCardTerminatedRepaymentScreen creditCardTerminatedRepaymentScreen2 = this.f145543b;
                        return dli.f.a(creditCardTerminatedRepaymentScreen2, creditCardTerminatedRepaymentScreen2.d(), v.k((FullScreenStateDelegate) creditCardTerminatedRepaymentScreen2.N.getValue(), new CellDetailsDelegate(), new CellDetailsActionDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate()), R$id.screenRecyclerNavbarFooterTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i6 = 4;
        this.T = w.y0(new Function0(this) { // from class: gq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardTerminatedRepaymentScreen f145543b;

            {
                this.f145543b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                CreditCardTerminatedRepaymentScreen creditCardTerminatedRepaymentScreen = this.f145543b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardTerminatedRepaymentScreen.U;
                        return creditCardTerminatedRepaymentScreen.d3().f174560b.A.V();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardTerminatedRepaymentScreen.U;
                        return creditCardTerminatedRepaymentScreen.d3().f.A.V();
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardTerminatedRepaymentScreen.U;
                        qji.b bVarU2 = creditCardTerminatedRepaymentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.cancellation.repayment.di.CreditCardTerminatedRepaymentScreenComponent.Injector");
                        b3 b3Var = (b3) bVarU2;
                        a3 a3Var = b3Var.f176006b;
                        b3 b3Var2 = b3Var.f176007c;
                        CreditCardTerminatedRepaymentScreenContract$InputData creditCardTerminatedRepaymentScreenContract$InputData = creditCardTerminatedRepaymentScreen.L;
                        creditCardTerminatedRepaymentScreenContract$InputData.getClass();
                        return new x2(a3Var, b3Var2, creditCardTerminatedRepaymentScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardTerminatedRepaymentScreen.U;
                        return (k) ((x2) creditCardTerminatedRepaymentScreen.R.getValue()).f176436b.get();
                    default:
                        KProperty[] kPropertyArr5 = CreditCardTerminatedRepaymentScreen.U;
                        CreditCardTerminatedRepaymentScreen creditCardTerminatedRepaymentScreen2 = this.f145543b;
                        return dli.f.a(creditCardTerminatedRepaymentScreen2, creditCardTerminatedRepaymentScreen2.d(), v.k((FullScreenStateDelegate) creditCardTerminatedRepaymentScreen2.N.getValue(), new CellDetailsDelegate(), new CellDetailsActionDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate()), R$id.screenRecyclerNavbarFooterTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    public static void f3(LargeActionButton largeActionButton, g gVar, sy0.b bVar) {
        if (!(gVar instanceof e)) {
            if (!(gVar instanceof f)) {
                throw new NoWhenBranchMatchedException();
            }
            ((rr0.f) bVar).b(true);
        } else {
            ((rr0.f) bVar).b(false);
            e eVar = (e) gVar;
            largeActionButton.setText(eVar.f145544a);
            largeActionButton.o(eVar.f145545b);
            largeActionButton.setEnabled(true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        LargeActionButton screenRecyclerNavbarFooterTwoButtonsFirstButton = d3().f174560b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterTwoButtonsFirstButton, "screenRecyclerNavbarFooterTwoButtonsFirstButton");
        f3(screenRecyclerNavbarFooterTwoButtonsFirstButton, uiState.f145554b, (sy0.b) this.O.getValue());
        LargeActionButton screenRecyclerNavbarFooterTwoButtonsSecondButton = d3().f;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterTwoButtonsSecondButton, "screenRecyclerNavbarFooterTwoButtonsSecondButton");
        f3(screenRecyclerNavbarFooterTwoButtonsSecondButton, uiState.f145555c, (sy0.b) this.P.getValue());
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean J2() {
        ((r) d()).I2();
        return true;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (x2) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174562g;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        CreditCardTerminatedRepaymentScreenContract$InputData creditCardTerminatedRepaymentScreenContract$InputData = this.L;
        TextClause textClause = new TextClause(creditCardTerminatedRepaymentScreenContract$InputData.f69162b.f68707a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        navBarWithToolbar.setTitle(textClause, null);
        navBarWithToolbar.setToolbarTitle(textClause);
        navBarWithToolbar.setSecondDescriptionText(new TextClause(creditCardTerminatedRepaymentScreenContract$InputData.f69162b.f68708b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        FooterTextView screenRecyclerNavbarFooterTwoButtonsFooterView = d3().d;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterTwoButtonsFooterView, "screenRecyclerNavbarFooterTwoButtonsFooterView");
        w01.k.a(screenRecyclerNavbarFooterTwoButtonsFooterView);
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174562g.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174560b.o), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f.o), new c(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), new d(this, null), 3);
    }

    public final t d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (t) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final gq4.k d() {
        return (gq4.k) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
