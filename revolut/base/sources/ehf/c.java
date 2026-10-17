package ehf;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import kotlin.jvm.internal.Intrinsics;
import zsc.m;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends zsc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f126177a;

    public c(m query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f126177a = query;
    }

    @Override // zsc.d
    public final boolean a(Object obj2) {
        Address address;
        RecurringPaymentWithExtra value = (RecurringPaymentWithExtra) obj2;
        Intrinsics.checkNotNullParameter(value, "value");
        f5j.a aVar = value.getF81653a().f249329r;
        String city = (aVar == null || (address = aVar.f132336m) == null) ? null : address.getCity();
        if (city == null) {
            city = "";
        }
        return this.f126177a.a(city);
    }

    @Override // zsc.d
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f126177a, ((c) obj2).f126177a);
    }

    @Override // zsc.d
    public final int hashCode() {
        return this.f126177a.hashCode();
    }
}
