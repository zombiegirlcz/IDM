package jlc;

import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f175692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PortfolioGoal f175693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f175694c;
    public final dj0.d d;

    public m(String templateId, PortfolioGoal portfolioGoal, dj0.d dVar, dj0.d dVar2) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        this.f175692a = templateId;
        this.f175693b = portfolioGoal;
        this.f175694c = dVar;
        this.d = dVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f175692a, mVar.f175692a) && Intrinsics.f(this.f175693b, mVar.f175693b) && Intrinsics.f(this.f175694c, mVar.f175694c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f175692a.hashCode() * 31;
        PortfolioGoal portfolioGoal = this.f175693b;
        int iHashCode2 = (iHashCode + (portfolioGoal == null ? 0 : portfolioGoal.hashCode())) * 31;
        dj0.d dVar = this.f175694c;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.d;
        return iHashCode3 + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
