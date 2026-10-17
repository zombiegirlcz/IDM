package l7g;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f192634c;
    public final s d;
    public final LocalDate e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f192635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f192636h;

    public z(String id10, String origin, String destination, s tripType, LocalDate departureDate, LocalDate localDate, int i, String destinationImageUrl) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(tripType, "tripType");
        Intrinsics.checkNotNullParameter(departureDate, "departureDate");
        Intrinsics.checkNotNullParameter(destinationImageUrl, "destinationImageUrl");
        this.f192632a = id10;
        this.f192633b = origin;
        this.f192634c = destination;
        this.d = tripType;
        this.e = departureDate;
        this.f = localDate;
        this.f192635g = i;
        this.f192636h = destinationImageUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f192632a, zVar.f192632a) && Intrinsics.f(this.f192633b, zVar.f192633b) && Intrinsics.f(this.f192634c, zVar.f192634c) && this.d == zVar.d && Intrinsics.f(this.e, zVar.e) && Intrinsics.f(this.f, zVar.f) && this.f192635g == zVar.f192635g && Intrinsics.f(this.f192636h, zVar.f192636h);
    }

    public final int hashCode() {
        int iA = wp5.y.a((this.d.hashCode() + p.a.c(p.a.c(this.f192632a.hashCode() * 31, 31, this.f192633b), 31, this.f192634c)) * 31, 31, this.e);
        LocalDate localDate = this.f;
        return this.f192636h.hashCode() + j6.a.b(this.f192635g, (iA + (localDate == null ? 0 : localDate.hashCode())) * 31, 31);
    }
}
