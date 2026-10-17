package sdh;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f261890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f261891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f261892c;
    public final Instant d;
    public final Instant e;
    public final BigDecimal f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f261893g;

    public b(Instant start, Instant end2, BigDecimal maxDrawdown, Instant instant, Instant instant2, BigDecimal bigDecimal, ArrayList points) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        Intrinsics.checkNotNullParameter(maxDrawdown, "maxDrawdown");
        Intrinsics.checkNotNullParameter(points, "points");
        this.f261890a = start;
        this.f261891b = end2;
        this.f261892c = maxDrawdown;
        this.d = instant;
        this.e = instant2;
        this.f = bigDecimal;
        this.f261893g = points;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f261890a, bVar.f261890a) && Intrinsics.f(this.f261891b, bVar.f261891b) && Intrinsics.f(this.f261892c, bVar.f261892c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && this.f261893g.equals(bVar.f261893g);
    }

    public final int hashCode() {
        int iD = t61.a.d(this.f261892c, r6.b.c(this.f261890a.hashCode() * 31, 31, this.f261891b), 31);
        Instant instant = this.d;
        int iHashCode = (iD + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.e;
        int iHashCode2 = (iHashCode + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        BigDecimal bigDecimal = this.f;
        return this.f261893g.hashCode() + ((iHashCode2 + (bigDecimal != null ? bigDecimal.hashCode() : 0)) * 31);
    }
}
