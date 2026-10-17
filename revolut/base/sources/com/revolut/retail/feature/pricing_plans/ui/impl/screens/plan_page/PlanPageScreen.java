package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.u;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.AvatarGroupDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SeparatorDelegate;
import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.core.ui_kit.delegates.SplitColumnCellLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TabsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ToDoItemDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$id;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$layout;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.PlanPageScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.PlanPageScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.scroll.PlanPageScrollLayoutManager;
import enk.i;
import enk.j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import pd.b;
import qgk.i0;
import qgk.u0;
import qgk.v0;
import t60.g;
import te0.w;
import v0f.p;
import vc.s;
import vkm.j2;
import vkm.q;
import xki.e;
import xo8.a0;
import ymk.c;
import ymk.d;
import ymk.n;
import z92.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_page/PlanPageScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lymk/n;", "Ldli/a;", "Lymk/q;", "Lno/k;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanPageScreen extends ViewController<n> implements dli.a, k {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(PlanPageScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/pricing_plans/ui/impl/databinding/ScreenPlanPageBinding;", 0))};
    public final PlanPageScreenContract$InputData K;
    public final int L;
    public final int M;
    public AnalyticsContext N;
    public final SplitColumnCellDelegate O;
    public final LabelButtonDelegate P;
    public final ListingTileDelegate Q;
    public final Object R;
    public final h S;
    public final j2 T;
    public final Object U;
    public final Object V;
    public final Object W;

    public PlanPageScreen(PlanPageScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_plan_page;
        this.M = f.m(inputData.e);
        this.O = new SplitColumnCellDelegate();
        this.P = new LabelButtonDelegate();
        this.Q = new ListingTileDelegate();
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: ymk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanPageScreen f315025b;

            {
                this.f315025b = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanPageScreen planPageScreen = this.f315025b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanPageScreen.X;
                        PlanPageScreen planPageScreen2 = this.f315025b;
                        return dli.f.a(planPageScreen2, planPageScreen2.d(), zhm.v.k(new TabsLoadingDelegate(), new PlanTileLoadingDelegate(), new PlanTileDelegate(0), new ListingTileLoadingDelegate(), planPageScreen2.Q, new RowLoadingDelegate(), new RowDelegate(null, null, 7), new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), planPageScreen2.O, new SplitColumnCellLoadingDelegate(), new FullScreenStateDelegate(), new HighlightTileDelegate(), new CellDetailsStandaloneNoteDelegate(), new SeparatorDelegate(), new ToDoItemDelegate(), planPageScreen2.P, new AvatarGroupDelegate()), R$id.planPageScreen_recyclerView, new e(1, 0, PlanPageScreen.class, planPageScreen2, "provideLayoutManager", "provideLayoutManager(Landroid/content/Context;)Landroidx/recyclerview/widget/RecyclerView$LayoutManager;"), null, null, 48);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanPageScreen.X;
                        PlanPageScreen planPageScreen3 = this.f315025b;
                        qji.b bVarU2 = planPageScreen3.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.di.PlanPageScreenInjector");
                        v0 v0Var = (v0) bVarU2;
                        i0 i0Var = v0Var.f246286b;
                        v0 v0Var2 = v0Var.f246287c;
                        ScreenContentRecyclerView planPageScreenRecyclerView = planPageScreen3.d3().f215210c;
                        Intrinsics.checkNotNullExpressionValue(planPageScreenRecyclerView, "planPageScreenRecyclerView");
                        PlanPageScreenContract$InputData planPageScreenContract$InputData = planPageScreen3.K;
                        planPageScreenContract$InputData.getClass();
                        return new u0(i0Var, v0Var2, planPageScreen3, planPageScreenRecyclerView, planPageScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanPageScreen.X;
                        return (o) ((u0) planPageScreen.U.getValue()).f246271j.get();
                    default:
                        KProperty[] kPropertyArr4 = PlanPageScreen.X;
                        return (t60.b) ((u0) planPageScreen.U.getValue()).f.get();
                }
            }
        });
        this.S = s.t(this, d.f);
        this.T = q.c(Unit.f186387a);
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: ymk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanPageScreen f315025b;

            {
                this.f315025b = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanPageScreen planPageScreen = this.f315025b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanPageScreen.X;
                        PlanPageScreen planPageScreen2 = this.f315025b;
                        return dli.f.a(planPageScreen2, planPageScreen2.d(), zhm.v.k(new TabsLoadingDelegate(), new PlanTileLoadingDelegate(), new PlanTileDelegate(0), new ListingTileLoadingDelegate(), planPageScreen2.Q, new RowLoadingDelegate(), new RowDelegate(null, null, 7), new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), planPageScreen2.O, new SplitColumnCellLoadingDelegate(), new FullScreenStateDelegate(), new HighlightTileDelegate(), new CellDetailsStandaloneNoteDelegate(), new SeparatorDelegate(), new ToDoItemDelegate(), planPageScreen2.P, new AvatarGroupDelegate()), R$id.planPageScreen_recyclerView, new e(1, 0, PlanPageScreen.class, planPageScreen2, "provideLayoutManager", "provideLayoutManager(Landroid/content/Context;)Landroidx/recyclerview/widget/RecyclerView$LayoutManager;"), null, null, 48);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanPageScreen.X;
                        PlanPageScreen planPageScreen3 = this.f315025b;
                        qji.b bVarU2 = planPageScreen3.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.di.PlanPageScreenInjector");
                        v0 v0Var = (v0) bVarU2;
                        i0 i0Var = v0Var.f246286b;
                        v0 v0Var2 = v0Var.f246287c;
                        ScreenContentRecyclerView planPageScreenRecyclerView = planPageScreen3.d3().f215210c;
                        Intrinsics.checkNotNullExpressionValue(planPageScreenRecyclerView, "planPageScreenRecyclerView");
                        PlanPageScreenContract$InputData planPageScreenContract$InputData = planPageScreen3.K;
                        planPageScreenContract$InputData.getClass();
                        return new u0(i0Var, v0Var2, planPageScreen3, planPageScreenRecyclerView, planPageScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanPageScreen.X;
                        return (o) ((u0) planPageScreen.U.getValue()).f246271j.get();
                    default:
                        KProperty[] kPropertyArr4 = PlanPageScreen.X;
                        return (t60.b) ((u0) planPageScreen.U.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: ymk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanPageScreen f315025b;

            {
                this.f315025b = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanPageScreen planPageScreen = this.f315025b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanPageScreen.X;
                        PlanPageScreen planPageScreen2 = this.f315025b;
                        return dli.f.a(planPageScreen2, planPageScreen2.d(), zhm.v.k(new TabsLoadingDelegate(), new PlanTileLoadingDelegate(), new PlanTileDelegate(0), new ListingTileLoadingDelegate(), planPageScreen2.Q, new RowLoadingDelegate(), new RowDelegate(null, null, 7), new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), planPageScreen2.O, new SplitColumnCellLoadingDelegate(), new FullScreenStateDelegate(), new HighlightTileDelegate(), new CellDetailsStandaloneNoteDelegate(), new SeparatorDelegate(), new ToDoItemDelegate(), planPageScreen2.P, new AvatarGroupDelegate()), R$id.planPageScreen_recyclerView, new e(1, 0, PlanPageScreen.class, planPageScreen2, "provideLayoutManager", "provideLayoutManager(Landroid/content/Context;)Landroidx/recyclerview/widget/RecyclerView$LayoutManager;"), null, null, 48);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanPageScreen.X;
                        PlanPageScreen planPageScreen3 = this.f315025b;
                        qji.b bVarU2 = planPageScreen3.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.di.PlanPageScreenInjector");
                        v0 v0Var = (v0) bVarU2;
                        i0 i0Var = v0Var.f246286b;
                        v0 v0Var2 = v0Var.f246287c;
                        ScreenContentRecyclerView planPageScreenRecyclerView = planPageScreen3.d3().f215210c;
                        Intrinsics.checkNotNullExpressionValue(planPageScreenRecyclerView, "planPageScreenRecyclerView");
                        PlanPageScreenContract$InputData planPageScreenContract$InputData = planPageScreen3.K;
                        planPageScreenContract$InputData.getClass();
                        return new u0(i0Var, v0Var2, planPageScreen3, planPageScreenRecyclerView, planPageScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanPageScreen.X;
                        return (o) ((u0) planPageScreen.U.getValue()).f246271j.get();
                    default:
                        KProperty[] kPropertyArr4 = PlanPageScreen.X;
                        return (t60.b) ((u0) planPageScreen.U.getValue()).f.get();
                }
            }
        });
        final int i5 = 3;
        this.W = w.y0(new Function0(this) { // from class: ymk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanPageScreen f315025b;

            {
                this.f315025b = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PlanPageScreen planPageScreen = this.f315025b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanPageScreen.X;
                        PlanPageScreen planPageScreen2 = this.f315025b;
                        return dli.f.a(planPageScreen2, planPageScreen2.d(), zhm.v.k(new TabsLoadingDelegate(), new PlanTileLoadingDelegate(), new PlanTileDelegate(0), new ListingTileLoadingDelegate(), planPageScreen2.Q, new RowLoadingDelegate(), new RowDelegate(null, null, 7), new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), planPageScreen2.O, new SplitColumnCellLoadingDelegate(), new FullScreenStateDelegate(), new HighlightTileDelegate(), new CellDetailsStandaloneNoteDelegate(), new SeparatorDelegate(), new ToDoItemDelegate(), planPageScreen2.P, new AvatarGroupDelegate()), R$id.planPageScreen_recyclerView, new e(1, 0, PlanPageScreen.class, planPageScreen2, "provideLayoutManager", "provideLayoutManager(Landroid/content/Context;)Landroidx/recyclerview/widget/RecyclerView$LayoutManager;"), null, null, 48);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanPageScreen.X;
                        PlanPageScreen planPageScreen3 = this.f315025b;
                        qji.b bVarU2 = planPageScreen3.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.di.PlanPageScreenInjector");
                        v0 v0Var = (v0) bVarU2;
                        i0 i0Var = v0Var.f246286b;
                        v0 v0Var2 = v0Var.f246287c;
                        ScreenContentRecyclerView planPageScreenRecyclerView = planPageScreen3.d3().f215210c;
                        Intrinsics.checkNotNullExpressionValue(planPageScreenRecyclerView, "planPageScreenRecyclerView");
                        PlanPageScreenContract$InputData planPageScreenContract$InputData = planPageScreen3.K;
                        planPageScreenContract$InputData.getClass();
                        return new u0(i0Var, v0Var2, planPageScreen3, planPageScreenRecyclerView, planPageScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanPageScreen.X;
                        return (o) ((u0) planPageScreen.U.getValue()).f246271j.get();
                    default:
                        KProperty[] kPropertyArr4 = PlanPageScreen.X;
                        return (t60.b) ((u0) planPageScreen.U.getValue()).f.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        enk.k kVar;
        ymk.q uiState = (ymk.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        this.T.setValue(Unit.f186387a);
        b.p(D2(), new TextLocalisedClause(R$string.plan_page, null, null, 14));
        this.N = uiState.f315039b;
        ScreenContentRecyclerView screenContentRecyclerViewF3 = f3();
        screenContentRecyclerViewF3.setPadding(screenContentRecyclerViewF3.getPaddingLeft(), screenContentRecyclerViewF3.getPaddingTop(), screenContentRecyclerViewF3.getPaddingRight(), uiState.f315040c);
        if (this.K.f103606g) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = f3().getLayoutManager();
        Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        PlanPageScrollLayoutManager planPageScrollLayoutManager = linearLayoutManager instanceof PlanPageScrollLayoutManager ? (PlanPageScrollLayoutManager) linearLayoutManager : null;
        if (planPageScrollLayoutManager == null) {
            return;
        }
        int i = c.f315030a[uiState.d.ordinal()];
        if (i == 1) {
            kVar = i.f127839b;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            kVar = j.f127840b;
        }
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        planPageScrollLayoutManager.f103622a = kVar;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.N = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u0) this.U.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getN() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ControllerContainerCoordinatorLayout planPageScreenContainer = d3().f215209b;
        Intrinsics.checkNotNullExpressionValue(planPageScreenContainer, "planPageScreenContainer");
        if (!planPageScreenContainer.isLaidOut() || planPageScreenContainer.isLayoutRequested()) {
            planPageScreenContainer.addOnLayoutChangeListener(new u(this, 20));
        } else {
            ymk.o oVarD = d();
            int height = planPageScreenContainer.getHeight();
            a aVar = (a) oVarD;
            if (height > 0) {
                aVar.H2(aVar.f103614x, new wk4.k(height, 7));
            } else {
                aVar.getClass();
            }
        }
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = d3().f215208a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        View viewG = f.g(R$id.planPagerFlow_pager, controllerContainerCoordinatorLayout);
        if (viewG != null) {
            ymk.o oVarD2 = d();
            int height2 = viewG.getHeight();
            a aVar2 = (a) oVarD2;
            if (height2 > 0) {
                aVar2.H2(aVar2.f103614x, new wk4.k(height2, 7));
            } else {
                aVar2.getClass();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        a aVar = (a) d();
        enk.o oVar = aVar.f103610r;
        int i = 2;
        int i2 = 0;
        int i3 = 1;
        int i5 = 26;
        Continuation continuation = null;
        int i6 = 4;
        int i21 = 3;
        ViewController.P2(this, new p(new ymk.u(new t4j.c(q.J(new dfj.f(oVar.d, 14), oVar.f127847c), 7), aVar, i2), 26), new yl6.b(this, continuation, i6), 3);
        enk.o oVar2 = ((a) d()).f103610r;
        ViewController.P2(this, t1.d(new t38.e(new t4j.c(q.J(new dfj.f(oVar2.d, 14), oVar2.f127847c), 6), 24, this.T, new a0e.n(i21, 19, continuation)), 100L), new ymk.i(this, continuation, 5), 3);
        ?? r122 = this.W;
        ViewController.P2(this, q.q(new p(new a0(rd0.e.b(((g) ((t60.b) r122.getValue())).R()), i5), 25)), new rf9.h(this, continuation, i5), 3);
        ViewController.P2(this, rd0.e.b(((g) ((t60.b) r122.getValue())).R()), new ymk.i(this, continuation, i21), 3);
        if (!this.K.f103606g) {
            ViewController.P2(this, rd0.e.b(((g) ((t60.b) r122.getValue())).e), new ymk.i(this, continuation, i6), 3);
        }
        SplitColumnCellDelegate splitColumnCellDelegate = this.O;
        ViewController.P2(this, rd0.e.b(splitColumnCellDelegate.d), new ymk.f(this, null), 3);
        ViewController.P2(this, rd0.e.b(splitColumnCellDelegate.e), new ymk.g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.d.f121375b), new ymk.h(this, null), 3);
        ListingTileDelegate listingTileDelegate = this.Q;
        ViewController.P2(this, rd0.e.b(listingTileDelegate.f52751c), new ymk.i(this, continuation, i2), 3);
        ViewController.P2(this, rd0.e.b(listingTileDelegate.d), new ymk.i(this, continuation, i3), 3);
        ViewController.P2(this, rd0.e.b(listingTileDelegate.e), new ymk.i(this, continuation, i), 3);
    }

    public final ngk.j d3() {
        ViewBinding value = this.S.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ngk.j) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ymk.o d() {
        return (ymk.o) this.V.getValue();
    }

    public final ScreenContentRecyclerView f3() {
        ScreenContentRecyclerView planPageScreenRecyclerView = d3().f215210c;
        Intrinsics.checkNotNullExpressionValue(planPageScreenRecyclerView, "planPageScreenRecyclerView");
        return planPageScreenRecyclerView;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
