package b4g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s7g.e2;
import s7g.h2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.q implements Function1 {
    public static final i f = new i();

    public i() {
        super(1, c8g.a.class, "toDomain", "toDomain(Lcom/revolut/feature/travel/flights/models/dto/booking/TravelFlightBookingsResponseDto;)Lcom/revolut/feature/travel/flights/models/domain/booking/TravelFlightBookings;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        h2 p0 = (h2) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        List list = p0.f260735a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(c8g.a.K((e2) it8.next()));
        }
        List list2 = p0.f260736b;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            arrayList2.add(c8g.a.K((e2) it9.next()));
        }
        return new l7g.a0(arrayList, arrayList2);
    }
}
