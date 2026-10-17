package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driving_number_prompt;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driving_number_prompt.DrivingNumberPromptScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import op7.d;
import op7.f;
import pki.b;
import ql7.d0;
import ql7.t;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/proof_of_driving_number/driving_number_prompt/DrivingNumberPromptScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lop7/d;", "Ldli/a;", "Lop7/f;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DrivingNumberPromptScreen extends ViewController<d> implements dli.a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(DrivingNumberPromptScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object L;
    public final Object N;
    public final Object O;
    public final int K = R$layout.screen_recycler_navbar_nextbutton;
    public final h M = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public DrivingNumberPromptScreen() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: op7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DrivingNumberPromptScreen f227529b;

            {
                this.f227529b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DrivingNumberPromptScreen drivingNumberPromptScreen = this.f227529b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DrivingNumberPromptScreen.P;
                        DrivingNumberPromptScreen drivingNumberPromptScreen2 = this.f227529b;
                        return dli.f.a(drivingNumberPromptScreen2, (e) drivingNumberPromptScreen2.O.getValue(), v.k(new RowDelegate(null, null, 7), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DrivingNumberPromptScreen.P;
                        qji.b bVarU2 = drivingNumberPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driving_number_prompt.di.DrivingNumberPromptScreenInjector");
                        d0 d0Var = new d0();
                        d0Var.f247269a = e4m.b.b(new t(d0Var, 1, 3));
                        d0Var.f247270b = e4m.b.b(new t(d0Var, 0, 3));
                        return d0Var;
                    default:
                        KProperty[] kPropertyArr3 = DrivingNumberPromptScreen.P;
                        return (e) ((d0) drivingNumberPromptScreen.N.getValue()).f247270b.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: op7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DrivingNumberPromptScreen f227529b;

            {
                this.f227529b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DrivingNumberPromptScreen drivingNumberPromptScreen = this.f227529b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DrivingNumberPromptScreen.P;
                        DrivingNumberPromptScreen drivingNumberPromptScreen2 = this.f227529b;
                        return dli.f.a(drivingNumberPromptScreen2, (e) drivingNumberPromptScreen2.O.getValue(), v.k(new RowDelegate(null, null, 7), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DrivingNumberPromptScreen.P;
                        qji.b bVarU2 = drivingNumberPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driving_number_prompt.di.DrivingNumberPromptScreenInjector");
                        d0 d0Var = new d0();
                        d0Var.f247269a = e4m.b.b(new t(d0Var, 1, 3));
                        d0Var.f247270b = e4m.b.b(new t(d0Var, 0, 3));
                        return d0Var;
                    default:
                        KProperty[] kPropertyArr3 = DrivingNumberPromptScreen.P;
                        return (e) ((d0) drivingNumberPromptScreen.N.getValue()).f247270b.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: op7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DrivingNumberPromptScreen f227529b;

            {
                this.f227529b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DrivingNumberPromptScreen drivingNumberPromptScreen = this.f227529b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DrivingNumberPromptScreen.P;
                        DrivingNumberPromptScreen drivingNumberPromptScreen2 = this.f227529b;
                        return dli.f.a(drivingNumberPromptScreen2, (e) drivingNumberPromptScreen2.O.getValue(), v.k(new RowDelegate(null, null, 7), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DrivingNumberPromptScreen.P;
                        qji.b bVarU2 = drivingNumberPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driving_number_prompt.di.DrivingNumberPromptScreenInjector");
                        d0 d0Var = new d0();
                        d0Var.f247269a = e4m.b.b(new t(d0Var, 1, 3));
                        d0Var.f247270b = e4m.b.b(new t(d0Var, 0, 3));
                        return d0Var;
                    default:
                        KProperty[] kPropertyArr3 = DrivingNumberPromptScreen.P;
                        return (e) ((d0) drivingNumberPromptScreen.N.getValue()).f247270b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (op7.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.car_insurance_imid_prompt_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.car_insurance_imid_prompt_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f174564b.setText(new TextLocalisedClause(R$string.car_insurance_common_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new op7.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new op7.b(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.L.getValue();
    }
}
