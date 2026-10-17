package bnh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthAccount.Robo f17210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RoboPortfolioInfo f17211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final del.b f17212c;
    public final dj0.d d;
    public final List e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vel.l f17213g;

    public q(WealthAccount.Robo account, RoboPortfolioInfo portfolioInfo, del.b bVar, dj0.d dVar, List accountActions, boolean z, vel.l lVar) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(portfolioInfo, "portfolioInfo");
        Intrinsics.checkNotNullParameter(accountActions, "accountActions");
        this.f17210a = account;
        this.f17211b = portfolioInfo;
        this.f17212c = bVar;
        this.d = dVar;
        this.e = accountActions;
        this.f = z;
        this.f17213g = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f17210a, qVar.f17210a) && Intrinsics.f(this.f17211b, qVar.f17211b) && Intrinsics.f(this.f17212c, qVar.f17212c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && this.f == qVar.f && Intrinsics.f(this.f17213g, qVar.f17213g);
    }

    public final int hashCode() {
        int iHashCode = (this.f17211b.hashCode() + (this.f17210a.hashCode() * 31)) * 31;
        del.b bVar = this.f17212c;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        dj0.d dVar = this.d;
        int iC = j6.a.c(p.a.d((iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.e), 31, this.f);
        vel.l lVar = this.f17213g;
        return iC + (lVar != null ? lVar.hashCode() : 0);
    }
}
