package qu4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f249230a;

    public k(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f249230a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f249230a, ((k) obj2).f249230a);
    }

    public final int hashCode() {
        return this.f249230a.hashCode();
    }
}
