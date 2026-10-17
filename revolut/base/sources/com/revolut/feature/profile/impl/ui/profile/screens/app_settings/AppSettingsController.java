package com.revolut.feature.profile.impl.ui.profile.screens.app_settings;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.profile.impl.ui.profile.screens.app_settings.AppSettingsController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import fma.c0;
import fma.d0;
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
import rlh.c;
import rm0.k;
import rna.f;
import rna.g;
import te0.w;
import vc.s;
import wp5.y;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/screens/app_settings/AppSettingsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrna/f;", "Ldli/a;", "Lrna/g;", "<init>", "()V", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppSettingsController extends ViewController<f> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AppSettingsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object N;
    public final Object O;
    public final Object P;
    public final int K = R$layout.screen_recycler_navbar;
    public final boolean L = true;
    public final h M = s.t(this, a.f);
    public final Object Q = w.y0(new k(5));
    public final Object R = w.y0(new k(6));

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

    public AppSettingsController() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: rna.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppSettingsController f255534b;

            {
                this.f255534b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AppSettingsController appSettingsController = this.f255534b;
                int i3 = 1;
                int i5 = 0;
                int i6 = 2;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AppSettingsController.S;
                        qji.b bVarU2 = appSettingsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.app_settings.di.AppSettingsControllerInjector");
                        c0 c0Var = ((d0) bVarU2).f136085b;
                        fma.s sVar = new fma.s();
                        sVar.f136218a = e4m.b.b(e4m.c.a(appSettingsController));
                        int i21 = 18;
                        sVar.f136219b = e4m.b.b(new fa0.q(c0Var, sVar, i6, i21));
                        sVar.f136220c = e4m.b.b(new fa0.q(c0Var, sVar, i3, i21));
                        sVar.d = e4m.b.b(new fa0.q(c0Var, sVar, i5, i21));
                        sVar.e = e4m.b.b(new fa0.q(c0Var, sVar, 4, i21));
                        sVar.f = e4m.b.b(new fa0.q(c0Var, sVar, 3, i21));
                        return sVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AppSettingsController.S;
                        return (e) ((fma.s) appSettingsController.N.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = AppSettingsController.S;
                        AppSettingsController appSettingsController2 = this.f255534b;
                        return dli.f.a(appSettingsController2, (e) appSettingsController2.O.getValue(), v.k((RowDelegate) appSettingsController2.Q.getValue(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: rna.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppSettingsController f255534b;

            {
                this.f255534b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AppSettingsController appSettingsController = this.f255534b;
                int i3 = 1;
                int i5 = 0;
                int i6 = 2;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AppSettingsController.S;
                        qji.b bVarU2 = appSettingsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.app_settings.di.AppSettingsControllerInjector");
                        c0 c0Var = ((d0) bVarU2).f136085b;
                        fma.s sVar = new fma.s();
                        sVar.f136218a = e4m.b.b(e4m.c.a(appSettingsController));
                        int i21 = 18;
                        sVar.f136219b = e4m.b.b(new fa0.q(c0Var, sVar, i6, i21));
                        sVar.f136220c = e4m.b.b(new fa0.q(c0Var, sVar, i3, i21));
                        sVar.d = e4m.b.b(new fa0.q(c0Var, sVar, i5, i21));
                        sVar.e = e4m.b.b(new fa0.q(c0Var, sVar, 4, i21));
                        sVar.f = e4m.b.b(new fa0.q(c0Var, sVar, 3, i21));
                        return sVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AppSettingsController.S;
                        return (e) ((fma.s) appSettingsController.N.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = AppSettingsController.S;
                        AppSettingsController appSettingsController2 = this.f255534b;
                        return dli.f.a(appSettingsController2, (e) appSettingsController2.O.getValue(), v.k((RowDelegate) appSettingsController2.Q.getValue(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: rna.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppSettingsController f255534b;

            {
                this.f255534b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AppSettingsController appSettingsController = this.f255534b;
                int i32 = 1;
                int i5 = 0;
                int i6 = 2;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AppSettingsController.S;
                        qji.b bVarU2 = appSettingsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.app_settings.di.AppSettingsControllerInjector");
                        c0 c0Var = ((d0) bVarU2).f136085b;
                        fma.s sVar = new fma.s();
                        sVar.f136218a = e4m.b.b(e4m.c.a(appSettingsController));
                        int i21 = 18;
                        sVar.f136219b = e4m.b.b(new fa0.q(c0Var, sVar, i6, i21));
                        sVar.f136220c = e4m.b.b(new fa0.q(c0Var, sVar, i32, i21));
                        sVar.d = e4m.b.b(new fa0.q(c0Var, sVar, i5, i21));
                        sVar.e = e4m.b.b(new fa0.q(c0Var, sVar, 4, i21));
                        sVar.f = e4m.b.b(new fa0.q(c0Var, sVar, 3, i21));
                        return sVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AppSettingsController.S;
                        return (e) ((fma.s) appSettingsController.N.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = AppSettingsController.S;
                        AppSettingsController appSettingsController2 = this.f255534b;
                        return dli.f.a(appSettingsController2, (e) appSettingsController2.O.getValue(), v.k((RowDelegate) appSettingsController2.Q.getValue(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setToolbarTitle(uiState.f255538a);
        navBarWithToolbar.setTitle(uiState.f255538a, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (fma.s) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (rna.e) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((fma.s) this.N.getValue()).f136220c.get()).d(v.k((RowDelegate) this.Q.getValue(), (LargeActionButtonDelegate) this.R.getValue()));
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new c(this, null, 4), 3);
        ?? r56 = this.Q;
        com.revolut.kompot.navigable.a.g2(this, y.x(((RowDelegate) r56.getValue()).f53218h, ((RowDelegate) r56.getValue()).f53225r, "mergeWith(...)"), null, new rna.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.R.getValue()).d.f121375b), null, new rna.c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getS() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
