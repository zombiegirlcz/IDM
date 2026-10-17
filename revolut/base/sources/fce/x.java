package fce;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f133726a;

    public x(qua.p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f133726a = subscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f133726a, ((x) obj2).f133726a);
    }

    public final int hashCode() {
        return this.f133726a.hashCode();
    }
}
