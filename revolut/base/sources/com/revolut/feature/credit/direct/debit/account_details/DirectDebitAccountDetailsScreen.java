package com.revolut.feature.credit.direct.debit.account_details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import dw3.f2;
import java.util.List;
import jii.m;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import pgk.f;
import py4.b;
import py4.d;
import rd0.e;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/direct/debit/account_details/DirectDebitAccountDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lpy4/d;", "Lcom/revolut/feature/credit/direct/debit/account_details/DirectDebitAccountDetailsScreenContract$InputData;", "Laii/q;", "Lno/k;", "feature_credit_direct_debit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DirectDebitAccountDetailsScreen extends BaseRecyclerViewScreen<d, DirectDebitAccountDetailsScreenContract$InputData, q> implements k {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(DirectDebitAccountDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public AnalyticsContext U;
    public final int V;
    public final boolean W;
    public final Object X;
    public final Object Y;
    public final CellDetailsAccountDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f69871a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final h f69872b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectDebitAccountDetailsScreen(DirectDebitAccountDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = inputData.f69874b;
        this.V = R$layout.screen_recycler_navbar;
        this.W = true;
        this.X = w.y0(new pt4.d(this, inputData, 10));
        this.Y = w.y0(new f(this, 28));
        CellDetailsAccountDelegate cellDetailsAccountDelegate = new CellDetailsAccountDelegate();
        this.Z = cellDetailsAccountDelegate;
        this.f69871a0 = u.c(cellDetailsAccountDelegate);
        this.f69872b0 = s.t(this, b.f);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.U = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getU() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (f2) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (py4.f) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        CellDetailsAccountDelegate cellDetailsAccountDelegate = this.Z;
        Continuation continuation = null;
        a.g2(this, vkm.q.J(e.b(cellDetailsAccountDelegate.e), e.b(cellDetailsAccountDelegate.d)), null, new pqc.k(this, continuation, 22), 3);
        ViewBinding value = this.f69872b0.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        a.g2(this, e.b(((m) value).f174539b.f59410q), null, new pnb.b(this, continuation, 20), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF69871a0() {
        return this.f69871a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(d uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        ViewBinding value = this.f69872b0.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        Clause clause = uiState.f240661a;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
        Clause clause2 = uiState.f240662b;
        navBarWithToolbar.setDescriptionText(clause2);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(uiState.f240663c));
        navBarWithToolbar.setEndIconImage(uiState.d);
        navBarWithToolbar.setDescriptionVisible(clause2 != null);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
