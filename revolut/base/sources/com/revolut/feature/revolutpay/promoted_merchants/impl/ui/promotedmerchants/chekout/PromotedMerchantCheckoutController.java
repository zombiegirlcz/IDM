package com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsBadgeDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o10.c;
import oa2.b;
import occ.g;
import occ.h;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/promoted_merchants/impl/ui/promotedmerchants/chekout/PromotedMerchantCheckoutController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Locc/a;", "feature_revolut_pay_promoted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PromotedMerchantCheckoutController extends BaseBottomSheetRecyclerController<q, occ.a> {
    public static final /* synthetic */ int U = 0;
    public final FullScreenStateDelegate Q;
    public final RowDelegate R;
    public final Object S;
    public final Object T;

    public PromotedMerchantCheckoutController(PromotedMerchantCheckoutContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = new FullScreenStateDelegate();
        this.R = new RowDelegate(null, null, 7);
        this.S = w.y0(new b(this, inputData, 5));
        this.T = w.y0(new c(this, 13));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (jcc.a) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, e3(), new g(this, continuation, 0), 3);
        ViewController.P2(this, f3(), new g(this, continuation, 1), 3);
        ViewController.P2(this, d3(), new g(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f53226s), new g(this, continuation, 3), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getU() {
        return v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new CellDetailsBadgeDelegate(), new RowLoadingDelegate(), this.R, this.Q);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] */
    public final occ.b R2() {
        return (occ.b) this.T.getValue();
    }
}
