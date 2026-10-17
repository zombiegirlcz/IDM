package cv3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dx4.l f109259a;

    public l(dx4.l action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f109259a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f109259a, ((l) obj2).f109259a);
    }

    public final int hashCode() {
        return this.f109259a.hashCode();
    }
}
