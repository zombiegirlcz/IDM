package x4g;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f302876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f302877b;

    public b(d fee2, String carrierName) {
        Intrinsics.checkNotNullParameter(carrierName, "carrierName");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f302876a = carrierName;
        this.f302877b = fee2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f302876a, bVar.f302876a) && Intrinsics.f(this.f302877b, bVar.f302877b);
    }

    public final int hashCode() {
        return this.f302877b.hashCode() + (this.f302876a.hashCode() * 31);
    }
}
