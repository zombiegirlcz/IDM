package com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method.SepaDirectDebitRepaymentMethodContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method.SepaDirectDebitRepaymentMethodController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.c1;
import dw3.h6;
import dw3.i6;
import hx7.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import w01.k;
import w50.g;
import w65.c;
import wh4.b;
import wh4.d;
import wh4.l;
import wh4.m;
import wh4.n;
import wh4.p;
import wh4.r;
import wh4.t;
import wh4.u;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/sepa_direct_debit/repayment_method/SepaDirectDebitRepaymentMethodController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lwh4/l;", "Ldli/a;", "Lwh4/p;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SepaDirectDebitRepaymentMethodController extends PluginScreenController<l> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(SepaDirectDebitRepaymentMethodController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final SepaDirectDebitRepaymentMethodContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final RowDelegate Q;
    public final FullScreenStateDelegate R;
    public final RowLoadingDelegate S;
    public final h T;

    public SepaDirectDebitRepaymentMethodController(SepaDirectDebitRepaymentMethodContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_action_footer;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: wh4.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SepaDirectDebitRepaymentMethodController f297412b;

            {
                this.f297412b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SepaDirectDebitRepaymentMethodController sepaDirectDebitRepaymentMethodController = this.f297412b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SepaDirectDebitRepaymentMethodController.U;
                        qji.b bVarU2 = sepaDirectDebitRepaymentMethodController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method.di.SepaDirectDebitRepaymentMethodScreenInjector");
                        h6 h6Var = (h6) bVarU2;
                        c1 c1Var = h6Var.f118903c;
                        h6 h6Var2 = h6Var.d;
                        SepaDirectDebitRepaymentMethodContract$InputData sepaDirectDebitRepaymentMethodContract$InputData = sepaDirectDebitRepaymentMethodController.L;
                        sepaDirectDebitRepaymentMethodContract$InputData.getClass();
                        return new i6(c1Var, h6Var2, sepaDirectDebitRepaymentMethodController, sepaDirectDebitRepaymentMethodContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SepaDirectDebitRepaymentMethodController.U;
                        return (b) ((i6) sepaDirectDebitRepaymentMethodController.N.getValue()).f118984g.get();
                    default:
                        KProperty[] kPropertyArr3 = SepaDirectDebitRepaymentMethodController.U;
                        int i3 = R$id.screenRecyclerNavbarActionFooter_recyclerView;
                        SepaDirectDebitRepaymentMethodController sepaDirectDebitRepaymentMethodController2 = this.f297412b;
                        return dli.f.a(sepaDirectDebitRepaymentMethodController2, sepaDirectDebitRepaymentMethodController2.R2(), zhm.v.k(sepaDirectDebitRepaymentMethodController2.Q, sepaDirectDebitRepaymentMethodController2.R, sepaDirectDebitRepaymentMethodController2.S, new FooterTextDelegate()), i3, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: wh4.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SepaDirectDebitRepaymentMethodController f297412b;

            {
                this.f297412b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SepaDirectDebitRepaymentMethodController sepaDirectDebitRepaymentMethodController = this.f297412b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SepaDirectDebitRepaymentMethodController.U;
                        qji.b bVarU2 = sepaDirectDebitRepaymentMethodController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method.di.SepaDirectDebitRepaymentMethodScreenInjector");
                        h6 h6Var = (h6) bVarU2;
                        c1 c1Var = h6Var.f118903c;
                        h6 h6Var2 = h6Var.d;
                        SepaDirectDebitRepaymentMethodContract$InputData sepaDirectDebitRepaymentMethodContract$InputData = sepaDirectDebitRepaymentMethodController.L;
                        sepaDirectDebitRepaymentMethodContract$InputData.getClass();
                        return new i6(c1Var, h6Var2, sepaDirectDebitRepaymentMethodController, sepaDirectDebitRepaymentMethodContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SepaDirectDebitRepaymentMethodController.U;
                        return (b) ((i6) sepaDirectDebitRepaymentMethodController.N.getValue()).f118984g.get();
                    default:
                        KProperty[] kPropertyArr3 = SepaDirectDebitRepaymentMethodController.U;
                        int i3 = R$id.screenRecyclerNavbarActionFooter_recyclerView;
                        SepaDirectDebitRepaymentMethodController sepaDirectDebitRepaymentMethodController2 = this.f297412b;
                        return dli.f.a(sepaDirectDebitRepaymentMethodController2, sepaDirectDebitRepaymentMethodController2.R2(), zhm.v.k(sepaDirectDebitRepaymentMethodController2.Q, sepaDirectDebitRepaymentMethodController2.R, sepaDirectDebitRepaymentMethodController2.S, new FooterTextDelegate()), i3, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: wh4.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SepaDirectDebitRepaymentMethodController f297412b;

            {
                this.f297412b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SepaDirectDebitRepaymentMethodController sepaDirectDebitRepaymentMethodController = this.f297412b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SepaDirectDebitRepaymentMethodController.U;
                        qji.b bVarU2 = sepaDirectDebitRepaymentMethodController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method.di.SepaDirectDebitRepaymentMethodScreenInjector");
                        h6 h6Var = (h6) bVarU2;
                        c1 c1Var = h6Var.f118903c;
                        h6 h6Var2 = h6Var.d;
                        SepaDirectDebitRepaymentMethodContract$InputData sepaDirectDebitRepaymentMethodContract$InputData = sepaDirectDebitRepaymentMethodController.L;
                        sepaDirectDebitRepaymentMethodContract$InputData.getClass();
                        return new i6(c1Var, h6Var2, sepaDirectDebitRepaymentMethodController, sepaDirectDebitRepaymentMethodContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SepaDirectDebitRepaymentMethodController.U;
                        return (b) ((i6) sepaDirectDebitRepaymentMethodController.N.getValue()).f118984g.get();
                    default:
                        KProperty[] kPropertyArr3 = SepaDirectDebitRepaymentMethodController.U;
                        int i32 = R$id.screenRecyclerNavbarActionFooter_recyclerView;
                        SepaDirectDebitRepaymentMethodController sepaDirectDebitRepaymentMethodController2 = this.f297412b;
                        return dli.f.a(sepaDirectDebitRepaymentMethodController2, sepaDirectDebitRepaymentMethodController2.R2(), zhm.v.k(sepaDirectDebitRepaymentMethodController2.Q, sepaDirectDebitRepaymentMethodController2.R, sepaDirectDebitRepaymentMethodController2.S, new FooterTextDelegate()), i32, null, null, null, 56);
                }
            }
        });
        this.Q = new RowDelegate(null, null, 7);
        this.R = new FullScreenStateDelegate();
        this.S = new RowLoadingDelegate();
        this.T = s.t(this, r.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        n nVar = uiState.f297410b;
        if (nVar instanceof wh4.o) {
            NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = d3().f174534c;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            screenRecyclerNavbarActionFooterNavBar.H0(false);
            screenRecyclerNavbarActionFooterNavBar.I0(t3.TWO_LINES, false);
            ActionFooterView screenRecyclerNavbarActionFooterActionFooterView = d3().f174533b;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView, "screenRecyclerNavbarActionFooterActionFooterView");
            screenRecyclerNavbarActionFooterActionFooterView.setModel(((wh4.o) nVar).f297408a);
            k.d(screenRecyclerNavbarActionFooterActionFooterView);
            return;
        }
        if (nVar instanceof n.a) {
            NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar2 = d3().f174534c;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar2, "screenRecyclerNavbarActionFooterNavBar");
            NavBarWithToolbar.Companion companion2 = NavBarWithToolbar.INSTANCE;
            screenRecyclerNavbarActionFooterNavBar2.j0(false);
            screenRecyclerNavbarActionFooterNavBar2.l0();
            ActionFooterView screenRecyclerNavbarActionFooterActionFooterView2 = d3().f174533b;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView2, "screenRecyclerNavbarActionFooterActionFooterView");
            k.a(screenRecyclerNavbarActionFooterActionFooterView2);
            return;
        }
        if (!(nVar instanceof m)) {
            throw new NoWhenBranchMatchedException();
        }
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar3 = d3().f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar3, "screenRecyclerNavbarActionFooterNavBar");
        NavBarWithToolbar.Companion companion3 = NavBarWithToolbar.INSTANCE;
        screenRecyclerNavbarActionFooterNavBar3.H0(false);
        screenRecyclerNavbarActionFooterNavBar3.l0();
        m mVar = (m) nVar;
        i.z(screenRecyclerNavbarActionFooterNavBar3, mVar.f297405a);
        ActionFooterView screenRecyclerNavbarActionFooterActionFooterView3 = d3().f174533b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView3, "screenRecyclerNavbarActionFooterActionFooterView");
        screenRecyclerNavbarActionFooterActionFooterView3.setModel(mVar.f297406b);
        k.d(screenRecyclerNavbarActionFooterActionFooterView3);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((a) R2()).J2(d.f297397a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i6) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new c(this, continuation, 21), 3);
        ViewController.P2(this, new wa3.d(rd0.e.b(d3().f174533b.f), 9), new g(this, continuation, 22), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53220l), new t(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52371h.f121375b), new u(this, null), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.T.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final b R2() {
        return (b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
