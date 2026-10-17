package vel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f288344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f288345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f288346c;
    public final BigDecimal d;

    public a(xi0.b from, xi0.b to6, BigDecimal volatility, BigDecimal currentRate) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(volatility, "volatility");
        Intrinsics.checkNotNullParameter(currentRate, "currentRate");
        this.f288344a = from;
        this.f288345b = to6;
        this.f288346c = volatility;
        this.d = currentRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f288344a, aVar.f288344a) && Intrinsics.f(this.f288345b, aVar.f288345b) && Intrinsics.f(this.f288346c, aVar.f288346c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.d(this.f288346c, h30.l.j(this.f288345b, this.f288344a.hashCode() * 31, 31), 31);
    }
}
