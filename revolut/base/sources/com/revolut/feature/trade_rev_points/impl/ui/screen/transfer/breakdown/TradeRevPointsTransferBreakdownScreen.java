package com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreen;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import n2f.b;
import n2f.c;
import n2f.d;
import t1f.k;
import te0.w;
import vc.s;
import wp5.y;
import xki.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/ui/screen/transfer/breakdown/TradeRevPointsTransferBreakdownScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Ln2f/c;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TradeRevPointsTransferBreakdownScreen extends BaseBottomSheetRecyclerController<q, c> {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(TradeRevPointsTransferBreakdownScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final TradeRevPointsTransferBreakdownScreenContract$InputData Q;
    public final h R;
    public final Object S;
    public final Object T;

    public TradeRevPointsTransferBreakdownScreen(TradeRevPointsTransferBreakdownScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = s.t(this, b.f);
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: n2f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradeRevPointsTransferBreakdownScreen f211533b;

            {
                this.f211533b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TradeRevPointsTransferBreakdownScreen tradeRevPointsTransferBreakdownScreen = this.f211533b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TradeRevPointsTransferBreakdownScreen.U;
                        qji.b bVarU2 = tradeRevPointsTransferBreakdownScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.di.TradeRevPointsTransferBreakdownScreenInjector");
                        t1f.e eVar = (t1f.e) bVarU2;
                        t1f.h hVar = eVar.f267288b;
                        t1f.e eVar2 = eVar.f267289c;
                        TradeRevPointsTransferBreakdownScreenContract$InputData tradeRevPointsTransferBreakdownScreenContract$InputData = tradeRevPointsTransferBreakdownScreen.Q;
                        tradeRevPointsTransferBreakdownScreenContract$InputData.getClass();
                        return new k(hVar, eVar2, tradeRevPointsTransferBreakdownScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr2 = TradeRevPointsTransferBreakdownScreen.U;
                        return (d) ((k) tradeRevPointsTransferBreakdownScreen.S.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: n2f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradeRevPointsTransferBreakdownScreen f211533b;

            {
                this.f211533b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TradeRevPointsTransferBreakdownScreen tradeRevPointsTransferBreakdownScreen = this.f211533b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TradeRevPointsTransferBreakdownScreen.U;
                        qji.b bVarU2 = tradeRevPointsTransferBreakdownScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.di.TradeRevPointsTransferBreakdownScreenInjector");
                        t1f.e eVar = (t1f.e) bVarU2;
                        t1f.h hVar = eVar.f267288b;
                        t1f.e eVar2 = eVar.f267289c;
                        TradeRevPointsTransferBreakdownScreenContract$InputData tradeRevPointsTransferBreakdownScreenContract$InputData = tradeRevPointsTransferBreakdownScreen.Q;
                        tradeRevPointsTransferBreakdownScreenContract$InputData.getClass();
                        return new k(hVar, eVar2, tradeRevPointsTransferBreakdownScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr2 = TradeRevPointsTransferBreakdownScreen.U;
                        return (d) ((k) tradeRevPointsTransferBreakdownScreen.S.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (d) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((jii.e) value).f174513b.f), null, new mta.c(this, null, 14), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (d) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getQ() {
        return y.w();
    }
}
