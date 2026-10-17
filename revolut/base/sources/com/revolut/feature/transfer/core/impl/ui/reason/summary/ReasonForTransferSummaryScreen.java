package com.revolut.feature.transfer.core.impl.ui.reason.summary;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.transfer.core.impl.R$id;
import com.revolut.feature.transfer.core.impl.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.payments.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import h30.l;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kpf.d;
import lpf.e;
import ofm.q;
import q97.p1;
import qqf.b;
import qqf.c;
import qqf.k;
import qqf.m;
import qqf.n;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/impl/ui/reason/summary/ReasonForTransferSummaryScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lqqf/m;", "Lcom/revolut/feature/transfer/core/impl/ui/reason/summary/ReasonForTransferSummaryScreenContract$InputData;", "Lqqf/k;", "feature_transfer_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReasonForTransferSummaryScreen extends BaseRecyclerViewScreen<m, ReasonForTransferSummaryScreenContract$InputData, k> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f92212b0 = {o0.f186429a.j(new h0(ReasonForTransferSummaryScreen.class, "binding", "getBinding()Lcom/revolut/feature/transfer/core/impl/databinding/ScreenTransferReasonBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final InputTextDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f92213a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReasonForTransferSummaryScreen(ReasonForTransferSummaryScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_transfer_reason;
        this.V = R$id.transferScreenReason_recyclerView;
        this.W = s.t(this, b.f);
        this.X = w.y0(new qba.b(this, inputData, 24));
        this.Y = w.y0(new p1(this, 18));
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.Z = inputTextDelegate;
        this.f92213a0 = v.k(inputTextDelegate, new RowDelegate(null, null, 7));
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        if (!((ReasonForTransferSummaryScreenContract$InputData) this.G).d) {
            return false;
        }
        ((n) T2()).v2(qqf.h.f248539a);
        return true;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        m uiState = (m) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        d dVarG3 = g3();
        dVarG3.f188236b.setDescriptionText(uiState.f248544b);
        dVarG3.f188237c.setEnabled(uiState.f248545c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (e) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        a.g2(this, rd0.e.b(g3().f188236b.f59410q), null, new c(this, null, 0), 3);
        a.g2(this, rd0.e.b(g3().f188237c.o), null, new c(this, null, 1), 3);
        InputTextDelegate inputTextDelegate = this.Z;
        a.g2(this, l.y(inputTextDelegate.f52575g.f121375b, inputTextDelegate.i.f121375b, "merge(...)"), null, new qqf.d(this, null), 3);
        a.g2(this, rd0.e.b(inputTextDelegate.e.f121375b), null, new qqf.e(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        d dVarG3 = g3();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_core_reason_for_transfer_title, null, null, 14);
        dVarG3.f188236b.setToolbarTitle(textLocalisedClause);
        NavBarWithToolbar transferScreenReasonNavigationBar = dVarG3.f188236b;
        Intrinsics.checkNotNullExpressionValue(transferScreenReasonNavigationBar, "transferScreenReasonNavigationBar");
        transferScreenReasonNavigationBar.setTitle(textLocalisedClause, null);
        transferScreenReasonNavigationBar.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
        LargeActionButton largeActionButton = dVarG3.f188237c;
        l.A(R.string.common_action_continue, null, null, 14, largeActionButton);
        largeActionButton.setLoadingButtonTag("SELECT_REASON_BUTTON_TAG");
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(jki.n nVar, o oVar) {
        m uiState = (m) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        d dVarG3 = g3();
        dVarG3.f188236b.setDescriptionText(uiState.f248544b);
        dVarG3.f188237c.setEnabled(uiState.f248545c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF92213a0() {
        return this.f92213a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final d g3() {
        ViewBinding value = this.W.getValue(this, f92212b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final qqf.l T2() {
        return (qqf.l) this.Y.getValue();
    }
}
