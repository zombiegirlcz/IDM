package yof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f315672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yqi.b f315673b;

    public b(xi0.b currency, yqi.b bVar) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f315672a = currency;
        this.f315673b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f315672a, bVar.f315672a) && Intrinsics.f(this.f315673b, bVar.f315673b);
    }

    public final int hashCode() {
        int iHashCode = this.f315672a.hashCode() * 31;
        yqi.b bVar = this.f315673b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
