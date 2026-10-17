package hgb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mgb.o f152151a;

    public q(mgb.o salaryHubReward) {
        Intrinsics.checkNotNullParameter(salaryHubReward, "salaryHubReward");
        this.f152151a = salaryHubReward;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && this.f152151a == ((q) obj2).f152151a;
    }

    public final int hashCode() {
        return this.f152151a.hashCode();
    }
}
