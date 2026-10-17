package qui;

import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPassRefundBreakdown;
import java.time.OffsetDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f249455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OffsetDateTime f249456c;
    public final AsftPassRefundBreakdown d;

    public b(String passId, String airportDescription, OffsetDateTime cancellationUntilDate, AsftPassRefundBreakdown refundBreakdown) {
        Intrinsics.checkNotNullParameter(passId, "passId");
        Intrinsics.checkNotNullParameter(airportDescription, "airportDescription");
        Intrinsics.checkNotNullParameter(cancellationUntilDate, "cancellationUntilDate");
        Intrinsics.checkNotNullParameter(refundBreakdown, "refundBreakdown");
        this.f249454a = passId;
        this.f249455b = airportDescription;
        this.f249456c = cancellationUntilDate;
        this.d = refundBreakdown;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f249454a, bVar.f249454a) && Intrinsics.f(this.f249455b, bVar.f249455b) && Intrinsics.f(this.f249456c, bVar.f249456c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f249456c.hashCode() + p.a.c(this.f249454a.hashCode() * 31, 31, this.f249455b)) * 31);
    }
}
