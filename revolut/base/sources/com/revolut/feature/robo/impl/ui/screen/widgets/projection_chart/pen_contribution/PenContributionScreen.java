package com.revolut.feature.robo.impl.ui.screen.widgets.projection_chart.pen_contribution;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.robo.impl.R$id;
import com.revolut.feature.robo.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.common.ui.R$string;
import dmc.j;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import sji.b;
import te0.w;
import umd.n;
import uoc.a;
import uoc.d;
import uoc.f;
import uoc.g;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/impl/ui/screen/widgets/projection_chart/pen_contribution/PenContributionScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Luoc/f;", "Lcom/revolut/feature/robo/impl/ui/screen/widgets/projection_chart/pen_contribution/PenContributionScreenContract$InputData;", "Luoc/d;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PenContributionScreen extends BaseRecyclerViewScreen<f, PenContributionScreenContract$InputData, d> {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(PenContributionScreen.class, "binding", "getBinding()Lcom/revolut/feature/robo/impl/databinding/ScreenPenContributionBinding;", 0))};
    public final h U;
    public final int V;
    public final Object W;
    public final Object X;
    public final List Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PenContributionScreen(PenContributionScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, a.f);
        this.V = R$layout.screen_pen_contribution;
        this.W = w.y0(new uj7.a(this, inputData, 10));
        this.X = w.y0(new tyl.a(this, 24));
        this.Y = u.c(new AmountEditDelegate(new n(this, 5)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (j) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (g) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f6300c.f59410q), null, new uea.e(this, null, 15), 3);
        vkm.d dVarB = e.b(h3().f6299b.o);
        ?? r06 = this.X;
        int i = 4;
        int i2 = 2;
        com.revolut.kompot.navigable.a.g2(this, dVarB, null, new u36.g(i2, (g) r06.getValue(), g.class, "onLargeActionButtonClicked", "onLargeActionButtonClicked(Lkotlin/Unit;)V", i, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().d.d), null, new u36.g(i2, (g) r06.getValue(), g.class, "onSuggestionClick", "onSuggestionClick(Lcom/revolut/core/ui_kit/views/KeyboardSuggestionsView$Item;)V", i, 3), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f6300c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        h3().f6299b.setText(new TextLocalisedClause(R$string.common_action_confirm, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF93083e0() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3 */
    public final int getZ() {
        return R$id.penContributionScreen_recyclerView;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(f uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f6300c;
        uoc.e eVar = uiState.f281609a;
        navBarWithToolbar.setTitle(eVar.f281607a, null);
        Clause clause = eVar.f281608b;
        if (clause != null) {
            NavBarWithToolbar.setToolbar$default(navBarWithToolbar, eVar.f281607a, clause, null, 4, null);
        } else {
            navBarWithToolbar.setToolbarTitle(eVar.f281607a);
        }
        h3().f6299b.setEnabled(uiState.d);
        h3().d.setItems(uiState.f281611c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.V;
    }

    public final amc.b h3() {
        ViewBinding value = this.U.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (amc.b) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.TRUE;
    }
}
