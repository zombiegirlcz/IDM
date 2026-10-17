package com.revolut.trading.orders.ui.invest.placement.security_asset_balance_breakdown;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsTextProgressDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.trading_orders.api.invest.placement.locked_period.SecurityAssetBalanceBreakdownScreenDescriptor$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import maa.r;
import mq4.b;
import mul.c;
import mul.d;
import mul.h;
import mul.j;
import te0.w;
import xki.e;
import xsl.m;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/security_asset_balance_breakdown/SecurityAssetBalanceBreakdownScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lmul/h;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SecurityAssetBalanceBreakdownScreen extends BaseBottomSheetRecyclerController<q, h> {
    public static final /* synthetic */ int V = 0;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final List T;
    public final Object U;

    public SecurityAssetBalanceBreakdownScreen(SecurityAssetBalanceBreakdownScreenDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Lazy lazyY0 = w.y0(new b(28));
        this.Q = lazyY0;
        Lazy lazyY02 = w.y0(new b(29));
        this.R = lazyY02;
        this.S = w.y0(new r(this, 21));
        this.T = v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), (CellDetailsTextProgressDelegate) lazyY0.getValue(), (FullScreenStateDelegate) lazyY02.getValue());
        this.U = w.y0(new mhd.b(this, inputData, 22));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return (j) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((CellDetailsTextProgressDelegate) this.Q.getValue()).f51925c), new c(this, null), 3);
        ViewController.P2(this, e3(), new mta.c(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.R.getValue()).f52371h.f121375b), new d(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (j) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.T;
    }
}
