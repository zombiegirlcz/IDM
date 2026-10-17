package fce;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f133704a;

    public g(qua.p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f133704a = subscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f133704a, ((g) obj2).f133704a);
    }

    public final int hashCode() {
        return this.f133704a.hashCode();
    }
}
