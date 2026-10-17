package com.revolut.feature.kyc.impl.screens.addressconfirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.MapPlainDelegate;
import com.revolut.core.ui_kit.delegates.MapPlainLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.kyc.impl.screens.addressconfirmation.AddressConfirmationScreen;
import com.revolut.feature.kyc.impl.screens.addressconfirmation.AddressConfirmationScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import tx0.j0;
import vc.s;
import ww8.b;
import ww8.d;
import ww8.h;
import ww8.i;
import ww8.j;
import xki.e;
import zhm.v;
import zu8.c0;
import zu8.g0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/screens/addressconfirmation/AddressConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lww8/h;", "Ltki/c;", "Lww8/j;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddressConfirmationScreen extends ViewController<h> implements c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(AddressConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final AddressConfirmationScreenContract$InputData K;
    public final int L;
    public final ao.h M;
    public final Object N;
    public final Object O;
    public final RowDelegate P;
    public final MapPlainDelegate Q;
    public final FullScreenStateDelegate R;
    public final Object S;

    public AddressConfirmationScreen(AddressConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ww8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressConfirmationScreen f300622b;

            {
                this.f300622b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddressConfirmationScreen addressConfirmationScreen = this.f300622b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddressConfirmationScreen.T;
                        qji.b bVarU2 = addressConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.screens.addressconfirmation.di.AddressConfirmationScreenComponent.Injector");
                        g0 g0Var = (g0) bVarU2;
                        c0 c0Var = g0Var.f325277b;
                        g0 g0Var2 = g0Var.f325278c;
                        AddressConfirmationScreenContract$InputData addressConfirmationScreenContract$InputData = addressConfirmationScreen.K;
                        addressConfirmationScreenContract$InputData.getClass();
                        return new zu8.b(c0Var, g0Var2, addressConfirmationScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AddressConfirmationScreen.T;
                        return (i) ((zu8.b) addressConfirmationScreen.N.getValue()).f325230b.get();
                    default:
                        KProperty[] kPropertyArr3 = AddressConfirmationScreen.T;
                        AddressConfirmationScreen addressConfirmationScreen2 = this.f300622b;
                        return tki.g.a(addressConfirmationScreen2, (i) addressConfirmationScreen2.O.getValue(), v.k(addressConfirmationScreen2.P, addressConfirmationScreen2.Q, addressConfirmationScreen2.R, new RowLoadingDelegate(), new MapPlainLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ww8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressConfirmationScreen f300622b;

            {
                this.f300622b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddressConfirmationScreen addressConfirmationScreen = this.f300622b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddressConfirmationScreen.T;
                        qji.b bVarU2 = addressConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.screens.addressconfirmation.di.AddressConfirmationScreenComponent.Injector");
                        g0 g0Var = (g0) bVarU2;
                        c0 c0Var = g0Var.f325277b;
                        g0 g0Var2 = g0Var.f325278c;
                        AddressConfirmationScreenContract$InputData addressConfirmationScreenContract$InputData = addressConfirmationScreen.K;
                        addressConfirmationScreenContract$InputData.getClass();
                        return new zu8.b(c0Var, g0Var2, addressConfirmationScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AddressConfirmationScreen.T;
                        return (i) ((zu8.b) addressConfirmationScreen.N.getValue()).f325230b.get();
                    default:
                        KProperty[] kPropertyArr3 = AddressConfirmationScreen.T;
                        AddressConfirmationScreen addressConfirmationScreen2 = this.f300622b;
                        return tki.g.a(addressConfirmationScreen2, (i) addressConfirmationScreen2.O.getValue(), v.k(addressConfirmationScreen2.P, addressConfirmationScreen2.Q, addressConfirmationScreen2.R, new RowLoadingDelegate(), new MapPlainLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new RowDelegate(null, null, 7);
        this.Q = new MapPlainDelegate();
        this.R = new FullScreenStateDelegate();
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: ww8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressConfirmationScreen f300622b;

            {
                this.f300622b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddressConfirmationScreen addressConfirmationScreen = this.f300622b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddressConfirmationScreen.T;
                        qji.b bVarU2 = addressConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.screens.addressconfirmation.di.AddressConfirmationScreenComponent.Injector");
                        g0 g0Var = (g0) bVarU2;
                        c0 c0Var = g0Var.f325277b;
                        g0 g0Var2 = g0Var.f325278c;
                        AddressConfirmationScreenContract$InputData addressConfirmationScreenContract$InputData = addressConfirmationScreen.K;
                        addressConfirmationScreenContract$InputData.getClass();
                        return new zu8.b(c0Var, g0Var2, addressConfirmationScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AddressConfirmationScreen.T;
                        return (i) ((zu8.b) addressConfirmationScreen.N.getValue()).f325230b.get();
                    default:
                        KProperty[] kPropertyArr3 = AddressConfirmationScreen.T;
                        AddressConfirmationScreen addressConfirmationScreen2 = this.f300622b;
                        return tki.g.a(addressConfirmationScreen2, (i) addressConfirmationScreen2.O.getValue(), v.k(addressConfirmationScreen2.P, addressConfirmationScreen2.Q, addressConfirmationScreen2.R, new RowLoadingDelegate(), new MapPlainLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        u uVarD3 = d3();
        NavBarWithToolbar navBarWithToolbar = uVarD3.f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f300629c;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        NavBarWithToolbar navBarWithToolbar2 = uVarD3.f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar2, "navBarWithToolbar");
        navBarWithToolbar2.setTitle(textLocalisedClause, null);
        navBarWithToolbar2.setDescriptionVisible(true);
        navBarWithToolbar2.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar2.setDescriptionText(uiState.f300628b);
        LargeActionButton largeActionButton = uVarD3.f174564b;
        largeActionButton.setText(uiState.d);
        largeActionButton.setEnabled(uiState.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (zu8.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (i) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174564b.o(LargeActionButton.ButtonStyle.f58725a);
        d3().f174565c.setNavigationButtonIcon(this.K.d.a());
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new ww8.c(this, continuation, 0), 3);
        lx8.a aVar = this.K.d;
        aVar.getClass();
        if (aVar != lx8.a.NONE) {
            ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new ww8.c(this, continuation, 1), 3);
        }
        ViewController.P2(this, rd0.e.b(this.P.f53220l), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52371h.f121375b), new ww8.e(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.TRUE;
    }
}
