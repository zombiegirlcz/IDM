package zmj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class z implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323599a;

    public z(String subscriptionId) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        this.f323599a = subscriptionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f323599a, ((z) obj2).f323599a);
    }

    public final int hashCode() {
        return this.f323599a.hashCode();
    }
}
