package kel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZonedDateTime f183158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f183159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f183160c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ZonedDateTime f183161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ZonedDateTime f183162h;

    public d(ZonedDateTime createdDate, String ref2, BigDecimal total, BigDecimal pending, BigDecimal available, f lockup, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2) {
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(pending, "pending");
        Intrinsics.checkNotNullParameter(available, "available");
        Intrinsics.checkNotNullParameter(lockup, "lockup");
        this.f183158a = createdDate;
        this.f183159b = ref2;
        this.f183160c = total;
        this.d = pending;
        this.e = available;
        this.f = lockup;
        this.f183161g = zonedDateTime;
        this.f183162h = zonedDateTime2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f183158a, dVar.f183158a) && Intrinsics.f(this.f183159b, dVar.f183159b) && Intrinsics.f(this.f183160c, dVar.f183160c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && this.f == dVar.f && Intrinsics.f(this.f183161g, dVar.f183161g) && Intrinsics.f(this.f183162h, dVar.f183162h);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + t61.a.d(this.e, t61.a.d(this.d, t61.a.d(this.f183160c, p.a.c(this.f183158a.hashCode() * 31, 31, this.f183159b), 31), 31), 31)) * 31;
        ZonedDateTime zonedDateTime = this.f183161g;
        int iHashCode2 = (iHashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.f183162h;
        return iHashCode2 + (zonedDateTime2 != null ? zonedDateTime2.hashCode() : 0);
    }
}
