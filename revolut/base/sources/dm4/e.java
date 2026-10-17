package dm4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f115857a;

    public e(dj0.d maxAmount) {
        Intrinsics.checkNotNullParameter(maxAmount, "maxAmount");
        this.f115857a = maxAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f115857a, ((e) obj2).f115857a);
    }

    public final int hashCode() {
        return this.f115857a.hashCode();
    }
}
