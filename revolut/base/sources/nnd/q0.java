package nnd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q0 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccount.Joint.All f217580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f217581b;

    public q0(AnalyticsAccount.Joint.All analyticsAccount, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
        this.f217580a = analyticsAccount;
        this.f217581b = dVar;
    }

    @Override // nnd.c1
    public final AnalyticsAccount a() {
        return this.f217580a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f217580a, q0Var.f217580a) && Intrinsics.f(this.f217581b, q0Var.f217581b);
    }

    public final int hashCode() {
        int iHashCode = this.f217580a.f99179a.hashCode() * 31;
        dj0.d dVar = this.f217581b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
