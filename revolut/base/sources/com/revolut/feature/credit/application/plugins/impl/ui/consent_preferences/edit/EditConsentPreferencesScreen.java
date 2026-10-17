package com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b74.b;
import b74.c;
import b74.d;
import b74.g;
import b74.i;
import b74.j;
import b74.k;
import b74.l;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.EditConsentPreferencesScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.EditConsentPreferencesScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.core.R$string;
import dw3.c1;
import dw3.t2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jmrtd.lds.LDSFile;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/consent_preferences/edit/EditConsentPreferencesScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lb74/i;", "Ldli/a;", "Lb74/k;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EditConsentPreferencesScreen extends PluginScreenController<i> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(EditConsentPreferencesScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditRecyclerNavbarTwinbuttonsBinding;", 0))};
    public final EditConsentPreferencesScreenContract$InputData L;
    public final int M;
    public final h N;
    public final RowDelegate O;
    public final DatePickerDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public EditConsentPreferencesScreen(EditConsentPreferencesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_credit_recycler_navbar_twinbuttons;
        this.N = s.t(this, b.f);
        this.O = new RowDelegate(null, null, 7);
        this.P = new DatePickerDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: b74.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditConsentPreferencesScreen f12885b;

            {
                this.f12885b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EditConsentPreferencesScreen editConsentPreferencesScreen = this.f12885b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EditConsentPreferencesScreen.T;
                        qji.b bVarU2 = editConsentPreferencesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.di.EditConsentPreferencesScreenInjector");
                        dw3.o0 o0Var = (dw3.o0) bVarU2;
                        c1 c1Var = o0Var.f119383c;
                        dw3.o0 o0Var2 = o0Var.d;
                        EditConsentPreferencesScreenContract$InputData editConsentPreferencesScreenContract$InputData = editConsentPreferencesScreen.L;
                        editConsentPreferencesScreenContract$InputData.getClass();
                        return new t2(c1Var, o0Var2, editConsentPreferencesScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EditConsentPreferencesScreen.T;
                        return (j) ((t2) editConsentPreferencesScreen.Q.getValue()).f119826b.get();
                    default:
                        KProperty[] kPropertyArr3 = EditConsentPreferencesScreen.T;
                        int i3 = R$id.creditApplication_recyclerView;
                        EditConsentPreferencesScreen editConsentPreferencesScreen2 = this.f12885b;
                        return dli.f.a(editConsentPreferencesScreen2, editConsentPreferencesScreen2.d(), zhm.v.k(editConsentPreferencesScreen2.O, editConsentPreferencesScreen2.P, new FooterTextDelegate()), i3, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: b74.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditConsentPreferencesScreen f12885b;

            {
                this.f12885b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EditConsentPreferencesScreen editConsentPreferencesScreen = this.f12885b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EditConsentPreferencesScreen.T;
                        qji.b bVarU2 = editConsentPreferencesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.di.EditConsentPreferencesScreenInjector");
                        dw3.o0 o0Var = (dw3.o0) bVarU2;
                        c1 c1Var = o0Var.f119383c;
                        dw3.o0 o0Var2 = o0Var.d;
                        EditConsentPreferencesScreenContract$InputData editConsentPreferencesScreenContract$InputData = editConsentPreferencesScreen.L;
                        editConsentPreferencesScreenContract$InputData.getClass();
                        return new t2(c1Var, o0Var2, editConsentPreferencesScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EditConsentPreferencesScreen.T;
                        return (j) ((t2) editConsentPreferencesScreen.Q.getValue()).f119826b.get();
                    default:
                        KProperty[] kPropertyArr3 = EditConsentPreferencesScreen.T;
                        int i3 = R$id.creditApplication_recyclerView;
                        EditConsentPreferencesScreen editConsentPreferencesScreen2 = this.f12885b;
                        return dli.f.a(editConsentPreferencesScreen2, editConsentPreferencesScreen2.d(), zhm.v.k(editConsentPreferencesScreen2.O, editConsentPreferencesScreen2.P, new FooterTextDelegate()), i3, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: b74.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditConsentPreferencesScreen f12885b;

            {
                this.f12885b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EditConsentPreferencesScreen editConsentPreferencesScreen = this.f12885b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EditConsentPreferencesScreen.T;
                        qji.b bVarU2 = editConsentPreferencesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.di.EditConsentPreferencesScreenInjector");
                        dw3.o0 o0Var = (dw3.o0) bVarU2;
                        c1 c1Var = o0Var.f119383c;
                        dw3.o0 o0Var2 = o0Var.d;
                        EditConsentPreferencesScreenContract$InputData editConsentPreferencesScreenContract$InputData = editConsentPreferencesScreen.L;
                        editConsentPreferencesScreenContract$InputData.getClass();
                        return new t2(c1Var, o0Var2, editConsentPreferencesScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EditConsentPreferencesScreen.T;
                        return (j) ((t2) editConsentPreferencesScreen.Q.getValue()).f119826b.get();
                    default:
                        KProperty[] kPropertyArr3 = EditConsentPreferencesScreen.T;
                        int i32 = R$id.creditApplication_recyclerView;
                        EditConsentPreferencesScreen editConsentPreferencesScreen2 = this.f12885b;
                        return dli.f.a(editConsentPreferencesScreen2, editConsentPreferencesScreen2.d(), zhm.v.k(editConsentPreferencesScreen2.O, editConsentPreferencesScreen2.P, new FooterTextDelegate()), i32, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f10698b;
        TextLocalisedClause textLocalisedClause = uiState.f12892b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(uiState.f12893c);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        TwinVerticalButton twinVerticalButton = d3().d;
        twinVerticalButton.setMainButtonText(uiState.d);
        twinVerticalButton.setMainButtonEnabled(uiState.e);
        twinVerticalButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.credit_application_quick_scroll_action, null, null, 14), LDSFile.EF_DG4_TAG));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((l) d()).C2(g.f12889a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t2) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f10698b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        d3().d.setSecondaryButtonVisible(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f10698b.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.o0()), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f53218h), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52176c.f121375b), null, new b74.e(this, null, 0), 3);
    }

    public final aw3.k d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (aw3.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.R.getValue();
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
