package com.revolut.feature.credit.application.plugins.impl.ui.offer.content;

import a84.b;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.f0;
import aw3.k;
import bx4.c;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.content.OfferContentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.content.OfferContentScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import dw3.y8;
import dw3.z8;
import ff4.b0;
import ff4.d;
import ff4.q;
import ff4.r;
import ff4.u;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rr0.f;
import te0.w;
import tx0.j0;
import vc.s;
import w01.g;
import xki.e;
import yhm.j;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer/content/OfferContentScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lff4/q;", "Ldli/a;", "Lff4/s;", "Lbx4/c;", "La84/b;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OfferContentScreen extends PluginScreenController<q> implements a, c, b {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(OfferContentScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditRecyclerNavbarTwinbuttonsBinding;", 0))};
    public final OfferContentScreenContract$InputData L;
    public final int M;
    public final Lazy N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final h S;
    public final ActionsDelegate T;
    public final FullScreenStateDelegate U;
    public f V;

    public OfferContentScreen(OfferContentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_credit_recycler_navbar_twinbuttons;
        final int i = 0;
        this.N = j.b(new Function0(this) { // from class: ff4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OfferContentScreen f134714b;

            {
                this.f134714b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OfferContentScreen offerContentScreen = this.f134714b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OfferContentScreen.W;
                        View rootView = offerContentScreen.m2().getWindow().getDecorView().getRootView();
                        Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        return new w01.c((ViewGroup) rootView);
                    case 1:
                        KProperty[] kPropertyArr2 = OfferContentScreen.W;
                        qji.b bVarU2 = offerContentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer.content.di.OfferContentScreenInjector");
                        y8 y8Var = (y8) ((gf4.a) bVarU2).j().mo3808a(offerContentScreen);
                        OfferContentScreenContract$InputData offerContentScreenContract$InputData = offerContentScreen.L;
                        switch (y8Var.f120242a) {
                            case 0:
                                offerContentScreenContract$InputData.getClass();
                                y8Var.d = offerContentScreenContract$InputData;
                                break;
                            default:
                                offerContentScreenContract$InputData.getClass();
                                y8Var.d = offerContentScreenContract$InputData;
                                break;
                        }
                        return (z8) y8Var.mo3783build();
                    case 2:
                        KProperty[] kPropertyArr3 = OfferContentScreen.W;
                        z8 z8Var = (z8) offerContentScreen.O.getValue();
                        switch (z8Var.f120320a) {
                            case 0:
                                return (r) z8Var.f120331r.get();
                            default:
                                return (r) z8Var.f120331r.get();
                        }
                    case 3:
                        KProperty[] kPropertyArr4 = OfferContentScreen.W;
                        return ((z8) offerContentScreen.O.getValue()).b();
                    default:
                        KProperty[] kPropertyArr5 = OfferContentScreen.W;
                        OfferContentScreen offerContentScreen2 = this.f134714b;
                        return dli.f.a(offerContentScreen2, offerContentScreen2.d(), zhm.d0.E0(zhm.v.k(offerContentScreen2.T, offerContentScreen2.U), ((z8) offerContentScreen2.O.getValue()).c().Q()), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ff4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OfferContentScreen f134714b;

            {
                this.f134714b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OfferContentScreen offerContentScreen = this.f134714b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OfferContentScreen.W;
                        View rootView = offerContentScreen.m2().getWindow().getDecorView().getRootView();
                        Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        return new w01.c((ViewGroup) rootView);
                    case 1:
                        KProperty[] kPropertyArr2 = OfferContentScreen.W;
                        qji.b bVarU2 = offerContentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer.content.di.OfferContentScreenInjector");
                        y8 y8Var = (y8) ((gf4.a) bVarU2).j().mo3808a(offerContentScreen);
                        OfferContentScreenContract$InputData offerContentScreenContract$InputData = offerContentScreen.L;
                        switch (y8Var.f120242a) {
                            case 0:
                                offerContentScreenContract$InputData.getClass();
                                y8Var.d = offerContentScreenContract$InputData;
                                break;
                            default:
                                offerContentScreenContract$InputData.getClass();
                                y8Var.d = offerContentScreenContract$InputData;
                                break;
                        }
                        return (z8) y8Var.mo3783build();
                    case 2:
                        KProperty[] kPropertyArr3 = OfferContentScreen.W;
                        z8 z8Var = (z8) offerContentScreen.O.getValue();
                        switch (z8Var.f120320a) {
                            case 0:
                                return (r) z8Var.f120331r.get();
                            default:
                                return (r) z8Var.f120331r.get();
                        }
                    case 3:
                        KProperty[] kPropertyArr4 = OfferContentScreen.W;
                        return ((z8) offerContentScreen.O.getValue()).b();
                    default:
                        KProperty[] kPropertyArr5 = OfferContentScreen.W;
                        OfferContentScreen offerContentScreen2 = this.f134714b;
                        return dli.f.a(offerContentScreen2, offerContentScreen2.d(), zhm.d0.E0(zhm.v.k(offerContentScreen2.T, offerContentScreen2.U), ((z8) offerContentScreen2.O.getValue()).c().Q()), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: ff4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OfferContentScreen f134714b;

            {
                this.f134714b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                OfferContentScreen offerContentScreen = this.f134714b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OfferContentScreen.W;
                        View rootView = offerContentScreen.m2().getWindow().getDecorView().getRootView();
                        Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        return new w01.c((ViewGroup) rootView);
                    case 1:
                        KProperty[] kPropertyArr2 = OfferContentScreen.W;
                        qji.b bVarU2 = offerContentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer.content.di.OfferContentScreenInjector");
                        y8 y8Var = (y8) ((gf4.a) bVarU2).j().mo3808a(offerContentScreen);
                        OfferContentScreenContract$InputData offerContentScreenContract$InputData = offerContentScreen.L;
                        switch (y8Var.f120242a) {
                            case 0:
                                offerContentScreenContract$InputData.getClass();
                                y8Var.d = offerContentScreenContract$InputData;
                                break;
                            default:
                                offerContentScreenContract$InputData.getClass();
                                y8Var.d = offerContentScreenContract$InputData;
                                break;
                        }
                        return (z8) y8Var.mo3783build();
                    case 2:
                        KProperty[] kPropertyArr3 = OfferContentScreen.W;
                        z8 z8Var = (z8) offerContentScreen.O.getValue();
                        switch (z8Var.f120320a) {
                            case 0:
                                return (r) z8Var.f120331r.get();
                            default:
                                return (r) z8Var.f120331r.get();
                        }
                    case 3:
                        KProperty[] kPropertyArr4 = OfferContentScreen.W;
                        return ((z8) offerContentScreen.O.getValue()).b();
                    default:
                        KProperty[] kPropertyArr5 = OfferContentScreen.W;
                        OfferContentScreen offerContentScreen2 = this.f134714b;
                        return dli.f.a(offerContentScreen2, offerContentScreen2.d(), zhm.d0.E0(zhm.v.k(offerContentScreen2.T, offerContentScreen2.U), ((z8) offerContentScreen2.O.getValue()).c().Q()), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.Q = w.y0(new Function0(this) { // from class: ff4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OfferContentScreen f134714b;

            {
                this.f134714b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                OfferContentScreen offerContentScreen = this.f134714b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OfferContentScreen.W;
                        View rootView = offerContentScreen.m2().getWindow().getDecorView().getRootView();
                        Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        return new w01.c((ViewGroup) rootView);
                    case 1:
                        KProperty[] kPropertyArr2 = OfferContentScreen.W;
                        qji.b bVarU2 = offerContentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer.content.di.OfferContentScreenInjector");
                        y8 y8Var = (y8) ((gf4.a) bVarU2).j().mo3808a(offerContentScreen);
                        OfferContentScreenContract$InputData offerContentScreenContract$InputData = offerContentScreen.L;
                        switch (y8Var.f120242a) {
                            case 0:
                                offerContentScreenContract$InputData.getClass();
                                y8Var.d = offerContentScreenContract$InputData;
                                break;
                            default:
                                offerContentScreenContract$InputData.getClass();
                                y8Var.d = offerContentScreenContract$InputData;
                                break;
                        }
                        return (z8) y8Var.mo3783build();
                    case 2:
                        KProperty[] kPropertyArr3 = OfferContentScreen.W;
                        z8 z8Var = (z8) offerContentScreen.O.getValue();
                        switch (z8Var.f120320a) {
                            case 0:
                                return (r) z8Var.f120331r.get();
                            default:
                                return (r) z8Var.f120331r.get();
                        }
                    case 3:
                        KProperty[] kPropertyArr4 = OfferContentScreen.W;
                        return ((z8) offerContentScreen.O.getValue()).b();
                    default:
                        KProperty[] kPropertyArr5 = OfferContentScreen.W;
                        OfferContentScreen offerContentScreen2 = this.f134714b;
                        return dli.f.a(offerContentScreen2, offerContentScreen2.d(), zhm.d0.E0(zhm.v.k(offerContentScreen2.T, offerContentScreen2.U), ((z8) offerContentScreen2.O.getValue()).c().Q()), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i6 = 4;
        this.R = w.y0(new Function0(this) { // from class: ff4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OfferContentScreen f134714b;

            {
                this.f134714b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                OfferContentScreen offerContentScreen = this.f134714b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OfferContentScreen.W;
                        View rootView = offerContentScreen.m2().getWindow().getDecorView().getRootView();
                        Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        return new w01.c((ViewGroup) rootView);
                    case 1:
                        KProperty[] kPropertyArr2 = OfferContentScreen.W;
                        qji.b bVarU2 = offerContentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.offer.content.di.OfferContentScreenInjector");
                        y8 y8Var = (y8) ((gf4.a) bVarU2).j().mo3808a(offerContentScreen);
                        OfferContentScreenContract$InputData offerContentScreenContract$InputData = offerContentScreen.L;
                        switch (y8Var.f120242a) {
                            case 0:
                                offerContentScreenContract$InputData.getClass();
                                y8Var.d = offerContentScreenContract$InputData;
                                break;
                            default:
                                offerContentScreenContract$InputData.getClass();
                                y8Var.d = offerContentScreenContract$InputData;
                                break;
                        }
                        return (z8) y8Var.mo3783build();
                    case 2:
                        KProperty[] kPropertyArr3 = OfferContentScreen.W;
                        z8 z8Var = (z8) offerContentScreen.O.getValue();
                        switch (z8Var.f120320a) {
                            case 0:
                                return (r) z8Var.f120331r.get();
                            default:
                                return (r) z8Var.f120331r.get();
                        }
                    case 3:
                        KProperty[] kPropertyArr4 = OfferContentScreen.W;
                        return ((z8) offerContentScreen.O.getValue()).b();
                    default:
                        KProperty[] kPropertyArr5 = OfferContentScreen.W;
                        OfferContentScreen offerContentScreen2 = this.f134714b;
                        return dli.f.a(offerContentScreen2, offerContentScreen2.d(), zhm.d0.E0(zhm.v.k(offerContentScreen2.T, offerContentScreen2.U), ((z8) offerContentScreen2.O.getValue()).c().Q()), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
        this.S = s.t(this, d.f);
        this.T = new ActionsDelegate();
        this.U = new FullScreenStateDelegate();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        ff4.s uiState = (ff4.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a84.a aVar = (a84.a) this.Q.getValue();
        boolean z = uiState.k;
        Clause clause = uiState.i;
        aVar.Q(z, z);
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar creditApplicationNavBarWithToolbar = d3().f10698b;
        Intrinsics.checkNotNullExpressionValue(creditApplicationNavBarWithToolbar, "creditApplicationNavBarWithToolbar");
        Clause clause2 = uiState.f134740b;
        Clause clause3 = uiState.f134743h;
        Clause clause4 = uiState.f;
        creditApplicationNavBarWithToolbar.setTitle(clause2, null);
        if (clause2 != null) {
            creditApplicationNavBarWithToolbar.setToolbarTitle(clause2);
        }
        creditApplicationNavBarWithToolbar.setDescriptionText(clause4);
        creditApplicationNavBarWithToolbar.setDescriptionVisible(clause4 != null);
        f0.t(creditApplicationNavBarWithToolbar, uiState.f134742g, false, 4);
        creditApplicationNavBarWithToolbar.setSecondDescriptionText(clause3);
        creditApplicationNavBarWithToolbar.setSecondDescriptionVisible(clause3 != null);
        creditApplicationNavBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        TwinVerticalButton twinVerticalButtonE = E();
        twinVerticalButtonE.setFabEnabled(clause != null);
        twinVerticalButtonE.setMainButtonText(clause);
        f fVar = this.V;
        if (fVar == null) {
            Intrinsics.r("mainButtonLoadingController");
            throw null;
        }
        fVar.b(uiState.f134744j);
        Integer num = uiState.f134746m;
        if (num != null) {
            ((w01.c) this.N.getValue()).a(num.intValue(), g.CENTER_IN);
            b0 b0Var = (b0) d();
            b0Var.H2(b0Var.f134712t, new u(b0Var, 0));
        }
    }

    @Override // a84.b
    public final TwinVerticalButton E() {
        TwinVerticalButton creditApplicationTwinVerticalButton = d3().d;
        Intrinsics.checkNotNullExpressionValue(creditApplicationTwinVerticalButton, "creditApplicationTwinVerticalButton");
        return creditApplicationTwinVerticalButton;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((b0) d()).J2();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z8) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar creditApplicationNavBarWithToolbar = d3().f10698b;
        Intrinsics.checkNotNullExpressionValue(creditApplicationNavBarWithToolbar, "creditApplicationNavBarWithToolbar");
        creditApplicationNavBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        creditApplicationNavBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        creditApplicationNavBarWithToolbar.setDescriptionVisible(false);
        creditApplicationNavBarWithToolbar.setEnabled(false);
        this.V = E().l0();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar creditApplicationNavBarWithToolbar = d3().f10698b;
        Intrinsics.checkNotNullExpressionValue(creditApplicationNavBarWithToolbar, "creditApplicationNavBarWithToolbar");
        ViewController.P2(this, rd0.e.b(creditApplicationNavBarWithToolbar.f59410q), new ev7.b(this, null, 29), 3);
        ViewController.P2(this, rd0.e.b(creditApplicationNavBarWithToolbar.x0()), new ff4.f(this, null, 1), 3);
        ViewController.P2(this, new eq8.g(rd0.e.b(this.T.f51611c.f121375b), 19), new ff4.f(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.U.f52371h.f121375b), new ff4.g(this, null), 3);
    }

    public final k d3() {
        ViewBinding value = this.S.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final r d() {
        return (r) this.P.getValue();
    }

    @Override // a84.b
    public final void f1() {
        ((b0) d()).I2();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.M;
    }

    @Override // a84.b
    public final RecyclerView h() {
        ScreenContentRecyclerView creditApplicationRecyclerView = d3().f10699c;
        Intrinsics.checkNotNullExpressionValue(creditApplicationRecyclerView, "creditApplicationRecyclerView");
        return creditApplicationRecyclerView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // a84.b
    public final void o1() {
        NavBarWithToolbar creditApplicationNavBarWithToolbar = d3().f10698b;
        Intrinsics.checkNotNullExpressionValue(creditApplicationNavBarWithToolbar, "creditApplicationNavBarWithToolbar");
        creditApplicationNavBarWithToolbar.setExpanded(false, true);
    }
}
