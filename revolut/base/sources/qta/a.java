package qta;

import h30.l;
import java.math.BigDecimal;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f249039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f249040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f249041c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final BigDecimal f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Pair f249042g;

    public a(xi0.b from, xi0.b to6, BigDecimal askRate, BigDecimal bidRate, BigDecimal midRate, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(askRate, "askRate");
        Intrinsics.checkNotNullParameter(bidRate, "bidRate");
        Intrinsics.checkNotNullParameter(midRate, "midRate");
        this.f249039a = from;
        this.f249040b = to6;
        this.f249041c = askRate;
        this.d = bidRate;
        this.e = midRate;
        this.f = bigDecimal;
        this.f249042g = new Pair(from, to6);
    }

    public final BigDecimal a() {
        return this.f249041c;
    }

    public final BigDecimal b() {
        return this.d;
    }

    public final BigDecimal c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f249039a, aVar.f249039a) && Intrinsics.f(this.f249040b, aVar.f249040b) && Intrinsics.f(this.f249041c, aVar.f249041c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        int iD = t61.a.d(this.e, t61.a.d(this.d, t61.a.d(this.f249041c, l.j(this.f249040b, this.f249039a.hashCode() * 31, 31), 31), 31), 31);
        BigDecimal bigDecimal = this.f;
        return iD + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }
}
