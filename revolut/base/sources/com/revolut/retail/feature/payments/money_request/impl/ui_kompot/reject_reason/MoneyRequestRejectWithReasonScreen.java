package com.revolut.retail.feature.payments.money_request.impl.ui_kompot.reject_reason;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import buf.u;
import bvb.a;
import c0d.e;
import c7k.c;
import c7k.f;
import c7k.g;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.payments.money_request.impl.R$id;
import com.revolut.retail.feature.payments.money_request.impl.R$layout;
import h30.l;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import sji.b;
import t6k.d;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/money_request/impl/ui_kompot/reject_reason/MoneyRequestRejectWithReasonScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lc7k/c;", "Lcom/revolut/retail/feature/payments/money_request/impl/ui_kompot/reject_reason/MoneyRequestRejectWithReasonContract$InputData;", "Laii/q;", "feature_payments_money_request_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MoneyRequestRejectWithReasonScreen extends BaseRecyclerViewScreen<c, MoneyRequestRejectWithReasonContract$InputData, q> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(MoneyRequestRejectWithReasonScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/payments/money_request/impl/databinding/ScreenMoneyRequestRejectBinding;", 0))};
    public final boolean U;
    public final int V;
    public final int W;
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f102161a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f102162b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneyRequestRejectWithReasonScreen(MoneyRequestRejectWithReasonContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = true;
        this.V = R$layout.screen_money_request_reject;
        this.W = R$id.mrReject_recyclerView;
        this.X = s.t(this, f.f);
        this.Y = w.y0(new u(this, inputData, 22));
        this.Z = w.y0(new a(this, 9));
        this.f102161a0 = w.y0(new e(22));
        this.f102162b0 = w.y0(new e(23));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (d) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (c7k.b) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, l.y(h3().f212837b.f59410q, h3().f212837b.f59409p.f57336l, "merge(...)"), null, new g(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f212838c.o), null, new g(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.f102161a0.getValue()).e.f121375b), null, new c7k.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ActionsDelegate) this.f102162b0.getValue()).f51611c.f121375b), null, new c1i.f(this, continuation, 18), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f212837b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF92555b0() {
        return v.k((InputTextDelegate) this.f102161a0.getValue(), (ActionsDelegate) this.f102162b0.getValue());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(c uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f212837b;
        TextLocalisedClause textLocalisedClause = uiState.f22049b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        MoneyClause moneyClause = uiState.e;
        navBarWithToolbar.setDescriptionText(moneyClause);
        navBarWithToolbar.setDescriptionVisible(true);
        NavBarWithToolbar.setToolbar$default(navBarWithToolbar, textLocalisedClause, moneyClause, null, 4, null);
        LargeActionButton largeActionButton = h3().f212838c;
        largeActionButton.setText(uiState.f22050c);
        largeActionButton.setEnabled(uiState.d);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final n6k.c h3() {
        ViewBinding value = this.X.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (n6k.c) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.U);
    }
}
