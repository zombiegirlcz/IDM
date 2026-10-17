package qac;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a extends q implements Function1 {
    public static final a f = new a();

    public a() {
        super(1, ofm.q.class, "toDomain", "toDomain(Lcom/revolut/feature/revolutpay/order_tracking/impl/data/models/flight/FlightBookingDto;)Lcom/revolut/feature/revolutpay/order_tracking/models/flight/FlightBooking;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        oac.a p0 = (oac.a) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ofm.q.Z(p0);
    }
}
