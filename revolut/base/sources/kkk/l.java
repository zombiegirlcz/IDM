package kkk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f185109a;

    public l(hha.d pricingPlan) {
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        this.f185109a = pricingPlan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f185109a, ((l) obj2).f185109a);
    }

    public final int hashCode() {
        return this.f185109a.hashCode();
    }
}
