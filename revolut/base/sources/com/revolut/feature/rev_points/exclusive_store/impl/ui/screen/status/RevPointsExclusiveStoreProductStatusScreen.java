package com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.status;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pgk.f;
import pt4.d;
import pvb.b;
import pvb.c;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/exclusive_store/impl/ui/screen/status/RevPointsExclusiveStoreProductStatusScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lpvb/b;", "feature_rev_points_exclusive_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsExclusiveStoreProductStatusScreen extends BaseBottomSheetRecyclerController<q, b> {
    public static final /* synthetic */ int U = 0;
    public final FullScreenStateDelegate Q;
    public final List R;
    public final Object S;
    public final Object T;

    public RevPointsExclusiveStoreProductStatusScreen(RevPointsExclusiveStoreProductStatusScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.Q = fullScreenStateDelegate;
        this.R = v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), fullScreenStateDelegate);
        this.S = w.y0(new d(this, inputData, 6));
        this.T = w.y0(new f(this, 23));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (kvb.e) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, rd0.e.b(this.Q.f52371h.f121375b), null, new pvb.a(this, null), 3);
        a.g2(this, e3(), null, new pnb.b(this, null, 17), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (c) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.R;
    }
}
