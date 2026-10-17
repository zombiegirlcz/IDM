package com.revolut.feature.robo.impl.ui.screen.templates;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.HorizontalBarGroupDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.robo.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseScreen;
import dmc.t;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import sji.b;
import t70.x;
import u36.g;
import ue0.e;
import vc.s;
import wnc.c;
import wnc.d;
import wnc.f;
import wnc.n;
import wnc.o;
import wnc.v;
import wnc.w;
import z0h.s1;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/robo/impl/ui/screen/templates/TemplatesScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Lwnc/w;", "Lcom/revolut/feature/robo/impl/ui/screen/templates/TemplatesScreenContract$Input;", "Lwnc/o;", "Lno/m;", "Lz0h/s1;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TemplatesScreen extends BaseScreen<w, TemplatesScreenContract$Input, o> implements m, s1 {
    public static final /* synthetic */ KProperty[] g0 = {o0.f186429a.j(new h0(TemplatesScreen.class, "binding", "getBinding()Lcom/revolut/feature/robo/impl/databinding/ScreenPortfolioTemplatesBinding;", 0))};
    public final k9 M;
    public final h N;
    public final ListSubheaderDelegate O;
    public final PlainTextDelegate P;
    public final CellDetailsChevronDelegate Q;
    public final TrendViewDelegate R;
    public final FixedTabsDelegate S;
    public final FullScreenStateDelegate T;
    public final TextDelegate U;
    public final LargeActionButtonDelegate V;
    public final RowLoadingDelegate W;
    public final HeaderLoadingDelegate X;
    public final HeaderDelegate Y;
    public final HorizontalBarGroupDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f85207a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Integer f85208b0;
    public boolean c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final f f85209d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final boolean f85210e0;
    public final Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemplatesScreen(TemplatesScreenContract$Input input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        k9 value = k9.RoboAdvisor;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        this.M = value;
        this.N = s.t(this, wnc.a.f);
        this.O = new ListSubheaderDelegate();
        this.P = new PlainTextDelegate();
        this.Q = new CellDetailsChevronDelegate();
        this.R = new TrendViewDelegate(1000L);
        this.S = new FixedTabsDelegate();
        this.T = new FullScreenStateDelegate();
        this.U = new TextDelegate();
        this.V = new LargeActionButtonDelegate();
        this.W = new RowLoadingDelegate();
        this.X = new HeaderLoadingDelegate();
        this.Y = new HeaderDelegate();
        this.Z = new HorizontalBarGroupDelegate();
        this.f85207a0 = te0.w.y0(new vt3.a(this, 26));
        this.f85209d0 = new f(this);
        this.f85210e0 = true;
        this.f0 = te0.w.y0(new w83.a(this, input, 20));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, jki.o oVar) {
        w uiState = (w) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        List list = uiState.d;
        List list2 = uiState.f298817c;
        wnc.s sVar = uiState.f298815a;
        d8f.s sVar2 = uiState.e;
        if (list != null) {
            ((j) this.f85207a0.getValue()).c(list);
        }
        NavBarWithToolbar navBarWithToolbar = Z2().f6306c;
        navBarWithToolbar.setLoadingVisible(sVar == null);
        if (sVar != null) {
            Clause clause = sVar.f298813b;
            TextLocalisedClause textLocalisedClause = sVar.f298812a;
            navBarWithToolbar.setTitle(textLocalisedClause, null);
            navBarWithToolbar.setToolbarTitle(textLocalisedClause);
            navBarWithToolbar.setDescriptionText(clause);
            navBarWithToolbar.setDescriptionVisible(clause != null);
        }
        Tabs tabs = Z2().d;
        tabs.setVisibility(e.n(list2) ? 8 : 0);
        if (list2 != null) {
            Tabs.setItems$default(tabs, list2, null, 2, null);
        }
        LargeActionButton largeActionButton = Z2().f6305b;
        largeActionButton.setText(sVar2.a());
        largeActionButton.setEnabled(sVar2.f112255c);
        largeActionButton.setVisibility(sVar2.d ? 0 : 8);
        if (oVar == null || !(oVar instanceof v)) {
            b3(uiState, false);
        } else if (((v) oVar).f298814a) {
            b3(uiState, this.c0);
        }
        if (uiState.f298816b != null) {
            this.c0 = true;
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return new AnalyticsProduct.Retail(this.M);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (t) this.f0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(Z2().f6306c.f59410q), null, new wkg.e(this, null, 7), 3);
        int i = 4;
        int i2 = 2;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(Z2().d.f58882b), null, new g(i2, T2(), n.class, "onPageSelected", "onPageSelected(Ljava/lang/String;)V", i, 27), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(Z2().f6305b.o), null, new g(i2, T2(), n.class, "onNextButtonClicked", "onNextButtonClicked(Lkotlin/Unit;)V", i, 28), 3);
        Z2().e.registerOnPageChangeCallback(this.f85209d0);
        ListSubheaderDelegate listSubheaderDelegate = this.O;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(listSubheaderDelegate.d), null, new wnc.b(2, 4, n.class, T2(), "onInfoIconClicked", "onInfoIconClicked(Lcom/revolut/core/ui_kit/delegates/ListSubheaderDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(listSubheaderDelegate.f52707c), null, new c(2, 4, n.class, T2(), "onSeeAllClicked", "onSeeAllClicked(Lcom/revolut/core/ui_kit/delegates/ListSubheaderDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.V.d.f121375b), null, new d(2, 4, n.class, T2(), "onDialogActionButtonClicked", "onDialogActionButtonClicked(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f.f121375b), null, new wnc.e(2, 4, n.class, T2(), "onActionClick", "onActionClick(Lcom/revolut/core/ui_kit/delegates/PlainTextDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.U.d), null, new g(i2, T2(), n.class, "onTextDelegateClauseClick", "onTextDelegateClauseClick(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 29), 3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Z2().e.setAdapter((j) this.f85207a0.getValue());
        Z2().f6306c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ((j60.a) ((t) this.f0.getValue()).k.get()).d(u.c(this.V));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void Y2() {
        Z2().e.unregisterOnPageChangeCallback(this.f85209d0);
        this.f85208b0 = null;
        this.c0 = false;
    }

    public final amc.d Z2() {
        ViewBinding value = this.N.getValue(this, g0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (amc.d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: a3, reason: merged with bridge method [inline-methods] */
    public final n T2() {
        return (n) ((t) this.f0.getValue()).C.get();
    }

    public final void b3(w wVar, boolean z) {
        TemplatesScreenContract$UIState$SelectedTab templatesScreenContract$UIState$SelectedTab = wVar.f298816b;
        if (templatesScreenContract$UIState$SelectedTab != null) {
            String str = templatesScreenContract$UIState$SelectedTab.f85215a;
            int i = templatesScreenContract$UIState$SelectedTab.f85216b;
            this.f85208b0 = Integer.valueOf(i);
            Tabs portfolioTemplatesTabs = Z2().d;
            Intrinsics.checkNotNullExpressionValue(portfolioTemplatesTabs, "portfolioTemplatesTabs");
            Tabs.u(portfolioTemplatesTabs, str, z, false, false, 12);
            Z2().e.setCurrentItem(i, z);
            Z2().e.post(new x(this, 28));
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getU() {
        return R$layout.screen_portfolio_templates;
    }

    @Override // z0h.s1
    public final vkm.d r() {
        return rd0.e.b(this.U.d);
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.f85210e0);
    }
}
