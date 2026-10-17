package bw4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f19228a;

    public i(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f19228a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f19228a, ((i) obj2).f19228a);
    }

    public final int hashCode() {
        return this.f19228a.hashCode();
    }
}
