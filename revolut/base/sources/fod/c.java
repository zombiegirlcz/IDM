package fod;

import com.revolut.retail.feature.api.trips.models.Trip;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Trip f136925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ind.e f136926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n9l.a f136927c;
    public final dj0.d d;

    public c(Trip trip, ind.e analyticsByPeriod, n9l.a aVar, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(trip, "trip");
        Intrinsics.checkNotNullParameter(analyticsByPeriod, "analyticsByPeriod");
        this.f136925a = trip;
        this.f136926b = analyticsByPeriod;
        this.f136927c = aVar;
        this.d = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f136925a, cVar.f136925a) && Intrinsics.f(this.f136926b, cVar.f136926b) && Intrinsics.f(this.f136927c, cVar.f136927c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f136926b.hashCode() + (this.f136925a.hashCode() * 31)) * 31;
        n9l.a aVar = this.f136927c;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        dj0.d dVar = this.d;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }
}
