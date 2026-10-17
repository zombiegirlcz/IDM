package com.revolut.feature.rev_points.buying.impl.ui.screen.main;

import android.os.Parcelable;
import android.view.View;
import buf.u;
import bvb.d;
import bvb.e;
import bvb.g;
import bvb.k;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AttributeSelectorIconDelegate;
import com.revolut.core.ui_kit.delegates.AttributeSelectorIconLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import dli.c;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import te0.w;
import vub.b;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/buying/impl/ui/screen/main/RevPointsBuyingControllerScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lbvb/g;", "Lbvb/e;", "Lno/m;", "feature_rev_points_buying_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsBuyingControllerScreen extends BaseBottomSheetRecyclerController<g, e> implements m {
    public static final /* synthetic */ int X = 0;
    public final AnalyticsProduct.Retail Q;
    public final AttributeSelectorIconDelegate R;
    public final RowDelegate S;
    public final TextDelegate T;
    public final List U;
    public final Object V;
    public final Object W;

    public RevPointsBuyingControllerScreen(RevPointsBuyingControllerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        k9 k9Var = k9.RevPointsBuying;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.Q = a.h(k9Var, "value", k9Var);
        AttributeSelectorIconDelegate attributeSelectorIconDelegate = new AttributeSelectorIconDelegate();
        this.R = attributeSelectorIconDelegate;
        ScrollerDelegate scrollerDelegate = new ScrollerDelegate(v.k(new AttributeSelectorIconLoadingDelegate(), attributeSelectorIconDelegate), false);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.S = rowDelegate;
        TextDelegate textDelegate = new TextDelegate();
        this.T = textDelegate;
        this.U = v.k(scrollerDelegate, rowDelegate, textDelegate, new PlainTextLoadingDelegate());
        this.V = w.y0(new u(this, inputData, 2));
        this.W = w.y0(new bvb.a(this, 0));
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController, com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.Y2(view);
        ((c) this.O.getValue()).h().setItemAnimator(null);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, kii.e.t(this.R.f51655c, "hide(...)"), null, new bvb.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f53225r), null, new bvb.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.d), null, new btd.e(this, null, 9), 3);
        com.revolut.kompot.navigable.a.g2(this, h3(), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e3(), null, new d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, f3(), null, new d(this, continuation, 2), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.W.getValue();
    }
}
