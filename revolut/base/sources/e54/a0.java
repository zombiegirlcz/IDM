package e54;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f122739a;

    public a0(dj0.d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        this.f122739a = money;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f122739a, ((a0) obj2).f122739a);
    }

    public final int hashCode() {
        return this.f122739a.hashCode();
    }
}
