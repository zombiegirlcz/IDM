package fce;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f133714a;

    public p(qua.p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f133714a = subscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f133714a, ((p) obj2).f133714a);
    }

    public final int hashCode() {
        return this.f133714a.hashCode();
    }
}
