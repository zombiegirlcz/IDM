package com.revolut.feature.wealth.ui.impl.holding.disclaimer.explanation;

import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import g8i.h;
import ghk.t;
import glh.b;
import glh.e;
import glh.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mkh.c;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/holding/disclaimer/explanation/CashHoldingFundsExplanationScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lglh/e;", "Lglh/b;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CashHoldingFundsExplanationScreen extends BaseBottomSheetRecyclerController<e, b> {
    public static final /* synthetic */ int U = 0;
    public final CellDetailsDelegate Q;
    public final List R;
    public final Object S;
    public final Object T;

    public CashHoldingFundsExplanationScreen(CashHoldingFundsExplanationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.Q = cellDetailsDelegate;
        this.R = u.c(cellDetailsDelegate);
        this.S = w.y0(new t(this, inputData, 4));
        this.T = w.y0(new h(this, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, rd0.e.b(w.a0(this.Q.d, new gk7.a(21))), null, new glh.a(this, null, 0), 3);
        a.g2(this, h3(), null, new glh.a(this, null, 1), 3);
        a.g2(this, e3(), null, new g85.f(this, null, 17), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b d() {
        return (f) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.R;
    }
}
