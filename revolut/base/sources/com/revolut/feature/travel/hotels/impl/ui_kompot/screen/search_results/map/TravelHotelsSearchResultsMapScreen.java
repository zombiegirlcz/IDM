package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardSmallDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.NewProductSmallDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.InputTravelView;
import com.revolut.core.ui_kit.views.MapView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.R$dimen;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.TravelHotelsSearchResultsMapScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.TravelHotelsSearchResultsMapScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dp4.y0;
import efm.r;
import g9g.d;
import g9g.j0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import jo0.g;
import kjd.f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import mx0.a8;
import mx0.p5;
import mx0.t9;
import no.k;
import ny0.i;
import org.jetbrains.annotations.NotNull;
import p6.e;
import skm.a2;
import ud3.n;
import ueg.d0;
import ueg.e0;
import ueg.l0;
import ueg.m;
import ueg.m0;
import ueg.p;
import ueg.t;
import ueg.x;
import ueg.z;
import vc.s;
import yp0.v;
import yp0.y;
import yv0.l;
import z4l.j;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/search_results/map/TravelHotelsSearchResultsMapScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/search_results/map/a;", "Lcli/w;", "Lueg/o0;", "Lno/k;", "Companion", "b", "a", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsSearchResultsMapScreen extends ViewController<com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.a> implements w, k {
    public final TravelHotelsSearchResultsMapScreenContract$InputData K;
    public final int L;
    public final int M;
    public boolean N;
    public z O;
    public final FullScreenStateDelegate P;
    public final FooterTextDelegate Q;
    public final RowDelegate R;
    public final BannerDelegate S;
    public final TextDelegate T;
    public final ListingCardSmallDelegate U;
    public final ListingCardDelegate V;
    public final LargeActionButtonDelegate W;
    public final ScrollerDelegate X;
    public final j Y;
    public l0 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final DecelerateInterpolator f94043a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ValueAnimator f94044b0;
    public AnimatorSet c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public e f94045d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final LinkedHashMap f94046e0;
    public List f0;
    public boolean g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public AnalyticsContext f94047h0;
    public final Object i0;
    public final t j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public v f94048k0;
    public final Object l0;
    public final h m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final Object f94049n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final Object f94050o0;
    public static final /* synthetic */ KProperty[] p0 = {o0.f186429a.j(new h0(TravelHotelsSearchResultsMapScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsSearchResultsMapBinding;", 0))};

    @NotNull
    private static final a Companion = new a();
    public static final cr0.h q0 = cr0.h.ANCHORED;

    public static final class a {
        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f94051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f94052b = true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    public TravelHotelsSearchResultsMapScreen(TravelHotelsSearchResultsMapScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$style.TransparentNavigationBarMarkerTheme;
        this.M = ((Boolean) g.k.getValue()).booleanValue() ? R$layout.screen_travel_hotels_search_results_map : R$layout.screen_travel_hotels_search_results_map_legacy;
        this.P = new FullScreenStateDelegate();
        this.Q = new FooterTextDelegate();
        this.R = new RowDelegate(null, null, 7);
        NewProductSmallDelegate newProductSmallDelegate = new NewProductSmallDelegate();
        this.S = new BannerDelegate();
        this.T = new TextDelegate();
        ListingCardSmallDelegate listingCardSmallDelegate = new ListingCardSmallDelegate();
        this.U = listingCardSmallDelegate;
        ListingCardSmallLoadingDelegate listingCardSmallLoadingDelegate = new ListingCardSmallLoadingDelegate();
        this.V = new ListingCardDelegate();
        this.W = new LargeActionButtonDelegate();
        final int i = 2;
        final int i2 = 0;
        final int i3 = 1;
        ScrollerDelegate scrollerDelegate = new ScrollerDelegate(zhm.v.k(listingCardSmallDelegate, listingCardSmallLoadingDelegate), false);
        this.X = scrollerDelegate;
        final int i5 = 3;
        this.Y = new j(7, zhm.v.k(listingCardSmallDelegate, scrollerDelegate, listingCardSmallLoadingDelegate, newProductSmallDelegate), false);
        m70.a.c(t0.f186434a);
        this.Z = new m0(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
        this.f94043a0 = new DecelerateInterpolator(2.0f);
        this.f94046e0 = new LinkedHashMap();
        this.f0 = f0.f322471a;
        this.i0 = te0.w.y0(new Function0(this) { // from class: ueg.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsSearchResultsMapScreen f279388b;

            {
                this.f279388b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i6 = i2;
                TravelHotelsSearchResultsMapScreen travelHotelsSearchResultsMapScreen = this.f279388b;
                switch (i6) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsSearchResultsMapScreen.p0;
                        return (p8g.c) ((g9g.j0) travelHotelsSearchResultsMapScreen.f94049n0.getValue()).f141705b.g0.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsSearchResultsMapScreen.p0;
                        return n14.e.a(travelHotelsSearchResultsMapScreen, travelHotelsSearchResultsMapScreen.R2());
                    case 2:
                        KProperty[] kPropertyArr3 = TravelHotelsSearchResultsMapScreen.p0;
                        qji.b bVarU2 = travelHotelsSearchResultsMapScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.di.TravelHotelsSearchResultsMapScreenInjector");
                        g9g.n nVar = (g9g.n) bVarU2;
                        g9g.d dVar = nVar.f141747b;
                        g9g.n nVar2 = nVar.f141748c;
                        TravelHotelsSearchResultsMapScreenContract$InputData travelHotelsSearchResultsMapScreenContract$InputData = travelHotelsSearchResultsMapScreen.K;
                        travelHotelsSearchResultsMapScreenContract$InputData.getClass();
                        return new g9g.j0(dVar, nVar2, travelHotelsSearchResultsMapScreen, travelHotelsSearchResultsMapScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = TravelHotelsSearchResultsMapScreen.p0;
                        return (f0) ((g9g.j0) travelHotelsSearchResultsMapScreen.f94049n0.getValue()).A.get();
                }
            }
        });
        this.j0 = new t(this);
        this.l0 = te0.w.y0(new Function0(this) { // from class: ueg.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsSearchResultsMapScreen f279388b;

            {
                this.f279388b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i6 = i3;
                TravelHotelsSearchResultsMapScreen travelHotelsSearchResultsMapScreen = this.f279388b;
                switch (i6) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsSearchResultsMapScreen.p0;
                        return (p8g.c) ((g9g.j0) travelHotelsSearchResultsMapScreen.f94049n0.getValue()).f141705b.g0.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsSearchResultsMapScreen.p0;
                        return n14.e.a(travelHotelsSearchResultsMapScreen, travelHotelsSearchResultsMapScreen.R2());
                    case 2:
                        KProperty[] kPropertyArr3 = TravelHotelsSearchResultsMapScreen.p0;
                        qji.b bVarU2 = travelHotelsSearchResultsMapScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.di.TravelHotelsSearchResultsMapScreenInjector");
                        g9g.n nVar = (g9g.n) bVarU2;
                        g9g.d dVar = nVar.f141747b;
                        g9g.n nVar2 = nVar.f141748c;
                        TravelHotelsSearchResultsMapScreenContract$InputData travelHotelsSearchResultsMapScreenContract$InputData = travelHotelsSearchResultsMapScreen.K;
                        travelHotelsSearchResultsMapScreenContract$InputData.getClass();
                        return new g9g.j0(dVar, nVar2, travelHotelsSearchResultsMapScreen, travelHotelsSearchResultsMapScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = TravelHotelsSearchResultsMapScreen.p0;
                        return (f0) ((g9g.j0) travelHotelsSearchResultsMapScreen.f94049n0.getValue()).A.get();
                }
            }
        });
        this.m0 = s.t(this, ueg.h.f);
        this.f94049n0 = te0.w.y0(new Function0(this) { // from class: ueg.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsSearchResultsMapScreen f279388b;

            {
                this.f279388b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i6 = i;
                TravelHotelsSearchResultsMapScreen travelHotelsSearchResultsMapScreen = this.f279388b;
                switch (i6) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsSearchResultsMapScreen.p0;
                        return (p8g.c) ((g9g.j0) travelHotelsSearchResultsMapScreen.f94049n0.getValue()).f141705b.g0.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsSearchResultsMapScreen.p0;
                        return n14.e.a(travelHotelsSearchResultsMapScreen, travelHotelsSearchResultsMapScreen.R2());
                    case 2:
                        KProperty[] kPropertyArr3 = TravelHotelsSearchResultsMapScreen.p0;
                        qji.b bVarU2 = travelHotelsSearchResultsMapScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.di.TravelHotelsSearchResultsMapScreenInjector");
                        g9g.n nVar = (g9g.n) bVarU2;
                        g9g.d dVar = nVar.f141747b;
                        g9g.n nVar2 = nVar.f141748c;
                        TravelHotelsSearchResultsMapScreenContract$InputData travelHotelsSearchResultsMapScreenContract$InputData = travelHotelsSearchResultsMapScreen.K;
                        travelHotelsSearchResultsMapScreenContract$InputData.getClass();
                        return new g9g.j0(dVar, nVar2, travelHotelsSearchResultsMapScreen, travelHotelsSearchResultsMapScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = TravelHotelsSearchResultsMapScreen.p0;
                        return (f0) ((g9g.j0) travelHotelsSearchResultsMapScreen.f94049n0.getValue()).A.get();
                }
            }
        });
        this.f94050o0 = te0.w.y0(new Function0(this) { // from class: ueg.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsSearchResultsMapScreen f279388b;

            {
                this.f279388b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i6 = i5;
                TravelHotelsSearchResultsMapScreen travelHotelsSearchResultsMapScreen = this.f279388b;
                switch (i6) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsSearchResultsMapScreen.p0;
                        return (p8g.c) ((g9g.j0) travelHotelsSearchResultsMapScreen.f94049n0.getValue()).f141705b.g0.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsSearchResultsMapScreen.p0;
                        return n14.e.a(travelHotelsSearchResultsMapScreen, travelHotelsSearchResultsMapScreen.R2());
                    case 2:
                        KProperty[] kPropertyArr3 = TravelHotelsSearchResultsMapScreen.p0;
                        qji.b bVarU2 = travelHotelsSearchResultsMapScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.di.TravelHotelsSearchResultsMapScreenInjector");
                        g9g.n nVar = (g9g.n) bVarU2;
                        g9g.d dVar = nVar.f141747b;
                        g9g.n nVar2 = nVar.f141748c;
                        TravelHotelsSearchResultsMapScreenContract$InputData travelHotelsSearchResultsMapScreenContract$InputData = travelHotelsSearchResultsMapScreen.K;
                        travelHotelsSearchResultsMapScreenContract$InputData.getClass();
                        return new g9g.j0(dVar, nVar2, travelHotelsSearchResultsMapScreen, travelHotelsSearchResultsMapScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = TravelHotelsSearchResultsMapScreen.p0;
                        return (f0) ((g9g.j0) travelHotelsSearchResultsMapScreen.f94049n0.getValue()).A.get();
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
        cr0.h hVar;
        ueg.o0 uiState = (ueg.o0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        AnalyticsContext analyticsContext = uiState.f279413j;
        z zVar = uiState.f;
        this.f94047h0 = analyticsContext;
        d0 d0Var = qVar instanceof d0 ? (d0) qVar : null;
        boolean z = this.g0;
        boolean z3 = uiState.i;
        boolean z4 = z != z3;
        this.g0 = z3;
        l0 l0Var = uiState.f279410c;
        if (d0Var == null || d0Var.f279376a) {
            e eVar = new e(this, l0Var, 29);
            AnimatorSet animatorSet = this.c0;
            if (animatorSet == null || !animatorSet.isRunning()) {
                eVar.run();
            } else {
                this.f94045d0 = eVar;
            }
        }
        this.f0 = uiState.f279408a;
        i3().e.setItems(this.f0, null);
        if (!this.g0) {
            f3();
        }
        this.Y.c(uiState.f279409b);
        if (d0Var == null || ((d0) qVar).f279378c) {
            ActionsView actionsView = i3().f22441j;
            Intrinsics.checkNotNullExpressionValue(actionsView, "travelHotelsSearchResult…ScreenQuickFiltersActions");
            List list = uiState.e;
            ActionsView.Companion companion = ActionsView.INSTANCE;
            actionsView.k(list, mx0.t.f210002a);
        }
        if (d0Var == null || ((d0) qVar).f279377b || z4) {
            BottomExpandableDialogView bottomExpandableDialogView = i3().e;
            Intrinsics.checkNotNullExpressionValue(bottomExpandableDialogView, "travelHotelsSearchResult…ExpandableDialogContainer");
            int i = ueg.g.f279389a[uiState.d.ordinal()];
            if (i == 1) {
                hVar = cr0.h.ANCHORED;
            } else if (i == 2) {
                hVar = cr0.h.COLLAPSED;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                hVar = cr0.h.EXPANDED;
            }
            bottomExpandableDialogView.r0(hVar, false);
        }
        if (d0Var == null || ((d0) qVar).f279379g) {
            i3().f22443m.setMenuItems(uiState.f279411g);
        }
        if (d0Var == null || ((d0) qVar).f279380h) {
            i3().f22442l.setProgressVisible(uiState.f279412h);
        }
        if (this.N) {
            n3(zVar, d0Var);
        } else {
            this.O = zVar;
        }
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.f94047h0 = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j0) this.f94049n0.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getR() {
        return this.f94047h0;
    }

    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r110 = this.f94049n0;
        d dVar = ((j0) r110.getValue()).f141705b;
        th0.g.a();
        c9g.w wVarI3 = i3();
        InputTravelView inputTravelView = wVarI3.f22442l;
        a8 a8Var = a8.ON_MEDIA_STATIC;
        inputTravelView.setStyle(a8Var);
        wVarI3.d.setStyle(a8Var);
        wVarI3.f22444n.setStyle(a8Var);
        i3().f22442l.setIconImage(new ResourceImage(R$drawable.uikit_icn_16_chevron_down_small, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246));
        BottomExpandableDialogView bottomExpandableDialogView = i3().e;
        Intrinsics.checkNotNullExpressionValue(bottomExpandableDialogView, "travelHotelsSearchResult…ExpandableDialogContainer");
        int i = 1;
        BottomExpandableDialogView.setupRecyclerView$default(bottomExpandableDialogView, zhm.v.k(this.V, this.T, new ListingCardLoadingDelegate(), new ListSubheaderDelegate(), this.P, this.Q, this.S, this.R), (RecyclerView.ItemAnimator) null, 2, (Object) null);
        RecyclerView travelHotelsSearchResultsMapScreenMapRecyclerView = i3().i;
        Intrinsics.checkNotNullExpressionValue(travelHotelsSearchResultsMapScreenMapRecyclerView, "travelHotelsSearchResultsMapScreenMapRecyclerView");
        y.h(travelHotelsSearchResultsMapScreenMapRecyclerView, this.Y, new LinearLayoutManager(travelHotelsSearchResultsMapScreenMapRecyclerView.getContext()));
        c9g.w wVarI32 = i3();
        ActionsView actionsView = wVarI32.f22441j;
        ConstraintLayout constraintLayout = wVarI32.f22439g;
        Intrinsics.checkNotNullExpressionValue(actionsView, "travelHotelsSearchResult…ScreenQuickFiltersActions");
        b bVarK3 = k3(actionsView);
        ActionsView actionsView2 = wVarI32.f22441j;
        ViewGroup.LayoutParams layoutParams = actionsView2.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        bVarK3.f94051a = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        Intrinsics.checkNotNullExpressionValue(actionsView2, "travelHotelsSearchResult…ScreenQuickFiltersActions");
        bVarK3.f94052b = actionsView2.getVisibility() == 0;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "travelHotelsSearchResult…earchDatesGuestsContainer");
        b bVarK32 = k3(constraintLayout);
        ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
        Intrinsics.i(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        bVarK32.f94051a = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "travelHotelsSearchResult…earchDatesGuestsContainer");
        bVarK32.f94052b = constraintLayout.getVisibility() == 0;
        BottomExpandableDialogView bottomExpandableDialogView2 = i3().e;
        bottomExpandableDialogView2.setupDialog(new BottomExpandableDialogView.b.a(R$attr.uikit_windowBackground, new p5(R$dimen.stays_expandable_layout_top_offset, ((Boolean) g.k.getValue()).booleanValue() ? R$dimen.stays_expandable_layout_bottom_offset : R$dimen.stays_legacy_expandable_layout_bottom_offset, null), ((Boolean) g.k.getValue()).booleanValue() ? com.revolut.core.ui_kit.internal.dialogs.b.DYNAMIC_MARGINS : com.revolut.core.ui_kit.internal.dialogs.b.FIXED_SIZE));
        bottomExpandableDialogView2.setHideable(false);
        bottomExpandableDialogView2.setHasCollapsedState(true);
        bottomExpandableDialogView2.setHasExpandedState(true);
        bottomExpandableDialogView2.setCloseAutomaticallyByChevron(false);
        bottomExpandableDialogView2.setHideAnchorInExpandedState(true);
        bottomExpandableDialogView2.setNeedDrawToolbarShadow(false);
        bottomExpandableDialogView2.setSupportBackButtonHideDialog(false);
        bottomExpandableDialogView2.setNestedScrollingEnabled(false);
        CoordinatorLayout coordinatorLayout = i3().f22438c;
        Intrinsics.checkNotNullExpressionValue(coordinatorLayout, "travelHotelsSearchResult…apScreenCoordinatorLayout");
        if (coordinatorLayout.getViewTreeObserver().isAlive()) {
            coordinatorLayout.getViewTreeObserver().addOnGlobalLayoutListener(new f(bottomExpandableDialogView2, coordinatorLayout, i));
        }
        BasicNavBar basicNavBar = i3().f22443m;
        basicNavBar.setExpanded(false);
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
        basicNavBar.setBackground(tx0.d0.TRANSPARENT);
        ActionsView actionsView3 = i3().f22441j;
        Intrinsics.checkNotNullExpressionValue(actionsView3, "travelHotelsSearchResult…ScreenQuickFiltersActions");
        g3(actionsView3);
        FrameLayout travelHotelsSearchResultsMapScreenBackgroundView = i3().f22437b;
        Intrinsics.checkNotNullExpressionValue(travelHotelsSearchResultsMapScreenBackgroundView, "travelHotelsSearchResultsMapScreenBackgroundView");
        i.e(travelHotelsSearchResultsMapScreenBackgroundView);
        ((j60.a) ((j0) r110.getValue()).f141708h.get()).d(zhm.v.k(new CellDetailsDelegate(), this.W, new RowDelegate(null, null, 7)));
        SmallActionButton smallActionButton = i3().k;
        smallActionButton.setIcon(new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
        smallActionButton.setText(new TextLocalisedClause(R$string.hotels_map_search_this_area, null, null, 14));
        i3().f.setImage(new ResourceImage(R$drawable.uikit_icn_24_location_pin, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        v vVar = this.f94048k0;
        if (vVar != null) {
            m3().removeOnScrollListener(vVar);
            this.f94048k0 = null;
        }
        AnimatorSet animatorSet = this.c0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimator = this.f94044b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (!this.N) {
            l3().l0().d(new ofm.h(new ty7.b(this, 2)));
        }
        m3().addOnScrollListener(this.j0);
        BottomExpandableDialogView bottomExpandableDialogView = i3().e;
        if (bottomExpandableDialogView.getState() == cr0.h.HIDDEN) {
            bottomExpandableDialogView.r0(q0, false);
        }
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(bottomExpandableDialogView.getStateChangeEvents()), null, new ueg.k(this, continuation, 0), 3);
        this.f94048k0 = y.a(m3(), 10, true, new n(this, 11));
        r rVarSkip = this.X.q().skip(1L);
        Intrinsics.checkNotNullExpressionValue(rVarSkip, "skip(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarSkip), null, new ueg.k(this, continuation, 6), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(l3().f58773m), null, new ueg.k(this, continuation, 7), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(l3().k), null, new ueg.k(this, continuation, 8), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(l3().f58772l), null, new ueg.k(this, continuation, 9), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.f53530c), null, new ueg.q(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.e.f121375b), null, new ueg.k(this, continuation, 10), 3);
        c9g.w wVarI3 = i3();
        InputTravelView inputTravelView = wVarI3.f22442l;
        BasicNavBar basicNavBar = wVarI3.f22443m;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTravelView.a()), null, new ueg.r(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(wVarI3.f22444n.a()), null, new ueg.r(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(wVarI3.d.a()), null, new ueg.r(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(basicNavBar.f59211b), null, new ueg.r(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(basicNavBar.f59210a.f57403b), null, new ueg.k(this, continuation, 11), 3);
        ActionsView actionsView = wVarI3.f22441j;
        com.revolut.kompot.navigable.a.g2(this, wp5.y.x(actionsView.f58296a.f121375b, actionsView.f58297b.f121375b, "mergeWith(...)"), null, new ueg.s(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(wVarI3.k.f56386h), null, new ueg.r(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(wVarI3.f.f58987s), null, new ueg.r(this, continuation, 5), 3);
        ListingCardSmallDelegate listingCardSmallDelegate = this.U;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(listingCardSmallDelegate.f52749c), null, new ueg.k(this, continuation, 12), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(listingCardSmallDelegate.d), null, new ueg.k(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(listingCardSmallDelegate.f52750g), null, new ueg.k(this, continuation, 2), 3);
        ListingCardDelegate listingCardDelegate = this.V;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(listingCardDelegate.f52747c), null, new ueg.k(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, wp5.y.x(listingCardDelegate.d.f121375b, listingCardDelegate.e.f121375b, "mergeWith(...)"), null, new ueg.k(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(listingCardDelegate.f52748g), null, new ueg.k(this, continuation, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.W.d.f121375b), null, new m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52371h.f121375b), null, new ueg.n(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f53218h), null, new ueg.o(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f51699c), null, new p(this, null), 3);
    }

    public final AnimatorSet d3(ViewGroup viewGroup) {
        b bVarK3 = k3(viewGroup);
        if (!bVarK3.f94052b) {
            return null;
        }
        bVarK3.f94052b = false;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.addUpdateListener(new nhg.a(viewGroup, 3));
        valueAnimatorOfFloat.addListener(new ueg.i(this, viewGroup, 0));
        valueAnimatorOfFloat.setDuration(300L);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(bVarK3.f94051a, -viewGroup.getHeight());
        valueAnimatorOfFloat2.addUpdateListener(new nhg.a(viewGroup, 4));
        valueAnimatorOfFloat2.setInterpolator(this.f94043a0);
        valueAnimatorOfFloat2.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        return animatorSet;
    }

    public final AnimatorSet e3() {
        ConstraintLayout constraintLayout = i3().f22439g;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "travelHotelsSearchResult…earchDatesGuestsContainer");
        if (!k3(constraintLayout).f94052b) {
            return null;
        }
        i3().f22442l.setIconImage(new ResourceImage(R$drawable.uikit_icn_16_chevron_down_small, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246));
        ConstraintLayout constraintLayout2 = i3().f22439g;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "travelHotelsSearchResult…earchDatesGuestsContainer");
        return d3(constraintLayout2);
    }

    public final void f3() {
        RecyclerView.LayoutManager layoutManager = m3().getLayoutManager();
        Continuation continuation = null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            ueg.f0 f0VarR2 = R2();
            List currentListItems = this.f0;
            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b) f0VarR2;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(currentListItems, "currentListItems");
            if (iFindLastVisibleItemPosition > bVar.M) {
                bVar.M = iFindLastVisibleItemPosition;
                a2 a2Var = bVar.N;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                bVar.N = bVar.l2(new y0(bVar, iFindLastVisibleItemPosition, currentListItems, continuation, 15), new yi5.b(26));
            }
        }
    }

    public final AnimatorSet g3(ViewGroup viewGroup) {
        b bVarK3 = k3(viewGroup);
        if (bVarK3.f94052b) {
            return null;
        }
        bVarK3.f94052b = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new nhg.a(viewGroup, 2));
        valueAnimatorOfFloat.addListener(new ueg.i(this, viewGroup, 1));
        valueAnimatorOfFloat.setDuration(300L);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(-viewGroup.getHeight(), bVarK3.f94051a);
        valueAnimatorOfFloat2.addUpdateListener(new nhg.a(viewGroup, 5));
        valueAnimatorOfFloat2.setInterpolator(this.f94043a0);
        valueAnimatorOfFloat2.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        return animatorSet;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    public final AnimatorSet h3() {
        ConstraintLayout constraintLayout = i3().f22439g;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "travelHotelsSearchResult…earchDatesGuestsContainer");
        if (k3(constraintLayout).f94052b) {
            return null;
        }
        i3().f22442l.setIconImage(new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246));
        ConstraintLayout constraintLayout2 = i3().f22439g;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "travelHotelsSearchResult…earchDatesGuestsContainer");
        return g3(constraintLayout2);
    }

    public final c9g.w i3() {
        ViewBinding value = this.m0.getValue(this, p0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c9g.w) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: j3, reason: merged with bridge method [inline-methods] */
    public final ueg.f0 R2() {
        return (ueg.f0) this.f94050o0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.l0.getValue();
    }

    public final b k3(ViewGroup viewGroup) {
        Integer numValueOf = Integer.valueOf(viewGroup.getId());
        LinkedHashMap linkedHashMap = this.f94046e0;
        Object bVar = linkedHashMap.get(numValueOf);
        if (bVar == null) {
            bVar = new b();
            Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
            linkedHashMap.put(numValueOf, bVar);
        }
        return (b) bVar;
    }

    public final MapView l3() {
        MapView travelHotelsSearchResultsMapScreenMap = i3().f22440h;
        Intrinsics.checkNotNullExpressionValue(travelHotelsSearchResultsMapScreenMap, "travelHotelsSearchResultsMapScreenMap");
        return travelHotelsSearchResultsMapScreenMap;
    }

    public final RecyclerView m3() {
        return i3().e.getRecyclerView();
    }

    public final void n3(z zVar, d0 d0Var) {
        if (d0Var == null || (d0Var.d && zVar.d)) {
            x xVar = zVar.f279447a;
            if (xVar instanceof ueg.y) {
                l3().h0(((ueg.y) xVar).f279444a, false);
            } else if (xVar instanceof ueg.w) {
                l3().i0(((ueg.w) xVar).f279438a, false);
            } else if (!(xVar instanceof x.a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (d0Var == null || d0Var.e) {
            ArrayList<e0> arrayList = zVar.f279448b;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
            for (e0 e0Var : arrayList) {
                arrayList2.add(new l(e0Var.d, e0Var.f279386c, e0Var.f279385b, e0Var.e, e0Var.f));
            }
            l3().setMarkers(new t9(arrayList2, false));
        }
        if (d0Var == null || !d0Var.f || zVar.f279449c == null) {
            return;
        }
        l3().h0(zVar.f279449c, true);
    }

    public final void o3() {
        c9g.w wVarI3 = i3();
        InputTravelView inputTravelView = wVarI3.f22442l;
        Intrinsics.h(inputTravelView);
        inputTravelView.setVisibility(0);
        inputTravelView.setLoading(true);
        SmallActionButton travelHotelsSearchResultsMapScreenSearchButton = wVarI3.k;
        Intrinsics.checkNotNullExpressionValue(travelHotelsSearchResultsMapScreenSearchButton, "travelHotelsSearchResultsMapScreenSearchButton");
        travelHotelsSearchResultsMapScreenSearchButton.setVisibility(8);
    }

    public TravelHotelsSearchResultsMapScreen() {
        this(new TravelHotelsSearchResultsMapScreenContract$InputData(0));
    }
}
