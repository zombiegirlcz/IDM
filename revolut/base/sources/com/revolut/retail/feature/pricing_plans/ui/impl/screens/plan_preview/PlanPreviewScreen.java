package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_preview;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c1;
import au0.s0;
import au0.u0;
import aw0.i;
import aw0.s8;
import cli.o;
import cli.q;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$id;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$layout;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_preview.PlanPreviewScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_preview.PlanPreviewScreenContract$InputData;
import dli.a;
import ff4.z;
import fnk.c;
import fnk.d;
import fnk.k;
import igk.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qgk.i0;
import qgk.y0;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_preview/PlanPreviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ligk/b;", "Ldli/a;", "Lfnk/k;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanPreviewScreen extends ViewController<b> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PlanPreviewScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/pricing_plans/ui/impl/databinding/ScreenPlanPreviewBinding;", 0))};
    public final PlanPreviewScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public PlanPreviewScreen(PlanPreviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_plan_preview;
        this.M = s.t(this, c.f);
        final int i = 0;
        this.N = w.y0(new fnk.a(0));
        this.O = w.y0(new Function0(this) { // from class: fnk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanPreviewScreen f136695b;

            {
                this.f136695b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanPreviewScreen planPreviewScreen = this.f136695b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanPreviewScreen.R;
                        PlanPreviewScreen planPreviewScreen2 = this.f136695b;
                        return dli.f.a(planPreviewScreen2, planPreviewScreen2.R2(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), (FullScreenStateDelegate) planPreviewScreen2.N.getValue()), R$id.planPreviewScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanPreviewScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(planPreviewScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanPreviewScreenContract$InputData planPreviewScreenContract$InputData = planPreviewScreen.K;
                        planPreviewScreenContract$InputData.getClass();
                        return new y0(i0Var, planPreviewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanPreviewScreen.R;
                        return (i) ((y0) planPreviewScreen.P.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: fnk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanPreviewScreen f136695b;

            {
                this.f136695b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanPreviewScreen planPreviewScreen = this.f136695b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanPreviewScreen.R;
                        PlanPreviewScreen planPreviewScreen2 = this.f136695b;
                        return dli.f.a(planPreviewScreen2, planPreviewScreen2.R2(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), (FullScreenStateDelegate) planPreviewScreen2.N.getValue()), R$id.planPreviewScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanPreviewScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(planPreviewScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanPreviewScreenContract$InputData planPreviewScreenContract$InputData = planPreviewScreen.K;
                        planPreviewScreenContract$InputData.getClass();
                        return new y0(i0Var, planPreviewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanPreviewScreen.R;
                        return (i) ((y0) planPreviewScreen.P.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: fnk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanPreviewScreen f136695b;

            {
                this.f136695b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanPreviewScreen planPreviewScreen = this.f136695b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanPreviewScreen.R;
                        PlanPreviewScreen planPreviewScreen2 = this.f136695b;
                        return dli.f.a(planPreviewScreen2, planPreviewScreen2.R2(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), (FullScreenStateDelegate) planPreviewScreen2.N.getValue()), R$id.planPreviewScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanPreviewScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(planPreviewScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PlanPreviewScreenContract$InputData planPreviewScreenContract$InputData = planPreviewScreen.K;
                        planPreviewScreenContract$InputData.getClass();
                        return new y0(i0Var, planPreviewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanPreviewScreen.R;
                        return (i) ((y0) planPreviewScreen.P.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithBigTile navBarWithBigTile = d3().f215213c;
        navBarWithBigTile.setTitle(uiState.f136704a);
        navBarWithBigTile.setDescription(uiState.f136705b);
        i iVar = uiState.f136706c;
        ActionFooterView planPreviewScreenActionFooter = d3().f215212b;
        Intrinsics.checkNotNullExpressionValue(planPreviewScreenActionFooter, "planPreviewScreenActionFooter");
        w01.k.e(planPreviewScreenActionFooter, iVar != null);
        if (iVar != null) {
            d3().f215212b.setModel(iVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y0) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f215213c;
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        ColorImage.INSTANCE.getClass();
        ColorImage colorImageA = ColorImage.Companion.a();
        NavBarWithBigTile planPreviewScreenNavBarWithBigTile = d3().f215213c;
        Intrinsics.checkNotNullExpressionValue(planPreviewScreenNavBarWithBigTile, "planPreviewScreenNavBarWithBigTile");
        c1.S(planPreviewScreenNavBarWithBigTile, u.c(new u0(new NavBarWithContainerBackground.ImageBackground(colorImageA, (s8) null, (Color.SolidRes) null, 14), null, null, null)), null, null, 6);
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        ActionFooterView planPreviewScreenActionFooter = d3().f215212b;
        Intrinsics.checkNotNullExpressionValue(planPreviewScreenActionFooter, "planPreviewScreenActionFooter");
        w01.k.e(planPreviewScreenActionFooter, false);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f215213c.f59357t), null, new z(this, continuation, 19), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f215212b.f), null, new fnk.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f215212b.e), null, new fnk.e(this, continuation, 1), 3);
    }

    public final ngk.k d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ngk.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final fnk.i R2() {
        return (fnk.i) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
