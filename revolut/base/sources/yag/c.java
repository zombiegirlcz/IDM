package yag;

import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.TravelHotelsCheckoutFlowContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.TravelHotelsFlowContract$Step;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.TravelHotelsFlowContract$Step$DatesPicker$InFlow;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.TravelHotelsFlowContract$Step$DatesPicker$Modal;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.a;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit.TravelHotelsTravellerInformationEditScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import hbg.m;
import hbg.n;
import hbg.o;
import hbg.p;
import hbg.q;
import hbg.r;
import hbg.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import ycg.f;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f312015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b f312016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yki.b f312017c;
    public final /* synthetic */ TravelHotelsFlowContract$Step d;

    public /* synthetic */ c(TravelHotelsFlowContract$Step travelHotelsFlowContract$Step, com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar, yki.b bVar2, int i) {
        this.f312015a = i;
        this.d = travelHotelsFlowContract$Step;
        this.f312016b = bVar;
        this.f312017c = bVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f312015a) {
            case 0:
                f it8 = (f) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                TravelHotelsFlowContract$Step travelHotelsFlowContract$Step = ((TravelHotelsFlowContract$Step$DatesPicker$Modal) this.d).f93784b;
                if (travelHotelsFlowContract$Step != null) {
                    h.t2(this.f312016b, this.f312017c, travelHotelsFlowContract$Step, true, null, false, 12);
                }
                return Unit.f186387a;
            case 1:
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.a output = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean z = output instanceof q;
                com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar = this.f312016b;
                yki.b bVar2 = this.f312017c;
                if (z) {
                    h.t2(bVar, bVar2, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(((q) output).f150714a, false, false, 30)), true, null, false, 12);
                } else if (output instanceof o) {
                    h.t2(bVar, bVar2, new TravelHotelsFlowContract$Step.Policies(((o) output).f150712a), true, null, false, 12);
                } else if (output instanceof s) {
                    h.t2(bVar, bVar2, new TravelHotelsFlowContract$Step.TravellerInfo(new TravelHotelsTravellerInformationEditScreenContract$InputData.Booking(((s) output).f150716a)), true, null, false, 12);
                } else if (output instanceof r) {
                    h.t2(bVar, bVar2, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.RoomDetails(((r) output).f150715a)), true, null, false, 12);
                } else if (output instanceof p) {
                    h.w2(bVar.f93798q, new TravelHotelsFlowContract$Step.PriceBreakdown(((p) output).f150713a), ModalDestination.Style.POPUP.f98311a);
                } else if (output instanceof n) {
                    h.t2(bVar, bVar2, new TravelHotelsFlowContract$Step.MapPreview(((n) output).f150711a), true, null, false, 12);
                } else if (output instanceof m) {
                    h.t2(bVar, bVar2, new TravelHotelsFlowContract$Step.CancellationPolicy(((m) output).f150709a), true, null, false, 12);
                } else {
                    if (!(output instanceof a.C0568a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h.t2(bVar, bVar2, new TravelHotelsFlowContract$Step.BookingAmendment(((TravelHotelsFlowContract$Step.BookingDetails) this.d).f93777a.f93646a), true, null, false, 12);
                }
                return Unit.f186387a;
            default:
                f it9 = (f) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                TravelHotelsFlowContract$Step travelHotelsFlowContract$Step2 = ((TravelHotelsFlowContract$Step$DatesPicker$InFlow) this.d).f93782b;
                com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar3 = this.f312016b;
                if (travelHotelsFlowContract$Step2 != null) {
                    h.t2(bVar3, this.f312017c, travelHotelsFlowContract$Step2, false, null, false, 12);
                } else {
                    bVar3.B2();
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ c(com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar, yki.b bVar2, TravelHotelsFlowContract$Step travelHotelsFlowContract$Step) {
        this.f312015a = 1;
        this.f312016b = bVar;
        this.f312017c = bVar2;
        this.d = travelHotelsFlowContract$Step;
    }
}
