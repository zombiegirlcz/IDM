package com.revolut.feature.rev_points.giftcards.impl.ui.screen.checkout;

import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RoomPreviewCardDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.rev_points.giftcards.api.navigation.descriptor.RevPointsGiftcardsCheckoutController$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import grl.k9;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import rgf.b;
import rtl.y;
import rwb.c;
import rwb.d;
import te0.w;
import uvb.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/impl/ui/screen/checkout/RevPointsGiftcardCheckoutScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Luvb/e;", "Lrwb/c;", "Lno/m;", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsGiftcardCheckoutScreen extends BaseBottomSheetRecyclerController<e, c> implements m {
    public static final /* synthetic */ int Y = 0;
    public final AnalyticsProduct.Retail Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final List V;
    public final Object W;
    public final Object X;

    public RevPointsGiftcardCheckoutScreen(RevPointsGiftcardsCheckoutController$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        k9 k9Var = k9.GiftCards;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.Q = a.h(k9Var, "value", k9Var);
        Lazy lazyY0 = w.y0(new rr4.a(23));
        this.R = lazyY0;
        Lazy lazyY02 = w.y0(new rr4.a(24));
        this.S = lazyY02;
        Lazy lazyY03 = w.y0(new rr4.a(25));
        this.T = lazyY03;
        Lazy lazyY04 = w.y0(new rr4.a(26));
        this.U = lazyY04;
        this.V = v.k((FullScreenStateDelegate) lazyY0.getValue(), (RowLoadingDelegate) lazyY02.getValue(), (CellDetailsDelegate) lazyY04.getValue(), (RoomPreviewCardDelegate) lazyY03.getValue());
        this.W = w.y0(new b(this, inputData, 28));
        this.X = w.y0(new y(this, 2));
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (iwb.c) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.R.getValue()).f52371h.f121375b), null, new rwb.a(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e3(), null, new rwb.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, f3(), null, new rwb.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, d3(), null, new rwb.b(this, continuation, 2), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getV() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final d R2() {
        return (d) this.X.getValue();
    }
}
