package hpc;

import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoboPortfolioInfo f154519a;

    public a(RoboPortfolioInfo roboPortfolioInfo) {
        Intrinsics.checkNotNullParameter(roboPortfolioInfo, "roboPortfolioInfo");
        this.f154519a = roboPortfolioInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f154519a, ((a) obj2).f154519a);
    }

    public final int hashCode() {
        return this.f154519a.hashCode();
    }
}
