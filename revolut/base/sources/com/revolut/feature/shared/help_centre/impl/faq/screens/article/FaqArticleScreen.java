package com.revolut.feature.shared.help_centre.impl.faq.screens.article;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import az.i;
import b8d.d;
import b8d.g;
import b8d.j;
import b8d.t;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.ActionsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSingleButtonDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsTwinButtonsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LikeDislikeWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.shared.help_centre.impl.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.m;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import no.k;
import ofm.q;
import r7d.f;
import rd0.e;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/article/FaqArticleScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lb8d/t;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/article/FaqArticleScreenContract$InputData;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/article/a;", "Lno/k;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FaqArticleScreen extends BaseRecyclerViewScreen<t, FaqArticleScreenContract$InputData, a> implements k {
    public static final /* synthetic */ KProperty[] m0 = {o0.f186429a.j(new h0(FaqArticleScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final h V;
    public final boolean W;
    public final boolean X;
    public AnalyticsContext Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f86220a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final CellDetailsChevronDelegate f86221b0;
    public final CellDetailsSingleButtonDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final CellDetailsTwinButtonsDelegate f86222d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final RowDelegate f86223e0;
    public final PlainTextDelegate f0;
    public final PlainTextWarningDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final ActionsDelegate f86224h0;
    public final ListSubheaderDelegate i0;
    public final InputTextDelegate j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final LargeActionButtonDelegate f86225k0;
    public final List l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaqArticleScreen(FaqArticleScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = s.t(this, b8d.a.f);
        this.W = true;
        this.X = true;
        this.Y = l7d.a.b(b.a(inputData));
        this.Z = w.y0(new at4.b(this, inputData, 23));
        this.f86220a0 = w.y0(new aqe.a(this, 27));
        CellDetailsChevronDelegate cellDetailsChevronDelegate = new CellDetailsChevronDelegate();
        this.f86221b0 = cellDetailsChevronDelegate;
        CellDetailsSingleButtonDelegate cellDetailsSingleButtonDelegate = new CellDetailsSingleButtonDelegate();
        this.c0 = cellDetailsSingleButtonDelegate;
        CellDetailsTwinButtonsDelegate cellDetailsTwinButtonsDelegate = new CellDetailsTwinButtonsDelegate();
        this.f86222d0 = cellDetailsTwinButtonsDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f86223e0 = rowDelegate;
        LikeDislikeWidgetDelegate likeDislikeWidgetDelegate = new LikeDislikeWidgetDelegate();
        PlainTextDelegate plainTextDelegate = new PlainTextDelegate();
        this.f0 = plainTextDelegate;
        PlainTextWarningDelegate plainTextWarningDelegate = new PlainTextWarningDelegate();
        this.g0 = plainTextWarningDelegate;
        ActionsDelegate actionsDelegate = new ActionsDelegate();
        this.f86224h0 = actionsDelegate;
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.i0 = listSubheaderDelegate;
        this.j0 = new InputTextDelegate(null);
        this.f86225k0 = new LargeActionButtonDelegate();
        this.l0 = v.k(cellDetailsChevronDelegate, cellDetailsSingleButtonDelegate, cellDetailsTwinButtonsDelegate, listSubheaderDelegate, new RowLoadingDelegate(), likeDislikeWidgetDelegate, plainTextDelegate, rowDelegate, new PlainTextLoadingDelegate(), actionsDelegate, new ActionsLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), plainTextWarningDelegate);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.Y = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getP() {
        return this.Y;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (f) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59410q), null, new i(this, continuation, 15), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.o.f57403b), null, new g(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f86221b0.f51821c), null, new b8d.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f0.d.f121375b), null, new g(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.g0.s()), null, new g(this, continuation, 2), 3);
        RowDelegate rowDelegate = this.f86223e0;
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53218h), null, new b8d.i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.i), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53219j), null, new b8d.k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f86224h0.f51611c.f121375b), null, new g(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f86225k0.d.f121375b), null, new b8d.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.j0.e.f121375b), null, new b8d.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.c0.f.f121375b), null, new d(this, null), 3);
        CellDetailsTwinButtonsDelegate cellDetailsTwinButtonsDelegate = this.f86222d0;
        com.revolut.kompot.navigable.a.g2(this, e.b(cellDetailsTwinButtonsDelegate.e.f121375b), null, new b8d.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(cellDetailsTwinButtonsDelegate.f.f121375b), null, new b8d.f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        pd.b.p(view, new TextLocalisedClause(R$string.help_center_article, null, null, 14));
        m mVarH3 = h3();
        mVarH3.f174539b.setTag("FaqArticleScreen_navBarWithToolbar");
        mVarH3.f174540c.setTag("FaqArticleScreen_recycler");
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setTitleAutoSize(true);
        ((j60.a) ((f) this.Z.getValue()).e.get()).d(v.k(this.f86224h0, this.i0, this.j0, this.f86225k0, new ActionsLoadingDelegate(), new LargeActionButtonLoadingDelegate()));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.l0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: f3, reason: from getter */
    public final boolean getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(t uiState, o oVar) {
        Clause textClause;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        boolean z = uiState.f13193b;
        Clause clause = uiState.f13192a;
        if (z) {
            NavBarWithToolbar navBarWithToolbar = h3().f174539b;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
            return;
        }
        NavBarWithToolbar navBarWithToolbar2 = h3().f174539b;
        if (clause == null) {
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            textClause = clause;
        }
        navBarWithToolbar2.setToolbarTitle(textClause);
        navBarWithToolbar2.setTitle(clause, null);
        navBarWithToolbar2.setMenuItems(uiState.d);
        h3().f174539b.l0();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.U;
    }

    public final m h3() {
        ViewBinding value = this.V.getValue(this, m0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final b8d.s T2() {
        return (b8d.s) this.f86220a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
