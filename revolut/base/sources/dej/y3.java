package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z3 f113695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f113696b;

    public y3(z3 subscription, c2 contextualOrder) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(contextualOrder, "contextualOrder");
        this.f113695a = subscription;
        this.f113696b = contextualOrder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj2;
        return Intrinsics.f(this.f113695a, y3Var.f113695a) && Intrinsics.f(this.f113696b, y3Var.f113696b);
    }

    public final int hashCode() {
        return this.f113696b.hashCode() + (this.f113695a.hashCode() * 31);
    }
}
