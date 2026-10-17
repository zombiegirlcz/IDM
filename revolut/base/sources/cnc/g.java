package cnc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f25390a;

    public g(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f25390a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f25390a, ((g) obj2).f25390a);
    }

    public final int hashCode() {
        return this.f25390a.hashCode();
    }
}
