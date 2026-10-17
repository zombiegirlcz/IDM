package hfg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class v extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151897c;

    public v(String city, String country, String countryCode) {
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f151895a = city;
        this.f151896b = country;
        this.f151897c = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f151895a, vVar.f151895a) && Intrinsics.f(this.f151896b, vVar.f151896b) && Intrinsics.f(this.f151897c, vVar.f151897c);
    }

    public final int hashCode() {
        return this.f151897c.hashCode() + p.a.c(this.f151895a.hashCode() * 31, 31, this.f151896b);
    }
}
