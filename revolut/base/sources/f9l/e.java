package f9l;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f132995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f132996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f132997c;
    public final Double d;
    public final long e;
    public final Boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f132998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DateTime f132999h;

    public e(String from, String to6, double d, Double d5, long j2, Boolean bool, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f132995a = from;
        this.f132996b = to6;
        this.f132997c = d;
        this.d = d5;
        this.e = j2;
        this.f = bool;
        this.f132998g = dateTime;
        this.f132999h = dateTime2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f132995a, eVar.f132995a) && Intrinsics.f(this.f132996b, eVar.f132996b) && Double.compare(this.f132997c, eVar.f132997c) == 0 && Intrinsics.f(this.d, eVar.d) && this.e == eVar.e && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f132998g, eVar.f132998g) && Intrinsics.f(this.f132999h, eVar.f132999h);
    }

    public final int hashCode() {
        int iC = m72.b.c(p.a.c(this.f132995a.hashCode() * 31, 31, this.f132996b), this.f132997c, 31);
        Double d = this.d;
        int iC2 = a0.d.c((iC + (d == null ? 0 : d.hashCode())) * 31, 31, this.e);
        Boolean bool = this.f;
        int iHashCode = (iC2 + (bool == null ? 0 : bool.hashCode())) * 31;
        DateTime dateTime = this.f132998g;
        int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.f132999h;
        return iHashCode2 + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }
}
