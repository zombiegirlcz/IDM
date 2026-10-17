package com.revolut.feature.apm.bills.pagopa.impl.ui.bill_input;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.pagopa.api.R$string;
import com.revolut.feature.apm.bills.pagopa.impl.R$id;
import com.revolut.feature.apm.bills.pagopa.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import h30.l;
import java.util.List;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import te0.w;
import tq1.f;
import vc.s;
import w83.a;
import wq1.b;
import wq1.c;
import wq1.d;
import wq1.j;
import wq1.m;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/pagopa/impl/ui/bill_input/PagoPABillInputScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lwq1/m;", "Lcom/revolut/feature/apm/bills/pagopa/impl/ui/bill_input/PagoPABillInputScreenContract$InputData;", "Lwq1/j;", "feature_apm_bills_pagopa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PagoPABillInputScreen extends BaseRecyclerViewScreen<m, PagoPABillInputScreenContract$InputData, j> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f61486d0 = {o0.f186429a.j(new h0(PagoPABillInputScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/bills/pagopa/impl/databinding/ScreenPagoPaBillInputBinding;", 0))};
    public final int U;
    public final int V;
    public final boolean W;
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f61487a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f61488b0;
    public final List c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagoPABillInputScreen(PagoPABillInputScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_pago_pa_bill_input;
        this.V = R$id.pagoPaBillInput_recyclerView;
        this.W = true;
        this.X = s.t(this, b.f);
        this.Y = w.y0(new a(this, inputData, 24));
        this.Z = w.y0(new wp0.b(this, 3));
        Lazy lazyY0 = w.y0(new wq1.a(0));
        this.f61487a0 = lazyY0;
        this.f61488b0 = w.y0(new wq1.a(1));
        this.c0 = u.c((InputTextDelegate) lazyY0.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (f) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f256451b.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f256451b.o.f57403b), null, new wka.e(this, continuation, 14), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f256452c.o), null, new c(this, continuation, 1), 3);
        ?? r56 = this.f61487a0;
        com.revolut.kompot.navigable.a.g2(this, e.b(((InputTextDelegate) r56.getValue()).e.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, l.y(((InputTextDelegate) r56.getValue()).f52575g.f121375b, ((InputTextDelegate) r56.getValue()).i.f121375b, "merge(...)"), null, new wq1.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((SingleChoiceDelegate) this.f61488b0.getValue()).p()), null, new wq1.f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f256451b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.pago_pa_main_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.pago_pa_main_title, null, null, 14));
        h3().f256452c.setText(new TextLocalisedClause(R$string.pago_pa_bill_input_next_button, null, null, 14));
        ((j60.a) ((f) this.Y.getValue()).f273492c.get()).d(u.c((SingleChoiceDelegate) this.f61488b0.getValue()));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF92210a0() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(m uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        h3().f256451b.setMenuItems(uiState.f299395c);
        h3().f256452c.setEnabled(uiState.f299394b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    public final rq1.b h3() {
        ViewBinding value = this.X.getValue(this, f61486d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rq1.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final wq1.l T2() {
        return (wq1.l) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
