package fce;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f133705a;

    public h(qua.p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f133705a = subscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f133705a, ((h) obj2).f133705a);
    }

    public final int hashCode() {
        return this.f133705a.hashCode();
    }
}
