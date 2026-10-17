package com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c1;
import aw0.i;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
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
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TabsLoadingDelegate;
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
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details.TravelMilesFlightSearchResultDetailsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import khg.b;
import khg.c;
import khg.d;
import khg.f;
import khg.g;
import khg.j;
import khg.m;
import khg.p;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import org.jetbrains.annotations.NotNull;
import rfg.n;
import te0.w;
import ufg.l;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_search_result_details/TravelMilesFlightSearchResultDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkhg/m;", "Ldli/a;", "Lkhg/p;", "Lno/k;", "Companion", "a", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelMilesFlightSearchResultDetailsScreen extends ViewController<m> implements dli.a, k {
    public AnalyticsContext K;
    public final int L;
    public final int M;
    public final CellDetailsChevronDelegate N;
    public final ActionsDelegate O;
    public final RowDelegate P;
    public final TabsDelegate Q;
    public final TripDetailsDelegate R;
    public final ScrollerDelegate S;
    public final Object T;
    public final h U;
    public final Object V;
    public final Object W;
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(TravelMilesFlightSearchResultDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/miles/impl/databinding/ScreenTravelMilesFlightSearchResultDetailsBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public TravelMilesFlightSearchResultDetailsScreen(TravelMilesFlightSearchResultDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = R$layout.screen_travel_miles_flight_search_result_details;
        this.M = R$style.UiKitTheme_Transparent;
        this.N = new CellDetailsChevronDelegate();
        this.O = new ActionsDelegate();
        this.P = new RowDelegate(null, null, 7);
        this.Q = new TabsDelegate();
        TripDetailsDelegate tripDetailsDelegate = new TripDetailsDelegate();
        this.R = tripDetailsDelegate;
        final int i = 0;
        final int i2 = 1;
        this.S = new ScrollerDelegate(v.k(new TripDetailsLoadingDelegate(), tripDetailsDelegate), false);
        this.T = w.y0(new Function0(this) { // from class: khg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesFlightSearchResultDetailsScreen f184120b;

            {
                this.f184120b = this;
            }

            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesFlightSearchResultDetailsScreen.X;
                        TravelMilesFlightSearchResultDetailsScreen travelMilesFlightSearchResultDetailsScreen = this.f184120b;
                        return dli.f.a(travelMilesFlightSearchResultDetailsScreen, travelMilesFlightSearchResultDetailsScreen.d(), v.k(new ListSubheaderDelegate(), new SmallActionButtonDelegate(), new LargeActionButtonDelegate(), travelMilesFlightSearchResultDetailsScreen.O, travelMilesFlightSearchResultDetailsScreen.P, new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), travelMilesFlightSearchResultDetailsScreen.N, new LargeActionButtonLoadingDelegate(), travelMilesFlightSearchResultDetailsScreen.S, new TextDelegate(), travelMilesFlightSearchResultDetailsScreen.Q, new TabsLoadingDelegate()), R$id.travelMilesFlightSearchResultDetailsScreen_recyclerView, null, new koi.h(null, false, true, 3), null, 40);
                    default:
                        KProperty[] kPropertyArr2 = TravelMilesFlightSearchResultDetailsScreen.X;
                        return (n) ((ufg.l) this.f184120b.V.getValue()).f279761c.get();
                }
            }
        });
        this.U = s.t(this, b.f);
        this.V = w.y0(new k8e.a(this, inputData, 13));
        this.W = w.y0(new Function0(this) { // from class: khg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesFlightSearchResultDetailsScreen f184120b;

            {
                this.f184120b = this;
            }

            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesFlightSearchResultDetailsScreen.X;
                        TravelMilesFlightSearchResultDetailsScreen travelMilesFlightSearchResultDetailsScreen = this.f184120b;
                        return dli.f.a(travelMilesFlightSearchResultDetailsScreen, travelMilesFlightSearchResultDetailsScreen.d(), v.k(new ListSubheaderDelegate(), new SmallActionButtonDelegate(), new LargeActionButtonDelegate(), travelMilesFlightSearchResultDetailsScreen.O, travelMilesFlightSearchResultDetailsScreen.P, new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), travelMilesFlightSearchResultDetailsScreen.N, new LargeActionButtonLoadingDelegate(), travelMilesFlightSearchResultDetailsScreen.S, new TextDelegate(), travelMilesFlightSearchResultDetailsScreen.Q, new TabsLoadingDelegate()), R$id.travelMilesFlightSearchResultDetailsScreen_recyclerView, null, new koi.h(null, false, true, 3), null, 40);
                    default:
                        KProperty[] kPropertyArr2 = TravelMilesFlightSearchResultDetailsScreen.X;
                        return (n) ((ufg.l) this.f184120b.V.getValue()).f279761c.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getR() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        boolean z = uiState.f184134b;
        if (!(qVar instanceof khg.o)) {
            ActionFooterView travelMilesFlightSearchResultDetailsScreenButton = d3().f253811b;
            Intrinsics.checkNotNullExpressionValue(travelMilesFlightSearchResultDetailsScreenButton, "travelMilesFlightSearchResultDetailsScreenButton");
            travelMilesFlightSearchResultDetailsScreenButton.setVisibility(z ? 0 : 8);
        } else if (((khg.o) qVar).f184132a) {
            ActionFooterView travelMilesFlightSearchResultDetailsScreenButton2 = d3().f253811b;
            Intrinsics.checkNotNullExpressionValue(travelMilesFlightSearchResultDetailsScreenButton2, "travelMilesFlightSearchResultDetailsScreenButton");
            travelMilesFlightSearchResultDetailsScreenButton2.setVisibility(z ? 0 : 8);
        }
        ActionFooterView travelMilesFlightSearchResultDetailsScreenButton3 = d3().f253811b;
        Intrinsics.checkNotNullExpressionValue(travelMilesFlightSearchResultDetailsScreenButton3, "travelMilesFlightSearchResultDetailsScreenButton");
        if (travelMilesFlightSearchResultDetailsScreenButton3.getVisibility() == 0) {
            i iVar = uiState.e;
            if (iVar != null) {
                d3().f253811b.setModel(iVar);
            }
            ScreenContentRecyclerView screenContentRecyclerView = d3().d;
            Intrinsics.checkNotNullExpressionValue(screenContentRecyclerView, "travelMilesFlightSearchR…DetailsScreenRecyclerView");
            Context context = D2().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            screenContentRecyclerView.setPadding(screenContentRecyclerView.getPaddingLeft(), screenContentRecyclerView.getPaddingTop(), screenContentRecyclerView.getPaddingRight(), kli.a.k(context, 76.0f));
        }
        j jVar = uiState.f184135c;
        if (jVar instanceof j.a) {
            d3().f253812c.setLoadingState(true);
        } else {
            if (!(jVar instanceof khg.i)) {
                throw new NoWhenBranchMatchedException();
            }
            NavBarWithBigTile navBarWithBigTile = d3().f253812c;
            navBarWithBigTile.setLoadingState(false);
            khg.i iVar2 = (khg.i) jVar;
            navBarWithBigTile.setToolbarTitle(iVar2.f184125a);
            c1.S(navBarWithBigTile, iVar2.f184126b, null, null, 6);
            navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
        }
        this.K = uiState.d;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.K = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.V.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getK() {
        return this.K;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f253812c.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        d3().f253812c.setToolbarTitle(new TextLocalisedClause(R$string.miles_flight_details_screen, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f253812c.f59357t), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f51821c), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f51611c.f121375b), null, new khg.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f53218h), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f253811b.f), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f53515c.f121375b), null, new khg.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.q(rd0.e.b(this.S.q())), null, new khg.e(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.e), null, new g(this, null), 3);
    }

    public final n d3() {
        ViewBinding value = this.U.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (n) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final khg.n d() {
        return (khg.n) this.W.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
