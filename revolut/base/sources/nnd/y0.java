package nnd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class y0 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccount.Personal.CurrencyPocket f217607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io3.d f217608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f217609c;
    public final dj0.d d;

    public y0(AnalyticsAccount.Personal.CurrencyPocket analyticsAccount, io3.d pocket, dj0.d dVar, dj0.d dVar2) {
        Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f217607a = analyticsAccount;
        this.f217608b = pocket;
        this.f217609c = dVar;
        this.d = dVar2;
    }

    @Override // nnd.c1
    public final AnalyticsAccount a() {
        return this.f217607a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f217607a, y0Var.f217607a) && Intrinsics.f(this.f217608b, y0Var.f217608b) && Intrinsics.f(this.f217609c, y0Var.f217609c) && Intrinsics.f(this.d, y0Var.d);
    }

    public final int hashCode() {
        int iG = h30.l.g(this.f217608b, this.f217607a.f99194a.hashCode() * 31, 31);
        dj0.d dVar = this.f217609c;
        int iHashCode = (iG + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.d;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
