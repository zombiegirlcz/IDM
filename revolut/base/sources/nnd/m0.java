package nnd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m0 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccount.Junior.All f217569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f217570b;

    public m0(AnalyticsAccount.Junior.All analyticsAccount, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
        this.f217569a = analyticsAccount;
        this.f217570b = dVar;
    }

    @Override // nnd.c1
    public final AnalyticsAccount a() {
        return this.f217569a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f217569a, m0Var.f217569a) && Intrinsics.f(this.f217570b, m0Var.f217570b);
    }

    public final int hashCode() {
        int iHashCode = this.f217569a.hashCode() * 31;
        dj0.d dVar = this.f217570b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
