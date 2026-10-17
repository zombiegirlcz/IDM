package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.pastcancelled;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import c9g.m;
import com.revolut.core.ui_kit.delegates.ListingTileDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.core.api.R$string;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.pastcancelled.TravelHotelsBookingsPastAndCancelledScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import g9g.i;
import g9g.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import m9d.y0;
import mbg.d;
import mbg.e;
import mbg.f;
import sji.b;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/bookings/pastcancelled/TravelHotelsBookingsPastAndCancelledScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lmbg/e;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lmbg/d;", "<init>", "()V", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsBookingsPastAndCancelledScreen extends BaseRecyclerViewScreen<e, IOData$EmptyInput, d> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(TravelHotelsBookingsPastAndCancelledScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsPastAndCancelledBinding;", 0))};
    public final int U;
    public final int V;
    public final boolean W;
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ListingTileDelegate f93857a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f93858b0;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsPastAndCancelledBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.pastAndCancelled_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.pastAndCancelled_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new m((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public TravelHotelsBookingsPastAndCancelledScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_travel_hotels_past_and_cancelled;
        this.V = R$id.pastAndCancelled_recyclerView;
        this.W = true;
        this.X = s.t(this, a.f);
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: mbg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsBookingsPastAndCancelledScreen f204207b;

            {
                this.f204207b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelHotelsBookingsPastAndCancelledScreen travelHotelsBookingsPastAndCancelledScreen = this.f204207b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsBookingsPastAndCancelledScreen.c0;
                        qji.b bVarQ2 = travelHotelsBookingsPastAndCancelledScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.pastcancelled.di.TravelHotelsPastAndCancelledScreenInjector");
                        g9g.d dVar = ((t) bVarQ2).f141813b;
                        i iVar = new i();
                        iVar.f141690a = e4m.b.b(new fta.e(dVar, iVar, 1, 19));
                        iVar.f141691b = e4m.b.b(new fta.e(dVar, iVar, 0, 19));
                        return iVar;
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsBookingsPastAndCancelledScreen.c0;
                        return (f) ((i) travelHotelsBookingsPastAndCancelledScreen.Y.getValue()).f141691b.get();
                }
            }
        });
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: mbg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsBookingsPastAndCancelledScreen f204207b;

            {
                this.f204207b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelHotelsBookingsPastAndCancelledScreen travelHotelsBookingsPastAndCancelledScreen = this.f204207b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsBookingsPastAndCancelledScreen.c0;
                        qji.b bVarQ2 = travelHotelsBookingsPastAndCancelledScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.pastcancelled.di.TravelHotelsPastAndCancelledScreenInjector");
                        g9g.d dVar = ((t) bVarQ2).f141813b;
                        i iVar = new i();
                        iVar.f141690a = e4m.b.b(new fta.e(dVar, iVar, 1, 19));
                        iVar.f141691b = e4m.b.b(new fta.e(dVar, iVar, 0, 19));
                        return iVar;
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsBookingsPastAndCancelledScreen.c0;
                        return (f) ((i) travelHotelsBookingsPastAndCancelledScreen.Y.getValue()).f141691b.get();
                }
            }
        });
        ListingTileDelegate listingTileDelegate = new ListingTileDelegate();
        this.f93857a0 = listingTileDelegate;
        this.f93858b0 = u.c(listingTileDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (i) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (f) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.X.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f22412b.f59410q), null, new y0(this, null, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f93857a0.f52751c), null, new m75.i(this, null, 11), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.travel_screen_booking_past_and_cancelled_title, null, null, 14);
        ViewBinding value = this.X.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f22412b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_left));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getZ() {
        return this.f93858b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF0() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
