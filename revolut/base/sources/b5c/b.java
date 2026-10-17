package b5c;

import a0.d;
import h30.l;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f12487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f12488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f12489c;
    public final long d;
    public final long e;

    public b(xi0.b currency, xi0.b baseCurrency, BigDecimal bigDecimal, long j2, long j3) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        this.f12487a = currency;
        this.f12488b = baseCurrency;
        this.f12489c = bigDecimal;
        this.d = j2;
        this.e = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f12487a, bVar.f12487a) && Intrinsics.f(this.f12488b, bVar.f12488b) && Intrinsics.f(this.f12489c, bVar.f12489c) && this.d == bVar.d && this.e == bVar.e;
    }

    public final int hashCode() {
        int iJ = l.j(this.f12488b, this.f12487a.hashCode() * 31, 31);
        BigDecimal bigDecimal = this.f12489c;
        return Long.hashCode(this.e) + d.c((iJ + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31, 31, this.d);
    }
}
