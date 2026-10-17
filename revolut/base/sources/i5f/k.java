package i5f;

import kotlin.jvm.internal.Intrinsics;
import t1h.p;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hel.b f158835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kel.b f158836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f158837c;

    public k(hel.b bVar, kel.b cashHolding, String portfolioId) {
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f158835a = bVar;
        this.f158836b = cashHolding;
        this.f158837c = portfolioId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f158835a == kVar.f158835a && Intrinsics.f(this.f158836b, kVar.f158836b) && Intrinsics.f(this.f158837c, kVar.f158837c);
    }

    public final int hashCode() {
        hel.b bVar = this.f158835a;
        return this.f158837c.hashCode() + ((this.f158836b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31)) * 31);
    }
}
