package hfg;

import ip0.v7;
import java.time.Duration;
import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151900c;
    public final String d;
    public final LocalDateTime e;
    public final LocalDateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Duration f151901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f151902h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final double f151903j;
    public final dj0.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f151904l;

    public y(String flightId, String airlineName, String airlineRef, String str, LocalDateTime departsAt, LocalDateTime arrivesAt, Duration totalDuration, String bookingUrl, String flightClass, double d, dj0.d taxesCost, int i) {
        Intrinsics.checkNotNullParameter(flightId, "flightId");
        Intrinsics.checkNotNullParameter(airlineName, "airlineName");
        Intrinsics.checkNotNullParameter(airlineRef, "airlineRef");
        Intrinsics.checkNotNullParameter(departsAt, "departsAt");
        Intrinsics.checkNotNullParameter(arrivesAt, "arrivesAt");
        Intrinsics.checkNotNullParameter(totalDuration, "totalDuration");
        Intrinsics.checkNotNullParameter(bookingUrl, "bookingUrl");
        Intrinsics.checkNotNullParameter(flightClass, "flightClass");
        Intrinsics.checkNotNullParameter(taxesCost, "taxesCost");
        this.f151898a = flightId;
        this.f151899b = airlineName;
        this.f151900c = airlineRef;
        this.d = str;
        this.e = departsAt;
        this.f = arrivesAt;
        this.f151901g = totalDuration;
        this.f151902h = bookingUrl;
        this.i = flightClass;
        this.f151903j = d;
        this.k = taxesCost;
        this.f151904l = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f151898a, yVar.f151898a) && Intrinsics.f(this.f151899b, yVar.f151899b) && Intrinsics.f(this.f151900c, yVar.f151900c) && Intrinsics.f(this.d, yVar.d) && Intrinsics.f(this.e, yVar.e) && Intrinsics.f(this.f, yVar.f) && Intrinsics.f(this.f151901g, yVar.f151901g) && Intrinsics.f(this.f151902h, yVar.f151902h) && Intrinsics.f(this.i, yVar.i) && Double.compare(this.f151903j, yVar.f151903j) == 0 && Intrinsics.f(this.k, yVar.k) && this.f151904l == yVar.f151904l;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f151898a.hashCode() * 31, 31, this.f151899b), 31, this.f151900c);
        String str = this.d;
        return Integer.hashCode(this.f151904l) + v7.c(m72.b.c(p.a.c(p.a.c((this.f151901g.hashCode() + v7.i(this.f, v7.i(this.e, (iC + (str == null ? 0 : str.hashCode())) * 31, 31), 31)) * 31, 31, this.f151902h), 31, this.i), this.f151903j, 31), 31, this.k);
    }
}
