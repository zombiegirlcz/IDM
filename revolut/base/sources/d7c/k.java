package d7c;

import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import e7c.k0;
import e7c.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k {
    public static final ShippingContact a(k0 k0Var) {
        nec.a aVar;
        Intrinsics.checkNotNullParameter(k0Var, "<this>");
        String type = k0Var.getType();
        if (type != null) {
            nec.a[] aVarArrValues = nec.a.values();
            int length = aVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    aVar = null;
                    break;
                }
                nec.a aVar2 = aVarArrValues[i];
                if (a0.z(aVar2.name(), type, true)) {
                    aVar = aVar2;
                    break;
                }
                i++;
            }
            if (aVar != null) {
                return new ShippingContact(k0Var.getId(), oo3.a.a(k0Var.getAddress()), aVar, null, null);
            }
        }
        return null;
    }

    public static final nec.c b(q0 q0Var) {
        Intrinsics.checkNotNullParameter(q0Var, "<this>");
        List shippingContacts = q0Var.getShippingContacts();
        Intrinsics.checkNotNullParameter(shippingContacts, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = shippingContacts.iterator();
        while (it8.hasNext()) {
            ShippingContact shippingContactA = a((k0) it8.next());
            if (shippingContactA != null) {
                arrayList.add(shippingContactA);
            }
        }
        return new nec.c(arrayList, q0Var.getDefaultShippingContactId());
    }
}
