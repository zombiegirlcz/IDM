package ybh;

import com.revolut.feature.wealth.api.navigation.models.DepositInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DepositInfo f312341a;

    public q(DepositInfo depositInfo) {
        Intrinsics.checkNotNullParameter(depositInfo, "depositInfo");
        this.f312341a = depositInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f312341a, ((q) obj2).f312341a);
    }

    public final int hashCode() {
        return this.f312341a.hashCode();
    }
}
