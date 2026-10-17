package dfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114057a;

    public o0(String subscriptionId) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        this.f114057a = subscriptionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o0) && Intrinsics.f(this.f114057a, ((o0) obj2).f114057a);
    }

    public final int hashCode() {
        return this.f114057a.hashCode();
    }
}
