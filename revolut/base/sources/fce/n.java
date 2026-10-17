package fce;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f133712a;

    public n(qua.p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f133712a = subscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f133712a, ((n) obj2).f133712a);
    }

    public final int hashCode() {
        return this.f133712a.hashCode();
    }
}
