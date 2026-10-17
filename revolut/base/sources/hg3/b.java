package hg3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f152079a;

    public b(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f152079a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f152079a, ((b) obj2).f152079a);
    }

    public final int hashCode() {
        return this.f152079a.hashCode();
    }
}
