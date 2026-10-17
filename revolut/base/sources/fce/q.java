package fce;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f133715a;

    public q(qua.p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f133715a = subscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f133715a, ((q) obj2).f133715a);
    }

    public final int hashCode() {
        return this.f133715a.hashCode();
    }
}
