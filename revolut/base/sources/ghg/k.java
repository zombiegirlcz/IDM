package ghg;

import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesSearchLocation f143914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelMilesSearchLocation f143915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f143916c;

    public k(TravelMilesSearchLocation origin, TravelMilesSearchLocation destination, LocalDate date) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(date, "date");
        this.f143914a = origin;
        this.f143915b = destination;
        this.f143916c = date;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f143914a, kVar.f143914a) && Intrinsics.f(this.f143915b, kVar.f143915b) && Intrinsics.f(this.f143916c, kVar.f143916c);
    }

    public final int hashCode() {
        return this.f143916c.hashCode() + ((this.f143915b.hashCode() + (this.f143914a.hashCode() * 31)) * 31);
    }
}
