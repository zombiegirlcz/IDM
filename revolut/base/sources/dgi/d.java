package dgi;

import com.revolut.feature_travel_hotels_models.property.HotelsPropertyType;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f114680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114681c;
    public final HotelsPropertyType d;
    public final a e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f114682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f114683h;

    public d(String id10, long j2, String name, HotelsPropertyType propertyType, a location, LocalDate checkIn, LocalDate checkOut, String roomsOccupancy) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(propertyType, "propertyType");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(checkIn, "checkIn");
        Intrinsics.checkNotNullParameter(checkOut, "checkOut");
        Intrinsics.checkNotNullParameter(roomsOccupancy, "roomsOccupancy");
        this.f114679a = id10;
        this.f114680b = j2;
        this.f114681c = name;
        this.d = propertyType;
        this.e = location;
        this.f = checkIn;
        this.f114682g = checkOut;
        this.f114683h = roomsOccupancy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f114679a, dVar.f114679a) && this.f114680b == dVar.f114680b && Intrinsics.f(this.f114681c, dVar.f114681c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f114682g, dVar.f114682g) && Intrinsics.f(this.f114683h, dVar.f114683h);
    }

    public final int hashCode() {
        return this.f114683h.hashCode() + y.a(y.a((this.e.f114667a.hashCode() + ((this.d.hashCode() + p.a.c(a0.d.c(this.f114679a.hashCode() * 31, 31, this.f114680b), 31, this.f114681c)) * 31)) * 31, 31, this.f), 31, this.f114682g);
    }
}
