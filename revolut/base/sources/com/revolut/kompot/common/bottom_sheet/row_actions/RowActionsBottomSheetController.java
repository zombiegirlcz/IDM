package com.revolut.kompot.common.bottom_sheet.row_actions;

import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import eii.c;
import eii.k;
import eii.n;
import eii.o;
import eii.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import pki.b;
import vkm.d;
import xki.a;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/kompot/common/bottom_sheet/row_actions/RowActionsBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Leii/k;", "Lcli/k;", "Lno/m;", "Lno/k;", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RowActionsBottomSheetController extends BaseBottomSheetRecyclerController<k, cli.k> implements m, no.k {
    public final AnalyticsProduct Q;
    public AnalyticsContext R;
    public final a S;
    public final ay4.a T;
    public final RowDelegate U;
    public final AccountCellItemDelegate V;
    public final CellDetailsDelegate W;
    public final List X;

    public RowActionsBottomSheetController(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData.d;
        this.R = inputData.e;
        this.S = a.f306815a;
        this.T = new ay4.a(new q(inputData));
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.U = rowDelegate;
        AccountCellItemDelegate accountCellItemDelegate = new AccountCellItemDelegate();
        this.V = accountCellItemDelegate;
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.W = cellDetailsDelegate;
        this.X = v.k(rowDelegate, accountCellItemDelegate, cellDetailsDelegate);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.R = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getN() {
        return this.Q;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return this.S;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getO() {
        return this.R;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return this.T;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        int i = 0;
        ViewController.P2(this, e3(), new n(this, continuation, i), 3);
        int i2 = 1;
        ViewController.P2(this, f3(), new n(this, continuation, i2), 3);
        ViewController.P2(this, d3(), new o(this, continuation, i), 3);
        RowDelegate rowDelegate = this.U;
        d dVarB = rd0.e.b(rowDelegate.f53218h);
        d dVarB2 = rd0.e.b(this.V.f51551c.f53218h);
        CellDetailsDelegate cellDetailsDelegate = this.W;
        ViewController.P2(this, vkm.q.J(dVarB, dVarB2, rd0.e.b(cellDetailsDelegate.f), rd0.e.b(cellDetailsDelegate.d)), new o(this, continuation, i2), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53226s), new o(this, continuation, 2), 3);
        ViewController.P2(this, i3(), new o(this, continuation, 3), 3);
        ViewController.P2(this, h3(), new o(this, continuation, 4), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return this.T;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.X;
    }
}
