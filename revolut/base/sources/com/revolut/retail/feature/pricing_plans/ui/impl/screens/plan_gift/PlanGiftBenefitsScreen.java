package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_gift;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.e;
import aw0.n6;
import c8g.c;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$id;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$layout;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_gift.PlanGiftBenefitsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_gift.PlanGiftBenefitsScreenContract$InputData;
import dli.a;
import dmj.k;
import emk.b;
import emk.d;
import emk.g;
import igk.m;
import kji.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ox0.b0;
import qgk.i0;
import qgk.j0;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_gift/PlanGiftBenefitsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ligk/m;", "Ldli/a;", "Lemk/h;", "Lkji/f;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanGiftBenefitsScreen extends ViewController<m> implements a, f {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(PlanGiftBenefitsScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/pricing_plans/ui/impl/databinding/ScreenPlanGiftBenefitsBinding;", 0))};
    public final PlanGiftBenefitsScreenContract$InputData K;
    public final int L;
    public final int M;
    public final LargeActionButtonDelegate N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public PlanGiftBenefitsScreen(PlanGiftBenefitsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_plan_gift_benefits;
        this.M = R$style.UiKitTheme_Mono;
        this.N = new LargeActionButtonDelegate();
        this.O = s.t(this, b.f);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: emk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanGiftBenefitsScreen f127676b;

            {
                this.f127676b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanGiftBenefitsScreen planGiftBenefitsScreen = this.f127676b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanGiftBenefitsScreen.T;
                        PlanGiftBenefitsScreen planGiftBenefitsScreen2 = this.f127676b;
                        return dli.f.a(planGiftBenefitsScreen2, (g) planGiftBenefitsScreen2.R.getValue(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), new ListSubheaderDelegate(), new SplitColumnCellDelegate(), new FullScreenStateDelegate(), new ListSubheaderLoadingDelegate()), R$id.planGiftBenefitsScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanGiftBenefitsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(planGiftBenefitsScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanGiftBenefitsScreenContract$InputData planGiftBenefitsScreenContract$InputData = planGiftBenefitsScreen.K;
                        planGiftBenefitsScreenContract$InputData.getClass();
                        return new j0(i0Var, new kik.c(), planGiftBenefitsScreen, planGiftBenefitsScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanGiftBenefitsScreen.T;
                        return (g) ((j0) planGiftBenefitsScreen.Q.getValue()).f246067j.get();
                    default:
                        KProperty[] kPropertyArr4 = PlanGiftBenefitsScreen.T;
                        return (j60.a) ((j0) planGiftBenefitsScreen.Q.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: emk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanGiftBenefitsScreen f127676b;

            {
                this.f127676b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanGiftBenefitsScreen planGiftBenefitsScreen = this.f127676b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanGiftBenefitsScreen.T;
                        PlanGiftBenefitsScreen planGiftBenefitsScreen2 = this.f127676b;
                        return dli.f.a(planGiftBenefitsScreen2, (g) planGiftBenefitsScreen2.R.getValue(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), new ListSubheaderDelegate(), new SplitColumnCellDelegate(), new FullScreenStateDelegate(), new ListSubheaderLoadingDelegate()), R$id.planGiftBenefitsScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanGiftBenefitsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(planGiftBenefitsScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanGiftBenefitsScreenContract$InputData planGiftBenefitsScreenContract$InputData = planGiftBenefitsScreen.K;
                        planGiftBenefitsScreenContract$InputData.getClass();
                        return new j0(i0Var, new kik.c(), planGiftBenefitsScreen, planGiftBenefitsScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanGiftBenefitsScreen.T;
                        return (g) ((j0) planGiftBenefitsScreen.Q.getValue()).f246067j.get();
                    default:
                        KProperty[] kPropertyArr4 = PlanGiftBenefitsScreen.T;
                        return (j60.a) ((j0) planGiftBenefitsScreen.Q.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: emk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanGiftBenefitsScreen f127676b;

            {
                this.f127676b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanGiftBenefitsScreen planGiftBenefitsScreen = this.f127676b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanGiftBenefitsScreen.T;
                        PlanGiftBenefitsScreen planGiftBenefitsScreen2 = this.f127676b;
                        return dli.f.a(planGiftBenefitsScreen2, (g) planGiftBenefitsScreen2.R.getValue(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), new ListSubheaderDelegate(), new SplitColumnCellDelegate(), new FullScreenStateDelegate(), new ListSubheaderLoadingDelegate()), R$id.planGiftBenefitsScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanGiftBenefitsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(planGiftBenefitsScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanGiftBenefitsScreenContract$InputData planGiftBenefitsScreenContract$InputData = planGiftBenefitsScreen.K;
                        planGiftBenefitsScreenContract$InputData.getClass();
                        return new j0(i0Var, new kik.c(), planGiftBenefitsScreen, planGiftBenefitsScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanGiftBenefitsScreen.T;
                        return (g) ((j0) planGiftBenefitsScreen.Q.getValue()).f246067j.get();
                    default:
                        KProperty[] kPropertyArr4 = PlanGiftBenefitsScreen.T;
                        return (j60.a) ((j0) planGiftBenefitsScreen.Q.getValue()).e.get();
                }
            }
        });
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: emk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanGiftBenefitsScreen f127676b;

            {
                this.f127676b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PlanGiftBenefitsScreen planGiftBenefitsScreen = this.f127676b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanGiftBenefitsScreen.T;
                        PlanGiftBenefitsScreen planGiftBenefitsScreen2 = this.f127676b;
                        return dli.f.a(planGiftBenefitsScreen2, (g) planGiftBenefitsScreen2.R.getValue(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), new ListSubheaderDelegate(), new SplitColumnCellDelegate(), new FullScreenStateDelegate(), new ListSubheaderLoadingDelegate()), R$id.planGiftBenefitsScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanGiftBenefitsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(planGiftBenefitsScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanGiftBenefitsScreenContract$InputData planGiftBenefitsScreenContract$InputData = planGiftBenefitsScreen.K;
                        planGiftBenefitsScreenContract$InputData.getClass();
                        return new j0(i0Var, new kik.c(), planGiftBenefitsScreen, planGiftBenefitsScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanGiftBenefitsScreen.T;
                        return (g) ((j0) planGiftBenefitsScreen.Q.getValue()).f246067j.get();
                    default:
                        KProperty[] kPropertyArr4 = PlanGiftBenefitsScreen.T;
                        return (j60.a) ((j0) planGiftBenefitsScreen.Q.getValue()).e.get();
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
    public final void B(o oVar, q qVar) {
        emk.h uiState = (emk.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ActionFooterView actionFooterView = d3().f215198b;
        Clause clause = uiState.f127681b;
        Clause clause2 = uiState.f127682c;
        actionFooterView.setModel(new e(true, uiState.d, b0.BELOW_BUTTONS, new n6(c.p(clause), LargeActionButton.ButtonStyle.e, null, null, clause != null, null, null, 988), null, null, 48));
        NavBarWithToolbar navBarWithToolbar = d3().d;
        navBarWithToolbar.setTitle(clause2, null);
        if (clause2 != null) {
            navBarWithToolbar.setToolbarTitle(clause2);
        }
        d3().f215199c.setBackgroundType(uiState.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j0) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().d;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.j0(false);
        d3().f215199c.setBackgroundType(AnimatedBackgroundType.DEFAULT.f51471a);
        ((j60.a) this.S.getValue()).d(v.k(this.N, new CellDetailsDelegate()));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f59410q), null, new d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f215198b.f), new d(this, continuation, 1), 3);
        ViewController.P2(this, new k(rd0.e.b(this.N.d.f121375b), 26), new emk.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f215198b.e), new ea4.d(this, continuation, 27), 3);
    }

    public final ngk.g d3() {
        ViewBinding value = this.O.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ngk.g) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
