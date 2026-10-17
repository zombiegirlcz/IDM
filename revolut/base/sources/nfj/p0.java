package nfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p0 extends q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215016a;

    public p0(String subscriptionId) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        this.f215016a = subscriptionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p0) && Intrinsics.f(this.f215016a, ((p0) obj2).f215016a);
    }

    public final int hashCode() {
        return this.f215016a.hashCode();
    }
}
