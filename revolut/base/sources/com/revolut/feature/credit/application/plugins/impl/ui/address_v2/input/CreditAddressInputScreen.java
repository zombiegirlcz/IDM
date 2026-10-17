package com.revolut.feature.credit.application.plugins.impl.ui.address_v2.input;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.input.CreditAddressInputScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.input.CreditAddressInputScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dw3.c1;
import dw3.x0;
import dw3.y0;
import hx7.i;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import s44.b;
import s44.c;
import s44.d;
import s44.f;
import s44.k;
import s44.l;
import s44.m;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/address_v2/input/CreditAddressInputScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Ls44/k;", "Ldli/a;", "Ls44/m;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditAddressInputScreen extends PluginScreenController<k> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(CreditAddressInputScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final CreditAddressInputScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final FullScreenStateDelegate Q;
    public final RowDelegate R;
    public final Object S;

    public CreditAddressInputScreen(CreditAddressInputScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: s44.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditAddressInputScreen f259753b;

            {
                this.f259753b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditAddressInputScreen creditAddressInputScreen = this.f259753b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditAddressInputScreen.T;
                        qji.b bVarU2 = creditAddressInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.address_v2.di.CreditAddressV2ScreenInjector");
                        x0 x0Var = (x0) bVarU2;
                        c1 c1Var = x0Var.f120113c;
                        x0 x0Var2 = x0Var.d;
                        CreditAddressInputScreenContract$InputData creditAddressInputScreenContract$InputData = creditAddressInputScreen.L;
                        creditAddressInputScreenContract$InputData.getClass();
                        return new y0(c1Var, x0Var2, creditAddressInputScreen, creditAddressInputScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditAddressInputScreen.T;
                        return (l) ((y0) creditAddressInputScreen.N.getValue()).f120193j.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditAddressInputScreen.T;
                        CreditAddressInputScreen creditAddressInputScreen2 = this.f259753b;
                        return dli.f.a(creditAddressInputScreen2, creditAddressInputScreen2.d(), v.k(creditAddressInputScreen2.R, creditAddressInputScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: s44.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditAddressInputScreen f259753b;

            {
                this.f259753b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditAddressInputScreen creditAddressInputScreen = this.f259753b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditAddressInputScreen.T;
                        qji.b bVarU2 = creditAddressInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.address_v2.di.CreditAddressV2ScreenInjector");
                        x0 x0Var = (x0) bVarU2;
                        c1 c1Var = x0Var.f120113c;
                        x0 x0Var2 = x0Var.d;
                        CreditAddressInputScreenContract$InputData creditAddressInputScreenContract$InputData = creditAddressInputScreen.L;
                        creditAddressInputScreenContract$InputData.getClass();
                        return new y0(c1Var, x0Var2, creditAddressInputScreen, creditAddressInputScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditAddressInputScreen.T;
                        return (l) ((y0) creditAddressInputScreen.N.getValue()).f120193j.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditAddressInputScreen.T;
                        CreditAddressInputScreen creditAddressInputScreen2 = this.f259753b;
                        return dli.f.a(creditAddressInputScreen2, creditAddressInputScreen2.d(), v.k(creditAddressInputScreen2.R, creditAddressInputScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = new FullScreenStateDelegate();
        this.R = new RowDelegate(null, null, 7);
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: s44.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditAddressInputScreen f259753b;

            {
                this.f259753b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditAddressInputScreen creditAddressInputScreen = this.f259753b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditAddressInputScreen.T;
                        qji.b bVarU2 = creditAddressInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.address_v2.di.CreditAddressV2ScreenInjector");
                        x0 x0Var = (x0) bVarU2;
                        c1 c1Var = x0Var.f120113c;
                        x0 x0Var2 = x0Var.d;
                        CreditAddressInputScreenContract$InputData creditAddressInputScreenContract$InputData = creditAddressInputScreen.L;
                        creditAddressInputScreenContract$InputData.getClass();
                        return new y0(c1Var, x0Var2, creditAddressInputScreen, creditAddressInputScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditAddressInputScreen.T;
                        return (l) ((y0) creditAddressInputScreen.N.getValue()).f120193j.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditAddressInputScreen.T;
                        CreditAddressInputScreen creditAddressInputScreen2 = this.f259753b;
                        return dli.f.a(creditAddressInputScreen2, creditAddressInputScreen2.d(), v.k(creditAddressInputScreen2.R, creditAddressInputScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        i.z(navBarWithToolbar, new hx4.a(uiState.f259760a, uiState.f259761b, null, f0.f322471a));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(uiState.f259762c);
        largeActionButton.setEnabled(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y0) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new c(this, null), 3);
        RowDelegate rowDelegate = this.R;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53220l), new s44.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53226s), new rt4.o(this, continuation, 25), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new f(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new f(this, continuation, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
