package com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.repeater_dropdown;

import android.view.View;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf9.s;
import te0.w;
import tyl.a;
import u1.g;
import ug9.b;
import ug9.c;
import ug9.d;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui/screen/fields/repeater_dropdown/RepeaterDropdownSelectionScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lug9/d;", "Lug9/b;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RepeaterDropdownSelectionScreen extends BaseBottomSheetRecyclerController<d, b> {
    public static final /* synthetic */ int U = 0;
    public final RowDelegate Q;
    public final Object R;
    public final Object S;
    public final List T;

    public RepeaterDropdownSelectionScreen(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Q = rowDelegate;
        this.R = w.y0(new a(this, 19));
        this.S = w.y0(new g(this, inputData, 27));
        this.T = u.c(rowDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (s) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ug9.e) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.Q.f53218h), new ug9.a(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (ug9.e) this.R.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getV() {
        return this.T;
    }
}
