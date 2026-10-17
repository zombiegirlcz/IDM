package xs4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f308418a;

    public t(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f308418a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f308418a, ((t) obj2).f308418a);
    }

    public final int hashCode() {
        return this.f308418a.hashCode();
    }
}
