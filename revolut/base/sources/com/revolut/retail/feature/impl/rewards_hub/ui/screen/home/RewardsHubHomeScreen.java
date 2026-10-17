package com.revolut.retail.feature.impl.rewards_hub.ui.screen.home;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import aw0.d0;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.ChallengeMediumImageCardDelegate;
import com.revolut.core.ui_kit.delegates.ChallengeMediumImageCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.views.navbar.MarketingPhotoHeaderContentView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.impl.rewards_hub.R$id;
import com.revolut.retail.feature.impl.rewards_hub.R$layout;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.home.RewardsHubHomeScreen;
import dli.a;
import dli.c;
import iaf.d;
import iuj.j;
import iuj.k;
import iuj.l;
import iuj.m;
import iuj.n;
import iuj.p;
import iuj.q;
import iuj.u;
import iuj.v;
import kji.g;
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
import org.jetbrains.annotations.NotNull;
import rtj.i;
import te0.w;
import tx0.x0;
import tx0.y0;
import vc.s;
import xki.e;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/retail/feature/impl/rewards_hub/ui/screen/home/RewardsHubHomeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Liuj/u;", "Ldli/a;", "Liuj/w;", "Lkji/g;", "<init>", "()V", "Companion", "a", "feature_rewards_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RewardsHubHomeScreen extends ViewController<u> implements a, g {
    public final int K = R$layout.screen_rewards_hub_home;
    public final FullScreenStateDelegate L = new FullScreenStateDelegate();
    public final ChallengeMediumImageCardDelegate M = new ChallengeMediumImageCardDelegate();
    public final ActionCardDelegate N = new ActionCardDelegate();
    public final LargeActionButtonDelegate O = new LargeActionButtonDelegate();
    public final ListingTileDelegate P;
    public final ScrollerDelegate Q;
    public final Object R;
    public final h S;
    public final Object T;
    public final Object U;
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(RewardsHubHomeScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/impl/rewards_hub/databinding/ScreenRewardsHubHomeBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final d0 W = new d0(375, 900);
    public static final d0 X = new d0(1, 1);

    /* JADX INFO: renamed from: com.revolut.retail.feature.impl.rewards_hub.ui.screen.home.RewardsHubHomeScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final /* synthetic */ class b extends q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, otj.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/retail/feature/impl/rewards_hub/databinding/ScreenRewardsHubHomeBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            int i = R$id.rewardsHubHomeScreen_contentView;
            MarketingPhotoHeaderContentView marketingPhotoHeaderContentView = (MarketingPhotoHeaderContentView) ViewBindings.findChildViewById(p0, i);
            if (marketingPhotoHeaderContentView != null) {
                i = R$id.rewardsHubHomeScreen_navBar;
                NavBarWithContainer navBarWithContainer = (NavBarWithContainer) ViewBindings.findChildViewById(p0, i);
                if (navBarWithContainer != null) {
                    i = R$id.rewardsHubHomeScreen_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new otj.a(controllerContainerCoordinatorLayout, marketingPhotoHeaderContentView, navBarWithContainer);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public RewardsHubHomeScreen() {
        ListingTileDelegate listingTileDelegate = new ListingTileDelegate();
        this.P = listingTileDelegate;
        this.Q = new ScrollerDelegate(zhm.u.c(listingTileDelegate), false);
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: iuj.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RewardsHubHomeScreen f168634b;

            {
                this.f168634b = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RewardsHubHomeScreen rewardsHubHomeScreen = this.f168634b;
                switch (i2) {
                    case 0:
                        RewardsHubHomeScreen.Companion companion = RewardsHubHomeScreen.INSTANCE;
                        RewardsHubHomeScreen rewardsHubHomeScreen2 = this.f168634b;
                        return dli.f.a(rewardsHubHomeScreen2, rewardsHubHomeScreen2.R2(), zhm.v.k(rewardsHubHomeScreen2.N, rewardsHubHomeScreen2.L, new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), rewardsHubHomeScreen2.O, rewardsHubHomeScreen2.Q, new GridBoxDelegate(zhm.v.k(rewardsHubHomeScreen2.M, new ChallengeMediumImageCardLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14)), R$id.rewardsHubHomeScreen_recyclerView, null, null, null, 56);
                    case 1:
                        RewardsHubHomeScreen.Companion companion2 = RewardsHubHomeScreen.INSTANCE;
                        qji.b bVarU2 = rewardsHubHomeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.impl.rewards_hub.ui.screen.home.di.RewardsHubHomeScreenInjector");
                        rtj.h hVar = (rtj.h) bVarU2;
                        return new rtj.i(hVar.f257290b, hVar.f257291c, rewardsHubHomeScreen);
                    default:
                        RewardsHubHomeScreen.Companion companion3 = RewardsHubHomeScreen.INSTANCE;
                        rtj.i iVar = (rtj.i) rewardsHubHomeScreen.T.getValue();
                        rtj.g gVar = iVar.f257292a;
                        l80.e eVarH = gVar.f257284h.h();
                        vc.s.j(eVarH);
                        cq9.m mVar = new cq9.m(new b(new vtj.c(eVarH)), new h(), new f((c90.c) iVar.f257294c.get()), new c());
                        stj.h hVar2 = (stj.h) gVar.f257288n.get();
                        wwa.b bVarA = gVar.i.a();
                        vc.s.j(bVarA);
                        gte.a aVarB = gVar.f257280a.b();
                        vc.s.j(aVarB);
                        return new a0(mVar, hVar2, bVarA, aVarB, ((s41.a) gVar.f257283g).d());
                }
            }
        });
        this.S = s.t(this, b.f);
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: iuj.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RewardsHubHomeScreen f168634b;

            {
                this.f168634b = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RewardsHubHomeScreen rewardsHubHomeScreen = this.f168634b;
                switch (i22) {
                    case 0:
                        RewardsHubHomeScreen.Companion companion = RewardsHubHomeScreen.INSTANCE;
                        RewardsHubHomeScreen rewardsHubHomeScreen2 = this.f168634b;
                        return dli.f.a(rewardsHubHomeScreen2, rewardsHubHomeScreen2.R2(), zhm.v.k(rewardsHubHomeScreen2.N, rewardsHubHomeScreen2.L, new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), rewardsHubHomeScreen2.O, rewardsHubHomeScreen2.Q, new GridBoxDelegate(zhm.v.k(rewardsHubHomeScreen2.M, new ChallengeMediumImageCardLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14)), R$id.rewardsHubHomeScreen_recyclerView, null, null, null, 56);
                    case 1:
                        RewardsHubHomeScreen.Companion companion2 = RewardsHubHomeScreen.INSTANCE;
                        qji.b bVarU2 = rewardsHubHomeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.impl.rewards_hub.ui.screen.home.di.RewardsHubHomeScreenInjector");
                        rtj.h hVar = (rtj.h) bVarU2;
                        return new rtj.i(hVar.f257290b, hVar.f257291c, rewardsHubHomeScreen);
                    default:
                        RewardsHubHomeScreen.Companion companion3 = RewardsHubHomeScreen.INSTANCE;
                        rtj.i iVar = (rtj.i) rewardsHubHomeScreen.T.getValue();
                        rtj.g gVar = iVar.f257292a;
                        l80.e eVarH = gVar.f257284h.h();
                        vc.s.j(eVarH);
                        cq9.m mVar = new cq9.m(new b(new vtj.c(eVarH)), new h(), new f((c90.c) iVar.f257294c.get()), new c());
                        stj.h hVar2 = (stj.h) gVar.f257288n.get();
                        wwa.b bVarA = gVar.i.a();
                        vc.s.j(bVarA);
                        gte.a aVarB = gVar.f257280a.b();
                        vc.s.j(aVarB);
                        return new a0(mVar, hVar2, bVarA, aVarB, ((s41.a) gVar.f257283g).d());
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: iuj.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RewardsHubHomeScreen f168634b;

            {
                this.f168634b = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RewardsHubHomeScreen rewardsHubHomeScreen = this.f168634b;
                switch (i22) {
                    case 0:
                        RewardsHubHomeScreen.Companion companion = RewardsHubHomeScreen.INSTANCE;
                        RewardsHubHomeScreen rewardsHubHomeScreen2 = this.f168634b;
                        return dli.f.a(rewardsHubHomeScreen2, rewardsHubHomeScreen2.R2(), zhm.v.k(rewardsHubHomeScreen2.N, rewardsHubHomeScreen2.L, new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), rewardsHubHomeScreen2.O, rewardsHubHomeScreen2.Q, new GridBoxDelegate(zhm.v.k(rewardsHubHomeScreen2.M, new ChallengeMediumImageCardLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14)), R$id.rewardsHubHomeScreen_recyclerView, null, null, null, 56);
                    case 1:
                        RewardsHubHomeScreen.Companion companion2 = RewardsHubHomeScreen.INSTANCE;
                        qji.b bVarU2 = rewardsHubHomeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.impl.rewards_hub.ui.screen.home.di.RewardsHubHomeScreenInjector");
                        rtj.h hVar = (rtj.h) bVarU2;
                        return new rtj.i(hVar.f257290b, hVar.f257291c, rewardsHubHomeScreen);
                    default:
                        RewardsHubHomeScreen.Companion companion3 = RewardsHubHomeScreen.INSTANCE;
                        rtj.i iVar = (rtj.i) rewardsHubHomeScreen.T.getValue();
                        rtj.g gVar = iVar.f257292a;
                        l80.e eVarH = gVar.f257284h.h();
                        vc.s.j(eVarH);
                        cq9.m mVar = new cq9.m(new b(new vtj.c(eVarH)), new h(), new f((c90.c) iVar.f257294c.get()), new c());
                        stj.h hVar2 = (stj.h) gVar.f257288n.get();
                        wwa.b bVarA = gVar.i.a();
                        vc.s.j(bVarA);
                        gte.a aVarB = gVar.f257280a.b();
                        vc.s.j(aVarB);
                        return new a0(mVar, hVar2, bVarA, aVarB, ((s41.a) gVar.f257283g).d());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        iuj.w uiState = (iuj.w) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        iuj.q qVar2 = uiState.f168649b;
        boolean z = qVar2 instanceof q.b;
        d0 d0Var = W;
        if (z) {
            d3().f229720b.setModel(new y0(d0Var, 1));
            return;
        }
        if (qVar2 instanceof q.a) {
            d3().f229720b.setModel(new x0(f0.f322471a, null, X, 21));
        } else {
            if (!(qVar2 instanceof p)) {
                throw new NoWhenBranchMatchedException();
            }
            p pVar = (p) qVar2;
            d3().f229721c.setMenuItems(pVar.f168641c);
            d3().f229720b.setModel(new x0(pVar.f168639a, pVar.f168640b, d0Var, 1));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithContainer navBarWithContainer = d3().f229721c;
        navBarWithContainer.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithContainer.M();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(this.O.d.f121375b), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f229721c.K()), new d(this, continuation, 20), 3);
        ViewController.P2(this, rd0.e.b(d3().f229721c.b()), new k(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f229720b.z), new k(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f51572n), new l(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52013c), new m(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52751c), new k(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52371h.f121375b), new n(this, null), 3);
    }

    public final otj.a d3() {
        ViewBinding value = this.S.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (otj.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final v R2() {
        return (v) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
