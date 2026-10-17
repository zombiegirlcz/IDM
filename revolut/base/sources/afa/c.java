package afa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f3980b;

    public c(String currency, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f3979a = currency;
        this.f3980b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f3979a, cVar.f3979a) && Intrinsics.f(this.f3980b, cVar.f3980b);
    }

    public final int hashCode() {
        int iHashCode = this.f3979a.hashCode() * 31;
        wi0.b bVar = this.f3980b;
        return iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode());
    }
}
