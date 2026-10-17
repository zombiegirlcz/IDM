package ah9;

import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.apm.bills.core.api.model.search.tapi.BillSearchTapiResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Biller f4912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillSearchTapiResult f4913b;

    public d(Biller biller, BillSearchTapiResult billResult) {
        Intrinsics.checkNotNullParameter(biller, "biller");
        Intrinsics.checkNotNullParameter(billResult, "billResult");
        this.f4912a = biller;
        this.f4913b = billResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f4912a, dVar.f4912a) && Intrinsics.f(this.f4913b, dVar.f4913b);
    }

    public final int hashCode() {
        return this.f4913b.hashCode() + (this.f4912a.hashCode() * 31);
    }
}
