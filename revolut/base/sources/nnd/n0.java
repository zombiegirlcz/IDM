package nnd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n0 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccount.Savings.PersonalAll f217572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rnd.a f217573b;

    public n0(AnalyticsAccount.Savings.PersonalAll analyticsAccount, rnd.a extraData) {
        Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f217572a = analyticsAccount;
        this.f217573b = extraData;
    }

    @Override // nnd.c1
    public final AnalyticsAccount a() {
        return this.f217572a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f217572a, n0Var.f217572a) && Intrinsics.f(this.f217573b, n0Var.f217573b);
    }

    public final int hashCode() {
        return this.f217573b.hashCode() + (this.f217572a.hashCode() * 31);
    }
}
