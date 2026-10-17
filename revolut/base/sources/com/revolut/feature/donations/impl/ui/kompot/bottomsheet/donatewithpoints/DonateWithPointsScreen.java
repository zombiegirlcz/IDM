package com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints;

import android.view.View;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import es.e;
import f9d.c;
import fb6.d;
import fb6.h;
import fb6.i;
import fb6.j;
import fb6.k;
import fb6.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/bottomsheet/donatewithpoints/DonateWithPointsScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lfb6/h;", "Lfb6/d;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DonateWithPointsScreen extends BaseBottomSheetRecyclerController<h, d> {
    public static final /* synthetic */ int V = 0;
    public final AttributeSelectorSmallDelegate Q;
    public final TextDelegate R;
    public final Object S;
    public final Object T;
    public final List U;

    public DonateWithPointsScreen(DonateWithPointsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AttributeSelectorSmallDelegate attributeSelectorSmallDelegate = new AttributeSelectorSmallDelegate();
        this.Q = attributeSelectorSmallDelegate;
        TextDelegate textDelegate = new TextDelegate();
        this.R = textDelegate;
        this.S = w.y0(new j(this, inputData, 0));
        this.T = w.y0(new e(this, 20));
        this.U = v.k(new ScrollerDelegate(v.k(attributeSelectorSmallDelegate, new AttributeSelectorSmallLoadingDelegate()), false), textDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (pa6.j) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (i) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new c(this, (Continuation) null, 3), 3);
        ViewController.P2(this, rd0.e.b(this.Q.p()), new k(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f53530c), new l(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (i) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
