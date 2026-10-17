package com.revolut.feature_move_money.impl.amount.order_options;

import android.view.View;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import u1.g;
import u4e.i;
import u6i.a;
import u6i.d;
import u7i.q;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_move_money/impl/amount/order_options/OrderOptionsScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lu6i/d;", "Lu6i/a;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderOptionsScreen extends BaseBottomSheetRecyclerController<d, a> {
    public static final /* synthetic */ int U = 0;
    public final AccountCellItemDelegate Q;
    public final List R;
    public final Object S;
    public final Object T;

    public OrderOptionsScreen(OrderOptionsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AccountCellItemDelegate accountCellItemDelegate = new AccountCellItemDelegate();
        this.Q = accountCellItemDelegate;
        this.R = u.c(accountCellItemDelegate);
        this.S = w.y0(new g(this, inputData, 16));
        this.T = w.y0(new tyl.a(this, 7));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (q) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (u6i.e) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(w.a0(this.Q.f51551c.f53218h, new i(19))), new tz6.e(this, (Continuation) null, 27), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b d() {
        return (u6i.e) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.R;
    }
}
