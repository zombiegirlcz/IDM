package com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.breakdown;

import a3e.u;
import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import fj6.b;
import fj6.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import xki.a;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/screen/payment/breakdown/PaymentBreakdownBottomSheet;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lfj6/e;", "Lcli/k;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentBreakdownBottomSheet extends BaseBottomSheetRecyclerController<e, k> {
    public final a Q;
    public final ay4.a R;
    public final CellDetailsDelegate S;
    public final List T;

    public PaymentBreakdownBottomSheet(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = a.f306815a;
        this.R = new ay4.a(new u(inputData));
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.S = cellDetailsDelegate;
        this.T = v.k(cellDetailsDelegate, new CellDetailsActionDelegate(), new ListSubheaderDelegate(), new TextDelegate());
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return this.Q;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return this.R;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.S.e), new fj6.a(this, null), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return this.R;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.T;
    }
}
