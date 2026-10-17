package qta;

import h30.l;
import java.math.BigDecimal;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f249046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f249047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f249048c;
    public final BigDecimal d;
    public final Boolean e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f249049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Pair f249050h;

    public /* synthetic */ c(xi0.b bVar, xi0.b bVar2, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        this(bVar, bVar2, bigDecimal, bigDecimal2, null, null, null);
    }

    public final BigDecimal a() {
        return this.f249048c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f249046a, cVar.f249046a) && Intrinsics.f(this.f249047b, cVar.f249047b) && Intrinsics.f(this.f249048c, cVar.f249048c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f249049g, cVar.f249049g);
    }

    public final int hashCode() {
        int iD = t61.a.d(this.f249048c, l.j(this.f249047b, this.f249046a.hashCode() * 31, 31), 31);
        BigDecimal bigDecimal = this.d;
        int iHashCode = (iD + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        DateTime dateTime = this.f;
        int iHashCode3 = (iHashCode2 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.f249049g;
        return iHashCode3 + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }

    public c(xi0.b from, xi0.b to6, BigDecimal rate, BigDecimal bigDecimal, Boolean bool, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(rate, "rate");
        this.f249046a = from;
        this.f249047b = to6;
        this.f249048c = rate;
        this.d = bigDecimal;
        this.e = bool;
        this.f = dateTime;
        this.f249049g = dateTime2;
        this.f249050h = new Pair(from, to6);
    }
}
