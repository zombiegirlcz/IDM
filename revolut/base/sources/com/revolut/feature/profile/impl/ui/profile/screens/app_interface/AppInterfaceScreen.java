package com.revolut.feature.profile.impl.ui.profile.screens.app_interface;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.profile.impl.R$string;
import com.revolut.feature.profile.impl.ui.profile.screens.app_interface.AppInterfaceScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import fma.c0;
import fma.r;
import jii.m;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import qg4.d;
import qna.c;
import qna.g;
import te0.w;
import vc.s;
import xki.e;
import yhm.j;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/screens/app_interface/AppInterfaceScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lqna/g;", "<init>", "()V", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppInterfaceScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AppInterfaceScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final RowDelegate K = new RowDelegate(null, null, 7);
    public final h L = s.t(this, a.f);
    public final boolean M = true;
    public final int N = R$layout.screen_recycler_navbar;
    public final Object O;
    public final Object P;
    public final Lazy Q;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
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

    public AppInterfaceScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: qna.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppInterfaceScreen f247898b;

            {
                this.f247898b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AppInterfaceScreen appInterfaceScreen = this.f247898b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AppInterfaceScreen.R;
                        return (s) ((fma.r) appInterfaceScreen.Q.getValue()).f136217a.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AppInterfaceScreen.R;
                        AppInterfaceScreen appInterfaceScreen2 = this.f247898b;
                        return dli.f.a(appInterfaceScreen2, (s) appInterfaceScreen2.O.getValue(), u.c(appInterfaceScreen2.K), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr3 = AppInterfaceScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(appInterfaceScreen.m2()).a().get(pla.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", pla.b.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).G0;
                        fma.r rVar = new fma.r();
                        rVar.f136217a = e4m.b.b(new fma.q(c0Var, 0));
                        return rVar;
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: qna.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppInterfaceScreen f247898b;

            {
                this.f247898b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AppInterfaceScreen appInterfaceScreen = this.f247898b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AppInterfaceScreen.R;
                        return (s) ((fma.r) appInterfaceScreen.Q.getValue()).f136217a.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AppInterfaceScreen.R;
                        AppInterfaceScreen appInterfaceScreen2 = this.f247898b;
                        return dli.f.a(appInterfaceScreen2, (s) appInterfaceScreen2.O.getValue(), u.c(appInterfaceScreen2.K), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr3 = AppInterfaceScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(appInterfaceScreen.m2()).a().get(pla.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", pla.b.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).G0;
                        fma.r rVar = new fma.r();
                        rVar.f136217a = e4m.b.b(new fma.q(c0Var, 0));
                        return rVar;
                }
            }
        });
        final int i3 = 2;
        this.Q = j.b(new Function0(this) { // from class: qna.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppInterfaceScreen f247898b;

            {
                this.f247898b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AppInterfaceScreen appInterfaceScreen = this.f247898b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AppInterfaceScreen.R;
                        return (s) ((fma.r) appInterfaceScreen.Q.getValue()).f136217a.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AppInterfaceScreen.R;
                        AppInterfaceScreen appInterfaceScreen2 = this.f247898b;
                        return dli.f.a(appInterfaceScreen2, (s) appInterfaceScreen2.O.getValue(), u.c(appInterfaceScreen2.K), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr3 = AppInterfaceScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(appInterfaceScreen.m2()).a().get(pla.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", pla.b.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).G0;
                        fma.r rVar = new fma.r();
                        rVar.f136217a = e4m.b.b(new fma.q(c0Var, 0));
                        return rVar;
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((g) oVar);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (qna.s) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.profileHome_interfaceSettings_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new d(this, null, 14), 3);
        RowDelegate rowDelegate = this.K;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new qna.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53225r), null, new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
