package com.revolut.feature.insurance_car.impl.ui.screen.mta.view_driver;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.view_driver.ViewDriverScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.view_driver.ViewDriverScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import iaf.d;
import io7.b;
import io7.c;
import io7.e;
import io7.f;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ql7.k0;
import ql7.n1;
import ql7.t0;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/mta/view_driver/ViewDriverScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "Lio7/e;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ViewDriverScreen extends ViewController<Object> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(ViewDriverScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final ViewDriverScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final RowDelegate P;
    public final Object Q;

    public ViewDriverScreen(ViewDriverScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: io7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewDriverScreen f163195b;

            {
                this.f163195b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ViewDriverScreen viewDriverScreen = this.f163195b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ViewDriverScreen.R;
                        qji.b bVarU2 = viewDriverScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.mta.view_driver.di.ViewDriverScreenInjector");
                        t0 t0Var = (t0) bVarU2;
                        k0 k0Var = t0Var.f247471b;
                        t0 t0Var2 = t0Var.f247472c;
                        ViewDriverScreenContract$InputData viewDriverScreenContract$InputData = viewDriverScreen.K;
                        viewDriverScreenContract$InputData.getClass();
                        return new n1(k0Var, t0Var2, viewDriverScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ViewDriverScreen.R;
                        return (f) ((n1) viewDriverScreen.N.getValue()).f247406c.get();
                    default:
                        KProperty[] kPropertyArr3 = ViewDriverScreen.R;
                        ViewDriverScreen viewDriverScreen2 = this.f163195b;
                        return dli.f.a(viewDriverScreen2, (f) viewDriverScreen2.O.getValue(), v.k(new CellDetailsDelegate(), new ListSubheaderDelegate(), viewDriverScreen2.P), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: io7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewDriverScreen f163195b;

            {
                this.f163195b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ViewDriverScreen viewDriverScreen = this.f163195b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ViewDriverScreen.R;
                        qji.b bVarU2 = viewDriverScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.mta.view_driver.di.ViewDriverScreenInjector");
                        t0 t0Var = (t0) bVarU2;
                        k0 k0Var = t0Var.f247471b;
                        t0 t0Var2 = t0Var.f247472c;
                        ViewDriverScreenContract$InputData viewDriverScreenContract$InputData = viewDriverScreen.K;
                        viewDriverScreenContract$InputData.getClass();
                        return new n1(k0Var, t0Var2, viewDriverScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ViewDriverScreen.R;
                        return (f) ((n1) viewDriverScreen.N.getValue()).f247406c.get();
                    default:
                        KProperty[] kPropertyArr3 = ViewDriverScreen.R;
                        ViewDriverScreen viewDriverScreen2 = this.f163195b;
                        return dli.f.a(viewDriverScreen2, (f) viewDriverScreen2.O.getValue(), v.k(new CellDetailsDelegate(), new ListSubheaderDelegate(), viewDriverScreen2.P), 0, null, null, null, 60);
                }
            }
        });
        this.P = new RowDelegate(null, null, 7);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: io7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewDriverScreen f163195b;

            {
                this.f163195b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ViewDriverScreen viewDriverScreen = this.f163195b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ViewDriverScreen.R;
                        qji.b bVarU2 = viewDriverScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.ui.screen.mta.view_driver.di.ViewDriverScreenInjector");
                        t0 t0Var = (t0) bVarU2;
                        k0 k0Var = t0Var.f247471b;
                        t0 t0Var2 = t0Var.f247472c;
                        ViewDriverScreenContract$InputData viewDriverScreenContract$InputData = viewDriverScreen.K;
                        viewDriverScreenContract$InputData.getClass();
                        return new n1(k0Var, t0Var2, viewDriverScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ViewDriverScreen.R;
                        return (f) ((n1) viewDriverScreen.N.getValue()).f247406c.get();
                    default:
                        KProperty[] kPropertyArr3 = ViewDriverScreen.R;
                        ViewDriverScreen viewDriverScreen2 = this.f163195b;
                        return dli.f.a(viewDriverScreen2, (f) viewDriverScreen2.O.getValue(), v.k(new CellDetailsDelegate(), new ListSubheaderDelegate(), viewDriverScreen2.P), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextClause textClause = uiState.f163198b;
        navBarWithToolbar.setTitle(textClause, null);
        navBarWithToolbar.setToolbarTitle(textClause);
        navBarWithToolbar.setEndIconImage(uiState.f163199c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (n1) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new d(this, null, 16), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f53218h), null, new c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
