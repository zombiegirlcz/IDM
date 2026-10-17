package zod;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f324018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f324019b;

    public p(dj0.d inflow, dj0.d outflow) {
        Intrinsics.checkNotNullParameter(inflow, "inflow");
        Intrinsics.checkNotNullParameter(outflow, "outflow");
        this.f324018a = inflow;
        this.f324019b = outflow;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f324018a, pVar.f324018a) && Intrinsics.f(this.f324019b, pVar.f324019b);
    }

    public final int hashCode() {
        return this.f324019b.hashCode() + (this.f324018a.hashCode() * 31);
    }
}
