package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.amenities_filter;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import c9g.u;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.amenities_filter.TravelHotelsRoomAmenitiesFilterScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import g9g.i1;
import g9g.j1;
import jeg.b;
import jeg.c;
import jeg.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/rooms_selection/amenities_filter/TravelHotelsRoomAmenitiesFilterScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ljeg/f;", "<init>", "()V", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsRoomAmenitiesFilterScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TravelHotelsRoomAmenitiesFilterScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsRoomAmenitiesFilterBinding;", 0))};
    public final Object M;
    public final Object O;
    public final Object P;
    public final int K = R$layout.screen_travel_hotels_room_amenities_filter;
    public final InputChecklistDelegate L = new InputChecklistDelegate();
    public final h N = s.t(this, a.f);

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsRoomAmenitiesFilterBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.travelHotelsRoomAmenitiesFilterScreen_button;
            LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
            if (largeActionButton != null) {
                ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
                int i2 = R$id.travelHotelsRoomAmenitiesFilterScreen_navBar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i2);
                if (navBarWithToolbar != null) {
                    i2 = R$id.travelHotelsRoomAmenitiesFilterScreen_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i2)) != null) {
                        return new u(largeActionButton, navBarWithToolbar, controllerContainerCoordinatorLayout);
                    }
                }
                i = i2;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public TravelHotelsRoomAmenitiesFilterScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: jeg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsRoomAmenitiesFilterScreen f173388b;

            {
                this.f173388b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelHotelsRoomAmenitiesFilterScreen travelHotelsRoomAmenitiesFilterScreen = this.f173388b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsRoomAmenitiesFilterScreen.Q;
                        TravelHotelsRoomAmenitiesFilterScreen travelHotelsRoomAmenitiesFilterScreen2 = this.f173388b;
                        return dli.f.a(travelHotelsRoomAmenitiesFilterScreen2, travelHotelsRoomAmenitiesFilterScreen2.R2(), v.k(travelHotelsRoomAmenitiesFilterScreen2.L, new ListSubheaderDelegate()), R$id.travelHotelsRoomAmenitiesFilterScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsRoomAmenitiesFilterScreen.Q;
                        qji.b bVarU2 = travelHotelsRoomAmenitiesFilterScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.amenities_filter.di.TravelHotelsRoomAmenitiesFilterScreenInjector");
                        return (j1) ((i1) ((keg.a) bVarU2).b().mo3808a(travelHotelsRoomAmenitiesFilterScreen)).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsRoomAmenitiesFilterScreen.Q;
                        j1 j1Var = (j1) travelHotelsRoomAmenitiesFilterScreen.O.getValue();
                        switch (j1Var.f141721a) {
                            case 0:
                                return (e) j1Var.f141723c.get();
                            default:
                                return (e) j1Var.f141723c.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: jeg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsRoomAmenitiesFilterScreen f173388b;

            {
                this.f173388b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelHotelsRoomAmenitiesFilterScreen travelHotelsRoomAmenitiesFilterScreen = this.f173388b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsRoomAmenitiesFilterScreen.Q;
                        TravelHotelsRoomAmenitiesFilterScreen travelHotelsRoomAmenitiesFilterScreen2 = this.f173388b;
                        return dli.f.a(travelHotelsRoomAmenitiesFilterScreen2, travelHotelsRoomAmenitiesFilterScreen2.R2(), v.k(travelHotelsRoomAmenitiesFilterScreen2.L, new ListSubheaderDelegate()), R$id.travelHotelsRoomAmenitiesFilterScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsRoomAmenitiesFilterScreen.Q;
                        qji.b bVarU2 = travelHotelsRoomAmenitiesFilterScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.amenities_filter.di.TravelHotelsRoomAmenitiesFilterScreenInjector");
                        return (j1) ((i1) ((keg.a) bVarU2).b().mo3808a(travelHotelsRoomAmenitiesFilterScreen)).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsRoomAmenitiesFilterScreen.Q;
                        j1 j1Var = (j1) travelHotelsRoomAmenitiesFilterScreen.O.getValue();
                        switch (j1Var.f141721a) {
                            case 0:
                                return (e) j1Var.f141723c.get();
                            default:
                                return (e) j1Var.f141723c.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: jeg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsRoomAmenitiesFilterScreen f173388b;

            {
                this.f173388b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelHotelsRoomAmenitiesFilterScreen travelHotelsRoomAmenitiesFilterScreen = this.f173388b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsRoomAmenitiesFilterScreen.Q;
                        TravelHotelsRoomAmenitiesFilterScreen travelHotelsRoomAmenitiesFilterScreen2 = this.f173388b;
                        return dli.f.a(travelHotelsRoomAmenitiesFilterScreen2, travelHotelsRoomAmenitiesFilterScreen2.R2(), v.k(travelHotelsRoomAmenitiesFilterScreen2.L, new ListSubheaderDelegate()), R$id.travelHotelsRoomAmenitiesFilterScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsRoomAmenitiesFilterScreen.Q;
                        qji.b bVarU2 = travelHotelsRoomAmenitiesFilterScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.amenities_filter.di.TravelHotelsRoomAmenitiesFilterScreenInjector");
                        return (j1) ((i1) ((keg.a) bVarU2).b().mo3808a(travelHotelsRoomAmenitiesFilterScreen)).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsRoomAmenitiesFilterScreen.Q;
                        j1 j1Var = (j1) travelHotelsRoomAmenitiesFilterScreen.O.getValue();
                        switch (j1Var.f141721a) {
                            case 0:
                                return (e) j1Var.f141723c.get();
                            default:
                                return (e) j1Var.f141723c.get();
                        }
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
    public final e R1() {
        return (j1) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_search_filters_category_amenities_title, null, null, 14);
        NavBarWithToolbar navBarWithToolbar = d3().f22433c;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setMenuItems(zhm.u.c(new TextNavBarMenuItem("RESET_FILTERS_ITEM_ID", new TextLocalisedClause(R$string.hotels_common_action_reset, null, null, 14), null, null, 12)));
        d3().f22432b.setText(new TextLocalisedClause(R$string.hotels_choose_rooms_amenities_button_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22433c.f59410q), null, new b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22433c.o.f57403b), null, new j82.q(this, continuation, 18), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52518c), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22432b.o), null, new b(this, continuation, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final jeg.e d() {
        return (jeg.e) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
