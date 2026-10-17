package com.revolut.trading.orders.ui.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.trading_orders.api.ui.details.InvestOrderDetailsContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import jii.m;
import jij.d;
import jsl.f0;
import jsl.g0;
import jsl.i;
import jsl.i0;
import jsl.j0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import tx0.s3;
import tx0.t3;
import vc.s;
import yy0.l;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/trading/orders/ui/details/InvestOrderDetailsScreen;", "Lcom/revolut/trading/orders/ui/details/BaseInvestOrderDetailsScreen;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvestOrderDetailsScreen extends BaseInvestOrderDetailsScreen {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f106815h0 = {o0.f186429a.j(new h0(InvestOrderDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int f0;
    public final h g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestOrderDetailsScreen(InvestOrderDetailsContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f0 = R$layout.screen_recycler_navbar;
        this.g0 = s.t(this, jsl.h.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j0 uiState = (j0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.g0.getValue(this, f106815h0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        i0 i0Var = uiState.f178216a;
        if (i0Var.equals(jsl.h0.f178214a)) {
            navBarWithToolbar.l0();
            navBarWithToolbar.setSecondDescriptionVisible(false);
            return;
        }
        if (i0Var.equals(g0.f178213a)) {
            navBarWithToolbar.setSecondDescriptionVisible(false);
            navBarWithToolbar.I0(t3.PROFILE, false);
            return;
        }
        if (!(i0Var instanceof f0)) {
            throw new NoWhenBranchMatchedException();
        }
        navBarWithToolbar.l0();
        f0 f0Var = (f0) i0Var;
        Clause clause = f0Var.f178211c;
        Clause clause2 = f0Var.f178209a;
        navBarWithToolbar.setTitle(clause2, null);
        navBarWithToolbar.setToolbarTitle(clause2);
        navBarWithToolbar.setDescriptionText(f0Var.f178210b);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        navBarWithToolbar.setSecondDescriptionText(clause);
        s3 s3Var = f0Var.d;
        if (s3Var != null) {
            navBarWithToolbar.setEndImage(s3Var);
        } else {
            navBarWithToolbar.setEndImage((l) null);
        }
        navBarWithToolbar.setFilters(f0Var.f);
    }

    @Override // com.revolut.trading.orders.ui.details.BaseInvestOrderDetailsScreen, com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.Y2(view);
        ViewBinding value = this.g0.getValue(this, f106815h0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setDescriptionVisible(true);
    }

    @Override // com.revolut.trading.orders.ui.details.BaseInvestOrderDetailsScreen, com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.b3(view);
        ViewBinding value = this.g0.getValue(this, f106815h0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        ViewController.P2(this, e.b(navBarWithToolbar.f59410q), new i(this, null, 0), 3);
        ViewController.P2(this, e.b(navBarWithToolbar.r0()), new i(this, null, 1), 3);
        ViewController.P2(this, new d(e.b(navBarWithToolbar.s0()), 13), new jij.h(this, (Continuation) null, 23), 3);
    }

    @Override // com.revolut.trading.orders.ui.details.BaseInvestOrderDetailsScreen
    public final int e3() {
        ViewBinding value = this.g0.getValue(this, f106815h0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ScreenContentRecyclerView recyclerView = ((m) value).f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        return recyclerView.getId();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF0() {
        return this.f0;
    }
}
