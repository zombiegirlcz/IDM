package t3k;

import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemittanceRouteId f267820a;

    public d(RemittanceRouteId routeId) {
        Intrinsics.checkNotNullParameter(routeId, "routeId");
        this.f267820a = routeId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f267820a, ((d) obj2).f267820a);
    }

    public final int hashCode() {
        return this.f267820a.hashCode();
    }
}
