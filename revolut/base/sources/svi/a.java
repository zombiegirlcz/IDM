package svi;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f265870c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f265871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f265872h;

    public a(String id10, String iataCode, String name, String cityName, String countryName, String countryCode, double d, double d5) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(iataCode, "iataCode");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(cityName, "cityName");
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f265868a = id10;
        this.f265869b = iataCode;
        this.f265870c = name;
        this.d = cityName;
        this.e = countryName;
        this.f = countryCode;
        this.f265871g = d;
        this.f265872h = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f265868a, aVar.f265868a) && Intrinsics.f(this.f265869b, aVar.f265869b) && Intrinsics.f(this.f265870c, aVar.f265870c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Double.compare(this.f265871g, aVar.f265871g) == 0 && Double.compare(this.f265872h, aVar.f265872h) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f265872h) + m72.b.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f265868a.hashCode() * 31, 31, this.f265869b), 31, this.f265870c), 31, this.d), 31, this.e), 31, this.f), this.f265871g, 31);
    }
}
