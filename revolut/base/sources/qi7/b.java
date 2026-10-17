package qi7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej0.b f246660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f246661b;

    public b(ej0.b basePrice, Float f) {
        Intrinsics.checkNotNullParameter(basePrice, "basePrice");
        this.f246660a = basePrice;
        this.f246661b = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f246660a, bVar.f246660a) && Intrinsics.f(this.f246661b, bVar.f246661b);
    }

    public final int hashCode() {
        int iHashCode = this.f246660a.hashCode() * 31;
        Float f = this.f246661b;
        return iHashCode + (f == null ? 0 : f.hashCode());
    }
}
