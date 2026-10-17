package com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.taxes_breakdown;

import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import gq8.b;
import gq8.c;
import gq8.d;
import gq8.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import xki.a;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/screens/taxes_breakdown/ChallengesTaxesBreakdownScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lgq8/c;", "Lcli/k;", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChallengesTaxesBreakdownScreen extends BaseBottomSheetRecyclerController<c, k> {
    public final CellDetailsDelegate Q;
    public final List R;
    public final a S;
    public final d T;

    public ChallengesTaxesBreakdownScreen(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.Q = cellDetailsDelegate;
        this.R = u.c(cellDetailsDelegate);
        this.S = a.f306815a;
        this.T = new d(new e(inputData), inputData);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return this.S;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return this.T;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.Q.d), new gq8.a(this, null), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return this.T;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.R;
    }
}
