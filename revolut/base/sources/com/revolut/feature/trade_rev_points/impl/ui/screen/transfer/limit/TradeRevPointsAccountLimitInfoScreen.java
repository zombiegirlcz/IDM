package com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.limit;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.k;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.limit.TradeRevPointsAccountLimitInfoScreen;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.limit.TradeRevPointsAccountLimitInfoScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import q2f.b;
import q2f.c;
import q2f.d;
import t1f.a;
import te0.w;
import vc.s;
import wp5.y;
import xki.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/ui/screen/transfer/limit/TradeRevPointsAccountLimitInfoScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lcli/k;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TradeRevPointsAccountLimitInfoScreen extends BaseBottomSheetRecyclerController<q, k> {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(TradeRevPointsAccountLimitInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final TradeRevPointsAccountLimitInfoScreenContract$InputData Q;
    public final h R;
    public final List S;
    public final Object T;
    public final Object U;

    public TradeRevPointsAccountLimitInfoScreen(TradeRevPointsAccountLimitInfoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = s.t(this, b.f);
        this.S = y.w();
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: q2f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradeRevPointsAccountLimitInfoScreen f241638b;

            {
                this.f241638b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TradeRevPointsAccountLimitInfoScreen tradeRevPointsAccountLimitInfoScreen = this.f241638b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TradeRevPointsAccountLimitInfoScreen.V;
                        qji.b bVarU2 = tradeRevPointsAccountLimitInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.limit.di.TradeRevPointsAccountLimitInfoScreenInjector");
                        t1f.e eVar = (t1f.e) bVarU2;
                        t1f.h hVar = eVar.f267288b;
                        t1f.e eVar2 = eVar.f267289c;
                        TradeRevPointsAccountLimitInfoScreenContract$InputData tradeRevPointsAccountLimitInfoScreenContract$InputData = tradeRevPointsAccountLimitInfoScreen.Q;
                        tradeRevPointsAccountLimitInfoScreenContract$InputData.getClass();
                        return new t1f.a(hVar, eVar2, tradeRevPointsAccountLimitInfoScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr2 = TradeRevPointsAccountLimitInfoScreen.V;
                        return (d) ((t1f.a) tradeRevPointsAccountLimitInfoScreen.T.getValue()).f267278c.get();
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: q2f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradeRevPointsAccountLimitInfoScreen f241638b;

            {
                this.f241638b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TradeRevPointsAccountLimitInfoScreen tradeRevPointsAccountLimitInfoScreen = this.f241638b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TradeRevPointsAccountLimitInfoScreen.V;
                        qji.b bVarU2 = tradeRevPointsAccountLimitInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.limit.di.TradeRevPointsAccountLimitInfoScreenInjector");
                        t1f.e eVar = (t1f.e) bVarU2;
                        t1f.h hVar = eVar.f267288b;
                        t1f.e eVar2 = eVar.f267289c;
                        TradeRevPointsAccountLimitInfoScreenContract$InputData tradeRevPointsAccountLimitInfoScreenContract$InputData = tradeRevPointsAccountLimitInfoScreen.Q;
                        tradeRevPointsAccountLimitInfoScreenContract$InputData.getClass();
                        return new t1f.a(hVar, eVar2, tradeRevPointsAccountLimitInfoScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr2 = TradeRevPointsAccountLimitInfoScreen.V;
                        return (d) ((t1f.a) tradeRevPointsAccountLimitInfoScreen.T.getValue()).f267278c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (d) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = V;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.R;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((jii.e) value).f174513b.f), null, new c(this, null, 0), 3);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((jii.e) value2).f174513b.f58955g), null, new c(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (d) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
