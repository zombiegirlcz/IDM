package nq7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f218373a;

    public d(dj0.d payment) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        this.f218373a = payment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f218373a, ((d) obj2).f218373a);
    }

    public final int hashCode() {
        return this.f218373a.hashCode();
    }
}
