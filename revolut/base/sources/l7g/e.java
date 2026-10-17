package l7g;

import com.revolut.feature.travel.flights.models.domain.common.FlightPoint;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlightPoint f192598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlightPoint f192599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f192600c;
    public final int d;
    public final ArrayList e;

    public e(FlightPoint departure, FlightPoint arrival, int i, int i2, ArrayList segments) {
        Intrinsics.checkNotNullParameter(departure, "departure");
        Intrinsics.checkNotNullParameter(arrival, "arrival");
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.f192598a = departure;
        this.f192599b = arrival;
        this.f192600c = i;
        this.d = i2;
        this.e = segments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f192598a.equals(eVar.f192598a) && this.f192599b.equals(eVar.f192599b) && this.f192600c == eVar.f192600c && this.d == eVar.d && this.e.equals(eVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.b(this.d, j6.a.b(this.f192600c, (this.f192599b.hashCode() + (this.f192598a.hashCode() * 31)) * 31, 31), 31);
    }
}
