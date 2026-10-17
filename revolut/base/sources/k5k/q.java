package k5k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l5k.c f181549a;

    public q(l5k.c percentageFee) {
        Intrinsics.checkNotNullParameter(percentageFee, "percentageFee");
        this.f181549a = percentageFee;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f181549a, ((q) obj2).f181549a);
    }

    public final int hashCode() {
        return this.f181549a.hashCode();
    }
}
