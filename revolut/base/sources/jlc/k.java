package jlc;

import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f175687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PortfolioGoal f175688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f175689c;

    public k(String portfolioId, PortfolioGoal portfolioGoal, j mode) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f175687a = portfolioId;
        this.f175688b = portfolioGoal;
        this.f175689c = mode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f175687a, kVar.f175687a) && Intrinsics.f(this.f175688b, kVar.f175688b) && Intrinsics.f(this.f175689c, kVar.f175689c);
    }

    public final int hashCode() {
        int iHashCode = this.f175687a.hashCode() * 31;
        PortfolioGoal portfolioGoal = this.f175688b;
        return this.f175689c.hashCode() + ((iHashCode + (portfolioGoal == null ? 0 : portfolioGoal.hashCode())) * 31);
    }
}
