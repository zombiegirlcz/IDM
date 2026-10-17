package o83;

import aii.r;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f222917a;

    public g(p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f222917a = subscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f222917a, ((g) obj2).f222917a);
    }

    public final int hashCode() {
        return this.f222917a.hashCode();
    }
}
