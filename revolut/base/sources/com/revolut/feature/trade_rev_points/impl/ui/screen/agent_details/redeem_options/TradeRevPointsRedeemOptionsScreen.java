package com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.redeem_options;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.k;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.redeem_options.TradeRevPointsRedeemOptionsScreen;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.redeem_options.TradeRevPointsRedeemOptionsScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import gqh.o;
import h2f.b;
import h2f.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import t1f.e;
import t1f.j;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/ui/screen/agent_details/redeem_options/TradeRevPointsRedeemOptionsScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lcli/k;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TradeRevPointsRedeemOptionsScreen extends BaseBottomSheetRecyclerController<q, k> {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(TradeRevPointsRedeemOptionsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final TradeRevPointsRedeemOptionsScreenContract$InputData Q;
    public final h R;
    public final List S;
    public final Object T;
    public final Object U;

    public TradeRevPointsRedeemOptionsScreen(TradeRevPointsRedeemOptionsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = s.t(this, b.f);
        this.S = m72.b.v(null, null, 7);
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: h2f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradeRevPointsRedeemOptionsScreen f148816b;

            {
                this.f148816b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TradeRevPointsRedeemOptionsScreen tradeRevPointsRedeemOptionsScreen = this.f148816b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TradeRevPointsRedeemOptionsScreen.V;
                        qji.b bVarU2 = tradeRevPointsRedeemOptionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.redeem_options.di.TradeRevPointsRedeemOptionsScreenInjector");
                        e eVar = (e) bVarU2;
                        t1f.h hVar = eVar.f267288b;
                        e eVar2 = eVar.f267289c;
                        TradeRevPointsRedeemOptionsScreenContract$InputData tradeRevPointsRedeemOptionsScreenContract$InputData = tradeRevPointsRedeemOptionsScreen.Q;
                        tradeRevPointsRedeemOptionsScreenContract$InputData.getClass();
                        return new j(hVar, eVar2, tradeRevPointsRedeemOptionsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr2 = TradeRevPointsRedeemOptionsScreen.V;
                        return (c) ((j) tradeRevPointsRedeemOptionsScreen.T.getValue()).f267318c.get();
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: h2f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradeRevPointsRedeemOptionsScreen f148816b;

            {
                this.f148816b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TradeRevPointsRedeemOptionsScreen tradeRevPointsRedeemOptionsScreen = this.f148816b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TradeRevPointsRedeemOptionsScreen.V;
                        qji.b bVarU2 = tradeRevPointsRedeemOptionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.redeem_options.di.TradeRevPointsRedeemOptionsScreenInjector");
                        e eVar = (e) bVarU2;
                        t1f.h hVar = eVar.f267288b;
                        e eVar2 = eVar.f267289c;
                        TradeRevPointsRedeemOptionsScreenContract$InputData tradeRevPointsRedeemOptionsScreenContract$InputData = tradeRevPointsRedeemOptionsScreen.Q;
                        tradeRevPointsRedeemOptionsScreenContract$InputData.getClass();
                        return new j(hVar, eVar2, tradeRevPointsRedeemOptionsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr2 = TradeRevPointsRedeemOptionsScreen.V;
                        return (c) ((j) tradeRevPointsRedeemOptionsScreen.T.getValue()).f267318c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.R.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((jii.e) value).f174513b.f), new o(this, null, 12), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (c) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getQ() {
        return this.S;
    }
}
