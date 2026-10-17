package oog;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f227102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f227103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f227104c;

    public g(Data country, String city, h cityFieldType) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(cityFieldType, "cityFieldType");
        this.f227102a = country;
        this.f227103b = city;
        this.f227104c = cityFieldType;
    }

    public static g a(g gVar, Data country, String city, h cityFieldType, int i) {
        if ((i & 1) != 0) {
            country = gVar.f227102a;
        }
        if ((i & 2) != 0) {
            city = gVar.f227103b;
        }
        if ((i & 4) != 0) {
            cityFieldType = gVar.f227104c;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(cityFieldType, "cityFieldType");
        return new g(country, city, cityFieldType);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f227102a, gVar.f227102a) && Intrinsics.f(this.f227103b, gVar.f227103b) && this.f227104c == gVar.f227104c;
    }

    public final int hashCode() {
        return this.f227104c.hashCode() + p.a.c(this.f227102a.hashCode() * 31, 31, this.f227103b);
    }
}
