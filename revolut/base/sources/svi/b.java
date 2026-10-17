package svi;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f265876c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f265877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f265878h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f265879j;

    public b(String id10, String name, String airportId, String airportName, String iataCode, String terminal, String str, String str2, String str3, g openingHours) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(airportId, "airportId");
        Intrinsics.checkNotNullParameter(airportName, "airportName");
        Intrinsics.checkNotNullParameter(iataCode, "iataCode");
        Intrinsics.checkNotNullParameter(terminal, "terminal");
        Intrinsics.checkNotNullParameter(openingHours, "openingHours");
        this.f265874a = id10;
        this.f265875b = name;
        this.f265876c = airportId;
        this.d = airportName;
        this.e = iataCode;
        this.f = terminal;
        this.f265877g = str;
        this.f265878h = str2;
        this.i = str3;
        this.f265879j = openingHours;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f265874a, bVar.f265874a) && Intrinsics.f(this.f265875b, bVar.f265875b) && Intrinsics.f(this.f265876c, bVar.f265876c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f265877g, bVar.f265877g) && Intrinsics.f(this.f265878h, bVar.f265878h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f265879j, bVar.f265879j);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f265874a.hashCode() * 31, 31, this.f265875b), 31, this.f265876c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.f265877g;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f265878h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        return this.f265879j.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
