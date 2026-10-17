package dfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114085b;

    public r0(String subscriptionId, String mobilePlanId) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        this.f114084a = subscriptionId;
        this.f114085b = mobilePlanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f114084a, r0Var.f114084a) && Intrinsics.f(this.f114085b, r0Var.f114085b);
    }

    public final int hashCode() {
        return this.f114085b.hashCode() + (this.f114084a.hashCode() * 31);
    }
}
