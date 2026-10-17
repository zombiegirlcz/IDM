package nnd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r0 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccount.Joint.CurrencyPocket f217585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io3.d f217586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f217587c;
    public final dj0.d d;

    public r0(AnalyticsAccount.Joint.CurrencyPocket analyticsAccount, io3.d pocket, dj0.d dVar, dj0.d dVar2) {
        Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f217585a = analyticsAccount;
        this.f217586b = pocket;
        this.f217587c = dVar;
        this.d = dVar2;
    }

    @Override // nnd.c1
    public final AnalyticsAccount a() {
        return this.f217585a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f217585a, r0Var.f217585a) && Intrinsics.f(this.f217586b, r0Var.f217586b) && Intrinsics.f(this.f217587c, r0Var.f217587c) && Intrinsics.f(this.d, r0Var.d);
    }

    public final int hashCode() {
        int iG = h30.l.g(this.f217586b, this.f217585a.hashCode() * 31, 31);
        dj0.d dVar = this.f217587c;
        int iHashCode = (iG + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.d;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
