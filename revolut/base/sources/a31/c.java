package a31;

import com.revolut.feature.shared.recurring_payments.models.RecurringPaymentEndCriteria;
import java.util.ArrayList;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import o9l.s;
import o9l.y;
import zhm.q0;

/* JADX INFO: loaded from: classes20.dex */
public abstract class c {
    public static final Map a(prf.f fVar) {
        String str = fVar.f239009a;
        Iterable<prf.e> iterable = (Iterable) fVar.f239010b;
        ArrayList arrayList = new ArrayList(zhm.w.t(iterable, 10));
        for (prf.e eVar : iterable) {
            arrayList.add(new y(eVar.f239007a, eVar.f239008b));
        }
        return q0.c(new Pair(str, arrayList));
    }

    public static final o9l.s b(RecurringPaymentEndCriteria recurringPaymentEndCriteria) {
        if (recurringPaymentEndCriteria instanceof RecurringPaymentEndCriteria.Date) {
            return new o9l.s(s.a.DATE, jli.b.i(((RecurringPaymentEndCriteria.Date) recurringPaymentEndCriteria).f86442a).toString(jli.b.f175839a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
