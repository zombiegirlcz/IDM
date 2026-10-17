package com.revolut.feature.transfer.core.impl.ui.reason.goods;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.chooser.ChooserScreenContract$Model;
import com.revolut.feature.transfer.core.impl.R$id;
import com.revolut.feature.transfer.core.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.payments.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import h30.l;
import java.io.Serializable;
import java.util.List;
import jki.m;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lpf.v;
import ni1.a;
import nqf.d;
import nqf.f;
import nqf.g;
import nqf.i;
import nqf.k;
import nqf.n;
import nqf.p;
import ofm.q;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/impl/ui/reason/goods/ReasonForTransferGoodsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lnqf/n;", "Lcom/revolut/feature/transfer/core/impl/ui/reason/goods/ReasonForTransferGoodsScreenContract$InputData;", "Lnqf/k;", "feature_transfer_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReasonForTransferGoodsScreen extends BaseRecyclerViewScreen<n, ReasonForTransferGoodsScreenContract$InputData, k> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f92209b0 = {o0.f186429a.j(new h0(ReasonForTransferGoodsScreen.class, "binding", "getBinding()Lcom/revolut/feature/transfer/core/impl/databinding/ScreenTransferReasonBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final InputTextDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f92210a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReasonForTransferGoodsScreen(ReasonForTransferGoodsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_transfer_reason;
        this.V = R$id.transferScreenReason_recyclerView;
        this.W = s.t(this, d.f);
        this.X = w.y0(new a(this, inputData, 23));
        this.Y = w.y0(new nmm.h(this, 13));
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.Z = inputTextDelegate;
        this.f92210a0 = u.c(inputTextDelegate);
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((p) T2()).v2(i.f218442a);
        return true;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        n uiState = (n) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f188237c.setEnabled(uiState.f218445b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (v) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void U2(int i, int i2, Intent intent) {
        Bundle extras;
        Bundle extras2;
        final ChooserScreenContract$Model chooserScreenContract$Model = null;
        if (i == 10001 && i2 == -1) {
            if (intent != null && (extras2 = intent.getExtras()) != null) {
                chooserScreenContract$Model = (ChooserScreenContract$Model) extras2.getParcelable("DATA");
            }
            p pVar = (p) T2();
            pVar.getClass();
            if (chooserScreenContract$Model != null) {
                final int i3 = 0;
                pVar.x2(new Function1() { // from class: nqf.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i3) {
                            case 0:
                                h updateState = (h) obj2;
                                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                Serializable serializable = chooserScreenContract$Model.f65909l;
                                Intrinsics.i(serializable, "null cannot be cast to non-null type com.revolut.core.model.country.CountryCode");
                                return h.a(updateState, null, null, null, (wi0.b) serializable, null, 23);
                            default:
                                h updateState2 = (h) obj2;
                                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                                Serializable serializable2 = chooserScreenContract$Model.f65909l;
                                Intrinsics.i(serializable2, "null cannot be cast to non-null type com.revolut.core.model.country.CountryCode");
                                return h.a(updateState2, null, null, null, null, (wi0.b) serializable2, 15);
                        }
                    }
                });
                return;
            }
            return;
        }
        if (i == 10002 && i2 == -1) {
            if (intent != null && (extras = intent.getExtras()) != null) {
                chooserScreenContract$Model = (ChooserScreenContract$Model) extras.getParcelable("DATA");
            }
            p pVar2 = (p) T2();
            pVar2.getClass();
            if (chooserScreenContract$Model != null) {
                final int i5 = 1;
                pVar2.x2(new Function1() { // from class: nqf.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i5) {
                            case 0:
                                h updateState = (h) obj2;
                                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                                Serializable serializable = chooserScreenContract$Model.f65909l;
                                Intrinsics.i(serializable, "null cannot be cast to non-null type com.revolut.core.model.country.CountryCode");
                                return h.a(updateState, null, null, null, (wi0.b) serializable, null, 23);
                            default:
                                h updateState2 = (h) obj2;
                                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                                Serializable serializable2 = chooserScreenContract$Model.f65909l;
                                Intrinsics.i(serializable2, "null cannot be cast to non-null type com.revolut.core.model.country.CountryCode");
                                return h.a(updateState2, null, null, null, null, (wi0.b) serializable2, 15);
                        }
                    }
                });
            }
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f188236b.f59410q), null, new nqf.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f188237c.o), null, new nqf.e(this, null, 1), 3);
        InputTextDelegate inputTextDelegate = this.Z;
        com.revolut.kompot.navigable.a.g2(this, e.b(inputTextDelegate.f52575g.f121375b), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(inputTextDelegate.e.f121375b), null, new g(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        kpf.d dVarG3 = g3();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_payment_reason_payment_details_title, null, null, 14);
        dVarG3.f188236b.setToolbarTitle(textLocalisedClause);
        NavBarWithToolbar transferScreenReasonNavigationBar = dVarG3.f188236b;
        Intrinsics.checkNotNullExpressionValue(transferScreenReasonNavigationBar, "transferScreenReasonNavigationBar");
        transferScreenReasonNavigationBar.setTitle(textLocalisedClause, null);
        transferScreenReasonNavigationBar.setDescriptionText(new TextLocalisedClause(R$string.payments_core_reason_for_transfer_reasons_list_title, null, null, 14));
        transferScreenReasonNavigationBar.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
        l.A(R.string.common_action_continue, null, null, 14, dVarG3.f188237c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(jki.n nVar, o oVar) {
        n uiState = (n) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f188237c.setEnabled(uiState.f218445b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF92210a0() {
        return this.f92210a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final kpf.d g3() {
        ViewBinding value = this.W.getValue(this, f92209b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (kpf.d) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final nqf.m T2() {
        return (nqf.m) this.Y.getValue();
    }
}
