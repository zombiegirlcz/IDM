package m1c;

import java.time.Period;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Period f201439a;

    public q(Period period) {
        this.f201439a = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f201439a, ((q) obj2).f201439a);
    }

    public final int hashCode() {
        Period period = this.f201439a;
        if (period == null) {
            return 0;
        }
        return period.hashCode();
    }
}
