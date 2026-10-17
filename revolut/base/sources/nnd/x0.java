package nnd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class x0 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccount.Personal.All f217605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f217606b;

    public x0(AnalyticsAccount.Personal.All analyticsAccount, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
        this.f217605a = analyticsAccount;
        this.f217606b = dVar;
    }

    @Override // nnd.c1
    public final AnalyticsAccount a() {
        return this.f217605a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.f217605a, x0Var.f217605a) && Intrinsics.f(this.f217606b, x0Var.f217606b);
    }

    public final int hashCode() {
        int iHashCode = this.f217605a.hashCode() * 31;
        dj0.d dVar = this.f217606b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
