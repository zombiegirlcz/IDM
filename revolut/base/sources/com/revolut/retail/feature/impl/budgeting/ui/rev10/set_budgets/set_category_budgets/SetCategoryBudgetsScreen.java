package com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_category_budgets;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cbf.c;
import cf6.a;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.SlidingFromTopViewContainer;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.impl.budgeting.R$id;
import com.revolut.retail.feature.impl.budgeting.R$layout;
import com.revolut.retail.feature.impl.budgeting.R$string;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_category_budgets.SetCategoryBudgetsScreen;
import cpi.b;
import csj.d;
import csj.f;
import csj.m;
import csj.n;
import csj.o;
import erj.l;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import te0.w;
import tx0.j4;
import vc.s;
import vkm.j2;
import vkm.q;
import vkm.t0;
import z4l.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/set_category_budgets/SetCategoryBudgetsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lcsj/o;", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/set_budgets/set_category_budgets/SetCategoryBudgetsScreenContract$InputData;", "Lcsj/m;", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SetCategoryBudgetsScreen extends BaseRecyclerViewScreen<o, SetCategoryBudgetsScreenContract$InputData, m> {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f101550h0 = {o0.f186429a.j(new h0(SetCategoryBudgetsScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/impl/budgeting/databinding/ScreenSetCategoryBudgetsBinding;", 0))};
    public final int U;
    public final int V;
    public final boolean W;
    public final Integer X;
    public final FullScreenStateDelegate Y;
    public final TwinHorizontalButtonDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f101551a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final j2 f101552b0;
    public final List c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f101553d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f101554e0;
    public final Object f0;
    public final h g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetCategoryBudgetsScreen(SetCategoryBudgetsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_set_category_budgets;
        this.V = R$id.setCategoryBudgets_recyclerView;
        final int i = 1;
        this.W = true;
        this.X = inputData.f ? Integer.valueOf(R$style.UiKitTheme_Transparent) : null;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.Y = fullScreenStateDelegate;
        this.Z = new TwinHorizontalButtonDelegate();
        final int i2 = 0;
        Lazy lazyY0 = w.y0(new Function0(this) { // from class: csj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SetCategoryBudgetsScreen f108476b;

            {
                this.f108476b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                SetCategoryBudgetsScreen setCategoryBudgetsScreen = this.f108476b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = SetCategoryBudgetsScreen.f101550h0;
                        return new RowDelegate(new cnc.t(setCategoryBudgetsScreen, 13), null, 6);
                    default:
                        KProperty[] kPropertyArr2 = SetCategoryBudgetsScreen.f101550h0;
                        return (n) ((erj.l) setCategoryBudgetsScreen.f101553d0.getValue()).f128720g.get();
                }
            }
        });
        this.f101551a0 = lazyY0;
        this.f101552b0 = q.c(null);
        this.c0 = v.k(fullScreenStateDelegate, (RowDelegate) lazyY0.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new VaultsProgressDelegate(), new VaultsProgressLoadingDelegate());
        this.f101553d0 = w.y0(new a(this, inputData, 24));
        this.f101554e0 = w.y0(new Function0(this) { // from class: csj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SetCategoryBudgetsScreen f108476b;

            {
                this.f108476b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                SetCategoryBudgetsScreen setCategoryBudgetsScreen = this.f108476b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = SetCategoryBudgetsScreen.f101550h0;
                        return new RowDelegate(new cnc.t(setCategoryBudgetsScreen, 13), null, 6);
                    default:
                        KProperty[] kPropertyArr2 = SetCategoryBudgetsScreen.f101550h0;
                        return (n) ((erj.l) setCategoryBudgetsScreen.f101553d0.getValue()).f128720g.get();
                }
            }
        });
        this.f0 = w.y0(new b(9));
        this.g0 = s.t(this, csj.b.f);
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getJ0() {
        return this.X;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (l) this.f101553d0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f108394c.f59410q), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f108394c.o.f57403b), null, new csj.e(this, continuation, 0), 3);
        int i = 1;
        com.revolut.kompot.navigable.a.g2(this, new t0(this.f101552b0, 1), null, new csj.e(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f.o), null, new d(this, continuation, i), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.Z;
        com.revolut.kompot.navigable.a.g2(this, e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new d(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(twinHorizontalButtonDelegate.d.f121375b), null, new d(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, new c(e.b(this.Y.f52371h.f121375b), 17), null, new f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((j60.a) ((l) this.f101553d0.getValue()).e.get()).d(u.c(this.Z));
        h().setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
        NavBarWithToolbar navBarWithToolbar = h3().f108394c;
        if (((SetCategoryBudgetsScreenContract$InputData) this.G).d) {
            navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.analytics_budget_category_screen_title, null, null, 14), null);
            navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.analytics_budget_category_screen_title, null, null, 14));
        } else {
            navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.analytics_categories_budget_header_title, null, null, 14), null);
            navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.analytics_categories_budget_header_title, null, null, 14));
            navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.analytics_categories_budget_header_subtitle, null, null, 14));
            navBarWithToolbar.setSecondDescriptionVisible(true);
        }
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        h3().f.setText(new TextLocalisedClause(com.revolut.uicomponent.R$string.common_action_done, null, null, 14));
        h3().f108393b.setAdapter((j) this.f0.getValue());
        RecyclerView recyclerView = h3().f108393b;
        Context context = h3().d.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setLayoutManager(a3(context));
        SlidingFromTopViewContainer setCategoryBudgetsSlidingContainer = h3().e;
        Intrinsics.checkNotNullExpressionValue(setCategoryBudgetsSlidingContainer, "setCategoryBudgetsSlidingContainer");
        NavBarWithToolbar setCategoryBudgetsNavBarWithToolbar = h3().f108394c;
        Intrinsics.checkNotNullExpressionValue(setCategoryBudgetsNavBarWithToolbar, "setCategoryBudgetsNavBarWithToolbar");
        setCategoryBudgetsSlidingContainer.b(setCategoryBudgetsNavBarWithToolbar, h(), j4.DEFAULT, true);
        SlidingFromTopViewContainer setCategoryBudgetsSlidingContainer2 = h3().e;
        Intrinsics.checkNotNullExpressionValue(setCategoryBudgetsSlidingContainer2, "setCategoryBudgetsSlidingContainer");
        ViewGroup.LayoutParams layoutParams = setCategoryBudgetsSlidingContainer2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = h3().f108394c.getMinBarHeight();
        setCategoryBudgetsSlidingContainer2.setLayoutParams(marginLayoutParams);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF103587e0() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(o uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        ((j) this.f0.getValue()).c(uiState.f108491b);
        h3().f.setVisibility(uiState.d ? 0 : 8);
        h3().f.setEnabled(uiState.e);
        h3().f108394c.setMenuItems(uiState.f108492c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.U;
    }

    public final crj.b h3() {
        ViewBinding value = this.g0.getValue(this, f101550h0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (crj.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final n T2() {
        return (n) this.f101554e0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
