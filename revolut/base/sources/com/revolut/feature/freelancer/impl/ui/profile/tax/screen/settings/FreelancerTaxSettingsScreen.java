package com.revolut.feature.freelancer.impl.ui.profile.tax.screen.settings;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.profile.tax.screen.settings.FreelancerTaxSettingsScreen;
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
import pki.b;
import te0.w;
import u07.c;
import u07.d;
import u07.i;
import u07.k;
import u07.l;
import us6.c1;
import us6.d1;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/tax/screen/settings/FreelancerTaxSettingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lu07/i;", "Ldli/a;", "Lu07/k;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerTaxSettingsScreen extends ViewController<i> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(FreelancerTaxSettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final FullScreenStateDelegate M = new FullScreenStateDelegate();
    public final RowDelegate N = new RowDelegate(null, null, 7);
    public final Object O;
    public final Object P;
    public final Object Q;

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

    public FreelancerTaxSettingsScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: u07.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerTaxSettingsScreen f276077b;

            {
                this.f276077b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerTaxSettingsScreen freelancerTaxSettingsScreen = this.f276077b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerTaxSettingsScreen.R;
                        qji.b bVarU2 = freelancerTaxSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.profile.tax.screen.settings.di.FreelancerTaxSettingsScreenInjector");
                        c1 c1Var = (c1) bVarU2;
                        return new d1(c1Var.f282472a, c1Var.f282473b);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerTaxSettingsScreen.R;
                        return (l) ((d1) freelancerTaxSettingsScreen.O.getValue()).f282491b.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerTaxSettingsScreen.R;
                        FreelancerTaxSettingsScreen freelancerTaxSettingsScreen2 = this.f276077b;
                        return dli.f.a(freelancerTaxSettingsScreen2, (l) freelancerTaxSettingsScreen2.P.getValue(), v.k(new RowLoadingDelegate(), freelancerTaxSettingsScreen2.N, freelancerTaxSettingsScreen2.M), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: u07.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerTaxSettingsScreen f276077b;

            {
                this.f276077b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerTaxSettingsScreen freelancerTaxSettingsScreen = this.f276077b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerTaxSettingsScreen.R;
                        qji.b bVarU2 = freelancerTaxSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.profile.tax.screen.settings.di.FreelancerTaxSettingsScreenInjector");
                        c1 c1Var = (c1) bVarU2;
                        return new d1(c1Var.f282472a, c1Var.f282473b);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerTaxSettingsScreen.R;
                        return (l) ((d1) freelancerTaxSettingsScreen.O.getValue()).f282491b.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerTaxSettingsScreen.R;
                        FreelancerTaxSettingsScreen freelancerTaxSettingsScreen2 = this.f276077b;
                        return dli.f.a(freelancerTaxSettingsScreen2, (l) freelancerTaxSettingsScreen2.P.getValue(), v.k(new RowLoadingDelegate(), freelancerTaxSettingsScreen2.N, freelancerTaxSettingsScreen2.M), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: u07.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerTaxSettingsScreen f276077b;

            {
                this.f276077b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerTaxSettingsScreen freelancerTaxSettingsScreen = this.f276077b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerTaxSettingsScreen.R;
                        qji.b bVarU2 = freelancerTaxSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.profile.tax.screen.settings.di.FreelancerTaxSettingsScreenInjector");
                        c1 c1Var = (c1) bVarU2;
                        return new d1(c1Var.f282472a, c1Var.f282473b);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerTaxSettingsScreen.R;
                        return (l) ((d1) freelancerTaxSettingsScreen.O.getValue()).f282491b.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerTaxSettingsScreen.R;
                        FreelancerTaxSettingsScreen freelancerTaxSettingsScreen2 = this.f276077b;
                        return dli.f.a(freelancerTaxSettingsScreen2, (l) freelancerTaxSettingsScreen2.P.getValue(), v.k(new RowLoadingDelegate(), freelancerTaxSettingsScreen2.N, freelancerTaxSettingsScreen2.M), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((k) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d1) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (l) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_settings_taxes_header_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new u07.b(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
