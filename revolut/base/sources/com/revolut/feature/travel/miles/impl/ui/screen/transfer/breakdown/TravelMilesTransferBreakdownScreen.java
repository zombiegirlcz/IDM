package com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import q97.p1;
import qg4.d;
import qig.b;
import qig.c;
import te0.w;
import ufg.i0;
import vc.s;
import wp5.y;
import xki.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/transfer/breakdown/TravelMilesTransferBreakdownScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lqig/b;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelMilesTransferBreakdownScreen extends BaseBottomSheetRecyclerController<q, b> {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TravelMilesTransferBreakdownScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final h Q;
    public final Object R;
    public final Object S;

    public TravelMilesTransferBreakdownScreen(TravelMilesTransferBreakdownScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = s.t(this, qig.a.f);
        this.R = w.y0(new qba.b(this, inputData, 12));
        this.S = w.y0(new p1(this, 9));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i0) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((jii.e) value).f174513b.f), null, new d(this, null, 6), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b d() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getR() {
        return y.w();
    }
}
