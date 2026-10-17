package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.option_selection.revamp;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import bmb.i;
import bmb.n;
import bmb.p;
import bmb.r;
import cli.o;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.savings.impl.R$id;
import com.revolut.feature.retail.savings.impl.R$layout;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.option_selection.revamp.SavingsOptionSelectionScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/option_selection/revamp/SavingsOptionSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbmb/i;", "Ldli/a;", "Lbmb/r;", "<init>", "()V", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SavingsOptionSelectionScreen extends ViewController<i> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(SavingsOptionSelectionScreen.class, "binding", "getBinding()Lcom/revolut/feature/retail/savings/impl/databinding/ScreenSavingsOptionSelectionRevampBinding;", 0))};
    public final Object K;
    public final Object L;
    public final Object O;
    public final Object T;
    public final int M = R$layout.screen_savings_option_selection_revamp;
    public final h N = s.t(this, a.f);
    public final FullScreenStateDelegate P = new FullScreenStateDelegate();
    public final FooterTextDelegate Q = new FooterTextDelegate();
    public final ListingTileDelegate R = new ListingTileDelegate();
    public final RowDelegate S = new RowDelegate(null, null, 7);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, xmb.h.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/retail/savings/impl/databinding/ScreenSavingsOptionSelectionRevampBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.optionSelection_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.optionSelection_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    i = R$id.optionSelection_screenContainer;
                    if (((ControllerContainerCoordinatorLayout) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new xmb.h((ControllerContainerConstraintLayout) p0, navBarWithToolbar);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public SavingsOptionSelectionScreen() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: bmb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsOptionSelectionScreen f16783b;

            {
                this.f16783b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SavingsOptionSelectionScreen savingsOptionSelectionScreen = this.f16783b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsOptionSelectionScreen.U;
                        return (h) ((rlb.i) savingsOptionSelectionScreen.L.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsOptionSelectionScreen.U;
                        qji.b bVarU2 = savingsOptionSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.option_selection.revamp.di.SavingsOptionSelectionScreenInjector");
                        rlb.g gVar = (rlb.g) bVarU2;
                        return new rlb.i(gVar.f254990b, gVar.f254991c);
                    case 2:
                        ViewBinding value = savingsOptionSelectionScreen.N.getValue(savingsOptionSelectionScreen, SavingsOptionSelectionScreen.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((xmb.h) value).f307116b;
                    default:
                        KProperty[] kPropertyArr3 = SavingsOptionSelectionScreen.U;
                        SavingsOptionSelectionScreen savingsOptionSelectionScreen2 = this.f16783b;
                        return dli.f.a(savingsOptionSelectionScreen2, (h) savingsOptionSelectionScreen2.K.getValue(), zhm.v.k(savingsOptionSelectionScreen2.P, new RowLoadingDelegate(), savingsOptionSelectionScreen2.S, new ListSubheaderDelegate(), savingsOptionSelectionScreen2.R, savingsOptionSelectionScreen2.Q), R$id.optionSelection_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.L = w.y0(new Function0(this) { // from class: bmb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsOptionSelectionScreen f16783b;

            {
                this.f16783b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SavingsOptionSelectionScreen savingsOptionSelectionScreen = this.f16783b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsOptionSelectionScreen.U;
                        return (h) ((rlb.i) savingsOptionSelectionScreen.L.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsOptionSelectionScreen.U;
                        qji.b bVarU2 = savingsOptionSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.option_selection.revamp.di.SavingsOptionSelectionScreenInjector");
                        rlb.g gVar = (rlb.g) bVarU2;
                        return new rlb.i(gVar.f254990b, gVar.f254991c);
                    case 2:
                        ViewBinding value = savingsOptionSelectionScreen.N.getValue(savingsOptionSelectionScreen, SavingsOptionSelectionScreen.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((xmb.h) value).f307116b;
                    default:
                        KProperty[] kPropertyArr3 = SavingsOptionSelectionScreen.U;
                        SavingsOptionSelectionScreen savingsOptionSelectionScreen2 = this.f16783b;
                        return dli.f.a(savingsOptionSelectionScreen2, (h) savingsOptionSelectionScreen2.K.getValue(), zhm.v.k(savingsOptionSelectionScreen2.P, new RowLoadingDelegate(), savingsOptionSelectionScreen2.S, new ListSubheaderDelegate(), savingsOptionSelectionScreen2.R, savingsOptionSelectionScreen2.Q), R$id.optionSelection_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: bmb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsOptionSelectionScreen f16783b;

            {
                this.f16783b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SavingsOptionSelectionScreen savingsOptionSelectionScreen = this.f16783b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsOptionSelectionScreen.U;
                        return (h) ((rlb.i) savingsOptionSelectionScreen.L.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsOptionSelectionScreen.U;
                        qji.b bVarU2 = savingsOptionSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.option_selection.revamp.di.SavingsOptionSelectionScreenInjector");
                        rlb.g gVar = (rlb.g) bVarU2;
                        return new rlb.i(gVar.f254990b, gVar.f254991c);
                    case 2:
                        ViewBinding value = savingsOptionSelectionScreen.N.getValue(savingsOptionSelectionScreen, SavingsOptionSelectionScreen.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((xmb.h) value).f307116b;
                    default:
                        KProperty[] kPropertyArr3 = SavingsOptionSelectionScreen.U;
                        SavingsOptionSelectionScreen savingsOptionSelectionScreen2 = this.f16783b;
                        return dli.f.a(savingsOptionSelectionScreen2, (h) savingsOptionSelectionScreen2.K.getValue(), zhm.v.k(savingsOptionSelectionScreen2.P, new RowLoadingDelegate(), savingsOptionSelectionScreen2.S, new ListSubheaderDelegate(), savingsOptionSelectionScreen2.R, savingsOptionSelectionScreen2.Q), R$id.optionSelection_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: bmb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsOptionSelectionScreen f16783b;

            {
                this.f16783b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                SavingsOptionSelectionScreen savingsOptionSelectionScreen = this.f16783b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsOptionSelectionScreen.U;
                        return (h) ((rlb.i) savingsOptionSelectionScreen.L.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsOptionSelectionScreen.U;
                        qji.b bVarU2 = savingsOptionSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.option_selection.revamp.di.SavingsOptionSelectionScreenInjector");
                        rlb.g gVar = (rlb.g) bVarU2;
                        return new rlb.i(gVar.f254990b, gVar.f254991c);
                    case 2:
                        ViewBinding value = savingsOptionSelectionScreen.N.getValue(savingsOptionSelectionScreen, SavingsOptionSelectionScreen.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((xmb.h) value).f307116b;
                    default:
                        KProperty[] kPropertyArr3 = SavingsOptionSelectionScreen.U;
                        SavingsOptionSelectionScreen savingsOptionSelectionScreen2 = this.f16783b;
                        return dli.f.a(savingsOptionSelectionScreen2, (h) savingsOptionSelectionScreen2.K.getValue(), zhm.v.k(savingsOptionSelectionScreen2.P, new RowLoadingDelegate(), savingsOptionSelectionScreen2.S, new ListSubheaderDelegate(), savingsOptionSelectionScreen2.R, savingsOptionSelectionScreen2.Q), R$id.optionSelection_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        bmb.q qVar2 = uiState.f16801b;
        if (!(qVar2 instanceof n)) {
            if (qVar2 instanceof bmb.o) {
                d3().setTitle(((bmb.o) qVar2).f16798a, null);
                d3().setLoadingVisible(false);
                return;
            } else {
                if (!qVar2.equals(p.f16799a)) {
                    throw new NoWhenBranchMatchedException();
                }
                d3().setLoadingVisible(true);
                return;
            }
        }
        d3().setLoadingVisible(false);
        NavBarWithToolbar navBarWithToolbarD3 = d3();
        n nVar = (n) qVar2;
        Clause clause = nVar.f16797b;
        TextLocalisedClause textLocalisedClause = nVar.f16796a;
        navBarWithToolbarD3.setTitle(textLocalisedClause, null);
        d3().setToolbarTitle(textLocalisedClause);
        d3().setSecondDescriptionVisible(clause != null);
        d3().setSecondDescriptionText(clause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (rlb.i) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (bmb.h) this.K.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbarD3 = d3();
        navBarWithToolbarD3.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbarD3.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f59410q), null, new bf5.a(this, null, 18), 3);
        efm.r rVarMerge = efm.r.merge(this.S.f53218h, this.P.f52371h.f121375b, this.R.f52751c);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge), null, new bmb.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.e.f121375b), null, new bmb.b(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final NavBarWithToolbar d3() {
        return (NavBarWithToolbar) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.T.getValue();
    }
}
