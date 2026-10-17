package mw4;

import kotlin.jvm.internal.Intrinsics;
import mw4.a;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f209330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f209331b;

    public d(dj0.d amount, dj0.d reduced) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(reduced, "reduced");
        this.f209330a = amount;
        this.f209331b = reduced;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f209330a, dVar.f209330a) && Intrinsics.f(this.f209331b, dVar.f209331b);
    }

    public final int hashCode() {
        return this.f209331b.hashCode() + (this.f209330a.hashCode() * 31);
    }
}
