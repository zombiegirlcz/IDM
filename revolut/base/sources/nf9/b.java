package nf9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f214876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f214877b;

    public b(wi0.b countryCode, a aVar) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f214876a = countryCode;
        this.f214877b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f214876a, bVar.f214876a) && this.f214877b == bVar.f214877b;
    }

    public final int hashCode() {
        int iHashCode = this.f214876a.f297794a.hashCode() * 31;
        a aVar = this.f214877b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
