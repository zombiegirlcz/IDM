package com.revolut.feature.credit.application.plugins.impl.ui.address_v2.selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.selection.CreditAddressSelectionScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.selection.CreditAddressSelectionScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dw3.c1;
import dw3.w0;
import dw3.x0;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import t44.b;
import t44.c;
import t44.d;
import t44.i;
import t44.j;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/address_v2/selection/CreditAddressSelectionScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lt44/i;", "Ldli/a;", "Lt44/o;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditAddressSelectionScreen extends PluginScreenController<i> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CreditAddressSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final CreditAddressSelectionScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final FullScreenStateDelegate Q;
    public final RowDelegate R;
    public final SelectableDelegate S;
    public final Object T;

    public CreditAddressSelectionScreen(CreditAddressSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: t44.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditAddressSelectionScreen f267877b;

            {
                this.f267877b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditAddressSelectionScreen creditAddressSelectionScreen = this.f267877b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditAddressSelectionScreen.U;
                        qji.b bVarU2 = creditAddressSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.address_v2.selection.di.CreditAddressSelectionScreenInjector");
                        x0 x0Var = (x0) bVarU2;
                        c1 c1Var = x0Var.f120113c;
                        x0 x0Var2 = x0Var.d;
                        CreditAddressSelectionScreenContract$InputData creditAddressSelectionScreenContract$InputData = creditAddressSelectionScreen.L;
                        creditAddressSelectionScreenContract$InputData.getClass();
                        return new w0(c1Var, x0Var2, creditAddressSelectionScreen, creditAddressSelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditAddressSelectionScreen.U;
                        return (j) ((w0) creditAddressSelectionScreen.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditAddressSelectionScreen.U;
                        CreditAddressSelectionScreen creditAddressSelectionScreen2 = this.f267877b;
                        return dli.f.a(creditAddressSelectionScreen2, creditAddressSelectionScreen2.R2(), v.k(creditAddressSelectionScreen2.R, creditAddressSelectionScreen2.S, creditAddressSelectionScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: t44.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditAddressSelectionScreen f267877b;

            {
                this.f267877b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditAddressSelectionScreen creditAddressSelectionScreen = this.f267877b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditAddressSelectionScreen.U;
                        qji.b bVarU2 = creditAddressSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.address_v2.selection.di.CreditAddressSelectionScreenInjector");
                        x0 x0Var = (x0) bVarU2;
                        c1 c1Var = x0Var.f120113c;
                        x0 x0Var2 = x0Var.d;
                        CreditAddressSelectionScreenContract$InputData creditAddressSelectionScreenContract$InputData = creditAddressSelectionScreen.L;
                        creditAddressSelectionScreenContract$InputData.getClass();
                        return new w0(c1Var, x0Var2, creditAddressSelectionScreen, creditAddressSelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditAddressSelectionScreen.U;
                        return (j) ((w0) creditAddressSelectionScreen.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditAddressSelectionScreen.U;
                        CreditAddressSelectionScreen creditAddressSelectionScreen2 = this.f267877b;
                        return dli.f.a(creditAddressSelectionScreen2, creditAddressSelectionScreen2.R2(), v.k(creditAddressSelectionScreen2.R, creditAddressSelectionScreen2.S, creditAddressSelectionScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = new FullScreenStateDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.R = rowDelegate;
        this.S = new SelectableDelegate(rowDelegate);
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: t44.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditAddressSelectionScreen f267877b;

            {
                this.f267877b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditAddressSelectionScreen creditAddressSelectionScreen = this.f267877b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditAddressSelectionScreen.U;
                        qji.b bVarU2 = creditAddressSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.address_v2.selection.di.CreditAddressSelectionScreenInjector");
                        x0 x0Var = (x0) bVarU2;
                        c1 c1Var = x0Var.f120113c;
                        x0 x0Var2 = x0Var.d;
                        CreditAddressSelectionScreenContract$InputData creditAddressSelectionScreenContract$InputData = creditAddressSelectionScreen.L;
                        creditAddressSelectionScreenContract$InputData.getClass();
                        return new w0(c1Var, x0Var2, creditAddressSelectionScreen, creditAddressSelectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditAddressSelectionScreen.U;
                        return (j) ((w0) creditAddressSelectionScreen.N.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditAddressSelectionScreen.U;
                        CreditAddressSelectionScreen creditAddressSelectionScreen2 = this.f267877b;
                        return dli.f.a(creditAddressSelectionScreen2, creditAddressSelectionScreen2.R2(), v.k(creditAddressSelectionScreen2.R, creditAddressSelectionScreen2.S, creditAddressSelectionScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        t44.o uiState = (t44.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        hx7.i.z(navBarWithToolbar, new hx4.a(uiState.f267886a, uiState.f267887b, null, f0.f322471a));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(uiState.f267888c);
        largeActionButton.setEnabled(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (w0) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.S.r()), new t44.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new d(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.P.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
