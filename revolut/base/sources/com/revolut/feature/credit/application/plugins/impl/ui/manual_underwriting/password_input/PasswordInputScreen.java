package com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.password_input;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.password_input.PasswordInputScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.password_input.PasswordInputScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import dli.a;
import dw3.b4;
import dw3.c1;
import dw3.x4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import vd4.b;
import vd4.c;
import vd4.d;
import vd4.f;
import vd4.i;
import vd4.k;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/password_input/PasswordInputScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lvd4/f;", "Ldli/a;", "Lvd4/i;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PasswordInputScreen extends PluginScreenController<f> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PasswordInputScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final PasswordInputScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final InputTextDelegate P;
    public final Object Q;
    public final h R;

    public PasswordInputScreen(PasswordInputScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: vd4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasswordInputScreen f287776b;

            {
                this.f287776b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PasswordInputScreen passwordInputScreen = this.f287776b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PasswordInputScreen.S;
                        qji.b bVarU2 = passwordInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.password_input.di.PasswordInputScreenInjector");
                        b4 b4Var = (b4) bVarU2;
                        c1 c1Var = b4Var.f118345c;
                        b4 b4Var2 = b4Var.d;
                        PasswordInputScreenContract$InputData passwordInputScreenContract$InputData = passwordInputScreen.L;
                        passwordInputScreenContract$InputData.getClass();
                        return new x4(c1Var, b4Var2, passwordInputScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PasswordInputScreen.S;
                        return (k) ((x4) passwordInputScreen.N.getValue()).f120145b.get();
                    default:
                        KProperty[] kPropertyArr3 = PasswordInputScreen.S;
                        PasswordInputScreen passwordInputScreen2 = this.f287776b;
                        return dli.f.a(passwordInputScreen2, (k) passwordInputScreen2.O.getValue(), u.c(passwordInputScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: vd4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasswordInputScreen f287776b;

            {
                this.f287776b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PasswordInputScreen passwordInputScreen = this.f287776b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PasswordInputScreen.S;
                        qji.b bVarU2 = passwordInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.password_input.di.PasswordInputScreenInjector");
                        b4 b4Var = (b4) bVarU2;
                        c1 c1Var = b4Var.f118345c;
                        b4 b4Var2 = b4Var.d;
                        PasswordInputScreenContract$InputData passwordInputScreenContract$InputData = passwordInputScreen.L;
                        passwordInputScreenContract$InputData.getClass();
                        return new x4(c1Var, b4Var2, passwordInputScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PasswordInputScreen.S;
                        return (k) ((x4) passwordInputScreen.N.getValue()).f120145b.get();
                    default:
                        KProperty[] kPropertyArr3 = PasswordInputScreen.S;
                        PasswordInputScreen passwordInputScreen2 = this.f287776b;
                        return dli.f.a(passwordInputScreen2, (k) passwordInputScreen2.O.getValue(), u.c(passwordInputScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new InputTextDelegate(null);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: vd4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasswordInputScreen f287776b;

            {
                this.f287776b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PasswordInputScreen passwordInputScreen = this.f287776b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PasswordInputScreen.S;
                        qji.b bVarU2 = passwordInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.password_input.di.PasswordInputScreenInjector");
                        b4 b4Var = (b4) bVarU2;
                        c1 c1Var = b4Var.f118345c;
                        b4 b4Var2 = b4Var.d;
                        PasswordInputScreenContract$InputData passwordInputScreenContract$InputData = passwordInputScreen.L;
                        passwordInputScreenContract$InputData.getClass();
                        return new x4(c1Var, b4Var2, passwordInputScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PasswordInputScreen.S;
                        return (k) ((x4) passwordInputScreen.N.getValue()).f120145b.get();
                    default:
                        KProperty[] kPropertyArr3 = PasswordInputScreen.S;
                        PasswordInputScreen passwordInputScreen2 = this.f287776b;
                        return dli.f.a(passwordInputScreen2, (k) passwordInputScreen2.O.getValue(), u.c(passwordInputScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = s.t(this, b.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        jii.u uVarD3 = d3();
        uVarD3.f174564b.setEnabled(uiState.f287787b);
        uVarD3.f174564b.setText(new TextLocalisedClause(R$string.credit_common_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x4) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (k) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.credit_manual_underwriting_upload_add_password_document_password, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.credit_manual_underwriting_upload_add_password_document_password, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.credit_manual_underwriting_upload_add_password_document_title, u.c(new TextClause(this.L.f67964b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setEnabled(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new uwe.f(this, null, 19), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.e.f121375b), null, new d(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.R.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
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
