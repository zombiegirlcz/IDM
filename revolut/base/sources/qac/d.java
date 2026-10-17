package qac;

import com.revolut.feature.revolutpay.order_tracking.models.delivery.Delivery;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.DeliveryWithOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import pac.f;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d extends q implements Function1 {
    public static final d f = new d();

    public d() {
        super(1, nac.a.class, "toDomain", "toDomain(Lcom/revolut/feature/revolutpay/order_tracking/impl/data/models/tracking/DeliveriesDto;)Lcom/revolut/feature/revolutpay/order_tracking/models/delivery/Deliveries;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        f.c order;
        pac.a p0 = (pac.a) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        int totalCount = p0.getTotalCount();
        List<pac.f> deliveries = p0.getDeliveries();
        ArrayList arrayList = new ArrayList();
        for (pac.f fVar : deliveries) {
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            Delivery deliveryB = nac.a.b(fVar);
            DeliveryWithOrder deliveryWithOrder = null;
            if (deliveryB != null && (order = fVar.getOrder()) != null) {
                Intrinsics.checkNotNullParameter(order, "<this>");
                DeliveryWithOrder.Order order2 = new DeliveryWithOrder.Order(order.getId(), order.getNumber());
                f.b merchant = fVar.getMerchant();
                if (merchant != null) {
                    Intrinsics.checkNotNullParameter(merchant, "<this>");
                    deliveryWithOrder = new DeliveryWithOrder(deliveryB, order2, new DeliveryWithOrder.Merchant(merchant.getName(), merchant.getLogoUrl()));
                }
            }
            if (deliveryWithOrder != null) {
                arrayList.add(deliveryWithOrder);
            }
        }
        return new wbc.a(totalCount, arrayList);
    }
}
