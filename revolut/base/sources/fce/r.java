package fce;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f133716a;

    public r(qua.p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f133716a = subscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f133716a, ((r) obj2).f133716a);
    }

    public final int hashCode() {
        return this.f133716a.hashCode();
    }
}
