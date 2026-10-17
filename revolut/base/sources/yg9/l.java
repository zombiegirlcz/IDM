package yg9;

import aii.r;
import com.revolut.feature.apm.bills.core.api.model.Bill;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bill f313586a;

    public l(Bill bill) {
        Intrinsics.checkNotNullParameter(bill, "bill");
        this.f313586a = bill;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f313586a, ((l) obj2).f313586a);
    }

    public final int hashCode() {
        return this.f313586a.hashCode();
    }
}
