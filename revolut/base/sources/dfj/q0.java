package dfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114073c;

    public q0(String subscriptionId, String portingId, String mobilePlanId) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(portingId, "portingId");
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        this.f114071a = subscriptionId;
        this.f114072b = portingId;
        this.f114073c = mobilePlanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f114071a, q0Var.f114071a) && Intrinsics.f(this.f114072b, q0Var.f114072b) && Intrinsics.f(this.f114073c, q0Var.f114073c);
    }

    public final int hashCode() {
        return this.f114073c.hashCode() + p.a.c(this.f114071a.hashCode() * 31, 31, this.f114072b);
    }
}
