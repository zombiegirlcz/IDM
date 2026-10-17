package zmj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f323579b;

    public o(String subscriptionId, String planId) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f323578a = subscriptionId;
        this.f323579b = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f323578a, oVar.f323578a) && Intrinsics.f(this.f323579b, oVar.f323579b);
    }

    public final int hashCode() {
        return this.f323579b.hashCode() + (this.f323578a.hashCode() * 31);
    }
}
