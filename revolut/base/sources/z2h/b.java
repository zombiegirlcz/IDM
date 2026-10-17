package z2h;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f319079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f319080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f319081c;

    public b(int i, Instant instant, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f319079a = i;
        this.f319080b = instant;
        this.f319081c = currency;
    }

    @Override // z2h.d
    public final int a() {
        return this.f319079a;
    }

    @Override // z2h.d
    public final Instant b() {
        return this.f319080b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f319079a == bVar.f319079a && Intrinsics.f(this.f319080b, bVar.f319080b) && Intrinsics.f(this.f319081c, bVar.f319081c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f319079a) * 31;
        Instant instant = this.f319080b;
        return this.f319081c.hashCode() + ((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31);
    }
}
