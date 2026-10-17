package y1i;

import h30.l;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import v1.c;
import wd6.e;
import wd6.h;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f310382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f310383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f310384c;
    public final h d;
    public final xi0.b e;
    public final xi0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f310385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f310386h;
    public final boolean i;

    public b(double d, String str, BigDecimal currentRate, h orderType, xi0.b targetCurrency, xi0.b counterCurrency, e exchangeMode, a state, boolean z) {
        Intrinsics.checkNotNullParameter(currentRate, "currentRate");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(counterCurrency, "counterCurrency");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f310382a = d;
        this.f310383b = str;
        this.f310384c = currentRate;
        this.d = orderType;
        this.e = targetCurrency;
        this.f = counterCurrency;
        this.f310385g = exchangeMode;
        this.f310386h = state;
        this.i = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Double.compare(this.f310382a, bVar.f310382a) == 0 && Intrinsics.f(this.f310383b, bVar.f310383b) && Intrinsics.f(this.f310384c, bVar.f310384c) && this.d == bVar.d && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && this.f310385g == bVar.f310385g && this.f310386h == bVar.f310386h && this.i == bVar.i;
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.f310382a) * 31;
        String str = this.f310383b;
        return Boolean.hashCode(this.i) + ((this.f310386h.hashCode() + y.g(this.f310385g, l.j(this.f, l.j(this.e, c.b(this.d, t61.a.d(this.f310384c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31)) * 31);
    }
}
