package j8l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f172233a;

    public g(dj0.d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        this.f172233a = money;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f172233a, ((g) obj2).f172233a);
    }

    public final int hashCode() {
        return this.f172233a.hashCode();
    }
}
