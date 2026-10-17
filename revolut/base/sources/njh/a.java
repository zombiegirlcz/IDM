package njh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthAccount.Robo f216520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RoboPortfolioInfo f216521b;

    public a(WealthAccount.Robo account, RoboPortfolioInfo portfolioInfo) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(portfolioInfo, "portfolioInfo");
        this.f216520a = account;
        this.f216521b = portfolioInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f216520a, aVar.f216520a) && Intrinsics.f(this.f216521b, aVar.f216521b);
    }

    public final int hashCode() {
        return this.f216521b.hashCode() + (this.f216520a.hashCode() * 31);
    }
}
