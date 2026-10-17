package pmk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f237623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f237624b;

    public m(hha.d pricingPlan, boolean z) {
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        this.f237623a = pricingPlan;
        this.f237624b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f237623a, mVar.f237623a) && this.f237624b == mVar.f237624b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f237624b) + (this.f237623a.hashCode() * 31);
    }
}
