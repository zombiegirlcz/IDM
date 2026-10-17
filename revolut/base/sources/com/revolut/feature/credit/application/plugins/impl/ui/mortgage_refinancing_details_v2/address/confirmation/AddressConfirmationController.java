package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.address.confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.MapDelegate;
import com.revolut.core.ui_kit.delegates.MapLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.address.confirmation.AddressConfirmationController;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.address.confirmation.AddressConfirmationControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dw3.c1;
import dw3.g4;
import he4.b;
import he4.c;
import he4.d;
import he4.g;
import he4.p;
import jii.x;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_refinancing_details_v2/address/confirmation/AddressConfirmationController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lhe4/p;", "Ldli/a;", "Lhe4/q;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddressConfirmationController extends PluginScreenController<p> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AddressConfirmationController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final AddressConfirmationControllerContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final FullScreenStateDelegate Q;
    public final Object R;

    public AddressConfirmationController(AddressConfirmationControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_two_buttons;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: he4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressConfirmationController f151576b;

            {
                this.f151576b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddressConfirmationController addressConfirmationController = this.f151576b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddressConfirmationController.S;
                        qji.b bVarU2 = addressConfirmationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.address.confirmation.di.AddressConfirmationControllerInjector");
                        g4 g4Var = (g4) bVarU2;
                        c1 c1Var = g4Var.f118810c;
                        g4 g4Var2 = g4Var.d;
                        AddressConfirmationControllerContract$InputData addressConfirmationControllerContract$InputData = addressConfirmationController.L;
                        addressConfirmationControllerContract$InputData.getClass();
                        return new dw3.s(c1Var, g4Var2, addressConfirmationController, addressConfirmationControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AddressConfirmationController.S;
                        return (s) ((dw3.s) addressConfirmationController.N.getValue()).f119708h.get();
                    default:
                        KProperty[] kPropertyArr3 = AddressConfirmationController.S;
                        AddressConfirmationController addressConfirmationController2 = this.f151576b;
                        return dli.f.a(addressConfirmationController2, addressConfirmationController2.R2(), v.k(addressConfirmationController2.Q, new MapDelegate(), new MapLoadingDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: he4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressConfirmationController f151576b;

            {
                this.f151576b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddressConfirmationController addressConfirmationController = this.f151576b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddressConfirmationController.S;
                        qji.b bVarU2 = addressConfirmationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.address.confirmation.di.AddressConfirmationControllerInjector");
                        g4 g4Var = (g4) bVarU2;
                        c1 c1Var = g4Var.f118810c;
                        g4 g4Var2 = g4Var.d;
                        AddressConfirmationControllerContract$InputData addressConfirmationControllerContract$InputData = addressConfirmationController.L;
                        addressConfirmationControllerContract$InputData.getClass();
                        return new dw3.s(c1Var, g4Var2, addressConfirmationController, addressConfirmationControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AddressConfirmationController.S;
                        return (s) ((dw3.s) addressConfirmationController.N.getValue()).f119708h.get();
                    default:
                        KProperty[] kPropertyArr3 = AddressConfirmationController.S;
                        AddressConfirmationController addressConfirmationController2 = this.f151576b;
                        return dli.f.a(addressConfirmationController2, addressConfirmationController2.R2(), v.k(addressConfirmationController2.Q, new MapDelegate(), new MapLoadingDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = new FullScreenStateDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: he4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressConfirmationController f151576b;

            {
                this.f151576b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddressConfirmationController addressConfirmationController = this.f151576b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddressConfirmationController.S;
                        qji.b bVarU2 = addressConfirmationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.address.confirmation.di.AddressConfirmationControllerInjector");
                        g4 g4Var = (g4) bVarU2;
                        c1 c1Var = g4Var.f118810c;
                        g4 g4Var2 = g4Var.d;
                        AddressConfirmationControllerContract$InputData addressConfirmationControllerContract$InputData = addressConfirmationController.L;
                        addressConfirmationControllerContract$InputData.getClass();
                        return new dw3.s(c1Var, g4Var2, addressConfirmationController, addressConfirmationControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AddressConfirmationController.S;
                        return (s) ((dw3.s) addressConfirmationController.N.getValue()).f119708h.get();
                    default:
                        KProperty[] kPropertyArr3 = AddressConfirmationController.S;
                        AddressConfirmationController addressConfirmationController2 = this.f151576b;
                        return dli.f.a(addressConfirmationController2, addressConfirmationController2.R2(), v.k(addressConfirmationController2.Q, new MapDelegate(), new MapLoadingDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        he4.q uiState = (he4.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        ResourceImage resourceImage = uiState.f151589b;
        Clause clause = uiState.e;
        navBarWithToolbar.setNavigationButtonImage(resourceImage);
        TextLocalisedClause textLocalisedClause = uiState.f151590c;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        LargeActionButton largeActionButton = d3().f174573b;
        Clause clause2 = uiState.d;
        largeActionButton.setText(clause2);
        LargeActionButton screenRecyclerNavbarTwoButtonsFirstButton = d3().f174573b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsFirstButton, "screenRecyclerNavbarTwoButtonsFirstButton");
        screenRecyclerNavbarTwoButtonsFirstButton.setVisibility(clause2 != null ? 0 : 8);
        d3().e.setText(clause);
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        screenRecyclerNavbarTwoButtonsSecondButton.setVisibility(clause != null ? 0 : 8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        R2().J2(g.f151580a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (dw3.s) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174574c.setHeaderTitleMode(j0.MULTILINE);
        d3().e.o(LargeActionButton.ButtonStyle.f58726b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174574c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174573b.o), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().e.o), new c(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new d(this, null), 3);
    }

    public final x d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final he4.s R2() {
        return (he4.s) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
