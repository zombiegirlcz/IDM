package com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListingCardBasicDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.selection.KontomatikSelectionController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.g3;
import dw3.r3;
import dw3.t3;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import tx0.j0;
import vc.s;
import wc4.c;
import wc4.i;
import wc4.j;
import wc4.k;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/kontomatik/selection/KontomatikSelectionController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lwc4/i;", "Ldli/a;", "Lwc4/j;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class KontomatikSelectionController extends PluginScreenController<i> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(KontomatikSelectionController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object M;
    public final Object N;
    public final Object Q;
    public final int L = R$layout.screen_recycler_navbar;
    public final h O = s.t(this, a.f);
    public final ListingCardBasicDelegate P = new ListingCardBasicDelegate();

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

    public KontomatikSelectionController() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: wc4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KontomatikSelectionController f296334b;

            {
                this.f296334b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                KontomatikSelectionController kontomatikSelectionController = this.f296334b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = KontomatikSelectionController.R;
                        qji.b bVarU2 = kontomatikSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.selection.di.KontomatikSelectionControllerInjector");
                        r3 r3Var = ((r3) bVarU2).d;
                        t3 t3Var = new t3();
                        t3Var.f119827a = e4m.b.b(e4m.c.a(kontomatikSelectionController));
                        int i3 = 7;
                        g3 g3Var = new g3(r3Var, t3Var, 1, i3);
                        t3Var.f119828b = g3Var;
                        t3Var.f119829c = e4m.b.b(g3Var);
                        t3Var.d = e4m.b.b(new g3(r3Var, t3Var, 0, i3));
                        t3Var.e = e4m.b.b(t3Var.f119828b);
                        t3Var.f = e4m.b.b(new g3(r3Var, t3Var, 3, i3));
                        t3Var.f119830g = e4m.b.b(new g3(r3Var, t3Var, 2, i3));
                        return t3Var;
                    case 1:
                        KProperty[] kPropertyArr2 = KontomatikSelectionController.R;
                        return (k) ((t3) kontomatikSelectionController.M.getValue()).f119830g.get();
                    default:
                        KProperty[] kPropertyArr3 = KontomatikSelectionController.R;
                        KontomatikSelectionController kontomatikSelectionController2 = this.f296334b;
                        return dli.f.a(kontomatikSelectionController2, (k) kontomatikSelectionController2.N.getValue(), u.c(kontomatikSelectionController2.P), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: wc4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KontomatikSelectionController f296334b;

            {
                this.f296334b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                KontomatikSelectionController kontomatikSelectionController = this.f296334b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = KontomatikSelectionController.R;
                        qji.b bVarU2 = kontomatikSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.selection.di.KontomatikSelectionControllerInjector");
                        r3 r3Var = ((r3) bVarU2).d;
                        t3 t3Var = new t3();
                        t3Var.f119827a = e4m.b.b(e4m.c.a(kontomatikSelectionController));
                        int i3 = 7;
                        g3 g3Var = new g3(r3Var, t3Var, 1, i3);
                        t3Var.f119828b = g3Var;
                        t3Var.f119829c = e4m.b.b(g3Var);
                        t3Var.d = e4m.b.b(new g3(r3Var, t3Var, 0, i3));
                        t3Var.e = e4m.b.b(t3Var.f119828b);
                        t3Var.f = e4m.b.b(new g3(r3Var, t3Var, 3, i3));
                        t3Var.f119830g = e4m.b.b(new g3(r3Var, t3Var, 2, i3));
                        return t3Var;
                    case 1:
                        KProperty[] kPropertyArr2 = KontomatikSelectionController.R;
                        return (k) ((t3) kontomatikSelectionController.M.getValue()).f119830g.get();
                    default:
                        KProperty[] kPropertyArr3 = KontomatikSelectionController.R;
                        KontomatikSelectionController kontomatikSelectionController2 = this.f296334b;
                        return dli.f.a(kontomatikSelectionController2, (k) kontomatikSelectionController2.N.getValue(), u.c(kontomatikSelectionController2.P), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: wc4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KontomatikSelectionController f296334b;

            {
                this.f296334b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                KontomatikSelectionController kontomatikSelectionController = this.f296334b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = KontomatikSelectionController.R;
                        qji.b bVarU2 = kontomatikSelectionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.selection.di.KontomatikSelectionControllerInjector");
                        r3 r3Var = ((r3) bVarU2).d;
                        t3 t3Var = new t3();
                        t3Var.f119827a = e4m.b.b(e4m.c.a(kontomatikSelectionController));
                        int i32 = 7;
                        g3 g3Var = new g3(r3Var, t3Var, 1, i32);
                        t3Var.f119828b = g3Var;
                        t3Var.f119829c = e4m.b.b(g3Var);
                        t3Var.d = e4m.b.b(new g3(r3Var, t3Var, 0, i32));
                        t3Var.e = e4m.b.b(t3Var.f119828b);
                        t3Var.f = e4m.b.b(new g3(r3Var, t3Var, 3, i32));
                        t3Var.f119830g = e4m.b.b(new g3(r3Var, t3Var, 2, i32));
                        return t3Var;
                    case 1:
                        KProperty[] kPropertyArr2 = KontomatikSelectionController.R;
                        return (k) ((t3) kontomatikSelectionController.M.getValue()).f119830g.get();
                    default:
                        KProperty[] kPropertyArr3 = KontomatikSelectionController.R;
                        KontomatikSelectionController kontomatikSelectionController2 = this.f296334b;
                        return dli.f.a(kontomatikSelectionController2, (k) kontomatikSelectionController2.N.getValue(), u.c(kontomatikSelectionController2.P), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonImage(uiState.f296341b);
        TextLocalisedClause textLocalisedClause = uiState.f296342c;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(uiState.d);
        navBarWithToolbar.setSecondDescriptionVisible(uiState.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((k) this.N.getValue()).I2(c.f296335a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t3) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (k) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new w65.c(this, null, 14), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52729c), new wc4.b(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
