package com.revolut.feature.credit.direct.debit.account_details_v2;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.m;
import jki.o;
import jm4.p4;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import q9c.v;
import rtl.y;
import rwg.e0;
import rxe.b;
import ry4.e;
import ry4.f;
import te0.w;
import vc.s;
import vkm.d;
import vkm.q;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/direct/debit/account_details_v2/DirectDebitAccountDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lry4/f;", "Lcom/revolut/feature/credit/direct/debit/account_details_v2/DirectDebitAccountDetailsScreenContract$InputData;", "Lry4/e;", "Lno/k;", "feature_credit_direct_debit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DirectDebitAccountDetailsScreen extends BaseRecyclerViewScreen<f, DirectDebitAccountDetailsScreenContract$InputData, e> implements k {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(DirectDebitAccountDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public AnalyticsContext U;
    public final int V;
    public final boolean W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f69875a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final h f69876b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectDebitAccountDetailsScreen(DirectDebitAccountDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = inputData.d;
        this.V = R$layout.screen_recycler_navbar;
        this.W = true;
        this.X = w.y0(new b(this, inputData, 2));
        this.Y = w.y0(new y(this, 5));
        Lazy lazyY0 = w.y0(new e0(6));
        this.Z = lazyY0;
        this.f69875a0 = u.c((CellDetailsDelegate) lazyY0.getValue());
        this.f69876b0 = s.t(this, ry4.a.f);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.U = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (p4) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (ry4.h) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        d dVarB = rd0.e.b(((CellDetailsDelegate) this.Z.getValue()).f);
        ViewBinding value = this.f69876b0.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, new ay4.f(q.J(dVarB, new r7b.e(rd0.e.b(((m) value).f174539b.f59410q), 25)), yx4.b.Companion, 29), null, new v(2, (ry4.h) this.Y.getValue(), ry4.h.class, "onItemClick", "onItemClick(Lcom/revolut/feature/credit/core/ui/ClickWrapper;)V", 4, 27), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF78908e0() {
        return this.f69875a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(f uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        ViewBinding value = this.f69876b0.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        Clause clause = uiState.f258217a;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
        Clause clause2 = uiState.f258218b;
        navBarWithToolbar.setDescriptionText(clause2);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(uiState.f258219c));
        navBarWithToolbar.setEndIconImage(uiState.d);
        navBarWithToolbar.setDescriptionVisible(clause2 != null);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
