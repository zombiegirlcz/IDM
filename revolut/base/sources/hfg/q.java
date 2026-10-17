package hfg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151883c;

    public q(String city, String country, String countryCode) {
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f151881a = city;
        this.f151882b = country;
        this.f151883c = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f151881a, qVar.f151881a) && Intrinsics.f(this.f151882b, qVar.f151882b) && Intrinsics.f(this.f151883c, qVar.f151883c);
    }

    public final int hashCode() {
        return this.f151883c.hashCode() + p.a.c(this.f151881a.hashCode() * 31, 31, this.f151882b);
    }
}
