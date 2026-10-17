package com.revolut.feature.wealth.ui.impl.cash_balance.unsettled;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.wealth.ui.api.navigation.cash_balance.UnsettledDialogInputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import f1h.f;
import fb6.j;
import fkh.c;
import fkh.e;
import htl.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mkh.p;
import pki.b;
import te0.w;
import vkm.d;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/cash_balance/unsettled/UnsettledDialogController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lfkh/e;", "Lhtl/g;", "Lf1h/f;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UnsettledDialogController extends BaseBottomSheetRecyclerController<q, e> implements g, f {
    public static final /* synthetic */ int X = 0;
    public final ExpandableCellDelegate Q;
    public final RowDelegate R;
    public final LargeActionButtonDelegate S;
    public final FullScreenStateDelegate T;
    public final List U;
    public final Object V;
    public final Object W;

    public UnsettledDialogController(UnsettledDialogInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        ExpandableCellDelegate expandableCellDelegate = new ExpandableCellDelegate();
        this.Q = expandableCellDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.R = rowDelegate;
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.S = largeActionButtonDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.T = fullScreenStateDelegate;
        this.U = v.k(expandableCellDelegate, rowDelegate, largeActionButtonDelegate, fullScreenStateDelegate);
        this.V = w.y0(new j(this, inputData, 10));
        this.W = w.y0(new es.e(this, 24));
    }

    @Override // htl.g
    public final d O1() {
        return rd0.e.b(this.R.f53218h);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (fkh.d) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.Q.f52255c), new fkh.a(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.d.f121375b), new fkh.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.f52371h.f121375b), new c(this, null), 3);
    }

    @Override // f1h.f
    /* JADX INFO: renamed from: c, reason: from getter */
    public final RowDelegate getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (fkh.d) this.W.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.U;
    }
}
