package com.revolut.feature.freelancer.impl.ui.cashback.screen.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.LinearProgressWithAmountDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.ProgressionCountDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.cashback.screen.details.FreelancerCashbackDetailsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import njj.l;
import njj.n;
import nn7.d;
import nv6.g;
import nv6.i;
import nv6.j;
import nv6.m;
import nv6.p;
import nv6.r;
import te0.w;
import us6.a2;
import us6.z1;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/cashback/screen/details/FreelancerCashbackDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnv6/m;", "Ldli/a;", "Lnv6/r;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerCashbackDetailsScreen extends ViewController<m> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(FreelancerCashbackDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final boolean L = true;
    public final h M = s.t(this, a.f);
    public final RowDelegate N;
    public final PlainTextDelegate O;
    public final FullScreenStateDelegate P;
    public final SwipeToActionDelegate Q;
    public final ListSubheaderDelegate R;
    public final Object S;
    public final Object T;
    public final Object U;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, jii.m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return jii.m.a(p0);
        }
    }

    public FreelancerCashbackDetailsScreen() {
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.N = rowDelegate;
        this.O = new PlainTextDelegate();
        this.P = new FullScreenStateDelegate();
        this.Q = new SwipeToActionDelegate(rowDelegate, true);
        this.R = new ListSubheaderDelegate();
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: nv6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerCashbackDetailsScreen f219510b;

            {
                this.f219510b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerCashbackDetailsScreen freelancerCashbackDetailsScreen = this.f219510b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerCashbackDetailsScreen.V;
                        qji.b bVarU2 = freelancerCashbackDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.cashback.screen.details.di.FreelancerCashbackDetailsScreenInjector");
                        a2 a2Var = (a2) bVarU2;
                        return new z1(a2Var.f282448b, a2Var.f282449c);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerCashbackDetailsScreen.V;
                        return (p) ((z1) freelancerCashbackDetailsScreen.S.getValue()).f282826c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerCashbackDetailsScreen.V;
                        FreelancerCashbackDetailsScreen freelancerCashbackDetailsScreen2 = this.f219510b;
                        return dli.f.a(freelancerCashbackDetailsScreen2, freelancerCashbackDetailsScreen2.d(), v.k(freelancerCashbackDetailsScreen2.P, freelancerCashbackDetailsScreen2.Q, freelancerCashbackDetailsScreen2.R, new RowLoadingDelegate(), new HeaderDelegate(), new ProgressionCountDelegate(), new LinearProgressWithAmountDelegate(), freelancerCashbackDetailsScreen2.N, freelancerCashbackDetailsScreen2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: nv6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerCashbackDetailsScreen f219510b;

            {
                this.f219510b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerCashbackDetailsScreen freelancerCashbackDetailsScreen = this.f219510b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerCashbackDetailsScreen.V;
                        qji.b bVarU2 = freelancerCashbackDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.cashback.screen.details.di.FreelancerCashbackDetailsScreenInjector");
                        a2 a2Var = (a2) bVarU2;
                        return new z1(a2Var.f282448b, a2Var.f282449c);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerCashbackDetailsScreen.V;
                        return (p) ((z1) freelancerCashbackDetailsScreen.S.getValue()).f282826c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerCashbackDetailsScreen.V;
                        FreelancerCashbackDetailsScreen freelancerCashbackDetailsScreen2 = this.f219510b;
                        return dli.f.a(freelancerCashbackDetailsScreen2, freelancerCashbackDetailsScreen2.d(), v.k(freelancerCashbackDetailsScreen2.P, freelancerCashbackDetailsScreen2.Q, freelancerCashbackDetailsScreen2.R, new RowLoadingDelegate(), new HeaderDelegate(), new ProgressionCountDelegate(), new LinearProgressWithAmountDelegate(), freelancerCashbackDetailsScreen2.N, freelancerCashbackDetailsScreen2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: nv6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerCashbackDetailsScreen f219510b;

            {
                this.f219510b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerCashbackDetailsScreen freelancerCashbackDetailsScreen = this.f219510b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerCashbackDetailsScreen.V;
                        qji.b bVarU2 = freelancerCashbackDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.cashback.screen.details.di.FreelancerCashbackDetailsScreenInjector");
                        a2 a2Var = (a2) bVarU2;
                        return new z1(a2Var.f282448b, a2Var.f282449c);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerCashbackDetailsScreen.V;
                        return (p) ((z1) freelancerCashbackDetailsScreen.S.getValue()).f282826c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerCashbackDetailsScreen.V;
                        FreelancerCashbackDetailsScreen freelancerCashbackDetailsScreen2 = this.f219510b;
                        return dli.f.a(freelancerCashbackDetailsScreen2, freelancerCashbackDetailsScreen2.d(), v.k(freelancerCashbackDetailsScreen2.P, freelancerCashbackDetailsScreen2.Q, freelancerCashbackDetailsScreen2.R, new RowLoadingDelegate(), new HeaderDelegate(), new ProgressionCountDelegate(), new LinearProgressWithAmountDelegate(), freelancerCashbackDetailsScreen2.N, freelancerCashbackDetailsScreen2.O), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        nv6.q qVar2 = uiState.f219530a;
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setDescriptionText(qVar2.f219528a);
        navBarWithToolbar.setDescriptionVisible(qVar2.f219528a != null);
        navBarWithToolbar.setEndIconImage(qVar2.f219529b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((nv6.s) d()).C2(m.a.f219522a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z1) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_cashback_details_main_header_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new g(this, null, 0), 3);
        RowDelegate rowDelegate = this.N;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new nv6.h(this, null), 3);
        ViewController.P2(this, new n(rd0.e.b(this.O.d.f121375b), 15), new g(this, null, 1), 3);
        ViewController.P2(this, new n(rd0.e.b(this.P.f52371h.f121375b), 16), new i(this, null), 3);
        ViewController.P2(this, new n(rd0.e.b(this.R.f52707c), 17), new j(this, null), 3);
        ViewController.P2(this, new l(new n(rd0.e.b(rowDelegate.f53218h), 18), 2), new d(this, null, 26), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.M.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p d() {
        return (p) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
