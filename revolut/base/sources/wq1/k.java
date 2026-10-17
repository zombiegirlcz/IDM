package wq1;

import com.revolut.feature.apm.bills.pagopa.api.models.PagoPABill;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PagoPABill f299392a;

    public k(PagoPABill bill) {
        Intrinsics.checkNotNullParameter(bill, "bill");
        this.f299392a = bill;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f299392a, ((k) obj2).f299392a);
    }

    public final int hashCode() {
        return this.f299392a.hashCode();
    }
}
