package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.route_selector;

import android.view.View;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l4j.a;
import l4j.b;
import l4j.c;
import l4j.d;
import l4j.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/route_selector/RouteSelectorController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Ll4j/b;", "Ll4j/a;", "Ldli/a;", "Lcii/b;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RouteSelectorController extends BaseBottomSheetRecyclerController<b, a> {
    public final SelectableDelegate Q;
    public final List R;
    public final d S;
    public final xki.a T;

    public RouteSelectorController(RouteSelectorContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        SelectableDelegate selectableDelegate = new SelectableDelegate(new RowDelegate(null, null, 7));
        this.Q = selectableDelegate;
        this.R = u.c(selectableDelegate);
        this.S = new d(new e(), inputData);
        this.T = xki.a.f306815a;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return this.T;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return this.S;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.Q.r()), new c(this, null), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return this.S;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.R;
    }
}
