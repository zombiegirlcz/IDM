package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.select_tax_rate;

import android.view.View;
import buf.u;
import cbh.g;
import cf1.c;
import cf1.d;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.acquiring.lite_pos.api.navigation.SelectTaxRateScreenProvider$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import dd1.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/select_tax_rate/SelectTaxRateScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Ldd1/a;", "Lcf1/d;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectTaxRateScreen extends BaseBottomSheetRecyclerController<a, d> {
    public static final /* synthetic */ int V = 0;
    public final Object Q;
    public final RowDelegate R;
    public final FullScreenStateDelegate S;
    public final List T;
    public final Object U;

    public SelectTaxRateScreen(SelectTaxRateScreenProvider$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = w.y0(new u(this, inputData, 29));
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.R = rowDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.S = fullScreenStateDelegate;
        this.T = v.k(rowDelegate, new RowLoadingDelegate(), fullScreenStateDelegate);
        this.U = w.y0(new bvb.a(this, 15));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ld1.v) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b k3() {
        return (cf1.e) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, i3(), new g(this, null, 5), 3);
        ViewController.P2(this, rd0.e.b(this.R.f53218h), new cf1.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.f52371h.f121375b), new c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (cf1.e) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
