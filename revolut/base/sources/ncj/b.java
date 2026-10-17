package ncj;

import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f214221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f214222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f214223c;

    public b(xi0.b currency, Instant updatedAt, List priceTargets) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(priceTargets, "priceTargets");
        this.f214221a = currency;
        this.f214222b = updatedAt;
        this.f214223c = priceTargets;
    }

    public static b a(b bVar, List priceTargets) {
        xi0.b currency = bVar.f214221a;
        Instant updatedAt = bVar.f214222b;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(priceTargets, "priceTargets");
        return new b(currency, updatedAt, priceTargets);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f214221a, bVar.f214221a) && Intrinsics.f(this.f214222b, bVar.f214222b) && Intrinsics.f(this.f214223c, bVar.f214223c);
    }

    public final int hashCode() {
        return this.f214223c.hashCode() + r6.b.c(this.f214221a.hashCode() * 31, 31, this.f214222b);
    }
}
