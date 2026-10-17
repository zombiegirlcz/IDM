package com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import av8.n;
import aw3.k;
import b74.o;
import b74.p;
import b74.r;
import b74.t;
import b74.v;
import b74.x;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.LegacyEditConsentPreferencesScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.LegacyEditConsentPreferencesScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import dli.c;
import dw3.c1;
import dw3.v3;
import dw3.y3;
import java.util.List;
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

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/consent_preferences/edit/LegacyEditConsentPreferencesScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lb74/v;", "Ldli/a;", "Lb74/x;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LegacyEditConsentPreferencesScreen extends PluginScreenController<v> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(LegacyEditConsentPreferencesScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditRecyclerNavbarTwinbuttonsBinding;", 0))};
    public final LegacyEditConsentPreferencesScreenContract$InputData L;
    public final int M;
    public final h N;
    public final InputChecklistDelegate O;
    public final InputTextDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public LegacyEditConsentPreferencesScreen(LegacyEditConsentPreferencesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_credit_recycler_navbar_twinbuttons;
        this.N = s.t(this, o.f);
        this.O = new InputChecklistDelegate();
        this.P = new InputTextDelegate(new n(this, 24));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: b74.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegacyEditConsentPreferencesScreen f12897b;

            {
                this.f12897b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LegacyEditConsentPreferencesScreen legacyEditConsentPreferencesScreen = this.f12897b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LegacyEditConsentPreferencesScreen.T;
                        qji.b bVarU2 = legacyEditConsentPreferencesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.di.LegacyEditConsentPreferencesScreenInjector");
                        v3 v3Var = (v3) bVarU2;
                        c1 c1Var = v3Var.f119985b;
                        v3 v3Var2 = v3Var.f119986c;
                        LegacyEditConsentPreferencesScreenContract$InputData legacyEditConsentPreferencesScreenContract$InputData = legacyEditConsentPreferencesScreen.L;
                        legacyEditConsentPreferencesScreenContract$InputData.getClass();
                        return new y3(c1Var, v3Var2, legacyEditConsentPreferencesScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LegacyEditConsentPreferencesScreen.T;
                        return (w) ((y3) legacyEditConsentPreferencesScreen.Q.getValue()).f120205c.get();
                    default:
                        KProperty[] kPropertyArr3 = LegacyEditConsentPreferencesScreen.T;
                        int i3 = R$id.creditApplication_recyclerView;
                        LegacyEditConsentPreferencesScreen legacyEditConsentPreferencesScreen2 = this.f12897b;
                        return dli.f.a(legacyEditConsentPreferencesScreen2, legacyEditConsentPreferencesScreen2.d(), zhm.v.k(legacyEditConsentPreferencesScreen2.O, legacyEditConsentPreferencesScreen2.P), i3, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: b74.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegacyEditConsentPreferencesScreen f12897b;

            {
                this.f12897b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LegacyEditConsentPreferencesScreen legacyEditConsentPreferencesScreen = this.f12897b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LegacyEditConsentPreferencesScreen.T;
                        qji.b bVarU2 = legacyEditConsentPreferencesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.di.LegacyEditConsentPreferencesScreenInjector");
                        v3 v3Var = (v3) bVarU2;
                        c1 c1Var = v3Var.f119985b;
                        v3 v3Var2 = v3Var.f119986c;
                        LegacyEditConsentPreferencesScreenContract$InputData legacyEditConsentPreferencesScreenContract$InputData = legacyEditConsentPreferencesScreen.L;
                        legacyEditConsentPreferencesScreenContract$InputData.getClass();
                        return new y3(c1Var, v3Var2, legacyEditConsentPreferencesScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LegacyEditConsentPreferencesScreen.T;
                        return (w) ((y3) legacyEditConsentPreferencesScreen.Q.getValue()).f120205c.get();
                    default:
                        KProperty[] kPropertyArr3 = LegacyEditConsentPreferencesScreen.T;
                        int i3 = R$id.creditApplication_recyclerView;
                        LegacyEditConsentPreferencesScreen legacyEditConsentPreferencesScreen2 = this.f12897b;
                        return dli.f.a(legacyEditConsentPreferencesScreen2, legacyEditConsentPreferencesScreen2.d(), zhm.v.k(legacyEditConsentPreferencesScreen2.O, legacyEditConsentPreferencesScreen2.P), i3, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: b74.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegacyEditConsentPreferencesScreen f12897b;

            {
                this.f12897b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LegacyEditConsentPreferencesScreen legacyEditConsentPreferencesScreen = this.f12897b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LegacyEditConsentPreferencesScreen.T;
                        qji.b bVarU2 = legacyEditConsentPreferencesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.di.LegacyEditConsentPreferencesScreenInjector");
                        v3 v3Var = (v3) bVarU2;
                        c1 c1Var = v3Var.f119985b;
                        v3 v3Var2 = v3Var.f119986c;
                        LegacyEditConsentPreferencesScreenContract$InputData legacyEditConsentPreferencesScreenContract$InputData = legacyEditConsentPreferencesScreen.L;
                        legacyEditConsentPreferencesScreenContract$InputData.getClass();
                        return new y3(c1Var, v3Var2, legacyEditConsentPreferencesScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LegacyEditConsentPreferencesScreen.T;
                        return (w) ((y3) legacyEditConsentPreferencesScreen.Q.getValue()).f120205c.get();
                    default:
                        KProperty[] kPropertyArr3 = LegacyEditConsentPreferencesScreen.T;
                        int i32 = R$id.creditApplication_recyclerView;
                        LegacyEditConsentPreferencesScreen legacyEditConsentPreferencesScreen2 = this.f12897b;
                        return dli.f.a(legacyEditConsentPreferencesScreen2, legacyEditConsentPreferencesScreen2.d(), zhm.v.k(legacyEditConsentPreferencesScreen2.O, legacyEditConsentPreferencesScreen2.P), i32, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        x uiState = (x) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f10698b;
        TextLocalisedClause textLocalisedClause = uiState.f12903b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(uiState.f12904c);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        TwinVerticalButton twinVerticalButton = d3().d;
        twinVerticalButton.setMainButtonText(uiState.d);
        twinVerticalButton.setMainButtonEnabled(uiState.e);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((a) d()).C2(t.f12900a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y3) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f10698b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        d3().d.setSecondaryButtonVisible(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f10698b.f59410q), null, new p(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.o0()), null, new p(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52518c), null, new b74.q(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52577j.f121375b), null, new r(this, null), 3);
    }

    public final k d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final b74.w d() {
        return (b74.w) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.S.getValue();
    }
}
