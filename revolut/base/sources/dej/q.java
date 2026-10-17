package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113621b;

    public q(String subscriptionId, String mobilePlanId) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        this.f113620a = subscriptionId;
        this.f113621b = mobilePlanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f113620a, qVar.f113620a) && Intrinsics.f(this.f113621b, qVar.f113621b);
    }

    public final int hashCode() {
        return this.f113621b.hashCode() + (this.f113620a.hashCode() * 31);
    }
}
