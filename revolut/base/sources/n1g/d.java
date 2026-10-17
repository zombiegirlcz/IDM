package n1g;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBooking;
import com.revolut.feature.travel.experiences.api.models.cancellation.TravelExperienceCancellationRefund;
import com.revolut.feature.travel.experiences.impl.ui.screen.booking_details.TravelExperiencesBookingDetailsScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreenContract$Mode;
import com.revolut.feature.travel.experiences.models.TravelExperienceCancellationPolicy;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesBookingDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TravelExperiencesBookingDetailsScreen travelExperiencesBookingDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesBookingDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f fVar = (f) this.v.f93017e0.getValue();
        Intrinsics.h(model);
        r rVar = (r) fVar;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        Object obj3 = model.u;
        if (Intrinsics.f(str, "CANCEL_BOOKING_ITEM_ID")) {
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBooking");
            TravelExperiencesBooking travelExperiencesBooking = (TravelExperiencesBooking) obj3;
            j60.a.v(rVar.f211342q, false, null, 3);
            TravelExperienceCancellationPolicy.Booking booking = travelExperiencesBooking.f92754n;
            Intrinsics.i(booking, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.models.TravelExperienceCancellationPolicy.Booking");
            String str2 = travelExperiencesBooking.f92746a;
            String str3 = travelExperiencesBooking.f92753m;
            Intrinsics.i(str3, "null cannot be cast to non-null type kotlin.String");
            TravelExperienceCancellationRefund travelExperienceCancellationRefund = travelExperiencesBooking.o;
            Intrinsics.i(travelExperienceCancellationRefund, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.api.models.cancellation.TravelExperienceCancellationRefund");
            yji.l.g2(rVar, new TravelExperiencesCancellationScreen(new TravelExperiencesCancellationScreenContract$InputData(new TravelExperiencesCancellationScreenContract$Mode.BookingCancellation(booking, str2, str3, travelExperienceCancellationRefund, travelExperiencesBooking.k.f92878a))), null, new n1.y(rVar, 4), 1);
        } else if (obj3 instanceof a3) {
            rVar.C1(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(ofm.q.P((a3) obj3), null, null, null, 126))));
        } else if (obj3 instanceof RevPointsTransaction) {
            rVar.C1(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenRevPointsTransactionDetails((RevPointsTransaction) obj3, null, false, null, true, 14)));
        }
        return Unit.f186387a;
    }
}
