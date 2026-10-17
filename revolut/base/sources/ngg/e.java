package ngg;

import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesSearchLocation f215151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelMilesSearchLocation f215152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f215153c;

    public e(TravelMilesSearchLocation origin, TravelMilesSearchLocation destination, LocalDate date) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(date, "date");
        this.f215151a = origin;
        this.f215152b = destination;
        this.f215153c = date;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f215151a, eVar.f215151a) && Intrinsics.f(this.f215152b, eVar.f215152b) && Intrinsics.f(this.f215153c, eVar.f215153c);
    }

    public final int hashCode() {
        return this.f215153c.hashCode() + ((this.f215152b.hashCode() + (this.f215151a.hashCode() * 31)) * 31);
    }
}
