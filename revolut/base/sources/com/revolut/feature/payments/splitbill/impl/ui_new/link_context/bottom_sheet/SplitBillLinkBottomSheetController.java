package com.revolut.feature.payments.splitbill.impl.ui_new.link_context.bottom_sheet;

import android.view.View;
import com.revolut.core.ui_kit.delegates.CellIncrementDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rtl.y;
import rxe.b;
import s1a.a;
import s1a.d;
import s1a.g;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/splitbill/impl/ui_new/link_context/bottom_sheet/SplitBillLinkBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Ls1a/d;", "Ls1a/a;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SplitBillLinkBottomSheetController extends BaseBottomSheetRecyclerController<d, a> {
    public static final /* synthetic */ int U = 0;
    public final CellIncrementDelegate Q;
    public final List R;
    public final Object S;
    public final Object T;

    public SplitBillLinkBottomSheetController(SplitBillLinkBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        CellIncrementDelegate cellIncrementDelegate = new CellIncrementDelegate();
        this.Q = cellIncrementDelegate;
        this.R = u.c(cellIncrementDelegate);
        this.S = w.y0(new b(this, inputData, 11));
        this.T = w.y0(new y(this, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j1a.e) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        CellIncrementDelegate cellIncrementDelegate = this.Q;
        ViewController.P2(this, rd0.e.b(cellIncrementDelegate.f51948c), new s1a.e(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(cellIncrementDelegate.d), new s1a.e(this, null, 1), 3);
        ViewController.P2(this, e3(), new s1a.e(this, null, 2), 3);
        ViewController.P2(this, f3(), new s1a.e(this, null, 3), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.T.getValue();
    }
}
