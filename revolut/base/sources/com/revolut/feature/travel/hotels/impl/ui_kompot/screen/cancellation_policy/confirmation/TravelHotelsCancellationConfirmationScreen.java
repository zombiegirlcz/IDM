package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.confirmation;

import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.confirmation.TravelHotelsCancellationConfirmationContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.confirmation.TravelHotelsCancellationConfirmationScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import g9g.k;
import g9g.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rbg.b;
import rbg.c;
import rbg.f;
import rbg.h;
import rbg.i;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/cancellation_policy/confirmation/TravelHotelsCancellationConfirmationScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lrbg/c;", "Lrbg/b;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsCancellationConfirmationScreen extends BaseBottomSheetRecyclerController<c, b> {
    public static final /* synthetic */ int V = 0;
    public final TravelHotelsCancellationConfirmationContract$InputData Q;
    public final CellDetailsDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public TravelHotelsCancellationConfirmationScreen(TravelHotelsCancellationConfirmationContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.R = cellDetailsDelegate;
        this.S = u.c(cellDetailsDelegate);
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: rbg.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsCancellationConfirmationScreen f253056b;

            {
                this.f253056b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelHotelsCancellationConfirmationScreen travelHotelsCancellationConfirmationScreen = this.f253056b;
                switch (i2) {
                    case 0:
                        int i3 = TravelHotelsCancellationConfirmationScreen.V;
                        qji.b bVarU2 = travelHotelsCancellationConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.confirmation.di.TravelHotelsCancellationConfirmationInjector");
                        t tVar = (t) bVarU2;
                        g9g.d dVar = tVar.f141813b;
                        t tVar2 = tVar.f141814c;
                        TravelHotelsCancellationConfirmationContract$InputData travelHotelsCancellationConfirmationContract$InputData = travelHotelsCancellationConfirmationScreen.Q;
                        travelHotelsCancellationConfirmationContract$InputData.getClass();
                        return new g9g.k(dVar, tVar2, travelHotelsCancellationConfirmationContract$InputData);
                    default:
                        int i5 = TravelHotelsCancellationConfirmationScreen.V;
                        return (f) ((g9g.k) travelHotelsCancellationConfirmationScreen.T.getValue()).f141726c.get();
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: rbg.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsCancellationConfirmationScreen f253056b;

            {
                this.f253056b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelHotelsCancellationConfirmationScreen travelHotelsCancellationConfirmationScreen = this.f253056b;
                switch (i22) {
                    case 0:
                        int i3 = TravelHotelsCancellationConfirmationScreen.V;
                        qji.b bVarU2 = travelHotelsCancellationConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.confirmation.di.TravelHotelsCancellationConfirmationInjector");
                        t tVar = (t) bVarU2;
                        g9g.d dVar = tVar.f141813b;
                        t tVar2 = tVar.f141814c;
                        TravelHotelsCancellationConfirmationContract$InputData travelHotelsCancellationConfirmationContract$InputData = travelHotelsCancellationConfirmationScreen.Q;
                        travelHotelsCancellationConfirmationContract$InputData.getClass();
                        return new g9g.k(dVar, tVar2, travelHotelsCancellationConfirmationContract$InputData);
                    default:
                        int i5 = TravelHotelsCancellationConfirmationScreen.V;
                        return (f) ((g9g.k) travelHotelsCancellationConfirmationScreen.T.getValue()).f141726c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        a.g2(this, e3(), null, new h(this, continuation, 0), 3);
        a.g2(this, f3(), null, new h(this, continuation, 1), 3);
        a.g2(this, rd0.e.b(this.R.e), null, new i(this, null), 3);
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
