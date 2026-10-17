package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods.SigningMethodsScreen;
import com.revolut.kompot.common.R$layout;
import dw3.c1;
import dw3.h4;
import dw3.n6;
import dw3.t5;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import ve4.b;
import ve4.c;
import ve4.d;
import ve4.m;
import ve4.n;
import ve4.p;
import ve4.r;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_signature/signing_methods/SigningMethodsScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lve4/m;", "Ldli/a;", "Lve4/r;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SigningMethodsScreen extends PluginScreenController<m> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(SigningMethodsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object M;
    public final Object N;
    public final Object R;
    public final int L = R$layout.screen_recycler_navbar_nextbutton;
    public final h O = s.t(this, a.f);
    public final RowDelegate P = new RowDelegate(null, null, 7);
    public final FullScreenStateDelegate Q = new FullScreenStateDelegate();

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

    public SigningMethodsScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ve4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SigningMethodsScreen f288112b;

            {
                this.f288112b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SigningMethodsScreen signingMethodsScreen = this.f288112b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SigningMethodsScreen.S;
                        qji.b bVarU2 = signingMethodsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods.di.SigningMethodsScreenInjector");
                        h4 h4Var = (h4) bVarU2;
                        c1 c1Var = h4Var.f118875c;
                        h4 h4Var2 = h4Var.d;
                        n6 n6Var = new n6();
                        n6Var.f119358a = e4m.b.b(e4m.c.a(signingMethodsScreen));
                        int i3 = 7;
                        t5 t5Var = new t5(c1Var, h4Var2, n6Var, 1, i3);
                        n6Var.f119359b = t5Var;
                        n6Var.f119360c = e4m.b.b(t5Var);
                        n6Var.d = e4m.b.b(new t5(c1Var, h4Var2, n6Var, 0, i3));
                        n6Var.e = e4m.b.b(new t5(c1Var, h4Var2, n6Var, 3, i3));
                        n6Var.f = e4m.b.b(new t5(c1Var, h4Var2, n6Var, 2, i3));
                        n6Var.f119361g = e4m.b.b(n6Var.f119359b);
                        n6Var.f119362h = e4m.b.b(new t5(c1Var, h4Var2, n6Var, 4, i3));
                        return n6Var;
                    case 1:
                        KProperty[] kPropertyArr2 = SigningMethodsScreen.S;
                        return (n) ((n6) signingMethodsScreen.M.getValue()).f119362h.get();
                    default:
                        KProperty[] kPropertyArr3 = SigningMethodsScreen.S;
                        SigningMethodsScreen signingMethodsScreen2 = this.f288112b;
                        return dli.f.a(signingMethodsScreen2, signingMethodsScreen2.d(), v.k(signingMethodsScreen2.P, signingMethodsScreen2.Q, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ve4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SigningMethodsScreen f288112b;

            {
                this.f288112b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SigningMethodsScreen signingMethodsScreen = this.f288112b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SigningMethodsScreen.S;
                        qji.b bVarU2 = signingMethodsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods.di.SigningMethodsScreenInjector");
                        h4 h4Var = (h4) bVarU2;
                        c1 c1Var = h4Var.f118875c;
                        h4 h4Var2 = h4Var.d;
                        n6 n6Var = new n6();
                        n6Var.f119358a = e4m.b.b(e4m.c.a(signingMethodsScreen));
                        int i3 = 7;
                        t5 t5Var = new t5(c1Var, h4Var2, n6Var, 1, i3);
                        n6Var.f119359b = t5Var;
                        n6Var.f119360c = e4m.b.b(t5Var);
                        n6Var.d = e4m.b.b(new t5(c1Var, h4Var2, n6Var, 0, i3));
                        n6Var.e = e4m.b.b(new t5(c1Var, h4Var2, n6Var, 3, i3));
                        n6Var.f = e4m.b.b(new t5(c1Var, h4Var2, n6Var, 2, i3));
                        n6Var.f119361g = e4m.b.b(n6Var.f119359b);
                        n6Var.f119362h = e4m.b.b(new t5(c1Var, h4Var2, n6Var, 4, i3));
                        return n6Var;
                    case 1:
                        KProperty[] kPropertyArr2 = SigningMethodsScreen.S;
                        return (n) ((n6) signingMethodsScreen.M.getValue()).f119362h.get();
                    default:
                        KProperty[] kPropertyArr3 = SigningMethodsScreen.S;
                        SigningMethodsScreen signingMethodsScreen2 = this.f288112b;
                        return dli.f.a(signingMethodsScreen2, signingMethodsScreen2.d(), v.k(signingMethodsScreen2.P, signingMethodsScreen2.Q, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: ve4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SigningMethodsScreen f288112b;

            {
                this.f288112b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SigningMethodsScreen signingMethodsScreen = this.f288112b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SigningMethodsScreen.S;
                        qji.b bVarU2 = signingMethodsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods.di.SigningMethodsScreenInjector");
                        h4 h4Var = (h4) bVarU2;
                        c1 c1Var = h4Var.f118875c;
                        h4 h4Var2 = h4Var.d;
                        n6 n6Var = new n6();
                        n6Var.f119358a = e4m.b.b(e4m.c.a(signingMethodsScreen));
                        int i32 = 7;
                        t5 t5Var = new t5(c1Var, h4Var2, n6Var, 1, i32);
                        n6Var.f119359b = t5Var;
                        n6Var.f119360c = e4m.b.b(t5Var);
                        n6Var.d = e4m.b.b(new t5(c1Var, h4Var2, n6Var, 0, i32));
                        n6Var.e = e4m.b.b(new t5(c1Var, h4Var2, n6Var, 3, i32));
                        n6Var.f = e4m.b.b(new t5(c1Var, h4Var2, n6Var, 2, i32));
                        n6Var.f119361g = e4m.b.b(n6Var.f119359b);
                        n6Var.f119362h = e4m.b.b(new t5(c1Var, h4Var2, n6Var, 4, i32));
                        return n6Var;
                    case 1:
                        KProperty[] kPropertyArr2 = SigningMethodsScreen.S;
                        return (n) ((n6) signingMethodsScreen.M.getValue()).f119362h.get();
                    default:
                        KProperty[] kPropertyArr3 = SigningMethodsScreen.S;
                        SigningMethodsScreen signingMethodsScreen2 = this.f288112b;
                        return dli.f.a(signingMethodsScreen2, signingMethodsScreen2.d(), v.k(signingMethodsScreen2.P, signingMethodsScreen2.Q, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        p pVar = uiState.f288127b;
        if (pVar instanceof ve4.o) {
            NavBarWithToolbar navBarWithToolbar = d3().f174565c;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
            ve4.o oVar2 = (ve4.o) pVar;
            navBarWithToolbar.setTitle(oVar2.f288122a, null);
            d3().f174565c.setSecondDescriptionText(oVar2.f288123b);
            NavBarWithToolbar navBarWithToolbar2 = d3().f174565c;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar2, "navBarWithToolbar");
            navBarWithToolbar2.H0(false);
            d3().f174565c.l0();
        } else if (pVar instanceof p.a) {
            d3().f174565c.l0();
            NavBarWithToolbar navBarWithToolbar3 = d3().f174565c;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar3, "navBarWithToolbar");
            navBarWithToolbar3.j0(false);
        } else {
            if (!(pVar instanceof ve4.q)) {
                throw new NoWhenBranchMatchedException();
            }
            NavBarWithToolbar navBarWithToolbar4 = d3().f174565c;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar4, "navBarWithToolbar");
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar4.H0(false);
            NavBarWithToolbar navBarWithToolbar5 = d3().f174565c;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar5, "navBarWithToolbar");
            navBarWithToolbar5.I0(t3.DEFAULT, false);
        }
        d3().f174564b.setText(uiState.f288128c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n6) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        d3().f174565c.setHeaderTitleMode(j0.MULTILINE);
        d3().f174565c.setSecondDescriptionVisible(true);
        d3().f174564b.o(LargeActionButton.ButtonStyle.o);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new b(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f53218h), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f52371h.f121375b), null, new d(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
