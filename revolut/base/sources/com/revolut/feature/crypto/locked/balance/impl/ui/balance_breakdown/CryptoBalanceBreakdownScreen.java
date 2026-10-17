package com.revolut.feature.crypto.locked.balance.impl.ui.balance_breakdown;

import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.crypto.locked.balance.api.navigation.CryptoBalanceBreakdownInputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import fh5.d;
import i1d.b;
import ih5.f;
import ih5.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/locked/balance/impl/ui/balance_breakdown/CryptoBalanceBreakdownScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lfh5/d;", "Lih5/a;", "feature_crypto_locked_balance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoBalanceBreakdownScreen extends BaseBottomSheetRecyclerController<d, ih5.a> {
    public static final /* synthetic */ int V = 0;
    public final CellDetailsDelegate Q;
    public final FullScreenStateDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public CryptoBalanceBreakdownScreen(CryptoBalanceBreakdownInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.Q = cellDetailsDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.R = fullScreenStateDelegate;
        this.S = v.k(cellDetailsDelegate, new CellDetailsLoadingDelegate(), fullScreenStateDelegate);
        this.T = w.y0(new b(this, inputData, 18));
        this.U = w.y0(new ie7.a(this, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (hh5.a) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (ih5.b) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.e), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f52371h.f121375b), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e3(), null, new ibg.g(this, null, 8), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (ih5.b) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
