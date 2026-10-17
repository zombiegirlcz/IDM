package com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.g6;
import aw0.h6;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.TripDetailsDelegate;
import com.revolut.core.ui_kit.delegates.TripDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.InputTravelSearchItemView;
import com.revolut.core.ui_kit.views.InputTravelSearchView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.miles.impl.R$id;
import com.revolut.feature.travel.miles.impl.R$layout;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.TravelMilesFlightSearchResultsScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.TravelMilesFlightSearchResultsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nhg.a0;
import nhg.g;
import nhg.i;
import nhg.j;
import nhg.l;
import nhg.m;
import nhg.n;
import nhg.p;
import nhg.q;
import nhg.u;
import nhg.x;
import nhg.y;
import nhg.z;
import no.k;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import yp0.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_search_results/TravelMilesFlightSearchResultsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnhg/u;", "Ldli/a;", "Lnhg/a0;", "Lno/k;", "Companion", "a", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelMilesFlightSearchResultsScreen extends ViewController<u> implements dli.a, k {
    public final TravelMilesFlightSearchResultsScreenContract$InputData K;
    public AnalyticsContext L;
    public final int M;
    public final RowDelegate N;
    public final TripDetailsDelegate O;
    public final FullScreenStateDelegate P;
    public final LargeActionButtonDelegate Q;
    public final AttributeSelectorSmallDelegate R;
    public final VoucherSmallTileDelegate S;
    public final ListSubheaderDelegate T;
    public nhg.e U;
    public v V;
    public final q W;
    public final Object X;
    public final h Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f94307a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f94306b0 = {o0.f186429a.j(new h0(TravelMilesFlightSearchResultsScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/miles/impl/databinding/ScreenTravelMilesFlightSearchResultsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.TravelMilesFlightSearchResultsScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public TravelMilesFlightSearchResultsScreen(TravelMilesFlightSearchResultsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.M = R$layout.screen_travel_miles_flight_search_results;
        this.N = new RowDelegate(null, null, 7);
        this.O = new TripDetailsDelegate();
        this.P = new FullScreenStateDelegate();
        this.Q = new LargeActionButtonDelegate();
        this.R = new AttributeSelectorSmallDelegate();
        this.S = new VoucherSmallTileDelegate();
        this.T = new ListSubheaderDelegate();
        this.W = new q(this);
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: nhg.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesFlightSearchResultsScreen f215477b;

            {
                this.f215477b = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelMilesFlightSearchResultsScreen travelMilesFlightSearchResultsScreen = this.f215477b;
                switch (i2) {
                    case 0:
                        TravelMilesFlightSearchResultsScreen.Companion companion = TravelMilesFlightSearchResultsScreen.INSTANCE;
                        TravelMilesFlightSearchResultsScreen travelMilesFlightSearchResultsScreen2 = this.f215477b;
                        return dli.f.a(travelMilesFlightSearchResultsScreen2, travelMilesFlightSearchResultsScreen2.h3(), zhm.v.k(travelMilesFlightSearchResultsScreen2.O, new TripDetailsLoadingDelegate(), travelMilesFlightSearchResultsScreen2.P, travelMilesFlightSearchResultsScreen2.N, travelMilesFlightSearchResultsScreen2.Q, new RowLoadingDelegate(), travelMilesFlightSearchResultsScreen2.T, new ScrollerDelegate(zhm.v.k(travelMilesFlightSearchResultsScreen2.R, new AttributeSelectorSmallLoadingDelegate(), travelMilesFlightSearchResultsScreen2.S, new VoucherSmallLoadingDelegate()), false)), R$id.travelMilesFlightSearchResultsScreen_recyclerView, null, new koi.h(null, false, true, 3), null, 40);
                    case 1:
                        TravelMilesFlightSearchResultsScreen.Companion companion2 = TravelMilesFlightSearchResultsScreen.INSTANCE;
                        qji.b bVarU2 = travelMilesFlightSearchResultsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.di.TravelMilesFlightSearchResultsScreenInjector");
                        ufg.n nVar = (ufg.n) bVarU2;
                        ufg.g gVar = nVar.f279770b;
                        ufg.n nVar2 = nVar.f279771c;
                        TravelMilesFlightSearchResultsScreenContract$InputData travelMilesFlightSearchResultsScreenContract$InputData = travelMilesFlightSearchResultsScreen.K;
                        travelMilesFlightSearchResultsScreenContract$InputData.getClass();
                        return new ufg.o(gVar, nVar2, travelMilesFlightSearchResultsScreenContract$InputData);
                    default:
                        TravelMilesFlightSearchResultsScreen.Companion companion3 = TravelMilesFlightSearchResultsScreen.INSTANCE;
                        return (v) ((ufg.o) travelMilesFlightSearchResultsScreen.Z.getValue()).f279777c.get();
                }
            }
        });
        this.Y = s.t(this, g.f);
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: nhg.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesFlightSearchResultsScreen f215477b;

            {
                this.f215477b = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelMilesFlightSearchResultsScreen travelMilesFlightSearchResultsScreen = this.f215477b;
                switch (i22) {
                    case 0:
                        TravelMilesFlightSearchResultsScreen.Companion companion = TravelMilesFlightSearchResultsScreen.INSTANCE;
                        TravelMilesFlightSearchResultsScreen travelMilesFlightSearchResultsScreen2 = this.f215477b;
                        return dli.f.a(travelMilesFlightSearchResultsScreen2, travelMilesFlightSearchResultsScreen2.h3(), zhm.v.k(travelMilesFlightSearchResultsScreen2.O, new TripDetailsLoadingDelegate(), travelMilesFlightSearchResultsScreen2.P, travelMilesFlightSearchResultsScreen2.N, travelMilesFlightSearchResultsScreen2.Q, new RowLoadingDelegate(), travelMilesFlightSearchResultsScreen2.T, new ScrollerDelegate(zhm.v.k(travelMilesFlightSearchResultsScreen2.R, new AttributeSelectorSmallLoadingDelegate(), travelMilesFlightSearchResultsScreen2.S, new VoucherSmallLoadingDelegate()), false)), R$id.travelMilesFlightSearchResultsScreen_recyclerView, null, new koi.h(null, false, true, 3), null, 40);
                    case 1:
                        TravelMilesFlightSearchResultsScreen.Companion companion2 = TravelMilesFlightSearchResultsScreen.INSTANCE;
                        qji.b bVarU2 = travelMilesFlightSearchResultsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.di.TravelMilesFlightSearchResultsScreenInjector");
                        ufg.n nVar = (ufg.n) bVarU2;
                        ufg.g gVar = nVar.f279770b;
                        ufg.n nVar2 = nVar.f279771c;
                        TravelMilesFlightSearchResultsScreenContract$InputData travelMilesFlightSearchResultsScreenContract$InputData = travelMilesFlightSearchResultsScreen.K;
                        travelMilesFlightSearchResultsScreenContract$InputData.getClass();
                        return new ufg.o(gVar, nVar2, travelMilesFlightSearchResultsScreenContract$InputData);
                    default:
                        TravelMilesFlightSearchResultsScreen.Companion companion3 = TravelMilesFlightSearchResultsScreen.INSTANCE;
                        return (v) ((ufg.o) travelMilesFlightSearchResultsScreen.Z.getValue()).f279777c.get();
                }
            }
        });
        final int i3 = 2;
        this.f94307a0 = w.y0(new Function0(this) { // from class: nhg.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesFlightSearchResultsScreen f215477b;

            {
                this.f215477b = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelMilesFlightSearchResultsScreen travelMilesFlightSearchResultsScreen = this.f215477b;
                switch (i22) {
                    case 0:
                        TravelMilesFlightSearchResultsScreen.Companion companion = TravelMilesFlightSearchResultsScreen.INSTANCE;
                        TravelMilesFlightSearchResultsScreen travelMilesFlightSearchResultsScreen2 = this.f215477b;
                        return dli.f.a(travelMilesFlightSearchResultsScreen2, travelMilesFlightSearchResultsScreen2.h3(), zhm.v.k(travelMilesFlightSearchResultsScreen2.O, new TripDetailsLoadingDelegate(), travelMilesFlightSearchResultsScreen2.P, travelMilesFlightSearchResultsScreen2.N, travelMilesFlightSearchResultsScreen2.Q, new RowLoadingDelegate(), travelMilesFlightSearchResultsScreen2.T, new ScrollerDelegate(zhm.v.k(travelMilesFlightSearchResultsScreen2.R, new AttributeSelectorSmallLoadingDelegate(), travelMilesFlightSearchResultsScreen2.S, new VoucherSmallLoadingDelegate()), false)), R$id.travelMilesFlightSearchResultsScreen_recyclerView, null, new koi.h(null, false, true, 3), null, 40);
                    case 1:
                        TravelMilesFlightSearchResultsScreen.Companion companion2 = TravelMilesFlightSearchResultsScreen.INSTANCE;
                        qji.b bVarU2 = travelMilesFlightSearchResultsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.di.TravelMilesFlightSearchResultsScreenInjector");
                        ufg.n nVar = (ufg.n) bVarU2;
                        ufg.g gVar = nVar.f279770b;
                        ufg.n nVar2 = nVar.f279771c;
                        TravelMilesFlightSearchResultsScreenContract$InputData travelMilesFlightSearchResultsScreenContract$InputData = travelMilesFlightSearchResultsScreen.K;
                        travelMilesFlightSearchResultsScreenContract$InputData.getClass();
                        return new ufg.o(gVar, nVar2, travelMilesFlightSearchResultsScreenContract$InputData);
                    default:
                        TravelMilesFlightSearchResultsScreen.Companion companion3 = TravelMilesFlightSearchResultsScreen.INSTANCE;
                        return (v) ((ufg.o) travelMilesFlightSearchResultsScreen.Z.getValue()).f279777c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        a0 uiState = (a0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        BasicNavBar basicNavBar = d3().f253814b;
        List<? extends NavBarMenuItem> list = uiState.f215457b;
        AnalyticsContext analyticsContext = uiState.d;
        basicNavBar.setMenuItems(list);
        z zVar = uiState.f215458c;
        if (zVar instanceof x) {
            x xVar = (x) zVar;
            nhg.e eVar = this.U;
            if (eVar != null) {
                eVar.a(eVar.f215472c, eVar.f215471b);
            } else {
                InputTravelSearchView inputTravelSearchView = d3().d;
                Intrinsics.checkNotNullExpressionValue(inputTravelSearchView, "travelMilesFlightSearchR…reenSearchFieldsInputView");
                inputTravelSearchView.setVisibility(8);
                InputTravelSearchItemView inputTravelSearchItemView = d3().e;
                Intrinsics.checkNotNullExpressionValue(inputTravelSearchItemView, "travelMilesFlightSearchR…ultsScreenSearchInputView");
                inputTravelSearchItemView.setVisibility(0);
                IllegalStateException illegalStateException = new IllegalStateException("Input animator is null when trying to collapse input");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            }
            InputTravelSearchItemView inputTravelSearchItemView2 = d3().e;
            inputTravelSearchItemView2.setPrimarySearchText(xVar.f215488a);
            inputTravelSearchItemView2.setSecondarySearchText(xVar.f215489b);
            inputTravelSearchItemView2.setProgressVisible(xVar.f215490c);
        } else {
            if (!(zVar instanceof y)) {
                throw new NoWhenBranchMatchedException();
            }
            y yVar = (y) zVar;
            nhg.e eVar2 = this.U;
            if (eVar2 != null) {
                eVar2.a(eVar2.f215471b, eVar2.f215472c);
            } else {
                InputTravelSearchItemView inputTravelSearchItemView3 = d3().e;
                Intrinsics.checkNotNullExpressionValue(inputTravelSearchItemView3, "travelMilesFlightSearchR…ultsScreenSearchInputView");
                inputTravelSearchItemView3.setVisibility(8);
                InputTravelSearchView inputTravelSearchView2 = d3().d;
                Intrinsics.checkNotNullExpressionValue(inputTravelSearchView2, "travelMilesFlightSearchR…reenSearchFieldsInputView");
                inputTravelSearchView2.setVisibility(0);
                IllegalStateException illegalStateException2 = new IllegalStateException("Input animator is null when trying to expand input");
                zhm.h0 h0Var2 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
            }
            d3().d.setConfiguration(new h6(yVar.f215491a, yVar.f215492b, yVar.f215493c, new CompositeClause(zhm.v.k(new DotDividerClause((Integer) null), new TextLocalisedClause(R$string.uikit_travel_flight_search_one_way_label, null, null, 14)), null, null, null, 14), g6.RIGHT));
        }
        this.L = analyticsContext;
        nhg.w wVar = qVar instanceof nhg.w ? (nhg.w) qVar : null;
        if (wVar == null || !wVar.f215487a || analyticsContext == null) {
            return;
        }
        Context context = D2().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        jh.d.f(context).n0().i(D2(), AnalyticsContext.b(analyticsContext.f50296a));
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.L = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ufg.o) this.Z.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getF78914e0() {
        return this.L;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        BasicNavBar basicNavBar = d3().f253814b;
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        basicNavBar.setTitle(new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_flight_search_results_title, null, null, 14));
        d3().e.setSearchIconImage(new ResourceImage(R$drawable.uikit_icn_16_chevron_down_small, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246));
        InputTravelSearchItemView inputTravelSearchItemView = d3().e;
        Intrinsics.checkNotNullExpressionValue(inputTravelSearchItemView, "travelMilesFlightSearchR…ultsScreenSearchInputView");
        InputTravelSearchView inputTravelSearchView = d3().d;
        Intrinsics.checkNotNullExpressionValue(inputTravelSearchView, "travelMilesFlightSearchR…reenSearchFieldsInputView");
        this.U = new nhg.e(inputTravelSearchItemView, inputTravelSearchView);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        ScreenContentRecyclerView screenContentRecyclerView = d3().f253815c;
        v vVar = this.V;
        if (vVar == null) {
            Intrinsics.r("paginationEventListener");
            throw null;
        }
        screenContentRecyclerView.removeOnScrollListener(vVar);
        d3().f253815c.removeOnScrollListener(this.W);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f253814b.f59211b), null, new l(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f253814b.f59210a.f57403b), null, new i(this, null, 1), 3);
        ScreenContentRecyclerView travelMilesFlightSearchResultsScreenRecyclerView = d3().f253815c;
        Intrinsics.checkNotNullExpressionValue(travelMilesFlightSearchResultsScreenRecyclerView, "travelMilesFlightSearchResultsScreenRecyclerView");
        this.V = yp0.y.a(travelMilesFlightSearchResultsScreenRecyclerView, 10, false, new nfj.l(this, 10));
        d3().f253815c.addOnScrollListener(this.W);
        FullScreenStateDelegate fullScreenStateDelegate = this.P;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(fullScreenStateDelegate.f52371h.f121375b), null, new m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(fullScreenStateDelegate.d), null, new i(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.a()), null, new l(this, continuation, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.e), null, new n(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.d.f121375b), null, new nhg.o(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.d), null, new p(this, null), 3);
        RowDelegate rowDelegate = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new nhg.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53226s), null, new i(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.p()), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f53608c), null, new nhg.k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f58673g.f58664a.getTextInput1().u0), null, new l(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f58673g.f58664a.getTextInput2().u0), null, new l(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f58673g.f58664a.f58662g), null, new l(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.i.u0), null, new l(this, continuation, 3), 3);
    }

    public final rfg.o d3() {
        ViewBinding value = this.Y.getValue(this, f94306b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rfg.o) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final nhg.v h3() {
        return (nhg.v) this.f94307a0.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.X.getValue();
    }
}
