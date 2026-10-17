package com.revolut.feature.rev_points.impl.ui.points_expiry.home;

import aii.q;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.impl.R$id;
import com.revolut.feature.rev_points.impl.R$layout;
import com.revolut.feature.rev_points.impl.ui.points_expiry.home.RevPointsExpiryHomeScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import grl.k9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import vc.s;
import wxb.d;
import wzb.b;
import wzb.c;
import wzb.g;
import xki.e;
import zhm.v;
import zxb.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/points_expiry/home/RevPointsExpiryHomeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lwzb/h;", "Lno/m;", "<init>", "()V", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsExpiryHomeScreen extends ViewController<q> implements dli.a, m {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(RevPointsExpiryHomeScreen.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/impl/databinding/ScreenRevPointsExpiryHomeBinding;", 0))};
    public final AnalyticsProduct.Retail K;
    public final int L;
    public final FullScreenStateDelegate M;
    public final ActionWidgetDelegate N;
    public final RowDelegate O;
    public final LargeActionButtonDelegate P;
    public final InputDisclosureDelegate Q;
    public final Object R;
    public final h S;
    public final Object T;
    public final Object U;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, d.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/rev_points/impl/databinding/ScreenRevPointsExpiryHomeBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            int i = R$id.revPointsExpiryHomeScreen_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.revPointsExpiryHomeScreen_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new d(controllerContainerCoordinatorLayout, navBarWithToolbar);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public RevPointsExpiryHomeScreen() {
        k9 k9Var = k9.RevPoints;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.K = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.L = R$layout.screen_rev_points_expiry_home;
        this.M = new FullScreenStateDelegate();
        this.N = new ActionWidgetDelegate();
        this.O = new RowDelegate(null, null, 7);
        this.P = new LargeActionButtonDelegate();
        this.Q = new InputDisclosureDelegate();
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: wzb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsExpiryHomeScreen f301397b;

            {
                this.f301397b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevPointsExpiryHomeScreen revPointsExpiryHomeScreen = this.f301397b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsExpiryHomeScreen.V;
                        RevPointsExpiryHomeScreen revPointsExpiryHomeScreen2 = this.f301397b;
                        return dli.f.a(revPointsExpiryHomeScreen2, revPointsExpiryHomeScreen2.d(), v.k(revPointsExpiryHomeScreen2.M, new ActionWidgetLoadingDelegate(), revPointsExpiryHomeScreen2.N, new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), revPointsExpiryHomeScreen2.O, new RowLoadingDelegate(), new LargeActionButtonLoadingDelegate(), revPointsExpiryHomeScreen2.P, revPointsExpiryHomeScreen2.Q), R$id.revPointsExpiryHomeScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsExpiryHomeScreen.V;
                        qji.b bVarU2 = revPointsExpiryHomeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rev_points.impl.ui.points_expiry.home.di.RevPointsExpiryHomeScreenInjector");
                        zxb.m mVar = (zxb.m) bVarU2;
                        return new l(mVar.f326220b, mVar.f326221c);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsExpiryHomeScreen.V;
                        return (g) ((l) revPointsExpiryHomeScreen.T.getValue()).f326217b.get();
                }
            }
        });
        this.S = s.t(this, a.f);
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: wzb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsExpiryHomeScreen f301397b;

            {
                this.f301397b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevPointsExpiryHomeScreen revPointsExpiryHomeScreen = this.f301397b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsExpiryHomeScreen.V;
                        RevPointsExpiryHomeScreen revPointsExpiryHomeScreen2 = this.f301397b;
                        return dli.f.a(revPointsExpiryHomeScreen2, revPointsExpiryHomeScreen2.d(), v.k(revPointsExpiryHomeScreen2.M, new ActionWidgetLoadingDelegate(), revPointsExpiryHomeScreen2.N, new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), revPointsExpiryHomeScreen2.O, new RowLoadingDelegate(), new LargeActionButtonLoadingDelegate(), revPointsExpiryHomeScreen2.P, revPointsExpiryHomeScreen2.Q), R$id.revPointsExpiryHomeScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsExpiryHomeScreen.V;
                        qji.b bVarU2 = revPointsExpiryHomeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rev_points.impl.ui.points_expiry.home.di.RevPointsExpiryHomeScreenInjector");
                        zxb.m mVar = (zxb.m) bVarU2;
                        return new l(mVar.f326220b, mVar.f326221c);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsExpiryHomeScreen.V;
                        return (g) ((l) revPointsExpiryHomeScreen.T.getValue()).f326217b.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: wzb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsExpiryHomeScreen f301397b;

            {
                this.f301397b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevPointsExpiryHomeScreen revPointsExpiryHomeScreen = this.f301397b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsExpiryHomeScreen.V;
                        RevPointsExpiryHomeScreen revPointsExpiryHomeScreen2 = this.f301397b;
                        return dli.f.a(revPointsExpiryHomeScreen2, revPointsExpiryHomeScreen2.d(), v.k(revPointsExpiryHomeScreen2.M, new ActionWidgetLoadingDelegate(), revPointsExpiryHomeScreen2.N, new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), revPointsExpiryHomeScreen2.O, new RowLoadingDelegate(), new LargeActionButtonLoadingDelegate(), revPointsExpiryHomeScreen2.P, revPointsExpiryHomeScreen2.Q), R$id.revPointsExpiryHomeScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsExpiryHomeScreen.V;
                        qji.b bVarU2 = revPointsExpiryHomeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rev_points.impl.ui.points_expiry.home.di.RevPointsExpiryHomeScreenInjector");
                        zxb.m mVar = (zxb.m) bVarU2;
                        return new l(mVar.f326220b, mVar.f326221c);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsExpiryHomeScreen.V;
                        return (g) ((l) revPointsExpiryHomeScreen.T.getValue()).f326217b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        wzb.h uiState = (wzb.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f300816b.setSecondDescriptionText(uiState.f301402b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f300816b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.rev_points_points_expiry_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.rev_points_points_expiry_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.rev_points_points_expiry_description, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f300816b.f59410q), new wkg.e(this, continuation, 26), 3);
        ViewController.P2(this, rd0.e.b(this.N.f51589c.f121375b), new wuh.q(this, continuation, 19), 3);
        ViewController.P2(this, rd0.e.b(this.O.f53218h), new b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.d.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new wzb.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52538c), new wzb.e(this, null), 3);
    }

    public final d d3() {
        ViewBinding value = this.S.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
