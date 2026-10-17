package d6g;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.flights.models.domain.search.TravelFlightsItinerary;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsItinerary f111537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m7g.d f111538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f111539c;

    public f(TravelFlightsItinerary itinerary, m7g.d cabinClass, Data faresData) {
        Intrinsics.checkNotNullParameter(itinerary, "itinerary");
        Intrinsics.checkNotNullParameter(cabinClass, "cabinClass");
        Intrinsics.checkNotNullParameter(faresData, "faresData");
        this.f111537a = itinerary;
        this.f111538b = cabinClass;
        this.f111539c = faresData;
    }

    public static f a(f fVar, Data faresData) {
        TravelFlightsItinerary itinerary = fVar.f111537a;
        m7g.d cabinClass = fVar.f111538b;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(itinerary, "itinerary");
        Intrinsics.checkNotNullParameter(cabinClass, "cabinClass");
        Intrinsics.checkNotNullParameter(faresData, "faresData");
        return new f(itinerary, cabinClass, faresData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f111537a, fVar.f111537a) && this.f111538b == fVar.f111538b && Intrinsics.f(this.f111539c, fVar.f111539c);
    }

    public final int hashCode() {
        return this.f111539c.hashCode() + ((this.f111538b.hashCode() + (this.f111537a.hashCode() * 31)) * 31);
    }
}
