package pfk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.i f235650b;

    public k(String currentPlanId, hha.i billingCode) {
        Intrinsics.checkNotNullParameter(currentPlanId, "currentPlanId");
        Intrinsics.checkNotNullParameter(billingCode, "billingCode");
        this.f235649a = currentPlanId;
        this.f235650b = billingCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f235649a, kVar.f235649a) && this.f235650b == kVar.f235650b;
    }

    public final int hashCode() {
        return this.f235650b.hashCode() + (this.f235649a.hashCode() * 31);
    }
}
