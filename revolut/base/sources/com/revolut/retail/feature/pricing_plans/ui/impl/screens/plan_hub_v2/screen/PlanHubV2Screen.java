package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen;

import aii.q;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b1;
import au0.n0;
import au0.s0;
import au0.z0;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarCenterViewModel;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.productintro.view.FullscreenProductIntroView;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$id;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$layout;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.BasePricingPlanBEDrivenViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.PlanHubV2Screen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.PlanHubV2ScreenContract$InputData;
import imk.i0;
import imk.j0;
import imk.p;
import imk.r;
import imk.t;
import imk.v;
import imk.x;
import imk.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.k2;
import mx0.o1;
import ojk.c0;
import qgk.m0;
import te0.w;
import tx0.l;
import tx0.t3;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_hub_v2/screen/PlanHubV2Screen;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/be_driven/BasePricingPlanBEDrivenViewController;", "Laii/q;", "Ldli/a;", "Limk/j0;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanHubV2Screen extends BasePricingPlanBEDrivenViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] m0 = {o0.f186429a.j(new h0(PlanHubV2Screen.class, "binding", "getBinding()Lcom/revolut/retail/feature/pricing_plans/ui/impl/databinding/ScreenPlanHubV2Binding;", 0))};
    public final PlanHubV2ScreenContract$InputData c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f103554d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final int f103555e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final h f103556h0;
    public final imk.d i0;
    public AnimationRequest j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f103557k0;
    public final Object l0;

    public PlanHubV2Screen(PlanHubV2ScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.c0 = inputData;
        this.f103554d0 = R$layout.screen_plan_hub_v2;
        this.f103555e0 = z92.f.m(inputData.f103558a);
        final int i = 0;
        this.f0 = w.y0(new Function0(this) { // from class: imk.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanHubV2Screen f162535b;

            {
                this.f162535b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanHubV2Screen planHubV2Screen = this.f162535b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanHubV2Screen.m0;
                        return (fd6.a) ((qgk.m0) planHubV2Screen.f103557k0.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PlanHubV2Screen.m0;
                        PlanHubV2Screen planHubV2Screen2 = this.f162535b;
                        return dli.f.a(planHubV2Screen2, planHubV2Screen2.d(), zhm.d0.E0(((fd6.a) planHubV2Screen2.f0.getValue()).e, planHubV2Screen2.f103366b0), R$id.planHubV2Screen_recyclerView, null, new koi.h(null, true, true, 1), null, 40);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanHubV2Screen.m0;
                        PlanHubV2Screen planHubV2Screen3 = this.f162535b;
                        qji.b bVarU2 = planHubV2Screen3.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.di.PlanHubV2ScreenInjector");
                        qgk.l0 l0Var = (qgk.l0) bVarU2;
                        qgk.i0 i0Var = l0Var.f246099b;
                        qgk.l0 l0Var2 = l0Var.f246100c;
                        PlanHubV2ScreenContract$InputData planHubV2ScreenContract$InputData = planHubV2Screen3.c0;
                        planHubV2ScreenContract$InputData.getClass();
                        return new qgk.m0(i0Var, l0Var2, planHubV2Screen3, planHubV2Screen3, planHubV2ScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = PlanHubV2Screen.m0;
                        return (i0) ((qgk.m0) planHubV2Screen.f103557k0.getValue()).f246134n.get();
                }
            }
        });
        final int i2 = 1;
        this.g0 = w.y0(new Function0(this) { // from class: imk.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanHubV2Screen f162535b;

            {
                this.f162535b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanHubV2Screen planHubV2Screen = this.f162535b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanHubV2Screen.m0;
                        return (fd6.a) ((qgk.m0) planHubV2Screen.f103557k0.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PlanHubV2Screen.m0;
                        PlanHubV2Screen planHubV2Screen2 = this.f162535b;
                        return dli.f.a(planHubV2Screen2, planHubV2Screen2.d(), zhm.d0.E0(((fd6.a) planHubV2Screen2.f0.getValue()).e, planHubV2Screen2.f103366b0), R$id.planHubV2Screen_recyclerView, null, new koi.h(null, true, true, 1), null, 40);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanHubV2Screen.m0;
                        PlanHubV2Screen planHubV2Screen3 = this.f162535b;
                        qji.b bVarU2 = planHubV2Screen3.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.di.PlanHubV2ScreenInjector");
                        qgk.l0 l0Var = (qgk.l0) bVarU2;
                        qgk.i0 i0Var = l0Var.f246099b;
                        qgk.l0 l0Var2 = l0Var.f246100c;
                        PlanHubV2ScreenContract$InputData planHubV2ScreenContract$InputData = planHubV2Screen3.c0;
                        planHubV2ScreenContract$InputData.getClass();
                        return new qgk.m0(i0Var, l0Var2, planHubV2Screen3, planHubV2Screen3, planHubV2ScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = PlanHubV2Screen.m0;
                        return (i0) ((qgk.m0) planHubV2Screen.f103557k0.getValue()).f246134n.get();
                }
            }
        });
        this.f103556h0 = s.t(this, imk.q.f);
        this.i0 = new imk.d();
        final int i3 = 2;
        this.f103557k0 = w.y0(new Function0(this) { // from class: imk.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanHubV2Screen f162535b;

            {
                this.f162535b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanHubV2Screen planHubV2Screen = this.f162535b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanHubV2Screen.m0;
                        return (fd6.a) ((qgk.m0) planHubV2Screen.f103557k0.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PlanHubV2Screen.m0;
                        PlanHubV2Screen planHubV2Screen2 = this.f162535b;
                        return dli.f.a(planHubV2Screen2, planHubV2Screen2.d(), zhm.d0.E0(((fd6.a) planHubV2Screen2.f0.getValue()).e, planHubV2Screen2.f103366b0), R$id.planHubV2Screen_recyclerView, null, new koi.h(null, true, true, 1), null, 40);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanHubV2Screen.m0;
                        PlanHubV2Screen planHubV2Screen3 = this.f162535b;
                        qji.b bVarU2 = planHubV2Screen3.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.di.PlanHubV2ScreenInjector");
                        qgk.l0 l0Var = (qgk.l0) bVarU2;
                        qgk.i0 i0Var = l0Var.f246099b;
                        qgk.l0 l0Var2 = l0Var.f246100c;
                        PlanHubV2ScreenContract$InputData planHubV2ScreenContract$InputData = planHubV2Screen3.c0;
                        planHubV2ScreenContract$InputData.getClass();
                        return new qgk.m0(i0Var, l0Var2, planHubV2Screen3, planHubV2Screen3, planHubV2ScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = PlanHubV2Screen.m0;
                        return (i0) ((qgk.m0) planHubV2Screen.f103557k0.getValue()).f246134n.get();
                }
            }
        });
        final int i5 = 3;
        this.l0 = w.y0(new Function0(this) { // from class: imk.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanHubV2Screen f162535b;

            {
                this.f162535b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PlanHubV2Screen planHubV2Screen = this.f162535b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanHubV2Screen.m0;
                        return (fd6.a) ((qgk.m0) planHubV2Screen.f103557k0.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PlanHubV2Screen.m0;
                        PlanHubV2Screen planHubV2Screen2 = this.f162535b;
                        return dli.f.a(planHubV2Screen2, planHubV2Screen2.d(), zhm.d0.E0(((fd6.a) planHubV2Screen2.f0.getValue()).e, planHubV2Screen2.f103366b0), R$id.planHubV2Screen_recyclerView, null, new koi.h(null, true, true, 1), null, 40);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanHubV2Screen.m0;
                        PlanHubV2Screen planHubV2Screen3 = this.f162535b;
                        qji.b bVarU2 = planHubV2Screen3.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.di.PlanHubV2ScreenInjector");
                        qgk.l0 l0Var = (qgk.l0) bVarU2;
                        qgk.i0 i0Var = l0Var.f246099b;
                        qgk.l0 l0Var2 = l0Var.f246100c;
                        PlanHubV2ScreenContract$InputData planHubV2ScreenContract$InputData = planHubV2Screen3.c0;
                        planHubV2ScreenContract$InputData.getClass();
                        return new qgk.m0(i0Var, l0Var2, planHubV2Screen3, planHubV2Screen3, planHubV2ScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = PlanHubV2Screen.m0;
                        return (i0) ((qgk.m0) planHubV2Screen.f103557k0.getValue()).f246134n.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getM() {
        return Integer.valueOf(this.f103555e0);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) throws Throwable {
        tx0.h hVar;
        j0 uiState = (j0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        y yVar = uiState.f162520b;
        com.revolut.retail.feature.pricing_plans.ui.api.models.c cVarA = yVar != null ? yVar.a() : null;
        int i = cVarA == null ? -1 : p.f162539a[cVarA.ordinal()];
        if (i == -1) {
            NavBarWithToolbar navBarWithToolbar = e3().f215203g;
            g3(navBarWithToolbar);
            navBarWithToolbar.l0();
        } else if (i == 1) {
            au0.o planHubV2ScreenNavBarWithContainer = e3().f;
            Intrinsics.checkNotNullExpressionValue(planHubV2ScreenNavBarWithContainer, "planHubV2ScreenNavBarWithContainer");
            g3(planHubV2ScreenNavBarWithContainer);
            if (yVar instanceof x) {
                AccountSelectionNavBarContentView planHubV2ScreenNavBarAccountContent = e3().d;
                Intrinsics.checkNotNullExpressionValue(planHubV2ScreenNavBarAccountContent, "planHubV2ScreenNavBarAccountContent");
                AccountSelectionNavBarContentView.setModel$default(planHubV2ScreenNavBarAccountContent, new l(null, 7), null, 2, null);
            } else {
                if (!(yVar instanceof imk.w)) {
                    throw new NoWhenBranchMatchedException();
                }
                NavBarWithContainer navBarWithContainer = e3().f;
                imk.w wVar = (imk.w) yVar;
                Set set = wVar.f162556j;
                navBarWithContainer.setMenuItems(wVar.f162555h);
                AccountSelectionNavBarContentView planHubV2ScreenNavBarAccountContent2 = e3().d;
                Intrinsics.checkNotNullExpressionValue(planHubV2ScreenNavBarAccountContent2, "planHubV2ScreenNavBarAccountContent");
                NavBarCenterViewModel.MainText.Static r112 = new NavBarCenterViewModel.MainText.Static(wVar.f162552b, NavBarCenterViewModel.MainTextStyle.Default.f57862a);
                Clause clause = wVar.d;
                NavBarCenterViewModel.Subtitle.Secondary secondary = clause != null ? new NavBarCenterViewModel.Subtitle.Secondary(clause) : null;
                boolean z = wVar.e;
                v vVar = wVar.f;
                NavBarCenterViewModel navBarCenterViewModel = new NavBarCenterViewModel((NavBarCenterViewModel.MainText) r112, (Clause) null, (NavBarCenterViewModel.Subtitle) secondary, vVar != null ? new NavBarCenterViewModel.Button(vVar.f162548a, vVar.f162549b, vVar.f162550c, null, vVar.d, 8) : null, false, false, z, false, (Image) null, (NavBarCenterViewModel.MainTextEndIcon) null, (AnalyticsContext) null, 3954);
                ArrayList arrayList = wVar.i;
                if (set.isEmpty()) {
                    hVar = null;
                } else {
                    AnimationRequest animationRequest = this.j0;
                    if (animationRequest == null) {
                        Intrinsics.r("animationRequest");
                        throw null;
                    }
                    hVar = new tx0.h(animationRequest, set);
                }
                AccountSelectionNavBarContentView.setModel$default(planHubV2ScreenNavBarAccountContent2, new tx0.g(navBarCenterViewModel, arrayList, NavBarWithContainerBackground.TransparentBackground.f57882a, null, hVar, 3057), null, 2, null);
            }
        } else if (i == 2) {
            au0.o planHubV2ScreenNavBarWithToolbar = e3().f215203g;
            Intrinsics.checkNotNullExpressionValue(planHubV2ScreenNavBarWithToolbar, "planHubV2ScreenNavBarWithToolbar");
            g3(planHubV2ScreenNavBarWithToolbar);
            if (yVar instanceof x) {
                NavBarWithToolbar planHubV2ScreenNavBarWithToolbar2 = e3().f215203g;
                Intrinsics.checkNotNullExpressionValue(planHubV2ScreenNavBarWithToolbar2, "planHubV2ScreenNavBarWithToolbar");
                t3 t3Var = t3.DEFAULT;
                NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
                planHubV2ScreenNavBarWithToolbar2.I0(t3Var, false);
            } else {
                if (!(yVar instanceof imk.w)) {
                    throw new NoWhenBranchMatchedException();
                }
                NavBarWithToolbar navBarWithToolbar2 = e3().f215203g;
                navBarWithToolbar2.l0();
                imk.w wVar2 = (imk.w) yVar;
                navBarWithToolbar2.setTitle(wVar2.f162552b, null);
                navBarWithToolbar2.setToolbarTitle(wVar2.f162553c);
                navBarWithToolbar2.setFilters(wVar2.i);
                navBarWithToolbar2.setMenuItems(wVar2.f162555h);
            }
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            au0.o planHubV2ScreenNavBarWithBigTile = e3().e;
            Intrinsics.checkNotNullExpressionValue(planHubV2ScreenNavBarWithBigTile, "planHubV2ScreenNavBarWithBigTile");
            g3(planHubV2ScreenNavBarWithBigTile);
            if (yVar instanceof x) {
                e3().e.setLoadingState(true);
            } else if (yVar instanceof imk.w) {
                NavBarWithBigTile navBarWithBigTile = e3().e;
                navBarWithBigTile.setLoadingState(false);
                imk.w wVar3 = (imk.w) yVar;
                navBarWithBigTile.setTitle(new z0(wVar3.f162552b, false));
                navBarWithBigTile.setToolbarTitle(wVar3.f162553c);
                v vVar2 = wVar3.f;
                navBarWithBigTile.setDescription(vVar2 != null ? new n0(vVar2.f162548a, vVar2.f162550c) : null);
                navBarWithBigTile.setMenuItems(wVar3.f162555h);
                navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
            } else {
                if (yVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                e3().e.setLoadingState(false);
            }
        }
        if (yVar instanceof imk.w) {
            AnimatedBackgroundView planHubV2ScreenBackground = e3().f215201b;
            Intrinsics.checkNotNullExpressionValue(planHubV2ScreenBackground, "planHubV2ScreenBackground");
            AnimatedBackgroundType animatedBackgroundType = ((imk.w) yVar).f162554g;
            planHubV2ScreenBackground.setVisibility(animatedBackgroundType != null ? 0 : 8);
            e3().f215201b.setBackgroundType(animatedBackgroundType);
        } else {
            if (!(yVar instanceof x) && yVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            AnimatedBackgroundView planHubV2ScreenBackground2 = e3().f215201b;
            Intrinsics.checkNotNullExpressionValue(planHubV2ScreenBackground2, "planHubV2ScreenBackground");
            planHubV2ScreenBackground2.setVisibility(8);
        }
        k2 k2Var = uiState.f162521c;
        if (k2Var != null) {
            e3().f215202c.setModel(k2Var);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (m0) this.f103557k0.getValue();
    }

    @Override // com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.BasePricingPlanBEDrivenViewController, com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.Y2(view);
        this.j0 = new AnimationRequest(false);
        pd.b.p(view, new TextLocalisedClause(R$string.plan_hub_title, null, null, 14));
        e3().f215202c.setAllowReuseAfterClose(true);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        NavBarWithBigTile navBarWithBigTile = e3().e;
        navBarWithBigTile.setNavigationButtonIcon(resourceImage);
        navBarWithBigTile.setTitleStyle(b1.LARGE);
        navBarWithBigTile.setLayoutType(s0.CENTERED);
        NavBarWithContainer navBarWithContainer = e3().f;
        navBarWithContainer.setNavigationButtonImage(resourceImage);
        navBarWithContainer.M();
        e3().f215203g.setNavigationButtonImage(resourceImage);
        ControllerContainerCoordinatorLayout root = e3().i;
        Intrinsics.checkNotNullExpressionValue(root, "planHubV2ScreenRoot");
        au0.o[] elements = {e3().f, e3().f215203g, e3().e};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List navBars = kotlin.collections.d.L(elements);
        imk.d dVar = this.i0;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(navBars, "navBars");
        dVar.f162504a = navBars;
        dVar.a(root);
    }

    @Override // com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.BasePricingPlanBEDrivenViewController, com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.b3(view);
        FullscreenProductIntroView fullscreenProductIntroView = e3().f215202c;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(fullscreenProductIntroView.f209817n.f56313y, new o1(fullscreenProductIntroView, 0))), null, new r(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().e.f59357t), null, new r(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().e.f59360y.f57277p), null, new r(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().e.b()), null, new imk.s(this, null, 0), 3);
        NavBarWithToolbar navBarWithToolbar = e3().f215203g;
        NavBarWithContainer navBarWithContainer = e3().f;
        AccountSelectionNavBarContentView accountSelectionNavBarContentView = e3().d;
        efm.r rVarMergeWith = navBarWithContainer.K().mergeWith(navBarWithToolbar.f59410q);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMergeWith), null, new r(this, continuation, 3), 3);
        efm.r rVarMergeWith2 = navBarWithContainer.b().mergeWith(navBarWithToolbar.o.f57403b);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith2, "mergeWith(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMergeWith2), null, new imk.s(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(accountSelectionNavBarContentView.f59169h), null, new r(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(accountSelectionNavBarContentView.f59170j), null, new r(this, continuation, 5), 3);
        efm.r rVarMergeWith3 = accountSelectionNavBarContentView.o.mergeWith(navBarWithToolbar.s0());
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith3, "mergeWith(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMergeWith3), null, new t(this, null), 3);
        ViewController.P2(this, rd0.e.b(e3().f215202c.v), new r(this, continuation, 6), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(e3().f215202c.h0(), new im3.e(3))), null, new r(this, continuation, 7), 3);
    }

    @Override // com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.BasePricingPlanBEDrivenViewController
    public final c0 d3() {
        return d();
    }

    public final ngk.h e3() {
        ViewBinding value = this.f103556h0.getValue(this, m0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ngk.h) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final i0 d() {
        return (i0) this.l0.getValue();
    }

    public final void g3(au0.o navBar) {
        ControllerContainerCoordinatorLayout root = e3().i;
        Intrinsics.checkNotNullExpressionValue(root, "planHubV2ScreenRoot");
        ScreenContentRecyclerView insertionAnchor = e3().f215204h;
        Intrinsics.checkNotNullExpressionValue(insertionAnchor, "planHubV2ScreenRecyclerView");
        imk.d dVar = this.i0;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(insertionAnchor, "insertionAnchor");
        boolean z = true;
        boolean z3 = root.indexOfChild(navBar) != -1;
        List list = dVar.f162504a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!Intrinsics.f((View) obj2, navBar)) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            z = false;
        } else {
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                if (root.indexOfChild((View) it8.next()) != -1) {
                    break;
                }
            }
            z = false;
        }
        if (!z3 || z) {
            dVar.a(root);
            int iIndexOfChild = root.indexOfChild(insertionAnchor);
            if (iIndexOfChild < 0) {
                throw new IllegalStateException("Nav bar insertion anchor is not attached to the root");
            }
            root.addView(navBar, iIndexOfChild);
            ViewCompat.requestApplyInsets(navBar);
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF103554d0() {
        return this.f103554d0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.BasePricingPlanBEDrivenViewController
    public final RecyclerView h() {
        return ((dli.c) this.g0.getValue()).h();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.g0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mkd.g
    public final koi.c v0() {
        return ((dli.c) this.g0.getValue()).w().f;
    }
}
