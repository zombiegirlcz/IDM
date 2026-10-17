package x5i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements j8l.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f302991a;

    public j(dj0.d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        this.f302991a = money;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f302991a, ((j) obj2).f302991a);
    }

    public final int hashCode() {
        return this.f302991a.hashCode();
    }
}
