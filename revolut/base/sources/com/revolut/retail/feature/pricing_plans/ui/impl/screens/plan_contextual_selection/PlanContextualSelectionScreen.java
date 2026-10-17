package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_contextual_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.AttributeWideDelegate;
import com.revolut.core.ui_kit.delegates.AttributeWideLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$id;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$layout;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_contextual_selection.PlanContextualSelectionScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_contextual_selection.PlanContextualSelectionScreenContract$InputData;
import com.revolut.tracking.v3.PremiumContextualPlanSelectionContext;
import dli.a;
import dli.c;
import hha.w0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import qgk.a0;
import qgk.b0;
import qgk.i0;
import te0.w;
import tx0.q1;
import tx0.u1;
import vc.s;
import vlk.j;
import vlk.l;
import vlk.p;
import xki.e;
import z92.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_contextual_selection/PlanContextualSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvlk/p;", "Ldli/a;", "Lvlk/q;", "Lno/k;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanContextualSelectionScreen extends ViewController<p> implements a, k {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(PlanContextualSelectionScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/pricing_plans/ui/impl/databinding/ScreenPlanContextualSelectionBinding;", 0))};
    public final PlanContextualSelectionScreenContract$InputData K;
    public AnalyticsContext L;
    public final int M;
    public final h N;
    public final FullScreenStateDelegate O;
    public final AttributeWideDelegate P;
    public final int Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public PlanContextualSelectionScreen(PlanContextualSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.M = R$style.UiKitTheme_TransparentCompat;
        this.N = s.t(this, vlk.h.f);
        this.O = new FullScreenStateDelegate();
        this.P = new AttributeWideDelegate();
        this.Q = R$layout.screen_plan_contextual_selection;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: vlk.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanContextualSelectionScreen f290486b;

            {
                this.f290486b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanContextualSelectionScreen planContextualSelectionScreen = this.f290486b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanContextualSelectionScreen.U;
                        PlanContextualSelectionScreen planContextualSelectionScreen2 = this.f290486b;
                        return dli.f.a(planContextualSelectionScreen2, planContextualSelectionScreen2.d(), zhm.v.k(planContextualSelectionScreen2.O, new AttributeWideLoadingDelegate(), planContextualSelectionScreen2.P), R$id.planContextualSelection_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanContextualSelectionScreen.U;
                        qji.b bVarU2 = planContextualSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_contextual_selection.di.PlanContextualSelectionScreenInjector");
                        a0 a0Var = (a0) ((thk.a) bVarU2);
                        i0 i0Var = a0Var.f245867c;
                        a0 a0Var2 = a0Var.d;
                        PlanContextualSelectionScreenContract$InputData planContextualSelectionScreenContract$InputData = planContextualSelectionScreen.K;
                        planContextualSelectionScreenContract$InputData.getClass();
                        return new b0(i0Var, a0Var2, planContextualSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanContextualSelectionScreen.U;
                        return (s) ((b0) planContextualSelectionScreen.S.getValue()).f245889c.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: vlk.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanContextualSelectionScreen f290486b;

            {
                this.f290486b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanContextualSelectionScreen planContextualSelectionScreen = this.f290486b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanContextualSelectionScreen.U;
                        PlanContextualSelectionScreen planContextualSelectionScreen2 = this.f290486b;
                        return dli.f.a(planContextualSelectionScreen2, planContextualSelectionScreen2.d(), zhm.v.k(planContextualSelectionScreen2.O, new AttributeWideLoadingDelegate(), planContextualSelectionScreen2.P), R$id.planContextualSelection_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanContextualSelectionScreen.U;
                        qji.b bVarU2 = planContextualSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_contextual_selection.di.PlanContextualSelectionScreenInjector");
                        a0 a0Var = (a0) ((thk.a) bVarU2);
                        i0 i0Var = a0Var.f245867c;
                        a0 a0Var2 = a0Var.d;
                        PlanContextualSelectionScreenContract$InputData planContextualSelectionScreenContract$InputData = planContextualSelectionScreen.K;
                        planContextualSelectionScreenContract$InputData.getClass();
                        return new b0(i0Var, a0Var2, planContextualSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanContextualSelectionScreen.U;
                        return (s) ((b0) planContextualSelectionScreen.S.getValue()).f245889c.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: vlk.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanContextualSelectionScreen f290486b;

            {
                this.f290486b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanContextualSelectionScreen planContextualSelectionScreen = this.f290486b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanContextualSelectionScreen.U;
                        PlanContextualSelectionScreen planContextualSelectionScreen2 = this.f290486b;
                        return dli.f.a(planContextualSelectionScreen2, planContextualSelectionScreen2.d(), zhm.v.k(planContextualSelectionScreen2.O, new AttributeWideLoadingDelegate(), planContextualSelectionScreen2.P), R$id.planContextualSelection_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanContextualSelectionScreen.U;
                        qji.b bVarU2 = planContextualSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_contextual_selection.di.PlanContextualSelectionScreenInjector");
                        a0 a0Var = (a0) ((thk.a) bVarU2);
                        i0 i0Var = a0Var.f245867c;
                        a0 a0Var2 = a0Var.d;
                        PlanContextualSelectionScreenContract$InputData planContextualSelectionScreenContract$InputData = planContextualSelectionScreen.K;
                        planContextualSelectionScreenContract$InputData.getClass();
                        return new b0(i0Var, a0Var2, planContextualSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanContextualSelectionScreen.U;
                        return (s) ((b0) planContextualSelectionScreen.S.getValue()).f245889c.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getL() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        vlk.q uiState = (vlk.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f215195b.setBackgroundType(uiState.e);
        NavBarLargeCentred navBarLargeCentred = d3().d;
        NavBarLargeCentred.Model model = uiState.f290493b;
        if (model != null) {
            navBarLargeCentred.B();
            NavBarLargeCentred.setLargeImage$default(navBarLargeCentred, uiState.f290494c, (q1) null, 2, (Object) null);
            navBarLargeCentred.setModel(NavBarLargeCentred.Model.a(model, null, null, null, null, null, new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, 991));
        } else {
            NavBarLargeCentred.Companion companion = NavBarLargeCentred.INSTANCE;
            navBarLargeCentred.H(u1.DEFAULT);
        }
        i iVar = uiState.d;
        ActionFooterView actionFooterView = d3().f215196c;
        actionFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            actionFooterView.setModel(iVar);
        }
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.L = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b0) this.S.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PlanContextualSelectionScreenContract$InputData inputData = ((b0) this.S.getValue()).f245887a;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        w0 w0Var = inputData.f103519c;
        String planName = w0Var != null ? w0Var.name() : null;
        if (planName == null) {
            planName = "";
        }
        Intrinsics.checkNotNullParameter(planName, "planName");
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        PremiumContextualPlanSelectionContext.a aVarNewBuilder = PremiumContextualPlanSelectionContext.newBuilder();
        String str = inputData.f103518b;
        aVarNewBuilder.c();
        ((PremiumContextualPlanSelectionContext) aVarNewBuilder.f49761b).setSource(str);
        aVarNewBuilder.c();
        ((PremiumContextualPlanSelectionContext) aVarNewBuilder.f49761b).setPlanName(planName);
        com.google.protobuf.w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        this.L = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
        d3().d.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        ScreenContentRecyclerView planContextualSelectionRecyclerView = d3().e;
        Intrinsics.checkNotNullExpressionValue(planContextualSelectionRecyclerView, "planContextualSelectionRecyclerView");
        ActionFooterView planContextualSelectionFooter = d3().f215196c;
        Intrinsics.checkNotNullExpressionValue(planContextualSelectionFooter, "planContextualSelectionFooter");
        f.b(planContextualSelectionFooter, planContextualSelectionRecyclerView);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().d.f59292m), new vlk.i(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new j(this, null), 3);
        AttributeWideDelegate attributeWideDelegate = this.P;
        ViewController.P2(this, kii.e.t(attributeWideDelegate.f51683c, "hide(...)"), new vlk.k(this, null), 3);
        ViewController.P2(this, kii.e.t(attributeWideDelegate.d, "hide(...)"), new l(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f215196c.f), new vlk.i(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f215196c.f58955g), new vlk.i(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().f215196c.e), new l(this, null, 1), 3);
    }

    public final ngk.f d3() {
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ngk.f) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final vlk.s d() {
        return (vlk.s) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
