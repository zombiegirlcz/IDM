package hfg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class u extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151894c;
    public final String d;

    public u(String iataCode, String city, String country, String countryCode) {
        Intrinsics.checkNotNullParameter(iataCode, "iataCode");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f151892a = iataCode;
        this.f151893b = city;
        this.f151894c = country;
        this.d = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f151892a, uVar.f151892a) && Intrinsics.f(this.f151893b, uVar.f151893b) && Intrinsics.f(this.f151894c, uVar.f151894c) && Intrinsics.f(this.d, uVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f151892a.hashCode() * 31, 31, this.f151893b), 31, this.f151894c);
    }
}
