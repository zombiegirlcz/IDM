package anc;

import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PortfolioGoal f6748a;

    public i(PortfolioGoal goal) {
        Intrinsics.checkNotNullParameter(goal, "goal");
        this.f6748a = goal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f6748a, ((i) obj2).f6748a);
    }

    public final int hashCode() {
        return this.f6748a.hashCode();
    }
}
