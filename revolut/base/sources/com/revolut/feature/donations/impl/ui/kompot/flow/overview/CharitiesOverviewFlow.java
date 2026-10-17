package com.revolut.feature.donations.impl.ui.kompot.flow.overview;

import ali.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.donations.impl.R$id;
import com.revolut.feature.donations.impl.R$layout;
import com.revolut.feature.donations.impl.R$string;
import com.revolut.feature.donations.impl.ui.kompot.flow.overview.CharitiesOverviewFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import nb6.h;
import nb6.l;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/flow/overview/CharitiesOverviewFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnb6/h;", "Lali/g;", "Lnb6/l;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/overview/CharitiesOverviewFlowContract$Page;", "<init>", "()V", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CharitiesOverviewFlow extends ViewController<h> implements g {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(CharitiesOverviewFlow.class, "binding", "getBinding()Lcom/revolut/feature/donations/impl/databinding/FlowCharitiesOverviewBinding;", 0))};
    public final boolean K = true;
    public final int L = R$layout.flow_charities_overview;
    public final ao.h M = s.t(this, a.f);
    public final Object N;
    public final Object O;
    public final Object P;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, ma6.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/donations/impl/databinding/FlowCharitiesOverviewBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            int i = R$id.charitiesOverviewFlow_floatingBottomBarView;
            FloatingBottomBarView floatingBottomBarView = (FloatingBottomBarView) ViewBindings.findChildViewById(p0, i);
            if (floatingBottomBarView != null) {
                i = R$id.charitiesOverviewFlow_navBar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.charitiesOverviewFlow_pager;
                    if (((ViewPager2) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new ma6.a(controllerContainerCoordinatorLayout, floatingBottomBarView, navBarWithToolbar);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public CharitiesOverviewFlow() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: nb6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CharitiesOverviewFlow f213987b;

            {
                this.f213987b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CharitiesOverviewFlow charitiesOverviewFlow = this.f213987b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CharitiesOverviewFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(charitiesOverviewFlow.m2()).a().get(pa6.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new pa6.b(((pa6.m) aVar2.b()).G);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", pa6.m.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = CharitiesOverviewFlow.Q;
                        return (c) ((pa6.b) charitiesOverviewFlow.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = CharitiesOverviewFlow.Q;
                        return mif.a.a(charitiesOverviewFlow, 0, R$id.charitiesOverviewFlow_pager, charitiesOverviewFlow.d(), 5);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: nb6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CharitiesOverviewFlow f213987b;

            {
                this.f213987b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CharitiesOverviewFlow charitiesOverviewFlow = this.f213987b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CharitiesOverviewFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(charitiesOverviewFlow.m2()).a().get(pa6.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new pa6.b(((pa6.m) aVar2.b()).G);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", pa6.m.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = CharitiesOverviewFlow.Q;
                        return (c) ((pa6.b) charitiesOverviewFlow.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = CharitiesOverviewFlow.Q;
                        return mif.a.a(charitiesOverviewFlow, 0, R$id.charitiesOverviewFlow_pager, charitiesOverviewFlow.d(), 5);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: nb6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CharitiesOverviewFlow f213987b;

            {
                this.f213987b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CharitiesOverviewFlow charitiesOverviewFlow = this.f213987b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CharitiesOverviewFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(charitiesOverviewFlow.m2()).a().get(pa6.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new pa6.b(((pa6.m) aVar2.b()).G);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", pa6.m.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = CharitiesOverviewFlow.Q;
                        return (c) ((pa6.b) charitiesOverviewFlow.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = CharitiesOverviewFlow.Q;
                        return mif.a.a(charitiesOverviewFlow, 0, R$id.charitiesOverviewFlow_pager, charitiesOverviewFlow.d(), 5);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f203951b.setItems(uiState.f213998b.f213996a);
        d3().f203951b.b(uiState.f213999c);
        d3().f203952c.setMenuItems(uiState.f213997a.f213995a);
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        CharitiesOverviewFlowContract$Page page = (CharitiesOverviewFlowContract$Page) pagerItem;
        Intrinsics.checkNotNullParameter(page, "pagerItem");
        b bVar = (b) d();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(page, "page");
        String id10 = page.getF94249a();
        Intrinsics.checkNotNullParameter(id10, "id");
        bVar.H2(bVar.f72024t, new mll.h(id10, 22));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (pa6.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (pa6.b) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f203952c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.donations_overview_screen_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.donations_overview_screen_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f203952c;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new mta.c(this, null, 23), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.o.f57403b), null, new nb6.b(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f203951b.f58581q), new nb6.b(this, null, 1), 3);
    }

    public final ma6.a d3() {
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ma6.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final nb6.c d() {
        return (nb6.c) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.K);
    }
}
