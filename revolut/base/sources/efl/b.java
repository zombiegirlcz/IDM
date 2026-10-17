package efl;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f125361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f125363c;

    public b(String symbol, String ref2, BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f125361a = quantity;
        this.f125362b = symbol;
        this.f125363c = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f125361a, bVar.f125361a) && Intrinsics.f(this.f125362b, bVar.f125362b) && Intrinsics.f(this.f125363c, bVar.f125363c);
    }

    public final int hashCode() {
        return this.f125363c.hashCode() + p.a.c(this.f125361a.hashCode() * 31, 31, this.f125362b);
    }
}
