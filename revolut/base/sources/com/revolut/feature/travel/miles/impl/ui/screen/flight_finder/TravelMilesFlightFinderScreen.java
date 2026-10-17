package com.revolut.feature.travel.miles.impl.ui.screen.flight_finder;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import boh.f;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.ActionCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.InputTravelSearchDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.impl.R$id;
import com.revolut.feature.travel.miles.impl.R$layout;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.TravelMilesFlightFinderScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import ghg.d;
import ghg.l;
import ghg.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import rfg.j;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_finder/TravelMilesFlightFinderScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/travel/miles/impl/ui/screen/flight_finder/a;", "Ldli/a;", "Lghg/m;", "Companion", "a", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelMilesFlightFinderScreen extends ViewController<com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.a> implements dli.a {
    public final int K;
    public final int L;
    public final InputTravelSearchDelegate M;
    public final LargeActionButtonDelegate N;
    public final VoucherSmallTileDelegate O;
    public final ActionCardDelegate P;
    public final ScrollerDelegate Q;
    public final Object R;
    public final h S;
    public final Object T;
    public final Object U;
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(TravelMilesFlightFinderScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/miles/impl/databinding/ScreenTravelMilesFlightFinderBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public TravelMilesFlightFinderScreen(TravelMilesFlightFinderScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_travel_miles_flight_finder;
        this.L = R$style.TransparentNavigationBarMarkerTheme;
        this.M = new InputTravelSearchDelegate();
        this.N = new LargeActionButtonDelegate();
        VoucherSmallTileDelegate voucherSmallTileDelegate = new VoucherSmallTileDelegate();
        this.O = voucherSmallTileDelegate;
        this.P = new ActionCardDelegate();
        final int i = 0;
        final int i2 = 1;
        this.Q = new ScrollerDelegate(v.k(voucherSmallTileDelegate, new VoucherSmallLoadingDelegate()), false);
        this.R = w.y0(new Function0(this) { // from class: ghg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesFlightFinderScreen f143907b;

            {
                this.f143907b = this;
            }

            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesFlightFinderScreen.V;
                        TravelMilesFlightFinderScreen travelMilesFlightFinderScreen = this.f143907b;
                        return dli.f.a(travelMilesFlightFinderScreen, travelMilesFlightFinderScreen.R2(), v.k(travelMilesFlightFinderScreen.Q, travelMilesFlightFinderScreen.M, travelMilesFlightFinderScreen.N, new ListSubheaderDelegate(), new GridBoxDelegate(v.k(travelMilesFlightFinderScreen.P, new ActionCardLoadingDelegate()), 0, 8.0f, 8.0f, 2)), R$id.travelMilesFlightFinderScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelMilesFlightFinderScreen.V;
                        return (l) ((ufg.h) this.f143907b.T.getValue()).f279737c.get();
                }
            }
        });
        this.S = s.t(this, ghg.b.f);
        this.T = w.y0(new fx5.a(this, inputData, 29));
        this.U = w.y0(new Function0(this) { // from class: ghg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesFlightFinderScreen f143907b;

            {
                this.f143907b = this;
            }

            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesFlightFinderScreen.V;
                        TravelMilesFlightFinderScreen travelMilesFlightFinderScreen = this.f143907b;
                        return dli.f.a(travelMilesFlightFinderScreen, travelMilesFlightFinderScreen.R2(), v.k(travelMilesFlightFinderScreen.Q, travelMilesFlightFinderScreen.M, travelMilesFlightFinderScreen.N, new ListSubheaderDelegate(), new GridBoxDelegate(v.k(travelMilesFlightFinderScreen.P, new ActionCardLoadingDelegate()), 0, 8.0f, 8.0f, 2)), R$id.travelMilesFlightFinderScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelMilesFlightFinderScreen.V;
                        return (l) ((ufg.h) this.f143907b.T.getValue()).f279737c.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.L);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        KProperty[] kPropertyArr = V;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.S;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ScreenContentRecyclerView travelMilesFlightFinderScreenRecyclerView = ((j) value).f253800b;
        Intrinsics.checkNotNullExpressionValue(travelMilesFlightFinderScreenRecyclerView, "travelMilesFlightFinderScreenRecyclerView");
        Context context = D2().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        knm.b.v(f.p(context), travelMilesFlightFinderScreenRecyclerView);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((j) value2).f253800b.setClipToPadding(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ufg.h) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.miles_tab_flight_finder, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(this.O.f53608c), new ghg.c(this, null), 3);
        InputTravelSearchDelegate inputTravelSearchDelegate = this.M;
        ViewController.P2(this, rd0.e.b(inputTravelSearchDelegate.d.f121375b), new d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(inputTravelSearchDelegate.e.f121375b), new d(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(inputTravelSearchDelegate.f.f121375b), new d(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(inputTravelSearchDelegate.f52601h.f121375b), new d(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(this.N.d.f121375b), new ghg.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f51572n), new ghg.f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
