package com.revolut.retail.feature.impl.budgeting.ui.rev10.edit_cycle;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.GridSingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nrj.a;
import nrj.c;
import nrj.d;
import nrj.e;
import nrj.g;
import org.jetbrains.annotations.NotNull;
import sji.b;
import te0.w;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/edit_cycle/AnalyticsEditCycleScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lnrj/g;", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/edit_cycle/AnalyticsEditCycleScreenContract$InputData;", "Lnrj/e;", "Companion", "a", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AnalyticsEditCycleScreen extends BaseRecyclerViewScreen<g, AnalyticsEditCycleScreenContract$InputData, e> {
    public final int U;
    public final int V;
    public final h W;
    public final FixedTabsDelegate X;
    public final GridSingleChoiceDelegate Y;
    public final SuggestionsBarDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f101501a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f101502b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f101500d0 = {o0.f186429a.j(new h0(AnalyticsEditCycleScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.retail.feature.impl.budgeting.ui.rev10.edit_cycle.AnalyticsEditCycleScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsEditCycleScreen(AnalyticsEditCycleScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar_nextbutton;
        this.V = R$id.recyclerView;
        this.W = s.t(this, a.f);
        FixedTabsDelegate fixedTabsDelegate = new FixedTabsDelegate();
        this.X = fixedTabsDelegate;
        GridSingleChoiceDelegate gridSingleChoiceDelegate = new GridSingleChoiceDelegate();
        this.Y = gridSingleChoiceDelegate;
        SuggestionsBarDelegate suggestionsBarDelegate = new SuggestionsBarDelegate();
        this.Z = suggestionsBarDelegate;
        this.f101501a0 = v.k(fixedTabsDelegate, gridSingleChoiceDelegate, suggestionsBarDelegate, new ListSubheaderDelegate());
        this.f101502b0 = w.y0(new ni1.a(this, inputData, 27));
        this.c0 = w.y0(new nmm.h(this, 17));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (erj.g) this.f101502b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f174565c.f59410q), null, new nrj.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f174565c.o.f57403b), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f174564b.o), null, new nrj.b(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.X.f52339c.f121375b), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Y.f52390g.f121375b), null, new c(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Z.p().d), null, new d(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174565c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.analytics_edit_cycle_screen_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.analytics_edit_cycle_screen_description, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setMenuItems(u.c(new TextNavBarMenuItem("RESET_CYCLE_MENU_ITEM_ID", new TextLocalisedClause(R$string.analytics_edit_cycle_screen_action_reset, null, null, 14), null, null, 12)));
        g3().f174564b.setText(new TextLocalisedClause(R$string.analytics_edit_cycle_screen_action_set_cycle, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF101501a0() {
        return this.f101501a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final jii.u g3() {
        ViewBinding value = this.W.getValue(this, f101500d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final nrj.h T2() {
        return (nrj.h) this.c0.getValue();
    }
}
