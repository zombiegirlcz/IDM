package com.revolut.feature.insurance_car.impl.ui.screen.mta.driver_type;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.driver_type.MtaDriverTypeScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ec8.c;
import eo7.d;
import eo7.e;
import eo7.f;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import pki.b;
import ql7.s0;
import ql7.t;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/mta/driver_type/MtaDriverTypeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Leo7/d;", "Ldli/a;", "Leo7/e;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MtaDriverTypeScreen extends ViewController<d> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(MtaDriverTypeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object M;
    public final Object N;
    public final Object P;
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final RowDelegate O = new RowDelegate(null, null, 7);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public MtaDriverTypeScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: eo7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MtaDriverTypeScreen f127870b;

            {
                this.f127870b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MtaDriverTypeScreen mtaDriverTypeScreen = this.f127870b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MtaDriverTypeScreen.Q;
                        qji.b bVarU2 = mtaDriverTypeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.mta.driver_type.di.MtaDriverTypeScreenInjector");
                        s0 s0Var = new s0();
                        s0Var.f247462a = e4m.b.b(new t(s0Var, 1, 7));
                        s0Var.f247463b = e4m.b.b(new t(s0Var, 0, 7));
                        return s0Var;
                    case 1:
                        KProperty[] kPropertyArr2 = MtaDriverTypeScreen.Q;
                        return (f) ((s0) mtaDriverTypeScreen.M.getValue()).f247463b.get();
                    default:
                        KProperty[] kPropertyArr3 = MtaDriverTypeScreen.Q;
                        MtaDriverTypeScreen mtaDriverTypeScreen2 = this.f127870b;
                        return dli.f.a(mtaDriverTypeScreen2, (f) mtaDriverTypeScreen2.N.getValue(), u.c(mtaDriverTypeScreen2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: eo7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MtaDriverTypeScreen f127870b;

            {
                this.f127870b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MtaDriverTypeScreen mtaDriverTypeScreen = this.f127870b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MtaDriverTypeScreen.Q;
                        qji.b bVarU2 = mtaDriverTypeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.mta.driver_type.di.MtaDriverTypeScreenInjector");
                        s0 s0Var = new s0();
                        s0Var.f247462a = e4m.b.b(new t(s0Var, 1, 7));
                        s0Var.f247463b = e4m.b.b(new t(s0Var, 0, 7));
                        return s0Var;
                    case 1:
                        KProperty[] kPropertyArr2 = MtaDriverTypeScreen.Q;
                        return (f) ((s0) mtaDriverTypeScreen.M.getValue()).f247463b.get();
                    default:
                        KProperty[] kPropertyArr3 = MtaDriverTypeScreen.Q;
                        MtaDriverTypeScreen mtaDriverTypeScreen2 = this.f127870b;
                        return dli.f.a(mtaDriverTypeScreen2, (f) mtaDriverTypeScreen2.N.getValue(), u.c(mtaDriverTypeScreen2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: eo7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MtaDriverTypeScreen f127870b;

            {
                this.f127870b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MtaDriverTypeScreen mtaDriverTypeScreen = this.f127870b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MtaDriverTypeScreen.Q;
                        qji.b bVarU2 = mtaDriverTypeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.mta.driver_type.di.MtaDriverTypeScreenInjector");
                        s0 s0Var = new s0();
                        s0Var.f247462a = e4m.b.b(new t(s0Var, 1, 7));
                        s0Var.f247463b = e4m.b.b(new t(s0Var, 0, 7));
                        return s0Var;
                    case 1:
                        KProperty[] kPropertyArr2 = MtaDriverTypeScreen.Q;
                        return (f) ((s0) mtaDriverTypeScreen.M.getValue()).f247463b.get();
                    default:
                        KProperty[] kPropertyArr3 = MtaDriverTypeScreen.Q;
                        MtaDriverTypeScreen mtaDriverTypeScreen2 = this.f127870b;
                        return dli.f.a(mtaDriverTypeScreen2, (f) mtaDriverTypeScreen2.N.getValue(), u.c(mtaDriverTypeScreen2.O), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (s0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (f) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_mta_driver_type_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new c(this, null, 17), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f53218h), null, new eo7.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF103912o0() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
