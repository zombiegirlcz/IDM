package lpd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lzi.h f198979a;

    public m(lzi.h analyticsCycle) {
        Intrinsics.checkNotNullParameter(analyticsCycle, "analyticsCycle");
        this.f198979a = analyticsCycle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f198979a, ((m) obj2).f198979a);
    }

    public final int hashCode() {
        return this.f198979a.hashCode();
    }
}
