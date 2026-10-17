package kkk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f185104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f185105b;

    public j(hha.d pricingPlan, boolean z) {
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        this.f185104a = pricingPlan;
        this.f185105b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f185104a, jVar.f185104a) && this.f185105b == jVar.f185105b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f185105b) + (this.f185104a.hashCode() * 31);
    }
}
