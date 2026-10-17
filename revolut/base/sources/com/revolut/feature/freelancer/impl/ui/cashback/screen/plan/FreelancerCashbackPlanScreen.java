package com.revolut.feature.freelancer.impl.ui.cashback.screen.plan;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.StoryNavBarContentView;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$id;
import com.revolut.feature.freelancer.impl.R$layout;
import com.revolut.feature.freelancer.impl.ui.cashback.screen.plan.FreelancerCashbackPlanScreen;
import com.revolut.feature.freelancer.impl.ui.cashback.screen.plan.a;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import rv6.g;
import rv6.i;
import rv6.j;
import rv6.l;
import rv6.o;
import rv6.r;
import te0.w;
import us6.a2;
import us6.b2;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/cashback/screen/plan/FreelancerCashbackPlanScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrv6/o;", "Ldli/a;", "Lrv6/r;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerCashbackPlanScreen extends ViewController<o> implements dli.a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(FreelancerCashbackPlanScreen.class, "binding", "getBinding()Lcom/revolut/feature/freelancer/impl/databinding/ScreenFreelancerCashbackUpsellBinding;", 0))};
    public final int K = R$layout.screen_freelancer_cashback_upsell;
    public final h L = s.t(this, a.f);
    public final ActionWidgetDelegate M = new ActionWidgetDelegate();
    public final TextDelegate N = new TextDelegate();
    public final FullScreenStateDelegate O = new FullScreenStateDelegate();
    public final RowDelegate P;
    public final SwipeToActionDelegate Q;
    public final ListSubheaderDelegate R;
    public final LargeActionButtonDelegate S;
    public final Object T;
    public final Object U;
    public final Object V;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, rs6.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/freelancer/impl/databinding/ScreenFreelancerCashbackUpsellBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.navBarView;
            NavBarWithContainer navBarWithContainer = (NavBarWithContainer) ViewBindings.findChildViewById(p0, i);
            if (navBarWithContainer != null) {
                i = R$id.recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    i = R$id.storyContentView;
                    StoryNavBarContentView storyNavBarContentView = (StoryNavBarContentView) ViewBindings.findChildViewById(p0, i);
                    if (storyNavBarContentView != null) {
                        return new rs6.b(navBarWithContainer, storyNavBarContentView, (ControllerContainerCoordinatorLayout) p0);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public FreelancerCashbackPlanScreen() {
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        this.Q = new SwipeToActionDelegate(rowDelegate, false);
        this.R = new ListSubheaderDelegate();
        this.S = new LargeActionButtonDelegate();
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: rv6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerCashbackPlanScreen f257695b;

            {
                this.f257695b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerCashbackPlanScreen freelancerCashbackPlanScreen = this.f257695b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerCashbackPlanScreen.W;
                        qji.b bVarU2 = freelancerCashbackPlanScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.cashback.screen.plan.di.FreelancerCashbackPlanScreenInjector");
                        a2 a2Var = (a2) bVarU2;
                        return new b2(a2Var.f282448b, a2Var.f282449c, freelancerCashbackPlanScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerCashbackPlanScreen.W;
                        return (q) ((b2) freelancerCashbackPlanScreen.T.getValue()).f282464g.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerCashbackPlanScreen.W;
                        FreelancerCashbackPlanScreen freelancerCashbackPlanScreen2 = this.f257695b;
                        return dli.f.a(freelancerCashbackPlanScreen2, freelancerCashbackPlanScreen2.d(), zhm.v.k(new RowLoadingDelegate(), freelancerCashbackPlanScreen2.O, new CounterTextDelegate(), freelancerCashbackPlanScreen2.M, freelancerCashbackPlanScreen2.P, freelancerCashbackPlanScreen2.Q, freelancerCashbackPlanScreen2.R, freelancerCashbackPlanScreen2.N), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: rv6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerCashbackPlanScreen f257695b;

            {
                this.f257695b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerCashbackPlanScreen freelancerCashbackPlanScreen = this.f257695b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerCashbackPlanScreen.W;
                        qji.b bVarU2 = freelancerCashbackPlanScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.cashback.screen.plan.di.FreelancerCashbackPlanScreenInjector");
                        a2 a2Var = (a2) bVarU2;
                        return new b2(a2Var.f282448b, a2Var.f282449c, freelancerCashbackPlanScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerCashbackPlanScreen.W;
                        return (q) ((b2) freelancerCashbackPlanScreen.T.getValue()).f282464g.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerCashbackPlanScreen.W;
                        FreelancerCashbackPlanScreen freelancerCashbackPlanScreen2 = this.f257695b;
                        return dli.f.a(freelancerCashbackPlanScreen2, freelancerCashbackPlanScreen2.d(), zhm.v.k(new RowLoadingDelegate(), freelancerCashbackPlanScreen2.O, new CounterTextDelegate(), freelancerCashbackPlanScreen2.M, freelancerCashbackPlanScreen2.P, freelancerCashbackPlanScreen2.Q, freelancerCashbackPlanScreen2.R, freelancerCashbackPlanScreen2.N), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: rv6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerCashbackPlanScreen f257695b;

            {
                this.f257695b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerCashbackPlanScreen freelancerCashbackPlanScreen = this.f257695b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerCashbackPlanScreen.W;
                        qji.b bVarU2 = freelancerCashbackPlanScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.cashback.screen.plan.di.FreelancerCashbackPlanScreenInjector");
                        a2 a2Var = (a2) bVarU2;
                        return new b2(a2Var.f282448b, a2Var.f282449c, freelancerCashbackPlanScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerCashbackPlanScreen.W;
                        return (q) ((b2) freelancerCashbackPlanScreen.T.getValue()).f282464g.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerCashbackPlanScreen.W;
                        FreelancerCashbackPlanScreen freelancerCashbackPlanScreen2 = this.f257695b;
                        return dli.f.a(freelancerCashbackPlanScreen2, freelancerCashbackPlanScreen2.d(), zhm.v.k(new RowLoadingDelegate(), freelancerCashbackPlanScreen2.O, new CounterTextDelegate(), freelancerCashbackPlanScreen2.M, freelancerCashbackPlanScreen2.P, freelancerCashbackPlanScreen2.Q, freelancerCashbackPlanScreen2.R, freelancerCashbackPlanScreen2.N), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        StoryNavBarContentView storyNavBarContentView = d3().f257022c;
        com.revolut.feature.freelancer.impl.ui.cashback.screen.plan.a aVar = uiState.f257709a;
        if (Intrinsics.f(aVar, a.C0489a.f73757a)) {
            storyNavBarContentView.setLoading();
        } else {
            if (!(aVar instanceof l)) {
                throw new NoWhenBranchMatchedException();
            }
            storyNavBarContentView.setStories(u.c(((l) aVar).f257703a));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b2) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithContainer navBarWithContainer = d3().f257021b;
        navBarWithContainer.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithContainer.M();
        ((j60.a) ((b2) this.T.getValue()).d.get()).d(v.k(new CellDetailsDelegate(), this.S));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f257021b.K()), new rv6.h(this, continuation, 0), 3);
        ViewController.P2(this, new r7b.e(rd0.e.b(this.O.f52371h.f121375b), 18), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f51589c.f121375b), new rv6.h(this, continuation, 1), 3);
        ViewController.P2(this, new r7b.e(rd0.e.b(this.N.d), 19), new rv6.h(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52707c), new j(this, null), 3);
        ViewController.P2(this, new rv6.e(new r7b.e(rd0.e.b(this.P.f53218h), 20), 0), new rt4.o(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.d.f121375b), null, new g(this, null), 3);
    }

    public final rs6.b d3() {
        ViewBinding value = this.L.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rs6.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final rv6.q d() {
        return (rv6.q) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }
}
