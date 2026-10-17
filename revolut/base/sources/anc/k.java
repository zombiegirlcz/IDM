package anc;

import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PortfolioGoal f6750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6751b;

    public k(PortfolioGoal goal, boolean z) {
        Intrinsics.checkNotNullParameter(goal, "goal");
        this.f6750a = goal;
        this.f6751b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f6750a, kVar.f6750a) && this.f6751b == kVar.f6751b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6751b) + (this.f6750a.hashCode() * 31);
    }
}
