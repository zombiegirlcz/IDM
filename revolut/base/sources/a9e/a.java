package a9e;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import java.util.Map;
import k71.q;
import kotlin.jvm.internal.Intrinsics;
import mae.o;
import qua.p;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public interface a {
    static RowDelegate.Model b(a aVar, p recurringPayment, boolean z, boolean z3, q transactionsExtraData) {
        Map contactsWithPaidPlan = r0.g();
        o oVar = (o) aVar;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        Intrinsics.checkNotNullParameter(contactsWithPaidPlan, "contactsWithPaidPlan");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        return o.f(oVar, new RecurringPaymentWithExtra.General(recurringPayment), z, z3, false, null, null, false, null, contactsWithPaidPlan, null, transactionsExtraData, 1520);
    }
}
