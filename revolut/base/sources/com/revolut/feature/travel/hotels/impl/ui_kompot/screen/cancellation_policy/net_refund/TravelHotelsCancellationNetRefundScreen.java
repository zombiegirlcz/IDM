package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.net_refund;

import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.net_refund.TravelHotelsCancellationNetRefundScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.net_refund.TravelHotelsCancellationNetRefundScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import g9g.l;
import g9g.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import ubg.c;
import ubg.e;
import ubg.f;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/cancellation_policy/net_refund/TravelHotelsCancellationNetRefundScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lubg/e;", "Lubg/c;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsCancellationNetRefundScreen extends BaseBottomSheetRecyclerController<e, c> {
    public static final /* synthetic */ int V = 0;
    public final TravelHotelsCancellationNetRefundScreenContract$InputData Q;
    public final CellDetailsDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public TravelHotelsCancellationNetRefundScreen(TravelHotelsCancellationNetRefundScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.R = cellDetailsDelegate;
        this.S = u.c(cellDetailsDelegate);
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: ubg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsCancellationNetRefundScreen f278891b;

            {
                this.f278891b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelHotelsCancellationNetRefundScreen travelHotelsCancellationNetRefundScreen = this.f278891b;
                switch (i2) {
                    case 0:
                        int i3 = TravelHotelsCancellationNetRefundScreen.V;
                        qji.b bVarU2 = travelHotelsCancellationNetRefundScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.net_refund.di.TravelHotelsCancellationNetRefundScreenInjector");
                        t tVar = (t) bVarU2;
                        g9g.d dVar = tVar.f141813b;
                        t tVar2 = tVar.f141814c;
                        TravelHotelsCancellationNetRefundScreenContract$InputData travelHotelsCancellationNetRefundScreenContract$InputData = travelHotelsCancellationNetRefundScreen.Q;
                        travelHotelsCancellationNetRefundScreenContract$InputData.getClass();
                        return new l(dVar, tVar2, travelHotelsCancellationNetRefundScreenContract$InputData);
                    default:
                        int i5 = TravelHotelsCancellationNetRefundScreen.V;
                        return (f) ((l) travelHotelsCancellationNetRefundScreen.T.getValue()).f141732b.get();
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: ubg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsCancellationNetRefundScreen f278891b;

            {
                this.f278891b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelHotelsCancellationNetRefundScreen travelHotelsCancellationNetRefundScreen = this.f278891b;
                switch (i22) {
                    case 0:
                        int i3 = TravelHotelsCancellationNetRefundScreen.V;
                        qji.b bVarU2 = travelHotelsCancellationNetRefundScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.net_refund.di.TravelHotelsCancellationNetRefundScreenInjector");
                        t tVar = (t) bVarU2;
                        g9g.d dVar = tVar.f141813b;
                        t tVar2 = tVar.f141814c;
                        TravelHotelsCancellationNetRefundScreenContract$InputData travelHotelsCancellationNetRefundScreenContract$InputData = travelHotelsCancellationNetRefundScreen.Q;
                        travelHotelsCancellationNetRefundScreenContract$InputData.getClass();
                        return new l(dVar, tVar2, travelHotelsCancellationNetRefundScreenContract$InputData);
                    default:
                        int i5 = TravelHotelsCancellationNetRefundScreen.V;
                        return (f) ((l) travelHotelsCancellationNetRefundScreen.T.getValue()).f141732b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (l) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (f) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, rd0.e.b(this.R.e), null, new ubg.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (f) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
