package com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.category_budget;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.impl.budgeting.R$id;
import com.revolut.retail.feature.impl.budgeting.R$layout;
import efm.r;
import ihm.f;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qp5.x;
import r1a.a;
import rgf.b;
import rpi.d;
import rrd.l;
import rrj.e;
import rrj.g;
import rrj.i;
import rrj.j;
import rrj.p;
import rrj.t;
import rrj.u;
import te0.w;
import tx0.t3;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/goals/category_budget/CategoryBudgetScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lrrj/j;", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/goals/category_budget/CategoryBudgetContract$InputData;", "Laii/q;", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CategoryBudgetScreen extends BaseRecyclerViewScreen<j, CategoryBudgetContract$InputData, q> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f101521e0 = {o0.f186429a.j(new h0(CategoryBudgetScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/impl/budgeting/databinding/ScreenCategoryBudgetBinding;", 0))};
    public final int U;
    public final int V;
    public final boolean W;
    public final h X;
    public final FullScreenStateDelegate Y;
    public final RowDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final SwipeToActionDelegate f101522a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f101523b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f101524d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryBudgetScreen(CategoryBudgetContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_category_budget;
        this.V = R$id.screenCategoryBudget_recyclerView;
        this.W = true;
        this.X = s.t(this, p.f);
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.Y = fullScreenStateDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Z = rowDelegate;
        SwipeToActionDelegate swipeToActionDelegate = new SwipeToActionDelegate(rowDelegate, false);
        this.f101522a0 = swipeToActionDelegate;
        this.f101523b0 = w.y0(new b(this, inputData, 20));
        this.c0 = w.y0(new a(this, 26));
        this.f101524d0 = v.k(fullScreenStateDelegate, new RowLoadingDelegate(), new ListSubheaderDelegate(), rowDelegate, swipeToActionDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (erj.j) this.f101523b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (e) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        f fVar = h3().f108391b.f59410q;
        l lVar = new l(this, 1);
        r rVarOnErrorResumeNext = fVar.onErrorResumeNext(new onh.b(new x(new BreadcrumbException(), 20), (byte) 0));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext.subscribe(new n1i.b(13, lVar), new n1i.b(13, rrj.r.f256878a)), "subscribe(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f108391b.s0()), null, new rrj.s(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new r7b.e(rd0.e.b(this.Y.f52371h.f121375b), 12), null, new t(this, null), 3);
        r rVarMerge = r.merge(this.Z.f53218h, this.f101522a0.f.map(new d(new rpi.e(21), 19)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge), null, new u(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF101524d0() {
        return this.f101524d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        i iVar = uiState.f256861b;
        if (!(iVar instanceof g)) {
            if (!(iVar instanceof rrj.h)) {
                if (!(iVar instanceof rrj.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                h3().f108391b.setVisible(false);
                return;
            } else {
                NavBarWithToolbar screenCategoryBudgetNavBarWithToolbar = h3().f108391b;
                Intrinsics.checkNotNullExpressionValue(screenCategoryBudgetNavBarWithToolbar, "screenCategoryBudgetNavBarWithToolbar");
                t3 t3Var = t3.PROFILE;
                NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
                screenCategoryBudgetNavBarWithToolbar.I0(t3Var, false);
                return;
            }
        }
        NavBarWithToolbar navBarWithToolbar = h3().f108391b;
        navBarWithToolbar.l0();
        g gVar = (g) iVar;
        MoneyClause moneyClause = gVar.f256856a;
        navBarWithToolbar.setTitle(moneyClause, null);
        navBarWithToolbar.setToolbarTitle(moneyClause);
        navBarWithToolbar.setSecondDescriptionText(gVar.f256857b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setEndIconImage(gVar.f256858c);
        navBarWithToolbar.setActions(gVar.d);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    public final crj.a h3() {
        ViewBinding value = this.X.getValue(this, f101521e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (crj.a) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
