package com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_overall_budget;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.impl.budgeting.R$id;
import com.revolut.retail.feature.impl.budgeting.R$layout;
import crj.c;
import erj.m;
import es.e;
import esj.b;
import esj.g;
import esj.i;
import esj.j;
import esj.k;
import esj.l;
import esj.n;
import esj.u;
import esj.x;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/set_overall_budget/SetOverallBudgetScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lesj/x;", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/set_overall_budget/SetOverallBudgetScreenContract$InputData;", "Lesj/u;", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SetOverallBudgetScreen extends BaseRecyclerViewScreen<x, SetOverallBudgetScreenContract$InputData, u> {
    public static final /* synthetic */ KProperty[] g0 = {o0.f186429a.j(new h0(SetOverallBudgetScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/impl/budgeting/databinding/ScreenSetOverallBudgetBinding;", 0))};
    public final int U;
    public final int V;
    public final Integer W;
    public final h X;
    public final FullScreenStateDelegate Y;
    public final CellDetailsActionDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final TwinHorizontalButtonDelegate f101558a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final LargeActionButtonDelegate f101559b0;
    public final CenteredAmountDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f101560d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f101561e0;
    public final Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetOverallBudgetScreen(SetOverallBudgetScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_set_overall_budget;
        this.V = R$id.setOverallBudgetScreen_recyclerView;
        this.W = inputData.f101564c ? Integer.valueOf(R$style.UiKitTheme_Transparent) : null;
        this.X = s.t(this, b.f);
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.Y = fullScreenStateDelegate;
        CellDetailsActionDelegate cellDetailsActionDelegate = new CellDetailsActionDelegate();
        this.Z = cellDetailsActionDelegate;
        this.f101558a0 = new TwinHorizontalButtonDelegate();
        this.f101559b0 = new LargeActionButtonDelegate();
        CenteredAmountDelegate centeredAmountDelegate = new CenteredAmountDelegate(new eh3.s(this, 27));
        this.c0 = centeredAmountDelegate;
        this.f101560d0 = v.k(fullScreenStateDelegate, cellDetailsActionDelegate, centeredAmountDelegate, new RowLoadingDelegate(), new CellDetailsLoadingDelegate());
        this.f101561e0 = w.y0(new eq8.b(this, inputData, 7));
        this.f0 = w.y0(new e(this, 1));
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getW() {
        return this.W;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (m) this.f101561e0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        a.g2(this, rd0.e.b(h3().f108397c.f59211b), null, new k(view, this, continuation, 0), 3);
        int i = 1;
        a.g2(this, rd0.e.b(h3().f108397c.f59210a.f57403b), null, new g(this, continuation, i), 3);
        a.g2(this, rd0.e.b(h3().f108396b.o), null, new k(view, this, continuation, i), 3);
        a.g2(this, new eq8.g(rd0.e.b(this.Y.f52371h.f121375b), 5), null, new l(this, null), 3);
        CellDetailsActionDelegate cellDetailsActionDelegate = this.Z;
        a.g2(this, new eq8.g(rd0.e.b(cellDetailsActionDelegate.d), 6), null, new esj.m(this, null), 3);
        a.g2(this, new eq8.g(rd0.e.b(cellDetailsActionDelegate.d), 7), null, new n(this, null), 3);
        CenteredAmountDelegate centeredAmountDelegate = this.c0;
        a.g2(this, rd0.e.b(centeredAmountDelegate.d.f121375b), null, new g(this, continuation, 0), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.f101558a0;
        a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new esj.h(this, continuation, 0), 3);
        a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), null, new esj.h(this, continuation, 1), 3);
        a.g2(this, rd0.e.b(this.f101559b0.d.f121375b), null, new i(this, null), 3);
        a.g2(this, rd0.e.b(centeredAmountDelegate.f.f121375b), null, new j(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f108397c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        h3().f108396b.setText(new TextLocalisedClause(R$string.common_action_confirm, null, null, 14));
        ((j60.a) ((m) this.f101561e0.getValue()).e.get()).d(v.k(this.f101558a0, this.f101559b0));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF0() {
        return this.f101560d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(x uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        h3().f108396b.setEnabled(uiState.f128990c);
        h3().f108396b.setText(uiState.e);
        h3().f108396b.setVisibility(uiState.d ? 0 : 8);
        h3().f108397c.setMenuItems(uiState.f128989b);
        h3().f108397c.setTitle(uiState.f);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.U;
    }

    public final c h3() {
        ViewBinding value = this.X.getValue(this, g0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final esj.v T2() {
        return (esj.v) this.f0.getValue();
    }
}
