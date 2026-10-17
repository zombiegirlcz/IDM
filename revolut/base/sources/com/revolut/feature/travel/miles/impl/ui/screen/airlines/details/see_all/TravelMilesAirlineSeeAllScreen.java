package com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.see_all;

import ahg.b;
import ahg.c;
import ahg.f;
import ahg.g;
import ahg.i;
import ahg.j;
import ahg.k;
import ahg.l;
import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.impl.R$id;
import com.revolut.feature.travel.miles.impl.R$layout;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.see_all.TravelMilesAirlineSeeAllScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.t3;
import ufg.d;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/airlines/details/see_all/TravelMilesAirlineSeeAllScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lahg/l;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelMilesAirlineSeeAllScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TravelMilesAirlineSeeAllScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/miles/impl/databinding/ScreenTravelMilesAirlineSeeAllScreenBinding;", 0))};
    public final int K;
    public final RowDelegate L;
    public final FullScreenStateDelegate M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public TravelMilesAirlineSeeAllScreen(TravelMilesAirlineSeeAllScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_travel_miles_airline_see_all_screen;
        this.L = new RowDelegate(null, null, 7);
        this.M = new FullScreenStateDelegate();
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ahg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesAirlineSeeAllScreen f5112b;

            {
                this.f5112b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesAirlineSeeAllScreen.R;
                        TravelMilesAirlineSeeAllScreen travelMilesAirlineSeeAllScreen = this.f5112b;
                        return dli.f.a(travelMilesAirlineSeeAllScreen, (k) travelMilesAirlineSeeAllScreen.Q.getValue(), v.k(new ListSubheaderDelegate(), travelMilesAirlineSeeAllScreen.L, new RowLoadingDelegate(), travelMilesAirlineSeeAllScreen.M), R$id.travelMilesAirlineSeeAllScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelMilesAirlineSeeAllScreen.R;
                        return (k) ((ufg.d) this.f5112b.P.getValue()).f279681c.get();
                }
            }
        });
        this.O = s.t(this, b.f);
        this.P = w.y0(new agh.b(this, inputData, 3));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: ahg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesAirlineSeeAllScreen f5112b;

            {
                this.f5112b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesAirlineSeeAllScreen.R;
                        TravelMilesAirlineSeeAllScreen travelMilesAirlineSeeAllScreen = this.f5112b;
                        return dli.f.a(travelMilesAirlineSeeAllScreen, (k) travelMilesAirlineSeeAllScreen.Q.getValue(), v.k(new ListSubheaderDelegate(), travelMilesAirlineSeeAllScreen.L, new RowLoadingDelegate(), travelMilesAirlineSeeAllScreen.M), R$id.travelMilesAirlineSeeAllScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelMilesAirlineSeeAllScreen.R;
                        return (k) ((ufg.d) this.f5112b.P.getValue()).f279681c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        j jVar = qVar instanceof j ? (j) qVar : null;
        if (jVar == null || jVar.f5120a) {
            i iVar = uiState.f5122b;
            if (iVar instanceof f) {
                NavBarWithToolbar navBarWithToolbar = d3().f253793b;
                navBarWithToolbar.l0();
                yy0.i iVar2 = yy0.l.Companion;
                f fVar = (f) iVar;
                TextLocalisedClause textLocalisedClause = fVar.f5116b;
                UrlImage urlImage = fVar.f5115a;
                iVar2.getClass();
                navBarWithToolbar.setEndImage(yy0.i.a(urlImage));
                navBarWithToolbar.setTitle(textLocalisedClause, null);
                navBarWithToolbar.setToolbarTitle(textLocalisedClause);
                navBarWithToolbar.setDescriptionText(fVar.f5117c);
                navBarWithToolbar.setDescriptionVisible(true);
                return;
            }
            if (iVar instanceof g) {
                NavBarWithToolbar travelMilesAirlineSeeAllScreenNavBar = d3().f253793b;
                Intrinsics.checkNotNullExpressionValue(travelMilesAirlineSeeAllScreenNavBar, "travelMilesAirlineSeeAllScreenNavBar");
                t3 t3Var = t3.DEFAULT;
                NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
                travelMilesAirlineSeeAllScreenNavBar.I0(t3Var, false);
                return;
            }
            if (!(iVar instanceof ahg.h)) {
                throw new NoWhenBranchMatchedException();
            }
            NavBarWithToolbar travelMilesAirlineSeeAllScreenNavBar2 = d3().f253793b;
            Intrinsics.checkNotNullExpressionValue(travelMilesAirlineSeeAllScreenNavBar2, "travelMilesAirlineSeeAllScreenNavBar");
            t3 t3Var2 = t3.DEFAULT;
            NavBarWithToolbar.Companion companion2 = NavBarWithToolbar.INSTANCE;
            travelMilesAirlineSeeAllScreenNavBar2.I0(t3Var2, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (k) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f253793b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.miles_my_cards_details_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.miles_my_cards_details_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f253793b.f59410q), null, new a07.d(this, null, 25), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52371h.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f53218h), null, new ahg.d(this, null), 3);
    }

    public final rfg.g d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rfg.g) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
