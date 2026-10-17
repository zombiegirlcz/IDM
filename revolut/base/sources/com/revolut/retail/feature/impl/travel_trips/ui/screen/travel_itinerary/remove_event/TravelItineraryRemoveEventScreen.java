package com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.remove_event;

import a0.d;
import aii.q;
import android.view.View;
import cli.k;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.remove_event.TravelItineraryRemoveEventContract$InputData;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.remove_event.TravelItineraryRemoveEventScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import mta.c;
import te0.w;
import ue0.e;
import xuj.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/remove_event/TravelItineraryRemoveEventScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lcli/k;", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelItineraryRemoveEventScreen extends BaseBottomSheetRecyclerController<q, k> {
    public static final /* synthetic */ int U = 0;
    public final TravelItineraryRemoveEventContract$InputData Q;
    public final Object R;
    public final Object S;
    public final List T;

    public TravelItineraryRemoveEventScreen(TravelItineraryRemoveEventContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: mvj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelItineraryRemoveEventScreen f209264b;

            {
                this.f209264b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelItineraryRemoveEventScreen travelItineraryRemoveEventScreen = this.f209264b;
                switch (i2) {
                    case 0:
                        int i3 = TravelItineraryRemoveEventScreen.U;
                        phm.a aVar = (phm.a) e.j(travelItineraryRemoveEventScreen.m2()).a().get(i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", i.class, " is not found"));
                        }
                        i iVar = ((i) aVar2.b()).f309099m;
                        TravelItineraryRemoveEventContract$InputData travelItineraryRemoveEventContract$InputData = travelItineraryRemoveEventScreen.Q;
                        travelItineraryRemoveEventContract$InputData.getClass();
                        return new xuj.e(iVar, travelItineraryRemoveEventContract$InputData);
                    default:
                        int i5 = TravelItineraryRemoveEventScreen.U;
                        return (b) ((xuj.e) travelItineraryRemoveEventScreen.R.getValue()).f309084b.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: mvj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelItineraryRemoveEventScreen f209264b;

            {
                this.f209264b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelItineraryRemoveEventScreen travelItineraryRemoveEventScreen = this.f209264b;
                switch (i22) {
                    case 0:
                        int i3 = TravelItineraryRemoveEventScreen.U;
                        phm.a aVar = (phm.a) e.j(travelItineraryRemoveEventScreen.m2()).a().get(i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", i.class, " is not found"));
                        }
                        i iVar = ((i) aVar2.b()).f309099m;
                        TravelItineraryRemoveEventContract$InputData travelItineraryRemoveEventContract$InputData = travelItineraryRemoveEventScreen.Q;
                        travelItineraryRemoveEventContract$InputData.getClass();
                        return new xuj.e(iVar, travelItineraryRemoveEventContract$InputData);
                    default:
                        int i5 = TravelItineraryRemoveEventScreen.U;
                        return (b) ((xuj.e) travelItineraryRemoveEventScreen.R.getValue()).f309084b.get();
                }
            }
        });
        this.T = b.v(null, null, 7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (xuj.e) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (mvj.b) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new c(this, null, 5), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (mvj.b) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
