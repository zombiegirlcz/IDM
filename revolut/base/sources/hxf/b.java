package hxf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f156589c;
    public final String d;
    public final String e;
    public final String f;

    public b(String streetLine1, String streetLine2, String region, String city, String country, String postcode) {
        Intrinsics.checkNotNullParameter(streetLine1, "streetLine1");
        Intrinsics.checkNotNullParameter(streetLine2, "streetLine2");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        this.f156587a = streetLine1;
        this.f156588b = streetLine2;
        this.f156589c = region;
        this.d = city;
        this.e = country;
        this.f = postcode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f156587a, bVar.f156587a) && Intrinsics.f(this.f156588b, bVar.f156588b) && Intrinsics.f(this.f156589c, bVar.f156589c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f156587a.hashCode() * 31, 31, this.f156588b), 31, this.f156589c), 31, this.d), 31, this.e);
    }
}
