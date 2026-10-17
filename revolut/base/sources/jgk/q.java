package jgk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f174085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f174086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f174087c;

    public q(hha.d pricingPlan, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        this.f174085a = pricingPlan;
        this.f174086b = z;
        this.f174087c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f174085a, qVar.f174085a) && this.f174086b == qVar.f174086b && this.f174087c == qVar.f174087c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f174087c) + j6.a.c(this.f174085a.hashCode() * 31, 31, this.f174086b);
    }
}
