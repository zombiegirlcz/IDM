package com.revolut.feature.credit.application.plugins.impl.ui.insurance.common;

import a84.b;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw3.k;
import bx4.c;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.insurance.common.InsuranceScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.insurance.common.InsuranceScreenContract$InputData;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dw3.m8;
import dw3.n8;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nuh.j;
import oc4.d;
import oc4.f;
import oc4.g;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.j0;
import vc.s;
import vkm.j2;
import xki.e;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006:\u0001\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/insurance/common/InsuranceScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Loc4/f;", "Ldli/a;", "Loc4/h;", "Lbx4/c;", "La84/b;", "Companion", "a", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InsuranceScreen extends PluginScreenController<f> implements dli.a, c, b {
    public final InsuranceScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final h Q;
    public final FullScreenStateDelegate R;
    public final TabsDelegate S;
    public final Object T;
    public final Object U;
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(InsuranceScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditRecyclerNavbarTwinbuttonsBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public InsuranceScreen(InsuranceScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_credit_recycler_navbar_twinbuttons;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: oc4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceScreen f224091b;

            {
                this.f224091b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InsuranceScreen insuranceScreen = this.f224091b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceScreen.V;
                        qji.b bVarU2 = insuranceScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.insurance.common.di.InsuranceScreenInjector");
                        m8 m8Var = (m8) ((pc4.a) bVarU2).j().mo3808a(insuranceScreen);
                        InsuranceScreenContract$InputData insuranceScreenContract$InputData = insuranceScreen.L;
                        switch (m8Var.f119300a) {
                            case 0:
                                insuranceScreenContract$InputData.getClass();
                                m8Var.d = insuranceScreenContract$InputData;
                                break;
                            default:
                                insuranceScreenContract$InputData.getClass();
                                m8Var.d = insuranceScreenContract$InputData;
                                break;
                        }
                        return (n8) m8Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceScreen.V;
                        n8 n8Var = (n8) insuranceScreen.N.getValue();
                        switch (n8Var.f119366a) {
                            case 0:
                                return (g) n8Var.f119373m.get();
                            default:
                                return (g) n8Var.f119373m.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = InsuranceScreen.V;
                        return ((n8) insuranceScreen.N.getValue()).b();
                    case 3:
                        KProperty[] kPropertyArr4 = InsuranceScreen.V;
                        return d0.E0(v.k(insuranceScreen.R, insuranceScreen.S), ((n8) insuranceScreen.N.getValue()).c().Q());
                    default:
                        KProperty[] kPropertyArr5 = InsuranceScreen.V;
                        InsuranceScreen insuranceScreen2 = this.f224091b;
                        return dli.f.a(insuranceScreen2, insuranceScreen2.d(), (List) insuranceScreen2.T.getValue(), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: oc4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceScreen f224091b;

            {
                this.f224091b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InsuranceScreen insuranceScreen = this.f224091b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceScreen.V;
                        qji.b bVarU2 = insuranceScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.insurance.common.di.InsuranceScreenInjector");
                        m8 m8Var = (m8) ((pc4.a) bVarU2).j().mo3808a(insuranceScreen);
                        InsuranceScreenContract$InputData insuranceScreenContract$InputData = insuranceScreen.L;
                        switch (m8Var.f119300a) {
                            case 0:
                                insuranceScreenContract$InputData.getClass();
                                m8Var.d = insuranceScreenContract$InputData;
                                break;
                            default:
                                insuranceScreenContract$InputData.getClass();
                                m8Var.d = insuranceScreenContract$InputData;
                                break;
                        }
                        return (n8) m8Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceScreen.V;
                        n8 n8Var = (n8) insuranceScreen.N.getValue();
                        switch (n8Var.f119366a) {
                            case 0:
                                return (g) n8Var.f119373m.get();
                            default:
                                return (g) n8Var.f119373m.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = InsuranceScreen.V;
                        return ((n8) insuranceScreen.N.getValue()).b();
                    case 3:
                        KProperty[] kPropertyArr4 = InsuranceScreen.V;
                        return d0.E0(v.k(insuranceScreen.R, insuranceScreen.S), ((n8) insuranceScreen.N.getValue()).c().Q());
                    default:
                        KProperty[] kPropertyArr5 = InsuranceScreen.V;
                        InsuranceScreen insuranceScreen2 = this.f224091b;
                        return dli.f.a(insuranceScreen2, insuranceScreen2.d(), (List) insuranceScreen2.T.getValue(), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: oc4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceScreen f224091b;

            {
                this.f224091b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InsuranceScreen insuranceScreen = this.f224091b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceScreen.V;
                        qji.b bVarU2 = insuranceScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.insurance.common.di.InsuranceScreenInjector");
                        m8 m8Var = (m8) ((pc4.a) bVarU2).j().mo3808a(insuranceScreen);
                        InsuranceScreenContract$InputData insuranceScreenContract$InputData = insuranceScreen.L;
                        switch (m8Var.f119300a) {
                            case 0:
                                insuranceScreenContract$InputData.getClass();
                                m8Var.d = insuranceScreenContract$InputData;
                                break;
                            default:
                                insuranceScreenContract$InputData.getClass();
                                m8Var.d = insuranceScreenContract$InputData;
                                break;
                        }
                        return (n8) m8Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceScreen.V;
                        n8 n8Var = (n8) insuranceScreen.N.getValue();
                        switch (n8Var.f119366a) {
                            case 0:
                                return (g) n8Var.f119373m.get();
                            default:
                                return (g) n8Var.f119373m.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = InsuranceScreen.V;
                        return ((n8) insuranceScreen.N.getValue()).b();
                    case 3:
                        KProperty[] kPropertyArr4 = InsuranceScreen.V;
                        return d0.E0(v.k(insuranceScreen.R, insuranceScreen.S), ((n8) insuranceScreen.N.getValue()).c().Q());
                    default:
                        KProperty[] kPropertyArr5 = InsuranceScreen.V;
                        InsuranceScreen insuranceScreen2 = this.f224091b;
                        return dli.f.a(insuranceScreen2, insuranceScreen2.d(), (List) insuranceScreen2.T.getValue(), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = s.t(this, oc4.b.f);
        this.R = new FullScreenStateDelegate();
        this.S = new TabsDelegate();
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: oc4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceScreen f224091b;

            {
                this.f224091b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                InsuranceScreen insuranceScreen = this.f224091b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceScreen.V;
                        qji.b bVarU2 = insuranceScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.insurance.common.di.InsuranceScreenInjector");
                        m8 m8Var = (m8) ((pc4.a) bVarU2).j().mo3808a(insuranceScreen);
                        InsuranceScreenContract$InputData insuranceScreenContract$InputData = insuranceScreen.L;
                        switch (m8Var.f119300a) {
                            case 0:
                                insuranceScreenContract$InputData.getClass();
                                m8Var.d = insuranceScreenContract$InputData;
                                break;
                            default:
                                insuranceScreenContract$InputData.getClass();
                                m8Var.d = insuranceScreenContract$InputData;
                                break;
                        }
                        return (n8) m8Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceScreen.V;
                        n8 n8Var = (n8) insuranceScreen.N.getValue();
                        switch (n8Var.f119366a) {
                            case 0:
                                return (g) n8Var.f119373m.get();
                            default:
                                return (g) n8Var.f119373m.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = InsuranceScreen.V;
                        return ((n8) insuranceScreen.N.getValue()).b();
                    case 3:
                        KProperty[] kPropertyArr4 = InsuranceScreen.V;
                        return d0.E0(v.k(insuranceScreen.R, insuranceScreen.S), ((n8) insuranceScreen.N.getValue()).c().Q());
                    default:
                        KProperty[] kPropertyArr5 = InsuranceScreen.V;
                        InsuranceScreen insuranceScreen2 = this.f224091b;
                        return dli.f.a(insuranceScreen2, insuranceScreen2.d(), (List) insuranceScreen2.T.getValue(), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i6 = 4;
        this.U = w.y0(new Function0(this) { // from class: oc4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceScreen f224091b;

            {
                this.f224091b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                InsuranceScreen insuranceScreen = this.f224091b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceScreen.V;
                        qji.b bVarU2 = insuranceScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.insurance.common.di.InsuranceScreenInjector");
                        m8 m8Var = (m8) ((pc4.a) bVarU2).j().mo3808a(insuranceScreen);
                        InsuranceScreenContract$InputData insuranceScreenContract$InputData = insuranceScreen.L;
                        switch (m8Var.f119300a) {
                            case 0:
                                insuranceScreenContract$InputData.getClass();
                                m8Var.d = insuranceScreenContract$InputData;
                                break;
                            default:
                                insuranceScreenContract$InputData.getClass();
                                m8Var.d = insuranceScreenContract$InputData;
                                break;
                        }
                        return (n8) m8Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceScreen.V;
                        n8 n8Var = (n8) insuranceScreen.N.getValue();
                        switch (n8Var.f119366a) {
                            case 0:
                                return (g) n8Var.f119373m.get();
                            default:
                                return (g) n8Var.f119373m.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = InsuranceScreen.V;
                        return ((n8) insuranceScreen.N.getValue()).b();
                    case 3:
                        KProperty[] kPropertyArr4 = InsuranceScreen.V;
                        return d0.E0(v.k(insuranceScreen.R, insuranceScreen.S), ((n8) insuranceScreen.N.getValue()).c().Q());
                    default:
                        KProperty[] kPropertyArr5 = InsuranceScreen.V;
                        InsuranceScreen insuranceScreen2 = this.f224091b;
                        return dli.f.a(insuranceScreen2, insuranceScreen2.d(), (List) insuranceScreen2.T.getValue(), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        oc4.h uiState = (oc4.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbarF3 = f3();
        TextLocalisedClause textLocalisedClause = uiState.f224096a;
        Clause clause = uiState.d;
        Clause clause2 = uiState.f224097b;
        navBarWithToolbarF3.setTitle(textLocalisedClause, null);
        navBarWithToolbarF3.setToolbarTitle(textLocalisedClause);
        Clause clause3 = uiState.f224098c;
        navBarWithToolbarF3.setMenuItems(v.l(clause3 != null ? new TextNavBarMenuItem("insurance_right_nav_bar_button", clause3, null, null, 12) : null));
        navBarWithToolbarF3.setSecondDescriptionVisible(clause2 != null);
        navBarWithToolbarF3.setSecondDescriptionText(clause2);
        TwinVerticalButton twinVerticalButtonE = E();
        boolean z = clause != null;
        ((a84.a) this.P.getValue()).Q(z, z);
        twinVerticalButtonE.setMainButtonVisible(z);
        twinVerticalButtonE.setMainButtonText(clause);
        twinVerticalButtonE.setMainButtonEnabled(uiState.e);
        twinVerticalButtonE.setSecondaryButtonVisible(false);
    }

    @Override // a84.b
    public final TwinVerticalButton E() {
        TwinVerticalButton creditApplicationTwinVerticalButton = d3().d;
        Intrinsics.checkNotNullExpressionValue(creditApplicationTwinVerticalButton, "creditApplicationTwinVerticalButton");
        return creditApplicationTwinVerticalButton;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n8) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        f3().setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        f3().setHeaderTitleMode(j0.MULTILINE_LARGE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().f59410q), null, new j(this, null, 29), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().o.f57403b), null, new oc4.c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f53515c.f121375b), null, new oc4.c(this, null, 0), 3);
    }

    public final k d3() {
        ViewBinding value = this.Q.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.O.getValue();
    }

    @Override // a84.b
    public final void f1() {
        oc4.k kVar = (oc4.k) d();
        Object content = ((d) ((j2) kVar.f224100q.f22677a).getValue()).f224094b.getContent();
        if (content == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        kVar.C2(new oc4.e(((mu3.b) content).e));
    }

    public final NavBarWithToolbar f3() {
        NavBarWithToolbar creditApplicationNavBarWithToolbar = d3().f10698b;
        Intrinsics.checkNotNullExpressionValue(creditApplicationNavBarWithToolbar, "creditApplicationNavBarWithToolbar");
        return creditApplicationNavBarWithToolbar;
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
        return (dli.c) this.U.getValue();
    }

    @Override // a84.b
    public final void o1() {
        f3().setExpanded(false, true);
    }
}
