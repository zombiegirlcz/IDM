package dm4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f115853a;

    public b(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f115853a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f115853a, ((b) obj2).f115853a);
    }

    public final int hashCode() {
        return this.f115853a.hashCode();
    }
}
