package com.revolut.sso.impl.ui.passkeys_management.passkeys_list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.R$id;
import com.revolut.sso.impl.R$layout;
import com.revolut.sso.impl.ui.passkeys_management.passkeys_list.PasskeysListController;
import dkl.m;
import ec8.c;
import eol.d;
import eol.f;
import eol.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import ljl.f0;
import ljl.g0;
import ljl.q0;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/impl/ui/passkeys_management/passkeys_list/PasskeysListController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Leol/f;", "Ldli/a;", "Leol/g;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PasskeysListController extends ViewController<f> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PasskeysListController.class, "binding", "getBinding()Lcom/revolut/sso/impl/databinding/ScreenPasskeysListBinding;", 0))};
    public final Object N;
    public final Object P;
    public final Object Q;
    public final h K = s.t(this, a.f);
    public final RowDelegate L = new RowDelegate(null, null, 7);
    public final FullScreenStateDelegate M = new FullScreenStateDelegate();
    public final int O = R$layout.screen_passkeys_list;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/sso/impl/databinding/ScreenPasskeysListBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new m((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public PasskeysListController() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: eol.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasskeysListController f127995b;

            {
                this.f127995b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PasskeysListController passkeysListController = this.f127995b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PasskeysListController.R;
                        qji.b bVarU2 = passkeysListController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.passkeys_management.passkeys_list.di.PasskeysListControllerComponentInjector");
                        g0 g0Var = (g0) bVarU2;
                        q0 q0Var = g0Var.f195948a;
                        g0 g0Var2 = g0Var.f195949b;
                        f0 f0Var = new f0();
                        int i3 = 8;
                        f0Var.f195938a = e4m.b.b(new ld1.q(q0Var, g0Var2, f0Var, 1, i3));
                        f0Var.f195939b = e4m.b.b(new ld1.q(q0Var, g0Var2, f0Var, 0, i3));
                        f0Var.f195940c = e4m.b.b(e4m.c.a(passkeysListController));
                        f0Var.d = e4m.b.b(new ld1.q(q0Var, g0Var2, f0Var, 3, i3));
                        f0Var.e = e4m.b.b(new ld1.q(q0Var, g0Var2, f0Var, 4, i3));
                        f0Var.f = e4m.b.b(new ld1.q(q0Var, g0Var2, f0Var, 2, i3));
                        return f0Var;
                    case 1:
                        KProperty[] kPropertyArr2 = PasskeysListController.R;
                        return (d) ((f0) passkeysListController.N.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = PasskeysListController.R;
                        PasskeysListController passkeysListController2 = this.f127995b;
                        return dli.f.a(passkeysListController2, (d) passkeysListController2.P.getValue(), v.k(new RowLoadingDelegate(), passkeysListController2.L, passkeysListController2.M), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: eol.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasskeysListController f127995b;

            {
                this.f127995b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PasskeysListController passkeysListController = this.f127995b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PasskeysListController.R;
                        qji.b bVarU2 = passkeysListController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.passkeys_management.passkeys_list.di.PasskeysListControllerComponentInjector");
                        g0 g0Var = (g0) bVarU2;
                        q0 q0Var = g0Var.f195948a;
                        g0 g0Var2 = g0Var.f195949b;
                        f0 f0Var = new f0();
                        int i3 = 8;
                        f0Var.f195938a = e4m.b.b(new ld1.q(q0Var, g0Var2, f0Var, 1, i3));
                        f0Var.f195939b = e4m.b.b(new ld1.q(q0Var, g0Var2, f0Var, 0, i3));
                        f0Var.f195940c = e4m.b.b(e4m.c.a(passkeysListController));
                        f0Var.d = e4m.b.b(new ld1.q(q0Var, g0Var2, f0Var, 3, i3));
                        f0Var.e = e4m.b.b(new ld1.q(q0Var, g0Var2, f0Var, 4, i3));
                        f0Var.f = e4m.b.b(new ld1.q(q0Var, g0Var2, f0Var, 2, i3));
                        return f0Var;
                    case 1:
                        KProperty[] kPropertyArr2 = PasskeysListController.R;
                        return (d) ((f0) passkeysListController.N.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = PasskeysListController.R;
                        PasskeysListController passkeysListController2 = this.f127995b;
                        return dli.f.a(passkeysListController2, (d) passkeysListController2.P.getValue(), v.k(new RowLoadingDelegate(), passkeysListController2.L, passkeysListController2.M), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: eol.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasskeysListController f127995b;

            {
                this.f127995b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PasskeysListController passkeysListController = this.f127995b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PasskeysListController.R;
                        qji.b bVarU2 = passkeysListController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.passkeys_management.passkeys_list.di.PasskeysListControllerComponentInjector");
                        g0 g0Var = (g0) bVarU2;
                        q0 q0Var = g0Var.f195948a;
                        g0 g0Var2 = g0Var.f195949b;
                        f0 f0Var = new f0();
                        int i32 = 8;
                        f0Var.f195938a = e4m.b.b(new ld1.q(q0Var, g0Var2, f0Var, 1, i32));
                        f0Var.f195939b = e4m.b.b(new ld1.q(q0Var, g0Var2, f0Var, 0, i32));
                        f0Var.f195940c = e4m.b.b(e4m.c.a(passkeysListController));
                        f0Var.d = e4m.b.b(new ld1.q(q0Var, g0Var2, f0Var, 3, i32));
                        f0Var.e = e4m.b.b(new ld1.q(q0Var, g0Var2, f0Var, 4, i32));
                        f0Var.f = e4m.b.b(new ld1.q(q0Var, g0Var2, f0Var, 2, i32));
                        return f0Var;
                    case 1:
                        KProperty[] kPropertyArr2 = PasskeysListController.R;
                        return (d) ((f0) passkeysListController.N.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = PasskeysListController.R;
                        PasskeysListController passkeysListController2 = this.f127995b;
                        return dli.f.a(passkeysListController2, (d) passkeysListController2.P.getValue(), v.k(new RowLoadingDelegate(), passkeysListController2.L, passkeysListController2.M), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f115667b.setMenuItems(uiState.f127999a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (d) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f115667b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_passkeys_management_title, null, null, 14);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f115667b.f59410q), null, new c(this, null, 19), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f115667b.o.f57403b), null, new enb.f(this, null, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f53220l), null, new eol.b(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
