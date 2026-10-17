package com.revolut.feature.spending_analytics.impl.ui.rev10.travel;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import au0.c1;
import au0.m0;
import au0.s0;
import au0.u0;
import aw0.k;
import aw0.s8;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.IconLoadingDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.R$id;
import com.revolut.feature.spending_analytics.impl.R$layout;
import com.revolut.feature.spending_analytics.impl.ui.rev10.travel.TravelController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.c;
import gtd.e;
import gtd.f;
import gtd.g;
import gtd.l;
import gtd.m;
import gtd.p;
import hmd.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ppd.w0;
import te0.w;
import vc.s;
import z4l.j;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/travel/TravelController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lgtd/h;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelController extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(TravelController.class, "binding", "getBinding()Lcom/revolut/feature/spending_analytics/impl/databinding/ControllerTravelBinding;", 0))};
    public final Object M;
    public final Object N;
    public final Object T;
    public final int K = R$layout.controller_travel;
    public final h L = s.t(this, a.f);
    public final FullScreenStateDelegate O = new FullScreenStateDelegate();
    public final IconDelegate P = new IconDelegate();
    public final InputDisclosureDelegate Q = new InputDisclosureDelegate();
    public final RowDelegate R = new RowDelegate(null, null, 7);
    public final j S = new j(5, (List) f0.f322471a, false);

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, d.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/spending_analytics/impl/databinding/ControllerTravelBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.controllerTravel_navBar;
            NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) ViewBindings.findChildViewById(p0, i);
            if (navBarWithBigTile != null) {
                i = R$id.controllerTravel_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                if (screenContentRecyclerView != null) {
                    return new d((ControllerContainerCoordinatorLayout) p0, navBarWithBigTile, screenContentRecyclerView);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public TravelController() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: gtd.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelController f146588b;

            {
                this.f146588b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelController travelController = this.f146588b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelController.U;
                        return (p) ((w0) travelController.N.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelController.U;
                        phm.a aVar = (phm.a) ue0.e.j(travelController.m2()).a().get(ppd.n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new w0(((ppd.n) aVar2.b()).L0);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ppd.n.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = TravelController.U;
                        TravelController travelController2 = this.f146588b;
                        return dli.f.a(travelController2, travelController2.d(), v.k(new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), new GridBoxDelegate(v.k(new IconLoadingDelegate(), travelController2.P), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), travelController2.O, travelController2.Q, travelController2.R), travelController2.d3().f153683c.getId(), null, travelController2.S, null, 40);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: gtd.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelController f146588b;

            {
                this.f146588b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelController travelController = this.f146588b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelController.U;
                        return (p) ((w0) travelController.N.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelController.U;
                        phm.a aVar = (phm.a) ue0.e.j(travelController.m2()).a().get(ppd.n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new w0(((ppd.n) aVar2.b()).L0);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ppd.n.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = TravelController.U;
                        TravelController travelController2 = this.f146588b;
                        return dli.f.a(travelController2, travelController2.d(), v.k(new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), new GridBoxDelegate(v.k(new IconLoadingDelegate(), travelController2.P), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), travelController2.O, travelController2.Q, travelController2.R), travelController2.d3().f153683c.getId(), null, travelController2.S, null, 40);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: gtd.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelController f146588b;

            {
                this.f146588b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelController travelController = this.f146588b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelController.U;
                        return (p) ((w0) travelController.N.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelController.U;
                        phm.a aVar = (phm.a) ue0.e.j(travelController.m2()).a().get(ppd.n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new w0(((ppd.n) aVar2.b()).L0);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ppd.n.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = TravelController.U;
                        TravelController travelController2 = this.f146588b;
                        return dli.f.a(travelController2, travelController2.d(), v.k(new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), new GridBoxDelegate(v.k(new IconLoadingDelegate(), travelController2.P), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), travelController2.O, travelController2.Q, travelController2.R), travelController2.d3().f153683c.getId(), null, travelController2.S, null, 40);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        gtd.h uiState = (gtd.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithBigTile navBarWithBigTile = d3().f153682b;
        g gVar = uiState.f146586b;
        if (gVar instanceof e) {
            navBarWithBigTile.setLoadingState(false);
            e eVar = (e) gVar;
            TextClause textClause = eVar.f146582a;
            navBarWithBigTile.setToolbarTitle(textClause);
            navBarWithBigTile.setTitle(textClause);
            navBarWithBigTile.setDescription(new TextLocalisedClause(R$string.analytics_travel_mode_header_subtitle, null, null, 14));
            navBarWithBigTile.setActionStatusLabel(new k(6, new TextLocalisedClause(R$string.analytics_travel_mode_header_title, null, null, 14), null, false));
            c1.S(navBarWithBigTile, u.c(new u0(new NavBarWithContainerBackground.ImageBackground(eVar.f146583b, s8.MULTICOLOR, (Color.SolidRes) null, 12), null, null, null)), null, null, 6);
            return;
        }
        if (gVar.equals(f.f146584a)) {
            navBarWithBigTile.setLoadingState(true);
            return;
        }
        if (!gVar.equals(gtd.d.f146581a)) {
            throw new NoWhenBranchMatchedException();
        }
        navBarWithBigTile.setLoadingState(false);
        navBarWithBigTile.setToolbarTitle(null);
        navBarWithBigTile.setTitle((Clause) null);
        navBarWithBigTile.setDescription((Clause) null);
        c1.S(navBarWithBigTile, f0.f322471a, null, null, 6);
        navBarWithBigTile.setActionStatusLabel(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (w0) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f153682b;
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.BOTTOM_BLUR);
        navBarWithBigTile.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f153682b.f59357t), null, new gqh.o(this, null, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new gtd.j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.p()), null, new gtd.k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f52538c), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f53218h), null, new m(this, null), 3);
    }

    public final d d3() {
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p d() {
        return (p) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getY() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.T.getValue();
    }
}
