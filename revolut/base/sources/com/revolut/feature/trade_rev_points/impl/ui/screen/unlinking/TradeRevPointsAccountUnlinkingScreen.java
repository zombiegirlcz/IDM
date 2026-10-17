package com.revolut.feature.trade_rev_points.impl.ui.screen.unlinking;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.k;
import com.revolut.feature.trade_rev_points.impl.ui.screen.unlinking.TradeRevPointsAccountUnlinkingScreen;
import com.revolut.feature.trade_rev_points.impl.ui.screen.unlinking.TradeRevPointsAccountUnlinkingScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import s2f.b;
import s2f.d;
import t1f.c;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/ui/screen/unlinking/TradeRevPointsAccountUnlinkingScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lcli/k;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TradeRevPointsAccountUnlinkingScreen extends BaseBottomSheetRecyclerController<q, k> {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(TradeRevPointsAccountUnlinkingScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final TradeRevPointsAccountUnlinkingScreenContract$InputData Q;
    public final h R;
    public final List S;
    public final Object T;
    public final Object U;

    public TradeRevPointsAccountUnlinkingScreen(TradeRevPointsAccountUnlinkingScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = s.t(this, b.f);
        this.S = m72.b.v(null, null, 7);
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: s2f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradeRevPointsAccountUnlinkingScreen f259305b;

            {
                this.f259305b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TradeRevPointsAccountUnlinkingScreen tradeRevPointsAccountUnlinkingScreen = this.f259305b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TradeRevPointsAccountUnlinkingScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(tradeRevPointsAccountUnlinkingScreen.m2()).a().get(t1f.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t1f.h.class, " is not found"));
                        }
                        t1f.h hVar = ((t1f.h) aVar2.b()).u;
                        TradeRevPointsAccountUnlinkingScreenContract$InputData tradeRevPointsAccountUnlinkingScreenContract$InputData = tradeRevPointsAccountUnlinkingScreen.Q;
                        tradeRevPointsAccountUnlinkingScreenContract$InputData.getClass();
                        return new t1f.c(hVar, tradeRevPointsAccountUnlinkingScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr2 = TradeRevPointsAccountUnlinkingScreen.V;
                        return (d) ((t1f.c) tradeRevPointsAccountUnlinkingScreen.T.getValue()).f267283c.get();
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: s2f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradeRevPointsAccountUnlinkingScreen f259305b;

            {
                this.f259305b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TradeRevPointsAccountUnlinkingScreen tradeRevPointsAccountUnlinkingScreen = this.f259305b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TradeRevPointsAccountUnlinkingScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(tradeRevPointsAccountUnlinkingScreen.m2()).a().get(t1f.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t1f.h.class, " is not found"));
                        }
                        t1f.h hVar = ((t1f.h) aVar2.b()).u;
                        TradeRevPointsAccountUnlinkingScreenContract$InputData tradeRevPointsAccountUnlinkingScreenContract$InputData = tradeRevPointsAccountUnlinkingScreen.Q;
                        tradeRevPointsAccountUnlinkingScreenContract$InputData.getClass();
                        return new t1f.c(hVar, tradeRevPointsAccountUnlinkingScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr2 = TradeRevPointsAccountUnlinkingScreen.V;
                        return (d) ((t1f.c) tradeRevPointsAccountUnlinkingScreen.T.getValue()).f267283c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
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
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((jii.e) value).f174513b.f), new s2f.c(this, continuation, 0), 3);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((jii.e) value2).f174513b.f58955g), new s2f.c(this, continuation, 1), 3);
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
