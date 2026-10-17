package com.revolut.feature_crypto_order_flow.impl.exchange.bottom_sheet.balance_breakdown;

import android.view.View;
import cli.k;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import pki.b;
import vge.z1;
import vyh.c;
import vyh.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/exchange/bottom_sheet/balance_breakdown/BalanceBreakdownBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "", "Lcli/k;", "Lno/m;", "Lno/k;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BalanceBreakdownBottomSheetController extends BaseBottomSheetRecyclerController<Object, k> implements m, no.k {
    public final AnalyticsProduct.Retail Q;
    public AnalyticsContext R;
    public final xki.a S;
    public final a T;
    public final CellDetailsDelegate U;
    public final List V;

    public BalanceBreakdownBottomSheetController(vyh.a inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData.d;
        this.R = null;
        this.S = xki.a.f306815a;
        this.T = new a(inputData, new e(inputData));
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.U = cellDetailsDelegate;
        this.V = u.c(cellDetailsDelegate);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.R = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getX() {
        return this.Q;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return this.S;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getR() {
        return this.R;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return this.T;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new z1(this, null, 22), 3);
        ViewController.P2(this, rd0.e.b(this.U.d), new c(this, null), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return this.T;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getV() {
        return this.V;
    }
}
