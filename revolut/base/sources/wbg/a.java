package wbg;

import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentCost;
import com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption;
import com.revolut.feature_travel_hotels_models.property.OverallPrice;
import com.revolut.feature_travel_hotels_models.property.Pricing;
import com.revolut.feature_travel_hotels_models.property.room.TravelHotelsRatePricing;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static ecg.e a(cgi.k selectedBed, HotelsPointsRedeemOption hotelsPointsRedeemOption) {
        ecg.e bVar;
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(selectedBed, "selectedBed");
        TravelHotelsRatePricing travelHotelsRatePricingC = selectedBed.b().c().c();
        if (travelHotelsRatePricingC instanceof Pricing) {
            Pricing pricing = (Pricing) travelHotelsRatePricingC;
            OverallPrice overallPrice = pricing.d;
            if (overallPrice == null || (dVar = overallPrice.f98058b) == null) {
                dVar = pricing.f98068c.f98058b;
            }
            bVar = new ecg.b(dVar);
        } else {
            boolean z = travelHotelsRatePricingC instanceof TravelHotelsBookingAmendmentCost;
            ecg.d dVar2 = ecg.d.f124730a;
            if (z) {
                TravelHotelsBookingAmendmentCost travelHotelsBookingAmendmentCost = (TravelHotelsBookingAmendmentCost) travelHotelsRatePricingC;
                if (travelHotelsBookingAmendmentCost instanceof TravelHotelsBookingAmendmentCost.NewPrice) {
                    bVar = new ecg.b(((TravelHotelsBookingAmendmentCost.NewPrice) travelHotelsBookingAmendmentCost).f97848a.f97863b.f97869b);
                } else if (travelHotelsBookingAmendmentCost instanceof TravelHotelsBookingAmendmentCost.Unchanged) {
                    bVar = ecg.a.f124727a;
                } else if (travelHotelsBookingAmendmentCost instanceof TravelHotelsBookingAmendmentCost.AmountOwed) {
                    bVar = new ecg.b(((TravelHotelsBookingAmendmentCost.AmountOwed) travelHotelsBookingAmendmentCost).f97845a.f97843b.f97865a);
                } else if (travelHotelsBookingAmendmentCost instanceof TravelHotelsBookingAmendmentCost.Refund) {
                    bVar = ecg.c.f124729a;
                } else if (!(travelHotelsBookingAmendmentCost instanceof TravelHotelsBookingAmendmentCost.Unknown)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Unknown pricing: " + travelHotelsRatePricingC);
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            }
            bVar = dVar2;
        }
        if (hotelsPointsRedeemOption == null) {
            return bVar;
        }
        dj0.d dVar3 = hotelsPointsRedeemOption.f97977c;
        if (!(bVar instanceof ecg.b)) {
            if ((bVar instanceof ecg.a) || (bVar instanceof ecg.c) || (bVar instanceof ecg.d)) {
                return bVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        ecg.b bVar2 = (ecg.b) bVar;
        dj0.d dVar4 = bVar2.f124728a;
        if (Intrinsics.f(dVar4.f115083b, dVar3.f115083b)) {
            dj0.d total = pyd.c.H(dVar4, dVar3);
            Intrinsics.checkNotNullParameter(total, "total");
            return new ecg.b(total);
        }
        IllegalStateException illegalStateException2 = new IllegalStateException(j6.a.s("Unexpected currency: Booking price currency (", dVar4.f115083b.f306286a, ") and points discount currency (", dVar3.f115083b.f306286a, ") should match."));
        zhm.h0 h0Var2 = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
        return bVar2;
    }
}
