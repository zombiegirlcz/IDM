package com.revolut.feature.apm.core.ui.impl.ui.breakdown;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.feature.apm.core.ui.api.navigation.PaymentsBreakdownNavigation$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import fp3.a;
import fyh.k;
import g22.b;
import g22.c;
import g22.d;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p12.o0;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/breakdown/PaymentsBreakdownController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lg22/b;", "Ldli/a;", "Lcii/b;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentsBreakdownController extends BaseBottomSheetRecyclerController<q, b> {
    public static final /* synthetic */ int U = 0;
    public final Object Q;
    public final List R;
    public final Object S;
    public final Object T;

    public PaymentsBreakdownController(PaymentsBreakdownNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Lazy lazyY0 = w.y0(new k(25));
        this.Q = lazyY0;
        this.R = v.k((CellDetailsActionDelegate) lazyY0.getValue(), new CellDetailsDelegate(), new CellDetailsNoteDelegate());
        this.S = w.y0(new a(this, 17));
        this.T = w.y0(new fx5.a(this, inputData, 5));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o0) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g22.a) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.Q;
        ViewController.P2(this, rd0.e.b(((CellDetailsActionDelegate) r56.getValue()).f51780c), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsActionDelegate) r56.getValue()).d), new d(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (g22.a) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.R;
    }
}
