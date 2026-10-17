package ewh;

import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoboPortfolioInfo f130274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final del.b f130275b;

    public m(RoboPortfolioInfo portfolioInfo, del.b portfolioBalance) {
        Intrinsics.checkNotNullParameter(portfolioInfo, "portfolioInfo");
        Intrinsics.checkNotNullParameter(portfolioBalance, "portfolioBalance");
        this.f130274a = portfolioInfo;
        this.f130275b = portfolioBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f130274a, mVar.f130274a) && Intrinsics.f(this.f130275b, mVar.f130275b);
    }

    public final int hashCode() {
        return this.f130275b.hashCode() + (this.f130274a.hashCode() * 31);
    }
}
