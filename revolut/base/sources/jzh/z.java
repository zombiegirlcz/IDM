package jzh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class z implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f179874a;

    public z(qua.p payment) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        this.f179874a = payment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f179874a, ((z) obj2).f179874a);
    }

    public final int hashCode() {
        return this.f179874a.hashCode();
    }
}
