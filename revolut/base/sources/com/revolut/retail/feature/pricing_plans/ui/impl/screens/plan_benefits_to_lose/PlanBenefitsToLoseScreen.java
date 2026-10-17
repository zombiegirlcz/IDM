package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.core.ui_kit.delegates.SplitColumnCellLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$id;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$layout;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.PlanBenefitsToLoseScreen;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import ngk.e;
import qgk.n0;
import qgk.u;
import te0.w;
import tx0.j0;
import vc.s;
import xkk.b;
import xkk.c;
import xkk.d;
import xkk.i;
import xkk.j;
import xkk.k;
import xkk.l;
import xkk.m;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_benefits_to_lose/PlanBenefitsToLoseScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lxkk/i;", "Ldli/a;", "Lxkk/m;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanBenefitsToLoseScreen extends ViewController<i> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PlanBenefitsToLoseScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/pricing_plans/ui/impl/databinding/ScreenPlanBenefitsToLoseBinding;", 0))};
    public final int K = R$layout.screen_plan_benefits_to_lose;
    public final int L = R$style.UiKitTheme_Mono;
    public final h M = s.t(this, a.f);
    public final FullScreenStateDelegate N = new FullScreenStateDelegate();
    public final SplitColumnCellDelegate O = new SplitColumnCellDelegate();
    public final Object P;
    public final Object Q;
    public final Object R;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, e.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/pricing_plans/ui/impl/databinding/ScreenPlanBenefitsToLoseBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.planBenefitsToLoseScreen_background;
            AnimatedBackgroundView animatedBackgroundView = (AnimatedBackgroundView) ViewBindings.findChildViewById(p0, i);
            if (animatedBackgroundView != null) {
                i = R$id.planBenefitsToLoseScreen_navBarWithToolbar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.planBenefitsToLoseScreen_primaryButton;
                    LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                    if (largeActionButton != null) {
                        i = R$id.planBenefitsToLoseScreen_recyclerView;
                        if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                            i = R$id.planBenefitsToLoseScreen_secondaryButton;
                            LargeActionButton largeActionButton2 = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                            if (largeActionButton2 != null) {
                                return new e((ControllerContainerCoordinatorLayout) p0, animatedBackgroundView, navBarWithToolbar, largeActionButton, largeActionButton2);
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public PlanBenefitsToLoseScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: xkk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanBenefitsToLoseScreen f306846b;

            {
                this.f306846b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanBenefitsToLoseScreen planBenefitsToLoseScreen = this.f306846b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanBenefitsToLoseScreen.S;
                        PlanBenefitsToLoseScreen planBenefitsToLoseScreen2 = this.f306846b;
                        return dli.f.a(planBenefitsToLoseScreen2, planBenefitsToLoseScreen2.R2(), v.k(new RowLoadingDelegate(), new RowDelegate(null, null, 7), new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), planBenefitsToLoseScreen2.O, new SplitColumnCellLoadingDelegate(), planBenefitsToLoseScreen2.N), R$id.planBenefitsToLoseScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanBenefitsToLoseScreen.S;
                        qji.b bVarR1 = planBenefitsToLoseScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.di.PlanBenefitsToLoseScreenInjector");
                        n0 n0Var = (n0) bVarR1;
                        return new u(n0Var.f246155c, n0Var.d, planBenefitsToLoseScreen);
                    default:
                        KProperty[] kPropertyArr3 = PlanBenefitsToLoseScreen.S;
                        return (j) ((u) planBenefitsToLoseScreen.Q.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: xkk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanBenefitsToLoseScreen f306846b;

            {
                this.f306846b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanBenefitsToLoseScreen planBenefitsToLoseScreen = this.f306846b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanBenefitsToLoseScreen.S;
                        PlanBenefitsToLoseScreen planBenefitsToLoseScreen2 = this.f306846b;
                        return dli.f.a(planBenefitsToLoseScreen2, planBenefitsToLoseScreen2.R2(), v.k(new RowLoadingDelegate(), new RowDelegate(null, null, 7), new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), planBenefitsToLoseScreen2.O, new SplitColumnCellLoadingDelegate(), planBenefitsToLoseScreen2.N), R$id.planBenefitsToLoseScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanBenefitsToLoseScreen.S;
                        qji.b bVarR1 = planBenefitsToLoseScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.di.PlanBenefitsToLoseScreenInjector");
                        n0 n0Var = (n0) bVarR1;
                        return new u(n0Var.f246155c, n0Var.d, planBenefitsToLoseScreen);
                    default:
                        KProperty[] kPropertyArr3 = PlanBenefitsToLoseScreen.S;
                        return (j) ((u) planBenefitsToLoseScreen.Q.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: xkk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanBenefitsToLoseScreen f306846b;

            {
                this.f306846b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanBenefitsToLoseScreen planBenefitsToLoseScreen = this.f306846b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanBenefitsToLoseScreen.S;
                        PlanBenefitsToLoseScreen planBenefitsToLoseScreen2 = this.f306846b;
                        return dli.f.a(planBenefitsToLoseScreen2, planBenefitsToLoseScreen2.R2(), v.k(new RowLoadingDelegate(), new RowDelegate(null, null, 7), new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), planBenefitsToLoseScreen2.O, new SplitColumnCellLoadingDelegate(), planBenefitsToLoseScreen2.N), R$id.planBenefitsToLoseScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanBenefitsToLoseScreen.S;
                        qji.b bVarR1 = planBenefitsToLoseScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.di.PlanBenefitsToLoseScreenInjector");
                        n0 n0Var = (n0) bVarR1;
                        return new u(n0Var.f246155c, n0Var.d, planBenefitsToLoseScreen);
                    default:
                        KProperty[] kPropertyArr3 = PlanBenefitsToLoseScreen.S;
                        return (j) ((u) planBenefitsToLoseScreen.Q.getValue()).e.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        l lVar = uiState.f306855a;
        if (lVar != null) {
            ?? r06 = lVar.f306854b;
            ?? r62 = lVar.f306853a;
            NavBarWithToolbar navBarWithToolbar = d3().f215193c;
            navBarWithToolbar.setTitle(r62, null);
            navBarWithToolbar.setToolbarTitle(r62);
            navBarWithToolbar.setSecondDescriptionText(r06);
            navBarWithToolbar.setSecondDescriptionVisible(true);
        }
        k kVar = uiState.f306856b;
        LargeActionButton largeActionButton = d3().d;
        Clause clause = kVar.f306851a;
        Clause clause2 = kVar.f306852b;
        largeActionButton.setText(clause);
        largeActionButton.setVisibility(kVar.f306851a != null ? 0 : 8);
        LargeActionButton largeActionButton2 = d3().e;
        largeActionButton2.setText(clause2);
        largeActionButton2.setVisibility(clause2 == null ? 8 : 0);
        d3().f215192b.setBackgroundType(uiState.f306857c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (u) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f215193c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f215193c.f59410q), null, new b(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().d.o), new b(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().e.o), new b(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52371h.f121375b), null, new c(this, null), 3);
        SplitColumnCellDelegate splitColumnCellDelegate = this.O;
        ViewController.P2(this, rd0.e.b(splitColumnCellDelegate.d), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(splitColumnCellDelegate.e), new xkk.e(this, null), 3);
    }

    public final e d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (e) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
