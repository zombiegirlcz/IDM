package com.revolut.feature.rev_points.giftcards.impl.ui.screen.purchase;

import android.view.View;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.feature.rev_points.giftcards.api.navigation.descriptor.RevPointsGiftcardsPurchaseController$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import uvb.l;
import xge.h;
import xwb.b;
import xwb.c;
import xwb.e;
import xwb.f;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/impl/ui/screen/purchase/RevPointsGiftCardPurchaseScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Luvb/l;", "Lxwb/e;", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsGiftCardPurchaseScreen extends BaseBottomSheetRecyclerController<l, e> {
    public static final /* synthetic */ int V = 0;
    public final FullScreenStateDelegate Q;
    public final AttributeSelectorSmallDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public RevPointsGiftCardPurchaseScreen(RevPointsGiftcardsPurchaseController$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.Q = fullScreenStateDelegate;
        AttributeSelectorSmallDelegate attributeSelectorSmallDelegate = new AttributeSelectorSmallDelegate();
        this.R = attributeSelectorSmallDelegate;
        this.S = v.k(new GridBoxDelegate(v.k(attributeSelectorSmallDelegate, new AttributeSelectorSmallLoadingDelegate()), 0, 8.0f, 8.0f, 2), fullScreenStateDelegate);
        this.T = w.y0(new xfj.a(this, inputData, 26));
        this.U = w.y0(new h(this, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (iwb.a) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.p()), null, new xwb.a(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e3(), null, new b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, d3(), null, new b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f52371h.f121375b), null, new c(this, null), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] */
    public final f R2() {
        return (f) this.U.getValue();
    }
}
