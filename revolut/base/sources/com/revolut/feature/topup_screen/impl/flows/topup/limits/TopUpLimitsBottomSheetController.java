package com.revolut.feature.topup_screen.impl.flows.topup.limits;

import android.view.View;
import cli.k;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import qee.s;
import ste.r;
import ste.u;
import wp5.y;
import xki.a;
import xki.e;
import xni.h;
import xv4.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/limits/TopUpLimitsBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lste/u;", "Lcli/k;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TopUpLimitsBottomSheetController extends BaseBottomSheetRecyclerController<u, k> {
    public final a Q;
    public final ay4.a R;
    public final List S;

    public TopUpLimitsBottomSheetController(r inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = a.f306815a;
        this.R = new ay4.a(new s(inputData));
        this.S = y.w();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return this.Q;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return this.R;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, h3(), new o(this, (Continuation) null, 9), 3);
        ViewController.P2(this, e3(), new h(this, null, 18), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return this.R;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getQ() {
        return this.S;
    }
}
