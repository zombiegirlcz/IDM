package nnd;

import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class z0 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccount.Personal.Subaccount f217610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Subaccount f217611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f217612c;
    public final dj0.d d;

    public z0(AnalyticsAccount.Personal.Subaccount analyticsAccount, Subaccount subaccount, dj0.d dVar, dj0.d dVar2) {
        Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
        Intrinsics.checkNotNullParameter(subaccount, "subaccount");
        this.f217610a = analyticsAccount;
        this.f217611b = subaccount;
        this.f217612c = dVar;
        this.d = dVar2;
    }

    @Override // nnd.c1
    public final AnalyticsAccount a() {
        return this.f217610a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.f217610a, z0Var.f217610a) && Intrinsics.f(this.f217611b, z0Var.f217611b) && Intrinsics.f(this.f217612c, z0Var.f217612c) && Intrinsics.f(this.d, z0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f217611b.hashCode() + (this.f217610a.f99195a.hashCode() * 31)) * 31;
        dj0.d dVar = this.f217612c;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.d;
        return iHashCode2 + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
