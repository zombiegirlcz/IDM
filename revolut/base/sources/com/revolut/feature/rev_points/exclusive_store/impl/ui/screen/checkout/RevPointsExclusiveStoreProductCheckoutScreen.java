package com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout;

import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellIncrementDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RoomPreviewCardDelegate;
import com.revolut.core.ui_kit.delegates.RoomPreviewLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarCellDelegate;
import com.revolut.core.ui_kit.internal.delegates.SuggestionDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ot1.p;
import ovb.e;
import ovb.h;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/exclusive_store/impl/ui/screen/checkout/RevPointsExclusiveStoreProductCheckoutScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lcom/revolut/feature/rev_points/exclusive_store/impl/ui/screen/checkout/a;", "Lovb/e;", "feature_rev_points_exclusive_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsExclusiveStoreProductCheckoutScreen extends BaseBottomSheetRecyclerController<a, e> {
    public static final /* synthetic */ int X = 0;
    public final CellIncrementDelegate Q;
    public final FullScreenStateDelegate R;
    public final RowDelegate S;
    public final SuggestionsBarCellDelegate T;
    public final List U;
    public final Object V;
    public final Object W;

    public RevPointsExclusiveStoreProductCheckoutScreen(RevPointsExclusiveStoreProductCheckoutScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        CellIncrementDelegate cellIncrementDelegate = new CellIncrementDelegate();
        this.Q = cellIncrementDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.R = fullScreenStateDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.S = rowDelegate;
        SuggestionsBarCellDelegate suggestionsBarCellDelegate = new SuggestionsBarCellDelegate();
        this.T = suggestionsBarCellDelegate;
        this.U = v.k(cellIncrementDelegate, fullScreenStateDelegate, new RoomPreviewCardDelegate(), new CellDetailsDelegate(), rowDelegate, suggestionsBarCellDelegate, new RoomPreviewLoadingDelegate(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), new PlainTextLoadingDelegate());
        this.V = w.y0(new p(this, inputData, 5));
        this.W = w.y0(new os2.a(this, 7));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (kvb.c) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        CellIncrementDelegate cellIncrementDelegate = this.Q;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(cellIncrementDelegate.f51948c), null, new ovb.a(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(cellIncrementDelegate.d), null, new ovb.a(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f53218h), null, new ovb.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SuggestionDelegate) this.T.f53481c.getValue()).d), null, new ovb.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f52371h.f121375b), null, new ovb.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e3(), null, new ovb.a(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, f3(), null, new ocb.d(this, continuation, 26), 3);
        com.revolut.kompot.navigable.a.g2(this, d3(), null, new ovb.a(this, continuation, 3), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] */
    public final h R2() {
        return (h) this.W.getValue();
    }
}
