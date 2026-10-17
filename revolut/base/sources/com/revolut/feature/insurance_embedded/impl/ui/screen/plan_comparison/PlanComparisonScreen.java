package com.revolut.feature.insurance_embedded.impl.ui.screen.plan_comparison;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import ao.h;
import aw7.b;
import aw7.c;
import aw7.i;
import aw7.k;
import aw7.l;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_embedded.impl.R$layout;
import com.revolut.feature.insurance_embedded.impl.ui.screen.plan_comparison.PlanComparisonScreen;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseScreen;
import iu7.d;
import java.util.List;
import jki.m;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lu7.v;
import rd0.e;
import te0.w;
import tx0.j0;
import vc.s;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/screen/plan_comparison/PlanComparisonScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Law7/k;", "Lcom/revolut/feature/insurance_embedded/impl/ui/screen/plan_comparison/PlanComparisonScreenContract$InputData;", "Law7/i;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanComparisonScreen extends BaseScreen<k, PlanComparisonScreenContract$InputData, i> {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(PlanComparisonScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_embedded/impl/databinding/ScreenEmbeddedInsurancePlanComparisonBinding;", 0))};
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final FullScreenStateDelegate Q;
    public final Object R;
    public final c S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanComparisonScreen(PlanComparisonScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.M = R$layout.screen_embedded_insurance_plan_comparison;
        this.N = s.t(this, b.f);
        this.O = w.y0(new at4.b(this, inputData, 12));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: aw7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanComparisonScreen f10734b;

            {
                this.f10734b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanComparisonScreen planComparisonScreen = this.f10734b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanComparisonScreen.T;
                        return (l) ((v) planComparisonScreen.O.getValue()).f200183c.get();
                    default:
                        KProperty[] kPropertyArr2 = PlanComparisonScreen.T;
                        return new z4l.j(7, u.c(new ContainerDelegate(zhm.v.k(new CellDetailsDelegate(), new ProductSelectionDelegate(), new ListSubheaderLoadingDelegate(), new CellDetailsLoadingDelegate(), new ProductSelectionLoadingDelegate(), planComparisonScreen.Q), null, 6)), false);
                }
            }
        });
        this.Q = new FullScreenStateDelegate();
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: aw7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanComparisonScreen f10734b;

            {
                this.f10734b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanComparisonScreen planComparisonScreen = this.f10734b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanComparisonScreen.T;
                        return (l) ((v) planComparisonScreen.O.getValue()).f200183c.get();
                    default:
                        KProperty[] kPropertyArr2 = PlanComparisonScreen.T;
                        return new z4l.j(7, u.c(new ContainerDelegate(zhm.v.k(new CellDetailsDelegate(), new ProductSelectionDelegate(), new ListSubheaderLoadingDelegate(), new CellDetailsLoadingDelegate(), new ProductSelectionLoadingDelegate(), planComparisonScreen.Q), null, 6)), false);
                }
            }
        });
        this.S = new c(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        k uiState = (k) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        j jVar = (j) this.R.getValue();
        List list = uiState.f10744a;
        PlanComparisonScreenContract$UIState$Page planComparisonScreenContract$UIState$Page = uiState.d;
        Clause clause = uiState.f;
        jVar.c(list);
        Tabs tabs = Z2().d;
        List list2 = uiState.e;
        tabs.setVisibility(!list2.isEmpty() ? 0 : 8);
        Tabs.setItems$default(tabs, list2, null, 2, null);
        NavBarWithToolbar navBarWithToolbar = Z2().f168535c;
        navBarWithToolbar.setTitle(uiState.f10745b, null);
        navBarWithToolbar.setDescriptionText(uiState.f10746c);
        navBarWithToolbar.setDescriptionVisible(true);
        LargeActionButton largeActionButton = Z2().f168534b;
        largeActionButton.setVisibility(clause != null ? 0 : 8);
        largeActionButton.setText(clause);
        if (oVar == null || !(oVar instanceof aw7.j)) {
            d dVarZ2 = Z2();
            if (planComparisonScreenContract$UIState$Page == null) {
                return;
            }
            dVarZ2.e.setCurrentItem(planComparisonScreenContract$UIState$Page.f76143b);
            Tabs screenEmbeddedInsurancePlanComparisonTabsView = dVarZ2.d;
            Intrinsics.checkNotNullExpressionValue(screenEmbeddedInsurancePlanComparisonTabsView, "screenEmbeddedInsurancePlanComparisonTabsView");
            Tabs.u(screenEmbeddedInsurancePlanComparisonTabsView, planComparisonScreenContract$UIState$Page.f76142a, false, false, false, 14);
            return;
        }
        if (((aw7.j) oVar).f10743a) {
            d dVarZ22 = Z2();
            if (planComparisonScreenContract$UIState$Page == null) {
                return;
            }
            dVarZ22.e.setCurrentItem(planComparisonScreenContract$UIState$Page.f76143b);
            Tabs screenEmbeddedInsurancePlanComparisonTabsView2 = dVarZ22.d;
            Intrinsics.checkNotNullExpressionValue(screenEmbeddedInsurancePlanComparisonTabsView2, "screenEmbeddedInsurancePlanComparisonTabsView");
            Tabs.u(screenEmbeddedInsurancePlanComparisonTabsView2, planComparisonScreenContract$UIState$Page.f76142a, false, false, false, 14);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (v) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (l) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        a.g2(this, e.b(Z2().f168535c.f59410q), null, new aw7.d(this, continuation, 0), 3);
        a.g2(this, e.b(Z2().f168534b.o), null, new aw7.d(this, continuation, 1), 3);
        a.g2(this, e.b(this.Q.f52371h.f121375b), null, new aw7.e(this, null), 3);
        a.g2(this, e.b(Z2().d.f58882b), null, new avk.i(this, continuation, 3), 3);
        Z2().e.registerOnPageChangeCallback(this.S);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = Z2().f168535c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        ViewPager2 viewPager2 = Z2().e;
        viewPager2.setAdapter((j) this.R.getValue());
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void Y2() {
        Z2().e.unregisterOnPageChangeCallback(this.S);
    }

    public final d Z2() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }
}
