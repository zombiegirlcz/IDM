package com.revolut.feature.widgets.impl.ui.screen.customisation;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.widgets.WidgetCarouselPageDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.ScrollingPagerIndicatorView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.widgets.api.R$string;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.feature.widgets.impl.R$id;
import com.revolut.feature.widgets.impl.R$layout;
import com.revolut.feature.widgets.impl.ui.screen.customisation.WidgetCarouselScreen;
import com.revolut.feature.widgets.impl.ui.screen.customisation.WidgetCarouselScreenContract$InputData;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.List;
import jki.h;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import ofm.q;
import op0.h5;
import qsh.b;
import qsh.d;
import te0.w;
import xsh.c;
import xsh.e;
import xsh.f;
import xsh.g;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/widgets/impl/ui/screen/customisation/WidgetCarouselScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Lxsh/g;", "Lcom/revolut/feature/widgets/impl/ui/screen/customisation/WidgetCarouselScreenContract$InputData;", "Lxsh/e;", "Lno/m;", "xsh/b", "feature_widgets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WidgetCarouselScreen extends BaseScreen<g, WidgetCarouselScreenContract$InputData, e> implements m {
    public NavBarWithToolbar M;
    public ViewPager2 N;
    public LargeActionButton O;
    public ScrollingPagerIndicatorView P;
    public final WidgetCarouselPageDelegate Q;
    public final j R;
    public final Object S;
    public final Object T;
    public final int U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetCarouselScreen(WidgetContext widgetContext, String sourceId, List availableWidgetTypes, String defaultWidgetType) {
        super(new WidgetCarouselScreenContract$InputData(widgetContext, sourceId, availableWidgetTypes, defaultWidgetType));
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
        Intrinsics.checkNotNullParameter(defaultWidgetType, "defaultWidgetType");
        WidgetCarouselPageDelegate widgetCarouselPageDelegate = new WidgetCarouselPageDelegate();
        this.Q = widgetCarouselPageDelegate;
        this.R = new j(7, u.c(widgetCarouselPageDelegate), false);
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: xsh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetCarouselScreen f308491b;

            {
                this.f308491b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        WidgetCarouselScreen widgetCarouselScreen = this.f308491b;
                        qji.b bVarQ2 = widgetCarouselScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.widgets.impl.ui.screen.customisation.di.WidgetCarouselScreenInjector");
                        qsh.c cVar = (qsh.c) ((ysh.a) bVarQ2).b().S(widgetCarouselScreen);
                        WidgetCarouselScreenContract$InputData widgetCarouselScreenContract$InputData = (WidgetCarouselScreenContract$InputData) widgetCarouselScreen.G;
                        switch (cVar.f248845a) {
                            case 0:
                                widgetCarouselScreenContract$InputData.getClass();
                                cVar.f248847c = widgetCarouselScreenContract$InputData;
                                break;
                            default:
                                widgetCarouselScreenContract$InputData.getClass();
                                cVar.f248847c = widgetCarouselScreenContract$InputData;
                                break;
                        }
                        return (qsh.d) cVar.mo3800build();
                    default:
                        qsh.d dVar = (qsh.d) this.f308491b.S.getValue();
                        switch (dVar.f248848a) {
                            case 0:
                                i iVar = new i();
                                qsh.b bVar = (qsh.b) dVar.f248850c;
                                return new r(iVar, (ish.a) bVar.f248844h.get(), (ish.b) bVar.f248843g.get(), dVar.f248849b);
                            default:
                                i iVar2 = new i();
                                ush.b bVar2 = (ush.b) dVar.f248850c;
                                return new r(iVar2, (ish.a) bVar2.f282928h.get(), (ish.b) bVar2.f282927g.get(), dVar.f248849b);
                        }
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: xsh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WidgetCarouselScreen f308491b;

            {
                this.f308491b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        WidgetCarouselScreen widgetCarouselScreen = this.f308491b;
                        qji.b bVarQ2 = widgetCarouselScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.widgets.impl.ui.screen.customisation.di.WidgetCarouselScreenInjector");
                        qsh.c cVar = (qsh.c) ((ysh.a) bVarQ2).b().S(widgetCarouselScreen);
                        WidgetCarouselScreenContract$InputData widgetCarouselScreenContract$InputData = (WidgetCarouselScreenContract$InputData) widgetCarouselScreen.G;
                        switch (cVar.f248845a) {
                            case 0:
                                widgetCarouselScreenContract$InputData.getClass();
                                cVar.f248847c = widgetCarouselScreenContract$InputData;
                                break;
                            default:
                                widgetCarouselScreenContract$InputData.getClass();
                                cVar.f248847c = widgetCarouselScreenContract$InputData;
                                break;
                        }
                        return (qsh.d) cVar.mo3800build();
                    default:
                        qsh.d dVar = (qsh.d) this.f308491b.S.getValue();
                        switch (dVar.f248848a) {
                            case 0:
                                i iVar = new i();
                                qsh.b bVar = (qsh.b) dVar.f248850c;
                                return new r(iVar, (ish.a) bVar.f248844h.get(), (ish.b) bVar.f248843g.get(), dVar.f248849b);
                            default:
                                i iVar2 = new i();
                                ush.b bVar2 = (ush.b) dVar.f248850c;
                                return new r(iVar2, (ish.a) bVar2.f282928h.get(), (ish.b) bVar2.f282927g.get(), dVar.f248849b);
                        }
                }
            }
        });
        this.U = R$layout.screen_widget_carousel;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        g uiState = (g) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        j jVar = this.R;
        boolean zIsEmpty = jVar.f319395l.isEmpty();
        jVar.c(uiState.f308497a);
        if (zIsEmpty) {
            ViewPager2 viewPager2 = this.N;
            if (viewPager2 == null) {
                Intrinsics.r("pager");
                throw null;
            }
            viewPager2.setCurrentItem(uiState.f308498b, false);
        }
        NavBarWithToolbar navBarWithToolbar = this.M;
        if (navBarWithToolbar == null) {
            Intrinsics.r("navBar");
            throw null;
        }
        navBarWithToolbar.setTitle(uiState.f308499c, null);
        navBarWithToolbar.setSecondDescriptionText(uiState.d);
        LargeActionButton largeActionButton = this.O;
        if (largeActionButton != null) {
            largeActionButton.setEnabled(uiState.e);
        } else {
            Intrinsics.r("actionButton");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getT() {
        d dVar = (d) this.S.getValue();
        switch (dVar.f248848a) {
            case 0:
                return ((b) dVar.f248850c).d.l();
            default:
                return ((ush.b) dVar.f248850c).f282926c.l();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (d) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (f) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        LargeActionButton largeActionButton = this.O;
        Continuation continuation = null;
        if (largeActionButton == null) {
            Intrinsics.r("actionButton");
            throw null;
        }
        a.g2(this, rd0.e.b(largeActionButton.o), null, new c(this, continuation, 0), 3);
        NavBarWithToolbar navBarWithToolbar = this.M;
        if (navBarWithToolbar == null) {
            Intrinsics.r("navBar");
            throw null;
        }
        a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new c(this, continuation, 1), 3);
        a.g2(this, rd0.e.b(this.Q.f55285c.f121375b), null, new xjl.g(this, continuation, 22), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.widgetCarousel_navBar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.M = (NavBarWithToolbar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.widgetCarousel_pager);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.N = (ViewPager2) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.widgetCarousel_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.O = (LargeActionButton) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R$id.widgetCarousel_pagerIndicator);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.P = (ScrollingPagerIndicatorView) viewFindViewById4;
        ViewPager2 viewPager2 = this.N;
        if (viewPager2 == null) {
            Intrinsics.r("pager");
            throw null;
        }
        viewPager2.setAdapter(this.R);
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.setClipChildren(false);
        viewPager2.setClipToPadding(false);
        WidgetCarouselPageDelegate.Companion companion = WidgetCarouselPageDelegate.INSTANCE;
        Context context = viewPager2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        viewPager2.setPageTransformer(new h5(context));
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
            recyclerView.setClipChildren(false);
            recyclerView.setClipToPadding(false);
        }
        viewPager2.registerOnPageChangeCallback(new xsh.b(this));
        ScrollingPagerIndicatorView scrollingPagerIndicatorView = this.P;
        if (scrollingPagerIndicatorView == null) {
            Intrinsics.r("pagerIndicator");
            throw null;
        }
        ViewPager2 viewPager22 = this.N;
        if (viewPager22 == null) {
            Intrinsics.r("pager");
            throw null;
        }
        scrollingPagerIndicatorView.P(viewPager22);
        LargeActionButton largeActionButton = this.O;
        if (largeActionButton == null) {
            Intrinsics.r("actionButton");
            throw null;
        }
        largeActionButton.setText(new TextLocalisedClause(R$string.widgets_carousel_add_title, null, null, 14));
        NavBarWithToolbar navBarWithToolbar = this.M;
        if (navBarWithToolbar == null) {
            Intrinsics.r("navBar");
            throw null;
        }
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.U;
    }
}
