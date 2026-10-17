package com.revolut.feature.transfer.core.impl.ui.reason.chooser;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.transfer.core.impl.R$id;
import com.revolut.feature.transfer.core.impl.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.payments.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ghk.t;
import gqf.b;
import gqf.f;
import gqf.g;
import h30.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lpf.q;
import rd0.e;
import te0.w;
import vc.s;
import yhm.d;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/impl/ui/reason/chooser/ReasonForTransferChooserScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lgqf/g;", "Lcom/revolut/feature/transfer/core/impl/ui/reason/chooser/ReasonForTransferChooserScreenContract$InputData;", "Lgqf/f;", "feature_transfer_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class ReasonForTransferChooserScreen extends BaseRecyclerViewScreen<g, ReasonForTransferChooserScreenContract$InputData, f> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f92189b0 = {o0.f186429a.j(new h0(ReasonForTransferChooserScreen.class, "binding", "getBinding()Lcom/revolut/feature/transfer/core/impl/databinding/ScreenTransferReasonBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final SelectableDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f92190a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReasonForTransferChooserScreen(ReasonForTransferChooserScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_transfer_reason;
        this.V = R$id.transferScreenReason_recyclerView;
        this.W = s.t(this, b.f);
        this.X = w.y0(new t(this, inputData, 18));
        this.Y = w.y0(new g8i.h(this, 23));
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        SelectableDelegate selectableDelegate = new SelectableDelegate(rowDelegate);
        this.Z = selectableDelegate;
        this.f92190a0 = v.k(selectableDelegate, rowDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((gqf.h) this.Y.getValue()).v2(gqf.d.f145715a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (q) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (gqf.h) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.W.getValue(this, f92189b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        a.g2(this, e.b(((kpf.d) value).f188236b.f59410q), null, new g85.f(this, null, 29), 3);
        a.g2(this, e.b(w.a0(this.Z.r(), new gqa.a(5))), null, new gii.b(this, null, 19), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.W.getValue(this, f92189b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        kpf.d dVar = (kpf.d) value;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_core_reason_for_transfer_title, null, null, 14);
        dVar.f188236b.setToolbarTitle(textLocalisedClause);
        NavBarWithToolbar transferScreenReasonNavigationBar = dVar.f188236b;
        Intrinsics.checkNotNullExpressionValue(transferScreenReasonNavigationBar, "transferScreenReasonNavigationBar");
        transferScreenReasonNavigationBar.setTitle(textLocalisedClause, null);
        transferScreenReasonNavigationBar.setDescriptionText(new TextLocalisedClause(R$string.payments_core_reason_for_transfer_reasons_list_title, null, null, 14));
        transferScreenReasonNavigationBar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        l.A(R.string.common_action_continue, null, null, 14, dVar.f188237c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF92190a0() {
        return this.f92190a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.U;
    }
}
