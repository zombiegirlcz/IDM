package k5k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l5k.g f181548a;

    public p(l5k.g localFee) {
        Intrinsics.checkNotNullParameter(localFee, "localFee");
        this.f181548a = localFee;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f181548a, ((p) obj2).f181548a);
    }

    public final int hashCode() {
        return this.f181548a.hashCode();
    }
}
