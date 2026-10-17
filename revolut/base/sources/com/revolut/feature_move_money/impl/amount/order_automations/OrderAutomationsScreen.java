package com.revolut.feature_move_money.impl.amount.order_automations;

import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import sw6.a;
import t3b.g;
import t6i.j;
import te0.w;
import u7i.p;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_move_money/impl/amount/order_automations/OrderAutomationsScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lt6i/j;", "Lcli/k;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderAutomationsScreen extends BaseBottomSheetRecyclerController<j, k> {
    public static final /* synthetic */ int U = 0;
    public final RowDelegate Q;
    public final List R;
    public final Object S;
    public final Object T;

    public OrderAutomationsScreen(OrderAutomationsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Q = rowDelegate;
        this.R = u.c(rowDelegate);
        this.S = w.y0(new a(this, inputData, 6));
        this.T = w.y0(new sii.a(this, 20));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (t6i.k) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        r map = this.Q.f53218h.map(new t45.a(new g(28), 10));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        ViewController.P2(this, rd0.e.b(map), new sy6.j(this, null, 19), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b d() {
        return (t6i.k) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.R;
    }
}
