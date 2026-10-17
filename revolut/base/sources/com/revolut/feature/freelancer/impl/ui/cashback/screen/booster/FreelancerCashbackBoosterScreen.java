package com.revolut.feature.freelancer.impl.ui.cashback.screen.booster;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.StoryNavBarContentView;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$id;
import com.revolut.feature.freelancer.impl.R$layout;
import com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.FreelancerCashbackBoosterScreen;
import com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.a;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kkf.r6;
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
import lt.d;
import lv6.f;
import lv6.g;
import lv6.i;
import lv6.l;
import lv6.o;
import lv6.p;
import te0.w;
import us6.a2;
import us6.y1;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/cashback/screen/booster/FreelancerCashbackBoosterScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llv6/o;", "Ldli/a;", "Llv6/q;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerCashbackBoosterScreen extends ViewController<o> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(FreelancerCashbackBoosterScreen.class, "binding", "getBinding()Lcom/revolut/feature/freelancer/impl/databinding/ScreenFreelancerCashbackBoosterBinding;", 0))};
    public final FullScreenStateDelegate K = new FullScreenStateDelegate();
    public final ActionWidgetDelegate L = new ActionWidgetDelegate();
    public final TextDelegate M = new TextDelegate();
    public final RowDelegate N;
    public final SwipeToActionDelegate O;
    public final ListSubheaderDelegate P;
    public final int Q;
    public final h R;
    public final Object S;
    public final Object T;
    public final Object U;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, rs6.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/freelancer/impl/databinding/ScreenFreelancerCashbackBoosterBinding;", 0);
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
                        return new rs6.a(navBarWithContainer, storyNavBarContentView, (ControllerContainerCoordinatorLayout) p0);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public FreelancerCashbackBoosterScreen() {
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.N = rowDelegate;
        this.O = new SwipeToActionDelegate(rowDelegate, false);
        this.P = new ListSubheaderDelegate();
        this.Q = R$layout.screen_freelancer_cashback_booster;
        this.R = s.t(this, a.f);
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: lv6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerCashbackBoosterScreen f200322b;

            {
                this.f200322b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerCashbackBoosterScreen freelancerCashbackBoosterScreen = this.f200322b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerCashbackBoosterScreen.V;
                        qji.b bVarU2 = freelancerCashbackBoosterScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.di.FreelancerCashbackBoosterScreenInjector");
                        a2 a2Var = (a2) bVarU2;
                        return new y1(a2Var.f282448b, a2Var.f282449c);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerCashbackBoosterScreen.V;
                        return (p) ((y1) freelancerCashbackBoosterScreen.S.getValue()).f282814c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerCashbackBoosterScreen.V;
                        FreelancerCashbackBoosterScreen freelancerCashbackBoosterScreen2 = this.f200322b;
                        return dli.f.a(freelancerCashbackBoosterScreen2, freelancerCashbackBoosterScreen2.d(), v.k(freelancerCashbackBoosterScreen2.K, freelancerCashbackBoosterScreen2.L, freelancerCashbackBoosterScreen2.M, freelancerCashbackBoosterScreen2.N, freelancerCashbackBoosterScreen2.O, freelancerCashbackBoosterScreen2.P, new CellDetailsDelegate(), new ProgressStepsDelegate(), new RowLoadingDelegate(), new CounterTextDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: lv6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerCashbackBoosterScreen f200322b;

            {
                this.f200322b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerCashbackBoosterScreen freelancerCashbackBoosterScreen = this.f200322b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerCashbackBoosterScreen.V;
                        qji.b bVarU2 = freelancerCashbackBoosterScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.di.FreelancerCashbackBoosterScreenInjector");
                        a2 a2Var = (a2) bVarU2;
                        return new y1(a2Var.f282448b, a2Var.f282449c);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerCashbackBoosterScreen.V;
                        return (p) ((y1) freelancerCashbackBoosterScreen.S.getValue()).f282814c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerCashbackBoosterScreen.V;
                        FreelancerCashbackBoosterScreen freelancerCashbackBoosterScreen2 = this.f200322b;
                        return dli.f.a(freelancerCashbackBoosterScreen2, freelancerCashbackBoosterScreen2.d(), v.k(freelancerCashbackBoosterScreen2.K, freelancerCashbackBoosterScreen2.L, freelancerCashbackBoosterScreen2.M, freelancerCashbackBoosterScreen2.N, freelancerCashbackBoosterScreen2.O, freelancerCashbackBoosterScreen2.P, new CellDetailsDelegate(), new ProgressStepsDelegate(), new RowLoadingDelegate(), new CounterTextDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: lv6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerCashbackBoosterScreen f200322b;

            {
                this.f200322b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerCashbackBoosterScreen freelancerCashbackBoosterScreen = this.f200322b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerCashbackBoosterScreen.V;
                        qji.b bVarU2 = freelancerCashbackBoosterScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.di.FreelancerCashbackBoosterScreenInjector");
                        a2 a2Var = (a2) bVarU2;
                        return new y1(a2Var.f282448b, a2Var.f282449c);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerCashbackBoosterScreen.V;
                        return (p) ((y1) freelancerCashbackBoosterScreen.S.getValue()).f282814c.get();
                    default:
                        KProperty[] kPropertyArr3 = FreelancerCashbackBoosterScreen.V;
                        FreelancerCashbackBoosterScreen freelancerCashbackBoosterScreen2 = this.f200322b;
                        return dli.f.a(freelancerCashbackBoosterScreen2, freelancerCashbackBoosterScreen2.d(), v.k(freelancerCashbackBoosterScreen2.K, freelancerCashbackBoosterScreen2.L, freelancerCashbackBoosterScreen2.M, freelancerCashbackBoosterScreen2.N, freelancerCashbackBoosterScreen2.O, freelancerCashbackBoosterScreen2.P, new CellDetailsDelegate(), new ProgressStepsDelegate(), new RowLoadingDelegate(), new CounterTextDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        lv6.q uiState = (lv6.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        StoryNavBarContentView storyNavBarContentView = d3().f257019c;
        com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.a aVar = uiState.f200335b;
        if (aVar.equals(a.C0488a.f73750a)) {
            storyNavBarContentView.setLoading();
        } else {
            if (!(aVar instanceof l)) {
                throw new NoWhenBranchMatchedException();
            }
            l lVar = (l) aVar;
            storyNavBarContentView.setStories(u.c(lVar.f200330a));
            d3().f257018b.setTagView(lVar.f200331b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y1) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithContainer navBarWithContainer = d3().f257018b;
        navBarWithContainer.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithContainer.M();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f257018b.K()), null, new f(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.K.f52371h.f121375b), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f51589c.f121375b), null, new f(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.d), null, new lv6.h(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52707c), new i(this, null), 3);
        ViewController.P2(this, new r6(new d(rd0.e.b(this.N.f53218h), 4), 19), new lv6.h(this, continuation, 1), 3);
    }

    public final rs6.a d3() {
        ViewBinding value = this.R.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rs6.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p d() {
        return (p) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
