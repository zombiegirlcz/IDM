package wk2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class y implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f298228a;

    public y(i0 pendingAction) {
        Intrinsics.checkNotNullParameter(pendingAction, "pendingAction");
        this.f298228a = pendingAction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f298228a, ((y) obj2).f298228a);
    }

    public final int hashCode() {
        return this.f298228a.hashCode();
    }
}
