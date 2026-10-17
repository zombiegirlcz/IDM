package klf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q2 implements r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v61.h f185562a;

    public q2(v61.h splittedBill) {
        Intrinsics.checkNotNullParameter(splittedBill, "splittedBill");
        this.f185562a = splittedBill;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q2) && Intrinsics.f(this.f185562a, ((q2) obj2).f185562a);
    }

    public final int hashCode() {
        return this.f185562a.hashCode();
    }
}
