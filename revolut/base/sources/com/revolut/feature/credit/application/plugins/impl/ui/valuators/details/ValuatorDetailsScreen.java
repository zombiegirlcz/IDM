package com.revolut.feature.credit.application.plugins.impl.ui.valuators.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.MapPlainDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.valuators.details.ValuatorDetailsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.valuators.details.ValuatorDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import dw3.c1;
import dw3.c7;
import dw3.i5;
import ff4.z;
import fj4.c;
import fj4.f;
import fj4.g;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/valuators/details/ValuatorDetailsScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Laii/q;", "Ldli/a;", "Lfj4/h;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ValuatorDetailsScreen extends PluginScreenController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(ValuatorDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final ValuatorDetailsScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final MapPlainDelegate Q;
    public final CellDetailsActionDelegate R;
    public final Object S;

    public ValuatorDetailsScreen(ValuatorDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: fj4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ValuatorDetailsScreen f135527b;

            {
                this.f135527b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ValuatorDetailsScreen valuatorDetailsScreen = this.f135527b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ValuatorDetailsScreen.T;
                        qji.b bVarU2 = valuatorDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.valuators.details.di.ValuatorDetailsScreenInjector");
                        i5 i5Var = (i5) bVarU2;
                        c1 c1Var = i5Var.f118978a;
                        i5 i5Var2 = i5Var.f118979b;
                        ValuatorDetailsScreenContract$InputData valuatorDetailsScreenContract$InputData = valuatorDetailsScreen.L;
                        valuatorDetailsScreenContract$InputData.getClass();
                        return new c7(c1Var, i5Var2, valuatorDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ValuatorDetailsScreen.T;
                        return (g) ((c7) valuatorDetailsScreen.N.getValue()).f118521c.get();
                    default:
                        KProperty[] kPropertyArr3 = ValuatorDetailsScreen.T;
                        ValuatorDetailsScreen valuatorDetailsScreen2 = this.f135527b;
                        return dli.f.a(valuatorDetailsScreen2, (g) valuatorDetailsScreen2.O.getValue(), v.k(valuatorDetailsScreen2.Q, valuatorDetailsScreen2.R), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: fj4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ValuatorDetailsScreen f135527b;

            {
                this.f135527b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ValuatorDetailsScreen valuatorDetailsScreen = this.f135527b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ValuatorDetailsScreen.T;
                        qji.b bVarU2 = valuatorDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.valuators.details.di.ValuatorDetailsScreenInjector");
                        i5 i5Var = (i5) bVarU2;
                        c1 c1Var = i5Var.f118978a;
                        i5 i5Var2 = i5Var.f118979b;
                        ValuatorDetailsScreenContract$InputData valuatorDetailsScreenContract$InputData = valuatorDetailsScreen.L;
                        valuatorDetailsScreenContract$InputData.getClass();
                        return new c7(c1Var, i5Var2, valuatorDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ValuatorDetailsScreen.T;
                        return (g) ((c7) valuatorDetailsScreen.N.getValue()).f118521c.get();
                    default:
                        KProperty[] kPropertyArr3 = ValuatorDetailsScreen.T;
                        ValuatorDetailsScreen valuatorDetailsScreen2 = this.f135527b;
                        return dli.f.a(valuatorDetailsScreen2, (g) valuatorDetailsScreen2.O.getValue(), v.k(valuatorDetailsScreen2.Q, valuatorDetailsScreen2.R), 0, null, null, null, 60);
                }
            }
        });
        this.P = s.t(this, c.f);
        this.Q = new MapPlainDelegate();
        this.R = new CellDetailsActionDelegate();
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: fj4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ValuatorDetailsScreen f135527b;

            {
                this.f135527b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ValuatorDetailsScreen valuatorDetailsScreen = this.f135527b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ValuatorDetailsScreen.T;
                        qji.b bVarU2 = valuatorDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.valuators.details.di.ValuatorDetailsScreenInjector");
                        i5 i5Var = (i5) bVarU2;
                        c1 c1Var = i5Var.f118978a;
                        i5 i5Var2 = i5Var.f118979b;
                        ValuatorDetailsScreenContract$InputData valuatorDetailsScreenContract$InputData = valuatorDetailsScreen.L;
                        valuatorDetailsScreenContract$InputData.getClass();
                        return new c7(c1Var, i5Var2, valuatorDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ValuatorDetailsScreen.T;
                        return (g) ((c7) valuatorDetailsScreen.N.getValue()).f118521c.get();
                    default:
                        KProperty[] kPropertyArr3 = ValuatorDetailsScreen.T;
                        ValuatorDetailsScreen valuatorDetailsScreen2 = this.f135527b;
                        return dli.f.a(valuatorDetailsScreen2, (g) valuatorDetailsScreen2.O.getValue(), v.k(valuatorDetailsScreen2.Q, valuatorDetailsScreen2.R), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        fj4.h uiState = (fj4.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(uiState.f135532b, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c7) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new z(this, null, 7), 3);
        com.revolut.kompot.navigable.a.g2(this, new eq8.g(rd0.e.b(this.Q.f52768c), 25), null, new f(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new eq8.g(rd0.e.b(this.R.d), 26), null, new f(this, null, 1), 3);
    }

    public final m d3() {
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
