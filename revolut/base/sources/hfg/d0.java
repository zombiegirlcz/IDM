package hfg;

import ip0.v7;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f151816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDateTime f151817c;
    public final LocalDateTime d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Duration f151818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f151819h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f151820j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f151821l;

    public d0(String flightId, ArrayList airlines, LocalDateTime departsAt, LocalDateTime arrivesAt, String departureIataCode, String arrivalIataCode, Duration totalDuration, double d, dj0.d taxesPrice, int i, String str, String str2) {
        Intrinsics.checkNotNullParameter(flightId, "flightId");
        Intrinsics.checkNotNullParameter(airlines, "airlines");
        Intrinsics.checkNotNullParameter(departsAt, "departsAt");
        Intrinsics.checkNotNullParameter(arrivesAt, "arrivesAt");
        Intrinsics.checkNotNullParameter(departureIataCode, "departureIataCode");
        Intrinsics.checkNotNullParameter(arrivalIataCode, "arrivalIataCode");
        Intrinsics.checkNotNullParameter(totalDuration, "totalDuration");
        Intrinsics.checkNotNullParameter(taxesPrice, "taxesPrice");
        this.f151815a = flightId;
        this.f151816b = airlines;
        this.f151817c = departsAt;
        this.d = arrivesAt;
        this.e = departureIataCode;
        this.f = arrivalIataCode;
        this.f151818g = totalDuration;
        this.f151819h = d;
        this.i = taxesPrice;
        this.f151820j = i;
        this.k = str;
        this.f151821l = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f151815a, d0Var.f151815a) && this.f151816b.equals(d0Var.f151816b) && Intrinsics.f(this.f151817c, d0Var.f151817c) && Intrinsics.f(this.d, d0Var.d) && Intrinsics.f(this.e, d0Var.e) && Intrinsics.f(this.f, d0Var.f) && Intrinsics.f(this.f151818g, d0Var.f151818g) && Double.compare(this.f151819h, d0Var.f151819h) == 0 && this.i.equals(d0Var.i) && this.f151820j == d0Var.f151820j && Intrinsics.f(this.k, d0Var.k) && Intrinsics.f(this.f151821l, d0Var.f151821l);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f151820j, v7.c(m72.b.c((this.f151818g.hashCode() + p.a.c(p.a.c(v7.i(this.d, v7.i(this.f151817c, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f151816b, this.f151815a.hashCode() * 31, 31), 31), 31), 31, this.e), 31, this.f)) * 31, this.f151819h, 31), 31, this.i), 31);
        String str = this.k;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f151821l;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
