package cz1;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import dz1.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k02.e;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public abstract class c {
    public static final ArrayList a(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        List recurringPayments = rVar.getRecurringPayments();
        ArrayList arrayList = new ArrayList(w.t(recurringPayments, 10));
        Iterator it8 = recurringPayments.iterator();
        while (it8.hasNext()) {
            arrayList.add(l02.c.a((e) it8.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!Intrinsics.f(((ApmPaymentAuthorisationSummary) obj2).f61995g, PaymentMethodDetails.Unknown.f62068a)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }
}
