package l7g;

import com.revolut.feature.travel.flights.models.domain.common.Carrier;
import com.revolut.feature.travel.flights.models.domain.common.FlightPoint;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f192618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Carrier f192619c;
    public final m7g.d d;
    public final int e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FlightPoint f192620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FlightPoint f192621h;
    public final Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f192622j;

    public l(String flightNumber, j operationalCarrier, Carrier carrier, m7g.d cabinClass, int i, ArrayList technicalStops, FlightPoint departure, FlightPoint arrival, Integer num, ArrayList traits) {
        Intrinsics.checkNotNullParameter(flightNumber, "flightNumber");
        Intrinsics.checkNotNullParameter(operationalCarrier, "operationalCarrier");
        Intrinsics.checkNotNullParameter(cabinClass, "cabinClass");
        Intrinsics.checkNotNullParameter(technicalStops, "technicalStops");
        Intrinsics.checkNotNullParameter(departure, "departure");
        Intrinsics.checkNotNullParameter(arrival, "arrival");
        Intrinsics.checkNotNullParameter(traits, "traits");
        this.f192617a = flightNumber;
        this.f192618b = operationalCarrier;
        this.f192619c = carrier;
        this.d = cabinClass;
        this.e = i;
        this.f = technicalStops;
        this.f192620g = departure;
        this.f192621h = arrival;
        this.i = num;
        this.f192622j = traits;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f192617a, lVar.f192617a) && this.f192618b.equals(lVar.f192618b) && Intrinsics.f(this.f192619c, lVar.f192619c) && this.d == lVar.d && this.e == lVar.e && this.f.equals(lVar.f) && this.f192620g.equals(lVar.f192620g) && this.f192621h.equals(lVar.f192621h) && Intrinsics.f(this.i, lVar.i) && this.f192622j.equals(lVar.f192622j);
    }

    public final int hashCode() {
        int iHashCode = (this.f192618b.hashCode() + (this.f192617a.hashCode() * 31)) * 31;
        Carrier carrier = this.f192619c;
        int iHashCode2 = (this.f192621h.hashCode() + ((this.f192620g.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, j6.a.b(this.e, (this.d.hashCode() + ((iHashCode + (carrier == null ? 0 : carrier.hashCode())) * 31)) * 31, 31), 31)) * 31)) * 31;
        Integer num = this.i;
        return this.f192622j.hashCode() + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }
}
