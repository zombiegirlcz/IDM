package com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.selection;

import a07.b;
import a9d.a;
import a9d.c;
import a9d.m;
import a9d.n;
import a9d.o;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import ofm.q;
import r7d.d;
import rd0.e;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/cards/selection/CardsTroubleshooterSelectionScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "La9d/o;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/cards/selection/CardsTroubleshooterSelectionScreenContract$InputData;", "La9d/m;", "Lno/k;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardsTroubleshooterSelectionScreen extends BaseRecyclerViewScreen<o, CardsTroubleshooterSelectionScreenContract$InputData, m> implements k {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(CardsTroubleshooterSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final h V;
    public final boolean W;
    public final boolean X;
    public final RowDelegate Y;
    public final LargeActionButtonDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final CellDetailsChevronDelegate f86312a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public AnalyticsContext f86313b0;
    public final List c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f86314d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f86315e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsTroubleshooterSelectionScreen(CardsTroubleshooterSelectionScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = s.t(this, a.f);
        this.W = true;
        this.X = true;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Y = rowDelegate;
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.Z = largeActionButtonDelegate;
        CellDetailsChevronDelegate cellDetailsChevronDelegate = new CellDetailsChevronDelegate();
        this.f86312a0 = cellDetailsChevronDelegate;
        SearchButtonDelegate searchButtonDelegate = new SearchButtonDelegate();
        this.f86313b0 = l7d.a.b(inputData.f86316a);
        this.c0 = v.k(cellDetailsChevronDelegate, largeActionButtonDelegate, new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), rowDelegate, searchButtonDelegate);
        this.f86314d0 = w.y0(new b(this, inputData, 17));
        this.f86315e0 = w.y0(new a2g.a(this, 8));
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.f86313b0 = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getF102017a0() {
        return this.f86313b0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (d) this.f86314d0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.f59410q), null, new a9d.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.o.f57403b), null, new a0l.k(this, null, 20), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.v0()), null, new a9d.b(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f86312a0.f51821c), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.d.f121375b), null, new a9d.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Y.f53218h), null, new a9d.e(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        jii.m mVarH3 = h3();
        mVarH3.f174539b.setTag("CardsTroubleshooterSelectionScreen_navBarWithToolbar");
        mVarH3.f174540c.setTag("CardsTroubleshooterSelectionScreen_recycler");
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.f59417v0 = false;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF91943b0() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: f3, reason: from getter */
    public final boolean getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(o uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setTitle(uiState.f2414a, null);
        navBarWithToolbar.setMenuItems(uiState.f2416c);
        TextLocalisedClause textLocalisedClause = uiState.d;
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHint(textLocalisedClause);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }

    public final jii.m h3() {
        ViewBinding value = this.V.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final n T2() {
        return (n) this.f86315e0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
