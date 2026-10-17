package fce;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f133722a;

    public u(qua.p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f133722a = subscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f133722a, ((u) obj2).f133722a);
    }

    public final int hashCode() {
        return this.f133722a.hashCode();
    }
}
