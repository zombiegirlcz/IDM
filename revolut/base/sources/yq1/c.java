package yq1;

import com.revolut.feature.apm.bills.pagopa.api.models.PagoPABill;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PagoPABill f315968a;

    public c(PagoPABill pagoPaBill) {
        Intrinsics.checkNotNullParameter(pagoPaBill, "pagoPaBill");
        this.f315968a = pagoPaBill;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f315968a, ((c) obj2).f315968a);
    }

    public final int hashCode() {
        return this.f315968a.hashCode();
    }
}
