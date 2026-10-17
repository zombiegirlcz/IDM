package com.revolut.feature.travel.flights.impl.ui.screen.baggage_info;

import aii.q;
import android.view.View;
import cli.k;
import com.revolut.feature.travel.flights.impl.ui.screen.baggage_info.TravelFlightsBaggageInfoScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.baggage_info.TravelFlightsBaggageInfoScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import f4g.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import t05.m;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/baggage_info/TravelFlightsBaggageInfoScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lcli/k;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsBaggageInfoScreen extends BaseBottomSheetRecyclerController<q, k> {
    public static final /* synthetic */ int U = 0;
    public final TravelFlightsBaggageInfoScreenContract$InputData Q;
    public final List R;
    public final Object S;
    public final Object T;

    public TravelFlightsBaggageInfoScreen(TravelFlightsBaggageInfoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = b.v(null, null, 7);
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: t4g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsBaggageInfoScreen f267988b;

            {
                this.f267988b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelFlightsBaggageInfoScreen travelFlightsBaggageInfoScreen = this.f267988b;
                switch (i2) {
                    case 0:
                        int i3 = TravelFlightsBaggageInfoScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsBaggageInfoScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        TravelFlightsBaggageInfoScreenContract$InputData travelFlightsBaggageInfoScreenContract$InputData = travelFlightsBaggageInfoScreen.Q;
                        travelFlightsBaggageInfoScreenContract$InputData.getClass();
                        return new f4g.c(bVar, travelFlightsBaggageInfoScreenContract$InputData);
                    default:
                        int i5 = TravelFlightsBaggageInfoScreen.U;
                        return (b) ((f4g.c) travelFlightsBaggageInfoScreen.S.getValue()).f132079c.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: t4g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsBaggageInfoScreen f267988b;

            {
                this.f267988b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelFlightsBaggageInfoScreen travelFlightsBaggageInfoScreen = this.f267988b;
                switch (i22) {
                    case 0:
                        int i3 = TravelFlightsBaggageInfoScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsBaggageInfoScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        TravelFlightsBaggageInfoScreenContract$InputData travelFlightsBaggageInfoScreenContract$InputData = travelFlightsBaggageInfoScreen.Q;
                        travelFlightsBaggageInfoScreenContract$InputData.getClass();
                        return new f4g.c(bVar, travelFlightsBaggageInfoScreenContract$InputData);
                    default:
                        int i5 = TravelFlightsBaggageInfoScreen.U;
                        return (b) ((f4g.c) travelFlightsBaggageInfoScreen.S.getValue()).f132079c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (t4g.b) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new m(this, null, 7), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (t4g.b) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.R;
    }
}
