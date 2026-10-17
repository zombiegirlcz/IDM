package hfg;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151907c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f151908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f151909h;

    public z(String departureCity, String arrivalCity, String departureIataCode, String arrivalIataCode, String provider, String flightImageUrl, String ctaText, ArrayList flights) {
        Intrinsics.checkNotNullParameter(departureCity, "departureCity");
        Intrinsics.checkNotNullParameter(arrivalCity, "arrivalCity");
        Intrinsics.checkNotNullParameter(departureIataCode, "departureIataCode");
        Intrinsics.checkNotNullParameter(arrivalIataCode, "arrivalIataCode");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(flightImageUrl, "flightImageUrl");
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        Intrinsics.checkNotNullParameter(flights, "flights");
        this.f151905a = departureCity;
        this.f151906b = arrivalCity;
        this.f151907c = departureIataCode;
        this.d = arrivalIataCode;
        this.e = provider;
        this.f = flightImageUrl;
        this.f151908g = ctaText;
        this.f151909h = flights;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f151905a, zVar.f151905a) && Intrinsics.f(this.f151906b, zVar.f151906b) && Intrinsics.f(this.f151907c, zVar.f151907c) && Intrinsics.f(this.d, zVar.d) && Intrinsics.f(this.e, zVar.e) && Intrinsics.f(this.f, zVar.f) && Intrinsics.f(this.f151908g, zVar.f151908g) && this.f151909h.equals(zVar.f151909h);
    }

    public final int hashCode() {
        return this.f151909h.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f151905a.hashCode() * 31, 31, this.f151906b), 31, this.f151907c), 31, this.d), 31, this.e), 31, this.f), 31, this.f151908g);
    }
}
