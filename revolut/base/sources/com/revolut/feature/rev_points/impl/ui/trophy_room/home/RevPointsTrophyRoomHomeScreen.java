package com.revolut.feature.rev_points.impl.ui.trophy_room.home;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import b1c.c;
import b1c.d;
import b1c.f;
import b1c.g;
import b1c.m;
import b1c.n;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.BigTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SegmentedGaugeChartDelegate;
import com.revolut.core.ui_kit.delegates.SegmentedGaugeChartLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.impl.R$id;
import com.revolut.feature.rev_points.impl.R$layout;
import com.revolut.feature.rev_points.impl.ui.trophy_room.home.RevPointsTrophyRoomHomeScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import wxb.o;
import xki.e;
import zhm.v;
import zxb.a0;
import zxb.y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/trophy_room/home/RevPointsTrophyRoomHomeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/rev_points/impl/ui/trophy_room/home/a;", "Ldli/a;", "Lb1c/n;", "<init>", "()V", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsTrophyRoomHomeScreen extends ViewController<com.revolut.feature.rev_points.impl.ui.trophy_room.home.a> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(RevPointsTrophyRoomHomeScreen.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/impl/databinding/ScreenRevPointsTrophyRoomHomeBinding;", 0))};
    public final Object Q;
    public final Object S;
    public final Object T;
    public final int K = R$layout.screen_rev_points_trophy_room_home;
    public final int L = R$style.UiKitTheme_Transparent;
    public final FullScreenStateDelegate M = new FullScreenStateDelegate();
    public final BigTileDelegate N = new BigTileDelegate();
    public final RowDelegate O = new RowDelegate(null, null, 7);
    public final LargeActionButtonDelegate P = new LargeActionButtonDelegate();
    public final h R = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, o.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/rev_points/impl/databinding/ScreenRevPointsTrophyRoomHomeBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            int i = R$id.revPointsTrophyRoomHomeScreen_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.revPointsTrophyRoomHomeScreen_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new o(controllerContainerCoordinatorLayout, navBarWithToolbar);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public RevPointsTrophyRoomHomeScreen() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: b1c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsTrophyRoomHomeScreen f11778b;

            {
                this.f11778b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevPointsTrophyRoomHomeScreen revPointsTrophyRoomHomeScreen = this.f11778b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsTrophyRoomHomeScreen.U;
                        RevPointsTrophyRoomHomeScreen revPointsTrophyRoomHomeScreen2 = this.f11778b;
                        return dli.f.a(revPointsTrophyRoomHomeScreen2, revPointsTrophyRoomHomeScreen2.d(), v.k(new SegmentedGaugeChartDelegate(), new SegmentedGaugeChartLoadingDelegate(), new RowLoadingDelegate(), revPointsTrophyRoomHomeScreen2.O, new ListSubheaderDelegate(), revPointsTrophyRoomHomeScreen2.N, new BigTileLoadingDelegate(), revPointsTrophyRoomHomeScreen2.M, revPointsTrophyRoomHomeScreen2.P), R$id.revPointsTrophyRoomHomeScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsTrophyRoomHomeScreen.U;
                        qji.b bVarU2 = revPointsTrophyRoomHomeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rev_points.impl.ui.trophy_room.home.di.RevPointsTrophyRoomHomeScreenInjector");
                        y yVar = (y) bVarU2;
                        return new a0(yVar.f326311a, yVar.f326312b);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsTrophyRoomHomeScreen.U;
                        return (m) ((a0) revPointsTrophyRoomHomeScreen.S.getValue()).f326100b.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: b1c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsTrophyRoomHomeScreen f11778b;

            {
                this.f11778b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevPointsTrophyRoomHomeScreen revPointsTrophyRoomHomeScreen = this.f11778b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsTrophyRoomHomeScreen.U;
                        RevPointsTrophyRoomHomeScreen revPointsTrophyRoomHomeScreen2 = this.f11778b;
                        return dli.f.a(revPointsTrophyRoomHomeScreen2, revPointsTrophyRoomHomeScreen2.d(), v.k(new SegmentedGaugeChartDelegate(), new SegmentedGaugeChartLoadingDelegate(), new RowLoadingDelegate(), revPointsTrophyRoomHomeScreen2.O, new ListSubheaderDelegate(), revPointsTrophyRoomHomeScreen2.N, new BigTileLoadingDelegate(), revPointsTrophyRoomHomeScreen2.M, revPointsTrophyRoomHomeScreen2.P), R$id.revPointsTrophyRoomHomeScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsTrophyRoomHomeScreen.U;
                        qji.b bVarU2 = revPointsTrophyRoomHomeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rev_points.impl.ui.trophy_room.home.di.RevPointsTrophyRoomHomeScreenInjector");
                        y yVar = (y) bVarU2;
                        return new a0(yVar.f326311a, yVar.f326312b);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsTrophyRoomHomeScreen.U;
                        return (m) ((a0) revPointsTrophyRoomHomeScreen.S.getValue()).f326100b.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: b1c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsTrophyRoomHomeScreen f11778b;

            {
                this.f11778b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevPointsTrophyRoomHomeScreen revPointsTrophyRoomHomeScreen = this.f11778b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsTrophyRoomHomeScreen.U;
                        RevPointsTrophyRoomHomeScreen revPointsTrophyRoomHomeScreen2 = this.f11778b;
                        return dli.f.a(revPointsTrophyRoomHomeScreen2, revPointsTrophyRoomHomeScreen2.d(), v.k(new SegmentedGaugeChartDelegate(), new SegmentedGaugeChartLoadingDelegate(), new RowLoadingDelegate(), revPointsTrophyRoomHomeScreen2.O, new ListSubheaderDelegate(), revPointsTrophyRoomHomeScreen2.N, new BigTileLoadingDelegate(), revPointsTrophyRoomHomeScreen2.M, revPointsTrophyRoomHomeScreen2.P), R$id.revPointsTrophyRoomHomeScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsTrophyRoomHomeScreen.U;
                        qji.b bVarU2 = revPointsTrophyRoomHomeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rev_points.impl.ui.trophy_room.home.di.RevPointsTrophyRoomHomeScreenInjector");
                        y yVar = (y) bVarU2;
                        return new a0(yVar.f326311a, yVar.f326312b);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsTrophyRoomHomeScreen.U;
                        return (m) ((a0) revPointsTrophyRoomHomeScreen.S.getValue()).f326100b.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.L);
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f300845b;
        Clause clause = uiState.f11789b;
        navBarWithToolbar.setDescriptionText(clause);
        navBarWithToolbar.setDescriptionClickable(clause != null);
        navBarWithToolbar.setDescriptionVisible(clause != null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a0) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f300845b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.rev_points_trophy_room_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f300845b.f59410q), new b1c.b(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f300845b.q0()), new b1c.b(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.d), new d(this, null), 3);
        RowDelegate rowDelegate = this.O;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new b1c.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53220l), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.d.f121375b), new g(this, null), 3);
    }

    public final o d3() {
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (o) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m d() {
        return (m) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
