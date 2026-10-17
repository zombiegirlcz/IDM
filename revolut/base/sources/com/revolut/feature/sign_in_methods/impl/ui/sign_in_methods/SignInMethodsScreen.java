package com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.SignInMethodsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import vc.s;
import vjd.c;
import wjd.f;
import wjd.g;
import wjd.j;
import wjd.k;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/sign_in_methods/impl/ui/sign_in_methods/SignInMethodsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lwjd/k;", "feature_sign_in_methods_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SignInMethodsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(SignInMethodsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final SignInMethodsScreenContract$InputData K;
    public final int L = R$layout.screen_recycler_navbar;
    public final h M = s.t(this, f.f);
    public final boolean N = true;
    public final RowDelegate O = new RowDelegate(null, null, 7);
    public final Object P;
    public final Object Q;
    public final Object R;

    public SignInMethodsScreen(SignInMethodsScreenContract$InputData signInMethodsScreenContract$InputData) {
        this.K = signInMethodsScreenContract$InputData;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: wjd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignInMethodsScreen f298044b;

            {
                this.f298044b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SignInMethodsScreen signInMethodsScreen = this.f298044b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SignInMethodsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(signInMethodsScreen.m2()).a().get(vjd.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new vjd.c(((vjd.b) aVar2.b()).f289709c, signInMethodsScreen.K);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", vjd.b.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = SignInMethodsScreen.S;
                        return (j) ((vjd.c) signInMethodsScreen.P.getValue()).f289714h.get();
                    default:
                        KProperty[] kPropertyArr3 = SignInMethodsScreen.S;
                        SignInMethodsScreen signInMethodsScreen2 = this.f298044b;
                        return dli.f.a(signInMethodsScreen2, (j) signInMethodsScreen2.Q.getValue(), v.k(signInMethodsScreen2.O, new RowLoadingDelegate(), new FullScreenStateDelegate()), signInMethodsScreen2.d3().f174540c.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: wjd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignInMethodsScreen f298044b;

            {
                this.f298044b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SignInMethodsScreen signInMethodsScreen = this.f298044b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SignInMethodsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(signInMethodsScreen.m2()).a().get(vjd.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new vjd.c(((vjd.b) aVar2.b()).f289709c, signInMethodsScreen.K);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", vjd.b.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = SignInMethodsScreen.S;
                        return (j) ((vjd.c) signInMethodsScreen.P.getValue()).f289714h.get();
                    default:
                        KProperty[] kPropertyArr3 = SignInMethodsScreen.S;
                        SignInMethodsScreen signInMethodsScreen2 = this.f298044b;
                        return dli.f.a(signInMethodsScreen2, (j) signInMethodsScreen2.Q.getValue(), v.k(signInMethodsScreen2.O, new RowLoadingDelegate(), new FullScreenStateDelegate()), signInMethodsScreen2.d3().f174540c.getId(), null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: wjd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignInMethodsScreen f298044b;

            {
                this.f298044b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SignInMethodsScreen signInMethodsScreen = this.f298044b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SignInMethodsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(signInMethodsScreen.m2()).a().get(vjd.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new vjd.c(((vjd.b) aVar2.b()).f289709c, signInMethodsScreen.K);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", vjd.b.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = SignInMethodsScreen.S;
                        return (j) ((vjd.c) signInMethodsScreen.P.getValue()).f289714h.get();
                    default:
                        KProperty[] kPropertyArr3 = SignInMethodsScreen.S;
                        SignInMethodsScreen signInMethodsScreen2 = this.f298044b;
                        return dli.f.a(signInMethodsScreen2, (j) signInMethodsScreen2.Q.getValue(), v.k(signInMethodsScreen2.O, new RowLoadingDelegate(), new FullScreenStateDelegate()), signInMethodsScreen2.d3().f174540c.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f298049b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        TextLocalisedClause textLocalisedClause2 = uiState.f298050c;
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(textLocalisedClause2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (j) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new w65.c(this, null, 27), 3);
        RowDelegate rowDelegate = this.O;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53225r), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new wjd.h(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
