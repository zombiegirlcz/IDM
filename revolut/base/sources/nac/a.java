package nac;

import com.revolut.feature.revolutpay.order_tracking.models.delivery.Delivery;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.DeliveryAddress;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.DeliveryCarrier;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.DeliveryCheckpoint;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import oi0.d;
import pac.c;
import pac.e;
import pac.f;
import pac.g;
import pd.b;
import wbc.n;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final DeliveryCarrier a(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new DeliveryCarrier(cVar.getId(), cVar.getName(), cVar.getLogoUrl(), cVar.getWebsite(), b.j(cVar.getIsSuggested()));
    }

    public static final Delivery b(f fVar) {
        wbc.c cVar;
        DeliveryAddress deliveryAddress;
        Delivery.Weight weight;
        List list;
        n nVar;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String deliveryStatus = fVar.getDeliveryStatus();
        wbc.c[] cVarArrValues = wbc.c.values();
        int length = cVarArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                cVar = null;
                break;
            }
            wbc.c cVar2 = cVarArrValues[i2];
            if (a0.z(cVar2.name(), deliveryStatus, true)) {
                cVar = cVar2;
                break;
            }
            i2++;
        }
        if (cVar == null) {
            return null;
        }
        String id10 = fVar.getId();
        String trackingNumber = fVar.getTrackingNumber();
        String trackingUrl = fVar.getTrackingUrl();
        pac.b destinationAddress = fVar.getDestinationAddress();
        if (destinationAddress != null) {
            Intrinsics.checkNotNullParameter(destinationAddress, "<this>");
            deliveryAddress = new DeliveryAddress(destinationAddress.getCity(), destinationAddress.getCountry(), destinationAddress.getRaw());
        } else {
            deliveryAddress = null;
        }
        DeliveryCarrier deliveryCarrierA = a(fVar.getCarrier());
        g weight2 = fVar.getWeight();
        if (weight2 != null) {
            Intrinsics.checkNotNullParameter(weight2, "<this>");
            String unit = weight2.getUnit();
            n[] nVarArrValues = n.values();
            int length2 = nVarArrValues.length;
            while (true) {
                if (i >= length2) {
                    nVar = null;
                    break;
                }
                nVar = nVarArrValues[i];
                if (a0.z(nVar.name(), unit, true)) {
                    break;
                }
                i++;
            }
            weight = nVar == null ? null : new Delivery.Weight(weight2.getValue(), nVar);
        } else {
            weight = null;
        }
        LocalDate localDateC = c(fVar.getOrderedDate());
        String estimatedDeliveryDate = fVar.getEstimatedDeliveryDate();
        LocalDate localDateC2 = estimatedDeliveryDate != null ? c(estimatedDeliveryDate) : null;
        String deliveredDate = fVar.getDeliveredDate();
        LocalDate localDateC3 = deliveredDate != null ? c(deliveredDate) : null;
        String cancelledDate = fVar.getCancelledDate();
        LocalDate localDateC4 = cancelledDate != null ? c(cancelledDate) : null;
        String availableForPickupDate = fVar.getAvailableForPickupDate();
        LocalDate localDateC5 = availableForPickupDate != null ? c(availableForPickupDate) : null;
        boolean addedManually = fVar.getAddedManually();
        List checkpoints = fVar.getCheckpoints();
        if (checkpoints != null) {
            List<e> list2 = checkpoints;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            for (e eVar : list2) {
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                Instant instant = Instant.parse(eVar.getTimestamp());
                Intrinsics.checkNotNullExpressionValue(instant, "parse(...)");
                arrayList.add(new DeliveryCheckpoint(d.Z(instant), eVar.getStatusMessage()));
            }
            list = arrayList;
        } else {
            list = null;
        }
        if (list == null) {
            list = f0.f322471a;
        }
        return new Delivery(id10, trackingNumber, trackingUrl, deliveryAddress, deliveryCarrierA, weight, cVar, localDateC, localDateC2, localDateC3, localDateC4, localDateC5, addedManually, list);
    }

    public static final LocalDate c(String str) {
        Instant instant = Instant.parse(str);
        Intrinsics.checkNotNullExpressionValue(instant, "parse(...)");
        return d.W(instant);
    }
}
