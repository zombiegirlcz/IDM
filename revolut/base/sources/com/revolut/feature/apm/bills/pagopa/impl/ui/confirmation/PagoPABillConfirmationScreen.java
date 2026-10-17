package com.revolut.feature.apm.bills.pagopa.impl.ui.confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.pagopa.api.R$string;
import com.revolut.feature.apm.bills.pagopa.impl.R$id;
import com.revolut.feature.apm.bills.pagopa.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.m;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import yff.b;
import yq0.e;
import yq1.a;
import yq1.d;
import yq1.g;
import yq1.i;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/pagopa/impl/ui/confirmation/PagoPABillConfirmationScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lyq1/g;", "Lcom/revolut/feature/apm/bills/pagopa/impl/ui/confirmation/PagoPABillConfirmationScreenContract$InputData;", "Lyq1/d;", "feature_apm_bills_pagopa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PagoPABillConfirmationScreen extends BaseRecyclerViewScreen<g, PagoPABillConfirmationScreenContract$InputData, d> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f61490b0 = {o0.f186429a.j(new h0(PagoPABillConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/bills/pagopa/impl/databinding/ScreenPagoPaBillConfirmationBinding;", 0))};
    public final int U;
    public final int V;
    public final boolean W;
    public final h X;
    public final List Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f61491a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagoPABillConfirmationScreen(PagoPABillConfirmationScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_pago_pa_bill_confirmation;
        this.V = R$id.pagoPaBillConfirmation_recyclerView;
        this.W = true;
        this.X = s.t(this, a.f);
        this.Y = v.k(new CounterTextDelegate(), new CellDetailsNoteDelegate(), new CellDetailsDelegate());
        this.Z = w.y0(new b(this, inputData, 16));
        this.f61491a0 = w.y0(new e(this, 1));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        g uiState = (g) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f256449c.setText(uiState.f315972b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (tq1.e) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (i) this.f61491a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f256448b.f59410q), null, new yq1.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f256449c.o), null, new yq1.b(this, continuation, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f256448b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.pagopa_bill_header, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.pagopa_bill_header, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        g uiState = (g) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f256449c.setText(uiState.f315972b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF78908e0() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getZ() {
        return this.V;
    }

    public final rq1.a g3() {
        ViewBinding value = this.X.getValue(this, f61490b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rq1.a) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
