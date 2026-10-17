package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.discover;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import boh.f;
import c9g.c;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.BigTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.InputTravelSearchDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.discover.TravelHotelsHomeDiscoverScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import g9g.u;
import gcg.d;
import gcg.g;
import gcg.i;
import gcg.k;
import gcg.r;
import gcg.t;
import knm.b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
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
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/discover/TravelHotelsHomeDiscoverScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgcg/k;", "Ldli/a;", "Lgcg/t;", "<init>", "()V", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsHomeDiscoverScreen extends ViewController<k> implements dli.a {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f93918a0 = {o0.f186429a.j(new h0(TravelHotelsHomeDiscoverScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenHotelsHomeDiscoveryBinding;", 0))};
    public final boolean K = true;
    public final int L = R$style.TransparentNavigationBarMarkerTheme;
    public final VoucherSmallTileDelegate M;
    public final ListSubheaderDelegate N;
    public final ListingTileDelegate O;
    public final BigTileDelegate P;
    public final InputTravelSearchDelegate Q;
    public final LargeActionButtonDelegate R;
    public final ScrollerDelegate S;
    public final HeaderDelegate T;
    public final HeroBannerDelegate U;
    public final h V;
    public final int W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenHotelsHomeDiscoveryBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.hotelsHomeDiscoveryScreen_recyclerView;
            ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
            if (screenContentRecyclerView != null) {
                return new c((ControllerContainerCoordinatorLayout) p0, screenContentRecyclerView);
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public TravelHotelsHomeDiscoverScreen() {
        final int i = 1;
        VoucherSmallTileDelegate voucherSmallTileDelegate = new VoucherSmallTileDelegate();
        this.M = voucherSmallTileDelegate;
        this.N = new ListSubheaderDelegate();
        ListingTileDelegate listingTileDelegate = new ListingTileDelegate();
        this.O = listingTileDelegate;
        BigTileDelegate bigTileDelegate = new BigTileDelegate();
        this.P = bigTileDelegate;
        this.Q = new InputTravelSearchDelegate();
        this.R = new LargeActionButtonDelegate();
        final int i2 = 0;
        final int i3 = 2;
        this.S = new ScrollerDelegate(v.k(listingTileDelegate, voucherSmallTileDelegate, bigTileDelegate, new ListingTileLoadingDelegate(), new VoucherSmallLoadingDelegate()), false);
        this.T = new HeaderDelegate();
        this.U = new HeroBannerDelegate(0);
        this.V = s.t(this, a.f);
        this.W = R$layout.screen_hotels_home_discovery;
        this.X = w.y0(new Function0(this) { // from class: gcg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsHomeDiscoverScreen f142438b;

            {
                this.f142438b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                TravelHotelsHomeDiscoverScreen travelHotelsHomeDiscoverScreen = this.f142438b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsHomeDiscoverScreen.f93918a0;
                        return (r) ((g9g.u) travelHotelsHomeDiscoverScreen.Y.getValue()).f141826n.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsHomeDiscoverScreen.f93918a0;
                        qji.b bVarU2 = travelHotelsHomeDiscoverScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.discover.di.TravelHotelsHomeDiscoverScreenInjector");
                        g9g.v vVar = (g9g.v) bVarU2;
                        return new g9g.u(vVar.f141832b, vVar.f141833c);
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsHomeDiscoverScreen.f93918a0;
                        TravelHotelsHomeDiscoverScreen travelHotelsHomeDiscoverScreen2 = this.f142438b;
                        return dli.f.a(travelHotelsHomeDiscoverScreen2, travelHotelsHomeDiscoverScreen2.d(), zhm.d0.E0(((fd6.a) ((g9g.u) travelHotelsHomeDiscoverScreen2.Y.getValue()).f141820c.get()).e, zhm.v.k(travelHotelsHomeDiscoverScreen2.M, travelHotelsHomeDiscoverScreen2.N, travelHotelsHomeDiscoverScreen2.S, travelHotelsHomeDiscoverScreen2.O, travelHotelsHomeDiscoverScreen2.Q, travelHotelsHomeDiscoverScreen2.R, new ListSubheaderLoadingDelegate(), new VoucherSmallLoadingDelegate(), new BigTileLoadingDelegate(), travelHotelsHomeDiscoverScreen2.T, travelHotelsHomeDiscoverScreen2.U)), R$id.hotelsHomeDiscoveryScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Y = w.y0(new Function0(this) { // from class: gcg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsHomeDiscoverScreen f142438b;

            {
                this.f142438b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                TravelHotelsHomeDiscoverScreen travelHotelsHomeDiscoverScreen = this.f142438b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsHomeDiscoverScreen.f93918a0;
                        return (r) ((g9g.u) travelHotelsHomeDiscoverScreen.Y.getValue()).f141826n.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsHomeDiscoverScreen.f93918a0;
                        qji.b bVarU2 = travelHotelsHomeDiscoverScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.discover.di.TravelHotelsHomeDiscoverScreenInjector");
                        g9g.v vVar = (g9g.v) bVarU2;
                        return new g9g.u(vVar.f141832b, vVar.f141833c);
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsHomeDiscoverScreen.f93918a0;
                        TravelHotelsHomeDiscoverScreen travelHotelsHomeDiscoverScreen2 = this.f142438b;
                        return dli.f.a(travelHotelsHomeDiscoverScreen2, travelHotelsHomeDiscoverScreen2.d(), zhm.d0.E0(((fd6.a) ((g9g.u) travelHotelsHomeDiscoverScreen2.Y.getValue()).f141820c.get()).e, zhm.v.k(travelHotelsHomeDiscoverScreen2.M, travelHotelsHomeDiscoverScreen2.N, travelHotelsHomeDiscoverScreen2.S, travelHotelsHomeDiscoverScreen2.O, travelHotelsHomeDiscoverScreen2.Q, travelHotelsHomeDiscoverScreen2.R, new ListSubheaderLoadingDelegate(), new VoucherSmallLoadingDelegate(), new BigTileLoadingDelegate(), travelHotelsHomeDiscoverScreen2.T, travelHotelsHomeDiscoverScreen2.U)), R$id.hotelsHomeDiscoveryScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Z = w.y0(new Function0(this) { // from class: gcg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsHomeDiscoverScreen f142438b;

            {
                this.f142438b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                TravelHotelsHomeDiscoverScreen travelHotelsHomeDiscoverScreen = this.f142438b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsHomeDiscoverScreen.f93918a0;
                        return (r) ((g9g.u) travelHotelsHomeDiscoverScreen.Y.getValue()).f141826n.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TravelHotelsHomeDiscoverScreen.f93918a0;
                        qji.b bVarU2 = travelHotelsHomeDiscoverScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.discover.di.TravelHotelsHomeDiscoverScreenInjector");
                        g9g.v vVar = (g9g.v) bVarU2;
                        return new g9g.u(vVar.f141832b, vVar.f141833c);
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsHomeDiscoverScreen.f93918a0;
                        TravelHotelsHomeDiscoverScreen travelHotelsHomeDiscoverScreen2 = this.f142438b;
                        return dli.f.a(travelHotelsHomeDiscoverScreen2, travelHotelsHomeDiscoverScreen2.d(), zhm.d0.E0(((fd6.a) ((g9g.u) travelHotelsHomeDiscoverScreen2.Y.getValue()).f141820c.get()).e, zhm.v.k(travelHotelsHomeDiscoverScreen2.M, travelHotelsHomeDiscoverScreen2.N, travelHotelsHomeDiscoverScreen2.S, travelHotelsHomeDiscoverScreen2.O, travelHotelsHomeDiscoverScreen2.Q, travelHotelsHomeDiscoverScreen2.R, new ListSubheaderLoadingDelegate(), new VoucherSmallLoadingDelegate(), new BigTileLoadingDelegate(), travelHotelsHomeDiscoverScreen2.T, travelHotelsHomeDiscoverScreen2.U)), R$id.hotelsHomeDiscoveryScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getN() {
        return Integer.valueOf(this.L);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        t uiState = (t) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ViewBinding value = this.V.getValue(this, f93918a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ScreenContentRecyclerView hotelsHomeDiscoveryScreenRecyclerView = ((c) value).f22386b;
        Intrinsics.checkNotNullExpressionValue(hotelsHomeDiscoveryScreenRecyclerView, "hotelsHomeDiscoveryScreenRecyclerView");
        Context context = D2().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        b.v(f.p(context), hotelsHomeDiscoveryScreenRecyclerView);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53608c), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52707c), null, new gcg.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.d), null, new gcg.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.f52395j), null, new g(this, null), 3);
        InputTravelSearchDelegate inputTravelSearchDelegate = this.Q;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTravelSearchDelegate.f52599c.f121375b), null, new gcg.h(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTravelSearchDelegate.f52600g.f121375b), null, new gcg.h(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTravelSearchDelegate.f52602j.f121375b), null, new gcg.h(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.d.f121375b), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52751c), null, new gcg.h(this, continuation, 3), 3);
        HeroBannerDelegate heroBannerDelegate = this.U;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(heroBannerDelegate.d), null, new gcg.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(heroBannerDelegate.e), null, new gcg.c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final r d() {
        return (r) this.X.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.W;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.K);
    }
}
