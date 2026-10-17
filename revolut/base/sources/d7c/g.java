package d7c;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.BillingAddress;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import e7c.w;
import e7c.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x019b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a1  */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [int] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod a(e7c.z r28) {
        /*
            Method dump skipped, instruction units count: 867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d7c.g.a(e7c.z):com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod");
    }

    public static final ArrayList b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            PaymentMethod paymentMethodA = a((z) it8.next());
            if (paymentMethodA != null) {
                arrayList.add(paymentMethodA);
            }
        }
        return arrayList;
    }

    public static final PaymentMethod.Card c(w wVar, String str) {
        com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.c cVar;
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        String brand = wVar.getBrand();
        if (brand != null) {
            com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.c[] cVarArrValues = com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.c.values();
            int length = cVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    cVar = null;
                    break;
                }
                com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.c cVar2 = cVarArrValues[i];
                if (a0.z(cVar2.name(), brand, true)) {
                    cVar = cVar2;
                    break;
                }
                i++;
            }
            if (cVar != null) {
                String id10 = wVar.getId();
                String bin = wVar.getBin();
                String lastFour = wVar.getLastFour();
                int expiryMonth = wVar.getExpiryMonth();
                int expiryYear = wVar.getExpiryYear();
                e7c.d billingAddress = wVar.getBillingAddress();
                return new PaymentMethod.Card(id10, bin, lastFour, cVar, expiryMonth, expiryYear, billingAddress != null ? new BillingAddress(billingAddress.getCity(), billingAddress.getCountry(), billingAddress.getPostcode(), billingAddress.getStreetLine1(), billingAddress.getStreetLine2()) : null, wVar.getRequiresCvvForPayment(), str, wVar.getLabel());
            }
        }
        return null;
    }
}
