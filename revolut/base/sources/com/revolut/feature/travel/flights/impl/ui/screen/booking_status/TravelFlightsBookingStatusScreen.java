package com.revolut.feature.travel.flights.impl.ui.screen.booking_status;

import android.content.Context;
import android.view.View;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalLoadingV2Delegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.flights.impl.ui.screen.booking_status.TravelFlightsBookingStatusScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.booking_status.TravelFlightsBookingStatusScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import d5g.c;
import d5g.d;
import f4g.f;
import java.util.List;
import kli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/booking_status/TravelFlightsBookingStatusScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Ld5g/d;", "Ld5g/c;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsBookingStatusScreen extends BaseBottomSheetRecyclerController<d, c> {
    public static final /* synthetic */ int U = 0;
    public final TravelFlightsBookingStatusScreenContract$InputData Q;
    public final List R;
    public final Object S;
    public final Object T;

    public TravelFlightsBookingStatusScreen(TravelFlightsBookingStatusScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        final int i2 = 1;
        this.R = v.k(new ProgressStepVerticalLoadingV2Delegate(), new ProgressStepVerticalV2Delegate());
        this.S = w.y0(new Function0(this) { // from class: d5g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsBookingStatusScreen f111413b;

            {
                this.f111413b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                TravelFlightsBookingStatusScreen travelFlightsBookingStatusScreen = this.f111413b;
                switch (i3) {
                    case 0:
                        int i5 = TravelFlightsBookingStatusScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsBookingStatusScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        TravelFlightsBookingStatusScreenContract$InputData travelFlightsBookingStatusScreenContract$InputData = travelFlightsBookingStatusScreen.Q;
                        travelFlightsBookingStatusScreenContract$InputData.getClass();
                        return new f4g.f(bVar, travelFlightsBookingStatusScreenContract$InputData);
                    default:
                        int i6 = TravelFlightsBookingStatusScreen.U;
                        return (e) ((f4g.f) travelFlightsBookingStatusScreen.S.getValue()).f132111c.get();
                }
            }
        });
        this.T = w.y0(new Function0(this) { // from class: d5g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsBookingStatusScreen f111413b;

            {
                this.f111413b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                TravelFlightsBookingStatusScreen travelFlightsBookingStatusScreen = this.f111413b;
                switch (i3) {
                    case 0:
                        int i5 = TravelFlightsBookingStatusScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsBookingStatusScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        TravelFlightsBookingStatusScreenContract$InputData travelFlightsBookingStatusScreenContract$InputData = travelFlightsBookingStatusScreen.Q;
                        travelFlightsBookingStatusScreenContract$InputData.getClass();
                        return new f4g.f(bVar, travelFlightsBookingStatusScreenContract$InputData);
                    default:
                        int i6 = TravelFlightsBookingStatusScreen.U;
                        return (e) ((f4g.f) travelFlightsBookingStatusScreen.S.getValue()).f132111c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (d5g.e) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController, com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.Y2(view);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setBackgroundColor(a.s(R$attr.uikit_colorElevatedGroupedBackground, context));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new d5g.b(this, null, 0), 3);
        ViewController.P2(this, f3(), new d5g.b(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (d5g.e) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getV() {
        return this.R;
    }
}
