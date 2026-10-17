package com.revolut.feature.credit.application.plugins.impl.ui.email_verification.screen.enter_email;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.screen.enter_email.VerifyEmailScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.c1;
import dw3.e7;
import dw3.t5;
import dw3.u2;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import t5e.m;
import ta4.b;
import ta4.c;
import ta4.d;
import ta4.f;
import ta4.h;
import ta4.i;
import ta4.j;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/email_verification/screen/enter_email/VerifyEmailScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lta4/h;", "Ldli/a;", "Lta4/i;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VerifyEmailScreen extends PluginScreenController<h> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(VerifyEmailScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object N;
    public final Object P;
    public final Object Q;
    public final ao.h L = s.t(this, a.f);
    public final int M = R$layout.screen_recycler_navbar_nextbutton;
    public final Object O = w.y0(new t73.h(18));

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public VerifyEmailScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ta4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VerifyEmailScreen f269088b;

            {
                this.f269088b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                VerifyEmailScreen verifyEmailScreen = this.f269088b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = VerifyEmailScreen.R;
                        VerifyEmailScreen verifyEmailScreen2 = this.f269088b;
                        return dli.f.a(verifyEmailScreen2, verifyEmailScreen2.d(), zhm.u.c((InputTextDelegate) verifyEmailScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = VerifyEmailScreen.R;
                        qji.b bVarU2 = verifyEmailScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.email_verification.screen.enter_email.di.VerifyEmailScreenInjector");
                        u2 u2Var = (u2) bVarU2;
                        c1 c1Var = u2Var.f119889c;
                        u2 u2Var2 = u2Var.d;
                        e7 e7Var = new e7();
                        e7Var.f118663a = e4m.b.b(e4m.c.a(verifyEmailScreen));
                        int i3 = 12;
                        t5 t5Var = new t5(c1Var, u2Var2, e7Var, 1, i3);
                        e7Var.f118664b = t5Var;
                        e7Var.f118665c = e4m.b.b(t5Var);
                        e7Var.d = e4m.b.b(new t5(c1Var, u2Var2, e7Var, 0, i3));
                        e7Var.e = e4m.b.b(e7Var.f118664b);
                        e7Var.f = e4m.b.b(new t5(c1Var, u2Var2, e7Var, 4, i3));
                        e7Var.f118666g = e4m.b.b(new t5(c1Var, u2Var2, e7Var, 3, i3));
                        e7Var.f118667h = e4m.b.b(new t5(c1Var, u2Var2, e7Var, 2, i3));
                        return e7Var;
                    default:
                        KProperty[] kPropertyArr3 = VerifyEmailScreen.R;
                        return (j) ((e7) verifyEmailScreen.P.getValue()).f118667h.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ta4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VerifyEmailScreen f269088b;

            {
                this.f269088b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                VerifyEmailScreen verifyEmailScreen = this.f269088b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = VerifyEmailScreen.R;
                        VerifyEmailScreen verifyEmailScreen2 = this.f269088b;
                        return dli.f.a(verifyEmailScreen2, verifyEmailScreen2.d(), zhm.u.c((InputTextDelegate) verifyEmailScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = VerifyEmailScreen.R;
                        qji.b bVarU2 = verifyEmailScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.email_verification.screen.enter_email.di.VerifyEmailScreenInjector");
                        u2 u2Var = (u2) bVarU2;
                        c1 c1Var = u2Var.f119889c;
                        u2 u2Var2 = u2Var.d;
                        e7 e7Var = new e7();
                        e7Var.f118663a = e4m.b.b(e4m.c.a(verifyEmailScreen));
                        int i3 = 12;
                        t5 t5Var = new t5(c1Var, u2Var2, e7Var, 1, i3);
                        e7Var.f118664b = t5Var;
                        e7Var.f118665c = e4m.b.b(t5Var);
                        e7Var.d = e4m.b.b(new t5(c1Var, u2Var2, e7Var, 0, i3));
                        e7Var.e = e4m.b.b(e7Var.f118664b);
                        e7Var.f = e4m.b.b(new t5(c1Var, u2Var2, e7Var, 4, i3));
                        e7Var.f118666g = e4m.b.b(new t5(c1Var, u2Var2, e7Var, 3, i3));
                        e7Var.f118667h = e4m.b.b(new t5(c1Var, u2Var2, e7Var, 2, i3));
                        return e7Var;
                    default:
                        KProperty[] kPropertyArr3 = VerifyEmailScreen.R;
                        return (j) ((e7) verifyEmailScreen.P.getValue()).f118667h.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ta4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VerifyEmailScreen f269088b;

            {
                this.f269088b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                VerifyEmailScreen verifyEmailScreen = this.f269088b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = VerifyEmailScreen.R;
                        VerifyEmailScreen verifyEmailScreen2 = this.f269088b;
                        return dli.f.a(verifyEmailScreen2, verifyEmailScreen2.d(), zhm.u.c((InputTextDelegate) verifyEmailScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = VerifyEmailScreen.R;
                        qji.b bVarU2 = verifyEmailScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.email_verification.screen.enter_email.di.VerifyEmailScreenInjector");
                        u2 u2Var = (u2) bVarU2;
                        c1 c1Var = u2Var.f119889c;
                        u2 u2Var2 = u2Var.d;
                        e7 e7Var = new e7();
                        e7Var.f118663a = e4m.b.b(e4m.c.a(verifyEmailScreen));
                        int i32 = 12;
                        t5 t5Var = new t5(c1Var, u2Var2, e7Var, 1, i32);
                        e7Var.f118664b = t5Var;
                        e7Var.f118665c = e4m.b.b(t5Var);
                        e7Var.d = e4m.b.b(new t5(c1Var, u2Var2, e7Var, 0, i32));
                        e7Var.e = e4m.b.b(e7Var.f118664b);
                        e7Var.f = e4m.b.b(new t5(c1Var, u2Var2, e7Var, 4, i32));
                        e7Var.f118666g = e4m.b.b(new t5(c1Var, u2Var2, e7Var, 3, i32));
                        e7Var.f118667h = e4m.b.b(new t5(c1Var, u2Var2, e7Var, 2, i32));
                        return e7Var;
                    default:
                        KProperty[] kPropertyArr3 = VerifyEmailScreen.R;
                        return (j) ((e7) verifyEmailScreen.P.getValue()).f118667h.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f269094b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        d().C2(f.f269091a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e7) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.email_verification_intro_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.email_verification_intro_title, null, null, 14));
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.email_verification_intro_description, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setEnabled(false);
        d3().f174564b.setText(new TextLocalisedClause(R$string.email_verification_intro_button_title, null, null, 14));
        m onChange = new m(this, 22);
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        d3().d.addOnLayoutChangeListener(new androidx.camera.viewfinder.a(onChange, 17));
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new b(this, null, 0), 3);
        ?? r56 = this.O;
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).e.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).i.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).f.f121375b), new t9h.b(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new b(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
