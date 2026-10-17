package jg9;

import com.revolut.feature.apm.bills.core.api.model.Bill;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bill f173956a;

    public p(Bill bill) {
        Intrinsics.checkNotNullParameter(bill, "bill");
        this.f173956a = bill;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f173956a, ((p) obj2).f173956a);
    }

    public final int hashCode() {
        return this.f173956a.hashCode();
    }
}
