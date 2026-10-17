package j9g;

import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentNewPricing;
import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentPrice;
import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentStatus;
import com.revolut.feature_travel_hotels_models.booking.request.HotelsPropertyBookingTokenizedOrder;
import kotlin.jvm.internal.Intrinsics;
import r9g.a0;
import r9g.g0;
import r9g.x;

/* JADX INFO: loaded from: classes9.dex */
public abstract class q {
    public static final TravelHotelsBookingAmendmentNewPricing a(a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        x overallPrice = a0Var.getOverallPrice();
        Intrinsics.checkNotNullParameter(overallPrice, "<this>");
        TravelHotelsBookingAmendmentPrice travelHotelsBookingAmendmentPrice = new TravelHotelsBookingAmendmentPrice(mo3.a.o(overallPrice.getBasePrice()), mo3.a.o(overallPrice.getInclusivePrice()));
        x priceInRequestedCurrency = a0Var.getPriceInRequestedCurrency();
        Intrinsics.checkNotNullParameter(priceInRequestedCurrency, "<this>");
        TravelHotelsBookingAmendmentPrice travelHotelsBookingAmendmentPrice2 = new TravelHotelsBookingAmendmentPrice(mo3.a.o(priceInRequestedCurrency.getBasePrice()), mo3.a.o(priceInRequestedCurrency.getInclusivePrice()));
        jo3.a pointsReward = a0Var.getPointsReward();
        dj0.d dVarO = pointsReward != null ? mo3.a.o(pointsReward) : null;
        ofi.d cashback = a0Var.getCashback();
        return new TravelHotelsBookingAmendmentNewPricing(travelHotelsBookingAmendmentPrice, travelHotelsBookingAmendmentPrice2, dVarO, cashback != null ? lfi.a.e(cashback) : null);
    }

    public static final TravelHotelsBookingAmendmentStatus b(g0 g0Var) {
        HotelsPropertyBookingTokenizedOrder hotelsPropertyBookingTokenizedOrder;
        qei.m mVar;
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        String id10 = g0Var.getId();
        String bookingId = g0Var.getBookingId();
        String status = g0Var.getStatus();
        qei.m[] mVarArrValues = qei.m.values();
        int length = mVarArrValues.length;
        int i = 0;
        while (true) {
            hotelsPropertyBookingTokenizedOrder = null;
            if (i >= length) {
                mVar = null;
                break;
            }
            mVar = mVarArrValues[i];
            if (kotlin.text.a0.z(mVar.name(), status, true)) {
                break;
            }
            i++;
        }
        if (mVar == null) {
            mVar = qei.m.UNKNOWN;
        }
        r9g.p tokenizedOrder = g0Var.getTokenizedOrder();
        if (tokenizedOrder != null) {
            Object obj2 = g.f172331a;
            Intrinsics.checkNotNullParameter(tokenizedOrder, "<this>");
            hotelsPropertyBookingTokenizedOrder = new HotelsPropertyBookingTokenizedOrder(tokenizedOrder.getId(), tokenizedOrder.getToken());
        }
        return new TravelHotelsBookingAmendmentStatus(id10, bookingId, mVar, hotelsPropertyBookingTokenizedOrder);
    }
}
