package com.revolut.feature.retail.advanced_charts.impl.bottom_sheet.style_selector;

import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.retail.advanced_charts.api.navigation.ChartStyleSelectorBottomSheetControllerProvider$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import h0b.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n0b.b;
import n0b.d;
import xki.a;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/advanced_charts/impl/bottom_sheet/style_selector/ChartStyleSelectorBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lh0b/h;", "Lcli/k;", "feature_retail_advanced_charts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChartStyleSelectorBottomSheetController extends BaseBottomSheetRecyclerController<h, k> {
    public final a Q;
    public final b R;
    public final SingleChoiceDelegate S;
    public final List T;

    public ChartStyleSelectorBottomSheetController(ChartStyleSelectorBottomSheetControllerProvider$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = a.f306815a;
        this.R = new b(new d(inputData));
        SingleChoiceDelegate singleChoiceDelegate = new SingleChoiceDelegate();
        this.S = singleChoiceDelegate;
        this.T = u.c(singleChoiceDelegate);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return this.Q;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return this.R;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.S.p()), new n0b.a(this, null), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return this.R;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
