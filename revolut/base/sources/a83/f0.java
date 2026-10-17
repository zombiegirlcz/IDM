package a83;

import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import java.util.Comparator;
import tof.a3;

/* JADX INFO: loaded from: classes21.dex */
public final class f0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cim.a f2047b;

    public /* synthetic */ f0(cim.a aVar, int i) {
        this.f2046a = i;
        this.f2047b = aVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        a3 a3Var;
        a3 a3Var2;
        switch (this.f2046a) {
            case 0:
                return this.f2047b.compare(((h93.f0) obj2).f150120q, ((h93.f0) obj3).f150120q);
            case 1:
                return this.f2047b.compare(((e2d.b) obj2).f122048b, ((e2d.b) obj3).f122048b);
            default:
                RecurringPaymentWithExtra recurringPaymentWithExtra = (RecurringPaymentWithExtra) obj2;
                Long lValueOf = null;
                Long lValueOf2 = (!(recurringPaymentWithExtra instanceof RecurringPaymentWithExtra.LinkedTransaction) || (a3Var2 = ((RecurringPaymentWithExtra.LinkedTransaction) recurringPaymentWithExtra).f81654b) == null) ? null : Long.valueOf(a3Var2.f272591g.getMillis());
                RecurringPaymentWithExtra recurringPaymentWithExtra2 = (RecurringPaymentWithExtra) obj3;
                if ((recurringPaymentWithExtra2 instanceof RecurringPaymentWithExtra.LinkedTransaction) && (a3Var = ((RecurringPaymentWithExtra.LinkedTransaction) recurringPaymentWithExtra2).f81654b) != null) {
                    lValueOf = Long.valueOf(a3Var.f272591g.getMillis());
                }
                return this.f2047b.compare(lValueOf2, lValueOf);
        }
    }
}
