package kkk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lha.k f185106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.d f185107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f185108c;

    public k(lha.k inviter, hha.d pricingPlan, boolean z) {
        Intrinsics.checkNotNullParameter(inviter, "inviter");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        this.f185106a = inviter;
        this.f185107b = pricingPlan;
        this.f185108c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f185106a, kVar.f185106a) && Intrinsics.f(this.f185107b, kVar.f185107b) && this.f185108c == kVar.f185108c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f185108c) + ((this.f185107b.hashCode() + (this.f185106a.hashCode() * 31)) * 31);
    }
}
