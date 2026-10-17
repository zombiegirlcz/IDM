package n9l;

import h30.l;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f213661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f213662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f213663c;
    public final Boolean d;
    public final DateTime e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Pair f213664g;

    public /* synthetic */ a(double d, xi0.b bVar, xi0.b bVar2) {
        this(bVar, bVar2, d, null, null, null);
    }

    public static a a(a aVar, double d) {
        xi0.b from = aVar.f213661a;
        xi0.b to6 = aVar.f213662b;
        Boolean bool = aVar.d;
        DateTime dateTime = aVar.e;
        DateTime dateTime2 = aVar.f;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        return new a(from, to6, d, bool, dateTime, dateTime2);
    }

    public final xi0.b b() {
        return this.f213661a;
    }

    public final double c() {
        return this.f213663c;
    }

    public final xi0.b d() {
        return this.f213662b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f213661a, aVar.f213661a) && Intrinsics.f(this.f213662b, aVar.f213662b) && Double.compare(this.f213663c, aVar.f213663c) == 0 && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        int iC = m72.b.c(l.j(this.f213662b, this.f213661a.hashCode() * 31, 31), this.f213663c, 31);
        Boolean bool = this.d;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        DateTime dateTime = this.e;
        int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.f;
        return iHashCode2 + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }

    public a(xi0.b from, xi0.b to6, double d, Boolean bool, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f213661a = from;
        this.f213662b = to6;
        this.f213663c = d;
        this.d = bool;
        this.e = dateTime;
        this.f = dateTime2;
        this.f213664g = new Pair(from, to6);
    }
}
