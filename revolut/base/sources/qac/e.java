package qac;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e extends q implements Function1 {
    public static final e f = new e();

    public e() {
        super(1, nac.a.class, "toDomain", "toDomain(Lcom/revolut/feature/revolutpay/order_tracking/impl/data/models/tracking/DeliveryCarriersDto;)Ljava/util/List;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        pac.d p0 = (pac.d) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        List deliveryCarriers = p0.getDeliveryCarriers();
        ArrayList arrayList = new ArrayList(w.t(deliveryCarriers, 10));
        Iterator it8 = deliveryCarriers.iterator();
        while (it8.hasNext()) {
            arrayList.add(nac.a.a((pac.c) it8.next()));
        }
        return arrayList;
    }
}
