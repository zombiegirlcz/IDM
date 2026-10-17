package com.revolut.retail.feature.pricing_plans.ui.impl.screens.student.student_hub;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import au0.b1;
import au0.c1;
import au0.m0;
import au0.s0;
import au0.u0;
import au0.w0;
import au0.z0;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$id;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$layout;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.BasePricingPlanBEDrivenViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student.student_hub.StudentHubScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import ngk.p;
import ojk.c0;
import onk.c;
import onk.e;
import onk.f;
import onk.g;
import onk.i;
import pki.b;
import qgk.u1;
import qgk.v1;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/student/student_hub/StudentHubScreen;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/be_driven/BasePricingPlanBEDrivenViewController;", "Lonk/g;", "Ldli/a;", "Lonk/i;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StudentHubScreen extends BasePricingPlanBEDrivenViewController<g> implements dli.a {
    public static final /* synthetic */ KProperty[] i0 = {o0.f186429a.j(new h0(StudentHubScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/pricing_plans/ui/impl/databinding/ScreenStudentHubBinding;", 0))};
    public final int c0 = R$layout.screen_student_hub;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f103635d0 = R$style.UiKitTheme_TransparentCompat;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final h f103636e0 = s.t(this, a.f);
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f103637h0;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, p.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/pricing_plans/ui/impl/databinding/ScreenStudentHubBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.studentHubScreen_background;
            if (((AnimatedBackgroundView) ViewBindings.findChildViewById(p0, i)) != null) {
                i = R$id.studentHubScreen_navBarWithBigTile;
                NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) ViewBindings.findChildViewById(p0, i);
                if (navBarWithBigTile != null) {
                    i = R$id.studentHubScreen_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new p((ControllerContainerCoordinatorLayout) p0, navBarWithBigTile);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public StudentHubScreen() {
        final int i = 0;
        this.f0 = w.y0(new Function0(this) { // from class: onk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StudentHubScreen f226953b;

            {
                this.f226953b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StudentHubScreen studentHubScreen = this.f226953b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StudentHubScreen.i0;
                        StudentHubScreen studentHubScreen2 = this.f226953b;
                        return dli.f.a(studentHubScreen2, (h) studentHubScreen2.f103637h0.getValue(), studentHubScreen2.f103366b0, R$id.studentHubScreen_recyclerView, null, new koi.h(null, true, true, 1), null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = StudentHubScreen.i0;
                        qji.b bVarU2 = studentHubScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.student.student_hub.di.StudentHubScreenInjector");
                        u1 u1Var = (u1) bVarU2;
                        return new v1(u1Var.f246273b, u1Var.f246274c, studentHubScreen, studentHubScreen);
                    default:
                        KProperty[] kPropertyArr3 = StudentHubScreen.i0;
                        return (h) ((v1) studentHubScreen.g0.getValue()).f246293h.get();
                }
            }
        });
        final int i2 = 1;
        this.g0 = w.y0(new Function0(this) { // from class: onk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StudentHubScreen f226953b;

            {
                this.f226953b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StudentHubScreen studentHubScreen = this.f226953b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StudentHubScreen.i0;
                        StudentHubScreen studentHubScreen2 = this.f226953b;
                        return dli.f.a(studentHubScreen2, (h) studentHubScreen2.f103637h0.getValue(), studentHubScreen2.f103366b0, R$id.studentHubScreen_recyclerView, null, new koi.h(null, true, true, 1), null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = StudentHubScreen.i0;
                        qji.b bVarU2 = studentHubScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.student.student_hub.di.StudentHubScreenInjector");
                        u1 u1Var = (u1) bVarU2;
                        return new v1(u1Var.f246273b, u1Var.f246274c, studentHubScreen, studentHubScreen);
                    default:
                        KProperty[] kPropertyArr3 = StudentHubScreen.i0;
                        return (h) ((v1) studentHubScreen.g0.getValue()).f246293h.get();
                }
            }
        });
        final int i3 = 2;
        this.f103637h0 = w.y0(new Function0(this) { // from class: onk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StudentHubScreen f226953b;

            {
                this.f226953b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StudentHubScreen studentHubScreen = this.f226953b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StudentHubScreen.i0;
                        StudentHubScreen studentHubScreen2 = this.f226953b;
                        return dli.f.a(studentHubScreen2, (h) studentHubScreen2.f103637h0.getValue(), studentHubScreen2.f103366b0, R$id.studentHubScreen_recyclerView, null, new koi.h(null, true, true, 1), null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = StudentHubScreen.i0;
                        qji.b bVarU2 = studentHubScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.student.student_hub.di.StudentHubScreenInjector");
                        u1 u1Var = (u1) bVarU2;
                        return new v1(u1Var.f246273b, u1Var.f246274c, studentHubScreen, studentHubScreen);
                    default:
                        KProperty[] kPropertyArr3 = StudentHubScreen.i0;
                        return (h) ((v1) studentHubScreen.g0.getValue()).f246293h.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getN() {
        return Integer.valueOf(this.f103635d0);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        f fVar = uiState.f226962b;
        if (fVar instanceof f.a) {
            e3().f215226b.setLoadingState(true);
            return;
        }
        if (!(fVar instanceof e)) {
            if (fVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            e3().f215226b.setLoadingState(false);
            return;
        }
        NavBarWithBigTile navBarWithBigTile = e3().f215226b;
        navBarWithBigTile.setLoadingState(false);
        e eVar = (e) fVar;
        Clause clause = eVar.f226956a;
        navBarWithBigTile.setTitle(new z0(clause, false));
        navBarWithBigTile.setToolbarTitle(eVar.f226957b);
        navBarWithBigTile.setMenuItems(eVar.e);
        NavBarWithContainerBackground navBarWithContainerBackground = eVar.d;
        if (navBarWithContainerBackground == null) {
            navBarWithContainerBackground = NavBarWithContainerBackground.TransparentBackground.f57882a;
        }
        z0 z0Var = new z0(clause, false);
        Clause clause2 = eVar.f226958c;
        c1.S(navBarWithBigTile, u.c(new u0(navBarWithContainerBackground, z0Var, null, clause2 != null ? new w0(clause2) : null)), null, null, 6);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (v1) this.g0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (onk.h) this.f103637h0.getValue();
    }

    @Override // com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.BasePricingPlanBEDrivenViewController, com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.Y2(view);
        NavBarWithBigTile navBarWithBigTile = e3().f215226b;
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setTitleStyle(b1.DEFAULT);
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.FULL_GRADIENT);
        navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
    }

    @Override // com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.BasePricingPlanBEDrivenViewController, com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.b3(view);
        ViewController.P2(this, rd0.e.b(e3().f215226b.f59357t), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(e3().f215226b.f59360y.f57277p), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(e3().f215226b.b()), new oli.f(this, null, 9), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.BasePricingPlanBEDrivenViewController
    public final c0 d3() {
        return (onk.h) this.f103637h0.getValue();
    }

    public final p e3() {
        ViewBinding value = this.f103636e0.getValue(this, i0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (p) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.c0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.BasePricingPlanBEDrivenViewController
    public final RecyclerView h() {
        return ((dli.c) this.f0.getValue()).h();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mkd.g
    public final koi.c v0() {
        return ((dli.c) this.f0.getValue()).w().f;
    }
}
