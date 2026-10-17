package fce;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f133713a;

    public o(qua.p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f133713a = subscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f133713a, ((o) obj2).f133713a);
    }

    public final int hashCode() {
        return this.f133713a.hashCode();
    }
}
