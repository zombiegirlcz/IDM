package nnd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o0 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccount.Personal.CreditCard f217575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f217576b;

    public o0(AnalyticsAccount.Personal.CreditCard analyticsAccount, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
        this.f217575a = analyticsAccount;
        this.f217576b = dVar;
    }

    @Override // nnd.c1
    public final AnalyticsAccount a() {
        return this.f217575a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f217575a, o0Var.f217575a) && Intrinsics.f(this.f217576b, o0Var.f217576b);
    }

    public final int hashCode() {
        int iHashCode = this.f217575a.f99193a.hashCode() * 31;
        dj0.d dVar = this.f217576b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
