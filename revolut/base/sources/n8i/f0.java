package n8i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f213424a;

    public f0(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f213424a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f0) && Intrinsics.f(this.f213424a, ((f0) obj2).f213424a);
    }

    public final int hashCode() {
        return this.f213424a.hashCode();
    }
}
