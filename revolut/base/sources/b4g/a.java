package b4g;

import com.revolut.feature.travel.flights.models.domain.search.FlightSearchQuery;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlightSearchQuery f12312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r7g.g f12313b;

    public a(FlightSearchQuery query, r7g.g gVar) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f12312a = query;
        this.f12313b = gVar;
    }

    @Override // lk0.f
    /* JADX INFO: renamed from: a */
    public final int getF71990a() {
        return 20;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f12312a, aVar.f12312a) && this.f12313b == aVar.f12313b;
    }

    public final int hashCode() {
        int iHashCode = (this.f12312a.hashCode() + (Integer.hashCode(20) * 31)) * 31;
        r7g.g gVar = this.f12313b;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }
}
