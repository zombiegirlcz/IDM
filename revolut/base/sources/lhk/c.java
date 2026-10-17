package lhk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f195323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hha.i f195324c;

    public c(hha.i billingPeriod, String referralId, String targetPlanId) {
        Intrinsics.checkNotNullParameter(referralId, "referralId");
        Intrinsics.checkNotNullParameter(targetPlanId, "targetPlanId");
        Intrinsics.checkNotNullParameter(billingPeriod, "billingPeriod");
        this.f195322a = referralId;
        this.f195323b = targetPlanId;
        this.f195324c = billingPeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f195322a, cVar.f195322a) && Intrinsics.f(this.f195323b, cVar.f195323b) && this.f195324c == cVar.f195324c;
    }

    public final int hashCode() {
        return this.f195324c.hashCode() + p.a.c(this.f195322a.hashCode() * 31, 31, this.f195323b);
    }
}
