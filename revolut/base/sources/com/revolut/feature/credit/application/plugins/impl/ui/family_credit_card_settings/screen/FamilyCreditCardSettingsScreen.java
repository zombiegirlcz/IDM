package com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.FamilyCreditCardSettingsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.FamilyCreditCardSettingsScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import dw3.c1;
import dw3.e3;
import dw3.f3;
import hb4.h;
import hb4.i;
import hb4.j;
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
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/family_credit_card_settings/screen/FamilyCreditCardSettingsScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lhb4/h;", "Ldli/a;", "Lhb4/j;", "Lbx4/c;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FamilyCreditCardSettingsScreen extends PluginScreenController<h> implements dli.a, bx4.c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(FamilyCreditCardSettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final FamilyCreditCardSettingsScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final ao.h P;
    public final Object Q;
    public final FullScreenStateDelegate R;
    public f S;

    public FamilyCreditCardSettingsScreen(FamilyCreditCardSettingsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: hb4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FamilyCreditCardSettingsScreen f150597b;

            {
                this.f150597b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FamilyCreditCardSettingsScreen familyCreditCardSettingsScreen = this.f150597b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FamilyCreditCardSettingsScreen.T;
                        qji.b bVarU2 = familyCreditCardSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.di.FamilyCreditCardSettingsScreenInjector");
                        e3 e3Var = (e3) bVarU2;
                        c1 c1Var = e3Var.f118629c;
                        e3 e3Var2 = e3Var.d;
                        FamilyCreditCardSettingsScreenContract$InputData familyCreditCardSettingsScreenContract$InputData = familyCreditCardSettingsScreen.L;
                        familyCreditCardSettingsScreenContract$InputData.getClass();
                        return new f3(c1Var, e3Var2, familyCreditCardSettingsScreen, familyCreditCardSettingsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FamilyCreditCardSettingsScreen.T;
                        return (i) ((f3) familyCreditCardSettingsScreen.N.getValue()).f118714j.get();
                    default:
                        KProperty[] kPropertyArr3 = FamilyCreditCardSettingsScreen.T;
                        FamilyCreditCardSettingsScreen familyCreditCardSettingsScreen2 = this.f150597b;
                        return dli.f.a(familyCreditCardSettingsScreen2, familyCreditCardSettingsScreen2.d(), d0.E0(u.c(familyCreditCardSettingsScreen2.R), ((f3) familyCreditCardSettingsScreen2.N.getValue()).c().Q()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: hb4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FamilyCreditCardSettingsScreen f150597b;

            {
                this.f150597b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FamilyCreditCardSettingsScreen familyCreditCardSettingsScreen = this.f150597b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FamilyCreditCardSettingsScreen.T;
                        qji.b bVarU2 = familyCreditCardSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.di.FamilyCreditCardSettingsScreenInjector");
                        e3 e3Var = (e3) bVarU2;
                        c1 c1Var = e3Var.f118629c;
                        e3 e3Var2 = e3Var.d;
                        FamilyCreditCardSettingsScreenContract$InputData familyCreditCardSettingsScreenContract$InputData = familyCreditCardSettingsScreen.L;
                        familyCreditCardSettingsScreenContract$InputData.getClass();
                        return new f3(c1Var, e3Var2, familyCreditCardSettingsScreen, familyCreditCardSettingsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FamilyCreditCardSettingsScreen.T;
                        return (i) ((f3) familyCreditCardSettingsScreen.N.getValue()).f118714j.get();
                    default:
                        KProperty[] kPropertyArr3 = FamilyCreditCardSettingsScreen.T;
                        FamilyCreditCardSettingsScreen familyCreditCardSettingsScreen2 = this.f150597b;
                        return dli.f.a(familyCreditCardSettingsScreen2, familyCreditCardSettingsScreen2.d(), d0.E0(u.c(familyCreditCardSettingsScreen2.R), ((f3) familyCreditCardSettingsScreen2.N.getValue()).c().Q()), 0, null, null, null, 60);
                }
            }
        });
        this.P = s.t(this, hb4.b.f);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: hb4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FamilyCreditCardSettingsScreen f150597b;

            {
                this.f150597b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FamilyCreditCardSettingsScreen familyCreditCardSettingsScreen = this.f150597b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FamilyCreditCardSettingsScreen.T;
                        qji.b bVarU2 = familyCreditCardSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.di.FamilyCreditCardSettingsScreenInjector");
                        e3 e3Var = (e3) bVarU2;
                        c1 c1Var = e3Var.f118629c;
                        e3 e3Var2 = e3Var.d;
                        FamilyCreditCardSettingsScreenContract$InputData familyCreditCardSettingsScreenContract$InputData = familyCreditCardSettingsScreen.L;
                        familyCreditCardSettingsScreenContract$InputData.getClass();
                        return new f3(c1Var, e3Var2, familyCreditCardSettingsScreen, familyCreditCardSettingsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FamilyCreditCardSettingsScreen.T;
                        return (i) ((f3) familyCreditCardSettingsScreen.N.getValue()).f118714j.get();
                    default:
                        KProperty[] kPropertyArr3 = FamilyCreditCardSettingsScreen.T;
                        FamilyCreditCardSettingsScreen familyCreditCardSettingsScreen2 = this.f150597b;
                        return dli.f.a(familyCreditCardSettingsScreen2, familyCreditCardSettingsScreen2.d(), d0.E0(u.c(familyCreditCardSettingsScreen2.R), ((f3) familyCreditCardSettingsScreen2.N.getValue()).c().Q()), 0, null, null, null, 60);
                }
            }
        });
        this.R = new FullScreenStateDelegate();
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        KProperty[] kPropertyArr = T;
        KProperty kProperty = kPropertyArr[0];
        ao.h hVar = this.P;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.u) value).f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        TextLocalisedClause textLocalisedClause = uiState.f150603b;
        Clause clause = uiState.d;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        Clause clause2 = uiState.f150604c;
        navBarWithToolbar.setSecondDescriptionVisible(clause2 != null);
        navBarWithToolbar.setSecondDescriptionText(clause2);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        LargeActionButton goToButton = ((jii.u) value2).f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setText(clause);
        goToButton.setVisibility(clause == null ? 8 : 0);
        f fVar = this.S;
        if (fVar != null) {
            fVar.b(uiState.e);
        } else {
            Intrinsics.r("mainButtonLoadingController");
            throw null;
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((e) d()).C2(hb4.f.f150600a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f3) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = T;
        KProperty kProperty = kPropertyArr[0];
        ao.h hVar = this.P;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.u) value).f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar2 = ((jii.u) value2).f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar2, "navBarWithToolbar");
        navBarWithToolbar2.setHeaderTitleMode(j0.MULTILINE_LARGE);
        ViewBinding value3 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        LargeActionButton goToButton = ((jii.u) value3).f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        this.S = goToButton.A.V();
        ((dli.c) this.Q.getValue()).h().setTag(R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = T;
        KProperty kProperty = kPropertyArr[0];
        ao.h hVar = this.P;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.u) value).f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new hb4.d(this, null, 1), 3);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        LargeActionButton goToButton = ((jii.u) value2).f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(goToButton.o), null, new hb4.d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f52371h.f121375b), null, new hb4.c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
