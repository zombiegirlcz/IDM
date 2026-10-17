package qjh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthAccount.Robo f246881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RoboPortfolioInfo f246882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f246883c;

    public a(WealthAccount.Robo account, RoboPortfolioInfo portfolioInfo, String str) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(portfolioInfo, "portfolioInfo");
        this.f246881a = account;
        this.f246882b = portfolioInfo;
        this.f246883c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f246881a, aVar.f246881a) && Intrinsics.f(this.f246882b, aVar.f246882b) && Intrinsics.f(this.f246883c, aVar.f246883c);
    }

    public final int hashCode() {
        int iHashCode = (this.f246882b.hashCode() + (this.f246881a.hashCode() * 31)) * 31;
        String str = this.f246883c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
