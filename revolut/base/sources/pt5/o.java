package pt5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f239623a;

    public o(qua.p payment) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        this.f239623a = payment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f239623a, ((o) obj2).f239623a);
    }

    public final int hashCode() {
        return this.f239623a.hashCode();
    }
}
