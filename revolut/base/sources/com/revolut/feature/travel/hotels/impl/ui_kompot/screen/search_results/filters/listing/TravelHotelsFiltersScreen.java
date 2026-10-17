package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import c9g.k;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RangeSliderTitleDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.TravelHotelsFiltersScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
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
import neg.d;
import neg.f;
import neg.g;
import neg.i;
import neg.j;
import neg.m;
import neg.n;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/search_results/filters/listing/TravelHotelsFiltersScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/search_results/filters/listing/a;", "Ldli/a;", "Lneg/o;", "<init>", "()V", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsFiltersScreen extends ViewController<com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.a> implements dli.a {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(TravelHotelsFiltersScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsFiltersBinding;", 0))};
    public final Object T;
    public final Object V;
    public final Object W;
    public final int K = R$layout.screen_travel_hotels_filters;
    public final RangeSliderTitleDelegate L = new RangeSliderTitleDelegate();
    public final InputChecklistDelegate M = new InputChecklistDelegate();
    public final FullScreenStateDelegate N = new FullScreenStateDelegate();
    public final ListSubheaderDelegate O = new ListSubheaderDelegate();
    public final LargeActionButtonDelegate P = new LargeActionButtonDelegate();
    public final AttributeSelectorSmallDelegate Q = new AttributeSelectorSmallDelegate();
    public final ActionsDelegate R = new ActionsDelegate();
    public final InputTextDelegate S = new InputTextDelegate(null);
    public final h U = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, k.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsFiltersBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.travelHotelsFiltersScreen_button;
            LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
            if (largeActionButton != null) {
                ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
                int i2 = R$id.travelHotelsFiltersScreen_navBar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i2);
                if (navBarWithToolbar != null) {
                    i2 = R$id.travelHotelsFiltersScreen_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i2)) != null) {
                        return new k(largeActionButton, navBarWithToolbar, controllerContainerCoordinatorLayout);
                    }
                }
                i = i2;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public TravelHotelsFiltersScreen() {
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: neg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsFiltersScreen f214511b;

            {
                this.f214511b = this;
            }

            /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelHotelsFiltersScreen travelHotelsFiltersScreen = this.f214511b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsFiltersScreen.X;
                        TravelHotelsFiltersScreen travelHotelsFiltersScreen2 = this.f214511b;
                        return dli.f.a(travelHotelsFiltersScreen2, travelHotelsFiltersScreen2.R2(), zhm.v.k(travelHotelsFiltersScreen2.L, travelHotelsFiltersScreen2.M, travelHotelsFiltersScreen2.N, travelHotelsFiltersScreen2.O, travelHotelsFiltersScreen2.P, travelHotelsFiltersScreen2.R, travelHotelsFiltersScreen2.S, new GridBoxDelegate(zhm.v.k(travelHotelsFiltersScreen2.Q, new AttributeSelectorSmallLoadingDelegate()), 0, 8.0f, 8.0f, 2), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), R$id.travelHotelsFiltersScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsFiltersScreen.X;
                        qji.b bVarU2 = travelHotelsFiltersScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.di.TravelHotelsFiltersScreenInjector");
                        g9g.n nVar = (g9g.n) bVarU2;
                        return new g9g.s(nVar.f141747b, nVar.f141748c);
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsFiltersScreen.X;
                        return (n) ((g9g.s) travelHotelsFiltersScreen.V.getValue()).f141808c.get();
                }
            }
        });
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: neg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsFiltersScreen f214511b;

            {
                this.f214511b = this;
            }

            /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelHotelsFiltersScreen travelHotelsFiltersScreen = this.f214511b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsFiltersScreen.X;
                        TravelHotelsFiltersScreen travelHotelsFiltersScreen2 = this.f214511b;
                        return dli.f.a(travelHotelsFiltersScreen2, travelHotelsFiltersScreen2.R2(), zhm.v.k(travelHotelsFiltersScreen2.L, travelHotelsFiltersScreen2.M, travelHotelsFiltersScreen2.N, travelHotelsFiltersScreen2.O, travelHotelsFiltersScreen2.P, travelHotelsFiltersScreen2.R, travelHotelsFiltersScreen2.S, new GridBoxDelegate(zhm.v.k(travelHotelsFiltersScreen2.Q, new AttributeSelectorSmallLoadingDelegate()), 0, 8.0f, 8.0f, 2), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), R$id.travelHotelsFiltersScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsFiltersScreen.X;
                        qji.b bVarU2 = travelHotelsFiltersScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.di.TravelHotelsFiltersScreenInjector");
                        g9g.n nVar = (g9g.n) bVarU2;
                        return new g9g.s(nVar.f141747b, nVar.f141748c);
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsFiltersScreen.X;
                        return (n) ((g9g.s) travelHotelsFiltersScreen.V.getValue()).f141808c.get();
                }
            }
        });
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: neg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsFiltersScreen f214511b;

            {
                this.f214511b = this;
            }

            /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelHotelsFiltersScreen travelHotelsFiltersScreen = this.f214511b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsFiltersScreen.X;
                        TravelHotelsFiltersScreen travelHotelsFiltersScreen2 = this.f214511b;
                        return dli.f.a(travelHotelsFiltersScreen2, travelHotelsFiltersScreen2.R2(), zhm.v.k(travelHotelsFiltersScreen2.L, travelHotelsFiltersScreen2.M, travelHotelsFiltersScreen2.N, travelHotelsFiltersScreen2.O, travelHotelsFiltersScreen2.P, travelHotelsFiltersScreen2.R, travelHotelsFiltersScreen2.S, new GridBoxDelegate(zhm.v.k(travelHotelsFiltersScreen2.Q, new AttributeSelectorSmallLoadingDelegate()), 0, 8.0f, 8.0f, 2), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), R$id.travelHotelsFiltersScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsFiltersScreen.X;
                        qji.b bVarU2 = travelHotelsFiltersScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.di.TravelHotelsFiltersScreenInjector");
                        g9g.n nVar = (g9g.n) bVarU2;
                        return new g9g.s(nVar.f141747b, nVar.f141748c);
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsFiltersScreen.X;
                        return (n) ((g9g.s) travelHotelsFiltersScreen.V.getValue()).f141808c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        neg.o uiState = (neg.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        m mVar = qVar instanceof m ? (m) qVar : null;
        if (mVar == null || mVar.f214521a) {
            d3().f22408c.setMenuItems(uiState.f214524c);
        }
        int i = neg.b.f214512a[uiState.f214523b.ordinal()];
        if (i == 1) {
            LargeActionButton largeActionButton = d3().f22407b;
            largeActionButton.setVisibility(0);
            largeActionButton.setEnabled(true);
        } else if (i == 2) {
            d3().f22407b.setVisibility(8);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            LargeActionButton largeActionButton2 = d3().f22407b;
            largeActionButton2.setVisibility(0);
            largeActionButton2.setEnabled(false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g9g.s) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_search_header_action_filters, null, null, 14);
        NavBarWithToolbar navBarWithToolbar = d3().f22408c;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f22407b.setText(new TextLocalisedClause(R$string.hotels_choose_rooms_amenities_button_title, null, null, 14));
        d3().f22407b.setLoadingButtonTag("BUTTON_LOADING_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22408c.f59410q), null, new f(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f53139c), null, new d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52518c), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52371h.f121375b), null, new neg.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.d.f121375b), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.p()), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22407b.o), null, new f(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.d.f121375b), null, new d(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22408c.o.f57403b), null, new d(this, continuation, 3), 3);
        InputTextDelegate inputTextDelegate = this.S;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTextDelegate.e.f121375b), null, new neg.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTextDelegate.f.f121375b), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.d), null, new neg.e(this, null), 3);
    }

    public final k d3() {
        ViewBinding value = this.U.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n R2() {
        return (n) this.W.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
