package x84;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pu3.b f303284a;

    public k(pu3.b debt) {
        Intrinsics.checkNotNullParameter(debt, "debt");
        this.f303284a = debt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f303284a, ((k) obj2).f303284a);
    }

    public final int hashCode() {
        return this.f303284a.hashCode();
    }
}
