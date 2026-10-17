package ffi;

import com.revolut.feature_travel_hotels_models.property.search.LocationType;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationType f134810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f134811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f134812c;
    public final LocalDate d;
    public final String e;

    public c(LocationType type, long j2, LocalDate checkIn, LocalDate checkOut, String roomsOccupancy) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(checkIn, "checkIn");
        Intrinsics.checkNotNullParameter(checkOut, "checkOut");
        Intrinsics.checkNotNullParameter(roomsOccupancy, "roomsOccupancy");
        this.f134810a = type;
        this.f134811b = j2;
        this.f134812c = checkIn;
        this.d = checkOut;
        this.e = roomsOccupancy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f134810a, cVar.f134810a) && this.f134811b == cVar.f134811b && Intrinsics.f(this.f134812c, cVar.f134812c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + y.a(y.a(a0.d.c(this.f134810a.hashCode() * 31, 31, this.f134811b), 31, this.f134812c), 31, this.d);
    }
}
