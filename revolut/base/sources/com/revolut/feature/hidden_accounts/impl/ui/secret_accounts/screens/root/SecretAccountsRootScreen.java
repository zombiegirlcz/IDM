package com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.screens.root;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.hidden_accounts.impl.R$string;
import com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.screens.root.SecretAccountsRootScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import m9d.y0;
import mb7.c;
import mb7.h;
import mb7.i;
import mb7.j;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts/screens/root/SecretAccountsRootScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lmb7/h;", "Ldli/a;", "Lmb7/j;", "<init>", "()V", "feature_hidden_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SecretAccountsRootScreen extends ViewController<h> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(SecretAccountsRootScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object M;
    public final Object N;
    public final Object P;
    public final ao.h K = s.t(this, a.f);
    public final RowDelegate L = new RowDelegate(null, null, 7);
    public final int O = R$layout.screen_recycler_navbar;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public SecretAccountsRootScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: mb7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SecretAccountsRootScreen f204172b;

            {
                this.f204172b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SecretAccountsRootScreen secretAccountsRootScreen = this.f204172b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SecretAccountsRootScreen.Q;
                        return (i) ((ta7.h) secretAccountsRootScreen.N.getValue()).f269132b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SecretAccountsRootScreen.Q;
                        qji.b bVarU2 = secretAccountsRootScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.screens.root.di.SecretAccountsRootScreenInjector");
                        ta7.g gVar = (ta7.g) bVarU2;
                        return new ta7.h(gVar.f269128a, gVar.f269129b);
                    default:
                        KProperty[] kPropertyArr3 = SecretAccountsRootScreen.Q;
                        SecretAccountsRootScreen secretAccountsRootScreen2 = this.f204172b;
                        return dli.f.a(secretAccountsRootScreen2, (i) secretAccountsRootScreen2.M.getValue(), u.c(secretAccountsRootScreen2.L), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: mb7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SecretAccountsRootScreen f204172b;

            {
                this.f204172b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SecretAccountsRootScreen secretAccountsRootScreen = this.f204172b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SecretAccountsRootScreen.Q;
                        return (i) ((ta7.h) secretAccountsRootScreen.N.getValue()).f269132b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SecretAccountsRootScreen.Q;
                        qji.b bVarU2 = secretAccountsRootScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.screens.root.di.SecretAccountsRootScreenInjector");
                        ta7.g gVar = (ta7.g) bVarU2;
                        return new ta7.h(gVar.f269128a, gVar.f269129b);
                    default:
                        KProperty[] kPropertyArr3 = SecretAccountsRootScreen.Q;
                        SecretAccountsRootScreen secretAccountsRootScreen2 = this.f204172b;
                        return dli.f.a(secretAccountsRootScreen2, (i) secretAccountsRootScreen2.M.getValue(), u.c(secretAccountsRootScreen2.L), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: mb7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SecretAccountsRootScreen f204172b;

            {
                this.f204172b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SecretAccountsRootScreen secretAccountsRootScreen = this.f204172b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SecretAccountsRootScreen.Q;
                        return (i) ((ta7.h) secretAccountsRootScreen.N.getValue()).f269132b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SecretAccountsRootScreen.Q;
                        qji.b bVarU2 = secretAccountsRootScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.screens.root.di.SecretAccountsRootScreenInjector");
                        ta7.g gVar = (ta7.g) bVarU2;
                        return new ta7.h(gVar.f269128a, gVar.f269129b);
                    default:
                        KProperty[] kPropertyArr3 = SecretAccountsRootScreen.Q;
                        SecretAccountsRootScreen secretAccountsRootScreen2 = this.f204172b;
                        return dli.f.a(secretAccountsRootScreen2, (i) secretAccountsRootScreen2.M.getValue(), u.c(secretAccountsRootScreen2.L), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174539b.setMenuItems(uiState.f204178b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ta7.h) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (i) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.secret_accounts_header_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new y0(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.o.f57403b), new m75.i(this, null, 9), 3);
        ViewController.P2(this, rd0.e.b(this.L.f53220l), new c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.K.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
