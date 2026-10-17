package sr1;

import com.revolut.feature.apm.bills.core.api.model.search.tapi.BillSearchTapiResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillSearchTapiResult f265104a;

    public c(BillSearchTapiResult bill) {
        Intrinsics.checkNotNullParameter(bill, "bill");
        this.f265104a = bill;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f265104a, ((c) obj2).f265104a);
    }

    public final int hashCode() {
        return this.f265104a.hashCode();
    }
}
