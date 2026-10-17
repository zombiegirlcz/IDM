package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c9g.v;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsBadgeDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsImageDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPriceDelegate;
import com.revolut.core.ui_kit.delegates.ExtraLargeListingCardDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RoomListingCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.TravelHotelsRoomsSelectionScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import g9g.i0;
import iaf.d;
import ieg.g;
import ieg.i;
import ieg.j;
import ieg.k;
import ieg.p;
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
import xki.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/rooms_selection/TravelHotelsRoomsSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/rooms_selection/a;", "Ldli/a;", "Lieg/q;", "<init>", "()V", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsRoomsSelectionScreen extends ViewController<com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.a> implements dli.a {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(TravelHotelsRoomsSelectionScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsRoomsSelectionBinding;", 0))};
    public final Object T;
    public final Object V;
    public final Object W;
    public final Object X;
    public final h K = s.t(this, a.f);
    public final LargeActionButtonDelegate L = new LargeActionButtonDelegate();
    public final CellDetailsDelegate M = new CellDetailsDelegate();
    public final ExtraLargeListingCardDelegate N = new ExtraLargeListingCardDelegate();
    public final ListSubheaderDelegate O = new ListSubheaderDelegate();
    public final SingleChoiceDelegate P = new SingleChoiceDelegate();
    public final TextDelegate Q = new TextDelegate();
    public final TwinHorizontalButtonDelegate R = new TwinHorizontalButtonDelegate();
    public final FullScreenStateDelegate S = new FullScreenStateDelegate();
    public final int U = R$layout.screen_travel_hotels_rooms_selection;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, v.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsRoomsSelectionBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return v.a(p0);
        }
    }

    public TravelHotelsRoomsSelectionScreen() {
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: ieg.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsRoomsSelectionScreen f160717b;

            {
                this.f160717b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelHotelsRoomsSelectionScreen travelHotelsRoomsSelectionScreen = this.f160717b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsRoomsSelectionScreen.Y;
                        return (j60.a) ((i0) travelHotelsRoomsSelectionScreen.W.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsRoomsSelectionScreen.Y;
                        TravelHotelsRoomsSelectionScreen travelHotelsRoomsSelectionScreen2 = this.f160717b;
                        return dli.f.a(travelHotelsRoomsSelectionScreen2, travelHotelsRoomsSelectionScreen2.R2(), zhm.v.k(travelHotelsRoomsSelectionScreen2.M, travelHotelsRoomsSelectionScreen2.L, travelHotelsRoomsSelectionScreen2.N, travelHotelsRoomsSelectionScreen2.O, travelHotelsRoomsSelectionScreen2.P, travelHotelsRoomsSelectionScreen2.Q, travelHotelsRoomsSelectionScreen2.R, travelHotelsRoomsSelectionScreen2.S, new TextDelegate(), new CellDetailsPriceDelegate(), new CellDetailsBadgeDelegate(), new CellDetailsImageDelegate(), new RoomListingCardLoadingDelegate()), R$id.travelHotelsRoomsSelectionScreen_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = TravelHotelsRoomsSelectionScreen.Y;
                        qji.b bVarU2 = travelHotelsRoomsSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.di.TravelHotelsRoomsSelectionScreenInjector");
                        g9g.o0 o0Var = (g9g.o0) bVarU2;
                        g9g.d dVar = o0Var.f141766b;
                        g9g.o0 o0Var2 = o0Var.f141767c;
                        i0 i0Var = new i0();
                        i0Var.f141692a = e4m.b.b(e4m.c.a(travelHotelsRoomsSelectionScreen));
                        int i3 = 19;
                        i0Var.f141693b = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 2, i3));
                        i0Var.f141694c = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 1, i3));
                        i0Var.d = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 0, i3));
                        i0Var.e = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 4, i3));
                        i0Var.f = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 3, i3));
                        i0Var.f141695g = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 7, i3));
                        i0Var.f141696h = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 6, i3));
                        i0Var.i = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 8, i3));
                        i0Var.f141697j = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 9, i3));
                        i0Var.k = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 5, i3));
                        return i0Var;
                    default:
                        KProperty[] kPropertyArr4 = TravelHotelsRoomsSelectionScreen.Y;
                        return (p) ((i0) travelHotelsRoomsSelectionScreen.W.getValue()).k.get();
                }
            }
        });
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: ieg.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsRoomsSelectionScreen f160717b;

            {
                this.f160717b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelHotelsRoomsSelectionScreen travelHotelsRoomsSelectionScreen = this.f160717b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsRoomsSelectionScreen.Y;
                        return (j60.a) ((i0) travelHotelsRoomsSelectionScreen.W.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsRoomsSelectionScreen.Y;
                        TravelHotelsRoomsSelectionScreen travelHotelsRoomsSelectionScreen2 = this.f160717b;
                        return dli.f.a(travelHotelsRoomsSelectionScreen2, travelHotelsRoomsSelectionScreen2.R2(), zhm.v.k(travelHotelsRoomsSelectionScreen2.M, travelHotelsRoomsSelectionScreen2.L, travelHotelsRoomsSelectionScreen2.N, travelHotelsRoomsSelectionScreen2.O, travelHotelsRoomsSelectionScreen2.P, travelHotelsRoomsSelectionScreen2.Q, travelHotelsRoomsSelectionScreen2.R, travelHotelsRoomsSelectionScreen2.S, new TextDelegate(), new CellDetailsPriceDelegate(), new CellDetailsBadgeDelegate(), new CellDetailsImageDelegate(), new RoomListingCardLoadingDelegate()), R$id.travelHotelsRoomsSelectionScreen_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = TravelHotelsRoomsSelectionScreen.Y;
                        qji.b bVarU2 = travelHotelsRoomsSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.di.TravelHotelsRoomsSelectionScreenInjector");
                        g9g.o0 o0Var = (g9g.o0) bVarU2;
                        g9g.d dVar = o0Var.f141766b;
                        g9g.o0 o0Var2 = o0Var.f141767c;
                        i0 i0Var = new i0();
                        i0Var.f141692a = e4m.b.b(e4m.c.a(travelHotelsRoomsSelectionScreen));
                        int i3 = 19;
                        i0Var.f141693b = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 2, i3));
                        i0Var.f141694c = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 1, i3));
                        i0Var.d = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 0, i3));
                        i0Var.e = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 4, i3));
                        i0Var.f = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 3, i3));
                        i0Var.f141695g = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 7, i3));
                        i0Var.f141696h = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 6, i3));
                        i0Var.i = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 8, i3));
                        i0Var.f141697j = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 9, i3));
                        i0Var.k = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 5, i3));
                        return i0Var;
                    default:
                        KProperty[] kPropertyArr4 = TravelHotelsRoomsSelectionScreen.Y;
                        return (p) ((i0) travelHotelsRoomsSelectionScreen.W.getValue()).k.get();
                }
            }
        });
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: ieg.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsRoomsSelectionScreen f160717b;

            {
                this.f160717b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelHotelsRoomsSelectionScreen travelHotelsRoomsSelectionScreen = this.f160717b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsRoomsSelectionScreen.Y;
                        return (j60.a) ((i0) travelHotelsRoomsSelectionScreen.W.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsRoomsSelectionScreen.Y;
                        TravelHotelsRoomsSelectionScreen travelHotelsRoomsSelectionScreen2 = this.f160717b;
                        return dli.f.a(travelHotelsRoomsSelectionScreen2, travelHotelsRoomsSelectionScreen2.R2(), zhm.v.k(travelHotelsRoomsSelectionScreen2.M, travelHotelsRoomsSelectionScreen2.L, travelHotelsRoomsSelectionScreen2.N, travelHotelsRoomsSelectionScreen2.O, travelHotelsRoomsSelectionScreen2.P, travelHotelsRoomsSelectionScreen2.Q, travelHotelsRoomsSelectionScreen2.R, travelHotelsRoomsSelectionScreen2.S, new TextDelegate(), new CellDetailsPriceDelegate(), new CellDetailsBadgeDelegate(), new CellDetailsImageDelegate(), new RoomListingCardLoadingDelegate()), R$id.travelHotelsRoomsSelectionScreen_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = TravelHotelsRoomsSelectionScreen.Y;
                        qji.b bVarU2 = travelHotelsRoomsSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.di.TravelHotelsRoomsSelectionScreenInjector");
                        g9g.o0 o0Var = (g9g.o0) bVarU2;
                        g9g.d dVar = o0Var.f141766b;
                        g9g.o0 o0Var2 = o0Var.f141767c;
                        i0 i0Var = new i0();
                        i0Var.f141692a = e4m.b.b(e4m.c.a(travelHotelsRoomsSelectionScreen));
                        int i32 = 19;
                        i0Var.f141693b = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 2, i32));
                        i0Var.f141694c = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 1, i32));
                        i0Var.d = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 0, i32));
                        i0Var.e = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 4, i32));
                        i0Var.f = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 3, i32));
                        i0Var.f141695g = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 7, i32));
                        i0Var.f141696h = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 6, i32));
                        i0Var.i = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 8, i32));
                        i0Var.f141697j = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 9, i32));
                        i0Var.k = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 5, i32));
                        return i0Var;
                    default:
                        KProperty[] kPropertyArr4 = TravelHotelsRoomsSelectionScreen.Y;
                        return (p) ((i0) travelHotelsRoomsSelectionScreen.W.getValue()).k.get();
                }
            }
        });
        final int i5 = 3;
        this.X = w.y0(new Function0(this) { // from class: ieg.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsRoomsSelectionScreen f160717b;

            {
                this.f160717b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                TravelHotelsRoomsSelectionScreen travelHotelsRoomsSelectionScreen = this.f160717b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsRoomsSelectionScreen.Y;
                        return (j60.a) ((i0) travelHotelsRoomsSelectionScreen.W.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsRoomsSelectionScreen.Y;
                        TravelHotelsRoomsSelectionScreen travelHotelsRoomsSelectionScreen2 = this.f160717b;
                        return dli.f.a(travelHotelsRoomsSelectionScreen2, travelHotelsRoomsSelectionScreen2.R2(), zhm.v.k(travelHotelsRoomsSelectionScreen2.M, travelHotelsRoomsSelectionScreen2.L, travelHotelsRoomsSelectionScreen2.N, travelHotelsRoomsSelectionScreen2.O, travelHotelsRoomsSelectionScreen2.P, travelHotelsRoomsSelectionScreen2.Q, travelHotelsRoomsSelectionScreen2.R, travelHotelsRoomsSelectionScreen2.S, new TextDelegate(), new CellDetailsPriceDelegate(), new CellDetailsBadgeDelegate(), new CellDetailsImageDelegate(), new RoomListingCardLoadingDelegate()), R$id.travelHotelsRoomsSelectionScreen_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = TravelHotelsRoomsSelectionScreen.Y;
                        qji.b bVarU2 = travelHotelsRoomsSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.di.TravelHotelsRoomsSelectionScreenInjector");
                        g9g.o0 o0Var = (g9g.o0) bVarU2;
                        g9g.d dVar = o0Var.f141766b;
                        g9g.o0 o0Var2 = o0Var.f141767c;
                        i0 i0Var = new i0();
                        i0Var.f141692a = e4m.b.b(e4m.c.a(travelHotelsRoomsSelectionScreen));
                        int i32 = 19;
                        i0Var.f141693b = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 2, i32));
                        i0Var.f141694c = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 1, i32));
                        i0Var.d = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 0, i32));
                        i0Var.e = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 4, i32));
                        i0Var.f = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 3, i32));
                        i0Var.f141695g = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 7, i32));
                        i0Var.f141696h = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 6, i32));
                        i0Var.i = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 8, i32));
                        i0Var.f141697j = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 9, i32));
                        i0Var.k = e4m.b.b(new ehe.o(dVar, o0Var2, i0Var, 5, i32));
                        return i0Var;
                    default:
                        KProperty[] kPropertyArr4 = TravelHotelsRoomsSelectionScreen.Y;
                        return (p) ((i0) travelHotelsRoomsSelectionScreen.W.getValue()).k.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        ieg.q uiState = (ieg.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f22435b;
        Clause clause = uiState.f160730b;
        navBarWithToolbar.setDescriptionVisible(clause != null);
        if (clause != null) {
            navBarWithToolbar.setDescriptionText(clause);
        }
        d3().f22435b.setFilters(uiState.f160731c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i0) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.T.getValue()).d(zhm.v.k(this.M, this.L, this.P, this.Q, this.R));
        NavBarWithToolbar navBarWithToolbar = d3().f22435b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.hotels_property_room_selection_select_room, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.hotels_property_room_selection_select_room, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22435b.f59410q), null, new d(this, null, 3), 3);
        ExtraLargeListingCardDelegate extraLargeListingCardDelegate = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(extraLargeListingCardDelegate.d.f121375b), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(extraLargeListingCardDelegate.f52266c), null, new ieg.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(extraLargeListingCardDelegate.f52268h), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.p()), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22435b.s0()), null, new k(this, null), 3);
    }

    public final v d3() {
        ViewBinding value = this.K.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (v) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p R2() {
        return (p) this.X.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.V.getValue();
    }
}
