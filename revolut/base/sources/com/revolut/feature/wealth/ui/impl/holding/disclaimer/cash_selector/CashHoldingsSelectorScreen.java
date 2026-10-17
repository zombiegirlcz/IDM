package com.revolut.feature.wealth.ui.impl.holding.disclaimer.cash_selector;

import android.view.View;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.wealth.ui.api.navigation.holdings.CashHoldingSelectorInputData;
import com.revolut.feature.wealth.ui.api.navigation.holdings.CashHoldingsSelectorOutputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import es.e;
import f9d.c;
import fb6.j;
import fkh.f;
import flh.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/holding/disclaimer/cash_selector/CashHoldingsSelectorScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lcom/revolut/feature/wealth/ui/api/navigation/holdings/CashHoldingsSelectorOutputData;", "Lflh/a;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CashHoldingsSelectorScreen extends BaseBottomSheetRecyclerController<CashHoldingsSelectorOutputData, a> {
    public static final /* synthetic */ int U = 0;
    public final RowDelegate Q;
    public final List R;
    public final Object S;
    public final Object T;

    public CashHoldingsSelectorScreen(CashHoldingSelectorInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Q = rowDelegate;
        this.R = u.c(rowDelegate);
        this.S = w.y0(new j(this, inputData, 12));
        this.T = w.y0(new e(this, 25));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (mkh.e) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (flh.b) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(this.Q.f53218h, new f(4))), null, new c(this, (Continuation) null, 27), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b d() {
        return (flh.b) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.R;
    }
}
