package nnd;

import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t0 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccount.Joint.Subaccount f217593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Subaccount f217594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f217595c;
    public final dj0.d d;

    public t0(AnalyticsAccount.Joint.Subaccount analyticsAccount, Subaccount subaccount, dj0.d dVar, dj0.d dVar2) {
        Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
        Intrinsics.checkNotNullParameter(subaccount, "subaccount");
        this.f217593a = analyticsAccount;
        this.f217594b = subaccount;
        this.f217595c = dVar;
        this.d = dVar2;
    }

    @Override // nnd.c1
    public final AnalyticsAccount a() {
        return this.f217593a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.f217593a, t0Var.f217593a) && Intrinsics.f(this.f217594b, t0Var.f217594b) && Intrinsics.f(this.f217595c, t0Var.f217595c) && Intrinsics.f(this.d, t0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f217594b.hashCode() + (this.f217593a.hashCode() * 31)) * 31;
        dj0.d dVar = this.f217595c;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.d;
        return iHashCode2 + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
