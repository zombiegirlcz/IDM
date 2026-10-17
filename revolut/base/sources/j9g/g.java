package j9g;

import com.revolut.feature_travel_hotels_models.booking.request.HotelsPropertyBookingRequestStatus;
import com.revolut.feature_travel_hotels_models.booking.request.HotelsPropertyBookingTokenizedOrder;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f172331a = r0.k(new Pair("PENDING", tei.b.PENDING), new Pair("PROCESSING_BOOKING", tei.b.PROCESSING_BOOKING), new Pair("PROCESSING_PAYMENT", tei.b.PROCESSING_PAYMENT), new Pair("CONFIRMED", tei.b.CONFIRMED), new Pair("CANCELLED", tei.b.CANCELLED), new Pair("FAILED", tei.b.FAILED), new Pair("PARTIALLY_COMPLETED", tei.b.PARTIALLY_COMPLETED));

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public static final HotelsPropertyBookingRequestStatus a(r9g.l lVar) {
        HotelsPropertyBookingTokenizedOrder hotelsPropertyBookingTokenizedOrder;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        String id10 = lVar.getId();
        tei.b bVar = (tei.b) u1.t(lVar.getStatus(), tei.b.FAILED, f172331a);
        r9g.p tokenizedOrder = lVar.getTokenizedOrder();
        if (tokenizedOrder != null) {
            Intrinsics.checkNotNullParameter(tokenizedOrder, "<this>");
            hotelsPropertyBookingTokenizedOrder = new HotelsPropertyBookingTokenizedOrder(tokenizedOrder.getId(), tokenizedOrder.getToken());
        } else {
            hotelsPropertyBookingTokenizedOrder = null;
        }
        return new HotelsPropertyBookingRequestStatus(id10, bVar, hotelsPropertyBookingTokenizedOrder);
    }
}
