package lha;

import java.io.Serializable;
import java.time.Instant;
import java.time.Period;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f195197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f195198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Period f195199c;
    public final Instant d;
    public final a e;
    public final Boolean f;

    public b(int i, int i2, Period limitPeriod, Instant instant, a aVar, Boolean bool) {
        Intrinsics.checkNotNullParameter(limitPeriod, "limitPeriod");
        this.f195197a = i;
        this.f195198b = i2;
        this.f195199c = limitPeriod;
        this.d = instant;
        this.e = aVar;
        this.f = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f195197a == bVar.f195197a && this.f195198b == bVar.f195198b && Intrinsics.f(this.f195199c, bVar.f195199c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f195199c.hashCode() + j6.a.b(this.f195198b, Integer.hashCode(this.f195197a) * 31, 31)) * 31;
        Instant instant = this.d;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        a aVar = this.e;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Boolean bool = this.f;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }
}
