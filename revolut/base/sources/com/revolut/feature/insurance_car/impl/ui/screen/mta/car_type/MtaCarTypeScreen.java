package com.revolut.feature.insurance_car.impl.ui.screen.mta.car_type;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.car_type.MtaCarTypeScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.car_type.MtaCarTypeScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ql7.k0;
import ql7.q0;
import ql7.t0;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import yk6.m;
import yn7.b;
import yn7.c;
import yn7.f;
import yn7.g;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/mta/car_type/MtaCarTypeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lyn7/f;", "Ldli/a;", "Lyn7/g;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MtaCarTypeScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(MtaCarTypeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final MtaCarTypeScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final RowDelegate P;
    public final Object Q;

    public MtaCarTypeScreen(MtaCarTypeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: yn7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MtaCarTypeScreen f315264b;

            {
                this.f315264b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MtaCarTypeScreen mtaCarTypeScreen = this.f315264b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MtaCarTypeScreen.R;
                        qji.b bVarU2 = mtaCarTypeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.mta.car_type.di.MtaCarTypeScreenInjector");
                        t0 t0Var = (t0) bVarU2;
                        k0 k0Var = t0Var.f247471b;
                        t0 t0Var2 = t0Var.f247472c;
                        MtaCarTypeScreenContract$InputData mtaCarTypeScreenContract$InputData = mtaCarTypeScreen.K;
                        mtaCarTypeScreenContract$InputData.getClass();
                        return new q0(k0Var, t0Var2, mtaCarTypeScreen, mtaCarTypeScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = MtaCarTypeScreen.R;
                        return (h) ((q0) mtaCarTypeScreen.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = MtaCarTypeScreen.R;
                        MtaCarTypeScreen mtaCarTypeScreen2 = this.f315264b;
                        return dli.f.a(mtaCarTypeScreen2, (h) mtaCarTypeScreen2.O.getValue(), u.c(mtaCarTypeScreen2.P), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: yn7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MtaCarTypeScreen f315264b;

            {
                this.f315264b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MtaCarTypeScreen mtaCarTypeScreen = this.f315264b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MtaCarTypeScreen.R;
                        qji.b bVarU2 = mtaCarTypeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.mta.car_type.di.MtaCarTypeScreenInjector");
                        t0 t0Var = (t0) bVarU2;
                        k0 k0Var = t0Var.f247471b;
                        t0 t0Var2 = t0Var.f247472c;
                        MtaCarTypeScreenContract$InputData mtaCarTypeScreenContract$InputData = mtaCarTypeScreen.K;
                        mtaCarTypeScreenContract$InputData.getClass();
                        return new q0(k0Var, t0Var2, mtaCarTypeScreen, mtaCarTypeScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = MtaCarTypeScreen.R;
                        return (h) ((q0) mtaCarTypeScreen.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = MtaCarTypeScreen.R;
                        MtaCarTypeScreen mtaCarTypeScreen2 = this.f315264b;
                        return dli.f.a(mtaCarTypeScreen2, (h) mtaCarTypeScreen2.O.getValue(), u.c(mtaCarTypeScreen2.P), 0, null, null, null, 60);
                }
            }
        });
        this.P = new RowDelegate(null, null, 7);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: yn7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MtaCarTypeScreen f315264b;

            {
                this.f315264b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MtaCarTypeScreen mtaCarTypeScreen = this.f315264b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MtaCarTypeScreen.R;
                        qji.b bVarU2 = mtaCarTypeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.mta.car_type.di.MtaCarTypeScreenInjector");
                        t0 t0Var = (t0) bVarU2;
                        k0 k0Var = t0Var.f247471b;
                        t0 t0Var2 = t0Var.f247472c;
                        MtaCarTypeScreenContract$InputData mtaCarTypeScreenContract$InputData = mtaCarTypeScreen.K;
                        mtaCarTypeScreenContract$InputData.getClass();
                        return new q0(k0Var, t0Var2, mtaCarTypeScreen, mtaCarTypeScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = MtaCarTypeScreen.R;
                        return (h) ((q0) mtaCarTypeScreen.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = MtaCarTypeScreen.R;
                        MtaCarTypeScreen mtaCarTypeScreen2 = this.f315264b;
                        return dli.f.a(mtaCarTypeScreen2, (h) mtaCarTypeScreen2.O.getValue(), u.c(mtaCarTypeScreen2.P), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174539b.setMenuItems(uiState.f315269b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (q0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (yn7.h) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_mta_car_type_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new yl6.b(this, continuation, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.o.f57403b), null, new m(this, continuation, 6), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f53218h), null, new c(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
