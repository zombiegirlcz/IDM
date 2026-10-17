package com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.TrustedWifisListScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import vtc.e0;
import vtc.n;
import vtc.t;
import vtc.x;
import yi5.b;
import zhm.u;
import zhm.v;
import zvc.c;
import zvc.e;
import zvc.f;
import zvc.g;
import zvc.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/street_mode/trusted_wifis_list/TrustedWifisListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzvc/e;", "Ldli/a;", "Lzvc/g;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrustedWifisListScreen extends ViewController<e> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TrustedWifisListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object N;
    public final Object O;
    public final Object Q;
    public final h K = s.t(this, a.f);
    public final RowDelegate L = new RowDelegate(null, null, 7);
    public final FullScreenStateDelegate M = new FullScreenStateDelegate();
    public final int P = R$layout.screen_recycler_navbar;

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

    public TrustedWifisListScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: zvc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrustedWifisListScreen f325642b;

            {
                this.f325642b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TrustedWifisListScreen trustedWifisListScreen = this.f325642b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TrustedWifisListScreen.R;
                        return (f) ((e0) trustedWifisListScreen.O.getValue()).f291970b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TrustedWifisListScreen.R;
                        qji.b bVarU2 = trustedWifisListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.di.TrustedWifisListScreenInjector");
                        t tVar = ((x) bVarU2).f292093b;
                        e0 e0Var = new e0();
                        e0Var.f291969a = e4m.b.b(e4m.c.a(trustedWifisListScreen));
                        e0Var.f291970b = e4m.b.b(new n(tVar, e0Var, 4));
                        return e0Var;
                    default:
                        KProperty[] kPropertyArr3 = TrustedWifisListScreen.R;
                        TrustedWifisListScreen trustedWifisListScreen2 = this.f325642b;
                        return dli.f.a(trustedWifisListScreen2, trustedWifisListScreen2.R2(), v.k(trustedWifisListScreen2.L, trustedWifisListScreen2.M, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: zvc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrustedWifisListScreen f325642b;

            {
                this.f325642b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TrustedWifisListScreen trustedWifisListScreen = this.f325642b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TrustedWifisListScreen.R;
                        return (f) ((e0) trustedWifisListScreen.O.getValue()).f291970b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TrustedWifisListScreen.R;
                        qji.b bVarU2 = trustedWifisListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.di.TrustedWifisListScreenInjector");
                        t tVar = ((x) bVarU2).f292093b;
                        e0 e0Var = new e0();
                        e0Var.f291969a = e4m.b.b(e4m.c.a(trustedWifisListScreen));
                        e0Var.f291970b = e4m.b.b(new n(tVar, e0Var, 4));
                        return e0Var;
                    default:
                        KProperty[] kPropertyArr3 = TrustedWifisListScreen.R;
                        TrustedWifisListScreen trustedWifisListScreen2 = this.f325642b;
                        return dli.f.a(trustedWifisListScreen2, trustedWifisListScreen2.R2(), v.k(trustedWifisListScreen2.L, trustedWifisListScreen2.M, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: zvc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrustedWifisListScreen f325642b;

            {
                this.f325642b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TrustedWifisListScreen trustedWifisListScreen = this.f325642b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TrustedWifisListScreen.R;
                        return (f) ((e0) trustedWifisListScreen.O.getValue()).f291970b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TrustedWifisListScreen.R;
                        qji.b bVarU2 = trustedWifisListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.di.TrustedWifisListScreenInjector");
                        t tVar = ((x) bVarU2).f292093b;
                        e0 e0Var = new e0();
                        e0Var.f291969a = e4m.b.b(e4m.c.a(trustedWifisListScreen));
                        e0Var.f291970b = e4m.b.b(new n(tVar, e0Var, 4));
                        return e0Var;
                    default:
                        KProperty[] kPropertyArr3 = TrustedWifisListScreen.R;
                        TrustedWifisListScreen trustedWifisListScreen2 = this.f325642b;
                        return dli.f.a(trustedWifisListScreen2, trustedWifisListScreen2.R2(), v.k(trustedWifisListScreen2.L, trustedWifisListScreen2.M, new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (e0) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void X2(int i, String[] permissionsKeys, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissionsKeys, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.X2(i, permissionsKeys, grantResults);
        com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a aVar = (com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a) R2();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(permissionsKeys, "permissionsKeys");
        if (i == 2009 && d.I(permissionsKeys, "android.permission.ACCESS_FINE_LOCATION")) {
            int i2 = j.f325651a[aVar.f85705s.d(aVar.f85704r.m2(), u.c("android.permission.ACCESS_FINE_LOCATION")).ordinal()];
            if (i2 == 1) {
                aVar.l2(new zp5.g(aVar, null, 6), new b(26));
            } else if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.security_hub_street_mode_trusted_wifi_list_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.security_hub_street_mode_trusted_wifi_list_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.security_hub_street_mode_trusted_wifi_list_subtitle, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new zub.b(this, null, 3), 3);
        RowDelegate rowDelegate = this.L;
        ViewController.P2(this, vkm.q.J(rd0.e.b(rowDelegate.f53218h), rd0.e.b(rowDelegate.k), rd0.e.b(rowDelegate.f53220l), rd0.e.b(rowDelegate.f53223p)), new zvc.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final f R2() {
        return (f) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
