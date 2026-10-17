package com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.preferences;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw3.k;
import cbf.c;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.preferences.LegacyConsentPreferencesScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.preferences.LegacyConsentPreferencesScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import d74.b;
import d74.d;
import d74.g;
import d74.j;
import d74.l;
import d74.m;
import dli.a;
import dw3.c1;
import dw3.v3;
import dw3.x3;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/consent_preferences/preferences/LegacyConsentPreferencesScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Ld74/j;", "Ldli/a;", "Ld74/l;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LegacyConsentPreferencesScreen extends PluginScreenController<j> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(LegacyConsentPreferencesScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditRecyclerNavbarTwinbuttonsBinding;", 0))};
    public final LegacyConsentPreferencesScreenContract$InputData L;
    public final int M;
    public final h N;
    public final CellDetailsDelegate O;
    public final FullScreenStateDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public LegacyConsentPreferencesScreen(LegacyConsentPreferencesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_credit_recycler_navbar_twinbuttons;
        this.N = s.t(this, b.f);
        this.O = new CellDetailsDelegate();
        this.P = new FullScreenStateDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: d74.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegacyConsentPreferencesScreen f111809b;

            {
                this.f111809b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LegacyConsentPreferencesScreen legacyConsentPreferencesScreen = this.f111809b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LegacyConsentPreferencesScreen.T;
                        qji.b bVarU2 = legacyConsentPreferencesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.preferences.di.LegacyConsentPreferencesScreenInjector");
                        v3 v3Var = (v3) bVarU2;
                        c1 c1Var = v3Var.f119985b;
                        v3 v3Var2 = v3Var.f119986c;
                        LegacyConsentPreferencesScreenContract$InputData legacyConsentPreferencesScreenContract$InputData = legacyConsentPreferencesScreen.L;
                        legacyConsentPreferencesScreenContract$InputData.getClass();
                        return new x3(c1Var, v3Var2, legacyConsentPreferencesScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LegacyConsentPreferencesScreen.T;
                        return (k) ((x3) legacyConsentPreferencesScreen.Q.getValue()).f120143b.get();
                    default:
                        KProperty[] kPropertyArr3 = LegacyConsentPreferencesScreen.T;
                        int i3 = R$id.creditApplication_recyclerView;
                        LegacyConsentPreferencesScreen legacyConsentPreferencesScreen2 = this.f111809b;
                        return dli.f.a(legacyConsentPreferencesScreen2, legacyConsentPreferencesScreen2.d(), v.k(legacyConsentPreferencesScreen2.O, legacyConsentPreferencesScreen2.P, new RowLoadingDelegate()), i3, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: d74.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegacyConsentPreferencesScreen f111809b;

            {
                this.f111809b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LegacyConsentPreferencesScreen legacyConsentPreferencesScreen = this.f111809b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LegacyConsentPreferencesScreen.T;
                        qji.b bVarU2 = legacyConsentPreferencesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.preferences.di.LegacyConsentPreferencesScreenInjector");
                        v3 v3Var = (v3) bVarU2;
                        c1 c1Var = v3Var.f119985b;
                        v3 v3Var2 = v3Var.f119986c;
                        LegacyConsentPreferencesScreenContract$InputData legacyConsentPreferencesScreenContract$InputData = legacyConsentPreferencesScreen.L;
                        legacyConsentPreferencesScreenContract$InputData.getClass();
                        return new x3(c1Var, v3Var2, legacyConsentPreferencesScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LegacyConsentPreferencesScreen.T;
                        return (k) ((x3) legacyConsentPreferencesScreen.Q.getValue()).f120143b.get();
                    default:
                        KProperty[] kPropertyArr3 = LegacyConsentPreferencesScreen.T;
                        int i3 = R$id.creditApplication_recyclerView;
                        LegacyConsentPreferencesScreen legacyConsentPreferencesScreen2 = this.f111809b;
                        return dli.f.a(legacyConsentPreferencesScreen2, legacyConsentPreferencesScreen2.d(), v.k(legacyConsentPreferencesScreen2.O, legacyConsentPreferencesScreen2.P, new RowLoadingDelegate()), i3, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: d74.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegacyConsentPreferencesScreen f111809b;

            {
                this.f111809b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LegacyConsentPreferencesScreen legacyConsentPreferencesScreen = this.f111809b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LegacyConsentPreferencesScreen.T;
                        qji.b bVarU2 = legacyConsentPreferencesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.preferences.di.LegacyConsentPreferencesScreenInjector");
                        v3 v3Var = (v3) bVarU2;
                        c1 c1Var = v3Var.f119985b;
                        v3 v3Var2 = v3Var.f119986c;
                        LegacyConsentPreferencesScreenContract$InputData legacyConsentPreferencesScreenContract$InputData = legacyConsentPreferencesScreen.L;
                        legacyConsentPreferencesScreenContract$InputData.getClass();
                        return new x3(c1Var, v3Var2, legacyConsentPreferencesScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LegacyConsentPreferencesScreen.T;
                        return (k) ((x3) legacyConsentPreferencesScreen.Q.getValue()).f120143b.get();
                    default:
                        KProperty[] kPropertyArr3 = LegacyConsentPreferencesScreen.T;
                        int i32 = R$id.creditApplication_recyclerView;
                        LegacyConsentPreferencesScreen legacyConsentPreferencesScreen2 = this.f111809b;
                        return dli.f.a(legacyConsentPreferencesScreen2, legacyConsentPreferencesScreen2.d(), v.k(legacyConsentPreferencesScreen2.O, legacyConsentPreferencesScreen2.P, new RowLoadingDelegate()), i32, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f10698b;
        TextLocalisedClause textLocalisedClause = uiState.f111818b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(uiState.f111819c);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        TwinVerticalButton twinVerticalButton = d3().d;
        twinVerticalButton.setMainButtonText(uiState.d);
        twinVerticalButton.setFabEnabled(false);
        twinVerticalButton.setMainButtonEnabled(uiState.e);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((m) d()).C2(g.f111812a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x3) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f10698b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        d3().d.setSecondaryButtonVisible(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f10698b.f59410q), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.o0()), null, new d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, new c(rd0.e.b(this.O.f), 28), null, new cvi.j(this, (Continuation) null, 22), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52371h.f121375b), null, new d74.e(this, null), 3);
    }

    public final k d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final d74.k d() {
        return (d74.k) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
