package xn9;

import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyAttributes;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyReferenceItem;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartySettings;
import ho9.b;
import ho9.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import rd0.d;
import wn9.a;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {
    public static final PaymentCounterpartyInfo a(wn9.a aVar) {
        Object next;
        c cVar;
        ArrayList arrayList;
        PaymentCounterpartySettings paymentCounterpartySettings;
        PaymentCounterpartyAttributes paymentCounterpartyAttributes;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String id10 = aVar.getId();
        ho9.a aVar2 = b.Companion;
        String value = aVar.getType();
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        Iterator<E> it8 = b.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((b) next).b(), value)) {
                break;
            }
        }
        b bVar = (b) next;
        if (bVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("failed to parse counterparty type = ", aVar.getType()));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return null;
        }
        String state = aVar.getState();
        c[] cVarArrValues = c.values();
        int length = cVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cVar = null;
                break;
            }
            c cVar2 = cVarArrValues[i];
            if (a0.z(cVar2.name(), state, true)) {
                cVar = cVar2;
                break;
            }
            i++;
        }
        if (cVar == null) {
            IllegalStateException illegalStateException2 = new IllegalStateException(j6.a.q("failed to parse counterparty state = ", aVar.getState()));
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
            d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
            return null;
        }
        String label = aVar.getLabel();
        String name = aVar.getName();
        String logoUrl = aVar.getLogoUrl();
        List references = aVar.getReferences();
        if (references != null) {
            List<a.b> list = references;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            for (a.b bVar2 : list) {
                Intrinsics.checkNotNullParameter(bVar2, "<this>");
                arrayList2.add(new PaymentCounterpartyReferenceItem(bVar2.getName(), bVar2.getLabel(), bVar2.getValue()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        a.c settings = aVar.getSettings();
        if (settings != null) {
            Intrinsics.checkNotNullParameter(settings, "<this>");
            paymentCounterpartySettings = new PaymentCounterpartySettings(settings.getSupportsPaymentReminders(), settings.getShowAsContacts(), settings.getLabelEditable());
        } else {
            paymentCounterpartySettings = null;
        }
        a.C1650a attributes = aVar.getAttributes();
        if (attributes != null) {
            Intrinsics.checkNotNullParameter(attributes, "<this>");
            paymentCounterpartyAttributes = new PaymentCounterpartyAttributes(attributes.getBillerId());
        } else {
            paymentCounterpartyAttributes = null;
        }
        return new PaymentCounterpartyInfo(id10, bVar, cVar, label, name, logoUrl, arrayList, paymentCounterpartySettings, paymentCounterpartyAttributes);
    }
}
