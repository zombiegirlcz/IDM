package xy3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class u implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f309597a;

    public u(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f309597a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f309597a, ((u) obj2).f309597a);
    }

    public final int hashCode() {
        return this.f309597a.hashCode();
    }
}
