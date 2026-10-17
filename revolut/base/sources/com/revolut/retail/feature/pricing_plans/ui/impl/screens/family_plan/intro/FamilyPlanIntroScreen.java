package com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plan.intro;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c1;
import au0.q0;
import au0.r0;
import au0.s0;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$id;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$layout;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plan.intro.FamilyPlanIntroScreen;
import dli.a;
import gkk.b;
import gkk.c;
import gkk.e;
import gkk.f;
import gkk.g;
import gkk.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qgk.i0;
import qgk.k;
import te0.w;
import tx0.p2;
import vc.s;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plan/intro/FamilyPlanIntroScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgkk/f;", "Ldli/a;", "Lgkk/i;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FamilyPlanIntroScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(FamilyPlanIntroScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/pricing_plans/ui/impl/databinding/ScreenFamilyPlanIntroBinding;", 0))};
    public final e K;
    public final int L;
    public final TextDelegate M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;

    public FamilyPlanIntroScreen(e inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_family_plan_intro;
        this.M = new TextDelegate();
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: gkk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FamilyPlanIntroScreen f144411b;

            {
                this.f144411b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FamilyPlanIntroScreen familyPlanIntroScreen = this.f144411b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FamilyPlanIntroScreen.R;
                        FamilyPlanIntroScreen familyPlanIntroScreen2 = this.f144411b;
                        return dli.f.a(familyPlanIntroScreen2, (g) familyPlanIntroScreen2.Q.getValue(), v.k(new CounterTextDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), new FullScreenStateDelegate(), familyPlanIntroScreen2.M), R$id.familyPlanIntro_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = FamilyPlanIntroScreen.R;
                        qji.b bVarU2 = familyPlanIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plan.intro.di.FamilyPlanIntroScreenInjector");
                        qgk.j jVar = (qgk.j) ((ygk.a) bVarU2);
                        i0 i0Var = jVar.d;
                        qgk.j jVar2 = jVar.e;
                        e eVar = familyPlanIntroScreen.K;
                        eVar.getClass();
                        return new qgk.k(i0Var, jVar2, eVar);
                    default:
                        KProperty[] kPropertyArr3 = FamilyPlanIntroScreen.R;
                        return (g) ((qgk.k) familyPlanIntroScreen.O.getValue()).f246075c.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: gkk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FamilyPlanIntroScreen f144411b;

            {
                this.f144411b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FamilyPlanIntroScreen familyPlanIntroScreen = this.f144411b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FamilyPlanIntroScreen.R;
                        FamilyPlanIntroScreen familyPlanIntroScreen2 = this.f144411b;
                        return dli.f.a(familyPlanIntroScreen2, (g) familyPlanIntroScreen2.Q.getValue(), v.k(new CounterTextDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), new FullScreenStateDelegate(), familyPlanIntroScreen2.M), R$id.familyPlanIntro_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = FamilyPlanIntroScreen.R;
                        qji.b bVarU2 = familyPlanIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plan.intro.di.FamilyPlanIntroScreenInjector");
                        qgk.j jVar = (qgk.j) ((ygk.a) bVarU2);
                        i0 i0Var = jVar.d;
                        qgk.j jVar2 = jVar.e;
                        e eVar = familyPlanIntroScreen.K;
                        eVar.getClass();
                        return new qgk.k(i0Var, jVar2, eVar);
                    default:
                        KProperty[] kPropertyArr3 = FamilyPlanIntroScreen.R;
                        return (g) ((qgk.k) familyPlanIntroScreen.O.getValue()).f246075c.get();
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: gkk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FamilyPlanIntroScreen f144411b;

            {
                this.f144411b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FamilyPlanIntroScreen familyPlanIntroScreen = this.f144411b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FamilyPlanIntroScreen.R;
                        FamilyPlanIntroScreen familyPlanIntroScreen2 = this.f144411b;
                        return dli.f.a(familyPlanIntroScreen2, (g) familyPlanIntroScreen2.Q.getValue(), v.k(new CounterTextDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), new FullScreenStateDelegate(), familyPlanIntroScreen2.M), R$id.familyPlanIntro_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = FamilyPlanIntroScreen.R;
                        qji.b bVarU2 = familyPlanIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plan.intro.di.FamilyPlanIntroScreenInjector");
                        qgk.j jVar = (qgk.j) ((ygk.a) bVarU2);
                        i0 i0Var = jVar.d;
                        qgk.j jVar2 = jVar.e;
                        e eVar = familyPlanIntroScreen.K;
                        eVar.getClass();
                        return new qgk.k(i0Var, jVar2, eVar);
                    default:
                        KProperty[] kPropertyArr3 = FamilyPlanIntroScreen.R;
                        return (g) ((qgk.k) familyPlanIntroScreen.O.getValue()).f246075c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        gkk.h hVar = uiState.f144420b;
        Clause clause = uiState.d;
        if (hVar != null) {
            NavBarWithBigTile navBarWithBigTile = d3().e;
            navBarWithBigTile.setTitle(hVar.f144416a);
            navBarWithBigTile.setDescription(hVar.f144417b);
            q0 q0Var = hVar.f144418c;
            if (q0Var != null) {
                navBarWithBigTile.setDuoAvatar(q0Var, r0.DEFAULT);
            } else {
                c1.S(navBarWithBigTile, f0.f322471a, null, null, 6);
            }
        } else {
            d3().e.setTitle((Clause) null);
        }
        d3().d.setTextClause(uiState.e);
        d3().f215183b.setBackgroundType(uiState.f144421c);
        d3().f215184c.setText(clause);
        LargeActionButton familyPlanIntroButton = d3().f215184c;
        Intrinsics.checkNotNullExpressionValue(familyPlanIntroButton, "familyPlanIntroButton");
        familyPlanIntroButton.setVisibility(clause != null ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (k) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().e;
        navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        navBarWithBigTile.setHeightMode(p2.f275222a);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().e.f59357t), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f215184c.o), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.M.d), new gii.b(this, null, 5), 3);
    }

    public final ngk.b d3() {
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ngk.b) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
