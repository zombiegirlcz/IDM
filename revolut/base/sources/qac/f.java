package qac;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.Delivery;
import com.revolut.feature.revolutpay.shipping.api.domain.models.deliverymethod.DeliveryMethods;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import pac.j;
import pac.k;
import pac.l;
import pac.m;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f extends q implements Function1 {
    public static final f f = new f();

    public f() {
        super(1, nac.a.class, "toDomain", "toDomain(Lcom/revolut/feature/revolutpay/order_tracking/impl/data/models/tracking/TrackingOrderDetailsDto;)Lcom/revolut/feature/revolutpay/order_tracking/models/delivery/TrackingOrderDetails;", 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r31v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v3 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        m mVar;
        DeliveryMethods.DeliveryMethod deliveryMethod;
        m mVar2;
        ?? arrayList;
        ?? r322;
        String str;
        String str2;
        ArrayList arrayList2;
        pac.i iVar;
        LocalDateTime localDateTime;
        ArrayList arrayList3;
        m p0 = (m) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        String str3 = "<this>";
        Intrinsics.checkNotNullParameter(p0, "<this>");
        String orderId = p0.getOrderId();
        String orderNumber = p0.getOrderNumber();
        Instant instant = Instant.parse(p0.getPaymentDate());
        Intrinsics.checkNotNullExpressionValue(instant, "parse(...)");
        LocalDateTime localDateTimeZ = oi0.d.Z(instant);
        String orderManagementUrl = p0.getOrderManagementUrl();
        boolean supportsDeliveries = p0.getSupportsDeliveries();
        String receiptUrl = p0.getReceiptUrl();
        l merchant = p0.getMerchant();
        Intrinsics.checkNotNullParameter(merchant, "<this>");
        wbc.h hVar = new wbc.h(merchant.getName(), merchant.getLogoUrl(), merchant.getPolicyUrl(), merchant.getStoreUrl());
        String customerFullName = p0.getCustomerFullName();
        List transactionIds = p0.getTransactionIds();
        if (transactionIds == null) {
            transactionIds = f0.f322471a;
        }
        List list = transactionIds;
        List pointsTransactionIds = p0.getPointsTransactionIds();
        if (pointsTransactionIds == null) {
            pointsTransactionIds = f0.f322471a;
        }
        List list2 = pointsTransactionIds;
        m.b deliveryMethod2 = p0.getDeliveryMethod();
        if (deliveryMethod2 != null) {
            Intrinsics.checkNotNullParameter(deliveryMethod2, "<this>");
            mVar = p0;
            deliveryMethod = new DeliveryMethods.DeliveryMethod(mo3.a.o(deliveryMethod2.getAmount()), deliveryMethod2.getId(), deliveryMethod2.getLabel(), deliveryMethod2.getDescription());
        } else {
            mVar = p0;
            deliveryMethod = null;
        }
        no3.b deliveryAddress = mVar.getDeliveryAddress();
        Address addressA = deliveryAddress != null ? oo3.a.a(deliveryAddress) : null;
        xi0.a aVar = xi0.b.Companion;
        String currency = mVar.getCurrency();
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(currency);
        m mVar3 = mVar;
        long paidAmount = mVar3.getPaidAmount();
        long orderTotalAmount = mVar3.getOrderTotalAmount();
        Long shippingAmount = mVar3.getShippingAmount();
        long serviceChargeTotalAmount = mVar3.getServiceChargeTotalAmount();
        long taxTotalAmount = mVar3.getTaxTotalAmount();
        long subtotalAmount = mVar3.getSubtotalAmount();
        long discountTotalAmount = mVar3.getDiscountTotalAmount();
        long pointsRedemptionAmount = mVar3.getPointsRedemptionAmount();
        List deliveries = mVar3.getDeliveries();
        if (deliveries != null) {
            mVar2 = mVar3;
            arrayList = new ArrayList();
            Iterator it8 = deliveries.iterator();
            while (it8.hasNext()) {
                Iterator it9 = it8;
                Delivery deliveryB = nac.a.b((pac.f) it8.next());
                if (deliveryB != null) {
                    arrayList.add(deliveryB);
                }
                it8 = it9;
            }
        } else {
            mVar2 = mVar3;
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = f0.f322471a;
        }
        List lineItems = mVar2.getLineItems();
        if (lineItems != null) {
            List list3 = lineItems;
            r322 = arrayList;
            str = orderId;
            int i = 10;
            str2 = orderNumber;
            arrayList2 = new ArrayList(w.t(list3, 10));
            Iterator it10 = list3.iterator();
            while (it10.hasNext()) {
                pac.i iVar2 = (pac.i) it10.next();
                Intrinsics.checkNotNullParameter(iVar2, str3);
                String name = iVar2.getName();
                String imageUrl = iVar2.getImageUrl();
                List modifierSets = iVar2.getModifierSets();
                Iterator it11 = it10;
                if (modifierSets != null) {
                    List list4 = modifierSets;
                    iVar = iVar2;
                    localDateTime = localDateTimeZ;
                    arrayList3 = new ArrayList(w.t(list4, i));
                    Iterator it12 = list4.iterator();
                    while (it12.hasNext()) {
                        k kVar = (k) it12.next();
                        Intrinsics.checkNotNullParameter(kVar, str3);
                        String name2 = kVar.getName();
                        List<j> modifiers = kVar.getModifiers();
                        Iterator it13 = it12;
                        String str4 = orderManagementUrl;
                        boolean z = supportsDeliveries;
                        ArrayList arrayList4 = new ArrayList(w.t(modifiers, 10));
                        for (j jVar : modifiers) {
                            Intrinsics.checkNotNullParameter(jVar, str3);
                            arrayList4.add(new wbc.j(jVar.getName(), jVar.getQuantity()));
                            str3 = str3;
                        }
                        arrayList3.add(new wbc.l(name2, arrayList4));
                        it12 = it13;
                        supportsDeliveries = z;
                        orderManagementUrl = str4;
                        str3 = str3;
                    }
                } else {
                    iVar = iVar2;
                    localDateTime = localDateTimeZ;
                    arrayList3 = null;
                }
                String str5 = str3;
                String str6 = orderManagementUrl;
                boolean z3 = supportsDeliveries;
                List list5 = arrayList3;
                if (arrayList3 == null) {
                    list5 = f0.f322471a;
                }
                List list6 = list5;
                List variants = iVar.getVariants();
                if (variants == null) {
                    variants = f0.f322471a;
                }
                arrayList2.add(new wbc.f(iVar.getQuantity(), mo3.a.o(iVar.getPrice()), name, imageUrl, list6, variants));
                it10 = it11;
                localDateTimeZ = localDateTime;
                supportsDeliveries = z3;
                orderManagementUrl = str6;
                str3 = str5;
                i = 10;
            }
        } else {
            r322 = arrayList;
            str = orderId;
            str2 = orderNumber;
            arrayList2 = null;
        }
        LocalDateTime localDateTime2 = localDateTimeZ;
        String str7 = orderManagementUrl;
        boolean z4 = supportsDeliveries;
        List list7 = arrayList2;
        if (arrayList2 == null) {
            list7 = f0.f322471a;
        }
        oac.a flightBooking = mVar2.getFlightBooking();
        return new wbc.m(str, str2, localDateTime2, str7, z4, receiptUrl, hVar, customerFullName, list, list2, deliveryMethod, addressA, bVarA, paidAmount, orderTotalAmount, shippingAmount, serviceChargeTotalAmount, taxTotalAmount, subtotalAmount, discountTotalAmount, pointsRedemptionAmount, r322, list7, flightBooking != null ? ofm.q.Z(flightBooking) : null);
    }
}
