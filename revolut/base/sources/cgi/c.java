package cgi;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f23990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f23991c;
    public final String d;

    public c(String propertyId, LocalDate checkIn, LocalDate checkOut, String occupancy) {
        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
        Intrinsics.checkNotNullParameter(checkIn, "checkIn");
        Intrinsics.checkNotNullParameter(checkOut, "checkOut");
        Intrinsics.checkNotNullParameter(occupancy, "occupancy");
        this.f23989a = propertyId;
        this.f23990b = checkIn;
        this.f23991c = checkOut;
        this.d = occupancy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f23989a, cVar.f23989a) && Intrinsics.f(this.f23990b, cVar.f23990b) && Intrinsics.f(this.f23991c, cVar.f23991c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + y.a(y.a(this.f23989a.hashCode() * 31, 31, this.f23990b), 31, this.f23991c);
    }
}
