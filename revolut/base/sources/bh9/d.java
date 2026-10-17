package bh9;

import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.apm.bills.core.api.model.search.tapi.BillSearchTapiResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Biller f15272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillSearchTapiResult f15273b;

    public d(Biller biller, BillSearchTapiResult bill) {
        Intrinsics.checkNotNullParameter(biller, "biller");
        Intrinsics.checkNotNullParameter(bill, "bill");
        this.f15272a = biller;
        this.f15273b = bill;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f15272a, dVar.f15272a) && Intrinsics.f(this.f15273b, dVar.f15273b);
    }

    public final int hashCode() {
        return this.f15273b.hashCode() + (this.f15272a.hashCode() * 31);
    }
}
