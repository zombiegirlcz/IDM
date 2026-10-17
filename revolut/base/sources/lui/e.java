package lui;

import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPassRefundBreakdown;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f200244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AsftPassRefundBreakdown f200245c;

    public e(String passId, String airportDescription, AsftPassRefundBreakdown refundBreakdown) {
        Intrinsics.checkNotNullParameter(passId, "passId");
        Intrinsics.checkNotNullParameter(airportDescription, "airportDescription");
        Intrinsics.checkNotNullParameter(refundBreakdown, "refundBreakdown");
        this.f200243a = passId;
        this.f200244b = airportDescription;
        this.f200245c = refundBreakdown;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f200243a, eVar.f200243a) && Intrinsics.f(this.f200244b, eVar.f200244b) && Intrinsics.f(this.f200245c, eVar.f200245c);
    }

    public final int hashCode() {
        return this.f200245c.hashCode() + p.a.c(this.f200243a.hashCode() * 31, 31, this.f200244b);
    }
}
