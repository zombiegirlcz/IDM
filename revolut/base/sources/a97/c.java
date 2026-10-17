package a97;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f2366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f2367b;

    public c(BigDecimal bigDecimal, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f2366a = currency;
        this.f2367b = bigDecimal;
    }

    public static c a(c cVar, xi0.b currency) {
        BigDecimal bigDecimal = cVar.f2367b;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new c(bigDecimal, currency);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f2366a, cVar.f2366a) && Intrinsics.f(this.f2367b, cVar.f2367b);
    }

    public final int hashCode() {
        int iHashCode = this.f2366a.hashCode() * 31;
        BigDecimal bigDecimal = this.f2367b;
        return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }
}
