package com.revolut.feature.travel.experiences.impl.ui.screen.filter;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RangeSliderTitleDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.R$id;
import com.revolut.feature.travel.experiences.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import frl.a;
import g2g.e;
import g2g.f;
import g2g.g;
import g2g.j;
import g2g.k;
import g2g.m;
import g2g.n;
import g2g.o;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import sji.b;
import te0.w;
import vc.s;
import z0g.i;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/filter/TravelExperiencesFilterScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lg2g/o;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/filter/TravelExperiencesFilterScreenContract$InputData;", "Lg2g/m;", "Lno/m;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperiencesFilterScreen extends BaseRecyclerViewScreen<o, TravelExperiencesFilterScreenContract$InputData, m> implements no.m {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f93064h0 = {o0.f186429a.j(new h0(TravelExperiencesFilterScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenExperiencesFilterBinding;", 0))};
    public final AnalyticsProduct.Retail U;
    public final boolean V;
    public final int W;
    public final int X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final CellDetailsSwitcherDelegate f93065a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final FullScreenStateDelegate f93066b0;
    public final InputChecklistDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final RangeSliderTitleDelegate f93067d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final LargeActionButtonDelegate f93068e0;
    public final List f0;
    public final h g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelExperiencesFilterScreen(TravelExperiencesFilterScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.f137510y;
        this.U = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.V = true;
        this.W = R$layout.screen_experiences_filter;
        this.X = R$id.experiencesFilter_recyclerView;
        this.Y = w.y0(new fx5.a(this, inputData, 7));
        this.Z = w.y0(new fp3.a(this, 18));
        CellDetailsSwitcherDelegate cellDetailsSwitcherDelegate = new CellDetailsSwitcherDelegate();
        this.f93065a0 = cellDetailsSwitcherDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f93066b0 = fullScreenStateDelegate;
        InputChecklistDelegate inputChecklistDelegate = new InputChecklistDelegate();
        this.c0 = inputChecklistDelegate;
        RangeSliderTitleDelegate rangeSliderTitleDelegate = new RangeSliderTitleDelegate();
        this.f93067d0 = rangeSliderTitleDelegate;
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.f93068e0 = largeActionButtonDelegate;
        this.f0 = v.k(cellDetailsSwitcherDelegate, fullScreenStateDelegate, inputChecklistDelegate, listSubheaderDelegate, largeActionButtonDelegate, rangeSliderTitleDelegate, rowDelegate, new ListSubheaderLoadingDelegate(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate());
        this.g0 = s.t(this, e.f);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getK() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (i) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f293709c.f59410q), null, new f(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f293709c.o.f57403b), null, new g(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f93066b0.f52371h.f121375b), null, new g2g.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f93068e0.d.f121375b), null, new g2g.i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f93067d0.f53139c), null, new g(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.c0.f52518c), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f93065a0.f51912c), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f293708b.o), null, new f(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f293709c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.experiences_filter_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.experiences_filter_title, null, null, 14));
        LargeActionButton largeActionButton = h3().f293708b;
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        largeActionButton.setText(new TextLocalisedClause(R$string.experiences_filter_action_apply_filters, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF0() {
        return this.f0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getX() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(o uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        h3().f293708b.setEnabled(uiState.f140061c);
        h3().f293709c.setMenuItems(uiState.f140060b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.W;
    }

    public final w0g.h h3() {
        ViewBinding value = this.g0.getValue(this, f93064h0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w0g.h) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final n T2() {
        return (n) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
