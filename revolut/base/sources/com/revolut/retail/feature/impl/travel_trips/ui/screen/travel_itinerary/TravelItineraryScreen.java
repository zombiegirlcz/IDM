package com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary;

import aii.q;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c1;
import au0.m0;
import au0.u0;
import au0.z0;
import aw0.s8;
import cli.o;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardBasicDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.NewsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit.views.navbar.SlidingFromTopViewContainer;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.api.travel_trips.R$string;
import com.revolut.retail.feature.impl.travel_trips.R$id;
import com.revolut.retail.feature.impl.travel_trips.R$layout;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.TravelItineraryScreen;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.List;
import koi.j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.text.a0;
import te0.w;
import tki.c;
import tx0.i4;
import tx0.j4;
import tx0.m4;
import vc.s;
import xki.e;
import xuj.f;
import zhm.f0;
import zhm.u;
import zuj.b0;
import zuj.d;
import zuj.d0;
import zuj.g;
import zuj.i;
import zuj.k;
import zuj.p;
import zuj.r;
import zuj.t;
import zuj.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/TravelItineraryScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lzuj/w;", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelItineraryScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(TravelItineraryScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/impl/travel_trips/databinding/ScreenTravelItineraryBinding;", 0))};
    public final t K;
    public final h L;
    public final int M;
    public d N;
    public Object O;
    public String P;
    public final FullScreenStateDelegate Q;
    public final RowDelegate R;
    public final NewsDelegate S;
    public final ListingCardBasicDelegate T;
    public final FooterTextDelegate U;
    public final Object V;
    public final Object W;
    public final Object X;

    public TravelItineraryScreen(t inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, zuj.c.f);
        this.M = R$layout.screen_travel_itinerary;
        this.O = f0.f322471a;
        this.Q = new FullScreenStateDelegate();
        this.R = new RowDelegate(null, null, 7);
        this.S = new NewsDelegate();
        this.T = new ListingCardBasicDelegate();
        this.U = new FooterTextDelegate();
        final int i = 0;
        this.V = w.y0(new Function0(this) { // from class: zuj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelItineraryScreen f325488b;

            {
                this.f325488b = this;
            }

            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelItineraryScreen travelItineraryScreen = this.f325488b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelItineraryScreen.Y;
                        TravelItineraryScreen travelItineraryScreen2 = this.f325488b;
                        return tki.g.a(travelItineraryScreen2, travelItineraryScreen2.R2(), zhm.v.k(travelItineraryScreen2.R, new RowLoadingDelegate(), travelItineraryScreen2.S, new NewsLoadingDelegate(), new ListSubheaderDelegate(), travelItineraryScreen2.Q, travelItineraryScreen2.U, travelItineraryScreen2.T), R$id.travelItineraryScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelItineraryScreen.Y;
                        phm.a aVar = (phm.a) ue0.e.j(travelItineraryScreen.m2()).a().get(xuj.i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xuj.i.class, " is not found"));
                        }
                        xuj.i iVar = ((xuj.i) aVar2.b()).f309099m;
                        t tVar = travelItineraryScreen.K;
                        tVar.getClass();
                        return new xuj.f(iVar, travelItineraryScreen, tVar);
                    default:
                        KProperty[] kPropertyArr3 = TravelItineraryScreen.Y;
                        return (u) ((xuj.f) travelItineraryScreen.W.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.W = w.y0(new Function0(this) { // from class: zuj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelItineraryScreen f325488b;

            {
                this.f325488b = this;
            }

            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelItineraryScreen travelItineraryScreen = this.f325488b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelItineraryScreen.Y;
                        TravelItineraryScreen travelItineraryScreen2 = this.f325488b;
                        return tki.g.a(travelItineraryScreen2, travelItineraryScreen2.R2(), zhm.v.k(travelItineraryScreen2.R, new RowLoadingDelegate(), travelItineraryScreen2.S, new NewsLoadingDelegate(), new ListSubheaderDelegate(), travelItineraryScreen2.Q, travelItineraryScreen2.U, travelItineraryScreen2.T), R$id.travelItineraryScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelItineraryScreen.Y;
                        phm.a aVar = (phm.a) ue0.e.j(travelItineraryScreen.m2()).a().get(xuj.i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xuj.i.class, " is not found"));
                        }
                        xuj.i iVar = ((xuj.i) aVar2.b()).f309099m;
                        t tVar = travelItineraryScreen.K;
                        tVar.getClass();
                        return new xuj.f(iVar, travelItineraryScreen, tVar);
                    default:
                        KProperty[] kPropertyArr3 = TravelItineraryScreen.Y;
                        return (u) ((xuj.f) travelItineraryScreen.W.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.X = w.y0(new Function0(this) { // from class: zuj.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelItineraryScreen f325488b;

            {
                this.f325488b = this;
            }

            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelItineraryScreen travelItineraryScreen = this.f325488b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelItineraryScreen.Y;
                        TravelItineraryScreen travelItineraryScreen2 = this.f325488b;
                        return tki.g.a(travelItineraryScreen2, travelItineraryScreen2.R2(), zhm.v.k(travelItineraryScreen2.R, new RowLoadingDelegate(), travelItineraryScreen2.S, new NewsLoadingDelegate(), new ListSubheaderDelegate(), travelItineraryScreen2.Q, travelItineraryScreen2.U, travelItineraryScreen2.T), R$id.travelItineraryScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelItineraryScreen.Y;
                        phm.a aVar = (phm.a) ue0.e.j(travelItineraryScreen.m2()).a().get(xuj.i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", xuj.i.class, " is not found"));
                        }
                        xuj.i iVar = ((xuj.i) aVar2.b()).f309099m;
                        t tVar = travelItineraryScreen.K;
                        tVar.getClass();
                        return new xuj.f(iVar, travelItineraryScreen, tVar);
                    default:
                        KProperty[] kPropertyArr3 = TravelItineraryScreen.Y;
                        return (u) ((xuj.f) travelItineraryScreen.W.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        int i;
        RecyclerView.Adapter adapter;
        zuj.w uiState = (zuj.w) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithBigTile navBarWithBigTile = d3().d;
        zuj.s sVar = uiState.f325511b;
        boolean z = sVar instanceof zuj.q;
        p pVar = p.f325503a;
        r rVar = r.f325507a;
        if (z) {
            navBarWithBigTile.setLoadingState(false);
            zuj.q qVar2 = (zuj.q) sVar;
            TextClause textClause = qVar2.f325504a;
            navBarWithBigTile.setToolbarTitle(textClause);
            navBarWithBigTile.setTitle(new z0(textClause, false));
            navBarWithBigTile.setDescription(qVar2.f325505b);
            c1.S(navBarWithBigTile, u.c(new u0(new NavBarWithContainerBackground.ImageBackground(qVar2.f325506c, s8.MULTICOLOR, (Color.SolidRes) null, 12), null, null, null)), null, null, 6);
            navBarWithBigTile.setMenuItems(u.c(new IconNavBarMenuItem("MENU_ITEM_EDIT_ID", new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.travel_trip_itinerary_edit_menu_item, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION)));
        } else if (Intrinsics.f(sVar, rVar)) {
            navBarWithBigTile.setLoadingState(true);
            navBarWithBigTile.setToolbarTitle(null);
            navBarWithBigTile.setTitle(new z0(null, false));
            navBarWithBigTile.setMenuItems(f0.f322471a);
        } else {
            if (!Intrinsics.f(sVar, pVar)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithBigTile.setLoadingState(false);
            navBarWithBigTile.setToolbarTitle(null);
            navBarWithBigTile.setTitle(new z0(null, false));
            navBarWithBigTile.setDescription((Clause) null);
            navBarWithBigTile.setActionStatusLabel(null);
            f0 f0Var = f0.f322471a;
            c1.S(navBarWithBigTile, f0Var, null, null, 6);
            navBarWithBigTile.setMenuItems(f0Var);
        }
        FormsActionButton formsActionButton = d3().f283239b;
        if (z) {
            i = 0;
        } else {
            if (!Intrinsics.f(sVar, rVar) && !Intrinsics.f(sVar, pVar)) {
                throw new NoWhenBranchMatchedException();
            }
            i = 8;
        }
        formsActionButton.setVisibility(i);
        v vVar = qVar instanceof v ? (v) qVar : null;
        if (vVar == null || vVar.f325509a) {
            List list = uiState.f325510a;
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj2 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    zhm.v.s();
                    throw null;
                }
                b0 b0Var = d0.Companion;
                String listId = ((j) obj2).getF51573a();
                b0Var.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (!a0.H(listId, "DAY_SUBHEADER_LIST_ID_", false)) {
                    listId = null;
                }
                String strE0 = listId != null ? kotlin.text.d0.e0(listId, "DAY_SUBHEADER_LIST_ID_") : null;
                Pair pair = strE0 != null ? new Pair(Integer.valueOf(i2), strE0) : null;
                if (pair != null) {
                    arrayList.add(pair);
                }
                i2 = i3;
            }
            this.O = arrayList;
        }
        d3().f283240c.setItems(uiState.f325512c, uiState.d);
        Integer num = uiState.e;
        if (num != null) {
            int iIntValue = num.intValue();
            RecyclerView.LayoutManager layoutManager = d3().e.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null && (adapter = d3().e.getAdapter()) != null) {
                int itemCount = adapter.getItemCount();
                if (iIntValue >= 0 && iIntValue < itemCount) {
                    linearLayoutManager.startSmoothScroll(new k(iIntValue, linearLayoutManager, this, d3().e.getContext()));
                }
            }
            a aVar = (a) R2();
            aVar.H2(aVar.z, new zr2.o(23));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().d;
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.FULL_GRADIENT);
        navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
        d3().f283239b.setImage(new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        d dVar = this.N;
        if (dVar != null) {
            d3().e.removeOnScrollListener(dVar);
        }
        this.N = null;
        SlidingFromTopViewContainer slidingFromTopViewContainer = d3().f;
        NavBarWithBigTile appBarLayout = d3().d;
        Intrinsics.checkNotNullExpressionValue(appBarLayout, "travelItineraryScreenNavBar");
        ScreenContentRecyclerView screenContentRecyclerView = d3().e;
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        b0.e eVar = slidingFromTopViewContainer.f59472p;
        if (eVar != null) {
            appBarLayout.removeCallbacks(eVar);
        }
        slidingFromTopViewContainer.f59472p = null;
        appBarLayout.u(slidingFromTopViewContainer);
        i4 i4Var = slidingFromTopViewContainer.f59471n;
        if (i4Var != null) {
            appBarLayout.removeOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) i4Var);
        }
        m4 m4Var = slidingFromTopViewContainer.o;
        if (m4Var != null) {
            screenContentRecyclerView.removeOnScrollListener(m4Var);
        }
        slidingFromTopViewContainer.f59471n = null;
        slidingFromTopViewContainer.o = null;
        this.P = null;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().d.f59357t), new zuj.e(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().d.b()), new zuj.f(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f283239b.f58987s), new zuj.e(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f53218h), new zuj.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.p()), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.f52729c), new zuj.j(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f283240c.f58882b), new zuj.f(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.U.e.f121375b), new zuj.f(this, continuation, 2), 3);
        d dVar = new d(this);
        d3().e.addOnScrollListener(dVar);
        this.N = dVar;
        SlidingFromTopViewContainer travelItineraryScreenSlidingContainer = d3().f;
        Intrinsics.checkNotNullExpressionValue(travelItineraryScreenSlidingContainer, "travelItineraryScreenSlidingContainer");
        NavBarWithBigTile travelItineraryScreenNavBar = d3().d;
        Intrinsics.checkNotNullExpressionValue(travelItineraryScreenNavBar, "travelItineraryScreenNavBar");
        travelItineraryScreenSlidingContainer.b(travelItineraryScreenNavBar, d3().e, j4.DEFAULT, true);
    }

    public final uuj.a d3() {
        ViewBinding value = this.L.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (uuj.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final zuj.u R2() {
        return (zuj.u) this.X.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.V.getValue();
    }
}
