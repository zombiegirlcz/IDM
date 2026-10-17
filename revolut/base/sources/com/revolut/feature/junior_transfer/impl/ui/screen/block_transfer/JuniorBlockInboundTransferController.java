package com.revolut.feature.junior_transfer.impl.ui.screen.block_transfer;

import android.view.View;
import cli.k;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import gr8.b;
import gr8.e;
import gr8.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import xki.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_transfer/impl/ui/screen/block_transfer/JuniorBlockInboundTransferController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lgr8/e;", "Lcli/k;", "feature_junior_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorBlockInboundTransferController extends BaseBottomSheetRecyclerController<e, k> {
    public final a Q;
    public final ay4.a R;
    public final List S;

    public JuniorBlockInboundTransferController(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = a.f306815a;
        this.R = new ay4.a(new f(inputData));
        this.S = m72.b.v(null, null, 7);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return this.Q;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return this.R;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new gr8.a(this, null, 0), 3);
        ViewController.P2(this, f3(), new gr8.a(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return this.R;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
