package afa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f4016b;

    public z(String currency, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f4015a = currency;
        this.f4016b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f4015a, zVar.f4015a) && Intrinsics.f(this.f4016b, zVar.f4016b);
    }

    public final int hashCode() {
        int iHashCode = this.f4015a.hashCode() * 31;
        wi0.b bVar = this.f4016b;
        return iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode());
    }
}
