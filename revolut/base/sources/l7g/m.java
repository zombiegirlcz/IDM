package l7g;

import ip0.v7;
import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f192625c;
    public final LocalDateTime d;
    public final LocalDateTime e;
    public final int f;

    public m(String iataCode, String cityName, String airportName, LocalDateTime arrivalDateTime, LocalDateTime departureDateTime, int i) {
        Intrinsics.checkNotNullParameter(iataCode, "iataCode");
        Intrinsics.checkNotNullParameter(cityName, "cityName");
        Intrinsics.checkNotNullParameter(airportName, "airportName");
        Intrinsics.checkNotNullParameter(arrivalDateTime, "arrivalDateTime");
        Intrinsics.checkNotNullParameter(departureDateTime, "departureDateTime");
        this.f192623a = iataCode;
        this.f192624b = cityName;
        this.f192625c = airportName;
        this.d = arrivalDateTime;
        this.e = departureDateTime;
        this.f = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f192623a, mVar.f192623a) && Intrinsics.f(this.f192624b, mVar.f192624b) && Intrinsics.f(this.f192625c, mVar.f192625c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && this.f == mVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + v7.i(this.e, v7.i(this.d, p.a.c(p.a.c(this.f192623a.hashCode() * 31, 31, this.f192624b), 31, this.f192625c), 31), 31);
    }
}
