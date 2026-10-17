package bti;

import java.util.ArrayList;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18583c;
    public final wi0.b d;
    public final String e;
    public final TimeZone f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f18584g;

    public a(String cityName, String airportName, String airportIataCode, wi0.b countryCode, String airportDescription, TimeZone airportTimeZone, ArrayList terminals) {
        Intrinsics.checkNotNullParameter(cityName, "cityName");
        Intrinsics.checkNotNullParameter(airportName, "airportName");
        Intrinsics.checkNotNullParameter(airportIataCode, "airportIataCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(airportDescription, "airportDescription");
        Intrinsics.checkNotNullParameter(airportTimeZone, "airportTimeZone");
        Intrinsics.checkNotNullParameter(terminals, "terminals");
        this.f18581a = cityName;
        this.f18582b = airportName;
        this.f18583c = airportIataCode;
        this.d = countryCode;
        this.e = airportDescription;
        this.f = airportTimeZone;
        this.f18584g = terminals;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f18581a, aVar.f18581a) && Intrinsics.f(this.f18582b, aVar.f18582b) && Intrinsics.f(this.f18583c, aVar.f18583c) && this.d.equals(aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && this.f18584g.equals(aVar.f18584g);
    }

    public final int hashCode() {
        return this.f18584g.hashCode() + ((this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f18581a.hashCode() * 31, 31, this.f18582b), 31, this.f18583c), 31, this.d.f297794a), 31, this.e)) * 31);
    }
}
