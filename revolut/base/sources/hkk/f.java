package hkk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.i f152944b;

    public f(String familyPlanId, hha.i billingCode) {
        Intrinsics.checkNotNullParameter(familyPlanId, "familyPlanId");
        Intrinsics.checkNotNullParameter(billingCode, "billingCode");
        this.f152943a = familyPlanId;
        this.f152944b = billingCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f152943a, fVar.f152943a) && this.f152944b == fVar.f152944b;
    }

    public final int hashCode() {
        return this.f152944b.hashCode() + (this.f152943a.hashCode() * 31);
    }
}
