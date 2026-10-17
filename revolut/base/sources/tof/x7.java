package tof;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x7 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f273164a;

    public x7(Set billingCycles) {
        Intrinsics.checkNotNullParameter(billingCycles, "billingCycles");
        this.f273164a = billingCycles;
    }

    public final Set a() {
        return this.f273164a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x7) && Intrinsics.f(this.f273164a, ((x7) obj2).f273164a);
    }

    public final int hashCode() {
        return this.f273164a.hashCode();
    }
}
