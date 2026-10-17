package com.revolut.feature.travel.miles.impl.ui.screen.reward_flights;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.impl.R$id;
import com.revolut.feature.travel.miles.impl.R$layout;
import com.revolut.feature.travel.miles.impl.ui.screen.reward_flights.TravelMilesRewardFlightsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.c;
import jig.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import rfg.r;
import te0.w;
import u45.w0;
import ufg.g;
import ufg.n;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/reward_flights/TravelMilesRewardFlightsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ljig/d;", "<init>", "()V", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelMilesRewardFlightsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TravelMilesRewardFlightsScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/miles/impl/databinding/ScreenTravelMilesRewardFlightsBinding;", 0))};
    public final Object M;
    public final Object O;
    public final Object P;
    public final int K = R$layout.screen_travel_miles_reward_flights;
    public final FullScreenStateDelegate L = new FullScreenStateDelegate();
    public final h N = s.t(this, a.f);

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, r.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/travel/miles/impl/databinding/ScreenTravelMilesRewardFlightsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            int i = R$id.travelMilesRewardFlightsScreen_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.travelMilesRewardFlightsScreen_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new r(controllerContainerCoordinatorLayout, navBarWithToolbar);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public TravelMilesRewardFlightsScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: jig.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesRewardFlightsScreen f174484b;

            {
                this.f174484b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                int i5 = 1;
                TravelMilesRewardFlightsScreen travelMilesRewardFlightsScreen = this.f174484b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesRewardFlightsScreen.Q;
                        TravelMilesRewardFlightsScreen travelMilesRewardFlightsScreen2 = this.f174484b;
                        return dli.f.a(travelMilesRewardFlightsScreen2, (e) travelMilesRewardFlightsScreen2.P.getValue(), v.k(travelMilesRewardFlightsScreen2.L, new RowLoadingDelegate(), new RowDelegate(null, null, 7), new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate()), R$id.travelMilesRewardFlightsScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesRewardFlightsScreen.Q;
                        qji.b bVarU2 = travelMilesRewardFlightsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.reward_flights.di.TravelMilesRewardFlightsScreenInjector");
                        g gVar = ((n) bVarU2).f279770b;
                        ufg.v vVar = new ufg.v();
                        int i6 = 21;
                        vVar.f279798a = e4m.b.b(new w0(gVar, vVar, i5, i6));
                        vVar.f279799b = e4m.b.b(new w0(gVar, vVar, i3, i6));
                        return vVar;
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesRewardFlightsScreen.Q;
                        return (e) ((ufg.v) travelMilesRewardFlightsScreen.O.getValue()).f279799b.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: jig.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesRewardFlightsScreen f174484b;

            {
                this.f174484b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                int i5 = 1;
                TravelMilesRewardFlightsScreen travelMilesRewardFlightsScreen = this.f174484b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesRewardFlightsScreen.Q;
                        TravelMilesRewardFlightsScreen travelMilesRewardFlightsScreen2 = this.f174484b;
                        return dli.f.a(travelMilesRewardFlightsScreen2, (e) travelMilesRewardFlightsScreen2.P.getValue(), v.k(travelMilesRewardFlightsScreen2.L, new RowLoadingDelegate(), new RowDelegate(null, null, 7), new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate()), R$id.travelMilesRewardFlightsScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesRewardFlightsScreen.Q;
                        qji.b bVarU2 = travelMilesRewardFlightsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.reward_flights.di.TravelMilesRewardFlightsScreenInjector");
                        g gVar = ((n) bVarU2).f279770b;
                        ufg.v vVar = new ufg.v();
                        int i6 = 21;
                        vVar.f279798a = e4m.b.b(new w0(gVar, vVar, i5, i6));
                        vVar.f279799b = e4m.b.b(new w0(gVar, vVar, i3, i6));
                        return vVar;
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesRewardFlightsScreen.Q;
                        return (e) ((ufg.v) travelMilesRewardFlightsScreen.O.getValue()).f279799b.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: jig.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesRewardFlightsScreen f174484b;

            {
                this.f174484b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 0;
                int i5 = 1;
                TravelMilesRewardFlightsScreen travelMilesRewardFlightsScreen = this.f174484b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesRewardFlightsScreen.Q;
                        TravelMilesRewardFlightsScreen travelMilesRewardFlightsScreen2 = this.f174484b;
                        return dli.f.a(travelMilesRewardFlightsScreen2, (e) travelMilesRewardFlightsScreen2.P.getValue(), v.k(travelMilesRewardFlightsScreen2.L, new RowLoadingDelegate(), new RowDelegate(null, null, 7), new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate()), R$id.travelMilesRewardFlightsScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesRewardFlightsScreen.Q;
                        qji.b bVarU2 = travelMilesRewardFlightsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.reward_flights.di.TravelMilesRewardFlightsScreenInjector");
                        g gVar = ((n) bVarU2).f279770b;
                        ufg.v vVar = new ufg.v();
                        int i6 = 21;
                        vVar.f279798a = e4m.b.b(new w0(gVar, vVar, i5, i6));
                        vVar.f279799b = e4m.b.b(new w0(gVar, vVar, i32, i6));
                        return vVar;
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesRewardFlightsScreen.Q;
                        return (e) ((ufg.v) travelMilesRewardFlightsScreen.O.getValue()).f279799b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ufg.v) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (jig.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((r) value).f253823b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.miles_search_reward_flights_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.miles_search_reward_flights_description, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((r) value).f253823b.f59410q), null, new j2c.b(this, null, 26), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52371h.f121375b), null, new jig.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.M.getValue();
    }
}
