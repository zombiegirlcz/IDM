package enh;

import kotlin.jvm.internal.Intrinsics;
import vel.f;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f127830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f127831b;

    public a(f performanceAsset, Object obj2) {
        Intrinsics.checkNotNullParameter(performanceAsset, "performanceAsset");
        this.f127830a = performanceAsset;
        this.f127831b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f127830a, aVar.f127830a) && Intrinsics.f(this.f127831b, aVar.f127831b);
    }

    public final int hashCode() {
        int iHashCode = this.f127830a.hashCode() * 31;
        Object obj2 = this.f127831b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
