package nnd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b1 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccount.Pro.CurrencyPocket f217529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io3.d f217530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f217531c;
    public final dj0.d d;

    public b1(AnalyticsAccount.Pro.CurrencyPocket analyticsAccount, io3.d pocket, dj0.d dVar, dj0.d dVar2) {
        Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f217529a = analyticsAccount;
        this.f217530b = pocket;
        this.f217531c = dVar;
        this.d = dVar2;
    }

    @Override // nnd.c1
    public final AnalyticsAccount a() {
        return this.f217529a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Intrinsics.f(this.f217529a, b1Var.f217529a) && Intrinsics.f(this.f217530b, b1Var.f217530b) && Intrinsics.f(this.f217531c, b1Var.f217531c) && Intrinsics.f(this.d, b1Var.d);
    }

    public final int hashCode() {
        int iG = h30.l.g(this.f217530b, this.f217529a.f99197a.hashCode() * 31, 31);
        dj0.d dVar = this.f217531c;
        int iHashCode = (iG + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.d;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
