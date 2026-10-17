package xbc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f304044c;
    public final String d;
    public final int e;
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f304045g;

    public j(String airlineName, String airlineIataCode, String airlineLogoUrl, String flightNumber, int i, g arrival, g departure) {
        Intrinsics.checkNotNullParameter(airlineName, "airlineName");
        Intrinsics.checkNotNullParameter(airlineIataCode, "airlineIataCode");
        Intrinsics.checkNotNullParameter(airlineLogoUrl, "airlineLogoUrl");
        Intrinsics.checkNotNullParameter(flightNumber, "flightNumber");
        Intrinsics.checkNotNullParameter(arrival, "arrival");
        Intrinsics.checkNotNullParameter(departure, "departure");
        this.f304042a = airlineName;
        this.f304043b = airlineIataCode;
        this.f304044c = airlineLogoUrl;
        this.d = flightNumber;
        this.e = i;
        this.f = arrival;
        this.f304045g = departure;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f304042a, jVar.f304042a) && Intrinsics.f(this.f304043b, jVar.f304043b) && Intrinsics.f(this.f304044c, jVar.f304044c) && Intrinsics.f(this.d, jVar.d) && this.e == jVar.e && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f304045g, jVar.f304045g);
    }

    public final int hashCode() {
        return this.f304045g.hashCode() + ((this.f.hashCode() + j6.a.b(this.e, p.a.c(p.a.c(p.a.c(this.f304042a.hashCode() * 31, 31, this.f304043b), 31, this.f304044c), 31, this.d), 31)) * 31);
    }
}
