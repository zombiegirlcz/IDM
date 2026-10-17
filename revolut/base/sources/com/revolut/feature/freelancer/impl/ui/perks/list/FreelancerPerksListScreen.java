package com.revolut.feature.freelancer.impl.ui.perks.list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeVoucherLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeVoucherTileDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TabsLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.perks.list.FreelancerPerksListScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import te0.w;
import us6.g0;
import vc.s;
import wz6.b;
import wz6.c;
import wz6.e;
import wz6.f;
import wz6.g;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/perks/list/FreelancerPerksListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwz6/e;", "Ldli/a;", "Lwz6/f;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerPerksListScreen extends ViewController<e> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(FreelancerPerksListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final LargeVoucherTileDelegate M = new LargeVoucherTileDelegate();
    public final TabsDelegate N = new TabsDelegate();
    public final FullScreenStateDelegate O = new FullScreenStateDelegate();
    public final Object P;
    public final Object Q;
    public final Object R;

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

    public FreelancerPerksListScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: wz6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerPerksListScreen f301370b;

            {
                this.f301370b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerPerksListScreen freelancerPerksListScreen = this.f301370b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerPerksListScreen.S;
                        qji.b bVarU2 = freelancerPerksListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.perks.list.di.FreelancerPerksListScreenInjector");
                        g0 g0Var = (g0) bVarU2;
                        return new us6.h0(g0Var.f282547b, g0Var.f282548c);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerPerksListScreen.S;
                        return (g) ((us6.h0) freelancerPerksListScreen.P.getValue()).f282562b.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerPerksListScreen.S;
                        FreelancerPerksListScreen freelancerPerksListScreen2 = this.f301370b;
                        return dli.f.a(freelancerPerksListScreen2, freelancerPerksListScreen2.R2(), v.k(freelancerPerksListScreen2.N, freelancerPerksListScreen2.M, freelancerPerksListScreen2.O, new LargeVoucherLoadingDelegate(), new TabsLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: wz6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerPerksListScreen f301370b;

            {
                this.f301370b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerPerksListScreen freelancerPerksListScreen = this.f301370b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerPerksListScreen.S;
                        qji.b bVarU2 = freelancerPerksListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.perks.list.di.FreelancerPerksListScreenInjector");
                        g0 g0Var = (g0) bVarU2;
                        return new us6.h0(g0Var.f282547b, g0Var.f282548c);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerPerksListScreen.S;
                        return (g) ((us6.h0) freelancerPerksListScreen.P.getValue()).f282562b.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerPerksListScreen.S;
                        FreelancerPerksListScreen freelancerPerksListScreen2 = this.f301370b;
                        return dli.f.a(freelancerPerksListScreen2, freelancerPerksListScreen2.R2(), v.k(freelancerPerksListScreen2.N, freelancerPerksListScreen2.M, freelancerPerksListScreen2.O, new LargeVoucherLoadingDelegate(), new TabsLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: wz6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerPerksListScreen f301370b;

            {
                this.f301370b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerPerksListScreen freelancerPerksListScreen = this.f301370b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerPerksListScreen.S;
                        qji.b bVarU2 = freelancerPerksListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.perks.list.di.FreelancerPerksListScreenInjector");
                        g0 g0Var = (g0) bVarU2;
                        return new us6.h0(g0Var.f282547b, g0Var.f282548c);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerPerksListScreen.S;
                        return (g) ((us6.h0) freelancerPerksListScreen.P.getValue()).f282562b.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerPerksListScreen.S;
                        FreelancerPerksListScreen freelancerPerksListScreen2 = this.f301370b;
                        return dli.f.a(freelancerPerksListScreen2, freelancerPerksListScreen2.R2(), v.k(freelancerPerksListScreen2.N, freelancerPerksListScreen2.M, freelancerPerksListScreen2.O, new LargeVoucherLoadingDelegate(), new TabsLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (us6.h0) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_perks_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.freelancer_perks_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new wkg.e(this, continuation, 25), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53515c.f121375b), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.M.d), new c(this, continuation, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
