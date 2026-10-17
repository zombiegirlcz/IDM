package com.revolut.feature.travel.experiences.impl.ui.screen.search_results;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.NewProductSmallDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.InputTravelSearchItemView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.SlidingFromTopViewContainer;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.R$id;
import com.revolut.feature.travel.experiences.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import grl.k9;
import java.util.List;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ljd.e;
import m3g.c;
import m3g.d;
import m3g.f;
import m3g.g;
import m3g.i;
import m3g.q;
import m3g.r;
import m3g.u;
import mx0.l;
import mx0.t;
import no.m;
import te0.w;
import tx0.i4;
import tx0.j4;
import tx0.m4;
import vc.s;
import yp0.y;
import z0g.p;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/search_results/TravelExperiencesSearchResultsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lm3g/u;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/search_results/TravelExperiencesSearchResultsScreenContract$InputData;", "Lm3g/q;", "Lno/m;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperiencesSearchResultsScreen extends BaseRecyclerViewScreen<u, TravelExperiencesSearchResultsScreenContract$InputData, q> implements m {
    public static final /* synthetic */ KProperty[] i0 = {o0.f186429a.j(new h0(TravelExperiencesSearchResultsScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenExperiencesSearchResultsBinding;", 0))};
    public final AnalyticsProduct.Retail U;
    public final int V;
    public final int W;
    public final boolean X;
    public final h Y;
    public boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f93136a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f93137b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final NewProductSmallDelegate f93138d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final ActionWidgetDelegate f93139e0;
    public final List f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f93140h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelExperiencesSearchResultsScreen(TravelExperiencesSearchResultsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137510y;
        this.U = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.V = R$layout.screen_experiences_search_results;
        this.W = R$id.experiencesSearchResults_recyclerView;
        this.X = true;
        this.Y = s.t(this, d.f);
        Lazy lazyY0 = w.y0(new m05.d(29));
        this.f93136a0 = lazyY0;
        Lazy lazyY02 = w.y0(new c(0));
        this.f93137b0 = lazyY02;
        Lazy lazyY03 = w.y0(new c(1));
        this.c0 = lazyY03;
        NewProductSmallDelegate newProductSmallDelegate = new NewProductSmallDelegate();
        this.f93138d0 = newProductSmallDelegate;
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.f93139e0 = actionWidgetDelegate;
        this.f0 = v.k((ListingCardDelegate) lazyY0.getValue(), (ListingCardLoadingDelegate) lazyY02.getValue(), (FullScreenStateDelegate) lazyY03.getValue(), newProductSmallDelegate, actionWidgetDelegate);
        this.g0 = w.y0(new ltf.b(this, inputData, 12));
        this.f93140h0 = w.y0(new e(this, 23));
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (p) this.g0.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f293721c.f59410q), null, new m3g.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().e.a()), null, new m3g.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f293720b.a()), null, new m3g.e(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ListingCardDelegate) this.f93136a0.getValue()).f52747c), null, new f(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f293721c.o.f57403b), null, new f(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f93138d0.f52791c), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().d.f58296a.f121375b), null, new m3g.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f93139e0.f51589c.f121375b), null, new f(this, continuation, 2), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f293721c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_left));
        h3().f293721c.setToolbarTitle(new TextLocalisedClause(R$string.experiences_home_title, null, null, 14));
        NavBarWithToolbar experiencesSearchResultsNavBarWithToolbar = h3().f293721c;
        Intrinsics.checkNotNullExpressionValue(experiencesSearchResultsNavBarWithToolbar, "experiencesSearchResultsNavBarWithToolbar");
        experiencesSearchResultsNavBarWithToolbar.setTitle(new TextLocalisedClause(R$string.experiences_home_title, null, null, 14), null);
        h3().e.setSearchIconImage(new ResourceImage(R$drawable.uikit_icn_16_chevron_down_small, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246));
        h3().f293720b.setSearchIconImage(new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246));
        y.a(h(), 25, true, new m11.h(this, 11));
        h().addOnScrollListener(new i(this));
        h3().d.setLayoutType(l.SCROLLABLE);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void X2() {
        this.Z = false;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF0() {
        return this.f0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(u uiState, o oVar) {
        int iK;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        InputTravelSearchItemView inputTravelSearchItemView = h3().e;
        Clause clause = uiState.f202554b;
        List list = uiState.f202556g;
        inputTravelSearchItemView.setPrimarySearchText(clause);
        h3().e.setSecondarySearchText(uiState.f202555c);
        h3().f293720b.setPrimarySearchText(uiState.d);
        h3().f293721c.setMenuItems(uiState.f);
        h3().f.a(uiState.e == m3g.s.EXPANDED);
        ActionsView experiencesSearchResultsQuickFiltersActions = h3().d;
        Intrinsics.checkNotNullExpressionValue(experiencesSearchResultsQuickFiltersActions, "experiencesSearchResultsQuickFiltersActions");
        ActionsView.Companion companion = ActionsView.INSTANCE;
        experiencesSearchResultsQuickFiltersActions.k(list, t.f210002a);
        if (list.isEmpty()) {
            if (this.Z) {
                this.Z = false;
                SlidingFromTopViewContainer experiencesSearchResultsSlidingContainerFilters = h3().f293722g;
                Intrinsics.checkNotNullExpressionValue(experiencesSearchResultsSlidingContainerFilters, "experiencesSearchResultsSlidingContainerFilters");
                experiencesSearchResultsSlidingContainerFilters.setVisibility(8);
                SlidingFromTopViewContainer slidingFromTopViewContainer = h3().f293722g;
                NavBarWithToolbar appBarLayout = h3().f293721c;
                Intrinsics.checkNotNullExpressionValue(appBarLayout, "experiencesSearchResultsNavBarWithToolbar");
                RecyclerView recyclerViewH = h();
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
                    recyclerViewH.removeOnScrollListener(m4Var);
                }
                slidingFromTopViewContainer.f59471n = null;
                slidingFromTopViewContainer.o = null;
            }
        } else if (!this.Z) {
            this.Z = true;
            h3().f293722g.a(true);
            SlidingFromTopViewContainer experiencesSearchResultsSlidingContainerFilters2 = h3().f293722g;
            Intrinsics.checkNotNullExpressionValue(experiencesSearchResultsSlidingContainerFilters2, "experiencesSearchResultsSlidingContainerFilters");
            NavBarWithToolbar experiencesSearchResultsNavBarWithToolbar = h3().f293721c;
            Intrinsics.checkNotNullExpressionValue(experiencesSearchResultsNavBarWithToolbar, "experiencesSearchResultsNavBarWithToolbar");
            experiencesSearchResultsSlidingContainerFilters2.b(experiencesSearchResultsNavBarWithToolbar, h(), j4.SHOW_ON_SCROLL_UP, false);
        }
        if (list.isEmpty()) {
            iK = 0;
        } else {
            Context context = h().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iK = kli.a.k(context, 52.0f);
        }
        h().setPadding(0, iK, 0, 0);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getX() {
        return this.V;
    }

    public final w0g.m h3() {
        ViewBinding value = this.Y.getValue(this, i0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w0g.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final r T2() {
        return (r) this.f93140h0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
