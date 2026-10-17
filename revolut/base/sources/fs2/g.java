package fs2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f137559a;

    public g(qua.p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f137559a = subscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f137559a, ((g) obj2).f137559a);
    }

    public final int hashCode() {
        return this.f137559a.hashCode();
    }
}
