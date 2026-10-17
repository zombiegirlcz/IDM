package ehf;

import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import kotlin.jvm.internal.Intrinsics;
import zsc.m;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends zsc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f126174a;

    public a(m query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f126174a = query;
    }

    @Override // zsc.d
    public final boolean a(Object obj2) {
        RecurringPaymentWithExtra value = (RecurringPaymentWithExtra) obj2;
        Intrinsics.checkNotNullParameter(value, "value");
        Long l2 = value.getF81653a().f249323j;
        String strValueOf = null;
        xi0.b bVar = new xi0.b(6, value.getF81653a().i, null);
        if (l2 != null) {
            int iP = cp5.d.p(bVar);
            strValueOf = String.valueOf(l2.longValue());
            if (strValueOf.length() <= iP) {
                strValueOf = "0".concat(strValueOf);
            }
        }
        if (strValueOf == null) {
            strValueOf = "";
        }
        return this.f126174a.a(strValueOf);
    }

    @Override // zsc.d
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f126174a, ((a) obj2).f126174a);
    }

    @Override // zsc.d
    public final int hashCode() {
        return this.f126174a.hashCode();
    }
}
