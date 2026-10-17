package l1l;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f191579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f191580b;

    public e(Set set, xi0.b targetCurrency) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        this.f191579a = targetCurrency;
        this.f191580b = set;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f191579a, eVar.f191579a) && Intrinsics.f(this.f191580b, eVar.f191580b);
    }

    public final int hashCode() {
        int iHashCode = this.f191579a.hashCode() * 31;
        Set set = this.f191580b;
        return iHashCode + (set == null ? 0 : set.hashCode());
    }
}
