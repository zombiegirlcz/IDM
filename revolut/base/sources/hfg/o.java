package hfg;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151876c;
    public final ArrayList d;

    public o(String city, String country, String countryCode, ArrayList airports) {
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(airports, "airports");
        this.f151874a = city;
        this.f151875b = country;
        this.f151876c = countryCode;
        this.d = airports;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f151874a, oVar.f151874a) && Intrinsics.f(this.f151875b, oVar.f151875b) && Intrinsics.f(this.f151876c, oVar.f151876c) && this.d.equals(oVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f151874a.hashCode() * 31, 31, this.f151875b), 31, this.f151876c);
    }
}
