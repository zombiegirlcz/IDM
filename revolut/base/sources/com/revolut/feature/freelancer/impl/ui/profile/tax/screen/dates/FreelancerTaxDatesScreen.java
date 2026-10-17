package com.revolut.feature.freelancer.impl.ui.profile.tax.screen.dates;

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
import com.revolut.feature.freelancer.impl.ui.profile.tax.screen.dates.FreelancerTaxDatesScreen;
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
import qg4.d;
import r07.c;
import r07.e;
import r07.g;
import te0.w;
import us6.b1;
import us6.c1;
import us6.z;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/tax/screen/dates/FreelancerTaxDatesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lr07/e;", "Ldli/a;", "Lr07/g;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerTaxDatesScreen extends ViewController<e> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(FreelancerTaxDatesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
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

    public FreelancerTaxDatesScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: r07.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerTaxDatesScreen f250707b;

            {
                this.f250707b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerTaxDatesScreen freelancerTaxDatesScreen = this.f250707b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerTaxDatesScreen.R;
                        qji.b bVarU2 = freelancerTaxDatesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.profile.tax.screen.dates.di.FreelancerTaxDatesScreenInjector");
                        us6.q qVar = ((c1) bVarU2).f282472a;
                        b1 b1Var = new b1();
                        b1Var.f282460a = e4m.b.b(new z(qVar, b1Var, 3));
                        return b1Var;
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerTaxDatesScreen.R;
                        return (h) ((b1) freelancerTaxDatesScreen.O.getValue()).f282460a.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerTaxDatesScreen.R;
                        FreelancerTaxDatesScreen freelancerTaxDatesScreen2 = this.f250707b;
                        return dli.f.a(freelancerTaxDatesScreen2, (h) freelancerTaxDatesScreen2.P.getValue(), v.k(new RowLoadingDelegate(), freelancerTaxDatesScreen2.N, freelancerTaxDatesScreen2.M), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: r07.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerTaxDatesScreen f250707b;

            {
                this.f250707b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerTaxDatesScreen freelancerTaxDatesScreen = this.f250707b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerTaxDatesScreen.R;
                        qji.b bVarU2 = freelancerTaxDatesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.profile.tax.screen.dates.di.FreelancerTaxDatesScreenInjector");
                        us6.q qVar = ((c1) bVarU2).f282472a;
                        b1 b1Var = new b1();
                        b1Var.f282460a = e4m.b.b(new z(qVar, b1Var, 3));
                        return b1Var;
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerTaxDatesScreen.R;
                        return (h) ((b1) freelancerTaxDatesScreen.O.getValue()).f282460a.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerTaxDatesScreen.R;
                        FreelancerTaxDatesScreen freelancerTaxDatesScreen2 = this.f250707b;
                        return dli.f.a(freelancerTaxDatesScreen2, (h) freelancerTaxDatesScreen2.P.getValue(), v.k(new RowLoadingDelegate(), freelancerTaxDatesScreen2.N, freelancerTaxDatesScreen2.M), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: r07.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerTaxDatesScreen f250707b;

            {
                this.f250707b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerTaxDatesScreen freelancerTaxDatesScreen = this.f250707b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerTaxDatesScreen.R;
                        qji.b bVarU2 = freelancerTaxDatesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.profile.tax.screen.dates.di.FreelancerTaxDatesScreenInjector");
                        us6.q qVar = ((c1) bVarU2).f282472a;
                        b1 b1Var = new b1();
                        b1Var.f282460a = e4m.b.b(new z(qVar, b1Var, 3));
                        return b1Var;
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerTaxDatesScreen.R;
                        return (h) ((b1) freelancerTaxDatesScreen.O.getValue()).f282460a.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerTaxDatesScreen.R;
                        FreelancerTaxDatesScreen freelancerTaxDatesScreen2 = this.f250707b;
                        return dli.f.a(freelancerTaxDatesScreen2, (h) freelancerTaxDatesScreen2.P.getValue(), v.k(new RowLoadingDelegate(), freelancerTaxDatesScreen2.N, freelancerTaxDatesScreen2.M), 0, null, null, null, 60);
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
        return (b1) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (r07.h) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_settings_tax_dates_header_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new d(this, null, 29), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new r07.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
