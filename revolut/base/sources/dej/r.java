package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f113633c;

    public r(String subscriptionId, String portingId, String mobilePlanId) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(portingId, "portingId");
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        this.f113631a = subscriptionId;
        this.f113632b = portingId;
        this.f113633c = mobilePlanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f113631a, rVar.f113631a) && Intrinsics.f(this.f113632b, rVar.f113632b) && Intrinsics.f(this.f113633c, rVar.f113633c);
    }

    public final int hashCode() {
        return this.f113633c.hashCode() + p.a.c(this.f113631a.hashCode() * 31, 31, this.f113632b);
    }
}
