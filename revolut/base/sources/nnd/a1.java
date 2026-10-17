package nnd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a1 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccount.Pro.All f217523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f217524b;

    public a1(AnalyticsAccount.Pro.All analyticsAccount, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
        this.f217523a = analyticsAccount;
        this.f217524b = dVar;
    }

    @Override // nnd.c1
    public final AnalyticsAccount a() {
        return this.f217523a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj2;
        return Intrinsics.f(this.f217523a, a1Var.f217523a) && Intrinsics.f(this.f217524b, a1Var.f217524b);
    }

    public final int hashCode() {
        int iHashCode = this.f217523a.hashCode() * 31;
        dj0.d dVar = this.f217524b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
