package com.revolut.feature.travel.miles.impl.ui.screen.recommended_flight;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c1;
import aw0.i;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TripDetailsDelegate;
import com.revolut.core.ui_kit.delegates.TripDetailsLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.impl.R$id;
import com.revolut.feature.travel.miles.impl.R$layout;
import com.revolut.feature.travel.miles.impl.ui.screen.recommended_flight.TravelMilesRecommendedFlightsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import ghk.t;
import gig.b;
import gig.c;
import gig.d;
import gig.f;
import gig.i;
import gig.j;
import gig.n;
import gig.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import ufg.u;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/recommended_flight/TravelMilesRecommendedFlightsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgig/n;", "Ldli/a;", "Lgig/q;", "Companion", "a", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelMilesRecommendedFlightsScreen extends ViewController<n> implements dli.a {
    public final int K;
    public final int L;
    public final CellDetailsChevronDelegate M;
    public final ActionsDelegate N;
    public final RowDelegate O;
    public final ScrollerDelegate P;
    public final Object Q;
    public final h R;
    public final Object S;
    public final Object T;
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(TravelMilesRecommendedFlightsScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/miles/impl/databinding/ScreenTravelMilesRecommendedFlightsBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public TravelMilesRecommendedFlightsScreen(TravelMilesRecommendedFlightsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_travel_miles_recommended_flights;
        this.L = R$style.UiKitTheme_Transparent;
        this.M = new CellDetailsChevronDelegate();
        this.N = new ActionsDelegate();
        this.O = new RowDelegate(null, null, 7);
        final int i = 0;
        final int i2 = 1;
        this.P = new ScrollerDelegate(v.k(new TripDetailsLoadingDelegate(), new TripDetailsDelegate()), false);
        this.Q = w.y0(new Function0(this) { // from class: gig.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesRecommendedFlightsScreen f144187b;

            {
                this.f144187b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesRecommendedFlightsScreen.U;
                        TravelMilesRecommendedFlightsScreen travelMilesRecommendedFlightsScreen = this.f144187b;
                        return dli.f.a(travelMilesRecommendedFlightsScreen, travelMilesRecommendedFlightsScreen.d(), v.k(new ListSubheaderDelegate(), new SmallActionButtonDelegate(), new LargeActionButtonDelegate(), travelMilesRecommendedFlightsScreen.N, travelMilesRecommendedFlightsScreen.O, new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), travelMilesRecommendedFlightsScreen.M, new LargeActionButtonLoadingDelegate(), travelMilesRecommendedFlightsScreen.P, new TextDelegate()), R$id.travelMilesRecommendedFlightsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelMilesRecommendedFlightsScreen.U;
                        return (o) ((u) this.f144187b.S.getValue()).f279797c.get();
                }
            }
        });
        this.R = s.t(this, b.f);
        this.S = w.y0(new t(this, inputData, i2));
        this.T = w.y0(new Function0(this) { // from class: gig.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesRecommendedFlightsScreen f144187b;

            {
                this.f144187b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesRecommendedFlightsScreen.U;
                        TravelMilesRecommendedFlightsScreen travelMilesRecommendedFlightsScreen = this.f144187b;
                        return dli.f.a(travelMilesRecommendedFlightsScreen, travelMilesRecommendedFlightsScreen.d(), v.k(new ListSubheaderDelegate(), new SmallActionButtonDelegate(), new LargeActionButtonDelegate(), travelMilesRecommendedFlightsScreen.N, travelMilesRecommendedFlightsScreen.O, new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), travelMilesRecommendedFlightsScreen.M, new LargeActionButtonLoadingDelegate(), travelMilesRecommendedFlightsScreen.P, new TextDelegate()), R$id.travelMilesRecommendedFlightsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelMilesRecommendedFlightsScreen.U;
                        return (o) ((u) this.f144187b.S.getValue()).f279797c.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getR() {
        return Integer.valueOf(this.L);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        gig.q uiState = (gig.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        boolean z = uiState.f144204b;
        if (!(qVar instanceof p)) {
            ActionFooterView travelMilesRecommendedFlightsScreenButton = d3().f253820b;
            Intrinsics.checkNotNullExpressionValue(travelMilesRecommendedFlightsScreenButton, "travelMilesRecommendedFlightsScreenButton");
            travelMilesRecommendedFlightsScreenButton.setVisibility(z ? 0 : 8);
        } else if (((p) qVar).f144202a) {
            ActionFooterView travelMilesRecommendedFlightsScreenButton2 = d3().f253820b;
            Intrinsics.checkNotNullExpressionValue(travelMilesRecommendedFlightsScreenButton2, "travelMilesRecommendedFlightsScreenButton");
            travelMilesRecommendedFlightsScreenButton2.setVisibility(z ? 0 : 8);
        }
        ActionFooterView travelMilesRecommendedFlightsScreenButton3 = d3().f253820b;
        Intrinsics.checkNotNullExpressionValue(travelMilesRecommendedFlightsScreenButton3, "travelMilesRecommendedFlightsScreenButton");
        if (travelMilesRecommendedFlightsScreenButton3.getVisibility() == 0) {
            i iVar = uiState.d;
            if (iVar != null) {
                d3().f253820b.setModel(iVar);
            }
            ScreenContentRecyclerView travelMilesRecommendedFlightsScreenRecyclerView = d3().d;
            Intrinsics.checkNotNullExpressionValue(travelMilesRecommendedFlightsScreenRecyclerView, "travelMilesRecommendedFlightsScreenRecyclerView");
            Context context = D2().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            travelMilesRecommendedFlightsScreenRecyclerView.setPadding(travelMilesRecommendedFlightsScreenRecyclerView.getPaddingLeft(), travelMilesRecommendedFlightsScreenRecyclerView.getPaddingTop(), travelMilesRecommendedFlightsScreenRecyclerView.getPaddingRight(), kli.a.k(context, 76.0f));
        }
        gig.i iVar2 = uiState.f144205c;
        if (iVar2 instanceof i.a) {
            d3().f253821c.setLoadingState(true);
            return;
        }
        if (iVar2 instanceof j) {
            NavBarWithBigTile navBarWithBigTile = d3().f253821c;
            navBarWithBigTile.setLoadingState(false);
            c1.S(navBarWithBigTile, ((j) iVar2).f144195a, null, null, 6);
            navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
            return;
        }
        if (!(iVar2 instanceof gig.h)) {
            throw new NoWhenBranchMatchedException();
        }
        NavBarWithBigTile navBarWithBigTile2 = d3().f253821c;
        navBarWithBigTile2.setLoadingState(false);
        gig.h hVar = (gig.h) iVar2;
        navBarWithBigTile2.setToolbarTitle(hVar.f144192a);
        c1.S(navBarWithBigTile2, hVar.f144193b, null, null, 6);
        navBarWithBigTile2.setThemeBasedColorSchemeEnabled(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f253821c.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        d3().f253821c.setToolbarTitle(new TextLocalisedClause(R$string.miles_recommended_flights_screen, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f253821c.f59357t), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f51821c), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f51611c.f121375b), null, new gig.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f53218h), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f253820b.f), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.q(rd0.e.b(this.P.i)), null, new gig.e(this, continuation, 1), 3);
    }

    public final rfg.q d3() {
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rfg.q) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final gig.o d() {
        return (gig.o) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
