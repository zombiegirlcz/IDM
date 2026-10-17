package p3b;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f232706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f232707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f232708c;

    public d(dj0.d price, dj0.d exposure, BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(exposure, "exposure");
        this.f232706a = price;
        this.f232707b = quantity;
        this.f232708c = exposure;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f232706a, dVar.f232706a) && Intrinsics.f(this.f232707b, dVar.f232707b) && Intrinsics.f(this.f232708c, dVar.f232708c);
    }

    public final int hashCode() {
        return this.f232708c.hashCode() + t61.a.d(this.f232707b, this.f232706a.hashCode() * 31, 31);
    }
}
