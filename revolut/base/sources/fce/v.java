package fce;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f133723a;

    public v(qua.p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f133723a = subscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f133723a, ((v) obj2).f133723a);
    }

    public final int hashCode() {
        return this.f133723a.hashCode();
    }
}
