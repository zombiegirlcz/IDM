package nnd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u0 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccount.Junior.CurrencyPocket f217596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io3.d f217597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f217598c;
    public final dj0.d d;

    public u0(AnalyticsAccount.Junior.CurrencyPocket analyticsAccount, io3.d pocket, dj0.d dVar, dj0.d dVar2) {
        Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f217596a = analyticsAccount;
        this.f217597b = pocket;
        this.f217598c = dVar;
        this.d = dVar2;
    }

    @Override // nnd.c1
    public final AnalyticsAccount a() {
        return this.f217596a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.f217596a, u0Var.f217596a) && Intrinsics.f(this.f217597b, u0Var.f217597b) && Intrinsics.f(this.f217598c, u0Var.f217598c) && Intrinsics.f(this.d, u0Var.d);
    }

    public final int hashCode() {
        int iG = h30.l.g(this.f217597b, this.f217596a.hashCode() * 31, 31);
        dj0.d dVar = this.f217598c;
        int iHashCode = (iG + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.d;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
